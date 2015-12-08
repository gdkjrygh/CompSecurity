// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.client;

import android.content.Context;
import com.google.ads.mediation.admob.AdMobAdapter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Set;

// Referenced classes of package com.google.android.gms.ads.internal.client:
//            zzx, SearchAdRequestParcel, AdRequestParcel

public class zzg
{

    public static final zzg zzsl = new zzg();

    protected zzg()
    {
    }

    public static zzg zzcw()
    {
        return zzsl;
    }

    public AdRequestParcel zza(Context context, zzx zzx1)
    {
        Object obj = zzx1.getBirthday();
        String s;
        android.location.Location location;
        android.os.Bundle bundle;
        String s1;
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
        s = zzx1.getContentUrl();
        i = zzx1.getGender();
        obj = zzx1.getKeywords();
        if (!((Set) (obj)).isEmpty())
        {
            obj = Collections.unmodifiableList(new ArrayList(((java.util.Collection) (obj))));
        } else
        {
            obj = null;
        }
        flag = zzx1.isTestDevice(context);
        j = zzx1.zzcL();
        location = zzx1.getLocation();
        bundle = zzx1.getNetworkExtrasBundle(com/google/ads/mediation/admob/AdMobAdapter);
        flag1 = zzx1.getManualImpressionsEnabled();
        s1 = zzx1.getPublisherProvidedId();
        context = zzx1.zzcI();
        if (context != null)
        {
            context = new SearchAdRequestParcel(context);
        } else
        {
            context = null;
        }
        return new AdRequestParcel(5, l, bundle, i, ((java.util.List) (obj)), flag, j, flag1, s1, context, location, s, zzx1.zzcK(), zzx1.getCustomTargeting(), Collections.unmodifiableList(new ArrayList(zzx1.zzcM())), zzx1.zzcH());
    }

}
