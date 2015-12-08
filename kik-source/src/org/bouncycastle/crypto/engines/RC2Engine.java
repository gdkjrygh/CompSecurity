// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.engines;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.params.RC2Parameters;

public class RC2Engine
    implements BlockCipher
{

    private static byte a[] = {
        -39, 120, -7, -60, 25, -35, -75, -19, 40, -23, 
        -3, 121, 74, -96, -40, -99, -58, 126, 55, -125, 
        43, 118, 83, -114, 98, 76, 100, -120, 68, -117, 
        -5, -94, 23, -102, 89, -11, -121, -77, 79, 19, 
        97, 69, 109, -115, 9, -127, 125, 50, -67, -113, 
        64, -21, -122, -73, 123, 11, -16, -107, 33, 34, 
        92, 107, 78, -126, 84, -42, 101, -109, -50, 96, 
        -78, 28, 115, 86, -64, 20, -89, -116, -15, -36, 
        18, 117, -54, 31, 59, -66, -28, -47, 66, 61, 
        -44, 48, -93, 60, -74, 38, 111, -65, 14, -38, 
        70, 105, 7, 87, 39, -14, 29, -101, -68, -108, 
        67, 3, -8, 17, -57, -10, -112, -17, 62, -25, 
        6, -61, -43, 47, -56, 102, 30, -41, 8, -24, 
        -22, -34, -128, 82, -18, -9, -124, -86, 114, -84, 
        53, 77, 106, 42, -106, 26, -46, 113, 90, 21, 
        73, 116, 75, -97, -48, 94, 4, 24, -92, -20, 
        -62, -32, 65, 110, 15, 81, -53, -52, 36, -111, 
        -81, 80, -95, -12, 112, 57, -103, 124, 58, -123, 
        35, -72, -76, 122, -4, 2, 54, 91, 37, 85, 
        -105, 49, 45, 93, -6, -104, -29, -118, -110, -82, 
        5, -33, 41, 16, 103, 108, -70, -55, -45, 0, 
        -26, -49, -31, -98, -88, 44, 99, 22, 1, 63, 
        88, -30, -119, -87, 13, 56, 52, 27, -85, 51, 
        -1, -80, -69, 72, 12, 95, -71, -79, -51, 46, 
        -59, -13, -37, 71, -27, -91, -100, 119, 10, -90, 
        32, 104, -2, 127, -63, -83
    };
    private int b[];
    private boolean c;

    public RC2Engine()
    {
    }

    private void decryptBlock(byte abyte0[], int i, byte abyte1[], int j)
    {
        int j1 = ((abyte0[i + 7] & 0xff) << 8) + (abyte0[i + 6] & 0xff);
        int k = abyte0[i + 5];
        int i1 = (abyte0[i + 4] & 0xff) + ((k & 0xff) << 8);
        int l = ((abyte0[i + 3] & 0xff) << 8) + (abyte0[i + 2] & 0xff);
        k = abyte0[i + 1];
        i = (abyte0[i + 0] & 0xff) + ((k & 0xff) << 8);
        for (k = 60; k >= 44; k -= 4)
        {
            j1 = rotateWordLeft(j1, 11) - ((~i1 & i) + (l & i1) + b[k + 3]);
            i1 = rotateWordLeft(i1, 13) - ((~l & j1) + (i & l) + b[k + 2]);
            l = rotateWordLeft(l, 14) - ((~i & i1) + (j1 & i) + b[k + 1]);
            i = rotateWordLeft(i, 15) - ((~j1 & l) + (i1 & j1) + b[k]);
        }

        j1 -= b[i1 & 0x3f];
        i1 -= b[l & 0x3f];
        l -= b[i & 0x3f];
        i -= b[j1 & 0x3f];
        for (k = 40; k >= 20; k -= 4)
        {
            j1 = rotateWordLeft(j1, 11) - ((~i1 & i) + (l & i1) + b[k + 3]);
            i1 = rotateWordLeft(i1, 13) - ((~l & j1) + (i & l) + b[k + 2]);
            l = rotateWordLeft(l, 14) - ((~i & i1) + (j1 & i) + b[k + 1]);
            i = rotateWordLeft(i, 15) - ((~j1 & l) + (i1 & j1) + b[k]);
        }

        j1 -= b[i1 & 0x3f];
        i1 -= b[l & 0x3f];
        l -= b[i & 0x3f];
        k = i - b[j1 & 0x3f];
        for (i = 16; i >= 0; i -= 4)
        {
            j1 = rotateWordLeft(j1, 11) - ((~i1 & k) + (l & i1) + b[i + 3]);
            i1 = rotateWordLeft(i1, 13) - ((~l & j1) + (k & l) + b[i + 2]);
            l = rotateWordLeft(l, 14) - ((~k & i1) + (j1 & k) + b[i + 1]);
            k = rotateWordLeft(k, 15) - ((~j1 & l) + (i1 & j1) + b[i]);
        }

        abyte1[j + 0] = (byte)k;
        abyte1[j + 1] = (byte)(k >> 8);
        abyte1[j + 2] = (byte)l;
        abyte1[j + 3] = (byte)(l >> 8);
        abyte1[j + 4] = (byte)i1;
        abyte1[j + 5] = (byte)(i1 >> 8);
        abyte1[j + 6] = (byte)j1;
        abyte1[j + 7] = (byte)(j1 >> 8);
    }

    private void encryptBlock(byte abyte0[], int i, byte abyte1[], int j)
    {
        int k = ((abyte0[i + 7] & 0xff) << 8) + (abyte0[i + 6] & 0xff);
        int l = abyte0[i + 5];
        int k1 = (abyte0[i + 4] & 0xff) + ((l & 0xff) << 8);
        int i1 = ((abyte0[i + 3] & 0xff) << 8) + (abyte0[i + 2] & 0xff);
        l = abyte0[i + 1];
        int j1 = (abyte0[i + 0] & 0xff) + ((l & 0xff) << 8);
        l = 0;
        i = k;
        k = k1;
        for (; l <= 16; l += 4)
        {
            j1 = rotateWordLeft(j1 + (~i & i1) + (k & i) + b[l], 1);
            i1 = rotateWordLeft(i1 + (~j1 & k) + (i & j1) + b[l + 1], 2);
            k = rotateWordLeft(k + (~i1 & i) + (j1 & i1) + b[l + 2], 3);
            i = rotateWordLeft(i + (~k & j1) + (i1 & k) + b[l + 3], 5);
        }

        j1 += b[i & 0x3f];
        i1 += b[j1 & 0x3f];
        k += b[i1 & 0x3f];
        i += b[k & 0x3f];
        for (l = 20; l <= 40; l += 4)
        {
            j1 = rotateWordLeft(j1 + (~i & i1) + (k & i) + b[l], 1);
            i1 = rotateWordLeft(i1 + (~j1 & k) + (i & j1) + b[l + 1], 2);
            k = rotateWordLeft(k + (~i1 & i) + (j1 & i1) + b[l + 2], 3);
            i = rotateWordLeft(i + (~k & j1) + (i1 & k) + b[l + 3], 5);
        }

        j1 += b[i & 0x3f];
        i1 += b[j1 & 0x3f];
        l = k + b[i1 & 0x3f];
        k = i + b[l & 0x3f];
        for (i = 44; i < 64; i += 4)
        {
            j1 = rotateWordLeft(j1 + (~k & i1) + (l & k) + b[i], 1);
            i1 = rotateWordLeft(i1 + (~j1 & l) + (k & j1) + b[i + 1], 2);
            l = rotateWordLeft(l + (~i1 & k) + (j1 & i1) + b[i + 2], 3);
            k = rotateWordLeft(k + (~l & j1) + (i1 & l) + b[i + 3], 5);
        }

        abyte1[j + 0] = (byte)j1;
        abyte1[j + 1] = (byte)(j1 >> 8);
        abyte1[j + 2] = (byte)i1;
        abyte1[j + 3] = (byte)(i1 >> 8);
        abyte1[j + 4] = (byte)l;
        abyte1[j + 5] = (byte)(l >> 8);
        abyte1[j + 6] = (byte)k;
        abyte1[j + 7] = (byte)(k >> 8);
    }

    private int[] generateWorkingKey(byte abyte0[], int i)
    {
        int ai[];
        int l;
        boolean flag;
        flag = false;
        ai = new int[128];
        for (int j = 0; j != abyte0.length; j++)
        {
            ai[j] = abyte0[j] & 0xff;
        }

        l = abyte0.length;
        if (l >= 128) goto _L2; else goto _L1
_L1:
        int k;
        int i1;
        i1 = ai[l - 1];
        k = 0;
_L5:
        int j1;
        i1 = a[ai[k] + i1 & 0xff] & 0xff;
        j1 = l + 1;
        ai[l] = i1;
        if (j1 < 128) goto _L3; else goto _L2
_L2:
        l = i + 7 >> 3;
        k = a[ai[128 - l] & 255 >> (-i & 7)] & 0xff;
        ai[128 - l] = k;
        for (i = 128 - l - 1; i >= 0; i--)
        {
            k = a[k ^ ai[i + l]] & 0xff;
            ai[i] = k;
        }

        abyte0 = new int[64];
        for (i = ((flag) ? 1 : 0); i != 64; i++)
        {
            abyte0[i] = ai[i * 2] + (ai[i * 2 + 1] << 8);
        }

        return abyte0;
_L3:
        l = j1;
        k++;
        if (true) goto _L5; else goto _L4
_L4:
    }

    private int rotateWordLeft(int i, int j)
    {
        i = 0xffff & i;
        return i >> 16 - j | i << j;
    }

    public String getAlgorithmName()
    {
        return "RC2";
    }

    public int getBlockSize()
    {
        return 8;
    }

    public void init(boolean flag, CipherParameters cipherparameters)
    {
        c = flag;
        if (cipherparameters instanceof RC2Parameters)
        {
            cipherparameters = (RC2Parameters)cipherparameters;
            b = generateWorkingKey(cipherparameters.getKey(), cipherparameters.getEffectiveKeyBits());
            return;
        }
        if (cipherparameters instanceof KeyParameter)
        {
            cipherparameters = ((KeyParameter)cipherparameters).getKey();
            b = generateWorkingKey(cipherparameters, cipherparameters.length * 8);
            return;
        } else
        {
            throw new IllegalArgumentException((new StringBuilder("invalid parameter passed to RC2 init - ")).append(cipherparameters.getClass().getName()).toString());
        }
    }

    public final int processBlock(byte abyte0[], int i, byte abyte1[], int j)
    {
        if (b == null)
        {
            throw new IllegalStateException("RC2 engine not initialised");
        }
        if (i + 8 > abyte0.length)
        {
            throw new DataLengthException("input buffer too short");
        }
        if (j + 8 > abyte1.length)
        {
            throw new DataLengthException("output buffer too short");
        }
        if (c)
        {
            encryptBlock(abyte0, i, abyte1, j);
        } else
        {
            decryptBlock(abyte0, i, abyte1, j);
        }
        return 8;
    }

    public void reset()
    {
    }

}
