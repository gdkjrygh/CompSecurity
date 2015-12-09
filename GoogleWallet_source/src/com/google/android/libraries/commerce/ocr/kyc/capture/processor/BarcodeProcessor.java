// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.kyc.capture.processor;

import android.util.Log;
import com.google.android.libraries.commerce.ocr.capture.processors.AbstractProcessor;
import com.google.android.libraries.commerce.ocr.cv.OcrImage;
import com.google.android.libraries.commerce.ocr.cv.SafePoolable;
import com.google.android.libraries.commerce.ocr.util.Stopwatch;
import java.util.concurrent.TimeUnit;

public abstract class BarcodeProcessor extends AbstractProcessor
{

    private static final String TAG = com/google/android/libraries/commerce/ocr/kyc/capture/processor/BarcodeProcessor.getSimpleName();

    public BarcodeProcessor()
    {
    }

    private static void discard(SafePoolable safepoolable)
    {
        if (safepoolable != null)
        {
            safepoolable.recycle();
        }
    }

    private static boolean isProcessingNeeded(SafePoolable safepoolable)
    {
        return safepoolable != null;
    }

    private com.google.commerce.ocr.definitions.PrimitivesProto.RecognizedBarcode process(SafePoolable safepoolable)
    {
        Stopwatch stopwatch = Stopwatch.createStarted();
        com.google.commerce.ocr.definitions.PrimitivesProto.RecognizedBarcode recognizedbarcode;
        recognizedbarcode = getBarcode((OcrImage)safepoolable.get());
        stopwatch.stop();
        if (!recognizedbarcode.hasValue()) goto _L2; else goto _L1
_L1:
        String s = TAG;
        long l = stopwatch.elapsed(TimeUnit.MILLISECONDS);
        Log.i(s, (new StringBuilder(42)).append("Barcode found, took ").append(l).append("ms").toString());
_L4:
        discard(safepoolable);
        return recognizedbarcode;
_L2:
        String s1 = TAG;
        long l1 = stopwatch.elapsed(TimeUnit.MILLISECONDS);
        Log.d(s1, (new StringBuilder(45)).append("No barcode found after ").append(l1).append("ms").toString());
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        discard(safepoolable);
        throw exception;
    }

    public final volatile void discard(Object obj)
    {
        discard((SafePoolable)obj);
    }

    public abstract com.google.commerce.ocr.definitions.PrimitivesProto.RecognizedBarcode getBarcode(OcrImage ocrimage);

    public final volatile boolean isProcessingNeeded(Object obj)
    {
        return isProcessingNeeded((SafePoolable)obj);
    }

    public final volatile Object process(Object obj)
    {
        return process((SafePoolable)obj);
    }

}
