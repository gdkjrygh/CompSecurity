// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.stream;

import a.a;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.soundcloud.android.playlists.PlaylistItem;
import com.soundcloud.android.playlists.PlaylistItemMenuPresenter;
import com.soundcloud.android.presentation.CellRenderer;
import com.soundcloud.android.tracks.OverflowMenuOptions;
import com.soundcloud.android.utils.ScTextUtils;
import java.util.List;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.soundcloud.android.stream:
//            StreamItemEngagementsPresenter, StreamCardViewPresenter, StreamItemViewHolder

class StreamPlaylistItemRenderer
    implements CellRenderer
{
    static class StreamPlaylistViewHolder extends StreamItemViewHolder
    {

        private final TextView trackCount;
        private final TextView tracksView;

        public void setTrackCount(String s, String s1)
        {
            trackCount.setText(s);
            tracksView.setText(s1);
        }

        public StreamPlaylistViewHolder(View view)
        {
            super(view);
            trackCount = (TextView)a.a(view, 0x7f0f025d);
            tracksView = (TextView)a.a(view, 0x7f0f025e);
        }
    }


    private final StreamItemEngagementsPresenter cardEngagementsPresenter;
    private final StreamCardViewPresenter cardViewPresenter;
    private final PlaylistItemMenuPresenter playlistItemMenuPresenter;
    private final Resources resources;

    public StreamPlaylistItemRenderer(PlaylistItemMenuPresenter playlistitemmenupresenter, StreamCardViewPresenter streamcardviewpresenter, StreamItemEngagementsPresenter streamitemengagementspresenter, Resources resources1)
    {
        cardEngagementsPresenter = streamitemengagementspresenter;
        playlistItemMenuPresenter = playlistitemmenupresenter;
        cardViewPresenter = streamcardviewpresenter;
        resources = resources1;
    }

    private OverflowMenuOptions getOverflowMenuOptions()
    {
        return OverflowMenuOptions.builder().showAllEngagements(true).build();
    }

    private void setupEngagementBar(StreamPlaylistViewHolder streamplaylistviewholder, final PlaylistItem playlistItem)
    {
        cardEngagementsPresenter.bind(streamplaylistviewholder, playlistItem);
        streamplaylistviewholder.showDuration(ScTextUtils.formatTimestamp(playlistItem.getDuration(), TimeUnit.MILLISECONDS));
        streamplaylistviewholder.setOverflowListener(new _cls1());
    }

    private void showTrackCount(StreamPlaylistViewHolder streamplaylistviewholder, PlaylistItem playlistitem)
    {
        String s = resources.getQuantityString(0x7f09001d, playlistitem.getTrackCount());
        streamplaylistviewholder.setTrackCount(String.valueOf(playlistitem.getTrackCount()), s);
    }

    public void bindItemView(int i, View view, List list)
    {
        list = (PlaylistItem)list.get(i);
        view = (StreamPlaylistViewHolder)view.getTag();
        cardViewPresenter.bind(view, list);
        showTrackCount(view, list);
        setupEngagementBar(view, list);
    }

    public View createItemView(ViewGroup viewgroup)
    {
        viewgroup = LayoutInflater.from(viewgroup.getContext()).inflate(0x7f0300bd, viewgroup, false);
        viewgroup.setTag(new StreamPlaylistViewHolder(viewgroup));
        return viewgroup;
    }



    private class _cls1
        implements StreamItemViewHolder.OverflowListener
    {

        final StreamPlaylistItemRenderer this$0;
        final PlaylistItem val$playlistItem;

        public void onOverflow(View view)
        {
            playlistItemMenuPresenter.show(view, playlistItem, getOverflowMenuOptions());
        }

        _cls1()
        {
            this$0 = StreamPlaylistItemRenderer.this;
            playlistItem = playlistitem;
            super();
        }
    }

}
