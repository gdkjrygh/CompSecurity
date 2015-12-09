// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.loyalty.capture.processors;

import com.google.android.libraries.commerce.ocr.capture.processors.GatingProcessor;
import dagger.internal.ProvidesBinding;
import javax.inject.Provider;

// Referenced classes of package com.google.android.libraries.commerce.ocr.loyalty.capture.processors:
//            BarcodeProcessorModule

public static final class setLibrary extends ProvidesBinding
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

    public (BarcodeProcessorModule barcodeprocessormodule)
    {
        super("@com.google.android.libraries.commerce.ocr.annotations.RecognizerAnnotations$SessionGate()/com.google.android.libraries.commerce.ocr.capture.processors.GatingProcessor<com.google.android.libraries.commerce.ocr.cv.OcrImage>", true, "com.google.android.libraries.commerce.ocr.loyalty.capture.processors.BarcodeProcessorModule", "provideGlobalGatingProcessor");
        module = barcodeprocessormodule;
        setLibrary(true);
    }
}
