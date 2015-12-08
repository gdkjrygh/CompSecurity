// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.kyc.capture.processor;

import com.google.android.libraries.commerce.ocr.capture.processors.NonNullProcessor;
import com.google.android.libraries.commerce.ocr.capture.processors.SessionData;
import com.google.android.libraries.commerce.ocr.capture.processors.SessionOcrResponseHandler;

public final class KycBarcodeProcessor extends NonNullProcessor
{

    public KycBarcodeProcessor()
    {
    }

    private boolean isProcessingNeeded(SessionData sessiondata)
    {
        return super.isProcessingNeeded(sessiondata) && ((com.google.commerce.ocr.definitions.PrimitivesProto.RecognizedBarcode)sessiondata.data).getValue().hasValue() && ((SessionOcrResponseHandler)sessiondata.session).onOcrAttempt();
    }

    private static Void process(SessionData sessiondata)
    {
        ((SessionOcrResponseHandler)sessiondata.session).onRecognized(sessiondata.data);
        return null;
    }

    public final volatile boolean isProcessingNeeded(Object obj)
    {
        return isProcessingNeeded((SessionData)obj);
    }

    public final volatile Object process(Object obj)
    {
        return process((SessionData)obj);
    }
}
