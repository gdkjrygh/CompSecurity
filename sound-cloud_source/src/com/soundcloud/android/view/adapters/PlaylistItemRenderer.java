// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.view.adapters;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.soundcloud.android.Navigator;
import com.soundcloud.android.analytics.ScreenProvider;
import com.soundcloud.android.image.ApiImageSize;
import com.soundcloud.android.image.ImageOperations;
import com.soundcloud.android.playlists.PlaylistItem;
import com.soundcloud.android.playlists.PlaylistItemMenuPresenter;
import com.soundcloud.android.playlists.PromotedPlaylistItem;
import com.soundcloud.android.presentation.CellRenderer;
import com.soundcloud.android.tracks.OverflowMenuOptions;
import com.soundcloud.android.util.CondensedNumberFormatter;
import com.soundcloud.android.utils.ViewUtils;
import com.soundcloud.android.view.PromoterClickViewListener;
import com.soundcloud.java.optional.Optional;
import com.soundcloud.rx.eventbus.EventBus;
import java.util.List;

public class PlaylistItemRenderer
    implements CellRenderer
{

    private final EventBus eventBus;
    private final ImageOperations imageOperations;
    private OverflowMenuOptions menuOptions;
    private final Navigator navigator;
    private final CondensedNumberFormatter numberFormatter;
    private final PlaylistItemMenuPresenter playlistItemMenuPresenter;
    private final Resources resources;
    private final ScreenProvider screenProvider;

    public PlaylistItemRenderer(Resources resources1, ImageOperations imageoperations, CondensedNumberFormatter condensednumberformatter, PlaylistItemMenuPresenter playlistitemmenupresenter, EventBus eventbus, ScreenProvider screenprovider, Navigator navigator1)
    {
        menuOptions = OverflowMenuOptions.builder().build();
        resources = resources1;
        imageOperations = imageoperations;
        numberFormatter = condensednumberformatter;
        playlistItemMenuPresenter = playlistitemmenupresenter;
        eventBus = eventbus;
        screenProvider = screenprovider;
        navigator = navigator1;
    }

    private boolean hasLike(int i)
    {
        return i > 0;
    }

    private void hideAllAdditionalInformation(View view)
    {
        getTextView(view, 0x7f0f0017).setVisibility(8);
        getTextView(view, 0x7f0f00d3).setVisibility(8);
        unsetPromoterClickable(view);
    }

    private Boolean isPrivatePlaylist(PlaylistItem playlistitem)
    {
        return Boolean.valueOf(playlistitem.isPrivate());
    }

    private void loadArtwork(View view, PlaylistItem playlistitem)
    {
        imageOperations.displayInAdapterView(playlistitem.getEntityUrn(), ApiImageSize.getListItemImageSize(view.getContext()), (ImageView)view.findViewById(0x7f0f006f));
    }

    private void setPromoterClickable(TextView textview, PromotedPlaylistItem promotedplaylistitem)
    {
        ViewUtils.setTouchClickable(textview, new PromoterClickViewListener(promotedplaylistitem, eventBus, screenProvider, navigator));
    }

    private void setupOverFlow(final View button, final PlaylistItem playlist)
    {
        button.setOnClickListener(new _cls1());
    }

    private void showAdditionalInformation(View view, PlaylistItem playlistitem)
    {
        hideAllAdditionalInformation(view);
        if (playlistitem instanceof PromotedPlaylistItem)
        {
            showPromotedLabel(view, (PromotedPlaylistItem)playlistitem);
            return;
        }
        if (isPrivatePlaylist(playlistitem).booleanValue())
        {
            showPrivateIndicator(view);
            return;
        } else
        {
            showLikeCount(view, playlistitem);
            return;
        }
    }

    private void showLikeCount(View view, PlaylistItem playlistitem)
    {
        int i = 0;
        view = getTextView(view, 0x7f0f0017);
        int j = playlistitem.getLikesCount();
        if (hasLike(j))
        {
            view.setVisibility(0);
            view.setText(numberFormatter.format(j));
            view = view.getCompoundDrawables()[0];
            if (playlistitem.isLiked())
            {
                i = 1;
            }
            view.setLevel(i);
        }
    }

    private void showPrivateIndicator(View view)
    {
        getTextView(view, 0x7f0f00d3).setVisibility(0);
    }

    private TextView showPromotedLabel(View view, String s)
    {
        view = getTextView(view, 0x7f0f0202);
        view.setVisibility(0);
        view.setText(s);
        return view;
    }

    private void showPromotedLabel(View view, PromotedPlaylistItem promotedplaylistitem)
    {
        if (promotedplaylistitem.hasPromoter())
        {
            setPromoterClickable(showPromotedLabel(view, resources.getString(0x7f0701ad, new Object[] {
                promotedplaylistitem.getPromoterName().get()
            })), promotedplaylistitem);
            return;
        } else
        {
            showPromotedLabel(view, resources.getString(0x7f0701ac));
            return;
        }
    }

    private void showTrackCount(View view, PlaylistItem playlistitem)
    {
        int i = playlistitem.getTrackCount();
        playlistitem = resources.getQuantityString(0x7f09001c, i, new Object[] {
            Integer.valueOf(i)
        });
        getTextView(view, 0x7f0f001a).setText(playlistitem);
    }

    private void unsetPromoterClickable(View view)
    {
        view = getTextView(view, 0x7f0f0202);
        ViewUtils.unsetTouchClickable(view);
        view.setVisibility(8);
    }

    public void allowOfflineOptions()
    {
        menuOptions = OverflowMenuOptions.builder().showOffline(true).build();
    }

    public void bindItemView(int i, View view, List list)
    {
        list = (PlaylistItem)list.get(i);
        getTextView(view, 0x7f0f0018).setText(list.getCreatorName());
        getTextView(view, 0x7f0f001b).setText(list.getTitle());
        showTrackCount(view, list);
        showAdditionalInformation(view, list);
        loadArtwork(view, list);
        setupOverFlow(view.findViewById(0x7f0f00d2), list);
    }

    public View createItemView(ViewGroup viewgroup)
    {
        return LayoutInflater.from(viewgroup.getContext()).inflate(0x7f03009c, viewgroup, false);
    }

    public TextView getTextView(View view, int i)
    {
        return (TextView)view.findViewById(i);
    }



    private class _cls1
        implements android.view.View.OnClickListener
    {

        final PlaylistItemRenderer this$0;
        final View val$button;
        final PlaylistItem val$playlist;

        public void onClick(View view)
        {
            playlistItemMenuPresenter.show(button, playlist, menuOptions);
        }

        _cls1()
        {
            this$0 = PlaylistItemRenderer.this;
            button = view;
            playlist = playlistitem;
            super();
        }
    }

}
