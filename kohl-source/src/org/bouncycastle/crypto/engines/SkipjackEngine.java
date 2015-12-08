// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.engines;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.params.KeyParameter;

public class SkipjackEngine
    implements BlockCipher
{

    static final int BLOCK_SIZE = 8;
    static short ftable[] = {
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
    private boolean encrypting;
    private int key0[];
    private int key1[];
    private int key2[];
    private int key3[];

    public SkipjackEngine()
    {
    }

    private int g(int i, int j)
    {
        int k = j & 0xff;
        j = j >> 8 & 0xff ^ ftable[key0[i] ^ k];
        k ^= ftable[key1[i] ^ j];
        j ^= ftable[key2[i] ^ k];
        return (j << 8) + (k ^ ftable[key3[i] ^ j]);
    }

    private int h(int i, int j)
    {
        int k = j >> 8 & 0xff;
        j = j & 0xff ^ ftable[key3[i] ^ k];
        k ^= ftable[key2[i] ^ j];
        j ^= ftable[key1[i] ^ k];
        return j + ((k ^ ftable[key0[i] ^ j]) << 8);
    }

    public int decryptBlock(byte abyte0[], int i, byte abyte1[], int j)
    {
        int k = (abyte0[i + 0] << 8) + (abyte0[i + 1] & 0xff);
        int j1 = (abyte0[i + 2] << 8) + (abyte0[i + 3] & 0xff);
        int i1 = (abyte0[i + 4] << 8) + (abyte0[i + 5] & 0xff);
        int l = abyte0[i + 6];
        int l1 = (abyte0[i + 7] & 0xff) + (l << 8);
        l = 31;
        int k1 = 0;
        i = k;
        k = l1;
        while (k1 < 2) 
        {
            for (int i2 = 0; i2 < 8;)
            {
                int k2 = h(l, j1);
                j1 = l + 1 ^ (i1 ^ k2);
                i2++;
                l--;
                i1 = k;
                k = i;
                i = k2;
            }

            int j2 = k;
            int l2 = 0;
            k = i1;
            i1 = i;
            i = j2;
            do
            {
                j2 = j1;
                j1 = i1;
                if (l2 >= 8)
                {
                    break;
                }
                i1 = h(l, j2);
                int j3 = l - 1;
                l2++;
                int i3 = k;
                k = i;
                i = j1 ^ j2 ^ l + 1;
                l = j3;
                j1 = i3;
            } while (true);
            k1++;
            i1 = k;
            k = i;
            i = j1;
            j1 = j2;
        }
        abyte1[j + 0] = (byte)(i >> 8);
        abyte1[j + 1] = (byte)i;
        abyte1[j + 2] = (byte)(j1 >> 8);
        abyte1[j + 3] = (byte)j1;
        abyte1[j + 4] = (byte)(i1 >> 8);
        abyte1[j + 5] = (byte)i1;
        abyte1[j + 6] = (byte)(k >> 8);
        abyte1[j + 7] = (byte)k;
        return 8;
    }

    public int encryptBlock(byte abyte0[], int i, byte abyte1[], int j)
    {
        int l1 = (abyte0[i + 0] << 8) + (abyte0[i + 1] & 0xff);
        int k1 = (abyte0[i + 2] << 8) + (abyte0[i + 3] & 0xff);
        int k = (abyte0[i + 4] << 8) + (abyte0[i + 5] & 0xff);
        int i1 = abyte0[i + 6];
        int j1 = (abyte0[i + 7] & 0xff) + (i1 << 8);
        int i2 = 0;
        i1 = 0;
        i = k;
        int j2;
        for (; i2 < 2; i2 = j2)
        {
            j2 = 0;
            int l = k1;
            while (j2 < 8) 
            {
                l1 = g(i1, l1);
                j2++;
                int k2 = i1 + 1;
                k1 = i;
                i = l;
                l = l1;
                l1 = i1 + 1 ^ (j1 ^ l1);
                i1 = k2;
                j1 = k1;
            }
            j2 = l1;
            k1 = j1;
            l1 = i1;
            boolean flag = false;
            i1 = j2;
            j1 = l;
            l = i;
            i = k1;
            k1 = l1;
            for (l1 = ((flag) ? 1 : 0); l1 < 8;)
            {
                int i3 = g(k1, i1);
                j2 = k1 + 1;
                l1++;
                int l2 = j1 ^ i1 ^ k1 + 1;
                j1 = i3;
                i1 = i;
                i = l;
                k1 = j2;
                l = l2;
            }

            j2 = i2 + 1;
            i2 = j1;
            l1 = i1;
            i1 = k1;
            j1 = i;
            k1 = i2;
            i = l;
        }

        abyte1[j + 0] = (byte)(l1 >> 8);
        abyte1[j + 1] = (byte)l1;
        abyte1[j + 2] = (byte)(k1 >> 8);
        abyte1[j + 3] = (byte)k1;
        abyte1[j + 4] = (byte)(i >> 8);
        abyte1[j + 5] = (byte)i;
        abyte1[j + 6] = (byte)(j1 >> 8);
        abyte1[j + 7] = (byte)j1;
        return 8;
    }

    public String getAlgorithmName()
    {
        return "SKIPJACK";
    }

    public int getBlockSize()
    {
        return 8;
    }

    public void init(boolean flag, CipherParameters cipherparameters)
    {
        if (!(cipherparameters instanceof KeyParameter))
        {
            throw new IllegalArgumentException((new StringBuilder()).append("invalid parameter passed to SKIPJACK init - ").append(cipherparameters.getClass().getName()).toString());
        }
        cipherparameters = ((KeyParameter)cipherparameters).getKey();
        encrypting = flag;
        key0 = new int[32];
        key1 = new int[32];
        key2 = new int[32];
        key3 = new int[32];
        for (int i = 0; i < 32; i++)
        {
            key0[i] = cipherparameters[(i * 4) % 10] & 0xff;
            key1[i] = cipherparameters[(i * 4 + 1) % 10] & 0xff;
            key2[i] = cipherparameters[(i * 4 + 2) % 10] & 0xff;
            key3[i] = cipherparameters[(i * 4 + 3) % 10] & 0xff;
        }

    }

    public int processBlock(byte abyte0[], int i, byte abyte1[], int j)
    {
        if (key1 == null)
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
        if (encrypting)
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
