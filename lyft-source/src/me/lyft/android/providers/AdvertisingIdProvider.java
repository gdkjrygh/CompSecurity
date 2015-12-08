// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.providers;

import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import java.io.IOException;
import me.lyft.android.LyftApplication;
import rx.Observable;
import rx.Subscriber;

public class AdvertisingIdProvider
{

    LyftApplication app;

    public AdvertisingIdProvider()
    {
    }

    public Observable getAdvertisingInfo()
    {
        return Observable.create(new rx.Observable.OnSubscribe() {

            final AdvertisingIdProvider this$0;

            public volatile void call(Object obj)
            {
                call((Subscriber)obj);
            }

            public void call(Subscriber subscriber)
            {
                try
                {
                    subscriber.onNext(AdvertisingIdClient.b(app));
                    subscriber.onCompleted();
                    return;
                }
                catch (IOException ioexception)
                {
                    subscriber.onError(ioexception);
                    return;
                }
                catch (GooglePlayServicesNotAvailableException googleplayservicesnotavailableexception)
                {
                    subscriber.onError(googleplayservicesnotavailableexception);
                    return;
                }
                catch (GooglePlayServicesRepairableException googleplayservicesrepairableexception)
                {
                    subscriber.onError(googleplayservicesrepairableexception);
                }
            }

            
            {
                this$0 = AdvertisingIdProvider.this;
                super();
            }
        });
    }
}
