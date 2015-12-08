// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.capture.processors;

import android.util.Log;
import com.google.android.libraries.commerce.ocr.capture.OcrRecognizer;
import com.google.android.libraries.commerce.ocr.cv.OcrImage;
import com.google.android.libraries.commerce.ocr.cv.SafePoolable;

// Referenced classes of package com.google.android.libraries.commerce.ocr.capture.processors:
//            AbstractProcessor, IntervalPolicy

public final class OcrAsyncIntervalProcessor extends AbstractProcessor
{

    protected final com.google.android.libraries.commerce.ocr.capture.OcrRecognizer.OcrResponseHandler ocrHandler;
    private final IntervalPolicy ocrIntervalPolicy;
    protected final OcrRecognizer ocrRecognizer;

    public OcrAsyncIntervalProcessor(IntervalPolicy intervalpolicy, OcrRecognizer ocrrecognizer, com.google.android.libraries.commerce.ocr.capture.OcrRecognizer.OcrResponseHandler ocrresponsehandler)
    {
        ocrIntervalPolicy = intervalpolicy;
        ocrRecognizer = ocrrecognizer;
        ocrHandler = ocrresponsehandler;
    }

    private static void discard(SafePoolable safepoolable)
    {
        safepoolable.recycle();
    }

    private boolean isProcessingNeeded(SafePoolable safepoolable)
    {
        return ocrIntervalPolicy.isOverInterval();
    }

    private Void process(SafePoolable safepoolable)
    {
        Log.d("OcrAsyncIntervalProcessor", "Performing OCR recognition");
        ocrRecognizer.performOcr((OcrImage)safepoolable.get(), ocrHandler);
        discard(safepoolable);
        return null;
        Exception exception;
        exception;
        discard(safepoolable);
        throw exception;
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
}
