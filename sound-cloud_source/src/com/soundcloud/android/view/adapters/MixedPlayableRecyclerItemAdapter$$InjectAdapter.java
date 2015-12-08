// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.view.adapters;

import com.soundcloud.android.tracks.TrackItemRenderer;
import dagger.a;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.view.adapters:
//            MixedPlayableRecyclerItemAdapter, PlaylistItemRenderer

public final class  extends b
    implements a, Provider
{

    private b playlistRenderer;
    private b supertype;
    private b trackRenderer;

    public final void attach(l l1)
    {
        trackRenderer = l1.a("com.soundcloud.android.tracks.TrackItemRenderer", com/soundcloud/android/view/adapters/MixedPlayableRecyclerItemAdapter, getClass().getClassLoader());
        playlistRenderer = l1.a("com.soundcloud.android.view.adapters.PlaylistItemRenderer", com/soundcloud/android/view/adapters/MixedPlayableRecyclerItemAdapter, getClass().getClassLoader());
        supertype = l1.a("members/com.soundcloud.android.presentation.PagingRecyclerItemAdapter", com/soundcloud/android/view/adapters/MixedPlayableRecyclerItemAdapter, getClass().getClassLoader(), false);
    }

    public final MixedPlayableRecyclerItemAdapter get()
    {
        MixedPlayableRecyclerItemAdapter mixedplayablerecycleritemadapter = new MixedPlayableRecyclerItemAdapter((TrackItemRenderer)trackRenderer.get(), (PlaylistItemRenderer)playlistRenderer.get());
        injectMembers(mixedplayablerecycleritemadapter);
        return mixedplayablerecycleritemadapter;
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

    public final void injectMembers(MixedPlayableRecyclerItemAdapter mixedplayablerecycleritemadapter)
    {
        supertype.injectMembers(mixedplayablerecycleritemadapter);
    }

    public final volatile void injectMembers(Object obj)
    {
        injectMembers((MixedPlayableRecyclerItemAdapter)obj);
    }

    public ()
    {
        super("com.soundcloud.android.view.adapters.MixedPlayableRecyclerItemAdapter", "members/com.soundcloud.android.view.adapters.MixedPlayableRecyclerItemAdapter", false, com/soundcloud/android/view/adapters/MixedPlayableRecyclerItemAdapter);
    }
}
