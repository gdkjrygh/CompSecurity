// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto.engines;

import org.spongycastle.crypto.BlockCipher;
import org.spongycastle.crypto.CipherParameters;
import org.spongycastle.crypto.DataLengthException;
import org.spongycastle.crypto.params.KeyParameter;

public class SkipjackEngine
    implements BlockCipher
{

    static short a[] = {
        163, 215, 9, 131, 248, 72, 246, 244, 179, 33, 
        21, 120, 153, 177, 175, 249, 231, 45, 77, 138, 
        206, 76, 202, 46, 82, 149, 217, 30, 78, 56, 
        68, 40, 10, 223, 2, 160, 23, 241, 96, 104, 
        18, 183, 122, 195, 233, 250, 61, 83, 150, 132, 
        107, 186, 242, 99, 154, 25, 124, 174, 229, 245, 
        247, 22, 106, 162, 57, 182, 123, 15, 193, 147, 
        129, 27, 238, 180, 26, 234, 208, 145, 47, 184, 
        85, 185, 218, 133, 63, 65, 191, 224, 90, 88, 
        128, 95, 102, 11, 216, 144, 53, 213, 192, 167, 
        51, 6, 101, 105, 69, 0, 148, 86, 109, 152, 
        155, 118, 151, 252, 178, 194, 176, 254, 219, 32, 
        225, 235, 214, 228, 221, 71, 74, 29, 66, 237, 
        158, 110, 73, 60, 205, 67, 39, 210, 7, 212, 
        222, 199, 103, 24, 137, 203, 48, 31, 141, 198, 
        143, 170, 200, 116, 220, 201, 93, 92, 49, 164, 
        112, 136, 97, 44, 159, 13, 43, 135, 80, 130, 
        84, 100, 38, 125, 3, 64, 52, 75, 28, 115, 
        209, 196, 253, 59, 204, 251, 127, 171, 230, 62, 
        91, 165, 173, 4, 35, 156, 20, 81, 34, 240, 
        41, 121, 113, 126, 255, 140, 14, 226, 12, 239, 
        188, 114, 117, 111, 55, 161, 236, 211, 142, 98, 
        139, 134, 16, 232, 8, 119, 17, 190, 146, 79, 
        36, 197, 50, 54, 157, 207, 243, 166, 187, 172, 
        94, 108, 169, 19, 87, 37, 181, 227, 189, 168, 
        58, 1, 5, 89, 42, 70
    };
    private int b[];
    private int c[];
    private int d[];
    private int e[];
    private boolean f;

    public SkipjackEngine()
    {
    }

    private int a(int i, int j)
    {
        int k = j & 0xff;
        j = j >> 8 & 0xff ^ a[b[i] ^ k];
        k ^= a[c[i] ^ j];
        j ^= a[d[i] ^ k];
        return (j << 8) + (k ^ a[e[i] ^ j]);
    }

    private int b(int i, int j)
    {
        int k = j >> 8 & 0xff;
        j = j & 0xff ^ a[e[i] ^ k];
        k ^= a[d[i] ^ j];
        j ^= a[c[i] ^ k];
        return j + ((k ^ a[b[i] ^ j]) << 8);
    }

    private int b(byte abyte0[], int i, byte abyte1[], int j)
    {
        int j1 = (abyte0[i + 0] << 8) + (abyte0[i + 1] & 0xff);
        int k = abyte0[i + 2];
        k = (abyte0[i + 3] & 0xff) + (k << 8);
        int i1 = (abyte0[i + 4] << 8) + (abyte0[i + 5] & 0xff);
        byte byte0 = abyte0[i + 6];
        i = (abyte0[i + 7] & 0xff) + (byte0 << 8);
        int l1 = 0;
        int k1 = 0;
        int i2;
        for (; l1 < 2; l1 = i2)
        {
            i2 = 0;
            int l = i;
            i = i1;
            while (i2 < 8) 
            {
                j1 = a(k1, j1);
                i1 = k1 + 1;
                i2++;
                k1 = k1 + 1 ^ (j1 ^ l);
                l = i;
                i = k;
                k = j1;
                j1 = k1;
                k1 = i1;
            }
            i2 = k1;
            i1 = j1;
            k1 = i;
            boolean flag = false;
            j1 = i2;
            i = l;
            l = k;
            k = k1;
            for (k1 = ((flag) ? 1 : 0); k1 < 8;)
            {
                i2 = a(j1, i1);
                int k2 = j1 + 1;
                k1++;
                int j2 = i;
                i = k;
                k = l ^ i1 ^ j1 + 1;
                l = i2;
                i1 = j2;
                j1 = k2;
            }

            i2 = l1 + 1;
            k1 = i1;
            l1 = j1;
            i1 = k;
            k = l;
            j1 = k1;
            k1 = l1;
        }

        abyte1[j + 0] = (byte)(j1 >> 8);
        abyte1[j + 1] = (byte)j1;
        abyte1[j + 2] = (byte)(k >> 8);
        abyte1[j + 3] = (byte)k;
        abyte1[j + 4] = (byte)(i1 >> 8);
        abyte1[j + 5] = (byte)i1;
        abyte1[j + 6] = (byte)(i >> 8);
        abyte1[j + 7] = (byte)i;
        return 8;
    }

    private int c(byte abyte0[], int i, byte abyte1[], int j)
    {
        int i1 = (abyte0[i + 0] << 8) + (abyte0[i + 1] & 0xff);
        int k = abyte0[i + 2];
        int l1 = (abyte0[i + 3] & 0xff) + (k << 8);
        int l = (abyte0[i + 4] << 8) + (abyte0[i + 5] & 0xff);
        k = abyte0[i + 6];
        k = (abyte0[i + 7] & 0xff) + (k << 8);
        int j1 = 31;
        int k1 = 0;
        i = i1;
        i1 = l1;
        int l2;
        for (; k1 < 2; k1 = l2)
        {
            for (int i2 = 0; i2 < 8;)
            {
                int k2 = b(j1, i1);
                i1 = j1 + 1 ^ (l ^ k2);
                j1--;
                i2++;
                l = k;
                k = i;
                i = k2;
            }

            l2 = i1;
            int j2 = l;
            boolean flag = false;
            i1 = i;
            l = l2;
            i = k;
            k = j2;
            for (j2 = ((flag) ? 1 : 0); j2 < 8;)
            {
                l2 = b(j1, l);
                j2++;
                int j3 = j1 - 1;
                int i3 = k;
                l = j1 + 1 ^ (i1 ^ l);
                k = i;
                i = l;
                l = i3;
                i1 = l2;
                j1 = j3;
            }

            l2 = k1 + 1;
            k1 = k;
            j2 = l;
            k = i;
            i = i1;
            l = k1;
            i1 = j2;
        }

        abyte1[j + 0] = (byte)(i >> 8);
        abyte1[j + 1] = (byte)i;
        abyte1[j + 2] = (byte)(i1 >> 8);
        abyte1[j + 3] = (byte)i1;
        abyte1[j + 4] = (byte)(l >> 8);
        abyte1[j + 5] = (byte)l;
        abyte1[j + 6] = (byte)(k >> 8);
        abyte1[j + 7] = (byte)k;
        return 8;
    }

    public final int a(byte abyte0[], int i, byte abyte1[], int j)
    {
        if (c == null)
        {
            throw new IllegalStateException("SKIPJACK engine not initialised");
        }
        if (i + 8 > abyte0.length)
        {
            throw new DataLengthException("input buffer too short");
        }
        if (j + 8 > abyte1.length)
        {
            throw new DataLengthException("output buffer too short");
        }
        if (f)
        {
            b(abyte0, i, abyte1, j);
        } else
        {
            c(abyte0, i, abyte1, j);
        }
        return 8;
    }

    public final String a()
    {
        return "SKIPJACK";
    }

    public final void a(boolean flag, CipherParameters cipherparameters)
    {
        if (!(cipherparameters instanceof KeyParameter))
        {
            throw new IllegalArgumentException((new StringBuilder("invalid parameter passed to SKIPJACK init - ")).append(cipherparameters.getClass().getName()).toString());
        }
        cipherparameters = ((KeyParameter)cipherparameters).a();
        f = flag;
        b = new int[32];
        c = new int[32];
        d = new int[32];
        e = new int[32];
        for (int i = 0; i < 32; i++)
        {
            b[i] = cipherparameters[(i * 4) % 10] & 0xff;
            c[i] = cipherparameters[(i * 4 + 1) % 10] & 0xff;
            d[i] = cipherparameters[(i * 4 + 2) % 10] & 0xff;
            e[i] = cipherparameters[(i * 4 + 3) % 10] & 0xff;
        }

    }

    public final int b()
    {
        return 8;
    }

    public final void c()
    {
    }

}
