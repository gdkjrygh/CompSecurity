// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto.digests;


// Referenced classes of package org.spongycastle.crypto.digests:
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
        c();
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

    private static int a(int i, int j)
    {
        return i << j | i >>> 32 - j;
    }

    private static int a(int i, int j, int k)
    {
        return i & j | ~i & k;
    }

    private static int a(int i, int j, int k, int l, int i1, int j1)
    {
        return a((j ^ k ^ l) + i + i1, j1);
    }

    private static void a(int i, byte abyte0[], int j)
    {
        abyte0[j] = (byte)i;
        abyte0[j + 1] = (byte)(i >>> 8);
        abyte0[j + 2] = (byte)(i >>> 16);
        abyte0[j + 3] = (byte)(i >>> 24);
    }

    private static int b(int i, int j, int k)
    {
        return i & k | ~k & j;
    }

    private static int b(int i, int j, int k, int l, int i1, int j1)
    {
        return a(a(j, k, l) + i + i1 + 0x5a827999, j1);
    }

    private static int c(int i, int j, int k, int l, int i1, int j1)
    {
        return a(((~k | j) ^ l) + i + i1 + 0x6ed9eba1, j1);
    }

    private static int d(int i, int j, int k, int l, int i1, int j1)
    {
        return a((b(j, k, l) + i + i1) - 0x70e44324, j1);
    }

    private static int e(int i, int j, int k, int l, int i1, int j1)
    {
        return a((j ^ k ^ l) + i + i1, j1);
    }

    private static int f(int i, int j, int k, int l, int i1, int j1)
    {
        return a(a(j, k, l) + i + i1 + 0x6d703ef3, j1);
    }

    private static int g(int i, int j, int k, int l, int i1, int j1)
    {
        return a(((~k | j) ^ l) + i + i1 + 0x5c4dd124, j1);
    }

    private static int h(int i, int j, int k, int l, int i1, int j1)
    {
        return a(b(j, k, l) + i + i1 + 0x50a28be6, j1);
    }

    public final int a(byte abyte0[], int i)
    {
        e();
        a(a, abyte0, i);
        a(b, abyte0, i + 4);
        a(c, abyte0, i + 8);
        a(d, abyte0, i + 12);
        c();
        return 16;
    }

    public final String a()
    {
        return "RIPEMD128";
    }

    protected final void a(long l)
    {
        if (f > 14)
        {
            f();
        }
        e[14] = (int)(-1L & l);
        e[15] = (int)(l >>> 32);
    }

    public final int b()
    {
        return 16;
    }

    protected final void b(byte abyte0[], int i)
    {
        int ai[] = e;
        int j = f;
        f = j + 1;
        ai[j] = abyte0[i] & 0xff | (abyte0[i + 1] & 0xff) << 8 | (abyte0[i + 2] & 0xff) << 16 | (abyte0[i + 3] & 0xff) << 24;
        if (f == 16)
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
        f = 0;
        for (int i = 0; i != e.length; i++)
        {
            e[i] = 0;
        }

    }

    protected final void f()
    {
        int i2 = a;
        int j1 = b;
        int k1 = c;
        int l1 = d;
        int k = a(i2, j1, k1, l1, e[0], 11);
        int l = a(l1, k, j1, k1, e[1], 14);
        int i1 = a(k1, l, k, j1, e[2], 15);
        int i = a(j1, i1, l, k, e[3], 12);
        k = a(k, i, i1, l, e[4], 5);
        l = a(l, k, i, i1, e[5], 8);
        i1 = a(i1, l, k, i, e[6], 7);
        i = a(i, i1, l, k, e[7], 9);
        k = a(k, i, i1, l, e[8], 11);
        l = a(l, k, i, i1, e[9], 13);
        i1 = a(i1, l, k, i, e[10], 14);
        i = a(i, i1, l, k, e[11], 15);
        k = a(k, i, i1, l, e[12], 6);
        l = a(l, k, i, i1, e[13], 7);
        i1 = a(i1, l, k, i, e[14], 9);
        i = a(i, i1, l, k, e[15], 8);
        k = b(k, i, i1, l, e[7], 7);
        l = b(l, k, i, i1, e[4], 6);
        i1 = b(i1, l, k, i, e[13], 8);
        i = b(i, i1, l, k, e[1], 13);
        k = b(k, i, i1, l, e[10], 11);
        l = b(l, k, i, i1, e[6], 9);
        i1 = b(i1, l, k, i, e[15], 7);
        i = b(i, i1, l, k, e[3], 15);
        k = b(k, i, i1, l, e[12], 7);
        l = b(l, k, i, i1, e[0], 12);
        i1 = b(i1, l, k, i, e[9], 15);
        i = b(i, i1, l, k, e[5], 9);
        k = b(k, i, i1, l, e[2], 11);
        l = b(l, k, i, i1, e[14], 7);
        i1 = b(i1, l, k, i, e[11], 13);
        i = b(i, i1, l, k, e[8], 12);
        k = c(k, i, i1, l, e[3], 11);
        l = c(l, k, i, i1, e[10], 13);
        i1 = c(i1, l, k, i, e[14], 6);
        i = c(i, i1, l, k, e[4], 7);
        k = c(k, i, i1, l, e[9], 14);
        l = c(l, k, i, i1, e[15], 9);
        i1 = c(i1, l, k, i, e[8], 13);
        i = c(i, i1, l, k, e[1], 15);
        k = c(k, i, i1, l, e[2], 14);
        l = c(l, k, i, i1, e[7], 8);
        i1 = c(i1, l, k, i, e[0], 13);
        i = c(i, i1, l, k, e[6], 6);
        k = c(k, i, i1, l, e[13], 5);
        l = c(l, k, i, i1, e[11], 12);
        i1 = c(i1, l, k, i, e[5], 7);
        i = c(i, i1, l, k, e[12], 5);
        k = d(k, i, i1, l, e[1], 11);
        l = d(l, k, i, i1, e[9], 12);
        i1 = d(i1, l, k, i, e[11], 14);
        i = d(i, i1, l, k, e[10], 15);
        k = d(k, i, i1, l, e[0], 14);
        l = d(l, k, i, i1, e[8], 15);
        i1 = d(i1, l, k, i, e[12], 9);
        i = d(i, i1, l, k, e[4], 8);
        k = d(k, i, i1, l, e[13], 9);
        l = d(l, k, i, i1, e[3], 14);
        i1 = d(i1, l, k, i, e[7], 5);
        int j2 = d(i, i1, l, k, e[15], 6);
        i = d(k, j2, i1, l, e[14], 8);
        k = d(l, i, j2, i1, e[5], 6);
        l = d(i1, k, i, j2, e[6], 5);
        i1 = d(j2, l, k, i, e[2], 12);
        i2 = h(i2, j1, k1, l1, e[5], 8);
        l1 = h(l1, i2, j1, k1, e[14], 9);
        k1 = h(k1, l1, i2, j1, e[7], 9);
        j1 = h(j1, k1, l1, i2, e[0], 11);
        i2 = h(i2, j1, k1, l1, e[9], 13);
        l1 = h(l1, i2, j1, k1, e[2], 15);
        k1 = h(k1, l1, i2, j1, e[11], 15);
        j1 = h(j1, k1, l1, i2, e[4], 5);
        i2 = h(i2, j1, k1, l1, e[13], 7);
        l1 = h(l1, i2, j1, k1, e[6], 7);
        k1 = h(k1, l1, i2, j1, e[15], 8);
        j1 = h(j1, k1, l1, i2, e[8], 11);
        i2 = h(i2, j1, k1, l1, e[1], 14);
        l1 = h(l1, i2, j1, k1, e[10], 14);
        k1 = h(k1, l1, i2, j1, e[3], 12);
        j1 = h(j1, k1, l1, i2, e[12], 6);
        i2 = g(i2, j1, k1, l1, e[6], 9);
        l1 = g(l1, i2, j1, k1, e[11], 13);
        k1 = g(k1, l1, i2, j1, e[3], 15);
        j1 = g(j1, k1, l1, i2, e[7], 7);
        i2 = g(i2, j1, k1, l1, e[0], 12);
        l1 = g(l1, i2, j1, k1, e[13], 8);
        k1 = g(k1, l1, i2, j1, e[5], 9);
        j1 = g(j1, k1, l1, i2, e[10], 11);
        i2 = g(i2, j1, k1, l1, e[14], 7);
        l1 = g(l1, i2, j1, k1, e[15], 7);
        k1 = g(k1, l1, i2, j1, e[8], 12);
        j1 = g(j1, k1, l1, i2, e[12], 7);
        i2 = g(i2, j1, k1, l1, e[4], 6);
        l1 = g(l1, i2, j1, k1, e[9], 15);
        k1 = g(k1, l1, i2, j1, e[1], 13);
        j1 = g(j1, k1, l1, i2, e[2], 11);
        i2 = f(i2, j1, k1, l1, e[15], 9);
        l1 = f(l1, i2, j1, k1, e[5], 7);
        k1 = f(k1, l1, i2, j1, e[1], 15);
        j1 = f(j1, k1, l1, i2, e[3], 11);
        i2 = f(i2, j1, k1, l1, e[7], 8);
        l1 = f(l1, i2, j1, k1, e[14], 6);
        k1 = f(k1, l1, i2, j1, e[6], 6);
        j1 = f(j1, k1, l1, i2, e[9], 14);
        i2 = f(i2, j1, k1, l1, e[11], 12);
        l1 = f(l1, i2, j1, k1, e[8], 13);
        k1 = f(k1, l1, i2, j1, e[12], 5);
        j1 = f(j1, k1, l1, i2, e[2], 14);
        i2 = f(i2, j1, k1, l1, e[10], 13);
        l1 = f(l1, i2, j1, k1, e[0], 13);
        k1 = f(k1, l1, i2, j1, e[4], 7);
        j1 = f(j1, k1, l1, i2, e[13], 5);
        i2 = e(i2, j1, k1, l1, e[8], 15);
        l1 = e(l1, i2, j1, k1, e[6], 5);
        k1 = e(k1, l1, i2, j1, e[4], 8);
        j1 = e(j1, k1, l1, i2, e[1], 11);
        i2 = e(i2, j1, k1, l1, e[3], 14);
        l1 = e(l1, i2, j1, k1, e[11], 14);
        k1 = e(k1, l1, i2, j1, e[15], 6);
        j1 = e(j1, k1, l1, i2, e[0], 14);
        i2 = e(i2, j1, k1, l1, e[5], 6);
        l1 = e(l1, i2, j1, k1, e[12], 9);
        k1 = e(k1, l1, i2, j1, e[2], 12);
        j2 = e(j1, k1, l1, i2, e[13], 9);
        j1 = e(i2, j2, k1, l1, e[9], 12);
        l1 = e(l1, j1, j2, k1, e[7], 5);
        k1 = e(k1, l1, j1, j2, e[10], 15);
        i2 = e(j2, k1, l1, j1, e[14], 8);
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
}
