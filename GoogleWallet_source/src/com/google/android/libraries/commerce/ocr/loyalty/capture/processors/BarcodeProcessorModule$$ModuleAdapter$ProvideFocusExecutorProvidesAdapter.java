// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.loyalty.capture.processors;

import com.google.android.libraries.commerce.ocr.util.ExecutorServiceFactory;
import dagger.internal.Binding;
import dagger.internal.Linker;
import dagger.internal.ProvidesBinding;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import javax.inject.Provider;

// Referenced classes of package com.google.android.libraries.commerce.ocr.loyalty.capture.processors:
//            BarcodeProcessorModule

public static final class setLibrary extends ProvidesBinding
    implements Provider
{

    private final BarcodeProcessorModule module;
    private Binding serviceFactory;

    public final void attach(Linker linker)
    {
        serviceFactory = linker.requestBinding("com.google.android.libraries.commerce.ocr.util.ExecutorServiceFactory", com/google/android/libraries/commerce/ocr/loyalty/capture/processors/BarcodeProcessorModule, getClass().getClassLoader());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final ExecutorService get()
    {
        BarcodeProcessorModule barcodeprocessormodule = module;
        return BarcodeProcessorModule.provideFocusExecutor((ExecutorServiceFactory)serviceFactory.get());
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(serviceFactory);
    }

    public (BarcodeProcessorModule barcodeprocessormodule)
    {
        super("@com.google.android.libraries.commerce.ocr.annotations.RecognizerAnnotations$FocusRecognizer()/java.util.concurrent.ExecutorService", false, "com.google.android.libraries.commerce.ocr.loyalty.capture.processors.BarcodeProcessorModule", "provideFocusExecutor");
        module = barcodeprocessormodule;
        setLibrary(true);
    }
}
