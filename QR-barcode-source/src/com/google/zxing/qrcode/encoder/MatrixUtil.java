// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.qrcode.encoder;

import com.google.zxing.WriterException;
import com.google.zxing.common.BitArray;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import com.google.zxing.qrcode.decoder.Version;

// Referenced classes of package com.google.zxing.qrcode.encoder:
//            ByteMatrix, MaskUtil, QRCode

final class MatrixUtil
{

    private static final int POSITION_ADJUSTMENT_PATTERN[][] = {
        {
            1, 1, 1, 1, 1
        }, {
            1, 0, 0, 0, 1
        }, {
            1, 0, 1, 0, 1
        }, {
            1, 0, 0, 0, 1
        }, {
            1, 1, 1, 1, 1
        }
    };
    private static final int POSITION_ADJUSTMENT_PATTERN_COORDINATE_TABLE[][];
    private static final int POSITION_DETECTION_PATTERN[][] = {
        {
            1, 1, 1, 1, 1, 1, 1
        }, {
            1, 0, 0, 0, 0, 0, 1
        }, {
            1, 0, 1, 1, 1, 0, 1
        }, {
            1, 0, 1, 1, 1, 0, 1
        }, {
            1, 0, 1, 1, 1, 0, 1
        }, {
            1, 0, 0, 0, 0, 0, 1
        }, {
            1, 1, 1, 1, 1, 1, 1
        }
    };
    private static final int TYPE_INFO_COORDINATES[][];
    private static final int TYPE_INFO_MASK_PATTERN = 21522;
    private static final int TYPE_INFO_POLY = 1335;
    private static final int VERSION_INFO_POLY = 7973;

    private MatrixUtil()
    {
    }

    static void buildMatrix(BitArray bitarray, ErrorCorrectionLevel errorcorrectionlevel, Version version, int i, ByteMatrix bytematrix)
        throws WriterException
    {
        clearMatrix(bytematrix);
        embedBasicPatterns(version, bytematrix);
        embedTypeInfo(errorcorrectionlevel, i, bytematrix);
        maybeEmbedVersionInfo(version, bytematrix);
        embedDataBits(bitarray, i, bytematrix);
    }

    static int calculateBCHCode(int i, int j)
    {
        int k = findMSBSet(j);
        for (i <<= k - 1; findMSBSet(i) >= k; i ^= j << findMSBSet(i) - k) { }
        return i;
    }

    static void clearMatrix(ByteMatrix bytematrix)
    {
        bytematrix.clear((byte)-1);
    }

    static void embedBasicPatterns(Version version, ByteMatrix bytematrix)
        throws WriterException
    {
        embedPositionDetectionPatternsAndSeparators(bytematrix);
        embedDarkDotAtLeftBottomCorner(bytematrix);
        maybeEmbedPositionAdjustmentPatterns(version, bytematrix);
        embedTimingPatterns(bytematrix);
    }

    private static void embedDarkDotAtLeftBottomCorner(ByteMatrix bytematrix)
        throws WriterException
    {
        if (bytematrix.get(8, bytematrix.getHeight() - 8) == 0)
        {
            throw new WriterException();
        } else
        {
            bytematrix.set(8, bytematrix.getHeight() - 8, 1);
            return;
        }
    }

    static void embedDataBits(BitArray bitarray, int i, ByteMatrix bytematrix)
        throws WriterException
    {
        int l = bytematrix.getWidth() - 1;
        int k = bytematrix.getHeight() - 1;
        int i1 = -1;
        int j = 0;
        while (l > 0) 
        {
            if (l == 6)
            {
                l--;
            }
            for (; k >= 0 && k < bytematrix.getHeight(); k += i1)
            {
                int j1 = 0;
                while (j1 < 2) 
                {
                    int k1 = l - j1;
                    if (isEmpty(bytematrix.get(k1, k)))
                    {
                        boolean flag;
                        boolean flag1;
                        if (j < bitarray.getSize())
                        {
                            flag = bitarray.get(j);
                            j++;
                        } else
                        {
                            flag = false;
                        }
                        flag1 = flag;
                        if (i != -1)
                        {
                            flag1 = flag;
                            if (MaskUtil.getDataMaskBit(i, k1, k))
                            {
                                if (!flag)
                                {
                                    flag1 = true;
                                } else
                                {
                                    flag1 = false;
                                }
                            }
                        }
                        bytematrix.set(k1, k, flag1);
                    }
                    j1++;
                }
            }

            i1 = -i1;
            l -= 2;
            k += i1;
        }
        if (j != bitarray.getSize())
        {
            throw new WriterException((new StringBuilder()).append("Not all bits consumed: ").append(j).append('/').append(bitarray.getSize()).toString());
        } else
        {
            return;
        }
    }

