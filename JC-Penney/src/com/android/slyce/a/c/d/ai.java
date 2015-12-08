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
import java.util.zip.Deflater;

// Referenced classes of package com.android.slyce.a.c.d:
//            k, ac, l, g, 
//            h, ab

final class ai
    implements k
{

    aj a;
    aj b;
    private final ah c;
    private final boolean d;
    private boolean e;
    private aj f;
    private final Deflater g = new Deflater();

    ai(ah ah1, boolean flag)
    {
        f = new aj();
        a = new aj();
        b = new aj();
        c = ah1;
        d = flag;
        g.setDictionary(ac.a);
    }

    private aj a(List list)
    {
        if (b.e())
        {
            throw new IllegalStateException();
        }
        ByteBuffer bytebuffer = aj.c(8192).order(ByteOrder.BIG_ENDIAN);
        bytebuffer.putInt(list.size());
        int j = list.size();
        for (int i = 0; i < j; i++)
        {
            g g1 = ((l)list.get(i)).h;
            bytebuffer.putInt(g1.d());
            bytebuffer.put(g1.e());
            g1 = ((l)list.get(i)).i;
            bytebuffer.putInt(g1.d());
            bytebuffer.put(g1.e());
            if (bytebuffer.remaining() < bytebuffer.capacity() / 2)
            {
                ByteBuffer bytebuffer1 = aj.c(bytebuffer.capacity() * 2).order(ByteOrder.BIG_ENDIAN);
                bytebuffer.flip();
                bytebuffer1.put(bytebuffer);
                aj.c(bytebuffer);
                bytebuffer = bytebuffer1;
            }
        }

        bytebuffer.flip();
        g.setInput(bytebuffer.array(), 0, bytebuffer.remaining());
        for (; !g.needsInput(); b.a(list))
        {
            list = aj.c(bytebuffer.capacity()).order(ByteOrder.BIG_ENDIAN);
            list.limit(g.deflate(list.array(), 0, list.capacity(), 2));
        }

        aj.c(bytebuffer);
        return b;
    }

    public void a()
    {
        this;
        JVM INSTR monitorenter ;
    }

    void a(int i, int j, aj aj1)
    {
        if (e)
        {
            throw new IOException("closed");
        }
        int i1 = aj1.d();
        if ((long)i1 > 0xffffffL)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("FRAME_TOO_LARGE max size is 16Mib: ").append(i1).toString());
        } else
        {
            ByteBuffer bytebuffer = aj.c(256).order(ByteOrder.BIG_ENDIAN);
            bytebuffer.putInt(0x7fffffff & i);
            bytebuffer.putInt(i1 & 0xffffff | (j & 0xff) << 24);
            bytebuffer.flip();
            a.a(bytebuffer).b(aj1);
            c.a(a);
            return;
        }
    }

    public void a(int i, int j, List list)
    {
    }

    public void a(int i, long l1)
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
        if (l1 != 0L && l1 <= 0x7fffffffL)
        {
            break MISSING_BLOCK_LABEL_67;
        }
        throw new IllegalArgumentException((new StringBuilder()).append("windowSizeIncrement must be between 1 and 0x7fffffff: ").append(l1).toString());
        ByteBuffer bytebuffer = aj.c(256).order(ByteOrder.BIG_ENDIAN);
        bytebuffer.putInt(0x80030009);
        bytebuffer.putInt(8);
        bytebuffer.putInt(i);
        bytebuffer.putInt((int)l1);
        bytebuffer.flip();
        c.a(f.a(new ByteBuffer[] {
            bytebuffer
        }));
        this;
        JVM INSTR monitorexit ;
    }

    public void a(int i, h h1)
    {
        this;
        JVM INSTR monitorenter ;
        if (e)
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
        ByteBuffer bytebuffer = aj.c(256).order(ByteOrder.BIG_ENDIAN);
        bytebuffer.putInt(0x80030003);
        bytebuffer.putInt(8);
        bytebuffer.putInt(0x7fffffff & i);
        bytebuffer.putInt(h1.s);
        bytebuffer.flip();
        c.a(f.a(new ByteBuffer[] {
            bytebuffer
        }));
        this;
        JVM INSTR monitorexit ;
    }

    public void a(ab ab1)
    {
        int i = 0;
        this;
        JVM INSTR monitorenter ;
        if (e)
        {
            throw new IOException("closed");
        }
        break MISSING_BLOCK_LABEL_26;
        ab1;
        this;
        JVM INSTR monitorexit ;
        throw ab1;
        ByteBuffer bytebuffer;
        int j = ab1.b();
        bytebuffer = aj.c(256).order(ByteOrder.BIG_ENDIAN);
        bytebuffer.putInt(0x80030004);
        bytebuffer.putInt(j * 8 + 4 & 0xffffff | 0);
        bytebuffer.putInt(j);
_L2:
        if (i > 10)
        {
            break MISSING_BLOCK_LABEL_128;
        }
        if (!ab1.a(i))
        {
            break MISSING_BLOCK_LABEL_158;
        }
        bytebuffer.putInt((ab1.c(i) & 0xff) << 24 | i & 0xffffff);
        bytebuffer.putInt(ab1.b(i));
        break MISSING_BLOCK_LABEL_158;
        bytebuffer.flip();
        c.a(f.a(new ByteBuffer[] {
            bytebuffer
        }));
        this;
        JVM INSTR monitorexit ;
        return;
        i++;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public void a(boolean flag, int i, int j)
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
        ByteBuffer bytebuffer;
        boolean flag1;
        if ((i & 1) == 1)
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
        bytebuffer = aj.c(256).order(ByteOrder.BIG_ENDIAN);
        bytebuffer.putInt(0x80030006);
        bytebuffer.putInt(4);
        bytebuffer.putInt(i);
        bytebuffer.flip();
        c.a(f.a(new ByteBuffer[] {
            bytebuffer
        }));
        this;
        JVM INSTR monitorexit ;
        return;
_L1:
        if (true) goto _L3; else goto _L2
_L2:
    }

    public void a(boolean flag, int i, aj aj1)
    {
        this;
        JVM INSTR monitorenter ;
        int j;
        if (flag)
        {
            j = 1;
        } else
        {
            j = 0;
        }
        a(i, j, aj1);
        this;
        JVM INSTR monitorexit ;
        return;
        aj1;
        throw aj1;
    }

    public void a(boolean flag, boolean flag1, int i, int j, List list)
    {
        this;
        JVM INSTR monitorenter ;
        if (e)
        {
            throw new IOException("closed");
        }
        break MISSING_BLOCK_LABEL_26;
        list;
        this;
        JVM INSTR monitorexit ;
        throw list;
        int i1;
        list = a(list);
        i1 = list.d();
        break MISSING_BLOCK_LABEL_41;
_L2:
        ByteBuffer bytebuffer = aj.c(256).order(ByteOrder.BIG_ENDIAN);
        bytebuffer.putInt(0x80030001);
        bytebuffer.putInt(((byte0 | flag2) & 0xff) << 24 | i1 + 10 & 0xffffff);
        bytebuffer.putInt(i & 0x7fffffff);
        bytebuffer.putInt(j & 0x7fffffff);
        bytebuffer.putShort((short)0);
        bytebuffer.flip();
        c.a(f.a(bytebuffer).b(list));
        this;
        JVM INSTR monitorexit ;
        return;
        boolean flag2;
        byte byte0;
        if (flag)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        while (!flag1) 
        {
            byte0 = 0;
            continue; /* Loop/switch isn't completed */
        }
        byte0 = 2;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public void b()
    {
    }

    public void close()
    {
        this;
        JVM INSTR monitorenter ;
        e = true;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }
}
