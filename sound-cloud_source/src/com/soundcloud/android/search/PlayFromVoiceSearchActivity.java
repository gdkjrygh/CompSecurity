// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.search;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.soundcloud.android.SoundCloudApplication;
import com.soundcloud.android.main.Screen;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.playback.ExpandPlayerSubscriber;
import com.soundcloud.android.playback.PlaybackInitiator;
import com.soundcloud.android.playback.PlaybackResult;
import com.soundcloud.android.playback.ui.view.PlaybackToastHelper;
import com.soundcloud.android.playlists.PlaylistDetailActivity;
import com.soundcloud.android.playlists.PlaylistProperty;
import com.soundcloud.android.rx.observers.DefaultSubscriber;
import com.soundcloud.java.collections.PropertySet;
import com.soundcloud.rx.eventbus.EventBus;
import dagger.b;
import java.util.Random;
import rx.a.b.a;
import rx.b.f;

// Referenced classes of package com.soundcloud.android.search:
//            SearchOperations

public class PlayFromVoiceSearchActivity extends Activity
{
    private class PlayFromPlaylistSubscriber extends DefaultSubscriber
    {

        private final String query;
        final PlayFromVoiceSearchActivity this$0;

        public void onError(Throwable throwable)
        {
            fallbackToSearch(query);
        }

        public void onNext(PropertySet propertyset)
        {
            PlaylistDetailActivity.start(PlayFromVoiceSearchActivity.this, (Urn)propertyset.get(PlaylistProperty.URN), Screen.SEARCH_PLAYLIST_DISCO, true);
        }

        public volatile void onNext(Object obj)
        {
            onNext((PropertySet)obj);
        }

        public PlayFromPlaylistSubscriber(String s)
        {
            this$0 = PlayFromVoiceSearchActivity.this;
            super();
            query = s;
        }
    }

    private class PlayFromQuerySubscriber extends ExpandPlayerSubscriber
    {

        private final String query;
        final PlayFromVoiceSearchActivity this$0;

        public void onError(Throwable throwable)
        {
            fallbackToSearch(query);
        }

        public void onNext(PlaybackResult playbackresult)
        {
            startActivity((new Intent("com.soundcloud.android.action.STREAM")).addFlags(0x4000000));
            super.onNext(playbackresult);
        }

        public volatile void onNext(Object obj)
        {
            onNext((PlaybackResult)obj);
        }

        public PlayFromQuerySubscriber(EventBus eventbus, PlaybackToastHelper playbacktoasthelper, String s)
        {
            this$0 = PlayFromVoiceSearchActivity.this;
            super(eventbus, playbacktoasthelper);
            query = s;
        }
    }


    private static final String ANDROID_INTENT_EXTRA_GENRE = "android.intent.extra.genre";
    EventBus eventBus;
    PlaybackInitiator playbackInitiator;
    PlaybackToastHelper playbackToastHelper;
    Random random;
    SearchOperations searchOperations;
    private final f toPlayWithRecommendations;
    private final f toRandomSearchResultItem;

    public PlayFromVoiceSearchActivity()
    {
        toPlayWithRecommendations = new _cls1();
        toRandomSearchResultItem = new _cls2();
        SoundCloudApplication.getObjectGraph().a(this);
    }

    public PlayFromVoiceSearchActivity(SearchOperations searchoperations, PlaybackInitiator playbackinitiator, Random random1)
    {
        toPlayWithRecommendations = new _cls1();
        toRandomSearchResultItem = new _cls2();
        searchOperations = searchoperations;
        playbackInitiator = playbackinitiator;
        random = random1;
    }

    private void fallbackToSearch(String s)
    {
        startActivity((new Intent("com.soundcloud.android.action.PERFORM_SEARCH")).addFlags(0x4000000).putExtra("query", s));
    }

    private String getGenreKeyCompat(Intent intent)
    {
        if (intent.getExtras().containsKey("android.intent.extra.genre"))
        {
            return intent.getStringExtra("android.intent.extra.genre");
        } else
        {
            return intent.getStringExtra("query");
        }
    }

    private void playPlaylist(String s)
    {
        searchOperations.searchResult(s, 2).observeOn(a.a()).map(toRandomSearchResultItem).subscribe(new PlayFromPlaylistSubscriber(s));
    }

    private void playTrackFromQuery(String s)
    {
        searchOperations.searchResult(s, 1).observeOn(a.a()).flatMap(toPlayWithRecommendations).subscribe(new PlayFromQuerySubscriber(eventBus, playbackToastHelper, s));
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f0300a5);
    }

    protected void onResume()
    {
        super.onResume();
        Intent intent = getIntent();
        if ("android.media.action.MEDIA_PLAY_FROM_SEARCH".equals(intent.getAction()))
        {
            findViewById(0x7f0f0173).setVisibility(0);
            String s = intent.getStringExtra("android.intent.extra.focus");
            if (s != null && "vnd.android.cursor.item/genre".equals(s))
            {
                playPlaylist(getGenreKeyCompat(intent));
                return;
            } else
            {
                playTrackFromQuery(intent.getStringExtra("query"));
                return;
            }
        } else
        {
            finish();
            return;
        }
    }


    private class _cls1
        implements f
    {

        final PlayFromVoiceSearchActivity this$0;

        public volatile Object call(Object obj)
        {
            return call((SearchResult)obj);
        }

        public rx.b call(SearchResult searchresult)
        {
            searchresult = searchresult.getItems();
            boolean flag;
            if (!searchresult.isEmpty())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkState(flag, "There is no result for this search");
            return playbackInitiator.playTrackWithRecommendationsLegacy((Urn)((PropertySet)searchresult.get(0)).get(TrackProperty.URN), new PlaySessionSource(Screen.VOICE_COMMAND));
        }

        _cls1()
        {
            this$0 = PlayFromVoiceSearchActivity.this;
            super();
        }
    }


    private class _cls2
        implements f
    {

        final PlayFromVoiceSearchActivity this$0;

        public PropertySet call(SearchResult searchresult)
        {
            searchresult = searchresult.getItems();
            boolean flag;
            if (!searchresult.isEmpty())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkState(flag, "There is no result for this search");
            return (PropertySet)searchresult.get(random.nextInt(searchresult.size()));
        }

        public volatile Object call(Object obj)
        {
            return call((SearchResult)obj);
        }

        _cls2()
        {
            this$0 = PlayFromVoiceSearchActivity.this;
            super();
        }
    }

}
