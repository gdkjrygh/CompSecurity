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

    private boolean a;
    private int b[];
    private int c;
    private int d;
    private int e;
    private int f;

    public SerpentEngine()
    {
    }

    private void LT()
    {
        int i = rotateLeft(c, 13);
        int j = rotateLeft(e, 3);
        int k = d;
        int l = f;
        d = rotateLeft(k ^ i ^ j, 1);
        f = rotateLeft(l ^ j ^ i << 3, 7);
        c = rotateLeft(i ^ d ^ f, 5);
        e = rotateLeft(f ^ j ^ d << 7, 22);
    }

    private int bytesToWord(byte abyte0[], int i)
    {
        return (abyte0[i] & 0xff) << 24 | (abyte0[i + 1] & 0xff) << 16 | (abyte0[i + 2] & 0xff) << 8 | abyte0[i + 3] & 0xff;
    }

    private void decryptBlock(byte abyte0[], int i, byte abyte1[], int j)
    {
        f = b[131] ^ bytesToWord(abyte0, i);
        e = b[130] ^ bytesToWord(abyte0, i + 4);
        d = b[129] ^ bytesToWord(abyte0, i + 8);
        c = b[128] ^ bytesToWord(abyte0, i + 12);
        ib7(c, d, e, f);
        c = c ^ b[124];
        d = d ^ b[125];
        e = e ^ b[126];
        f = f ^ b[127];
        inverseLT();
        ib6(c, d, e, f);
        c = c ^ b[120];
        d = d ^ b[121];
        e = e ^ b[122];
        f = f ^ b[123];
        inverseLT();
        ib5(c, d, e, f);
        c = c ^ b[116];
        d = d ^ b[117];
        e = e ^ b[118];
        f = f ^ b[119];
        inverseLT();
        ib4(c, d, e, f);
        c = c ^ b[112];
        d = d ^ b[113];
        e = e ^ b[114];
        f = f ^ b[115];
        inverseLT();
        ib3(c, d, e, f);
        c = c ^ b[108];
        d = d ^ b[109];
        e = e ^ b[110];
        f = f ^ b[111];
        inverseLT();
        ib2(c, d, e, f);
        c = c ^ b[104];
        d = d ^ b[105];
        e = e ^ b[106];
        f = f ^ b[107];
        inverseLT();
        ib1(c, d, e, f);
        c = c ^ b[100];
        d = d ^ b[101];
        e = e ^ b[102];
        f = f ^ b[103];
        inverseLT();
        ib0(c, d, e, f);
        c = c ^ b[96];
        d = d ^ b[97];
        e = e ^ b[98];
        f = f ^ b[99];
        inverseLT();
        ib7(c, d, e, f);
        c = c ^ b[92];
        d = d ^ b[93];
        e = e ^ b[94];
        f = f ^ b[95];
        inverseLT();
        ib6(c, d, e, f);
        c = c ^ b[88];
        d = d ^ b[89];
        e = e ^ b[90];
        f = f ^ b[91];
        inverseLT();
        ib5(c, d, e, f);
        c = c ^ b[84];
        d = d ^ b[85];
        e = e ^ b[86];
        f = f ^ b[87];
        inverseLT();
        ib4(c, d, e, f);
        c = c ^ b[80];
        d = d ^ b[81];
        e = e ^ b[82];
        f = f ^ b[83];
        inverseLT();
        ib3(c, d, e, f);
        c = c ^ b[76];
        d = d ^ b[77];
        e = e ^ b[78];
        f = f ^ b[79];
        inverseLT();
        ib2(c, d, e, f);
        c = c ^ b[72];
        d = d ^ b[73];
        e = e ^ b[74];
        f = f ^ b[75];
        inverseLT();
        ib1(c, d, e, f);
        c = c ^ b[68];
        d = d ^ b[69];
        e = e ^ b[70];
        f = f ^ b[71];
        inverseLT();
        ib0(c, d, e, f);
        c = c ^ b[64];
        d = d ^ b[65];
        e = e ^ b[66];
        f = f ^ b[67];
        inverseLT();
        ib7(c, d, e, f);
        c = c ^ b[60];
        d = d ^ b[61];
        e = e ^ b[62];
        f = f ^ b[63];
        inverseLT();
        ib6(c, d, e, f);
        c = c ^ b[56];
        d = d ^ b[57];
        e = e ^ b[58];
        f = f ^ b[59];
        inverseLT();
        ib5(c, d, e, f);
        c = c ^ b[52];
        d = d ^ b[53];
        e = e ^ b[54];
        f = f ^ b[55];
        inverseLT();
        ib4(c, d, e, f);
        c = c ^ b[48];
        d = d ^ b[49];
        e = e ^ b[50];
        f = f ^ b[51];
        inverseLT();
        ib3(c, d, e, f);
        c = c ^ b[44];
        d = d ^ b[45];
        e = e ^ b[46];
        f = f ^ b[47];
        inverseLT();
        ib2(c, d, e, f);
        c = c ^ b[40];
        d = d ^ b[41];
        e = e ^ b[42];
        f = f ^ b[43];
        inverseLT();
        ib1(c, d, e, f);
        c = c ^ b[36];
        d = d ^ b[37];
        e = e ^ b[38];
        f = f ^ b[39];
        inverseLT();
        ib0(c, d, e, f);
        c = c ^ b[32];
        d = d ^ b[33];
        e = e ^ b[34];
        f = f ^ b[35];
        inverseLT();
        ib7(c, d, e, f);
        c = c ^ b[28];
        d = d ^ b[29];
        e = e ^ b[30];
        f = f ^ b[31];
        inverseLT();
        ib6(c, d, e, f);
        c = c ^ b[24];
        d = d ^ b[25];
        e = e ^ b[26];
        f = f ^ b[27];
        inverseLT();
        ib5(c, d, e, f);
        c = c ^ b[20];
        d = d ^ b[21];
        e = e ^ b[22];
        f = f ^ b[23];
        inverseLT();
        ib4(c, d, e, f);
        c = c ^ b[16];
        d = d ^ b[17];
        e = e ^ b[18];
        f = f ^ b[19];
        inverseLT();
        ib3(c, d, e, f);
        c = c ^ b[12];
        d = d ^ b[13];
        e = e ^ b[14];
        f = f ^ b[15];
        inverseLT();
        ib2(c, d, e, f);
        c = c ^ b[8];
        d = d ^ b[9];
        e = e ^ b[10];
        f = f ^ b[11];
        inverseLT();
        ib1(c, d, e, f);
        c = c ^ b[4];
        d = d ^ b[5];
        e = e ^ b[6];
        f = f ^ b[7];
        inverseLT();
        ib0(c, d, e, f);
        wordToBytes(f ^ b[3], abyte1, j);
        wordToBytes(e ^ b[2], abyte1, j + 4);
        wordToBytes(d ^ b[1], abyte1, j + 8);
        wordToBytes(c ^ b[0], abyte1, j + 12);
    }

    private void encryptBlock(byte abyte0[], int i, byte abyte1[], int j)
    {
        f = bytesToWord(abyte0, i);
        e = bytesToWord(abyte0, i + 4);
        d = bytesToWord(abyte0, i + 8);
        c = bytesToWord(abyte0, i + 12);
        sb0(b[0] ^ c, b[1] ^ d, b[2] ^ e, b[3] ^ f);
        LT();
        sb1(b[4] ^ c, b[5] ^ d, b[6] ^ e, b[7] ^ f);
        LT();
        sb2(b[8] ^ c, b[9] ^ d, b[10] ^ e, b[11] ^ f);
        LT();
        sb3(b[12] ^ c, b[13] ^ d, b[14] ^ e, b[15] ^ f);
        LT();
        sb4(b[16] ^ c, b[17] ^ d, b[18] ^ e, b[19] ^ f);
        LT();
        sb5(b[20] ^ c, b[21] ^ d, b[22] ^ e, b[23] ^ f);
        LT();
        sb6(b[24] ^ c, b[25] ^ d, b[26] ^ e, b[27] ^ f);
        LT();
        sb7(b[28] ^ c, b[29] ^ d, b[30] ^ e, b[31] ^ f);
        LT();
        sb0(b[32] ^ c, b[33] ^ d, b[34] ^ e, b[35] ^ f);
        LT();
        sb1(b[36] ^ c, b[37] ^ d, b[38] ^ e, b[39] ^ f);
        LT();
        sb2(b[40] ^ c, b[41] ^ d, b[42] ^ e, b[43] ^ f);
        LT();
        sb3(b[44] ^ c, b[45] ^ d, b[46] ^ e, b[47] ^ f);
        LT();
        sb4(b[48] ^ c, b[49] ^ d, b[50] ^ e, b[51] ^ f);
        LT();
        sb5(b[52] ^ c, b[53] ^ d, b[54] ^ e, b[55] ^ f);
        LT();
        sb6(b[56] ^ c, b[57] ^ d, b[58] ^ e, b[59] ^ f);
        LT();
        sb7(b[60] ^ c, b[61] ^ d, b[62] ^ e, b[63] ^ f);
        LT();
        sb0(b[64] ^ c, b[65] ^ d, b[66] ^ e, b[67] ^ f);
        LT();
        sb1(b[68] ^ c, b[69] ^ d, b[70] ^ e, b[71] ^ f);
        LT();
        sb2(b[72] ^ c, b[73] ^ d, b[74] ^ e, b[75] ^ f);
        LT();
        sb3(b[76] ^ c, b[77] ^ d, b[78] ^ e, b[79] ^ f);
        LT();
        sb4(b[80] ^ c, b[81] ^ d, b[82] ^ e, b[83] ^ f);
        LT();
        sb5(b[84] ^ c, b[85] ^ d, b[86] ^ e, b[87] ^ f);
        LT();
        sb6(b[88] ^ c, b[89] ^ d, b[90] ^ e, b[91] ^ f);
        LT();
        sb7(b[92] ^ c, b[93] ^ d, b[94] ^ e, b[95] ^ f);
        LT();
        sb0(b[96] ^ c, b[97] ^ d, b[98] ^ e, b[99] ^ f);
        LT();
        sb1(b[100] ^ c, b[101] ^ d, b[102] ^ e, b[103] ^ f);
        LT();
        sb2(b[104] ^ c, b[105] ^ d, b[106] ^ e, b[107] ^ f);
        LT();
        sb3(b[108] ^ c, b[109] ^ d, b[110] ^ e, b[111] ^ f);
        LT();
        sb4(b[112] ^ c, b[113] ^ d, b[114] ^ e, b[115] ^ f);
        LT();
        sb5(b[116] ^ c, b[117] ^ d, b[118] ^ e, b[119] ^ f);
        LT();
        sb6(b[120] ^ c, b[121] ^ d, b[122] ^ e, b[123] ^ f);
        LT();
        sb7(b[124] ^ c, b[125] ^ d, b[126] ^ e, b[127] ^ f);
        wordToBytes(b[131] ^ f, abyte1, j);
        wordToBytes(b[130] ^ e, abyte1, j + 4);
        wordToBytes(b[129] ^ d, abyte1, j + 8);
        wordToBytes(b[128] ^ c, abyte1, j + 12);
    }

    private void ib0(int i, int j, int k, int l)
    {
        int i1 = ~i;
        int j1 = i ^ j;
        j = (i1 | j1) ^ l;
        k ^= j;
        e = j1 ^ k;
        l = i1 ^ j1 & l;
        d = e & l ^ j;
        f = i & j ^ (d | k);
        c = l ^ k ^ f;
    }

    private void ib1(int i, int j, int k, int l)
    {
        l = j ^ l;
        int i1 = j & l ^ i;
        i = l ^ i1;
        f = k ^ i;
        j = l & i1 ^ j;
        d = i1 ^ (f | j);
        k = ~d;
        j ^= f;
        c = k ^ j;
        e = (j | k) ^ i;
    }

    private void ib2(int i, int j, int k, int l)
    {
        int j1 = j ^ l;
        int i1 = i ^ k;
        k ^= j1;
        c = j & k ^ i1;
        f = j1 ^ ((~j1 | i) ^ l | i1);
        i = ~k;
        j = c | f;
        d = i ^ j;
        e = i & l ^ (j ^ i1);
    }

    private void ib3(int i, int j, int k, int l)
    {
        int j1 = j ^ k;
        int i1 = j & j1 ^ i;
        int k1 = l | i1;
        c = j1 ^ k1;
        l = (j1 | k1) ^ l;
        e = k ^ i1 ^ l;
        i = (i | j) ^ l;
        f = c & i ^ i1;
        j = f;
        d = i ^ c ^ j;
    }

    private void ib4(int i, int j, int k, int l)
    {
        j = (k | l) & i ^ j;
        k = i & j ^ k;
        d = l ^ k;
        i = ~i;
        f = k & d ^ j;
        k = (d | i) ^ l;
        c = f ^ k;
        e = j & k ^ (d ^ i);
    }

    private void ib5(int i, int j, int k, int l)
    {
        int i1 = ~k;
        int l1 = j & i1 ^ l;
        int j1 = i & l1;
        f = j ^ i1 ^ j1;
        int k1 = f | j;
        d = l1 ^ i & k1;
        l = i | l;
        c = i1 ^ k1 ^ l;
        e = j & l ^ (i ^ k | j1);
    }

    private void ib6(int i, int j, int k, int l)
    {
        int i1 = ~i;
        int j1 = i ^ j;
        i = k ^ j1;
        k = (k | i1) ^ l;
        d = i ^ k;
        j1 ^= i & k;
        f = k ^ (j | j1);
        j = f | j;
        c = j1 ^ j;
        e = i1 & l ^ (i ^ j);
    }

    private void ib7(int i, int j, int k, int l)
    {
        int i1 = i & j | k;
        int j1 = (i | j) & l;
        f = i1 ^ j1;
        j = j1 ^ j;
        d = (~l ^ f | j) ^ i;
        c = j ^ k ^ (d | l);
        e = i1 ^ d ^ (c ^ f & i);
    }

    private void inverseLT()
    {
        int i = rotateRight(e, 22) ^ f ^ d << 7;
        int j = rotateRight(c, 5) ^ d ^ f;
        int k = rotateRight(f, 7);
        int l = rotateRight(d, 1);
        f = k ^ i ^ j << 3;
        d = l ^ j ^ i;
        e = rotateRight(i, 3);
        c = rotateRight(j, 13);
    }

    private int[] makeWorkingKey(byte abyte0[])
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
        abyte0[0] = c;
        abyte0[1] = d;
        abyte0[2] = e;
        abyte0[3] = f;
        sb2(abyte0[4], abyte0[5], abyte0[6], abyte0[7]);
        abyte0[4] = c;
        abyte0[5] = d;
        abyte0[6] = e;
        abyte0[7] = f;
        sb1(abyte0[8], abyte0[9], abyte0[10], abyte0[11]);
        abyte0[8] = c;
        abyte0[9] = d;
        abyte0[10] = e;
        abyte0[11] = f;
        sb0(abyte0[12], abyte0[13], abyte0[14], abyte0[15]);
        abyte0[12] = c;
        abyte0[13] = d;
        abyte0[14] = e;
        abyte0[15] = f;
        sb7(abyte0[16], abyte0[17], abyte0[18], abyte0[19]);
        abyte0[16] = c;
        abyte0[17] = d;
        abyte0[18] = e;
        abyte0[19] = f;
        sb6(abyte0[20], abyte0[21], abyte0[22], abyte0[23]);
        abyte0[20] = c;
        abyte0[21] = d;
        abyte0[22] = e;
        abyte0[23] = f;
        sb5(abyte0[24], abyte0[25], abyte0[26], abyte0[27]);
        abyte0[24] = c;
        abyte0[25] = d;
        abyte0[26] = e;
        abyte0[27] = f;
        sb4(abyte0[28], abyte0[29], abyte0[30], abyte0[31]);
        abyte0[28] = c;
        abyte0[29] = d;
        abyte0[30] = e;
        abyte0[31] = f;
        sb3(abyte0[32], abyte0[33], abyte0[34], abyte0[35]);
        abyte0[32] = c;
        abyte0[33] = d;
        abyte0[34] = e;
        abyte0[35] = f;
        sb2(abyte0[36], abyte0[37], abyte0[38], abyte0[39]);
        abyte0[36] = c;
        abyte0[37] = d;
        abyte0[38] = e;
        abyte0[39] = f;
        sb1(abyte0[40], abyte0[41], abyte0[42], abyte0[43]);
        abyte0[40] = c;
        abyte0[41] = d;
        abyte0[42] = e;
        abyte0[43] = f;
        sb0(abyte0[44], abyte0[45], abyte0[46], abyte0[47]);
        abyte0[44] = c;
        abyte0[45] = d;
        abyte0[46] = e;
        abyte0[47] = f;
        sb7(abyte0[48], abyte0[49], abyte0[50], abyte0[51]);
        abyte0[48] = c;
        abyte0[49] = d;
        abyte0[50] = e;
        abyte0[51] = f;
        sb6(abyte0[52], abyte0[53], abyte0[54], abyte0[55]);
        abyte0[52] = c;
        abyte0[53] = d;
        abyte0[54] = e;
        abyte0[55] = f;
        sb5(abyte0[56], abyte0[57], abyte0[58], abyte0[59]);
        abyte0[56] = c;
        abyte0[57] = d;
        abyte0[58] = e;
        abyte0[59] = f;
        sb4(abyte0[60], abyte0[61], abyte0[62], abyte0[63]);
        abyte0[60] = c;
        abyte0[61] = d;
        abyte0[62] = e;
        abyte0[63] = f;
        sb3(abyte0[64], abyte0[65], abyte0[66], abyte0[67]);
        abyte0[64] = c;
        abyte0[65] = d;
        abyte0[66] = e;
        abyte0[67] = f;
        sb2(abyte0[68], abyte0[69], abyte0[70], abyte0[71]);
        abyte0[68] = c;
        abyte0[69] = d;
        abyte0[70] = e;
        abyte0[71] = f;
        sb1(abyte0[72], abyte0[73], abyte0[74], abyte0[75]);
        abyte0[72] = c;
        abyte0[73] = d;
        abyte0[74] = e;
        abyte0[75] = f;
        sb0(abyte0[76], abyte0[77], abyte0[78], abyte0[79]);
        abyte0[76] = c;
        abyte0[77] = d;
        abyte0[78] = e;
        abyte0[79] = f;
        sb7(abyte0[80], abyte0[81], abyte0[82], abyte0[83]);
        abyte0[80] = c;
        abyte0[81] = d;
        abyte0[82] = e;
        abyte0[83] = f;
        sb6(abyte0[84], abyte0[85], abyte0[86], abyte0[87]);
        abyte0[84] = c;
        abyte0[85] = d;
        abyte0[86] = e;
        abyte0[87] = f;
        sb5(abyte0[88], abyte0[89], abyte0[90], abyte0[91]);
        abyte0[88] = c;
        abyte0[89] = d;
        abyte0[90] = e;
        abyte0[91] = f;
        sb4(abyte0[92], abyte0[93], abyte0[94], abyte0[95]);
        abyte0[92] = c;
        abyte0[93] = d;
        abyte0[94] = e;
        abyte0[95] = f;
        sb3(abyte0[96], abyte0[97], abyte0[98], abyte0[99]);
        abyte0[96] = c;
        abyte0[97] = d;
        abyte0[98] = e;
        abyte0[99] = f;
        sb2(abyte0[100], abyte0[101], abyte0[102], abyte0[103]);
        abyte0[100] = c;
        abyte0[101] = d;
        abyte0[102] = e;
        abyte0[103] = f;
        sb1(abyte0[104], abyte0[105], abyte0[106], abyte0[107]);
        abyte0[104] = c;
        abyte0[105] = d;
        abyte0[106] = e;
        abyte0[107] = f;
        sb0(abyte0[108], abyte0[109], abyte0[110], abyte0[111]);
        abyte0[108] = c;
        abyte0[109] = d;
        abyte0[110] = e;
        abyte0[111] = f;
        sb7(abyte0[112], abyte0[113], abyte0[114], abyte0[115]);
        abyte0[112] = c;
        abyte0[113] = d;
        abyte0[114] = e;
        abyte0[115] = f;
        sb6(abyte0[116], abyte0[117], abyte0[118], abyte0[119]);
        abyte0[116] = c;
        abyte0[117] = d;
        abyte0[118] = e;
        abyte0[119] = f;
        sb5(abyte0[120], abyte0[121], abyte0[122], abyte0[123]);
        abyte0[120] = c;
        abyte0[121] = d;
        abyte0[122] = e;
        abyte0[123] = f;
        sb4(abyte0[124], abyte0[125], abyte0[126], abyte0[127]);
        abyte0[124] = c;
        abyte0[125] = d;
        abyte0[126] = e;
        abyte0[127] = f;
        sb3(abyte0[128], abyte0[129], abyte0[130], abyte0[131]);
        abyte0[128] = c;
        abyte0[129] = d;
        abyte0[130] = e;
        abyte0[131] = f;
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
        f = i & l ^ j1;
        i = k1 & j ^ i;
        e = j1 ^ (k | i);
        j = f & (i1 ^ i);
        d = ~i1 ^ j;
        c = ~i ^ j;
    }

    private void sb1(int i, int j, int k, int l)
    {
        int i1 = ~i ^ j;
        i = (i | i1) ^ k;
        e = l ^ i;
        j = (l | i1) ^ j;
        k = i1 ^ e;
        f = i & j ^ k;
        j ^= i;
        d = f ^ j;
        c = k & j ^ i;
    }

    private void sb2(int i, int j, int k, int l)
    {
        int i1 = ~i;
        int j1 = j ^ l;
        c = k & i1 ^ j1;
        int k1 = k ^ i1;
        j = (c ^ k) & j;
        f = k1 ^ j;
        e = (k1 | c) & (j | l) ^ i;
        i = f;
        d = (i1 | l) ^ e ^ (j1 ^ i);
    }

    private void sb3(int i, int j, int k, int l)
    {
        int j1 = i ^ j;
        int k1 = i | l;
        int i1 = k ^ l;
        i = i & k | j1 & k1;
        e = i1 ^ i;
        i ^= k1 ^ j;
        c = j1 ^ i1 & i;
        k = e & c;
        d = i ^ k;
        f = k ^ i1 ^ (j | l);
    }

    private void sb4(int i, int j, int k, int l)
    {
        int i1 = i ^ l;
        k = l & i1 ^ k;
        l = j | k;
        f = i1 ^ l;
        int j1 = ~j;
        c = (i1 | j1) ^ k;
        j = c;
        i1 ^= j1;
        e = l & i1 ^ j & i;
        d = i1 & e ^ (k ^ i);
    }

    private void sb5(int i, int j, int k, int l)
    {
        int j1 = ~i;
        int i1 = i ^ j;
        i ^= l;
        c = k ^ j1 ^ (i1 | i);
        k = c & l;
        d = c ^ i1 ^ k;
        i = (j1 | c) ^ i;
        e = (i1 | k) ^ i;
        f = i & d ^ (j ^ k);
    }

    private void sb6(int i, int j, int k, int l)
    {
        int j1 = i ^ l;
        int i1 = j ^ j1;
        i = (~i | j1) ^ k;
        d = j ^ i;
        j = (j1 | d) ^ l;
        e = i & j ^ i1;
        j ^= i;
        c = e ^ j;
        f = ~i ^ j & i1;
    }

    private void sb7(int i, int j, int k, int l)
    {
        int i1 = j ^ k;
        k = k & i1 ^ l;
        int j1 = i ^ k;
        d = (l | i1) & j1 ^ j;
        j = d;
        f = i1 ^ i & j1;
        i = j1 ^ (j | k);
        e = k ^ f & i;
        c = ~i ^ f & e;
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
            a = flag;
            b = makeWorkingKey(((KeyParameter)cipherparameters).getKey());
            return;
        } else
        {
            throw new IllegalArgumentException((new StringBuilder("invalid parameter passed to Serpent init - ")).append(cipherparameters.getClass().getName()).toString());
        }
    }

    public final int processBlock(byte abyte0[], int i, byte abyte1[], int j)
    {
        if (b == null)
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
        if (a)
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
