// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import com.google.android.gms.common.api.Status;
import java.lang.ref.WeakReference;
import java.util.Map;

// Referenced classes of package com.google.android.gms.wearable.internal:
//            z, aq

private static final class b extends 
{

    private WeakReference a;
    private WeakReference b;

    public final void a(Status status)
    {
        Map map;
        Object obj;
        map = (Map)a.get();
        obj = b.get();
        if (status.g != 4002 || map == null || obj == null) goto _L2; else goto _L1
_L1:
        map;
        JVM INSTR monitorenter ;
        obj = (aq)map.remove(obj);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        ((aq) (obj)).a();
        map;
        JVM INSTR monitorexit ;
_L2:
        a(status);
        return;
        status;
        map;
        JVM INSTR monitorexit ;
        throw status;
    }

    (Map map, Object obj, com.google.android.gms.internal. )
    {
        super();
        a = new WeakReference(map);
        b = new WeakReference(obj);
    }
}
