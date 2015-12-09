// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.a;

import android.os.Looper;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Iterator;
import java.util.PriorityQueue;

// Referenced classes of package com.android.slyce.a:
//            ak, a

public class aj
{

    static PriorityQueue c = new PriorityQueue(8, new ak());
    public static int d = 0x40000;
    static int e = 0;
    static int f = 0;
    public static final ByteBuffer g = ByteBuffer.allocate(0);
    static final boolean h;
    private static int j = 0x100000;
    private static final Object k = new Object();
    a a;
    ByteOrder b;
    private int i;

    public aj()
    {
        a = new a();
        b = ByteOrder.BIG_ENDIAN;
        i = 0;
    }

    public aj(byte abyte0[])
    {
        a = new a();
        b = ByteOrder.BIG_ENDIAN;
        i = 0;
        a(ByteBuffer.wrap(abyte0));
    }

    public transient aj(ByteBuffer abytebuffer[])
    {
        a = new a();
        b = ByteOrder.BIG_ENDIAN;
        i = 0;
        a(abytebuffer);
    }

    public static ByteBuffer c(int i1)
    {
        if (i1 > f) goto _L2; else goto _L1
_L1:
        PriorityQueue priorityqueue = p();
        if (priorityqueue == null) goto _L2; else goto _L3
_L3:
        Object obj = k;
        obj;
        JVM INSTR monitorenter ;
_L5:
        ByteBuffer bytebuffer;
        if (priorityqueue.size() <= 0)
        {
            break MISSING_BLOCK_LABEL_128;
        }
        bytebuffer = (ByteBuffer)priorityqueue.remove();
        if (priorityqueue.size() == 0)
        {
            f = 0;
        }
        e -= bytebuffer.capacity();
        if (h)
        {
            continue; /* Loop/switch isn't completed */
        }
        Exception exception;
        boolean flag;
        boolean flag1;
        if (priorityqueue.size() != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (e == 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (flag1 ^ flag)
        {
            continue; /* Loop/switch isn't completed */
        }
        throw new AssertionError();
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        if (bytebuffer.capacity() < i1) goto _L5; else goto _L4
_L4:
        obj;
        JVM INSTR monitorexit ;
        return bytebuffer;
        obj;
        JVM INSTR monitorexit ;
_L2:
        return ByteBuffer.allocate(Math.max(8192, i1));
    }

    public static void c(ByteBuffer bytebuffer)
    {
_L2:
        return;
        if (bytebuffer == null || bytebuffer.isDirect() || bytebuffer.arrayOffset() != 0 || bytebuffer.array().length != bytebuffer.capacity() || bytebuffer.capacity() < 8192 || bytebuffer.capacity() > d) goto _L2; else goto _L1
_L1:
        PriorityQueue priorityqueue = p();
        if (priorityqueue == null) goto _L2; else goto _L3
_L3:
        Object obj = k;
        obj;
        JVM INSTR monitorenter ;
        ByteBuffer bytebuffer1;
        for (; e > j && priorityqueue.size() > 0 && ((ByteBuffer)priorityqueue.peek()).capacity() < bytebuffer.capacity(); e -= bytebuffer1.capacity())
        {
            bytebuffer1 = (ByteBuffer)priorityqueue.remove();
        }

        break MISSING_BLOCK_LABEL_125;
        bytebuffer;
        obj;
        JVM INSTR monitorexit ;
        throw bytebuffer;
        if (e <= j)
        {
            break MISSING_BLOCK_LABEL_137;
        }
        obj;
        JVM INSTR monitorexit ;
        return;
        if (!h && d(bytebuffer))
        {
            throw new AssertionError();
        }
        bytebuffer.position(0);
        bytebuffer.limit(bytebuffer.capacity());
        e += bytebuffer.capacity();
        priorityqueue.add(bytebuffer);
        if (h)
        {
            break MISSING_BLOCK_LABEL_231;
        }
        boolean flag;
        boolean flag1;
        if (priorityqueue.size() != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (e == 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (flag1 ^ flag)
        {
            break MISSING_BLOCK_LABEL_231;
        }
        throw new AssertionError();
        f = Math.max(f, bytebuffer.capacity());
        obj;
        JVM INSTR monitorexit ;
    }

    private ByteBuffer d(int i1)
    {
        if (d() < i1)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("count : ").append(d()).append("/").append(i1).toString());
        }
        ByteBuffer bytebuffer;
        for (bytebuffer = (ByteBuffer)a.peek(); bytebuffer != null && !bytebuffer.hasRemaining(); bytebuffer = (ByteBuffer)a.peek())
        {
            c((ByteBuffer)a.remove());
        }

        if (bytebuffer == null)
        {
            return g;
        }
        if (bytebuffer.remaining() >= i1)
        {
            return bytebuffer.order(b);
        }
        ByteBuffer bytebuffer2 = c(i1);
        bytebuffer2.limit(i1);
        byte abyte0[] = bytebuffer2.array();
        int j1 = 0;
        bytebuffer = null;
        do
        {
            if (j1 >= i1)
            {
                break;
            }
            ByteBuffer bytebuffer1 = (ByteBuffer)a.remove();
            int k1 = Math.min(i1 - j1, bytebuffer1.remaining());
            bytebuffer1.get(abyte0, j1, k1);
            k1 = j1 + k1;
            bytebuffer = bytebuffer1;
            j1 = k1;
            if (bytebuffer1.remaining() == 0)
            {
                c(bytebuffer1);
                bytebuffer = null;
                j1 = k1;
            }
        } while (true);
        if (bytebuffer != null && bytebuffer.remaining() > 0)
        {
            a.a(bytebuffer);
        }
        a.a(bytebuffer2);
        return bytebuffer2.order(b);
    }

    private static boolean d(ByteBuffer bytebuffer)
    {
        for (Iterator iterator = c.iterator(); iterator.hasNext();)
        {
            if ((ByteBuffer)iterator.next() == bytebuffer)
            {
                return true;
            }
        }

        return false;
    }

    private void e(int i1)
    {
        if (d() >= 0)
        {
            i = i + i1;
        }
    }

    private static PriorityQueue p()
    {
        if (Thread.currentThread() == Looper.getMainLooper().getThread())
        {
            return null;
        } else
        {
            return c;
        }
    }

    public aj a(ByteBuffer bytebuffer)
    {
        if (bytebuffer.remaining() <= 0)
        {
            c(bytebuffer);
            return this;
        }
        e(bytebuffer.remaining());
        if (a.size() > 0)
        {
            ByteBuffer bytebuffer1 = (ByteBuffer)a.d();
            if (bytebuffer1.capacity() - bytebuffer1.limit() >= bytebuffer.remaining())
            {
                bytebuffer1.mark();
                bytebuffer1.position(bytebuffer1.limit());
                bytebuffer1.limit(bytebuffer1.capacity());
                bytebuffer1.put(bytebuffer);
                bytebuffer1.limit(bytebuffer1.position());
                bytebuffer1.reset();
                c(bytebuffer);
                l();
                return this;
            }
        }
        a.add(bytebuffer);
        l();
        return this;
    }

    public aj a(ByteOrder byteorder)
    {
        b = byteorder;
        return this;
    }

    public transient aj a(ByteBuffer abytebuffer[])
    {
        int j1 = abytebuffer.length;
        for (int i1 = 0; i1 < j1; i1++)
        {
            a(abytebuffer[i1]);
        }

        return this;
    }

    public void a(aj aj1)
    {
        a(aj1, d());
    }

    public void a(aj aj1, int i1)
    {
        if (d() < i1)
        {
            throw new IllegalArgumentException("length");
        }
        int j1 = 0;
        do
        {
            if (j1 >= i1)
            {
                break;
            }
            ByteBuffer bytebuffer = (ByteBuffer)a.remove();
            int k1 = bytebuffer.remaining();
            if (k1 == 0)
            {
                c(bytebuffer);
                continue;
            }
            if (j1 + k1 > i1)
            {
                j1 = i1 - j1;
                ByteBuffer bytebuffer1 = c(j1);
                bytebuffer1.limit(j1);
                bytebuffer.get(bytebuffer1.array(), 0, j1);
                aj1.a(bytebuffer1);
                a.a(bytebuffer);
                if (!h && bytebuffer1.capacity() < j1)
                {
                    throw new AssertionError();
                }
                if (!h && bytebuffer1.position() != 0)
                {
                    throw new AssertionError();
                }
                break;
            }
            aj1.a(bytebuffer);
            j1 += k1;
        } while (true);
        i = i - i1;
    }

    public void a(byte abyte0[])
    {
        a(abyte0, 0, abyte0.length);
    }

    public void a(byte abyte0[], int i1, int j1)
    {
        if (d() < j1)
        {
            throw new IllegalArgumentException("length");
        }
        int l1 = j1;
        int k1 = i1;
        for (i1 = l1; i1 > 0; i1 -= l1)
        {
            ByteBuffer bytebuffer = (ByteBuffer)a.peek();
            l1 = Math.min(bytebuffer.remaining(), i1);
            if (abyte0 != null)
            {
                bytebuffer.get(abyte0, k1, l1);
            }
            k1 += l1;
            if (bytebuffer.remaining() != 0)
            {
                continue;
            }
            ByteBuffer bytebuffer1 = (ByteBuffer)a.remove();
            if (!h && bytebuffer != bytebuffer1)
            {
                throw new AssertionError();
            }
            c(bytebuffer);
        }

        i = i - j1;
    }

    public byte[] a()
    {
        if (a.size() == 1)
        {
            ByteBuffer bytebuffer = (ByteBuffer)a.peek();
            if (bytebuffer.capacity() == d() && bytebuffer.isDirect())
            {
                i = 0;
                return ((ByteBuffer)a.remove()).array();
            }
        }
        byte abyte0[] = new byte[d()];
        a(abyte0);
        return abyte0;
    }

    public byte[] a(int i1)
    {
        byte abyte0[] = new byte[i1];
        a(abyte0);
        return abyte0;
    }

    public aj b(int i1)
    {
        a(null, 0, i1);
        return this;
    }

    public aj b(aj aj1)
    {
        aj1.a(this);
        return this;
    }

    public void b(ByteBuffer bytebuffer)
    {
        if (bytebuffer.remaining() <= 0)
        {
            c(bytebuffer);
            return;
        }
        e(bytebuffer.remaining());
        if (a.size() > 0)
        {
            ByteBuffer bytebuffer1 = (ByteBuffer)a.c();
            if (bytebuffer1.position() >= bytebuffer.remaining())
            {
                bytebuffer1.position(bytebuffer1.position() - bytebuffer.remaining());
                bytebuffer1.mark();
                bytebuffer1.put(bytebuffer);
                bytebuffer1.reset();
                c(bytebuffer);
                return;
            }
        }
        a.a(bytebuffer);
    }

    public ByteBuffer[] b()
    {
        ByteBuffer abytebuffer[] = new ByteBuffer[a.size()];
        abytebuffer = (ByteBuffer[])a.toArray(abytebuffer);
        a.clear();
        i = 0;
        return abytebuffer;
    }

    public boolean c()
    {
        return i == 0;
    }

    public int d()
    {
        return i;
    }

    public boolean e()
    {
        return d() > 0;
    }

    public int f()
    {
        int i1 = d(4).getInt();
        i = i - 4;
        return i1;
    }

    public char g()
    {
        char c1 = (char)d(1).get();
        i = i - 1;
        return c1;
    }

    public short h()
    {
        short word0 = d(2).getShort();
        i = i - 2;
        return word0;
    }

    public byte i()
    {
        byte byte0 = d(1).get();
        i = i - 1;
        return byte0;
    }

    public long j()
    {
        long l1 = d(8).getLong();
        i = i - 8;
        return l1;
    }

    public ByteBuffer k()
    {
        if (d() == 0)
        {
            return g;
        } else
        {
            d(d());
            return n();
        }
    }

    public void l()
    {
        d(0);
    }

    public void m()
    {
        for (; a.size() > 0; c((ByteBuffer)a.remove())) { }
        if (!h && a.size() != 0)
        {
            throw new AssertionError();
        } else
        {
            i = 0;
            return;
        }
    }

    public ByteBuffer n()
    {
        ByteBuffer bytebuffer = (ByteBuffer)a.remove();
        i = i - bytebuffer.remaining();
        return bytebuffer;
    }

    public int o()
    {
        return a.size();
    }

    static 
    {
        boolean flag;
        if (!com/android/slyce/a/aj.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        h = flag;
    }
}
