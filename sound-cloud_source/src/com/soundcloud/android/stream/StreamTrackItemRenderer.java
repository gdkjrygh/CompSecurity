// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.stream;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.soundcloud.android.presentation.CellRenderer;
import com.soundcloud.android.tracks.OverflowMenuOptions;
import com.soundcloud.android.tracks.TrackItem;
import com.soundcloud.android.tracks.TrackItemMenuPresenter;
import com.soundcloud.android.util.CondensedNumberFormatter;
import java.util.List;

// Referenced classes of package com.soundcloud.android.stream:
//            StreamItemViewHolder, StreamCardViewPresenter, StreamItemEngagementsPresenter

class StreamTrackItemRenderer
    implements CellRenderer
{

    private final StreamCardViewPresenter cardViewPresenter;
    private final StreamItemEngagementsPresenter engagementsPresenter;
    private final TrackItemMenuPresenter menuPresenter;
    private final CondensedNumberFormatter numberFormatter;

    public StreamTrackItemRenderer(CondensedNumberFormatter condensednumberformatter, TrackItemMenuPresenter trackitemmenupresenter, StreamItemEngagementsPresenter streamitemengagementspresenter, StreamCardViewPresenter streamcardviewpresenter)
    {
        numberFormatter = condensednumberformatter;
        menuPresenter = trackitemmenupresenter;
        cardViewPresenter = streamcardviewpresenter;
        engagementsPresenter = streamitemengagementspresenter;
    }

    private OverflowMenuOptions getOverflowMenuOptions()
    {
        return OverflowMenuOptions.builder().showAllEngagements(true).build();
    }

    private void showPlayCount(StreamItemViewHolder streamitemviewholder, TrackItem trackitem)
    {
        if (trackitem.hasPlayCount())
        {
            streamitemviewholder.showPlayCount(numberFormatter.format(trackitem.getPlayCount()));
        }
    }

    private void showPlayCountOrNowPlaying(StreamItemViewHolder streamitemviewholder, TrackItem trackitem)
    {
        if (trackitem.isPlaying())
        {
            streamitemviewholder.showNowPlaying();
            return;
        } else
        {
            showPlayCount(streamitemviewholder, trackitem);
            return;
        }
    }

    public void bindItemView(final int position, View view, final List track)
    {
        track = (TrackItem)track.get(position);
        view = (StreamItemViewHolder)view.getTag();
        cardViewPresenter.bind(view, track);
        engagementsPresenter.bind(view, track);
        showPlayCountOrNowPlaying(view, track);
        view.setOverflowListener(new _cls1());
    }

    public View createItemView(ViewGroup viewgroup)
    {
        viewgroup = LayoutInflater.from(viewgroup.getContext()).inflate(0x7f0300be, viewgroup, false);
        viewgroup.setTag(new StreamItemViewHolder(viewgroup));
        return viewgroup;
    }



    private class _cls1
        implements StreamItemViewHolder.OverflowListener
    {

        final StreamTrackItemRenderer this$0;
        final int val$position;
        final TrackItem val$track;

        public void onOverflow(View view)
        {
            menuPresenter.show((FragmentActivity)view.getContext(), view, track, position, getOverflowMenuOptions());
        }

        _cls1()
        {
            this$0 = StreamTrackItemRenderer.this;
            track = trackitem;
            position = i;
            super();
        }
    }

}
