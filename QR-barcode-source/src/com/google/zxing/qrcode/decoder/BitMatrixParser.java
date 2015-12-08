// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.qrcode.decoder;

import com.google.zxing.FormatException;
import com.google.zxing.common.BitMatrix;

// Referenced classes of package com.google.zxing.qrcode.decoder:
//            FormatInformation, DataMask, Version

final class BitMatrixParser
{

    private final BitMatrix bitMatrix;
    private boolean mirror;
    private FormatInformation parsedFormatInfo;
    private Version parsedVersion;

    BitMatrixParser(BitMatrix bitmatrix)
        throws FormatException
    {
        int i = bitmatrix.getHeight();
        if (i < 21 || (i & 3) != 1)
        {
            throw FormatException.getFormatInstance();
        } else
        {
            bitMatrix = bitmatrix;
            return;
        }
    }

    private int copyBit(int i, int j, int k)
    {
        boolean flag;
        if (mirror)
        {
            flag = bitMatrix.get(j, i);
        } else
        {
            flag = bitMatrix.get(i, j);
        }
        if (flag)
        {
            return k << 1 | 1;
        } else
        {
            return k << 1;
        }
    }

    void mirror()
    {
        for (int i = 0; i < bitMatrix.getWidth(); i++)
        {
            for (int j = i + 1; j < bitMatrix.getHeight(); j++)
            {
                if (bitMatrix.get(i, j) != bitMatrix.get(j, i))
                {
                    bitMatrix.flip(j, i);
                    bitMatrix.flip(i, j);
                }
            }

        }

    }

    byte[] readCodewords()
        throws FormatException
    {
        Object obj = readFormatInformation();
        Version version = readVersion();
        obj = DataMask.forReference(((FormatInformation) (obj)).getDataMask());
        int k2 = bitMatrix.getHeight();
        ((DataMask) (obj)).unmaskBitMatrix(bitMatrix, k2);
        obj = version.buildFunctionPattern();
        byte abyte0[] = new byte[version.getTotalCodewords()];
        int i = k2 - 1;
        int j = 0;
        int k = 0;
        int l1 = 0;
        for (boolean flag = true; i > 0; flag ^= true)
        {
            int i1 = i;
            if (i == 6)
            {
                i1 = i - 1;
            }
            for (i = 0; i < k2;)
            {
                int l;
                int j1;
                int k1;
                int j2;
                if (flag)
                {
                    j1 = k2 - 1 - i;
                } else
                {
                    j1 = i;
                }
                k1 = 0;
                l = k;
                j2 = j;
                while (k1 < 2) 
                {
                    k = j2;
                    j = l;
                    int i2 = l1;
                    if (!((BitMatrix) (obj)).get(i1 - k1, j1))
                    {
                        j2++;
                        j = l << 1;
                        l = j;
                        if (bitMatrix.get(i1 - k1, j1))
                        {
                            l = j | 1;
                        }
                        k = j2;
                        j = l;
                        i2 = l1;
                        if (j2 == 8)
                        {
                            abyte0[l1] = (byte)l;
                            j = 0;
                            i2 = l1 + 1;
                            k = 0;
                        }
                    }
                    k1++;
                    j2 = k;
                    l = j;
                    l1 = i2;
                }
                i++;
                j = j2;
                k = l;
            }

            i = i1 - 2;
        }

        if (l1 != version.getTotalCodewords())
        {
            throw FormatException.getFormatInstance();
        } else
        {
            return abyte0;
        }
    }

    FormatInformation readFormatInformation()
        throws FormatException
    {
        int l = 0;
        if (parsedFormatInfo != null)
        {
            return parsedFormatInfo;
        }
        int i = 0;
        int k = 0;
        for (; i < 6; i++)
        {
            k = copyBit(i, 8, k);
        }

        k = copyBit(8, 7, copyBit(8, 8, copyBit(7, 8, k)));
        for (i = 5; i >= 0; i--)
        {
            k = copyBit(8, i, k);
        }

        int j1 = bitMatrix.getHeight();
        int i1 = j1 - 1;
        i = l;
        for (l = i1; l >= j1 - 7; l--)
        {
            i = copyBit(8, l, i);
        }

        i1 = j1 - 8;
        l = i;
        for (int j = i1; j < j1; j++)
        {
            l = copyBit(j, 8, l);
        }

        parsedFormatInfo = FormatInformation.decodeFormatInformation(k, l);
        if (parsedFormatInfo != null)
        {
            return parsedFormatInfo;
        } else
        {
            throw FormatException.getFormatInstance();
        }
    }

    Version readVersion()
        throws FormatException
    {
        if (parsedVersion != null)
        {
            return parsedVersion;
        }
        int j1 = bitMatrix.getHeight();
        int i = j1 - 17 >> 2;
        if (i <= 6)
        {
            return Version.getVersionForNumber(i);
        }
        int k1 = j1 - 11;
        i = 5;
        int k = 0;
        for (; i >= 0; i--)
        {
            for (int l = j1 - 9; l >= k1; l--)
            {
                k = copyBit(l, i, k);
            }

        }

        Version version = Version.decodeVersionInformation(k);
        if (version != null && version.getDimensionForVersion() == j1)
        {
            parsedVersion = version;
            return version;
        }
        k = 0;
        for (int j = 5; j >= 0; j--)
        {
            for (int i1 = j1 - 9; i1 >= k1; i1--)
            {
                k = copyBit(j, i1, k);
            }

        }

        version = Version.decodeVersionInformation(k);
        if (version != null && version.getDimensionForVersion() == j1)
        {
            parsedVersion = version;
            return version;
        } else
        {
            throw FormatException.getFormatInstance();
        }
    }

    void remask()
    {
        if (parsedFormatInfo == null)
        {
            return;
        } else
        {
            DataMask datamask = DataMask.forReference(parsedFormatInfo.getDataMask());
            int i = bitMatrix.getHeight();
            datamask.unmaskBitMatrix(bitMatrix, i);
            return;
        }
    }

    void setMirror(boolean flag)
    {
        parsedVersion = null;
        parsedFormatInfo = null;
        mirror = flag;
    }
}
