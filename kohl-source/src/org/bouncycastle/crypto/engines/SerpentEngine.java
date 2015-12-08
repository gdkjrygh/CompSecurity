// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.bouncycastle.crypto.engines;

import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.params.KeyParameter;

public class SerpentEngine
    implements BlockCipher
{

    private static final int BLOCK_SIZE = 16;
    static final int PHI = 0x9e3779b9;
    static final int ROUNDS = 32;
    private int X0;
    private int X1;
    private int X2;
    private int X3;
    private boolean encrypting;
    private int wKey[];

    public SerpentEngine()
    {
    }

    private void LT()
    {
        int i = rotateLeft(X0, 13);
        int j = rotateLeft(X2, 3);
        int k = X1;
        int l = X3;
        X1 = rotateLeft(k ^ i ^ j, 1);
        X3 = rotateLeft(l ^ j ^ i << 3, 7);
        X0 = rotateLeft(i ^ X1 ^ X3, 5);
        X2 = rotateLeft(X3 ^ j ^ X1 << 7, 22);
    }

    private int bytesToWord(byte abyte0[], int i)
    {
        return (abyte0[i] & 0xff) << 24 | (abyte0[i + 1] & 0xff) << 16 | (abyte0[i + 2] & 0xff) << 8 | abyte0[i + 3] & 0xff;
    }

    private void decryptBlock(byte abyte0[], int i, byte abyte1[], int j)
    {
        X3 = wKey[131] ^ bytesToWord(abyte0, i);
        X2 = wKey[130] ^ bytesToWord(abyte0, i + 4);
        X1 = wKey[129] ^ bytesToWord(abyte0, i + 8);
        X0 = wKey[128] ^ bytesToWord(abyte0, i + 12);
        ib7(X0, X1, X2, X3);
        X0 = X0 ^ wKey[124];
        X1 = X1 ^ wKey[125];
        X2 = X2 ^ wKey[126];
        X3 = X3 ^ wKey[127];
        inverseLT();
        ib6(X0, X1, X2, X3);
        X0 = X0 ^ wKey[120];
        X1 = X1 ^ wKey[121];
        X2 = X2 ^ wKey[122];
        X3 = X3 ^ wKey[123];
        inverseLT();
        ib5(X0, X1, X2, X3);
        X0 = X0 ^ wKey[116];
        X1 = X1 ^ wKey[117];
        X2 = X2 ^ wKey[118];
        X3 = X3 ^ wKey[119];
        inverseLT();
        ib4(X0, X1, X2, X3);
        X0 = X0 ^ wKey[112];
        X1 = X1 ^ wKey[113];
        X2 = X2 ^ wKey[114];
        X3 = X3 ^ wKey[115];
        inverseLT();
        ib3(X0, X1, X2, X3);
        X0 = X0 ^ wKey[108];
        X1 = X1 ^ wKey[109];
        X2 = X2 ^ wKey[110];
        X3 = X3 ^ wKey[111];
        inverseLT();
        ib2(X0, X1, X2, X3);
        X0 = X0 ^ wKey[104];
        X1 = X1 ^ wKey[105];
        X2 = X2 ^ wKey[106];
        X3 = X3 ^ wKey[107];
        inverseLT();
        ib1(X0, X1, X2, X3);
        X0 = X0 ^ wKey[100];
        X1 = X1 ^ wKey[101];
        X2 = X2 ^ wKey[102];
        X3 = X3 ^ wKey[103];
        inverseLT();
        ib0(X0, X1, X2, X3);
        X0 = X0 ^ wKey[96];
        X1 = X1 ^ wKey[97];
        X2 = X2 ^ wKey[98];
        X3 = X3 ^ wKey[99];
        inverseLT();
        ib7(X0, X1, X2, X3);
        X0 = X0 ^ wKey[92];
        X1 = X1 ^ wKey[93];
        X2 = X2 ^ wKey[94];
        X3 = X3 ^ wKey[95];
        inverseLT();
        ib6(X0, X1, X2, X3);
        X0 = X0 ^ wKey[88];
        X1 = X1 ^ wKey[89];
        X2 = X2 ^ wKey[90];
        X3 = X3 ^ wKey[91];
        inverseLT();
        ib5(X0, X1, X2, X3);
        X0 = X0 ^ wKey[84];
        X1 = X1 ^ wKey[85];
        X2 = X2 ^ wKey[86];
        X3 = X3 ^ wKey[87];
        inverseLT();
        ib4(X0, X1, X2, X3);
        X0 = X0 ^ wKey[80];
        X1 = X1 ^ wKey[81];
        X2 = X2 ^ wKey[82];
        X3 = X3 ^ wKey[83];
        inverseLT();
        ib3(X0, X1, X2, X3);
        X0 = X0 ^ wKey[76];
        X1 = X1 ^ wKey[77];
        X2 = X2 ^ wKey[78];
        X3 = X3 ^ wKey[79];
        inverseLT();
        ib2(X0, X1, X2, X3);
        X0 = X0 ^ wKey[72];
        X1 = X1 ^ wKey[73];
        X2 = X2 ^ wKey[74];
        X3 = X3 ^ wKey[75];
        inverseLT();
        ib1(X0, X1, X2, X3);
        X0 = X0 ^ wKey[68];
        X1 = X1 ^ wKey[69];
        X2 = X2 ^ wKey[70];
        X3 = X3 ^ wKey[71];
        inverseLT();
        ib0(X0, X1, X2, X3);
        X0 = X0 ^ wKey[64];
        X1 = X1 ^ wKey[65];
        X2 = X2 ^ wKey[66];
        X3 = X3 ^ wKey[67];
        inverseLT();
        ib7(X0, X1, X2, X3);
        X0 = X0 ^ wKey[60];
        X1 = X1 ^ wKey[61];
        X2 = X2 ^ wKey[62];
        X3 = X3 ^ wKey[63];
        inverseLT();
        ib6(X0, X1, X2, X3);
        X0 = X0 ^ wKey[56];
        X1 = X1 ^ wKey[57];
        X2 = X2 ^ wKey[58];
        X3 = X3 ^ wKey[59];
        inverseLT();
        ib5(X0, X1, X2, X3);
        X0 = X0 ^ wKey[52];
        X1 = X1 ^ wKey[53];
        X2 = X2 ^ wKey[54];
        X3 = X3 ^ wKey[55];
        inverseLT();
        ib4(X0, X1, X2, X3);
        X0 = X0 ^ wKey[48];
        X1 = X1 ^ wKey[49];
        X2 = X2 ^ wKey[50];
        X3 = X3 ^ wKey[51];
        inverseLT();
        ib3(X0, X1, X2, X3);
        X0 = X0 ^ wKey[44];
        X1 = X1 ^ wKey[45];
        X2 = X2 ^ wKey[46];
        X3 = X3 ^ wKey[47];
        inverseLT();
        ib2(X0, X1, X2, X3);
        X0 = X0 ^ wKey[40];
        X1 = X1 ^ wKey[41];
        X2 = X2 ^ wKey[42];
        X3 = X3 ^ wKey[43];
        inverseLT();
        ib1(X0, X1, X2, X3);
        X0 = X0 ^ wKey[36];
        X1 = X1 ^ wKey[37];
        X2 = X2 ^ wKey[38];
        X3 = X3 ^ wKey[39];
        inverseLT();
        ib0(X0, X1, X2, X3);
        X0 = X0 ^ wKey[32];
        X1 = X1 ^ wKey[33];
        X2 = X2 ^ wKey[34];
        X3 = X3 ^ wKey[35];
        inverseLT();
        ib7(X0, X1, X2, X3);
        X0 = X0 ^ wKey[28];
        X1 = X1 ^ wKey[29];
        X2 = X2 ^ wKey[30];
        X3 = X3 ^ wKey[31];
        inverseLT();
        ib6(X0, X1, X2, X3);
        X0 = X0 ^ wKey[24];
        X1 = X1 ^ wKey[25];
        X2 = X2 ^ wKey[26];
        X3 = X3 ^ wKey[27];
        inverseLT();
        ib5(X0, X1, X2, X3);
        X0 = X0 ^ wKey[20];
        X1 = X1 ^ wKey[21];
        X2 = X2 ^ wKey[22];
        X3 = X3 ^ wKey[23];
        inverseLT();
        ib4(X0, X1, X2, X3);
        X0 = X0 ^ wKey[16];
        X1 = X1 ^ wKey[17];
        X2 = X2 ^ wKey[18];
        X3 = X3 ^ wKey[19];
        inverseLT();
        ib3(X0, X1, X2, X3);
        X0 = X0 ^ wKey[12];
        X1 = X1 ^ wKey[13];
        X2 = X2 ^ wKey[14];
        X3 = X3 ^ wKey[15];
        inverseLT();
        ib2(X0, X1, X2, X3);
        X0 = X0 ^ wKey[8];
        X1 = X1 ^ wKey[9];
        X2 = X2 ^ wKey[10];
        X3 = X3 ^ wKey[11];
        inverseLT();
        ib1(X0, X1, X2, X3);
        X0 = X0 ^ wKey[4];
        X1 = X1 ^ wKey[5];
        X2 = X2 ^ wKey[6];
        X3 = X3 ^ wKey[7];
        inverseLT();
        ib0(X0, X1, X2, X3);
        wordToBytes(X3 ^ wKey[3], abyte1, j);
        wordToBytes(X2 ^ wKey[2], abyte1, j + 4);
        wordToBytes(X1 ^ wKey[1], abyte1, j + 8);
        wordToBytes(X0 ^ wKey[0], abyte1, j + 12);
    }

    private void encryptBlock(byte abyte0[], int i, byte abyte1[], int j)
    {
        X3 = bytesToWord(abyte0, i);
        X2 = bytesToWord(abyte0, i + 4);
        X1 = bytesToWord(abyte0, i + 8);
        X0 = bytesToWord(abyte0, i + 12);
        sb0(wKey[0] ^ X0, wKey[1] ^ X1, wKey[2] ^ X2, wKey[3] ^ X3);
        LT();
        sb1(wKey[4] ^ X0, wKey[5] ^ X1, wKey[6] ^ X2, wKey[7] ^ X3);
        LT();
        sb2(wKey[8] ^ X0, wKey[9] ^ X1, wKey[10] ^ X2, wKey[11] ^ X3);
        LT();
        sb3(wKey[12] ^ X0, wKey[13] ^ X1, wKey[14] ^ X2, wKey[15] ^ X3);
        LT();
        sb4(wKey[16] ^ X0, wKey[17] ^ X1, wKey[18] ^ X2, wKey[19] ^ X3);
        LT();
        sb5(wKey[20] ^ X0, wKey[21] ^ X1, wKey[22] ^ X2, wKey[23] ^ X3);
        LT();
        sb6(wKey[24] ^ X0, wKey[25] ^ X1, wKey[26] ^ X2, wKey[27] ^ X3);
        LT();
        sb7(wKey[28] ^ X0, wKey[29] ^ X1, wKey[30] ^ X2, wKey[31] ^ X3);
        LT();
        sb0(wKey[32] ^ X0, wKey[33] ^ X1, wKey[34] ^ X2, wKey[35] ^ X3);
        LT();
        sb1(wKey[36] ^ X0, wKey[37] ^ X1, wKey[38] ^ X2, wKey[39] ^ X3);
        LT();
        sb2(wKey[40] ^ X0, wKey[41] ^ X1, wKey[42] ^ X2, wKey[43] ^ X3);
        LT();
        sb3(wKey[44] ^ X0, wKey[45] ^ X1, wKey[46] ^ X2, wKey[47] ^ X3);
        LT();
        sb4(wKey[48] ^ X0, wKey[49] ^ X1, wKey[50] ^ X2, wKey[51] ^ X3);
        LT();
        sb5(wKey[52] ^ X0, wKey[53] ^ X1, wKey[54] ^ X2, wKey[55] ^ X3);
        LT();
        sb6(wKey[56] ^ X0, wKey[57] ^ X1, wKey[58] ^ X2, wKey[59] ^ X3);
        LT();
        sb7(wKey[60] ^ X0, wKey[61] ^ X1, wKey[62] ^ X2, wKey[63] ^ X3);
        LT();
        sb0(wKey[64] ^ X0, wKey[65] ^ X1, wKey[66] ^ X2, wKey[67] ^ X3);
        LT();
        sb1(wKey[68] ^ X0, wKey[69] ^ X1, wKey[70] ^ X2, wKey[71] ^ X3);
        LT();
        sb2(wKey[72] ^ X0, wKey[73] ^ X1, wKey[74] ^ X2, wKey[75] ^ X3);
        LT();
        sb3(wKey[76] ^ X0, wKey[77] ^ X1, wKey[78] ^ X2, wKey[79] ^ X3);
        LT();
        sb4(wKey[80] ^ X0, wKey[81] ^ X1, wKey[82] ^ X2, wKey[83] ^ X3);
        LT();
        sb5(wKey[84] ^ X0, wKey[85] ^ X1, wKey[86] ^ X2, wKey[87] ^ X3);
        LT();
        sb6(wKey[88] ^ X0, wKey[89] ^ X1, wKey[90] ^ X2, wKey[91] ^ X3);
        LT();
        sb7(wKey[92] ^ X0, wKey[93] ^ X1, wKey[94] ^ X2, wKey[95] ^ X3);
        LT();
        sb0(wKey[96] ^ X0, wKey[97] ^ X1, wKey[98] ^ X2, wKey[99] ^ X3);
        LT();
        sb1(wKey[100] ^ X0, wKey[101] ^ X1, wKey[102] ^ X2, wKey[103] ^ X3);
        LT();
        sb2(wKey[104] ^ X0, wKey[105] ^ X1, wKey[106] ^ X2, wKey[107] ^ X3);
        LT();
        sb3(wKey[108] ^ X0, wKey[109] ^ X1, wKey[110] ^ X2, wKey[111] ^ X3);
        LT();
        sb4(wKey[112] ^ X0, wKey[113] ^ X1, wKey[114] ^ X2, wKey[115] ^ X3);
        LT();
        sb5(wKey[116] ^ X0, wKey[117] ^ X1, wKey[118] ^ X2, wKey[119] ^ X3);
        LT();
        sb6(wKey[120] ^ X0, wKey[121] ^ X1, wKey[122] ^ X2, wKey[123] ^ X3);
        LT();
        sb7(wKey[124] ^ X0, wKey[125] ^ X1, wKey[126] ^ X2, wKey[127] ^ X3);
        wordToBytes(wKey[131] ^ X3, abyte1, j);
        wordToBytes(wKey[130] ^ X2, abyte1, j + 4);
        wordToBytes(wKey[129] ^ X1, abyte1, j + 8);
        wordToBytes(wKey[128] ^ X0, abyte1, j + 12);
    }

    private void ib0(int i, int j, int k, int l)
    {
        int i1 = ~i;
        int j1 = i ^ j;
        j = (i1 | j1) ^ l;
        k ^= j;
        X2 = j1 ^ k;
        l = i1 ^ j1 & l;
        X1 = X2 & l ^ j;
        X3 = i & j ^ (X1 | k);
        X0 = l ^ k ^ X3;
    }

    private void ib1(int i, int j, int k, int l)
    {
        l = j ^ l;
        int i1 = j & l ^ i;
        i = l ^ i1;
        X3 = k ^ i;
        j = l & i1 ^ j;
        X1 = i1 ^ (X3 | j);
        k = ~X1;
        j ^= X3;
        X0 = k ^ j;
        X2 = (j | k) ^ i;
    }

    private void ib2(int i, int j, int k, int l)
    {
        int j1 = j ^ l;
        int i1 = i ^ k;
        k ^= j1;
        X0 = j & k ^ i1;
        X3 = j1 ^ ((~j1 | i) ^ l | i1);
        i = ~k;
        j = X0 | X3;
        X1 = i ^ j;
        X2 = i & l ^ (j ^ i1);
    }

    private void ib3(int i, int j, int k, int l)
    {
        int j1 = j ^ k;
        int i1 = j & j1 ^ i;
        int k1 = l | i1;
        X0 = j1 ^ k1;
        l = (j1 | k1) ^ l;
        X2 = k ^ i1 ^ l;
        i = (i | j) ^ l;
        X3 = X0 & i ^ i1;
        j = X3;
        X1 = i ^ X0 ^ j;
    }

    private void ib4(int i, int j, int k, int l)
    {
        j = (k | l) & i ^ j;
        k = i & j ^ k;
        X1 = l ^ k;
        i = ~i;
        X3 = k & X1 ^ j;
        k = (X1 | i) ^ l;
        X0 = X3 ^ k;
        X2 = j & k ^ (X1 ^ i);
    }

    private void ib5(int i, int j, int k, int l)
    {
        int i1 = ~k;
        int l1 = j & i1 ^ l;
        int j1 = i & l1;
        X3 = j ^ i1 ^ j1;
        int k1 = X3 | j;
        X1 = l1 ^ i & k1;
        l = i | l;
        X0 = i1 ^ k1 ^ l;
        X2 = j & l ^ (i ^ k | j1);
    }

    private void ib6(int i, int j, int k, int l)
    {
        int i1 = ~i;
        int j1 = i ^ j;
        i = k ^ j1;
        k = (k | i1) ^ l;
        X1 = i ^ k;
        j1 ^= i & k;
        X3 = k ^ (j | j1);
        j = X3 | j;
        X0 = j1 ^ j;
        X2 = i1 & l ^ (i ^ j);
    }

    private void ib7(int i, int j, int k, int l)
    {
        int i1 = i & j | k;
        int j1 = (i | j) & l;
        X3 = i1 ^ j1;
        j = j1 ^ j;
        X1 = (~l ^ X3 | j) ^ i;
        X0 = j ^ k ^ (X1 | l);
        X2 = i1 ^ X1 ^ (X0 ^ X3 & i);
    }

    private void inverseLT()
    {
        int i = rotateRight(X2, 22) ^ X3 ^ X1 << 7;
        int j = rotateRight(X0, 5) ^ X1 ^ X3;
        int k = rotateRight(X3, 7);
        int l = rotateRight(X1, 1);
        X3 = k ^ i ^ j << 3;
        X1 = l ^ j ^ i;
        X2 = rotateRight(i, 3);
        X0 = rotateRight(j, 13);
    }

    private int[] makeWorkingKey(byte abyte0[])
        throws IllegalArgumentException
    {
        int ai[] = new int[16];
        int l = abyte0.length - 4;
        int i;
        for (i = 0; l > 0; i++)
        {
            ai[i] = bytesToWord(abyte0, l);
            l -= 4;
        }

        if (l == 0)
        {
            int i1 = i + 1;
            ai[i] = bytesToWord(abyte0, 0);
            if (i1 < 8)
            {
                ai[i1] = 1;
            }
            abyte0 = new int[132];
            for (int j = 8; j < 16; j++)
            {
                ai[j] = rotateLeft(ai[j - 8] ^ ai[j - 5] ^ ai[j - 3] ^ ai[j - 1] ^ 0x9e3779b9 ^ j - 8, 11);
            }

        } else
        {
            throw new IllegalArgumentException("key must be a multiple of 4 bytes");
        }
        System.arraycopy(ai, 8, abyte0, 0, 8);
        for (int k = 8; k < 132; k++)
        {
            abyte0[k] = rotateLeft(abyte0[k - 8] ^ abyte0[k - 5] ^ abyte0[k - 3] ^ abyte0[k - 1] ^ 0x9e3779b9 ^ k, 11);
        }

        sb3(abyte0[0], abyte0[1], abyte0[2], abyte0[3]);
        abyte0[0] = X0;
        abyte0[1] = X1;
        abyte0[2] = X2;
        abyte0[3] = X3;
        sb2(abyte0[4], abyte0[5], abyte0[6], abyte0[7]);
        abyte0[4] = X0;
        abyte0[5] = X1;
        abyte0[6] = X2;
        abyte0[7] = X3;
        sb1(abyte0[8], abyte0[9], abyte0[10], abyte0[11]);
        abyte0[8] = X0;
        abyte0[9] = X1;
        abyte0[10] = X2;
        abyte0[11] = X3;
        sb0(abyte0[12], abyte0[13], abyte0[14], abyte0[15]);
        abyte0[12] = X0;
        abyte0[13] = X1;
        abyte0[14] = X2;
        abyte0[15] = X3;
        sb7(abyte0[16], abyte0[17], abyte0[18], abyte0[19]);
        abyte0[16] = X0;
        abyte0[17] = X1;
        abyte0[18] = X2;
        abyte0[19] = X3;
        sb6(abyte0[20], abyte0[21], abyte0[22], abyte0[23]);
        abyte0[20] = X0;
        abyte0[21] = X1;
        abyte0[22] = X2;
        abyte0[23] = X3;
        sb5(abyte0[24], abyte0[25], abyte0[26], abyte0[27]);
        abyte0[24] = X0;
        abyte0[25] = X1;
        abyte0[26] = X2;
        abyte0[27] = X3;
        sb4(abyte0[28], abyte0[29], abyte0[30], abyte0[31]);
        abyte0[28] = X0;
        abyte0[29] = X1;
        abyte0[30] = X2;
        abyte0[31] = X3;
        sb3(abyte0[32], abyte0[33], abyte0[34], abyte0[35]);
        abyte0[32] = X0;
        abyte0[33] = X1;
        abyte0[34] = X2;
        abyte0[35] = X3;
        sb2(abyte0[36], abyte0[37], abyte0[38], abyte0[39]);
        abyte0[36] = X0;
        abyte0[37] = X1;
        abyte0[38] = X2;
        abyte0[39] = X3;
        sb1(abyte0[40], abyte0[41], abyte0[42], abyte0[43]);
        abyte0[40] = X0;
        abyte0[41] = X1;
        abyte0[42] = X2;
        abyte0[43] = X3;
        sb0(abyte0[44], abyte0[45], abyte0[46], abyte0[47]);
        abyte0[44] = X0;
        abyte0[45] = X1;
        abyte0[46] = X2;
        abyte0[47] = X3;
        sb7(abyte0[48], abyte0[49], abyte0[50], abyte0[51]);
        abyte0[48] = X0;
        abyte0[49] = X1;
        abyte0[50] = X2;
        abyte0[51] = X3;
        sb6(abyte0[52], abyte0[53], abyte0[54], abyte0[55]);
        abyte0[52] = X0;
        abyte0[53] = X1;
        abyte0[54] = X2;
        abyte0[55] = X3;
        sb5(abyte0[56], abyte0[57], abyte0[58], abyte0[59]);
        abyte0[56] = X0;
        abyte0[57] = X1;
        abyte0[58] = X2;
        abyte0[59] = X3;
        sb4(abyte0[60], abyte0[61], abyte0[62], abyte0[63]);
        abyte0[60] = X0;
        abyte0[61] = X1;
        abyte0[62] = X2;
        abyte0[63] = X3;
        sb3(abyte0[64], abyte0[65], abyte0[66], abyte0[67]);
        abyte0[64] = X0;
        abyte0[65] = X1;
        abyte0[66] = X2;
        abyte0[67] = X3;
        sb2(abyte0[68], abyte0[69], abyte0[70], abyte0[71]);
        abyte0[68] = X0;
        abyte0[69] = X1;
        abyte0[70] = X2;
        abyte0[71] = X3;
        sb1(abyte0[72], abyte0[73], abyte0[74], abyte0[75]);
        abyte0[72] = X0;
        abyte0[73] = X1;
        abyte0[74] = X2;
        abyte0[75] = X3;
        sb0(abyte0[76], abyte0[77], abyte0[78], abyte0[79]);
        abyte0[76] = X0;
        abyte0[77] = X1;
        abyte0[78] = X2;
        abyte0[79] = X3;
        sb7(abyte0[80], abyte0[81], abyte0[82], abyte0[83]);
        abyte0[80] = X0;
        abyte0[81] = X1;
        abyte0[82] = X2;
        abyte0[83] = X3;
        sb6(abyte0[84], abyte0[85], abyte0[86], abyte0[87]);
        abyte0[84] = X0;
        abyte0[85] = X1;
        abyte0[86] = X2;
        abyte0[87] = X3;
        sb5(abyte0[88], abyte0[89], abyte0[90], abyte0[91]);
        abyte0[88] = X0;
        abyte0[89] = X1;
        abyte0[90] = X2;
        abyte0[91] = X3;
        sb4(abyte0[92], abyte0[93], abyte0[94], abyte0[95]);
        abyte0[92] = X0;
        abyte0[93] = X1;
        abyte0[94] = X2;
        abyte0[95] = X3;
        sb3(abyte0[96], abyte0[97], abyte0[98], abyte0[99]);
        abyte0[96] = X0;
        abyte0[97] = X1;
        abyte0[98] = X2;
        abyte0[99] = X3;
        sb2(abyte0[100], abyte0[101], abyte0[102], abyte0[103]);
        abyte0[100] = X0;
        abyte0[101] = X1;
        abyte0[102] = X2;
        abyte0[103] = X3;
        sb1(abyte0[104], abyte0[105], abyte0[106], abyte0[107]);
        abyte0[104] = X0;
        abyte0[105] = X1;
        abyte0[106] = X2;
        abyte0[107] = X3;
        sb0(abyte0[108], abyte0[109], abyte0[110], abyte0[111]);
        abyte0[108] = X0;
        abyte0[109] = X1;
        abyte0[110] = X2;
        abyte0[111] = X3;
        sb7(abyte0[112], abyte0[113], abyte0[114], abyte0[115]);
        abyte0[112] = X0;
        abyte0[113] = X1;
        abyte0[114] = X2;
        abyte0[115] = X3;
        sb6(abyte0[116], abyte0[117], abyte0[118], abyte0[119]);
        abyte0[116] = X0;
        abyte0[117] = X1;
        abyte0[118] = X2;
        abyte0[119] = X3;
        sb5(abyte0[120], abyte0[121], abyte0[122], abyte0[123]);
        abyte0[120] = X0;
        abyte0[121] = X1;
        abyte0[122] = X2;
        abyte0[123] = X3;
        sb4(abyte0[124], abyte0[125], abyte0[126], abyte0[127]);
        abyte0[124] = X0;
        abyte0[125] = X1;
        abyte0[126] = X2;
        abyte0[127] = X3;
        sb3(abyte0[128], abyte0[129], abyte0[130], abyte0[131]);
        abyte0[128] = X0;
        abyte0[129] = X1;
        abyte0[130] = X2;
        abyte0[131] = X3;
        return abyte0;
    }

    private int rotateLeft(int i, int j)
    {
        return i << j | i >>> -j;
    }

    private int rotateRight(int i, int j)
    {
        return i >>> j | i << -j;
    }

    private void sb0(int i, int j, int k, int l)
    {
        int k1 = i ^ l;
        int i1 = k ^ k1;
        int j1 = j ^ i1;
        X3 = i & l ^ j1;
        i = k1 & j ^ i;
        X2 = j1 ^ (k | i);
        j = X3 & (i1 ^ i);
        X1 = ~i1 ^ j;
        X0 = ~i ^ j;
    }

    private void sb1(int i, int j, int k, int l)
    {
        int i1 = ~i ^ j;
        i = (i | i1) ^ k;
        X2 = l ^ i;
        j = (l | i1) ^ j;
        k = i1 ^ X2;
        X3 = i & j ^ k;
        j ^= i;
        X1 = X3 ^ j;
        X0 = k & j ^ i;
    }

    private void sb2(int i, int j, int k, int l)
    {
        int i1 = ~i;
        int j1 = j ^ l;
        X0 = k & i1 ^ j1;
        int k1 = k ^ i1;
        j = (X0 ^ k) & j;
        X3 = k1 ^ j;
        X2 = (k1 | X0) & (j | l) ^ i;
        i = X3;
        X1 = (i1 | l) ^ X2 ^ (j1 ^ i);
    }

    private void sb3(int i, int j, int k, int l)
    {
        int j1 = i ^ j;
        int k1 = i | l;
        int i1 = k ^ l;
        i = i & k | j1 & k1;
        X2 = i1 ^ i;
        i ^= k1 ^ j;
        X0 = j1 ^ i1 & i;
        k = X2 & X0;
        X1 = i ^ k;
        X3 = k ^ i1 ^ (j | l);
    }

    private void sb4(int i, int j, int k, int l)
    {
        int i1 = i ^ l;
        k = l & i1 ^ k;
        l = j | k;
        X3 = i1 ^ l;
        int j1 = ~j;
        X0 = (i1 | j1) ^ k;
        j = X0;
        i1 ^= j1;
        X2 = l & i1 ^ j & i;
        X1 = i1 & X2 ^ (k ^ i);
    }

    private void sb5(int i, int j, int k, int l)
    {
        int j1 = ~i;
        int i1 = i ^ j;
        i ^= l;
        X0 = k ^ j1 ^ (i1 | i);
        k = X0 & l;
        X1 = X0 ^ i1 ^ k;
        i = (j1 | X0) ^ i;
        X2 = (i1 | k) ^ i;
        X3 = i & X1 ^ (j ^ k);
    }

    private void sb6(int i, int j, int k, int l)
    {
        int j1 = i ^ l;
        int i1 = j ^ j1;
        i = (~i | j1) ^ k;
        X1 = j ^ i;
        j = (j1 | X1) ^ l;
        X2 = i & j ^ i1;
        j ^= i;
        X0 = X2 ^ j;
        X3 = ~i ^ j & i1;
    }

    private void sb7(int i, int j, int k, int l)
    {
        int i1 = j ^ k;
        k = k & i1 ^ l;
        int j1 = i ^ k;
        X1 = (l | i1) & j1 ^ j;
        j = X1;
        X3 = i1 ^ i & j1;
        i = j1 ^ (j | k);
        X2 = k ^ X3 & i;
        X0 = ~i ^ X3 & X2;
    }

    private void wordToBytes(int i, byte abyte0[], int j)
    {
        abyte0[j + 3] = (byte)i;
        abyte0[j + 2] = (byte)(i >>> 8);
        abyte0[j + 1] = (byte)(i >>> 16);
        abyte0[j] = (byte)(i >>> 24);
    }

    public String getAlgorithmName()
    {
        return "Serpent";
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
            wKey = makeWorkingKey(((KeyParameter)cipherparameters).getKey());
            return;
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append("invalid parameter passed to Serpent init - ").append(cipherparameters.getClass().getName()).toString());
        }
    }

    public final int processBlock(byte abyte0[], int i, byte abyte1[], int j)
    {
        if (wKey == null)
        {
            throw new IllegalStateException("Serpent not initialised");
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
    }
}
