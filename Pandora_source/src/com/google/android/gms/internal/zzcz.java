// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.zza;
import java.util.Date;
import java.util.HashSet;
import p.bp.b;

public final class zzcz
{

    public static int zza(p.bp.a.a a)
    {
        static class _cls1
        {

            static final int a[];
            static final int b[];

            static 
            {
                b = new int[p.bp.a.a.values().length];
                try
                {
                    b[p.bp.a.a.d.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    b[p.bp.a.a.a.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    b[p.bp.a.a.c.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    b[p.bp.a.a.b.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                a = new int[p.bp.a.b.values().length];
                try
                {
                    a[p.bp.a.b.c.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[p.bp.a.b.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[p.bp.a.b.a.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (com.google.android.gms.internal._cls1.b[a.ordinal()])
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

    public static b zzb(AdSizeParcel adsizeparcel)
    {
        int i = 0;
        b ab[] = new b[6];
        ab[0] = b.a;
        ab[1] = b.b;
        ab[2] = b.c;
        ab[3] = b.d;
        ab[4] = b.e;
        ab[5] = b.f;
        for (; i < ab.length; i++)
        {
            if (ab[i].a() == adsizeparcel.width && ab[i].b() == adsizeparcel.height)
            {
                return ab[i];
            }
        }

        return new b(com.google.android.gms.ads.zza.zza(adsizeparcel.width, adsizeparcel.height, adsizeparcel.zzpX));
    }

    public static p.bq.b zzd(AdRequestParcel adrequestparcel)
    {
        HashSet hashset;
        if (adrequestparcel.zzpK != null)
        {
            hashset = new HashSet(adrequestparcel.zzpK);
        } else
        {
            hashset = null;
        }
        return new p.bq.b(new Date(adrequestparcel.zzpI), zzn(adrequestparcel.zzpJ), hashset, adrequestparcel.zzpL, adrequestparcel.zzpQ);
    }

    public static p.bp.a.b zzn(int i)
    {
        switch (i)
        {
        default:
            return p.bp.a.b.a;

        case 2: // '\002'
            return p.bp.a.b.c;

        case 1: // '\001'
            return p.bp.a.b.b;
        }
    }
}
