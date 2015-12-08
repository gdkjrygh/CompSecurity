// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.client;

import android.content.Context;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.internal.reward.client.RewardedVideoAdRequestParcel;
import com.google.android.gms.ads.internal.zzp;
import com.google.android.gms.internal.qa;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Set;

// Referenced classes of package com.google.android.gms.ads.internal.client:
//            zzy, SearchAdRequestParcel, AdRequestParcel

public class zzh
{

    public static final zzh zztd = new zzh();

    protected zzh()
    {
    }

    public static zzh zzcB()
    {
        return zztd;
    }

    public AdRequestParcel zza(Context context, zzy zzy1)
    {
        Object obj = zzy1.getBirthday();
        Object obj1;
        Object obj2;
        String s;
        android.location.Location location;
        android.os.Bundle bundle;
        String s1;
        Context context1;
        int i;
        int j;
        long l;
        boolean flag;
        boolean flag1;
        if (obj != null)
        {
            l = ((Date) (obj)).getTime();
        } else
        {
            l = -1L;
        }
        s = zzy1.getContentUrl();
        i = zzy1.getGender();
        obj = zzy1.getKeywords();
        if (!((Set) (obj)).isEmpty())
        {
            obj = Collections.unmodifiableList(new ArrayList(((java.util.Collection) (obj))));
        } else
        {
            obj = null;
        }
        flag = zzy1.isTestDevice(context);
        j = zzy1.zzcQ();
        location = zzy1.getLocation();
        bundle = zzy1.getNetworkExtrasBundle(com/google/ads/mediation/admob/AdMobAdapter);
        flag1 = zzy1.getManualImpressionsEnabled();
        s1 = zzy1.getPublisherProvidedId();
        obj1 = zzy1.zzcN();
        if (obj1 != null)
        {
            obj1 = new SearchAdRequestParcel(((com.google.android.gms.ads.search.SearchAdRequest) (obj1)));
        } else
        {
            obj1 = null;
        }
        obj2 = null;
        context1 = context.getApplicationContext();
        context = obj2;
        if (context1 != null)
        {
            context = context1.getPackageName();
            zzp.zzbv();
            context = qa.a(Thread.currentThread().getStackTrace(), context);
        }
        return new AdRequestParcel(6, l, bundle, i, ((java.util.List) (obj)), flag, j, flag1, s1, ((SearchAdRequestParcel) (obj1)), location, s, zzy1.zzcP(), zzy1.getCustomTargeting(), Collections.unmodifiableList(new ArrayList(zzy1.zzcR())), zzy1.zzcM(), context);
    }

    public RewardedVideoAdRequestParcel zza(Context context, zzy zzy1, String s)
    {
        return new RewardedVideoAdRequestParcel(zza(context, zzy1), s);
    }

}
