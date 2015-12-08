// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.content.overlay;

import android.os.Handler;
import android.util.Pair;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import rx.Observable;
import rx.functions.Action0;
import rx.observables.ConnectableObservable;
import rx.schedulers.Schedulers;
import rx.subjects.BehaviorSubject;
import timber.log.Timber;

// Referenced classes of package com.nbcsports.liveextra.content.overlay:
//            OverlayPollingSubscriber

public abstract class OverlayPollingProvider
    implements com.nbcsports.liveextra.library.core.PollingSubscriber.PollingCallback
{

    protected Pair POLLING_INTERVAL;
    private Runnable cancel;
    String feedName;
    private Handler handler;
    private final ReentrantLock lock = new ReentrantLock();
    private Observable observable;
    protected BehaviorSubject pollTargetBehaviorSubject;
    private final OverlayPollingSubscriber pollingSubscriber;
    protected String pollingUrl;
    protected Observable subscription;

    public OverlayPollingProvider(OverlayPollingSubscriber overlaypollingsubscriber, String s)
    {
        POLLING_INTERVAL = new Pair(Integer.valueOf(15), TimeUnit.SECONDS);
        handler = new Handler();
        cancel = new Runnable() {

            final OverlayPollingProvider this$0;

            public void run()
            {
                pollingSubscriber.cancel();
            }

            
            {
                this$0 = OverlayPollingProvider.this;
                super();
            }
        };
        pollingSubscriber = overlaypollingsubscriber;
        overlaypollingsubscriber.setListener(this);
        pollTargetBehaviorSubject = BehaviorSubject.create(null);
        setFeedName(s);
    }

    public void configureFeedVariables(String s, int i)
    {
        pollingUrl = s;
        POLLING_INTERVAL = new Pair(Integer.valueOf(i), TimeUnit.SECONDS);
        Timber.i(String.format("Feed: %s | Interval: %s | Url: %s", new Object[] {
            getFeedName(), Integer.valueOf(i), s
        }), new Object[0]);
    }

    public boolean enableNulls()
    {
        return false;
    }

    public String getFeedName()
    {
        return feedName;
    }

    public int getMaxRetries()
    {
        return 10;
    }

    public Observable getObservable()
    {
        lock.lock();
        Observable observable1;
        if (observable == null)
        {
            observable = Observable.create(pollingSubscriber).subscribeOn(Schedulers.io()).replay(1).refCount().doOnSubscribe(new Action0() {

                final OverlayPollingProvider this$0;

                public void call()
                {
                    handler.removeCallbacks(cancel);
                    Timber.d((new StringBuilder()).append("Start polling for: ").append(pollingSubscriber.getResultClass().getSimpleName()).toString(), new Object[0]);
                }

            
            {
                this$0 = OverlayPollingProvider.this;
                super();
            }
            }).doOnUnsubscribe(new Action0() {

                final OverlayPollingProvider this$0;

                public void call()
                {
                    handler.postDelayed(cancel, 5000L);
                    Timber.d((new StringBuilder()).append("Cancelling polling for: ").append(pollingSubscriber.getResultClass().getSimpleName()).toString(), new Object[0]);
                }

            
            {
                this$0 = OverlayPollingProvider.this;
                super();
            }
            });
        }
        Timber.d("Adding observer for: %s", new Object[] {
            getFeedName()
        });
        observable1 = observable;
        lock.unlock();
        return observable1;
        Exception exception;
        exception;
        lock.unlock();
        throw exception;
    }

    public Pair getPollingInterval(Object obj)
    {
        return POLLING_INTERVAL;
    }

    public OverlayPollingSubscriber getPollingSubscriber()
    {
        return pollingSubscriber;
    }

    public void setFeedName(String s)
    {
        feedName = s;
    }

    public void update(Object obj)
    {
        pollTargetBehaviorSubject.onNext(obj);
    }



}
