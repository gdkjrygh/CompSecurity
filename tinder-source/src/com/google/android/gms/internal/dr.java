// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.d;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.j;
import com.google.android.gms.common.api.m;
import com.google.android.gms.common.internal.u;

public final class dr extends m
    implements g
{

    private j a;
    private dr b;
    private h c;
    private d d;
    private final Object e;

    private void a(Status status)
    {
        synchronized (e)
        {
            if (a != null)
            {
                u.a(status, "onFailure must not return null");
                b.a(status);
            }
        }
        return;
        status;
        obj;
        JVM INSTR monitorexit ;
        throw status;
    }

    private static void b(f f1)
    {
        if (!(f1 instanceof e))
        {
            break MISSING_BLOCK_LABEL_16;
        }
        ((e)f1).b();
        return;
        RuntimeException runtimeexception;
        runtimeexception;
        Log.w("TransformedResultImpl", (new StringBuilder("Unable to release ")).append(f1).toString(), runtimeexception);
        return;
    }

    public final void a(f f1)
    {
        Object obj = e;
        obj;
        JVM INSTR monitorenter ;
        if (!f1.a().b())
        {
            break MISSING_BLOCK_LABEL_145;
        }
        if (a == null) goto _L2; else goto _L1
_L1:
        d d1 = a.a();
        if (d1 != null) goto _L4; else goto _L3
_L3:
        a(new Status(13, "Transform returned null"));
_L5:
        b(f1);
_L6:
        obj;
        JVM INSTR monitorexit ;
        return;
_L4:
        dr dr1 = b;
        Object obj1 = dr1.e;
        obj1;
        JVM INSTR monitorenter ;
        dr1.d = d1;
        if (dr1.d != null && (dr1.a != null || dr1.c != null))
        {
            break MISSING_BLOCK_LABEL_122;
        }
          goto _L5
        f1;
        obj1;
        JVM INSTR monitorexit ;
        throw f1;
        f1;
        obj;
        JVM INSTR monitorexit ;
        throw f1;
        dr1.d.a(dr1);
          goto _L5
_L2:
        if (c == null);
          goto _L6
        a(f1.a());
        b(f1);
          goto _L6
    }
}
