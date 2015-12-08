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
//            CollectionsAdapter, OnboardingItemCellRenderer, CollectionsPreviewRenderer, CollectionPlaylistHeaderRenderer, 
//            CollectionPlaylistRemoveFilterRenderer, CollectionEmptyPlaylistsRenderer, CollectionPlaylistItemRenderer

public final class erer extends b
    implements a, Provider
{

    private b collectionsPreviewRenderer;
    private b emptyPlaylistsRenderer;
    private b headerRenderer;
    private b onboardingItemCellRenderer;
    private b playlistRenderer;
    private b removeFilterRenderer;
    private b supertype;

    public final void attach(l l1)
    {
        onboardingItemCellRenderer = l1.a("com.soundcloud.android.collections.OnboardingItemCellRenderer", com/soundcloud/android/collections/CollectionsAdapter, getClass().getClassLoader());
        collectionsPreviewRenderer = l1.a("com.soundcloud.android.collections.CollectionsPreviewRenderer", com/soundcloud/android/collections/CollectionsAdapter, getClass().getClassLoader());
        headerRenderer = l1.a("com.soundcloud.android.collections.CollectionPlaylistHeaderRenderer", com/soundcloud/android/collections/CollectionsAdapter, getClass().getClassLoader());
        removeFilterRenderer = l1.a("com.soundcloud.android.collections.CollectionPlaylistRemoveFilterRenderer", com/soundcloud/android/collections/CollectionsAdapter, getClass().getClassLoader());
        emptyPlaylistsRenderer = l1.a("com.soundcloud.android.collections.CollectionEmptyPlaylistsRenderer", com/soundcloud/android/collections/CollectionsAdapter, getClass().getClassLoader());
        playlistRenderer = l1.a("com.soundcloud.android.collections.CollectionPlaylistItemRenderer", com/soundcloud/android/collections/CollectionsAdapter, getClass().getClassLoader());
        supertype = l1.a("members/com.soundcloud.android.presentation.PagingRecyclerItemAdapter", com/soundcloud/android/collections/CollectionsAdapter, getClass().getClassLoader(), false);
    }

    public final CollectionsAdapter get()
    {
        CollectionsAdapter collectionsadapter = new CollectionsAdapter((OnboardingItemCellRenderer)onboardingItemCellRenderer.get(), (CollectionsPreviewRenderer)collectionsPreviewRenderer.get(), (CollectionPlaylistHeaderRenderer)headerRenderer.get(), (CollectionPlaylistRemoveFilterRenderer)removeFilterRenderer.get(), (CollectionEmptyPlaylistsRenderer)emptyPlaylistsRenderer.get(), (CollectionPlaylistItemRenderer)playlistRenderer.get());
        injectMembers(collectionsadapter);
        return collectionsadapter;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(onboardingItemCellRenderer);
        set.add(collectionsPreviewRenderer);
        set.add(headerRenderer);
        set.add(removeFilterRenderer);
        set.add(emptyPlaylistsRenderer);
        set.add(playlistRenderer);
        set1.add(supertype);
    }

    public final void injectMembers(CollectionsAdapter collectionsadapter)
    {
        supertype.injectMembers(collectionsadapter);
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((CollectionsAdapter)obj);
    }

    public erer()
    {
        super("com.soundcloud.android.collections.CollectionsAdapter", "members/com.soundcloud.android.collections.CollectionsAdapter", false, com/soundcloud/android/collections/CollectionsAdapter);
    }
}
