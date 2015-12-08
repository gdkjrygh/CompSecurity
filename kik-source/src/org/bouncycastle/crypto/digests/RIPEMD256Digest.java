// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.digests;


// Referenced classes of package org.bouncycastle.crypto.digests:
//            GeneralDigest

public class RIPEMD256Digest extends GeneralDigest
{

    private int a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i[];
    private int j;

    public RIPEMD256Digest()
    {
        i = new int[16];
        reset();
    }

    public RIPEMD256Digest(RIPEMD256Digest ripemd256digest)
    {
        super(ripemd256digest);
        i = new int[16];
        a = ripemd256digest.a;
        b = ripemd256digest.b;
        c = ripemd256digest.c;
        d = ripemd256digest.d;
        e = ripemd256digest.e;
        f = ripemd256digest.f;
        g = ripemd256digest.g;
        h = ripemd256digest.h;
        System.arraycopy(ripemd256digest.i, 0, i, 0, ripemd256digest.i.length);
        j = ripemd256digest.j;
    }

    private int F1(int k, int l, int i1, int j1, int k1, int l1)
    {
        return RL(f1(l, i1, j1) + k + k1, l1);
    }

    private int F2(int k, int l, int i1, int j1, int k1, int l1)
    {
        return RL(f2(l, i1, j1) + k + k1 + 0x5a827999, l1);
    }

    private int F3(int k, int l, int i1, int j1, int k1, int l1)
    {
        return RL(f3(l, i1, j1) + k + k1 + 0x6ed9eba1, l1);
    }

    private int F4(int k, int l, int i1, int j1, int k1, int l1)
    {
        return RL((f4(l, i1, j1) + k + k1) - 0x70e44324, l1);
    }

    private int FF1(int k, int l, int i1, int j1, int k1, int l1)
    {
        return RL(f1(l, i1, j1) + k + k1, l1);
    }

    private int FF2(int k, int l, int i1, int j1, int k1, int l1)
    {
        return RL(f2(l, i1, j1) + k + k1 + 0x6d703ef3, l1);
    }

    private int FF3(int k, int l, int i1, int j1, int k1, int l1)
    {
        return RL(f3(l, i1, j1) + k + k1 + 0x5c4dd124, l1);
    }

    private int FF4(int k, int l, int i1, int j1, int k1, int l1)
    {
        return RL(f4(l, i1, j1) + k + k1 + 0x50a28be6, l1);
    }

    private int RL(int k, int l)
    {
        return k << l | k >>> 32 - l;
    }

    private int f1(int k, int l, int i1)
    {
        return k ^ l ^ i1;
    }

    private int f2(int k, int l, int i1)
    {
        return k & l | ~k & i1;
    }

    private int f3(int k, int l, int i1)
    {
        return (~l | k) ^ i1;
    }

    private int f4(int k, int l, int i1)
    {
        return k & i1 | ~i1 & l;
    }

    private void unpackWord(int k, byte abyte0[], int l)
    {
        abyte0[l] = (byte)k;
        abyte0[l + 1] = (byte)(k >>> 8);
        abyte0[l + 2] = (byte)(k >>> 16);
        abyte0[l + 3] = (byte)(k >>> 24);
    }

    public int doFinal(byte abyte0[], int k)
    {
        finish();
        unpackWord(a, abyte0, k);
        unpackWord(b, abyte0, k + 4);
        unpackWord(c, abyte0, k + 8);
        unpackWord(d, abyte0, k + 12);
        unpackWord(e, abyte0, k + 16);
        unpackWord(f, abyte0, k + 20);
        unpackWord(g, abyte0, k + 24);
        unpackWord(h, abyte0, k + 28);
        reset();
        return 32;
    }

    public String getAlgorithmName()
    {
        return "RIPEMD256";
    }

    public int getDigestSize()
    {
        return 32;
    }

