// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.base.fragment;

import dagger.internal.ProvidesBinding;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.base.fragment:
//            FragmentModule

public static final class setLibrary extends ProvidesBinding
    implements Provider
{

    private final FragmentModule module;

    public final Boolean get()
    {
        FragmentModule fragmentmodule = module;
        return Boolean.valueOf(FragmentModule.provideFieldsInjected());
    }

    public final volatile Object get()
    {
        return get();
    }

    public (FragmentModule fragmentmodule)
    {
        super("@com.google.android.apps.wallet.base.fragment.BindingAnnotations$FieldsInjected()/java.lang.Boolean", false, "com.google.android.apps.wallet.base.fragment.FragmentModule", "provideFieldsInjected");
        module = fragmentmodule;
        setLibrary(true);
    }
}
