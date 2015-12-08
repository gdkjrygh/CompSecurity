// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.digests;

import org.bouncycastle.crypto.ExtendedDigest;
import org.bouncycastle.crypto.util.Pack;

public abstract class LongDigest
    implements ExtendedDigest
{

    static final long i[] = {
        0x428a2f98d728ae22L, 0x7137449123ef65cdL, 0xb5c0fbcfec4d3b2fL, 0xe9b5dba58189dbbcL, 0x3956c25bf348b538L, 0x59f111f1b605d019L, 0x923f82a4af194f9bL, 0xab1c5ed5da6d8118L, 0xd807aa98a3030242L, 0x12835b0145706fbeL, 
        0x243185be4ee4b28cL, 0x550c7dc3d5ffb4e2L, 0x72be5d74f27b896fL, 0x80deb1fe3b1696b1L, 0x9bdc06a725c71235L, 0xc19bf174cf692694L, 0xe49b69c19ef14ad2L, 0xefbe4786384f25e3L, 0xfc19dc68b8cd5b5L, 0x240ca1cc77ac9c65L, 
        0x2de92c6f592b0275L, 0x4a7484aa6ea6e483L, 0x5cb0a9dcbd41fbd4L, 0x76f988da831153b5L, 0x983e5152ee66dfabL, 0xa831c66d2db43210L, 0xb00327c898fb213fL, 0xbf597fc7beef0ee4L, 0xc6e00bf33da88fc2L, 0xd5a79147930aa725L, 
        0x6ca6351e003826fL, 0x142929670a0e6e70L, 0x27b70a8546d22ffcL, 0x2e1b21385c26c926L, 0x4d2c6dfc5ac42aedL, 0x53380d139d95b3dfL, 0x650a73548baf63deL, 0x766a0abb3c77b2a8L, 0x81c2c92e47edaee6L, 0x92722c851482353bL, 
        0xa2bfe8a14cf10364L, 0xa81a664bbc423001L, 0xc24b8b70d0f89791L, 0xc76c51a30654be30L, 0xd192e819d6ef5218L, 0xd69906245565a910L, 0xf40e35855771202aL, 0x106aa07032bbd1b8L, 0x19a4c116b8d2d0c8L, 0x1e376c085141ab53L, 
        0x2748774cdf8eeb99L, 0x34b0bcb5e19b48a8L, 0x391c0cb3c5c95a63L, 0x4ed8aa4ae3418acbL, 0x5b9cca4f7763e373L, 0x682e6ff3d6b2b8a3L, 0x748f82ee5defb2fcL, 0x78a5636f43172f60L, 0x84c87814a1f0ab72L, 0x8cc702081a6439ecL, 
        0x90befffa23631e28L, 0xa4506cebde82bde9L, 0xbef9a3f7b2c67915L, 0xc67178f2e372532bL, 0xca273eceea26619cL, 0xd186b8c721c0c207L, 0xeada7dd6cde0eb1eL, 0xf57d4f7fee6ed178L, 0x6f067aa72176fbaL, 0xa637dc5a2c898a6L, 
        0x113f9804bef90daeL, 0x1b710b35131c471bL, 0x28db77f523047d84L, 0x32caab7b40c72493L, 0x3c9ebe0a15c9bebcL, 0x431d67c49c100d4cL, 0x4cc5d4becb3e42b6L, 0x597f299cfc657e2aL, 0x5fcb6fab3ad6faecL, 0x6c44198c4a475817L
    };
    protected long a;
    protected long b;
    protected long c;
    protected long d;
    protected long e;
    protected long f;
    protected long g;
    protected long h;
    private byte j[];
    private int k;
    private long l;
    private long m;
    private long n[];
    private int o;

    protected LongDigest()
    {
        n = new long[80];
        j = new byte[8];
        k = 0;
        reset();
    }

    protected LongDigest(LongDigest longdigest)
    {
        n = new long[80];
        j = new byte[longdigest.j.length];
        System.arraycopy(longdigest.j, 0, j, 0, longdigest.j.length);
        k = longdigest.k;
        l = longdigest.l;
        m = longdigest.m;
        a = longdigest.a;
        b = longdigest.b;
        c = longdigest.c;
        d = longdigest.d;
        e = longdigest.e;
        f = longdigest.f;
        g = longdigest.g;
        h = longdigest.h;
        System.arraycopy(longdigest.n, 0, n, 0, longdigest.n.length);
        o = longdigest.o;
    }

    private long Ch(long l1, long l2, long l3)
    {
        return l1 & l2 ^ (-1L ^ l1) & l3;
    }

    private long Maj(long l1, long l2, long l3)
    {
        return l1 & l2 ^ l1 & l3 ^ l2 & l3;
    }

    private long Sigma0(long l1)
    {
        return (l1 << 63 | l1 >>> 1) ^ (l1 << 56 | l1 >>> 8) ^ l1 >>> 7;
    }

    private long Sigma1(long l1)
    {
        return (l1 << 45 | l1 >>> 19) ^ (l1 << 3 | l1 >>> 61) ^ l1 >>> 6;
    }

    private long Sum0(long l1)
    {
        return (l1 << 36 | l1 >>> 28) ^ (l1 << 30 | l1 >>> 34) ^ (l1 << 25 | l1 >>> 39);
    }

    private long Sum1(long l1)
    {
        return (l1 << 50 | l1 >>> 14) ^ (l1 << 46 | l1 >>> 18) ^ (l1 << 23 | l1 >>> 41);
    }

    private void adjustByteCounts()
    {
        if (l > 0x1fffffffffffffffL)
        {
            m = m + (l >>> 61);
            l = l & 0x1fffffffffffffffL;
        }
    }

    public void finish()
    {
        adjustByteCounts();
        long l1 = l;
        long l2 = m;
        update((byte)-128);
        while (k != 0) 
        {
            update((byte)0);
        }
        processLength(l1 << 3, l2);
        processBlock();
    }

    public int getByteLength()
    {
        return 128;
    }

    protected void processBlock()
    {
        adjustByteCounts();
        for (int i1 = 16; i1 <= 79; i1++)
        {
            n[i1] = Sigma1(n[i1 - 2]) + n[i1 - 7] + Sigma0(n[i1 - 15]) + n[i1 - 16];
        }

        long l2 = a;
        long l4 = b;
        long l6 = c;
        long l8 = d;
        long l3 = e;
        long l5 = f;
        long l7 = g;
        long l9 = h;
        int j1 = 0;
        int l1 = 0;
        while (j1 < 10) 
        {
            long l10 = Sum1(l3);
            long l11 = Ch(l3, l5, l7);
            long l12 = i[l1];
            long al[] = n;
            int i2 = l1 + 1;
            l9 += al[l1] + (l10 + l11 + l12);
            l8 += l9;
            l10 = Sum0(l2);
            l9 = Maj(l2, l4, l6) + l10 + l9;
            l10 = Sum1(l8);
            l11 = Ch(l8, l3, l5);
            l12 = i[i2];
            al = n;
            l1 = i2 + 1;
            l7 += l11 + l10 + l12 + al[i2];
            l6 += l7;
            l10 = Sum0(l9);
            l7 = Maj(l9, l2, l4) + l10 + l7;
            l10 = Sum1(l6);
            l11 = Ch(l6, l8, l3);
            l12 = i[l1];
            al = n;
            i2 = l1 + 1;
            l5 += l11 + l10 + l12 + al[l1];
            l4 += l5;
            l10 = Sum0(l7);
            l5 = Maj(l7, l9, l2) + l10 + l5;
            l10 = Sum1(l4);
            l11 = Ch(l4, l6, l8);
            l12 = i[i2];
            al = n;
            l1 = i2 + 1;
            l3 += l11 + l10 + l12 + al[i2];
            l2 += l3;
            l10 = Sum0(l5);
            l3 = Maj(l5, l7, l9) + l10 + l3;
            l10 = Sum1(l2);
            l11 = Ch(l2, l4, l6);
            l12 = i[l1];
            al = n;
            i2 = l1 + 1;
            l10 = l8 + (l11 + l10 + l12 + al[l1]);
            l8 = l9 + l10;
            l10 += Sum0(l3) + Maj(l3, l5, l7);
            l9 = Sum1(l8);
            l11 = Ch(l8, l2, l4);
            l12 = i[i2];
            al = n;
            l1 = i2 + 1;
            l6 += l11 + l9 + l12 + al[i2];
            l7 += l6;
            l6 += Sum0(l10) + Maj(l10, l3, l5);
            l9 = Sum1(l7);
            l11 = Ch(l7, l8, l2);
            l12 = i[l1];
            al = n;
            i2 = l1 + 1;
            l4 += l11 + l9 + l12 + al[l1];
            l5 += l4;
            l4 += Sum0(l6) + Maj(l6, l10, l3);
            l9 = Sum1(l5);
            l2 = Ch(l5, l7, l8) + l9 + i[i2] + n[i2] + l2;
            l3 += l2;
            l9 = Sum0(l4);
            l11 = Maj(l4, l6, l10);
            j1++;
            l2 += l11 + l9;
            l1 = i2 + 1;
            l9 = l8;
            l8 = l10;
        }
        a = a + l2;
        b = b + l4;
        c = c + l6;
        d = d + l8;
        e = e + l3;
        f = f + l5;
        g = g + l7;
        h = h + l9;
        o = 0;
        for (int k1 = 0; k1 < 16; k1++)
        {
            n[k1] = 0L;
        }

    }

    protected void processLength(long l1, long l2)
    {
        if (o > 14)
        {
            processBlock();
        }
        n[14] = l2;
        n[15] = l1;
    }

    protected void processWord(byte abyte0[], int i1)
    {
        n[o] = Pack.bigEndianToLong(abyte0, i1);
        i1 = o + 1;
        o = i1;
        if (i1 == 16)
        {
            processBlock();
        }
    }

    public void reset()
    {
        boolean flag = false;
        l = 0L;
        m = 0L;
        k = 0;
        for (int i1 = 0; i1 < j.length; i1++)
        {
            j[i1] = 0;
        }

        o = 0;
        for (int j1 = ((flag) ? 1 : 0); j1 != n.length; j1++)
        {
            n[j1] = 0L;
        }

    }

    public void update(byte byte0)
    {
        byte abyte0[] = j;
        int i1 = k;
        k = i1 + 1;
        abyte0[i1] = byte0;
        if (k == j.length)
        {
            processWord(j, 0);
            k = 0;
        }
        l = l + 1L;
    }

    public void update(byte abyte0[], int i1, int j1)
    {
        int k1 = j1;
        int l1 = i1;
        do
        {
            i1 = l1;
            j1 = k1;
            if (k == 0)
            {
                break;
            }
            i1 = l1;
            j1 = k1;
            if (k1 <= 0)
            {
                break;
            }
            update(abyte0[l1]);
            l1++;
            k1--;
        } while (true);
        do
        {
            k1 = i1;
            l1 = j1;
            if (j1 <= j.length)
            {
                break;
            }
            processWord(abyte0, i1);
            i1 += j.length;
            j1 -= j.length;
            l = l + (long)j.length;
        } while (true);
        for (; l1 > 0; l1--)
        {
            update(abyte0[k1]);
            k1++;
        }

    }

}
