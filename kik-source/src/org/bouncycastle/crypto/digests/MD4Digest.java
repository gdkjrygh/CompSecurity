// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.digests;


// Referenced classes of package org.bouncycastle.crypto.digests:
//            GeneralDigest

public class MD4Digest extends GeneralDigest
{

    private int a;
    private int b;
    private int c;
    private int d;
    private int e[];
    private int f;

    public MD4Digest()
    {
        e = new int[16];
        reset();
    }

    public MD4Digest(MD4Digest md4digest)
    {
        super(md4digest);
        e = new int[16];
        a = md4digest.a;
        b = md4digest.b;
        c = md4digest.c;
        d = md4digest.d;
        System.arraycopy(md4digest.e, 0, e, 0, md4digest.e.length);
        f = md4digest.f;
    }

    private int F(int i, int j, int k)
    {
        return i & j | ~i & k;
    }

    private int G(int i, int j, int k)
    {
        return i & j | i & k | j & k;
    }

    private int H(int i, int j, int k)
    {
        return i ^ j ^ k;
    }

    private int rotateLeft(int i, int j)
    {
        return i << j | i >>> 32 - j;
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
        return "MD4";
    }

    public int getDigestSize()
    {
        return 16;
    }

    protected void processBlock()
    {
        int k = a;
        int i = b;
        int i1 = c;
        int l = d;
        k = rotateLeft(k + F(i, i1, l) + e[0], 3);
        l = rotateLeft(l + F(k, i, i1) + e[1], 7);
        i1 = rotateLeft(i1 + F(l, k, i) + e[2], 11);
        i = rotateLeft(i + F(i1, l, k) + e[3], 19);
        k = rotateLeft(k + F(i, i1, l) + e[4], 3);
        l = rotateLeft(l + F(k, i, i1) + e[5], 7);
        i1 = rotateLeft(i1 + F(l, k, i) + e[6], 11);
        i = rotateLeft(i + F(i1, l, k) + e[7], 19);
        k = rotateLeft(k + F(i, i1, l) + e[8], 3);
        l = rotateLeft(l + F(k, i, i1) + e[9], 7);
        i1 = rotateLeft(i1 + F(l, k, i) + e[10], 11);
        i = rotateLeft(i + F(i1, l, k) + e[11], 19);
        k = rotateLeft(k + F(i, i1, l) + e[12], 3);
        l = rotateLeft(l + F(k, i, i1) + e[13], 7);
        i1 = rotateLeft(i1 + F(l, k, i) + e[14], 11);
        i = rotateLeft(i + F(i1, l, k) + e[15], 19);
        k = rotateLeft(k + G(i, i1, l) + e[0] + 0x5a827999, 3);
        l = rotateLeft(l + G(k, i, i1) + e[4] + 0x5a827999, 5);
        i1 = rotateLeft(i1 + G(l, k, i) + e[8] + 0x5a827999, 9);
        i = rotateLeft(i + G(i1, l, k) + e[12] + 0x5a827999, 13);
        k = rotateLeft(k + G(i, i1, l) + e[1] + 0x5a827999, 3);
        l = rotateLeft(l + G(k, i, i1) + e[5] + 0x5a827999, 5);
        i1 = rotateLeft(i1 + G(l, k, i) + e[9] + 0x5a827999, 9);
        i = rotateLeft(i + G(i1, l, k) + e[13] + 0x5a827999, 13);
        k = rotateLeft(k + G(i, i1, l) + e[2] + 0x5a827999, 3);
        l = rotateLeft(l + G(k, i, i1) + e[6] + 0x5a827999, 5);
        i1 = rotateLeft(i1 + G(l, k, i) + e[10] + 0x5a827999, 9);
        i = rotateLeft(i + G(i1, l, k) + e[14] + 0x5a827999, 13);
        k = rotateLeft(k + G(i, i1, l) + e[3] + 0x5a827999, 3);
        l = rotateLeft(l + G(k, i, i1) + e[7] + 0x5a827999, 5);
        i1 = rotateLeft(i1 + G(l, k, i) + e[11] + 0x5a827999, 9);
        i = rotateLeft(i + G(i1, l, k) + e[15] + 0x5a827999, 13);
        k = rotateLeft(k + H(i, i1, l) + e[0] + 0x6ed9eba1, 3);
        l = rotateLeft(l + H(k, i, i1) + e[8] + 0x6ed9eba1, 9);
        i1 = rotateLeft(i1 + H(l, k, i) + e[4] + 0x6ed9eba1, 11);
        i = rotateLeft(i + H(i1, l, k) + e[12] + 0x6ed9eba1, 15);
        k = rotateLeft(k + H(i, i1, l) + e[2] + 0x6ed9eba1, 3);
        l = rotateLeft(l + H(k, i, i1) + e[10] + 0x6ed9eba1, 9);
        i1 = rotateLeft(i1 + H(l, k, i) + e[6] + 0x6ed9eba1, 11);
        i = rotateLeft(i + H(i1, l, k) + e[14] + 0x6ed9eba1, 15);
        k = rotateLeft(k + H(i, i1, l) + e[1] + 0x6ed9eba1, 3);
        l = rotateLeft(l + H(k, i, i1) + e[9] + 0x6ed9eba1, 9);
        i1 = rotateLeft(i1 + H(l, k, i) + e[5] + 0x6ed9eba1, 11);
        i = rotateLeft(i + H(i1, l, k) + e[13] + 0x6ed9eba1, 15);
        k = rotateLeft(k + H(i, i1, l) + e[3] + 0x6ed9eba1, 3);
        l = rotateLeft(l + H(k, i, i1) + e[11] + 0x6ed9eba1, 9);
        i1 = rotateLeft(i1 + H(l, k, i) + e[7] + 0x6ed9eba1, 11);
        i = rotateLeft(i + H(i1, l, k) + e[15] + 0x6ed9eba1, 15);
        a = k + a;
        b = b + i;
        c = c + i1;
        d = d + l;
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
