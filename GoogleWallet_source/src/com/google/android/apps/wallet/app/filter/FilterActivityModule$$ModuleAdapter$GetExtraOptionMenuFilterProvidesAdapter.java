// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.app.filter;

import com.google.android.apps.wallet.filter.ActivityFilter;
import dagger.internal.ProvidesBinding;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.app.filter:
//            FilterActivityModule

public static final class setLibrary extends ProvidesBinding
    implements Provider
{

    private final FilterActivityModule module;

    public final ActivityFilter get()
    {
        return module.getExtraOptionMenuFilter();
    }

    public final volatile Object get()
    {
        return get();
    }

    public (FilterActivityModule filteractivitymodule)
    {
        super("@com.google.android.apps.wallet.filter.BindingAnnotations$ExtraOptionMenuFilter()/com.google.android.apps.wallet.filter.ActivityFilter", false, "com.google.android.apps.wallet.app.filter.FilterActivityModule", "getExtraOptionMenuFilter");
        module = filteractivitymodule;
        setLibrary(true);
    }
}
