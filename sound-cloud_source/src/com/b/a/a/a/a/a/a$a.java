// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.b.a.a.a.a.a;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

// Referenced classes of package com.b.a.a.a.a.a:
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
                a.c = true;
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
                a.c = true;
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
                a.c = true;
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
                a.c = true;
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


    final d a;
    final boolean b[];
    boolean c;
    final com.b.a.a.a.a.a.a d;
    private boolean e;

    public final OutputStream a()
        throws IOException
    {
        com.b.a.a.a.a.a.a a1 = d;
        a1;
        JVM INSTR monitorenter ;
        if (a.d != this)
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
        if (!a.c)
        {
            b[0] = true;
        }
        file = a.b(0);
        Object obj1 = new FileOutputStream(file);
_L1:
        obj1 = new a(((OutputStream) (obj1)), (byte)0);
        a1;
        JVM INSTR monitorexit ;
        return ((OutputStream) (obj1));
        obj1;
        com.b.a.a.a.a.a.a.h(d).mkdirs();
        obj1 = new FileOutputStream(file);
          goto _L1
        obj1;
        obj1 = com.b.a.a.a.a.a.a.d();
        a1;
        JVM INSTR monitorexit ;
        return ((OutputStream) (obj1));
    }

    public final void b()
        throws IOException
    {
        if (c)
        {
            com.b.a.a.a.a.a.a.a(d, this, false);
            d.c(a.a);
        } else
        {
            com.b.a.a.a.a.a.a.a(d, this, true);
        }
        e = true;
    }

    public final void c()
        throws IOException
    {
        com.b.a.a.a.a.a.a.a(d, this, false);
    }

    private (com.b.a.a.a.a.a.a a1,  )
    {
        d = a1;
        super();
        a = ;
        if (.c)
        {
            a1 = null;
        } else
        {
            a1 = new boolean[com.b.a.a.a.a.a.a.g(a1)];
        }
        b = a1;
    }

    b(com.b.a.a.a.a.a.a a1, b b1, byte byte0)
    {
        this(a1, b1);
    }
}
