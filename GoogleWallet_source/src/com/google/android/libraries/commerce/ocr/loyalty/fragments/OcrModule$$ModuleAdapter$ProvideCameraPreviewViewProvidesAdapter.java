// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.loyalty.fragments;

import android.content.Context;
import com.google.android.libraries.commerce.ocr.ui.CameraPreviewView;
import dagger.internal.Binding;
import dagger.internal.Linker;
import dagger.internal.ProvidesBinding;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.libraries.commerce.ocr.loyalty.fragments:
//            OcrModule

public static final class setLibrary extends ProvidesBinding
    implements Provider
{

    private Binding cameraPreviewPresenter;
    private Binding context;
    private final OcrModule module;

    public final void attach(Linker linker)
    {
        context = linker.requestBinding("android.content.Context", com/google/android/libraries/commerce/ocr/loyalty/fragments/OcrModule, getClass().getClassLoader());
        cameraPreviewPresenter = linker.requestBinding("com.google.android.libraries.commerce.ocr.ui.CameraPreviewView$Presenter", com/google/android/libraries/commerce/ocr/loyalty/fragments/OcrModule, getClass().getClassLoader());
    }

    public final CameraPreviewView get()
    {
        OcrModule ocrmodule = module;
        return OcrModule.provideCameraPreviewView((Context)context.get(), (com.google.android.libraries.commerce.ocr.ui.rovidesAdapter.context)cameraPreviewPresenter.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(context);
        set.add(cameraPreviewPresenter);
    }

    public (OcrModule ocrmodule)
    {
        super("com.google.android.libraries.commerce.ocr.ui.CameraPreviewView", true, "com.google.android.libraries.commerce.ocr.loyalty.fragments.OcrModule", "provideCameraPreviewView");
        module = ocrmodule;
        setLibrary(true);
    }
}
