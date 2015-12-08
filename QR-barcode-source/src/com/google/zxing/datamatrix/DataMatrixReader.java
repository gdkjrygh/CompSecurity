// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.datamatrix;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.ChecksumException;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.Reader;
import com.google.zxing.Result;
import com.google.zxing.ResultMetadataType;
import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.DecoderResult;
import com.google.zxing.common.DetectorResult;
import com.google.zxing.datamatrix.decoder.Decoder;
import com.google.zxing.datamatrix.detector.Detector;
import java.util.Map;

public final class DataMatrixReader
    implements Reader
{

    private static final ResultPoint NO_POINTS[] = new ResultPoint[0];
    private final Decoder decoder = new Decoder();

    public DataMatrixReader()
    {
    }

    private static BitMatrix extractPureBits(BitMatrix bitmatrix)
        throws NotFoundException
    {
        int ai[] = bitmatrix.getTopLeftOnBit();
        int ai1[] = bitmatrix.getBottomRightOnBit();
        if (ai == null || ai1 == null)
        {
            throw NotFoundException.getNotFoundInstance();
        }
        int l = moduleSize(ai, bitmatrix);
        int i1 = ai[1];
        int i = ai1[1];
        int j1 = ai[0];
        int k1 = ((ai1[0] - j1) + 1) / l;
        int l1 = ((i - i1) + 1) / l;
        if (k1 <= 0 || l1 <= 0)
        {
            throw NotFoundException.getNotFoundInstance();
        }
        int i2 = l >> 1;
        BitMatrix bitmatrix1 = new BitMatrix(k1, l1);
        for (int j = 0; j < l1; j++)
        {
            for (int k = 0; k < k1; k++)
            {
                if (bitmatrix.get(k * l + (j1 + i2), i1 + i2 + j * l))
                {
                    bitmatrix1.set(k, j);
                }
            }

        }

        return bitmatrix1;
    }

    private static int moduleSize(int ai[], BitMatrix bitmatrix)
        throws NotFoundException
    {
        int j = bitmatrix.getWidth();
        int i = ai[0];
        for (int k = ai[1]; i < j && bitmatrix.get(i, k); i++) { }
        if (i == j)
        {
            throw NotFoundException.getNotFoundInstance();
        }
        i -= ai[0];
        if (i == 0)
        {
            throw NotFoundException.getNotFoundInstance();
        } else
        {
            return i;
        }
    }

    public Result decode(BinaryBitmap binarybitmap)
        throws NotFoundException, ChecksumException, FormatException
    {
        return decode(binarybitmap, null);
    }

    public Result decode(BinaryBitmap binarybitmap, Map map)
        throws NotFoundException, ChecksumException, FormatException
    {
        java.util.List list;
        if (map != null && map.containsKey(DecodeHintType.PURE_BARCODE))
        {
            binarybitmap = extractPureBits(binarybitmap.getBlackMatrix());
            binarybitmap = decoder.decode(binarybitmap);
            map = NO_POINTS;
        } else
        {
            map = (new Detector(binarybitmap.getBlackMatrix())).detect();
            binarybitmap = decoder.decode(map.getBits());
            map = map.getPoints();
        }
        map = new Result(binarybitmap.getText(), binarybitmap.getRawBytes(), map, BarcodeFormat.DATA_MATRIX);
        list = binarybitmap.getByteSegments();
        if (list != null)
        {
            map.putMetadata(ResultMetadataType.BYTE_SEGMENTS, list);
        }
        binarybitmap = binarybitmap.getECLevel();
        if (binarybitmap != null)
        {
            map.putMetadata(ResultMetadataType.ERROR_CORRECTION_LEVEL, binarybitmap);
        }
        return map;
    }

    public void reset()
    {
    }

}
