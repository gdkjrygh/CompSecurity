// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.ads.b;
import com.google.android.gms.ads.f;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import java.util.Date;
import java.util.HashSet;

public final class du
{

    public static b a(AdSizeParcel adsizeparcel)
    {
        int i = 0;
        b ab[] = new b[6];
        ab[0] = b.a;
        ab[1] = b.b;
        ab[2] = b.c;
        ab[3] = b.d;
        ab[4] = b.e;
        ab[5] = b.f;
        for (; i < 6; i++)
        {
            if (ab[i].a() == adsizeparcel.f && ab[i].b() == adsizeparcel.c)
            {
                return ab[i];
            }
        }

        return new b(f.a(adsizeparcel.f, adsizeparcel.c, adsizeparcel.b));
    }

    public static com.google.ads.mediation.b a(AdRequestParcel adrequestparcel)
    {
        com.google.ads.a.a a1;
        HashSet hashset;
        Date date;
        if (adrequestparcel.e != null)
        {
            hashset = new HashSet(adrequestparcel.e);
        } else
        {
            hashset = null;
        }
        date = new Date(adrequestparcel.b);
        adrequestparcel.d;
        JVM INSTR tableswitch 1 2: default 56
    //                   1 91
    //                   2 84;
           goto _L1 _L2 _L3
_L1:
        a1 = com.google.ads.a.a.a;
_L5:
        return new com.google.ads.mediation.b(date, a1, hashset, adrequestparcel.f, adrequestparcel.k);
_L3:
        a1 = com.google.ads.a.a.c;
        continue; /* Loop/switch isn't completed */
_L2:
        a1 = com.google.ads.a.a.b;
        if (true) goto _L5; else goto _L4
_L4:
    }
}
