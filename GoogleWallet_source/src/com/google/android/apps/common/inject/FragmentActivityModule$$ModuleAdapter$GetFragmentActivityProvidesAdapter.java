// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.common.inject;

import android.support.v4.app.FragmentActivity;
import dagger.internal.ProvidesBinding;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.common.inject:
//            FragmentActivityModule

public static final class setLibrary extends ProvidesBinding
    implements Provider
{

    private final FragmentActivityModule module;

    public final FragmentActivity get()
    {
        return module.getFragmentActivity();
    }

    public final volatile Object get()
    {
        return get();
    }

    public (FragmentActivityModule fragmentactivitymodule)
    {
        super("android.support.v4.app.FragmentActivity", false, "com.google.android.apps.common.inject.FragmentActivityModule", "getFragmentActivity");
        module = fragmentactivitymodule;
        setLibrary(true);
    }
}
