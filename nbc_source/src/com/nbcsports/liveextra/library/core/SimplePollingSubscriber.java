// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.library.core;

import android.util.Pair;
import com.squareup.okhttp.Call;
import com.squareup.okhttp.Callback;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import com.squareup.okhttp.ResponseBody;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import rx.Scheduler;
import rx.Subscriber;
import rx.functions.Action0;
import rx.schedulers.Schedulers;
import rx.subscriptions.Subscriptions;
import timber.log.Timber;

public class SimplePollingSubscriber
    implements rx.Observable.OnSubscribe
{
    public static interface PollingCallback
    {

        public abstract int getMaxRetries();

        public abstract Pair getPollingInterval(String s);

        public abstract String getUrl();
    }


    private Action0 action;
    private Call call;
    private final OkHttpClient client;
    private String etag;
    private String lastModified;
    private PollingCallback listener;
    public Pair pollingInterval;
    private String result;
    private int retry;
    private Subscriber subscriber;
    private rx.Scheduler.Worker worker;

    public SimplePollingSubscriber(OkHttpClient okhttpclient)
    {
        retry = 0;
        client = okhttpclient;
    }

    private void cancelExistingCalls(final Call call, Subscriber subscriber1)
    {
        subscriber1.add(Subscriptions.create(new Action0() {

            final SimplePollingSubscriber this$0;
            final Call val$call;

            public void call()
            {
                call.cancel();
            }

            
            {
                this$0 = SimplePollingSubscriber.this;
                call = call1;
                super();
            }
        }));
    }

    private Callback getCallback()
    {
        return new Callback() {

            final SimplePollingSubscriber this$0;

            public void onFailure(Request request, IOException ioexception)
            {
                handleFailure(ioexception);
            }

            public void onResponse(Response response)
                throws IOException
            {
                Object obj = getFailureExceptionOnBadStatus(response);
                if (obj != null)
                {
                    handleFailure(((Throwable) (obj)));
                    return;
                }
                obj = response.header("Last-Modified");
                String s = response.header("Etag");
                retry = 0;
                if (isModified(((String) (obj)), s))
                {
                    Timber.d((new StringBuilder()).append("Received response - LAST-MODIFIED: ").append(((String) (obj))).toString(), new Object[0]);
                    Timber.d((new StringBuilder()).append("Received response - ETAG: ").append(s).toString(), new Object[0]);
                    try
                    {
                        result = response.body().string();
                    }
                    catch (Exception exception)
                    {
                        Timber.i(exception, (new StringBuilder()).append("Exception retrieving response body for: ").append(response.request().urlString()).toString(), new Object[0]);
                        handleFailure(exception);
                        return;
                    }
                    response = listener.getPollingInterval(result);
                    Timber.d("Next poll in %s %s", new Object[] {
                        Integer.toString(((Integer)((Pair) (response)).first).intValue()), ((TimeUnit)((Pair) (response)).second).toString()
                    });
                    pollingInterval = response;
                    subscriber.onNext(result);
                    lastModified = ((String) (obj));
                    etag = s;
                }
                worker.schedule(action, ((Integer)pollingInterval.first).intValue(), (TimeUnit)pollingInterval.second);
            }

            
            {
                this$0 = SimplePollingSubscriber.this;
                super();
            }
        };
    }

    private Throwable getFailureExceptionOnBadStatus(Response response)
    {
        if (response.code() < 399)
        {
            return null;
        } else
        {
            return new Exception(String.format("Polling subscriber received bad response for: %s\n\t%d %s", new Object[] {
                response.request().urlString(), Integer.valueOf(response.code()), response.body()
            }));
        }
    }

    private void handleFailure(Throwable throwable)
    {
        pollingInterval = new Pair(Integer.valueOf(10), TimeUnit.SECONDS);
        retry = retry + 1;
        if (retry > listener.getMaxRetries())
        {
            subscriber.onError(throwable);
            Timber.e("Error received: ", new Object[] {
                throwable
            });
            return;
        } else
        {
            Timber.d("Error received: ", new Object[] {
                throwable
            });
            Timber.d((new StringBuilder()).append("Setting polling time to: ").append(pollingInterval).toString(), new Object[0]);
            worker.schedule(action, ((Integer)pollingInterval.first).intValue(), (TimeUnit)pollingInterval.second);
            return;
        }
    }

    private boolean isModified(String s, String s1)
    {
        boolean flag2 = false;
        boolean flag;
        boolean flag1;
        if (lastModified != null && lastModified.equals(s))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (etag != null && etag.equals(s1))
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (flag)
        {
            Timber.d((new StringBuilder()).append("LAST-MODIFIED match, no changes: ").append(s).toString(), new Object[0]);
        }
        if (flag1)
        {
            Timber.d((new StringBuilder()).append("ETAG match, no changes: ").append(s1).toString(), new Object[0]);
        }
        if (!flag || !flag1)
        {
            flag2 = true;
        }
        return flag2;
    }

    public volatile void call(Object obj)
    {
        call((Subscriber)obj);
    }

    public void call(final Subscriber subscriber)
    {
        this.subscriber = subscriber;
        worker = Schedulers.io().createWorker();
        action = new Action0() {

            final SimplePollingSubscriber this$0;
            final Subscriber val$subscriber;

            public void call()
            {
                Object obj;
                if (!worker.isUnsubscribed())
                {
                    if ((obj = listener.getUrl()) != null)
                    {
                        obj = (new com.squareup.okhttp.Request.Builder()).url(((String) (obj))).get();
                        if (lastModified != null)
                        {
                            ((com.squareup.okhttp.Request.Builder) (obj)).addHeader("If-Modified-Since", lastModified);
                        }
                        if (etag != null)
                        {
                            ((com.squareup.okhttp.Request.Builder) (obj)).addHeader("If-None-Match", etag);
                        }
                        SimplePollingSubscriber.this.call = client.newCall(((com.squareup.okhttp.Request.Builder) (obj)).build());
                        cancelExistingCalls(SimplePollingSubscriber.this.call, subscriber);
                        SimplePollingSubscriber.this.call.enqueue(getCallback());
                        return;
                    }
                }
            }

            
            {
                this$0 = SimplePollingSubscriber.this;
                subscriber = subscriber1;
                super();
            }
        };
        worker.schedule(action);
    }

    public void cancel()
    {
        worker.unsubscribe();
        cancelExistingCalls(call, subscriber);
    }

    public void setListener(PollingCallback pollingcallback)
    {
        listener = pollingcallback;
    }




/*
    static int access$1002(SimplePollingSubscriber simplepollingsubscriber, int i)
    {
        simplepollingsubscriber.retry = i;
        return i;
    }

*/




/*
    static String access$1202(SimplePollingSubscriber simplepollingsubscriber, String s)
    {
        simplepollingsubscriber.result = s;
        return s;
    }

*/





/*
    static String access$202(SimplePollingSubscriber simplepollingsubscriber, String s)
    {
        simplepollingsubscriber.lastModified = s;
        return s;
    }

*/



/*
    static String access$302(SimplePollingSubscriber simplepollingsubscriber, String s)
    {
        simplepollingsubscriber.etag = s;
        return s;
    }

*/



/*
    static Call access$402(SimplePollingSubscriber simplepollingsubscriber, Call call1)
    {
        simplepollingsubscriber.call = call1;
        return call1;
    }

*/





}
