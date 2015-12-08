// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.loyalty.capture;

import android.graphics.Rect;
import com.google.android.libraries.commerce.ocr.cv.OcrImage;
import com.google.zxing.LuminanceSource;

// Referenced classes of package com.google.android.libraries.commerce.ocr.loyalty.capture:
//            BarcodeRecognizer, RotatedPlanarYUVLuminanceSource

final class cognitionStrategy extends cognitionStrategy
{

    final BarcodeRecognizer this$0;

    protected final LuminanceSource getLuminanceSource(OcrImage ocrimage, Rect rect)
    {
        return new RotatedPlanarYUVLuminanceSource(ocrimage.getData(), ocrimage.getWidth(), ocrimage.getHeight(), rect, new byte[rect.width() * rect.height()]);
    }

    nanceSource()
    {
        this$0 = BarcodeRecognizer.this;
        super(BarcodeRecognizer.this, null);
    }
}
