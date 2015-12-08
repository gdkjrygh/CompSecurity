// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.framed;

import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import okio.ByteString;
import okio.c;
import okio.d;

// Referenced classes of package com.squareup.okhttp.internal.framed:
//            b, g, ErrorCode, m

static final class e
    implements b
{

    private final d a;
    private final boolean b;
    private final c c = new c();
    private final a d;
    private int e;
    private boolean f;

    private void a(int i, int j, byte byte0, byte byte1)
        throws IOException
    {
        if (g.b().isLoggable(Level.FINE))
        {
            g.b().fine(a(false, i, j, byte0, byte1));
        }
        if (j > e)
        {
            throw g.b("FRAME_SIZE_ERROR length > %d: %d", new Object[] {
                Integer.valueOf(e), Integer.valueOf(j)
            });
        }
        if ((0x80000000 & i) != 0)
        {
            throw g.b("reserved bit set: %s", new Object[] {
                Integer.valueOf(i)
            });
        } else
        {
            g.a(a, j);
            a.h(byte0 & 0xff);
            a.h(byte1 & 0xff);
            a.f(0x7fffffff & i);
            return;
        }
    }

    private void b(int i, long l)
        throws IOException
    {
        while (l > 0L) 
        {
            int j = (int)Math.min(e, l);
            l -= j;
            byte byte0;
            if (l == 0L)
            {
                byte0 = 4;
            } else
            {
                byte0 = 0;
            }
            a(i, j, (byte)9, byte0);
            a.a_(c, j);
        }
    }

    public final void a()
        throws IOException
    {
        this;
        JVM INSTR monitorenter ;
        if (f)
        {
            throw new IOException("closed");
        }
        break MISSING_BLOCK_LABEL_24;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        boolean flag = b;
        if (flag)
        {
            break MISSING_BLOCK_LABEL_36;
        }
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
        if (g.b().isLoggable(Level.FINE))
        {
            g.b().fine(String.format(">> CONNECTION %s", new Object[] {
                g.a().b()
            }));
        }
        a.c(g.a().d());
        a.flush();
          goto _L1
    }

    public final void a(int i, long l)
        throws IOException
    {
        this;
        JVM INSTR monitorenter ;
        if (f)
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
            break MISSING_BLOCK_LABEL_57;
        }
        throw g.b("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", new Object[] {
            Long.valueOf(l)
        });
        a(i, 4, (byte)8, (byte)0);
        a.f((int)l);
        a.flush();
        this;
        JVM INSTR monitorexit ;
    }

    public final void a(int i, ErrorCode errorcode)
        throws IOException
    {
        this;
        JVM INSTR monitorenter ;
        if (f)
        {
            throw new IOException("closed");
        }
        break MISSING_BLOCK_LABEL_24;
        errorcode;
        this;
        JVM INSTR monitorexit ;
        throw errorcode;
        if (errorcode.s == -1)
        {
            throw new IllegalArgumentException();
        }
        a(i, 4, (byte)3, (byte)0);
        a.f(errorcode.s);
        a.flush();
        this;
        JVM INSTR monitorexit ;
    }

    public final void a(int i, ErrorCode errorcode, byte abyte0[])
        throws IOException
    {
        this;
        JVM INSTR monitorenter ;
        if (f)
        {
            throw new IOException("closed");
        }
        break MISSING_BLOCK_LABEL_24;
        errorcode;
        this;
        JVM INSTR monitorexit ;
        throw errorcode;
        if (errorcode.s == -1)
        {
            throw g.b("errorCode.httpCode == -1", new Object[0]);
        }
        a(0, abyte0.length + 8, (byte)7, (byte)0);
        a.f(i);
        a.f(errorcode.s);
        if (abyte0.length > 0)
        {
            a.c(abyte0);
        }
        a.flush();
        this;
        JVM INSTR monitorexit ;
    }

    public final void a(m m1)
        throws IOException
    {
        this;
        JVM INSTR monitorenter ;
        if (f)
        {
            throw new IOException("closed");
        }
        break MISSING_BLOCK_LABEL_24;
        m1;
        this;
        JVM INSTR monitorexit ;
        throw m1;
        int i = e;
        if ((m1.a & 0x20) != 0)
        {
            i = m1.d[5];
        }
        e = i;
        a(0, 0, (byte)4, (byte)1);
        a.flush();
        this;
        JVM INSTR monitorexit ;
    }

    public final void a(boolean flag, int i, int j)
        throws IOException
    {
        byte byte0 = 0;
        this;
        JVM INSTR monitorenter ;
        if (f)
        {
            throw new IOException("closed");
        }
        break MISSING_BLOCK_LABEL_29;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        if (flag)
        {
            byte0 = 1;
        }
        a(0, 8, (byte)6, byte0);
        a.f(i);
        a.f(j);
        a.flush();
        this;
        JVM INSTR monitorexit ;
    }

    public final void a(boolean flag, int i, List list)
        throws IOException
    {
        this;
        JVM INSTR monitorenter ;
        if (f)
        {
            throw new IOException("closed");
        }
        break MISSING_BLOCK_LABEL_24;
        list;
        this;
        JVM INSTR monitorexit ;
        throw list;
        int j;
        long l;
        if (f)
        {
            throw new IOException("closed");
        }
        d.a(list);
        l = c.b;
        j = (int)Math.min(e, l);
        break MISSING_BLOCK_LABEL_71;
_L2:
        a(i, j, (byte)1, byte1);
        a.a_(c, j);
        if (l <= (long)j)
        {
            break MISSING_BLOCK_LABEL_132;
        }
        b(i, l - (long)j);
        this;
        JVM INSTR monitorexit ;
        return;
        byte byte0;
        byte byte1;
        if (l == (long)j)
        {
            byte0 = 4;
        } else
        {
            byte0 = 0;
        }
        byte1 = byte0;
        if (flag)
        {
            byte1 = (byte)(byte0 | 1);
        }
        if (true) goto _L2; else goto _L1
_L1:
    }

    public final void a(boolean flag, int i, c c1, int j)
        throws IOException
    {
        byte byte0 = 0;
        this;
        JVM INSTR monitorenter ;
        if (f)
        {
            throw new IOException("closed");
        }
        break MISSING_BLOCK_LABEL_27;
        c1;
        this;
        JVM INSTR monitorexit ;
        throw c1;
        if (flag)
        {
            byte0 = 1;
        }
        a(i, j, (byte)0, byte0);
        if (j <= 0)
        {
            break MISSING_BLOCK_LABEL_62;
        }
        a.a_(c1, j);
        this;
        JVM INSTR monitorexit ;
    }

    public final void b()
        throws IOException
    {
        this;
        JVM INSTR monitorenter ;
        if (f)
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

    public final void b(m m1)
        throws IOException
    {
        int i = 0;
        this;
        JVM INSTR monitorenter ;
        if (f)
        {
            throw new IOException("closed");
        }
        break MISSING_BLOCK_LABEL_26;
        m1;
        this;
        JVM INSTR monitorexit ;
        throw m1;
        a(0, Integer.bitCount(m1.a) * 6, (byte)4, (byte)0);
_L8:
        if (i >= 10) goto _L2; else goto _L1
_L1:
        if (!m1.a(i)) goto _L4; else goto _L3
_L3:
        if (i != 4) goto _L6; else goto _L5
_L5:
        int j = 3;
_L7:
        a.g(j);
        a.f(m1.d[i]);
          goto _L4
_L2:
        a.flush();
        this;
        JVM INSTR monitorexit ;
        return;
_L10:
        j = i;
          goto _L7
_L4:
        i++;
          goto _L8
_L6:
        if (i != 7) goto _L10; else goto _L9
_L9:
        j = 4;
          goto _L7
    }

    public final int c()
    {
        return e;
    }

    public final void close()
        throws IOException
    {
        this;
        JVM INSTR monitorenter ;
        f = true;
        a.close();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    rCode(d d1, boolean flag)
    {
        a = d1;
        b = flag;
        d = new <init>(c);
        e = 16384;
    }
}
