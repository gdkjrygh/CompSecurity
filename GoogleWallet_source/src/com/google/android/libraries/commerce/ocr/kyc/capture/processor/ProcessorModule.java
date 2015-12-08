// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.kyc.capture.processor;

import com.google.android.libraries.commerce.ocr.capture.ImageUtil;
import com.google.android.libraries.commerce.ocr.capture.InFocusFrameCheck;
import com.google.android.libraries.commerce.ocr.capture.pipeline.Pipeline;
import com.google.android.libraries.commerce.ocr.capture.pipeline.PipelineNode;
import com.google.android.libraries.commerce.ocr.capture.processors.CardRectificationProcessor;
import com.google.android.libraries.commerce.ocr.capture.processors.CopyProcessor;
import com.google.android.libraries.commerce.ocr.capture.processors.FocusProcessor;
import com.google.android.libraries.commerce.ocr.capture.processors.GatingProcessor;
import com.google.android.libraries.commerce.ocr.capture.processors.IntervalPolicy;
import com.google.android.libraries.commerce.ocr.capture.processors.NonNullInputNotifyingProcessor;
import com.google.android.libraries.commerce.ocr.capture.processors.Processor;
import com.google.android.libraries.commerce.ocr.capture.processors.SessionPassthroughProcessor;
import com.google.android.libraries.commerce.ocr.capture.processors.SessionProcessor;
import com.google.android.libraries.commerce.ocr.capture.processors.SessionSafePoolable;
import com.google.android.libraries.commerce.ocr.cv.OcrImage;
import com.google.android.libraries.commerce.ocr.cv.ResourcePool;
import com.google.android.libraries.commerce.ocr.util.ExecutorServiceFactory;
import java.util.concurrent.ExecutorService;
import javax.inject.Provider;

// Referenced classes of package com.google.android.libraries.commerce.ocr.kyc.capture.processor:
//            BarhopperProcessor, SnapshotCroppingProcessor

public final class ProcessorModule
{

    public ProcessorModule()
    {
    }

    private static ExecutorService provideFocusExecutor(ExecutorServiceFactory executorservicefactory)
    {
        return executorservicefactory.create(1, 1, 10000L, 1);
    }

    private static IntervalPolicy provideFocusIntervalPolicy()
    {
        return new IntervalPolicy(200);
    }

    private com.google.android.libraries.commerce.ocr.capture.pipeline.Pipeline.PipelineBuilder provideFocusedSessionPipeline$24922bf2(ExecutorServiceFactory executorservicefactory, com.google.android.libraries.commerce.ocr.ui.CardHintPreviewOverlayView.CardHintRegionOfInterestProvider cardhintregionofinterestprovider, ResourcePool resourcepool, PipelineNode pipelinenode, InFocusFrameCheck infocusframecheck, boolean flag, Provider provider, 
            final KycOcrAnalyticsImpl.Builder analyticsBuilder)
    {
        NonNullInputNotifyingProcessor nonnullinputnotifyingprocessor = new NonNullInputNotifyingProcessor() {

            final ProcessorModule this$0;
            final KycOcrAnalyticsImpl.Builder val$analyticsBuilder;

            private void onNonNullInput(OcrImage ocrimage)
            {
                analyticsBuilder.recordFirstFrameSentTime();
            }

            public final volatile void onNonNullInput(Object obj)
            {
                onNonNullInput((OcrImage)obj);
            }

            
            {
                this$0 = ProcessorModule.this;
                analyticsBuilder = builder;
                super();
            }
        };
        resourcepool = new CopyProcessor(provideFocusIntervalPolicy(), resourcepool);
        provider = new SessionProcessor(provider);
        cardhintregionofinterestprovider = new FocusProcessor(cardhintregionofinterestprovider, infocusframecheck, flag);
        infocusframecheck = new NonNullInputNotifyingProcessor() {

            final ProcessorModule this$0;
            final KycOcrAnalyticsImpl.Builder val$analyticsBuilder;

            private void onNonNullInput(SessionSafePoolable sessionsafepoolable)
            {
                analyticsBuilder.recordFirstFrameFocusedTime();
            }

            public final volatile void onNonNullInput(Object obj)
            {
                onNonNullInput((SessionSafePoolable)obj);
            }

            
            {
                this$0 = ProcessorModule.this;
                analyticsBuilder = builder;
                super();
            }
        };
        return Pipeline.wire(pipelinenode).pipeTo(Pipeline.forSync(nonnullinputnotifyingprocessor)).pipeTo(Pipeline.forSync(resourcepool)).pipeTo(Pipeline.forSync(provider)).pipeTo(Pipeline.forAsync(provideFocusExecutor(executorservicefactory), cardhintregionofinterestprovider)).pipeTo(Pipeline.forSync(infocusframecheck));
    }

