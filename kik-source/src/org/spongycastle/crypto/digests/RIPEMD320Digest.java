// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto.digests;


// Referenced classes of package org.spongycastle.crypto.digests:
//            GeneralDigest

public class RIPEMD320Digest extends GeneralDigest
{

    private int a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k[];
    private int l;

    public RIPEMD320Digest()
    {
        k = new int[16];
        c();
    }

    public RIPEMD320Digest(RIPEMD320Digest ripemd320digest)
    {
        super(ripemd320digest);
        k = new int[16];
        a = ripemd320digest.a;
        b = ripemd320digest.b;
        c = ripemd320digest.c;
        d = ripemd320digest.d;
        e = ripemd320digest.e;
        f = ripemd320digest.f;
        g = ripemd320digest.g;
        h = ripemd320digest.h;
        i = ripemd320digest.i;
        j = ripemd320digest.j;
        System.arraycopy(ripemd320digest.k, 0, k, 0, ripemd320digest.k.length);
        l = ripemd320digest.l;
    }

    private static int a(int i1, int j1)
    {
        return i1 << j1 | i1 >>> 32 - j1;
    }

    private static int a(int i1, int j1, int k1)
    {
        return i1 & j1 | ~i1 & k1;
    }

    private static void a(int i1, byte abyte0[], int j1)
    {
        abyte0[j1] = (byte)i1;
        abyte0[j1 + 1] = (byte)(i1 >>> 8);
        abyte0[j1 + 2] = (byte)(i1 >>> 16);
        abyte0[j1 + 3] = (byte)(i1 >>> 24);
    }

    private static int b(int i1, int j1, int k1)
    {
        return i1 & k1 | ~k1 & j1;
    }

    public final int a(byte abyte0[], int i1)
    {
        e();
        a(a, abyte0, i1);
        a(b, abyte0, i1 + 4);
        a(c, abyte0, i1 + 8);
        a(d, abyte0, i1 + 12);
        a(e, abyte0, i1 + 16);
        a(f, abyte0, i1 + 20);
        a(g, abyte0, i1 + 24);
        a(h, abyte0, i1 + 28);
        a(i, abyte0, i1 + 32);
        a(j, abyte0, i1 + 36);
        c();
        return 40;
    }

    public final String a()
    {
        return "RIPEMD320";
    }

    protected final void a(long l1)
    {
        if (l > 14)
        {
            f();
        }
        k[14] = (int)(-1L & l1);
        k[15] = (int)(l1 >>> 32);
    }

    public final int b()
    {
        return 40;
    }

    protected final void b(byte abyte0[], int i1)
    {
        int ai[] = k;
        int j1 = l;
        l = j1 + 1;
        ai[j1] = abyte0[i1] & 0xff | (abyte0[i1 + 1] & 0xff) << 8 | (abyte0[i1 + 2] & 0xff) << 16 | (abyte0[i1 + 3] & 0xff) << 24;
        if (l == 16)
        {
            f();
        }
    }

    public final void c()
    {
        super.c();
        a = 0x67452301;
        b = 0xefcdab89;
        c = 0x98badcfe;
        d = 0x10325476;
        e = 0xc3d2e1f0;
        f = 0x76543210;
        g = 0xfedcba98;
        h = 0x89abcdef;
        i = 0x1234567;
        j = 0x3c2d1e0f;
        l = 0;
        for (int i1 = 0; i1 != k.length; i1++)
        {
            k[i1] = 0;
        }

    }

