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

    private void onRecognized(com.google.commerce.ocr.definitions.zedBarcode zedbarcode)
    {
        onRecognized(zedbarcode, ((Bundle) (null)));
    }

    private void onRecognized(com.google.commerce.ocr.definitions.zedBarcode zedbarcode, Bundle bundle)
    {
        ImageCaptureFragment.access$200(ImageCaptureFragment.this).recordCapturedTime();
        ImageCaptureFragment.access$600(ImageCaptureFragment.this).onRecognized(zedbarcode);
    }

    public final volatile void onRecognized(Object obj)
    {
        onRecognized((com.google.commerce.ocr.definitions.zedBarcode)obj);
    }

    public final volatile void onRecognized(Object obj, Object obj1)
    {
        onRecognized((com.google.commerce.ocr.definitions.zedBarcode)obj, (Bundle)obj1);
    }

    ler(com.google.android.libraries.commerce.ocr.capture.seHandler sehandler)
    {
        this$0 = ImageCaptureFragment.this;
        super(sehandler);
    }
}
