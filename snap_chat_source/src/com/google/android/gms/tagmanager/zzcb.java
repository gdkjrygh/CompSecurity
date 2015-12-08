// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.zza;
import com.google.android.gms.internal.zzb;
import java.util.Map;

// Referenced classes of package com.google.android.gms.tagmanager:
//            zzaj, zzde, zzdd

class zzcb extends zzaj
{

    private static final String ID;
    private static final String zzazF;
    private static final String zzazG;

    public zzcb()
    {
        super(ID, new String[0]);
    }

    public com.google.android.gms.internal.zzd.zza zzH(Map map)
    {
        Object obj;
        obj = (com.google.android.gms.internal.zzd.zza)map.get(zzazF);
        map = (com.google.android.gms.internal.zzd.zza)map.get(zzazG);
        if (obj == null || obj == zzde.zzuf() || map == null || map == zzde.zzuf()) goto _L2; else goto _L1
_L1:
        obj = zzde.zzh(((com.google.android.gms.internal.zzd.zza) (obj)));
        map = zzde.zzh(map);
        if (obj == zzde.zzud() || map == zzde.zzud()) goto _L2; else goto _L3
_L3:
        double d;
        double d1;
        d1 = ((zzdd) (obj)).doubleValue();
        d = map.doubleValue();
        if (d1 > d) goto _L2; else goto _L4
_L4:
        return zzde.zzx(Long.valueOf(Math.round((d - d1) * Math.random() + d1)));
_L2:
        d = 2147483647D;
        d1 = 0.0D;
        if (true) goto _L4; else goto _L5
_L5:
    }

    public boolean zzsD()
    {
        return false;
    }

    static 
    {
        ID = zza.zzQ.toString();
        zzazF = zzb.zzdz.toString();
        zzazG = zzb.zzdy.toString();
    }
}
