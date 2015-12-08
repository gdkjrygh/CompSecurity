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
        int j1 = 0x7fffffff;
        int l = 0;
        int ai[][] = FORMAT_INFO_DECODE_LOOKUP;
        int i2 = ai.length;
        for (int k1 = 0; k1 < i2;)
        {
            int ai1[] = ai[k1];
            int l1 = ai1[0];
            if (l1 == i || l1 == j)
            {
                return new FormatInformation(ai1[1]);
            }
            int i1 = numBitsDiffering(i, l1);
            int k = j1;
            if (i1 < j1)
            {
                l = ai1[1];
                k = i1;
            }
            j1 = k;
            i1 = l;
            if (i != j)
            {
                l1 = numBitsDiffering(j, l1);
                j1 = k;
                i1 = l;
                if (l1 < k)
                {
                    i1 = ai1[1];
                    j1 = l1;
                }
            }
            k1++;
            l = i1;
        }

        if (j1 <= 3)
        {
            return new FormatInformation(l);
        } else
        {
            return null;
        }
    }

    static int numBitsDiffering(int i, int j)
    {
        i ^= j;
        return BITS_SET_IN_HALF_BYTE[i & 0xf] + BITS_SET_IN_HALF_BYTE[i >>> 4 & 0xf] + BITS_SET_IN_HALF_BYTE[i >>> 8 & 0xf] + BITS_SET_IN_HALF_BYTE[i >>> 12 & 0xf] + BITS_SET_IN_HALF_BYTE[i >>> 16 & 0xf] + BITS_SET_IN_HALF_BYTE[i >>> 20 & 0xf] + BITS_SET_IN_HALF_BYTE[i >>> 24 & 0xf] + BITS_SET_IN_HALF_BYTE[i >>> 28 & 0xf];
    }

    public final boolean equals(Object obj)
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

    final byte getDataMask()
    {
        return dataMask;
    }

    final ErrorCorrectionLevel getErrorCorrectionLevel()
    {
        return errorCorrectionLevel;
    }

    public final int hashCode()
    {
        return errorCorrectionLevel.ordinal() << 3 | dataMask;
    }

    static 
    {
        int ai[] = {
            21522, 0
        };
        int ai1[] = {
            20773, 1
        };
        int ai2[] = {
            23371, 3
        };
        int ai3[] = {
            17913, 4
        };
        int ai4[] = {
            16590, 5
        };
        int ai5[] = {
            20375, 6
        };
        int ai6[] = {
            19104, 7
        };
        int ai7[] = {
            29427, 9
        };
        int ai8[] = {
            32170, 10
        };
        int ai9[] = {
            30877, 11
        };
        int ai10[] = {
            26159, 12
        };
        int ai11[] = {
            25368, 13
        };
        int ai12[] = {
            27713, 14
        };
        int ai13[] = {
            26998, 15
        };
        int ai14[] = {
            5769, 16
        };
        int ai15[] = {
            5054, 17
        };
        int ai16[] = {
            7399, 18
        };
        int ai17[] = {
            6608, 19
        };
        int ai18[] = {
            1890, 20
        };
        int ai19[] = {
            597, 21
        };
        int ai20[] = {
            13663, 24
        };
        int ai21[] = {
            12392, 25
        };
        int ai22[] = {
            9396, 28
        };
        int ai23[] = {
            8579, 29
        };
        int ai24[] = {
            11994, 30
        };
        int ai25[] = {
            11245, 31
        };
        FORMAT_INFO_DECODE_LOOKUP = (new int[][] {
            ai, ai1, new int[] {
                24188, 2
            }, ai2, ai3, ai4, ai5, ai6, new int[] {
                30660, 8
            }, ai7, 
            ai8, ai9, ai10, ai11, ai12, ai13, ai14, ai15, ai16, ai17, 
            ai18, ai19, new int[] {
                3340, 22
            }, new int[] {
                2107, 23
            }, ai20, ai21, new int[] {
                16177, 26
            }, new int[] {
                14854, 27
            }, ai22, ai23, 
            ai24, ai25
        });
    }
}
