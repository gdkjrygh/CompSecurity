// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.wobs.capture.processors;

import android.os.Bundle;
import com.google.android.libraries.commerce.ocr.capture.DecoratingOcrHandler;
import com.google.android.libraries.commerce.ocr.capture.InFocusFrameCheck;
import com.google.android.libraries.commerce.ocr.capture.StopOnRecognizedDecoratingHandler;
import com.google.android.libraries.commerce.ocr.capture.pipeline.Pipeline;
import com.google.android.libraries.commerce.ocr.capture.pipeline.PipelineNode;
import com.google.android.libraries.commerce.ocr.capture.processors.CardRectificationProcessor;
import com.google.android.libraries.commerce.ocr.capture.processors.CopyProcessor;
import com.google.android.libraries.commerce.ocr.capture.processors.FocusProcessor;
import com.google.android.libraries.commerce.ocr.capture.processors.IntervalPolicy;
import com.google.android.libraries.commerce.ocr.capture.processors.OcrAsyncIntervalProcessor;
import com.google.android.libraries.commerce.ocr.capture.processors.SessionPassthroughProcessor;
import com.google.android.libraries.commerce.ocr.capture.processors.SessionProcessor;
import com.google.android.libraries.commerce.ocr.cv.ResourcePool;
import com.google.android.libraries.commerce.ocr.loyalty.capture.BarcodeRecognizer;
import com.google.android.libraries.commerce.ocr.util.ExecutorServiceFactory;
import com.google.android.libraries.commerce.ocr.wobs.fragments.WobsOcrBundleModule;
import java.util.concurrent.ExecutorService;
import javax.inject.Provider;

// Referenced classes of package com.google.android.libraries.commerce.ocr.wobs.capture.processors:
//            WobsOcrProcessor

public final class ProcessorModule
{
    static final class IgnoreOnAttemptDecoratingHandler extends DecoratingOcrHandler
    {

        public static IgnoreOnAttemptDecoratingHandler create(com.google.android.libraries.commerce.ocr.capture.OcrRecognizer.OcrResponseHandler ocrresponsehandler)
        {
            return new IgnoreOnAttemptDecoratingHandler(ocrresponsehandler);
        }

        public final boolean onOcrAttempt()
        {
            return true;
        }

        private IgnoreOnAttemptDecoratingHandler(com.google.android.libraries.commerce.ocr.capture.OcrRecognizer.OcrResponseHandler ocrresponsehandler)
        {
            super(ocrresponsehandler);
        }
    }


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

    private static ExecutorService provideOcrExecutor(ExecutorServiceFactory executorservicefactory)
    {
        return executorservicefactory.create(1, 1, 10000L, 1);
    }

    public static IntervalPolicy provideOcrIntervalPolicy(Bundle bundle)
    {
        return new IntervalPolicy(WobsOcrBundleModule.provideMinPerformWobsOcrIntervalInMs(bundle));
    }

    public final PipelineNode provideBarcodeNode(ExecutorServiceFactory executorservicefactory, com.google.android.libraries.commerce.ocr.capture.OcrRecognizer.OcrResponseHandler ocrresponsehandler, int i, BarcodeRecognizer barcoderecognizer)
    {
        ocrresponsehandler = StopOnRecognizedDecoratingHandler.create(ocrresponsehandler);
        barcoderecognizer = new OcrAsyncIntervalProcessor(new IntervalPolicy(i), barcoderecognizer, IgnoreOnAttemptDecoratingHandler.create(ocrresponsehandler));
        executorservicefactory = Pipeline.forAsync(provideOcrExecutor(executorservicefactory), barcoderecognizer);
        ocrresponsehandler.setPipeline(executorservicefactory);
        return executorservicefactory;
    }

    public final PipelineNode provideProcessorPipeline$74b393b8(ResourcePool resourcepool, ExecutorServiceFactory executorservicefactory, com.google.android.libraries.commerce.ocr.ui.CardHintPreviewOverlayView.CardHintRegionOfInterestProvider cardhintregionofinterestprovider, InFocusFrameCheck infocusframecheck, CardRectificationProcessor cardrectificationprocessor, PipelineNode pipelinenode, WobsOcrProcessor wobsocrprocessor, 
            Provider provider)
    {
        resourcepool = new CopyProcessor(provideFocusIntervalPolicy(), resourcepool);
        cardhintregionofinterestprovider = new FocusProcessor(cardhintregionofinterestprovider, infocusframecheck);
        infocusframecheck = new SessionPassthroughProcessor(cardrectificationprocessor);
        cardrectificationprocessor = new SessionProcessor(provider);
        resourcepool = Pipeline.forSharedReferenceSync(resourcepool);
        Pipeline.wire(resourcepool).to(pipelinenode).pipeTo(Pipeline.forSync(cardrectificationprocessor)).pipeTo(Pipeline.forAsync(provideFocusExecutor(executorservicefactory), cardhintregionofinterestprovider)).pipeTo(Pipeline.forAsync(provideOcrExecutor(executorservicefactory), infocusframecheck)).pipeTo(Pipeline.forAsync(provideOcrExecutor(executorservicefactory), wobsocrprocessor));
        return resourcepool;
    }
}
