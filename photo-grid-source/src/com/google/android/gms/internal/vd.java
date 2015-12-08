// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.p;
import com.google.android.gms.common.api.q;
import com.google.android.gms.common.api.r;
import com.google.android.gms.common.api.s;
import com.google.android.gms.common.api.t;
import com.google.android.gms.common.api.v;
import com.google.android.gms.common.api.y;
import com.google.android.gms.common.internal.bl;

public final class vd extends y
    implements s
{

    private v a;
    private vd b;
    private t c;
    private p d;
    private final Object e;

    private void a(Status status)
    {
        synchronized (e)
        {
            if (a != null)
            {
                bl.a(status, "onFailure must not return null");
                b.a(status);
            }
        }
        return;
        status;
        obj;
        JVM INSTR monitorexit ;
        throw status;
    }

    private static void b(r r1)
    {
        if (!(r1 instanceof q))
        {
            break MISSING_BLOCK_LABEL_16;
        }
        ((q)r1).b();
        return;
        RuntimeException runtimeexception;
        runtimeexception;
        Log.w("TransformedResultImpl", (new StringBuilder("Unable to release ")).append(r1).toString(), runtimeexception);
        return;
    }

    public final void a(r r1)
    {
        Object obj = e;
        obj;
        JVM INSTR monitorenter ;
        if (!r1.a().e())
        {
            break MISSING_BLOCK_LABEL_145;
        }
        if (a == null) goto _L2; else goto _L1
_L1:
        p p1 = a.a();
        if (p1 != null) goto _L4; else goto _L3
_L3:
        a(new Status(13, "Transform returned null"));
_L5:
        b(r1);
_L6:
        obj;
        JVM INSTR monitorexit ;
        return;
_L4:
        vd vd1 = b;
        Object obj1 = vd1.e;
        obj1;
        JVM INSTR monitorenter ;
        vd1.d = p1;
        if (vd1.d != null && (vd1.a != null || vd1.c != null))
        {
            break MISSING_BLOCK_LABEL_122;
        }
          goto _L5
        r1;
        obj1;
        JVM INSTR monitorexit ;
        throw r1;
        r1;
        obj;
        JVM INSTR monitorexit ;
        throw r1;
        vd1.d.a(vd1);
          goto _L5
_L2:
        if (c == null);
          goto _L6
        a(r1.a());
        b(r1);
          goto _L6
    }
}
