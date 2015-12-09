// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.wobs.ui;

import android.content.Context;
import android.os.Handler;
import android.widget.Toast;
import com.google.android.libraries.commerce.ocr.ui.CameraPreviewView;
import com.google.android.libraries.commerce.ocr.ui.OcrView;
import com.google.android.libraries.commerce.ocr.ui.PreviewOverlayView;

// Referenced classes of package com.google.android.libraries.commerce.ocr.wobs.ui:
//            WobsOcrPreviewOverlayView

public final class WobsOcrView
    implements OcrView
{

    private final CameraPreviewView cameraPreview;
    private final Context context;
    private final Handler handler;
    private final WobsOcrPreviewOverlayView previewOverlayView;

    public WobsOcrView(Context context1, CameraPreviewView camerapreviewview, WobsOcrPreviewOverlayView wobsocrpreviewoverlayview, Handler handler1)
    {
        cameraPreview = camerapreviewview;
        previewOverlayView = wobsocrpreviewoverlayview;
        context = context1;
        handler = handler1;
    }

    private WobsOcrPreviewOverlayView getPreviewOverlayView()
    {
        return previewOverlayView;
    }

    public final CameraPreviewView getCameraPreviewView()
    {
        return cameraPreview;
    }

    public final volatile PreviewOverlayView getPreviewOverlayView()
    {
        return getPreviewOverlayView();
    }

    public final void showErrorMessage(final int resourceId)
    {
        handler.post(new Runnable() {

            final WobsOcrView this$0;
            final int val$resourceId;

            public final void run()
            {
                Toast.makeText(context, resourceId, 1).show();
            }

            
            {
                this$0 = WobsOcrView.this;
                resourceId = i;
                super();
            }
        });
    }

}
