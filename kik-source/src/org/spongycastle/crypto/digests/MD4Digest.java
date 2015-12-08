// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto.digests;


// Referenced classes of package org.spongycastle.crypto.digests:
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
        c();
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

    private static int a(int i, int j)
    {
        return i << j | i >>> 32 - j;
    }

    private static int a(int i, int j, int k)
    {
        return i & j | ~i & k;
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
        return i & j | i & k | j & k;
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
        return "MD4";
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
        int k = a;
        int i = b;
        int i1 = c;
        int l = d;
        k = a(k + a(i, i1, l) + e[0], 3);
        l = a(l + a(k, i, i1) + e[1], 7);
        i1 = a(i1 + a(l, k, i) + e[2], 11);
        i = a(i + a(i1, l, k) + e[3], 19);
        k = a(k + a(i, i1, l) + e[4], 3);
        l = a(l + a(k, i, i1) + e[5], 7);
        i1 = a(i1 + a(l, k, i) + e[6], 11);
        i = a(i + a(i1, l, k) + e[7], 19);
        k = a(k + a(i, i1, l) + e[8], 3);
        l = a(l + a(k, i, i1) + e[9], 7);
        i1 = a(i1 + a(l, k, i) + e[10], 11);
        i = a(i + a(i1, l, k) + e[11], 19);
        k = a(k + a(i, i1, l) + e[12], 3);
        l = a(l + a(k, i, i1) + e[13], 7);
        i1 = a(i1 + a(l, k, i) + e[14], 11);
        i = a(i + a(i1, l, k) + e[15], 19);
        k = a(k + b(i, i1, l) + e[0] + 0x5a827999, 3);
        l = a(l + b(k, i, i1) + e[4] + 0x5a827999, 5);
        i1 = a(i1 + b(l, k, i) + e[8] + 0x5a827999, 9);
        i = a(i + b(i1, l, k) + e[12] + 0x5a827999, 13);
        k = a(k + b(i, i1, l) + e[1] + 0x5a827999, 3);
        l = a(l + b(k, i, i1) + e[5] + 0x5a827999, 5);
        i1 = a(i1 + b(l, k, i) + e[9] + 0x5a827999, 9);
        i = a(i + b(i1, l, k) + e[13] + 0x5a827999, 13);
        k = a(k + b(i, i1, l) + e[2] + 0x5a827999, 3);
        l = a(l + b(k, i, i1) + e[6] + 0x5a827999, 5);
        i1 = a(i1 + b(l, k, i) + e[10] + 0x5a827999, 9);
        i = a(i + b(i1, l, k) + e[14] + 0x5a827999, 13);
        k = a(k + b(i, i1, l) + e[3] + 0x5a827999, 3);
        l = a(l + b(k, i, i1) + e[7] + 0x5a827999, 5);
        i1 = a(i1 + b(l, k, i) + e[11] + 0x5a827999, 9);
        i = a(i + b(i1, l, k) + e[15] + 0x5a827999, 13);
        k = a(k + (i ^ i1 ^ l) + e[0] + 0x6ed9eba1, 3);
        l = a(l + (k ^ i ^ i1) + e[8] + 0x6ed9eba1, 9);
        i1 = a(i1 + (l ^ k ^ i) + e[4] + 0x6ed9eba1, 11);
        i = a(i + (i1 ^ l ^ k) + e[12] + 0x6ed9eba1, 15);
        k = a(k + (i ^ i1 ^ l) + e[2] + 0x6ed9eba1, 3);
        l = a(l + (k ^ i ^ i1) + e[10] + 0x6ed9eba1, 9);
        i1 = a(i1 + (l ^ k ^ i) + e[6] + 0x6ed9eba1, 11);
        i = a(i + (i1 ^ l ^ k) + e[14] + 0x6ed9eba1, 15);
        k = a(k + (i ^ i1 ^ l) + e[1] + 0x6ed9eba1, 3);
        l = a(l + (k ^ i ^ i1) + e[9] + 0x6ed9eba1, 9);
        i1 = a(i1 + (l ^ k ^ i) + e[5] + 0x6ed9eba1, 11);
        i = a(i + (i1 ^ l ^ k) + e[13] + 0x6ed9eba1, 15);
        k = a(k + (i ^ i1 ^ l) + e[3] + 0x6ed9eba1, 3);
        l = a(l + (k ^ i ^ i1) + e[11] + 0x6ed9eba1, 9);
        i1 = a(i1 + (l ^ k ^ i) + e[7] + 0x6ed9eba1, 11);
        i = a(i + (i1 ^ l ^ k) + e[15] + 0x6ed9eba1, 15);
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
}
