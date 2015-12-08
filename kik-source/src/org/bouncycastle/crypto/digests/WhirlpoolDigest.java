// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.digests;

import org.bouncycastle.crypto.ExtendedDigest;
import org.bouncycastle.util.Arrays;

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
            int i2 = maskWithReductionPolynomial(k1 << 1);
            int j2 = maskWithReductionPolynomial(i2 << 1);
            int k2 = j2 ^ k1;
            int l2 = maskWithReductionPolynomial(j2 << 1);
            int i3 = l2 ^ k1;
            b[i1] = packIntoLong(k1, k1, j2, k1, l2, k2, i2, i3);
            c[i1] = packIntoLong(i3, k1, k1, j2, k1, l2, k2, i2);
            d[i1] = packIntoLong(i2, i3, k1, k1, j2, k1, l2, k2);
            e[i1] = packIntoLong(k2, i2, i3, k1, k1, j2, k1, l2);
            f[i1] = packIntoLong(l2, k2, i2, i3, k1, k1, j2, k1);
            g[i1] = packIntoLong(k1, l2, k2, i2, i3, k1, k1, j2);
            h[i1] = packIntoLong(j2, k1, l2, k2, i2, i3, k1, k1);
            i[i1] = packIntoLong(k1, j2, k1, l2, k2, i2, i3, k1);
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

    private long bytesToLongFromBuffer(byte abyte0[], int i1)
    {
        return ((long)abyte0[i1 + 0] & 255L) << 56 | ((long)abyte0[i1 + 1] & 255L) << 48 | ((long)abyte0[i1 + 2] & 255L) << 40 | ((long)abyte0[i1 + 3] & 255L) << 32 | ((long)abyte0[i1 + 4] & 255L) << 24 | ((long)abyte0[i1 + 5] & 255L) << 16 | ((long)abyte0[i1 + 6] & 255L) << 8 | (long)abyte0[i1 + 7] & 255L;
    }

    private void convertLongToByteArray(long l1, byte abyte0[], int i1)
    {
        for (int j1 = 0; j1 < 8; j1++)
        {
            abyte0[i1 + j1] = (byte)(int)(l1 >> 56 - j1 * 8 & 255L);
        }

    }

    private byte[] copyBitLength()
    {
        byte abyte0[] = new byte[32];
        for (int i1 = 0; i1 < 32; i1++)
        {
            abyte0[i1] = (byte)(m[i1] & 0xff);
        }

        return abyte0;
    }

    private void finish()
    {
        byte abyte0[] = copyBitLength();
        byte abyte1[] = k;
        int i1 = l;
        l = i1 + 1;
        abyte1[i1] = (byte)(abyte1[i1] | 0x80);
        if (l == k.length)
        {
            processFilledBuffer(k, 0);
        }
        if (l > 32)
        {
            while (l != 0) 
            {
                update((byte)0);
            }
        }
        while (l <= 32) 
        {
            update((byte)0);
        }
        System.arraycopy(abyte0, 0, k, 32, abyte0.length);
        processFilledBuffer(k, 0);
    }

    private void increment()
    {
        int j1 = 0;
        for (int i1 = m.length - 1; i1 >= 0; i1--)
        {
            int k1 = (m[i1] & 0xff) + s[i1] + j1;
            j1 = k1 >>> 8;
            m[i1] = (short)(k1 & 0xff);
        }

    }

    private int maskWithReductionPolynomial(int i1)
    {
        int j1 = i1;
        if ((long)i1 >= 256L)
        {
            j1 = i1 ^ 0x11d;
        }
        return j1;
    }

    private long packIntoLong(int i1, int j1, int k1, int l1, int i2, int j2, int k2, 
            int l2)
    {
        return (long)i1 << 56 ^ (long)j1 << 48 ^ (long)k1 << 40 ^ (long)l1 << 32 ^ (long)i2 << 24 ^ (long)j2 << 16 ^ (long)k2 << 8 ^ (long)l2;
    }

    private void processFilledBuffer(byte abyte0[], int i1)
    {
        for (i1 = 0; i1 < r.length; i1++)
        {
            q[i1] = bytesToLongFromBuffer(k, i1 * 8);
        }

        processBlock();
        l = 0;
        Arrays.a(k);
    }

    public final int doFinal(byte abyte0[], int i1)
    {
        finish();
        for (int j1 = 0; j1 < 8; j1++)
        {
            convertLongToByteArray(n[j1], abyte0, j1 * 8 + i1);
        }

        reset();
        return getDigestSize();
    }

    public final String getAlgorithmName()
    {
        return "Whirlpool";
    }

    public final int getByteLength()
    {
        return 64;
    }

    public final int getDigestSize()
    {
        return 64;
    }

    protected final void processBlock()
    {
        boolean flag = false;
        for (int i1 = 0; i1 < 8; i1++)
        {
            long al[] = r;
            long l1 = q[i1];
            long al5[] = o;
            long l2 = n[i1];
            al5[i1] = l2;
            al[i1] = l1 ^ l2;
        }

        int j1 = 1;
        int k1;
        do
        {
            k1 = ((flag) ? 1 : 0);
            if (j1 > 10)
            {
                break;
            }
            for (k1 = 0; k1 < 8; k1++)
            {
                p[k1] = 0L;
                long al1[] = p;
                al1[k1] = al1[k1] ^ b[(int)(o[k1 + 0 & 7] >>> 56) & 0xff];
                al1 = p;
                al1[k1] = al1[k1] ^ c[(int)(o[k1 - 1 & 7] >>> 48) & 0xff];
                al1 = p;
                al1[k1] = al1[k1] ^ d[(int)(o[k1 - 2 & 7] >>> 40) & 0xff];
                al1 = p;
                al1[k1] = al1[k1] ^ e[(int)(o[k1 - 3 & 7] >>> 32) & 0xff];
                al1 = p;
                al1[k1] = al1[k1] ^ f[(int)(o[k1 - 4 & 7] >>> 24) & 0xff];
                al1 = p;
                al1[k1] = al1[k1] ^ g[(int)(o[k1 - 5 & 7] >>> 16) & 0xff];
                al1 = p;
                al1[k1] = al1[k1] ^ h[(int)(o[k1 - 6 & 7] >>> 8) & 0xff];
                al1 = p;
                al1[k1] = al1[k1] ^ i[(int)o[k1 - 7 & 7] & 0xff];
            }

            System.arraycopy(p, 0, o, 0, o.length);
            long al2[] = o;
            al2[0] = al2[0] ^ j[j1];
            for (k1 = 0; k1 < 8; k1++)
            {
                p[k1] = o[k1];
                long al3[] = p;
                al3[k1] = al3[k1] ^ b[(int)(r[k1 + 0 & 7] >>> 56) & 0xff];
                al3 = p;
                al3[k1] = al3[k1] ^ c[(int)(r[k1 - 1 & 7] >>> 48) & 0xff];
                al3 = p;
                al3[k1] = al3[k1] ^ d[(int)(r[k1 - 2 & 7] >>> 40) & 0xff];
                al3 = p;
                al3[k1] = al3[k1] ^ e[(int)(r[k1 - 3 & 7] >>> 32) & 0xff];
                al3 = p;
                al3[k1] = al3[k1] ^ f[(int)(r[k1 - 4 & 7] >>> 24) & 0xff];
                al3 = p;
                al3[k1] = al3[k1] ^ g[(int)(r[k1 - 5 & 7] >>> 16) & 0xff];
                al3 = p;
                al3[k1] = al3[k1] ^ h[(int)(r[k1 - 6 & 7] >>> 8) & 0xff];
                al3 = p;
                al3[k1] = al3[k1] ^ i[(int)r[k1 - 7 & 7] & 0xff];
            }

            System.arraycopy(p, 0, r, 0, r.length);
            j1++;
        } while (true);
        for (; k1 < 8; k1++)
        {
            long al4[] = n;
            al4[k1] = al4[k1] ^ (r[k1] ^ q[k1]);
        }

    }

    public final void reset()
    {
        l = 0;
        Arrays.a(m);
        Arrays.a(k);
        Arrays.a(n);
        Arrays.a(o);
        Arrays.a(p);
        Arrays.a(q);
        Arrays.a(r);
    }

    public final void update(byte byte0)
    {
        k[l] = byte0;
        l = l + 1;
        if (l == k.length)
        {
            processFilledBuffer(k, 0);
        }
        increment();
    }

    public final void update(byte abyte0[], int i1, int j1)
    {
        for (; j1 > 0; j1--)
        {
            update(abyte0[i1]);
            i1++;
        }

    }

    static 
    {
        short aword0[] = new short[32];
        s = aword0;
        aword0[31] = 8;
    }
}
