// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.kyc.capture.processor;

import android.graphics.Rect;
import com.google.android.libraries.commerce.ocr.capture.ImageUtil;
import com.google.android.libraries.commerce.ocr.capture.processors.AbstractProcessor;
import com.google.android.libraries.commerce.ocr.cv.OcrImage;
import com.google.android.libraries.commerce.ocr.cv.SafePoolable;
import com.google.android.libraries.commerce.ocr.ui.OcrRegionOfInterestProvider;

public final class SnapshotCroppingProcessor extends AbstractProcessor
{

    private final ImageUtil imageUtil;
    private final int jpegCompressionRate;
    private final OcrRegionOfInterestProvider roiProvider;

    public SnapshotCroppingProcessor(ImageUtil imageutil, OcrRegionOfInterestProvider ocrregionofinterestprovider, int i)
    {
        imageUtil = imageutil;
        roiProvider = ocrregionofinterestprovider;
        jpegCompressionRate = i;
    }

    private static void discard(SafePoolable safepoolable)
    {
        safepoolable.recycle();
    }

    private com.google.android.libraries.commerce.ocr.cv.CardRectifier.Result process(SafePoolable safepoolable)
    {
        Object obj;
        obj = roiProvider.getBoundingBoxRectRelativeToCameraPreview();
        obj = new com.google.android.libraries.commerce.ocr.cv.CardRectifier.Result(null, null, null, null, new OcrImage(imageUtil.getCroppedRotatedJPEG((OcrImage)safepoolable.get(), ((Rect) (obj)), jpegCompressionRate, ((OcrImage)safepoolable.get()).getOrientation()), 256, ((Rect) (obj)).width(), ((Rect) (obj)).height(), 0));
        discard(safepoolable);
        return ((com.google.android.libraries.commerce.ocr.cv.CardRectifier.Result) (obj));
        Exception exception;
        exception;
        discard(safepoolable);
        throw exception;
    }

    public final volatile void discard(Object obj)
    {
        discard((SafePoolable)obj);
    }

    public final volatile Object process(Object obj)
    {
        return process((SafePoolable)obj);
    }
}
