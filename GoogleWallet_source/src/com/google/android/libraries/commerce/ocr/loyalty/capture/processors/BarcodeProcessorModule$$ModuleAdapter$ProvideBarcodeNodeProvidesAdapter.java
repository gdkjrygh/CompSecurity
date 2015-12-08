// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.loyalty.capture.processors;

import com.google.android.libraries.commerce.ocr.loyalty.capture.BarcodeDecoder;
import com.google.android.libraries.commerce.ocr.loyalty.capture.BarcodeRecognizer;
import com.google.android.libraries.commerce.ocr.ui.OcrRegionOfInterestProvider;
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

    public (BarcodeProcessorModule barcodeprocessormodule)
    {
        super("com.google.android.libraries.commerce.ocr.loyalty.capture.BarcodeRecognizer<com.google.android.libraries.commerce.ocr.loyalty.debug.DebugInfo>", false, "com.google.android.libraries.commerce.ocr.loyalty.capture.processors.BarcodeProcessorModule", "provideBarcodeNode");
        module = barcodeprocessormodule;
        setLibrary(true);
    }
}
