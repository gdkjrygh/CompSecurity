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
        int j1;
        int k1;
        flag2 = false;
        abyte0 = new byte[version.getTotalCodewords()];
        j1 = mappingBitMatrix.getHeight();
        k1 = mappingBitMatrix.getWidth();
        flag1 = false;
        flag = false;
        flag3 = false;
        i = 0;
        j = 4;
        k = 0;
_L3:
        if (j != j1 || i != 0 || flag3) goto _L2; else goto _L1
_L1:
        abyte0[k] = (byte)readCorner1(j1, k1);
        k++;
        j -= 2;
        i += 2;
        flag3 = true;
_L4:
        if (j >= j1 && i >= k1)
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
        if (j == j1 - 2 && i == 0 && (k1 & 3) != 0 && !flag)
        {
            abyte0[k] = (byte)readCorner2(j1, k1);
            k++;
            j -= 2;
            i += 2;
            flag = true;
        } else
        if (j == j1 + 4 && i == 2 && (k1 & 7) == 0 && !flag1)
        {
            abyte0[k] = (byte)readCorner3(j1, k1);
            k++;
            j -= 2;
            i += 2;
            flag1 = true;
        } else
        {
            if (j != j1 - 2 || i != 0 || (k1 & 7) != 4 || flag2)
            {
                break MISSING_BLOCK_LABEL_472;
            }
            abyte0[k] = (byte)readCorner4(j1, k1);
            k++;
            j -= 2;
            i += 2;
            flag2 = true;
        }
          goto _L4
        i1 = i;
        i = k;
        k = j;
        j = i1;
        do
        {
            if (k < j1 && j >= 0 && !readMappingMatrix.get(j, k))
            {
                int l = i + 1;
                abyte0[i] = (byte)readUtah(k, j, j1, k1);
                i = l;
            }
            k -= 2;
            j += 2;
        } while (k >= 0 && j < k1);
        i1 = k + 1;
        j += 3;
        if (i1 >= 0 && j < k1 && !readMappingMatrix.get(j, i1))
        {
            k = i + 1;
            abyte0[i] = (byte)readUtah(i1, j, j1, k1);
        } else
        {
            k = i;
        }
        i1 += 2;
        i = j - 2;
        if (i1 < j1 && i >= 0)
        {
            break MISSING_BLOCK_LABEL_455;
        }
        j = i1 + 3;
        i++;
          goto _L4
        j = i;
        i = k;
        break MISSING_BLOCK_LABEL_373;
    }

    int readCorner1(int i, int j)
    {
        int k;
        int l;
        if (readModule(i - 1, 0, i, j))
        {
            k = 1;
        } else
        {
            k = 0;
        }
        l = k << 1;
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
        int k;
        int l;
        if (readModule(i - 3, 0, i, j))
        {
            k = 1;
        } else
        {
            k = 0;
        }
        l = k << 1;
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
        int k;
        int l;
        if (readModule(i - 1, 0, i, j))
        {
            k = 1;
        } else
        {
            k = 0;
        }
        l = k << 1;
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
        int k;
        int l;
        if (readModule(i - 3, 0, i, j))
        {
            k = 1;
        } else
        {
            k = 0;
        }
        l = k << 1;
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
        if (i < 0)
        {
            i += k;
            j = (4 - (k + 4 & 7)) + j;
        }
        int i1 = j;
        k = i;
        if (j < 0)
        {
            i1 = j + l;
            k = i + (4 - (l + 4 & 7));
        }
        readMappingMatrix.set(i1, k);
        return mappingBitMatrix.get(i1, k);
    }

    int readUtah(int i, int j, int k, int l)
    {
        int i1 = 0;
        if (readModule(i - 2, j - 2, k, l))
        {
            i1 = 1;
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
