// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.wobs.ui;

import com.google.android.libraries.commerce.ocr.OcrException;
import com.google.android.libraries.commerce.ocr.capture.ImageUtil;
import com.google.android.libraries.commerce.ocr.capture.processors.SessionOcrResponseHandler;
import com.google.android.libraries.commerce.ocr.cv.OcrImage;
import com.google.android.libraries.commerce.ocr.wobs.capture.processors.WobsOcrProcessor;
import javax.inject.Provider;

// Referenced classes of package com.google.android.libraries.commerce.ocr.wobs.ui:
//            WobsOcrPreviewOverlayPresenter

final class val.ocrImage
    implements Runnable
{

    final WobsOcrPreviewOverlayPresenter this$0;
    final OcrImage val$ocrImage;

    public final void run()
    {
        try
        {
            android.graphics.Rect rect = WobsOcrPreviewOverlayPresenter.access$100$130022a4(WobsOcrPreviewOverlayPresenter.this).getBoundingBoxRectRelativeToCameraPreview();
            byte abyte0[] = WobsOcrPreviewOverlayPresenter.access$300(WobsOcrPreviewOverlayPresenter.this).getCroppedRotatedJPEG(val$ocrImage, rect, WobsOcrPreviewOverlayPresenter.access$200(WobsOcrPreviewOverlayPresenter.this), 90);
            WobsOcrPreviewOverlayPresenter.access$500(WobsOcrPreviewOverlayPresenter.this).performOneOffOcrJpeg(abyte0, false, (SessionOcrResponseHandler)WobsOcrPreviewOverlayPresenter.access$400(WobsOcrPreviewOverlayPresenter.this).get());
            return;
        }
        catch (OutOfMemoryError outofmemoryerror)
        {
            ((SessionOcrResponseHandler)WobsOcrPreviewOverlayPresenter.access$400(WobsOcrPreviewOverlayPresenter.this).get()).onError(new OcrException(5, outofmemoryerror));
            return;
        }
        catch (RuntimeException runtimeexception)
        {
            ((SessionOcrResponseHandler)WobsOcrPreviewOverlayPresenter.access$400(WobsOcrPreviewOverlayPresenter.this).get()).onError(new OcrException(0, runtimeexception));
        }
    }

    ler()
    {
        this$0 = final_wobsocrpreviewoverlaypresenter;
        val$ocrImage = OcrImage.this;
        super();
    }
}
