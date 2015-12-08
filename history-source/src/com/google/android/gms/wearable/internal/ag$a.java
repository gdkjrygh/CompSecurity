// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.Status;
import java.lang.ref.WeakReference;
import java.util.Map;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            ag, bb

private static class axQ extends axQ
{

    private WeakReference axP;
    private WeakReference axQ;

    public void a(Status status)
    {
        Map map;
        Object obj;
        map = (Map)axP.get();
        obj = axQ.get();
        if (status.getStatus().isSuccess() || map == null || obj == null) goto _L2; else goto _L1
_L1:
        map;
        JVM INSTR monitorenter ;
        obj = (bb)map.remove(obj);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        ((bb) (obj)).clear();
        map;
        JVM INSTR monitorexit ;
_L2:
        A(status);
        return;
        status;
        map;
        JVM INSTR monitorexit ;
        throw status;
    }

    n.b(Map map, Object obj, com.google.android.gms.common.api.mplementation.b b)
    {
        super(b);
        axP = new WeakReference(map);
        axQ = new WeakReference(obj);
    }
}
