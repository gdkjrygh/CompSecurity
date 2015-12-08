// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.be;

import android.util.Log;
import com.google.android.m4b.maps.al.b;
import com.google.android.m4b.maps.au.a;
import com.google.android.m4b.maps.ay.ab;
import com.google.android.m4b.maps.ay.k;
import com.google.android.m4b.maps.bs.g;
import com.google.android.m4b.maps.bw.e;
import java.io.ByteArrayOutputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.zip.CRC32;

// Referenced classes of package com.google.android.m4b.maps.be:
//            e, h

public class com.google.android.m4b.maps.be.d
{
    static final class a
    {

        final byte a[];
        int b;
        private int c;

        static int[] a(long l1)
        {
            int i1 = 0;
            int ai[] = new int[3];
            l1 = Long.rotateRight(l1, 22);
            ai[0] = (int)(l1 % 8147L);
            l1 = Long.rotateRight(l1, 22);
            ai[1] = (int)(l1 % 8147L);
            ai[2] = (int)(Long.rotateRight(l1, 22) % 8147L);
            for (; i1 < 3; i1++)
            {
                if (ai[i1] < 0)
                {
                    ai[i1] = ai[i1] + 8147;
                }
            }

            return ai;
        }

        final void a(int i1)
        {
            i1 *= 1024;
            Arrays.fill(a, i1, i1 + 1020, (byte)0);
        }

        final void a(g g1)
        {
            a(g1.b);
            for (int i1 = 0; i1 < g1.c; i1++)
            {
                long l2 = g1.b(i1);
                if (l2 == -1L)
                {
                    continue;
                }
                int k1 = g1.b;
                int ai[] = a(l2);
                for (int j1 = 0; j1 < 3; j1++)
                {
                    int i2 = ai[j1];
                    int l1 = ai[j1];
                    byte abyte0[] = a;
                    i2 = (i2 >> 3) + k1 * 1024;
                    abyte0[i2] = (byte)(1 << (l1 & 7) | abyte0[i2]);
                }

            }

            if (g1.b >= b)
            {
                b = g1.b + 1;
            }
        }

        final boolean a(int ai[], int i1)
        {
            for (int j1 = 0; j1 < ai.length; j1++)
            {
                int k1 = ai[j1];
                int l1 = ai[j1];
                if ((a[(k1 >> 3) + i1 * 1024] & 1 << (l1 & 7)) == 0)
                {
                    return false;
                }
            }

            return true;
        }

        final void b(int i1)
        {
            i1 *= 1024;
            int j1 = com.google.android.m4b.maps.be.d.c(a, i1, 1020);
            com.google.android.m4b.maps.be.d.a(a, i1 + 1020, j1);
        }

        a(int i1, int j1)
        {
            a = new byte[i1 * 1024];
            c = i1;
            b = j1;
        }
    }

    static final class b
    {

        private static final int j = 43;
        final int a;
        final int b;
        final int c;
        final int d;
        final boolean e;
        final int f;
        final long g;
        final Locale h;
        final int i;
        private int k;
        private int l;

        private byte[] a()
        {
            ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
            DataOutputStream dataoutputstream = new DataOutputStream(bytearrayoutputstream);
            dataoutputstream.writeInt(a);
            dataoutputstream.writeInt(k);
            dataoutputstream.writeInt(b);
            dataoutputstream.writeInt(c);
            dataoutputstream.writeInt(d);
            dataoutputstream.writeBoolean(e);
            dataoutputstream.writeInt(f);
            dataoutputstream.writeLong(g);
            dataoutputstream.writeUTF(h.getLanguage());
            dataoutputstream.writeUTF(h.getCountry());
            dataoutputstream.writeUTF(h.getVariant());
            dataoutputstream.writeInt(l);
            return bytearrayoutputstream.toByteArray();
        }

        final int a(byte abyte0[])
        {
            byte abyte1[] = a();
            System.arraycopy(abyte1, 0, abyte0, 0, abyte1.length);
            return abyte1.length;
        }

        public final String toString()
        {
            int i1 = a;
            int j1 = b;
            int k1 = c;
            int l1 = d;
            boolean flag = e;
            int i2 = f;
            long l2 = g;
            int j2 = l;
            return (new StringBuilder(207)).append("CatalogVersion:").append(i1).append(" BlockSize:").append(j1).append(" MaxShardCount:").append(k1).append(" RecordsPerBlock: ").append(l1).append(" AutoConfig: ").append(flag).append(" DataVersion:").append(i2).append(" CacheCreationTimeMs:").append(l2).append(" Checksum:").append(j2).toString();
        }


        b(int i1, int j1, int k1, int l1, boolean flag, int i2, long l2, Locale locale)
        {
            a = i1;
            b = j1;
            c = k1;
            d = l1;
            e = flag;
            f = i2;
            h = locale;
            g = l2;
            locale = a();
            k = locale.length;
            com.google.android.m4b.maps.be.d.a(locale, 4, k);
            l = com.google.android.m4b.maps.be.d.c(locale, 0, locale.length - 4);
            i = ((c * 1024 - 1) / 8192 + 1) * 8192 + 16384;
        }

        b(byte abyte0[])
        {
            a = com.google.android.m4b.maps.be.d.a(abyte0, 0);
            if (a == 1)
            {
                throw new IOException("Can't parse header for old schema");
            }
            k = com.google.android.m4b.maps.be.d.a(abyte0, 4);
            if (k < 43 || k + 0 > 8192)
            {
                int i1 = k;
                throw new IOException((new StringBuilder(30)).append("Wrong header size: ").append(i1).toString());
            }
            l = com.google.android.m4b.maps.be.d.a(abyte0, (k + 0) - 4);
            int j1 = com.google.android.m4b.maps.be.d.c(abyte0, 0, k - 4);
            if (l != j1)
            {
                int k1 = l;
                throw new IOException((new StringBuilder(44)).append("Checksum mismatch ").append(k1).append(" vs ").append(j1).toString());
            } else
            {
                abyte0 = new com.google.android.m4b.maps.ad.a(abyte0);
                abyte0.skipBytes(8);
                b = abyte0.readInt();
                c = abyte0.readInt();
                d = abyte0.readInt();
                e = abyte0.readBoolean();
                f = abyte0.readInt();
                g = abyte0.readLong();
                h = new Locale(abyte0.readUTF(), abyte0.readUTF(), abyte0.readUTF());
                i = ((c * 1024 - 1) / 8192 + 1) * 8192 + 16384;
                return;
            }
        }
    }

    public static final class c
    {

        public final d a;
        public final byte b[];
        public final int c;
        public final byte d[];

        private c(d d1, int i1, byte abyte0[])
        {
            if (abyte0.length > 0xffffff)
            {
                throw new IllegalArgumentException("data too large");
            } else
            {
                a = d1;
                b = d1.b;
                c = i1;
                d = abyte0;
                return;
            }
        }

        c(d d1, int i1, byte abyte0[], byte byte0)
        {
            this(d1, i1, abyte0);
        }

        private c(d d1, byte abyte0[])
        {
            this(d1, 0, abyte0);
        }

        c(d d1, byte abyte0[], byte byte0)
        {
            this(d1, abyte0);
        }
    }

    static final class d
    {

        final long a;
        final byte b[];

        public final boolean equals(Object obj)
        {
            boolean flag1 = false;
            boolean flag;
            if (this == obj)
            {
                flag = true;
            } else
            {
                flag = flag1;
                if (obj != null)
                {
                    flag = flag1;
                    if (getClass() == obj.getClass())
                    {
                        obj = (d)obj;
                        flag = flag1;
                        if (a == ((d) (obj)).a)
                        {
                            return Arrays.equals(b, ((d) (obj)).b);
                        }
                    }
                }
            }
            return flag;
        }

        public final int hashCode()
        {
            return (int)(a ^ a >>> 32) * 31 + Arrays.hashCode(b);
        }

        d(long l1, byte abyte0[])
        {
            a = l1;
            if (abyte0 == null)
            {
                b = com.google.android.m4b.maps.be.d.c();
                return;
            } else
            {
                b = abyte0;
                return;
            }
        }
    }

    static final class e
    {

        private final byte a[];
        private int b;
        private final com.google.android.m4b.maps.au.a c;
        private int d;

