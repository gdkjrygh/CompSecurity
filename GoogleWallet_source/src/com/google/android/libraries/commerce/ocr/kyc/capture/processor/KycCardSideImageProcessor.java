// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.kyc.capture.processor;

import com.google.android.libraries.commerce.ocr.capture.ImageUtil;
import com.google.android.libraries.commerce.ocr.capture.processors.NonNullProcessor;
import com.google.android.libraries.commerce.ocr.capture.processors.SessionData;
import com.google.android.libraries.commerce.ocr.capture.processors.SessionOcrResponseHandler;
import com.google.android.libraries.commerce.ocr.cv.OcrImage;

public final class KycCardSideImageProcessor extends NonNullProcessor
{

    private final ImageUtil imageUtil;

    public KycCardSideImageProcessor(ImageUtil imageutil)
    {
        imageUtil = imageutil;
    }

    private void discard(SessionData sessiondata)
    {
        super.discard(sessiondata);
        if (sessiondata != null && sessiondata.data != null && ((com.google.android.libraries.commerce.ocr.cv.CardRectifier.Result)sessiondata.data).getCardImage() != null)
        {
            ((com.google.android.libraries.commerce.ocr.cv.CardRectifier.Result)sessiondata.data).getCardImage().destroy();
        }
    }

    private boolean isProcessingNeeded(SessionData sessiondata)
    {
        return super.isProcessingNeeded(sessiondata) && ((com.google.android.libraries.commerce.ocr.cv.CardRectifier.Result)sessiondata.data).getCardImage() != null && ((SessionOcrResponseHandler)sessiondata.session).onOcrAttempt();
    }

    private Void process(SessionData sessiondata)
    {
        ((SessionOcrResponseHandler)sessiondata.session).onRecognized(new com.google.android.libraries.commerce.ocr.kyc.pub.KycOcrResult.CardSideImage(((com.google.android.libraries.commerce.ocr.cv.CardRectifier.Result)sessiondata.data).getCardImage(), imageUtil));
        return null;
    }

    public final volatile void discard(Object obj)
    {
        discard((SessionData)obj);
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
