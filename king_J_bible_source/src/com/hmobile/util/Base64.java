// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.hmobile.util;


// Referenced classes of package com.hmobile.util:
//            Base64DecoderException

public class Base64
{

    static final boolean $assertionsDisabled;
    private static final byte ALPHABET[] = {
        65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 
        75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 
        85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 
        101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 
        111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 
        121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 
        56, 57, 43, 47
    };
    private static final byte DECODABET[];
    public static final boolean DECODE = false;
    public static final boolean ENCODE = true;
    private static final byte EQUALS_SIGN = 61;
    private static final byte EQUALS_SIGN_ENC = -1;
    private static final byte NEW_LINE = 10;
    private static final byte WEBSAFE_ALPHABET[] = {
        65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 
        75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 
        85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 
        101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 
        111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 
        121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 
        56, 57, 45, 95
    };
    private static final byte WEBSAFE_DECODABET[];
    private static final byte WHITE_SPACE_ENC = -5;

    private Base64()
    {
    }

    public static byte[] decode(String s)
        throws Base64DecoderException
    {
        s = s.getBytes();
        return decode(((byte []) (s)), 0, s.length);
    }

    public static byte[] decode(byte abyte0[])
        throws Base64DecoderException
    {
        return decode(abyte0, 0, abyte0.length);
    }

    public static byte[] decode(byte abyte0[], int i, int j)
        throws Base64DecoderException
    {
        return decode(abyte0, i, j, DECODABET);
    }

    public static byte[] decode(byte abyte0[], int i, int j, byte abyte1[])
        throws Base64DecoderException
    {
        byte abyte2[];
        byte abyte3[];
        int k;
        int l;
        int i1;
        abyte2 = new byte[(j * 3) / 4 + 2];
        l = 0;
        abyte3 = new byte[4];
        i1 = 0;
        k = 0;
        break MISSING_BLOCK_LABEL_25;
        int k1 = k + 1;
        abyte3[k] = byte0;
        k = k1;
        j1 = l;
        if (k1 == 4)
        {
            j1 = l + decode4to3(abyte3, 0, abyte2, l, abyte1);
            k = 0;
        }
_L1:
        i1++;
        l = j1;
        int j1;
label0:
        {
            if (i1 < j)
            {
                byte byte0 = (byte)(abyte0[i1 + i] & 0x7f);
                j1 = abyte1[byte0];
                if (j1 >= -5)
                {
label1:
                    {
                        if (j1 < -1)
                        {
                            break label0;
                        }
                        if (byte0 != 61)
                        {
                            break label1;
                        }
                        j1 = j - i1;
                        i = (byte)(abyte0[(j - 1) + i] & 0x7f);
                        if (k == 0 || k == 1)
                        {
                            throw new Base64DecoderException((new StringBuilder("invalid padding byte '=' at byte offset ")).append(i1).toString());
                        }
                        if (k == 3 && j1 > 2 || k == 4 && j1 > 1)
                        {
                            throw new Base64DecoderException((new StringBuilder("padding byte '=' falsely signals end of encoded value at offset ")).append(i1).toString());
                        }
                        if (i != 61 && i != 10)
                        {
                            throw new Base64DecoderException("encoded value has invalid trailing byte");
                        }
                    }
                } else
                {
                    throw new Base64DecoderException((new StringBuilder("Bad Base64 input character at ")).append(i1).append(": ").append(abyte0[i1 + i]).append("(decimal)").toString());
                }
            }
            if (k != 0)
            {
                if (k == 1)
                {
                    throw new Base64DecoderException((new StringBuilder("single trailing character at offset ")).append(j - 1).toString());
                }
                abyte3[k] = 61;
                l += decode4to3(abyte3, 0, abyte2, l, abyte1);
            }
            abyte0 = new byte[l];
            System.arraycopy(abyte2, 0, abyte0, 0, l);
            return abyte0;
        }
        j1 = l;
          goto _L1
    }

    private static int decode4to3(byte abyte0[], int i, byte abyte1[], int j, byte abyte2[])
    {
        if (abyte0[i + 2] == 61)
        {
            abyte1[j] = (byte)(((abyte2[abyte0[i]] << 24) >>> 6 | (abyte2[abyte0[i + 1]] << 24) >>> 12) >>> 16);
            return 1;
        }
        if (abyte0[i + 3] == 61)
        {
            i = (abyte2[abyte0[i]] << 24) >>> 6 | (abyte2[abyte0[i + 1]] << 24) >>> 12 | (abyte2[abyte0[i + 2]] << 24) >>> 18;
            abyte1[j] = (byte)(i >>> 16);
            abyte1[j + 1] = (byte)(i >>> 8);
            return 2;
        } else
        {
            i = (abyte2[abyte0[i]] << 24) >>> 6 | (abyte2[abyte0[i + 1]] << 24) >>> 12 | (abyte2[abyte0[i + 2]] << 24) >>> 18 | (abyte2[abyte0[i + 3]] << 24) >>> 24;
            abyte1[j] = (byte)(i >> 16);
            abyte1[j + 1] = (byte)(i >> 8);
            abyte1[j + 2] = (byte)i;
            return 3;
        }
    }

