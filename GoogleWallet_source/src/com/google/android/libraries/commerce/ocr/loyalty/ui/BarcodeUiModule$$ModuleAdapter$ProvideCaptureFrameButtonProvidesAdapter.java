// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.loyalty.ui;

import android.view.View;
import android.widget.Button;
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
    private Binding view;

    public final void attach(Linker linker)
    {
        view = linker.requestBinding("@com.google.android.libraries.commerce.ocr.annotations.ViewGroupAnnotations$PreviewOverlayView()/android.view.View", com/google/android/libraries/commerce/ocr/loyalty/ui/BarcodeUiModule, getClass().getClassLoader());
    }

    public final Button get()
    {
        BarcodeUiModule barcodeuimodule = module;
        return BarcodeUiModule.provideCaptureFrameButton((View)view.get());
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
        super("@com.google.android.libraries.commerce.ocr.annotations.ViewGroupAnnotations$CaptureFrameButton()/android.widget.Button", true, "com.google.android.libraries.commerce.ocr.loyalty.ui.BarcodeUiModule", "provideCaptureFrameButton");
        module = barcodeuimodule;
        setLibrary(true);
    }
}
