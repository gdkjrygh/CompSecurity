// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.loyalty.fragments;

import android.os.Vibrator;
import dagger.internal.ProvidesBinding;
import javax.inject.Provider;

// Referenced classes of package com.google.android.libraries.commerce.ocr.loyalty.fragments:
//            FragmentModule

public static final class setLibrary extends ProvidesBinding
    implements Provider
{

    private final FragmentModule module;

    public final Vibrator get()
    {
        return module.provideVibrator();
    }

    public final volatile Object get()
    {
        return get();
    }

    public (FragmentModule fragmentmodule)
    {
        super("android.os.Vibrator", false, "com.google.android.libraries.commerce.ocr.loyalty.fragments.FragmentModule", "provideVibrator");
        module = fragmentmodule;
        setLibrary(true);
    }
}
