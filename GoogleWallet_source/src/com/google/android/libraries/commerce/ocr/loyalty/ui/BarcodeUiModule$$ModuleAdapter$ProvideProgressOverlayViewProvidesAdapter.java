// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.loyalty.ui;

import android.view.View;
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
    private Binding overlay;

    public final void attach(Linker linker)
    {
        overlay = linker.requestBinding("@com.google.android.libraries.commerce.ocr.annotations.ViewGroupAnnotations$PreviewOverlayView()/android.view.View", com/google/android/libraries/commerce/ocr/loyalty/ui/BarcodeUiModule, getClass().getClassLoader());
    }

    public final View get()
    {
        BarcodeUiModule barcodeuimodule = module;
        return BarcodeUiModule.provideProgressOverlayView((View)overlay.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(overlay);
    }

    public (BarcodeUiModule barcodeuimodule)
    {
        super("@com.google.android.libraries.commerce.ocr.annotations.ViewGroupAnnotations$ProgressOverlayView()/android.view.View", false, "com.google.android.libraries.commerce.ocr.loyalty.ui.BarcodeUiModule", "provideProgressOverlayView");
        module = barcodeuimodule;
        setLibrary(true);
    }
}
