// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.pdf417;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.ChecksumException;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.Reader;
import com.google.zxing.Result;
import com.google.zxing.ResultMetadataType;
import com.google.zxing.ResultPoint;
import com.google.zxing.common.DecoderResult;
import com.google.zxing.multi.MultipleBarcodeReader;
import com.google.zxing.pdf417.decoder.PDF417ScanningDecoder;
import com.google.zxing.pdf417.detector.Detector;
import com.google.zxing.pdf417.detector.PDF417DetectorResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.google.zxing.pdf417:
//            PDF417ResultMetadata

public final class PDF417Reader
    implements Reader, MultipleBarcodeReader
{

    public PDF417Reader()
    {
    }

    private static Result[] decode(BinaryBitmap binarybitmap, Map map, boolean flag)
        throws NotFoundException, FormatException, ChecksumException
    {
        ArrayList arraylist = new ArrayList();
        binarybitmap = Detector.detect(binarybitmap, map, flag);
        Result result;
        for (map = binarybitmap.getPoints().iterator(); map.hasNext(); arraylist.add(result))
        {
            ResultPoint aresultpoint[] = (ResultPoint[])map.next();
            Object obj = PDF417ScanningDecoder.decode(binarybitmap.getBits(), aresultpoint[4], aresultpoint[5], aresultpoint[6], aresultpoint[7], getMinCodewordWidth(aresultpoint), getMaxCodewordWidth(aresultpoint));
            result = new Result(((DecoderResult) (obj)).getText(), ((DecoderResult) (obj)).getRawBytes(), aresultpoint, BarcodeFormat.PDF_417);
            result.putMetadata(ResultMetadataType.ERROR_CORRECTION_LEVEL, ((DecoderResult) (obj)).getECLevel());
            obj = (PDF417ResultMetadata)((DecoderResult) (obj)).getOther();
            if (obj != null)
            {
                result.putMetadata(ResultMetadataType.PDF417_EXTRA_METADATA, obj);
            }
        }

        return (Result[])arraylist.toArray(new Result[arraylist.size()]);
    }

    private static int getMaxCodewordWidth(ResultPoint aresultpoint[])
    {
        return Math.max(Math.max(getMaxWidth(aresultpoint[0], aresultpoint[4]), (getMaxWidth(aresultpoint[6], aresultpoint[2]) * 17) / 18), Math.max(getMaxWidth(aresultpoint[1], aresultpoint[5]), (getMaxWidth(aresultpoint[7], aresultpoint[3]) * 17) / 18));
    }

    private static int getMaxWidth(ResultPoint resultpoint, ResultPoint resultpoint1)
    {
        if (resultpoint == null || resultpoint1 == null)
        {
            return 0;
        } else
        {
            return (int)Math.abs(resultpoint.getX() - resultpoint1.getX());
        }
    }

    private static int getMinCodewordWidth(ResultPoint aresultpoint[])
    {
        return Math.min(Math.min(getMinWidth(aresultpoint[0], aresultpoint[4]), (getMinWidth(aresultpoint[6], aresultpoint[2]) * 17) / 18), Math.min(getMinWidth(aresultpoint[1], aresultpoint[5]), (getMinWidth(aresultpoint[7], aresultpoint[3]) * 17) / 18));
    }

    private static int getMinWidth(ResultPoint resultpoint, ResultPoint resultpoint1)
    {
        if (resultpoint == null || resultpoint1 == null)
        {
            return 0x7fffffff;
        } else
        {
            return (int)Math.abs(resultpoint.getX() - resultpoint1.getX());
        }
    }

    public Result decode(BinaryBitmap binarybitmap)
        throws NotFoundException, FormatException, ChecksumException
    {
        return decode(binarybitmap, null);
    }

    public Result decode(BinaryBitmap binarybitmap, Map map)
        throws NotFoundException, FormatException, ChecksumException
    {
        binarybitmap = decode(binarybitmap, map, false);
        if (binarybitmap == null || binarybitmap.length == 0 || binarybitmap[0] == null)
        {
            throw NotFoundException.getNotFoundInstance();
        } else
        {
            return binarybitmap[0];
        }
    }

    public Result[] decodeMultiple(BinaryBitmap binarybitmap)
        throws NotFoundException
    {
        return decodeMultiple(binarybitmap, null);
    }

    public Result[] decodeMultiple(BinaryBitmap binarybitmap, Map map)
        throws NotFoundException
    {
        try
        {
            binarybitmap = decode(binarybitmap, map, true);
        }
        // Misplaced declaration of an exception variable
        catch (BinaryBitmap binarybitmap)
        {
            throw NotFoundException.getNotFoundInstance();
        }
        // Misplaced declaration of an exception variable
        catch (BinaryBitmap binarybitmap)
        {
            throw NotFoundException.getNotFoundInstance();
        }
        return binarybitmap;
    }

    public void reset()
    {
    }
}
