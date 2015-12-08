// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.digests;

import org.bouncycastle.crypto.util.Pack;

// Referenced classes of package org.bouncycastle.crypto.digests:
//            GeneralDigest

public class SHA224Digest extends GeneralDigest
{

    static final int a[] = {
        0x428a2f98, 0x71374491, 0xb5c0fbcf, 0xe9b5dba5, 0x3956c25b, 0x59f111f1, 0x923f82a4, 0xab1c5ed5, 0xd807aa98, 0x12835b01, 
        0x243185be, 0x550c7dc3, 0x72be5d74, 0x80deb1fe, 0x9bdc06a7, 0xc19bf174, 0xe49b69c1, 0xefbe4786, 0xfc19dc6, 0x240ca1cc, 
        0x2de92c6f, 0x4a7484aa, 0x5cb0a9dc, 0x76f988da, 0x983e5152, 0xa831c66d, 0xb00327c8, 0xbf597fc7, 0xc6e00bf3, 0xd5a79147, 
        0x6ca6351, 0x14292967, 0x27b70a85, 0x2e1b2138, 0x4d2c6dfc, 0x53380d13, 0x650a7354, 0x766a0abb, 0x81c2c92e, 0x92722c85, 
        0xa2bfe8a1, 0xa81a664b, 0xc24b8b70, 0xc76c51a3, 0xd192e819, 0xd6990624, 0xf40e3585, 0x106aa070, 0x19a4c116, 0x1e376c08, 
        0x2748774c, 0x34b0bcb5, 0x391c0cb3, 0x4ed8aa4a, 0x5b9cca4f, 0x682e6ff3, 0x748f82ee, 0x78a5636f, 0x84c87814, 0x8cc70208, 
        0x90befffa, 0xa4506ceb, 0xbef9a3f7, 0xc67178f2
    };
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j[];
    private int k;

    public SHA224Digest()
    {
        j = new int[64];
        reset();
    }

    public SHA224Digest(SHA224Digest sha224digest)
    {
        super(sha224digest);
        j = new int[64];
        b = sha224digest.b;
        c = sha224digest.c;
        d = sha224digest.d;
        e = sha224digest.e;
        f = sha224digest.f;
        g = sha224digest.g;
        h = sha224digest.h;
        i = sha224digest.i;
        System.arraycopy(sha224digest.j, 0, j, 0, sha224digest.j.length);
        k = sha224digest.k;
    }

    private int Ch(int l, int i1, int j1)
    {
        return l & i1 ^ ~l & j1;
    }

    private int Maj(int l, int i1, int j1)
    {
        return l & i1 ^ l & j1 ^ i1 & j1;
    }

    private int Sum0(int l)
    {
        return (l >>> 2 | l << 30) ^ (l >>> 13 | l << 19) ^ (l >>> 22 | l << 10);
    }

    private int Sum1(int l)
    {
        return (l >>> 6 | l << 26) ^ (l >>> 11 | l << 21) ^ (l >>> 25 | l << 7);
    }

    private int Theta0(int l)
    {
        return (l >>> 7 | l << 25) ^ (l >>> 18 | l << 14) ^ l >>> 3;
    }

    private int Theta1(int l)
    {
        return (l >>> 17 | l << 15) ^ (l >>> 19 | l << 13) ^ l >>> 10;
    }

    public int doFinal(byte abyte0[], int l)
    {
        finish();
        Pack.intToBigEndian(b, abyte0, l);
        Pack.intToBigEndian(c, abyte0, l + 4);
        Pack.intToBigEndian(d, abyte0, l + 8);
        Pack.intToBigEndian(e, abyte0, l + 12);
        Pack.intToBigEndian(f, abyte0, l + 16);
        Pack.intToBigEndian(g, abyte0, l + 20);
        Pack.intToBigEndian(h, abyte0, l + 24);
        reset();
        return 28;
    }

    public String getAlgorithmName()
    {
        return "SHA-224";
    }

    public int getDigestSize()
    {
        return 28;
    }

    protected void processBlock()
    {
        for (int l = 16; l <= 63; l++)
        {
            j[l] = Theta1(j[l - 2]) + j[l - 7] + Theta0(j[l - 15]) + j[l - 16];
        }

        int k1 = b;
        int i2 = c;
        int k2 = d;
        int j3 = e;
        int l1 = f;
        int j2 = g;
        int l2 = h;
        int k3 = i;
        int i1 = 0;
        int i3 = 0;
        for (; i1 < 8; i1++)
        {
            k3 += Sum1(l1) + Ch(l1, j2, l2) + a[i3] + j[i3];
            j3 += k3;
            k3 += Sum0(k1) + Maj(k1, i2, k2);
            i3++;
            l2 += Sum1(j3) + Ch(j3, l1, j2) + a[i3] + j[i3];
            k2 += l2;
            l2 += Sum0(k3) + Maj(k3, k1, i2);
            i3++;
            j2 += Sum1(k2) + Ch(k2, j3, l1) + a[i3] + j[i3];
            i2 += j2;
            j2 += Sum0(l2) + Maj(l2, k3, k1);
            i3++;
            l1 += Sum1(i2) + Ch(i2, k2, j3) + a[i3] + j[i3];
            k1 += l1;
            l1 += Sum0(j2) + Maj(j2, l2, k3);
            i3++;
            j3 += Sum1(k1) + Ch(k1, i2, k2) + a[i3] + j[i3];
            k3 += j3;
            j3 += Sum0(l1) + Maj(l1, j2, l2);
            i3++;
            k2 += Sum1(k3) + Ch(k3, k1, i2) + a[i3] + j[i3];
            l2 += k2;
            k2 += Sum0(j3) + Maj(j3, l1, j2);
            i3++;
            i2 += Sum1(l2) + Ch(l2, k3, k1) + a[i3] + j[i3];
            j2 += i2;
            i2 += Sum0(k2) + Maj(k2, j3, l1);
            i3++;
            k1 += Sum1(j2) + Ch(j2, l2, k3) + a[i3] + j[i3];
            l1 += k1;
            k1 += Sum0(i2) + Maj(i2, k2, j3);
            i3++;
        }

        b = b + k1;
        c = c + i2;
        d = d + k2;
        e = e + j3;
        f = f + l1;
        g = g + j2;
        h = h + l2;
        i = i + k3;
        k = 0;
        for (int j1 = 0; j1 < 16; j1++)
        {
            j[j1] = 0;
        }

    }

    protected void processLength(long l)
    {
        if (k > 14)
        {
            processBlock();
        }
        j[14] = (int)(l >>> 32);
        j[15] = (int)(-1L & l);
    }

    protected void processWord(byte abyte0[], int l)
    {
        byte byte0 = abyte0[l];
        int i1 = l + 1;
        l = abyte0[i1];
        int j1 = i1 + 1;
        i1 = abyte0[j1];
        j1 = abyte0[j1 + 1];
        j[k] = byte0 << 24 | (l & 0xff) << 16 | (i1 & 0xff) << 8 | j1 & 0xff;
        l = k + 1;
        k = l;
        if (l == 16)
        {
            processBlock();
        }
    }

    public void reset()
    {
        super.reset();
        b = 0xc1059ed8;
        c = 0x367cd507;
        d = 0x3070dd17;
        e = 0xf70e5939;
        f = 0xffc00b31;
        g = 0x68581511;
        h = 0x64f98fa7;
        i = 0xbefa4fa4;
        k = 0;
        for (int l = 0; l != j.length; l++)
        {
            j[l] = 0;
        }

    }

}
