// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.loyalty.ui;

import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
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

    private Binding fragment;
    private Binding layoutInflator;
    private final BarcodeUiModule module;

    private View get()
    {
        BarcodeUiModule barcodeuimodule = module;
        return BarcodeUiModule.providePreviewOverlayView((Fragment)fragment.get(), (LayoutInflater)layoutInflator.get());
    }

    public final void attach(Linker linker)
    {
        fragment = linker.requestBinding("android.support.v4.app.Fragment", com/google/android/libraries/commerce/ocr/loyalty/ui/BarcodeUiModule, getClass().getClassLoader());
        layoutInflator = linker.requestBinding("android.view.LayoutInflater", com/google/android/libraries/commerce/ocr/loyalty/ui/BarcodeUiModule, getClass().getClassLoader());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(fragment);
        set.add(layoutInflator);
    }

    public (BarcodeUiModule barcodeuimodule)
    {
        super("@com.google.android.libraries.commerce.ocr.annotations.ViewGroupAnnotations$PreviewOverlayView()/android.view.View", true, "com.google.android.libraries.commerce.ocr.loyalty.ui.BarcodeUiModule", "providePreviewOverlayView");
        module = barcodeuimodule;
        setLibrary(true);
    }
}
