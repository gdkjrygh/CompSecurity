// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto.engines;

import java.lang.reflect.Array;
import org.spongycastle.crypto.BlockCipher;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.DataLengthException;
import org.spongycastle.crypto.params.KeyParameter;

public class AESLightEngine
    implements BlockCipher
{

    private static final byte a[] = {
        99, 124, 119, 123, -14, 107, 111, -59, 48, 1, 
        103, 43, -2, -41, -85, 118, -54, -126, -55, 125, 
        -6, 89, 71, -16, -83, -44, -94, -81, -100, -92, 
        114, -64, -73, -3, -109, 38, 54, 63, -9, -52, 
        52, -91, -27, -15, 113, -40, 49, 21, 4, -57, 
        35, -61, 24, -106, 5, -102, 7, 18, -128, -30, 
        -21, 39, -78, 117, 9, -125, 44, 26, 27, 110, 
        90, -96, 82, 59, -42, -77, 41, -29, 47, -124, 
        83, -47, 0, -19, 32, -4, -79, 91, 106, -53, 
        -66, 57, 74, 76, 88, -49, -48, -17, -86, -5, 
        67, 77, 51, -123, 69, -7, 2, 127, 80, 60, 
        -97, -88, 81, -93, 64, -113, -110, -99, 56, -11, 
        -68, -74, -38, 33, 16, -1, -13, -46, -51, 12, 
        19, -20, 95, -105, 68, 23, -60, -89, 126, 61, 
        100, 93, 25, 115, 96, -127, 79, -36, 34, 42, 
        -112, -120, 70, -18, -72, 20, -34, 94, 11, -37, 
        -32, 50, 58, 10, 73, 6, 36, 92, -62, -45, 
        -84, 98, -111, -107, -28, 121, -25, -56, 55, 109, 
        -115, -43, 78, -87, 108, 86, -12, -22, 101, 122, 
        -82, 8, -70, 120, 37, 46, 28, -90, -76, -58, 
        -24, -35, 116, 31, 75, -67, -117, -118, 112, 62, 
        -75, 102, 72, 3, -10, 14, 97, 53, 87, -71, 
        -122, -63, 29, -98, -31, -8, -104, 17, 105, -39, 
        -114, -108, -101, 30, -121, -23, -50, 85, 40, -33, 
        -116, -95, -119, 13, -65, -26, 66, 104, 65, -103, 
        45, 15, -80, 84, -69, 22
    };
    private static final byte b[] = {
        82, 9, 106, -43, 48, 54, -91, 56, -65, 64, 
        -93, -98, -127, -13, -41, -5, 124, -29, 57, -126, 
        -101, 47, -1, -121, 52, -114, 67, 68, -60, -34, 
        -23, -53, 84, 123, -108, 50, -90, -62, 35, 61, 
        -18, 76, -107, 11, 66, -6, -61, 78, 8, 46, 
        -95, 102, 40, -39, 36, -78, 118, 91, -94, 73, 
        109, -117, -47, 37, 114, -8, -10, 100, -122, 104, 
        -104, 22, -44, -92, 92, -52, 93, 101, -74, -110, 
        108, 112, 72, 80, -3, -19, -71, -38, 94, 21, 
        70, 87, -89, -115, -99, -124, -112, -40, -85, 0, 
        -116, -68, -45, 10, -9, -28, 88, 5, -72, -77, 
        69, 6, -48, 44, 30, -113, -54, 63, 15, 2, 
        -63, -81, -67, 3, 1, 19, -118, 107, 58, -111, 
        17, 65, 79, 103, -36, -22, -105, -14, -49, -50, 
        -16, -76, -26, 115, -106, -84, 116, 34, -25, -83, 
        53, -123, -30, -7, 55, -24, 28, 117, -33, 110, 
        71, -15, 26, 113, 29, 41, -59, -119, 111, -73, 
        98, 14, -86, 24, -66, 27, -4, 86, 62, 75, 
        -58, -46, 121, 32, -102, -37, -64, -2, 120, -51, 
        90, -12, 31, -35, -88, 51, -120, 7, -57, 49, 
        -79, 18, 16, 89, 39, -128, -20, 95, 96, 81, 
        127, -87, 25, -75, 74, 13, 45, -27, 122, -97, 
        -109, -55, -100, -17, -96, -32, 59, 77, -82, 42, 
        -11, -80, -56, -21, -69, 60, -125, 83, -103, 97, 
        23, 43, 4, 126, -70, 119, -42, 38, -31, 105, 
        20, 99, 85, 33, 12, 125
    };
    private static final int c[] = {
        1, 2, 4, 8, 16, 32, 64, 128, 27, 54, 
        108, 216, 171, 77, 154, 47, 94, 188, 99, 198, 
        151, 53, 106, 212, 179, 125, 250, 239, 197, 145
    };
    private int d;
    private int e[][];
    private int f;
    private int g;
    private int h;
    private int i;
    private boolean j;

    public AESLightEngine()
    {
        e = null;
    }

    private static int a(int k)
    {
        return (0x7f7f7f7f & k) << 1 ^ ((0x80808080 & k) >>> 7) * 27;
    }

    private static int a(int k, int l)
    {
        return k >>> l | k << -l;
    }

    private void a(byte abyte0[], int k)
    {
        int l = k + 1;
        f = abyte0[k] & 0xff;
        int i1 = f;
        k = l + 1;
        f = (abyte0[l] & 0xff) << 8 | i1;
        i1 = f;
        l = k + 1;
        f = i1 | (abyte0[k] & 0xff) << 16;
        i1 = f;
        k = l + 1;
        f = i1 | abyte0[l] << 24;
        l = k + 1;
        g = abyte0[k] & 0xff;
        i1 = g;
        k = l + 1;
        g = (abyte0[l] & 0xff) << 8 | i1;
        i1 = g;
        l = k + 1;
        g = i1 | (abyte0[k] & 0xff) << 16;
        i1 = g;
        k = l + 1;
        g = i1 | abyte0[l] << 24;
        l = k + 1;
        h = abyte0[k] & 0xff;
        i1 = h;
        k = l + 1;
        h = (abyte0[l] & 0xff) << 8 | i1;
        i1 = h;
        l = k + 1;
        h = i1 | (abyte0[k] & 0xff) << 16;
        i1 = h;
        k = l + 1;
        h = i1 | abyte0[l] << 24;
        l = k + 1;
        i = abyte0[k] & 0xff;
        k = i;
        i1 = l + 1;
        i = (abyte0[l] & 0xff) << 8 | k;
        i = i | (abyte0[i1] & 0xff) << 16;
        i = i | abyte0[i1 + 1] << 24;
    }

    private void a(int ai[][])
    {
        f = f ^ ai[0][0];
        g = g ^ ai[0][1];
        h = h ^ ai[0][2];
        i = i ^ ai[0][3];
        int k;
        for (k = 1; k < d - 1;)
        {
            int j1 = b(a[f & 0xff] & 0xff ^ (a[g >> 8 & 0xff] & 0xff) << 8 ^ (a[h >> 16 & 0xff] & 0xff) << 16 ^ a[i >> 24 & 0xff] << 24) ^ ai[k][0];
            int l1 = b(a[g & 0xff] & 0xff ^ (a[h >> 8 & 0xff] & 0xff) << 8 ^ (a[i >> 16 & 0xff] & 0xff) << 16 ^ a[f >> 24 & 0xff] << 24) ^ ai[k][1];
            int j2 = b(a[h & 0xff] & 0xff ^ (a[i >> 8 & 0xff] & 0xff) << 8 ^ (a[f >> 16 & 0xff] & 0xff) << 16 ^ a[g >> 24 & 0xff] << 24) ^ ai[k][2];
            int l2 = b(a[i & 0xff] & 0xff ^ (a[f >> 8 & 0xff] & 0xff) << 8 ^ (a[g >> 16 & 0xff] & 0xff) << 16 ^ a[h >> 24 & 0xff] << 24);
            int l = k + 1;
            k = ai[k][3] ^ l2;
            f = b(a[j1 & 0xff] & 0xff ^ (a[l1 >> 8 & 0xff] & 0xff) << 8 ^ (a[j2 >> 16 & 0xff] & 0xff) << 16 ^ a[k >> 24 & 0xff] << 24) ^ ai[l][0];
            g = b(a[l1 & 0xff] & 0xff ^ (a[j2 >> 8 & 0xff] & 0xff) << 8 ^ (a[k >> 16 & 0xff] & 0xff) << 16 ^ a[j1 >> 24 & 0xff] << 24) ^ ai[l][1];
            h = b(a[j2 & 0xff] & 0xff ^ (a[k >> 8 & 0xff] & 0xff) << 8 ^ (a[j1 >> 16 & 0xff] & 0xff) << 16 ^ a[l1 >> 24 & 0xff] << 24) ^ ai[l][2];
            j1 = b(a[k & 0xff] & 0xff ^ (a[j1 >> 8 & 0xff] & 0xff) << 8 ^ (a[l1 >> 16 & 0xff] & 0xff) << 16 ^ a[j2 >> 24 & 0xff] << 24);
            k = l + 1;
            i = j1 ^ ai[l][3];
        }

        int i1 = b(a[f & 0xff] & 0xff ^ (a[g >> 8 & 0xff] & 0xff) << 8 ^ (a[h >> 16 & 0xff] & 0xff) << 16 ^ a[i >> 24 & 0xff] << 24) ^ ai[k][0];
        int k1 = b(a[g & 0xff] & 0xff ^ (a[h >> 8 & 0xff] & 0xff) << 8 ^ (a[i >> 16 & 0xff] & 0xff) << 16 ^ a[f >> 24 & 0xff] << 24) ^ ai[k][1];
        int i2 = b(a[h & 0xff] & 0xff ^ (a[i >> 8 & 0xff] & 0xff) << 8 ^ (a[f >> 16 & 0xff] & 0xff) << 16 ^ a[g >> 24 & 0xff] << 24) ^ ai[k][2];
        int i3 = b(a[i & 0xff] & 0xff ^ (a[f >> 8 & 0xff] & 0xff) << 8 ^ (a[g >> 16 & 0xff] & 0xff) << 16 ^ a[h >> 24 & 0xff] << 24);
        int k2 = k + 1;
        k = ai[k][3] ^ i3;
        f = a[i1 & 0xff] & 0xff ^ (a[k1 >> 8 & 0xff] & 0xff) << 8 ^ (a[i2 >> 16 & 0xff] & 0xff) << 16 ^ a[k >> 24 & 0xff] << 24 ^ ai[k2][0];
        i3 = a[k1 & 0xff];
        byte byte0 = a[i2 >> 8 & 0xff];
        byte byte1 = a[k >> 16 & 0xff];
        byte byte2 = a[i1 >> 24 & 0xff];
        g = ai[k2][1] ^ (i3 & 0xff ^ (byte0 & 0xff) << 8 ^ (byte1 & 0xff) << 16 ^ byte2 << 24);
        h = a[i2 & 0xff] & 0xff ^ (a[k >> 8 & 0xff] & 0xff) << 8 ^ (a[i1 >> 16 & 0xff] & 0xff) << 16 ^ a[k1 >> 24 & 0xff] << 24 ^ ai[k2][2];
        i = a[k & 0xff] & 0xff ^ (a[i1 >> 8 & 0xff] & 0xff) << 8 ^ (a[k1 >> 16 & 0xff] & 0xff) << 16 ^ a[i2 >> 24 & 0xff] << 24 ^ ai[k2][3];
    }

    private static int b(int k)
    {
        int l = a(k);
        return l ^ a(k ^ l, 8) ^ a(k, 16) ^ a(k, 24);
    }

    private void b(byte abyte0[], int k)
    {
        int l = k + 1;
        abyte0[k] = (byte)f;
        k = l + 1;
        abyte0[l] = (byte)(f >> 8);
        l = k + 1;
        abyte0[k] = (byte)(f >> 16);
        k = l + 1;
        abyte0[l] = (byte)(f >> 24);
        l = k + 1;
        abyte0[k] = (byte)g;
        k = l + 1;
        abyte0[l] = (byte)(g >> 8);
        l = k + 1;
        abyte0[k] = (byte)(g >> 16);
        k = l + 1;
        abyte0[l] = (byte)(g >> 24);
        l = k + 1;
        abyte0[k] = (byte)h;
        k = l + 1;
        abyte0[l] = (byte)(h >> 8);
        l = k + 1;
        abyte0[k] = (byte)(h >> 16);
        k = l + 1;
        abyte0[l] = (byte)(h >> 24);
        l = k + 1;
        abyte0[k] = (byte)i;
        k = l + 1;
        abyte0[l] = (byte)(i >> 8);
        abyte0[k] = (byte)(i >> 16);
        abyte0[k + 1] = (byte)(i >> 24);
    }

    private void b(int ai[][])
    {
        f = f ^ ai[d][0];
        g = g ^ ai[d][1];
        h = h ^ ai[d][2];
        i = i ^ ai[d][3];
        int k;
        for (k = d - 1; k > 1;)
        {
            int j1 = c(b[f & 0xff] & 0xff ^ (b[i >> 8 & 0xff] & 0xff) << 8 ^ (b[h >> 16 & 0xff] & 0xff) << 16 ^ b[g >> 24 & 0xff] << 24) ^ ai[k][0];
            int l1 = c(b[g & 0xff] & 0xff ^ (b[f >> 8 & 0xff] & 0xff) << 8 ^ (b[i >> 16 & 0xff] & 0xff) << 16 ^ b[h >> 24 & 0xff] << 24) ^ ai[k][1];
            int j2 = c(b[h & 0xff] & 0xff ^ (b[g >> 8 & 0xff] & 0xff) << 8 ^ (b[f >> 16 & 0xff] & 0xff) << 16 ^ b[i >> 24 & 0xff] << 24) ^ ai[k][2];
            int l2 = c(b[i & 0xff] & 0xff ^ (b[h >> 8 & 0xff] & 0xff) << 8 ^ (b[g >> 16 & 0xff] & 0xff) << 16 ^ b[f >> 24 & 0xff] << 24);
            int l = k - 1;
            k = ai[k][3] ^ l2;
            f = c(b[j1 & 0xff] & 0xff ^ (b[k >> 8 & 0xff] & 0xff) << 8 ^ (b[j2 >> 16 & 0xff] & 0xff) << 16 ^ b[l1 >> 24 & 0xff] << 24) ^ ai[l][0];
            g = c(b[l1 & 0xff] & 0xff ^ (b[j1 >> 8 & 0xff] & 0xff) << 8 ^ (b[k >> 16 & 0xff] & 0xff) << 16 ^ b[j2 >> 24 & 0xff] << 24) ^ ai[l][1];
            h = c(b[j2 & 0xff] & 0xff ^ (b[l1 >> 8 & 0xff] & 0xff) << 8 ^ (b[j1 >> 16 & 0xff] & 0xff) << 16 ^ b[k >> 24 & 0xff] << 24) ^ ai[l][2];
            j1 = c(b[k & 0xff] & 0xff ^ (b[j2 >> 8 & 0xff] & 0xff) << 8 ^ (b[l1 >> 16 & 0xff] & 0xff) << 16 ^ b[j1 >> 24 & 0xff] << 24);
            k = l - 1;
            i = j1 ^ ai[l][3];
        }

        int i1 = c(b[f & 0xff] & 0xff ^ (b[i >> 8 & 0xff] & 0xff) << 8 ^ (b[h >> 16 & 0xff] & 0xff) << 16 ^ b[g >> 24 & 0xff] << 24) ^ ai[k][0];
        int k1 = c(b[g & 0xff] & 0xff ^ (b[f >> 8 & 0xff] & 0xff) << 8 ^ (b[i >> 16 & 0xff] & 0xff) << 16 ^ b[h >> 24 & 0xff] << 24) ^ ai[k][1];
        int i2 = c(b[h & 0xff] & 0xff ^ (b[g >> 8 & 0xff] & 0xff) << 8 ^ (b[f >> 16 & 0xff] & 0xff) << 16 ^ b[i >> 24 & 0xff] << 24) ^ ai[k][2];
        int k2 = c(b[i & 0xff] & 0xff ^ (b[h >> 8 & 0xff] & 0xff) << 8 ^ (b[g >> 16 & 0xff] & 0xff) << 16 ^ b[f >> 24 & 0xff] << 24);
        k = ai[k][3] ^ k2;
        f = b[i1 & 0xff] & 0xff ^ (b[k >> 8 & 0xff] & 0xff) << 8 ^ (b[i2 >> 16 & 0xff] & 0xff) << 16 ^ b[k1 >> 24 & 0xff] << 24 ^ ai[0][0];
        g = b[k1 & 0xff] & 0xff ^ (b[i1 >> 8 & 0xff] & 0xff) << 8 ^ (b[k >> 16 & 0xff] & 0xff) << 16 ^ b[i2 >> 24 & 0xff] << 24 ^ ai[0][1];
        h = b[i2 & 0xff] & 0xff ^ (b[k1 >> 8 & 0xff] & 0xff) << 8 ^ (b[i1 >> 16 & 0xff] & 0xff) << 16 ^ b[k >> 24 & 0xff] << 24 ^ ai[0][2];
        i = b[k & 0xff] & 0xff ^ (b[i2 >> 8 & 0xff] & 0xff) << 8 ^ (b[k1 >> 16 & 0xff] & 0xff) << 16 ^ b[i1 >> 24 & 0xff] << 24 ^ ai[0][3];
    }

    private static int c(int k)
    {
        int l = a(k);
        int i1 = a(l);
        int j1 = a(i1);
        k ^= j1;
        return a(l ^ k, 8) ^ (j1 ^ (l ^ i1)) ^ a(i1 ^ k, 16) ^ a(k, 24);
    }

    private static int d(int k)
    {
        return a[k & 0xff] & 0xff | (a[k >> 8 & 0xff] & 0xff) << 8 | (a[k >> 16 & 0xff] & 0xff) << 16 | a[k >> 24 & 0xff] << 24;
    }

    public final int a(byte abyte0[], int k, byte abyte1[], int l)
    {
        if (e == null)
        {
            throw new IllegalStateException("AES engine not initialised");
        }
        if (k + 16 > abyte0.length)
        {
            throw new DataLengthException("input buffer too short");
        }
        if (l + 16 > abyte1.length)
        {
            throw new DataLengthException("output buffer too short");
        }
        if (j)
        {
            a(abyte0, k);
            a(e);
            b(abyte1, l);
        } else
        {
            a(abyte0, k);
            b(e);
            b(abyte1, l);
        }
        return 16;
    }

    public final String a()
    {
        return "AES";
    }

    public final void a(boolean flag, CipherParameters cipherparameters)
    {
        if (cipherparameters instanceof KeyParameter)
        {
            cipherparameters = ((KeyParameter)cipherparameters).a();
            int i2 = cipherparameters.length / 4;
            if (i2 != 4 && i2 != 6 && i2 != 8 || i2 * 4 != cipherparameters.length)
            {
                throw new IllegalArgumentException("Key length not 128/192/256 bits.");
            }
            d = i2 + 6;
            int k = d;
            int ai[][] = (int[][])Array.newInstance(Integer.TYPE, new int[] {
                k + 1, 4
            });
            int k1 = 0;
            for (int l = 0; k1 < cipherparameters.length; l++)
            {
                ai[l >> 2][l & 3] = cipherparameters[k1] & 0xff | (cipherparameters[k1 + 1] & 0xff) << 8 | (cipherparameters[k1 + 2] & 0xff) << 16 | cipherparameters[k1 + 3] << 24;
                k1 += 4;
            }

            int k2 = d;
            k1 = i2;
            while (k1 < k2 + 1 << 2) 
            {
                int j2 = ai[k1 - 1 >> 2][k1 - 1 & 3];
                int i1;
                if (k1 % i2 == 0)
                {
                    i1 = d(a(j2, 8)) ^ c[k1 / i2 - 1];
                } else
                {
                    i1 = j2;
                    if (i2 > 6)
                    {
                        i1 = j2;
                        if (k1 % i2 == 4)
                        {
                            i1 = d(j2);
                        }
                    }
                }
                ai[k1 >> 2][k1 & 3] = i1 ^ ai[k1 - i2 >> 2][k1 - i2 & 3];
                k1++;
            }
            if (!flag)
            {
                for (int j1 = 1; j1 < d; j1++)
                {
                    for (int l1 = 0; l1 < 4; l1++)
                    {
                        ai[j1][l1] = c(ai[j1][l1]);
                    }

                }

            }
            e = ai;
            j = flag;
            return;
        } else
        {
            throw new IllegalArgumentException((new StringBuilder("invalid parameter passed to AES init - ")).append(cipherparameters.getClass().getName()).toString());
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
