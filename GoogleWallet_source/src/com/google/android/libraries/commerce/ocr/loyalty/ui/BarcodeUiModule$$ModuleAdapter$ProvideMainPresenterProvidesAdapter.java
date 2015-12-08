// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.loyalty.ui;

import dagger.internal.Binding;
import dagger.internal.Linker;
import dagger.internal.ProvidesBinding;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.libraries.commerce.ocr.loyalty.ui:
//            BarcodeUiModule, OcrViewPresenterImpl

public static final class setLibrary extends ProvidesBinding
    implements Provider
{

    private final BarcodeUiModule module;
    private Binding presenter;

    public final void attach(Linker linker)
    {
        presenter = linker.requestBinding("com.google.android.libraries.commerce.ocr.loyalty.ui.OcrViewPresenterImpl", com/google/android/libraries/commerce/ocr/loyalty/ui/BarcodeUiModule, getClass().getClassLoader());
    }

    public final com.google.android.libraries.commerce.ocr.ui.Adapter get()
    {
        BarcodeUiModule barcodeuimodule = module;
        return BarcodeUiModule.provideMainPresenter((OcrViewPresenterImpl)presenter.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(presenter);
    }

    public (BarcodeUiModule barcodeuimodule)
    {
        super("com.google.android.libraries.commerce.ocr.ui.OcrView$Presenter<java.util.ArrayList<com.google.android.libraries.commerce.ocr.loyalty.pub.RecognizedWobInstanceParcelable>, com.google.android.libraries.commerce.ocr.loyalty.debug.DebugInfo>", true, "com.google.android.libraries.commerce.ocr.loyalty.ui.BarcodeUiModule", "provideMainPresenter");
        module = barcodeuimodule;
        setLibrary(true);
    }
}
