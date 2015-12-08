// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.multi.qrcode;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.NotFoundException;
import com.google.zxing.ReaderException;
import com.google.zxing.Result;
import com.google.zxing.ResultMetadataType;
import com.google.zxing.common.DecoderResult;
import com.google.zxing.common.DetectorResult;
import com.google.zxing.multi.MultipleBarcodeReader;
import com.google.zxing.multi.qrcode.detector.MultiDetector;
import com.google.zxing.qrcode.QRCodeReader;
import com.google.zxing.qrcode.decoder.Decoder;
import com.google.zxing.qrcode.decoder.QRCodeDecoderMetaData;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class QRCodeMultiReader extends QRCodeReader
    implements MultipleBarcodeReader
{

    private static final Result EMPTY_RESULT_ARRAY[] = new Result[0];

    public QRCodeMultiReader()
    {
    }

    public Result[] decodeMultiple(BinaryBitmap binarybitmap)
        throws NotFoundException
    {
        return decodeMultiple(binarybitmap, null);
    }

    public Result[] decodeMultiple(BinaryBitmap binarybitmap, Map map)
        throws NotFoundException
    {
        ArrayList arraylist;
        int i;
        int j;
        arraylist = new ArrayList();
        binarybitmap = (new MultiDetector(binarybitmap.getBlackMatrix())).detectMulti(map);
        j = binarybitmap.length;
        i = 0;
_L2:
        Object obj1;
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        obj1 = binarybitmap[i];
        Object obj;
        List list;
        obj = getDecoder().decode(((DetectorResult) (obj1)).getBits(), map);
        com.google.zxing.ResultPoint aresultpoint[] = ((DetectorResult) (obj1)).getPoints();
        if (((DecoderResult) (obj)).getOther() instanceof QRCodeDecoderMetaData)
        {
            ((QRCodeDecoderMetaData)((DecoderResult) (obj)).getOther()).applyMirroredCorrection(aresultpoint);
        }
        aresultpoint = new Result(((DecoderResult) (obj)).getText(), ((DecoderResult) (obj)).getRawBytes(), aresultpoint, BarcodeFormat.QR_CODE);
        list = ((DecoderResult) (obj)).getByteSegments();
        if (list == null)
        {
            break MISSING_BLOCK_LABEL_136;
        }
        aresultpoint.putMetadata(ResultMetadataType.BYTE_SEGMENTS, list);
        obj = ((DecoderResult) (obj)).getECLevel();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_158;
        }
        aresultpoint.putMetadata(ResultMetadataType.ERROR_CORRECTION_LEVEL, obj);
        arraylist.add(aresultpoint);
_L3:
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        if (arraylist.isEmpty())
        {
            return EMPTY_RESULT_ARRAY;
        } else
        {
            return (Result[])arraylist.toArray(new Result[arraylist.size()]);
        }
        ReaderException readerexception;
        readerexception;
          goto _L3
    }

}
