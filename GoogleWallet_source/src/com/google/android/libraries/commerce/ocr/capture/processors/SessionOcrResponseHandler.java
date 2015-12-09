// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.capture.processors;

import android.util.Log;
import com.google.android.libraries.commerce.ocr.capture.DecoratingOcrHandler;
import java.util.concurrent.atomic.AtomicBoolean;

public final class SessionOcrResponseHandler extends DecoratingOcrHandler
{

    private AtomicBoolean ocrAttempted;
    private Object sessionIdentifier;

    public SessionOcrResponseHandler(com.google.android.libraries.commerce.ocr.capture.OcrRecognizer.OcrResponseHandler ocrresponsehandler, Object obj)
    {
        super(ocrresponsehandler);
        ocrAttempted = new AtomicBoolean(false);
        sessionIdentifier = obj;
    }

    public final Object getSessionIdentifier()
    {
        return sessionIdentifier;
    }

    public final boolean onOcrAttempt()
    {
        if (!ocrAttempted.getAndSet(true))
        {
            return super.onOcrAttempt();
        } else
        {
            Log.v("SessionOcrResponseHandler", "Duplicate ocr attempts");
            return false;
        }
    }

    public final void onUnrecognized()
    {
        super.onUnrecognized();
        ocrAttempted.set(false);
    }

    public final void onUnrecognized(Object obj)
    {
        super.onUnrecognized(obj);
        ocrAttempted.set(false);
    }
}
