// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.loyalty.capture.processors;

import com.google.android.libraries.commerce.ocr.capture.InFocusFrameCheck;
import com.google.android.libraries.commerce.ocr.capture.pipeline.PipelineNode;
import com.google.android.libraries.commerce.ocr.capture.processors.CopyProcessor;
import com.google.android.libraries.commerce.ocr.capture.processors.GatingProcessor;
import com.google.android.libraries.commerce.ocr.cv.ResourcePool;
import com.google.android.libraries.commerce.ocr.loyalty.capture.BarcodeDecoder;
import com.google.android.libraries.commerce.ocr.loyalty.capture.BarcodeRecognizer;
import com.google.android.libraries.commerce.ocr.loyalty.debug.InstrumentationSupervisor;
import com.google.android.libraries.commerce.ocr.ui.OcrRegionOfInterestProvider;
import com.google.android.libraries.commerce.ocr.util.ExecutorServiceFactory;
import dagger.internal.Binding;
import dagger.internal.BindingsGroup;
import dagger.internal.Linker;
import dagger.internal.ModuleAdapter;
import dagger.internal.ProvidesBinding;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import javax.inject.Provider;

// Referenced classes of package com.google.android.libraries.commerce.ocr.loyalty.capture.processors:
//            BarcodeProcessorModule

public final class INCLUDES extends ModuleAdapter
{
    public static final class ProvideBarcodeNodeProvidesAdapter extends ProvidesBinding
        implements Provider
    {

        private final BarcodeProcessorModule module;
        private Binding reader;
        private Binding roiAreaProvider;

        public final void attach(Linker linker)
        {
            reader = linker.requestBinding("com.google.android.libraries.commerce.ocr.loyalty.capture.BarcodeDecoder", com/google/android/libraries/commerce/ocr/loyalty/capture/processors/BarcodeProcessorModule, getClass().getClassLoader());
            roiAreaProvider = linker.requestBinding("@com.google.android.libraries.commerce.ocr.annotations.RecognizerAnnotations$BarcodeRecognizer()/com.google.android.libraries.commerce.ocr.ui.OcrRegionOfInterestProvider", com/google/android/libraries/commerce/ocr/loyalty/capture/processors/BarcodeProcessorModule, getClass().getClassLoader());
        }

        public final BarcodeRecognizer get()
        {
            BarcodeProcessorModule barcodeprocessormodule = module;
            return BarcodeProcessorModule.provideBarcodeNode((BarcodeDecoder)reader.get(), (OcrRegionOfInterestProvider)roiAreaProvider.get());
        }

        public final volatile Object get()
        {
            return get();
        }

        public final void getDependencies(Set set, Set set1)
        {
            set.add(reader);
            set.add(roiAreaProvider);
        }

        public ProvideBarcodeNodeProvidesAdapter(BarcodeProcessorModule barcodeprocessormodule)
        {
            super("com.google.android.libraries.commerce.ocr.loyalty.capture.BarcodeRecognizer<com.google.android.libraries.commerce.ocr.loyalty.debug.DebugInfo>", false, "com.google.android.libraries.commerce.ocr.loyalty.capture.processors.BarcodeProcessorModule", "provideBarcodeNode");
            module = barcodeprocessormodule;
            setLibrary(true);
        }
    }

