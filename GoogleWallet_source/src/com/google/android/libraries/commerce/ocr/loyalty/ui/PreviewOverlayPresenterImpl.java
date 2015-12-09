// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.loyalty.ui;

import android.graphics.Rect;
import android.os.Handler;
import android.os.Vibrator;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import com.google.android.libraries.commerce.ocr.capture.CameraManager;
import com.google.android.libraries.commerce.ocr.capture.ImageUtil;
import com.google.android.libraries.commerce.ocr.cv.OcrImage;
import com.google.android.libraries.commerce.ocr.ui.PreviewOverlayView;
import java.io.IOException;

// Referenced classes of package com.google.android.libraries.commerce.ocr.loyalty.ui:
//            PartialResultResponder

public class PreviewOverlayPresenterImpl
    implements PartialResultResponder, com.google.android.libraries.commerce.ocr.ui.PreviewOverlayView.Presenter
{

    protected final CameraManager cameraManager;
    protected final ImageUtil imageUtil;
    private final TextView messageText;
    private final View progressOverlayView;
    private final boolean saveOcrImage;
    private final Handler uiHandler;
    private final Vibrator vibrator;
    protected PreviewOverlayView view;

    public PreviewOverlayPresenterImpl(CameraManager cameramanager, Vibrator vibrator1, Handler handler, View view1, TextView textview, ImageUtil imageutil, boolean flag)
    {
        cameraManager = cameramanager;
        vibrator = vibrator1;
        uiHandler = handler;
        progressOverlayView = view1;
        messageText = textview;
        imageUtil = imageutil;
        saveOcrImage = flag;
    }

    protected static void sendForProcessing(OcrImage ocrimage)
    {
        throw new UnsupportedOperationException("full image not supported");
    }

    public final void onPreviewLayoutFinalized(Rect rect, Rect rect1)
    {
        view.showBoundingBox(rect1);
    }

    public final void setView(PreviewOverlayView previewoverlayview)
    {
        view = previewoverlayview;
    }

    public final void snapAndPerformOcr()
    {
        cameraManager.requestImage(new com.google.android.libraries.commerce.ocr.capture.CameraManager.ImageCallback() {

            final PreviewOverlayPresenterImpl this$0;

            public final void onImage(OcrImage ocrimage)
            {
                PreviewOverlayPresenterImpl previewoverlaypresenterimpl;
                if (saveOcrImage)
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

            
            {
                this$0 = PreviewOverlayPresenterImpl.this;
                super();
            }
        }, (byte)2);
    }

}
