// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.qrcode.encoder;


// Referenced classes of package com.google.zxing.qrcode.encoder:
//            ByteMatrix

final class MaskUtil
{

    private static final int N1 = 3;
    private static final int N2 = 3;
    private static final int N3 = 40;
    private static final int N4 = 10;

    private MaskUtil()
    {
    }

    static int applyMaskPenaltyRule1(ByteMatrix bytematrix)
    {
        return applyMaskPenaltyRule1Internal(bytematrix, true) + applyMaskPenaltyRule1Internal(bytematrix, false);
    }

    private static int applyMaskPenaltyRule1Internal(ByteMatrix bytematrix, boolean flag)
    {
        int i;
        int l;
        int i1;
        int j1;
        if (flag)
        {
            l = bytematrix.getHeight();
        } else
        {
            l = bytematrix.getWidth();
        }
        if (flag)
        {
            i1 = bytematrix.getWidth();
        } else
        {
            i1 = bytematrix.getHeight();
        }
        bytematrix = bytematrix.getArray();
        j1 = 0;
        int j;
        for (i = 0; j1 < l; i = j)
        {
            j = -1;
            int k1 = 0;
            int l1 = 0;
            while (k1 < i1) 
            {
                int k;
                if (flag)
                {
                    k = bytematrix[j1][k1];
                } else
                {
                    k = bytematrix[k1][j1];
                }
                if (k == j)
                {
                    k = l1 + 1;
                } else
                {
                    j = i;
                    if (l1 >= 5)
                    {
                        j = i + ((l1 - 5) + 3);
                    }
                    l1 = 1;
                    i = j;
                    j = k;
                    k = l1;
                }
                k1++;
                l1 = k;
            }
            j = i;
            if (l1 >= 5)
            {
                j = i + ((l1 - 5) + 3);
            }
            j1++;
        }

        return i;
    }

    static int applyMaskPenaltyRule2(ByteMatrix bytematrix)
    {
        byte abyte0[][] = bytematrix.getArray();
        int i1 = bytematrix.getWidth();
        int j1 = bytematrix.getHeight();
        int i = 0;
        int j = 0;
        for (; i < j1 - 1; i++)
        {
            for (int k = 0; k < i1 - 1;)
            {
                byte byte0 = abyte0[i][k];
                int l = j;
                if (byte0 == abyte0[i][k + 1])
                {
                    l = j;
                    if (byte0 == abyte0[i + 1][k])
                    {
                        l = j;
                        if (byte0 == abyte0[i + 1][k + 1])
                        {
                            l = j + 1;
                        }
                    }
                }
                k++;
                j = l;
            }

        }

        return j * 3;
    }

