// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.profile;

import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;
import com.soundcloud.android.Navigator;
import com.soundcloud.android.analytics.ScreenProvider;
import com.soundcloud.android.image.ImageOperations;
import com.soundcloud.android.playlists.PlaylistItem;
import com.soundcloud.android.playlists.PlaylistItemMenuPresenter;
import com.soundcloud.android.util.CondensedNumberFormatter;
import com.soundcloud.android.view.adapters.PlaylistItemRenderer;
import com.soundcloud.java.optional.Optional;
import com.soundcloud.rx.eventbus.EventBus;
import java.util.List;

public class PostedPlaylistItemRenderer extends PlaylistItemRenderer
{

    public PostedPlaylistItemRenderer(Resources resources, ImageOperations imageoperations, CondensedNumberFormatter condensednumberformatter, PlaylistItemMenuPresenter playlistitemmenupresenter, EventBus eventbus, ScreenProvider screenprovider, Navigator navigator)
    {
        super(resources, imageoperations, condensednumberformatter, playlistitemmenupresenter, eventbus, screenprovider, navigator);
    }

    private void showReposter(View view, PlaylistItem playlistitem)
    {
        view = getTextView(view, 0x7f0f0243);
        playlistitem = playlistitem.getReposter();
        if (playlistitem.isPresent())
        {
            view.setVisibility(0);
            view.setText((CharSequence)playlistitem.get());
            return;
        } else
        {
            view.setVisibility(8);
            return;
        }
    }

    public void bindItemView(int i, View view, List list)
    {
        super.bindItemView(i, view, list);
        showReposter(view, (PlaylistItem)list.get(i));
    }
}
