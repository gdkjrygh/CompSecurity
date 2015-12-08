// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.ui;

import android.content.Context;
import android.os.Handler;
import android.widget.Toast;

// Referenced classes of package com.google.android.libraries.commerce.ocr.ui:
//            OcrView, CameraPreviewView, PreviewOverlayView

public final class OcrViewImpl
    implements OcrView
{

    private final CameraPreviewView cameraPreview;
    private final Context context;
    private final Handler handler;
    private final PreviewOverlayView previewOverlayView;

    public OcrViewImpl(Context context1, CameraPreviewView camerapreviewview, PreviewOverlayView previewoverlayview, Handler handler1)
    {
        cameraPreview = camerapreviewview;
        previewOverlayView = previewoverlayview;
        context = context1;
        handler = handler1;
    }

    public final CameraPreviewView getCameraPreviewView()
    {
        return cameraPreview;
    }

    public final PreviewOverlayView getPreviewOverlayView()
    {
        return previewOverlayView;
    }

    public final void showErrorMessage(final int resourceId)
    {
        handler.post(new Runnable() {

            final OcrViewImpl this$0;
            final int val$resourceId;

            public final void run()
            {
                Toast.makeText(context, resourceId, 1).show();
            }

            
            {
                this$0 = OcrViewImpl.this;
                resourceId = i;
                super();
            }
        });
    }

}
