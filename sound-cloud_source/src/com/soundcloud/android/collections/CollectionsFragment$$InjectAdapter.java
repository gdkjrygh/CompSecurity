// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.collections;

import dagger.a;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.collections:
//            CollectionsFragment, CollectionsPresenter

public final class  extends b
    implements a, Provider
{

    private b presenter;
    private b supertype;

    public final void attach(l l1)
    {
        presenter = l1.a("com.soundcloud.android.collections.CollectionsPresenter", com/soundcloud/android/collections/CollectionsFragment, getClass().getClassLoader());
        supertype = l1.a("members/com.soundcloud.lightcycle.LightCycleSupportFragment", com/soundcloud/android/collections/CollectionsFragment, getClass().getClassLoader(), false);
    }

    public final CollectionsFragment get()
    {
        CollectionsFragment collectionsfragment = new CollectionsFragment();
        injectMembers(collectionsfragment);
        return collectionsfragment;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set1.add(presenter);
        set1.add(supertype);
    }

    public final void injectMembers(CollectionsFragment collectionsfragment)
    {
        collectionsfragment.presenter = (CollectionsPresenter)presenter.get();
        supertype.injectMembers(collectionsfragment);
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((CollectionsFragment)obj);
    }

    public ()
    {
        super("com.soundcloud.android.collections.CollectionsFragment", "members/com.soundcloud.android.collections.CollectionsFragment", false, com/soundcloud/android/collections/CollectionsFragment);
    }
}
