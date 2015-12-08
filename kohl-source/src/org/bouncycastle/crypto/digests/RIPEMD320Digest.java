// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.digests;


// Referenced classes of package org.bouncycastle.crypto.digests:
//            GeneralDigest

public class RIPEMD320Digest extends GeneralDigest
{

    private static final int DIGEST_LENGTH = 40;
    private int H0;
    private int H1;
    private int H2;
    private int H3;
    private int H4;
    private int H5;
    private int H6;
    private int H7;
    private int H8;
    private int H9;
    private int X[];
    private int xOff;

    public RIPEMD320Digest()
    {
        X = new int[16];
        reset();
    }

    public RIPEMD320Digest(RIPEMD320Digest ripemd320digest)
    {
        super(ripemd320digest);
        X = new int[16];
        H0 = ripemd320digest.H0;
        H1 = ripemd320digest.H1;
        H2 = ripemd320digest.H2;
        H3 = ripemd320digest.H3;
        H4 = ripemd320digest.H4;
        H5 = ripemd320digest.H5;
        H6 = ripemd320digest.H6;
        H7 = ripemd320digest.H7;
        H8 = ripemd320digest.H8;
        H9 = ripemd320digest.H9;
        System.arraycopy(ripemd320digest.X, 0, X, 0, ripemd320digest.X.length);
        xOff = ripemd320digest.xOff;
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

    private int f5(int i, int j, int k)
    {
        return (~k | j) ^ i;
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
        unpackWord(H0, abyte0, i);
        unpackWord(H1, abyte0, i + 4);
        unpackWord(H2, abyte0, i + 8);
        unpackWord(H3, abyte0, i + 12);
        unpackWord(H4, abyte0, i + 16);
        unpackWord(H5, abyte0, i + 20);
        unpackWord(H6, abyte0, i + 24);
        unpackWord(H7, abyte0, i + 28);
        unpackWord(H8, abyte0, i + 32);
        unpackWord(H9, abyte0, i + 36);
        reset();
        return 40;
    }

    public String getAlgorithmName()
    {
        return "RIPEMD320";
    }

    public int getDigestSize()
    {
        return 40;
    }

    protected void processBlock()
    {
        int l = H0;
        int k1 = H1;
        int i1 = H2;
        int i = H3;
        int j1 = H4;
        int k2 = H5;
        int l1 = H6;
        int j2 = H7;
        int k = H8;
        int i2 = H9;
        l = RL(l + f1(k1, i1, i) + X[0], 11) + j1;
        i1 = RL(i1, 10);
        j1 = RL(j1 + f1(l, k1, i1) + X[1], 14) + i;
        k1 = RL(k1, 10);
        i = RL(i + f1(j1, l, k1) + X[2], 15) + i1;
        l = RL(l, 10);
        i1 = RL(i1 + f1(i, j1, l) + X[3], 12) + k1;
        j1 = RL(j1, 10);
        k1 = RL(k1 + f1(i1, i, j1) + X[4], 5) + l;
        i = RL(i, 10);
        l = RL(l + f1(k1, i1, i) + X[5], 8) + j1;
        i1 = RL(i1, 10);
        j1 = RL(j1 + f1(l, k1, i1) + X[6], 7) + i;
        k1 = RL(k1, 10);
        i = RL(i + f1(j1, l, k1) + X[7], 9) + i1;
        l = RL(l, 10);
        i1 = RL(i1 + f1(i, j1, l) + X[8], 11) + k1;
        j1 = RL(j1, 10);
        k1 = RL(k1 + f1(i1, i, j1) + X[9], 13) + l;
        i = RL(i, 10);
        l = RL(l + f1(k1, i1, i) + X[10], 14) + j1;
        i1 = RL(i1, 10);
        j1 = RL(j1 + f1(l, k1, i1) + X[11], 15) + i;
        k1 = RL(k1, 10);
        i = RL(i + f1(j1, l, k1) + X[12], 6) + i1;
        int l2 = RL(l, 10);
        int i3 = RL(i1 + f1(i, j1, l2) + X[13], 7) + k1;
        l = RL(j1, 10);
        i1 = RL(k1 + f1(i3, i, l) + X[14], 9) + l2;
        j1 = RL(i, 10);
        i = RL(l2 + f1(i1, i3, j1) + X[15], 8) + l;
        k1 = RL(i3, 10);
        k2 = RL(k2 + f5(l1, j2, k) + X[5] + 0x50a28be6, 8) + i2;
        j2 = RL(j2, 10);
        i2 = RL(i2 + f5(k2, l1, j2) + X[14] + 0x50a28be6, 9) + k;
        l1 = RL(l1, 10);
        k = RL(k + f5(i2, k2, l1) + X[7] + 0x50a28be6, 9) + j2;
        k2 = RL(k2, 10);
        j2 = RL(j2 + f5(k, i2, k2) + X[0] + 0x50a28be6, 11) + l1;
        i2 = RL(i2, 10);
        l1 = RL(l1 + f5(j2, k, i2) + X[9] + 0x50a28be6, 13) + k2;
        k = RL(k, 10);
        k2 = RL(k2 + f5(l1, j2, k) + X[2] + 0x50a28be6, 15) + i2;
        j2 = RL(j2, 10);
        i2 = RL(i2 + f5(k2, l1, j2) + X[11] + 0x50a28be6, 15) + k;
        l1 = RL(l1, 10);
        k = RL(k + f5(i2, k2, l1) + X[4] + 0x50a28be6, 5) + j2;
        k2 = RL(k2, 10);
        j2 = RL(j2 + f5(k, i2, k2) + X[13] + 0x50a28be6, 7) + l1;
        i2 = RL(i2, 10);
        l1 = RL(l1 + f5(j2, k, i2) + X[6] + 0x50a28be6, 7) + k2;
        k = RL(k, 10);
        k2 = RL(k2 + f5(l1, j2, k) + X[15] + 0x50a28be6, 8) + i2;
        j2 = RL(j2, 10);
        i2 = RL(i2 + f5(k2, l1, j2) + X[8] + 0x50a28be6, 11) + k;
        l2 = RL(l1, 10);
        k = RL(k + f5(i2, k2, l2) + X[1] + 0x50a28be6, 14) + j2;
        k2 = RL(k2, 10);
        i3 = RL(j2 + f5(k, i2, k2) + X[10] + 0x50a28be6, 14) + l2;
        l1 = RL(i2, 10);
        i2 = RL(l2 + f5(i3, k, l1) + X[3] + 0x50a28be6, 12) + k2;
        j2 = RL(k, 10);
        k = RL(k2 + f5(i2, i3, j2) + X[12] + 0x50a28be6, 6) + l1;
        k2 = RL(i3, 10);
        l = RL(l + f2(k, i1, k1) + X[7] + 0x5a827999, 7) + j1;
        i1 = RL(i1, 10);
        j1 = RL(j1 + f2(l, k, i1) + X[4] + 0x5a827999, 6) + k1;
        k = RL(k, 10);
        k1 = RL(k1 + f2(j1, l, k) + X[13] + 0x5a827999, 8) + i1;
        l = RL(l, 10);
        i1 = RL(i1 + f2(k1, j1, l) + X[1] + 0x5a827999, 13) + k;
        j1 = RL(j1, 10);
        k = RL(k + f2(i1, k1, j1) + X[10] + 0x5a827999, 11) + l;
        k1 = RL(k1, 10);
        l = RL(l + f2(k, i1, k1) + X[6] + 0x5a827999, 9) + j1;
        i1 = RL(i1, 10);
        j1 = RL(j1 + f2(l, k, i1) + X[15] + 0x5a827999, 7) + k1;
        k = RL(k, 10);
        k1 = RL(k1 + f2(j1, l, k) + X[3] + 0x5a827999, 15) + i1;
        l = RL(l, 10);
        i1 = RL(i1 + f2(k1, j1, l) + X[12] + 0x5a827999, 7) + k;
        j1 = RL(j1, 10);
        k = RL(k + f2(i1, k1, j1) + X[0] + 0x5a827999, 12) + l;
        k1 = RL(k1, 10);
        l = RL(l + f2(k, i1, k1) + X[9] + 0x5a827999, 15) + j1;
        i1 = RL(i1, 10);
        j1 = RL(j1 + f2(l, k, i1) + X[5] + 0x5a827999, 9) + k1;
        k = RL(k, 10);
        k1 = RL(k1 + f2(j1, l, k) + X[2] + 0x5a827999, 11) + i1;
        l2 = RL(l, 10);
        i3 = RL(i1 + f2(k1, j1, l2) + X[14] + 0x5a827999, 7) + k;
        l = RL(j1, 10);
        i1 = RL(k + f2(i3, k1, l) + X[11] + 0x5a827999, 13) + l2;
        j1 = RL(k1, 10);
        k1 = RL(l2 + f2(i1, i3, j1) + X[8] + 0x5a827999, 12) + l;
        k = RL(i3, 10);
        l1 = RL(l1 + f4(i, i2, k2) + X[6] + 0x5c4dd124, 9) + j2;
        i2 = RL(i2, 10);
        j2 = RL(j2 + f4(l1, i, i2) + X[11] + 0x5c4dd124, 13) + k2;
        i = RL(i, 10);
        k2 = RL(k2 + f4(j2, l1, i) + X[3] + 0x5c4dd124, 15) + i2;
        l1 = RL(l1, 10);
        i2 = RL(i2 + f4(k2, j2, l1) + X[7] + 0x5c4dd124, 7) + i;
        j2 = RL(j2, 10);
        i = RL(i + f4(i2, k2, j2) + X[0] + 0x5c4dd124, 12) + l1;
        k2 = RL(k2, 10);
        l1 = RL(l1 + f4(i, i2, k2) + X[13] + 0x5c4dd124, 8) + j2;
        i2 = RL(i2, 10);
        j2 = RL(j2 + f4(l1, i, i2) + X[5] + 0x5c4dd124, 9) + k2;
        i = RL(i, 10);
        k2 = RL(k2 + f4(j2, l1, i) + X[10] + 0x5c4dd124, 11) + i2;
        l1 = RL(l1, 10);
        i2 = RL(i2 + f4(k2, j2, l1) + X[14] + 0x5c4dd124, 7) + i;
        j2 = RL(j2, 10);
        i = RL(i + f4(i2, k2, j2) + X[15] + 0x5c4dd124, 7) + l1;
        k2 = RL(k2, 10);
        l1 = RL(l1 + f4(i, i2, k2) + X[8] + 0x5c4dd124, 12) + j2;
        i2 = RL(i2, 10);
        j2 = RL(j2 + f4(l1, i, i2) + X[12] + 0x5c4dd124, 7) + k2;
        i = RL(i, 10);
        k2 = RL(k2 + f4(j2, l1, i) + X[4] + 0x5c4dd124, 6) + i2;
        l2 = RL(l1, 10);
        i3 = RL(i2 + f4(k2, j2, l2) + X[9] + 0x5c4dd124, 15) + i;
        l1 = RL(j2, 10);
        i2 = RL(i + f4(i3, k2, l1) + X[1] + 0x5c4dd124, 13) + l2;
        j2 = RL(k2, 10);
        k2 = RL(l2 + f4(i2, i3, j2) + X[2] + 0x5c4dd124, 11) + l1;
        i = RL(i3, 10);
        l = RL(l + f3(k1, i1, i) + X[3] + 0x6ed9eba1, 11) + j1;
        i1 = RL(i1, 10);
        j1 = RL(j1 + f3(l, k1, i1) + X[10] + 0x6ed9eba1, 13) + i;
        k1 = RL(k1, 10);
        i = RL(i + f3(j1, l, k1) + X[14] + 0x6ed9eba1, 6) + i1;
        l = RL(l, 10);
        i1 = RL(i1 + f3(i, j1, l) + X[4] + 0x6ed9eba1, 7) + k1;
        j1 = RL(j1, 10);
        k1 = RL(k1 + f3(i1, i, j1) + X[9] + 0x6ed9eba1, 14) + l;
        i = RL(i, 10);
        l = RL(l + f3(k1, i1, i) + X[15] + 0x6ed9eba1, 9) + j1;
        i1 = RL(i1, 10);
        j1 = RL(j1 + f3(l, k1, i1) + X[8] + 0x6ed9eba1, 13) + i;
        k1 = RL(k1, 10);
        i = RL(i + f3(j1, l, k1) + X[1] + 0x6ed9eba1, 15) + i1;
        l = RL(l, 10);
        i1 = RL(i1 + f3(i, j1, l) + X[2] + 0x6ed9eba1, 14) + k1;
        j1 = RL(j1, 10);
        k1 = RL(k1 + f3(i1, i, j1) + X[7] + 0x6ed9eba1, 8) + l;
        i = RL(i, 10);
        l = RL(l + f3(k1, i1, i) + X[0] + 0x6ed9eba1, 13) + j1;
        i1 = RL(i1, 10);
        j1 = RL(j1 + f3(l, k1, i1) + X[6] + 0x6ed9eba1, 6) + i;
        k1 = RL(k1, 10);
        l2 = RL(i + f3(j1, l, k1) + X[13] + 0x6ed9eba1, 5) + i1;
        i3 = RL(l, 10);
        int j3 = RL(i1 + f3(l2, j1, i3) + X[11] + 0x6ed9eba1, 12) + k1;
        i = RL(j1, 10);
        l = RL(k1 + f3(j3, l2, i) + X[5] + 0x6ed9eba1, 7) + i3;
        i1 = RL(l2, 10);
        j1 = RL(i3 + f3(l, j3, i1) + X[12] + 0x6ed9eba1, 5) + i;
        k1 = RL(j3, 10);
        l1 = RL(l1 + f3(k2, i2, k) + X[15] + 0x6d703ef3, 9) + j2;
        i2 = RL(i2, 10);
        j2 = RL(j2 + f3(l1, k2, i2) + X[5] + 0x6d703ef3, 7) + k;
        k2 = RL(k2, 10);
        k = RL(k + f3(j2, l1, k2) + X[1] + 0x6d703ef3, 15) + i2;
        l1 = RL(l1, 10);
        i2 = RL(i2 + f3(k, j2, l1) + X[3] + 0x6d703ef3, 11) + k2;
        j2 = RL(j2, 10);
        k2 = RL(k2 + f3(i2, k, j2) + X[7] + 0x6d703ef3, 8) + l1;
        k = RL(k, 10);
        l1 = RL(l1 + f3(k2, i2, k) + X[14] + 0x6d703ef3, 6) + j2;
        i2 = RL(i2, 10);
        j2 = RL(j2 + f3(l1, k2, i2) + X[6] + 0x6d703ef3, 6) + k;
        k2 = RL(k2, 10);
        k = RL(k + f3(j2, l1, k2) + X[9] + 0x6d703ef3, 14) + i2;
        l1 = RL(l1, 10);
        i2 = RL(i2 + f3(k, j2, l1) + X[11] + 0x6d703ef3, 12) + k2;
        j2 = RL(j2, 10);
        k2 = RL(k2 + f3(i2, k, j2) + X[8] + 0x6d703ef3, 13) + l1;
        k = RL(k, 10);
        l1 = RL(l1 + f3(k2, i2, k) + X[12] + 0x6d703ef3, 5) + j2;
        i2 = RL(i2, 10);
        j2 = RL(j2 + f3(l1, k2, i2) + X[2] + 0x6d703ef3, 14) + k;
        k2 = RL(k2, 10);
        k = RL(k + f3(j2, l1, k2) + X[10] + 0x6d703ef3, 13) + i2;
        l2 = RL(l1, 10);
        i3 = RL(i2 + f3(k, j2, l2) + X[0] + 0x6d703ef3, 13) + k2;
        j3 = RL(j2, 10);
        l1 = RL(k2 + f3(i3, k, j3) + X[4] + 0x6d703ef3, 7) + l2;
        i2 = RL(k, 10);
        j2 = RL(l2 + f3(l1, i3, i2) + X[13] + 0x6d703ef3, 5) + j3;
        k2 = RL(i3, 10);
        k = RL((j3 + f4(j1, l, k1) + X[1]) - 0x70e44324, 11) + i1;
        l = RL(l, 10);
        i1 = RL((i1 + f4(k, j1, l) + X[9]) - 0x70e44324, 12) + k1;
        j1 = RL(j1, 10);
        k1 = RL((k1 + f4(i1, k, j1) + X[11]) - 0x70e44324, 14) + l;
        k = RL(k, 10);
        l = RL((l + f4(k1, i1, k) + X[10]) - 0x70e44324, 15) + j1;
        i1 = RL(i1, 10);
        j1 = RL((j1 + f4(l, k1, i1) + X[0]) - 0x70e44324, 14) + k;
        k1 = RL(k1, 10);
        k = RL((k + f4(j1, l, k1) + X[8]) - 0x70e44324, 15) + i1;
        l = RL(l, 10);
        i1 = RL((i1 + f4(k, j1, l) + X[12]) - 0x70e44324, 9) + k1;
        j1 = RL(j1, 10);
        k1 = RL((k1 + f4(i1, k, j1) + X[4]) - 0x70e44324, 8) + l;
        k = RL(k, 10);
        l = RL((l + f4(k1, i1, k) + X[13]) - 0x70e44324, 9) + j1;
        i1 = RL(i1, 10);
        j1 = RL((j1 + f4(l, k1, i1) + X[3]) - 0x70e44324, 14) + k;
        k1 = RL(k1, 10);
        k = RL((k + f4(j1, l, k1) + X[7]) - 0x70e44324, 5) + i1;
        l = RL(l, 10);
        i1 = RL((i1 + f4(k, j1, l) + X[15]) - 0x70e44324, 6) + k1;
        j1 = RL(j1, 10);
        k1 = RL((k1 + f4(i1, k, j1) + X[14]) - 0x70e44324, 8) + l;
        l2 = RL(k, 10);
        i3 = RL((l + f4(k1, i1, l2) + X[5]) - 0x70e44324, 6) + j1;
        l = RL(i1, 10);
        k = RL((j1 + f4(i3, k1, l) + X[6]) - 0x70e44324, 5) + l2;
        i1 = RL(k1, 10);
        j1 = RL((l2 + f4(k, i3, i1) + X[2]) - 0x70e44324, 12) + l;
        k1 = RL(i3, 10);
        i = RL(i + f2(j2, l1, k2) + X[8] + 0x7a6d76e9, 15) + i2;
        l1 = RL(l1, 10);
        i2 = RL(i2 + f2(i, j2, l1) + X[6] + 0x7a6d76e9, 5) + k2;
        j2 = RL(j2, 10);
        k2 = RL(k2 + f2(i2, i, j2) + X[4] + 0x7a6d76e9, 8) + l1;
        i = RL(i, 10);
        l1 = RL(l1 + f2(k2, i2, i) + X[1] + 0x7a6d76e9, 11) + j2;
        i2 = RL(i2, 10);
        j2 = RL(j2 + f2(l1, k2, i2) + X[3] + 0x7a6d76e9, 14) + i;
        k2 = RL(k2, 10);
        i = RL(i + f2(j2, l1, k2) + X[11] + 0x7a6d76e9, 14) + i2;
        l1 = RL(l1, 10);
        i2 = RL(i2 + f2(i, j2, l1) + X[15] + 0x7a6d76e9, 6) + k2;
        j2 = RL(j2, 10);
        k2 = RL(k2 + f2(i2, i, j2) + X[0] + 0x7a6d76e9, 14) + l1;
        i = RL(i, 10);
        l1 = RL(l1 + f2(k2, i2, i) + X[5] + 0x7a6d76e9, 6) + j2;
        i2 = RL(i2, 10);
        j2 = RL(j2 + f2(l1, k2, i2) + X[12] + 0x7a6d76e9, 9) + i;
        k2 = RL(k2, 10);
        i = RL(i + f2(j2, l1, k2) + X[2] + 0x7a6d76e9, 12) + i2;
        l1 = RL(l1, 10);
        i2 = RL(i2 + f2(i, j2, l1) + X[13] + 0x7a6d76e9, 9) + k2;
        j2 = RL(j2, 10);
        k2 = RL(k2 + f2(i2, i, j2) + X[9] + 0x7a6d76e9, 12) + l1;
        l2 = RL(i, 10);
        i3 = RL(l1 + f2(k2, i2, l2) + X[7] + 0x7a6d76e9, 5) + j2;
        i = RL(i2, 10);
        j3 = RL(j2 + f2(i3, k2, i) + X[10] + 0x7a6d76e9, 15) + l2;
        l1 = RL(k2, 10);
        i2 = RL(l2 + f2(j3, i3, l1) + X[14] + 0x7a6d76e9, 8) + i;
        j2 = RL(i3, 10);
        l = RL((l + f5(j1, j3, k1) + X[4]) - 0x56ac02b2, 9) + i1;
        k2 = RL(j3, 10);
        i1 = RL((i1 + f5(l, j1, k2) + X[0]) - 0x56ac02b2, 15) + k1;
        j1 = RL(j1, 10);
        k1 = RL((k1 + f5(i1, l, j1) + X[5]) - 0x56ac02b2, 5) + k2;
        l = RL(l, 10);
        k2 = RL((k2 + f5(k1, i1, l) + X[9]) - 0x56ac02b2, 11) + j1;
        i1 = RL(i1, 10);
        j1 = RL((j1 + f5(k2, k1, i1) + X[7]) - 0x56ac02b2, 6) + l;
        k1 = RL(k1, 10);
        l = RL((l + f5(j1, k2, k1) + X[12]) - 0x56ac02b2, 8) + i1;
        k2 = RL(k2, 10);
        i1 = RL((i1 + f5(l, j1, k2) + X[2]) - 0x56ac02b2, 13) + k1;
        j1 = RL(j1, 10);
        k1 = RL((k1 + f5(i1, l, j1) + X[10]) - 0x56ac02b2, 12) + k2;
        l = RL(l, 10);
        k2 = RL((k2 + f5(k1, i1, l) + X[14]) - 0x56ac02b2, 5) + j1;
        i1 = RL(i1, 10);
        j1 = RL((j1 + f5(k2, k1, i1) + X[1]) - 0x56ac02b2, 12) + l;
        k1 = RL(k1, 10);
        l = RL((l + f5(j1, k2, k1) + X[3]) - 0x56ac02b2, 13) + i1;
        k2 = RL(k2, 10);
        i1 = RL((i1 + f5(l, j1, k2) + X[8]) - 0x56ac02b2, 14) + k1;
        j1 = RL(j1, 10);
        k1 = RL((k1 + f5(i1, l, j1) + X[11]) - 0x56ac02b2, 11) + k2;
        l2 = RL(l, 10);
        k2 = RL((k2 + f5(k1, i1, l2) + X[6]) - 0x56ac02b2, 8) + j1;
        l = RL(i1, 10);
        i1 = RL((j1 + f5(k2, k1, l) + X[15]) - 0x56ac02b2, 5) + l2;
        j1 = RL(k1, 10);
        k1 = RL((l2 + f5(i1, k2, j1) + X[13]) - 0x56ac02b2, 6);
        k2 = RL(k2, 10);
        i = RL(i + f1(i2, k, j2) + X[12], 8) + l1;
        k = RL(k, 10);
        l1 = RL(l1 + f1(i, i2, k) + X[15], 5) + j2;
        i2 = RL(i2, 10);
        j2 = RL(j2 + f1(l1, i, i2) + X[10], 12) + k;
        i = RL(i, 10);
        k = RL(k + f1(j2, l1, i) + X[4], 9) + i2;
        l1 = RL(l1, 10);
        i2 = RL(i2 + f1(k, j2, l1) + X[1], 12) + i;
        j2 = RL(j2, 10);
        i = RL(i + f1(i2, k, j2) + X[5], 5) + l1;
        k = RL(k, 10);
        l1 = RL(l1 + f1(i, i2, k) + X[8], 14) + j2;
        i2 = RL(i2, 10);
        j2 = RL(j2 + f1(l1, i, i2) + X[7], 6) + k;
        i = RL(i, 10);
        k = RL(k + f1(j2, l1, i) + X[6], 8) + i2;
        l1 = RL(l1, 10);
        i2 = RL(i2 + f1(k, j2, l1) + X[2], 13) + i;
        j2 = RL(j2, 10);
        i = RL(i + f1(i2, k, j2) + X[13], 6) + l1;
        k = RL(k, 10);
        l1 = RL(l1 + f1(i, i2, k) + X[14], 5) + j2;
        i2 = RL(i2, 10);
        j2 = RL(j2 + f1(l1, i, i2) + X[0], 15) + k;
        i = RL(i, 10);
        k = RL(k + f1(j2, l1, i) + X[3], 13) + i2;
        l1 = RL(l1, 10);
        i2 = RL(i2 + f1(k, j2, l1) + X[9], 11) + i;
        j2 = RL(j2, 10);
        i = RL(i + f1(i2, k, j2) + X[11], 11);
        k = RL(k, 10);
        H0 = l + H0;
        H1 = H1 + (k1 + l);
        H2 = H2 + i1;
        H3 = H3 + k2;
        H4 = H4 + j2;
        H5 = l1 + H5;
        H6 = H6 + (i + l1);
        H7 = H7 + i2;
        H8 = H8 + k;
        H9 = H9 + j1;
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
        H0 = 0x67452301;
        H1 = 0xefcdab89;
        H2 = 0x98badcfe;
        H3 = 0x10325476;
        H4 = 0xc3d2e1f0;
        H5 = 0x76543210;
        H6 = 0xfedcba98;
        H7 = 0x89abcdef;
        H8 = 0x1234567;
        H9 = 0x3c2d1e0f;
        xOff = 0;
        for (int i = 0; i != X.length; i++)
        {
            X[i] = 0;
        }

    }
}
