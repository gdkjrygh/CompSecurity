// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.maxicode;

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
import com.google.zxing.maxicode.decoder.Decoder;
import java.util.Map;

public final class MaxiCodeReader
    implements Reader
{

    private static final int MATRIX_HEIGHT = 33;
    private static final int MATRIX_WIDTH = 30;
    private static final ResultPoint NO_POINTS[] = new ResultPoint[0];
    private final Decoder decoder = new Decoder();

    public MaxiCodeReader()
    {
    }

    private static BitMatrix extractPureBits(BitMatrix bitmatrix)
        throws NotFoundException
    {
        int ai[] = bitmatrix.getEnclosingRectangle();
        if (ai == null)
        {
            throw NotFoundException.getNotFoundInstance();
        }
        int k = ai[0];
        int l = ai[1];
        int i1 = ai[2];
        int j1 = ai[3];
        BitMatrix bitmatrix1 = new BitMatrix(30, 33);
        for (int i = 0; i < 33; i++)
        {
            int k1 = (i * j1 + j1 / 2) / 33;
            for (int j = 0; j < 30; j++)
            {
                if (bitmatrix.get(k + (j * i1 + i1 / 2 + ((i & 1) * i1) / 2) / 30, l + k1))
                {
                    bitmatrix1.set(j, i);
                }
            }

        }

        return bitmatrix1;
    }

    public Result decode(BinaryBitmap binarybitmap)
        throws NotFoundException, ChecksumException, FormatException
    {
        return decode(binarybitmap, null);
    }

    public Result decode(BinaryBitmap binarybitmap, Map map)
        throws NotFoundException, ChecksumException, FormatException
    {
        if (map != null && map.containsKey(DecodeHintType.PURE_BARCODE))
        {
            binarybitmap = extractPureBits(binarybitmap.getBlackMatrix());
            binarybitmap = decoder.decode(binarybitmap, map);
            map = NO_POINTS;
            map = new Result(binarybitmap.getText(), binarybitmap.getRawBytes(), map, BarcodeFormat.MAXICODE);
            binarybitmap = binarybitmap.getECLevel();
            if (binarybitmap != null)
            {
                map.putMetadata(ResultMetadataType.ERROR_CORRECTION_LEVEL, binarybitmap);
            }
            return map;
        } else
        {
            throw NotFoundException.getNotFoundInstance();
        }
    }

    public void reset()
    {
    }

}