        final void a()
        {
            if (b == 0)
            {
                return;
            }
            synchronized (c)
            {
                c.a(d);
                c.a(a, 0, b);
                c.a();
            }
            d = d + b;
            b = 0;
            return;
            exception;
            a1;
            JVM INSTR monitorexit ;
            throw exception;
        }

        final void a(byte abyte0[])
        {
            if (abyte0.length + b > a.length)
            {
                a();
            }
            if (abyte0.length > a.length)
            {
                synchronized (c)
                {
                    c.a(d);
                    c.a(abyte0);
                    c.a();
                }
                d = d + abyte0.length;
                return;
            } else
            {
                System.arraycopy(abyte0, 0, a, b, abyte0.length);
                b = b + abyte0.length;
                return;
            }
            abyte0;
            a1;
            JVM INSTR monitorexit ;
            throw abyte0;
        }

        e(com.google.android.m4b.maps.au.a a1, int i1, byte abyte0[])
        {
            a = abyte0;
            b = 0;
            c = a1;
            d = i1;
        }
    }

    static final class f
    {

        final long a;
        final int b;
        final int c;
        final int d;
        final int e;
        final int f;
        final int g;
        final int h;

        public final boolean equals(Object obj)
        {
            if (this != obj)
            {
                if (obj == null || getClass() != obj.getClass())
                {
                    return false;
                }
                obj = (f)obj;
                if (g != ((f) (obj)).g || h != ((f) (obj)).h)
                {
                    return false;
                }
            }
            return true;
        }

        public final int hashCode()
        {
            return (g << 16) + h;
        }

        public final String toString()
        {
            long l2 = a;
            int i1 = b;
            int j1 = d;
            int k1 = e;
            int l1 = f;
            int i2 = g;
            int j2 = h;
            return (new StringBuilder(140)).append("ID:").append(l2).append(" Off:").append(i1).append(" KeyLen:").append(j1).append(" DataLen:").append(k1).append(" Checksum:").append(l1).append(" Shard:").append(i2).append(" ShardIndex:").append(j2).toString();
        }

        f(long l1, int i1, int j1, int k1, int i2, int j2, 
                int k2, int l2)
        {
            a = l1;
            b = i1;
            c = i2;
            d = j1;
            e = k1;
            f = j2;
            g = k2;
            h = l2;
        }
    }

    static final class g
    {

        final byte a[];
        final int b;
        int c;
        private int d;
        private int e;

        final int a()
        {
            if (c == 0)
            {
                return 0;
            }
            if (d < 0)
            {
                f f1 = e(c - 1);
                int i1 = f1.b;
                int j1 = f1.d;
                d = f1.e + (i1 + j1);
            }
            return d;
        }

        final void a(int i1)
        {
            com.google.android.m4b.maps.be.d.a(a, i1 * 20 + 8, -1L);
        }

        final void a(f f1)
        {
            a(f1, c);
            c = c + 1;
            d = f1.b + f1.d + f1.e;
            e = -1;
        }

        final void a(f f1, int i1)
        {
            byte abyte0[] = a;
            i1 = i1 * 20 + 8;
            com.google.android.m4b.maps.be.d.a(abyte0, i1, f1.a);
            i1 += 8;
            int j1 = f1.b << 5 | f1.c;
            if (j1 >>> 5 != f1.b)
            {
                i1 = f1.b;
                throw new IllegalArgumentException((new StringBuilder(41)).append("Could not pack data offset of ").append(i1).toString());
            }
            if ((j1 & 0x1f) != f1.c)
            {
                i1 = f1.c;
                throw new IllegalArgumentException((new StringBuilder(38)).append("Could not pack refCount of ").append(i1).toString());
            } else
            {
                com.google.android.m4b.maps.be.d.a(abyte0, i1, j1);
                i1 += 4;
                com.google.android.m4b.maps.be.d.a(abyte0, i1, f1.d << 24 | f1.e);
                com.google.android.m4b.maps.be.d.a(abyte0, i1 + 4, f1.f);
                return;
            }
        }

        final int b()
        {
            int i1 = 0;
            if (e == -1)
            {
                e = 0;
                for (; i1 < c; i1++)
                {
                    if (d(i1) > 0)
                    {
                        e = e + (c(i1) + (com.google.android.m4b.maps.be.d.a(a, i1 * 20 + 8 + 8 + 4) & 0xffffff));
                    }
                }

            }
            return e;
        }

        final long b(int i1)
        {
            return com.google.android.m4b.maps.be.d.c(a, i1 * 20 + 8);
        }

        final int c(int i1)
        {
            return com.google.android.m4b.maps.be.d.a(a, i1 * 20 + 8 + 8 + 4) >>> 24;
        }

        final int d(int i1)
        {
            return com.google.android.m4b.maps.be.d.a(a, i1 * 20 + 8 + 8) & 0x1f;
        }

        final f e(int i1)
        {
            byte abyte0[] = a;
            int k1 = i1 * 20 + 8;
            int j1 = b;
            long l2 = com.google.android.m4b.maps.be.d.c(abyte0, k1);
            int l1 = k1 + 8;
            k1 = com.google.android.m4b.maps.be.d.a(abyte0, l1);
            l1 += 4;
            int i2 = com.google.android.m4b.maps.be.d.a(abyte0, l1);
            return new f(l2, k1 >>> 5, i2 >>> 24, i2 & 0xffffff, k1 & 0x1f, com.google.android.m4b.maps.be.d.a(abyte0, l1 + 4), j1, i1);
        }

        public final String toString()
        {
            int i1 = b;
            int j1 = c;
            return (new StringBuilder(31)).append("ID:").append(i1).append(" Size:").append(j1).toString();
        }

        g(int i1)
        {
            this(i1, new byte[8192]);
        }

        private g(int i1, byte abyte0[])
        {
            d = -1;
            e = -1;
            a = abyte0;
            b = i1;
            c = 0;
        }

        g(byte abyte0[])
        {
            d = -1;
            e = -1;
            a = abyte0;
            b = com.google.android.m4b.maps.be.d.a(a, 0);
            c = com.google.android.m4b.maps.be.d.a(a, 4);
        }
    }

    static final class h
    {

        final g a;
        final f b;
        final int c;

        h(g g1, f f1, int i1)
        {
            a = g1;
            b = f1;
            c = i1;
        }
    }

    static final class i
    {

        final int a[];
        final int b[];
        final int c[];
        final int d[];
        final int e[];
        int f;
        int g;

        final int a(Set set)
        {
            int j1 = 0x7fffffff;
            int l1 = -1;
            for (int i1 = 0; i1 < f;)
            {
                int k1;
                int i2;
label0:
                {
                    i2 = l1;
                    k1 = j1;
                    if (!b(i1))
                    {
                        break label0;
                    }
                    i2 = l1;
                    k1 = j1;
                    if (e[i1] != 0)
                    {
                        break label0;
                    }
                    i2 = l1;
                    k1 = j1;
                    if (a[i1] >= j1)
                    {
                        break label0;
                    }
                    if (set != null)
                    {
                        i2 = l1;
                        k1 = j1;
                        if (set.contains(Integer.valueOf(i1)))
                        {
                            break label0;
                        }
                    }
                    k1 = a[i1];
                    i2 = i1;
                }
                i1++;
                l1 = i2;
                j1 = k1;
            }

            return l1;
        }

        final long a()
        {
            int i1 = 0;
            long l1 = 0L;
            while (i1 < f) 
            {
                long l2;
                if (b[i1] > 0)
                {
                    l2 = b[i1];
                } else
                {
                    l2 = 0L;
                }
                l1 += l2;
                i1++;
            }
            return l1;
        }

        final void a(int i1)
        {
            a[i1] = 0;
            c[i1] = 0;
            d[i1] = 0;
            if (e[i1] > 0)
            {
                g = g - 1;
            }
            e[i1] = 0;
            b[i1] = -1;
        }

