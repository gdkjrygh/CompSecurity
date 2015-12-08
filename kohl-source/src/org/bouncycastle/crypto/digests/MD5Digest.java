// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.digests;


// Referenced classes of package org.bouncycastle.crypto.digests:
//            GeneralDigest

public class MD5Digest extends GeneralDigest
{

    private static final int DIGEST_LENGTH = 16;
    private static final int S11 = 7;
    private static final int S12 = 12;
    private static final int S13 = 17;
    private static final int S14 = 22;
    private static final int S21 = 5;
    private static final int S22 = 9;
    private static final int S23 = 14;
    private static final int S24 = 20;
    private static final int S31 = 4;
    private static final int S32 = 11;
    private static final int S33 = 16;
    private static final int S34 = 23;
    private static final int S41 = 6;
    private static final int S42 = 10;
    private static final int S43 = 15;
    private static final int S44 = 21;
    private int H1;
    private int H2;
    private int H3;
    private int H4;
    private int X[];
    private int xOff;

    public MD5Digest()
    {
        X = new int[16];
        reset();
    }

    public MD5Digest(MD5Digest md5digest)
    {
        super(md5digest);
        X = new int[16];
        H1 = md5digest.H1;
        H2 = md5digest.H2;
        H3 = md5digest.H3;
        H4 = md5digest.H4;
        System.arraycopy(md5digest.X, 0, X, 0, md5digest.X.length);
        xOff = md5digest.xOff;
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
        unpackWord(H1, abyte0, i);
        unpackWord(H2, abyte0, i + 4);
        unpackWord(H3, abyte0, i + 8);
        unpackWord(H4, abyte0, i + 12);
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
        int k = H1;
        int i = H2;
        int i1 = H3;
        int l = H4;
        k = rotateLeft((k + F(i, i1, l) + X[0]) - 0x28955b88, 7) + i;
        l = rotateLeft((l + F(k, i, i1) + X[1]) - 0x173848aa, 12) + k;
        i1 = rotateLeft(i1 + F(l, k, i) + X[2] + 0x242070db, 17) + l;
        i = rotateLeft((i + F(i1, l, k) + X[3]) - 0x3e423112, 22) + i1;
        k = rotateLeft((k + F(i, i1, l) + X[4]) - 0xa83f051, 7) + i;
        l = rotateLeft(l + F(k, i, i1) + X[5] + 0x4787c62a, 12) + k;
        i1 = rotateLeft((i1 + F(l, k, i) + X[6]) - 0x57cfb9ed, 17) + l;
        i = rotateLeft((i + F(i1, l, k) + X[7]) - 0x2b96aff, 22) + i1;
        k = rotateLeft(k + F(i, i1, l) + X[8] + 0x698098d8, 7) + i;
        l = rotateLeft((l + F(k, i, i1) + X[9]) - 0x74bb0851, 12) + k;
        i1 = rotateLeft((i1 + F(l, k, i) + X[10]) - 42063, 17) + l;
        i = rotateLeft((i + F(i1, l, k) + X[11]) - 0x76a32842, 22) + i1;
        k = rotateLeft(k + F(i, i1, l) + X[12] + 0x6b901122, 7) + i;
        l = rotateLeft((l + F(k, i, i1) + X[13]) - 0x2678e6d, 12) + k;
        i1 = rotateLeft((i1 + F(l, k, i) + X[14]) - 0x5986bc72, 17) + l;
        i = rotateLeft(i + F(i1, l, k) + X[15] + 0x49b40821, 22) + i1;
        k = rotateLeft((k + G(i, i1, l) + X[1]) - 0x9e1da9e, 5) + i;
        l = rotateLeft((l + G(k, i, i1) + X[6]) - 0x3fbf4cc0, 9) + k;
        i1 = rotateLeft(i1 + G(l, k, i) + X[11] + 0x265e5a51, 14) + l;
        i = rotateLeft((i + G(i1, l, k) + X[0]) - 0x16493856, 20) + i1;
        k = rotateLeft((k + G(i, i1, l) + X[5]) - 0x29d0efa3, 5) + i;
        l = rotateLeft(l + G(k, i, i1) + X[10] + 0x2441453, 9) + k;
        i1 = rotateLeft((i1 + G(l, k, i) + X[15]) - 0x275e197f, 14) + l;
        i = rotateLeft((i + G(i1, l, k) + X[4]) - 0x182c0438, 20) + i1;
        k = rotateLeft(k + G(i, i1, l) + X[9] + 0x21e1cde6, 5) + i;
        l = rotateLeft((l + G(k, i, i1) + X[14]) - 0x3cc8f82a, 9) + k;
        i1 = rotateLeft((i1 + G(l, k, i) + X[3]) - 0xb2af279, 14) + l;
        i = rotateLeft(i + G(i1, l, k) + X[8] + 0x455a14ed, 20) + i1;
        k = rotateLeft((k + G(i, i1, l) + X[13]) - 0x561c16fb, 5) + i;
        l = rotateLeft((l + G(k, i, i1) + X[2]) - 0x3105c08, 9) + k;
        i1 = rotateLeft(i1 + G(l, k, i) + X[7] + 0x676f02d9, 14) + l;
        i = rotateLeft((i + G(i1, l, k) + X[12]) - 0x72d5b376, 20) + i1;
        k = rotateLeft((k + H(i, i1, l) + X[5]) - 0x5c6be, 4) + i;
        l = rotateLeft((l + H(k, i, i1) + X[8]) - 0x788e097f, 11) + k;
        i1 = rotateLeft(i1 + H(l, k, i) + X[11] + 0x6d9d6122, 16) + l;
        i = rotateLeft((i + H(i1, l, k) + X[14]) - 0x21ac7f4, 23) + i1;
        k = rotateLeft((k + H(i, i1, l) + X[1]) - 0x5b4115bc, 4) + i;
        l = rotateLeft(l + H(k, i, i1) + X[4] + 0x4bdecfa9, 11) + k;
        i1 = rotateLeft((i1 + H(l, k, i) + X[7]) - 0x944b4a0, 16) + l;
        i = rotateLeft((i + H(i1, l, k) + X[10]) - 0x41404390, 23) + i1;
        k = rotateLeft(k + H(i, i1, l) + X[13] + 0x289b7ec6, 4) + i;
        l = rotateLeft((l + H(k, i, i1) + X[0]) - 0x155ed806, 11) + k;
        i1 = rotateLeft((i1 + H(l, k, i) + X[3]) - 0x2b10cf7b, 16) + l;
        i = rotateLeft(i + H(i1, l, k) + X[6] + 0x4881d05, 23) + i1;
        k = rotateLeft((k + H(i, i1, l) + X[9]) - 0x262b2fc7, 4) + i;
        l = rotateLeft((l + H(k, i, i1) + X[12]) - 0x1924661b, 11) + k;
        i1 = rotateLeft(i1 + H(l, k, i) + X[15] + 0x1fa27cf8, 16) + l;
        i = rotateLeft((i + H(i1, l, k) + X[2]) - 0x3b53a99b, 23) + i1;
        k = rotateLeft((k + K(i, i1, l) + X[0]) - 0xbd6ddbc, 6) + i;
        l = rotateLeft(l + K(k, i, i1) + X[7] + 0x432aff97, 10) + k;
        i1 = rotateLeft((i1 + K(l, k, i) + X[14]) - 0x546bdc59, 15) + l;
        i = rotateLeft((i + K(i1, l, k) + X[5]) - 0x36c5fc7, 21) + i1;
        k = rotateLeft(k + K(i, i1, l) + X[12] + 0x655b59c3, 6) + i;
        l = rotateLeft((l + K(k, i, i1) + X[3]) - 0x70f3336e, 10) + k;
        i1 = rotateLeft((i1 + K(l, k, i) + X[10]) - 0x100b83, 15) + l;
        i = rotateLeft((i + K(i1, l, k) + X[1]) - 0x7a7ba22f, 21) + i1;
        k = rotateLeft(k + K(i, i1, l) + X[8] + 0x6fa87e4f, 6) + i;
        l = rotateLeft((l + K(k, i, i1) + X[15]) - 0x1d31920, 10) + k;
        i1 = rotateLeft((i1 + K(l, k, i) + X[6]) - 0x5cfebcec, 15) + l;
        i = rotateLeft(i + K(i1, l, k) + X[13] + 0x4e0811a1, 21) + i1;
        k = rotateLeft((k + K(i, i1, l) + X[4]) - 0x8ac817e, 6) + i;
        l = rotateLeft((l + K(k, i, i1) + X[11]) - 0x42c50dcb, 10) + k;
        i1 = rotateLeft(i1 + K(l, k, i) + X[2] + 0x2ad7d2bb, 15) + l;
        i = rotateLeft((i + K(i1, l, k) + X[9]) - 0x14792c6f, 21);
        H1 = k + H1;
        H2 = H2 + (i + i1);
        H3 = H3 + i1;
        H4 = H4 + l;
        xOff = 0;
        for (int j = 0; j != X.length; j++)
        {
            X[j] = 0;
        }

    }

    protected void processLength(long l)
    {
        if (xOff > 14)
        {
            processBlock();
        }
        X[14] = (int)(-1L & l);
        X[15] = (int)(l >>> 32);
    }

    protected void processWord(byte abyte0[], int i)
    {
        int ai[] = X;
        int j = xOff;
        xOff = j + 1;
        ai[j] = abyte0[i] & 0xff | (abyte0[i + 1] & 0xff) << 8 | (abyte0[i + 2] & 0xff) << 16 | (abyte0[i + 3] & 0xff) << 24;
        if (xOff == 16)
        {
            processBlock();
        }
    }

    public void reset()
    {
        super.reset();
        H1 = 0x67452301;
        H2 = 0xefcdab89;
        H3 = 0x98badcfe;
        H4 = 0x10325476;
        xOff = 0;
        for (int i = 0; i != X.length; i++)
        {
            X[i] = 0;
        }

    }
}
