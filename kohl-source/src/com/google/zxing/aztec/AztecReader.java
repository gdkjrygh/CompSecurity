// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.aztec;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.Reader;
import com.google.zxing.Result;
import com.google.zxing.ResultMetadataType;
import com.google.zxing.ResultPointCallback;
import com.google.zxing.aztec.decoder.Decoder;
import com.google.zxing.aztec.detector.Detector;
import com.google.zxing.common.DecoderResult;
import java.util.Map;

// Referenced classes of package com.google.zxing.aztec:
//            AztecDetectorResult

public final class AztecReader
    implements Reader
{

    public AztecReader()
    {
    }

    public Result decode(BinaryBitmap binarybitmap)
        throws NotFoundException, FormatException
    {
        return decode(binarybitmap, null);
    }

    public Result decode(BinaryBitmap binarybitmap, Map map)
        throws NotFoundException, FormatException
    {
        Object obj;
        com.google.zxing.ResultPoint aresultpoint[];
        FormatException formatexception;
        NotFoundException notfoundexception;
        Object obj2;
        DecoderResult decoderresult;
        Detector detector;
        notfoundexception = null;
        formatexception = null;
        detector = new Detector(binarybitmap.getBlackMatrix());
        decoderresult = null;
        aresultpoint = null;
        obj2 = null;
        binarybitmap = aresultpoint;
        obj = decoderresult;
        AztecDetectorResult aztecdetectorresult = detector.detect(false);
        binarybitmap = aresultpoint;
        obj = decoderresult;
        aresultpoint = aztecdetectorresult.getPoints();
        binarybitmap = aresultpoint;
        obj = aresultpoint;
        decoderresult = (new Decoder()).decode(aztecdetectorresult);
        Object obj1;
        obj = decoderresult;
        binarybitmap = aresultpoint;
        obj1 = obj;
_L2:
        obj = obj1;
        if (obj1 == null)
        {
            try
            {
                obj = detector.detect(true);
                binarybitmap = ((AztecDetectorResult) (obj)).getPoints();
                obj = (new Decoder()).decode(((AztecDetectorResult) (obj)));
            }
            // Misplaced declaration of an exception variable
            catch (BinaryBitmap binarybitmap)
            {
                if (notfoundexception != null)
                {
                    throw notfoundexception;
                }
                if (formatexception != null)
                {
                    throw formatexception;
                } else
                {
                    throw binarybitmap;
                }
            }
            // Misplaced declaration of an exception variable
            catch (BinaryBitmap binarybitmap)
            {
                if (notfoundexception != null)
                {
                    throw notfoundexception;
                }
                if (formatexception != null)
                {
                    throw formatexception;
                } else
                {
                    throw binarybitmap;
                }
            }
        }
        if (map != null)
        {
            map = (ResultPointCallback)map.get(DecodeHintType.NEED_RESULT_POINT_CALLBACK);
            if (map != null)
            {
                int j = binarybitmap.length;
                for (int i = 0; i < j; i++)
                {
                    map.foundPossibleResultPoint(binarybitmap[i]);
                }

            }
        }
        break; /* Loop/switch isn't completed */
        notfoundexception;
        obj1 = obj2;
        continue; /* Loop/switch isn't completed */
        formatexception;
        obj1 = obj2;
        binarybitmap = ((BinaryBitmap) (obj));
        if (true) goto _L2; else goto _L1
_L1:
        binarybitmap = new Result(((DecoderResult) (obj)).getText(), ((DecoderResult) (obj)).getRawBytes(), binarybitmap, BarcodeFormat.AZTEC);
        map = ((DecoderResult) (obj)).getByteSegments();
        if (map != null)
        {
            binarybitmap.putMetadata(ResultMetadataType.BYTE_SEGMENTS, map);
        }
        map = ((DecoderResult) (obj)).getECLevel();
        if (map != null)
        {
            binarybitmap.putMetadata(ResultMetadataType.ERROR_CORRECTION_LEVEL, map);
        }
        return binarybitmap;
    }

    public void reset()
    {
    }
}
