// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.wobs.ui;

import android.graphics.Rect;
import android.os.Handler;
import com.google.android.libraries.commerce.ocr.OcrException;
import com.google.android.libraries.commerce.ocr.capture.CameraManager;
import com.google.android.libraries.commerce.ocr.capture.ImageUtil;
import com.google.android.libraries.commerce.ocr.capture.processors.SessionOcrResponseHandler;
import com.google.android.libraries.commerce.ocr.cv.OcrImage;
import com.google.android.libraries.commerce.ocr.ui.PreviewOverlayView;
import com.google.android.libraries.commerce.ocr.wobs.capture.processors.WobsOcrProcessor;
import javax.inject.Provider;

// Referenced classes of package com.google.android.libraries.commerce.ocr.wobs.ui:
//            WobsOcrPreviewOverlayView

public final class WobsOcrPreviewOverlayPresenter
    implements com.google.android.libraries.commerce.ocr.ui.PreviewOverlayView.Presenter
{

    private final Handler backgroundHandler;
    private final CameraManager cameraManager;
    private final ImageUtil imageUtil;
    private final int jpegCompressionRate;
    private final Provider ocrResponseHandlerProvider;
    private final com.google.android.libraries.commerce.ocr.ui.CardHintPreviewOverlayView.CardHintRegionOfInterestProvider roiProvider$7711cd23;
    private WobsOcrPreviewOverlayView view;
    private final WobsOcrProcessor wobsOcrProcessor;

    public WobsOcrPreviewOverlayPresenter(CameraManager cameramanager, ImageUtil imageutil, com.google.android.libraries.commerce.ocr.ui.CardHintPreviewOverlayView.CardHintRegionOfInterestProvider cardhintregionofinterestprovider, WobsOcrProcessor wobsocrprocessor, Provider provider, Handler handler, int i)
    {
        cameraManager = cameramanager;
        imageUtil = imageutil;
        roiProvider$7711cd23 = cardhintregionofinterestprovider;
        wobsOcrProcessor = wobsocrprocessor;
        ocrResponseHandlerProvider = provider;
        backgroundHandler = handler;
        jpegCompressionRate = i;
    }

    final Runnable getPerformOcrRunnable(final OcrImage ocrImage)
    {
        return new Runnable() {

            final WobsOcrPreviewOverlayPresenter this$0;
            final OcrImage val$ocrImage;

            public final void run()
            {
                try
                {
                    Rect rect = roiProvider$7711cd23.getBoundingBoxRectRelativeToCameraPreview();
                    byte abyte0[] = imageUtil.getCroppedRotatedJPEG(ocrImage, rect, jpegCompressionRate, 90);
                    wobsOcrProcessor.performOneOffOcrJpeg(abyte0, false, (SessionOcrResponseHandler)ocrResponseHandlerProvider.get());
                    return;
                }
                catch (OutOfMemoryError outofmemoryerror)
                {
                    ((SessionOcrResponseHandler)ocrResponseHandlerProvider.get()).onError(new OcrException(5, outofmemoryerror));
                    return;
                }
                catch (RuntimeException runtimeexception)
                {
                    ((SessionOcrResponseHandler)ocrResponseHandlerProvider.get()).onError(new OcrException(0, runtimeexception));
                }
            }

            
            {
                this$0 = WobsOcrPreviewOverlayPresenter.this;
                ocrImage = ocrimage;
                super();
            }
        };
    }

    public final void onPreviewLayoutFinalized(Rect rect, Rect rect1)
    {
        view.showBoundingBox(rect1);
    }

    public final volatile void setView(PreviewOverlayView previewoverlayview)
    {
        setView((WobsOcrPreviewOverlayView)previewoverlayview);
    }

    public final void setView(WobsOcrPreviewOverlayView wobsocrpreviewoverlayview)
    {
        view = wobsocrpreviewoverlayview;
    }

    public final void snapAndPerformOcr()
    {
        cameraManager.requestImage(new com.google.android.libraries.commerce.ocr.capture.CameraManager.ImageCallback() {

            final WobsOcrPreviewOverlayPresenter this$0;

            public final void onImage(OcrImage ocrimage)
            {
                backgroundHandler.post(getPerformOcrRunnable(ocrimage));
            }

            
            {
                this$0 = WobsOcrPreviewOverlayPresenter.this;
                super();
            }
        }, (byte)1);
    }






}
