// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.discovery;

import android.content.Context;
import android.net.Uri;
import com.soundcloud.android.Navigator;
import com.soundcloud.android.analytics.SearchQuerySourceInfo;
import com.soundcloud.android.events.EventQueue;
import com.soundcloud.android.events.SearchEvent;
import com.soundcloud.android.main.Screen;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.playback.PlaybackInitiator;
import com.soundcloud.android.search.suggestions.SuggestionsAdapter;
import com.soundcloud.android.storage.provider.Content;
import com.soundcloud.rx.eventbus.EventBus;
import javax.inject.Provider;
import rx.X;
import rx.b;

class SuggestionsHelper
{

    private final SuggestionsAdapter adapter;
    private final EventBus eventBus;
    private final Provider expandPlayerSubscriberProvider;
    private final Navigator navigator;
    private final PlaybackInitiator playbackInitiator;

    SuggestionsHelper(Navigator navigator1, EventBus eventbus, Provider provider, PlaybackInitiator playbackinitiator, SuggestionsAdapter suggestionsadapter)
    {
        navigator = navigator1;
        eventBus = eventbus;
        expandPlayerSubscriberProvider = provider;
        playbackInitiator = playbackinitiator;
        adapter = suggestionsadapter;
    }

    private SearchQuerySourceInfo getQuerySourceInfo(int i)
    {
        SearchQuerySourceInfo searchquerysourceinfo = null;
        Urn urn = adapter.getQueryUrn(i);
        if (!urn.equals(Urn.NOT_SET))
        {
            searchquerysourceinfo = new SearchQuerySourceInfo(urn, adapter.getQueryPosition(i), adapter.getUrn(i));
        }
        return searchquerysourceinfo;
    }

    private void playTrack(Urn urn, SearchQuerySourceInfo searchquerysourceinfo)
    {
        playbackInitiator.startPlaybackWithRecommendations(urn, Screen.SEARCH_SUGGESTIONS, searchquerysourceinfo).subscribe((X)expandPlayerSubscriberProvider.get());
    }

    private void trackSuggestion(int i, Uri uri, SearchQuerySourceInfo searchquerysourceinfo)
    {
        uri = SearchEvent.searchSuggestion(Content.match(uri), adapter.isLocalResult(i), searchquerysourceinfo);
        eventBus.publish(EventQueue.TRACKING, uri);
    }

    void launchSuggestion(Context context, int i)
    {
        Uri uri = adapter.getItemIntentData(i);
        Urn urn = adapter.getUrn(i);
        SearchQuerySourceInfo searchquerysourceinfo = getQuerySourceInfo(i);
        trackSuggestion(i, uri, searchquerysourceinfo);
        if (urn.isTrack())
        {
            playTrack(urn, searchquerysourceinfo);
            return;
        } else
        {
            navigator.launchSearchSuggestion(context, urn, searchquerysourceinfo, uri);
            return;
        }
    }
}
