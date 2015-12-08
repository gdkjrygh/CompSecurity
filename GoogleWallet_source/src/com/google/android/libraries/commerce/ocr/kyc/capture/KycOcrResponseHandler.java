// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.kyc.capture;

import android.os.Bundle;
import android.os.Vibrator;
import com.google.android.libraries.commerce.ocr.OcrException;
import javax.inject.Provider;

public abstract class KycOcrResponseHandler
    implements com.google.android.libraries.commerce.ocr.capture.OcrRecognizer.OcrResponseHandler
{
    public static final class BarcodeHandler extends KycOcrResponseHandler
    {

        private void onRecognized(com.google.commerce.ocr.definitions.PrimitivesProto.RecognizedBarcode recognizedbarcode, Bundle bundle)
        {
            getListener().onBarcodeCaptured(recognizedbarcode, getAnalytics());
        }

        public final volatile void onRecognized(Object obj, Bundle bundle)
        {
            onRecognized((com.google.commerce.ocr.definitions.PrimitivesProto.RecognizedBarcode)obj, bundle);
        }

        public final volatile void onRecognized(Object obj, Object obj1)
        {
            onRecognized((com.google.commerce.ocr.definitions.PrimitivesProto.RecognizedBarcode)obj, (Bundle)obj1);
        }

        public final volatile void onUnrecognized(Object obj)
        {
            onUnrecognized((Bundle)obj);
        }

        public BarcodeHandler(com.google.android.libraries.commerce.ocr.kyc.fragments.ImageCaptureFragment.Listener listener1, Provider provider, Vibrator vibrator1)
        {
            super(listener1, provider, vibrator1);
        }
    }

    public static final class ImageHandler extends KycOcrResponseHandler
    {

        private void onRecognized(com.google.android.libraries.commerce.ocr.kyc.pub.KycOcrResult.CardSideImage cardsideimage, Bundle bundle)
        {
            getListener().onImageCaptured(cardsideimage, getAnalytics());
        }

        public final volatile void onRecognized(Object obj, Bundle bundle)
        {
            onRecognized((com.google.android.libraries.commerce.ocr.kyc.pub.KycOcrResult.CardSideImage)obj, bundle);
        }

        public final volatile void onRecognized(Object obj, Object obj1)
        {
            onRecognized((com.google.android.libraries.commerce.ocr.kyc.pub.KycOcrResult.CardSideImage)obj, (Bundle)obj1);
        }

        public final volatile void onUnrecognized(Object obj)
        {
            onUnrecognized((Bundle)obj);
        }

        public ImageHandler(com.google.android.libraries.commerce.ocr.kyc.fragments.ImageCaptureFragment.Listener listener1, Provider provider, Vibrator vibrator1)
        {
            super(listener1, provider, vibrator1);
        }
    }


    private final Provider analyticsProvider;
    private final com.google.android.libraries.commerce.ocr.kyc.fragments.ImageCaptureFragment.Listener listener;
    private final Vibrator vibrator;

    public KycOcrResponseHandler(com.google.android.libraries.commerce.ocr.kyc.fragments.ImageCaptureFragment.Listener listener1, Provider provider, Vibrator vibrator1)
    {
        listener = listener1;
        analyticsProvider = provider;
        vibrator = vibrator1;
    }

    protected final com.google.android.libraries.commerce.ocr.kyc.pub.KycOcrResult.Analytics getAnalytics()
    {
        return (com.google.android.libraries.commerce.ocr.kyc.pub.KycOcrResult.Analytics)analyticsProvider.get();
    }

    protected final com.google.android.libraries.commerce.ocr.kyc.fragments.ImageCaptureFragment.Listener getListener()
    {
        return listener;
    }

    public final void onError(OcrException ocrexception)
    {
        switch (ocrexception.getType())
        {
        case 3: // '\003'
        case 4: // '\004'
        default:
            listener.onError(10006, (com.google.android.libraries.commerce.ocr.kyc.pub.KycOcrResult.Analytics)analyticsProvider.get());
            return;

        case 5: // '\005'
            listener.onError(10009, (com.google.android.libraries.commerce.ocr.kyc.pub.KycOcrResult.Analytics)analyticsProvider.get());
            return;

        case 2: // '\002'
            listener.onError(10004, (com.google.android.libraries.commerce.ocr.kyc.pub.KycOcrResult.Analytics)analyticsProvider.get());
            return;
        }
    }

    public final boolean onOcrAttempt()
    {
        vibrator.vibrate(50L);
        return true;
    }

    public final void onRecognized(Object obj)
    {
        onRecognized(obj, Bundle.EMPTY);
    }

    public abstract void onRecognized(Object obj, Bundle bundle);

    public volatile void onRecognized(Object obj, Object obj1)
    {
        onRecognized(obj, (Bundle)obj1);
    }

    public final void onUnrecognized()
    {
        onUnrecognized(Bundle.EMPTY);
    }

    public final void onUnrecognized(Bundle bundle)
    {
        listener.onError(10005, (com.google.android.libraries.commerce.ocr.kyc.pub.KycOcrResult.Analytics)analyticsProvider.get());
    }

    public volatile void onUnrecognized(Object obj)
    {
        onUnrecognized((Bundle)obj);
    }
}
