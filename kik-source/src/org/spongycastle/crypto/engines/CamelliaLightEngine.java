// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto.engines;

import org.spongycastle.crypto.BlockCipher;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.DataLengthException;
import org.spongycastle.crypto.params.KeyParameter;

public class CamelliaLightEngine
    implements BlockCipher
{

    private static final int g[] = {
        0xa09e667f, 0x3bcc908b, 0xb67ae858, 0x4caa73b2, 0xc6ef372f, 0xe94f82be, 0x54ff53a5, 0xf1d36f1c, 0x10e527fa, 0xde682d1d, 
        0xb05688c2, 0xb3e6c1fd
    };
    private static final byte h[] = {
        112, -126, 44, -20, -77, 39, -64, -27, -28, -123, 
        87, 53, -22, 12, -82, 65, 35, -17, 107, -109, 
        69, 25, -91, 33, -19, 14, 79, 78, 29, 101, 
        -110, -67, -122, -72, -81, -113, 124, -21, 31, -50, 
        62, 48, -36, 95, 94, -59, 11, 26, -90, -31, 
        57, -54, -43, 71, 93, 61, -39, 1, 90, -42, 
        81, 86, 108, 77, -117, 13, -102, 102, -5, -52, 
        -80, 45, 116, 18, 43, 32, -16, -79, -124, -103, 
        -33, 76, -53, -62, 52, 126, 118, 5, 109, -73, 
        -87, 49, -47, 23, 4, -41, 20, 88, 58, 97, 
        -34, 27, 17, 28, 50, 15, -100, 22, 83, 24, 
        -14, 34, -2, 68, -49, -78, -61, -75, 122, -111, 
        36, 8, -24, -88, 96, -4, 105, 80, -86, -48, 
        -96, 125, -95, -119, 98, -105, 84, 91, 30, -107, 
        -32, -1, 100, -46, 16, -60, 0, 72, -93, -9, 
        117, -37, -118, 3, -26, -38, 9, 63, -35, -108, 
        -121, 92, -125, 2, -51, 74, -112, 51, 115, 103, 
        -10, -13, -99, 127, -65, -30, 82, -101, -40, 38, 
        -56, 55, -58, 59, -127, -106, 111, 75, 19, -66, 
        99, 46, -23, 121, -89, -116, -97, 110, -68, -114, 
        41, -11, -7, -74, 47, -3, -76, 89, 120, -104, 
        6, 106, -25, 70, 113, -70, -44, 37, -85, 66, 
        -120, -94, -115, -6, 114, 7, -71, 85, -8, -18, 
        -84, 10, 54, 73, 42, 104, 60, 56, -15, -92, 
        64, 40, -45, 123, -69, -55, 67, -63, 21, -29, 
        -83, -12, 119, -57, -128, -98
    };
    private boolean a;
    private boolean b;
    private int c[];
    private int d[];
    private int e[];
    private int f[];

    public CamelliaLightEngine()
    {
        c = new int[96];
        d = new int[8];
        e = new int[12];
        f = new int[4];
    }

    private static byte a(byte byte0, int i)
    {
        return (byte)(byte0 << i | (byte0 & 0xff) >>> 8 - i);
    }

    private static int a(int i)
    {
        return (i >>> 8) + (i << 24);
    }

    private static int a(int i, int j)
    {
        return (i << j) + (i >>> 32 - j);
    }

    private static int a(byte abyte0[], int i)
    {
        int j = 0;
        int k = 0;
        for (; j < 4; j++)
        {
            k = (k << 8) + (abyte0[j + i] & 0xff);
        }

        return k;
    }

    private static void a(int i, byte abyte0[], int j)
    {
        boolean flag = false;
        int k = i;
        for (i = ((flag) ? 1 : 0); i < 4; i++)
        {
            abyte0[(3 - i) + j] = (byte)k;
            k >>>= 8;
        }

    }

    private static void a(int i, int ai[], int j, int ai1[], int k)
    {
        ai1[k + 0] = ai[j + 0] << i | ai[j + 1] >>> 32 - i;
        ai1[k + 1] = ai[j + 1] << i | ai[j + 2] >>> 32 - i;
        ai1[k + 2] = ai[j + 2] << i | ai[j + 3] >>> 32 - i;
        ai1[k + 3] = ai[j + 3] << i | ai[j + 0] >>> 32 - i;
        ai[j + 0] = ai1[k + 0];
        ai[j + 1] = ai1[k + 1];
        ai[j + 2] = ai1[k + 2];
        ai[j + 3] = ai1[k + 3];
    }

    private void a(boolean flag, byte abyte0[])
    {
        int ai[];
        int ai1[];
        int ai2[];
        int ai3[];
        ai = new int[8];
        ai1 = new int[4];
        ai2 = new int[4];
        ai3 = new int[4];
        abyte0.length;
        JVM INSTR lookupswitch 3: default 56
    //                   16: 67
    //                   24: 158
    //                   32: 236;
           goto _L1 _L2 _L3 _L4
_L1:
        throw new IllegalArgumentException("key sizes are only 16/24/32 bytes.");
_L2:
        b = true;
        ai[0] = a(abyte0, 0);
        ai[1] = a(abyte0, 4);
        ai[2] = a(abyte0, 8);
        ai[3] = a(abyte0, 12);
        ai[7] = 0;
        ai[6] = 0;
        ai[5] = 0;
        ai[4] = 0;
_L6:
        for (int i = 0; i < 4; i++)
        {
            ai1[i] = ai[i] ^ ai[i + 4];
        }

        break; /* Loop/switch isn't completed */
_L3:
        ai[0] = a(abyte0, 0);
        ai[1] = a(abyte0, 4);
        ai[2] = a(abyte0, 8);
        ai[3] = a(abyte0, 12);
        ai[4] = a(abyte0, 16);
        ai[5] = a(abyte0, 20);
        ai[6] = ~ai[4];
        ai[7] = ~ai[5];
        b = false;
        continue; /* Loop/switch isn't completed */
_L4:
        ai[0] = a(abyte0, 0);
        ai[1] = a(abyte0, 4);
        ai[2] = a(abyte0, 8);
        ai[3] = a(abyte0, 12);
        ai[4] = a(abyte0, 16);
        ai[5] = a(abyte0, 20);
        ai[6] = a(abyte0, 24);
        ai[7] = a(abyte0, 28);
        b = false;
        if (true) goto _L6; else goto _L5
_L5:
        a(ai1, g, 0);
        for (int j = 0; j < 4; j++)
        {
            ai1[j] = ai1[j] ^ ai[j];
        }

        a(ai1, g, 4);
        if (b)
        {
            if (flag)
            {
                d[0] = ai[0];
                d[1] = ai[1];
                d[2] = ai[2];
                d[3] = ai[3];
                a(15, ai, 0, c, 4);
                a(30, ai, 0, c, 12);
                a(15, ai, 0, ai3, 0);
                c[18] = ai3[2];
                c[19] = ai3[3];
                a(17, ai, 0, e, 4);
                a(17, ai, 0, c, 24);
                a(17, ai, 0, c, 32);
                c[0] = ai1[0];
                c[1] = ai1[1];
                c[2] = ai1[2];
                c[3] = ai1[3];
                a(15, ai1, 0, c, 8);
                a(15, ai1, 0, e, 0);
                a(15, ai1, 0, ai3, 0);
                c[16] = ai3[0];
                c[17] = ai3[1];
                a(15, ai1, 0, c, 20);
                c(34, ai1, 0, c, 28);
                a(17, ai1, 0, d, 4);
                return;
            } else
            {
                d[4] = ai[0];
                d[5] = ai[1];
                d[6] = ai[2];
                d[7] = ai[3];
                b(15, ai, 0, c, 28);
                b(30, ai, 0, c, 20);
                b(15, ai, 0, ai3, 0);
                c[16] = ai3[0];
                c[17] = ai3[1];
                b(17, ai, 0, e, 0);
                b(17, ai, 0, c, 8);
                b(17, ai, 0, c, 0);
                c[34] = ai1[0];
                c[35] = ai1[1];
                c[32] = ai1[2];
                c[33] = ai1[3];
                b(15, ai1, 0, c, 24);
                b(15, ai1, 0, e, 4);
                b(15, ai1, 0, ai3, 0);
                c[18] = ai3[2];
                c[19] = ai3[3];
                b(15, ai1, 0, c, 12);
                d(34, ai1, 0, c, 4);
                a(17, ai1, 0, d, 0);
                return;
            }
        }
        for (int k = 0; k < 4; k++)
        {
            ai2[k] = ai1[k] ^ ai[k + 4];
        }

        a(ai2, g, 8);
        if (flag)
        {
            d[0] = ai[0];
            d[1] = ai[1];
            d[2] = ai[2];
            d[3] = ai[3];
            c(45, ai, 0, c, 16);
            a(15, ai, 0, e, 4);
            a(17, ai, 0, c, 32);
            c(34, ai, 0, c, 44);
            a(15, ai, 4, c, 4);
            a(15, ai, 4, e, 0);
            a(30, ai, 4, c, 24);
            c(34, ai, 4, c, 36);
            a(15, ai1, 0, c, 8);
            a(30, ai1, 0, c, 20);
            e[8] = ai1[1];
            e[9] = ai1[2];
            e[10] = ai1[3];
            e[11] = ai1[0];
            c(49, ai1, 0, c, 40);
            c[0] = ai2[0];
            c[1] = ai2[1];
            c[2] = ai2[2];
            c[3] = ai2[3];
            a(30, ai2, 0, c, 12);
            a(30, ai2, 0, c, 28);
            c(51, ai2, 0, d, 4);
            return;
        } else
        {
            d[4] = ai[0];
            d[5] = ai[1];
            d[6] = ai[2];
            d[7] = ai[3];
            d(45, ai, 0, c, 28);
            b(15, ai, 0, e, 4);
            b(17, ai, 0, c, 12);
            d(34, ai, 0, c, 0);
            b(15, ai, 4, c, 40);
            b(15, ai, 4, e, 8);
            b(30, ai, 4, c, 20);
            d(34, ai, 4, c, 8);
            b(15, ai1, 0, c, 36);
            b(30, ai1, 0, c, 24);
            e[2] = ai1[1];
            e[3] = ai1[2];
            e[0] = ai1[3];
            e[1] = ai1[0];
            d(49, ai1, 0, c, 4);
            c[46] = ai2[0];
            c[47] = ai2[1];
            c[44] = ai2[2];
            c[45] = ai2[3];
            b(30, ai2, 0, c, 32);
            b(30, ai2, 0, c, 16);
            c(51, ai2, 0, d, 0);
            return;
        }
    }

    private static void a(int ai[], int ai1[], int i)
    {
        int i1 = ai[0] ^ ai1[i + 0];
        int j = d(i1 & 0xff);
        int k = c(i1 >>> 8 & 0xff);
        int l = b(i1 >>> 16 & 0xff);
        i1 = h[i1 >>> 24 & 0xff];
        int j1 = ai[1] ^ ai1[i + 1];
        int k1 = h[j1 & 0xff];
        int l1 = d(j1 >>> 8 & 0xff);
        int i2 = c(j1 >>> 16 & 0xff);
        j1 = a(b(j1 >>> 24 & 0xff) << 24 | (k1 & 0xff | l1 << 8 | i2 << 16), 8);
        k = ((i1 & 0xff) << 24 | (j | k << 8 | l << 16)) ^ j1;
        j = a(j1, 8) ^ k;
        k = a(k) ^ j;
        l = ai[2];
        ai[2] = a(j, 16) ^ k ^ l;
        j = ai[3];
        ai[3] = a(k, 8) ^ j;
        i1 = ai[2] ^ ai1[i + 2];
        j = d(i1 & 0xff);
        k = c(i1 >>> 8 & 0xff);
        l = b(i1 >>> 16 & 0xff);
        i1 = h[i1 >>> 24 & 0xff];
        i = ai[3] ^ ai1[i + 3];
        j1 = h[i & 0xff];
        k1 = d(i >>> 8 & 0xff);
        l1 = c(i >>> 16 & 0xff);
        i = a(b(i >>> 24 & 0xff) << 24 | (j1 & 0xff | k1 << 8 | l1 << 16), 8);
        j = ((i1 & 0xff) << 24 | (j | k << 8 | l << 16)) ^ i;
        i = a(i, 8) ^ j;
        j = a(j) ^ i;
        k = ai[0];
        ai[0] = a(i, 16) ^ j ^ k;
        i = ai[1];
        ai[1] = a(j, 8) ^ i;
    }

    private static int b(int i)
    {
        return a(h[i], 1) & 0xff;
    }

    private int b(byte abyte0[], int i, byte abyte1[], int j)
    {
        for (int k = 0; k < 4; k++)
        {
            f[k] = a(abyte0, k * 4 + i);
            int ai[] = f;
            ai[k] = ai[k] ^ d[k];
        }

        a(f, c, 0);
        a(f, c, 4);
        a(f, c, 8);
        b(f, e, 0);
        a(f, c, 12);
        a(f, c, 16);
        a(f, c, 20);
        b(f, e, 4);
        a(f, c, 24);
        a(f, c, 28);
        a(f, c, 32);
        abyte0 = f;
        abyte0[2] = abyte0[2] ^ d[4];
        abyte0 = f;
        abyte0[3] = abyte0[3] ^ d[5];
        abyte0 = f;
        abyte0[0] = abyte0[0] ^ d[6];
        abyte0 = f;
        abyte0[1] = abyte0[1] ^ d[7];
        a(f[2], abyte1, j);
        a(f[3], abyte1, j + 4);
        a(f[0], abyte1, j + 8);
        a(f[1], abyte1, j + 12);
        return 16;
    }

    private static void b(int i, int ai[], int j, int ai1[], int k)
    {
        ai1[k + 2] = ai[j + 0] << i | ai[j + 1] >>> 32 - i;
        ai1[k + 3] = ai[j + 1] << i | ai[j + 2] >>> 32 - i;
        ai1[k + 0] = ai[j + 2] << i | ai[j + 3] >>> 32 - i;
        ai1[k + 1] = ai[j + 3] << i | ai[j + 0] >>> 32 - i;
        ai[j + 0] = ai1[k + 2];
        ai[j + 1] = ai1[k + 3];
        ai[j + 2] = ai1[k + 0];
        ai[j + 3] = ai1[k + 1];
    }

    private static void b(int ai[], int ai1[], int i)
    {
        ai[1] = ai[1] ^ a(ai[0] & ai1[i + 0], 1);
        ai[0] = ai[0] ^ (ai1[i + 1] | ai[1]);
        ai[2] = ai[2] ^ (ai1[i + 3] | ai[3]);
        ai[3] = ai[3] ^ a(ai1[i + 2] & ai[2], 1);
    }

    private static int c(int i)
    {
        return a(h[i], 7) & 0xff;
    }

    private int c(byte abyte0[], int i, byte abyte1[], int j)
    {
        for (int k = 0; k < 4; k++)
        {
            f[k] = a(abyte0, k * 4 + i);
            int ai[] = f;
            ai[k] = ai[k] ^ d[k];
        }

        a(f, c, 0);
        a(f, c, 4);
        a(f, c, 8);
        b(f, e, 0);
        a(f, c, 12);
        a(f, c, 16);
        a(f, c, 20);
        b(f, e, 4);
        a(f, c, 24);
        a(f, c, 28);
        a(f, c, 32);
        b(f, e, 8);
        a(f, c, 36);
        a(f, c, 40);
        a(f, c, 44);
        abyte0 = f;
        abyte0[2] = abyte0[2] ^ d[4];
        abyte0 = f;
        abyte0[3] = abyte0[3] ^ d[5];
        abyte0 = f;
        abyte0[0] = abyte0[0] ^ d[6];
        abyte0 = f;
        abyte0[1] = abyte0[1] ^ d[7];
        a(f[2], abyte1, j);
        a(f[3], abyte1, j + 4);
        a(f[0], abyte1, j + 8);
        a(f[1], abyte1, j + 12);
        return 16;
    }

    private static void c(int i, int ai[], int j, int ai1[], int k)
    {
        ai1[k + 0] = ai[j + 1] << i - 32 | ai[j + 2] >>> 64 - i;
        ai1[k + 1] = ai[j + 2] << i - 32 | ai[j + 3] >>> 64 - i;
        ai1[k + 2] = ai[j + 3] << i - 32 | ai[j + 0] >>> 64 - i;
        ai1[k + 3] = ai[j + 0] << i - 32 | ai[j + 1] >>> 64 - i;
        ai[j + 0] = ai1[k + 0];
        ai[j + 1] = ai1[k + 1];
        ai[j + 2] = ai1[k + 2];
        ai[j + 3] = ai1[k + 3];
    }

    private static int d(int i)
    {
        return h[a((byte)i, 1) & 0xff] & 0xff;
    }

    private static void d(int i, int ai[], int j, int ai1[], int k)
    {
        ai1[k + 2] = ai[j + 1] << i - 32 | ai[j + 2] >>> 64 - i;
        ai1[k + 3] = ai[j + 2] << i - 32 | ai[j + 3] >>> 64 - i;
        ai1[k + 0] = ai[j + 3] << i - 32 | ai[j + 0] >>> 64 - i;
        ai1[k + 1] = ai[j + 0] << i - 32 | ai[j + 1] >>> 64 - i;
        ai[j + 0] = ai1[k + 2];
        ai[j + 1] = ai1[k + 3];
        ai[j + 2] = ai1[k + 0];
        ai[j + 3] = ai1[k + 1];
    }

    public final int a(byte abyte0[], int i, byte abyte1[], int j)
    {
        if (!a)
        {
            throw new IllegalStateException("Camellia is not initialized");
        }
        if (i + 16 > abyte0.length)
        {
            throw new DataLengthException("input buffer too short");
        }
        if (j + 16 > abyte1.length)
        {
            throw new DataLengthException("output buffer too short");
        }
        if (b)
        {
            return b(abyte0, i, abyte1, j);
        } else
        {
            return c(abyte0, i, abyte1, j);
        }
    }

    public final String a()
    {
        return "Camellia";
    }

    public final void a(boolean flag, CipherParameters cipherparameters)
    {
        if (!(cipherparameters instanceof KeyParameter))
        {
            throw new IllegalArgumentException("only simple KeyParameter expected.");
        } else
        {
            a(flag, ((KeyParameter)cipherparameters).a());
            a = true;
            return;
        }
    }

    public final int b()
    {
        return 16;
    }

    public final void c()
    {
    }

}
