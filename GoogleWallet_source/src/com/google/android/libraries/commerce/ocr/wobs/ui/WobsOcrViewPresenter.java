// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.wobs.ui;

import android.view.ViewGroup;
import com.google.android.libraries.commerce.ocr.capture.CameraManager;
import com.google.android.libraries.commerce.ocr.ui.OcrRegionOfInterestProvider;
import com.google.android.libraries.commerce.ocr.ui.OcrViewPresenter;
import com.google.android.libraries.commerce.ocr.wobs.fragments.TransitionHandler;

// Referenced classes of package com.google.android.libraries.commerce.ocr.wobs.ui:
//            WobsOcrPreviewOverlayPresenter

public final class WobsOcrViewPresenter extends OcrViewPresenter
{

    private com.google.android.libraries.commerce.ocr.capture.CameraManager.OnFinishCallback onPreviewReadyCallback;
    private TransitionHandler transitionHandler;

    public WobsOcrViewPresenter(ViewGroup viewgroup, ViewGroup viewgroup1, ViewGroup viewgroup2, com.google.android.libraries.commerce.ocr.ui.CameraPreviewView.Presenter presenter, WobsOcrPreviewOverlayPresenter wobsocrpreviewoverlaypresenter, OcrRegionOfInterestProvider ocrregionofinterestprovider, CameraManager cameramanager, 
            TransitionHandler transitionhandler)
    {
        super(viewgroup, viewgroup1, viewgroup2, cameramanager, presenter, ocrregionofinterestprovider, wobsocrpreviewoverlaypresenter);
        transitionHandler = transitionhandler;
    }

    public final void onError()
    {
        transitionHandler.exit(10003);
    }

    public final void onPreviewReady()
    {
        super.onPreviewReady();
        if (onPreviewReadyCallback != null)
        {
            onPreviewReadyCallback.onFinish();
        }
    }
}
