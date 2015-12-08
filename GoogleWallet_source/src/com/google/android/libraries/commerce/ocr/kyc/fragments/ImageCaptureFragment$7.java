// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.kyc.fragments;

import android.os.Bundle;
import com.google.android.libraries.commerce.ocr.capture.DecoratingOcrHandler;

// Referenced classes of package com.google.android.libraries.commerce.ocr.kyc.fragments:
//            ImageCaptureFragment

final class ler extends DecoratingOcrHandler
{

    final ImageCaptureFragment this$0;

    private void onRecognized(com.google.android.libraries.commerce.ocr.kyc.pub.age age)
    {
        onRecognized(age, ((Bundle) (null)));
    }

    private void onRecognized(com.google.android.libraries.commerce.ocr.kyc.pub.age age, Bundle bundle)
    {
        ImageCaptureFragment.access$200(ImageCaptureFragment.this).recordCapturedTime();
        showConfirmCapturedImage(age);
    }

    public final volatile void onRecognized(Object obj)
    {
        onRecognized((com.google.android.libraries.commerce.ocr.kyc.pub.age)obj);
    }

    public final volatile void onRecognized(Object obj, Object obj1)
    {
        onRecognized((com.google.android.libraries.commerce.ocr.kyc.pub.age)obj, (Bundle)obj1);
    }

    ler(com.google.android.libraries.commerce.ocr.capture.seHandler sehandler)
    {
        this$0 = ImageCaptureFragment.this;
        super(sehandler);
    }
}
