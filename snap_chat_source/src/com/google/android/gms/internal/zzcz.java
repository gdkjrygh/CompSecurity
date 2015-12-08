// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            zzcv, zzu, zzhx, zzeb, 
//            zzea, zzed, zzec, zzic

public class zzcz
    implements zzcv
{

    static final Map zzrM;
    private final zzu zzrK;
    private final zzeb zzrL;

    public zzcz(zzu zzu1, zzeb zzeb1)
    {
        zzrK = zzu1;
        zzrL = zzeb1;
    }

    public void zza(zzic zzic, Map map)
    {
        String s = (String)map.get("a");
        int i = ((Integer)zzrM.get(s)).intValue();
        if (i != 5 && zzrK != null && !zzrK.zzaB())
        {
            zzrK.zzd(null);
            return;
        }
        switch (i)
        {
        case 2: // '\002'
        default:
            zzhx.zzaa("Unknown MRAID command called.");
            return;

        case 1: // '\001'
            zzrL.zzg(map);
            return;

        case 4: // '\004'
            (new zzea(zzic, map)).execute();
            return;

        case 3: // '\003'
            (new zzed(zzic, map)).execute();
            return;

        case 5: // '\005'
            (new zzec(zzic, map)).execute();
            return;

        case 6: // '\006'
            zzrL.zzm(true);
            break;
        }
    }

    static 
    {
        HashMap hashmap = new HashMap();
        zzrM = hashmap;
        hashmap.put("resize", Integer.valueOf(1));
        zzrM.put("playVideo", Integer.valueOf(2));
        zzrM.put("storePicture", Integer.valueOf(3));
        zzrM.put("createCalendarEvent", Integer.valueOf(4));
        zzrM.put("setOrientationProperties", Integer.valueOf(5));
        zzrM.put("closeResizedAd", Integer.valueOf(6));
    }
}
