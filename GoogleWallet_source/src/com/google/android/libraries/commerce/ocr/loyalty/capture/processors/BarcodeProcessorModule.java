// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.loyalty.capture.processors;

import com.google.android.libraries.commerce.ocr.capture.InFocusFrameCheck;
import com.google.android.libraries.commerce.ocr.capture.StopOnRecognizedDecoratingHandler;
import com.google.android.libraries.commerce.ocr.capture.pipeline.Pipeline;
import com.google.android.libraries.commerce.ocr.capture.pipeline.PipelineNode;
import com.google.android.libraries.commerce.ocr.capture.processors.CopyProcessor;
import com.google.android.libraries.commerce.ocr.capture.processors.FocusProcessor;
import com.google.android.libraries.commerce.ocr.capture.processors.GatingProcessor;
import com.google.android.libraries.commerce.ocr.capture.processors.IntervalPolicy;
import com.google.android.libraries.commerce.ocr.capture.processors.OcrAsyncIntervalProcessor;
import com.google.android.libraries.commerce.ocr.cv.ResourcePool;
import com.google.android.libraries.commerce.ocr.loyalty.capture.BarcodeDecoder;
import com.google.android.libraries.commerce.ocr.loyalty.capture.BarcodeRecognizer;
import com.google.android.libraries.commerce.ocr.loyalty.capture.InstrumentationOcrResponseHandler;
import com.google.android.libraries.commerce.ocr.loyalty.debug.InstrumentationSupervisor;
import com.google.android.libraries.commerce.ocr.ui.OcrRegionOfInterestProvider;
import com.google.android.libraries.commerce.ocr.util.ExecutorServiceFactory;
import java.util.concurrent.ExecutorService;

public class BarcodeProcessorModule
{

    public BarcodeProcessorModule()
    {
    }

    static PipelineNode provideBarcodeNode(ExecutorService executorservice, int i, BarcodeRecognizer barcoderecognizer, com.google.android.libraries.commerce.ocr.capture.OcrRecognizer.OcrResponseHandler ocrresponsehandler, InstrumentationSupervisor instrumentationsupervisor)
    {
        ocrresponsehandler = StopOnRecognizedDecoratingHandler.create(InstrumentationOcrResponseHandler.create(ocrresponsehandler, instrumentationsupervisor));
        executorservice = Pipeline.forAsync(executorservice, new OcrAsyncIntervalProcessor(new IntervalPolicy(i), barcoderecognizer, ocrresponsehandler));
        ocrresponsehandler.setPipeline(executorservice);
        return executorservice;
    }

    static BarcodeRecognizer provideBarcodeNode(BarcodeDecoder barcodedecoder, OcrRegionOfInterestProvider ocrregionofinterestprovider)
    {
        return new BarcodeRecognizer(barcodedecoder, ocrregionofinterestprovider);
    }

    static CopyProcessor provideCopyProcessor(ResourcePool resourcepool)
    {
        return new CopyProcessor(new IntervalPolicy(200), resourcepool);
    }

    static ExecutorService provideFocusExecutor(ExecutorServiceFactory executorservicefactory)
    {
        return executorservicefactory.create(1, 1, 10000L, 1);
    }

    static PipelineNode provideFocusNode(ExecutorService executorservice, OcrRegionOfInterestProvider ocrregionofinterestprovider, InFocusFrameCheck infocusframecheck)
    {
        return Pipeline.forAsync(executorservice, new FocusProcessor(ocrregionofinterestprovider, infocusframecheck));
    }

    static GatingProcessor provideGlobalGatingProcessor()
    {
        return new GatingProcessor();
    }

    static PipelineNode provideLoyaltyOcrPipeline(CopyProcessor copyprocessor, GatingProcessor gatingprocessor, PipelineNode pipelinenode, PipelineNode pipelinenode1)
    {
        copyprocessor = Pipeline.wire(Pipeline.forSharedReferenceSync(copyprocessor)).to(pipelinenode).to(pipelinenode1).getPipelineNode();
        return Pipeline.wire(Pipeline.forSync(gatingprocessor)).to(copyprocessor).getPipelineNode();
    }

    static ExecutorService provideOcrExecutor(ExecutorServiceFactory executorservicefactory)
    {
        return executorservicefactory.create(1, 2, 10000L, 1);
    }
}
