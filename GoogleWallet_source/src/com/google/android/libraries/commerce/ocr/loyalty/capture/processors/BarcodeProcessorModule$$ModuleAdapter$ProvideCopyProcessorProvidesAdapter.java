// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.loyalty.capture.processors;

import com.google.android.libraries.commerce.ocr.capture.processors.CopyProcessor;
import com.google.android.libraries.commerce.ocr.cv.ResourcePool;
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

    public (BarcodeProcessorModule barcodeprocessormodule)
    {
        super("com.google.android.libraries.commerce.ocr.capture.processors.CopyProcessor", false, "com.google.android.libraries.commerce.ocr.loyalty.capture.processors.BarcodeProcessorModule", "provideCopyProcessor");
        module = barcodeprocessormodule;
        setLibrary(true);
    }
}
