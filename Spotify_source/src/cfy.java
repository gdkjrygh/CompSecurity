// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import java.util.Date;
import java.util.HashSet;

public final class cfy
{

    public static axx a(AdSizeParcel adsizeparcel)
    {
        int i = 0;
        axx aaxx[] = new axx[6];
        aaxx[0] = axx.b;
        aaxx[1] = axx.c;
        aaxx[2] = axx.d;
        aaxx[3] = axx.e;
        aaxx[4] = axx.f;
        aaxx[5] = axx.g;
        for (; i < 6; i++)
        {
            if (aaxx[i].a.i == adsizeparcel.f && aaxx[i].a.j == adsizeparcel.c)
            {
                return aaxx[i];
            }
        }

        return new axx(bln.a(adsizeparcel.f, adsizeparcel.c, adsizeparcel.b));
    }

    public static ayf a(AdRequestParcel adrequestparcel)
    {
        if (adrequestparcel.e != null)
        {
            new HashSet(adrequestparcel.e);
        }
        new Date(adrequestparcel.b);
        adrequestparcel.d;
        JVM INSTR tableswitch 1 2: default 56
    //                   1 85
    //                   2 78;
           goto _L1 _L2 _L3
_L1:
        com.google.ads.AdRequest.Gender gender = com.google.ads.AdRequest.Gender.a;
_L5:
        boolean flag = adrequestparcel.f;
        adrequestparcel = adrequestparcel.k;
        return new ayf();
_L3:
        gender = com.google.ads.AdRequest.Gender.c;
        continue; /* Loop/switch isn't completed */
_L2:
        gender = com.google.ads.AdRequest.Gender.b;
        if (true) goto _L5; else goto _L4
_L4:
    }
}