    public static byte[] decodeWebSafe(String s)
        throws Base64DecoderException
    {
        s = s.getBytes();
        return decodeWebSafe(((byte []) (s)), 0, s.length);
    }

    public static byte[] decodeWebSafe(byte abyte0[])
        throws Base64DecoderException
    {
        return decodeWebSafe(abyte0, 0, abyte0.length);
    }

    public static byte[] decodeWebSafe(byte abyte0[], int i, int j)
        throws Base64DecoderException
    {
        return decode(abyte0, i, j, WEBSAFE_DECODABET);
    }

    public static String encode(byte abyte0[])
    {
        return encode(abyte0, 0, abyte0.length, ALPHABET, true);
    }

    public static String encode(byte abyte0[], int i, int j, byte abyte1[], boolean flag)
    {
        abyte0 = encode(abyte0, i, j, abyte1, 0x7fffffff);
        do
        {
            for (i = abyte0.length; flag || i <= 0 || abyte0[i - 1] != 61;)
            {
                return new String(abyte0, 0, i);
            }

            i--;
        } while (true);
    }

    public static byte[] encode(byte abyte0[], int i, int j, byte abyte1[], int k)
    {
        int l = ((j + 2) / 3) * 4;
        byte abyte2[] = new byte[l / k + l];
        int j1 = 0;
        l = 0;
        int i1 = 0;
        do
        {
            if (j1 >= j - 2)
            {
                int k1 = l;
                if (j1 < j)
                {
                    encode3to4(abyte0, j1 + i, j - j1, abyte2, l, abyte1);
                    i = l;
                    if (i1 + 4 == k)
                    {
                        abyte2[l + 4] = 10;
                        i = l + 1;
                    }
                    k1 = i + 4;
                }
                int l1;
                if (!$assertionsDisabled && k1 != abyte2.length)
                {
                    throw new AssertionError();
                } else
                {
                    return abyte2;
                }
            }
            k1 = (abyte0[j1 + i] << 24) >>> 8 | (abyte0[j1 + 1 + i] << 24) >>> 16 | (abyte0[j1 + 2 + i] << 24) >>> 24;
            abyte2[l] = abyte1[k1 >>> 18];
            abyte2[l + 1] = abyte1[k1 >>> 12 & 0x3f];
            abyte2[l + 2] = abyte1[k1 >>> 6 & 0x3f];
            abyte2[l + 3] = abyte1[k1 & 0x3f];
            l1 = i1 + 4;
            k1 = l;
            i1 = l1;
            if (l1 == k)
            {
                abyte2[l + 4] = 10;
                k1 = l + 1;
                i1 = 0;
            }
            j1 += 3;
            l = k1 + 4;
        } while (true);
    }

    private static byte[] encode3to4(byte abyte0[], int i, int j, byte abyte1[], int k, byte abyte2[])
    {
        int j1 = 0;
        int l;
        int i1;
        if (j > 0)
        {
            l = (abyte0[i] << 24) >>> 8;
        } else
        {
            l = 0;
        }
        if (j > 1)
        {
            i1 = (abyte0[i + 1] << 24) >>> 16;
        } else
        {
            i1 = 0;
        }
        if (j > 2)
        {
            j1 = (abyte0[i + 2] << 24) >>> 24;
        }
        i = i1 | l | j1;
        switch (j)
        {
        default:
            return abyte1;

        case 3: // '\003'
            abyte1[k] = abyte2[i >>> 18];
            abyte1[k + 1] = abyte2[i >>> 12 & 0x3f];
            abyte1[k + 2] = abyte2[i >>> 6 & 0x3f];
            abyte1[k + 3] = abyte2[i & 0x3f];
            return abyte1;

        case 2: // '\002'
            abyte1[k] = abyte2[i >>> 18];
            abyte1[k + 1] = abyte2[i >>> 12 & 0x3f];
            abyte1[k + 2] = abyte2[i >>> 6 & 0x3f];
            abyte1[k + 3] = 61;
            return abyte1;

        case 1: // '\001'
            abyte1[k] = abyte2[i >>> 18];
            abyte1[k + 1] = abyte2[i >>> 12 & 0x3f];
            abyte1[k + 2] = 61;
            abyte1[k + 3] = 61;
            return abyte1;
        }
    }

