// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.nio.ShortBuffer;

final class osg
{

    int a;
    osi b;
    private ShortBuffer c;
    private long d;

    osg()
    {
        c = ShortBuffer.allocate(4096);
        d = 0L;
    }

    private ShortBuffer a(int i)
    {
        this;
        JVM INSTR monitorenter ;
        ShortBuffer shortbuffer = c;
        if (c.capacity() >= i) goto _L2; else goto _L1
_L1:
        int j = c.capacity() << 1;
          goto _L3
_L5:
        i = c.capacity();
        orw.d((new StringBuilder(51)).append("Buffer grown from ").append(i).append(" to ").append(j).append(" shorts").toString());
        shortbuffer = ShortBuffer.allocate(j);
        c.flip();
        shortbuffer.put(c);
_L2:
        this;
        JVM INSTR monitorexit ;
        return shortbuffer;
        Exception exception;
        exception;
        throw exception;
_L3:
        while (j < i) 
        {
            j <<= 1;
        }
        if (true) goto _L5; else goto _L4
_L4:
    }

    private void c()
    {
        this;
        JVM INSTR monitorenter ;
        int i = d();
        if (i <= 0)
        {
            break MISSING_BLOCK_LABEL_67;
        }
        c.limit(c.position());
        c.position(i);
        c.compact();
        d = d - (long)((i / b.a) * a);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    private int d()
    {
        this;
        JVM INSTR monitorenter ;
        int i;
        int j;
        i = (int)d / a;
        j = b.a;
        this;
        JVM INSTR monitorexit ;
        return i * j;
        Exception exception;
        exception;
        throw exception;
    }

    public final float a()
    {
        this;
        JVM INSTR monitorenter ;
        long l = d;
        if (l >= 0L) goto _L2; else goto _L1
_L1:
        float f = 0.0F;
_L4:
        this;
        JVM INSTR monitorexit ;
        return f;
_L2:
        int i;
        i = d();
        if (b.a())
        {
            short word0 = c.get(i);
            f = (float)(c.get(i + 1) + word0) * 0.5F;
            continue; /* Loop/switch isn't completed */
        }
        i = c.get(i);
        f = i;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public final float a(osh osh1)
    {
        this;
        JVM INSTR monitorenter ;
        long l = d;
        if (l >= 0L) goto _L2; else goto _L1
_L1:
        float f = 0.0F;
_L4:
        this;
        JVM INSTR monitorexit ;
        return f;
_L2:
        int j = d();
        int i = j;
        if (b.a())
        {
            i = j + osh1.c;
        }
        i = c.get(i);
        f = i;
        if (true) goto _L4; else goto _L3
_L3:
        osh1;
        throw osh1;
    }

    public final void a(long l)
    {
        this;
        JVM INSTR monitorenter ;
        d = d + l;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final void a(ShortBuffer shortbuffer)
    {
        boolean flag1 = true;
        this;
        JVM INSTR monitorenter ;
        int i;
        boolean flag;
        if (a > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.b(flag, "Invalid ticksPerSample (%s)", new Object[] {
            Integer.valueOf(a)
        });
        p.a(b);
        if (shortbuffer.remaining() % b.a == 0)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        p.a(flag, "samplesBuffer does not have an even number remaining (%s)", new Object[] {
            Integer.valueOf(shortbuffer.remaining())
        });
        i = (int)d / a - c.position() / b.a;
        if (i <= 0)
        {
            break MISSING_BLOCK_LABEL_163;
        }
        i = Math.min(i, shortbuffer.remaining() / b.a);
        shortbuffer.position(shortbuffer.position() + b.a * i);
        d = d - (long)(i * a);
        if (c.remaining() < shortbuffer.remaining())
        {
            c();
            c = a(c.position() + shortbuffer.remaining());
        }
        c.put(shortbuffer);
        this;
        JVM INSTR monitorexit ;
        return;
        shortbuffer;
        throw shortbuffer;
    }

    public final long b()
    {
        long l1 = 0L;
        this;
        JVM INSTR monitorenter ;
        long l = l1;
        if (a <= 0)
        {
            break MISSING_BLOCK_LABEL_48;
        }
        l = l1;
        if (b != null)
        {
            l = (long)(c.position() / b.a) * (long)a;
        }
        l = Math.max(0L, l - d);
        this;
        JVM INSTR monitorexit ;
        return l;
        Exception exception;
        exception;
        throw exception;
    }
}
