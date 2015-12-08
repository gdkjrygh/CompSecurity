// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.baselib.b;

import java.io.FileOutputStream;
import java.io.OutputStream;

// Referenced classes of package com.roidapp.baselib.b:
//            f, e, b

public final class d
{

    final b a;
    private final f b;
    private boolean c;

    private d(b b1, f f1)
    {
        a = b1;
        super();
        b = f1;
    }

    d(b b1, f f1, byte byte0)
    {
        this(b1, f1);
    }

    static f a(d d1)
    {
        return d1.b;
    }

    static boolean b(d d1)
    {
        d1.c = true;
        return true;
    }

    public final OutputStream a()
    {
        b b1 = a;
        b1;
        JVM INSTR monitorenter ;
        if (f.b(b) != this)
        {
            throw new IllegalStateException("This entry editor error");
        }
        break MISSING_BLOCK_LABEL_33;
        Exception exception;
        exception;
        b1;
        JVM INSTR monitorexit ;
        throw exception;
        e e1 = new e(this, new FileOutputStream(b.b(0)), (byte)0);
        b1;
        JVM INSTR monitorexit ;
        return e1;
    }

    public final void b()
    {
        if (c)
        {
            com.roidapp.baselib.b.b.a(a, this, false);
            a.c(f.d(b));
            return;
        } else
        {
            com.roidapp.baselib.b.b.a(a, this, true);
            return;
        }
    }

    public final void c()
    {
        com.roidapp.baselib.b.b.a(a, this, false);
    }
}
