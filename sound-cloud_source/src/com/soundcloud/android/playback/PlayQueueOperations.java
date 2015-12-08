// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback;

import android.content.Context;
import android.content.SharedPreferences;
import com.soundcloud.android.api.ApiClientRx;
import com.soundcloud.android.api.ApiEndpoints;
import com.soundcloud.android.api.ApiRequest;
import com.soundcloud.android.commands.StoreTracksCommand;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.rx.observers.DefaultSubscriber;
import rx.R;
import rx.Y;
import rx.b;
import rx.b.f;

// Referenced classes of package com.soundcloud.android.playback:
//            PlaySessionSource, PlayQueueStorage, RecommendedTracksCollection, PlayQueue

class PlayQueueOperations
{
    static final class Keys extends Enum
    {

        private static final Keys $VALUES[];
        public static final Keys PLAY_POSITION;
        public static final Keys SEEK_POSITION;
        public static final Keys TRACK_ID;

        public static Keys valueOf(String s)
        {
            return (Keys)Enum.valueOf(com/soundcloud/android/playback/PlayQueueOperations$Keys, s);
        }

        public static Keys[] values()
        {
            return (Keys[])$VALUES.clone();
        }

        static 
        {
            PLAY_POSITION = new Keys("PLAY_POSITION", 0);
            SEEK_POSITION = new Keys("SEEK_POSITION", 1);
            TRACK_ID = new Keys("TRACK_ID", 2);
            $VALUES = (new Keys[] {
                PLAY_POSITION, SEEK_POSITION, TRACK_ID
            });
        }

        private Keys(String s, int i)
        {
            super(s, i);
        }
    }


    static final String SHARED_PREFERENCES_KEY = "playlistPos";
    private final ApiClientRx apiClientRx;
    private final PlayQueueStorage playQueueStorage;
    private final R scheduler;
    private final SharedPreferences sharedPreferences;
    private final StoreTracksCommand storeTracksCommand;

    PlayQueueOperations(Context context, PlayQueueStorage playqueuestorage, StoreTracksCommand storetrackscommand, ApiClientRx apiclientrx, R r)
    {
        storeTracksCommand = storetrackscommand;
        scheduler = r;
        sharedPreferences = context.getSharedPreferences("playlistPos", 0);
        playQueueStorage = playqueuestorage;
        apiClientRx = apiclientrx;
    }

    private f toPlayQueue(final Urn seedTrack)
    {
        return new _cls3();
    }

    void clear()
    {
        android.content.SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.remove(Keys.TRACK_ID.name());
        editor.remove(Keys.PLAY_POSITION.name());
        editor.remove(Keys.SEEK_POSITION.name());
        PlaySessionSource.clearPreferenceKeys(editor);
        editor.apply();
        DefaultSubscriber.fireAndForget(playQueueStorage.clearAsync().subscribeOn(scheduler));
    }

    int getLastStoredPlayPosition()
    {
        return sharedPreferences.getInt(Keys.PLAY_POSITION.name(), 0);
    }

    b getLastStoredPlayQueue()
    {
        if (getLastStoredPlayingTrackId() != -1L)
        {
            return playQueueStorage.loadAsync().toList().map(new _cls1()).subscribeOn(scheduler);
        } else
        {
            return null;
        }
    }

    PlaySessionSource getLastStoredPlaySessionSource()
    {
        return new PlaySessionSource(sharedPreferences);
    }

    long getLastStoredPlayingTrackId()
    {
        return sharedPreferences.getLong(Keys.TRACK_ID.name(), -1L);
    }

    long getLastStoredSeekPosition()
    {
        return sharedPreferences.getLong(Keys.SEEK_POSITION.name(), 0L);
    }

    public b relatedTracks(Urn urn, boolean flag)
    {
        com.soundcloud.android.api.ApiRequest.Builder builder = ApiRequest.get(String.format(ApiEndpoints.RELATED_TRACKS.path(), new Object[] {
            urn.toEncodedString()
        })).forPrivateApi(1);
        if (flag)
        {
            urn = "true";
        } else
        {
            urn = "false";
        }
        urn = builder.addQueryParam("continuous_play", new Object[] {
            urn
        }).build();
        return apiClientRx.mappedResponse(urn, com/soundcloud/android/playback/RecommendedTracksCollection).doOnNext(storeTracksCommand.toAction()).subscribeOn(scheduler);
    }

    public b relatedTracksPlayQueue(final Urn seedTrack, boolean flag)
    {
        return relatedTracks(seedTrack, flag).map(new _cls2());
    }

    public b relatedTracksPlayQueueWithSeedTrack(Urn urn)
    {
        return relatedTracks(urn, false).map(toPlayQueue(urn));
    }

    void savePositionInfo(int i, Urn urn, PlaySessionSource playsessionsource, long l)
    {
        android.content.SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putLong(Keys.TRACK_ID.name(), urn.getNumericId());
        editor.putInt(Keys.PLAY_POSITION.name(), i);
        editor.putLong(Keys.SEEK_POSITION.name(), l);
        playsessionsource.saveToPreferences(editor);
        editor.apply();
    }

    Y saveQueue(PlayQueue playqueue)
    {
        return DefaultSubscriber.fireAndForget(playQueueStorage.storeAsync(playqueue).subscribeOn(scheduler));
    }

    private class _cls3
        implements f
    {

        final PlayQueueOperations this$0;
        final Urn val$seedTrack;

        public PlayQueue call(RecommendedTracksCollection recommendedtrackscollection)
        {
            if (recommendedtrackscollection.getCollection().isEmpty())
            {
                return PlayQueue.empty();
            } else
            {
                return PlayQueue.fromRecommendationsWithPrependedSeed(seedTrack, recommendedtrackscollection);
            }
        }

        public volatile Object call(Object obj)
        {
            return call((RecommendedTracksCollection)obj);
        }

        _cls3()
        {
            this$0 = PlayQueueOperations.this;
            seedTrack = urn;
            super();
        }
    }


    private class _cls1
        implements f
    {

        final PlayQueueOperations this$0;

        public PlayQueue call(List list)
        {
            return new PlayQueue(list);
        }

        public volatile Object call(Object obj)
        {
            return call((List)obj);
        }

        _cls1()
        {
            this$0 = PlayQueueOperations.this;
            super();
        }
    }


    private class _cls2
        implements f
    {

        final PlayQueueOperations this$0;
        final Urn val$seedTrack;

        public PlayQueue call(RecommendedTracksCollection recommendedtrackscollection)
        {
            if (recommendedtrackscollection.getCollection().isEmpty())
            {
                return PlayQueue.empty();
            } else
            {
                return PlayQueue.fromRecommendations(seedTrack, recommendedtrackscollection);
            }
        }

        public volatile Object call(Object obj)
        {
            return call((RecommendedTracksCollection)obj);
        }

        _cls2()
        {
            this$0 = PlayQueueOperations.this;
            seedTrack = urn;
            super();
        }
    }

}