    private static ExecutorService provideOcrExecutor(ExecutorServiceFactory executorservicefactory)
    {
        return executorservicefactory.create(1, 1, 10000L, 1);
    }

    public static IntervalPolicy provideOcrIntervalPolicy(int i)
    {
        return new IntervalPolicy(i);
    }

    public final PipelineNode provideBackSidePipelineProcessor$1bae286b(ExecutorServiceFactory executorservicefactory, com.google.android.libraries.commerce.ocr.ui.CardHintPreviewOverlayView.CardHintRegionOfInterestProvider cardhintregionofinterestprovider, ResourcePool resourcepool, GatingProcessor gatingprocessor, InFocusFrameCheck infocusframecheck, Processor processor, Provider provider, 
            KycOcrAnalyticsImpl.Builder builder)
    {
        gatingprocessor = Pipeline.forSync(gatingprocessor);
        SessionPassthroughProcessor sessionpassthroughprocessor = new SessionPassthroughProcessor(new BarhopperProcessor(new ImageUtil(), 2048));
        provideFocusedSessionPipeline$24922bf2(executorservicefactory, cardhintregionofinterestprovider, resourcepool, gatingprocessor, infocusframecheck, false, provider, builder).pipeTo(Pipeline.forAsync(provideOcrExecutor(executorservicefactory), sessionpassthroughprocessor)).pipeTo(Pipeline.forAsync(provideOcrExecutor(executorservicefactory), processor));
        return gatingprocessor;
    }

    public final PipelineNode provideFrontSidePipelineProcessor$3cd588c8(ExecutorServiceFactory executorservicefactory, com.google.android.libraries.commerce.ocr.ui.CardHintPreviewOverlayView.CardHintRegionOfInterestProvider cardhintregionofinterestprovider, ResourcePool resourcepool, GatingProcessor gatingprocessor, InFocusFrameCheck infocusframecheck, CardRectificationProcessor cardrectificationprocessor, Processor processor, 
            Provider provider, KycOcrAnalyticsImpl.Builder builder)
    {
        gatingprocessor = Pipeline.forSync(gatingprocessor);
        cardrectificationprocessor = new SessionPassthroughProcessor(cardrectificationprocessor);
        provideFocusedSessionPipeline$24922bf2(executorservicefactory, cardhintregionofinterestprovider, resourcepool, gatingprocessor, infocusframecheck, true, provider, builder).pipeTo(Pipeline.forAsync(provideOcrExecutor(executorservicefactory), cardrectificationprocessor)).pipeTo(Pipeline.forAsync(provideOcrExecutor(executorservicefactory), processor));
        return gatingprocessor;
    }

    public final PipelineNode provideFrontSnapPipeline$12a4e3b4(ExecutorServiceFactory executorservicefactory, ImageUtil imageutil, com.google.android.libraries.commerce.ocr.ui.CardHintPreviewOverlayView.CardHintRegionOfInterestProvider cardhintregionofinterestprovider, ResourcePool resourcepool, Processor processor, int i, Provider provider)
    {
        resourcepool = new CopyProcessor(provideFocusIntervalPolicy(), resourcepool);
        provider = new SessionProcessor(provider);
        imageutil = new SessionPassthroughProcessor(new SnapshotCroppingProcessor(imageutil, cardhintregionofinterestprovider, i));
        cardhintregionofinterestprovider = Pipeline.forSync(resourcepool);
        Pipeline.wire(cardhintregionofinterestprovider).pipeTo(Pipeline.forSync(provider)).pipeTo(Pipeline.forSync(imageutil)).pipeTo(Pipeline.forAsync(provideOcrExecutor(executorservicefactory), processor));
        return cardhintregionofinterestprovider;
    }
}
