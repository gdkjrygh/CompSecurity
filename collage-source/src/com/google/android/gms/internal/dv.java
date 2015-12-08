// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.ads.AdSize;
import com.google.ads.mediation.MediationAdRequest;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.zza;
import java.util.Date;
import java.util.HashSet;

public final class dv
{

    public static int a(com.google.ads.AdRequest.ErrorCode errorcode)
    {
        static class _cls1
        {

            static final int a[];
            static final int b[];

            static 
            {
                b = new int[com.google.ads.AdRequest.ErrorCode.values().length];
                try
                {
                    b[com.google.ads.AdRequest.ErrorCode.d.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    b[com.google.ads.AdRequest.ErrorCode.a.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    b[com.google.ads.AdRequest.ErrorCode.c.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    b[com.google.ads.AdRequest.ErrorCode.b.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                a = new int[com.google.ads.AdRequest.Gender.values().length];
                try
                {
                    a[com.google.ads.AdRequest.Gender.c.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[com.google.ads.AdRequest.Gender.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[com.google.ads.AdRequest.Gender.a.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1.b[errorcode.ordinal()])
        {
        default:
            return 0;

        case 2: // '\002'
            return 1;

        case 3: // '\003'
            return 2;

        case 4: // '\004'
            return 3;
        }
    }

    public static com.google.ads.AdRequest.Gender a(int i)
    {
        switch (i)
        {
        default:
            return com.google.ads.AdRequest.Gender.a;

        case 2: // '\002'
            return com.google.ads.AdRequest.Gender.c;

        case 1: // '\001'
            return com.google.ads.AdRequest.Gender.b;
        }
    }

    public static AdSize a(AdSizeParcel adsizeparcel)
    {
        int i = 0;
        AdSize aadsize[] = new AdSize[6];
        aadsize[0] = AdSize.a;
        aadsize[1] = AdSize.b;
        aadsize[2] = AdSize.c;
        aadsize[3] = AdSize.d;
        aadsize[4] = AdSize.e;
        aadsize[5] = AdSize.f;
        for (; i < aadsize.length; i++)
        {
            if (aadsize[i].a() == adsizeparcel.width && aadsize[i].b() == adsizeparcel.height)
            {
                return aadsize[i];
            }
        }

        return new AdSize(zza.zza(adsizeparcel.width, adsizeparcel.height, adsizeparcel.zzsG));
    }

    public static MediationAdRequest a(AdRequestParcel adrequestparcel)
    {
        HashSet hashset;
        if (adrequestparcel.zzss != null)
        {
            hashset = new HashSet(adrequestparcel.zzss);
        } else
        {
            hashset = null;
        }
        return new MediationAdRequest(new Date(adrequestparcel.zzsq), a(adrequestparcel.zzsr), hashset, adrequestparcel.zzst, adrequestparcel.zzsy);
    }
}
