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
        Object obj2;
        Detector detector;
        obj2 = null;
        detector = new Detector(binarybitmap.getBlackMatrix());
        Object obj;
        obj = detector.detect(false);
        binarybitmap = ((AztecDetectorResult) (obj)).getPoints();
        DecoderResult decoderresult = (new Decoder()).decode(((AztecDetectorResult) (obj)));
        Object obj1;
        obj1 = null;
        obj = binarybitmap;
        binarybitmap = decoderresult;
        break MISSING_BLOCK_LABEL_49;
        obj1;
        obj = null;
_L3:
        binarybitmap = null;
          goto _L1
        obj1;
        obj = null;
_L2:
        Object obj3 = null;
        binarybitmap = null;
        obj2 = obj1;
        obj1 = obj3;
_L1:
        if (binarybitmap == null)
        {
            try
            {
                binarybitmap = detector.detect(true);
                obj = binarybitmap.getPoints();
                binarybitmap = (new Decoder()).decode(binarybitmap);
            }
            // Misplaced declaration of an exception variable
            catch (BinaryBitmap binarybitmap)
            {
                if (obj1 != null)
                {
                    throw obj1;
                }
                if (obj2 != null)
                {
                    throw obj2;
                } else
                {
                    throw binarybitmap;
                }
            }
            // Misplaced declaration of an exception variable
            catch (BinaryBitmap binarybitmap)
            {
                if (obj1 != null)
                {
                    throw obj1;
                }
                if (obj2 != null)
                {
                    throw obj2;
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
                int j = obj.length;
                for (int i = 0; i < j; i++)
                {
                    map.foundPossibleResultPoint(obj[i]);
                }

            }
        }
        map = new Result(binarybitmap.getText(), binarybitmap.getRawBytes(), ((com.google.zxing.ResultPoint []) (obj)), BarcodeFormat.AZTEC);
        obj = binarybitmap.getByteSegments();
        if (obj != null)
        {
            map.putMetadata(ResultMetadataType.BYTE_SEGMENTS, obj);
        }
        binarybitmap = binarybitmap.getECLevel();
        if (binarybitmap != null)
        {
            map.putMetadata(ResultMetadataType.ERROR_CORRECTION_LEVEL, binarybitmap);
        }
        return map;
        obj1;
        obj = binarybitmap;
          goto _L2
        obj1;
        obj = binarybitmap;
          goto _L3
    }

    public void reset()
    {
    }
}
