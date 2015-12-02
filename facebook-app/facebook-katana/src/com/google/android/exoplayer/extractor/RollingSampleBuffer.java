// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.extractor;

import com.google.android.exoplayer.CryptoInfo;
import com.google.android.exoplayer.SampleHolder;
import com.google.android.exoplayer.upstream.Allocation;
import com.google.android.exoplayer.upstream.Allocator;
import com.google.android.exoplayer.upstream.DataSource;
import com.google.android.exoplayer.util.ParsableByteArray;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.util.concurrent.LinkedBlockingDeque;

// Referenced classes of package com.google.android.exoplayer.extractor:
//            ExtractorInput

final class RollingSampleBuffer
{

    private final Allocator a;
    private final int b;
    private final InfoQueue c = new InfoQueue();
    private final LinkedBlockingDeque d = new LinkedBlockingDeque();
    private final SampleExtrasHolder e = new SampleExtrasHolder((byte)0);
    private final ParsableByteArray f = new ParsableByteArray(32);
    private long g;
    private long h;
    private Allocation i;
    private int j;

    public RollingSampleBuffer(Allocator allocator)
    {
        a = allocator;
        b = allocator.c();
        j = b;
    }

    private void a(long l, ByteBuffer bytebuffer, int k)
    {
        int j1;
        for (; k > 0; k -= j1)
        {
            c(l);
            int i1 = (int)(l - g);
            j1 = Math.min(k, b - i1);
            Allocation allocation = (Allocation)d.peek();
            bytebuffer.put(allocation.a, allocation.a(i1), j1);
            l += j1;
        }

    }

    private void a(long l, byte abyte0[], int k)
    {
        int k1;
        for (int i1 = 0; i1 < k; i1 += k1)
        {
            c(l);
            int j1 = (int)(l - g);
            k1 = Math.min(k - i1, b - j1);
            Allocation allocation = (Allocation)d.peek();
            System.arraycopy(allocation.a, allocation.a(j1), abyte0, i1, k1);
            l += k1;
        }

    }

    private void a(SampleHolder sampleholder, SampleExtrasHolder sampleextrasholder)
    {
        int ai[];
        int ai1[];
        int i1;
        long l1;
label0:
        {
            boolean flag = false;
            l1 = sampleextrasholder.a;
            a(l1, f.a, 1);
            l1 = 1L + l1;
            i1 = f.a[0];
            int ai2[];
            int k;
            long l2;
            if ((i1 & 0x80) != 0)
            {
                k = 1;
            } else
            {
                k = 0;
            }
            i1 &= 0x7f;
            if (sampleholder.a.a == null)
            {
                sampleholder.a.a = new byte[16];
            }
            a(l1, sampleholder.a.a, i1);
            l1 += i1;
            if (k != 0)
            {
                a(l1, f.a, 2);
                f.b(0);
                i1 = f.g();
                l1 += 2L;
            } else
            {
                i1 = 1;
            }
            ai1 = sampleholder.a.d;
            if (ai1 != null)
            {
                ai = ai1;
                if (ai1.length >= i1)
                {
                    break label0;
                }
            }
            ai = new int[i1];
        }
label1:
        {
            ai2 = sampleholder.a.e;
            if (ai2 != null)
            {
                ai1 = ai2;
                if (ai2.length >= i1)
                {
                    break label1;
                }
            }
            ai1 = new int[i1];
        }
        if (k != 0)
        {
            k = i1 * 6;
            b(f, k);
            a(l1, f.a, k);
            l2 = l1 + (long)k;
            f.b(0);
            k = ((flag) ? 1 : 0);
            do
            {
                l1 = l2;
                if (k >= i1)
                {
                    break;
                }
                ai[k] = f.g();
                ai1[k] = f.m();
                k++;
            } while (true);
        } else
        {
            ai[0] = 0;
            ai1[0] = sampleholder.c - (int)(l1 - sampleextrasholder.a);
        }
        sampleholder.a.a(i1, ai, ai1, sampleextrasholder.b, sampleholder.a.a, 1);
        int l = (int)(l1 - sampleextrasholder.a);
        sampleextrasholder.a = sampleextrasholder.a + (long)l;
        sampleholder.c = sampleholder.c - l;
    }

    private int b(int k)
    {
        if (j == b)
        {
            j = 0;
            i = a.a();
            d.add(i);
        }
        return Math.min(k, b - j);
    }

