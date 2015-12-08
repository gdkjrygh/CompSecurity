// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.loyalty.capture;

import dagger.internal.Binding;
import dagger.internal.Linker;
import dagger.internal.ProvidesBinding;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.libraries.commerce.ocr.loyalty.capture:
//            BarcodeCaptureModule, SimpleOcrResponseHandler

public static final class setLibrary extends ProvidesBinding
    implements Provider
{

    private Binding barcodeResponseHandler;
    private final BarcodeCaptureModule module;

    public final void attach(Linker linker)
    {
        barcodeResponseHandler = linker.requestBinding("com.google.android.libraries.commerce.ocr.loyalty.capture.SimpleOcrResponseHandler", com/google/android/libraries/commerce/ocr/loyalty/capture/BarcodeCaptureModule, getClass().getClassLoader());
    }

    public final com.google.android.libraries.commerce.ocr.capture.Adapter get()
    {
        BarcodeCaptureModule barcodecapturemodule = module;
        return BarcodeCaptureModule.provideOcrResponseHandler((SimpleOcrResponseHandler)barcodeResponseHandler.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(barcodeResponseHandler);
    }

    public (BarcodeCaptureModule barcodecapturemodule)
    {
        super("com.google.android.libraries.commerce.ocr.capture.OcrRecognizer$OcrResponseHandler<java.util.ArrayList<com.google.android.libraries.commerce.ocr.loyalty.pub.RecognizedWobInstanceParcelable>, com.google.android.libraries.commerce.ocr.loyalty.debug.DebugInfo>", true, "com.google.android.libraries.commerce.ocr.loyalty.capture.BarcodeCaptureModule", "provideOcrResponseHandler");
        module = barcodecapturemodule;
        setLibrary(true);
    }
}
