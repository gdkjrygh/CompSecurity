// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.digests;


// Referenced classes of package org.bouncycastle.crypto.digests:
//            GeneralDigest

public class MD5Digest extends GeneralDigest
{

    private int a;
    private int b;
    private int c;
    private int d;
    private int e[];
    private int f;

    public MD5Digest()
    {
        e = new int[16];
        reset();
    }

    public MD5Digest(MD5Digest md5digest)
    {
        super(md5digest);
        e = new int[16];
        a = md5digest.a;
        b = md5digest.b;
        c = md5digest.c;
        d = md5digest.d;
        System.arraycopy(md5digest.e, 0, e, 0, md5digest.e.length);
        f = md5digest.f;
    }

    private int F(int i, int j, int k)
    {
        return i & j | ~i & k;
    }

    private int G(int i, int j, int k)
    {
        return i & k | ~k & j;
    }

    private int H(int i, int j, int k)
    {
        return i ^ j ^ k;
    }

    private int K(int i, int j, int k)
    {
        return (~k | i) ^ j;
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
        return "MD5";
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
        k = rotateLeft((k + F(i, i1, l) + e[0]) - 0x28955b88, 7) + i;
        l = rotateLeft((l + F(k, i, i1) + e[1]) - 0x173848aa, 12) + k;
        i1 = rotateLeft(i1 + F(l, k, i) + e[2] + 0x242070db, 17) + l;
        i = rotateLeft((i + F(i1, l, k) + e[3]) - 0x3e423112, 22) + i1;
        k = rotateLeft((k + F(i, i1, l) + e[4]) - 0xa83f051, 7) + i;
        l = rotateLeft(l + F(k, i, i1) + e[5] + 0x4787c62a, 12) + k;
        i1 = rotateLeft((i1 + F(l, k, i) + e[6]) - 0x57cfb9ed, 17) + l;
        i = rotateLeft((i + F(i1, l, k) + e[7]) - 0x2b96aff, 22) + i1;
        k = rotateLeft(k + F(i, i1, l) + e[8] + 0x698098d8, 7) + i;
        l = rotateLeft((l + F(k, i, i1) + e[9]) - 0x74bb0851, 12) + k;
        i1 = rotateLeft((i1 + F(l, k, i) + e[10]) - 42063, 17) + l;
        i = rotateLeft((i + F(i1, l, k) + e[11]) - 0x76a32842, 22) + i1;
        k = rotateLeft(k + F(i, i1, l) + e[12] + 0x6b901122, 7) + i;
        l = rotateLeft((l + F(k, i, i1) + e[13]) - 0x2678e6d, 12) + k;
        i1 = rotateLeft((i1 + F(l, k, i) + e[14]) - 0x5986bc72, 17) + l;
        i = rotateLeft(i + F(i1, l, k) + e[15] + 0x49b40821, 22) + i1;
        k = rotateLeft((k + G(i, i1, l) + e[1]) - 0x9e1da9e, 5) + i;
        l = rotateLeft((l + G(k, i, i1) + e[6]) - 0x3fbf4cc0, 9) + k;
        i1 = rotateLeft(i1 + G(l, k, i) + e[11] + 0x265e5a51, 14) + l;
        i = rotateLeft((i + G(i1, l, k) + e[0]) - 0x16493856, 20) + i1;
        k = rotateLeft((k + G(i, i1, l) + e[5]) - 0x29d0efa3, 5) + i;
        l = rotateLeft(l + G(k, i, i1) + e[10] + 0x2441453, 9) + k;
        i1 = rotateLeft((i1 + G(l, k, i) + e[15]) - 0x275e197f, 14) + l;
        i = rotateLeft((i + G(i1, l, k) + e[4]) - 0x182c0438, 20) + i1;
        k = rotateLeft(k + G(i, i1, l) + e[9] + 0x21e1cde6, 5) + i;
        l = rotateLeft((l + G(k, i, i1) + e[14]) - 0x3cc8f82a, 9) + k;
        i1 = rotateLeft((i1 + G(l, k, i) + e[3]) - 0xb2af279, 14) + l;
        i = rotateLeft(i + G(i1, l, k) + e[8] + 0x455a14ed, 20) + i1;
        k = rotateLeft((k + G(i, i1, l) + e[13]) - 0x561c16fb, 5) + i;
        l = rotateLeft((l + G(k, i, i1) + e[2]) - 0x3105c08, 9) + k;
        i1 = rotateLeft(i1 + G(l, k, i) + e[7] + 0x676f02d9, 14) + l;
        i = rotateLeft((i + G(i1, l, k) + e[12]) - 0x72d5b376, 20) + i1;
        k = rotateLeft((k + H(i, i1, l) + e[5]) - 0x5c6be, 4) + i;
        l = rotateLeft((l + H(k, i, i1) + e[8]) - 0x788e097f, 11) + k;
        i1 = rotateLeft(i1 + H(l, k, i) + e[11] + 0x6d9d6122, 16) + l;
        i = rotateLeft((i + H(i1, l, k) + e[14]) - 0x21ac7f4, 23) + i1;
        k = rotateLeft((k + H(i, i1, l) + e[1]) - 0x5b4115bc, 4) + i;
        l = rotateLeft(l + H(k, i, i1) + e[4] + 0x4bdecfa9, 11) + k;
        i1 = rotateLeft((i1 + H(l, k, i) + e[7]) - 0x944b4a0, 16) + l;
        i = rotateLeft((i + H(i1, l, k) + e[10]) - 0x41404390, 23) + i1;
        k = rotateLeft(k + H(i, i1, l) + e[13] + 0x289b7ec6, 4) + i;
        l = rotateLeft((l + H(k, i, i1) + e[0]) - 0x155ed806, 11) + k;
        i1 = rotateLeft((i1 + H(l, k, i) + e[3]) - 0x2b10cf7b, 16) + l;
        i = rotateLeft(i + H(i1, l, k) + e[6] + 0x4881d05, 23) + i1;
        k = rotateLeft((k + H(i, i1, l) + e[9]) - 0x262b2fc7, 4) + i;
        l = rotateLeft((l + H(k, i, i1) + e[12]) - 0x1924661b, 11) + k;
        i1 = rotateLeft(i1 + H(l, k, i) + e[15] + 0x1fa27cf8, 16) + l;
        i = rotateLeft((i + H(i1, l, k) + e[2]) - 0x3b53a99b, 23) + i1;
        k = rotateLeft((k + K(i, i1, l) + e[0]) - 0xbd6ddbc, 6) + i;
        l = rotateLeft(l + K(k, i, i1) + e[7] + 0x432aff97, 10) + k;
        i1 = rotateLeft((i1 + K(l, k, i) + e[14]) - 0x546bdc59, 15) + l;
        i = rotateLeft((i + K(i1, l, k) + e[5]) - 0x36c5fc7, 21) + i1;
        k = rotateLeft(k + K(i, i1, l) + e[12] + 0x655b59c3, 6) + i;
        l = rotateLeft((l + K(k, i, i1) + e[3]) - 0x70f3336e, 10) + k;
        i1 = rotateLeft((i1 + K(l, k, i) + e[10]) - 0x100b83, 15) + l;
        i = rotateLeft((i + K(i1, l, k) + e[1]) - 0x7a7ba22f, 21) + i1;
        k = rotateLeft(k + K(i, i1, l) + e[8] + 0x6fa87e4f, 6) + i;
        l = rotateLeft((l + K(k, i, i1) + e[15]) - 0x1d31920, 10) + k;
        i1 = rotateLeft((i1 + K(l, k, i) + e[6]) - 0x5cfebcec, 15) + l;
        i = rotateLeft(i + K(i1, l, k) + e[13] + 0x4e0811a1, 21) + i1;
        k = rotateLeft((k + K(i, i1, l) + e[4]) - 0x8ac817e, 6) + i;
        l = rotateLeft((l + K(k, i, i1) + e[11]) - 0x42c50dcb, 10) + k;
        i1 = rotateLeft(i1 + K(l, k, i) + e[2] + 0x2ad7d2bb, 15) + l;
        i = rotateLeft((i + K(i1, l, k) + e[9]) - 0x14792c6f, 21);
        a = k + a;
        b = b + (i + i1);
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
