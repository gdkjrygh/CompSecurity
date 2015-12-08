// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.zzp;
import java.util.WeakHashMap;

// Referenced classes of package com.google.android.gms.internal:
//            ob, cy, cx, wg, 
//            nz, ny

public final class oa
{

    private WeakHashMap a;

    public oa()
    {
        a = new WeakHashMap();
    }

    public final ny a(Context context)
    {
        Object obj = (ob)a.get(context);
        if (obj == null) goto _L2; else goto _L1
_L1:
        long l = ((ob) (obj)).a;
        cq cq = cy.ad;
        boolean flag;
        if (l + ((Long)zzp.zzbE().a(cq)).longValue() < zzp.zzbz().a())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag) goto _L2; else goto _L3
_L3:
        cq = cy.ac;
        if (!((Boolean)zzp.zzbE().a(cq)).booleanValue()) goto _L2; else goto _L4
_L4:
        obj = (new nz(context, ((ob) (obj)).b)).a();
_L6:
        a.put(context, new ob(this, ((ny) (obj))));
        return ((ny) (obj));
_L2:
        obj = (new nz(context)).a();
        if (true) goto _L6; else goto _L5
_L5:
    }
}
