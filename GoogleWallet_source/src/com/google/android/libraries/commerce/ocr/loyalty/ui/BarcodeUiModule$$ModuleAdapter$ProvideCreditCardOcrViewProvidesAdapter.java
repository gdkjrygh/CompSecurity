// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.loyalty.ui;

import android.content.Context;
import android.os.Handler;
import com.google.android.libraries.commerce.ocr.ui.CameraPreviewView;
import com.google.android.libraries.commerce.ocr.ui.OcrView;
import dagger.internal.Binding;
import dagger.internal.Linker;
import dagger.internal.ProvidesBinding;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.libraries.commerce.ocr.loyalty.ui:
//            BarcodeUiModule, BoxedPreviewOverlayViewImpl

public static final class setLibrary extends ProvidesBinding
    implements Provider
{

    private Binding cameraPreviewView;
    private Binding context;
    private final BarcodeUiModule module;
    private Binding previewOverlayView;
    private Binding uiHandler;

    public final void attach(Linker linker)
    {
        context = linker.requestBinding("android.content.Context", com/google/android/libraries/commerce/ocr/loyalty/ui/BarcodeUiModule, getClass().getClassLoader());
        cameraPreviewView = linker.requestBinding("com.google.android.libraries.commerce.ocr.ui.CameraPreviewView", com/google/android/libraries/commerce/ocr/loyalty/ui/BarcodeUiModule, getClass().getClassLoader());
        previewOverlayView = linker.requestBinding("com.google.android.libraries.commerce.ocr.loyalty.ui.BoxedPreviewOverlayViewImpl", com/google/android/libraries/commerce/ocr/loyalty/ui/BarcodeUiModule, getClass().getClassLoader());
        uiHandler = linker.requestBinding("android.os.Handler", com/google/android/libraries/commerce/ocr/loyalty/ui/BarcodeUiModule, getClass().getClassLoader());
    }

    public final OcrView get()
    {
        BarcodeUiModule barcodeuimodule = module;
        return BarcodeUiModule.provideCreditCardOcrView((Context)context.get(), (CameraPreviewView)cameraPreviewView.get(), (BoxedPreviewOverlayViewImpl)previewOverlayView.get(), (Handler)uiHandler.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(context);
        set.add(cameraPreviewView);
        set.add(previewOverlayView);
        set.add(uiHandler);
    }

    public _81_(BarcodeUiModule barcodeuimodule)
    {
        super("com.google.android.libraries.commerce.ocr.ui.OcrView<com.google.android.libraries.commerce.ocr.ui.PreviewOverlayView>", true, "com.google.android.libraries.commerce.ocr.loyalty.ui.BarcodeUiModule", "provideCreditCardOcrView");
        module = barcodeuimodule;
        setLibrary(true);
    }
}