    public static final class ProvideBarcodeNodeProvidesAdapter2 extends ProvidesBinding
        implements Provider
    {

        private Binding barcodeRecognizer;
        private Binding executorService;
        private Binding instrumentationSupervisor;
        private final BarcodeProcessorModule module;
        private Binding ocrHandler;
        private Binding scanIntervalInMs;

        private PipelineNode get()
        {
            BarcodeProcessorModule barcodeprocessormodule = module;
            return BarcodeProcessorModule.provideBarcodeNode((ExecutorService)executorService.get(), ((Integer)scanIntervalInMs.get()).intValue(), (BarcodeRecognizer)barcodeRecognizer.get(), (com.google.android.libraries.commerce.ocr.capture.OcrRecognizer.OcrResponseHandler)ocrHandler.get(), (InstrumentationSupervisor)instrumentationSupervisor.get());
        }

        public final void attach(Linker linker)
        {
            executorService = linker.requestBinding("@com.google.android.libraries.commerce.ocr.annotations.RecognizerAnnotations$OcrRecognizer()/java.util.concurrent.ExecutorService", com/google/android/libraries/commerce/ocr/loyalty/capture/processors/BarcodeProcessorModule, getClass().getClassLoader());
            scanIntervalInMs = linker.requestBinding("@com.google.android.libraries.commerce.ocr.annotations.IntentAnnotations$MinPerformOcrIntervalInMs()/java.lang.Integer", com/google/android/libraries/commerce/ocr/loyalty/capture/processors/BarcodeProcessorModule, getClass().getClassLoader());
            barcodeRecognizer = linker.requestBinding("com.google.android.libraries.commerce.ocr.loyalty.capture.BarcodeRecognizer<com.google.android.libraries.commerce.ocr.loyalty.debug.DebugInfo>", com/google/android/libraries/commerce/ocr/loyalty/capture/processors/BarcodeProcessorModule, getClass().getClassLoader());
            ocrHandler = linker.requestBinding("com.google.android.libraries.commerce.ocr.capture.OcrRecognizer$OcrResponseHandler<java.util.ArrayList<com.google.android.libraries.commerce.ocr.loyalty.pub.RecognizedWobInstanceParcelable>, com.google.android.libraries.commerce.ocr.loyalty.debug.DebugInfo>", com/google/android/libraries/commerce/ocr/loyalty/capture/processors/BarcodeProcessorModule, getClass().getClassLoader());
            instrumentationSupervisor = linker.requestBinding("com.google.android.libraries.commerce.ocr.loyalty.debug.InstrumentationSupervisor", com/google/android/libraries/commerce/ocr/loyalty/capture/processors/BarcodeProcessorModule, getClass().getClassLoader());
        }

        public final volatile Object get()
        {
            return get();
        }

        public final void getDependencies(Set set, Set set1)
        {
            set.add(executorService);
            set.add(scanIntervalInMs);
            set.add(barcodeRecognizer);
            set.add(ocrHandler);
            set.add(instrumentationSupervisor);
        }

        public ProvideBarcodeNodeProvidesAdapter2(BarcodeProcessorModule barcodeprocessormodule)
        {
            super("@com.google.android.libraries.commerce.ocr.annotations.RecognizerAnnotations$BarcodeRecognizer()/com.google.android.libraries.commerce.ocr.capture.pipeline.PipelineNode<com.google.android.libraries.commerce.ocr.cv.SafePoolable<com.google.android.libraries.commerce.ocr.cv.OcrImage>, ?>", false, "com.google.android.libraries.commerce.ocr.loyalty.capture.processors.BarcodeProcessorModule", "provideBarcodeNode");
            module = barcodeprocessormodule;
            setLibrary(true);
        }
    }

    public static final class ProvideCopyProcessorProvidesAdapter extends ProvidesBinding
        implements Provider
    {

        private final BarcodeProcessorModule module;
        private Binding ocrImagePool;

        public final void attach(Linker linker)
        {
            ocrImagePool = linker.requestBinding("com.google.android.libraries.commerce.ocr.cv.ResourcePool<com.google.android.libraries.commerce.ocr.cv.OcrImage>", com/google/android/libraries/commerce/ocr/loyalty/capture/processors/BarcodeProcessorModule, getClass().getClassLoader());
        }

        public final CopyProcessor get()
        {
            BarcodeProcessorModule barcodeprocessormodule = module;
            return BarcodeProcessorModule.provideCopyProcessor((ResourcePool)ocrImagePool.get());
        }

        public final volatile Object get()
        {
            return get();
        }

        public final void getDependencies(Set set, Set set1)
        {
            set.add(ocrImagePool);
        }

        public ProvideCopyProcessorProvidesAdapter(BarcodeProcessorModule barcodeprocessormodule)
        {
            super("com.google.android.libraries.commerce.ocr.capture.processors.CopyProcessor", false, "com.google.android.libraries.commerce.ocr.loyalty.capture.processors.BarcodeProcessorModule", "provideCopyProcessor");
            module = barcodeprocessormodule;
            setLibrary(true);
        }
    }