    private static void embedHorizontalSeparationPattern(int i, int j, ByteMatrix bytematrix)
        throws WriterException
    {
        for (int k = 0; k < 8; k++)
        {
            if (!isEmpty(bytematrix.get(i + k, j)))
            {
                throw new WriterException();
            }
            bytematrix.set(i + k, j, 0);
        }

    }

    private static void embedPositionAdjustmentPattern(int i, int j, ByteMatrix bytematrix)
    {
        for (int k = 0; k < 5; k++)
        {
            for (int l = 0; l < 5; l++)
            {
                bytematrix.set(i + l, j + k, POSITION_ADJUSTMENT_PATTERN[k][l]);
            }

        }

    }

    private static void embedPositionDetectionPattern(int i, int j, ByteMatrix bytematrix)
    {
        for (int k = 0; k < 7; k++)
        {
            for (int l = 0; l < 7; l++)
            {
                bytematrix.set(i + l, j + k, POSITION_DETECTION_PATTERN[k][l]);
            }

        }

    }

    private static void embedPositionDetectionPatternsAndSeparators(ByteMatrix bytematrix)
        throws WriterException
    {
        int i = POSITION_DETECTION_PATTERN[0].length;
        embedPositionDetectionPattern(0, 0, bytematrix);
        embedPositionDetectionPattern(bytematrix.getWidth() - i, 0, bytematrix);
        embedPositionDetectionPattern(0, bytematrix.getWidth() - i, bytematrix);
        embedHorizontalSeparationPattern(0, 7, bytematrix);
        embedHorizontalSeparationPattern(bytematrix.getWidth() - 8, 7, bytematrix);
        embedHorizontalSeparationPattern(0, bytematrix.getWidth() - 8, bytematrix);
        embedVerticalSeparationPattern(7, 0, bytematrix);
        embedVerticalSeparationPattern(bytematrix.getHeight() - 7 - 1, 0, bytematrix);
        embedVerticalSeparationPattern(7, bytematrix.getHeight() - 7, bytematrix);
    }

    private static void embedTimingPatterns(ByteMatrix bytematrix)
    {
        for (int i = 8; i < bytematrix.getWidth() - 8; i++)
        {
            int j = (i + 1) % 2;
            if (isEmpty(bytematrix.get(i, 6)))
            {
                bytematrix.set(i, 6, j);
            }
            if (isEmpty(bytematrix.get(6, i)))
            {
                bytematrix.set(6, i, j);
            }
        }

    }

    static void embedTypeInfo(ErrorCorrectionLevel errorcorrectionlevel, int i, ByteMatrix bytematrix)
        throws WriterException
    {
        BitArray bitarray = new BitArray();
        makeTypeInfoBits(errorcorrectionlevel, i, bitarray);
        i = 0;
        while (i < bitarray.getSize()) 
        {
            boolean flag = bitarray.get(bitarray.getSize() - 1 - i);
            bytematrix.set(TYPE_INFO_COORDINATES[i][0], TYPE_INFO_COORDINATES[i][1], flag);
            if (i < 8)
            {
                bytematrix.set(bytematrix.getWidth() - i - 1, 8, flag);
            } else
            {
                bytematrix.set(8, (bytematrix.getHeight() - 7) + (i - 8), flag);
            }
            i++;
        }
    }

