// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.zza;
import com.google.android.gms.internal.zzb;
import java.util.Map;

// Referenced classes of package com.google.android.gms.tagmanager:
//            j, zzdf, bz

class ay extends j
{

    private static final String a;
    private static final String b;
    private static final String c;

    public ay()
    {
        super(a, new String[0]);
    }

    public com.google.android.gms.internal.zzd.zza zzD(Map map)
    {
        Object obj;
        obj = (com.google.android.gms.internal.zzd.zza)map.get(b);
        map = (com.google.android.gms.internal.zzd.zza)map.get(c);
        if (obj == null || obj == zzdf.zzxW() || map == null || map == zzdf.zzxW()) goto _L2; else goto _L1
_L1:
        obj = zzdf.zzh(((com.google.android.gms.internal.zzd.zza) (obj)));
        map = zzdf.zzh(map);
        if (obj == zzdf.zzxU() || map == zzdf.zzxU()) goto _L2; else goto _L3
_L3:
        double d;
        double d1;
        d1 = ((bz) (obj)).doubleValue();
        d = map.doubleValue();
        if (d1 > d) goto _L2; else goto _L4
_L4:
        return zzdf.zzE(Long.valueOf(Math.round((d - d1) * Math.random() + d1)));
_L2:
        d = 2147483647D;
        d1 = 0.0D;
        if (true) goto _L4; else goto _L5
_L5:
    }

    public boolean zzwn()
    {
        return false;
    }

    static 
    {
        a = zza.zzQ.toString();
        b = zzb.zzee.toString();
        c = zzb.zzec.toString();
    }
}
