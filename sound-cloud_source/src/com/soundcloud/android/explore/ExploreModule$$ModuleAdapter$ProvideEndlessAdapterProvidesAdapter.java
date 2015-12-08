// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.explore;

import com.soundcloud.android.presentation.PagingListItemAdapter;
import com.soundcloud.android.tracks.TrackGridRenderer;
import dagger.a.b;
import dagger.a.l;
import dagger.a.t;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.explore:
//            ExploreModule

public static final class setLibrary extends t
    implements Provider
{

    private final ExploreModule module;
    private b renderer;

    public final void attach(l l1)
    {
        renderer = l1.a("com.soundcloud.android.tracks.TrackGridRenderer", com/soundcloud/android/explore/ExploreModule, getClass().getClassLoader());
    }

    public final PagingListItemAdapter get()
    {
        return module.provideEndlessAdapter((TrackGridRenderer)renderer.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(renderer);
    }

    public (ExploreModule exploremodule)
    {
        super("com.soundcloud.android.presentation.PagingListItemAdapter<com.soundcloud.android.tracks.TrackItem>", false, "com.soundcloud.android.explore.ExploreModule", "provideEndlessAdapter");
        module = exploremodule;
        setLibrary(false);
    }
}
