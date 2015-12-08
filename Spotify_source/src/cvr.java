// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public final class cvr
{

    final cvt a;
    final boolean b[];
    boolean c;
    private cvq d;

    private cvr(cvq cvq1, cvt cvt1)
    {
        d = cvq1;
        super();
        a = cvt1;
        if (cvt1.c)
        {
            cvq1 = null;
        } else
        {
            cvq1 = new boolean[cvq.f(cvq1)];
        }
        b = cvq1;
    }

    cvr(cvq cvq1, cvt cvt1, byte byte0)
    {
        this(cvq1, cvt1);
    }

    public final OutputStream a(int i)
    {
        cvq cvq1 = d;
        cvq1;
        JVM INSTR monitorenter ;
        if (a.d != this)
        {
            throw new IllegalStateException();
        }
        break MISSING_BLOCK_LABEL_31;
        Object obj;
        obj;
        cvq1;
        JVM INSTR monitorexit ;
        throw obj;
        File file;
        if (!a.c)
        {
            b[i] = true;
        }
        file = a.b(i);
        Object obj1 = new FileOutputStream(file);
_L1:
        obj1 = new cvs(this, ((OutputStream) (obj1)), (byte)0);
        cvq1;
        JVM INSTR monitorexit ;
        return ((OutputStream) (obj1));
        obj1;
        cvq.g(d).mkdirs();
        obj1 = new FileOutputStream(file);
          goto _L1
        obj1;
        obj1 = cvq.c();
        cvq1;
        JVM INSTR monitorexit ;
        return ((OutputStream) (obj1));
    }

    public final void a()
    {
        if (c)
        {
            cvq.a(d, this, false);
            d.c(a.a);
            return;
        } else
        {
            cvq.a(d, this, true);
            return;
        }
    }

    public final void b()
    {
        cvq.a(d, this, false);
    }
}