    public static String encodeWebSafe(byte abyte0[], boolean flag)
    {
        return encode(abyte0, 0, abyte0.length, WEBSAFE_ALPHABET, flag);
    }

    static 
    {
        byte abyte0[];
        boolean flag;
        if (!com/hmobile/util/Base64.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
        abyte0 = new byte[128];
        abyte0[0] = -9;
        abyte0[1] = -9;
        abyte0[2] = -9;
        abyte0[3] = -9;
        abyte0[4] = -9;
        abyte0[5] = -9;
        abyte0[6] = -9;
        abyte0[7] = -9;
        abyte0[8] = -9;
        abyte0[9] = -5;
        abyte0[10] = -5;
        abyte0[11] = -9;
        abyte0[12] = -9;
        abyte0[13] = -5;
        abyte0[14] = -9;
        abyte0[15] = -9;
        abyte0[16] = -9;
        abyte0[17] = -9;
        abyte0[18] = -9;
        abyte0[19] = -9;
        abyte0[20] = -9;
        abyte0[21] = -9;
        abyte0[22] = -9;
        abyte0[23] = -9;
        abyte0[24] = -9;
        abyte0[25] = -9;
        abyte0[26] = -9;
        abyte0[27] = -9;
        abyte0[28] = -9;
        abyte0[29] = -9;
        abyte0[30] = -9;
        abyte0[31] = -9;
        abyte0[32] = -5;
        abyte0[33] = -9;
        abyte0[34] = -9;
        abyte0[35] = -9;
        abyte0[36] = -9;
        abyte0[37] = -9;
        abyte0[38] = -9;
        abyte0[39] = -9;
        abyte0[40] = -9;
        abyte0[41] = -9;
        abyte0[42] = -9;
        abyte0[43] = 62;
        abyte0[44] = -9;
        abyte0[45] = -9;
        abyte0[46] = -9;
        abyte0[47] = 63;
        abyte0[48] = 52;
        abyte0[49] = 53;
        abyte0[50] = 54;
        abyte0[51] = 55;
        abyte0[52] = 56;
        abyte0[53] = 57;
        abyte0[54] = 58;
        abyte0[55] = 59;
        abyte0[56] = 60;
        abyte0[57] = 61;
        abyte0[58] = -9;
        abyte0[59] = -9;
        abyte0[60] = -9;
        abyte0[61] = -1;
        abyte0[62] = -9;
        abyte0[63] = -9;
        abyte0[64] = -9;
        abyte0[66] = 1;
        abyte0[67] = 2;
        abyte0[68] = 3;
        abyte0[69] = 4;
        abyte0[70] = 5;
        abyte0[71] = 6;
        abyte0[72] = 7;
        abyte0[73] = 8;
        abyte0[74] = 9;
        abyte0[75] = 10;
        abyte0[76] = 11;
        abyte0[77] = 12;
        abyte0[78] = 13;
        abyte0[79] = 14;
        abyte0[80] = 15;
        abyte0[81] = 16;
        abyte0[82] = 17;
        abyte0[83] = 18;
        abyte0[84] = 19;
        abyte0[85] = 20;
        abyte0[86] = 21;
        abyte0[87] = 22;
        abyte0[88] = 23;
        abyte0[89] = 24;
        abyte0[90] = 25;
        abyte0[91] = -9;
        abyte0[92] = -9;
        abyte0[93] = -9;
        abyte0[94] = -9;
        abyte0[95] = -9;
        abyte0[96] = -9;
        abyte0[97] = 26;
        abyte0[98] = 27;
        abyte0[99] = 28;
        abyte0[100] = 29;
        abyte0[101] = 30;
        abyte0[102] = 31;
        abyte0[103] = 32;
        abyte0[104] = 33;
        abyte0[105] = 34;
        abyte0[106] = 35;
        abyte0[107] = 36;
        abyte0[108] = 37;
        abyte0[109] = 38;
        abyte0[110] = 39;
        abyte0[111] = 40;
        abyte0[112] = 41;
        abyte0[113] = 42;
        abyte0[114] = 43;
        abyte0[115] = 44;
        abyte0[116] = 45;
        abyte0[117] = 46;
        abyte0[118] = 47;
        abyte0[119] = 48;
        abyte0[120] = 49;
        abyte0[121] = 50;
        abyte0[122] = 51;
        abyte0[123] = -9;
        abyte0[124] = -9;
        abyte0[125] = -9;
        abyte0[126] = -9;
        abyte0[127] = -9;
        DECODABET = abyte0;
        abyte0 = new byte[128];
        abyte0[0] = -9;
        abyte0[1] = -9;
        abyte0[2] = -9;
        abyte0[3] = -9;
        abyte0[4] = -9;
        abyte0[5] = -9;
        abyte0[6] = -9;
        abyte0[7] = -9;
        abyte0[8] = -9;
        abyte0[9] = -5;
        abyte0[10] = -5;
        abyte0[11] = -9;
        abyte0[12] = -9;
        abyte0[13] = -5;
        abyte0[14] = -9;
        abyte0[15] = -9;
        abyte0[16] = -9;
        abyte0[17] = -9;
        abyte0[18] = -9;
        abyte0[19] = -9;
        abyte0[20] = -9;
        abyte0[21] = -9;
        abyte0[22] = -9;
        abyte0[23] = -9;
        abyte0[24] = -9;
        abyte0[25] = -9;
        abyte0[26] = -9;
        abyte0[27] = -9;
        abyte0[28] = -9;
        abyte0[29] = -9;
        abyte0[30] = -9;
        abyte0[31] = -9;
        abyte0[32] = -5;
        abyte0[33] = -9;
        abyte0[34] = -9;
        abyte0[35] = -9;
        abyte0[36] = -9;
        abyte0[37] = -9;
        abyte0[38] = -9;
        abyte0[39] = -9;
        abyte0[40] = -9;
        abyte0[41] = -9;
        abyte0[42] = -9;
        abyte0[43] = -9;
        abyte0[44] = -9;
        abyte0[45] = 62;
        abyte0[46] = -9;
        abyte0[47] = -9;
        abyte0[48] = 52;
        abyte0[49] = 53;
        abyte0[50] = 54;
        abyte0[51] = 55;
        abyte0[52] = 56;
        abyte0[53] = 57;
        abyte0[54] = 58;
        abyte0[55] = 59;
        abyte0[56] = 60;
        abyte0[57] = 61;
        abyte0[58] = -9;
        abyte0[59] = -9;
        abyte0[60] = -9;
        abyte0[61] = -1;
        abyte0[62] = -9;
        abyte0[63] = -9;
        abyte0[64] = -9;
        abyte0[66] = 1;
        abyte0[67] = 2;
        abyte0[68] = 3;
        abyte0[69] = 4;
        abyte0[70] = 5;
        abyte0[71] = 6;
        abyte0[72] = 7;
        abyte0[73] = 8;
        abyte0[74] = 9;
        abyte0[75] = 10;
        abyte0[76] = 11;
        abyte0[77] = 12;
        abyte0[78] = 13;
        abyte0[79] = 14;
        abyte0[80] = 15;
        abyte0[81] = 16;
        abyte0[82] = 17;
        abyte0[83] = 18;
        abyte0[84] = 19;
        abyte0[85] = 20;
        abyte0[86] = 21;
        abyte0[87] = 22;
        abyte0[88] = 23;
        abyte0[89] = 24;
        abyte0[90] = 25;
        abyte0[91] = -9;
        abyte0[92] = -9;
        abyte0[93] = -9;
        abyte0[94] = -9;
        abyte0[95] = 63;
        abyte0[96] = -9;
        abyte0[97] = 26;
        abyte0[98] = 27;
        abyte0[99] = 28;
        abyte0[100] = 29;
        abyte0[101] = 30;
        abyte0[102] = 31;
        abyte0[103] = 32;
        abyte0[104] = 33;
        abyte0[105] = 34;
        abyte0[106] = 35;
        abyte0[107] = 36;
        abyte0[108] = 37;
        abyte0[109] = 38;
        abyte0[110] = 39;
        abyte0[111] = 40;
        abyte0[112] = 41;
        abyte0[113] = 42;
        abyte0[114] = 43;
        abyte0[115] = 44;
        abyte0[116] = 45;
        abyte0[117] = 46;
        abyte0[118] = 47;
        abyte0[119] = 48;
        abyte0[120] = 49;
        abyte0[121] = 50;
        abyte0[122] = 51;
        abyte0[123] = -9;
        abyte0[124] = -9;
        abyte0[125] = -9;
        abyte0[126] = -9;
        abyte0[127] = -9;
        WEBSAFE_DECODABET = abyte0;
    }
}
