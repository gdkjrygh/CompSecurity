// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.wobs;

import com.google.android.apps.wallet.eventbus.EventBus;
import dagger.MembersInjector;
import dagger.internal.Binding;
import dagger.internal.Linker;
import java.util.Set;

// Referenced classes of package com.google.android.apps.wallet.wobs:
//            WobListFragment

public final class ragment
    implements MembersInjector
{

    private Binding eventBus;
    private com.google.android.apps.wallet.base.fragment.bers nextInjectableAncestor;

    public final void attach(Linker linker)
    {
        nextInjectableAncestor.ttach(linker);
        eventBus = linker.requestBinding("com.google.android.apps.wallet.eventbus.EventBus", com/google/android/apps/wallet/wobs/WobListFragment, getClass().getClassLoader());
    }

    public final void getDependencies(Set set, Set set1)
    {
        set1.add(eventBus);
        nextInjectableAncestor.etDependencies(null, set1);
    }

    public final void injectMembers(WobListFragment woblistfragment)
    {
        woblistfragment.eventBus = (EventBus)eventBus.get();
        nextInjectableAncestor.njectMembers(woblistfragment);
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((WobListFragment)obj);
    }

    public ragment()
    {
        nextInjectableAncestor = new com.google.android.apps.wallet.base.fragment.init>();
    }
}
