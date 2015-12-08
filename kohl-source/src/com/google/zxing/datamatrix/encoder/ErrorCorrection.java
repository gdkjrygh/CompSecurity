// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.datamatrix.encoder;


// Referenced classes of package com.google.zxing.datamatrix.encoder:
//            SymbolInfo

public final class ErrorCorrection
{

    private static final int ALOG[];
    private static final int FACTORS[][] = {
        {
            228, 48, 15, 111, 62
        }, {
            23, 68, 144, 134, 240, 92, 254
        }, {
            28, 24, 185, 166, 223, 248, 116, 255, 110, 61
        }, {
            175, 138, 205, 12, 194, 168, 39, 245, 60, 97, 
            120
        }, {
            41, 153, 158, 91, 61, 42, 142, 213, 97, 178, 
            100, 242
        }, {
            156, 97, 192, 252, 95, 9, 157, 119, 138, 45, 
            18, 186, 83, 185
        }, {
            83, 195, 100, 39, 188, 75, 66, 61, 241, 213, 
            109, 129, 94, 254, 225, 48, 90, 188
        }, {
            15, 195, 244, 9, 233, 71, 168, 2, 188, 160, 
            153, 145, 253, 79, 108, 82, 27, 174, 186, 172
        }, {
            52, 190, 88, 205, 109, 39, 176, 21, 155, 197, 
            251, 223, 155, 21, 5, 172, 254, 124, 12, 181, 
            184, 96, 50, 193
        }, {
            211, 231, 43, 97, 71, 96, 103, 174, 37, 151, 
            170, 53, 75, 34, 249, 121, 17, 138, 110, 213, 
            141, 136, 120, 151, 233, 168, 93, 255
        }, {
            245, 127, 242, 218, 130, 250, 162, 181, 102, 120, 
            84, 179, 220, 251, 80, 182, 229, 18, 2, 4, 
            68, 33, 101, 137, 95, 119, 115, 44, 175, 184, 
            59, 25, 225, 98, 81, 112
        }, {
            77, 193, 137, 31, 19, 38, 22, 153, 247, 105, 
            122, 2, 245, 133, 242, 8, 175, 95, 100, 9, 
            167, 105, 214, 111, 57, 121, 21, 1, 253, 57, 
            54, 101, 248, 202, 69, 50, 150, 177, 226, 5, 
            9, 5
        }, {
            245, 132, 172, 223, 96, 32, 117, 22, 238, 133, 
            238, 231, 205, 188, 237, 87, 191, 106, 16, 147, 
            118, 23, 37, 90, 170, 205, 131, 88, 120, 100, 
            66, 138, 186, 240, 82, 44, 176, 87, 187, 147, 
            160, 175, 69, 213, 92, 253, 225, 19
        }, {
            175, 9, 223, 238, 12, 17, 220, 208, 100, 29, 
            175, 170, 230, 192, 215, 235, 150, 159, 36, 223, 
            38, 200, 132, 54, 228, 146, 218, 234, 117, 203, 
            29, 232, 144, 238, 22, 150, 201, 117, 62, 207, 
            164, 13, 137, 245, 127, 67, 247, 28, 155, 43, 
            203, 107, 233, 53, 143, 46
        }, {
            242, 93, 169, 50, 144, 210, 39, 118, 202, 188, 
            201, 189, 143, 108, 196, 37, 185, 112, 134, 230, 
            245, 63, 197, 190, 250, 106, 185, 221, 175, 64, 
            114, 71, 161, 44, 147, 6, 27, 218, 51, 63, 
            87, 10, 40, 130, 188, 17, 163, 31, 176, 170, 
            4, 107, 232, 7, 94, 166, 224, 124, 86, 47, 
            11, 204
        }, {
            220, 228, 173, 89, 251, 149, 159, 56, 89, 33, 
            147, 244, 154, 36, 73, 127, 213, 136, 248, 180, 
            234, 197, 158, 177, 68, 122, 93, 213, 15, 160, 
            227, 236, 66, 139, 153, 185, 202, 167, 179, 25, 
            220, 232, 96, 210, 231, 136, 223, 239, 181, 241, 
            59, 52, 172, 25, 49, 232, 211, 189, 64, 54, 
            108, 153, 132, 63, 96, 103, 82, 186
        }
    };
    private static final int FACTOR_SETS[] = {
        5, 7, 10, 11, 12, 14, 18, 20, 24, 28, 
        36, 42, 48, 56, 62, 68
    };
    private static final int LOG[];
    private static final int MODULO_VALUE = 301;

