// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.capture.processors;

import android.graphics.Point;
import android.util.Log;
import com.google.android.libraries.commerce.ocr.capture.EdgeChangeListener;
import com.google.android.libraries.commerce.ocr.capture.ImageUtil;
import com.google.android.libraries.commerce.ocr.cv.CardRectifier;
import com.google.android.libraries.commerce.ocr.cv.OcrImage;
import com.google.android.libraries.commerce.ocr.cv.SafePoolable;
import com.google.android.libraries.commerce.ocr.ui.OcrRegionOfInterestProvider;
import com.google.android.libraries.commerce.ocr.util.Stopwatch;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.libraries.commerce.ocr.capture.processors:
//            AbstractProcessor, IntervalPolicy

public final class CardRectificationProcessor extends AbstractProcessor
{

    private final CardRectifier cardRectifier;
    private EdgeChangeListener edgeChangeListener;
    private final float edgeFinderWidthToOuterBoundingBoxEdgeLengthRatio;
    private final ImageUtil imageUtil;
    private final IntervalPolicy intervalPolicy;
    private final boolean isFullCardImageReturned;
    private final OcrRegionOfInterestProvider roiProvider;

    public CardRectificationProcessor(IntervalPolicy intervalpolicy, ImageUtil imageutil, CardRectifier cardrectifier, OcrRegionOfInterestProvider ocrregionofinterestprovider, float f, boolean flag)
    {
        intervalPolicy = intervalpolicy;
        imageUtil = imageutil;
        cardRectifier = cardrectifier;
        roiProvider = ocrregionofinterestprovider;
        edgeFinderWidthToOuterBoundingBoxEdgeLengthRatio = f;
        isFullCardImageReturned = flag;
    }

    private static void discard(SafePoolable safepoolable)
    {
        safepoolable.recycle();
    }

    private static float getMinRadonStdDev(Point point)
    {
        int i = point.x;
        float f;
        if (i >= 960)
        {
            f = 0.527F;
        } else
        if (i >= 640 && i < 960)
        {
            f = 0.6375F - (0.223F * (float)(i - 640)) / 320F;
        } else
        {
            f = 0.6375F;
        }
        point = String.valueOf(point);
        Log.v("CardRectificationProcessor", (new StringBuilder(String.valueOf(point).length() + 53)).append("Min radon std dev is ").append(f).append(" for resolution  ").append(point).toString());
        return f;
    }

    private boolean isProcessingNeeded(SafePoolable safepoolable)
    {
        return intervalPolicy.isOverInterval();
    }

    private com.google.android.libraries.commerce.ocr.cv.CardRectifier.Result process(SafePoolable safepoolable)
    {
        Object obj = (OcrImage)safepoolable.get();
        obj = rectify(((OcrImage) (obj)));
        if (edgeChangeListener != null)
        {
            edgeChangeListener.onEdgeChange(((com.google.android.libraries.commerce.ocr.cv.CardRectifier.Result) (obj)).getBoundaries());
        }
        discard(safepoolable);
        return ((com.google.android.libraries.commerce.ocr.cv.CardRectifier.Result) (obj));
        Exception exception;
        exception;
        discard(safepoolable);
        throw exception;
    }

    private com.google.android.libraries.commerce.ocr.cv.CardRectifier.Result rectify(OcrImage ocrimage)
    {
        Object obj;
        Stopwatch stopwatch;
        boolean flag;
        long l;
        if (ocrimage.getOrientation() % 180 == 90)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            obj = imageUtil;
            obj = ImageUtil.rotate90(roiProvider.getBoundingBoxRectRelativeToCameraPreview(), ocrimage.getResolution());
        } else
        {
            obj = roiProvider.getBoundingBoxRectRelativeToCameraPreview();
        }
        stopwatch = Stopwatch.createStarted();
        ocrimage = cardRectifier.rectify(ocrimage, ((android.graphics.Rect) (obj)), edgeFinderWidthToOuterBoundingBoxEdgeLengthRatio, getMinRadonStdDev(ocrimage.getResolution()), isFullCardImageReturned);
        l = stopwatch.stop().elapsed(TimeUnit.MILLISECONDS);
        Log.v("CardRectificationProcessor", (new StringBuilder(29)).append("rectify: ").append(l).toString());
        return ocrimage;
    }

    public final volatile void discard(Object obj)
    {
        discard((SafePoolable)obj);
    }

    public final volatile boolean isProcessingNeeded(Object obj)
    {
        return isProcessingNeeded((SafePoolable)obj);
    }

    public final volatile Object process(Object obj)
    {
        return process((SafePoolable)obj);
    }

    public final void setEdgeChangeListener(EdgeChangeListener edgechangelistener)
    {
        edgeChangeListener = edgechangelistener;
    }
}
