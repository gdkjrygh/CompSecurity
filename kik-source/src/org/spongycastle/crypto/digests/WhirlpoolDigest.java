// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto.digests;

import org.spongycastle.crypto.ExtendedDigest;
import org.spongycastle.util.Arrays;

public final class WhirlpoolDigest
    implements ExtendedDigest
{

    private static final int a[] = {
        24, 35, 198, 232, 135, 184, 1, 79, 54, 166, 
        210, 245, 121, 111, 145, 82, 96, 188, 155, 142, 
        163, 12, 123, 53, 29, 224, 215, 194, 46, 75, 
        254, 87, 21, 119, 55, 229, 159, 240, 74, 218, 
        88, 201, 41, 10, 177, 160, 107, 133, 189, 93, 
        16, 244, 203, 62, 5, 103, 228, 39, 65, 139, 
        167, 125, 149, 216, 251, 238, 124, 102, 221, 23, 
        71, 158, 202, 45, 191, 7, 173, 90, 131, 51, 
        99, 2, 170, 113, 200, 25, 73, 217, 242, 227, 
        91, 136, 154, 38, 50, 176, 233, 15, 213, 128, 
        190, 205, 52, 72, 255, 122, 144, 95, 32, 104, 
        26, 174, 180, 84, 147, 34, 100, 241, 115, 18, 
        64, 8, 195, 236, 219, 161, 141, 61, 151, 0, 
        207, 43, 118, 130, 214, 27, 181, 175, 106, 80, 
        69, 243, 48, 239, 63, 85, 162, 234, 101, 186, 
        47, 192, 222, 28, 253, 77, 146, 117, 6, 138, 
        178, 230, 14, 31, 98, 212, 168, 150, 249, 197, 
        37, 89, 132, 114, 57, 76, 94, 120, 56, 140, 
        209, 165, 226, 97, 179, 33, 156, 30, 67, 199, 
        252, 4, 81, 153, 109, 13, 250, 223, 126, 36, 
        59, 171, 206, 17, 143, 78, 183, 235, 60, 129, 
        148, 247, 185, 19, 44, 211, 231, 110, 196, 3, 
        86, 68, 127, 169, 42, 187, 193, 83, 220, 11, 
        157, 108, 49, 116, 246, 70, 172, 137, 20, 225, 
        22, 58, 105, 9, 112, 182, 208, 237, 204, 66, 
        152, 164, 40, 92, 248, 134
    };
    private static final long b[] = new long[256];
    private static final long c[] = new long[256];
    private static final long d[] = new long[256];
    private static final long e[] = new long[256];
    private static final long f[] = new long[256];
    private static final long g[] = new long[256];
    private static final long h[] = new long[256];
    private static final long i[] = new long[256];
    private static final short s[];
    private final long j[];
    private byte k[];
    private int l;
    private short m[];
    private long n[];
    private long o[];
    private long p[];
    private long q[];
    private long r[];

    public WhirlpoolDigest()
    {
        j = new long[11];
        k = new byte[64];
        l = 0;
        m = new short[32];
        n = new long[8];
        o = new long[8];
        p = new long[8];
        q = new long[8];
        r = new long[8];
        for (int i1 = 0; i1 < 256; i1++)
        {
            int k1 = a[i1];
            int i2 = a(k1 << 1);
            int j2 = a(i2 << 1);
            int k2 = j2 ^ k1;
            int l2 = a(j2 << 1);
            int i3 = l2 ^ k1;
            b[i1] = a(k1, k1, j2, k1, l2, k2, i2, i3);
            c[i1] = a(i3, k1, k1, j2, k1, l2, k2, i2);
            d[i1] = a(i2, i3, k1, k1, j2, k1, l2, k2);
            e[i1] = a(k2, i2, i3, k1, k1, j2, k1, l2);
            f[i1] = a(l2, k2, i2, i3, k1, k1, j2, k1);
            g[i1] = a(k1, l2, k2, i2, i3, k1, k1, j2);
            h[i1] = a(j2, k1, l2, k2, i2, i3, k1, k1);
            i[i1] = a(k1, j2, k1, l2, k2, i2, i3, k1);
        }

        j[0] = 0L;
        for (int j1 = 1; j1 <= 10; j1++)
        {
            int l1 = (j1 - 1) * 8;
            j[j1] = b[l1] & 0xff00000000000000L ^ c[l1 + 1] & 0xff000000000000L ^ d[l1 + 2] & 0xff0000000000L ^ e[l1 + 3] & 0xff00000000L ^ f[l1 + 4] & 0xff000000L ^ g[l1 + 5] & 0xff0000L ^ h[l1 + 6] & 65280L ^ i[l1 + 7] & 255L;
        }

    }

    public WhirlpoolDigest(WhirlpoolDigest whirlpooldigest)
    {
        j = new long[11];
        k = new byte[64];
        l = 0;
        m = new short[32];
        n = new long[8];
        o = new long[8];
        p = new long[8];
        q = new long[8];
        r = new long[8];
        System.arraycopy(whirlpooldigest.j, 0, j, 0, j.length);
        System.arraycopy(whirlpooldigest.k, 0, k, 0, k.length);
        l = whirlpooldigest.l;
        System.arraycopy(whirlpooldigest.m, 0, m, 0, m.length);
        System.arraycopy(whirlpooldigest.n, 0, n, 0, n.length);
        System.arraycopy(whirlpooldigest.o, 0, o, 0, o.length);
        System.arraycopy(whirlpooldigest.p, 0, p, 0, p.length);
        System.arraycopy(whirlpooldigest.q, 0, q, 0, q.length);
        System.arraycopy(whirlpooldigest.r, 0, r, 0, r.length);
    }

    private static int a(int i1)
    {
        int j1 = i1;
        if ((long)i1 >= 256L)
        {
            j1 = i1 ^ 0x11d;
        }
        return j1;
    }

    private static long a(int i1, int j1, int k1, int l1, int i2, int j2, int k2, int l2)
    {
        return (long)i1 << 56 ^ (long)j1 << 48 ^ (long)k1 << 40 ^ (long)l1 << 32 ^ (long)i2 << 24 ^ (long)j2 << 16 ^ (long)k2 << 8 ^ (long)l2;
    }

    private void e()
    {
        for (int i1 = 0; i1 < r.length; i1++)
        {
            long al[] = q;
            byte abyte0[] = k;
            int i2 = i1 * 8;
            long l2 = abyte0[i2 + 0];
            long l4 = abyte0[i2 + 1];
            long l6 = abyte0[i2 + 2];
            long l7 = abyte0[i2 + 3];
            long l8 = abyte0[i2 + 4];
            long l9 = abyte0[i2 + 5];
            long l10 = abyte0[i2 + 6];
            al[i1] = (long)abyte0[i2 + 7] & 255L | ((l2 & 255L) << 56 | (l4 & 255L) << 48 | (l6 & 255L) << 40 | (l7 & 255L) << 32 | (l8 & 255L) << 24 | (l9 & 255L) << 16 | (l10 & 255L) << 8);
        }

        for (int j1 = 0; j1 < 8; j1++)
        {
            long al1[] = r;
            long l3 = q[j1];
            long al6[] = o;
            long l5 = n[j1];
            al6[j1] = l5;
            al1[j1] = l3 ^ l5;
        }

        for (int k1 = 1; k1 <= 10; k1++)
        {
            for (int j2 = 0; j2 < 8; j2++)
            {
                p[j2] = 0L;
                long al2[] = p;
                al2[j2] = al2[j2] ^ b[(int)(o[j2 + 0 & 7] >>> 56) & 0xff];
                al2 = p;
                al2[j2] = al2[j2] ^ c[(int)(o[j2 - 1 & 7] >>> 48) & 0xff];
                al2 = p;
                al2[j2] = al2[j2] ^ d[(int)(o[j2 - 2 & 7] >>> 40) & 0xff];
                al2 = p;
                al2[j2] = al2[j2] ^ e[(int)(o[j2 - 3 & 7] >>> 32) & 0xff];
                al2 = p;
                al2[j2] = al2[j2] ^ f[(int)(o[j2 - 4 & 7] >>> 24) & 0xff];
                al2 = p;
                al2[j2] = al2[j2] ^ g[(int)(o[j2 - 5 & 7] >>> 16) & 0xff];
                al2 = p;
                al2[j2] = al2[j2] ^ h[(int)(o[j2 - 6 & 7] >>> 8) & 0xff];
                al2 = p;
                al2[j2] = al2[j2] ^ i[(int)o[j2 - 7 & 7] & 0xff];
            }

            System.arraycopy(p, 0, o, 0, o.length);
            long al3[] = o;
            al3[0] = al3[0] ^ j[k1];
            for (int k2 = 0; k2 < 8; k2++)
            {
                p[k2] = o[k2];
                long al4[] = p;
                al4[k2] = al4[k2] ^ b[(int)(r[k2 + 0 & 7] >>> 56) & 0xff];
                al4 = p;
                al4[k2] = al4[k2] ^ c[(int)(r[k2 - 1 & 7] >>> 48) & 0xff];
                al4 = p;
                al4[k2] = al4[k2] ^ d[(int)(r[k2 - 2 & 7] >>> 40) & 0xff];
                al4 = p;
                al4[k2] = al4[k2] ^ e[(int)(r[k2 - 3 & 7] >>> 32) & 0xff];
                al4 = p;
                al4[k2] = al4[k2] ^ f[(int)(r[k2 - 4 & 7] >>> 24) & 0xff];
                al4 = p;
                al4[k2] = al4[k2] ^ g[(int)(r[k2 - 5 & 7] >>> 16) & 0xff];
                al4 = p;
                al4[k2] = al4[k2] ^ h[(int)(r[k2 - 6 & 7] >>> 8) & 0xff];
                al4 = p;
                al4[k2] = al4[k2] ^ i[(int)r[k2 - 7 & 7] & 0xff];
            }

            System.arraycopy(p, 0, r, 0, r.length);
        }

        for (int l1 = 0; l1 < 8; l1++)
        {
            long al5[] = n;
            al5[l1] = al5[l1] ^ (r[l1] ^ q[l1]);
        }

        l = 0;
        Arrays.a(k, (byte)0);
    }

    public final int a(byte abyte0[], int i1)
    {
        byte abyte1[] = new byte[32];
        for (int j1 = 0; j1 < 32; j1++)
        {
            abyte1[j1] = (byte)(m[j1] & 0xff);
        }

        byte abyte2[] = k;
        int k1 = l;
        l = k1 + 1;
        abyte2[k1] = (byte)(abyte2[k1] | 0x80);
        if (l == k.length)
        {
            e();
        }
        if (l > 32)
        {
            while (l != 0) 
            {
                a((byte)0);
            }
        }
        while (l <= 32) 
        {
            a((byte)0);
        }
        System.arraycopy(abyte1, 0, k, 32, 32);
        e();
        for (int l1 = 0; l1 < 8; l1++)
        {
            long l2 = n[l1];
            for (int i2 = 0; i2 < 8; i2++)
            {
                abyte0[i1 + l1 * 8 + i2] = (byte)(int)(l2 >> 56 - i2 * 8 & 255L);
            }

        }

        c();
        return 64;
    }

    public final String a()
    {
        return "Whirlpool";
    }

    public final void a(byte byte0)
    {
        k[l] = byte0;
        l = l + 1;
        if (l == k.length)
        {
            e();
        }
        int j1 = 0;
        for (int i1 = m.length - 1; i1 >= 0; i1--)
        {
            int k1 = (m[i1] & 0xff) + s[i1] + j1;
            j1 = k1 >>> 8;
            m[i1] = (short)(k1 & 0xff);
        }

    }

    public final void a(byte abyte0[], int i1, int j1)
    {
        for (; j1 > 0; j1--)
        {
            a(abyte0[i1]);
            i1++;
        }

    }

    public final int b()
    {
        return 64;
    }

    public final void c()
    {
        l = 0;
        Arrays.a(m);
        Arrays.a(k, (byte)0);
        Arrays.a(n);
        Arrays.a(o);
        Arrays.a(p);
        Arrays.a(q);
        Arrays.a(r);
    }

    public final int d()
    {
        return 64;
    }

    static 
    {
        short aword0[] = new short[32];
        s = aword0;
        aword0[31] = 8;
    }
}
