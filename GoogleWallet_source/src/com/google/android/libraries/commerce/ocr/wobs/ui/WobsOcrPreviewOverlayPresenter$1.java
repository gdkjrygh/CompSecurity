// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.wobs.ui;

import android.os.Handler;
import com.google.android.libraries.commerce.ocr.cv.OcrImage;

// Referenced classes of package com.google.android.libraries.commerce.ocr.wobs.ui:
//            WobsOcrPreviewOverlayPresenter

final class this._cls0
    implements com.google.android.libraries.commerce.ocr.capture.this._cls0
{

    final WobsOcrPreviewOverlayPresenter this$0;

    public final void onImage(OcrImage ocrimage)
    {
        WobsOcrPreviewOverlayPresenter.access$000(WobsOcrPreviewOverlayPresenter.this).post(getPerformOcrRunnable(ocrimage));
    }

    ()
    {
        this$0 = WobsOcrPreviewOverlayPresenter.this;
        super();
    }
}