        final void a(com.google.android.m4b.maps.au.a a1)
        {
            int i1 = 0;
            byte abyte0[] = new byte[8192];
            int j1 = 0;
            for (; i1 < a.length; i1++)
            {
                com.google.android.m4b.maps.be.d.a(abyte0, j1, a[i1]);
                int k1 = j1 + 4;
                com.google.android.m4b.maps.be.d.a(abyte0, k1, b[i1]);
                k1 += 4;
                com.google.android.m4b.maps.be.d.b(abyte0, k1, c[i1]);
                k1 += 2;
                com.google.android.m4b.maps.be.d.b(abyte0, k1, d[i1]);
                k1 += 2;
                com.google.android.m4b.maps.be.d.a(abyte0, k1, e[i1]);
                k1 += 4;
                com.google.android.m4b.maps.be.d.a(abyte0, k1, com.google.android.m4b.maps.be.d.c(abyte0, k1 - 16, 16));
                j1 += 20;
            }

            a1.a(abyte0);
        }

        final void a(g g1)
        {
            int i1 = 0;
            int j1 = g1.b;
            if (e[j1] > 0)
            {
                g = g - 1;
            }
            a[j1] = 0;
            b[j1] = g1.a();
            c[j1] = g1.c;
            d[j1] = 0;
            e[j1] = 0;
            for (; i1 < g1.c; i1++)
            {
                if (g1.b(i1) == -1L)
                {
                    continue;
                }
                int ai[] = d;
                ai[j1] = ai[j1] + 1;
                if (g1.d(i1) > 0)
                {
                    int ai1[] = e;
                    ai1[j1] = ai1[j1] + 1;
                }
            }

            if (d[j1] > 0 && j1 >= f)
            {
                f = j1 + 1;
            }
            if (e[j1] > 0)
            {
                g = g + 1;
            }
        }

        final int b()
        {
            int i1 = 0;
            int j1 = 0;
            while (i1 < f) 
            {
                int k1;
                if (b(i1))
                {
                    k1 = 1;
                } else
                {
                    k1 = 0;
                }
                j1 += k1;
                i1++;
            }
            return j1;
        }

        final void b(com.google.android.m4b.maps.au.a a1)
        {
            int i1 = 0;
            byte abyte0[] = new byte[8192];
            a1.b(abyte0);
            f = 0;
            g = 0;
            int j1 = 0;
            while (i1 < a.length) 
            {
                a[i1] = com.google.android.m4b.maps.be.d.a(abyte0, j1);
                j1 += 4;
                b[i1] = com.google.android.m4b.maps.be.d.a(abyte0, j1);
                j1 += 4;
                c[i1] = com.google.android.m4b.maps.be.d.b(abyte0, j1);
                j1 += 2;
                d[i1] = com.google.android.m4b.maps.be.d.b(abyte0, j1);
                j1 += 2;
                e[i1] = com.google.android.m4b.maps.be.d.a(abyte0, j1);
                j1 += 4;
                if (com.google.android.m4b.maps.be.d.a(abyte0, j1) != com.google.android.m4b.maps.be.d.c(abyte0, j1 - 16, 16))
                {
                    a(i1);
                } else
                {
                    if (d[i1] > 0)
                    {
                        f = i1 + 1;
                    }
                    if (e[i1] > 0)
                    {
                        g = g + 1;
                    }
                }
                j1 += 4;
                i1++;
            }
        }

        final boolean b(int i1)
        {
            return d[i1] != 0;
        }

        i(int i1)
        {
            a = new int[i1];
            b = new int[i1];
            c = new int[i1];
            d = new int[i1];
            e = new int[i1];
            f = 0;
            g = 0;
        }
    }


    private static final String b = com/google/android/m4b/maps/be/d.getSimpleName();
    private static final byte c[] = new byte[0];
    private static int d = 20;
    private static int e = 0x13f88;
    b a;
    private final String f;
    private final com.google.android.m4b.maps.au.a.a g;
    private com.google.android.m4b.maps.au.a h;
    private final i i;
    private final a j;
    private final com.google.android.m4b.maps.au.a k[];
    private final com.google.android.m4b.maps.bw.e l;
    private final Set m;
    private final ReentrantLock n;
    private final ReentrantReadWriteLock o;
    private boolean p;
    private com.google.android.m4b.maps.be.h q;
    private com.google.android.m4b.maps.be.e r;
    private Set s;
    private int t;
    private final com.google.android.m4b.maps.bs.e u;

    private com.google.android.m4b.maps.be.d(String s1, b b1, i i1, a a1, com.google.android.m4b.maps.au.a a2, com.google.android.m4b.maps.au.a.a a3, com.google.android.m4b.maps.be.e e1, 
            com.google.android.m4b.maps.bs.e e2)
    {
        int j1;
        int k1;
        n = new ReentrantLock();
        o = new ReentrantReadWriteLock(true);
        q = null;
        r = null;
        t = 4;
        f = s1;
        a = b1;
        i = i1;
        j = a1;
        h = a2;
        g = a3;
        k = new com.google.android.m4b.maps.au.a[b1.c];
        l = new com.google.android.m4b.maps.bw.e(Math.min(2048, d()));
        m = Collections.synchronizedSet(new HashSet());
        r = e1;
        u = e2;
        n.lock();
        j1 = 0;
        k1 = 0;
_L14:
        if (j1 >= a.c) goto _L2; else goto _L1
_L1:
        int l1;
        boolean flag;
        if (i.b[j1] == -1)
        {
            l1 = 1;
        } else
        {
            l1 = 0;
        }
        if (l1 != 0) goto _L4; else goto _L3
_L3:
        l1 = k1;
        if (!i.b(j1)) goto _L6; else goto _L5
_L5:
        s1 = j;
        l1 = j1 * 1024;
        if (c(((a) (s1)).a, l1, 1020) == a(((a) (s1)).a, l1 + 1020))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        l1 = k1;
          goto _L7
_L4:
        b1 = (new StringBuilder(42)).append("Rebuilding inconsistent shard: ").append(j1).toString();
        s1 = String.valueOf("Cache:");
        i1 = String.valueOf(f);
        if (i1.length() == 0) goto _L9; else goto _L8
_L8:
        s1 = s1.concat(i1);
_L15:
        if (!ab.a(s1, 3)) goto _L11; else goto _L10
_L10:
        s1 = String.valueOf("Cache:");
        i1 = String.valueOf(f);
        if (i1.length() == 0) goto _L13; else goto _L12
_L12:
        s1 = s1.concat(i1);
_L16:
        Log.d(s1, b1);
_L11:
        l1 = 1;
        s1 = b(j1);
        i.a(s1);
        j.a(s1);
        c(j1);
_L6:
        j1++;
        k1 = l1;
          goto _L14
_L9:
        s1 = new String(s1);
          goto _L15
        s1;
        n.unlock();
        throw s1;
_L13:
        s1 = new String(s1);
          goto _L16
        s1;
        if (ab.a(b, 6))
        {
            Log.e(b, (new StringBuilder(29)).append("Rebuilding shard: ").append(j1).toString(), s1);
        }
        d(j1);
          goto _L6
_L2:
        if (k1 == 0)
        {
            break MISSING_BLOCK_LABEL_485;
        }
        g();
        n.unlock();
        return;
_L7:
        if (flag) goto _L6; else goto _L4
    }

    private static int a(com.google.android.m4b.maps.bs.e e1)
    {
        e1 = e1.c;
        if (e1 == null)
        {
            throw new IllegalStateException("VectorMapsParameters is null");
        } else
        {
            return ((com.google.android.m4b.maps.bs.g) (e1)).b & 0xffff;
        }
    }

