// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.zzp;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            fz, cy, cx, ry

final class fr
    implements fz
{

    fr()
    {
    }

    public final void zza(ry ry1, Map map)
    {
        cq cq = cy.ai;
        if (!((Boolean)zzp.zzbE().a(cq)).booleanValue())
        {
            return;
        }
        boolean flag;
        if (!Boolean.parseBoolean((String)map.get("disabled")))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ry1.c(flag);
    }
}
