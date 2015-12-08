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

// Referenced classes of package com.google.android.gms.internal:
//            kc

public final class kb
{

    public static int a(com.google.ads.AdRequest.ErrorCode errorcode)
    {
        switch (kc.b[errorcode.ordinal()])
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

    public static AdSize a(AdSizeParcel adsizeparcel)
    {
        int i = 0;
        AdSize aadsize[] = new AdSize[6];
        aadsize[0] = AdSize.SMART_BANNER;
        aadsize[1] = AdSize.BANNER;
        aadsize[2] = AdSize.IAB_MRECT;
        aadsize[3] = AdSize.IAB_BANNER;
        aadsize[4] = AdSize.IAB_LEADERBOARD;
        aadsize[5] = AdSize.IAB_WIDE_SKYSCRAPER;
        for (; i < 6; i++)
        {
            if (aadsize[i].getWidth() == adsizeparcel.width && aadsize[i].getHeight() == adsizeparcel.height)
            {
                return aadsize[i];
            }
        }

        return new AdSize(zza.zza(adsizeparcel.width, adsizeparcel.height, adsizeparcel.zzte));
    }

    public static MediationAdRequest a(AdRequestParcel adrequestparcel)
    {
        com.google.ads.AdRequest.Gender gender;
        HashSet hashset;
        Date date;
        if (adrequestparcel.zzsD != null)
        {
            hashset = new HashSet(adrequestparcel.zzsD);
        } else
        {
            hashset = null;
        }
        date = new Date(adrequestparcel.zzsB);
        adrequestparcel.zzsC;
        JVM INSTR tableswitch 1 2: default 56
    //                   1 91
    //                   2 84;
           goto _L1 _L2 _L3
_L1:
        gender = com.google.ads.AdRequest.Gender.UNKNOWN;
_L5:
        return new MediationAdRequest(date, gender, hashset, adrequestparcel.zzsE, adrequestparcel.zzsJ);
_L3:
        gender = com.google.ads.AdRequest.Gender.FEMALE;
        continue; /* Loop/switch isn't completed */
_L2:
        gender = com.google.ads.AdRequest.Gender.MALE;
        if (true) goto _L5; else goto _L4
_L4:
    }
}
