// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.datamatrix.decoder;

import com.google.zxing.FormatException;
import com.google.zxing.common.BitMatrix;

// Referenced classes of package com.google.zxing.datamatrix.decoder:
//            Version

final class BitMatrixParser
{

    private final BitMatrix mappingBitMatrix;
    private final BitMatrix readMappingMatrix;
    private final Version version;

    BitMatrixParser(BitMatrix bitmatrix)
        throws FormatException
    {
        int i = bitmatrix.getHeight();
        if (i < 8 || i > 144 || (i & 1) != 0)
        {
            throw FormatException.getFormatInstance();
        } else
        {
            version = readVersion(bitmatrix);
            mappingBitMatrix = extractDataRegion(bitmatrix);
            readMappingMatrix = new BitMatrix(mappingBitMatrix.getWidth(), mappingBitMatrix.getHeight());
            return;
        }
    }

    private static Version readVersion(BitMatrix bitmatrix)
        throws FormatException
    {
        return Version.getVersionForDimensions(bitmatrix.getHeight(), bitmatrix.getWidth());
    }

    BitMatrix extractDataRegion(BitMatrix bitmatrix)
    {
        int k = version.getSymbolSizeRows();
        int i = version.getSymbolSizeColumns();
        if (bitmatrix.getHeight() != k)
        {
            throw new IllegalArgumentException("Dimension of bitMarix must match the version size");
        }
        int k1 = version.getDataRegionSizeRows();
        int l1 = version.getDataRegionSizeColumns();
        int i2 = k / k1;
        int j2 = i / l1;
        BitMatrix bitmatrix1 = new BitMatrix(j2 * l1, i2 * k1);
        for (int j = 0; j < i2; j++)
        {
            for (int l = 0; l < j2; l++)
            {
                for (int i1 = 0; i1 < k1; i1++)
                {
                    for (int j1 = 0; j1 < l1; j1++)
                    {
                        if (bitmatrix.get((l1 + 2) * l + 1 + j1, (k1 + 2) * j + 1 + i1))
                        {
                            bitmatrix1.set(l * l1 + j1, j * k1 + i1);
                        }
                    }

                }

            }

        }

        return bitmatrix1;
    }

    Version getVersion()
    {
        return version;
    }

