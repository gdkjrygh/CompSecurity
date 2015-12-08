// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.kyc.ui;

import android.util.Log;
import com.google.android.libraries.commerce.ocr.capture.pipeline.PipelineNode;
import com.google.android.libraries.commerce.ocr.cv.OcrImage;

// Referenced classes of package com.google.android.libraries.commerce.ocr.kyc.ui:
//            KycPreviewOverlayPresenter

final class this._cls0
    implements com.google.android.libraries.commerce.ocr.capture.his._cls0
{

    final KycPreviewOverlayPresenter this$0;

    public final void onImage(OcrImage ocrimage)
    {
        if (KycPreviewOverlayPresenter.access$000(KycPreviewOverlayPresenter.this) != null)
        {
            KycPreviewOverlayPresenter.access$000(KycPreviewOverlayPresenter.this).process(ocrimage);
            return;
        } else
        {
            Log.w("KycPreviewOverlayPresenter", "snapAndPerformOcr called, but no pipeline present!");
            return;
        }
    }

    ()
    {
        this$0 = KycPreviewOverlayPresenter.this;
        super();
    }
}
