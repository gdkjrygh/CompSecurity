// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.loyalty.capture.processors;

import com.google.android.libraries.commerce.ocr.capture.InFocusFrameCheck;
import com.google.android.libraries.commerce.ocr.capture.pipeline.PipelineNode;
import com.google.android.libraries.commerce.ocr.ui.OcrRegionOfInterestProvider;
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

    private Binding executorService;
    private Binding inFocusFrameCheck;
    private final BarcodeProcessorModule module;
    private Binding roiProvider;

    public final void attach(Linker linker)
    {
        executorService = linker.requestBinding("@com.google.android.libraries.commerce.ocr.annotations.RecognizerAnnotations$FocusRecognizer()/java.util.concurrent.ExecutorService", com/google/android/libraries/commerce/ocr/loyalty/capture/processors/BarcodeProcessorModule, getClass().getClassLoader());
        roiProvider = linker.requestBinding("com.google.android.libraries.commerce.ocr.ui.OcrRegionOfInterestProvider", com/google/android/libraries/commerce/ocr/loyalty/capture/processors/BarcodeProcessorModule, getClass().getClassLoader());
        inFocusFrameCheck = linker.requestBinding("com.google.android.libraries.commerce.ocr.capture.InFocusFrameCheck", com/google/android/libraries/commerce/ocr/loyalty/capture/processors/BarcodeProcessorModule, getClass().getClassLoader());
    }

    public final PipelineNode get()
    {
        BarcodeProcessorModule barcodeprocessormodule = module;
        return BarcodeProcessorModule.provideFocusNode((ExecutorService)executorService.get(), (OcrRegionOfInterestProvider)roiProvider.get(), (InFocusFrameCheck)inFocusFrameCheck.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(executorService);
        set.add(roiProvider);
        set.add(inFocusFrameCheck);
    }

    public (BarcodeProcessorModule barcodeprocessormodule)
    {
        super("@com.google.android.libraries.commerce.ocr.annotations.RecognizerAnnotations$FocusRecognizer()/com.google.android.libraries.commerce.ocr.capture.pipeline.PipelineNode<com.google.android.libraries.commerce.ocr.cv.SafePoolable<com.google.android.libraries.commerce.ocr.cv.OcrImage>, ?>", false, "com.google.android.libraries.commerce.ocr.loyalty.capture.processors.BarcodeProcessorModule", "provideFocusNode");
        module = barcodeprocessormodule;
        setLibrary(true);
    }
}
