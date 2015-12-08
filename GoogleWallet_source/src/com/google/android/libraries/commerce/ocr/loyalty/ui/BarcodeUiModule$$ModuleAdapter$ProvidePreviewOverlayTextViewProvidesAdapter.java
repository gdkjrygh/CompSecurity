// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.loyalty.ui;

import android.view.View;
import android.widget.TextView;
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
    private Binding previewOverlayView;

    public final void attach(Linker linker)
    {
        previewOverlayView = linker.requestBinding("@com.google.android.libraries.commerce.ocr.annotations.ViewGroupAnnotations$PreviewOverlayView()/android.view.View", com/google/android/libraries/commerce/ocr/loyalty/ui/BarcodeUiModule, getClass().getClassLoader());
    }

    public final TextView get()
    {
        BarcodeUiModule barcodeuimodule = module;
        return BarcodeUiModule.providePreviewOverlayTextView((View)previewOverlayView.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(previewOverlayView);
    }

    public (BarcodeUiModule barcodeuimodule)
    {
        super("@com.google.android.libraries.commerce.ocr.annotations.ViewGroupAnnotations$PreviewOverlayTextView()/android.widget.TextView", true, "com.google.android.libraries.commerce.ocr.loyalty.ui.BarcodeUiModule", "providePreviewOverlayTextView");
        module = barcodeuimodule;
        setLibrary(true);
    }
}
