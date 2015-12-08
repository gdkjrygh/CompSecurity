// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.capture;

import com.google.android.libraries.commerce.ocr.OcrException;

public class DecoratingOcrHandler
    implements OcrRecognizer.OcrResponseHandler
{

    protected final OcrRecognizer.OcrResponseHandler internalHandler;

    public DecoratingOcrHandler(OcrRecognizer.OcrResponseHandler ocrresponsehandler)
    {
        internalHandler = ocrresponsehandler;
    }

    public final void onError(OcrException ocrexception)
    {
        internalHandler.onError(ocrexception);
    }

    public boolean onOcrAttempt()
    {
        return internalHandler.onOcrAttempt();
    }

    public void onRecognized(Object obj)
    {
        internalHandler.onRecognized(obj);
    }

    public void onRecognized(Object obj, Object obj1)
    {
        internalHandler.onRecognized(obj, obj1);
    }

    public void onUnrecognized()
    {
        internalHandler.onUnrecognized();
    }

    public void onUnrecognized(Object obj)
    {
        internalHandler.onUnrecognized(obj);
    }
}
