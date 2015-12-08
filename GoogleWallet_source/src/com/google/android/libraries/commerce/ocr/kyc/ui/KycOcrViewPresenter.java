// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.kyc.ui;

import android.util.Log;
import android.view.ViewGroup;
import com.google.android.libraries.commerce.ocr.capture.CameraManager;
import com.google.android.libraries.commerce.ocr.ui.OcrRegionOfInterestProvider;
import com.google.android.libraries.commerce.ocr.ui.OcrViewPresenter;
import javax.inject.Provider;

// Referenced classes of package com.google.android.libraries.commerce.ocr.kyc.ui:
//            KycPreviewOverlayPresenter

public final class KycOcrViewPresenter extends OcrViewPresenter
{

    private final Provider analyticsProvider;
    private final com.google.android.libraries.commerce.ocr.kyc.fragments.ImageCaptureFragment.Listener listener;

    public KycOcrViewPresenter(ViewGroup viewgroup, ViewGroup viewgroup1, ViewGroup viewgroup2, CameraManager cameramanager, com.google.android.libraries.commerce.ocr.ui.CameraPreviewView.Presenter presenter, OcrRegionOfInterestProvider ocrregionofinterestprovider, KycPreviewOverlayPresenter kycpreviewoverlaypresenter, 
            com.google.android.libraries.commerce.ocr.kyc.fragments.ImageCaptureFragment.Listener listener1, Provider provider)
    {
        super(viewgroup, viewgroup1, viewgroup2, cameramanager, presenter, ocrregionofinterestprovider, kycpreviewoverlaypresenter);
        listener = listener1;
        analyticsProvider = provider;
    }

    public final void onError()
    {
        Log.e("KycOcrViewPresenter", "cameraPreviewPresenter called onError");
        listener.onError(10003, (com.google.android.libraries.commerce.ocr.kyc.pub.KycOcrResult.Analytics)analyticsProvider.get());
    }
}
