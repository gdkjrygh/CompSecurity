// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.loyalty.ui;

import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
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
    private final BarcodeUiModule module;

    public final void attach(Linker linker)
    {
        fragment = linker.requestBinding("android.support.v4.app.Fragment", com/google/android/libraries/commerce/ocr/loyalty/ui/BarcodeUiModule, getClass().getClassLoader());
    }

    public final LayoutInflater get()
    {
        BarcodeUiModule barcodeuimodule = module;
        return BarcodeUiModule.provideLayoutInflator((Fragment)fragment.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(fragment);
    }

    public (BarcodeUiModule barcodeuimodule)
    {
        super("android.view.LayoutInflater", false, "com.google.android.libraries.commerce.ocr.loyalty.ui.BarcodeUiModule", "provideLayoutInflator");
        module = barcodeuimodule;
        setLibrary(true);
    }
}
