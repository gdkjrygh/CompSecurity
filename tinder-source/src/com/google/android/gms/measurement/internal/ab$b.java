// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.u;

// Referenced classes of package com.google.android.gms.measurement.internal:
//            ab, w

private final class b
    implements d.UncaughtExceptionHandler
{

    final ab a;
    private final String b;

    public final void uncaughtException(Thread thread, Throwable throwable)
    {
        this;
        JVM INSTR monitorenter ;
        a.l().a.(b, throwable);
        this;
        JVM INSTR monitorexit ;
        return;
        thread;
        throw thread;
    }

    public (ab ab1, String s)
    {
        a = ab1;
        super();
        u.a(s);
        b = s;
    }
}
