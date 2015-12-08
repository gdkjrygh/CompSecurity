// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.d;

import java.io.File;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// Referenced classes of package com.kik.d:
//            d, e

public final class c
{

    String a;
    final File b;
    final ExecutorService c = Executors.newSingleThreadExecutor();
    final int d = 25;

    public c(String s, File file)
    {
        a = s;
        b = file;
    }

    public final void a()
    {
        this;
        JVM INSTR monitorenter ;
        c.submit(new d(b, d));
        c.submit(new e(a, b));
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final void a(String s)
    {
        this;
        JVM INSTR monitorenter ;
        a = s;
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }
}
