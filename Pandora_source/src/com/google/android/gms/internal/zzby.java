// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.zzb;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            zzbs, zzdb, zzda, zzdd, 
//            zzdc, zzgd

public class zzby
    implements zzbs
{

    static final Map zztJ;
    private final zzb zztH;
    private final zzdb zztI;

    public zzby(zzb zzb1, zzdb zzdb1)
    {
        zztH = zzb1;
        zztI = zzdb1;
    }

    public void zza(zzgd zzgd, Map map)
    {
        String s = (String)map.get("a");
        int i = ((Integer)zztJ.get(s)).intValue();
        if (i != 5 && zztH != null && !zztH.zzaF())
        {
            zztH.zze(null);
            return;
        }
        switch (i)
        {
        case 2: // '\002'
        default:
            com.google.android.gms.ads.internal.util.client.zzb.zzal("Unknown MRAID command called.");
            return;

        case 1: // '\001'
            zztI.zzg(map);
            return;

        case 4: // '\004'
            (new zzda(zzgd, map)).execute();
            return;

        case 3: // '\003'
            (new zzdd(zzgd, map)).execute();
            return;

        case 5: // '\005'
            (new zzdc(zzgd, map)).execute();
            return;

        case 6: // '\006'
            zztI.zzn(true);
            break;
        }
    }

    static 
    {
        zztJ = new HashMap();
        zztJ.put("resize", Integer.valueOf(1));
        zztJ.put("playVideo", Integer.valueOf(2));
        zztJ.put("storePicture", Integer.valueOf(3));
        zztJ.put("createCalendarEvent", Integer.valueOf(4));
        zztJ.put("setOrientationProperties", Integer.valueOf(5));
        zztJ.put("closeResizedAd", Integer.valueOf(6));
    }
}
