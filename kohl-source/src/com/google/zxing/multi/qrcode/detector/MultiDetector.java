// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.multi.qrcode.detector;

import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.ReaderException;
import com.google.zxing.ResultPointCallback;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.DetectorResult;
import com.google.zxing.qrcode.detector.Detector;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.google.zxing.multi.qrcode.detector:
//            MultiFinderPatternFinder

public final class MultiDetector extends Detector
{

    private static final DetectorResult EMPTY_DETECTOR_RESULTS[] = new DetectorResult[0];

    public MultiDetector(BitMatrix bitmatrix)
    {
        super(bitmatrix);
    }

    public DetectorResult[] detectMulti(Map map)
        throws NotFoundException
    {
        BitMatrix bitmatrix = getImage();
        Object obj;
        if (map == null)
        {
            obj = null;
        } else
        {
            obj = (ResultPointCallback)map.get(DecodeHintType.NEED_RESULT_POINT_CALLBACK);
        }
        map = (new MultiFinderPatternFinder(bitmatrix, ((ResultPointCallback) (obj)))).findMulti(map);
        if (map.length == 0)
        {
            throw NotFoundException.getNotFoundInstance();
        }
        obj = new ArrayList();
        int j = map.length;
        int i = 0;
        while (i < j) 
        {
            com.google.zxing.qrcode.detector.FinderPatternInfo finderpatterninfo = map[i];
            try
            {
                ((List) (obj)).add(processFinderPatternInfo(finderpatterninfo));
            }
            catch (ReaderException readerexception) { }
            i++;
        }
        if (((List) (obj)).isEmpty())
        {
            return EMPTY_DETECTOR_RESULTS;
        } else
        {
            return (DetectorResult[])((List) (obj)).toArray(new DetectorResult[((List) (obj)).size()]);
        }
    }

}
