// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.m;

import java.io.File;
import java.io.IOException;

// Referenced classes of package p.m:
//            a

public final class <init>
{

    final a a;
    private final b b;
    private final boolean c[];
    private boolean d;

    static  a( )
    {
        return .b;
    }

    static boolean[] b(b b1)
    {
        return b1.c;
    }

    public File a(int i)
        throws IOException
    {
        a a1 = a;
        a1;
        JVM INSTR monitorenter ;
        if (a(b) != this)
        {
            throw new IllegalStateException();
        }
        break MISSING_BLOCK_LABEL_31;
        Exception exception;
        exception;
        a1;
        JVM INSTR monitorexit ;
        throw exception;
        File file;
        if (!d(b))
        {
            c[i] = true;
        }
        file = b.b(i);
        if (!p.m.a.f(a).exists())
        {
            p.m.a.f(a).mkdirs();
        }
        a1;
        JVM INSTR monitorexit ;
        return file;
    }

    public void a()
        throws IOException
    {
        p.m.a.a(a, this, true);
        d = true;
    }

    public void b()
        throws IOException
    {
        p.m.a.a(a, this, false);
    }

    public void c()
    {
        if (d)
        {
            break MISSING_BLOCK_LABEL_11;
        }
        b();
        return;
        IOException ioexception;
        ioexception;
    }

    private ion(a a1, ion ion)
    {
        a = a1;
        super();
        b = ion;
        if (d(ion))
        {
            a1 = null;
        } else
        {
            a1 = new boolean[p.m.a.e(a1)];
        }
        c = a1;
    }

    c(a a1, c c1, c c2)
    {
        this(a1, c1);
    }
}
