// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.admarvel.android.util;


// Referenced classes of package com.admarvel.android.util:
//            Base64

static class value extends value
{

    private static final int DECODE[];
    private static final int DECODE_WEBSAFE[];
    private static final int EQUALS = -2;
    private static final int SKIP = -1;
    private final int alphabet[];
    private int state;
    private int value;

    public int maxOutputSize(int i)
    {
        return (i * 3) / 4 + 10;
    }

    public boolean process(byte abyte0[], int i, int j, boolean flag)
    {
        byte abyte1[];
        int ai[];
        int k;
        int l;
        int j2;
        if (state == 6)
        {
            return false;
        }
        j2 = j + i;
        j = state;
        k = value;
        l = 0;
        abyte1 = output;
        ai = alphabet;
_L26:
        if (i < j2) goto _L2; else goto _L1
_L1:
        if (!flag)
        {
            state = j;
            value = k;
            op = l;
            return true;
        }
        break; /* Loop/switch isn't completed */
_L2:
        int i1;
        int k1;
        int l1;
        int i2;
        k1 = l;
        l1 = k;
        i2 = i;
        if (j != 0)
        {
            break MISSING_BLOCK_LABEL_239;
        }
        i1 = i;
        i = k;
_L4:
label0:
        {
            if (i1 + 4 <= j2)
            {
                i = ai[abyte0[i1] & 0xff] << 18 | ai[abyte0[i1 + 1] & 0xff] << 12 | ai[abyte0[i1 + 2] & 0xff] << 6 | ai[abyte0[i1 + 3] & 0xff];
                if (i >= 0)
                {
                    break label0;
                }
            }
            k1 = l;
            l1 = i;
            i2 = i1;
            if (i1 < j2)
            {
                break MISSING_BLOCK_LABEL_239;
            }
            k = i;
        }
        if (true) goto _L1; else goto _L3
        abyte1[l + 2] = (byte)i;
        abyte1[l + 1] = (byte)(i >> 8);
        abyte1[l] = (byte)(i >> 16);
        l += 3;
        i1 += 4;
          goto _L4
        i = i2 + 1;
        k = ai[abyte0[i2] & 0xff];
        j;
        JVM INSTR tableswitch 0 5: default 296
    //                   0 307
    //                   1 337
    //                   2 377
    //                   3 449
    //                   4 568
    //                   5 604;
           goto _L5 _L6 _L7 _L8 _L9 _L10 _L11
_L5:
        l = k1;
        k = l1;
        continue; /* Loop/switch isn't completed */
_L6:
        if (k < 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        j++;
        l = k1;
        continue; /* Loop/switch isn't completed */
        if (k == -1) goto _L5; else goto _L12
_L12:
        state = 6;
        return false;
_L7:
        if (k < 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        k = l1 << 6 | k;
        j++;
        l = k1;
        continue; /* Loop/switch isn't completed */
        if (k == -1) goto _L5; else goto _L13
_L13:
        state = 6;
        return false;
_L8:
        if (k >= 0)
        {
            k = l1 << 6 | k;
            j++;
            l = k1;
        } else
        {
            if (k != -2)
            {
                continue; /* Loop/switch isn't completed */
            }
            abyte1[k1] = (byte)(l1 >> 4);
            j = 4;
            l = k1 + 1;
            k = l1;
        }
        continue; /* Loop/switch isn't completed */
        if (k == -1) goto _L5; else goto _L14
_L14:
        state = 6;
        return false;
_L9:
        if (k >= 0)
        {
            k = l1 << 6 | k;
            abyte1[k1 + 2] = (byte)k;
            abyte1[k1 + 1] = (byte)(k >> 8);
            abyte1[k1] = (byte)(k >> 16);
            l = k1 + 3;
            j = 0;
        } else
        {
            if (k != -2)
            {
                continue; /* Loop/switch isn't completed */
            }
            abyte1[k1 + 1] = (byte)(l1 >> 2);
            abyte1[k1] = (byte)(l1 >> 10);
            l = k1 + 2;
            j = 5;
            k = l1;
        }
        continue; /* Loop/switch isn't completed */
        if (k == -1) goto _L5; else goto _L15
_L15:
        state = 6;
        return false;
_L10:
        if (k != -2)
        {
            continue; /* Loop/switch isn't completed */
        }
        j++;
        l = k1;
        k = l1;
        continue; /* Loop/switch isn't completed */
        if (k == -1) goto _L5; else goto _L16
_L16:
        state = 6;
        return false;
_L11:
        if (k == -1) goto _L5; else goto _L17
_L17:
        state = 6;
        return false;
_L3:
        i = l;
        j;
        JVM INSTR tableswitch 0 4: default 656
    //                   0 659
    //                   1 671
    //                   2 679
    //                   3 697
    //                   4 732;
           goto _L18 _L19 _L20 _L21 _L22 _L23
_L19:
        break; /* Loop/switch isn't completed */
_L18:
        i = l;
_L24:
        state = j;
        op = i;
        return true;
_L20:
        state = 6;
        return false;
_L21:
        abyte1[l] = (byte)(k >> 4);
        i = l + 1;
        continue; /* Loop/switch isn't completed */
_L22:
        int j1 = l + 1;
        abyte1[l] = (byte)(k >> 10);
        i = j1 + 1;
        abyte1[j1] = (byte)(k >> 2);
        if (true) goto _L24; else goto _L23
_L23:
        state = 6;
        return false;
        if (true) goto _L26; else goto _L25
_L25:
    }

    static 
    {
        int ai[] = new int[256];
        ai[0] = -1;
        ai[1] = -1;
        ai[2] = -1;
        ai[3] = -1;
        ai[4] = -1;
        ai[5] = -1;
        ai[6] = -1;
        ai[7] = -1;
        ai[8] = -1;
        ai[9] = -1;
        ai[10] = -1;
        ai[11] = -1;
        ai[12] = -1;
        ai[13] = -1;
        ai[14] = -1;
        ai[15] = -1;
        ai[16] = -1;
        ai[17] = -1;
        ai[18] = -1;
        ai[19] = -1;
        ai[20] = -1;
        ai[21] = -1;
        ai[22] = -1;
        ai[23] = -1;
        ai[24] = -1;
        ai[25] = -1;
        ai[26] = -1;
        ai[27] = -1;
        ai[28] = -1;
        ai[29] = -1;
        ai[30] = -1;
        ai[31] = -1;
        ai[32] = -1;
        ai[33] = -1;
        ai[34] = -1;
        ai[35] = -1;
        ai[36] = -1;
        ai[37] = -1;
        ai[38] = -1;
        ai[39] = -1;
        ai[40] = -1;
        ai[41] = -1;
        ai[42] = -1;
        ai[43] = 62;
        ai[44] = -1;
        ai[45] = -1;
        ai[46] = -1;
        ai[47] = 63;
        ai[48] = 52;
        ai[49] = 53;
        ai[50] = 54;
        ai[51] = 55;
        ai[52] = 56;
        ai[53] = 57;
        ai[54] = 58;
        ai[55] = 59;
        ai[56] = 60;
        ai[57] = 61;
        ai[58] = -1;
        ai[59] = -1;
        ai[60] = -1;
        ai[61] = -2;
        ai[62] = -1;
        ai[63] = -1;
        ai[64] = -1;
        ai[66] = 1;
        ai[67] = 2;
        ai[68] = 3;
        ai[69] = 4;
        ai[70] = 5;
        ai[71] = 6;
        ai[72] = 7;
        ai[73] = 8;
        ai[74] = 9;
        ai[75] = 10;
        ai[76] = 11;
        ai[77] = 12;
        ai[78] = 13;
        ai[79] = 14;
        ai[80] = 15;
        ai[81] = 16;
        ai[82] = 17;
        ai[83] = 18;
        ai[84] = 19;
        ai[85] = 20;
        ai[86] = 21;
        ai[87] = 22;
        ai[88] = 23;
        ai[89] = 24;
        ai[90] = 25;
        ai[91] = -1;
        ai[92] = -1;
        ai[93] = -1;
        ai[94] = -1;
        ai[95] = -1;
        ai[96] = -1;
        ai[97] = 26;
        ai[98] = 27;
        ai[99] = 28;
        ai[100] = 29;
        ai[101] = 30;
        ai[102] = 31;
        ai[103] = 32;
        ai[104] = 33;
        ai[105] = 34;
        ai[106] = 35;
        ai[107] = 36;
        ai[108] = 37;
        ai[109] = 38;
        ai[110] = 39;
        ai[111] = 40;
        ai[112] = 41;
        ai[113] = 42;
        ai[114] = 43;
        ai[115] = 44;
        ai[116] = 45;
        ai[117] = 46;
        ai[118] = 47;
        ai[119] = 48;
        ai[120] = 49;
        ai[121] = 50;
        ai[122] = 51;
        ai[123] = -1;
        ai[124] = -1;
        ai[125] = -1;
        ai[126] = -1;
        ai[127] = -1;
        ai[128] = -1;
        ai[129] = -1;
        ai[130] = -1;
        ai[131] = -1;
        ai[132] = -1;
        ai[133] = -1;
        ai[134] = -1;
        ai[135] = -1;
        ai[136] = -1;
        ai[137] = -1;
        ai[138] = -1;
        ai[139] = -1;
        ai[140] = -1;
        ai[141] = -1;
        ai[142] = -1;
        ai[143] = -1;
        ai[144] = -1;
        ai[145] = -1;
        ai[146] = -1;
        ai[147] = -1;
        ai[148] = -1;
        ai[149] = -1;
        ai[150] = -1;
        ai[151] = -1;
        ai[152] = -1;
        ai[153] = -1;
        ai[154] = -1;
        ai[155] = -1;
        ai[156] = -1;
        ai[157] = -1;
        ai[158] = -1;
        ai[159] = -1;
        ai[160] = -1;
        ai[161] = -1;
        ai[162] = -1;
        ai[163] = -1;
        ai[164] = -1;
        ai[165] = -1;
        ai[166] = -1;
        ai[167] = -1;
        ai[168] = -1;
        ai[169] = -1;
        ai[170] = -1;
        ai[171] = -1;
        ai[172] = -1;
        ai[173] = -1;
        ai[174] = -1;
        ai[175] = -1;
        ai[176] = -1;
        ai[177] = -1;
        ai[178] = -1;
        ai[179] = -1;
        ai[180] = -1;
        ai[181] = -1;
        ai[182] = -1;
        ai[183] = -1;
        ai[184] = -1;
        ai[185] = -1;
        ai[186] = -1;
        ai[187] = -1;
        ai[188] = -1;
        ai[189] = -1;
        ai[190] = -1;
        ai[191] = -1;
        ai[192] = -1;
        ai[193] = -1;
        ai[194] = -1;
        ai[195] = -1;
        ai[196] = -1;
        ai[197] = -1;
        ai[198] = -1;
        ai[199] = -1;
        ai[200] = -1;
        ai[201] = -1;
        ai[202] = -1;
        ai[203] = -1;
        ai[204] = -1;
        ai[205] = -1;
        ai[206] = -1;
        ai[207] = -1;
        ai[208] = -1;
        ai[209] = -1;
        ai[210] = -1;
        ai[211] = -1;
        ai[212] = -1;
        ai[213] = -1;
        ai[214] = -1;
        ai[215] = -1;
        ai[216] = -1;
        ai[217] = -1;
        ai[218] = -1;
        ai[219] = -1;
        ai[220] = -1;
        ai[221] = -1;
        ai[222] = -1;
        ai[223] = -1;
        ai[224] = -1;
        ai[225] = -1;
        ai[226] = -1;
        ai[227] = -1;
        ai[228] = -1;
        ai[229] = -1;
        ai[230] = -1;
        ai[231] = -1;
        ai[232] = -1;
        ai[233] = -1;
        ai[234] = -1;
        ai[235] = -1;
        ai[236] = -1;
        ai[237] = -1;
        ai[238] = -1;
        ai[239] = -1;
        ai[240] = -1;
        ai[241] = -1;
        ai[242] = -1;
        ai[243] = -1;
        ai[244] = -1;
        ai[245] = -1;
        ai[246] = -1;
        ai[247] = -1;
        ai[248] = -1;
        ai[249] = -1;
        ai[250] = -1;
        ai[251] = -1;
        ai[252] = -1;
        ai[253] = -1;
        ai[254] = -1;
        ai[255] = -1;
        DECODE = ai;
        ai = new int[256];
        ai[0] = -1;
        ai[1] = -1;
        ai[2] = -1;
        ai[3] = -1;
        ai[4] = -1;
        ai[5] = -1;
        ai[6] = -1;
        ai[7] = -1;
        ai[8] = -1;
        ai[9] = -1;
        ai[10] = -1;
        ai[11] = -1;
        ai[12] = -1;
        ai[13] = -1;
        ai[14] = -1;
        ai[15] = -1;
        ai[16] = -1;
        ai[17] = -1;
        ai[18] = -1;
        ai[19] = -1;
        ai[20] = -1;
        ai[21] = -1;
        ai[22] = -1;
        ai[23] = -1;
        ai[24] = -1;
        ai[25] = -1;
        ai[26] = -1;
        ai[27] = -1;
        ai[28] = -1;
        ai[29] = -1;
        ai[30] = -1;
        ai[31] = -1;
        ai[32] = -1;
        ai[33] = -1;
        ai[34] = -1;
        ai[35] = -1;
        ai[36] = -1;
        ai[37] = -1;
        ai[38] = -1;
        ai[39] = -1;
        ai[40] = -1;
        ai[41] = -1;
        ai[42] = -1;
        ai[43] = -1;
        ai[44] = -1;
        ai[45] = 62;
        ai[46] = -1;
        ai[47] = -1;
        ai[48] = 52;
        ai[49] = 53;
        ai[50] = 54;
        ai[51] = 55;
        ai[52] = 56;
        ai[53] = 57;
        ai[54] = 58;
        ai[55] = 59;
        ai[56] = 60;
        ai[57] = 61;
        ai[58] = -1;
        ai[59] = -1;
        ai[60] = -1;
        ai[61] = -2;
        ai[62] = -1;
        ai[63] = -1;
        ai[64] = -1;
        ai[66] = 1;
        ai[67] = 2;
        ai[68] = 3;
        ai[69] = 4;
        ai[70] = 5;
        ai[71] = 6;
        ai[72] = 7;
        ai[73] = 8;
        ai[74] = 9;
        ai[75] = 10;
        ai[76] = 11;
        ai[77] = 12;
        ai[78] = 13;
        ai[79] = 14;
        ai[80] = 15;
        ai[81] = 16;
        ai[82] = 17;
        ai[83] = 18;
        ai[84] = 19;
        ai[85] = 20;
        ai[86] = 21;
        ai[87] = 22;
        ai[88] = 23;
        ai[89] = 24;
        ai[90] = 25;
        ai[91] = -1;
        ai[92] = -1;
        ai[93] = -1;
        ai[94] = -1;
        ai[95] = 63;
        ai[96] = -1;
        ai[97] = 26;
        ai[98] = 27;
        ai[99] = 28;
        ai[100] = 29;
        ai[101] = 30;
        ai[102] = 31;
        ai[103] = 32;
        ai[104] = 33;
        ai[105] = 34;
        ai[106] = 35;
        ai[107] = 36;
        ai[108] = 37;
        ai[109] = 38;
        ai[110] = 39;
        ai[111] = 40;
        ai[112] = 41;
        ai[113] = 42;
        ai[114] = 43;
        ai[115] = 44;
        ai[116] = 45;
        ai[117] = 46;
        ai[118] = 47;
        ai[119] = 48;
        ai[120] = 49;
        ai[121] = 50;
        ai[122] = 51;
        ai[123] = -1;
        ai[124] = -1;
        ai[125] = -1;
        ai[126] = -1;
        ai[127] = -1;
        ai[128] = -1;
        ai[129] = -1;
        ai[130] = -1;
        ai[131] = -1;
        ai[132] = -1;
        ai[133] = -1;
        ai[134] = -1;
        ai[135] = -1;
        ai[136] = -1;
        ai[137] = -1;
        ai[138] = -1;
        ai[139] = -1;
        ai[140] = -1;
        ai[141] = -1;
        ai[142] = -1;
        ai[143] = -1;
        ai[144] = -1;
        ai[145] = -1;
        ai[146] = -1;
        ai[147] = -1;
        ai[148] = -1;
        ai[149] = -1;
        ai[150] = -1;
        ai[151] = -1;
        ai[152] = -1;
        ai[153] = -1;
        ai[154] = -1;
        ai[155] = -1;
        ai[156] = -1;
        ai[157] = -1;
        ai[158] = -1;
        ai[159] = -1;
        ai[160] = -1;
        ai[161] = -1;
        ai[162] = -1;
        ai[163] = -1;
        ai[164] = -1;
        ai[165] = -1;
        ai[166] = -1;
        ai[167] = -1;
        ai[168] = -1;
        ai[169] = -1;
        ai[170] = -1;
        ai[171] = -1;
        ai[172] = -1;
        ai[173] = -1;
        ai[174] = -1;
        ai[175] = -1;
        ai[176] = -1;
        ai[177] = -1;
        ai[178] = -1;
        ai[179] = -1;
        ai[180] = -1;
        ai[181] = -1;
        ai[182] = -1;
        ai[183] = -1;
        ai[184] = -1;
        ai[185] = -1;
        ai[186] = -1;
        ai[187] = -1;
        ai[188] = -1;
        ai[189] = -1;
        ai[190] = -1;
        ai[191] = -1;
        ai[192] = -1;
        ai[193] = -1;
        ai[194] = -1;
        ai[195] = -1;
        ai[196] = -1;
        ai[197] = -1;
        ai[198] = -1;
        ai[199] = -1;
        ai[200] = -1;
        ai[201] = -1;
        ai[202] = -1;
        ai[203] = -1;
        ai[204] = -1;
        ai[205] = -1;
        ai[206] = -1;
        ai[207] = -1;
        ai[208] = -1;
        ai[209] = -1;
        ai[210] = -1;
        ai[211] = -1;
        ai[212] = -1;
        ai[213] = -1;
        ai[214] = -1;
        ai[215] = -1;
        ai[216] = -1;
        ai[217] = -1;
        ai[218] = -1;
        ai[219] = -1;
        ai[220] = -1;
        ai[221] = -1;
        ai[222] = -1;
        ai[223] = -1;
        ai[224] = -1;
        ai[225] = -1;
        ai[226] = -1;
        ai[227] = -1;
        ai[228] = -1;
        ai[229] = -1;
        ai[230] = -1;
        ai[231] = -1;
        ai[232] = -1;
        ai[233] = -1;
        ai[234] = -1;
        ai[235] = -1;
        ai[236] = -1;
        ai[237] = -1;
        ai[238] = -1;
        ai[239] = -1;
        ai[240] = -1;
        ai[241] = -1;
        ai[242] = -1;
        ai[243] = -1;
        ai[244] = -1;
        ai[245] = -1;
        ai[246] = -1;
        ai[247] = -1;
        ai[248] = -1;
        ai[249] = -1;
        ai[250] = -1;
        ai[251] = -1;
        ai[252] = -1;
        ai[253] = -1;
        ai[254] = -1;
        ai[255] = -1;
        DECODE_WEBSAFE = ai;
    }

    public (int i, byte abyte0[])
    {
        output = abyte0;
        if ((i & 8) == 0)
        {
            abyte0 = DECODE;
        } else
        {
            abyte0 = DECODE_WEBSAFE;
        }
        alphabet = abyte0;
        state = 0;
        value = 0;
    }
}
