// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.digests;

import org.bouncycastle.crypto.util.Pack;

// Referenced classes of package org.bouncycastle.crypto.digests:
//            GeneralDigest

public class SHA1Digest extends GeneralDigest
{

    private int a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f[];
    private int g;

    public SHA1Digest()
    {
        f = new int[80];
        reset();
    }

    public SHA1Digest(SHA1Digest sha1digest)
    {
        super(sha1digest);
        f = new int[80];
        a = sha1digest.a;
        b = sha1digest.b;
        c = sha1digest.c;
        d = sha1digest.d;
        e = sha1digest.e;
        System.arraycopy(sha1digest.f, 0, f, 0, sha1digest.f.length);
        g = sha1digest.g;
    }

    private int f(int i, int j, int k)
    {
        return i & j | ~i & k;
    }

    private int g(int i, int j, int k)
    {
        return i & j | i & k | j & k;
    }

    private int h(int i, int j, int k)
    {
        return i ^ j ^ k;
    }

    public int doFinal(byte abyte0[], int i)
    {
        finish();
        Pack.intToBigEndian(a, abyte0, i);
        Pack.intToBigEndian(b, abyte0, i + 4);
        Pack.intToBigEndian(c, abyte0, i + 8);
        Pack.intToBigEndian(d, abyte0, i + 12);
        Pack.intToBigEndian(e, abyte0, i + 16);
        reset();
        return 20;
    }

    public String getAlgorithmName()
    {
        return "SHA-1";
    }

    public int getDigestSize()
    {
        return 20;
    }

