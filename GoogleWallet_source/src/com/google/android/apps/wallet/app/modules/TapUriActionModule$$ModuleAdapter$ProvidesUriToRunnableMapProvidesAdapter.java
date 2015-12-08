// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.app.modules;

import com.google.android.apps.wallet.help.HelpUriAction;
import com.google.common.collect.ImmutableMap;
import dagger.internal.Binding;
import dagger.internal.Linker;
import dagger.internal.ProvidesBinding;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.app.modules:
//            TapUriActionModule

public static final class setLibrary extends ProvidesBinding
    implements Provider
{

    private Binding helpUriAction;
    private final TapUriActionModule module;

    public final void attach(Linker linker)
    {
        helpUriAction = linker.requestBinding("com.google.android.apps.wallet.help.HelpUriAction", com/google/android/apps/wallet/app/modules/TapUriActionModule, getClass().getClassLoader());
    }

    public final ImmutableMap get()
    {
        TapUriActionModule tapuriactionmodule = module;
        return TapUriActionModule.providesUriToRunnableMap((HelpUriAction)helpUriAction.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(helpUriAction);
    }

    public (TapUriActionModule tapuriactionmodule)
    {
        super("com.google.common.collect.ImmutableMap<android.net.Uri, java.lang.Runnable>", false, "com.google.android.apps.wallet.app.modules.TapUriActionModule", "providesUriToRunnableMap");
        module = tapuriactionmodule;
        setLibrary(true);
    }
}
