// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.loyalty.capture;

import dagger.internal.ProvidesBinding;
import javax.inject.Provider;

// Referenced classes of package com.google.android.libraries.commerce.ocr.loyalty.capture:
//            BarcodeCaptureModule

public static final class setLibrary extends ProvidesBinding
    implements Provider
{

    private final BarcodeCaptureModule module;

    public final com.google.commerce.ocr.definitions.stInfoProvidesAdapter get()
    {
        BarcodeCaptureModule barcodecapturemodule = module;
        return BarcodeCaptureModule.provideDebugRequestInfo();
    }

    public final volatile Object get()
    {
        return get();
    }

    public (BarcodeCaptureModule barcodecapturemodule)
    {
        super("com.google.commerce.ocr.definitions.WireProto$DebugRequestInfo", false, "com.google.android.libraries.commerce.ocr.loyalty.capture.BarcodeCaptureModule", "provideDebugRequestInfo");
        module = barcodecapturemodule;
        setLibrary(true);
    }
}
