// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.a.a.b;

import c.e;
import c.g;
import c.i;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

// Referenced classes of package com.c.a.a.b:
//            c, g, a, q

static final class e
    implements c
{

    private final g a;
    private final boolean b;
    private final e c = new e();
    private final a d;
    private int e;
    private boolean f;

    private void a(int j, int k, byte byte0, byte byte1)
        throws IOException
    {
        if (g.b().isLoggable(Level.FINE))
        {
            g.b().fine(a(false, j, k, byte0, byte1));
        }
        if (k > e)
        {
            throw g.b("FRAME_SIZE_ERROR length > %d: %d", new Object[] {
                Integer.valueOf(e), Integer.valueOf(k)
            });
        }
        if ((0x80000000 & j) != 0)
        {
            throw g.b("reserved bit set: %s", new Object[] {
                Integer.valueOf(j)
            });
        } else
        {
            g.a(a, k);
            a.g(byte0 & 0xff);
            a.g(byte1 & 0xff);
            a.e(0x7fffffff & j);
            return;
        }
    }

    private void b(int j, long l)
        throws IOException
    {
        while (l > 0L) 
        {
            int k = (int)Math.min(e, l);
            l -= k;
            byte byte0;
            if (l == 0L)
            {
                byte0 = 4;
            } else
            {
                byte0 = 0;
            }
            a(j, k, (byte)9, byte0);
            a.write(c, k);
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
        a.b(g.a().d());
        a.flush();
          goto _L1
    }

    public final void a(int j, long l)
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
        a(j, 4, (byte)8, (byte)0);
        a.e((int)l);
        a.flush();
        this;
        JVM INSTR monitorexit ;
    }

    public final void a(int j, a a1)
        throws IOException
    {
        this;
        JVM INSTR monitorenter ;
        if (f)
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
        a(j, 4, (byte)3, (byte)0);
        a.e(a1.s);
        a.flush();
        this;
        JVM INSTR monitorexit ;
    }

    public final void a(int j, a a1, byte abyte0[])
        throws IOException
    {
        this;
        JVM INSTR monitorenter ;
        if (f)
        {
            throw new IOException("closed");
        }
        break MISSING_BLOCK_LABEL_24;
        a1;
        this;
        JVM INSTR monitorexit ;
        throw a1;
        if (a1.s == -1)
        {
            throw g.b("errorCode.httpCode == -1", new Object[0]);
        }
        a(0, abyte0.length + 8, (byte)7, (byte)0);
        a.e(j);
        a.e(a1.s);
        if (abyte0.length > 0)
        {
            a.b(abyte0);
        }
        a.flush();
        this;
        JVM INSTR monitorexit ;
    }

    public final void a(q q1)
        throws IOException
    {
        this;
        JVM INSTR monitorenter ;
        if (f)
        {
            throw new IOException("closed");
        }
        break MISSING_BLOCK_LABEL_24;
        q1;
        this;
        JVM INSTR monitorexit ;
        throw q1;
        int j = e;
        if ((q1.a & 0x20) != 0)
        {
            j = q1.d[5];
        }
        e = j;
        a(0, 0, (byte)4, (byte)1);
        a.flush();
        this;
        JVM INSTR monitorexit ;
    }

    public final void a(boolean flag, int j, int k)
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
        a.e(j);
        a.e(k);
        a.flush();
        this;
        JVM INSTR monitorexit ;
    }

    public final void a(boolean flag, int j, e e1, int k)
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
        e1;
        this;
        JVM INSTR monitorexit ;
        throw e1;
        if (flag)
        {
            byte0 = 1;
        }
        a(j, k, (byte)0, byte0);
        if (k <= 0)
        {
            break MISSING_BLOCK_LABEL_62;
        }
        a.write(e1, k);
        this;
        JVM INSTR monitorexit ;
    }

    public final void a(boolean flag, int j, List list)
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
        int k;
        long l;
        if (f)
        {
            throw new IOException("closed");
        }
        if (c.b != 0L)
        {
            throw new IllegalStateException();
        }
        d.a(list);
        l = c.b;
        k = (int)Math.min(e, l);
        break MISSING_BLOCK_LABEL_91;
_L2:
        a(j, k, (byte)1, byte1);
        a.write(c, k);
        if (l <= (long)k)
        {
            break MISSING_BLOCK_LABEL_152;
        }
        b(j, l - (long)k);
        this;
        JVM INSTR monitorexit ;
        return;
        byte byte0;
        byte byte1;
        if (l == (long)k)
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

    public final void b(q q1)
        throws IOException
    {
        int j = 0;
        this;
        JVM INSTR monitorenter ;
        if (f)
        {
            throw new IOException("closed");
        }
        break MISSING_BLOCK_LABEL_26;
        q1;
        this;
        JVM INSTR monitorexit ;
        throw q1;
        a(0, Integer.bitCount(q1.a) * 6, (byte)4, (byte)0);
_L8:
        if (j >= 10) goto _L2; else goto _L1
_L1:
        if (!q1.a(j)) goto _L4; else goto _L3
_L3:
        if (j != 4) goto _L6; else goto _L5
_L5:
        int k = 3;
_L7:
        a.f(k);
        a.e(q1.d[j]);
          goto _L4
_L2:
        a.flush();
        this;
        JVM INSTR monitorexit ;
        return;
_L10:
        k = j;
          goto _L7
_L4:
        j++;
          goto _L8
_L6:
        if (j != 7) goto _L10; else goto _L9
_L9:
        k = 4;
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

    ion(g g1, boolean flag)
    {
        a = g1;
        b = flag;
        d = new <init>(c);
        e = 16384;
    }
}
