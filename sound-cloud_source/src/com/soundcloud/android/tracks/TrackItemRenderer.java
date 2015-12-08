// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.tracks;

import android.content.Context;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.view.ViewGroup;
import com.soundcloud.android.Navigator;
import com.soundcloud.android.analytics.ScreenProvider;
import com.soundcloud.android.configuration.FeatureOperations;
import com.soundcloud.android.image.ApiImageSize;
import com.soundcloud.android.image.ImageOperations;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.presentation.CellRenderer;
import com.soundcloud.android.util.CondensedNumberFormatter;
import com.soundcloud.android.utils.ScTextUtils;
import com.soundcloud.android.view.PromoterClickViewListener;
import com.soundcloud.java.optional.Optional;
import com.soundcloud.rx.eventbus.EventBus;
import java.util.List;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.soundcloud.android.tracks:
//            TrackItem, TrackItemView, PromotedTrackItem, TrackItemMenuPresenter

public class TrackItemRenderer
    implements CellRenderer
{

    private final EventBus eventBus;
    protected final FeatureOperations featureOperations;
    private final ImageOperations imageOperations;
    private final Navigator navigator;
    private final CondensedNumberFormatter numberFormatter;
    private Urn playingTrack;
    private final ScreenProvider screenProvider;
    protected final TrackItemMenuPresenter trackItemMenuPresenter;
    private final TrackItemView.Factory trackItemViewFactory;

    public TrackItemRenderer(ImageOperations imageoperations, CondensedNumberFormatter condensednumberformatter, TrackItemMenuPresenter trackitemmenupresenter, EventBus eventbus, ScreenProvider screenprovider, Navigator navigator1, FeatureOperations featureoperations, 
            TrackItemView.Factory factory)
    {
        playingTrack = Urn.NOT_SET;
        imageOperations = imageoperations;
        numberFormatter = condensednumberformatter;
        trackItemMenuPresenter = trackitemmenupresenter;
        eventBus = eventbus;
        screenProvider = screenprovider;
        navigator = navigator1;
        featureOperations = featureoperations;
        trackItemViewFactory = factory;
    }

    private boolean hasPlayCount(int i)
    {
        return i > 0;
    }

    private void loadArtwork(TrackItemView trackitemview, TrackItem trackitem)
    {
        imageOperations.displayInAdapterView(trackitem.getEntityUrn(), ApiImageSize.getListItemImageSize(trackitemview.getContext()), trackitemview.getImage());
    }

    private void showPlayCount(TrackItemView trackitemview, TrackItem trackitem)
    {
        int i = trackitem.getPlayCount();
        if (hasPlayCount(i))
        {
            trackitemview.showPlaycount(numberFormatter.format(i));
        }
    }

    private void showPromoted(TrackItemView trackitemview, PromotedTrackItem promotedtrackitem)
    {
        Context context = trackitemview.getContext();
        if (promotedtrackitem.hasPromoter())
        {
            trackitemview.showPromotedTrack(context.getString(0x7f0701ad, new Object[] {
                promotedtrackitem.getPromoterName().get()
            }));
            trackitemview.setPromotedClickable(new PromoterClickViewListener(promotedtrackitem, eventBus, screenProvider, navigator));
            return;
        } else
        {
            trackitemview.showPromotedTrack(context.getString(0x7f0701ac));
            return;
        }
    }

    private void showRelevantAdditionalInformation(TrackItemView trackitemview, TrackItem trackitem)
    {
        trackitemview.resetAdditionalInformation();
        if (trackitem instanceof PromotedTrackItem)
        {
            showPromoted(trackitemview, (PromotedTrackItem)trackitem);
            return;
        }
        if (trackitem.isPlaying() || trackitem.getEntityUrn().equals(playingTrack))
        {
            trackitemview.showNowPlaying();
            return;
        }
        if (trackitem.isMidTier() && featureOperations.upsellMidTier())
        {
            trackitemview.showUpsell();
            return;
        }
        if (featureOperations.isOfflineContentEnabled() && trackitem.isUnavailableOffline())
        {
            trackitemview.showNotAvailableOffline();
            return;
        }
        if (trackitem.isPrivate())
        {
            trackitemview.showPrivateIndicator();
            return;
        } else
        {
            showPlayCount(trackitemview, trackitem);
            return;
        }
    }

    public void bindItemView(int i, View view, List list)
    {
        list = (TrackItem)list.get(i);
        view = (TrackItemView)view.getTag();
        view.setCreator(list.getCreatorName());
        view.setTitle(list.getTitle());
        view.setDuration(ScTextUtils.formatTimestamp(list.getDuration(), TimeUnit.MILLISECONDS));
        showRelevantAdditionalInformation(view, list);
        loadArtwork(view, list);
        setupOverFlow(view, list, i);
    }

    public View createItemView(ViewGroup viewgroup)
    {
        return trackItemViewFactory.createItemView(viewgroup);
    }

    public void setPlayingTrack(Urn urn)
    {
        playingTrack = urn;
    }

    protected void setupOverFlow(TrackItemView trackitemview, final TrackItem track, final int position)
    {
        trackitemview.setOverflowListener(new _cls1());
    }

    protected void showTrackItemMenu(View view, TrackItem trackitem, int i)
    {
        trackItemMenuPresenter.show((FragmentActivity)view.getContext(), view, trackitem, i);
    }

    private class _cls1
        implements TrackItemView.OverflowListener
    {

        final TrackItemRenderer this$0;
        final int val$position;
        final TrackItem val$track;

        public void onOverflow(View view)
        {
            showTrackItemMenu(view, track, position);
        }

        _cls1()
        {
            this$0 = TrackItemRenderer.this;
            track = trackitem;
            position = i;
            super();
        }
    }

}
