// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.loyalty.fragments;

import android.content.pm.PackageManager;
import dagger.internal.Binding;
import dagger.internal.Linker;
import dagger.internal.ProvidesBinding;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.libraries.commerce.ocr.loyalty.fragments:
//            OcrModule

public static final class setLibrary extends ProvidesBinding
    implements Provider
{

    private Binding blacklist;
    private final OcrModule module;
    private Binding packageManager;

    public final void attach(Linker linker)
    {
        packageManager = linker.requestBinding("android.content.pm.PackageManager", com/google/android/libraries/commerce/ocr/loyalty/fragments/OcrModule, getClass().getClassLoader());
        blacklist = linker.requestBinding("@com.google.android.libraries.commerce.ocr.annotations.CameraAnnotations$ContinuousPictureFocusMode()/java.lang.String", com/google/android/libraries/commerce/ocr/loyalty/fragments/OcrModule, getClass().getClassLoader());
    }

    public final Boolean get()
    {
        OcrModule ocrmodule = module;
        return Boolean.valueOf(OcrModule.provideAttemptContinuousPictureFocusMode((PackageManager)packageManager.get(), (String)blacklist.get()));
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(packageManager);
        set.add(blacklist);
    }

    public (OcrModule ocrmodule)
    {
        super("@com.google.android.libraries.commerce.ocr.annotations.CameraAnnotations$ContinuousPictureFocusMode()/java.lang.Boolean", false, "com.google.android.libraries.commerce.ocr.loyalty.fragments.OcrModule", "provideAttemptContinuousPictureFocusMode");
        module = ocrmodule;
        setLibrary(true);
    }
}
