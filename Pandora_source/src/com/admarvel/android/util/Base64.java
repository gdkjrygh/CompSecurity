// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.admarvel.android.util;

import java.io.UnsupportedEncodingException;

public class Base64
{
    static abstract class Coder
    {

        public int op;
        public byte output[];

        public abstract int maxOutputSize(int i);

        public abstract boolean process(byte abyte0[], int i, int j, boolean flag);

        Coder()
        {
        }
    }

    static class Decoder extends Coder
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
        //                       0 307
        //                       1 337
        //                       2 377
        //                       3 449
        //                       4 568
        //                       5 604;
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
        //                       0 659
        //                       1 671
        //                       2 679
        //                       3 697
        //                       4 732;
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

        public Decoder(int i, byte abyte0[])
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

    static class Encoder extends Coder
    {

        static final boolean $assertionsDisabled;
        private static final byte ENCODE[] = {
            65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 
            75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 
            85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 
            101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 
            111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 
            121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 
            56, 57, 43, 47
        };
        private static final byte ENCODE_WEBSAFE[] = {
            65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 
            75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 
            85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 
            101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 
            111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 
            121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 
            56, 57, 45, 95
        };
        public static final int LINE_GROUPS = 19;
        private final byte alphabet[];
        private int count;
        public final boolean do_cr;
        public final boolean do_newline;
        public final boolean do_padding;
        private final byte tail[] = new byte[2];
        int tailLen;

        public int maxOutputSize(int i)
        {
            return (i * 8) / 5 + 10;
        }

