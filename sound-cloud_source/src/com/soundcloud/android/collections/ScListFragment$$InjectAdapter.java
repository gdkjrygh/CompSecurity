// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.collections;

import com.soundcloud.android.accounts.AccountOperations;
import com.soundcloud.android.actionbar.PullToRefreshController;
import com.soundcloud.android.image.ImageOperations;
import com.soundcloud.rx.eventbus.EventBus;
import dagger.a;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.collections:
//            ScListFragment

public final class  extends b
    implements a, Provider
{

    private b accountOperations;
    private b eventBus;
    private b imageOperations;
    private b pullToRefreshController;

    public final void attach(l l1)
    {
        accountOperations = l1.a("com.soundcloud.android.accounts.AccountOperations", com/soundcloud/android/collections/ScListFragment, getClass().getClassLoader());
        imageOperations = l1.a("com.soundcloud.android.image.ImageOperations", com/soundcloud/android/collections/ScListFragment, getClass().getClassLoader());
        eventBus = l1.a("com.soundcloud.rx.eventbus.EventBus", com/soundcloud/android/collections/ScListFragment, getClass().getClassLoader());
        pullToRefreshController = l1.a("com.soundcloud.android.actionbar.PullToRefreshController", com/soundcloud/android/collections/ScListFragment, getClass().getClassLoader());
    }

    public final ScListFragment get()
    {
        ScListFragment sclistfragment = new ScListFragment();
        injectMembers(sclistfragment);
        return sclistfragment;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set1.add(accountOperations);
        set1.add(imageOperations);
        set1.add(eventBus);
        set1.add(pullToRefreshController);
    }

    public final void injectMembers(ScListFragment sclistfragment)
    {
        sclistfragment.accountOperations = (AccountOperations)accountOperations.get();
        sclistfragment.imageOperations = (ImageOperations)imageOperations.get();
        sclistfragment.eventBus = (EventBus)eventBus.get();
        sclistfragment.pullToRefreshController = (PullToRefreshController)pullToRefreshController.get();
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((ScListFragment)obj);
    }

    public ()
    {
        super("com.soundcloud.android.collections.ScListFragment", "members/com.soundcloud.android.collections.ScListFragment", false, com/soundcloud/android/collections/ScListFragment);
    }
}
