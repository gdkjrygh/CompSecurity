// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.library.configuration;

import rx.Observable;
import rx.Subscriber;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

// Referenced classes of package com.nbcsports.liveextra.library.configuration:
//            Configuration, ConfigurationProvider

public class RuntimeConfiguration
{

    private Configuration configuration;
    private final ConfigurationProvider subscriber;
    private Subscription subscription;

    public RuntimeConfiguration(ConfigurationProvider configurationprovider)
    {
        configuration = new Configuration();
        subscriber = configurationprovider;
        onResume();
    }

    private void setConfiguration(Configuration configuration1)
    {
        this;
        JVM INSTR monitorenter ;
        configuration = configuration1;
        this;
        JVM INSTR monitorexit ;
        return;
        configuration1;
        throw configuration1;
    }

    public Configuration get()
    {
        this;
        JVM INSTR monitorenter ;
        Configuration configuration1;
        if (configuration == null)
        {
            configuration = new Configuration();
            onResume();
        }
        configuration1 = configuration;
        this;
        JVM INSTR monitorexit ;
        return configuration1;
        Exception exception;
        exception;
        throw exception;
    }

    public void onPause()
    {
        subscription.unsubscribe();
    }

    public void onResume()
    {
        if (subscription != null && !subscription.isUnsubscribed())
        {
            return;
        } else
        {
            subscription = subscriber.getObservable().subscribeOn(Schedulers.newThread()).observeOn(AndroidSchedulers.mainThread()).subscribe(new Subscriber() {

                final RuntimeConfiguration this$0;

                public void onCompleted()
                {
                }

                public void onError(Throwable throwable)
                {
                }

                public void onNext(Configuration configuration1)
                {
                    setConfiguration(configuration1);
                }

                public volatile void onNext(Object obj)
                {
                    onNext((Configuration)obj);
                }

            
            {
                this$0 = RuntimeConfiguration.this;
                super();
            }
            });
            return;
        }
    }

}