    private static void embedVerticalSeparationPattern(int i, int j, ByteMatrix bytematrix)
        throws WriterException
    {
        for (int k = 0; k < 7; k++)
        {
            if (!isEmpty(bytematrix.get(i, j + k)))
            {
                throw new WriterException();
            }
            bytematrix.set(i, j + k, 0);
        }

    }

    static int findMSBSet(int i)
    {
        boolean flag = false;
        int j = i;
        for (i = ((flag) ? 1 : 0); j != 0; i++)
        {
            j >>>= 1;
        }

        return i;
    }

    private static boolean isEmpty(int i)
    {
        return i == -1;
    }

    static void makeTypeInfoBits(ErrorCorrectionLevel errorcorrectionlevel, int i, BitArray bitarray)
        throws WriterException
    {
        if (!QRCode.isValidMaskPattern(i))
        {
            throw new WriterException("Invalid mask pattern");
        }
        i = errorcorrectionlevel.getBits() << 3 | i;
        bitarray.appendBits(i, 5);
        bitarray.appendBits(calculateBCHCode(i, 1335), 10);
        errorcorrectionlevel = new BitArray();
        errorcorrectionlevel.appendBits(21522, 15);
        bitarray.xor(errorcorrectionlevel);
        if (bitarray.getSize() != 15)
        {
            throw new WriterException((new StringBuilder()).append("should not happen but we got: ").append(bitarray.getSize()).toString());
        } else
        {
            return;
        }
    }

    static void makeVersionInfoBits(Version version, BitArray bitarray)
        throws WriterException
    {
        bitarray.appendBits(version.getVersionNumber(), 6);
        bitarray.appendBits(calculateBCHCode(version.getVersionNumber(), 7973), 12);
        if (bitarray.getSize() != 18)
        {
            throw new WriterException((new StringBuilder()).append("should not happen but we got: ").append(bitarray.getSize()).toString());
        } else
        {
            return;
        }
    }

    private static void maybeEmbedPositionAdjustmentPatterns(Version version, ByteMatrix bytematrix)
    {
        if (version.getVersionNumber() >= 2) goto _L2; else goto _L1
_L1:
        return;
_L2:
        int i = version.getVersionNumber() - 1;
        version = POSITION_ADJUSTMENT_PATTERN_COORDINATE_TABLE[i];
        int k = POSITION_ADJUSTMENT_PATTERN_COORDINATE_TABLE[i].length;
        i = 0;
        do
        {
            if (i >= k)
            {
                continue;
            }
            int j = 0;
            do
            {
                if (j >= k)
                {
                    break;
                }
                int l = version[i];
                int i1 = version[j];
                if (i1 != -1 && l != -1 && isEmpty(bytematrix.get(i1, l)))
                {
                    embedPositionAdjustmentPattern(i1 - 2, l - 2, bytematrix);
                }
                j++;
            } while (true);
            i++;
        } while (true);
        if (true) goto _L1; else goto _L3
_L3:
    }

    static void maybeEmbedVersionInfo(Version version, ByteMatrix bytematrix)
        throws WriterException
    {
        if (version.getVersionNumber() >= 7)
        {
            BitArray bitarray = new BitArray();
            makeVersionInfoBits(version, bitarray);
            int i = 17;
            int j = 0;
            while (j < 6) 
            {
                for (int k = 0; k < 3; k++)
                {
                    boolean flag = bitarray.get(i);
                    i--;
                    bytematrix.set(j, (bytematrix.getHeight() - 11) + k, flag);
                    bytematrix.set((bytematrix.getHeight() - 11) + k, j, flag);
                }

                j++;
            }
        }
    }

