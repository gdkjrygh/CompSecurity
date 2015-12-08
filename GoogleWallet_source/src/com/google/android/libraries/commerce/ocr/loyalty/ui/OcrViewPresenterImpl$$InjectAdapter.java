// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.loyalty.ui;

import android.support.v4.app.Fragment;
import com.google.android.libraries.commerce.ocr.capture.CameraManager;
import com.google.android.libraries.commerce.ocr.ui.OcrRegionOfInterestProvider;
import com.google.android.libraries.commerce.ocr.ui.OcrView;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.libraries.commerce.ocr.loyalty.ui:
//            OcrViewPresenterImpl

public final class  extends Binding
    implements Provider
{

    private Binding cameraManager;
    private Binding cameraPreviewCallback;
    private Binding fragment;
    private Binding previewOverlayPresenter;
    private Binding roiProvider;
    private Binding view;

    public final void attach(Linker linker)
    {
        fragment = linker.requestBinding("android.support.v4.app.Fragment", com/google/android/libraries/commerce/ocr/loyalty/ui/OcrViewPresenterImpl, getClass().getClassLoader());
        view = linker.requestBinding("com.google.android.libraries.commerce.ocr.ui.OcrView<com.google.android.libraries.commerce.ocr.ui.PreviewOverlayView>", com/google/android/libraries/commerce/ocr/loyalty/ui/OcrViewPresenterImpl, getClass().getClassLoader());
        cameraPreviewCallback = linker.requestBinding("com.google.android.libraries.commerce.ocr.ui.CameraPreviewView$Presenter", com/google/android/libraries/commerce/ocr/loyalty/ui/OcrViewPresenterImpl, getClass().getClassLoader());
        previewOverlayPresenter = linker.requestBinding("com.google.android.libraries.commerce.ocr.ui.PreviewOverlayView$Presenter<com.google.android.libraries.commerce.ocr.ui.PreviewOverlayView>", com/google/android/libraries/commerce/ocr/loyalty/ui/OcrViewPresenterImpl, getClass().getClassLoader());
        roiProvider = linker.requestBinding("com.google.android.libraries.commerce.ocr.ui.OcrRegionOfInterestProvider", com/google/android/libraries/commerce/ocr/loyalty/ui/OcrViewPresenterImpl, getClass().getClassLoader());
        cameraManager = linker.requestBinding("com.google.android.libraries.commerce.ocr.capture.CameraManager", com/google/android/libraries/commerce/ocr/loyalty/ui/OcrViewPresenterImpl, getClass().getClassLoader());
    }

    public final OcrViewPresenterImpl get()
    {
        return new OcrViewPresenterImpl((Fragment)fragment.get(), (OcrView)view.get(), (com.google.android.libraries.commerce.ocr.ui.Adapter.view)cameraPreviewCallback.get(), (com.google.android.libraries.commerce.ocr.ui.Adapter.cameraPreviewCallback)previewOverlayPresenter.get(), (OcrRegionOfInterestProvider)roiProvider.get(), (CameraManager)cameraManager.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(fragment);
        set.add(view);
        set.add(cameraPreviewCallback);
        set.add(previewOverlayPresenter);
        set.add(roiProvider);
        set.add(cameraManager);
    }

    public ()
    {
        super("com.google.android.libraries.commerce.ocr.loyalty.ui.OcrViewPresenterImpl", "members/com.google.android.libraries.commerce.ocr.loyalty.ui.OcrViewPresenterImpl", false, com/google/android/libraries/commerce/ocr/loyalty/ui/OcrViewPresenterImpl);
    }
}