    private void b(long l)
    {
        int i1 = (int)(l - g);
        int k = i1 / b;
        int k1 = i1 % b;
        k = d.size() - k - 1;
        if (k1 == 0)
        {
            k++;
        }
        for (int j1 = 0; j1 < k; j1++)
        {
            a.a((Allocation)d.removeLast());
        }

        i = (Allocation)d.peekLast();
        if (k1 == 0)
        {
            k = b;
        } else
        {
            k = k1;
        }
        j = k;
    }

    private static void b(ParsableByteArray parsablebytearray, int k)
    {
        if (parsablebytearray.c() < k)
        {
            parsablebytearray.a(new byte[k], k);
        }
    }

    private void c(long l)
    {
        int i1 = (int)(l - g) / b;
        for (int k = 0; k < i1; k++)
        {
            a.a((Allocation)d.remove());
            g = g + (long)b;
        }

    }

    public final int a(ExtractorInput extractorinput, int k, boolean flag)
    {
        k = b(k);
        k = extractorinput.a(i.a, i.a(j), k);
        if (k == -1)
        {
            if (flag)
            {
                return -1;
            } else
            {
                throw new EOFException();
            }
        } else
        {
            j = j + k;
            h = h + (long)k;
            return k;
        }
    }

    public final int a(DataSource datasource, int k, boolean flag)
    {
        k = b(k);
        k = datasource.a(i.a, i.a(j), k);
        if (k == -1)
        {
            if (flag)
            {
                return -1;
            } else
            {
                throw new EOFException();
            }
        } else
        {
            j = j + k;
            h = h + (long)k;
            return k;
        }
    }

    public final void a()
    {
        c.a();
        for (; !d.isEmpty(); a.a((Allocation)d.remove())) { }
        g = 0L;
        h = 0L;
        i = null;
        j = b;
    }

    public final void a(int k)
    {
        h = c.a(k);
        b(h);
    }

    public final void a(long l, int k, long l1, int i1, byte abyte0[])
    {
        c.a(l, k, l1, i1, abyte0);
    }

    public final void a(ParsableByteArray parsablebytearray, int k)
    {
        int l;
        for (; k > 0; k -= l)
        {
            l = b(k);
            parsablebytearray.a(i.a, i.a(j), l);
            j = j + l;
            h = h + (long)l;
        }

    }

    public final boolean a(long l)
    {
        l = c.a(l);
        if (l == -1L)
        {
            return false;
        } else
        {
            c(l);
            return true;
        }
    }

    public final boolean a(SampleHolder sampleholder)
    {
        return c.a(sampleholder, e);
    }

    public final int b()
    {
        return c.b();
    }

    public final boolean b(SampleHolder sampleholder)
    {
        if (!c.a(sampleholder, e))
        {
            return false;
        }
        if (sampleholder.a())
        {
            a(sampleholder, e);
        }
        if (sampleholder.b == null || sampleholder.b.capacity() < sampleholder.c)
        {
            sampleholder.a(sampleholder.c);
        }
        if (sampleholder.b != null)
        {
            a(e.a, sampleholder.b, sampleholder.c);
        }
        c(c.d());
        return true;
    }

    public final int c()
    {
        return c.c();
    }

    public final void d()
    {
        c(c.d());
    }

    public final long e()
    {
        return h;
    }

    private class InfoQueue
    {

        private int a;
        private long b[];
        private int c[];
        private int d[];
        private long e[];
        private byte f[][];
        private int g;
        private int h;
        private int i;
        private int j;

        public final long a(int k)
        {
            k = b() - k;
            boolean flag;
            if (k >= 0 && k <= g)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Assertions.a(flag);
            if (k == 0)
            {
                if (h == 0)
                {
                    return 0L;
                }
                long l;
                if (j == 0)
                {
                    k = a;
                } else
                {
                    k = j;
                }
                k--;
                l = b[k];
                return (long)c[k] + l;
            } else
            {
                g = g - k;
                j = ((j + a) - k) % a;
                return b[j];
            }
        }

