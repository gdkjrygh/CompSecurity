// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.stream;

import android.content.res.Resources;
import android.view.View;
import com.soundcloud.android.Navigator;
import com.soundcloud.android.analytics.ScreenProvider;
import com.soundcloud.android.image.ApiImageSize;
import com.soundcloud.android.image.ImageOperations;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.presentation.ListItem;
import com.soundcloud.android.presentation.PlayableItem;
import com.soundcloud.android.presentation.PromotedListItem;
import com.soundcloud.android.tracks.TrackItem;
import com.soundcloud.android.utils.ScTextUtils;
import com.soundcloud.android.view.PromoterClickViewListener;
import com.soundcloud.java.optional.Optional;
import com.soundcloud.rx.eventbus.EventBus;
import java.util.Date;

// Referenced classes of package com.soundcloud.android.stream:
//            StreamItemViewHolder, HeaderSpannableBuilder

class StreamCardViewPresenter
{
    private class ProfileClickViewListener
        implements android.view.View.OnClickListener
    {

        final StreamCardViewPresenter this$0;
        private final Urn userUrn;

        public void onClick(View view)
        {
            navigator.openProfile(view.getContext(), userUrn);
        }

        ProfileClickViewListener(Urn urn)
        {
            this$0 = StreamCardViewPresenter.this;
            super();
            userUrn = urn;
        }
    }


    private final EventBus eventBus;
    private final HeaderSpannableBuilder headerSpannableBuilder;
    private final ImageOperations imageOperations;
    private final Navigator navigator;
    private final Resources resources;
    private final ScreenProvider screenProvider;

    StreamCardViewPresenter(HeaderSpannableBuilder headerspannablebuilder, EventBus eventbus, ScreenProvider screenprovider, Navigator navigator1, Resources resources1, ImageOperations imageoperations)
    {
        headerSpannableBuilder = headerspannablebuilder;
        eventBus = eventbus;
        screenProvider = screenprovider;
        navigator = navigator1;
        resources = resources1;
        imageOperations = imageoperations;
    }

    private Urn avatarUrn(PlayableItem playableitem)
    {
        if (playableitem.getReposter().isPresent())
        {
            return playableitem.getReposterUrn();
        } else
        {
            return playableitem.getCreatorUrn();
        }
    }

    private void bindArtworkView(StreamItemViewHolder streamitemviewholder, PlayableItem playableitem)
    {
        loadArtwork(streamitemviewholder, playableitem);
        streamitemviewholder.setTitle(playableitem.getTitle());
        streamitemviewholder.setArtist(playableitem.getCreatorName());
        streamitemviewholder.setArtistClickable(new ProfileClickViewListener(playableitem.getCreatorUrn()));
    }

    private void bindHeaderView(StreamItemViewHolder streamitemviewholder, PlayableItem playableitem)
    {
        streamitemviewholder.resetCardView();
        if (playableitem instanceof PromotedListItem)
        {
            showPromoted(streamitemviewholder, (PromotedListItem)playableitem);
            return;
        } else
        {
            loadAvatar(streamitemviewholder, avatarUrn(playableitem));
            setHeaderText(streamitemviewholder, playableitem);
            showCreatedAt(streamitemviewholder, playableitem.getCreatedAt());
            streamitemviewholder.togglePrivateIndicator(playableitem.isPrivate());
            return;
        }
    }

    private boolean isTrack(ListItem listitem)
    {
        return listitem instanceof TrackItem;
    }

    private void loadArtwork(StreamItemViewHolder streamitemviewholder, PlayableItem playableitem)
    {
        imageOperations.displayInAdapterView(playableitem.getEntityUrn(), ApiImageSize.getFullImageSize(resources), streamitemviewholder.getImage());
    }

    private void loadAvatar(StreamItemViewHolder streamitemviewholder, Urn urn)
    {
        streamitemviewholder.setCreatorClickable(new ProfileClickViewListener(urn));
        imageOperations.displayCircularInAdapterView(urn, ApiImageSize.getListItemImageSize(resources), streamitemviewholder.getUserImage());
    }

    private void setHeaderText(StreamItemViewHolder streamitemviewholder, PlayableItem playableitem)
    {
        boolean flag = playableitem.getReposter().isPresent();
        String s = (String)playableitem.getReposter().or(playableitem.getCreatorName());
        Object obj = resources;
        int i;
        if (flag)
        {
            i = 0x7f07031d;
        } else
        {
            i = 0x7f07031a;
        }
        obj = ((Resources) (obj)).getString(i);
        if (flag)
        {
            headerSpannableBuilder.actionSpannedString(((String) (obj)), isTrack(playableitem));
            streamitemviewholder.setRepostHeader(s, headerSpannableBuilder.get());
            return;
        } else
        {
            headerSpannableBuilder.userActionSpannedString(s, ((String) (obj)), isTrack(playableitem));
            streamitemviewholder.setHeaderText(headerSpannableBuilder.get());
            return;
        }
    }

    private void showCreatedAt(StreamItemViewHolder streamitemviewholder, Date date)
    {
        streamitemviewholder.setCreatedAt(ScTextUtils.formatTimeElapsedSince(resources, date.getTime(), true));
    }

    private void showPromoted(StreamItemViewHolder streamitemviewholder, PromotedListItem promotedlistitem)
    {
        if (promotedlistitem.hasPromoter())
        {
            String s = resources.getString(0x7f07031b);
            loadAvatar(streamitemviewholder, (Urn)promotedlistitem.getPromoterUrn().get());
            headerSpannableBuilder.actionSpannedString(s, isTrack(promotedlistitem));
            streamitemviewholder.setPromoterHeader((String)promotedlistitem.getPromoterName().get(), headerSpannableBuilder.get());
            streamitemviewholder.setPromoterClickable(new PromoterClickViewListener(promotedlistitem, eventBus, screenProvider, navigator));
            return;
        } else
        {
            streamitemviewholder.hideUserImage();
            headerSpannableBuilder.promotedSpannedString(isTrack(promotedlistitem));
            streamitemviewholder.setPromotedHeader(headerSpannableBuilder.get());
            return;
        }
    }

    void bind(StreamItemViewHolder streamitemviewholder, PlayableItem playableitem)
    {
        bindHeaderView(streamitemviewholder, playableitem);
        bindArtworkView(streamitemviewholder, playableitem);
    }

}
