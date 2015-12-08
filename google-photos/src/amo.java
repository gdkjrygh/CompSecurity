// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.File;
import java.io.IOException;

public final class amo
{

    final amp a;
    final boolean b[];
    public boolean c;
    public final amm d;

    amo(amm amm1, amp amp1)
    {
        d = amm1;
        super();
        a = amp1;
        if (amp1.e)
        {
            amm1 = null;
        } else
        {
            amm1 = new boolean[amm.e(amm1)];
        }
        b = amm1;
    }

    public final File a(int i)
    {
        amm amm1 = d;
        amm1;
        JVM INSTR monitorenter ;
        if (a.f != this)
        {
            throw new IllegalStateException();
        }
        break MISSING_BLOCK_LABEL_31;
        Exception exception;
        exception;
        amm1;
        JVM INSTR monitorexit ;
        throw exception;
        File file;
        if (!a.e)
        {
            b[0] = true;
        }
        file = a.d[0];
        if (!amm.f(d).exists())
        {
            amm.f(d).mkdirs();
        }
        amm1;
        JVM INSTR monitorexit ;
        return file;
    }

    public final void a()
    {
        amm.a(d, this, false);
    }

    public final void b()
    {
        if (c)
        {
            break MISSING_BLOCK_LABEL_11;
        }
        a();
        return;
        IOException ioexception;
        ioexception;
    }
}