    private int a(boolean flag)
    {
        int j1 = 0;
_L7:
        if (j1 >= i.f) goto _L2; else goto _L1
_L1:
        if (i.b(j1)) goto _L4; else goto _L3
_L3:
        return j1;
_L4:
        j1++;
        continue; /* Loop/switch isn't completed */
_L2:
        if (flag)
        {
            j1 = i.a(s);
            if (j1 != -1)
            {
                d(j1);
                return j1;
            }
        }
        if (i.f >= a.c)
        {
            break MISSING_BLOCK_LABEL_202;
        }
        o.writeLock().lock();
        i i1 = i;
        j1 = i1.f;
        i1.f = j1 + 1;
        i1.a[j1] = 0;
        i1.b[j1] = 0;
        i1.c[j1] = 0;
        i1.d[j1] = 0;
        if (i1.e[j1] > 0)
        {
            i1.g = i1.g - 1;
        }
        i1.e[j1] = 0;
        j.a(j1);
        j.b = j1 + 1;
        o.writeLock().unlock();
        return j1;
        Exception exception;
        exception;
        o.writeLock().unlock();
        throw exception;
        int k1;
        k1 = i.a(s);
        j1 = k1;
        if (k1 == -1) goto _L3; else goto _L5
_L5:
        d(k1);
        return k1;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public static int a(byte abyte0[], int i1)
    {
        int j1 = i1 + 1;
        i1 = abyte0[i1];
        int k1 = j1 + 1;
        return (abyte0[j1] & 0xff) << 16 | (i1 & 0xff) << 24 | (abyte0[k1] & 0xff) << 8 | abyte0[k1 + 1] & 0xff;
    }

    public static c a(long l1, String s1, int i1, byte abyte0[])
    {
        return new c(c(l1, s1), i1, abyte0, (byte)0);
    }

    public static c a(long l1, String s1, byte abyte0[])
    {
        return new c(c(l1, s1), abyte0, (byte)0);
    }

    public static c a(long l1, byte abyte0[])
    {
        return a(l1, ((String) (null)), abyte0);
    }

    private f a(d d1)
    {
        long l1 = d1.a;
        f f1;
        synchronized (l)
        {
            f1 = (f)l.c(Long.valueOf(l1));
        }
        obj1 = f1;
        if (f1 != null)
        {
            obj1 = f1;
            if (!a(f1, d1))
            {
                obj1 = null;
            }
        }
        obj = obj1;
        if (obj1 != null)
        {
            obj = obj1;
            if (!i.b(((f) (obj1)).g))
            {
                synchronized (l)
                {
                    l.d(Long.valueOf(l1));
                }
                obj = null;
            }
        }
        obj1 = obj;
        if (obj == null)
        {
            d1 = b(d1);
            obj1 = obj;
            if (d1 != null)
            {
                obj1 = ((h) (d1)).b;
            }
        }
        return ((f) (obj1));
        d1;
        obj1;
        JVM INSTR monitorexit ;
        throw d1;
        d1;
        obj;
        JVM INSTR monitorexit ;
        throw d1;
    }

    private g a(int i1, int j1, int k1)
    {
        j1 = Math.min((a.d * 50) / 100, a.d - j1);
        for (; i1 < i.f; i1++)
        {
            if (i.e[i1] <= 0 || i.e[i1] > j1 || s != null && s.contains(Integer.valueOf(i1)))
            {
                continue;
            }
            g g1 = b(i1);
            if (g1.b() <= 0x7ffffff - k1)
            {
                return g1;
            }
        }

        return null;
    }

    private h a(d d1, int i1)
    {
        Object obj1;
        long l1;
        obj1 = null;
        obj = null;
        l1 = d1.a;
        g g1 = b(i1);
        int j1 = g1.c;
        obj1 = new ArrayList(j1);
        boolean flag;
        for (i1 = 0; i1 < j1; i1++)
        {
            f f2 = g1.e(i1);
            if (f2.a != -1L)
            {
                ((List) (obj1)).add(f2);
                if (f2.a == d1.a && a(f2, d1))
                {
                    obj = new h(g1, f2, i1);
                }
            }
        }

        d1 = ((d) (obj));
          goto _L1
        d1;
        if (ab.a(b, 6))
        {
            Log.e(b, (new StringBuilder(67)).append("lookupShardRecordIndexFromShard: ").append(l1).append(" : ").append(i1).toString(), d1);
        }
        o.readLock().unlock();
        flag = n.tryLock();
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_206;
        }
        d(i1);
        n.unlock();
        o.readLock().lock();
        d1 = ((d) (obj1));
_L3:
        return d1;
        d1;
        n.unlock();
        throw d1;
        d1;
        o.readLock().lock();
        throw d1;
_L1:
        if (obj == null) goto _L3; else goto _L2
_L2:
        for (obj1 = ((List) (obj1)).iterator(); ((Iterator) (obj1)).hasNext();)
        {
            f f1 = (f)((Iterator) (obj1)).next();
            synchronized (l)
            {
                l.b(Long.valueOf(f1.a), f1);
            }
        }

        break MISSING_BLOCK_LABEL_315;
        obj;
        d1;
        JVM INSTR monitorexit ;
        throw obj;
        synchronized (l)
        {
            l.b(Long.valueOf(((h) (obj)).b.a), ((h) (obj)).b);
        }
        return ((h) (obj));
        exception;
        d1;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public static com.google.android.m4b.maps.be.d a(String s1, int i1, int j1, Locale locale, com.google.android.m4b.maps.au.a.a a1, com.google.android.m4b.maps.be.e e1, com.google.android.m4b.maps.bs.e e2)
    {
        boolean flag = false;
        if (i1 == -1)
        {
            i1 = 0x13f88;
            flag = true;
        }
        int k1 = i1;
        if (i1 < 4)
        {
            k1 = 4;
        }
        if (!flag && k1 > 0x13f88)
        {
            s1 = String.valueOf("Number of records must be between 4 and ");
            throw new IllegalArgumentException((new StringBuilder(String.valueOf(s1).length() + 11)).append(s1).append(0x13f88).toString());
        }
        i1 = Math.max(4, (k1 - 1) / 409 + 1);
        k1 = (k1 - 1) / i1;
        Object obj = String.valueOf(s1);
        Object obj1 = String.valueOf(".m");
        a a2;
        int l1;
        if (((String) (obj1)).length() != 0)
        {
            obj = ((String) (obj)).concat(((String) (obj1)));
        } else
        {
            obj = new String(((String) (obj)));
        }
        a1.b(((String) (obj)));
        obj = String.valueOf(s1);
        obj1 = String.valueOf(".m");
        if (((String) (obj1)).length() != 0)
        {
            obj = ((String) (obj)).concat(((String) (obj1)));
        } else
        {
            obj = new String(((String) (obj)));
        }
        obj = a1.a(((String) (obj)));
        l1 = a(e2);
        com.google.android.m4b.maps.ay.k.a();
        locale = new b((l1 << 16) + 20, 8192, i1, k1 + 1, flag, j1, com.google.android.m4b.maps.ay.k.b(), locale);
        obj1 = new i(i1);
        a2 = new a(i1, 0);
        a(((b) (locale)), ((i) (obj1)), a2, ((com.google.android.m4b.maps.au.a) (obj)));
        ((com.google.android.m4b.maps.au.a) (obj)).a();
        return new com.google.android.m4b.maps.be.d(s1, locale, ((i) (obj1)), a2, ((com.google.android.m4b.maps.au.a) (obj)), a1, e1, e2);
    }

    public static com.google.android.m4b.maps.be.d a(String s1, com.google.android.m4b.maps.au.a.a a1, com.google.android.m4b.maps.be.e e1, com.google.android.m4b.maps.bs.e e2)
    {
        Object obj;
        Object obj2;
        obj2 = null;
        obj = obj2;
        Object obj1 = String.valueOf(s1);
        obj = obj2;
        Object obj3 = String.valueOf(".m");
        obj = obj2;
        if (((String) (obj3)).length() == 0) goto _L2; else goto _L1
_L1:
        obj = obj2;
        obj1 = ((String) (obj1)).concat(((String) (obj3)));
_L4:
        obj = obj2;
        obj1 = a1.a(((String) (obj1)));
        obj = obj1;
        obj2 = new byte[8192];
        obj = obj1;
        ((com.google.android.m4b.maps.au.a) (obj1)).b(((byte []) (obj2)));
        obj = obj1;
        obj2 = new b(((byte []) (obj2)));
        obj = obj1;
        int i1 = a(e2);
        int j1;
        j1 = (i1 << 16) + 20;
        obj = obj1;
        int k1 = ((b) (obj2)).a >> 16 & 0xffff;
        obj = obj1;
        int l1 = ((b) (obj2)).a & 0xffff;
        if (k1 != 0 || l1 == 20)
        {
            break; /* Loop/switch isn't completed */
        }
        obj = obj1;
        s1 = String.valueOf(obj2);
        obj = obj1;
        try
        {
            throw new IOException((new StringBuilder(String.valueOf(s1).length() + 161)).append("Invalid Cache Header(1): ").append(s1).append("; cached sever schema is zero but client schema part doesn't match: cachedClientSchema = ").append(l1).append(", expectedClientSchema = 20").toString());
        }
        // Misplaced declaration of an exception variable
        catch (String s1) { }
        if (obj != null)
        {
            ((com.google.android.m4b.maps.au.a) (obj)).a.close();
        }
        throw s1;
_L2:
        obj = obj2;
        obj1 = new String(((String) (obj1)));
        if (true) goto _L4; else goto _L3
_L3:
        if (k1 == 0)
        {
            break MISSING_BLOCK_LABEL_285;
        }
        obj = obj1;
        if (((b) (obj2)).a != j1)
        {
            break MISSING_BLOCK_LABEL_300;
        }
        obj = obj1;
        if (((b) (obj2)).b == 8192)
        {
            break MISSING_BLOCK_LABEL_369;
        }
        obj = obj1;
        s1 = String.valueOf(obj2);
        obj = obj1;
        throw new IOException((new StringBuilder(String.valueOf(s1).length() + 84)).append("Invalid Cache Header(2): ").append(s1).append(", expect expectedSchema=").append(j1).append(", mBlockSize=8192").toString());
        obj = obj1;
        obj3 = new i(((b) (obj2)).c);
        obj = obj1;
        ((i) (obj3)).b(((com.google.android.m4b.maps.au.a) (obj1)));
        obj = obj1;
        a a2 = new a(((b) (obj2)).c, ((i) (obj3)).f);
        obj = obj1;
        byte abyte0[] = a2.a;
        obj = obj1;
        l1 = a2.a.length;
        obj = obj1;
        ((com.google.android.m4b.maps.au.a) (obj1)).a.read(abyte0, 0, l1);
        obj = obj1;
        s1 = new com.google.android.m4b.maps.be.d(s1, ((b) (obj2)), ((i) (obj3)), a2, ((com.google.android.m4b.maps.au.a) (obj1)), a1, e1, e2);
        if (k1 != 0 || i1 == 0)
        {
            break MISSING_BLOCK_LABEL_513;
        }
        obj = obj1;
        s1.a(((com.google.android.m4b.maps.be.d) (s1)).a.f, j1);
        return s1;
    }

    private void a(int i1, int j1)
    {
        n.lock();
        b b1;
        byte abyte0[];
        if (i1 == a.f && j1 == a.a)
        {
            break MISSING_BLOCK_LABEL_136;
        }
        b1 = new b(j1, a.b, a.c, a.d, a.e, i1, a.g, a.h);
        abyte0 = new byte[8192];
        b1.a(abyte0);
        synchronized (h)
        {
            h.a(0L);
            h.a(abyte0);
            h.a();
        }
        a = b1;
        n.unlock();
        return;
        exception;
        a1;
        JVM INSTR monitorexit ;
        throw exception;
        Object obj;
        obj;
        b();
        throw obj;
        obj;
        n.unlock();
        throw obj;
    }

    private static void a(int i1, d d1, Map map)
    {
        Integer integer = (Integer)map.get(d1);
        if (integer != null)
        {
            integer = Integer.valueOf(com.google.android.m4b.maps.bq.g.a(i1, integer.intValue()));
        } else
        {
            integer = Integer.valueOf(i1);
        }
        map.put(d1, integer);
    }

    private static void a(com.google.android.m4b.maps.au.a a1, int i1, byte abyte0[])
    {
        a1;
        JVM INSTR monitorenter ;
        long l1 = i1;
        a1.a(l1);
        a1.b(abyte0);
        a1;
        JVM INSTR monitorexit ;
        return;
        abyte0;
        a1;
        JVM INSTR monitorexit ;
        throw abyte0;
    }

    private static void a(b b1, i i1, a a1, com.google.android.m4b.maps.au.a a2)
    {
        byte abyte0[] = new byte[8192];
        b1.a(abyte0);
        a2.a(abyte0);
        i1.a(a2);
        for (int j1 = 0; j1 < a1.b; j1++)
        {
            a1.b(j1);
        }

        a2.a(a1.a);
    }

    private void a(e e1, g g1)
    {
        e1.a();
        a(g1, true);
    }

    private void a(f f1, IOException ioexception)
    {
        String s1 = String.valueOf("Cache:");
        String s2 = String.valueOf(f);
        if (s2.length() != 0)
        {
            s1 = s1.concat(s2);
        } else
        {
            s1 = new String(s1);
        }
        if (ab.a(s1, 6))
        {
            s1 = String.valueOf("Cache:");
            String s3 = String.valueOf(f);
            if (s3.length() != 0)
            {
                s1 = s1.concat(s3);
            } else
            {
                s1 = new String(s1);
            }
            Log.e(s1, "Error reading in the cache", ioexception);
        }
        m.add(f1);
    }

    private void a(g g1, g g2, e e1)
    {
        com.google.android.m4b.maps.au.a a1 = e(g1.b);
        for (int i1 = 0; i1 < g1.c; i1++)
        {
            if (g1.b(i1) == -1L || g1.d(i1) <= 0)
            {
                continue;
            }
            if (g2.c >= a.d || g2.a() >= 0x7ffffff)
            {
                throw new IOException("Couldn't fit refcounted records into collecting shard");
            }
            f f1 = g1.e(i1);
            byte abyte0[] = new byte[f1.d + f1.e];
            a(a1, f1.b, abyte0);
            e1.a(abyte0);
            f1 = new f(f1.a, g2.a(), f1.d, f1.e, f1.c, f1.f, g2.b, g2.c);
            g2.a(f1);
            if (r != null)
            {
                r.b(f1.a, f1.g);
            }
        }

    }

    private void a(g g1, boolean flag)
    {
        int j1;
        j1 = i.a[g1.b];
        o.writeLock().lock();
        i.a(g1.b);
        g();
        synchronized (h)
        {
            h.a(g1.b * 8192 + a.i);
            com.google.android.m4b.maps.au.a a1 = h;
            a(g1.a, 0, g1.b);
            a(g1.a, 4, g1.c);
            int k1 = c(g1.a, 0, 8188);
            a(g1.a, 8188, k1);
            a1.a(g1.a);
            h.a();
        }
        j.a(g1);
        i.a(g1);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_229;
        }
        obj = i;
        j1 = g1.b;
        int l1 = i();
        ((i) (obj)).a[j1] = l1;
_L1:
        o.writeLock().unlock();
        c(g1.b);
        g();
        return;
        g1;
        obj;
        JVM INSTR monitorexit ;
        throw g1;
        g1;
        o.writeLock().unlock();
        throw g1;
        i i1 = i;
        int i2 = g1.b;
        i1.a[i2] = j1;
          goto _L1
    }

