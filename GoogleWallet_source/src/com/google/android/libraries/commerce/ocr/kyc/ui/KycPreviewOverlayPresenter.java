// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.kyc.ui;

import android.graphics.Rect;
import android.util.Log;
import com.google.android.libraries.commerce.ocr.capture.CameraManager;
import com.google.android.libraries.commerce.ocr.capture.pipeline.PipelineNode;
import com.google.android.libraries.commerce.ocr.cv.OcrImage;
import com.google.android.libraries.commerce.ocr.ui.PreviewOverlayView;

// Referenced classes of package com.google.android.libraries.commerce.ocr.kyc.ui:
//            KycOcrPreviewOverlayView

public final class KycPreviewOverlayPresenter
    implements com.google.android.libraries.commerce.ocr.ui.PreviewOverlayView.Presenter
{

    private final CameraManager cameraManager;
    private PipelineNode snapshotPipeline;
    private KycOcrPreviewOverlayView view;

    public KycPreviewOverlayPresenter(CameraManager cameramanager)
    {
        cameraManager = cameramanager;
    }

    public final void onPreviewLayoutFinalized(Rect rect, Rect rect1)
    {
        view.showBoundingBox(rect1);
    }

    public final void setPipeline(PipelineNode pipelinenode)
    {
        snapshotPipeline = pipelinenode;
        if (view != null)
        {
            KycOcrPreviewOverlayView kycocrpreviewoverlayview = view;
            boolean flag;
            if (pipelinenode != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            kycocrpreviewoverlayview.setManualCaptureAllowed(flag);
        }
    }

    public final void setView(KycOcrPreviewOverlayView kycocrpreviewoverlayview)
    {
        view = kycocrpreviewoverlayview;
    }

    public final volatile void setView(PreviewOverlayView previewoverlayview)
    {
        setView((KycOcrPreviewOverlayView)previewoverlayview);
    }

    public final void snapAndPerformOcr()
    {
        cameraManager.requestImage(new com.google.android.libraries.commerce.ocr.capture.CameraManager.ImageCallback() {

            final KycPreviewOverlayPresenter this$0;

            public final void onImage(OcrImage ocrimage)
            {
                if (snapshotPipeline != null)
                {
                    snapshotPipeline.process(ocrimage);
                    return;
                } else
                {
                    Log.w("KycPreviewOverlayPresenter", "snapAndPerformOcr called, but no pipeline present!");
                    return;
                }
            }

            
            {
                this$0 = KycPreviewOverlayPresenter.this;
                super();
            }
        }, (byte)1);
    }

}
