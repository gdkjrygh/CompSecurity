// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.loyalty.capture;

import com.google.android.libraries.commerce.ocr.loyalty.debug.InstrumentationSupervisor;
import com.google.android.libraries.commerce.ocr.loyalty.fragments.OcrStateManager;
import dagger.Lazy;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.libraries.commerce.ocr.loyalty.capture:
//            SimpleOcrResponseHandler

public final class  extends Binding
    implements Provider
{

    private Binding instrumentationSupervisor;
    private Binding ocrPresenter;
    private Binding stateManager;

    public final void attach(Linker linker)
    {
        stateManager = linker.requestBinding("com.google.android.libraries.commerce.ocr.loyalty.fragments.OcrStateManager", com/google/android/libraries/commerce/ocr/loyalty/capture/SimpleOcrResponseHandler, getClass().getClassLoader());
        ocrPresenter = linker.requestBinding("dagger.Lazy<com.google.android.libraries.commerce.ocr.ui.OcrView$Presenter<java.util.ArrayList<com.google.android.libraries.commerce.ocr.loyalty.pub.RecognizedWobInstanceParcelable>, com.google.android.libraries.commerce.ocr.loyalty.debug.DebugInfo>>", com/google/android/libraries/commerce/ocr/loyalty/capture/SimpleOcrResponseHandler, getClass().getClassLoader());
        instrumentationSupervisor = linker.requestBinding("com.google.android.libraries.commerce.ocr.loyalty.debug.InstrumentationSupervisor", com/google/android/libraries/commerce/ocr/loyalty/capture/SimpleOcrResponseHandler, getClass().getClassLoader());
    }

    public final SimpleOcrResponseHandler get()
    {
        return new SimpleOcrResponseHandler((OcrStateManager)stateManager.get(), (Lazy)ocrPresenter.get(), (InstrumentationSupervisor)instrumentationSupervisor.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(stateManager);
        set.add(ocrPresenter);
        set.add(instrumentationSupervisor);
    }

    public ()
    {
        super("com.google.android.libraries.commerce.ocr.loyalty.capture.SimpleOcrResponseHandler", "members/com.google.android.libraries.commerce.ocr.loyalty.capture.SimpleOcrResponseHandler", true, com/google/android/libraries/commerce/ocr/loyalty/capture/SimpleOcrResponseHandler);
    }
}
