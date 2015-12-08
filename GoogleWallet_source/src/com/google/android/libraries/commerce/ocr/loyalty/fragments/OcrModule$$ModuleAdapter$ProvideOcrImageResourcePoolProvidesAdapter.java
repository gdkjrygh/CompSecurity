// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.loyalty.fragments;

import com.google.android.libraries.commerce.ocr.cv.ResourcePool;
import dagger.internal.ProvidesBinding;
import javax.inject.Provider;

// Referenced classes of package com.google.android.libraries.commerce.ocr.loyalty.fragments:
//            OcrModule

public static final class setLibrary extends ProvidesBinding
    implements Provider
{

    private final OcrModule module;

    public final ResourcePool get()
    {
        return module.provideOcrImageResourcePool();
    }

    public final volatile Object get()
    {
        return get();
    }

    public (OcrModule ocrmodule)
    {
        super("com.google.android.libraries.commerce.ocr.cv.ResourcePool<com.google.android.libraries.commerce.ocr.cv.OcrImage>", true, "com.google.android.libraries.commerce.ocr.loyalty.fragments.OcrModule", "provideOcrImageResourcePool");
        module = ocrmodule;
        setLibrary(true);
    }
}
