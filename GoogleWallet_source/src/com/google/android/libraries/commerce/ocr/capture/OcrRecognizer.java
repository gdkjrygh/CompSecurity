// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.capture;

import com.google.android.libraries.commerce.ocr.OcrException;
import com.google.android.libraries.commerce.ocr.cv.OcrImage;

public interface OcrRecognizer
{
    public static interface OcrResponseHandler
    {

        public abstract void onError(OcrException ocrexception);

        public abstract boolean onOcrAttempt();

        public abstract void onRecognized(Object obj);

        public abstract void onRecognized(Object obj, Object obj1);

        public abstract void onUnrecognized();

        public abstract void onUnrecognized(Object obj);
    }


    public abstract void performOcr(OcrImage ocrimage, OcrResponseHandler ocrresponsehandler);
}
