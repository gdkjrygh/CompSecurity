// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.loyalty.ui;

import com.google.android.libraries.commerce.ocr.ui.PreviewOverlayView;
import dagger.internal.Binding;
import dagger.internal.Linker;
import dagger.internal.ProvidesBinding;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.libraries.commerce.ocr.loyalty.ui:
//            BarcodeUiModule, BoxedPreviewOverlayViewImpl

public static final class setLibrary extends ProvidesBinding
    implements Provider
{

    private final BarcodeUiModule module;
    private Binding view;

    public final void attach(Linker linker)
    {
        view = linker.requestBinding("com.google.android.libraries.commerce.ocr.loyalty.ui.BoxedPreviewOverlayViewImpl", com/google/android/libraries/commerce/ocr/loyalty/ui/BarcodeUiModule, getClass().getClassLoader());
    }

    public final PreviewOverlayView get()
    {
        BarcodeUiModule barcodeuimodule = module;
        return BarcodeUiModule.providePreviewOverlayView((BoxedPreviewOverlayViewImpl)view.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(view);
    }

    public (BarcodeUiModule barcodeuimodule)
    {
        super("com.google.android.libraries.commerce.ocr.ui.PreviewOverlayView", true, "com.google.android.libraries.commerce.ocr.loyalty.ui.BarcodeUiModule", "providePreviewOverlayView");
        module = barcodeuimodule;
        setLibrary(true);
    }
}