    public static void a(byte abyte0[], int i1, int j1)
    {
        int k1 = i1 + 1;
        abyte0[i1] = (byte)(j1 >> 24);
        i1 = k1 + 1;
        abyte0[k1] = (byte)(j1 >> 16);
        abyte0[i1] = (byte)(j1 >> 8);
        abyte0[i1 + 1] = (byte)j1;
    }

    public static void a(byte abyte0[], int i1, long l1)
    {
        a(abyte0, i1, (int)(l1 >> 32));
        a(abyte0, i1 + 4, (int)l1);
    }

    private boolean a(f f1, d d1)
    {
        d1 = d1.b;
        if (d1.length != f1.d)
        {
            return false;
        }
        if (d1.length == 0)
        {
            return true;
        }
        boolean flag;
        try
        {
            flag = Arrays.equals(d1, a(f1));
        }
        // Misplaced declaration of an exception variable
        catch (f f1)
        {
            return false;
        }
        return flag;
    }

    private byte[] a(f f1)
    {
        if (f1.d == 0)
        {
            return c;
        }
        byte abyte0[];
        try
        {
            com.google.android.m4b.maps.au.a a1 = e(f1.g);
            abyte0 = new byte[f1.d];
            a(a1, f1.b, abyte0);
        }
        catch (IOException ioexception)
        {
            a(f1, ioexception);
            throw ioexception;
        }
        return abyte0;
    }

    public static int b(byte abyte0[], int i1)
    {
        byte byte0 = abyte0[i1];
        return abyte0[i1 + 1] & 0xff | (byte0 & 0xff) << 8;
    }

