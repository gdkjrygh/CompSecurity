// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.a.a.b;

import c.e;
import c.g;
import c.i;
import c.j;
import c.o;
import java.io.IOException;
import java.util.List;
import java.util.zip.Deflater;

// Referenced classes of package com.c.a.a.b:
//            c, r, d, a, 
//            q

static final class flater
    implements c
{

    private final g a;
    private final e b = new e();
    private final g c;
    private final boolean d;
    private boolean e;

    private void a(List list)
        throws IOException
    {
        if (b.b != 0L)
        {
            throw new IllegalStateException();
        }
        c.e(list.size());
        int i1 = list.size();
        for (int l = 0; l < i1; l++)
        {
            i k = ((d)list.get(l)).h;
            c.e(k.c.length);
            c.b(k);
            k = ((d)list.get(l)).i;
            c.e(k.c.length);
            c.b(k);
        }

        c.flush();
    }

    public final void a()
    {
        this;
        JVM INSTR monitorenter ;
    }

    public final void a(int k, long l)
        throws IOException
    {
        this;
        JVM INSTR monitorenter ;
        if (e)
        {
            throw new IOException("closed");
        }
        break MISSING_BLOCK_LABEL_26;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        if (l != 0L && l <= 0x7fffffffL)
        {
            break MISSING_BLOCK_LABEL_64;
        }
        throw new IllegalArgumentException((new StringBuilder("windowSizeIncrement must be between 1 and 0x7fffffff: ")).append(l).toString());
        a.e(0x80030009);
        a.e(8);
        a.e(k);
        a.e((int)l);
        a.flush();
        this;
        JVM INSTR monitorexit ;
    }

    public final void a(int k, a a1)
        throws IOException
    {
        this;
        JVM INSTR monitorenter ;
        if (e)
        {
            throw new IOException("closed");
        }
        break MISSING_BLOCK_LABEL_24;
        a1;
        this;
        JVM INSTR monitorexit ;
        throw a1;
        if (a1.t == -1)
        {
            throw new IllegalArgumentException();
        }
        a.e(0x80030003);
        a.e(8);
        a.e(0x7fffffff & k);
        a.e(a1.t);
        a.flush();
        this;
        JVM INSTR monitorexit ;
    }

    public final void a(int k, a a1, byte abyte0[])
        throws IOException
    {
        this;
        JVM INSTR monitorenter ;
        if (e)
        {
            throw new IOException("closed");
        }
        break MISSING_BLOCK_LABEL_24;
        a1;
        this;
        JVM INSTR monitorexit ;
        throw a1;
        if (a1.u == -1)
        {
            throw new IllegalArgumentException("errorCode.spdyGoAwayCode == -1");
        }
        a.e(0x80030007);
        a.e(8);
        a.e(k);
        a.e(a1.u);
        a.flush();
        this;
        JVM INSTR monitorexit ;
    }

    public final void a(q q1)
    {
    }

    public final void a(boolean flag, int k, int l)
        throws IOException
    {
        boolean flag2 = true;
        this;
        JVM INSTR monitorenter ;
        if (e)
        {
            throw new IOException("closed");
        }
        break MISSING_BLOCK_LABEL_29;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        boolean flag3 = d;
        boolean flag1;
        if ((k & 1) == 1)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (flag3 != flag1)
        {
            flag1 = flag2;
        } else
        {
            flag1 = false;
        }
          goto _L1
_L3:
        if (flag == flag1)
        {
            break MISSING_BLOCK_LABEL_64;
        }
        throw new IllegalArgumentException("payload != reply");
        a.e(0x80030006);
        a.e(4);
        a.e(k);
        a.flush();
        this;
        JVM INSTR monitorexit ;
        return;
_L1:
        if (true) goto _L3; else goto _L2
_L2:
    }

    public final void a(boolean flag, int k, e e1, int l)
        throws IOException
    {
        this;
        JVM INSTR monitorenter ;
        int i1;
        if (flag)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (e)
        {
            throw new IOException("closed");
        }
        break MISSING_BLOCK_LABEL_37;
        e1;
        this;
        JVM INSTR monitorexit ;
        throw e1;
        if ((long)l <= 0xffffffL)
        {
            break MISSING_BLOCK_LABEL_72;
        }
        throw new IllegalArgumentException((new StringBuilder("FRAME_TOO_LARGE max size is 16Mib: ")).append(l).toString());
        a.e(0x7fffffff & k);
        a.e((i1 & 0xff) << 24 | 0xffffff & l);
        if (l <= 0)
        {
            break MISSING_BLOCK_LABEL_129;
        }
        a.write(e1, l);
        this;
        JVM INSTR monitorexit ;
    }

    public final void a(boolean flag, int k, List list)
        throws IOException
    {
        boolean flag1 = false;
        this;
        JVM INSTR monitorenter ;
        if (e)
        {
            throw new IOException("closed");
        }
        break MISSING_BLOCK_LABEL_27;
        list;
        this;
        JVM INSTR monitorexit ;
        throw list;
        int l;
        a(list);
        l = (int)(10L + b.b);
        if (flag)
        {
            flag1 = true;
        }
        a.e(0x80030001);
        a.e(((flag1 | false) & 0xff) << 24 | l & 0xffffff);
        a.e(0x7fffffff & k);
        a.e(0);
        a.f(0);
        a.a(b);
        a.flush();
        this;
        JVM INSTR monitorexit ;
    }

    public final void b()
        throws IOException
    {
        this;
        JVM INSTR monitorenter ;
        if (e)
        {
            throw new IOException("closed");
        }
        break MISSING_BLOCK_LABEL_24;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        a.flush();
        this;
        JVM INSTR monitorexit ;
    }

    public final void b(q q1)
        throws IOException
    {
        this;
        JVM INSTR monitorenter ;
        if (e)
        {
            throw new IOException("closed");
        }
        break MISSING_BLOCK_LABEL_24;
        q1;
        this;
        JVM INSTR monitorexit ;
        throw q1;
        int k = Integer.bitCount(q1.a);
        a.e(0x80030004);
        a.e(k * 8 + 4 & 0xffffff | 0);
        a.e(k);
        int l = 0;
_L2:
        if (l > 10)
        {
            break MISSING_BLOCK_LABEL_140;
        }
        if (q1.a(l))
        {
            int i1 = q1.b(l);
            a.e((i1 & 0xff) << 24 | l & 0xffffff);
            a.e(q1.d[l]);
        }
        break MISSING_BLOCK_LABEL_152;
        a.flush();
        this;
        JVM INSTR monitorexit ;
        return;
        l++;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public final int c()
    {
        return 16383;
    }

    public final void close()
        throws IOException
    {
        this;
        JVM INSTR monitorenter ;
        e = true;
        com.c.a.a.i.a(a, c);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    flater(g g1, boolean flag)
    {
        a = g1;
        d = flag;
        g1 = new Deflater();
        g1.setDictionary(r.a);
        c = o.a(new j(b, g1));
    }
}
