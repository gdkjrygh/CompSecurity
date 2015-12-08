// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.loyalty.fragments;

import com.google.android.libraries.commerce.ocr.loyalty.api.WobsOcrClient;
import dagger.internal.ProvidesBinding;
import javax.inject.Provider;

// Referenced classes of package com.google.android.libraries.commerce.ocr.loyalty.fragments:
//            WobsOcrClientModule

public static final class setLibrary extends ProvidesBinding
    implements Provider
{

    private final WobsOcrClientModule module;

    public final WobsOcrClient get()
    {
        return module.provideWobsOcrClient();
    }

    public final volatile Object get()
    {
        return get();
    }

    public (WobsOcrClientModule wobsocrclientmodule)
    {
        super("com.google.android.libraries.commerce.ocr.loyalty.api.WobsOcrClient", true, "com.google.android.libraries.commerce.ocr.loyalty.fragments.WobsOcrClientModule", "provideWobsOcrClient");
        module = wobsocrclientmodule;
        setLibrary(true);
    }
}
