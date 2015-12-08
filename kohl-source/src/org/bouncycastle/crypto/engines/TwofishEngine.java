// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.engines;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.params.KeyParameter;

public final class TwofishEngine
    implements BlockCipher
{

    private static final int BLOCK_SIZE = 16;
    private static final int GF256_FDBK = 361;
    private static final int GF256_FDBK_2 = 180;
    private static final int GF256_FDBK_4 = 90;
    private static final int INPUT_WHITEN = 0;
    private static final int MAX_KEY_BITS = 256;
    private static final int MAX_ROUNDS = 16;
    private static final int OUTPUT_WHITEN = 4;
    private static final byte P[][] = {
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
    private static final int P_00 = 1;
    private static final int P_01 = 0;
    private static final int P_02 = 0;
    private static final int P_03 = 1;
    private static final int P_04 = 1;
    private static final int P_10 = 0;
    private static final int P_11 = 0;
    private static final int P_12 = 1;
    private static final int P_13 = 1;
    private static final int P_14 = 0;
    private static final int P_20 = 1;
    private static final int P_21 = 1;
    private static final int P_22 = 0;
    private static final int P_23 = 0;
    private static final int P_24 = 0;
    private static final int P_30 = 0;
    private static final int P_31 = 1;
    private static final int P_32 = 1;
    private static final int P_33 = 0;
    private static final int P_34 = 1;
    private static final int ROUNDS = 16;
    private static final int ROUND_SUBKEYS = 8;
    private static final int RS_GF_FDBK = 333;
    private static final int SK_BUMP = 0x1010101;
    private static final int SK_ROTL = 9;
    private static final int SK_STEP = 0x2020202;
    private static final int TOTAL_SUBKEYS = 40;
    private boolean encrypting;
    private int gMDS0[];
    private int gMDS1[];
    private int gMDS2[];
    private int gMDS3[];
    private int gSBox[];
    private int gSubKeys[];
    private int k64Cnt;
    private byte workingKey[];

    public TwofishEngine()
    {
        encrypting = false;
        gMDS0 = new int[256];
        gMDS1 = new int[256];
        gMDS2 = new int[256];
        gMDS3 = new int[256];
        k64Cnt = 0;
        workingKey = null;
        int ai[] = new int[2];
        int ai1[] = new int[2];
        int ai2[] = new int[2];
        for (int i = 0; i < 256; i++)
        {
            int j = P[0][i] & 0xff;
            ai[0] = j;
            ai1[0] = Mx_X(j) & 0xff;
            ai2[0] = Mx_Y(j) & 0xff;
            j = P[1][i] & 0xff;
            ai[1] = j;
            ai1[1] = Mx_X(j) & 0xff;
            ai2[1] = Mx_Y(j) & 0xff;
            gMDS0[i] = ai[1] | ai1[1] << 8 | ai2[1] << 16 | ai2[1] << 24;
            gMDS1[i] = ai2[0] | ai2[0] << 8 | ai1[0] << 16 | ai[0] << 24;
            gMDS2[i] = ai1[1] | ai2[1] << 8 | ai[1] << 16 | ai2[1] << 24;
            gMDS3[i] = ai1[0] | ai[0] << 8 | ai2[0] << 16 | ai1[0] << 24;
        }

    }

    private void Bits32ToBytes(int i, byte abyte0[], int j)
    {
        abyte0[j] = (byte)i;
        abyte0[j + 1] = (byte)(i >> 8);
        abyte0[j + 2] = (byte)(i >> 16);
        abyte0[j + 3] = (byte)(i >> 24);
    }

    private int BytesTo32Bits(byte abyte0[], int i)
    {
        return abyte0[i] & 0xff | (abyte0[i + 1] & 0xff) << 8 | (abyte0[i + 2] & 0xff) << 16 | (abyte0[i + 3] & 0xff) << 24;
    }

    private int F32(int i, int ai[])
    {
        int j3 = b0(i);
        int l = b1(i);
        int j = b2(i);
        i = b3(i);
        int k3 = ai[0];
        int l3 = ai[1];
        int i4 = ai[2];
        int j4 = ai[3];
        int j1 = i;
        int k1 = j;
        int l1 = l;
        int i2 = j3;
        int j2 = i;
        int k2 = j;
        int l2 = l;
        int i3 = j3;
        switch (k64Cnt & 3)
        {
        default:
            return 0;

        case 1: // '\001'
            j1 = gMDS0[P[0][j3] & 0xff ^ b0(k3)];
            l = gMDS1[P[0][l] & 0xff ^ b1(k3)];
            j = gMDS2[P[1][j] & 0xff ^ b2(k3)];
            return gMDS3[P[1][i] & 0xff ^ b3(k3)] ^ (j ^ (l ^ j1));

        case 0: // '\0'
            i2 = P[1][j3] & 0xff ^ b0(j4);
            l1 = P[0][l] & 0xff ^ b1(j4);
            k1 = P[0][j] & 0xff ^ b2(j4);
            j1 = P[1][i] & 0xff ^ b3(j4);
            // fall through

        case 3: // '\003'
            i3 = P[1][i2] & 0xff ^ b0(i4);
            l2 = P[1][l1] & 0xff ^ b1(i4);
            k2 = P[0][k1] & 0xff ^ b2(i4);
            j2 = P[0][j1] & 0xff ^ b3(i4);
            // fall through

        case 2: // '\002'
            i = gMDS0[P[0][P[0][i3] & 0xff ^ b0(l3)] & 0xff ^ b0(k3)];
            int k = gMDS1[P[0][P[1][l2] & 0xff ^ b1(l3)] & 0xff ^ b1(k3)];
            int i1 = gMDS2[P[1][P[0][k2] & 0xff ^ b2(l3)] & 0xff ^ b2(k3)];
            return gMDS3[P[1][P[1][j2] & 0xff ^ b3(l3)] & 0xff ^ b3(k3)] ^ (i1 ^ (k ^ i));
        }
    }

    private int Fe32_0(int i)
    {
        return gSBox[(i & 0xff) * 2 + 0] ^ gSBox[(i >>> 8 & 0xff) * 2 + 1] ^ gSBox[(i >>> 16 & 0xff) * 2 + 512] ^ gSBox[(i >>> 24 & 0xff) * 2 + 513];
    }

    private int Fe32_3(int i)
    {
        return gSBox[(i >>> 24 & 0xff) * 2 + 0] ^ gSBox[(i & 0xff) * 2 + 1] ^ gSBox[(i >>> 8 & 0xff) * 2 + 512] ^ gSBox[(i >>> 16 & 0xff) * 2 + 513];
    }

    private int LFSR1(int i)
    {
        char c;
        if ((i & 1) != 0)
        {
            c = '\264';
        } else
        {
            c = '\0';
        }
        return c ^ i >> 1;
    }

    private int LFSR2(int i)
    {
        byte byte0 = 0;
        char c;
        if ((i & 2) != 0)
        {
            c = '\264';
        } else
        {
            c = '\0';
        }
        if ((i & 1) != 0)
        {
            byte0 = 90;
        }
        return byte0 ^ (c ^ i >> 2);
    }

    private int Mx_X(int i)
    {
        return LFSR2(i) ^ i;
    }

    private int Mx_Y(int i)
    {
        return LFSR1(i) ^ i ^ LFSR2(i);
    }

    private int RS_MDS_Encode(int i, int j)
    {
        boolean flag = false;
        boolean flag1 = false;
        int k = j;
        for (j = ((flag1) ? 1 : 0); j < 4; j++)
        {
            k = RS_rem(k);
        }

        j = k ^ i;
        for (i = ((flag) ? 1 : 0); i < 4; i++)
        {
            j = RS_rem(j);
        }

        return j;
    }

    private int RS_rem(int i)
    {
        boolean flag = false;
        int k = i >>> 24 & 0xff;
        int j;
        int l;
        if ((k & 0x80) != 0)
        {
            j = 333;
        } else
        {
            j = 0;
        }
        l = (j ^ k << 1) & 0xff;
        j = ((flag) ? 1 : 0);
        if ((k & 1) != 0)
        {
            j = 166;
        }
        j = j ^ k >>> 1 ^ l;
        return j << 8 ^ (l << 16 ^ (i << 8 ^ j << 24)) ^ k;
    }

    private int b0(int i)
    {
        return i & 0xff;
    }

    private int b1(int i)
    {
        return i >>> 8 & 0xff;
    }

    private int b2(int i)
    {
        return i >>> 16 & 0xff;
    }

    private int b3(int i)
    {
        return i >>> 24 & 0xff;
    }

    private void decryptBlock(byte abyte0[], int i, byte abyte1[], int j)
    {
        int l1 = BytesTo32Bits(abyte0, i) ^ gSubKeys[4];
        int k = BytesTo32Bits(abyte0, i + 4) ^ gSubKeys[5];
        int i1 = BytesTo32Bits(abyte0, i + 8) ^ gSubKeys[6];
        int k1 = BytesTo32Bits(abyte0, i + 12) ^ gSubKeys[7];
        int j1 = 39;
        int l = 0;
        i = l1;
        for (; l < 16; l += 2)
        {
            int i2 = Fe32_0(i);
            int j2 = Fe32_3(k);
            abyte0 = gSubKeys;
            int k2 = j1 - 1;
            k1 = abyte0[j1] + (j2 * 2 + i2) ^ k1;
            abyte0 = gSubKeys;
            j1 = k2 - 1;
            i1 = i2 + j2 + abyte0[k2] ^ (i1 << 1 | i1 >>> 31);
            k1 = k1 >>> 1 | k1 << 31;
            i2 = Fe32_0(i1);
            j2 = Fe32_3(k1);
            abyte0 = gSubKeys;
            k2 = j1 - 1;
            k ^= abyte0[j1] + (j2 * 2 + i2);
            abyte0 = gSubKeys;
            j1 = k2 - 1;
            i = (i >>> 31 | i << 1) ^ j2 + i2 + abyte0[k2];
            k = k << 31 | k >>> 1;
        }

        Bits32ToBytes(gSubKeys[0] ^ i1, abyte1, j);
        Bits32ToBytes(gSubKeys[1] ^ k1, abyte1, j + 4);
        Bits32ToBytes(gSubKeys[2] ^ i, abyte1, j + 8);
        Bits32ToBytes(gSubKeys[3] ^ k, abyte1, j + 12);
    }

    private void encryptBlock(byte abyte0[], int i, byte abyte1[], int j)
    {
        int l = 0;
        int k = BytesTo32Bits(abyte0, i) ^ gSubKeys[0];
        int i1 = BytesTo32Bits(abyte0, i + 4) ^ gSubKeys[1];
        int k1 = BytesTo32Bits(abyte0, i + 8) ^ gSubKeys[2];
        i = BytesTo32Bits(abyte0, i + 12);
        int l1 = gSubKeys[3] ^ i;
        int j1 = 8;
        i = i1;
        i1 = l1;
        for (; l < 16; l += 2)
        {
            int i2 = Fe32_0(k);
            int j2 = Fe32_3(i);
            abyte0 = gSubKeys;
            int k2 = j1 + 1;
            j1 = abyte0[j1] + (i2 + j2) ^ k1;
            k1 = j1 >>> 1 | j1 << 31;
            abyte0 = gSubKeys;
            j1 = k2 + 1;
            i1 = j2 * 2 + i2 + abyte0[k2] ^ (i1 << 1 | i1 >>> 31);
            i2 = Fe32_0(k1);
            j2 = Fe32_3(i1);
            abyte0 = gSubKeys;
            k2 = j1 + 1;
            k ^= abyte0[j1] + (i2 + j2);
            k = k << 31 | k >>> 1;
            abyte0 = gSubKeys;
            j1 = k2 + 1;
            i = (i >>> 31 | i << 1) ^ j2 * 2 + i2 + abyte0[k2];
        }

        Bits32ToBytes(gSubKeys[4] ^ k1, abyte1, j);
        Bits32ToBytes(gSubKeys[5] ^ i1, abyte1, j + 4);
        Bits32ToBytes(gSubKeys[6] ^ k, abyte1, j + 8);
        Bits32ToBytes(gSubKeys[7] ^ i, abyte1, j + 12);
    }

    private void setKey(byte abyte0[])
    {
        int k;
        int k2;
        int l2;
        int i3;
        int j3;
        int ai[] = new int[4];
        int ai1[] = new int[4];
        int ai2[] = new int[4];
        gSubKeys = new int[40];
        if (k64Cnt < 1)
        {
            throw new IllegalArgumentException("Key size less than 64 bits");
        }
        if (k64Cnt > 4)
        {
            throw new IllegalArgumentException("Key size larger than 256 bits");
        }
        for (int i = 0; i < k64Cnt; i++)
        {
            int l = i * 8;
            ai[i] = BytesTo32Bits(abyte0, l);
            ai1[i] = BytesTo32Bits(abyte0, l + 4);
            ai2[k64Cnt - 1 - i] = RS_MDS_Encode(ai[i], ai1[i]);
        }

        for (int j = 0; j < 20; j++)
        {
            int k1 = 0x2020202 * j;
            int i1 = F32(k1, ai);
            k1 = F32(k1 + 0x1010101, ai1);
            k1 = k1 >>> 24 | k1 << 8;
            i1 += k1;
            gSubKeys[j * 2] = i1;
            i1 = k1 + i1;
            gSubKeys[j * 2 + 1] = i1 >>> 23 | i1 << 9;
        }

        k2 = ai2[0];
        l2 = ai2[1];
        i3 = ai2[2];
        j3 = ai2[3];
        gSBox = new int[1024];
        k = 0;
_L8:
        if (k >= 256) goto _L2; else goto _L1
_L1:
        k64Cnt & 3;
        JVM INSTR tableswitch 0 3: default 324
    //                   0 478
    //                   1 333
    //                   2 883
    //                   3 864;
           goto _L3 _L4 _L5 _L6 _L7
_L3:
        k++;
          goto _L8
_L5:
        gSBox[k * 2] = gMDS0[P[0][k] & 0xff ^ b0(k2)];
        gSBox[k * 2 + 1] = gMDS1[P[0][k] & 0xff ^ b1(k2)];
        gSBox[k * 2 + 512] = gMDS2[P[1][k] & 0xff ^ b2(k2)];
        gSBox[k * 2 + 513] = gMDS3[P[1][k] & 0xff ^ b3(k2)];
          goto _L3
_L4:
        int j1;
        int l1;
        int i2;
        int j2;
        j2 = P[1][k] & 0xff ^ b0(j3);
        i2 = P[0][k] & 0xff ^ b1(j3);
        j1 = P[0][k];
        l1 = b2(j3) ^ j1 & 0xff;
        j1 = P[1][k] & 0xff ^ b3(j3);
_L9:
        j2 = P[1][j2] & 0xff ^ b0(i3);
        i2 = P[1][i2] & 0xff ^ b1(i3);
        l1 = P[0][l1] & 0xff ^ b2(i3);
        j1 = P[0][j1] & 0xff ^ b3(i3);
_L10:
        gSBox[k * 2] = gMDS0[P[0][P[0][j2] & 0xff ^ b0(l2)] & 0xff ^ b0(k2)];
        gSBox[k * 2 + 1] = gMDS1[P[0][P[1][i2] & 0xff ^ b1(l2)] & 0xff ^ b1(k2)];
        gSBox[k * 2 + 512] = gMDS2[P[1][P[0][l1] & 0xff ^ b2(l2)] & 0xff ^ b2(k2)];
        gSBox[k * 2 + 513] = gMDS3[P[1][P[1][j1] & 0xff ^ b3(l2)] & 0xff ^ b3(k2)];
          goto _L3
_L2:
        return;
_L7:
        j1 = k;
        l1 = k;
        i2 = k;
        j2 = k;
          goto _L9
_L6:
        j1 = k;
        l1 = k;
        i2 = k;
        j2 = k;
          goto _L10
    }

    public String getAlgorithmName()
    {
        return "Twofish";
    }

    public int getBlockSize()
    {
        return 16;
    }

    public void init(boolean flag, CipherParameters cipherparameters)
    {
        if (cipherparameters instanceof KeyParameter)
        {
            encrypting = flag;
            workingKey = ((KeyParameter)cipherparameters).getKey();
            k64Cnt = workingKey.length / 8;
            setKey(workingKey);
            return;
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append("invalid parameter passed to Twofish init - ").append(cipherparameters.getClass().getName()).toString());
        }
    }

    public int processBlock(byte abyte0[], int i, byte abyte1[], int j)
    {
        if (workingKey == null)
        {
            throw new IllegalStateException("Twofish not initialised");
        }
        if (i + 16 > abyte0.length)
        {
            throw new DataLengthException("input buffer too short");
        }
        if (j + 16 > abyte1.length)
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
        return 16;
    }

    public void reset()
    {
        if (workingKey != null)
        {
            setKey(workingKey);
        }
    }

}
