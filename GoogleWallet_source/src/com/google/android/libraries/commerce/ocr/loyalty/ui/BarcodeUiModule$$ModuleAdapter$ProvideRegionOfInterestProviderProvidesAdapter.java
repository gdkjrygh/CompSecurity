// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.loyalty.ui;

import com.google.android.libraries.commerce.ocr.ui.OcrRegionOfInterestProvider;
import dagger.internal.Binding;
import dagger.internal.Linker;
import dagger.internal.ProvidesBinding;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.libraries.commerce.ocr.loyalty.ui:
//            BarcodeUiModule, BarcodeRegionOfInterestProvider

public static final class setLibrary extends ProvidesBinding
    implements Provider
{

    private final BarcodeUiModule module;
    private Binding roiProvider;

    public final void attach(Linker linker)
    {
        roiProvider = linker.requestBinding("com.google.android.libraries.commerce.ocr.loyalty.ui.BarcodeRegionOfInterestProvider", com/google/android/libraries/commerce/ocr/loyalty/ui/BarcodeUiModule, getClass().getClassLoader());
    }

    public final OcrRegionOfInterestProvider get()
    {
        BarcodeUiModule barcodeuimodule = module;
        return BarcodeUiModule.provideRegionOfInterestProvider((BarcodeRegionOfInterestProvider)roiProvider.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(roiProvider);
    }

    public (BarcodeUiModule barcodeuimodule)
    {
        super("com.google.android.libraries.commerce.ocr.ui.OcrRegionOfInterestProvider", true, "com.google.android.libraries.commerce.ocr.loyalty.ui.BarcodeUiModule", "provideRegionOfInterestProvider");
        module = barcodeuimodule;
        setLibrary(true);
    }
}