        public boolean process(byte abyte0[], int i, int j, boolean flag)
        {
            byte abyte1[];
            byte abyte2[];
            int l;
            int i1;
            int j1;
            int l1;
            abyte1 = alphabet;
            abyte2 = output;
            l = 0;
            j1 = count;
            l1 = j + i;
            i1 = -1;
            tailLen;
            JVM INSTR tableswitch 0 2: default 60
        //                       0 401
        //                       1 407
        //                       2 470;
               goto _L1 _L2 _L3 _L4
_L1:
            int k = i;
_L12:
            i = j1;
            j = l;
            l = k;
            if (i1 == -1) goto _L6; else goto _L5
_L5:
            abyte2[0] = abyte1[i1 >> 18 & 0x3f];
            abyte2[1] = abyte1[i1 >> 12 & 0x3f];
            abyte2[2] = abyte1[i1 >> 6 & 0x3f];
            j = 4;
            abyte2[3] = abyte1[i1 & 0x3f];
            i1 = j1 - 1;
            i = i1;
            l = k;
            if (i1 != 0) goto _L6; else goto _L7
_L7:
            byte abyte3[];
            int k1;
            byte byte0;
            if (do_cr)
            {
                i = 5;
                abyte2[4] = 13;
            } else
            {
                i = 4;
            }
            abyte2[i] = 10;
            i1 = 19;
            j = i + 1;
            if (k + 3 <= l1) goto _L9; else goto _L8
_L8:
            if (!flag) goto _L11; else goto _L10
_L2:
            k = i;
              goto _L12
_L3:
            if (i + 2 > l1) goto _L1; else goto _L13
_L13:
            k = tail[0];
            j = i + 1;
            i1 = (k & 0xff) << 16 | (abyte0[i] & 0xff) << 8 | abyte0[j] & 0xff;
            tailLen = 0;
            k = j + 1;
              goto _L12
_L4:
            if (i + 1 > l1) goto _L1; else goto _L14
_L14:
            j = tail[0];
            i1 = tail[1];
            k = i + 1;
            i1 = (j & 0xff) << 16 | (i1 & 0xff) << 8 | abyte0[i] & 0xff;
            tailLen = 0;
              goto _L12
_L9:
            i = (abyte0[k] & 0xff) << 16 | (abyte0[k + 1] & 0xff) << 8 | abyte0[k + 2] & 0xff;
            abyte2[j] = abyte1[i >> 18 & 0x3f];
            abyte2[j + 1] = abyte1[i >> 12 & 0x3f];
            abyte2[j + 2] = abyte1[i >> 6 & 0x3f];
            abyte2[j + 3] = abyte1[i & 0x3f];
            k += 3;
            k1 = j + 4;
            i1--;
            i = i1;
            j = k1;
            l = k;
            if (i1 == 0)
            {
                if (do_cr)
                {
                    i = k1 + 1;
                    abyte2[k1] = 13;
                } else
                {
                    i = k1;
                }
                abyte2[i] = 10;
                i1 = 19;
                j = i + 1;
                break MISSING_BLOCK_LABEL_185;
            }
              goto _L6
_L10:
            if (k - tailLen == l1 - 1)
            {
                if (tailLen > 0)
                {
                    abyte0 = tail;
                    k1 = 1;
                    l = abyte0[0];
                    i = k;
                    k = k1;
                } else
                {
                    l = abyte0[k];
                    i = k + 1;
                    k = 0;
                }
                l = (l & 0xff) << 4;
                tailLen = tailLen - k;
                k1 = j + 1;
                abyte2[j] = abyte1[l >> 6 & 0x3f];
                k = k1 + 1;
                abyte2[k1] = abyte1[l & 0x3f];
                j = k;
                if (do_padding)
                {
                    l = k + 1;
                    abyte2[k] = 61;
                    j = l + 1;
                    abyte2[l] = 61;
                }
                if (do_newline)
                {
                    k = j;
                    if (do_cr)
                    {
                        abyte2[j] = 13;
                        k = j + 1;
                    }
                    j = k + 1;
                    abyte2[k] = 10;
                    l = i;
                    i = j;
                } else
                {
                    l = i;
                    i = j;
                }
            } else
            if (k - tailLen == l1 - 2)
            {
                if (tailLen > 1)
                {
                    abyte3 = tail;
                    i = 1;
                    k1 = abyte3[0];
                } else
                {
                    k1 = abyte0[k];
                    k++;
                    i = 0;
                }
                if (tailLen > 0)
                {
                    byte0 = tail[i];
                    i++;
                    l = k;
                    k = byte0;
                } else
                {
                    byte0 = abyte0[k];
                    l = k + 1;
                    k = byte0;
                }
                k = (k & 0xff) << 2 | (k1 & 0xff) << 10;
                tailLen = tailLen - i;
                i = j + 1;
                abyte2[j] = abyte1[k >> 12 & 0x3f];
                j = i + 1;
                abyte2[i] = abyte1[k >> 6 & 0x3f];
                i = j + 1;
                abyte2[j] = abyte1[k & 0x3f];
                if (do_padding)
                {
                    j = i + 1;
                    abyte2[i] = 61;
                    i = j;
                }
                if (do_newline)
                {
                    j = i;
                    if (do_cr)
                    {
                        abyte2[i] = 13;
                        j = i + 1;
                    }
                    i = j + 1;
                    abyte2[j] = 10;
                }
            } else
            {
                l = k;
                i = j;
                if (do_newline)
                {
                    l = k;
                    i = j;
                    if (j > 0)
                    {
                        l = k;
                        i = j;
                        if (i1 != 19)
                        {
                            if (do_cr)
                            {
                                i = j + 1;
                                abyte2[j] = 13;
                            } else
                            {
                                i = j;
                            }
                            j = i + 1;
                            abyte2[i] = 10;
                            l = k;
                            i = j;
                        }
                    }
                }
            }
            if (!$assertionsDisabled && tailLen != 0)
            {
                throw new AssertionError();
            }
            k1 = i;
            if (!$assertionsDisabled)
            {
                k1 = i;
                if (l != l1)
                {
                    throw new AssertionError();
                }
            }
              goto _L15
_L11:
            if (k != l1 - 1) goto _L17; else goto _L16
_L16:
            abyte1 = tail;
            i = tailLen;
            tailLen = i + 1;
            abyte1[i] = abyte0[k];
            k1 = j;
_L15:
            op = k1;
            count = i1;
            return true;
_L17:
            k1 = j;
            if (k == l1 - 2)
            {
                abyte1 = tail;
                i = tailLen;
                tailLen = i + 1;
                abyte1[i] = abyte0[k];
                abyte1 = tail;
                i = tailLen;
                tailLen = i + 1;
                abyte1[i] = abyte0[k + 1];
                k1 = j;
            }
            if (true) goto _L15; else goto _L6
_L6:
            k = l;
            i1 = i;
            break MISSING_BLOCK_LABEL_185;
        }