        public final long a(long l)
        {
            long l2 = -1L;
            this;
            JVM INSTR monitorenter ;
            long l1 = l2;
            if (g == 0) goto _L2; else goto _L1
_L1:
            l1 = e[i];
            if (l >= l1) goto _L4; else goto _L3
_L3:
            l1 = l2;
_L2:
            this;
            JVM INSTR monitorexit ;
            return l1;
_L4:
            if (j != 0) goto _L6; else goto _L5
_L5:
            int k = a;
_L10:
            l1 = l2;
            if (l > e[k - 1])
            {
                continue; /* Loop/switch isn't completed */
            }
            k = 0;
            int i1 = i;
            int j1 = -1;
_L8:
            if (i1 == j || e[i1] > l)
            {
                break; /* Loop/switch isn't completed */
            }
            if ((d[i1] & 1) != 0)
            {
                j1 = k;
            }
            i1 = (i1 + 1) % a;
            k++;
            if (true) goto _L8; else goto _L7
_L7:
            break; /* Loop/switch isn't completed */
_L6:
            k = j;
            if (true) goto _L10; else goto _L9
_L9:
            l1 = l2;
            if (j1 == -1)
            {
                continue; /* Loop/switch isn't completed */
            }
            g = g - j1;
            i = (i + j1) % a;
            h = h + j1;
            l1 = b[i];
            if (true) goto _L2; else goto _L11
_L11:
            Exception exception;
            exception;
            throw exception;
        }

        public final void a()
        {
            h = 0;
            i = 0;
            j = 0;
            g = 0;
        }

        public final void a(long l, int k, long l1, int i1, byte abyte0[])
        {
            this;
            JVM INSTR monitorenter ;
            e[j] = l;
            b[j] = l1;
            c[j] = i1;
            d[j] = k;
            f[j] = abyte0;
            g = g + 1;
            if (g != a) goto _L2; else goto _L1
_L1:
            k = a + 1000;
            abyte0 = new long[k];
            long al[] = new long[k];
            int ai[] = new int[k];
            int ai1[] = new int[k];
            byte abyte1[][] = new byte[k][];
            i1 = a - i;
            System.arraycopy(b, i, abyte0, 0, i1);
            System.arraycopy(e, i, al, 0, i1);
            System.arraycopy(d, i, ai, 0, i1);
            System.arraycopy(c, i, ai1, 0, i1);
            System.arraycopy(f, i, abyte1, 0, i1);
            int j1 = i;
            System.arraycopy(b, 0, abyte0, i1, j1);
            System.arraycopy(e, 0, al, i1, j1);
            System.arraycopy(d, 0, ai, i1, j1);
            System.arraycopy(c, 0, ai1, i1, j1);
            System.arraycopy(f, 0, abyte1, i1, j1);
            b = abyte0;
            e = al;
            d = ai;
            c = ai1;
            f = abyte1;
            i = 0;
            j = a;
            g = a;
            a = k;
_L4:
            this;
            JVM INSTR monitorexit ;
            return;
_L2:
            j = j + 1;
            if (j == a)
            {
                j = 0;
            }
            if (true) goto _L4; else goto _L3
_L3:
            abyte0;
            throw abyte0;
        }

        public final boolean a(SampleHolder sampleholder, SampleExtrasHolder sampleextrasholder)
        {
            this;
            JVM INSTR monitorenter ;
            int k = g;
            if (k != 0) goto _L2; else goto _L1
_L1:
            boolean flag = false;
_L4:
            this;
            JVM INSTR monitorexit ;
            return flag;
_L2:
            sampleholder.e = e[i];
            sampleholder.c = c[i];
            sampleholder.d = d[i];
            sampleextrasholder.a = b[i];
            sampleextrasholder.b = f[i];
            flag = true;
            if (true) goto _L4; else goto _L3
_L3:
            sampleholder;
            throw sampleholder;
        }

        public final int b()
        {
            return h + g;
        }

        public final int c()
        {
            return h;
        }

        public final long d()
        {
            this;
            JVM INSTR monitorenter ;
            int k;
            g = g - 1;
            k = i;
            i = k + 1;
            h = h + 1;
            if (i == a)
            {
                i = 0;
            }
            if (g <= 0) goto _L2; else goto _L1
_L1:
            long l = b[i];
_L4:
            this;
            JVM INSTR monitorexit ;
            return l;
_L2:
            long l1;
            l = c[k];
            l1 = b[k];
            l = l1 + l;
            if (true) goto _L4; else goto _L3
_L3:
            Exception exception;
            exception;
            throw exception;
        }

        public InfoQueue()
        {
            a = 1000;
            b = new long[a];
            e = new long[a];
            d = new int[a];
            c = new int[a];
            f = new byte[a][];
        }
    }


    private class SampleExtrasHolder
    {

        public long a;
        public byte b[];

        private SampleExtrasHolder()
        {
        }

        SampleExtrasHolder(byte byte0)
        {
            this();
        }
    }

}
