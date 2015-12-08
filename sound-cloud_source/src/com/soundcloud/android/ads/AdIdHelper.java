// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.ads;

import com.soundcloud.android.rx.observers.DefaultSubscriber;
import com.soundcloud.java.optional.Optional;
import rx.R;
import rx.a.b.a;
import rx.b;

// Referenced classes of package com.soundcloud.android.ads:
//            AdIdWrapper

public class AdIdHelper
{
    private class AdInfoSubscriber extends DefaultSubscriber
    {

        final AdIdHelper this$0;

        public void onNext(com.google.android.gms.ads.identifier.AdvertisingIdClient.Info info)
        {
            adId = Optional.of(info.getId());
            AdIdHelper adidhelper = AdIdHelper.this;
            boolean flag;
            if (!info.isLimitAdTrackingEnabled())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            adidhelper.adIdTracking = flag;
            String _tmp = AdIdHelper.TAG;
            (new StringBuilder("Loaded ADID: ")).append(adId).append("\nTracking:").append(adIdTracking);
        }

        public volatile void onNext(Object obj)
        {
            onNext((com.google.android.gms.ads.identifier.AdvertisingIdClient.Info)obj);
        }

        private AdInfoSubscriber()
        {
            this$0 = AdIdHelper.this;
            super();
        }

        AdInfoSubscriber(_cls1 _pcls1)
        {
            this();
        }
    }


    private static final String TAG = com/soundcloud/android/ads/AdIdHelper.getSimpleName();
    private volatile Optional adId;
    private volatile boolean adIdTracking;
    private final AdIdWrapper adIdWrapper;
    private final R scheduler;

    public AdIdHelper(AdIdWrapper adidwrapper, R r)
    {
        adId = Optional.absent();
        adIdWrapper = adidwrapper;
        scheduler = r;
    }

    private b getAdInfo()
    {
        return b.create(new _cls1());
    }

    public Optional getAdId()
    {
        return adId;
    }

    public boolean getAdIdTracking()
    {
        return adIdTracking;
    }

    public void init()
    {
        if (adIdWrapper.isPlayServicesAvailable())
        {
            getAdInfo().subscribeOn(scheduler).observeOn(a.a()).subscribe(new AdInfoSubscriber(null));
        }
    }





/*
    static Optional access$202(AdIdHelper adidhelper, Optional optional)
    {
        adidhelper.adId = optional;
        return optional;
    }

*/



/*
    static boolean access$302(AdIdHelper adidhelper, boolean flag)
    {
        adidhelper.adIdTracking = flag;
        return flag;
    }

*/


    private class _cls1
        implements rx.b.f
    {

        final AdIdHelper this$0;

        public volatile void call(Object obj)
        {
            call((X)obj);
        }

        public void call(X x)
        {
            x.onNext(adIdWrapper.getAdInfo());
            x.onCompleted();
            return;
            Object obj;
            obj;
_L2:
            x.onError(((Throwable) (obj)));
            return;
            obj;
            continue; /* Loop/switch isn't completed */
            obj;
            if (true) goto _L2; else goto _L1
_L1:
        }

        _cls1()
        {
            this$0 = AdIdHelper.this;
            super();
        }
    }

}
