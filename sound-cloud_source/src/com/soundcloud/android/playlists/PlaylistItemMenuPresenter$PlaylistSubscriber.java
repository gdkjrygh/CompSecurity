// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playlists;

import com.soundcloud.android.rx.observers.DefaultSubscriber;
import com.soundcloud.android.view.menu.PopupMenuWrapper;

// Referenced classes of package com.soundcloud.android.playlists:
//            PlaylistItemMenuPresenter, PlaylistWithTracks, PlaylistItem

private final class menu extends DefaultSubscriber
{

    private final PopupMenuWrapper menu;
    private final PlaylistItem playlist;
    final PlaylistItemMenuPresenter this$0;

    public final void onNext(PlaylistWithTracks playlistwithtracks)
    {
        playlist.update(playlistwithtracks.getSourceSet());
        PlaylistItemMenuPresenter.access$000(PlaylistItemMenuPresenter.this, menu, playlist.isLiked());
        PlaylistItemMenuPresenter.access$100(PlaylistItemMenuPresenter.this, menu, playlist.isReposted());
        PlaylistItemMenuPresenter.access$200(PlaylistItemMenuPresenter.this, menu, playlist.isMarkedForOffline());
    }

    public final volatile void onNext(Object obj)
    {
        onNext((PlaylistWithTracks)obj);
    }

    public (PlaylistItem playlistitem, PopupMenuWrapper popupmenuwrapper)
    {
        this$0 = PlaylistItemMenuPresenter.this;
        super();
        playlist = playlistitem;
        menu = popupmenuwrapper;
    }
}
