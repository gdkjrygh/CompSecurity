// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.digests;


// Referenced classes of package org.bouncycastle.crypto.digests:
//            GeneralDigest

public class RIPEMD160Digest extends GeneralDigest
{

    private int a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f[];
    private int g;

    public RIPEMD160Digest()
    {
        f = new int[16];
        reset();
    }

    public RIPEMD160Digest(RIPEMD160Digest ripemd160digest)
    {
        super(ripemd160digest);
        f = new int[16];
        a = ripemd160digest.a;
        b = ripemd160digest.b;
        c = ripemd160digest.c;
        d = ripemd160digest.d;
        e = ripemd160digest.e;
        System.arraycopy(ripemd160digest.f, 0, f, 0, ripemd160digest.f.length);
        g = ripemd160digest.g;
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
        unpackWord(a, abyte0, i);
        unpackWord(b, abyte0, i + 4);
        unpackWord(c, abyte0, i + 8);
        unpackWord(d, abyte0, i + 12);
        unpackWord(e, abyte0, i + 16);
        reset();
        return 20;
    }

    public String getAlgorithmName()
    {
        return "RIPEMD160";
    }

    public int getDigestSize()
    {
        return 20;
    }

    protected void processBlock()
    {
        int k2 = a;
        int l1 = b;
        int j2 = c;
        int k1 = d;
        int i2 = e;
        int k = RL(f1(l1, j2, k1) + k2 + f[0], 11) + i2;
        int l = RL(j2, 10);
        int i1 = RL(f1(k, l1, l) + i2 + f[1], 14) + k1;
        int j1 = RL(l1, 10);
        int i = RL(f1(i1, k, j1) + k1 + f[2], 15) + l;
        k = RL(k, 10);
        l = RL(l + f1(i, i1, k) + f[3], 12) + j1;
        i1 = RL(i1, 10);
        j1 = RL(j1 + f1(l, i, i1) + f[4], 5) + k;
        i = RL(i, 10);
        k = RL(k + f1(j1, l, i) + f[5], 8) + i1;
        l = RL(l, 10);
        i1 = RL(i1 + f1(k, j1, l) + f[6], 7) + i;
        j1 = RL(j1, 10);
        i = RL(i + f1(i1, k, j1) + f[7], 9) + l;
        k = RL(k, 10);
        l = RL(l + f1(i, i1, k) + f[8], 11) + j1;
        i1 = RL(i1, 10);
        j1 = RL(j1 + f1(l, i, i1) + f[9], 13) + k;
        i = RL(i, 10);
        k = RL(k + f1(j1, l, i) + f[10], 14) + i1;
        l = RL(l, 10);
        i1 = RL(i1 + f1(k, j1, l) + f[11], 15) + i;
        j1 = RL(j1, 10);
        int l2 = RL(i + f1(i1, k, j1) + f[12], 6) + l;
        int i3 = RL(k, 10);
        int j3 = RL(l + f1(l2, i1, i3) + f[13], 7) + j1;
        i = RL(i1, 10);
        k = RL(j1 + f1(j3, l2, i) + f[14], 9) + i3;
        l = RL(l2, 10);
        i1 = RL(i3 + f1(k, j3, l) + f[15], 8) + i;
        j1 = RL(j3, 10);
        k2 = RL(k2 + f5(l1, j2, k1) + f[5] + 0x50a28be6, 8) + i2;
        j2 = RL(j2, 10);
        i2 = RL(i2 + f5(k2, l1, j2) + f[14] + 0x50a28be6, 9) + k1;
        l1 = RL(l1, 10);
        k1 = RL(k1 + f5(i2, k2, l1) + f[7] + 0x50a28be6, 9) + j2;
        k2 = RL(k2, 10);
        j2 = RL(j2 + f5(k1, i2, k2) + f[0] + 0x50a28be6, 11) + l1;
        i2 = RL(i2, 10);
        l1 = RL(l1 + f5(j2, k1, i2) + f[9] + 0x50a28be6, 13) + k2;
        k1 = RL(k1, 10);
        k2 = RL(k2 + f5(l1, j2, k1) + f[2] + 0x50a28be6, 15) + i2;
        j2 = RL(j2, 10);
        i2 = RL(i2 + f5(k2, l1, j2) + f[11] + 0x50a28be6, 15) + k1;
        l1 = RL(l1, 10);
        k1 = RL(k1 + f5(i2, k2, l1) + f[4] + 0x50a28be6, 5) + j2;
        k2 = RL(k2, 10);
        j2 = RL(j2 + f5(k1, i2, k2) + f[13] + 0x50a28be6, 7) + l1;
        i2 = RL(i2, 10);
        l1 = RL(l1 + f5(j2, k1, i2) + f[6] + 0x50a28be6, 7) + k2;
        k1 = RL(k1, 10);
        k2 = RL(k2 + f5(l1, j2, k1) + f[15] + 0x50a28be6, 8) + i2;
        j2 = RL(j2, 10);
        i2 = RL(i2 + f5(k2, l1, j2) + f[8] + 0x50a28be6, 11) + k1;
        l1 = RL(l1, 10);
        l2 = RL(k1 + f5(i2, k2, l1) + f[1] + 0x50a28be6, 14) + j2;
        k2 = RL(k2, 10);
        i3 = RL(j2 + f5(l2, i2, k2) + f[10] + 0x50a28be6, 14) + l1;
        k1 = RL(i2, 10);
        l1 = RL(l1 + f5(i3, l2, k1) + f[3] + 0x50a28be6, 12) + k2;
        i2 = RL(l2, 10);
        j2 = RL(k2 + f5(l1, i3, i2) + f[12] + 0x50a28be6, 6) + k1;
        k2 = RL(i3, 10);
        i = RL(i + f2(i1, k, j1) + f[7] + 0x5a827999, 7) + l;
        k = RL(k, 10);
        l = RL(l + f2(i, i1, k) + f[4] + 0x5a827999, 6) + j1;
        i1 = RL(i1, 10);
        j1 = RL(j1 + f2(l, i, i1) + f[13] + 0x5a827999, 8) + k;
        i = RL(i, 10);
        k = RL(k + f2(j1, l, i) + f[1] + 0x5a827999, 13) + i1;
        l = RL(l, 10);
        i1 = RL(i1 + f2(k, j1, l) + f[10] + 0x5a827999, 11) + i;
        j1 = RL(j1, 10);
        i = RL(i + f2(i1, k, j1) + f[6] + 0x5a827999, 9) + l;
        k = RL(k, 10);
        l = RL(l + f2(i, i1, k) + f[15] + 0x5a827999, 7) + j1;
        i1 = RL(i1, 10);
        j1 = RL(j1 + f2(l, i, i1) + f[3] + 0x5a827999, 15) + k;
        i = RL(i, 10);
        k = RL(k + f2(j1, l, i) + f[12] + 0x5a827999, 7) + i1;
        l = RL(l, 10);
        i1 = RL(i1 + f2(k, j1, l) + f[0] + 0x5a827999, 12) + i;
        j1 = RL(j1, 10);
        i = RL(i + f2(i1, k, j1) + f[9] + 0x5a827999, 15) + l;
        k = RL(k, 10);
        l = RL(l + f2(i, i1, k) + f[5] + 0x5a827999, 9) + j1;
        i1 = RL(i1, 10);
        j1 = RL(j1 + f2(l, i, i1) + f[2] + 0x5a827999, 11) + k;
        l2 = RL(i, 10);
        i3 = RL(k + f2(j1, l, l2) + f[14] + 0x5a827999, 7) + i1;
        i = RL(l, 10);
        k = RL(i1 + f2(i3, j1, i) + f[11] + 0x5a827999, 13) + l2;
        l = RL(j1, 10);
        i1 = RL(l2 + f2(k, i3, l) + f[8] + 0x5a827999, 12) + i;
        j1 = RL(i3, 10);
        k1 = RL(k1 + f4(j2, l1, k2) + f[6] + 0x5c4dd124, 9) + i2;
        l1 = RL(l1, 10);
        i2 = RL(i2 + f4(k1, j2, l1) + f[11] + 0x5c4dd124, 13) + k2;
        j2 = RL(j2, 10);
        k2 = RL(k2 + f4(i2, k1, j2) + f[3] + 0x5c4dd124, 15) + l1;
        k1 = RL(k1, 10);
        l1 = RL(l1 + f4(k2, i2, k1) + f[7] + 0x5c4dd124, 7) + j2;
        i2 = RL(i2, 10);
        j2 = RL(j2 + f4(l1, k2, i2) + f[0] + 0x5c4dd124, 12) + k1;
        k2 = RL(k2, 10);
        k1 = RL(k1 + f4(j2, l1, k2) + f[13] + 0x5c4dd124, 8) + i2;
        l1 = RL(l1, 10);
        i2 = RL(i2 + f4(k1, j2, l1) + f[5] + 0x5c4dd124, 9) + k2;
        j2 = RL(j2, 10);
        k2 = RL(k2 + f4(i2, k1, j2) + f[10] + 0x5c4dd124, 11) + l1;
        k1 = RL(k1, 10);
        l1 = RL(l1 + f4(k2, i2, k1) + f[14] + 0x5c4dd124, 7) + j2;
        i2 = RL(i2, 10);
        j2 = RL(j2 + f4(l1, k2, i2) + f[15] + 0x5c4dd124, 7) + k1;
        k2 = RL(k2, 10);
        k1 = RL(k1 + f4(j2, l1, k2) + f[8] + 0x5c4dd124, 12) + i2;
        l1 = RL(l1, 10);
        i2 = RL(i2 + f4(k1, j2, l1) + f[12] + 0x5c4dd124, 7) + k2;
        j2 = RL(j2, 10);
        k2 = RL(k2 + f4(i2, k1, j2) + f[4] + 0x5c4dd124, 6) + l1;
        l2 = RL(k1, 10);
        i3 = RL(l1 + f4(k2, i2, l2) + f[9] + 0x5c4dd124, 15) + j2;
        k1 = RL(i2, 10);
        l1 = RL(j2 + f4(i3, k2, k1) + f[1] + 0x5c4dd124, 13) + l2;
        i2 = RL(k2, 10);
        j2 = RL(l2 + f4(l1, i3, i2) + f[2] + 0x5c4dd124, 11) + k1;
        k2 = RL(i3, 10);
        i = RL(i + f3(i1, k, j1) + f[3] + 0x6ed9eba1, 11) + l;
        k = RL(k, 10);
        l = RL(l + f3(i, i1, k) + f[10] + 0x6ed9eba1, 13) + j1;
        i1 = RL(i1, 10);
        j1 = RL(j1 + f3(l, i, i1) + f[14] + 0x6ed9eba1, 6) + k;
        i = RL(i, 10);
        k = RL(k + f3(j1, l, i) + f[4] + 0x6ed9eba1, 7) + i1;
        l = RL(l, 10);
        i1 = RL(i1 + f3(k, j1, l) + f[9] + 0x6ed9eba1, 14) + i;
        j1 = RL(j1, 10);
        i = RL(i + f3(i1, k, j1) + f[15] + 0x6ed9eba1, 9) + l;
        k = RL(k, 10);
        l = RL(l + f3(i, i1, k) + f[8] + 0x6ed9eba1, 13) + j1;
        i1 = RL(i1, 10);
        j1 = RL(j1 + f3(l, i, i1) + f[1] + 0x6ed9eba1, 15) + k;
        i = RL(i, 10);
        k = RL(k + f3(j1, l, i) + f[2] + 0x6ed9eba1, 14) + i1;
        l = RL(l, 10);
        i1 = RL(i1 + f3(k, j1, l) + f[7] + 0x6ed9eba1, 8) + i;
        j1 = RL(j1, 10);
        i = RL(i + f3(i1, k, j1) + f[0] + 0x6ed9eba1, 13) + l;
        k = RL(k, 10);
        l = RL(l + f3(i, i1, k) + f[6] + 0x6ed9eba1, 6) + j1;
        i1 = RL(i1, 10);
        j1 = RL(j1 + f3(l, i, i1) + f[13] + 0x6ed9eba1, 5) + k;
        l2 = RL(i, 10);
        i3 = RL(k + f3(j1, l, l2) + f[11] + 0x6ed9eba1, 12) + i1;
        i = RL(l, 10);
        k = RL(i1 + f3(i3, j1, i) + f[5] + 0x6ed9eba1, 7) + l2;
        l = RL(j1, 10);
        i1 = RL(l2 + f3(k, i3, l) + f[12] + 0x6ed9eba1, 5) + i;
        j1 = RL(i3, 10);
        k1 = RL(k1 + f3(j2, l1, k2) + f[15] + 0x6d703ef3, 9) + i2;
        l1 = RL(l1, 10);
        i2 = RL(i2 + f3(k1, j2, l1) + f[5] + 0x6d703ef3, 7) + k2;
        j2 = RL(j2, 10);
        k2 = RL(k2 + f3(i2, k1, j2) + f[1] + 0x6d703ef3, 15) + l1;
        k1 = RL(k1, 10);
        l1 = RL(l1 + f3(k2, i2, k1) + f[3] + 0x6d703ef3, 11) + j2;
        i2 = RL(i2, 10);
        j2 = RL(j2 + f3(l1, k2, i2) + f[7] + 0x6d703ef3, 8) + k1;
        k2 = RL(k2, 10);
        k1 = RL(k1 + f3(j2, l1, k2) + f[14] + 0x6d703ef3, 6) + i2;
        l1 = RL(l1, 10);
        i2 = RL(i2 + f3(k1, j2, l1) + f[6] + 0x6d703ef3, 6) + k2;
        j2 = RL(j2, 10);
        k2 = RL(k2 + f3(i2, k1, j2) + f[9] + 0x6d703ef3, 14) + l1;
        k1 = RL(k1, 10);
        l1 = RL(l1 + f3(k2, i2, k1) + f[11] + 0x6d703ef3, 12) + j2;
        i2 = RL(i2, 10);
        j2 = RL(j2 + f3(l1, k2, i2) + f[8] + 0x6d703ef3, 13) + k1;
        k2 = RL(k2, 10);
        k1 = RL(k1 + f3(j2, l1, k2) + f[12] + 0x6d703ef3, 5) + i2;
        l1 = RL(l1, 10);
        i2 = RL(i2 + f3(k1, j2, l1) + f[2] + 0x6d703ef3, 14) + k2;
        j2 = RL(j2, 10);
        k2 = RL(k2 + f3(i2, k1, j2) + f[10] + 0x6d703ef3, 13) + l1;
        l2 = RL(k1, 10);
        i3 = RL(l1 + f3(k2, i2, l2) + f[0] + 0x6d703ef3, 13) + j2;
        k1 = RL(i2, 10);
        l1 = RL(j2 + f3(i3, k2, k1) + f[4] + 0x6d703ef3, 7) + l2;
        i2 = RL(k2, 10);
        j2 = RL(l2 + f3(l1, i3, i2) + f[13] + 0x6d703ef3, 5) + k1;
        k2 = RL(i3, 10);
        i = RL((i + f4(i1, k, j1) + f[1]) - 0x70e44324, 11) + l;
        k = RL(k, 10);
        l = RL((l + f4(i, i1, k) + f[9]) - 0x70e44324, 12) + j1;
        i1 = RL(i1, 10);
        j1 = RL((j1 + f4(l, i, i1) + f[11]) - 0x70e44324, 14) + k;
        i = RL(i, 10);
        k = RL((k + f4(j1, l, i) + f[10]) - 0x70e44324, 15) + i1;
        l = RL(l, 10);
        i1 = RL((i1 + f4(k, j1, l) + f[0]) - 0x70e44324, 14) + i;
        j1 = RL(j1, 10);
        i = RL((i + f4(i1, k, j1) + f[8]) - 0x70e44324, 15) + l;
        k = RL(k, 10);
        l = RL((l + f4(i, i1, k) + f[12]) - 0x70e44324, 9) + j1;
        i1 = RL(i1, 10);
        j1 = RL((j1 + f4(l, i, i1) + f[4]) - 0x70e44324, 8) + k;
        i = RL(i, 10);
        k = RL((k + f4(j1, l, i) + f[13]) - 0x70e44324, 9) + i1;
        l = RL(l, 10);
        i1 = RL((i1 + f4(k, j1, l) + f[3]) - 0x70e44324, 14) + i;
        j1 = RL(j1, 10);
        i = RL((i + f4(i1, k, j1) + f[7]) - 0x70e44324, 5) + l;
        k = RL(k, 10);
        l = RL((l + f4(i, i1, k) + f[15]) - 0x70e44324, 6) + j1;
        i1 = RL(i1, 10);
        j1 = RL((j1 + f4(l, i, i1) + f[14]) - 0x70e44324, 8) + k;
        l2 = RL(i, 10);
        i3 = RL((k + f4(j1, l, l2) + f[5]) - 0x70e44324, 6) + i1;
        i = RL(l, 10);
        k = RL((i1 + f4(i3, j1, i) + f[6]) - 0x70e44324, 5) + l2;
        l = RL(j1, 10);
        i1 = RL((l2 + f4(k, i3, l) + f[2]) - 0x70e44324, 12) + i;
        j1 = RL(i3, 10);
        k1 = RL(k1 + f2(j2, l1, k2) + f[8] + 0x7a6d76e9, 15) + i2;
        l1 = RL(l1, 10);
        i2 = RL(i2 + f2(k1, j2, l1) + f[6] + 0x7a6d76e9, 5) + k2;
        j2 = RL(j2, 10);
        k2 = RL(k2 + f2(i2, k1, j2) + f[4] + 0x7a6d76e9, 8) + l1;
        k1 = RL(k1, 10);
        l1 = RL(l1 + f2(k2, i2, k1) + f[1] + 0x7a6d76e9, 11) + j2;
        i2 = RL(i2, 10);
        j2 = RL(j2 + f2(l1, k2, i2) + f[3] + 0x7a6d76e9, 14) + k1;
        k2 = RL(k2, 10);
        k1 = RL(k1 + f2(j2, l1, k2) + f[11] + 0x7a6d76e9, 14) + i2;
        l1 = RL(l1, 10);
        i2 = RL(i2 + f2(k1, j2, l1) + f[15] + 0x7a6d76e9, 6) + k2;
        j2 = RL(j2, 10);
        k2 = RL(k2 + f2(i2, k1, j2) + f[0] + 0x7a6d76e9, 14) + l1;
        k1 = RL(k1, 10);
        l1 = RL(l1 + f2(k2, i2, k1) + f[5] + 0x7a6d76e9, 6) + j2;
        i2 = RL(i2, 10);
        j2 = RL(j2 + f2(l1, k2, i2) + f[12] + 0x7a6d76e9, 9) + k1;
        k2 = RL(k2, 10);
        k1 = RL(k1 + f2(j2, l1, k2) + f[2] + 0x7a6d76e9, 12) + i2;
        l1 = RL(l1, 10);
        i2 = RL(i2 + f2(k1, j2, l1) + f[13] + 0x7a6d76e9, 9) + k2;
        j2 = RL(j2, 10);
        k2 = RL(k2 + f2(i2, k1, j2) + f[9] + 0x7a6d76e9, 12) + l1;
        l2 = RL(k1, 10);
        i3 = RL(l1 + f2(k2, i2, l2) + f[7] + 0x7a6d76e9, 5) + j2;
        k1 = RL(i2, 10);
        l1 = RL(j2 + f2(i3, k2, k1) + f[10] + 0x7a6d76e9, 15) + l2;
        i2 = RL(k2, 10);
        j2 = RL(l2 + f2(l1, i3, i2) + f[14] + 0x7a6d76e9, 8) + k1;
        k2 = RL(i3, 10);
        i = RL((i + f5(i1, k, j1) + f[4]) - 0x56ac02b2, 9) + l;
        k = RL(k, 10);
        l = RL((l + f5(i, i1, k) + f[0]) - 0x56ac02b2, 15) + j1;
        i1 = RL(i1, 10);
        j1 = RL((j1 + f5(l, i, i1) + f[5]) - 0x56ac02b2, 5) + k;
        i = RL(i, 10);
        k = RL((k + f5(j1, l, i) + f[9]) - 0x56ac02b2, 11) + i1;
        l = RL(l, 10);
        i1 = RL((i1 + f5(k, j1, l) + f[7]) - 0x56ac02b2, 6) + i;
        j1 = RL(j1, 10);
        i = RL((i + f5(i1, k, j1) + f[12]) - 0x56ac02b2, 8) + l;
        k = RL(k, 10);
        l = RL((l + f5(i, i1, k) + f[2]) - 0x56ac02b2, 13) + j1;
        i1 = RL(i1, 10);
        j1 = RL((j1 + f5(l, i, i1) + f[10]) - 0x56ac02b2, 12) + k;
        i = RL(i, 10);
        k = RL((k + f5(j1, l, i) + f[14]) - 0x56ac02b2, 5) + i1;
        l = RL(l, 10);
        i1 = RL((i1 + f5(k, j1, l) + f[1]) - 0x56ac02b2, 12) + i;
        j1 = RL(j1, 10);
        i = RL((i + f5(i1, k, j1) + f[3]) - 0x56ac02b2, 13) + l;
        k = RL(k, 10);
        l = RL((l + f5(i, i1, k) + f[8]) - 0x56ac02b2, 14) + j1;
        i1 = RL(i1, 10);
        j1 = RL((j1 + f5(l, i, i1) + f[11]) - 0x56ac02b2, 11) + k;
        l2 = RL(i, 10);
        i3 = RL((k + f5(j1, l, l2) + f[6]) - 0x56ac02b2, 8) + i1;
        i = RL(l, 10);
        k = RL((i1 + f5(i3, j1, i) + f[15]) - 0x56ac02b2, 5) + l2;
        l = RL(j1, 10);
        i1 = RL((l2 + f5(k, i3, l) + f[13]) - 0x56ac02b2, 6);
        j1 = RL(i3, 10);
        k1 = RL(k1 + f1(j2, l1, k2) + f[12], 8) + i2;
        l1 = RL(l1, 10);
        i2 = RL(i2 + f1(k1, j2, l1) + f[15], 5) + k2;
        j2 = RL(j2, 10);
        k2 = RL(k2 + f1(i2, k1, j2) + f[10], 12) + l1;
        k1 = RL(k1, 10);
        l1 = RL(l1 + f1(k2, i2, k1) + f[4], 9) + j2;
        i2 = RL(i2, 10);
        j2 = RL(j2 + f1(l1, k2, i2) + f[1], 12) + k1;
        k2 = RL(k2, 10);
        k1 = RL(k1 + f1(j2, l1, k2) + f[5], 5) + i2;
        l1 = RL(l1, 10);
        i2 = RL(i2 + f1(k1, j2, l1) + f[8], 14) + k2;
        j2 = RL(j2, 10);
        k2 = RL(k2 + f1(i2, k1, j2) + f[7], 6) + l1;
        k1 = RL(k1, 10);
        l1 = RL(l1 + f1(k2, i2, k1) + f[6], 8) + j2;
        i2 = RL(i2, 10);
        j2 = RL(j2 + f1(l1, k2, i2) + f[2], 13) + k1;
        k2 = RL(k2, 10);
        k1 = RL(k1 + f1(j2, l1, k2) + f[13], 6) + i2;
        l1 = RL(l1, 10);
        i2 = RL(i2 + f1(k1, j2, l1) + f[14], 5) + k2;
        j2 = RL(j2, 10);
        k2 = RL(k2 + f1(i2, k1, j2) + f[0], 15) + l1;
        l2 = RL(k1, 10);
        l1 = RL(l1 + f1(k2, i2, l2) + f[3], 13) + j2;
        k1 = RL(i2, 10);
        i2 = RL(j2 + f1(l1, k2, k1) + f[9], 11) + l2;
        j2 = RL(k2, 10);
        k2 = RL(l2 + f1(i2, l1, j2) + f[11], 11);
        l1 = RL(l1, 10);
        l2 = b;
        b = j2 + (c + j1);
        c = k1 + (d + l);
        d = e + i + (k2 + k1);
        e = a + (i1 + i) + i2;
        a = l1 + (k + l2);
        g = 0;
        for (int j = 0; j != f.length; j++)
        {
            f[j] = 0;
        }

    }

    protected void processLength(long l)
    {
        if (g > 14)
        {
            processBlock();
        }
        f[14] = (int)(-1L & l);
        f[15] = (int)(l >>> 32);
    }

    protected void processWord(byte abyte0[], int i)
    {
        int ai[] = f;
        int j = g;
        g = j + 1;
        ai[j] = abyte0[i] & 0xff | (abyte0[i + 1] & 0xff) << 8 | (abyte0[i + 2] & 0xff) << 16 | (abyte0[i + 3] & 0xff) << 24;
        if (g == 16)
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
