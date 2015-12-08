// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.providers;

import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import java.io.IOException;
import rx.Subscriber;

// Referenced classes of package me.lyft.android.providers:
//            AdvertisingIdProvider

class this._cls0
    implements rx.dvertisingIdProvider._cls1
{

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

    pairableException()
    {
        this$0 = AdvertisingIdProvider.this;
        super();
    }
}
