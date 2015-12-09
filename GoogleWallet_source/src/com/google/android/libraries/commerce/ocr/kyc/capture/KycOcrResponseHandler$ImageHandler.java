// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.kyc.capture;

import android.os.Bundle;
import android.os.Vibrator;
import javax.inject.Provider;

// Referenced classes of package com.google.android.libraries.commerce.ocr.kyc.capture:
//            KycOcrResponseHandler

public static final class  extends KycOcrResponseHandler
{

    private void onRecognized(com.google.android.libraries.commerce.ocr.kyc.pub.ler ler, Bundle bundle)
    {
        getListener().geCaptured(ler, getAnalytics());
    }

    public final volatile void onRecognized(Object obj, Bundle bundle)
    {
        onRecognized((com.google.android.libraries.commerce.ocr.kyc.pub.ler.onRecognized)obj, bundle);
    }

    public final volatile void onRecognized(Object obj, Object obj1)
    {
        onRecognized((com.google.android.libraries.commerce.ocr.kyc.pub.ler.onRecognized)obj, (Bundle)obj1);
    }

    public final volatile void onUnrecognized(Object obj)
    {
        super.onUnrecognized((Bundle)obj);
    }

    public (com.google.android.libraries.commerce.ocr.kyc.fragments. , Provider provider, Vibrator vibrator)
    {
        super(, provider, vibrator);
    }
}
