// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.loyalty.fragments;

import android.graphics.Point;
import dagger.internal.ProvidesBinding;
import javax.inject.Provider;

// Referenced classes of package com.google.android.libraries.commerce.ocr.loyalty.fragments:
//            BarcodeBundleModule

public static final class setLibrary extends ProvidesBinding
    implements Provider
{

    private final BarcodeBundleModule module;

    public final Point get()
    {
        BarcodeBundleModule barcodebundlemodule = module;
        return BarcodeBundleModule.provideTargetPreviewSize();
    }

    public final volatile Object get()
    {
        return get();
    }

    public (BarcodeBundleModule barcodebundlemodule)
    {
        super("@com.google.android.libraries.commerce.ocr.annotations.CameraAnnotations$TargetPreviewSize()/android.graphics.Point", false, "com.google.android.libraries.commerce.ocr.loyalty.fragments.BarcodeBundleModule", "provideTargetPreviewSize");
        module = barcodebundlemodule;
        setLibrary(true);
    }
}
