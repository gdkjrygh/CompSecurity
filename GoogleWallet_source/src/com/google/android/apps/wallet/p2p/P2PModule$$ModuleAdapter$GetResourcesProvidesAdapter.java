// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.p2p;

import android.app.Application;
import android.content.res.Resources;
import dagger.internal.Binding;
import dagger.internal.Linker;
import dagger.internal.ProvidesBinding;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.p2p:
//            P2PModule

public static final class setLibrary extends ProvidesBinding
    implements Provider
{

    private Binding application;
    private final P2PModule module;

    public final void attach(Linker linker)
    {
        application = linker.requestBinding("android.app.Application", com/google/android/apps/wallet/p2p/P2PModule, getClass().getClassLoader());
    }

    public final Resources get()
    {
        P2PModule p2pmodule = module;
        return P2PModule.getResources((Application)application.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(application);
    }

    public (P2PModule p2pmodule)
    {
        super("android.content.res.Resources", false, "com.google.android.apps.wallet.p2p.P2PModule", "getResources");
        module = p2pmodule;
        setLibrary(true);
    }
}
