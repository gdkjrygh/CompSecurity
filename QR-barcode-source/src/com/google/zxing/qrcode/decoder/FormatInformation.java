// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.qrcode.decoder;


// Referenced classes of package com.google.zxing.qrcode.decoder:
//            ErrorCorrectionLevel

final class FormatInformation
{

    private static final int BITS_SET_IN_HALF_BYTE[] = {
        0, 1, 1, 2, 1, 2, 2, 3, 1, 2, 
        2, 3, 2, 3, 3, 4
    };
    private static final int FORMAT_INFO_DECODE_LOOKUP[][];
    private static final int FORMAT_INFO_MASK_QR = 21522;
    private final byte dataMask;
    private final ErrorCorrectionLevel errorCorrectionLevel;

    private FormatInformation(int i)
    {
        errorCorrectionLevel = ErrorCorrectionLevel.forBits(i >> 3 & 3);
        dataMask = (byte)(i & 7);
    }

    static FormatInformation decodeFormatInformation(int i, int j)
    {
        FormatInformation formatinformation = doDecodeFormatInformation(i, j);
        if (formatinformation != null)
        {
            return formatinformation;
        } else
        {
            return doDecodeFormatInformation(i ^ 0x5412, j ^ 0x5412);
        }
    }

    private static FormatInformation doDecodeFormatInformation(int i, int j)
    {
        int l = 0x7fffffff;
        int ai[][] = FORMAT_INFO_DECODE_LOOKUP;
        int k1 = ai.length;
        int i1 = 0;
        int k = 0;
        for (; i1 < k1; i1++)
        {
            int ai1[] = ai[i1];
            int l1 = ai1[0];
            if (l1 == i || l1 == j)
            {
                return new FormatInformation(ai1[1]);
            }
            int j1 = numBitsDiffering(i, l1);
            if (j1 < l)
            {
                k = ai1[1];
                l = j1;
            }
            if (i == j)
            {
                continue;
            }
            j1 = numBitsDiffering(j, l1);
            if (j1 < l)
            {
                k = ai1[1];
                l = j1;
            }
        }

        if (l <= 3)
        {
            return new FormatInformation(k);
        } else
        {
            return null;
        }
    }

    static int numBitsDiffering(int i, int j)
    {
        i ^= j;
        j = BITS_SET_IN_HALF_BYTE[i & 0xf];
        int k = BITS_SET_IN_HALF_BYTE[i >>> 4 & 0xf];
        int l = BITS_SET_IN_HALF_BYTE[i >>> 8 & 0xf];
        int i1 = BITS_SET_IN_HALF_BYTE[i >>> 12 & 0xf];
        int j1 = BITS_SET_IN_HALF_BYTE[i >>> 16 & 0xf];
        int k1 = BITS_SET_IN_HALF_BYTE[i >>> 20 & 0xf];
        int l1 = BITS_SET_IN_HALF_BYTE[i >>> 24 & 0xf];
        return BITS_SET_IN_HALF_BYTE[i >>> 28 & 0xf] + (j + k + l + i1 + j1 + k1 + l1);
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof FormatInformation)
        {
            if (errorCorrectionLevel == ((FormatInformation) (obj = (FormatInformation)obj)).errorCorrectionLevel && dataMask == ((FormatInformation) (obj)).dataMask)
            {
                return true;
            }
        }
        return false;
    }

    byte getDataMask()
    {
        return dataMask;
    }

    ErrorCorrectionLevel getErrorCorrectionLevel()
    {
        return errorCorrectionLevel;
    }

    public int hashCode()
    {
        return errorCorrectionLevel.ordinal() << 3 | dataMask;
    }

    static 
    {
        int ai[] = {
            23371, 3
        };
        int ai1[] = {
            17913, 4
        };
        int ai2[] = {
            29427, 9
        };
        int ai3[] = {
            30877, 11
        };
        int ai4[] = {
            26159, 12
        };
        int ai5[] = {
            27713, 14
        };
        int ai6[] = {
            7399, 18
        };
        int ai7[] = {
            13663, 24
        };
        int ai8[] = {
            14854, 27
        };
        int ai9[] = {
            9396, 28
        };
        int ai10[] = {
            11994, 30
        };
        FORMAT_INFO_DECODE_LOOKUP = (new int[][] {
            new int[] {
                21522, 0
            }, new int[] {
                20773, 1
            }, new int[] {
                24188, 2
            }, ai, ai1, new int[] {
                16590, 5
            }, new int[] {
                20375, 6
            }, new int[] {
                19104, 7
            }, new int[] {
                30660, 8
            }, ai2, new int[] {
                32170, 10
            }, ai3, ai4, new int[] {
                25368, 13
            }, ai5, new int[] {
                26998, 15
            }, new int[] {
                5769, 16
            }, new int[] {
                5054, 17
            }, ai6, new int[] {
                6608, 19
            }, new int[] {
                1890, 20
            }, new int[] {
                597, 21
            }, new int[] {
                3340, 22
            }, new int[] {
                2107, 23
            }, ai7, new int[] {
                12392, 25
            }, new int[] {
                16177, 26
            }, ai8, ai9, new int[] {
                8579, 29
            }, ai10, new int[] {
                11245, 31
            }
        });
    }
}
