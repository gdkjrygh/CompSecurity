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
//            BarcodeUiModule

public static final class setLibrary extends ProvidesBinding
    implements Provider
{

    private final BarcodeUiModule module;
    private Binding roiProvider;

    private OcrRegionOfInterestProvider get()
    {
        BarcodeUiModule barcodeuimodule = module;
        return BarcodeUiModule.provideRegionOfInterestProvider((OcrRegionOfInterestProvider)roiProvider.get());
    }

    public final void attach(Linker linker)
    {
        roiProvider = linker.requestBinding("com.google.android.libraries.commerce.ocr.ui.OcrRegionOfInterestProvider", com/google/android/libraries/commerce/ocr/loyalty/ui/BarcodeUiModule, getClass().getClassLoader());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(roiProvider);
    }

    public _89_(BarcodeUiModule barcodeuimodule)
    {
        super("@com.google.android.libraries.commerce.ocr.annotations.RecognizerAnnotations$BarcodeRecognizer()/com.google.android.libraries.commerce.ocr.ui.OcrRegionOfInterestProvider", true, "com.google.android.libraries.commerce.ocr.loyalty.ui.BarcodeUiModule", "provideRegionOfInterestProvider");
        module = barcodeuimodule;
        setLibrary(true);
    }
}