    byte[] readCodewords()
        throws FormatException
    {
        byte abyte0[];
        int i;
        int j;
        int k;
        boolean flag;
        boolean flag1;
        boolean flag2;
        boolean flag3;
        int j2;
        int k2;
        abyte0 = new byte[version.getTotalCodewords()];
        j = 4;
        i = 0;
        j2 = mappingBitMatrix.getHeight();
        k2 = mappingBitMatrix.getWidth();
        flag3 = false;
        flag2 = false;
        flag1 = false;
        flag = false;
        k = 0;
_L3:
        if (j != j2 || i != 0 || flag3) goto _L2; else goto _L1
_L1:
        int l = k + 1;
        abyte0[k] = (byte)readCorner1(j2, k2);
        j -= 2;
        i += 2;
        flag3 = true;
        k = l;
_L4:
        int k1;
        int l1;
        int i2;
        if (j >= j2 && i >= k2)
        {
            if (k != version.getTotalCodewords())
            {
                throw FormatException.getFormatInstance();
            } else
            {
                return abyte0;
            }
        }
        if (true) goto _L3; else goto _L2
_L2:
        if (j == j2 - 2 && i == 0 && (k2 & 3) != 0 && !flag2)
        {
            int i1 = k + 1;
            abyte0[k] = (byte)readCorner2(j2, k2);
            j -= 2;
            i += 2;
            flag2 = true;
            k = i1;
        } else
        {
label0:
            {
                if (j != j2 + 4 || i != 2 || (k2 & 7) != 0 || flag1)
                {
                    break label0;
                }
                int j1 = k + 1;
                abyte0[k] = (byte)readCorner3(j2, k2);
                j -= 2;
                i += 2;
                flag1 = true;
                k = j1;
            }
        }
          goto _L4
        i2 = i;
        k1 = k;
        l1 = j;
        if (j != j2 - 2) goto _L6; else goto _L5
_L5:
        i2 = i;
        k1 = k;
        l1 = j;
        if (i != 0) goto _L6; else goto _L7
_L7:
        i2 = i;
        k1 = k;
        l1 = j;
        if ((k2 & 7) != 4) goto _L6; else goto _L8
_L8:
        i2 = i;
        k1 = k;
        l1 = j;
        if (flag) goto _L6; else goto _L9
_L9:
        k1 = k + 1;
        abyte0[k] = (byte)readCorner4(j2, k2);
        j -= 2;
        i += 2;
        flag = true;
        k = k1;
          goto _L4
_L11:
        k1 = i;
_L6:
        if (l1 < j2 && i2 >= 0 && !readMappingMatrix.get(i2, l1))
        {
            i = k1 + 1;
            abyte0[k1] = (byte)readUtah(l1, i2, j2, k2);
        } else
        {
            i = k1;
        }
        l1 -= 2;
        i2 += 2;
        if (l1 >= 0 && i2 < k2) goto _L11; else goto _L10
_L10:
        k1 = l1 + 1;
        j = i2 + 3;
_L12:
        if (k1 >= 0 && j < k2 && !readMappingMatrix.get(j, k1))
        {
            k = i + 1;
            abyte0[i] = (byte)readUtah(k1, j, j2, k2);
        } else
        {
            k = i;
        }
        k1 += 2;
        l1 = j - 2;
        if (k1 < j2 && l1 >= 0)
        {
            break MISSING_BLOCK_LABEL_522;
        }
        j = k1 + 3;
        i = l1 + 1;
          goto _L4
        i = k;
        j = l1;
          goto _L12
    }

    int readCorner1(int i, int j)
    {
        int k = 0;
        if (readModule(i - 1, 0, i, j))
        {
            k = false | true;
        }
        int l = k << 1;
        k = l;
        if (readModule(i - 1, 1, i, j))
        {
            k = l | 1;
        }
        l = k << 1;
        k = l;
        if (readModule(i - 1, 2, i, j))
        {
            k = l | 1;
        }
        l = k << 1;
        k = l;
        if (readModule(0, j - 2, i, j))
        {
            k = l | 1;
        }
        l = k << 1;
        k = l;
        if (readModule(0, j - 1, i, j))
        {
            k = l | 1;
        }
        l = k << 1;
        k = l;
        if (readModule(1, j - 1, i, j))
        {
            k = l | 1;
        }
        l = k << 1;
        k = l;
        if (readModule(2, j - 1, i, j))
        {
            k = l | 1;
        }
        l = k << 1;
        k = l;
        if (readModule(3, j - 1, i, j))
        {
            k = l | 1;
        }
        return k;
    }

    int readCorner2(int i, int j)
    {
        int k = 0;
        if (readModule(i - 3, 0, i, j))
        {
            k = false | true;
        }
        int l = k << 1;
        k = l;
        if (readModule(i - 2, 0, i, j))
        {
            k = l | 1;
        }
        l = k << 1;
        k = l;
        if (readModule(i - 1, 0, i, j))
        {
            k = l | 1;
        }
        l = k << 1;
        k = l;
        if (readModule(0, j - 4, i, j))
        {
            k = l | 1;
        }
        l = k << 1;
        k = l;
        if (readModule(0, j - 3, i, j))
        {
            k = l | 1;
        }
        l = k << 1;
        k = l;
        if (readModule(0, j - 2, i, j))
        {
            k = l | 1;
        }
        l = k << 1;
        k = l;
        if (readModule(0, j - 1, i, j))
        {
            k = l | 1;
        }
        l = k << 1;
        k = l;
        if (readModule(1, j - 1, i, j))
        {
            k = l | 1;
        }
        return k;
    }

