// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto.digests;

import org.spongycastle.crypto.util.Pack;

// Referenced classes of package org.spongycastle.crypto.digests:
//            GeneralDigest

public class SHA224Digest extends GeneralDigest
{

    static final int a[] = {
        0x428a2f98, 0x71374491, 0xb5c0fbcf, 0xe9b5dba5, 0x3956c25b, 0x59f111f1, 0x923f82a4, 0xab1c5ed5, 0xd807aa98, 0x12835b01, 
        0x243185be, 0x550c7dc3, 0x72be5d74, 0x80deb1fe, 0x9bdc06a7, 0xc19bf174, 0xe49b69c1, 0xefbe4786, 0xfc19dc6, 0x240ca1cc, 
        0x2de92c6f, 0x4a7484aa, 0x5cb0a9dc, 0x76f988da, 0x983e5152, 0xa831c66d, 0xb00327c8, 0xbf597fc7, 0xc6e00bf3, 0xd5a79147, 
        0x6ca6351, 0x14292967, 0x27b70a85, 0x2e1b2138, 0x4d2c6dfc, 0x53380d13, 0x650a7354, 0x766a0abb, 0x81c2c92e, 0x92722c85, 
        0xa2bfe8a1, 0xa81a664b, 0xc24b8b70, 0xc76c51a3, 0xd192e819, 0xd6990624, 0xf40e3585, 0x106aa070, 0x19a4c116, 0x1e376c08, 
        0x2748774c, 0x34b0bcb5, 0x391c0cb3, 0x4ed8aa4a, 0x5b9cca4f, 0x682e6ff3, 0x748f82ee, 0x78a5636f, 0x84c87814, 0x8cc70208, 
        0x90befffa, 0xa4506ceb, 0xbef9a3f7, 0xc67178f2
    };
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j[];
    private int k;

    public SHA224Digest()
    {
        j = new int[64];
        c();
    }

    public SHA224Digest(SHA224Digest sha224digest)
    {
        super(sha224digest);
        j = new int[64];
        b = sha224digest.b;
        c = sha224digest.c;
        d = sha224digest.d;
        e = sha224digest.e;
        f = sha224digest.f;
        g = sha224digest.g;
        h = sha224digest.h;
        i = sha224digest.i;
        System.arraycopy(sha224digest.j, 0, j, 0, sha224digest.j.length);
        k = sha224digest.k;
    }

    private static int a(int l)
    {
        return (l >>> 2 | l << 30) ^ (l >>> 13 | l << 19) ^ (l >>> 22 | l << 10);
    }

    private static int a(int l, int i1, int j1)
    {
        return l & i1 ^ ~l & j1;
    }

    private static int b(int l)
    {
        return (l >>> 6 | l << 26) ^ (l >>> 11 | l << 21) ^ (l >>> 25 | l << 7);
    }

    private static int b(int l, int i1, int j1)
    {
        return l & i1 ^ l & j1 ^ i1 & j1;
    }

    public final int a(byte abyte0[], int l)
    {
        e();
        Pack.a(b, abyte0, l);
        Pack.a(c, abyte0, l + 4);
        Pack.a(d, abyte0, l + 8);
        Pack.a(e, abyte0, l + 12);
        Pack.a(f, abyte0, l + 16);
        Pack.a(g, abyte0, l + 20);
        Pack.a(h, abyte0, l + 24);
        c();
        return 28;
    }

    public final String a()
    {
        return "SHA-224";
    }

    protected final void a(long l)
    {
        if (k > 14)
        {
            f();
        }
        j[14] = (int)(l >>> 32);
        j[15] = (int)(-1L & l);
    }

    public final int b()
    {
        return 28;
    }

    protected final void b(byte abyte0[], int l)
    {
        byte byte0 = abyte0[l];
        int i1 = l + 1;
        l = abyte0[i1];
        int j1 = i1 + 1;
        i1 = abyte0[j1];
        j1 = abyte0[j1 + 1];
        j[k] = byte0 << 24 | (l & 0xff) << 16 | (i1 & 0xff) << 8 | j1 & 0xff;
        l = k + 1;
        k = l;
        if (l == 16)
        {
            f();
        }
    }

    public final void c()
    {
        super.c();
        b = 0xc1059ed8;
        c = 0x367cd507;
        d = 0x3070dd17;
        e = 0xf70e5939;
        f = 0xffc00b31;
        g = 0x68581511;
        h = 0x64f98fa7;
        i = 0xbefa4fa4;
        k = 0;
        for (int l = 0; l != j.length; l++)
        {
            j[l] = 0;
        }

    }

    protected final void f()
    {
        for (int l = 16; l <= 63; l++)
        {
            int ai[] = j;
            int k1 = j[l - 2];
            int i2 = j[l - 7];
            int k2 = j[l - 15];
            ai[l] = (k1 >>> 10 ^ ((k1 >>> 17 | k1 << 15) ^ (k1 >>> 19 | k1 << 13))) + i2 + (k2 >>> 3 ^ ((k2 >>> 7 | k2 << 25) ^ (k2 >>> 18 | k2 << 14))) + j[l - 16];
        }

        int l1 = b;
        int l2 = c;
        int j3 = d;
        int i4 = e;
        int j2 = f;
        int i3 = g;
        int k3 = h;
        int j4 = i;
        int i1 = 0;
        int l3 = 0;
        for (; i1 < 8; i1++)
        {
            j4 += b(j2) + a(j2, i3, k3) + a[l3] + j[l3];
            i4 += j4;
            j4 += a(l1) + b(l1, l2, j3);
            l3++;
            k3 += b(i4) + a(i4, j2, i3) + a[l3] + j[l3];
            j3 += k3;
            k3 += a(j4) + b(j4, l1, l2);
            l3++;
            i3 += b(j3) + a(j3, i4, j2) + a[l3] + j[l3];
            l2 += i3;
            i3 += a(k3) + b(k3, j4, l1);
            l3++;
            j2 += b(l2) + a(l2, j3, i4) + a[l3] + j[l3];
            l1 += j2;
            j2 += a(i3) + b(i3, k3, j4);
            l3++;
            i4 += b(l1) + a(l1, l2, j3) + a[l3] + j[l3];
            j4 += i4;
            i4 += a(j2) + b(j2, i3, k3);
            l3++;
            j3 += b(j4) + a(j4, l1, l2) + a[l3] + j[l3];
            k3 += j3;
            j3 += a(i4) + b(i4, j2, i3);
            l3++;
            l2 += b(k3) + a(k3, j4, l1) + a[l3] + j[l3];
            i3 += l2;
            l2 += a(j3) + b(j3, i4, j2);
            l3++;
            l1 += b(i3) + a(i3, k3, j4) + a[l3] + j[l3];
            j2 += l1;
            l1 += a(l2) + b(l2, j3, i4);
            l3++;
        }

        b = b + l1;
        c = c + l2;
        d = d + j3;
        e = e + i4;
        f = f + j2;
        g = g + i3;
        h = h + k3;
        i = i + j4;
        k = 0;
        for (int j1 = 0; j1 < 16; j1++)
        {
            j[j1] = 0;
        }

    }

}
