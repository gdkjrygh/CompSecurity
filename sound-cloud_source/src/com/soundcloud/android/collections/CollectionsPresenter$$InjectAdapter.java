// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.collections;

import android.content.res.Resources;
import com.soundcloud.android.presentation.SwipeRefreshAttacher;
import com.soundcloud.rx.eventbus.EventBus;
import dagger.a;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.collections:
//            CollectionsPresenter, CollectionsOperations, CollectionsOptionsStorage, CollectionsAdapter, 
//            CollectionsPlaylistOptionsPresenter

public final class  extends b
    implements a, Provider
{

    private b adapter;
    private b collectionsOperations;
    private b collectionsOptionsStorage;
    private b eventBus;
    private b optionsPresenter;
    private b resources;
    private b supertype;
    private b swipeRefreshAttacher;

    public final void attach(l l1)
    {
        swipeRefreshAttacher = l1.a("com.soundcloud.android.presentation.SwipeRefreshAttacher", com/soundcloud/android/collections/CollectionsPresenter, getClass().getClassLoader());
        collectionsOperations = l1.a("com.soundcloud.android.collections.CollectionsOperations", com/soundcloud/android/collections/CollectionsPresenter, getClass().getClassLoader());
        collectionsOptionsStorage = l1.a("com.soundcloud.android.collections.CollectionsOptionsStorage", com/soundcloud/android/collections/CollectionsPresenter, getClass().getClassLoader());
        adapter = l1.a("com.soundcloud.android.collections.CollectionsAdapter", com/soundcloud/android/collections/CollectionsPresenter, getClass().getClassLoader());
        optionsPresenter = l1.a("com.soundcloud.android.collections.CollectionsPlaylistOptionsPresenter", com/soundcloud/android/collections/CollectionsPresenter, getClass().getClassLoader());
        resources = l1.a("android.content.res.Resources", com/soundcloud/android/collections/CollectionsPresenter, getClass().getClassLoader());
        eventBus = l1.a("com.soundcloud.rx.eventbus.EventBus", com/soundcloud/android/collections/CollectionsPresenter, getClass().getClassLoader());
        supertype = l1.a("members/com.soundcloud.android.presentation.RecyclerViewPresenter", com/soundcloud/android/collections/CollectionsPresenter, getClass().getClassLoader(), false);
    }

    public final CollectionsPresenter get()
    {
        CollectionsPresenter collectionspresenter = new CollectionsPresenter((SwipeRefreshAttacher)swipeRefreshAttacher.get(), (CollectionsOperations)collectionsOperations.get(), (CollectionsOptionsStorage)collectionsOptionsStorage.get(), (CollectionsAdapter)adapter.get(), (CollectionsPlaylistOptionsPresenter)optionsPresenter.get(), (Resources)resources.get(), (EventBus)eventBus.get());
        injectMembers(collectionspresenter);
        return collectionspresenter;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(swipeRefreshAttacher);
        set.add(collectionsOperations);
        set.add(collectionsOptionsStorage);
        set.add(adapter);
        set.add(optionsPresenter);
        set.add(resources);
        set.add(eventBus);
        set1.add(supertype);
    }

    public final void injectMembers(CollectionsPresenter collectionspresenter)
    {
        supertype.injectMembers(collectionspresenter);
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((CollectionsPresenter)obj);
    }

    public ()
    {
        super("com.soundcloud.android.collections.CollectionsPresenter", "members/com.soundcloud.android.collections.CollectionsPresenter", false, com/soundcloud/android/collections/CollectionsPresenter);
    }
}
