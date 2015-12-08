// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.a.c.d;

import com.android.slyce.a.ah;
import com.android.slyce.a.aj;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

// Referenced classes of package com.android.slyce.a.c.d:
//            k, r, s, g, 
//            t, h, ab

final class x
    implements k
{

    private final ah a;
    private final boolean b;
    private final r c = new r();
    private boolean d;
    private final aj e = new aj();

    x(ah ah1, boolean flag)
    {
        a = ah1;
        b = flag;
    }

    private void a(aj aj1, int i)
    {
        while (aj1.e()) 
        {
            int j = Math.min(16383, aj1.d());
            byte byte0;
            if (aj1.d() - j == 0)
            {
                byte0 = 4;
            } else
            {
                byte0 = 0;
            }
            a(i, j, (byte)9, byte0);
            aj1.a(e, j);
            a.a(e);
        }
    }

    public void a()
    {
        this;
        JVM INSTR monitorenter ;
        if (d)
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
        if (s.a().isLoggable(Level.FINE))
        {
            s.a().fine(String.format(">> CONNECTION %s", new Object[] {
                s.b().b()
            }));
        }
        a.a(new aj(s.b().e()));
          goto _L1
    }

    void a(int i, byte byte0, aj aj1)
    {
        a(i, aj1.d(), (byte)0, byte0);
        a.a(aj1);
    }

    void a(int i, int j, byte byte0, byte byte1)
    {
        if (s.a().isLoggable(Level.FINE))
        {
            s.a().fine(t.a(false, i, j, byte0, byte1));
        }
        if (j > 16383)
        {
            throw s.b("FRAME_SIZE_ERROR length > %d: %d", new Object[] {
                Integer.valueOf(16383), Integer.valueOf(j)
            });
        }
        if ((0x80000000 & i) != 0)
        {
            throw s.b("reserved bit set: %s", new Object[] {
                Integer.valueOf(i)
            });
        } else
        {
            ByteBuffer bytebuffer = aj.c(256).order(ByteOrder.BIG_ENDIAN);
            bytebuffer.putInt((j & 0x3fff) << 16 | (byte0 & 0xff) << 8 | byte1 & 0xff);
            bytebuffer.putInt(0x7fffffff & i);
            bytebuffer.flip();
            a.a(e.a(bytebuffer));
            return;
        }
    }

    public void a(int i, int j, List list)
    {
        this;
        JVM INSTR monitorenter ;
        if (d)
        {
            throw new IOException("closed");
        }
        break MISSING_BLOCK_LABEL_24;
        list;
        this;
        JVM INSTR monitorexit ;
        throw list;
        int l;
        long l1;
        list = c.a(list);
        l1 = list.d();
        l = (int)Math.min(16379L, l1);
        byte byte0;
        ByteBuffer bytebuffer;
        if (l1 == (long)l)
        {
            byte0 = 4;
        } else
        {
            byte0 = 0;
        }
        a(i, l + 4, (byte)5, byte0);
        bytebuffer = aj.c(8192).order(ByteOrder.BIG_ENDIAN);
        bytebuffer.putInt(0x7fffffff & j);
        bytebuffer.flip();
        e.a(bytebuffer);
        list.a(e, l);
        a.a(e);
        if (l1 <= (long)l)
        {
            break MISSING_BLOCK_LABEL_151;
        }
        a(((aj) (list)), i);
        this;
        JVM INSTR monitorexit ;
    }

    public void a(int i, long l)
    {
        this;
        JVM INSTR monitorenter ;
        if (d)
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
        throw s.b("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", new Object[] {
            Long.valueOf(l)
        });
        a(i, 4, (byte)8, (byte)0);
        ByteBuffer bytebuffer = aj.c(256).order(ByteOrder.BIG_ENDIAN);
        bytebuffer.putInt((int)l);
        bytebuffer.flip();
        a.a(e.a(bytebuffer));
        this;
        JVM INSTR monitorexit ;
    }

    public void a(int i, h h1)
    {
        this;
        JVM INSTR monitorenter ;
        if (d)
        {
            throw new IOException("closed");
        }
        break MISSING_BLOCK_LABEL_24;
        h1;
        this;
        JVM INSTR monitorexit ;
        throw h1;
        if (h1.s == -1)
        {
            throw new IllegalArgumentException();
        }
        a(i, 4, (byte)3, (byte)0);
        ByteBuffer bytebuffer = aj.c(8192).order(ByteOrder.BIG_ENDIAN);
        bytebuffer.putInt(h1.r);
        bytebuffer.flip();
        a.a(e.a(bytebuffer));
        this;
        JVM INSTR monitorexit ;
    }

    public void a(ab ab1)
    {
        int i = 0;
        this;
        JVM INSTR monitorenter ;
        if (d)
        {
            throw new IOException("closed");
        }
        break MISSING_BLOCK_LABEL_26;
        ab1;
        this;
        JVM INSTR monitorexit ;
        throw ab1;
        ByteBuffer bytebuffer;
        a(0, ab1.b() * 6, (byte)4, (byte)0);
        bytebuffer = aj.c(8192).order(ByteOrder.BIG_ENDIAN);
_L6:
        if (i >= 10) goto _L2; else goto _L1
_L1:
        if (ab1.a(i)) goto _L4; else goto _L3
_L5:
        int j;
        bytebuffer.putShort((short)j);
        bytebuffer.putInt(ab1.b(i));
          goto _L3
_L2:
        bytebuffer.flip();
        a.a(e.a(bytebuffer));
        this;
        JVM INSTR monitorexit ;
        return;
_L8:
        j = i;
          goto _L5
_L3:
        i++;
          goto _L6
_L4:
        if (i != 4)
        {
            continue; /* Loop/switch isn't completed */
        }
        j = 3;
          goto _L5
        if (i != 7) goto _L8; else goto _L7
_L7:
        j = 4;
          goto _L5
    }

    public void a(boolean flag, int i, int j)
    {
        byte byte0 = 0;
        this;
        JVM INSTR monitorenter ;
        if (d)
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
        ByteBuffer bytebuffer = aj.c(256).order(ByteOrder.BIG_ENDIAN);
        bytebuffer.putInt(i);
        bytebuffer.putInt(j);
        bytebuffer.flip();
        a.a(e.a(bytebuffer));
        this;
        JVM INSTR monitorexit ;
    }

    public void a(boolean flag, int i, aj aj1)
    {
        this;
        JVM INSTR monitorenter ;
        if (d)
        {
            throw new IOException("closed");
        }
        break MISSING_BLOCK_LABEL_24;
        aj1;
        this;
        JVM INSTR monitorexit ;
        throw aj1;
        byte byte0;
        byte0 = 0;
        if (flag)
        {
            byte0 = (byte)1;
        }
        a(i, byte0, aj1);
        this;
        JVM INSTR monitorexit ;
    }

    void a(boolean flag, int i, List list)
    {
        if (d)
        {
            throw new IOException("closed");
        }
        list = c.a(list);
        long l = list.d();
        int j = (int)Math.min(16383L, l);
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
        a(i, j, (byte)1, byte1);
        list.a(e, j);
        a.a(e);
        if (l > (long)j)
        {
            a(((aj) (list)), i);
        }
    }

    public void a(boolean flag, boolean flag1, int i, int j, List list)
    {
        this;
        JVM INSTR monitorenter ;
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_21;
        }
        throw new UnsupportedOperationException();
        list;
        this;
        JVM INSTR monitorexit ;
        throw list;
        if (d)
        {
            throw new IOException("closed");
        }
        a(flag, i, list);
        this;
        JVM INSTR monitorexit ;
    }

    public void b()
    {
        this;
        JVM INSTR monitorenter ;
        if (d)
        {
            throw new IOException("closed");
        }
        break MISSING_BLOCK_LABEL_24;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        a(0, 0, (byte)4, (byte)1);
        this;
        JVM INSTR monitorexit ;
    }

    public void close()
    {
        this;
        JVM INSTR monitorenter ;
        d = true;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }
}
