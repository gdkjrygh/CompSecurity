// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.restrictioncheck;

import android.app.Application;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.restrictioncheck:
//            MarketIntentFactory

public final class  extends Binding
    implements Provider
{

    private Binding application;

    public final void attach(Linker linker)
    {
        application = linker.requestBinding("android.app.Application", com/google/android/apps/wallet/restrictioncheck/MarketIntentFactory, getClass().getClassLoader());
    }

    public final MarketIntentFactory get()
    {
        return new MarketIntentFactory((Application)application.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(application);
    }

    public ()
    {
        super("com.google.android.apps.wallet.restrictioncheck.MarketIntentFactory", "members/com.google.android.apps.wallet.restrictioncheck.MarketIntentFactory", false, com/google/android/apps/wallet/restrictioncheck/MarketIntentFactory);
    }
}
