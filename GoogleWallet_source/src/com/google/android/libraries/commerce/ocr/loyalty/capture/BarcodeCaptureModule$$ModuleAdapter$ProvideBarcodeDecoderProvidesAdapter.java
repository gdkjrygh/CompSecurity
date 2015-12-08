// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.loyalty.capture;

import dagger.internal.ProvidesBinding;
import javax.inject.Provider;

// Referenced classes of package com.google.android.libraries.commerce.ocr.loyalty.capture:
//            BarcodeCaptureModule, BarcodeDecoder

public static final class setLibrary extends ProvidesBinding
    implements Provider
{

    private final BarcodeCaptureModule module;

    public final BarcodeDecoder get()
    {
        return module.provideBarcodeDecoder();
    }

    public final volatile Object get()
    {
        return get();
    }

    public (BarcodeCaptureModule barcodecapturemodule)
    {
        super("com.google.android.libraries.commerce.ocr.loyalty.capture.BarcodeDecoder", true, "com.google.android.libraries.commerce.ocr.loyalty.capture.BarcodeCaptureModule", "provideBarcodeDecoder");
        module = barcodecapturemodule;
        setLibrary(true);
    }
}
