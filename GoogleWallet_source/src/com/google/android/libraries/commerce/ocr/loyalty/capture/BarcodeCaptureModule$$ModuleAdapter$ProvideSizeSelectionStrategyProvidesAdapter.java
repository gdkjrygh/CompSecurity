// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.loyalty.capture;

import com.google.android.libraries.commerce.ocr.capture.SizeSelectionStrategy;
import dagger.internal.ProvidesBinding;
import javax.inject.Provider;

// Referenced classes of package com.google.android.libraries.commerce.ocr.loyalty.capture:
//            BarcodeCaptureModule

public static final class setLibrary extends ProvidesBinding
    implements Provider
{

    private final BarcodeCaptureModule module;

    public final SizeSelectionStrategy get()
    {
        BarcodeCaptureModule barcodecapturemodule = module;
        return BarcodeCaptureModule.provideSizeSelectionStrategy();
    }

    public final volatile Object get()
    {
        return get();
    }

    public (BarcodeCaptureModule barcodecapturemodule)
    {
        super("com.google.android.libraries.commerce.ocr.capture.SizeSelectionStrategy", false, "com.google.android.libraries.commerce.ocr.loyalty.capture.BarcodeCaptureModule", "provideSizeSelectionStrategy");
        module = barcodecapturemodule;
        setLibrary(true);
    }
}
