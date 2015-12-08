// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.loyalty.capture;

import com.google.android.libraries.commerce.ocr.ui.UserSkipHandler;
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

    private final BarcodeCaptureModule module;
    private Binding ocrHandler;

    public final void attach(Linker linker)
    {
        ocrHandler = linker.requestBinding("com.google.android.libraries.commerce.ocr.loyalty.capture.SimpleOcrResponseHandler", com/google/android/libraries/commerce/ocr/loyalty/capture/BarcodeCaptureModule, getClass().getClassLoader());
    }

    public final UserSkipHandler get()
    {
        BarcodeCaptureModule barcodecapturemodule = module;
        return BarcodeCaptureModule.provideDefaultUserSkipHandler((SimpleOcrResponseHandler)ocrHandler.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(ocrHandler);
    }

    public (BarcodeCaptureModule barcodecapturemodule)
    {
        super("com.google.android.libraries.commerce.ocr.ui.UserSkipHandler", true, "com.google.android.libraries.commerce.ocr.loyalty.capture.BarcodeCaptureModule", "provideDefaultUserSkipHandler");
        module = barcodecapturemodule;
        setLibrary(true);
    }
}