    int readCorner3(int i, int j)
    {
        int k = 0;
        if (readModule(i - 1, 0, i, j))
        {
            k = false | true;
        }
        int l = k << 1;
        k = l;
        if (readModule(i - 1, j - 1, i, j))
        {
            k = l | 1;
        }
        l = k << 1;
        k = l;
        if (readModule(0, j - 3, i, j))
        {
            k = l | 1;
        }
        l = k << 1;
        k = l;
        if (readModule(0, j - 2, i, j))
        {
            k = l | 1;
        }
        l = k << 1;
        k = l;
        if (readModule(0, j - 1, i, j))
        {
            k = l | 1;
        }
        l = k << 1;
        k = l;
        if (readModule(1, j - 3, i, j))
        {
            k = l | 1;
        }
        l = k << 1;
        k = l;
        if (readModule(1, j - 2, i, j))
        {
            k = l | 1;
        }
        l = k << 1;
        k = l;
        if (readModule(1, j - 1, i, j))
        {
            k = l | 1;
        }
        return k;
    }

    int readCorner4(int i, int j)
    {
        int k = 0;
        if (readModule(i - 3, 0, i, j))
        {
            k = false | true;
        }
        int l = k << 1;
        k = l;
        if (readModule(i - 2, 0, i, j))
        {
            k = l | 1;
        }
        l = k << 1;
        k = l;
        if (readModule(i - 1, 0, i, j))
        {
            k = l | 1;
        }
        l = k << 1;
        k = l;
        if (readModule(0, j - 2, i, j))
        {
            k = l | 1;
        }
        l = k << 1;
        k = l;
        if (readModule(0, j - 1, i, j))
        {
            k = l | 1;
        }
        l = k << 1;
        k = l;
        if (readModule(1, j - 1, i, j))
        {
            k = l | 1;
        }
        l = k << 1;
        k = l;
        if (readModule(2, j - 1, i, j))
        {
            k = l | 1;
        }
        l = k << 1;
        k = l;
        if (readModule(3, j - 1, i, j))
        {
            k = l | 1;
        }
        return k;
    }

    boolean readModule(int i, int j, int k, int l)
    {
        int i1 = i;
        int j1 = j;
        if (i < 0)
        {
            i1 = i + k;
            j1 = j + (4 - (k + 4 & 7));
        }
        j = i1;
        i = j1;
        if (j1 < 0)
        {
            i = j1 + l;
            j = i1 + (4 - (l + 4 & 7));
        }
        readMappingMatrix.set(i, j);
        return mappingBitMatrix.get(i, j);
    }

    int readUtah(int i, int j, int k, int l)
    {
        int i1 = 0;
        if (readModule(i - 2, j - 2, k, l))
        {
            i1 = false | true;
        }
        int j1 = i1 << 1;
        i1 = j1;
        if (readModule(i - 2, j - 1, k, l))
        {
            i1 = j1 | 1;
        }
        j1 = i1 << 1;
        i1 = j1;
        if (readModule(i - 1, j - 2, k, l))
        {
            i1 = j1 | 1;
        }
        j1 = i1 << 1;
        i1 = j1;
        if (readModule(i - 1, j - 1, k, l))
        {
            i1 = j1 | 1;
        }
        j1 = i1 << 1;
        i1 = j1;
        if (readModule(i - 1, j, k, l))
        {
            i1 = j1 | 1;
        }
        j1 = i1 << 1;
        i1 = j1;
        if (readModule(i, j - 2, k, l))
        {
            i1 = j1 | 1;
        }
        j1 = i1 << 1;
        i1 = j1;
        if (readModule(i, j - 1, k, l))
        {
            i1 = j1 | 1;
        }
        j1 = i1 << 1;
        i1 = j1;
        if (readModule(i, j, k, l))
        {
            i1 = j1 | 1;
        }
        return i1;
    }
}
