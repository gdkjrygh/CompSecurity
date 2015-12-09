// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.capture;

import android.util.Log;
import com.google.android.libraries.commerce.ocr.cv.BlurDetector;
import com.google.android.libraries.commerce.ocr.cv.OcrImage;
import com.google.android.libraries.commerce.ocr.ui.OcrRegionOfInterestProvider;

// Referenced classes of package com.google.android.libraries.commerce.ocr.capture:
//            EdgeChangeListener, CameraManager

public final class InFocusFrameCheck
{

    private final BlurDetector blurDetector;
    private final CameraManager cameraManager;
    private EdgeChangeListener edgeChangeListener;

    public InFocusFrameCheck(BlurDetector blurdetector, CameraManager cameramanager)
    {
        cameraManager = cameramanager;
        blurDetector = blurdetector;
    }

    public final boolean isGoodAndTriggerAutofocus(OcrImage ocrimage, OcrRegionOfInterestProvider ocrregionofinterestprovider)
    {
        if (blurDetector.isBlurred(ocrimage, ocrregionofinterestprovider.getBlurDetectorROI()))
        {
            Log.d("InFocusFrameCheck", String.valueOf(Thread.currentThread().getName()).concat(": Blur image, request auto-focus."));
            if (edgeChangeListener != null)
            {
                edgeChangeListener.onEdgeChange(null);
            }
            cameraManager.requestAutoFocus();
            return false;
        } else
        {
            return true;
        }
    }

    public final void setEdgeChangeListener(EdgeChangeListener edgechangelistener)
    {
        edgeChangeListener = edgechangelistener;
    }
}
