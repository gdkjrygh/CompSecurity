// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.collections;

import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.soundcloud.android.Navigator;
import com.soundcloud.android.configuration.FeatureOperations;
import com.soundcloud.android.image.ApiImageSize;
import com.soundcloud.android.image.ImageOperations;
import com.soundcloud.android.offline.DownloadImageView;
import com.soundcloud.android.offline.OfflineState;
import com.soundcloud.android.playlists.PlaylistItem;
import com.soundcloud.android.playlists.PlaylistItemMenuPresenter;
import com.soundcloud.android.presentation.CellRenderer;
import com.soundcloud.android.tracks.OverflowMenuOptions;
import com.soundcloud.android.utils.ViewUtils;
import java.util.List;

// Referenced classes of package com.soundcloud.android.collections:
//            CollectionsItem

class CollectionPlaylistItemRenderer
    implements CellRenderer
{

    public static final int TOUCH_DELEGATE_DP = 8;
    private final FeatureOperations featureOperations;
    private final ImageOperations imageOperations;
    private final Navigator navigator;
    private final PlaylistItemMenuPresenter playlistItemMenuPresenter;
    private final Resources resources;

    public CollectionPlaylistItemRenderer(ImageOperations imageoperations, Resources resources1, Navigator navigator1, FeatureOperations featureoperations, PlaylistItemMenuPresenter playlistitemmenupresenter)
    {
        imageOperations = imageoperations;
        resources = resources1;
        navigator = navigator1;
        featureOperations = featureoperations;
        playlistItemMenuPresenter = playlistitemmenupresenter;
    }

    private android.view.View.OnClickListener goToPlaylist(final PlaylistItem playlistItem)
    {
        return new _cls2();
    }

    private void setDownloadProgressIndicator(View view, PlaylistItem playlistitem)
    {
        view = (DownloadImageView)view.findViewById(0x7f0f00cf);
        if (featureOperations.isOfflineContentEnabled())
        {
            view.setState(playlistitem.getDownloadState());
            return;
        } else
        {
            view.setState(OfflineState.NO_OFFLINE);
            return;
        }
    }

    private void setupOverFlow(final View button, final PlaylistItem playlistItem)
    {
        button.setOnClickListener(new _cls1());
        ViewUtils.extendTouchArea(button, 8);
    }

    public void bindItemView(int i, View view, List list)
    {
        boolean flag = false;
        list = ((CollectionsItem)list.get(i)).getPlaylistItem();
        ImageView imageview = (ImageView)view.findViewById(0x7f0f00ce);
        TextView textview = (TextView)view.findViewById(0x7f0f0073);
        TextView textview1 = (TextView)view.findViewById(0x7f0f00d1);
        View view1 = view.findViewById(0x7f0f00d3);
        View view2 = view.findViewById(0x7f0f00d0);
        view.setOnClickListener(goToPlaylist(list));
        textview.setText(list.getTitle());
        textview1.setText(list.getCreatorName());
        if (list.isPrivate())
        {
            i = 0;
        } else
        {
            i = 8;
        }
        view1.setVisibility(i);
        if (list.isLiked())
        {
            i = ((flag) ? 1 : 0);
        } else
        {
            i = 8;
        }
        view2.setVisibility(i);
        imageOperations.displayInAdapterView(list.getEntityUrn(), ApiImageSize.getFullImageSize(resources), imageview);
        setupOverFlow(view.findViewById(0x7f0f00d2), list);
        setDownloadProgressIndicator(view, list);
    }

    public View createItemView(ViewGroup viewgroup)
    {
        return LayoutInflater.from(viewgroup.getContext()).inflate(0x7f03002d, viewgroup, false);
    }



    private class _cls2
        implements android.view.View.OnClickListener
    {

        final CollectionPlaylistItemRenderer this$0;
        final PlaylistItem val$playlistItem;

        public void onClick(View view)
        {
            navigator.openPlaylist(view.getContext(), playlistItem.getEntityUrn(), Screen.COLLECTIONS);
        }

        _cls2()
        {
            this$0 = CollectionPlaylistItemRenderer.this;
            playlistItem = playlistitem;
            super();
        }
    }


    private class _cls1
        implements android.view.View.OnClickListener
    {

        final CollectionPlaylistItemRenderer this$0;
        final View val$button;
        final OverflowMenuOptions val$options;
        final PlaylistItem val$playlistItem;

        public void onClick(View view)
        {
            playlistItemMenuPresenter.show(button, playlistItem, options);
        }

        _cls1()
        {
            this$0 = CollectionPlaylistItemRenderer.this;
            button = view;
            playlistItem = playlistitem;
            options = overflowmenuoptions;
            super();
        }
    }

}
