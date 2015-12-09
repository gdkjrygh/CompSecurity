// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.loyalty.ui;

import android.util.Log;
import com.google.android.libraries.commerce.ocr.capture.ImageUtil;
import com.google.android.libraries.commerce.ocr.cv.OcrImage;
import java.io.IOException;

// Referenced classes of package com.google.android.libraries.commerce.ocr.loyalty.ui:
//            PreviewOverlayPresenterImpl

final class this._cls0
    implements com.google.android.libraries.commerce.ocr.capture.._cls1
{

    final PreviewOverlayPresenterImpl this$0;

    public final void onImage(OcrImage ocrimage)
    {
        PreviewOverlayPresenterImpl previewoverlaypresenterimpl;
        if (PreviewOverlayPresenterImpl.access$000(PreviewOverlayPresenterImpl.this))
        {
            try
            {
                imageUtil.saveDebugImage(ocrimage.getData(), "snapped");
            }
            catch (IOException ioexception)
            {
                Log.w("PreviewOverlayPresenterImpl", ioexception);
            }
        }
        previewoverlaypresenterimpl = PreviewOverlayPresenterImpl.this;
        PreviewOverlayPresenterImpl.sendForProcessing(ocrimage);
    }

    ()
    {
        this$0 = PreviewOverlayPresenterImpl.this;
        super();
    }
}
