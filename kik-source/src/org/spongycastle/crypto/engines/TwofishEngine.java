// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto.engines;

import org.spongycastle.crypto.BlockCipher;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.DataLengthException;
import org.spongycastle.crypto.params.KeyParameter;

public final class TwofishEngine
    implements BlockCipher
{

    private static final byte a[][] = {
        {
            -87, 103, -77, -24, 4, -3, -93, 118, -102, -110, 
            -128, 120, -28, -35, -47, 56, 13, -58, 53, -104, 
            24, -9, -20, 108, 67, 117, 55, 38, -6, 19, 
            -108, 72, -14, -48, -117, 48, -124, 84, -33, 35, 
            25, 91, 61, 89, -13, -82, -94, -126, 99, 1, 
            -125, 46, -39, 81, -101, 124, -90, -21, -91, -66, 
            22, 12, -29, 97, -64, -116, 58, -11, 115, 44, 
            37, 11, -69, 78, -119, 107, 83, 106, -76, -15, 
            -31, -26, -67, 69, -30, -12, -74, 102, -52, -107, 
            3, 86, -44, 28, 30, -41, -5, -61, -114, -75, 
            -23, -49, -65, -70, -22, 119, 57, -81, 51, -55, 
            98, 113, -127, 121, 9, -83, 36, -51, -7, -40, 
            -27, -59, -71, 77, 68, 8, -122, -25, -95, 29, 
            -86, -19, 6, 112, -78, -46, 65, 123, -96, 17, 
            49, -62, 39, -112, 32, -10, 96, -1, -106, 92, 
            -79, -85, -98, -100, 82, 27, 95, -109, 10, -17, 
            -111, -123, 73, -18, 45, 79, -113, 59, 71, -121, 
            109, 70, -42, 62, 105, 100, 42, -50, -53, 47, 
            -4, -105, 5, 122, -84, 127, -43, 26, 75, 14, 
            -89, 90, 40, 20, 63, 41, -120, 60, 76, 2, 
            -72, -38, -80, 23, 85, 31, -118, 125, 87, -57, 
            -115, 116, -73, -60, -97, 114, 126, 21, 34, 18, 
            88, 7, -103, 52, 110, 80, -34, 104, 101, -68, 
            -37, -8, -56, -88, 43, 64, -36, -2, 50, -92, 
            -54, 16, 33, -16, -45, 93, 15, 0, 111, -99, 
            54, 66, 74, 94, -63, -32
        }, {
            117, -13, -58, -12, -37, 123, -5, -56, 74, -45, 
            -26, 107, 69, 125, -24, 75, -42, 50, -40, -3, 
            55, 113, -15, -31, 48, 15, -8, 27, -121, -6, 
            6, 63, 94, -70, -82, 91, -118, 0, -68, -99, 
            109, -63, -79, 14, -128, 93, -46, -43, -96, -124, 
            7, 20, -75, -112, 44, -93, -78, 115, 76, 84, 
            -110, 116, 54, 81, 56, -80, -67, 90, -4, 96, 
            98, -106, 108, 66, -9, 16, 124, 40, 39, -116, 
            19, -107, -100, -57, 36, 70, 59, 112, -54, -29, 
            -123, -53, 17, -48, -109, -72, -90, -125, 32, -1, 
            -97, 119, -61, -52, 3, 111, 8, -65, 64, -25, 
            43, -30, 121, 12, -86, -126, 65, 58, -22, -71, 
            -28, -102, -92, -105, 126, -38, 122, 23, 102, -108, 
            -95, 29, 61, -16, -34, -77, 11, 114, -89, 28, 
            -17, -47, 83, 62, -113, 51, 38, 95, -20, 118, 
            42, 73, -127, -120, -18, 33, -60, 26, -21, -39, 
            -59, 57, -103, -51, -83, 49, -117, 1, 24, 35, 
            -35, 31, 78, 45, -7, 72, 79, -14, 101, -114, 
            120, 92, 88, 25, -115, -27, -104, 87, 103, 127, 
            5, 100, -81, 99, -74, -2, -11, -73, 60, -91, 
            -50, -23, 104, 68, -32, 77, 67, 105, 41, 46, 
            -84, 21, 89, -88, 10, -98, 110, 71, -33, 52, 
            53, 106, -49, -36, 34, -55, -64, -101, -119, -44, 
            -19, -85, 18, -94, 13, 82, -69, 2, 47, -87, 
            -41, 97, 30, -76, 80, 4, -10, -62, 22, 37, 
            -122, 86, 85, 9, -66, -111
        }
    };
    private boolean b;
    private int c[];
    private int d[];
    private int e[];
    private int f[];
    private int g[];
    private int h[];
    private int i;
    private byte j[];

    public TwofishEngine()
    {
        b = false;
        c = new int[256];
        d = new int[256];
        e = new int[256];
        f = new int[256];
        i = 0;
        j = null;
        int ai[] = new int[2];
        int ai1[] = new int[2];
        int ai2[] = new int[2];
        for (int k = 0; k < 256; k++)
        {
            int l = a[0][k] & 0xff;
            ai[0] = l;
            ai1[0] = (b(l) ^ l) & 0xff;
            ai2[0] = c(l) & 0xff;
            l = a[1][k] & 0xff;
            ai[1] = l;
            ai1[1] = (b(l) ^ l) & 0xff;
            ai2[1] = c(l) & 0xff;
            c[k] = ai[1] | ai1[1] << 8 | ai2[1] << 16 | ai2[1] << 24;
            d[k] = ai2[0] | ai2[0] << 8 | ai1[0] << 16 | ai[0] << 24;
            e[k] = ai1[1] | ai2[1] << 8 | ai[1] << 16 | ai2[1] << 24;
            f[k] = ai1[0] | ai[0] << 8 | ai2[0] << 16 | ai1[0] << 24;
        }

    }

    private static int a(int k)
    {
        boolean flag = false;
        int i1 = k >>> 24 & 0xff;
        int l;
        int j1;
        if ((i1 & 0x80) != 0)
        {
            l = 333;
        } else
        {
            l = 0;
        }
        j1 = (l ^ i1 << 1) & 0xff;
        l = ((flag) ? 1 : 0);
        if ((i1 & 1) != 0)
        {
            l = 166;
        }
        l = l ^ i1 >>> 1 ^ j1;
        return l << 8 ^ (j1 << 16 ^ (k << 8 ^ l << 24)) ^ i1;
    }

    private static int a(int k, int l)
    {
        boolean flag = false;
        boolean flag1 = false;
        int i1 = l;
        for (l = ((flag1) ? 1 : 0); l < 4; l++)
        {
            i1 = a(i1);
        }

        l = i1 ^ k;
        for (k = ((flag) ? 1 : 0); k < 4; k++)
        {
            l = a(l);
        }

        return l;
    }

    private int a(int k, int ai[])
    {
        int k3 = k & 0xff;
        int l1 = d(k);
        int l = e(k);
        int j1 = f(k);
        int l3 = ai[0];
        int i4 = ai[1];
        int j4 = ai[2];
        int k4 = ai[3];
        int i2 = l;
        int j2 = l1;
        int k2 = k3;
        k = j1;
        int l2 = l;
        int i3 = l1;
        int j3 = k3;
        int k1 = j1;
        switch (i & 3)
        {
        default:
            return 0;

        case 1: // '\001'
            k = c[a[0][k3] & 0xff ^ l3 & 0xff];
            k1 = d[a[0][l1] & 0xff ^ d(l3)];
            return e[a[1][l] & 0xff ^ e(l3)] ^ (k1 ^ k) ^ f[a[1][j1] & 0xff ^ f(l3)];

        case 0: // '\0'
            k2 = a[1][k3] & 0xff ^ k4 & 0xff;
            j2 = a[0][l1] & 0xff ^ d(k4);
            i2 = a[0][l] & 0xff ^ e(k4);
            k = a[1][j1] & 0xff ^ f(k4);
            // fall through

        case 3: // '\003'
            j3 = a[1][k2] & 0xff ^ j4 & 0xff;
            i3 = a[1][j2] & 0xff ^ d(j4);
            l2 = a[0][i2] & 0xff ^ e(j4);
            k1 = a[0][k] & 0xff ^ f(j4);
            // fall through

        case 2: // '\002'
            k = c[a[0][a[0][j3] & 0xff ^ i4 & 0xff] & 0xff ^ l3 & 0xff];
            int i1 = d[a[0][a[1][i3] & 0xff ^ d(i4)] & 0xff ^ d(l3)];
            return e[a[1][a[0][l2] & 0xff ^ e(i4)] & 0xff ^ e(l3)] ^ (i1 ^ k) ^ f[a[1][a[1][k1] & 0xff ^ f(i4)] & 0xff ^ f(l3)];
        }
    }

    private static int a(byte abyte0[], int k)
    {
        return abyte0[k] & 0xff | (abyte0[k + 1] & 0xff) << 8 | (abyte0[k + 2] & 0xff) << 16 | (abyte0[k + 3] & 0xff) << 24;
    }

    private static void a(int k, byte abyte0[], int l)
    {
        abyte0[l] = (byte)k;
        abyte0[l + 1] = (byte)(k >> 8);
        abyte0[l + 2] = (byte)(k >> 16);
        abyte0[l + 3] = (byte)(k >> 24);
    }

    private void a(byte abyte0[])
    {
        int i1;
        int i3;
        int j3;
        int k3;
        int l3;
        int ai[] = new int[4];
        int ai1[] = new int[4];
        int ai2[] = new int[4];
        g = new int[40];
        if (i <= 0)
        {
            throw new IllegalArgumentException("Key size less than 64 bits");
        }
        if (i > 4)
        {
            throw new IllegalArgumentException("Key size larger than 256 bits");
        }
        for (int k = 0; k < i; k++)
        {
            int j1 = k * 8;
            ai[k] = a(abyte0, j1);
            ai1[k] = a(abyte0, j1 + 4);
            ai2[i - 1 - k] = a(ai[k], ai1[k]);
        }

        for (int l = 0; l < 20; l++)
        {
            int i2 = 0x2020202 * l;
            int k1 = a(i2, ai);
            i2 = a(i2 + 0x1010101, ai1);
            i2 = i2 >>> 24 | i2 << 8;
            k1 += i2;
            g[l * 2] = k1;
            k1 = i2 + k1;
            g[l * 2 + 1] = k1 >>> 23 | k1 << 9;
        }

        i3 = ai2[0];
        j3 = ai2[1];
        k3 = ai2[2];
        l3 = ai2[3];
        h = new int[1024];
        i1 = 0;
_L8:
        if (i1 >= 256) goto _L2; else goto _L1
_L1:
        i & 3;
        JVM INSTR tableswitch 0 3: default 320
    //                   0 471
    //                   1 329
    //                   2 864
    //                   3 845;
           goto _L3 _L4 _L5 _L6 _L7
_L3:
        i1++;
          goto _L8
_L5:
        h[i1 * 2] = c[a[0][i1] & 0xff ^ i3 & 0xff];
        h[i1 * 2 + 1] = d[a[0][i1] & 0xff ^ d(i3)];
        h[i1 * 2 + 512] = e[a[1][i1] & 0xff ^ e(i3)];
        h[i1 * 2 + 513] = f[a[1][i1] & 0xff ^ f(i3)];
          goto _L3
_L4:
        int l1;
        int j2;
        int k2;
        int l2;
        l2 = a[1][i1] & 0xff ^ l3 & 0xff;
        k2 = a[0][i1] & 0xff ^ d(l3);
        l1 = a[0][i1];
        j2 = e(l3) ^ l1 & 0xff;
        l1 = a[1][i1] & 0xff ^ f(l3);
_L9:
        l2 = a[1][l2] & 0xff ^ k3 & 0xff;
        k2 = a[1][k2] & 0xff ^ d(k3);
        j2 = a[0][j2] & 0xff ^ e(k3);
        l1 = a[0][l1] & 0xff ^ f(k3);
_L10:
        h[i1 * 2] = c[a[0][a[0][l2] & 0xff ^ j3 & 0xff] & 0xff ^ i3 & 0xff];
        h[i1 * 2 + 1] = d[a[0][a[1][k2] & 0xff ^ d(j3)] & 0xff ^ d(i3)];
        h[i1 * 2 + 512] = e[a[1][a[0][j2] & 0xff ^ e(j3)] & 0xff ^ e(i3)];
        h[i1 * 2 + 513] = f[a[1][a[1][l1] & 0xff ^ f(j3)] & 0xff ^ f(i3)];
          goto _L3
_L2:
        return;
_L7:
        l1 = i1;
        j2 = i1;
        k2 = i1;
        l2 = i1;
          goto _L9
_L6:
        l1 = i1;
        j2 = i1;
        k2 = i1;
        l2 = i1;
          goto _L10
    }

    private static int b(int k)
    {
        byte byte0 = 0;
        char c1;
        if ((k & 2) != 0)
        {
            c1 = '\264';
        } else
        {
            c1 = '\0';
        }
        if ((k & 1) != 0)
        {
            byte0 = 90;
        }
        return byte0 ^ (c1 ^ k >> 2);
    }

    private void b(byte abyte0[], int k, byte abyte1[], int l)
    {
        int i1 = 0;
        int j1 = a(abyte0, k) ^ g[0];
        int k1 = a(abyte0, k + 4);
        int j2 = g[1] ^ k1;
        int l1 = a(abyte0, k + 8) ^ g[2];
        k = a(abyte0, k + 12);
        k1 = g[3] ^ k;
        int i2 = 8;
        k = j2;
        for (; i1 < 16; i1 += 2)
        {
            int k2 = g(j1);
            int l2 = h(k);
            abyte0 = g;
            int i3 = i2 + 1;
            l1 ^= abyte0[i2] + (k2 + l2);
            l1 = l1 << 31 | l1 >>> 1;
            abyte0 = g;
            i2 = i3 + 1;
            k1 = l2 * 2 + k2 + abyte0[i3] ^ (k1 << 1 | k1 >>> 31);
            k2 = g(l1);
            l2 = h(k1);
            abyte0 = g;
            i3 = i2 + 1;
            j1 ^= abyte0[i2] + (k2 + l2);
            j1 = j1 << 31 | j1 >>> 1;
            abyte0 = g;
            i2 = i3 + 1;
            k = (k >>> 31 | k << 1) ^ l2 * 2 + k2 + abyte0[i3];
        }

        a(g[4] ^ l1, abyte1, l);
        a(g[5] ^ k1, abyte1, l + 4);
        a(g[6] ^ j1, abyte1, l + 8);
        a(g[7] ^ k, abyte1, l + 12);
    }

    private static int c(int k)
    {
        char c1;
        if ((k & 1) != 0)
        {
            c1 = '\264';
        } else
        {
            c1 = '\0';
        }
        return c1 ^ k >> 1 ^ k ^ b(k);
    }

    private void c(byte abyte0[], int k, byte abyte1[], int l)
    {
        int j2 = a(abyte0, k) ^ g[4];
        int j1 = a(abyte0, k + 4) ^ g[5];
        int i1 = a(abyte0, k + 8);
        int k1 = g[6] ^ i1;
        int i2 = a(abyte0, k + 12) ^ g[7];
        int l1 = 39;
        i1 = 0;
        k = j2;
        for (; i1 < 16; i1 += 2)
        {
            int k2 = g(k);
            int l2 = h(j1);
            abyte0 = g;
            int i3 = l1 - 1;
            i2 = abyte0[l1] + (l2 * 2 + k2) ^ i2;
            abyte0 = g;
            l1 = i3 - 1;
            k1 = (k1 >>> 31 | k1 << 1) ^ k2 + l2 + abyte0[i3];
            i2 = i2 >>> 1 | i2 << 31;
            k2 = g(k1);
            l2 = h(i2);
            abyte0 = g;
            i3 = l1 - 1;
            j1 ^= abyte0[l1] + (l2 * 2 + k2);
            abyte0 = g;
            l1 = i3 - 1;
            k = (k >>> 31 | k << 1) ^ l2 + k2 + abyte0[i3];
            j1 = j1 << 31 | j1 >>> 1;
        }

        a(g[0] ^ k1, abyte1, l);
        a(g[1] ^ i2, abyte1, l + 4);
        a(g[2] ^ k, abyte1, l + 8);
        a(g[3] ^ j1, abyte1, l + 12);
    }

    private static int d(int k)
    {
        return k >>> 8 & 0xff;
    }

    private static int e(int k)
    {
        return k >>> 16 & 0xff;
    }

    private static int f(int k)
    {
        return k >>> 24 & 0xff;
    }

    private int g(int k)
    {
        return h[(k & 0xff) * 2 + 0] ^ h[(k >>> 8 & 0xff) * 2 + 1] ^ h[(k >>> 16 & 0xff) * 2 + 512] ^ h[(k >>> 24 & 0xff) * 2 + 513];
    }

    private int h(int k)
    {
        return h[(k >>> 24 & 0xff) * 2 + 0] ^ h[(k & 0xff) * 2 + 1] ^ h[(k >>> 8 & 0xff) * 2 + 512] ^ h[(k >>> 16 & 0xff) * 2 + 513];
    }

    public final int a(byte abyte0[], int k, byte abyte1[], int l)
    {
        if (j == null)
        {
            throw new IllegalStateException("Twofish not initialised");
        }
        if (k + 16 > abyte0.length)
        {
            throw new DataLengthException("input buffer too short");
        }
        if (l + 16 > abyte1.length)
        {
            throw new DataLengthException("output buffer too short");
        }
        if (b)
        {
            b(abyte0, k, abyte1, l);
        } else
        {
            c(abyte0, k, abyte1, l);
        }
        return 16;
    }

    public final String a()
    {
        return "Twofish";
    }

    public final void a(boolean flag, CipherParameters cipherparameters)
    {
        if (cipherparameters instanceof KeyParameter)
        {
            b = flag;
            j = ((KeyParameter)cipherparameters).a();
            i = j.length / 8;
            a(j);
            return;
        } else
        {
            throw new IllegalArgumentException((new StringBuilder("invalid parameter passed to Twofish init - ")).append(cipherparameters.getClass().getName()).toString());
        }
    }

    public final int b()
    {
        return 16;
    }

    public final void c()
    {
        if (j != null)
        {
            a(j);
        }
    }

}
