// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.stream;

import android.content.res.Resources;
import com.soundcloud.android.playlists.PlaylistItemMenuPresenter;
import dagger.a.b;
import dagger.a.l;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.soundcloud.android.stream:
//            StreamPlaylistItemRenderer, StreamCardViewPresenter, StreamItemEngagementsPresenter

public final class  extends b
    implements Provider
{

    private b cardEngagementsPresenter;
    private b cardViewPresenter;
    private b playlistItemMenuPresenter;
    private b resources;

    public final void attach(l l1)
    {
        playlistItemMenuPresenter = l1.a("com.soundcloud.android.playlists.PlaylistItemMenuPresenter", com/soundcloud/android/stream/StreamPlaylistItemRenderer, getClass().getClassLoader());
        cardViewPresenter = l1.a("com.soundcloud.android.stream.StreamCardViewPresenter", com/soundcloud/android/stream/StreamPlaylistItemRenderer, getClass().getClassLoader());
        cardEngagementsPresenter = l1.a("com.soundcloud.android.stream.StreamItemEngagementsPresenter", com/soundcloud/android/stream/StreamPlaylistItemRenderer, getClass().getClassLoader());
        resources = l1.a("android.content.res.Resources", com/soundcloud/android/stream/StreamPlaylistItemRenderer, getClass().getClassLoader());
    }

    public final StreamPlaylistItemRenderer get()
    {
        return new StreamPlaylistItemRenderer((PlaylistItemMenuPresenter)playlistItemMenuPresenter.get(), (StreamCardViewPresenter)cardViewPresenter.get(), (StreamItemEngagementsPresenter)cardEngagementsPresenter.get(), (Resources)resources.get());
    }

    public final volatile Object get()
    {
        return get();
    }

    public final void getDependencies(Set set, Set set1)
    {
        set.add(playlistItemMenuPresenter);
        set.add(cardViewPresenter);
        set.add(cardEngagementsPresenter);
        set.add(resources);
    }

    public ()
    {
        super("com.soundcloud.android.stream.StreamPlaylistItemRenderer", "members/com.soundcloud.android.stream.StreamPlaylistItemRenderer", false, com/soundcloud/android/stream/StreamPlaylistItemRenderer);
    }
}
