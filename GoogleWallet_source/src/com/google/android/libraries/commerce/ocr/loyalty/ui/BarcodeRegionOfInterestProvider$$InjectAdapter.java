// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.loyalty.ui;

import com.google.android.libraries.commerce.ocr.capture.CameraManager;
import com.google.android.libraries.commerce.ocr.util.ShapeModifier;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.libraries.commerce.ocr.loyalty.ui:
//            BarcodeRegionOfInterestProvider

public final class i extends Binding
    implements Provider
{

    private Binding cameraManager;
    private Binding shapeModifier;

    public final void attach(Linker linker)
    {
        cameraManager = linker.requestBinding("com.google.android.libraries.commerce.ocr.capture.CameraManager", com/google/android/libraries/commerce/ocr/loyalty/ui/BarcodeRegionOfInterestProvider, getClass().getClassLoader());
        shapeModifier = linker.requestBinding("com.google.android.libraries.commerce.ocr.util.ShapeModifier", com/google/android/libraries/commerce/ocr/loyalty/ui/BarcodeRegionOfInterestProvider, getClass().getClassLoader());
    }

    public final BarcodeRegionOfInterestProvider get()
    {
        return new BarcodeRegionOfInterestProvider((CameraManager)cameraManager.get(), (ShapeModifier)shapeModifier.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(cameraManager);
        set.add(shapeModifier);
    }

    public i()
    {
        super("com.google.android.libraries.commerce.ocr.loyalty.ui.BarcodeRegionOfInterestProvider", "members/com.google.android.libraries.commerce.ocr.loyalty.ui.BarcodeRegionOfInterestProvider", true, com/google/android/libraries/commerce/ocr/loyalty/ui/BarcodeRegionOfInterestProvider);
    }
}
