// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

static final class e
    implements Ym
{

    private final ahY a;
    private final boolean b;
    private final ahX c = new ahX();
    private final init> d;
    private int e;
    private boolean f;

    private void a(int i, int j, byte byte0, byte byte1)
    {
        if (Yq.b().isLoggable(Level.FINE))
        {
            Yq.b().fine(a(false, i, j, byte0, byte1));
        }
        if (j > e)
        {
            throw Yq.b("FRAME_SIZE_ERROR length > %d: %d", new Object[] {
                Integer.valueOf(e), Integer.valueOf(j)
            });
        }
        if ((0x80000000 & i) != 0)
        {
            throw Yq.b("reserved bit set: %s", new Object[] {
                Integer.valueOf(i)
            });
        } else
        {
            Yq.a(a, j);
            a.j(byte0 & 0xff);
            a.j(byte1 & 0xff);
            a.h(0x7fffffff & i);
            return;
        }
    }

    private void b(int i, long l)
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
        if (Yq.b().isLoggable(Level.FINE))
        {
            Yq.b().fine(String.format(">> CONNECTION %s", new Object[] {
                Yq.a().b()
            }));
        }
        a.b(Yq.a().d());
        a.flush();
          goto _L1
    }

    public final void a(int i, long l)
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
        throw Yq.b("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", new Object[] {
            Long.valueOf(l)
        });
        a(i, 4, (byte)8, (byte)0);
        a.h((int)l);
        a.flush();
        this;
        JVM INSTR monitorexit ;
    }

    public final void a(int i, Yk yk)
    {
        this;
        JVM INSTR monitorenter ;
        if (f)
        {
            throw new IOException("closed");
        }
        break MISSING_BLOCK_LABEL_24;
        yk;
        this;
        JVM INSTR monitorexit ;
        throw yk;
        if (yk.j == -1)
        {
            throw new IllegalArgumentException();
        }
        a(i, 4, (byte)3, (byte)0);
        a.h(yk.i);
        a.flush();
        this;
        JVM INSTR monitorexit ;
    }

    public final void a(int i, Yk yk, byte abyte0[])
    {
        this;
        JVM INSTR monitorenter ;
        if (f)
        {
            throw new IOException("closed");
        }
        break MISSING_BLOCK_LABEL_24;
        yk;
        this;
        JVM INSTR monitorexit ;
        throw yk;
        if (yk.i == -1)
        {
            throw Yq.b("errorCode.httpCode == -1", new Object[0]);
        }
        a(0, abyte0.length + 8, (byte)7, (byte)0);
        a.h(i);
        a.h(yk.i);
        if (abyte0.length > 0)
        {
            a.b(abyte0);
        }
        a.flush();
        this;
        JVM INSTR monitorexit ;
    }

    public final void a(Yw yw)
    {
        this;
        JVM INSTR monitorenter ;
        if (f)
        {
            throw new IOException("closed");
        }
        break MISSING_BLOCK_LABEL_24;
        yw;
        this;
        JVM INSTR monitorexit ;
        throw yw;
        int i = e;
        if ((yw.a & 0x20) != 0)
        {
            i = yw.d[5];
        }
        e = i;
        a(0, 0, (byte)4, (byte)1);
        a.flush();
        this;
        JVM INSTR monitorexit ;
    }

    public final void a(boolean flag, int i, int j)
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
        a.h(i);
        a.h(j);
        a.flush();
        this;
        JVM INSTR monitorexit ;
    }

    public final void a(boolean flag, int i, ahX ahx, int j)
    {
        byte byte0 = 0;
        this;
        JVM INSTR monitorenter ;
        if (f)
        {
            throw new IOException("closed");
        }
        break MISSING_BLOCK_LABEL_27;
        ahx;
        this;
        JVM INSTR monitorexit ;
        throw ahx;
        if (flag)
        {
            byte0 = 1;
        }
        a(i, j, (byte)0, byte0);
        if (j <= 0)
        {
            break MISSING_BLOCK_LABEL_62;
        }
        a.a_(ahx, j);
        this;
        JVM INSTR monitorexit ;
    }

    public final void a(boolean flag, int i, List list)
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
        if (c.b != 0L)
        {
            throw new IllegalStateException();
        }
        d.a(list);
        l = c.b;
        j = (int)Math.min(e, l);
        break MISSING_BLOCK_LABEL_91;
_L2:
        a(i, j, (byte)1, byte1);
        a.a_(c, j);
        if (l <= (long)j)
        {
            break MISSING_BLOCK_LABEL_152;
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

    public final void b()
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

    public final void b(Yw yw)
    {
        int i = 0;
        this;
        JVM INSTR monitorenter ;
        if (f)
        {
            throw new IOException("closed");
        }
        break MISSING_BLOCK_LABEL_26;
        yw;
        this;
        JVM INSTR monitorexit ;
        throw yw;
        a(0, Integer.bitCount(yw.a) * 6, (byte)4, (byte)0);
_L8:
        if (i >= 10) goto _L2; else goto _L1
_L1:
        if (!yw.a(i)) goto _L4; else goto _L3
_L3:
        if (i != 4) goto _L6; else goto _L5
_L5:
        int j = 3;
_L7:
        a.i(j);
        a.h(yw.d[i]);
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

    >(ahY ahy, boolean flag)
    {
        a = ahy;
        b = flag;
        d = new <init>(c);
        e = 16384;
    }
}
