// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.library.configuration;

import android.util.Pair;
import java.util.concurrent.TimeUnit;
import rx.Observable;
import rx.Subscriber;
import rx.Subscription;
import rx.functions.Action0;
import rx.subjects.BehaviorSubject;

// Referenced classes of package com.nbcsports.liveextra.library.configuration:
//            ConfigurationPollingSubscriber, Configuration

public class ConfigurationProvider
    implements com.nbcsports.liveextra.library.core.PollingSubscriber.PollingCallback
{

    public static final Pair POLLING_INTERVAL;
    private BehaviorSubject configuration;
    private final String configurationUrl;
    private final ConfigurationPollingSubscriber pollingSubscriber;
    private Subscription subscription;

    public ConfigurationProvider(ConfigurationPollingSubscriber configurationpollingsubscriber, String s)
    {
        configurationUrl = s;
        pollingSubscriber = configurationpollingsubscriber;
        configurationpollingsubscriber.setListener(this);
        configuration = BehaviorSubject.create(new Configuration());
        startPolling();
    }

    private void startPolling()
    {
        subscription = Observable.create(pollingSubscriber).subscribe(new Subscriber() {

            final ConfigurationProvider this$0;

            public void onCompleted()
            {
                configuration.onCompleted();
            }

            public void onError(Throwable throwable)
            {
                configuration.onError(throwable);
            }

            public void onNext(Configuration configuration1)
            {
                configuration.onNext(configuration1);
            }

            public volatile void onNext(Object obj)
            {
                onNext((Configuration)obj);
            }

            
            {
                this$0 = ConfigurationProvider.this;
                super();
            }
        });
    }

    public boolean enableNulls()
    {
        return false;
    }

    public int getMaxRetries()
    {
        return 10;
    }

    public Observable getObservable()
    {
        this;
        JVM INSTR monitorenter ;
        Observable observable;
        if (subscription == null || subscription.isUnsubscribed())
        {
            startPolling();
        }
        observable = configuration.asObservable().doOnUnsubscribe(new Action0() {

            final ConfigurationProvider this$0;

            public void call()
            {
                pollingSubscriber.cancel();
                subscription.unsubscribe();
            }

            
            {
                this$0 = ConfigurationProvider.this;
                super();
            }
        });
        this;
        JVM INSTR monitorexit ;
        return observable;
        Exception exception;
        exception;
        throw exception;
    }

    public Pair getPollingInterval(Configuration configuration1)
    {
        return POLLING_INTERVAL;
    }

    public volatile Pair getPollingInterval(Object obj)
    {
        return getPollingInterval((Configuration)obj);
    }

    public String getUrl()
    {
        return configurationUrl;
    }

    public void update(Configuration configuration1)
    {
        configuration.onNext(configuration1);
    }

    static 
    {
        POLLING_INTERVAL = new Pair(Integer.valueOf(5), TimeUnit.MINUTES);
    }



}
