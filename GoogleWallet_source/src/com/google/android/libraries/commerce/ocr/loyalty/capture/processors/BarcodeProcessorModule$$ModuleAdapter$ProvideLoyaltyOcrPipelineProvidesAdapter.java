// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.loyalty.capture.processors;

import com.google.android.libraries.commerce.ocr.capture.pipeline.PipelineNode;
import com.google.android.libraries.commerce.ocr.capture.processors.CopyProcessor;
import com.google.android.libraries.commerce.ocr.capture.processors.GatingProcessor;
import dagger.internal.Binding;
import dagger.internal.Linker;
import dagger.internal.ProvidesBinding;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.libraries.commerce.ocr.loyalty.capture.processors:
//            BarcodeProcessorModule

public static final class setLibrary extends ProvidesBinding
    implements Provider
{

    private Binding barcodeNode;
    private Binding copyProcessor;
    private Binding focusNode;
    private Binding gatingProcessor;
    private final BarcodeProcessorModule module;

    public final void attach(Linker linker)
    {
        copyProcessor = linker.requestBinding("com.google.android.libraries.commerce.ocr.capture.processors.CopyProcessor", com/google/android/libraries/commerce/ocr/loyalty/capture/processors/BarcodeProcessorModule, getClass().getClassLoader());
        gatingProcessor = linker.requestBinding("@com.google.android.libraries.commerce.ocr.annotations.RecognizerAnnotations$SessionGate()/com.google.android.libraries.commerce.ocr.capture.processors.GatingProcessor<com.google.android.libraries.commerce.ocr.cv.OcrImage>", com/google/android/libraries/commerce/ocr/loyalty/capture/processors/BarcodeProcessorModule, getClass().getClassLoader());
        focusNode = linker.requestBinding("@com.google.android.libraries.commerce.ocr.annotations.RecognizerAnnotations$FocusRecognizer()/com.google.android.libraries.commerce.ocr.capture.pipeline.PipelineNode<com.google.android.libraries.commerce.ocr.cv.SafePoolable<com.google.android.libraries.commerce.ocr.cv.OcrImage>, ?>", com/google/android/libraries/commerce/ocr/loyalty/capture/processors/BarcodeProcessorModule, getClass().getClassLoader());
        barcodeNode = linker.requestBinding("@com.google.android.libraries.commerce.ocr.annotations.RecognizerAnnotations$BarcodeRecognizer()/com.google.android.libraries.commerce.ocr.capture.pipeline.PipelineNode<com.google.android.libraries.commerce.ocr.cv.SafePoolable<com.google.android.libraries.commerce.ocr.cv.OcrImage>, ?>", com/google/android/libraries/commerce/ocr/loyalty/capture/processors/BarcodeProcessorModule, getClass().getClassLoader());
    }

    public final PipelineNode get()
    {
        BarcodeProcessorModule barcodeprocessormodule = module;
        return BarcodeProcessorModule.provideLoyaltyOcrPipeline((CopyProcessor)copyProcessor.get(), (GatingProcessor)gatingProcessor.get(), (PipelineNode)focusNode.get(), (PipelineNode)barcodeNode.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(copyProcessor);
        set.add(gatingProcessor);
        set.add(focusNode);
        set.add(barcodeNode);
    }

    public _99_(BarcodeProcessorModule barcodeprocessormodule)
    {
        super("@com.google.android.libraries.commerce.ocr.annotations.RecognizerAnnotations$OcrPipeline()/com.google.android.libraries.commerce.ocr.capture.pipeline.PipelineNode<com.google.android.libraries.commerce.ocr.cv.OcrImage, ?>", true, "com.google.android.libraries.commerce.ocr.loyalty.capture.processors.BarcodeProcessorModule", "provideLoyaltyOcrPipeline");
        module = barcodeprocessormodule;
        setLibrary(true);
    }
}
