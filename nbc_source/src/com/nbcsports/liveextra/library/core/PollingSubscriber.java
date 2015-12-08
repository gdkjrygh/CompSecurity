// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.library.core;

import android.text.TextUtils;
import android.util.Pair;
import com.google.gson.Gson;
import com.squareup.okhttp.Call;
import com.squareup.okhttp.Callback;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;
import com.squareup.okhttp.ResponseBody;
import java.io.IOException;
import java.net.SocketException;
import java.util.concurrent.TimeUnit;
import rx.Scheduler;
import rx.Subscriber;
import rx.functions.Action0;
import rx.schedulers.Schedulers;
import rx.subscriptions.Subscriptions;
import timber.log.Timber;

public class PollingSubscriber
    implements rx.Observable.OnSubscribe
{
    public static interface PollingCallback
    {

        public abstract boolean enableNulls();

        public abstract int getMaxRetries();

        public abstract Pair getPollingInterval(Object obj);

        public abstract String getUrl();
    }


    private Action0 action;
    private Call call;
    private final OkHttpClient client;
    private String etag;
    private final Gson gson;
    private String lastModified;
    protected PollingCallback listener;
    public Pair pollingInterval;
    protected String responseBody;
    protected Class resultClass;
    private int retry;
    private Subscriber subscriber;
    private rx.Scheduler.Worker worker;

    public PollingSubscriber(OkHttpClient okhttpclient, Gson gson1)
    {
        retry = 0;
        client = okhttpclient;
        gson = gson1;
    }

    private void cancelExistingCalls(final Call call, Subscriber subscriber1)
    {
        subscriber1.add(Subscriptions.create(new Action0() {

            final PollingSubscriber this$0;
            final Call val$call;

            public void call()
            {
                call.cancel();
            }

            
            {
                this$0 = PollingSubscriber.this;
                call = call1;
                super();
            }
        }));
    }

    private Callback getCallback()
    {
        return new Callback() {

            final PollingSubscriber this$0;

            public void onFailure(Request request, IOException ioexception)
            {
                if (ioexception.getMessage().equals("Canceled"))
                {
                    return;
                } else
                {
                    handleFailure(ioexception);
                    return;
                }
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
                if (isModified(s))
                {
                    Timber.d((new StringBuilder()).append("Received response - LAST-MODIFIED: ").append(((String) (obj))).toString(), new Object[0]);
                    Timber.d((new StringBuilder()).append("Received response - ETAG: ").append(s).toString(), new Object[0]);
                    Pair pair;
                    try
                    {
                        response = ((Response) (gson.fromJson(response.body().charStream(), resultClass)));
                        responseBody = gson.toJson(response);
                    }
                    // Misplaced declaration of an exception variable
                    catch (Response response)
                    {
                        if (response instanceof SocketException)
                        {
                            Timber.e(response, "", new Object[0]);
                            scheduleWorker();
                            return;
                        } else
                        {
                            handleFailure(response);
                            return;
                        }
                    }
                    pair = listener.getPollingInterval(response);
                    pollingInterval = pair;
                    if ((response != null || listener.enableNulls()) && subscriber != null)
                    {
                        subscriber.onNext(response);
                    }
                    lastModified = ((String) (obj));
                    etag = s;
                }
                Timber.d("Next poll in %s %s", new Object[] {
                    Integer.toString(((Integer)pollingInterval.first).intValue()), ((TimeUnit)pollingInterval.second).toString()
                });
                scheduleWorker();
            }

            
            {
                this$0 = PollingSubscriber.this;
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
        Timber.e("Error received: ", new Object[] {
            throwable
        });
        if (!suppressFailureRetry())
        {
            pollingInterval = new Pair(Integer.valueOf(10), TimeUnit.SECONDS);
            Timber.d((new StringBuilder()).append("Setting polling time to: ").append(pollingInterval).toString(), new Object[0]);
            retry = retry + 1;
            if (retry > listener.getMaxRetries())
            {
                if (subscriber != null)
                {
                    subscriber.onError(throwable);
                }
                return;
            }
        }
        scheduleWorker();
    }

    private boolean isModified(String s)
    {
        boolean flag;
        if (etag != null && etag.equals(s))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            Timber.d((new StringBuilder()).append("ETAG match, no changes: ").append(s).toString(), new Object[0]);
        }
        return !flag;
    }

    public volatile void call(Object obj)
    {
        call((Subscriber)obj);
    }

    public void call(Subscriber subscriber1)
    {
        subscriber = subscriber1;
        if (!TextUtils.isEmpty(responseBody))
        {
            subscriber1.onNext(getResult());
        }
        if (worker == null || worker.isUnsubscribed())
        {
            worker = Schedulers.io().createWorker();
            worker.schedule(getAction());
        }
    }

    public void cancel()
    {
        if (worker != null)
        {
            worker.unsubscribe();
        }
        (new Thread(new Runnable() {

            final PollingSubscriber this$0;

            public void run()
            {
                if (call == null || subscriber == null)
                {
                    return;
                } else
                {
                    cancelExistingCalls(call, subscriber);
                    return;
                }
            }

            
            {
                this$0 = PollingSubscriber.this;
                super();
            }
        })).start();
    }

    protected Action0 getAction()
    {
        if (action == null)
        {
            action = new Action0() {

                final PollingSubscriber this$0;

                public void call()
                {
                    Object obj;
                    try
                    {
                        obj = listener.getUrl();
                    }
                    catch (Exception exception)
                    {
                        if (subscriber != null)
                        {
                            subscriber.onError(exception);
                        }
                        Timber.d(exception, "Error while polling", new Object[0]);
                        return;
                    }
                    if (obj != null)
                    {
                        break MISSING_BLOCK_LABEL_79;
                    }
                    Timber.d("URL is null for %s, delaying 15 seconds", new Object[] {
                        resultClass.getSimpleName()
                    });
                    if (responseBody == null)
                    {
                        pollingInterval = new Pair(Integer.valueOf(15), TimeUnit.SECONDS);
                    }
                    scheduleWorker();
                    return;
                    Timber.d((new StringBuilder()).append("Getting ").append(resultClass.getSimpleName()).append(" from NETWORK").toString(), new Object[0]);
                    obj = (new com.squareup.okhttp.Request.Builder()).url(((String) (obj))).get();
                    if (lastModified != null)
                    {
                        ((com.squareup.okhttp.Request.Builder) (obj)).addHeader("If-Modified-Since", lastModified);
                    }
                    if (etag != null)
                    {
                        ((com.squareup.okhttp.Request.Builder) (obj)).addHeader("If-None-Match", etag);
                    }
                    PollingSubscriber.this.call = client.newCall(((com.squareup.okhttp.Request.Builder) (obj)).build());
                    PollingSubscriber.this.call.enqueue(getCallback());
                    return;
                }

            
            {
                this$0 = PollingSubscriber.this;
                super();
            }
            };
        }
        return action;
    }

    protected Object getResult()
    {
        return gson.fromJson(responseBody, resultClass);
    }

    public Class getResultClass()
    {
        return resultClass;
    }

    public void kick()
    {
        if (worker == null || worker.isUnsubscribed())
        {
            worker = Schedulers.io().createWorker();
        }
        worker.schedule(getAction());
    }

    protected void scheduleWorker()
    {
        if (worker == null || worker.isUnsubscribed())
        {
            worker = Schedulers.io().createWorker();
        }
        worker.schedule(getAction(), ((Integer)pollingInterval.first).intValue(), (TimeUnit)pollingInterval.second);
    }

    protected void sendCachedResult()
    {
        Timber.d((new StringBuilder()).append("Getting ").append(resultClass.getName()).append(" from CACHE").toString(), new Object[0]);
        Object obj = getResult();
        if (subscriber != null)
        {
            subscriber.onNext(obj);
        }
        scheduleWorker();
    }

    public void setListener(PollingCallback pollingcallback, Class class1)
    {
        listener = pollingcallback;
        resultClass = class1;
    }

    protected boolean suppressFailureRetry()
    {
        return false;
    }



/*
    static String access$002(PollingSubscriber pollingsubscriber, String s)
    {
        pollingsubscriber.lastModified = s;
        return s;
    }

*/




/*
    static String access$102(PollingSubscriber pollingsubscriber, String s)
    {
        pollingsubscriber.etag = s;
        return s;
    }

*/




/*
    static Call access$202(PollingSubscriber pollingsubscriber, Call call1)
    {
        pollingsubscriber.call = call1;
        return call1;
    }

*/







/*
    static int access$802(PollingSubscriber pollingsubscriber, int i)
    {
        pollingsubscriber.retry = i;
        return i;
    }

*/

}