        static 
        {
            boolean flag;
            if (!com/admarvel/android/util/Base64.desiredAssertionStatus())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            $assertionsDisabled = flag;
        }

        public Encoder(int i, byte abyte0[])
        {
            boolean flag1 = true;
            super();
            output = abyte0;
            boolean flag;
            if ((i & 1) == 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            do_padding = flag;
            if ((i & 2) == 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            do_newline = flag;
            if ((i & 4) != 0)
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
            do_cr = flag;
            if ((i & 8) == 0)
            {
                abyte0 = ENCODE;
            } else
            {
                abyte0 = ENCODE_WEBSAFE;
            }
            alphabet = abyte0;
            tailLen = 0;
            if (do_newline)
            {
                i = 19;
            } else
            {
                i = -1;
            }
            count = i;
        }
    }


    static final boolean $assertionsDisabled;
    public static final int CRLF = 4;
    public static final int DEFAULT = 0;
    public static final int NO_CLOSE = 16;
    public static final int NO_PADDING = 1;
    public static final int NO_WRAP = 2;
    public static final int URL_SAFE = 8;

    private Base64()
    {
    }

    public static byte[] decode(String s, int i)
    {
        return decode(s.getBytes(), i);
    }

    public static byte[] decode(byte abyte0[], int i)
    {
        return decode(abyte0, 0, abyte0.length, i);
    }

    public static byte[] decode(byte abyte0[], int i, int j, int k)
    {
        Decoder decoder = new Decoder(k, new byte[(j * 3) / 4]);
        if (!decoder.process(abyte0, i, j, true))
        {
            throw new IllegalArgumentException("bad base-64");
        }
        if (decoder.op == decoder.output.length)
        {
            return decoder.output;
        } else
        {
            abyte0 = new byte[decoder.op];
            System.arraycopy(decoder.output, 0, abyte0, 0, decoder.op);
            return abyte0;
        }
    }

    public static byte[] encode(byte abyte0[], int i)
    {
        return encode(abyte0, 0, abyte0.length, i);
    }

    public static byte[] encode(byte abyte0[], int i, int j, int k)
    {
        Encoder encoder;
        int l;
        encoder = new Encoder(k, null);
        l = (j / 3) * 4;
        if (!encoder.do_padding) goto _L2; else goto _L1
_L1:
        k = l;
        if (j % 3 > 0)
        {
            k = l + 4;
        }
_L4:
        l = k;
        if (encoder.do_newline)
        {
            l = k;
            if (j > 0)
            {
                int i1 = (j - 1) / 57;
                if (encoder.do_cr)
                {
                    l = 2;
                } else
                {
                    l = 1;
                }
                l = k + l * (i1 + 1);
            }
        }
        encoder.output = new byte[l];
        encoder.process(abyte0, i, j, true);
        if (!$assertionsDisabled && encoder.op != l)
        {
            throw new AssertionError();
        } else
        {
            return encoder.output;
        }
_L2:
        k = l;
        switch (j % 3)
        {
        default:
            k = l;
            break;

        case 1: // '\001'
            k = l + 2;
            break;

        case 2: // '\002'
            k = l + 3;
            break;

        case 0: // '\0'
            break;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static String encodeToString(byte abyte0[], int i)
    {
        try
        {
            abyte0 = new String(encode(abyte0, i), "US-ASCII");
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new AssertionError(abyte0);
        }
        return abyte0;
    }

    public static String encodeToString(byte abyte0[], int i, int j, int k)
    {
        try
        {
            abyte0 = new String(encode(abyte0, i, j, k), "US-ASCII");
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new AssertionError(abyte0);
        }
        return abyte0;
    }

    static 
    {
        boolean flag;
        if (!com/admarvel/android/util/Base64.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