    private ErrorCorrection()
    {
    }

    private static String createECCBlock(CharSequence charsequence, int i)
    {
        return createECCBlock(charsequence, 0, charsequence.length(), i);
    }

    private static String createECCBlock(CharSequence charsequence, int i, int j, int k)
    {
        byte byte0 = -1;
        int l = 0;
        int i1;
label0:
        do
        {
label1:
            {
                i1 = byte0;
                if (l < FACTOR_SETS.length)
                {
                    if (FACTOR_SETS[l] != k)
                    {
                        break label1;
                    }
                    i1 = l;
                }
                if (i1 < 0)
                {
                    throw new IllegalArgumentException((new StringBuilder()).append("Illegal number of error correction codewords specified: ").append(k).toString());
                }
                break label0;
            }
            l++;
        } while (true);
        int ai[] = FACTORS[i1];
        char ac[] = new char[k];
        for (l = 0; l < k; l++)
        {
            ac[l] = '\0';
        }

        l = i;
        while (l < i + j) 
        {
            int k1 = ac[k - 1] ^ charsequence.charAt(l);
            int j1 = k - 1;
            while (j1 > 0) 
            {
                if (k1 != 0 && ai[j1] != 0)
                {
                    ac[j1] = (char)(ac[j1 - 1] ^ ALOG[(LOG[k1] + LOG[ai[j1]]) % 255]);
                } else
                {
                    ac[j1] = ac[j1 - 1];
                }
                j1--;
            }
            if (k1 != 0 && ai[0] != 0)
            {
                ac[0] = (char)ALOG[(LOG[k1] + LOG[ai[0]]) % 255];
            } else
            {
                ac[0] = '\0';
            }
            l++;
        }
        charsequence = new char[k];
        for (i = 0; i < k; i++)
        {
            charsequence[i] = ac[k - i - 1];
        }

        return String.valueOf(charsequence);
    }

    public static String encodeECC200(String s, SymbolInfo symbolinfo)
    {
        if (s.length() != symbolinfo.getDataCapacity())
        {
            throw new IllegalArgumentException("The number of codewords does not match the selected symbol");
        }
        StringBuilder stringbuilder = new StringBuilder(symbolinfo.getDataCapacity() + symbolinfo.getErrorCodewords());
        stringbuilder.append(s);
        int j1 = symbolinfo.getInterleavedBlockCount();
        if (j1 == 1)
        {
            stringbuilder.append(createECCBlock(s, symbolinfo.getErrorCodewords()));
        } else
        {
            stringbuilder.setLength(stringbuilder.capacity());
            int ai[] = new int[j1];
            int ai1[] = new int[j1];
            int ai2[] = new int[j1];
            for (int i = 0; i < j1; i++)
            {
                ai[i] = symbolinfo.getDataLengthForInterleavedBlock(i + 1);
                ai1[i] = symbolinfo.getErrorLengthForInterleavedBlock(i + 1);
                ai2[i] = 0;
                if (i > 0)
                {
                    ai2[i] = ai2[i - 1] + ai[i];
                }
            }

            int j = 0;
            while (j < j1) 
            {
                Object obj = new StringBuilder(ai[j]);
                for (int k = j; k < symbolinfo.getDataCapacity(); k += j1)
                {
                    ((StringBuilder) (obj)).append(s.charAt(k));
                }

                obj = createECCBlock(((StringBuilder) (obj)).toString(), ai1[j]);
                int l = 0;
                for (int i1 = j; i1 < ai1[j] * j1;)
                {
                    stringbuilder.setCharAt(symbolinfo.getDataCapacity() + i1, ((String) (obj)).charAt(l));
                    i1 += j1;
                    l++;
                }

                j++;
            }
        }
        return stringbuilder.toString();
    }

    static 
    {
        LOG = new int[256];
        ALOG = new int[255];
        int i = 1;
        for (int j = 0; j < 255; j++)
        {
            ALOG[j] = i;
            LOG[i] = j;
            int k = i << 1;
            i = k;
            if (k >= 256)
            {
                i = k ^ 0x12d;
            }
        }

    }
}
