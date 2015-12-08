// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.digests;


// Referenced classes of package org.bouncycastle.crypto.digests:
//            GeneralDigest

public class RIPEMD128Digest extends GeneralDigest
{

    private int a;
    private int b;
    private int c;
    private int d;
    private int e[];
    private int f;

    public RIPEMD128Digest()
    {
        e = new int[16];
        reset();
    }

    public RIPEMD128Digest(RIPEMD128Digest ripemd128digest)
    {
        super(ripemd128digest);
        e = new int[16];
        a = ripemd128digest.a;
        b = ripemd128digest.b;
        c = ripemd128digest.c;
        d = ripemd128digest.d;
        System.arraycopy(ripemd128digest.e, 0, e, 0, ripemd128digest.e.length);
        f = ripemd128digest.f;
    }

    private int F1(int i, int j, int k, int l, int i1, int j1)
    {
        return RL(f1(j, k, l) + i + i1, j1);
    }

    private int F2(int i, int j, int k, int l, int i1, int j1)
    {
        return RL(f2(j, k, l) + i + i1 + 0x5a827999, j1);
    }

    private int F3(int i, int j, int k, int l, int i1, int j1)
    {
        return RL(f3(j, k, l) + i + i1 + 0x6ed9eba1, j1);
    }

    private int F4(int i, int j, int k, int l, int i1, int j1)
    {
        return RL((f4(j, k, l) + i + i1) - 0x70e44324, j1);
    }

    private int FF1(int i, int j, int k, int l, int i1, int j1)
    {
        return RL(f1(j, k, l) + i + i1, j1);
    }

    private int FF2(int i, int j, int k, int l, int i1, int j1)
    {
        return RL(f2(j, k, l) + i + i1 + 0x6d703ef3, j1);
    }

    private int FF3(int i, int j, int k, int l, int i1, int j1)
    {
        return RL(f3(j, k, l) + i + i1 + 0x5c4dd124, j1);
    }

    private int FF4(int i, int j, int k, int l, int i1, int j1)
    {
        return RL(f4(j, k, l) + i + i1 + 0x50a28be6, j1);
    }

    private int RL(int i, int j)
    {
        return i << j | i >>> 32 - j;
    }

    private int f1(int i, int j, int k)
    {
        return i ^ j ^ k;
    }

    private int f2(int i, int j, int k)
    {
        return i & j | ~i & k;
    }

    private int f3(int i, int j, int k)
    {
        return (~j | i) ^ k;
    }

    private int f4(int i, int j, int k)
    {
        return i & k | ~k & j;
    }

    private void unpackWord(int i, byte abyte0[], int j)
    {
        abyte0[j] = (byte)i;
        abyte0[j + 1] = (byte)(i >>> 8);
        abyte0[j + 2] = (byte)(i >>> 16);
        abyte0[j + 3] = (byte)(i >>> 24);
    }

    public int doFinal(byte abyte0[], int i)
    {
        finish();
        unpackWord(a, abyte0, i);
        unpackWord(b, abyte0, i + 4);
        unpackWord(c, abyte0, i + 8);
        unpackWord(d, abyte0, i + 12);
        reset();
        return 16;
    }

    public String getAlgorithmName()
    {
        return "RIPEMD128";
    }

    public int getDigestSize()
    {
        return 16;
    }

