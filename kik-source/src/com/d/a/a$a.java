// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.d.a;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

// Referenced classes of package com.d.a:
//            a

public final class <init>
{
    private final class a extends FilterOutputStream
    {

        final a.a a;

        public final void close()
        {
            try
            {
                out.close();
                return;
            }
            catch (IOException ioexception)
            {
                a.a.c(a);
            }
        }

        public final void flush()
        {
            try
            {
                out.flush();
                return;
            }
            catch (IOException ioexception)
            {
                a.a.c(a);
            }
        }

        public final void write(int i)
        {
            try
            {
                out.write(i);
                return;
            }
            catch (IOException ioexception)
            {
                a.a.c(a);
            }
        }

        public final void write(byte abyte0[], int i, int j)
        {
            try
            {
                out.write(abyte0, i, j);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (byte abyte0[])
            {
                a.a.c(a);
            }
        }

        private a(OutputStream outputstream)
        {
            a = a.a.this;
            super(outputstream);
        }

        a(OutputStream outputstream, byte byte0)
        {
            this(outputstream);
        }
    }


    final com.d.a.a a;
    private final c b;
    private final boolean c[];
    private boolean d;
    private boolean e;

    static a.a a(a.a a1)
    {
        return a1.b;
    }

    static boolean[] b(b b1)
    {
        return b1.c;
    }

    static boolean c(c c1)
    {
        c1.d = true;
        return true;
    }

    public final OutputStream a()
    {
        com.d.a.a a1 = a;
        a1;
        JVM INSTR monitorenter ;
        if (b(b) != this)
        {
            throw new IllegalStateException();
        }
        break MISSING_BLOCK_LABEL_31;
        Object obj;
        obj;
        a1;
        JVM INSTR monitorexit ;
        throw obj;
        File file;
        if (!e(b))
        {
            c[0] = true;
        }
        file = b.b(0);
        Object obj1 = new FileOutputStream(file);
_L1:
        obj1 = new a(((OutputStream) (obj1)), (byte)0);
        a1;
        JVM INSTR monitorexit ;
        return ((OutputStream) (obj1));
        obj1;
        com.d.a.a.g(a).mkdirs();
        obj1 = new FileOutputStream(file);
          goto _L1
        obj1;
        obj1 = com.d.a.a.b();
        a1;
        JVM INSTR monitorexit ;
        return ((OutputStream) (obj1));
    }

    public final void b()
    {
        if (d)
        {
            com.d.a.a.a(a, this, false);
            a.c(d(b));
        } else
        {
            com.d.a.a.a(a, this, true);
        }
        e = true;
    }

    public final void c()
    {
        com.d.a.a.a(a, this, false);
    }

    public final void d()
    {
        if (e)
        {
            break MISSING_BLOCK_LABEL_11;
        }
        c();
        return;
        IOException ioexception;
        ioexception;
    }

    private utStream(com.d.a.a a1, utStream utstream)
    {
        a = a1;
        super();
        b = utstream;
        if (e(utstream))
        {
            a1 = null;
        } else
        {
            a1 = new boolean[com.d.a.a.f(a1)];
        }
        c = a1;
    }

    c(com.d.a.a a1, c c1, byte byte0)
    {
        this(a1, c1);
    }
}