    static int applyMaskPenaltyRule3(ByteMatrix bytematrix)
    {
        byte abyte0[][] = bytematrix.getArray();
        int i1 = bytematrix.getWidth();
        int j1 = bytematrix.getHeight();
        int k = 0;
        int i = 0;
        do
        {
            if (k >= j1)
            {
                break;
            }
            for (int l = 0; l < i1; l++)
            {
                int j;
label0:
                {
                    j = i;
                    if (l + 6 >= i1)
                    {
                        break label0;
                    }
                    j = i;
                    if (abyte0[k][l] != 1)
                    {
                        break label0;
                    }
                    j = i;
                    if (abyte0[k][l + 1] != 0)
                    {
                        break label0;
                    }
                    j = i;
                    if (abyte0[k][l + 2] != 1)
                    {
                        break label0;
                    }
                    j = i;
                    if (abyte0[k][l + 3] != 1)
                    {
                        break label0;
                    }
                    j = i;
                    if (abyte0[k][l + 4] != 1)
                    {
                        break label0;
                    }
                    j = i;
                    if (abyte0[k][l + 5] != 0)
                    {
                        break label0;
                    }
                    j = i;
                    if (abyte0[k][l + 6] != 1)
                    {
                        break label0;
                    }
                    if (l + 10 >= i1 || abyte0[k][l + 7] != 0 || abyte0[k][l + 8] != 0 || abyte0[k][l + 9] != 0 || abyte0[k][l + 10] != 0)
                    {
                        j = i;
                        if (l - 4 < 0)
                        {
                            break label0;
                        }
                        j = i;
                        if (abyte0[k][l - 1] != 0)
                        {
                            break label0;
                        }
                        j = i;
                        if (abyte0[k][l - 2] != 0)
                        {
                            break label0;
                        }
                        j = i;
                        if (abyte0[k][l - 3] != 0)
                        {
                            break label0;
                        }
                        j = i;
                        if (abyte0[k][l - 4] != 0)
                        {
                            break label0;
                        }
                    }
                    j = i + 40;
                }
                i = j;
                if (k + 6 >= j1)
                {
                    continue;
                }
                i = j;
                if (abyte0[k][l] != 1)
                {
                    continue;
                }
                i = j;
                if (abyte0[k + 1][l] != 0)
                {
                    continue;
                }
                i = j;
                if (abyte0[k + 2][l] != 1)
                {
                    continue;
                }
                i = j;
                if (abyte0[k + 3][l] != 1)
                {
                    continue;
                }
                i = j;
                if (abyte0[k + 4][l] != 1)
                {
                    continue;
                }
                i = j;
                if (abyte0[k + 5][l] != 0)
                {
                    continue;
                }
                i = j;
                if (abyte0[k + 6][l] != 1)
                {
                    continue;
                }
                if (k + 10 >= j1 || abyte0[k + 7][l] != 0 || abyte0[k + 8][l] != 0 || abyte0[k + 9][l] != 0 || abyte0[k + 10][l] != 0)
                {
                    i = j;
                    if (k - 4 < 0)
                    {
                        continue;
                    }
                    i = j;
                    if (abyte0[k - 1][l] != 0)
                    {
                        continue;
                    }
                    i = j;
                    if (abyte0[k - 2][l] != 0)
                    {
                        continue;
                    }
                    i = j;
                    if (abyte0[k - 3][l] != 0)
                    {
                        continue;
                    }
                    i = j;
                    if (abyte0[k - 4][l] != 0)
                    {
                        continue;
                    }
                }
                i = j + 40;
            }

            k++;
        } while (true);
        return i;
    }

    static int applyMaskPenaltyRule4(ByteMatrix bytematrix)
    {
        byte abyte0[][] = bytematrix.getArray();
        int j1 = bytematrix.getWidth();
        int k1 = bytematrix.getHeight();
        int i = 0;
        int j = 0;
        for (; i < k1; i++)
        {
            byte abyte1[] = abyte0[i];
            for (int k = 0; k < j1;)
            {
                int i1 = j;
                if (abyte1[k] == 1)
                {
                    i1 = j + 1;
                }
                k++;
                j = i1;
            }

        }

        i = bytematrix.getHeight();
        int l = bytematrix.getWidth();
        return (int)(Math.abs((double)j / (double)(i * l) - 0.5D) * 20D) * 10;
    }

    static boolean getDataMaskBit(int i, int j, int k)
    {
        i;
        JVM INSTR tableswitch 0 7: default 48
    //                   0 75
    //                   1 87
    //                   2 94
    //                   3 101
    //                   4 110
    //                   5 123
    //                   6 138
    //                   7 155;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9
_L9:
        break MISSING_BLOCK_LABEL_155;
_L1:
        throw new IllegalArgumentException((new StringBuilder()).append("Invalid mask pattern: ").append(i).toString());
_L2:
        i = k + j & 1;
_L10:
        return i == 0;
_L3:
        i = k & 1;
          goto _L10
_L4:
        i = j % 3;
          goto _L10
_L5:
        i = (k + j) % 3;
          goto _L10
_L6:
        i = (k >>> 1) + j / 3 & 1;
          goto _L10
_L7:
        i = k * j;
        i = i % 3 + (i & 1);
          goto _L10
_L8:
        i = k * j;
        i = i % 3 + (i & 1) & 1;
          goto _L10
        i = (k * j) % 3 + (k + j & 1) & 1;
          goto _L10
    }
}