    public static final class ProvideFocusExecutorProvidesAdapter extends ProvidesBinding
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

        public ProvideFocusExecutorProvidesAdapter(BarcodeProcessorModule barcodeprocessormodule)
        {
            super("@com.google.android.libraries.commerce.ocr.annotations.RecognizerAnnotations$FocusRecognizer()/java.util.concurrent.ExecutorService", false, "com.google.android.libraries.commerce.ocr.loyalty.capture.processors.BarcodeProcessorModule", "provideFocusExecutor");
            module = barcodeprocessormodule;
            setLibrary(true);
        }
    }

    public static final class ProvideFocusNodeProvidesAdapter extends ProvidesBinding
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

        public ProvideFocusNodeProvidesAdapter(BarcodeProcessorModule barcodeprocessormodule)
        {
            super("@com.google.android.libraries.commerce.ocr.annotations.RecognizerAnnotations$FocusRecognizer()/com.google.android.libraries.commerce.ocr.capture.pipeline.PipelineNode<com.google.android.libraries.commerce.ocr.cv.SafePoolable<com.google.android.libraries.commerce.ocr.cv.OcrImage>, ?>", false, "com.google.android.libraries.commerce.ocr.loyalty.capture.processors.BarcodeProcessorModule", "provideFocusNode");
            module = barcodeprocessormodule;
            setLibrary(true);
        }
    }

    public static final class ProvideGlobalGatingProcessorProvidesAdapter extends ProvidesBinding
        implements Provider
    {

        private final BarcodeProcessorModule module;

        public final GatingProcessor get()
        {
            BarcodeProcessorModule barcodeprocessormodule = module;
            return BarcodeProcessorModule.provideGlobalGatingProcessor();
        }

        public final volatile Object get()
        {
            return get();
        }

        public ProvideGlobalGatingProcessorProvidesAdapter(BarcodeProcessorModule barcodeprocessormodule)
        {
            super("@com.google.android.libraries.commerce.ocr.annotations.RecognizerAnnotations$SessionGate()/com.google.android.libraries.commerce.ocr.capture.processors.GatingProcessor<com.google.android.libraries.commerce.ocr.cv.OcrImage>", true, "com.google.android.libraries.commerce.ocr.loyalty.capture.processors.BarcodeProcessorModule", "provideGlobalGatingProcessor");
            module = barcodeprocessormodule;
            setLibrary(true);
        }
    }

    public static final class ProvideLoyaltyOcrPipelineProvidesAdapter extends ProvidesBinding
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

        public ProvideLoyaltyOcrPipelineProvidesAdapter(BarcodeProcessorModule barcodeprocessormodule)
        {
            super("@com.google.android.libraries.commerce.ocr.annotations.RecognizerAnnotations$OcrPipeline()/com.google.android.libraries.commerce.ocr.capture.pipeline.PipelineNode<com.google.android.libraries.commerce.ocr.cv.OcrImage, ?>", true, "com.google.android.libraries.commerce.ocr.loyalty.capture.processors.BarcodeProcessorModule", "provideLoyaltyOcrPipeline");
            module = barcodeprocessormodule;
            setLibrary(true);
        }
    }

    public static final class ProvideOcrExecutorProvidesAdapter extends ProvidesBinding
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
            return BarcodeProcessorModule.provideOcrExecutor((ExecutorServiceFactory)serviceFactory.get());
        }

        public final void getDependencies(Set set, Set set1)
        {
            set.add(serviceFactory);
        }

        public ProvideOcrExecutorProvidesAdapter(BarcodeProcessorModule barcodeprocessormodule)
        {
            super("@com.google.android.libraries.commerce.ocr.annotations.RecognizerAnnotations$OcrRecognizer()/java.util.concurrent.ExecutorService", false, "com.google.android.libraries.commerce.ocr.loyalty.capture.processors.BarcodeProcessorModule", "provideOcrExecutor");
            module = barcodeprocessormodule;
            setLibrary(true);
        }
    }


    private static final Class INCLUDES[] = new Class[0];
    private static final String INJECTS[] = new String[0];
    private static final Class STATIC_INJECTIONS[] = new Class[0];

    public final void getBindings(BindingsGroup bindingsgroup, BarcodeProcessorModule barcodeprocessormodule)
    {
        bindingsgroup.contributeProvidesBinding("@com.google.android.libraries.commerce.ocr.annotations.RecognizerAnnotations$OcrPipeline()/com.google.android.libraries.commerce.ocr.capture.pipeline.PipelineNode<com.google.android.libraries.commerce.ocr.cv.OcrImage, ?>", new ProvideLoyaltyOcrPipelineProvidesAdapter(barcodeprocessormodule));
        bindingsgroup.contributeProvidesBinding("@com.google.android.libraries.commerce.ocr.annotations.RecognizerAnnotations$SessionGate()/com.google.android.libraries.commerce.ocr.capture.processors.GatingProcessor<com.google.android.libraries.commerce.ocr.cv.OcrImage>", new ProvideGlobalGatingProcessorProvidesAdapter(barcodeprocessormodule));
        bindingsgroup.contributeProvidesBinding("com.google.android.libraries.commerce.ocr.capture.processors.CopyProcessor", new ProvideCopyProcessorProvidesAdapter(barcodeprocessormodule));
        bindingsgroup.contributeProvidesBinding("@com.google.android.libraries.commerce.ocr.annotations.RecognizerAnnotations$FocusRecognizer()/com.google.android.libraries.commerce.ocr.capture.pipeline.PipelineNode<com.google.android.libraries.commerce.ocr.cv.SafePoolable<com.google.android.libraries.commerce.ocr.cv.OcrImage>, ?>", new ProvideFocusNodeProvidesAdapter(barcodeprocessormodule));
        bindingsgroup.contributeProvidesBinding("com.google.android.libraries.commerce.ocr.loyalty.capture.BarcodeRecognizer<com.google.android.libraries.commerce.ocr.loyalty.debug.DebugInfo>", new ProvideBarcodeNodeProvidesAdapter(barcodeprocessormodule));
        bindingsgroup.contributeProvidesBinding("@com.google.android.libraries.commerce.ocr.annotations.RecognizerAnnotations$BarcodeRecognizer()/com.google.android.libraries.commerce.ocr.capture.pipeline.PipelineNode<com.google.android.libraries.commerce.ocr.cv.SafePoolable<com.google.android.libraries.commerce.ocr.cv.OcrImage>, ?>", new ProvideBarcodeNodeProvidesAdapter2(barcodeprocessormodule));
        bindingsgroup.contributeProvidesBinding("@com.google.android.libraries.commerce.ocr.annotations.RecognizerAnnotations$OcrRecognizer()/java.util.concurrent.ExecutorService", new ProvideOcrExecutorProvidesAdapter(barcodeprocessormodule));
        bindingsgroup.contributeProvidesBinding("@com.google.android.libraries.commerce.ocr.annotations.RecognizerAnnotations$FocusRecognizer()/java.util.concurrent.ExecutorService", new ProvideFocusExecutorProvidesAdapter(barcodeprocessormodule));
    }

    public final volatile void getBindings(BindingsGroup bindingsgroup, Object obj)
    {
        getBindings(bindingsgroup, (BarcodeProcessorModule)obj);
    }

    public final BarcodeProcessorModule newModule()
    {
        return new BarcodeProcessorModule();
    }

    public final volatile Object newModule()
    {
        return newModule();
    }


    public ProvideOcrExecutorProvidesAdapter.setLibrary()
    {
        super(com/google/android/libraries/commerce/ocr/loyalty/capture/processors/BarcodeProcessorModule, INJECTS, STATIC_INJECTIONS, false, INCLUDES, false, true);
    }
}
