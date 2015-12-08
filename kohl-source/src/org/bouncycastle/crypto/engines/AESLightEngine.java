// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.engines;

import java.lang.reflect.Array;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.params.KeyParameter;

public class AESLightEngine
    implements BlockCipher
{

    private static final int BLOCK_SIZE = 16;
    private static final byte S[] = {
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
    private static final byte Si[] = {
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
    private static final int m1 = 0x80808080;
    private static final int m2 = 0x7f7f7f7f;
    private static final int m3 = 27;
    private static final int rcon[] = {
        1, 2, 4, 8, 16, 32, 64, 128, 27, 54, 
        108, 216, 171, 77, 154, 47, 94, 188, 99, 198, 
        151, 53, 106, 212, 179, 125, 250, 239, 197, 145
    };
    private int C0;
    private int C1;
    private int C2;
    private int C3;
    private int ROUNDS;
    private int WorkingKey[][];
    private boolean forEncryption;

    public AESLightEngine()
    {
        WorkingKey = (int[][])null;
    }

    private int FFmulX(int i)
    {
        return (0x7f7f7f7f & i) << 1 ^ ((0x80808080 & i) >>> 7) * 27;
    }

    private void decryptBlock(int ai[][])
    {
        C0 = C0 ^ ai[ROUNDS][0];
        C1 = C1 ^ ai[ROUNDS][1];
        C2 = C2 ^ ai[ROUNDS][2];
        C3 = C3 ^ ai[ROUNDS][3];
        int i;
        for (i = ROUNDS - 1; i > 1;)
        {
            int l = inv_mcol(Si[C0 & 0xff] & 0xff ^ (Si[C3 >> 8 & 0xff] & 0xff) << 8 ^ (Si[C2 >> 16 & 0xff] & 0xff) << 16 ^ Si[C1 >> 24 & 0xff] << 24) ^ ai[i][0];
            int j1 = inv_mcol(Si[C1 & 0xff] & 0xff ^ (Si[C0 >> 8 & 0xff] & 0xff) << 8 ^ (Si[C3 >> 16 & 0xff] & 0xff) << 16 ^ Si[C2 >> 24 & 0xff] << 24) ^ ai[i][1];
            int l1 = inv_mcol(Si[C2 & 0xff] & 0xff ^ (Si[C1 >> 8 & 0xff] & 0xff) << 8 ^ (Si[C0 >> 16 & 0xff] & 0xff) << 16 ^ Si[C3 >> 24 & 0xff] << 24) ^ ai[i][2];
            int j2 = inv_mcol(Si[C3 & 0xff] & 0xff ^ (Si[C2 >> 8 & 0xff] & 0xff) << 8 ^ (Si[C1 >> 16 & 0xff] & 0xff) << 16 ^ Si[C0 >> 24 & 0xff] << 24);
            int j = i - 1;
            i = ai[i][3] ^ j2;
            C0 = inv_mcol(Si[l & 0xff] & 0xff ^ (Si[i >> 8 & 0xff] & 0xff) << 8 ^ (Si[l1 >> 16 & 0xff] & 0xff) << 16 ^ Si[j1 >> 24 & 0xff] << 24) ^ ai[j][0];
            C1 = inv_mcol(Si[j1 & 0xff] & 0xff ^ (Si[l >> 8 & 0xff] & 0xff) << 8 ^ (Si[i >> 16 & 0xff] & 0xff) << 16 ^ Si[l1 >> 24 & 0xff] << 24) ^ ai[j][1];
            C2 = inv_mcol(Si[l1 & 0xff] & 0xff ^ (Si[j1 >> 8 & 0xff] & 0xff) << 8 ^ (Si[l >> 16 & 0xff] & 0xff) << 16 ^ Si[i >> 24 & 0xff] << 24) ^ ai[j][2];
            l = inv_mcol(Si[i & 0xff] & 0xff ^ (Si[l1 >> 8 & 0xff] & 0xff) << 8 ^ (Si[j1 >> 16 & 0xff] & 0xff) << 16 ^ Si[l >> 24 & 0xff] << 24);
            i = j - 1;
            C3 = l ^ ai[j][3];
        }

        int k = inv_mcol(Si[C0 & 0xff] & 0xff ^ (Si[C3 >> 8 & 0xff] & 0xff) << 8 ^ (Si[C2 >> 16 & 0xff] & 0xff) << 16 ^ Si[C1 >> 24 & 0xff] << 24) ^ ai[i][0];
        int i1 = inv_mcol(Si[C1 & 0xff] & 0xff ^ (Si[C0 >> 8 & 0xff] & 0xff) << 8 ^ (Si[C3 >> 16 & 0xff] & 0xff) << 16 ^ Si[C2 >> 24 & 0xff] << 24) ^ ai[i][1];
        int k1 = inv_mcol(Si[C2 & 0xff] & 0xff ^ (Si[C1 >> 8 & 0xff] & 0xff) << 8 ^ (Si[C0 >> 16 & 0xff] & 0xff) << 16 ^ Si[C3 >> 24 & 0xff] << 24) ^ ai[i][2];
        int i2 = inv_mcol(Si[C3 & 0xff] & 0xff ^ (Si[C2 >> 8 & 0xff] & 0xff) << 8 ^ (Si[C1 >> 16 & 0xff] & 0xff) << 16 ^ Si[C0 >> 24 & 0xff] << 24);
        i = ai[i][3] ^ i2;
        C0 = Si[k & 0xff] & 0xff ^ (Si[i >> 8 & 0xff] & 0xff) << 8 ^ (Si[k1 >> 16 & 0xff] & 0xff) << 16 ^ Si[i1 >> 24 & 0xff] << 24 ^ ai[0][0];
        C1 = Si[i1 & 0xff] & 0xff ^ (Si[k >> 8 & 0xff] & 0xff) << 8 ^ (Si[i >> 16 & 0xff] & 0xff) << 16 ^ Si[k1 >> 24 & 0xff] << 24 ^ ai[0][1];
        C2 = Si[k1 & 0xff] & 0xff ^ (Si[i1 >> 8 & 0xff] & 0xff) << 8 ^ (Si[k >> 16 & 0xff] & 0xff) << 16 ^ Si[i >> 24 & 0xff] << 24 ^ ai[0][2];
        C3 = Si[i & 0xff] & 0xff ^ (Si[k1 >> 8 & 0xff] & 0xff) << 8 ^ (Si[i1 >> 16 & 0xff] & 0xff) << 16 ^ Si[k >> 24 & 0xff] << 24 ^ ai[0][3];
    }

    private void encryptBlock(int ai[][])
    {
        C0 = C0 ^ ai[0][0];
        C1 = C1 ^ ai[0][1];
        C2 = C2 ^ ai[0][2];
        C3 = C3 ^ ai[0][3];
        int i;
        for (i = 1; i < ROUNDS - 1;)
        {
            int l = mcol(S[C0 & 0xff] & 0xff ^ (S[C1 >> 8 & 0xff] & 0xff) << 8 ^ (S[C2 >> 16 & 0xff] & 0xff) << 16 ^ S[C3 >> 24 & 0xff] << 24) ^ ai[i][0];
            int j1 = mcol(S[C1 & 0xff] & 0xff ^ (S[C2 >> 8 & 0xff] & 0xff) << 8 ^ (S[C3 >> 16 & 0xff] & 0xff) << 16 ^ S[C0 >> 24 & 0xff] << 24) ^ ai[i][1];
            int l1 = mcol(S[C2 & 0xff] & 0xff ^ (S[C3 >> 8 & 0xff] & 0xff) << 8 ^ (S[C0 >> 16 & 0xff] & 0xff) << 16 ^ S[C1 >> 24 & 0xff] << 24) ^ ai[i][2];
            int j2 = mcol(S[C3 & 0xff] & 0xff ^ (S[C0 >> 8 & 0xff] & 0xff) << 8 ^ (S[C1 >> 16 & 0xff] & 0xff) << 16 ^ S[C2 >> 24 & 0xff] << 24);
            int j = i + 1;
            i = ai[i][3] ^ j2;
            C0 = mcol(S[l & 0xff] & 0xff ^ (S[j1 >> 8 & 0xff] & 0xff) << 8 ^ (S[l1 >> 16 & 0xff] & 0xff) << 16 ^ S[i >> 24 & 0xff] << 24) ^ ai[j][0];
            C1 = mcol(S[j1 & 0xff] & 0xff ^ (S[l1 >> 8 & 0xff] & 0xff) << 8 ^ (S[i >> 16 & 0xff] & 0xff) << 16 ^ S[l >> 24 & 0xff] << 24) ^ ai[j][1];
            C2 = mcol(S[l1 & 0xff] & 0xff ^ (S[i >> 8 & 0xff] & 0xff) << 8 ^ (S[l >> 16 & 0xff] & 0xff) << 16 ^ S[j1 >> 24 & 0xff] << 24) ^ ai[j][2];
            l = mcol(S[i & 0xff] & 0xff ^ (S[l >> 8 & 0xff] & 0xff) << 8 ^ (S[j1 >> 16 & 0xff] & 0xff) << 16 ^ S[l1 >> 24 & 0xff] << 24);
            i = j + 1;
            C3 = l ^ ai[j][3];
        }

        int k = mcol(S[C0 & 0xff] & 0xff ^ (S[C1 >> 8 & 0xff] & 0xff) << 8 ^ (S[C2 >> 16 & 0xff] & 0xff) << 16 ^ S[C3 >> 24 & 0xff] << 24) ^ ai[i][0];
        int i1 = mcol(S[C1 & 0xff] & 0xff ^ (S[C2 >> 8 & 0xff] & 0xff) << 8 ^ (S[C3 >> 16 & 0xff] & 0xff) << 16 ^ S[C0 >> 24 & 0xff] << 24) ^ ai[i][1];
        int k1 = mcol(S[C2 & 0xff] & 0xff ^ (S[C3 >> 8 & 0xff] & 0xff) << 8 ^ (S[C0 >> 16 & 0xff] & 0xff) << 16 ^ S[C1 >> 24 & 0xff] << 24) ^ ai[i][2];
        int k2 = mcol(S[C3 & 0xff] & 0xff ^ (S[C0 >> 8 & 0xff] & 0xff) << 8 ^ (S[C1 >> 16 & 0xff] & 0xff) << 16 ^ S[C2 >> 24 & 0xff] << 24);
        int i2 = i + 1;
        i = ai[i][3] ^ k2;
        C0 = S[k & 0xff] & 0xff ^ (S[i1 >> 8 & 0xff] & 0xff) << 8 ^ (S[k1 >> 16 & 0xff] & 0xff) << 16 ^ S[i >> 24 & 0xff] << 24 ^ ai[i2][0];
        k2 = S[i1 & 0xff];
        byte byte0 = S[k1 >> 8 & 0xff];
        byte byte1 = S[i >> 16 & 0xff];
        byte byte2 = S[k >> 24 & 0xff];
        C1 = ai[i2][1] ^ (k2 & 0xff ^ (byte0 & 0xff) << 8 ^ (byte1 & 0xff) << 16 ^ byte2 << 24);
        C2 = S[k1 & 0xff] & 0xff ^ (S[i >> 8 & 0xff] & 0xff) << 8 ^ (S[k >> 16 & 0xff] & 0xff) << 16 ^ S[i1 >> 24 & 0xff] << 24 ^ ai[i2][2];
        C3 = S[i & 0xff] & 0xff ^ (S[k >> 8 & 0xff] & 0xff) << 8 ^ (S[i1 >> 16 & 0xff] & 0xff) << 16 ^ S[k1 >> 24 & 0xff] << 24 ^ ai[i2][3];
    }

    private int[][] generateWorkingKey(byte abyte0[], boolean flag)
    {
        int k1 = abyte0.length / 4;
        if (k1 != 4 && k1 != 6 && k1 != 8 || k1 * 4 != abyte0.length)
        {
            throw new IllegalArgumentException("Key length not 128/192/256 bits.");
        }
        ROUNDS = k1 + 6;
        int i = ROUNDS;
        int ai[][] = (int[][])Array.newInstance(Integer.TYPE, new int[] {
            i + 1, 4
        });
        int i1 = 0;
        for (int j = 0; i1 < abyte0.length; j++)
        {
            ai[j >> 2][j & 3] = abyte0[i1] & 0xff | (abyte0[i1 + 1] & 0xff) << 8 | (abyte0[i1 + 2] & 0xff) << 16 | abyte0[i1 + 3] << 24;
            i1 += 4;
        }

        int i2 = ROUNDS;
        i1 = k1;
        while (i1 < i2 + 1 << 2) 
        {
            int l1 = ai[i1 - 1 >> 2][i1 - 1 & 3];
            int k;
            if (i1 % k1 == 0)
            {
                k = subWord(shift(l1, 8)) ^ rcon[i1 / k1 - 1];
            } else
            {
                k = l1;
                if (k1 > 6)
                {
                    k = l1;
                    if (i1 % k1 == 4)
                    {
                        k = subWord(l1);
                    }
                }
            }
            ai[i1 >> 2][i1 & 3] = k ^ ai[i1 - k1 >> 2][i1 - k1 & 3];
            i1++;
        }
        if (!flag)
        {
            for (int l = 1; l < ROUNDS; l++)
            {
                for (int j1 = 0; j1 < 4; j1++)
                {
                    ai[l][j1] = inv_mcol(ai[l][j1]);
                }

            }

        }
        return ai;
    }

    private int inv_mcol(int i)
    {
        int j = FFmulX(i);
        int k = FFmulX(j);
        int l = FFmulX(k);
        i ^= l;
        return shift(j ^ i, 8) ^ (l ^ (j ^ k)) ^ shift(k ^ i, 16) ^ shift(i, 24);
    }

    private int mcol(int i)
    {
        int j = FFmulX(i);
        return j ^ shift(i ^ j, 8) ^ shift(i, 16) ^ shift(i, 24);
    }

    private void packBlock(byte abyte0[], int i)
    {
        int j = i + 1;
        abyte0[i] = (byte)C0;
        i = j + 1;
        abyte0[j] = (byte)(C0 >> 8);
        j = i + 1;
        abyte0[i] = (byte)(C0 >> 16);
        i = j + 1;
        abyte0[j] = (byte)(C0 >> 24);
        j = i + 1;
        abyte0[i] = (byte)C1;
        i = j + 1;
        abyte0[j] = (byte)(C1 >> 8);
        j = i + 1;
        abyte0[i] = (byte)(C1 >> 16);
        i = j + 1;
        abyte0[j] = (byte)(C1 >> 24);
        j = i + 1;
        abyte0[i] = (byte)C2;
        i = j + 1;
        abyte0[j] = (byte)(C2 >> 8);
        j = i + 1;
        abyte0[i] = (byte)(C2 >> 16);
        i = j + 1;
        abyte0[j] = (byte)(C2 >> 24);
        j = i + 1;
        abyte0[i] = (byte)C3;
        i = j + 1;
        abyte0[j] = (byte)(C3 >> 8);
        j = i + 1;
        abyte0[i] = (byte)(C3 >> 16);
        abyte0[j] = (byte)(C3 >> 24);
    }

    private int shift(int i, int j)
    {
        return i >>> j | i << -j;
    }

    private int subWord(int i)
    {
        return S[i & 0xff] & 0xff | (S[i >> 8 & 0xff] & 0xff) << 8 | (S[i >> 16 & 0xff] & 0xff) << 16 | S[i >> 24 & 0xff] << 24;
    }

    private void unpackBlock(byte abyte0[], int i)
    {
        int j = i + 1;
        C0 = abyte0[i] & 0xff;
        int k = C0;
        i = j + 1;
        C0 = (abyte0[j] & 0xff) << 8 | k;
        k = C0;
        j = i + 1;
        C0 = k | (abyte0[i] & 0xff) << 16;
        k = C0;
        i = j + 1;
        C0 = k | abyte0[j] << 24;
        j = i + 1;
        C1 = abyte0[i] & 0xff;
        k = C1;
        i = j + 1;
        C1 = (abyte0[j] & 0xff) << 8 | k;
        k = C1;
        j = i + 1;
        C1 = k | (abyte0[i] & 0xff) << 16;
        k = C1;
        i = j + 1;
        C1 = k | abyte0[j] << 24;
        j = i + 1;
        C2 = abyte0[i] & 0xff;
        k = C2;
        i = j + 1;
        C2 = (abyte0[j] & 0xff) << 8 | k;
        k = C2;
        j = i + 1;
        C2 = k | (abyte0[i] & 0xff) << 16;
        k = C2;
        i = j + 1;
        C2 = k | abyte0[j] << 24;
        j = i + 1;
        C3 = abyte0[i] & 0xff;
        k = C3;
        i = j + 1;
        C3 = (abyte0[j] & 0xff) << 8 | k;
        j = C3;
        k = i + 1;
        C3 = j | (abyte0[i] & 0xff) << 16;
        C3 = C3 | abyte0[k] << 24;
    }

    public String getAlgorithmName()
    {
        return "AES";
    }

    public int getBlockSize()
    {
        return 16;
    }

    public void init(boolean flag, CipherParameters cipherparameters)
    {
        if (cipherparameters instanceof KeyParameter)
        {
            WorkingKey = generateWorkingKey(((KeyParameter)cipherparameters).getKey(), flag);
            forEncryption = flag;
            return;
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append("invalid parameter passed to AES init - ").append(cipherparameters.getClass().getName()).toString());
        }
    }

    public int processBlock(byte abyte0[], int i, byte abyte1[], int j)
    {
        if (WorkingKey == null)
        {
            throw new IllegalStateException("AES engine not initialised");
        }
        if (i + 16 > abyte0.length)
        {
            throw new DataLengthException("input buffer too short");
        }
        if (j + 16 > abyte1.length)
        {
            throw new DataLengthException("output buffer too short");
        }
        if (forEncryption)
        {
            unpackBlock(abyte0, i);
            encryptBlock(WorkingKey);
            packBlock(abyte1, j);
        } else
        {
            unpackBlock(abyte0, i);
            decryptBlock(WorkingKey);
            packBlock(abyte1, j);
        }
        return 16;
    }

    public void reset()
    {
    }

}
