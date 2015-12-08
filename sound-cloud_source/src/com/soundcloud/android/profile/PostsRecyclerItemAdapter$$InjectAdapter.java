// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.profile;

import dagger.a;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.profile:
//            PostsRecyclerItemAdapter, PostedTrackItemRenderer, PostedPlaylistItemRenderer

public final class  extends b
    implements a, Provider
{

    private b playlistRenderer;
    private b supertype;
    private b trackRenderer;

    public final void attach(l l1)
    {
        trackRenderer = l1.a("com.soundcloud.android.profile.PostedTrackItemRenderer", com/soundcloud/android/profile/PostsRecyclerItemAdapter, getClass().getClassLoader());
        playlistRenderer = l1.a("com.soundcloud.android.profile.PostedPlaylistItemRenderer", com/soundcloud/android/profile/PostsRecyclerItemAdapter, getClass().getClassLoader());
        supertype = l1.a("members/com.soundcloud.android.view.adapters.MixedPlayableRecyclerItemAdapter", com/soundcloud/android/profile/PostsRecyclerItemAdapter, getClass().getClassLoader(), false);
    }

    public final PostsRecyclerItemAdapter get()
    {
        PostsRecyclerItemAdapter postsrecycleritemadapter = new PostsRecyclerItemAdapter((PostedTrackItemRenderer)trackRenderer.get(), (PostedPlaylistItemRenderer)playlistRenderer.get());
        injectMembers(postsrecycleritemadapter);
        return postsrecycleritemadapter;
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(trackRenderer);
        set.add(playlistRenderer);
        set1.add(supertype);
    }

    public final void injectMembers(PostsRecyclerItemAdapter postsrecycleritemadapter)
    {
        supertype.injectMembers(postsrecycleritemadapter);
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((PostsRecyclerItemAdapter)obj);
    }

    public ()
    {
        super("com.soundcloud.android.profile.PostsRecyclerItemAdapter", "members/com.soundcloud.android.profile.PostsRecyclerItemAdapter", false, com/soundcloud/android/profile/PostsRecyclerItemAdapter);
    }
}
