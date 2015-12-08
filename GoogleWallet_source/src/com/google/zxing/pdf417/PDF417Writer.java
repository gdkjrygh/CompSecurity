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

    public PDF417Writer()
    {
    }

    private static BitMatrix bitMatrixFromEncoder(PDF417 pdf417, String s, int i, int j, int k)
        throws WriterException
    {
        pdf417.generateBarcodeLogic(s, 2);
        byte abyte0[][] = pdf417.getBarcodeMatrix().getScaledMatrix(2, 8);
        boolean flag = false;
        boolean flag1;
        boolean flag2;
        if (j > i)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (abyte0[0].length < abyte0.length)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        s = abyte0;
        if (flag1 ^ flag2)
        {
            s = rotateArray(abyte0);
            flag = true;
        }
        i /= s[0].length;
        j /= s.length;
        if (i >= j)
        {
            i = j;
        }
        if (i > 1)
        {
            s = pdf417.getBarcodeMatrix().getScaledMatrix(i << 1, i << 2 << 1);
            pdf417 = s;
            if (flag)
            {
                pdf417 = rotateArray(s);
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
        int k = 0;
        for (int j = bitmatrix.getHeight() - i - 1; k < abyte0.length; j--)
        {
            for (int l = 0; l < abyte0[0].length; l++)
            {
                if (abyte0[k][l] == 1)
                {
                    bitmatrix.set(l + i, j);
                }
            }

            k++;
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

    public final BitMatrix encode(String s, BarcodeFormat barcodeformat, int i, int j, Map map)
        throws WriterException
    {
        if (barcodeformat != BarcodeFormat.PDF_417)
        {
            throw new IllegalArgumentException((new StringBuilder("Can only encode PDF_417, but got ")).append(barcodeformat).toString());
        }
        barcodeformat = new PDF417();
        byte byte0 = 30;
        int k = byte0;
        if (map != null)
        {
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
            k = byte0;
            if (map.containsKey(EncodeHintType.MARGIN))
            {
                k = ((Number)map.get(EncodeHintType.MARGIN)).intValue();
            }
        }
        return bitMatrixFromEncoder(barcodeformat, s, i, j, k);
    }
}