    private g b(int i1)
    {
        com.google.android.m4b.maps.au.a a1 = h;
        a1;
        JVM INSTR monitorenter ;
        byte abyte0[];
        int j1;
        h.a(i1 * 8192 + a.i);
        com.google.android.m4b.maps.au.a a2 = h;
        abyte0 = new byte[8192];
        a2.b(abyte0);
        i1 = c(abyte0, 0, 8188);
        j1 = a(abyte0, 8188);
        if (i1 == j1)
        {
            break MISSING_BLOCK_LABEL_118;
        }
        throw new IOException((new StringBuilder(55)).append("Unexpected checksum: ").append(i1).append(", expected: ").append(j1).toString());
        Exception exception;
        exception;
        a1;
        JVM INSTR monitorexit ;
        throw exception;
        g g1 = new g(abyte0);
        a1;
        JVM INSTR monitorexit ;
        return g1;
    }

    private h b(d d1)
    {
        int ai[] = com.google.android.m4b.maps.be.a.a(d1.a);
        int j1 = i.f;
        for (int i1 = 0; i1 < j1; i1++)
        {
            if (!i.b(i1) || !j.a(ai, i1))
            {
                continue;
            }
            h h1 = a(d1, i1);
            if (h1 != null)
            {
                return h1;
            }
        }

        return null;
    }