    protected void processBlock()
    {
        int j1 = a;
        int k = b;
        int l1 = c;
        int k1 = d;
        int k2 = e;
        int i1 = f;
        int i2 = g;
        int j2 = h;
        j1 = F1(j1, k, l1, k1, i[0], 11);
        k1 = F1(k1, j1, k, l1, i[1], 14);
        l1 = F1(l1, k1, j1, k, i[2], 15);
        k = F1(k, l1, k1, j1, i[3], 12);
        j1 = F1(j1, k, l1, k1, i[4], 5);
        k1 = F1(k1, j1, k, l1, i[5], 8);
        l1 = F1(l1, k1, j1, k, i[6], 7);
        k = F1(k, l1, k1, j1, i[7], 9);
        j1 = F1(j1, k, l1, k1, i[8], 11);
        k1 = F1(k1, j1, k, l1, i[9], 13);
        l1 = F1(l1, k1, j1, k, i[10], 14);
        int l2 = F1(k, l1, k1, j1, i[11], 15);
        k = F1(j1, l2, l1, k1, i[12], 6);
        j1 = F1(k1, k, l2, l1, i[13], 7);
        k1 = F1(l1, j1, k, l2, i[14], 9);
        l1 = F1(l2, k1, j1, k, i[15], 8);
        k2 = FF4(k2, i1, i2, j2, i[5], 8);
        j2 = FF4(j2, k2, i1, i2, i[14], 9);
        i2 = FF4(i2, j2, k2, i1, i[7], 9);
        i1 = FF4(i1, i2, j2, k2, i[0], 11);
        k2 = FF4(k2, i1, i2, j2, i[9], 13);
        j2 = FF4(j2, k2, i1, i2, i[2], 15);
        i2 = FF4(i2, j2, k2, i1, i[11], 15);
        i1 = FF4(i1, i2, j2, k2, i[4], 5);
        k2 = FF4(k2, i1, i2, j2, i[13], 7);
        j2 = FF4(j2, k2, i1, i2, i[6], 7);
        l2 = FF4(i2, j2, k2, i1, i[15], 8);
        i1 = FF4(i1, l2, j2, k2, i[8], 11);
        int i3 = FF4(k2, i1, l2, j2, i[1], 14);
        i2 = FF4(j2, i3, i1, l2, i[10], 14);
        j2 = FF4(l2, i2, i3, i1, i[3], 12);
        k2 = FF4(i1, j2, i2, i3, i[12], 6);
        i1 = F2(i3, l1, k1, j1, i[7], 7);
        j1 = F2(j1, i1, l1, k1, i[4], 6);
        k1 = F2(k1, j1, i1, l1, i[13], 8);
        l1 = F2(l1, k1, j1, i1, i[1], 13);
        i1 = F2(i1, l1, k1, j1, i[10], 11);
        j1 = F2(j1, i1, l1, k1, i[6], 9);
        k1 = F2(k1, j1, i1, l1, i[15], 7);
        l1 = F2(l1, k1, j1, i1, i[3], 15);
        i1 = F2(i1, l1, k1, j1, i[12], 7);
        l2 = F2(j1, i1, l1, k1, i[0], 12);
        i3 = F2(k1, l2, i1, l1, i[9], 15);
        int j3 = F2(l1, i3, l2, i1, i[5], 9);
        j1 = F2(i1, j3, i3, l2, i[2], 11);
        k1 = F2(l2, j1, j3, i3, i[14], 7);
        l1 = F2(i3, k1, j1, j3, i[11], 13);
        i1 = F2(j3, l1, k1, j1, i[8], 12);
        k = FF3(k, k2, j2, i2, i[6], 9);
        i2 = FF3(i2, k, k2, j2, i[11], 13);
        j2 = FF3(j2, i2, k, k2, i[3], 15);
        k2 = FF3(k2, j2, i2, k, i[7], 7);
        k = FF3(k, k2, j2, i2, i[0], 12);
        i2 = FF3(i2, k, k2, j2, i[13], 8);
        j2 = FF3(j2, i2, k, k2, i[5], 9);
        k2 = FF3(k2, j2, i2, k, i[10], 11);
        k = FF3(k, k2, j2, i2, i[14], 7);
        l2 = FF3(i2, k, k2, j2, i[15], 7);
        i3 = FF3(j2, l2, k, k2, i[8], 12);
        j3 = FF3(k2, i3, l2, k, i[12], 7);
        i2 = FF3(k, j3, i3, l2, i[4], 6);
        j2 = FF3(l2, i2, j3, i3, i[9], 15);
        k2 = FF3(i3, j2, i2, j3, i[1], 13);
        k = FF3(j3, k2, j2, i2, i[2], 11);
        j1 = F3(j1, k, l1, k1, i[3], 11);
        k1 = F3(k1, j1, k, l1, i[10], 13);
        l1 = F3(l1, k1, j1, k, i[14], 6);
        k = F3(k, l1, k1, j1, i[4], 7);
        j1 = F3(j1, k, l1, k1, i[9], 14);
        k1 = F3(k1, j1, k, l1, i[15], 9);
        l1 = F3(l1, k1, j1, k, i[8], 13);
        k = F3(k, l1, k1, j1, i[1], 15);
        j1 = F3(j1, k, l1, k1, i[2], 14);
        k1 = F3(k1, j1, k, l1, i[7], 8);
        l1 = F3(l1, k1, j1, k, i[0], 13);
        l2 = F3(k, l1, k1, j1, i[6], 6);
        j1 = F3(j1, l2, l1, k1, i[13], 5);
        k1 = F3(k1, j1, l2, l1, i[11], 12);
        k = F3(l1, k1, j1, l2, i[5], 7);
        l1 = F3(l2, k, k1, j1, i[12], 5);
        i2 = FF2(i2, i1, k2, j2, i[15], 9);
        j2 = FF2(j2, i2, i1, k2, i[5], 7);
        k2 = FF2(k2, j2, i2, i1, i[1], 15);
        i1 = FF2(i1, k2, j2, i2, i[3], 11);
        i2 = FF2(i2, i1, k2, j2, i[7], 8);
        j2 = FF2(j2, i2, i1, k2, i[14], 6);
        k2 = FF2(k2, j2, i2, i1, i[6], 6);
        i1 = FF2(i1, k2, j2, i2, i[9], 14);
        i2 = FF2(i2, i1, k2, j2, i[11], 12);
        j2 = FF2(j2, i2, i1, k2, i[8], 13);
        k2 = FF2(k2, j2, i2, i1, i[12], 5);
        l2 = FF2(i1, k2, j2, i2, i[2], 14);
        i1 = FF2(i2, l2, k2, j2, i[10], 13);
        i2 = FF2(j2, i1, l2, k2, i[0], 13);
        k2 = FF2(k2, i2, i1, l2, i[4], 7);
        j2 = FF2(l2, k2, i2, i1, i[13], 5);
        j1 = F4(j1, l1, k2, k1, i[1], 11);
        k1 = F4(k1, j1, l1, k2, i[9], 12);
        k2 = F4(k2, k1, j1, l1, i[11], 14);
        l1 = F4(l1, k2, k1, j1, i[10], 15);
        j1 = F4(j1, l1, k2, k1, i[0], 14);
        k1 = F4(k1, j1, l1, k2, i[8], 15);
        k2 = F4(k2, k1, j1, l1, i[12], 9);
        l1 = F4(l1, k2, k1, j1, i[4], 8);
        j1 = F4(j1, l1, k2, k1, i[13], 9);
        k1 = F4(k1, j1, l1, k2, i[3], 14);
        k2 = F4(k2, k1, j1, l1, i[7], 5);
        l2 = F4(l1, k2, k1, j1, i[15], 6);
        j1 = F4(j1, l2, k2, k1, i[14], 8);
        k1 = F4(k1, j1, l2, k2, i[5], 6);
        l1 = F4(k2, k1, j1, l2, i[6], 5);
        k2 = F4(l2, l1, k1, j1, i[2], 12);
        i1 = FF1(i1, j2, k, i2, i[8], 15);
        i2 = FF1(i2, i1, j2, k, i[6], 5);
        k = FF1(k, i2, i1, j2, i[4], 8);
        j2 = FF1(j2, k, i2, i1, i[1], 11);
        i1 = FF1(i1, j2, k, i2, i[3], 14);
        i2 = FF1(i2, i1, j2, k, i[11], 14);
        k = FF1(k, i2, i1, j2, i[15], 6);
        j2 = FF1(j2, k, i2, i1, i[0], 14);
        i1 = FF1(i1, j2, k, i2, i[5], 6);
        i2 = FF1(i2, i1, j2, k, i[12], 9);
        k = FF1(k, i2, i1, j2, i[2], 12);
        j2 = FF1(j2, k, i2, i1, i[13], 9);
        i1 = FF1(i1, j2, k, i2, i[9], 12);
        i2 = FF1(i2, i1, j2, k, i[7], 5);
        k = FF1(k, i2, i1, j2, i[10], 15);
        j2 = FF1(j2, k, i2, i1, i[14], 8);
        a = a + j1;
        b = k2 + b;
        c = c + l1;
        d = d + i2;
        e = e + i1;
        f = f + j2;
        g = g + k;
        h = h + k1;
        j = 0;
        for (int l = 0; l != i.length; l++)
        {
            i[l] = 0;
        }

    }

    protected void processLength(long l)
    {
        if (j > 14)
        {
            processBlock();
        }
        i[14] = (int)(-1L & l);
        i[15] = (int)(l >>> 32);
    }

    protected void processWord(byte abyte0[], int k)
    {
        int ai[] = i;
        int l = j;
        j = l + 1;
        ai[l] = abyte0[k] & 0xff | (abyte0[k + 1] & 0xff) << 8 | (abyte0[k + 2] & 0xff) << 16 | (abyte0[k + 3] & 0xff) << 24;
        if (j == 16)
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
        e = 0x76543210;
        f = 0xfedcba98;
        g = 0x89abcdef;
        h = 0x1234567;
        j = 0;
        for (int k = 0; k != i.length; k++)
        {
            i[k] = 0;
        }

    }
}
