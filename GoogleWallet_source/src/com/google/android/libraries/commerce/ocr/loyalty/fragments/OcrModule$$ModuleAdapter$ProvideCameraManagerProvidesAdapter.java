// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.loyalty.fragments;

import android.graphics.Point;
import com.google.android.libraries.commerce.ocr.capture.CameraManager;
import com.google.android.libraries.commerce.ocr.capture.SizeSelectionStrategy;
import com.google.android.libraries.commerce.ocr.util.ScreenManager;
import com.google.android.libraries.commerce.ocr.util.ShapeModifier;
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

    private Binding attemptContinuousPictureFocusMode;
    private final OcrModule module;
    private Binding screenManager;
    private Binding shapeModifier;
    private Binding sizeSelectionStrategy;
    private Binding targetPictureSize;
    private Binding targetPreviewSize;

    public final void attach(Linker linker)
    {
        screenManager = linker.requestBinding("com.google.android.libraries.commerce.ocr.util.ScreenManager", com/google/android/libraries/commerce/ocr/loyalty/fragments/OcrModule, getClass().getClassLoader());
        shapeModifier = linker.requestBinding("com.google.android.libraries.commerce.ocr.util.ShapeModifier", com/google/android/libraries/commerce/ocr/loyalty/fragments/OcrModule, getClass().getClassLoader());
        targetPreviewSize = linker.requestBinding("@com.google.android.libraries.commerce.ocr.annotations.CameraAnnotations$TargetPreviewSize()/android.graphics.Point", com/google/android/libraries/commerce/ocr/loyalty/fragments/OcrModule, getClass().getClassLoader());
        targetPictureSize = linker.requestBinding("@com.google.android.libraries.commerce.ocr.annotations.CameraAnnotations$TargetPictureSize()/android.graphics.Point", com/google/android/libraries/commerce/ocr/loyalty/fragments/OcrModule, getClass().getClassLoader());
        sizeSelectionStrategy = linker.requestBinding("com.google.android.libraries.commerce.ocr.capture.SizeSelectionStrategy", com/google/android/libraries/commerce/ocr/loyalty/fragments/OcrModule, getClass().getClassLoader());
        attemptContinuousPictureFocusMode = linker.requestBinding("@com.google.android.libraries.commerce.ocr.annotations.CameraAnnotations$ContinuousPictureFocusMode()/java.lang.Boolean", com/google/android/libraries/commerce/ocr/loyalty/fragments/OcrModule, getClass().getClassLoader());
    }

    public final CameraManager get()
    {
        OcrModule ocrmodule = module;
        return OcrModule.provideCameraManager((ScreenManager)screenManager.get(), (ShapeModifier)shapeModifier.get(), (Point)targetPreviewSize.get(), (Point)targetPictureSize.get(), (SizeSelectionStrategy)sizeSelectionStrategy.get(), ((Boolean)attemptContinuousPictureFocusMode.get()).booleanValue());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(screenManager);
        set.add(shapeModifier);
        set.add(targetPreviewSize);
        set.add(targetPictureSize);
        set.add(sizeSelectionStrategy);
        set.add(attemptContinuousPictureFocusMode);
    }

    public (OcrModule ocrmodule)
    {
        super("com.google.android.libraries.commerce.ocr.capture.CameraManager", true, "com.google.android.libraries.commerce.ocr.loyalty.fragments.OcrModule", "provideCameraManager");
        module = ocrmodule;
        setLibrary(true);
    }
}