    protected final void f()
    {
        int l1 = a;
        int k2 = b;
        int i2 = c;
        int i1 = d;
        int j2 = e;
        int k3 = f;
        int l2 = g;
        int j3 = h;
        int k1 = i;
        int i3 = j;
        l1 = a(l1 + (k2 ^ i2 ^ i1) + k[0], 11) + j2;
        i2 = a(i2, 10);
        j2 = a(j2 + (l1 ^ k2 ^ i2) + k[1], 14) + i1;
        k2 = a(k2, 10);
        i1 = a(i1 + (j2 ^ l1 ^ k2) + k[2], 15) + i2;
        l1 = a(l1, 10);
        i2 = a(i2 + (i1 ^ j2 ^ l1) + k[3], 12) + k2;
        j2 = a(j2, 10);
        k2 = a(k2 + (i2 ^ i1 ^ j2) + k[4], 5) + l1;
        i1 = a(i1, 10);
        l1 = a(l1 + (k2 ^ i2 ^ i1) + k[5], 8) + j2;
        i2 = a(i2, 10);
        j2 = a(j2 + (l1 ^ k2 ^ i2) + k[6], 7) + i1;
        k2 = a(k2, 10);
        i1 = a(i1 + (j2 ^ l1 ^ k2) + k[7], 9) + i2;
        l1 = a(l1, 10);
        i2 = a(i2 + (i1 ^ j2 ^ l1) + k[8], 11) + k2;
        j2 = a(j2, 10);
        k2 = a(k2 + (i2 ^ i1 ^ j2) + k[9], 13) + l1;
        i1 = a(i1, 10);
        l1 = a(l1 + (k2 ^ i2 ^ i1) + k[10], 14) + j2;
        i2 = a(i2, 10);
        j2 = a(j2 + (l1 ^ k2 ^ i2) + k[11], 15) + i1;
        k2 = a(k2, 10);
        i1 = a(i1 + (j2 ^ l1 ^ k2) + k[12], 6) + i2;
        int l3 = a(l1, 10);
        int i4 = a(i2 + (i1 ^ j2 ^ l3) + k[13], 7) + k2;
        l1 = a(j2, 10);
        i2 = a(k2 + (i4 ^ i1 ^ l1) + k[14], 9) + l3;
        j2 = a(i1, 10);
        i1 = a(l3 + (i2 ^ i4 ^ j2) + k[15], 8) + l1;
        k2 = a(i4, 10);
        k3 = a(k3 + ((~k1 | j3) ^ l2) + k[5] + 0x50a28be6, 8) + i3;
        j3 = a(j3, 10);
        i3 = a(i3 + ((~j3 | l2) ^ k3) + k[14] + 0x50a28be6, 9) + k1;
        l2 = a(l2, 10);
        k1 = a(k1 + ((~l2 | k3) ^ i3) + k[7] + 0x50a28be6, 9) + j3;
        k3 = a(k3, 10);
        j3 = a(j3 + ((~k3 | i3) ^ k1) + k[0] + 0x50a28be6, 11) + l2;
        i3 = a(i3, 10);
        l2 = a(l2 + ((~i3 | k1) ^ j3) + k[9] + 0x50a28be6, 13) + k3;
        k1 = a(k1, 10);
        k3 = a(k3 + ((~k1 | j3) ^ l2) + k[2] + 0x50a28be6, 15) + i3;
        j3 = a(j3, 10);
        i3 = a(i3 + ((~j3 | l2) ^ k3) + k[11] + 0x50a28be6, 15) + k1;
        l2 = a(l2, 10);
        k1 = a(k1 + ((~l2 | k3) ^ i3) + k[4] + 0x50a28be6, 5) + j3;
        k3 = a(k3, 10);
        j3 = a(j3 + ((~k3 | i3) ^ k1) + k[13] + 0x50a28be6, 7) + l2;
        i3 = a(i3, 10);
        l2 = a(l2 + ((~i3 | k1) ^ j3) + k[6] + 0x50a28be6, 7) + k3;
        k1 = a(k1, 10);
        k3 = a(k3 + ((~k1 | j3) ^ l2) + k[15] + 0x50a28be6, 8) + i3;
        j3 = a(j3, 10);
        i3 = a(i3 + ((~j3 | l2) ^ k3) + k[8] + 0x50a28be6, 11) + k1;
        l3 = a(l2, 10);
        k1 = a(k1 + ((~l3 | k3) ^ i3) + k[1] + 0x50a28be6, 14) + j3;
        k3 = a(k3, 10);
        i4 = a(j3 + ((~k3 | i3) ^ k1) + k[10] + 0x50a28be6, 14) + l3;
        l2 = a(i3, 10);
        i3 = a(l3 + ((~l2 | k1) ^ i4) + k[3] + 0x50a28be6, 12) + k3;
        j3 = a(k1, 10);
        k1 = a(k3 + ((~j3 | i4) ^ i3) + k[12] + 0x50a28be6, 6) + l2;
        k3 = a(i4, 10);
        l1 = a(l1 + a(k1, i2, k2) + k[7] + 0x5a827999, 7) + j2;
        i2 = a(i2, 10);
        j2 = a(j2 + a(l1, k1, i2) + k[4] + 0x5a827999, 6) + k2;
        k1 = a(k1, 10);
        k2 = a(k2 + a(j2, l1, k1) + k[13] + 0x5a827999, 8) + i2;
        l1 = a(l1, 10);
        i2 = a(i2 + a(k2, j2, l1) + k[1] + 0x5a827999, 13) + k1;
        j2 = a(j2, 10);
        k1 = a(k1 + a(i2, k2, j2) + k[10] + 0x5a827999, 11) + l1;
        k2 = a(k2, 10);
        l1 = a(l1 + a(k1, i2, k2) + k[6] + 0x5a827999, 9) + j2;
        i2 = a(i2, 10);
        j2 = a(j2 + a(l1, k1, i2) + k[15] + 0x5a827999, 7) + k2;
        k1 = a(k1, 10);
        k2 = a(k2 + a(j2, l1, k1) + k[3] + 0x5a827999, 15) + i2;
        l1 = a(l1, 10);
        i2 = a(i2 + a(k2, j2, l1) + k[12] + 0x5a827999, 7) + k1;
        j2 = a(j2, 10);
        k1 = a(k1 + a(i2, k2, j2) + k[0] + 0x5a827999, 12) + l1;
        k2 = a(k2, 10);
        l1 = a(l1 + a(k1, i2, k2) + k[9] + 0x5a827999, 15) + j2;
        i2 = a(i2, 10);
        j2 = a(j2 + a(l1, k1, i2) + k[5] + 0x5a827999, 9) + k2;
        k1 = a(k1, 10);
        k2 = a(k2 + a(j2, l1, k1) + k[2] + 0x5a827999, 11) + i2;
        l3 = a(l1, 10);
        i4 = a(i2 + a(k2, j2, l3) + k[14] + 0x5a827999, 7) + k1;
        l1 = a(j2, 10);
        i2 = a(k1 + a(i4, k2, l1) + k[11] + 0x5a827999, 13) + l3;
        j2 = a(k2, 10);
        k2 = a(l3 + a(i2, i4, j2) + k[8] + 0x5a827999, 12) + l1;
        k1 = a(i4, 10);
        l2 = a(l2 + b(i1, i3, k3) + k[6] + 0x5c4dd124, 9) + j3;
        i3 = a(i3, 10);
        j3 = a(j3 + b(l2, i1, i3) + k[11] + 0x5c4dd124, 13) + k3;
        i1 = a(i1, 10);
        k3 = a(k3 + b(j3, l2, i1) + k[3] + 0x5c4dd124, 15) + i3;
        l2 = a(l2, 10);
        i3 = a(i3 + b(k3, j3, l2) + k[7] + 0x5c4dd124, 7) + i1;
        j3 = a(j3, 10);
        i1 = a(i1 + b(i3, k3, j3) + k[0] + 0x5c4dd124, 12) + l2;
        k3 = a(k3, 10);
        l2 = a(l2 + b(i1, i3, k3) + k[13] + 0x5c4dd124, 8) + j3;
        i3 = a(i3, 10);
        j3 = a(j3 + b(l2, i1, i3) + k[5] + 0x5c4dd124, 9) + k3;
        i1 = a(i1, 10);
        k3 = a(k3 + b(j3, l2, i1) + k[10] + 0x5c4dd124, 11) + i3;
        l2 = a(l2, 10);
        i3 = a(i3 + b(k3, j3, l2) + k[14] + 0x5c4dd124, 7) + i1;
        j3 = a(j3, 10);
        i1 = a(i1 + b(i3, k3, j3) + k[15] + 0x5c4dd124, 7) + l2;
        k3 = a(k3, 10);
        l2 = a(l2 + b(i1, i3, k3) + k[8] + 0x5c4dd124, 12) + j3;
        i3 = a(i3, 10);
        j3 = a(j3 + b(l2, i1, i3) + k[12] + 0x5c4dd124, 7) + k3;
        i1 = a(i1, 10);
        k3 = a(k3 + b(j3, l2, i1) + k[4] + 0x5c4dd124, 6) + i3;
        l3 = a(l2, 10);
        i4 = a(i3 + b(k3, j3, l3) + k[9] + 0x5c4dd124, 15) + i1;
        l2 = a(j3, 10);
        i3 = a(i1 + b(i4, k3, l2) + k[1] + 0x5c4dd124, 13) + l3;
        j3 = a(k3, 10);
        k3 = a(l3 + b(i3, i4, j3) + k[2] + 0x5c4dd124, 11) + l2;
        i1 = a(i4, 10);
        l1 = a(l1 + ((~i2 | k2) ^ i1) + k[3] + 0x6ed9eba1, 11) + j2;
        i2 = a(i2, 10);
        j2 = a(j2 + ((~k2 | l1) ^ i2) + k[10] + 0x6ed9eba1, 13) + i1;
        k2 = a(k2, 10);
        i1 = a(i1 + ((~l1 | j2) ^ k2) + k[14] + 0x6ed9eba1, 6) + i2;
        l1 = a(l1, 10);
        i2 = a(i2 + ((~j2 | i1) ^ l1) + k[4] + 0x6ed9eba1, 7) + k2;
        j2 = a(j2, 10);
        k2 = a(k2 + ((~i1 | i2) ^ j2) + k[9] + 0x6ed9eba1, 14) + l1;
        i1 = a(i1, 10);
        l1 = a(l1 + ((~i2 | k2) ^ i1) + k[15] + 0x6ed9eba1, 9) + j2;
        i2 = a(i2, 10);
        j2 = a(j2 + ((~k2 | l1) ^ i2) + k[8] + 0x6ed9eba1, 13) + i1;
        k2 = a(k2, 10);
        i1 = a(i1 + ((~l1 | j2) ^ k2) + k[1] + 0x6ed9eba1, 15) + i2;
        l1 = a(l1, 10);
        i2 = a(i2 + ((~j2 | i1) ^ l1) + k[2] + 0x6ed9eba1, 14) + k2;
        j2 = a(j2, 10);
        k2 = a(k2 + ((~i1 | i2) ^ j2) + k[7] + 0x6ed9eba1, 8) + l1;
        i1 = a(i1, 10);
        l1 = a(l1 + ((~i2 | k2) ^ i1) + k[0] + 0x6ed9eba1, 13) + j2;
        i2 = a(i2, 10);
        j2 = a(j2 + ((~k2 | l1) ^ i2) + k[6] + 0x6ed9eba1, 6) + i1;
        k2 = a(k2, 10);
        l3 = a(i1 + ((~l1 | j2) ^ k2) + k[13] + 0x6ed9eba1, 5) + i2;
        i4 = a(l1, 10);
        int j4 = a(i2 + ((~j2 | l3) ^ i4) + k[11] + 0x6ed9eba1, 12) + k2;
        i1 = a(j2, 10);
        l1 = a(k2 + ((~l3 | j4) ^ i1) + k[5] + 0x6ed9eba1, 7) + i4;
        i2 = a(l3, 10);
        j2 = a(i4 + ((~j4 | l1) ^ i2) + k[12] + 0x6ed9eba1, 5) + i1;
        k2 = a(j4, 10);
        l2 = a(l2 + ((~i3 | k3) ^ k1) + k[15] + 0x6d703ef3, 9) + j3;
        i3 = a(i3, 10);
        j3 = a(j3 + ((~k3 | l2) ^ i3) + k[5] + 0x6d703ef3, 7) + k1;
        k3 = a(k3, 10);
        k1 = a(k1 + ((~l2 | j3) ^ k3) + k[1] + 0x6d703ef3, 15) + i3;
        l2 = a(l2, 10);
        i3 = a(i3 + ((~j3 | k1) ^ l2) + k[3] + 0x6d703ef3, 11) + k3;
        j3 = a(j3, 10);
        k3 = a(k3 + ((~k1 | i3) ^ j3) + k[7] + 0x6d703ef3, 8) + l2;
        k1 = a(k1, 10);
        l2 = a(l2 + ((~i3 | k3) ^ k1) + k[14] + 0x6d703ef3, 6) + j3;
        i3 = a(i3, 10);
        j3 = a(j3 + ((~k3 | l2) ^ i3) + k[6] + 0x6d703ef3, 6) + k1;
        k3 = a(k3, 10);
        k1 = a(k1 + ((~l2 | j3) ^ k3) + k[9] + 0x6d703ef3, 14) + i3;
        l2 = a(l2, 10);
        i3 = a(i3 + ((~j3 | k1) ^ l2) + k[11] + 0x6d703ef3, 12) + k3;
        j3 = a(j3, 10);
        k3 = a(k3 + ((~k1 | i3) ^ j3) + k[8] + 0x6d703ef3, 13) + l2;
        k1 = a(k1, 10);
        l2 = a(l2 + ((~i3 | k3) ^ k1) + k[12] + 0x6d703ef3, 5) + j3;
        i3 = a(i3, 10);
        j3 = a(j3 + ((~k3 | l2) ^ i3) + k[2] + 0x6d703ef3, 14) + k1;
        k3 = a(k3, 10);
        k1 = a(k1 + ((~l2 | j3) ^ k3) + k[10] + 0x6d703ef3, 13) + i3;
        l3 = a(l2, 10);
        i4 = a(i3 + ((~j3 | k1) ^ l3) + k[0] + 0x6d703ef3, 13) + k3;
        j4 = a(j3, 10);
        l2 = a(k3 + ((~k1 | i4) ^ j4) + k[4] + 0x6d703ef3, 7) + l3;
        i3 = a(k1, 10);
        j3 = a(l3 + ((~i4 | l2) ^ i3) + k[13] + 0x6d703ef3, 5) + j4;
        k3 = a(i4, 10);
        k1 = a((j4 + b(j2, l1, k2) + k[1]) - 0x70e44324, 11) + i2;
        l1 = a(l1, 10);
        i2 = a((i2 + b(k1, j2, l1) + k[9]) - 0x70e44324, 12) + k2;
        j2 = a(j2, 10);
        k2 = a((k2 + b(i2, k1, j2) + k[11]) - 0x70e44324, 14) + l1;
        k1 = a(k1, 10);
        l1 = a((l1 + b(k2, i2, k1) + k[10]) - 0x70e44324, 15) + j2;
        i2 = a(i2, 10);
        j2 = a((j2 + b(l1, k2, i2) + k[0]) - 0x70e44324, 14) + k1;
        k2 = a(k2, 10);
        k1 = a((k1 + b(j2, l1, k2) + k[8]) - 0x70e44324, 15) + i2;
        l1 = a(l1, 10);
        i2 = a((i2 + b(k1, j2, l1) + k[12]) - 0x70e44324, 9) + k2;
        j2 = a(j2, 10);
        k2 = a((k2 + b(i2, k1, j2) + k[4]) - 0x70e44324, 8) + l1;
        k1 = a(k1, 10);
        l1 = a((l1 + b(k2, i2, k1) + k[13]) - 0x70e44324, 9) + j2;
        i2 = a(i2, 10);
        j2 = a((j2 + b(l1, k2, i2) + k[3]) - 0x70e44324, 14) + k1;
        k2 = a(k2, 10);
        k1 = a((k1 + b(j2, l1, k2) + k[7]) - 0x70e44324, 5) + i2;
        l1 = a(l1, 10);
        i2 = a((i2 + b(k1, j2, l1) + k[15]) - 0x70e44324, 6) + k2;
        j2 = a(j2, 10);
        k2 = a((k2 + b(i2, k1, j2) + k[14]) - 0x70e44324, 8) + l1;
        l3 = a(k1, 10);
        i4 = a((l1 + b(k2, i2, l3) + k[5]) - 0x70e44324, 6) + j2;
        l1 = a(i2, 10);
        k1 = a((j2 + b(i4, k2, l1) + k[6]) - 0x70e44324, 5) + l3;
        i2 = a(k2, 10);
        j2 = a((l3 + b(k1, i4, i2) + k[2]) - 0x70e44324, 12) + l1;
        k2 = a(i4, 10);
        i1 = a(i1 + a(j3, l2, k3) + k[8] + 0x7a6d76e9, 15) + i3;
        l2 = a(l2, 10);
        i3 = a(i3 + a(i1, j3, l2) + k[6] + 0x7a6d76e9, 5) + k3;
        j3 = a(j3, 10);
        k3 = a(k3 + a(i3, i1, j3) + k[4] + 0x7a6d76e9, 8) + l2;
        i1 = a(i1, 10);
        l2 = a(l2 + a(k3, i3, i1) + k[1] + 0x7a6d76e9, 11) + j3;
        i3 = a(i3, 10);
        j3 = a(j3 + a(l2, k3, i3) + k[3] + 0x7a6d76e9, 14) + i1;
        k3 = a(k3, 10);
        i1 = a(i1 + a(j3, l2, k3) + k[11] + 0x7a6d76e9, 14) + i3;
        l2 = a(l2, 10);
        i3 = a(i3 + a(i1, j3, l2) + k[15] + 0x7a6d76e9, 6) + k3;
        j3 = a(j3, 10);
        k3 = a(k3 + a(i3, i1, j3) + k[0] + 0x7a6d76e9, 14) + l2;
        i1 = a(i1, 10);
        l2 = a(l2 + a(k3, i3, i1) + k[5] + 0x7a6d76e9, 6) + j3;
        i3 = a(i3, 10);
        j3 = a(j3 + a(l2, k3, i3) + k[12] + 0x7a6d76e9, 9) + i1;
        k3 = a(k3, 10);
        i1 = a(i1 + a(j3, l2, k3) + k[2] + 0x7a6d76e9, 12) + i3;
        l2 = a(l2, 10);
        i3 = a(i3 + a(i1, j3, l2) + k[13] + 0x7a6d76e9, 9) + k3;
        j3 = a(j3, 10);
        k3 = a(k3 + a(i3, i1, j3) + k[9] + 0x7a6d76e9, 12) + l2;
        l3 = a(i1, 10);
        i4 = a(l2 + a(k3, i3, l3) + k[7] + 0x7a6d76e9, 5) + j3;
        i1 = a(i3, 10);
        j4 = a(j3 + a(i4, k3, i1) + k[10] + 0x7a6d76e9, 15) + l3;
        l2 = a(k3, 10);
        i3 = a(l3 + a(j4, i4, l2) + k[14] + 0x7a6d76e9, 8) + i1;
        j3 = a(i4, 10);
        l1 = a((l1 + ((~k2 | j4) ^ j2) + k[4]) - 0x56ac02b2, 9) + i2;
        k3 = a(j4, 10);
        i2 = a((i2 + ((~k3 | j2) ^ l1) + k[0]) - 0x56ac02b2, 15) + k2;
        j2 = a(j2, 10);
        k2 = a((k2 + ((~j2 | l1) ^ i2) + k[5]) - 0x56ac02b2, 5) + k3;
        l1 = a(l1, 10);
        k3 = a((k3 + ((~l1 | i2) ^ k2) + k[9]) - 0x56ac02b2, 11) + j2;
        i2 = a(i2, 10);
        j2 = a((j2 + ((~i2 | k2) ^ k3) + k[7]) - 0x56ac02b2, 6) + l1;
        k2 = a(k2, 10);
        l1 = a((l1 + ((~k2 | k3) ^ j2) + k[12]) - 0x56ac02b2, 8) + i2;
        k3 = a(k3, 10);
        i2 = a((i2 + ((~k3 | j2) ^ l1) + k[2]) - 0x56ac02b2, 13) + k2;
        j2 = a(j2, 10);
        k2 = a((k2 + ((~j2 | l1) ^ i2) + k[10]) - 0x56ac02b2, 12) + k3;
        l1 = a(l1, 10);
        k3 = a((k3 + ((~l1 | i2) ^ k2) + k[14]) - 0x56ac02b2, 5) + j2;
        i2 = a(i2, 10);
        j2 = a((j2 + ((~i2 | k2) ^ k3) + k[1]) - 0x56ac02b2, 12) + l1;
        k2 = a(k2, 10);
        l1 = a((l1 + ((~k2 | k3) ^ j2) + k[3]) - 0x56ac02b2, 13) + i2;
        k3 = a(k3, 10);
        i2 = a((i2 + ((~k3 | j2) ^ l1) + k[8]) - 0x56ac02b2, 14) + k2;
        j2 = a(j2, 10);
        k2 = a((k2 + ((~j2 | l1) ^ i2) + k[11]) - 0x56ac02b2, 11) + k3;
        l3 = a(l1, 10);
        k3 = a((k3 + ((~l3 | i2) ^ k2) + k[6]) - 0x56ac02b2, 8) + j2;
        l1 = a(i2, 10);
        i2 = a((j2 + ((~l1 | k2) ^ k3) + k[15]) - 0x56ac02b2, 5) + l3;
        j2 = a(k2, 10);
        k2 = a((l3 + ((~j2 | k3) ^ i2) + k[13]) - 0x56ac02b2, 6);
        k3 = a(k3, 10);
        i1 = a(i1 + (i3 ^ k1 ^ j3) + k[12], 8) + l2;
        k1 = a(k1, 10);
        l2 = a(l2 + (i1 ^ i3 ^ k1) + k[15], 5) + j3;
        i3 = a(i3, 10);
        j3 = a(j3 + (l2 ^ i1 ^ i3) + k[10], 12) + k1;
        i1 = a(i1, 10);
        k1 = a(k1 + (j3 ^ l2 ^ i1) + k[4], 9) + i3;
        l2 = a(l2, 10);
        i3 = a(i3 + (k1 ^ j3 ^ l2) + k[1], 12) + i1;
        j3 = a(j3, 10);
        i1 = a(i1 + (i3 ^ k1 ^ j3) + k[5], 5) + l2;
        k1 = a(k1, 10);
        l2 = a(l2 + (i1 ^ i3 ^ k1) + k[8], 14) + j3;
        i3 = a(i3, 10);
        j3 = a(j3 + (l2 ^ i1 ^ i3) + k[7], 6) + k1;
        i1 = a(i1, 10);
        k1 = a(k1 + (j3 ^ l2 ^ i1) + k[6], 8) + i3;
        l2 = a(l2, 10);
        i3 = a(i3 + (k1 ^ j3 ^ l2) + k[2], 13) + i1;
        j3 = a(j3, 10);
        i1 = a(i1 + (i3 ^ k1 ^ j3) + k[13], 6) + l2;
        k1 = a(k1, 10);
        l2 = a(l2 + (i1 ^ i3 ^ k1) + k[14], 5) + j3;
        i3 = a(i3, 10);
        j3 = a(j3 + (l2 ^ i1 ^ i3) + k[0], 15) + k1;
        i1 = a(i1, 10);
        k1 = a(k1 + (j3 ^ l2 ^ i1) + k[3], 13) + i3;
        l2 = a(l2, 10);
        i3 = a(i3 + (k1 ^ j3 ^ l2) + k[9], 11) + i1;
        j3 = a(j3, 10);
        i1 = a(i1 + (i3 ^ k1 ^ j3) + k[11], 11);
        k1 = a(k1, 10);
        a = l1 + a;
        b = b + (k2 + l1);
        c = c + i2;
        d = d + k3;
        e = e + j3;
        f = l2 + f;
        g = g + (i1 + l2);
        h = h + i3;
        i = i + k1;
        j = j + j2;
        l = 0;
        for (int j1 = 0; j1 != k.length; j1++)
        {
            k[j1] = 0;
        }

    }
}
