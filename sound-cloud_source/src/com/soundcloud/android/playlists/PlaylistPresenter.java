// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playlists;

import android.widget.ImageView;
import android.widget.TextView;
import com.soundcloud.android.image.ApiImageSize;
import com.soundcloud.android.image.ImageOperations;

// Referenced classes of package com.soundcloud.android.playlists:
//            PlaylistWithTracks

class PlaylistPresenter
{

    private ApiImageSize artworkSize;
    private ImageView artworkView;
    private final ImageOperations imageOperations;
    private PlaylistWithTracks playlistWithTracks;
    private TextView privateTitleView;
    private TextView titleView;
    private TextView usernameView;

    public PlaylistPresenter(ImageOperations imageoperations)
    {
        artworkSize = ApiImageSize.Unknown;
        imageOperations = imageoperations;
    }

    private TextView getTitleView()
    {
        if (playlistWithTracks != null && playlistWithTracks.isPrivate())
        {
            return privateTitleView;
        } else
        {
            return titleView;
        }
    }

    public PlaylistPresenter setArtwork(ImageView imageview, ApiImageSize apiimagesize)
    {
        artworkView = imageview;
        artworkSize = apiimagesize;
        return this;
    }

    public void setPlaylist(PlaylistWithTracks playlistwithtracks)
    {
        playlistWithTracks = playlistwithtracks;
        getTitleView().setText(playlistwithtracks.getTitle());
        usernameView.setText(playlistwithtracks.getCreatorName());
        imageOperations.displayWithPlaceholder(playlistwithtracks.getUrn(), artworkSize, artworkView);
    }

    public PlaylistPresenter setPrivateTitleView(TextView textview)
    {
        privateTitleView = textview;
        return this;
    }

    public PlaylistPresenter setTextVisibility(int i)
    {
        getTitleView().setVisibility(i);
        usernameView.setVisibility(i);
        return this;
    }

    public PlaylistPresenter setTitleView(TextView textview)
    {
        titleView = textview;
        return this;
    }

    public PlaylistPresenter setUsernameView(TextView textview)
    {
        usernameView = textview;
        return this;
    }
}
