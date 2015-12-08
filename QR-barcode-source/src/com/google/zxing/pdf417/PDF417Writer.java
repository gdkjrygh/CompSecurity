// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.pdf417;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.Writer;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.pdf417.encoder.BarcodeMatrix;
import com.google.zxing.pdf417.encoder.Compaction;
import com.google.zxing.pdf417.encoder.Dimensions;
import com.google.zxing.pdf417.encoder.PDF417;
import java.lang.reflect.Array;
import java.util.Map;

public final class PDF417Writer
    implements Writer
{

    static final int WHITE_SPACE = 30;

    public PDF417Writer()
    {
    }

    private static BitMatrix bitMatrixFromEncoder(PDF417 pdf417, String s, int i, int j, int k)
        throws WriterException
    {
        pdf417.generateBarcodeLogic(s, 2);
        s = pdf417.getBarcodeMatrix().getScaledMatrix(2, 8);
        boolean flag;
        boolean flag1;
        if (j > i)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (s[0].length < s.length)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (flag ^ flag1)
        {
            s = rotateArray(s);
            flag = true;
        } else
        {
            flag = false;
        }
        i /= s[0].length;
        j /= s.length;
        if (i >= j)
        {
            i = j;
        }
        if (i > 1)
        {
            pdf417 = pdf417.getBarcodeMatrix().getScaledMatrix(i * 2, i * 4 * 2);
            if (flag)
            {
                pdf417 = rotateArray(pdf417);
            }
            return bitMatrixFrombitArray(pdf417, k);
        } else
        {
            return bitMatrixFrombitArray(s, k);
        }
    }

    private static BitMatrix bitMatrixFrombitArray(byte abyte0[][], int i)
    {
        BitMatrix bitmatrix = new BitMatrix(abyte0[0].length + i * 2, abyte0.length + i * 2);
        bitmatrix.clear();
        int j = bitmatrix.getHeight() - i - 1;
        for (int k = 0; k < abyte0.length;)
        {
            for (int l = 0; l < abyte0[0].length; l++)
            {
                if (abyte0[k][l] == 1)
                {
                    bitmatrix.set(l + i, j);
                }
            }

            k++;
            j--;
        }

        return bitmatrix;
    }

    private static byte[][] rotateArray(byte abyte0[][])
    {
        int i = abyte0[0].length;
        int k = abyte0.length;
        byte abyte1[][] = (byte[][])Array.newInstance(Byte.TYPE, new int[] {
            i, k
        });
        for (int j = 0; j < abyte0.length; j++)
        {
            int i1 = abyte0.length;
            for (int l = 0; l < abyte0[0].length; l++)
            {
                abyte1[l][i1 - j - 1] = abyte0[j][l];
            }

        }

        return abyte1;
    }

    public BitMatrix encode(String s, BarcodeFormat barcodeformat, int i, int j)
        throws WriterException
    {
        return encode(s, barcodeformat, i, j, null);
    }

    public BitMatrix encode(String s, BarcodeFormat barcodeformat, int i, int j, Map map)
        throws WriterException
    {
        if (barcodeformat != BarcodeFormat.PDF_417)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Can only encode PDF_417, but got ").append(barcodeformat).toString());
        }
        barcodeformat = new PDF417();
        if (map == null) goto _L2; else goto _L1
_L1:
        if (map.containsKey(EncodeHintType.PDF417_COMPACT))
        {
            barcodeformat.setCompact(((Boolean)map.get(EncodeHintType.PDF417_COMPACT)).booleanValue());
        }
        if (map.containsKey(EncodeHintType.PDF417_COMPACTION))
        {
            barcodeformat.setCompaction((Compaction)map.get(EncodeHintType.PDF417_COMPACTION));
        }
        if (map.containsKey(EncodeHintType.PDF417_DIMENSIONS))
        {
            Dimensions dimensions = (Dimensions)map.get(EncodeHintType.PDF417_DIMENSIONS);
            barcodeformat.setDimensions(dimensions.getMaxCols(), dimensions.getMinCols(), dimensions.getMaxRows(), dimensions.getMinRows());
        }
        if (!map.containsKey(EncodeHintType.MARGIN)) goto _L2; else goto _L3
_L3:
        int k = ((Number)map.get(EncodeHintType.MARGIN)).intValue();
_L5:
        return bitMatrixFromEncoder(barcodeformat, s, i, j, k);
_L2:
        k = 30;
        if (true) goto _L5; else goto _L4
_L4:
    }
}
