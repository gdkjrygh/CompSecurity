// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.loyalty.fragments;

import com.google.android.libraries.commerce.ocr.capture.CameraManager;
import com.google.android.libraries.commerce.ocr.capture.InFocusFrameCheck;
import com.google.android.libraries.commerce.ocr.cv.BlurDetector;
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

    private Binding blurDetector;
    private Binding cameraManager;
    private final OcrModule module;

    public final void attach(Linker linker)
    {
        blurDetector = linker.requestBinding("com.google.android.libraries.commerce.ocr.cv.BlurDetector", com/google/android/libraries/commerce/ocr/loyalty/fragments/OcrModule, getClass().getClassLoader());
        cameraManager = linker.requestBinding("com.google.android.libraries.commerce.ocr.capture.CameraManager", com/google/android/libraries/commerce/ocr/loyalty/fragments/OcrModule, getClass().getClassLoader());
    }

    public final InFocusFrameCheck get()
    {
        OcrModule ocrmodule = module;
        return OcrModule.provideInFocusFrameCheck((BlurDetector)blurDetector.get(), (CameraManager)cameraManager.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(blurDetector);
        set.add(cameraManager);
    }

    public (OcrModule ocrmodule)
    {
        super("com.google.android.libraries.commerce.ocr.capture.InFocusFrameCheck", true, "com.google.android.libraries.commerce.ocr.loyalty.fragments.OcrModule", "provideInFocusFrameCheck");
        module = ocrmodule;
        setLibrary(true);
    }
}
