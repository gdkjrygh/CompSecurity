// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.datamatrix;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.Dimension;
import com.google.zxing.EncodeHintType;
import com.google.zxing.Writer;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.datamatrix.encoder.DefaultPlacement;
import com.google.zxing.datamatrix.encoder.ErrorCorrection;
import com.google.zxing.datamatrix.encoder.HighLevelEncoder;
import com.google.zxing.datamatrix.encoder.SymbolInfo;
import com.google.zxing.datamatrix.encoder.SymbolShapeHint;
import com.google.zxing.qrcode.encoder.ByteMatrix;
import java.util.Map;

public final class DataMatrixWriter
    implements Writer
{

    public DataMatrixWriter()
    {
    }

    private static BitMatrix convertByteMatrixToBitMatrix(ByteMatrix bytematrix)
    {
        int k = bytematrix.getWidth();
        int l = bytematrix.getHeight();
        BitMatrix bitmatrix = new BitMatrix(k, l);
        bitmatrix.clear();
        for (int i = 0; i < k; i++)
        {
            for (int j = 0; j < l; j++)
            {
                if (bytematrix.get(i, j) == 1)
                {
                    bitmatrix.set(i, j);
                }
            }

        }

        return bitmatrix;
    }

    private static BitMatrix encodeLowLevel(DefaultPlacement defaultplacement, SymbolInfo symbolinfo)
    {
        int k1 = symbolinfo.getSymbolDataWidth();
        int l1 = symbolinfo.getSymbolDataHeight();
        ByteMatrix bytematrix = new ByteMatrix(symbolinfo.getSymbolWidth(), symbolinfo.getSymbolHeight());
        int i = 0;
        for (int j = 0; j < l1; j++)
        {
            int k = i;
            if (j % symbolinfo.matrixHeight == 0)
            {
                int l = 0;
                k = 0;
                while (k < symbolinfo.getSymbolWidth()) 
                {
                    boolean flag;
                    if (k % 2 == 0)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    bytematrix.set(l, i, flag);
                    l++;
                    k++;
                }
                k = i + 1;
            }
            i = 0;
            int i1 = 0;
            while (i1 < k1) 
            {
                int j1 = i;
                if (i1 % symbolinfo.matrixWidth == 0)
                {
                    bytematrix.set(i, k, true);
                    j1 = i + 1;
                }
                bytematrix.set(j1, k, defaultplacement.getBit(i1, j));
                j1++;
                i = j1;
                if (i1 % symbolinfo.matrixWidth == symbolinfo.matrixWidth - 1)
                {
                    boolean flag1;
                    if (j % 2 == 0)
                    {
                        flag1 = true;
                    } else
                    {
                        flag1 = false;
                    }
                    bytematrix.set(j1, k, flag1);
                    i = j1 + 1;
                }
                i1++;
            }
            i1 = k + 1;
            i = i1;
            if (j % symbolinfo.matrixHeight != symbolinfo.matrixHeight - 1)
            {
                continue;
            }
            k = 0;
            for (i = 0; i < symbolinfo.getSymbolWidth(); i++)
            {
                bytematrix.set(k, i1, true);
                k++;
            }

            i = i1 + 1;
        }

        return convertByteMatrixToBitMatrix(bytematrix);
    }

    public final BitMatrix encode(String s, BarcodeFormat barcodeformat, int i, int j, Map map)
    {
        if (s.isEmpty())
        {
            throw new IllegalArgumentException("Found empty contents");
        }
        if (barcodeformat != BarcodeFormat.DATA_MATRIX)
        {
            throw new IllegalArgumentException((new StringBuilder("Can only encode DATA_MATRIX, but got ")).append(barcodeformat).toString());
        }
        if (i < 0 || j < 0)
        {
            throw new IllegalArgumentException((new StringBuilder("Requested dimensions are too small: ")).append(i).append('x').append(j).toString());
        }
        barcodeformat = SymbolShapeHint.FORCE_NONE;
        Object obj2 = null;
        Object obj = null;
        Object obj3 = null;
        Object obj1 = obj3;
        BarcodeFormat barcodeformat1 = barcodeformat;
        if (map != null)
        {
            obj1 = (SymbolShapeHint)map.get(EncodeHintType.DATA_MATRIX_SHAPE);
            if (obj1 != null)
            {
                barcodeformat = ((BarcodeFormat) (obj1));
            }
            obj1 = (Dimension)map.get(EncodeHintType.MIN_SIZE);
            if (obj1 != null)
            {
                obj = obj1;
            }
            map = (Dimension)map.get(EncodeHintType.MAX_SIZE);
            obj1 = obj3;
            obj2 = obj;
            barcodeformat1 = barcodeformat;
            if (map != null)
            {
                obj1 = map;
                barcodeformat1 = barcodeformat;
                obj2 = obj;
            }
        }
        s = HighLevelEncoder.encodeHighLevel(s, barcodeformat1, ((Dimension) (obj2)), ((Dimension) (obj1)));
        barcodeformat = SymbolInfo.lookup(s.length(), barcodeformat1, ((Dimension) (obj2)), ((Dimension) (obj1)), true);
        s = new DefaultPlacement(ErrorCorrection.encodeECC200(s, barcodeformat), barcodeformat.getSymbolDataWidth(), barcodeformat.getSymbolDataHeight());
        s.place();
        return encodeLowLevel(s, barcodeformat);
    }
}