    protected void processBlock()
    {
        for (int i = 16; i < 80; i++)
        {
            int i1 = f[i - 3] ^ f[i - 8] ^ f[i - 14] ^ f[i - 16];
            f[i] = i1 >>> 31 | i1 << 1;
        }

        int l1 = a;
        int j2 = b;
        int j = c;
        int j1 = d;
        int i2 = e;
        int k1 = 0;
        for (int k2 = 0; k2 < 4; k2++)
        {
            int k4 = f(j2, j, j1);
            int ai[] = f;
            int k3 = k1 + 1;
            i2 = ai[k1] + ((l1 << 5 | l1 >>> 27) + k4) + 0x5a827999 + i2;
            k1 = j2 >>> 2 | j2 << 30;
            k4 = f(l1, k1, j);
            ai = f;
            j2 = k3 + 1;
            j1 += (i2 << 5 | i2 >>> 27) + k4 + ai[k3] + 0x5a827999;
            l1 = l1 >>> 2 | l1 << 30;
            k4 = f(i2, l1, k1);
            ai = f;
            k3 = j2 + 1;
            j += (j1 << 5 | j1 >>> 27) + k4 + ai[j2] + 0x5a827999;
            i2 = i2 << 30 | i2 >>> 2;
            j2 = f(j1, i2, l1);
            ai = f;
            k4 = k3 + 1;
            j2 = k1 + ((j << 5 | j >>> 27) + j2 + ai[k3] + 0x5a827999);
            j1 = j1 >>> 2 | j1 << 30;
            k3 = f(j, j1, i2);
            ai = f;
            k1 = k4 + 1;
            l1 += k3 + (j2 << 5 | j2 >>> 27) + ai[k4] + 0x5a827999;
            j = j >>> 2 | j << 30;
        }

        for (int l2 = 0; l2 < 4; l2++)
        {
            int l4 = h(j2, j, j1);
            int ai1[] = f;
            int l3 = k1 + 1;
            i2 = ai1[k1] + ((l1 << 5 | l1 >>> 27) + l4) + 0x6ed9eba1 + i2;
            k1 = j2 >>> 2 | j2 << 30;
            l4 = h(l1, k1, j);
            ai1 = f;
            j2 = l3 + 1;
            j1 += (i2 << 5 | i2 >>> 27) + l4 + ai1[l3] + 0x6ed9eba1;
            l1 = l1 >>> 2 | l1 << 30;
            l4 = h(i2, l1, k1);
            ai1 = f;
            l3 = j2 + 1;
            j += (j1 << 5 | j1 >>> 27) + l4 + ai1[j2] + 0x6ed9eba1;
            i2 = i2 << 30 | i2 >>> 2;
            j2 = h(j1, i2, l1);
            ai1 = f;
            l4 = l3 + 1;
            j2 = k1 + ((j << 5 | j >>> 27) + j2 + ai1[l3] + 0x6ed9eba1);
            j1 = j1 >>> 2 | j1 << 30;
            l3 = h(j, j1, i2);
            ai1 = f;
            k1 = l4 + 1;
            l1 += l3 + (j2 << 5 | j2 >>> 27) + ai1[l4] + 0x6ed9eba1;
            j = j >>> 2 | j << 30;
        }

        for (int i3 = 0; i3 < 4; i3++)
        {
            int i5 = g(j2, j, j1);
            int ai2[] = f;
            int i4 = k1 + 1;
            i2 = ((ai2[k1] + ((l1 << 5 | l1 >>> 27) + i5)) - 0x70e44324) + i2;
            k1 = j2 >>> 2 | j2 << 30;
            i5 = g(l1, k1, j);
            ai2 = f;
            j2 = i4 + 1;
            j1 += ((i2 << 5 | i2 >>> 27) + i5 + ai2[i4]) - 0x70e44324;
            l1 = l1 >>> 2 | l1 << 30;
            i5 = g(i2, l1, k1);
            ai2 = f;
            i4 = j2 + 1;
            j += ((j1 << 5 | j1 >>> 27) + i5 + ai2[j2]) - 0x70e44324;
            i2 = i2 << 30 | i2 >>> 2;
            j2 = g(j1, i2, l1);
            ai2 = f;
            i5 = i4 + 1;
            j2 = k1 + (((j << 5 | j >>> 27) + j2 + ai2[i4]) - 0x70e44324);
            j1 = j1 >>> 2 | j1 << 30;
            i4 = g(j, j1, i2);
            ai2 = f;
            k1 = i5 + 1;
            l1 += (i4 + (j2 << 5 | j2 >>> 27) + ai2[i5]) - 0x70e44324;
            j = j >>> 2 | j << 30;
        }

        boolean flag = false;
        int j3 = l1;
        l1 = j;
        for (int k = ((flag) ? 1 : 0); k <= 3; k++)
        {
            int j5 = h(j2, l1, j1);
            int ai3[] = f;
            int j4 = k1 + 1;
            i2 = ((ai3[k1] + ((j3 << 5 | j3 >>> 27) + j5)) - 0x359d3e2a) + i2;
            k1 = j2 >>> 2 | j2 << 30;
            j5 = h(j3, k1, l1);
            ai3 = f;
            j2 = j4 + 1;
            j1 += ((i2 << 5 | i2 >>> 27) + j5 + ai3[j4]) - 0x359d3e2a;
            j3 = j3 >>> 2 | j3 << 30;
            j5 = h(i2, j3, k1);
            ai3 = f;
            j4 = j2 + 1;
            l1 += ((j1 << 5 | j1 >>> 27) + j5 + ai3[j2]) - 0x359d3e2a;
            i2 = i2 << 30 | i2 >>> 2;
            j2 = h(j1, i2, j3);
            ai3 = f;
            j5 = j4 + 1;
            j2 = k1 + (((l1 << 5 | l1 >>> 27) + j2 + ai3[j4]) - 0x359d3e2a);
            j1 = j1 >>> 2 | j1 << 30;
            j4 = h(l1, j1, i2);
            ai3 = f;
            k1 = j5 + 1;
            j3 += (j4 + (j2 << 5 | j2 >>> 27) + ai3[j5]) - 0x359d3e2a;
            l1 = l1 >>> 2 | l1 << 30;
        }

        a = a + j3;
        b = b + j2;
        c = c + l1;
        d = d + j1;
        e = e + i2;
        g = 0;
        for (int l = 0; l < 16; l++)
        {
            f[l] = 0;
        }

    }

    protected void processLength(long l)
    {
        if (g > 14)
        {
            processBlock();
        }
        f[14] = (int)(l >>> 32);
        f[15] = (int)(-1L & l);
    }

    protected void processWord(byte abyte0[], int i)
    {
        byte byte0 = abyte0[i];
        int j = i + 1;
        i = abyte0[j];
        int k = j + 1;
        j = abyte0[k];
        k = abyte0[k + 1];
        f[g] = byte0 << 24 | (i & 0xff) << 16 | (j & 0xff) << 8 | k & 0xff;
        i = g + 1;
        g = i;
        if (i == 16)
        {
            processBlock();
        }
    }

    public void reset()
    {
        super.reset();
        a = 0x67452301;
        b = 0xefcdab89;
        c = 0x98badcfe;
        d = 0x10325476;
        e = 0xc3d2e1f0;
        g = 0;
        for (int i = 0; i != f.length; i++)
        {
            f[i] = 0;
        }

    }
}