    private Collection b(Collection collection)
    {
        HashMap hashmap;
        ArrayList arraylist;
        Object obj;
        HashSet hashset;
        int i1;
        obj = new HashSet(collection.size());
        hashset = new HashSet(collection.size());
        hashmap = new HashMap(collection.size());
        arraylist = new ArrayList(collection);
        Collections.reverse(arraylist);
        collection = arraylist.iterator();
        do
        {
            if (!collection.hasNext())
            {
                break;
            }
            c c1 = (c)collection.next();
            if (c1.a.a == -1L || c1.b.length > 255)
            {
                collection.remove();
            } else
            if (hashset.contains(c1.a))
            {
                collection.remove();
                if (c1.c > 0)
                {
                    a(c1.c, c1.a, hashmap);
                }
            } else
            {
                ((Set) (obj)).add(Long.valueOf(c1.a.a));
                hashset.add(c1.a);
            }
        } while (true);
        i1 = 0;
_L5:
        if (i1 >= i.f) goto _L2; else goto _L1
_L1:
        int k1;
        collection = ((Set) (obj)).iterator();
        Long long1;
        do
        {
            if (!collection.hasNext())
            {
                break MISSING_BLOCK_LABEL_680;
            }
            long1 = (Long)collection.next();
        } while (!i.b(i1) || !j.a(com.google.android.m4b.maps.be.a.a(long1.longValue()), i1));
        k1 = 1;
_L7:
        int l1;
        int i2;
        if (k1 == 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        byte abyte0[];
        d d1;
        long l2;
        try
        {
            collection = b(i1);
        }
        // Misplaced declaration of an exception variable
        catch (Collection collection)
        {
            if (ab.a(b, 6))
            {
                Log.e(b, (new StringBuilder(48)).append("removeOldRecordsAndFilterInsertions: ").append(i1).toString(), collection);
            }
            d(i1);
            collection = null;
        }
        if (collection == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        l1 = 0;
        k1 = 0;
_L4:
        if (k1 >= ((g) (collection)).c)
        {
            break; /* Loop/switch isn't completed */
        }
        l2 = collection.b(k1);
        i2 = l1;
        if (!((Set) (obj)).contains(Long.valueOf(l2)))
        {
            break MISSING_BLOCK_LABEL_453;
        }
        abyte0 = c;
        if (collection.c(k1) <= 0)
        {
            break MISSING_BLOCK_LABEL_355;
        }
        abyte0 = collection.e(k1);
        abyte0 = a(abyte0);
        d1 = new d(l2, abyte0);
        i2 = l1;
        if (hashset.contains(d1))
        {
            if (r != null)
            {
                r.a(l2);
            }
            synchronized (l)
            {
                l.d(Long.valueOf(l2));
            }
            l1 = collection.d(k1);
            if (l1 > 0)
            {
                a(l1, d1, hashmap);
            }
            collection.a(k1);
            i2 = 1;
        }
_L6:
        k1++;
        l1 = i2;
        if (true) goto _L4; else goto _L3
        collection;
        e1;
        JVM INSTR monitorexit ;
        throw collection;
_L3:
        if (l1 != 0)
        {
            a(collection, false);
        }
        i1++;
          goto _L5
_L2:
        obj = new ArrayList(arraylist.size());
        for (int j1 = arraylist.size() - 1; j1 >= 0; j1--)
        {
            c c2 = (c)arraylist.get(j1);
            Integer integer = (Integer)hashmap.get(c2.a);
            collection = c2;
            if (integer != null)
            {
                k1 = com.google.android.m4b.maps.bq.g.a(integer.intValue(), c2.c);
                collection = new c(c2.a, Integer.valueOf(k1).intValue(), c2.d, (byte)0);
            }
            ((List) (obj)).add(collection);
        }

        break MISSING_BLOCK_LABEL_677;
        IOException ioexception;
        ioexception;
        i2 = l1;
          goto _L6
        return ((Collection) (obj));
        k1 = 0;
          goto _L7
    }

    private void b(boolean flag)
    {
        if (a.c > t) goto _L2; else goto _L1
_L1:
        return;
_L2:
        g g2;
        g g3;
        e e1;
        HashSet hashset;
        g g1;
        byte abyte0[];
        int i1;
        int k1;
        if (flag)
        {
            i1 = i.f;
        } else
        {
            i1 = a.c;
        }
        k1 = i1 - i.g;
        i1 = k1;
        if (s != null)
        {
            i1 = k1 - s.size();
        }
        if (i1 >= t) goto _L1; else goto _L3
_L3:
        g2 = a(0, 0, 0);
        if (g2 == null) goto _L1; else goto _L4
_L4:
        i1 = g2.b;
        g1 = a(i1 + 1, i.e[i1], g2.b());
        if (g1 == null) goto _L1; else goto _L5
_L5:
        i1 = a(flag);
        if (i1 == -1) goto _L1; else goto _L6
_L6:
        g3 = new g(i1);
        abyte0 = new byte[0x20000];
        e1 = new e(e(i1), 0, abyte0);
        hashset = new HashSet();
_L7:
        if (g2 == null)
        {
            break MISSING_BLOCK_LABEL_267;
        }
        a(g2, g3, e1);
        hashset.add(Integer.valueOf(g2.b));
        i1 = hashset.size();
label0:
        {
            if (i1 >= 4)
            {
                break MISSING_BLOCK_LABEL_267;
            }
            if (g1 == null)
            {
                break label0;
            }
            g2 = g1;
            g1 = null;
        }
          goto _L7
        g2 = a(g2.b + 1, g3.c, g3.a());
          goto _L7
        Iterator iterator;
        a(e1, g3);
        iterator = hashset.iterator();
_L9:
        if (!iterator.hasNext()) goto _L1; else goto _L8
_L8:
        int l1 = ((Integer)iterator.next()).intValue();
        g2 = b(l1);
        int j1 = 0;
_L11:
        if (j1 < g2.c)
        {
            if (g2.b(j1) != -1L && g2.d(j1) > 0)
            {
                g2.a(j1);
            }
            break MISSING_BLOCK_LABEL_420;
        }
        a(g2, false);
          goto _L9
        IOException ioexception1;
        ioexception1;
        d(l1);
          goto _L9
        IOException ioexception;
        ioexception;
        ioexception1 = g3;
_L10:
        if (ioexception1 != null)
        {
            d(((g) (ioexception1)).b);
        }
        if (ab.a(b, 6))
        {
            Log.e(b, "Failed to combine refCounted records", ioexception);
            return;
        }
          goto _L1
        ioexception;
        ioexception1 = null;
          goto _L10
        j1++;
          goto _L11
    }

    public static void b(byte abyte0[], int i1, int j1)
    {
        abyte0[i1] = (byte)(j1 >> 8);
        abyte0[i1 + 1] = (byte)j1;
    }

    static int c(byte abyte0[], int i1, int j1)
    {
        CRC32 crc32 = new CRC32();
        crc32.update(abyte0, i1, j1);
        return (int)crc32.getValue();
    }

    public static long c(byte abyte0[], int i1)
    {
        return (long)a(abyte0, i1) << 32 | (long)a(abyte0, i1 + 4) & 0xffffffffL;
    }

    private static d c(long l1, String s1)
    {
        byte abyte0[] = c;
        if (s1 != null)
        {
            abyte0 = com.google.android.m4b.maps.ap.g.a(s1);
        }
        return new d(l1, abyte0);
    }

    private void c(int i1)
    {
        synchronized (h)
        {
            h.a(i1 * 1024 + 16384);
            a a2 = j;
            com.google.android.m4b.maps.au.a a3 = h;
            a2.b(i1);
            a3.a(a2.a, i1 * 1024, 1024);
            h.a();
        }
        return;
        exception;
        a1;
        JVM INSTR monitorexit ;
        throw exception;
    }

    static byte[] c()
    {
        return c;
    }

    private byte[] c(d d1)
    {
        Object obj;
label0:
        {
            d1 = a(d1);
            if (d1 != null)
            {
                try
                {
                    com.google.android.m4b.maps.au.a a1 = e(((f) (d1)).g);
                    obj = new byte[((f) (d1)).e];
                    a(a1, ((f) (d1)).b + ((f) (d1)).d, ((byte []) (obj)));
                    int j1 = c(((byte []) (obj)), 0, obj.length);
                    if (j1 != ((f) (d1)).f)
                    {
                        obj = String.valueOf(d1);
                        throw new IOException((new StringBuilder(String.valueOf(obj).length() + 40)).append("Checksum mismatch: ").append(j1).append(" record [").append(((String) (obj))).append("]").toString());
                    }
                    break label0;
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    a(d1, ((IOException) (obj)));
                }
            }
            return null;
        }
        i i1 = i;
        int k1 = ((f) (d1)).g;
        int l1 = i();
        i1.a[k1] = l1;
        return ((byte []) (obj));
    }

    private int d()
    {
        return a.c * a.d;
    }

    private void d(int i1)
    {
        g g1 = new g(i1);
        a(g1, false);
        synchronized (l)
        {
            l.a(0);
        }
        m.clear();
        if (r != null)
        {
            r.a(i1);
        }
_L1:
        return;
        exception;
        e1;
        JVM INSTR monitorexit ;
        String s1;
        try
        {
            throw exception;
        }
        catch (IOException ioexception)
        {
            s1 = String.valueOf("Cache:");
            String s2 = String.valueOf(f);
            if (s2.length() != 0)
            {
                s1 = s1.concat(s2);
            } else
            {
                s1 = new String(s1);
            }
        }
        if (ab.a(s1, 6))
        {
            s1 = String.valueOf("Cache:");
            s2 = String.valueOf(f);
            if (s2.length() != 0)
            {
                s1 = s1.concat(s2);
            } else
            {
                s1 = new String(s1);
            }
            Log.e(s1, "Error writing on the cache", ioexception);
            return;
        }
          goto _L1
    }

    private com.google.android.m4b.maps.au.a e(int i1)
    {
        com.google.android.m4b.maps.au.a a1;
        synchronized (k)
        {
            if (k[i1] == null)
            {
                k[i1] = g.a(f(i1));
            }
            a1 = k[i1];
        }
        return a1;
        exception;
        aa;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private void e()
    {
        if (m.size() != 0) goto _L2; else goto _L1
_L1:
        return;
_L2:
        Object obj1;
        synchronized (m)
        {
            obj1 = new ArrayList(m);
            m.clear();
        }
        obj1 = ((ArrayList) (obj1)).iterator();
_L5:
        if (!((Iterator) (obj1)).hasNext()) goto _L1; else goto _L3
_L3:
        f f1 = (f)((Iterator) (obj1)).next();
        Object obj2 = b(f1.g);
        if (((g) (obj2)).c <= f1.h || ((g) (obj2)).e(f1.h).a != f1.a) goto _L5; else goto _L4
_L4:
        ((g) (obj2)).a(f1.h);
        synchronized (l)
        {
            l.d(Long.valueOf(f1.a));
        }
        IOException ioexception;
        a(((g) (obj2)), false);
        if (r != null)
        {
            r.a(f1.a);
        }
          goto _L5
_L7:
        try
        {
            throw exception1;
        }
        // Misplaced declaration of an exception variable
        catch (IOException ioexception)
        {
            obj = String.valueOf("Cache:");
            obj2 = String.valueOf(f);
            if (((String) (obj2)).length() != 0)
            {
                obj = ((String) (obj)).concat(((String) (obj2)));
            } else
            {
                obj = new String(((String) (obj)));
            }
        }
        if (ab.a(((String) (obj)), 6))
        {
            obj = String.valueOf("Cache:");
            String s1 = String.valueOf(f);
            if (s1.length() != 0)
            {
                obj = ((String) (obj)).concat(s1);
            } else
            {
                obj = new String(((String) (obj)));
            }
            Log.e(((String) (obj)), "Error reading in the cache", ioexception);
        }
        if (true) goto _L5; else goto _L6
_L6:
          goto _L1
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        exception1;
        obj;
        JVM INSTR monitorexit ;
          goto _L7
    }

    private String f(int i1)
    {
        String s1 = f;
        return (new StringBuilder(String.valueOf(s1).length() + 12)).append(s1).append(".").append(i1).toString();
    }

    private void f()
    {
        while (m.size() == 0 || !n.tryLock()) 
        {
            return;
        }
        e();
        n.unlock();
        return;
        Exception exception;
        exception;
        n.unlock();
        throw exception;
    }

    private void g()
    {
        synchronized (h)
        {
            h.a(8192L);
            i.a(h);
            h.a();
        }
        return;
        exception;
        a1;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private g h()
    {
        Object obj;
        int i1;
        int j1;
        boolean flag = false;
        if (s == null)
        {
            throw new AssertionError();
        }
        i1 = 0;
        do
        {
            if (i1 >= i.f)
            {
                break MISSING_BLOCK_LABEL_367;
            }
            if (i.c[i1] < a.d && i.b[i1] <= 0x7ffffff)
            {
                long l1;
                long l2;
                try
                {
                    obj = b(i1);
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    if (ab.a(b, 6))
                    {
                        Log.e(b, (new StringBuilder(31)).append("allocateShardToUse: ").append(i1).toString(), ((Throwable) (obj)));
                    }
                    obj = null;
                }
                break MISSING_BLOCK_LABEL_71;
            }
            i1++;
        } while (true);
_L2:
        j1 = i1;
        if (i1 == -1)
        {
            boolean flag1;
            if (i.b() >= 20)
            {
label0:
                {
                    l1 = com.google.android.m4b.maps.al.b.b();
                    l2 = i.a();
                    if ((long)((double)(l1 + l2) * 0.25D) < l2)
                    {
                        flag1 = true;
                        break label0;
                    }
                }
            }
            flag1 = false;
            b(flag1);
            if (a.e && flag1)
            {
                for (i1 = ((flag) ? 1 : 0); i1 < 2; i1++)
                {
                    j1 = i.a(s);
                    if (j1 != -1)
                    {
                        d(j1);
                        if (k[j1] != null)
                        {
                            k[j1].a.close();
                            k[j1] = null;
                        }
                        g.b(f(j1));
                    }
                }

            }
            i1 = a(flag1);
            j1 = i1;
            if (i1 == -1)
            {
                if (ab.a(b, 6))
                {
                    Log.e(b, "Tile store full, unable to allocate shard");
                }
                return null;
            }
        }
        if (obj == null || ((g) (obj)).c != i.c[j1])
        {
            obj = new g(j1);
        }
        s.add(Integer.valueOf(j1));
        return ((g) (obj));
        obj = null;
        i1 = -1;
        if (true) goto _L2; else goto _L1
_L1:
    }

    private static int i()
    {
        return (int)(System.currentTimeMillis() / 1000L);
    }

    public final int a()
    {
        int j1;
        j1 = 0;
        o.readLock().lock();
        i i1 = i;
        int k1 = 0;
_L2:
        int l1;
        if (j1 >= i1.f)
        {
            break; /* Loop/switch isn't completed */
        }
        l1 = i1.d[j1];
        k1 += l1;
        j1++;
        if (true) goto _L2; else goto _L1
_L1:
        o.readLock().unlock();
        return k1;
        Exception exception;
        exception;
        o.readLock().unlock();
        throw exception;
    }

    public final int a(long l1, String s1, int i1)
    {
        n.lock();
        s1 = b(c(l1, s1));
        if (s1 == null)
        {
            n.unlock();
            return -1;
        }
        int j1;
        j1 = i.e[((h) (s1)).a.b];
        f f1 = ((h) (s1)).b;
        i1 = com.google.android.m4b.maps.bq.g.a(f1.c, i1) & 0x1f;
        f1 = new f(f1.a, f1.b, f1.d, f1.e, i1, f1.f, f1.g, f1.h);
        ((h) (s1)).a.a(f1, ((h) (s1)).c);
        a(((h) (s1)).a, true);
        if (j1 != 0)
        {
            break MISSING_BLOCK_LABEL_165;
        }
        if (i.e[((h) (s1)).a.b] == 1)
        {
            b(false);
        }
        n.unlock();
        return i1;
        s1;
        n.unlock();
        throw s1;
    }

    public final int a(Collection collection)
    {
        n.lock();
        boolean flag = p;
        if (flag)
        {
            s = null;
            n.unlock();
            return -1;
        }
        Object obj1;
        obj1 = b(collection);
        e();
        collection = ((Collection) (obj1)).iterator();
        int i1 = 0;
        while (collection.hasNext()) 
        {
            c c1 = (c)collection.next();
            int j1 = c1.d.length;
            i1 = c1.b.length + j1 + i1;
        }
        byte abyte0[];
        abyte0 = new byte[Math.min(i1, 0x20000)];
        s = new HashSet();
        collection = h();
        if (collection == null)
        {
            s = null;
            n.unlock();
            return -1;
        }
        Object obj;
        ArrayList arraylist;
        arraylist = new ArrayList();
        obj = new e(e(((g) (collection)).b), collection.a(), abyte0);
        obj1 = ((Collection) (obj1)).iterator();
_L2:
        Object obj2;
        if (!((Iterator) (obj1)).hasNext())
        {
            break MISSING_BLOCK_LABEL_465;
        }
        obj2 = (c)((Iterator) (obj1)).next();
        i1 = ((c) (obj2)).c;
        if (((g) (collection)).c < a.d && collection.a() <= 0x7ffffff)
        {
            break MISSING_BLOCK_LABEL_361;
        }
        a(((e) (obj)), ((g) (collection)));
        if (r != null)
        {
            long l1;
            for (obj = arraylist.iterator(); ((Iterator) (obj)).hasNext(); r.a(l1, ((g) (collection)).b))
            {
                l1 = ((Long)((Iterator) (obj)).next()).longValue();
            }

        }
          goto _L1
        collection;
        s = null;
        n.unlock();
        throw collection;
_L1:
        arraylist.clear();
        collection = h();
        if (collection == null)
        {
            s = null;
            n.unlock();
            return -1;
        }
        obj = new e(e(((g) (collection)).b), collection.a(), abyte0);
        ((e) (obj)).a(((c) (obj2)).b);
        ((e) (obj)).a(((c) (obj2)).d);
        obj2 = new f(((c) (obj2)).a.a, collection.a(), ((c) (obj2)).b.length, ((c) (obj2)).d.length, i1 & 0x1f, c(((c) (obj2)).d, 0, ((c) (obj2)).d.length), ((g) (collection)).b, ((g) (collection)).c);
        collection.a(((f) (obj2)));
        arraylist.add(Long.valueOf(((f) (obj2)).a));
          goto _L2
        a(((e) (obj)), ((g) (collection)));
        if (r != null)
        {
            long l2;
            for (Iterator iterator = arraylist.iterator(); iterator.hasNext(); r.a(l2, ((g) (collection)).b))
            {
                l2 = ((Long)iterator.next()).longValue();
            }

        }
        s = null;
        n.unlock();
        return 0;
    }

    public final void a(int i1)
    {
        a(i1, a.a);
    }

    public final void a(int i1, Locale locale)
    {
        int j1;
        j1 = 0;
        n.lock();
        p = true;
        o.writeLock().lock();
        if (r != null)
        {
            r.a();
        }
        synchronized (l)
        {
            l.a(0);
        }
        m.clear();
_L1:
        if (j1 >= k.length)
        {
            break MISSING_BLOCK_LABEL_165;
        }
        if (k[j1] != null)
        {
            k[j1].a.close();
            k[j1] = null;
        }
        g.b(f(j1));
        j1++;
          goto _L1
        locale;
        e1;
        JVM INSTR monitorexit ;
        try
        {
            throw locale;
        }
        // Misplaced declaration of an exception variable
        catch (Locale locale) { }
        finally { }
        b();
        throw locale;
        o.writeLock().unlock();
        throw locale;
        locale;
        n.unlock();
        throw locale;
        String s1;
        com.google.android.m4b.maps.au.a.a a1;
        String s2;
        h.a.close();
        a1 = g;
        s1 = String.valueOf(f);
        s2 = String.valueOf(".m");
        if (s2.length() == 0) goto _L3; else goto _L2
_L2:
        s1 = s1.concat(s2);
_L4:
        a1.b(s1);
        a1 = g;
        s1 = String.valueOf(f);
        String s3 = String.valueOf(".m");
        if (s3.length() == 0)
        {
            break MISSING_BLOCK_LABEL_473;
        }
        s1 = s1.concat(s3);
_L5:
        h = a1.a(s1);
        int k1 = a(u);
        int l1 = a.b;
        int i2 = a.c;
        int j2 = a.d;
        boolean flag = a.e;
        com.google.android.m4b.maps.ay.k.a();
        a = new b((k1 << 16) + 20, l1, i2, j2, flag, i1, com.google.android.m4b.maps.ay.k.b(), locale);
        locale = i;
        Arrays.fill(((i) (locale)).a, 0);
        Arrays.fill(((i) (locale)).b, 0);
        Arrays.fill(((i) (locale)).c, 0);
        Arrays.fill(((i) (locale)).d, 0);
        Arrays.fill(((i) (locale)).e, 0);
        locale.f = 0;
        locale.g = 0;
        Arrays.fill(j.a, (byte)0);
        a(a, i, j, h);
        h.a();
        p = false;
        o.writeLock().unlock();
        n.unlock();
        return;
_L3:
        s1 = new String(s1);
          goto _L4
        s1 = new String(s1);
          goto _L5
    }

    public final byte[] a(long l1, String s1)
    {
        o.readLock().lock();
        boolean flag = p;
        if (flag)
        {
            o.readLock().unlock();
            f();
            return null;
        }
        s1 = c(c(l1, s1));
        o.readLock().unlock();
        f();
        return s1;
        s1;
        o.readLock().unlock();
        f();
        throw s1;
    }

    public final void b()
    {
        Object obj;
        obj = null;
        n.lock();
        boolean flag = p;
        if (flag)
        {
            n.unlock();
            return;
        }
        p = true;
        o.writeLock().lock();
        Object obj1;
        int i1;
        com.google.android.m4b.maps.au.a a1;
        try
        {
            g();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        try
        {
            h.a.close();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        i1 = 0;
_L2:
        if (i1 >= k.length)
        {
            break MISSING_BLOCK_LABEL_110;
        }
        a1 = k[i1];
        obj1 = obj;
        if (a1 == null)
        {
            break MISSING_BLOCK_LABEL_169;
        }
        try
        {
            k[i1].a.close();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        k[i1] = null;
        obj1 = obj;
        break MISSING_BLOCK_LABEL_169;
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_139;
        }
        throw obj;
        obj;
        o.writeLock().unlock();
        throw obj;
        obj;
        n.unlock();
        throw obj;
        o.writeLock().unlock();
        n.unlock();
        return;
        i1++;
        obj = obj1;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public final boolean b(long l1, String s1)
    {
        o.readLock().lock();
        s1 = a(c(l1, s1));
        boolean flag;
        if (s1 != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        o.readLock().unlock();
        f();
        return flag;
        s1;
        o.readLock().unlock();
        f();
        throw s1;
    }

    public String toString()
    {
        String s1 = f;
        int i1 = a.f;
        String s2 = String.valueOf(a.h);
        boolean flag = a.e;
        int j1 = a();
        int k1 = d();
        int l1 = a.c;
        return (new StringBuilder(String.valueOf(s1).length() + 94 + String.valueOf(s2).length())).append("[").append(s1).append(" ver:").append(i1).append(" locale: ").append(s2).append(" auto:").append(flag).append(" size:").append(j1).append(" max:").append(k1).append(" max_shards:").append(l1).append("]").toString();
    }

}