    static 
    {
        int ai[] = {
            -1, -1, -1, -1, -1, -1, -1
        };
        int ai1[] = {
            6, 18, -1, -1, -1, -1, -1
        };
        int ai2[] = {
            6, 26, -1, -1, -1, -1, -1
        };
        int ai3[] = {
            6, 34, -1, -1, -1, -1, -1
        };
        int ai4[] = {
            6, 22, 38, -1, -1, -1, -1
        };
        int ai5[] = {
            6, 24, 42, -1, -1, -1, -1
        };
        int ai6[] = {
            6, 26, 46, -1, -1, -1, -1
        };
        int ai7[] = {
            6, 28, 50, -1, -1, -1, -1
        };
        int ai8[] = {
            6, 32, 58, -1, -1, -1, -1
        };
        int ai9[] = {
            6, 34, 62, -1, -1, -1, -1
        };
        int ai10[] = {
            6, 26, 46, 66, -1, -1, -1
        };
        int ai11[] = {
            6, 26, 50, 74, -1, -1, -1
        };
        int ai12[] = {
            6, 34, 62, 90, -1, -1, -1
        };
        int ai13[] = {
            6, 28, 50, 72, 94, -1, -1
        };
        int ai14[] = {
            6, 30, 58, 86, 114, -1, -1
        };
        int ai15[] = {
            6, 34, 62, 90, 118, -1, -1
        };
        int ai16[] = {
            6, 34, 60, 86, 112, 138, -1
        };
        int ai17[] = {
            6, 34, 62, 90, 118, 146, -1
        };
        int ai18[] = {
            6, 24, 50, 76, 102, 128, 154
        };
        int ai19[] = {
            6, 32, 58, 84, 110, 136, 162
        };
        int ai20[] = {
            6, 30, 58, 86, 114, 142, 170
        };
        POSITION_ADJUSTMENT_PATTERN_COORDINATE_TABLE = (new int[][] {
            ai, ai1, new int[] {
                6, 22, -1, -1, -1, -1, -1
            }, ai2, new int[] {
                6, 30, -1, -1, -1, -1, -1
            }, ai3, ai4, ai5, ai6, ai7, 
            new int[] {
                6, 30, 54, -1, -1, -1, -1
            }, ai8, ai9, ai10, new int[] {
                6, 26, 48, 70, -1, -1, -1
            }, ai11, new int[] {
                6, 30, 54, 78, -1, -1, -1
            }, new int[] {
                6, 30, 56, 82, -1, -1, -1
            }, new int[] {
                6, 30, 58, 86, -1, -1, -1
            }, ai12, 
            ai13, new int[] {
                6, 26, 50, 74, 98, -1, -1
            }, new int[] {
                6, 30, 54, 78, 102, -1, -1
            }, new int[] {
                6, 28, 54, 80, 106, -1, -1
            }, new int[] {
                6, 32, 58, 84, 110, -1, -1
            }, ai14, ai15, new int[] {
                6, 26, 50, 74, 98, 122, -1
            }, new int[] {
                6, 30, 54, 78, 102, 126, -1
            }, new int[] {
                6, 26, 52, 78, 104, 130, -1
            }, 
            new int[] {
                6, 30, 56, 82, 108, 134, -1
            }, ai16, new int[] {
                6, 30, 58, 86, 114, 142, -1
            }, ai17, new int[] {
                6, 30, 54, 78, 102, 126, 150
            }, ai18, new int[] {
                6, 28, 54, 80, 106, 132, 158
            }, ai19, new int[] {
                6, 26, 54, 82, 110, 138, 166
            }, ai20
        });
        ai = (new int[] {
            8, 1
        });
        ai1 = (new int[] {
            8, 3
        });
        ai2 = (new int[] {
            8, 5
        });
        ai3 = (new int[] {
            5, 8
        });
        ai4 = (new int[] {
            4, 8
        });
        TYPE_INFO_COORDINATES = (new int[][] {
            new int[] {
                8, 0
            }, ai, new int[] {
                8, 2
            }, ai1, new int[] {
                8, 4
            }, ai2, new int[] {
                8, 7
            }, new int[] {
                8, 8
            }, new int[] {
                7, 8
            }, ai3, ai4, new int[] {
                3, 8
            }, new int[] {
                2, 8
            }, new int[] {
                1, 8
            }, new int[] {
                0, 8
            }
        });
    }
}
