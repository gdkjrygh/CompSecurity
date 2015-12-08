// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.util.client.zzb;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            fz, gj, ry

public final class gi
    implements fz
{

    private final gj a;

    public gi(gj gj1)
    {
        a = gj1;
    }

    public final void zza(ry ry, Map map)
    {
        boolean flag;
        boolean flag1;
        flag = "1".equals(map.get("transparentBackground"));
        flag1 = "1".equals(map.get("blur"));
        if (map.get("blurRadius") == null) goto _L2; else goto _L1
_L1:
        float f = Float.parseFloat((String)map.get("blurRadius"));
_L4:
        a.zzd(flag);
        a.zza(flag1, f);
        return;
        ry;
        zzb.zzb("Fail to parse float", ry);
_L2:
        f = 0.0F;
        if (true) goto _L4; else goto _L3
_L3:
    }
}
