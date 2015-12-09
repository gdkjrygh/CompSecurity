// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.loyalty.fragments;

import dagger.internal.Binding;
import dagger.internal.Linker;
import dagger.internal.ProvidesBinding;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.libraries.commerce.ocr.loyalty.fragments:
//            BarcodeModule, CameraFailureHandler

public static final class setLibrary extends ProvidesBinding
    implements Provider
{

    private Binding cameraFailureHandler;
    private final BarcodeModule module;

    public final void attach(Linker linker)
    {
        cameraFailureHandler = linker.requestBinding("com.google.android.libraries.commerce.ocr.loyalty.fragments.CameraFailureHandler", com/google/android/libraries/commerce/ocr/loyalty/fragments/BarcodeModule, getClass().getClassLoader());
    }

    public final com.google.android.libraries.commerce.ocr.ui.rovidesAdapter get()
    {
        BarcodeModule barcodemodule = module;
        return BarcodeModule.provideCameraOnErrorCallback((CameraFailureHandler)cameraFailureHandler.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(cameraFailureHandler);
    }

    public (BarcodeModule barcodemodule)
    {
        super("com.google.android.libraries.commerce.ocr.ui.CameraPreviewView$OnErrorCallback", false, "com.google.android.libraries.commerce.ocr.loyalty.fragments.BarcodeModule", "provideCameraOnErrorCallback");
        module = barcodemodule;
        setLibrary(true);
    }
}