    protected void processBlock()
    {
        int i2 = a;
        int j1 = b;
        int k1 = c;
        int l1 = d;
        int k = F1(i2, j1, k1, l1, e[0], 11);
        int l = F1(l1, k, j1, k1, e[1], 14);
        int i1 = F1(k1, l, k, j1, e[2], 15);
        int i = F1(j1, i1, l, k, e[3], 12);
        k = F1(k, i, i1, l, e[4], 5);
        l = F1(l, k, i, i1, e[5], 8);
        i1 = F1(i1, l, k, i, e[6], 7);
        i = F1(i, i1, l, k, e[7], 9);
        k = F1(k, i, i1, l, e[8], 11);
        l = F1(l, k, i, i1, e[9], 13);
        i1 = F1(i1, l, k, i, e[10], 14);
        i = F1(i, i1, l, k, e[11], 15);
        k = F1(k, i, i1, l, e[12], 6);
        l = F1(l, k, i, i1, e[13], 7);
        i1 = F1(i1, l, k, i, e[14], 9);
        i = F1(i, i1, l, k, e[15], 8);
        k = F2(k, i, i1, l, e[7], 7);
        l = F2(l, k, i, i1, e[4], 6);
        i1 = F2(i1, l, k, i, e[13], 8);
        i = F2(i, i1, l, k, e[1], 13);
        k = F2(k, i, i1, l, e[10], 11);
        l = F2(l, k, i, i1, e[6], 9);
        i1 = F2(i1, l, k, i, e[15], 7);
        i = F2(i, i1, l, k, e[3], 15);
        k = F2(k, i, i1, l, e[12], 7);
        l = F2(l, k, i, i1, e[0], 12);
        i1 = F2(i1, l, k, i, e[9], 15);
        i = F2(i, i1, l, k, e[5], 9);
        k = F2(k, i, i1, l, e[2], 11);
        l = F2(l, k, i, i1, e[14], 7);
        i1 = F2(i1, l, k, i, e[11], 13);
        i = F2(i, i1, l, k, e[8], 12);
        k = F3(k, i, i1, l, e[3], 11);
        l = F3(l, k, i, i1, e[10], 13);
        i1 = F3(i1, l, k, i, e[14], 6);
        i = F3(i, i1, l, k, e[4], 7);
        k = F3(k, i, i1, l, e[9], 14);
        l = F3(l, k, i, i1, e[15], 9);
        i1 = F3(i1, l, k, i, e[8], 13);
        i = F3(i, i1, l, k, e[1], 15);
        k = F3(k, i, i1, l, e[2], 14);
        l = F3(l, k, i, i1, e[7], 8);
        i1 = F3(i1, l, k, i, e[0], 13);
        i = F3(i, i1, l, k, e[6], 6);
        k = F3(k, i, i1, l, e[13], 5);
        l = F3(l, k, i, i1, e[11], 12);
        i1 = F3(i1, l, k, i, e[5], 7);
        i = F3(i, i1, l, k, e[12], 5);
        k = F4(k, i, i1, l, e[1], 11);
        l = F4(l, k, i, i1, e[9], 12);
        i1 = F4(i1, l, k, i, e[11], 14);
        i = F4(i, i1, l, k, e[10], 15);
        k = F4(k, i, i1, l, e[0], 14);
        l = F4(l, k, i, i1, e[8], 15);
        i1 = F4(i1, l, k, i, e[12], 9);
        i = F4(i, i1, l, k, e[4], 8);
        k = F4(k, i, i1, l, e[13], 9);
        l = F4(l, k, i, i1, e[3], 14);
        i1 = F4(i1, l, k, i, e[7], 5);
        int j2 = F4(i, i1, l, k, e[15], 6);
        i = F4(k, j2, i1, l, e[14], 8);
        k = F4(l, i, j2, i1, e[5], 6);
        l = F4(i1, k, i, j2, e[6], 5);
        i1 = F4(j2, l, k, i, e[2], 12);
        i2 = FF4(i2, j1, k1, l1, e[5], 8);
        l1 = FF4(l1, i2, j1, k1, e[14], 9);
        k1 = FF4(k1, l1, i2, j1, e[7], 9);
        j1 = FF4(j1, k1, l1, i2, e[0], 11);
        i2 = FF4(i2, j1, k1, l1, e[9], 13);
        l1 = FF4(l1, i2, j1, k1, e[2], 15);
        k1 = FF4(k1, l1, i2, j1, e[11], 15);
        j1 = FF4(j1, k1, l1, i2, e[4], 5);
        i2 = FF4(i2, j1, k1, l1, e[13], 7);
        l1 = FF4(l1, i2, j1, k1, e[6], 7);
        k1 = FF4(k1, l1, i2, j1, e[15], 8);
        j1 = FF4(j1, k1, l1, i2, e[8], 11);
        i2 = FF4(i2, j1, k1, l1, e[1], 14);
        l1 = FF4(l1, i2, j1, k1, e[10], 14);
        k1 = FF4(k1, l1, i2, j1, e[3], 12);
        j1 = FF4(j1, k1, l1, i2, e[12], 6);
        i2 = FF3(i2, j1, k1, l1, e[6], 9);
        l1 = FF3(l1, i2, j1, k1, e[11], 13);
        k1 = FF3(k1, l1, i2, j1, e[3], 15);
        j1 = FF3(j1, k1, l1, i2, e[7], 7);
        i2 = FF3(i2, j1, k1, l1, e[0], 12);
        l1 = FF3(l1, i2, j1, k1, e[13], 8);
        k1 = FF3(k1, l1, i2, j1, e[5], 9);
        j1 = FF3(j1, k1, l1, i2, e[10], 11);
        i2 = FF3(i2, j1, k1, l1, e[14], 7);
        l1 = FF3(l1, i2, j1, k1, e[15], 7);
        k1 = FF3(k1, l1, i2, j1, e[8], 12);
        j1 = FF3(j1, k1, l1, i2, e[12], 7);
        i2 = FF3(i2, j1, k1, l1, e[4], 6);
        l1 = FF3(l1, i2, j1, k1, e[9], 15);
        k1 = FF3(k1, l1, i2, j1, e[1], 13);
        j1 = FF3(j1, k1, l1, i2, e[2], 11);
        i2 = FF2(i2, j1, k1, l1, e[15], 9);
        l1 = FF2(l1, i2, j1, k1, e[5], 7);
        k1 = FF2(k1, l1, i2, j1, e[1], 15);
        j1 = FF2(j1, k1, l1, i2, e[3], 11);
        i2 = FF2(i2, j1, k1, l1, e[7], 8);
        l1 = FF2(l1, i2, j1, k1, e[14], 6);
        k1 = FF2(k1, l1, i2, j1, e[6], 6);
        j1 = FF2(j1, k1, l1, i2, e[9], 14);
        i2 = FF2(i2, j1, k1, l1, e[11], 12);
        l1 = FF2(l1, i2, j1, k1, e[8], 13);
        k1 = FF2(k1, l1, i2, j1, e[12], 5);
        j1 = FF2(j1, k1, l1, i2, e[2], 14);
        i2 = FF2(i2, j1, k1, l1, e[10], 13);
        l1 = FF2(l1, i2, j1, k1, e[0], 13);
        k1 = FF2(k1, l1, i2, j1, e[4], 7);
        j1 = FF2(j1, k1, l1, i2, e[13], 5);
        i2 = FF1(i2, j1, k1, l1, e[8], 15);
        l1 = FF1(l1, i2, j1, k1, e[6], 5);
        k1 = FF1(k1, l1, i2, j1, e[4], 8);
        j1 = FF1(j1, k1, l1, i2, e[1], 11);
        i2 = FF1(i2, j1, k1, l1, e[3], 14);
        l1 = FF1(l1, i2, j1, k1, e[11], 14);
        k1 = FF1(k1, l1, i2, j1, e[15], 6);
        j1 = FF1(j1, k1, l1, i2, e[0], 14);
        i2 = FF1(i2, j1, k1, l1, e[5], 6);
        l1 = FF1(l1, i2, j1, k1, e[12], 9);
        k1 = FF1(k1, l1, i2, j1, e[2], 12);
        j2 = FF1(j1, k1, l1, i2, e[13], 9);
        j1 = FF1(i2, j2, k1, l1, e[9], 12);
        l1 = FF1(l1, j1, j2, k1, e[7], 5);
        k1 = FF1(k1, l1, j1, j2, e[10], 15);
        i2 = FF1(j2, k1, l1, j1, e[14], 8);
        j2 = b;
        b = c + k + j1;
        c = i2 + (d + i);
        d = a + i1 + k1;
        a = j2 + l + l1;
        f = 0;
        for (int j = 0; j != e.length; j++)
        {
            e[j] = 0;
        }

    }

    protected void processLength(long l)
    {
        if (f > 14)
        {
            processBlock();
        }
        e[14] = (int)(-1L & l);
        e[15] = (int)(l >>> 32);
    }

    protected void processWord(byte abyte0[], int i)
    {
        int ai[] = e;
        int j = f;
        f = j + 1;
        ai[j] = abyte0[i] & 0xff | (abyte0[i + 1] & 0xff) << 8 | (abyte0[i + 2] & 0xff) << 16 | (abyte0[i + 3] & 0xff) << 24;
        if (f == 16)
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
        f = 0;
        for (int i = 0; i != e.length; i++)
        {
            e[i] = 0;
        }

    }
}
