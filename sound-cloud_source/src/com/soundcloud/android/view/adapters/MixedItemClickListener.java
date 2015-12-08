// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.view.adapters;

import android.content.Context;
import android.view.View;
import com.soundcloud.android.Navigator;
import com.soundcloud.android.analytics.PromotedSourceInfo;
import com.soundcloud.android.analytics.SearchQuerySourceInfo;
import com.soundcloud.android.configuration.FeatureOperations;
import com.soundcloud.android.main.Screen;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.playback.PlaySessionSource;
import com.soundcloud.android.playback.PlaybackInitiator;
import com.soundcloud.android.playlists.PromotedPlaylistItem;
import com.soundcloud.android.presentation.ListItem;
import com.soundcloud.android.tracks.PromotedTrackItem;
import com.soundcloud.android.tracks.TrackItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Provider;
import rx.X;
import rx.b;

public class MixedItemClickListener
{
    public static class Factory
    {

        private final FeatureOperations featureOperations;
        private final Navigator navigator;
        private final PlaybackInitiator playbackInitiator;
        private final Provider subscriberProvider;

        public MixedItemClickListener create(Screen screen1, SearchQuerySourceInfo searchquerysourceinfo)
        {
            return new MixedItemClickListener(playbackInitiator, subscriberProvider, featureOperations, navigator, screen1, searchquerysourceinfo);
        }

        public Factory(PlaybackInitiator playbackinitiator, Provider provider, FeatureOperations featureoperations, Navigator navigator1)
        {
            playbackInitiator = playbackinitiator;
            subscriberProvider = provider;
            featureOperations = featureoperations;
            navigator = navigator1;
        }
    }


    private final FeatureOperations featureOperations;
    private final Navigator navigator;
    private final PlaybackInitiator playbackInitiator;
    private final Screen screen;
    private final SearchQuerySourceInfo searchQuerySourceInfo;
    private final Provider subscriberProvider;

    public MixedItemClickListener(PlaybackInitiator playbackinitiator, Provider provider, FeatureOperations featureoperations, Navigator navigator1, Screen screen1, SearchQuerySourceInfo searchquerysourceinfo)
    {
        playbackInitiator = playbackinitiator;
        subscriberProvider = provider;
        navigator = navigator1;
        screen = screen1;
        searchQuerySourceInfo = searchquerysourceinfo;
        featureOperations = featureoperations;
    }

    private List filterTracks(List list)
    {
        ArrayList arraylist = new ArrayList(list.size());
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            ListItem listitem = (ListItem)list.next();
            if (listitem.getEntityUrn().isTrack())
            {
                arraylist.add(listitem.getEntityUrn());
            }
        } while (true);
        return arraylist;
    }

    private void handleNonTrackItemClick(View view, ListItem listitem)
    {
        Urn urn = listitem.getEntityUrn();
        if (urn.isPlaylist())
        {
            navigator.openPlaylist(view.getContext(), urn, screen, searchQuerySourceInfo, promotedPlaylistInfo(listitem));
            return;
        }
        if (urn.isUser())
        {
            navigator.openProfile(view.getContext(), urn, screen, searchQuerySourceInfo);
            return;
        } else
        {
            throw new IllegalArgumentException((new StringBuilder("Unrecognized urn in ")).append(getClass().getSimpleName()).append(": ").append(urn).toString());
        }
    }

    private void handleTrackClick(Context context, List list, int i)
    {
        if (shouldShowUpsell((TrackItem)list.get(i)))
        {
            navigator.openUpgrade(context);
            return;
        } else
        {
            context = filterTracks(list);
            i = filterTracks(list.subList(0, i)).size();
            list = new PlaySessionSource(screen);
            list.setSearchQuerySourceInfo(searchQuerySourceInfo);
            playbackInitiator.playTracks(context, i, list).subscribe((X)subscriberProvider.get());
            return;
        }
    }

    private PromotedSourceInfo promotedPlaylistInfo(ListItem listitem)
    {
        if (listitem instanceof PromotedPlaylistItem)
        {
            return PromotedSourceInfo.fromItem((PromotedPlaylistItem)listitem);
        } else
        {
            return null;
        }
    }

    private boolean shouldShowUpsell(TrackItem trackitem)
    {
        return trackitem.isMidTier() && featureOperations.upsellMidTier();
    }

    public void onItemClick(List list, View view, int i)
    {
        ListItem listitem = (ListItem)list.get(i);
        if (listitem.getEntityUrn().isTrack())
        {
            handleTrackClick(view.getContext(), list, i);
            return;
        } else
        {
            handleNonTrackItemClick(view, listitem);
            return;
        }
    }

    public void onItemClick(b b1, View view, int i, ListItem listitem)
    {
        if (listitem.getEntityUrn().isTrack())
        {
            listitem = (TrackItem)listitem;
            if (shouldShowUpsell(listitem))
            {
                navigator.openUpgrade(view.getContext());
                return;
            } else
            {
                view = new PlaySessionSource(screen);
                view.setSearchQuerySourceInfo(searchQuerySourceInfo);
                playbackInitiator.playTracks(b1, listitem.getEntityUrn(), i, view).subscribe((X)subscriberProvider.get());
                return;
            }
        } else
        {
            handleNonTrackItemClick(view, listitem);
            return;
        }
    }

    public void onPostClick(b b1, View view, int i, ListItem listitem)
    {
        if (listitem.getEntityUrn().isTrack())
        {
            TrackItem trackitem = (TrackItem)listitem;
            if (shouldShowUpsell(trackitem))
            {
                navigator.openUpgrade(view.getContext());
                return;
            }
            view = new PlaySessionSource(screen);
            view.setSearchQuerySourceInfo(searchQuerySourceInfo);
            if (listitem instanceof PromotedTrackItem)
            {
                view.setPromotedSourceInfo(PromotedSourceInfo.fromItem((PromotedTrackItem)listitem));
            }
            playbackInitiator.playPosts(b1, trackitem.getEntityUrn(), i, view).subscribe((X)subscriberProvider.get());
            return;
        } else
        {
            handleNonTrackItemClick(view, listitem);
            return;
        }
    }
}
