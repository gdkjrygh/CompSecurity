// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.cosmos.player.v2;

import android.os.Handler;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.spotify.cosmos.android.Resolver;
import com.spotify.cosmos.router.Request;
import com.spotify.cosmos.router.Response;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.mobile.android.cosmos.JsonCallbackReceiver;
import com.spotify.mobile.android.cosmos.player.v2.internal.ActionParameters;
import com.spotify.mobile.android.cosmos.player.v2.internal.LoggingParameters;
import com.spotify.mobile.android.cosmos.player.v2.internal.PlayParameters;
import com.spotify.mobile.android.cosmos.player.v2.internal.PlayerInternalError;
import com.spotify.mobile.android.cosmos.player.v2.internal.PlayerSessionParameters;
import com.spotify.mobile.android.cosmos.player.v2.internal.PreparePlayParameters;
import com.spotify.mobile.android.cosmos.player.v2.internal.SkipToTrackParameters;
import com.spotify.mobile.android.cosmos.player.v2.internal.SnapshotParameters;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.logging.Logger;
import dmz;
import gng;
import gni;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;

// Referenced classes of package com.spotify.mobile.android.cosmos.player.v2:
//            Player, PlayerSession, PlayOrigin, PlayerState, 
//            PlayerQueue, PlayerContext, PlayOptions, PlayerTrack

public class ResolverPlayer
    implements Player
{

    private static final String PLAYER_URI = "sp://player/v2/main";
    private static final ObjectMapper sObjectMapper;
    private final String mFeatureIdentifier;
    private final String mFeatureVersion;
    private final Handler mHandler;
    private PlayerState mLastPlayerState;
    private Map mPlayerQueueObservers;
    private final Object mPlayerQueueObserversMutex;
    private Map mPlayerStateObservers;
    private final Object mPlayerStateObserversMutex;
    private final String mReferrerIdentifier;
    private final Resolver mResolver;
    private final String mViewUri;

    protected ResolverPlayer(Handler handler, Resolver resolver, String s, String s1, String s2, String s3)
    {
        mPlayerStateObservers = Maps.b();
        mPlayerQueueObservers = Maps.b();
        mPlayerStateObserversMutex = new Object();
        mPlayerQueueObserversMutex = new Object();
        mResolver = resolver;
        mViewUri = s;
        mFeatureIdentifier = s1;
        mFeatureVersion = s2;
        mReferrerIdentifier = s3;
        mResolver.registerConnectionCallback(new SubscriptionKeeper());
        mHandler = handler;
    }

    ResolverPlayer(Resolver resolver, String s, String s1, String s2, String s3)
    {
        this(new Handler(), resolver, s, s1, s2, s3);
    }

    private void doPreparePlay(PlayerContext playercontext, PlayOptions playoptions, String s, Player.PreparePlayCallback prepareplaycallback)
    {
        playercontext = new PreparePlayParameters(playercontext, playoptions, getPlaybackOriginWithViewUri(s, null));
        try
        {
            playercontext = sObjectMapper.writeValueAsBytes(playercontext);
        }
        // Misplaced declaration of an exception variable
        catch (PlayerContext playercontext)
        {
            throw new PlayerInternalError(playercontext);
        }
        playoptions = Collections.emptyMap();
        s = new PlayerSession(this);
        mResolver.resolve(new Request("POST", "sp://player/v2/main/session", playoptions, playercontext), new JsonCallbackReceiver(sObjectMapper, s, prepareplaycallback) {

            final ResolverPlayer this$0;
            final Player.PreparePlayCallback val$callback;
            final PlayerSession val$playerSession;

            protected void onError(Throwable throwable, com.spotify.mobile.android.cosmos.ParsingCallbackReceiver.ErrorCause errorcause)
            {
                Logger.b(throwable, (new StringBuilder("Failed to prepare play: ")).append(errorcause).toString(), new Object[0]);
                callback.onPreparePlayFailed();
            }

            protected void onResolved(Response response, PlayerSessionParameters playersessionparameters)
            {
                playerSession.setSessionUri(playersessionparameters.sessionUri);
                callback.onPreparePlaySuccess(playerSession);
            }

            protected volatile void onResolved(Response response, Object obj)
            {
                onResolved(response, (PlayerSessionParameters)obj);
            }

            
            {
                this$0 = ResolverPlayer.this;
                playerSession = playersession;
                callback = prepareplaycallback;
                super(final_handler, final_class1, objectmapper);
            }
        });
    }

    private PlayOrigin getPlaybackOriginWithViewUri(String s, String s1)
    {
        if (s == null)
        {
            s = mViewUri;
        }
        return new PlayOrigin(mFeatureIdentifier, mFeatureVersion, s, s1, mReferrerIdentifier);
    }

    private void playContext(PlayerContext playercontext, PlayOptions playoptions, String s, String s1, Player.PlayCallback playcallback)
    {
        PlayParameters playparameters = new PlayParameters();
        playparameters.context = playercontext;
        playparameters.options = playoptions;
        playparameters.playOrigin = getPlaybackOriginWithViewUri(s, s1);
        sendRequestWithAction("play", playparameters, playcallback);
    }

    private void sendRequestWithAction(String s, JacksonModel jacksonmodel, Player.PlayCallback playcallback)
    {
        Map map;
        try
        {
            jacksonmodel = sObjectMapper.writeValueAsBytes(jacksonmodel);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new PlayerInternalError(s);
        }
        s = String.format("sp://player/v2/main/%s", new Object[] {
            s
        });
        map = Collections.emptyMap();
        mResolver.resolve(new Request("POST", s, map, jacksonmodel), new com.spotify.cosmos.android.Resolver.CallbackReceiver(playcallback) {

            final ResolverPlayer this$0;
            final Player.PlayCallback val$callback;

            protected void onError(Throwable throwable)
            {
                if (callback == null)
                {
                    return;
                } else
                {
                    callback.onPlayForbidden(Lists.a(new String[] {
                        "android.internal-error"
                    }));
                    return;
                }
            }

            protected void onResolved(Response response)
            {
                if (callback == null)
                {
                    return;
                }
                if (response.getStatus() == 200)
                {
                    callback.onPlaySuccess();
                    return;
                }
                if (response.getStatus() == 403)
                {
                    response = (String)response.getHeaders().get("forbidden-reasons");
                    callback.onPlayForbidden(Arrays.asList(response.split(",")));
                    return;
                } else
                {
                    callback.onPlayForbidden(Lists.a(new String[] {
                        (new StringBuilder("android.unknown-error-")).append(response.getStatus()).toString()
                    }));
                    return;
                }
            }

            
            {
                this$0 = ResolverPlayer.this;
                callback = playcallback;
                super(final_handler);
            }
        });
    }

    void destroyPlayerSession(PlayerSession playersession, Player.PlayCallback playcallback)
    {
        playersession = playersession.getSessionUri();
        Map map = Collections.emptyMap();
        mResolver.resolve(new Request("DELETE", playersession, map, new byte[0]), new com.spotify.cosmos.android.Resolver.CallbackReceiver(playcallback) {

            final ResolverPlayer this$0;
            final Player.PlayCallback val$callback;

            protected void onError(Throwable throwable)
            {
                if (callback == null)
                {
                    return;
                } else
                {
                    callback.onPlayForbidden(Lists.a(new String[] {
                        "android.internal-error"
                    }));
                    return;
                }
            }

            protected void onResolved(Response response)
            {
                if (callback == null)
                {
                    return;
                }
                if (response.getStatus() == 200)
                {
                    callback.onPlaySuccess();
                    return;
                }
                if (response.getStatus() == 404)
                {
                    callback.onPlayForbidden(Lists.a(new String[] {
                        "player-session-not-found"
                    }));
                    return;
                } else
                {
                    callback.onPlayForbidden(Lists.a(new String[] {
                        (new StringBuilder("android.unknown-error-")).append(response.getStatus()).toString()
                    }));
                    return;
                }
            }

            
            {
                this$0 = ResolverPlayer.this;
                callback = playcallback;
                super(final_handler);
            }
        });
    }

    public void fetchState(Player.PlayerStateObserver playerstateobserver)
    {
        fetchState(playerstateobserver, 2, 2);
    }

    public void fetchState(Player.PlayerStateObserver playerstateobserver, int i, int j)
    {
        Request request = new Request("GET", String.format("sp://player/v2/main?reverse_cap=%d&future_cap=%d", new Object[] {
            Integer.valueOf(i), Integer.valueOf(j)
        }));
        mResolver.resolve(request, new JsonCallbackReceiver(com/spotify/mobile/android/cosmos/player/v2/PlayerState, sObjectMapper, playerstateobserver) {

            final ResolverPlayer this$0;
            final Player.PlayerStateObserver val$callback;

            protected void onError(Throwable throwable, com.spotify.mobile.android.cosmos.ParsingCallbackReceiver.ErrorCause errorcause)
            {
                Logger.b(throwable, (new StringBuilder("Failed to fetch state: ")).append(errorcause).toString(), new Object[0]);
            }

            protected void onResolved(Response response, PlayerState playerstate)
            {
                mLastPlayerState = playerstate;
                callback.onPlayerStateReceived(playerstate);
            }

            protected volatile void onResolved(Response response, Object obj)
            {
                onResolved(response, (PlayerState)obj);
            }

            
            {
                this$0 = ResolverPlayer.this;
                callback = playerstateobserver;
                super(final_handler, class1, objectmapper);
            }
        });
    }

    public String getFeatureIdentifier()
    {
        return mFeatureIdentifier;
    }

    public PlayerState getLastPlayerState()
    {
        return mLastPlayerState;
    }

    public void getQueue(Player.GetQueueCallback getqueuecallback)
    {
        mResolver.resolve(new Request("GET", "sp://player/v2/main/queue"), new JsonCallbackReceiver(com/spotify/mobile/android/cosmos/player/v2/PlayerQueue, sObjectMapper, getqueuecallback) {

            final ResolverPlayer this$0;
            final Player.GetQueueCallback val$callback;

            protected void onError(Throwable throwable, com.spotify.mobile.android.cosmos.ParsingCallbackReceiver.ErrorCause errorcause)
            {
                callback.onGetQueueFailed();
            }

            protected void onResolved(Response response, PlayerQueue playerqueue)
            {
                if (response.getStatus() == 200)
                {
                    callback.onGetQueueSuccess(playerqueue);
                    return;
                } else
                {
                    callback.onGetQueueFailed();
                    return;
                }
            }

            protected volatile void onResolved(Response response, Object obj)
            {
                onResolved(response, (PlayerQueue)obj);
            }

            
            {
                this$0 = ResolverPlayer.this;
                callback = getqueuecallback;
                super(final_handler, class1, objectmapper);
            }
        });
    }

    public String getViewUri()
    {
        return mViewUri;
    }

    public void pause()
    {
        sendRequestWithAction("pause", new ActionParameters(), null);
    }

    public void play(PlayerContext playercontext, PlayOptions playoptions)
    {
        playContext(playercontext, playoptions, null, null, null);
    }

    public void play(PlayerContext playercontext, PlayOptions playoptions, Player.PlayCallback playcallback)
    {
        playContext(playercontext, playoptions, null, null, playcallback);
    }

    void play(PlayerSession playersession)
    {
        byte abyte0[];
        Map map;
        try
        {
            abyte0 = sObjectMapper.writeValueAsBytes(LoggingParameters.createWithCurrentTimestamp());
        }
        // Misplaced declaration of an exception variable
        catch (PlayerSession playersession)
        {
            throw new PlayerInternalError(playersession);
        }
        playersession = String.format("%s/play", new Object[] {
            playersession.getSessionUri()
        });
        map = Collections.emptyMap();
        mResolver.resolve(new Request("POST", playersession, map, abyte0), null);
    }

    public void playWithViewUri(PlayerContext playercontext, PlayOptions playoptions, String s)
    {
        playContext(playercontext, playoptions, s, null, null);
    }

    public void playWithViewUri(PlayerContext playercontext, PlayOptions playoptions, String s, Player.PlayCallback playcallback)
    {
        playContext(playercontext, playoptions, s, null, playcallback);
    }

    public void preparePlay(PlayerContext playercontext, PlayOptions playoptions, Player.PreparePlayCallback prepareplaycallback)
    {
        doPreparePlay(playercontext, playoptions, null, prepareplaycallback);
    }

    public void preparePlay(PlayerContext playercontext, PlayOptions playoptions, String s, Player.PreparePlayCallback prepareplaycallback)
    {
        doPreparePlay(playercontext, playoptions, s, prepareplaycallback);
    }

    public void registerPlayerQueueObserver(Player.PlayerQueueObserver playerqueueobserver)
    {
        Request request = new Request("SUB", "sp://player/v2/main/queue");
        com.spotify.cosmos.android.Subscription subscription = mResolver.subscribe(request, new JsonCallbackReceiver(com/spotify/mobile/android/cosmos/player/v2/PlayerQueue, sObjectMapper, playerqueueobserver) {

            final ResolverPlayer this$0;
            final Player.PlayerQueueObserver val$observer;

            protected void onError(Throwable throwable, com.spotify.mobile.android.cosmos.ParsingCallbackReceiver.ErrorCause errorcause)
            {
                Logger.b(throwable, (new StringBuilder("Failed to resolve state: ")).append(errorcause).toString(), new Object[0]);
            }

            protected void onResolved(Response response, PlayerQueue playerqueue)
            {
label0:
                {
                    synchronized (mPlayerQueueObserversMutex)
                    {
                        if (mPlayerQueueObservers.containsKey(observer))
                        {
                            break label0;
                        }
                    }
                    return;
                }
                observer.onPlayerQueueReceived(playerqueue);
                response;
                JVM INSTR monitorexit ;
                return;
                playerqueue;
                response;
                JVM INSTR monitorexit ;
                throw playerqueue;
            }

            protected volatile void onResolved(Response response, Object obj1)
            {
                onResolved(response, (PlayerQueue)obj1);
            }

            
            {
                this$0 = ResolverPlayer.this;
                observer = playerqueueobserver;
                super(final_handler, class1, objectmapper);
            }
        });
        synchronized (mPlayerQueueObserversMutex)
        {
            mPlayerQueueObservers.put(playerqueueobserver, subscription);
        }
        return;
        playerqueueobserver;
        obj;
        JVM INSTR monitorexit ;
        throw playerqueueobserver;
    }

    public void registerPlayerStateObserver(Player.PlayerStateObserver playerstateobserver)
    {
        registerPlayerStateObserver(playerstateobserver, 2, 2);
    }

    public void registerPlayerStateObserver(Player.PlayerStateObserver playerstateobserver, int i, int j)
    {
label0:
        {
            synchronized (mPlayerStateObserversMutex)
            {
                if (!mPlayerStateObservers.containsKey(playerstateobserver))
                {
                    break label0;
                }
            }
            return;
        }
        PlayerStateSubscription playerstatesubscription;
        playerstatesubscription = new PlayerStateSubscription(playerstateobserver, i, j);
        mPlayerStateObservers.put(playerstateobserver, playerstatesubscription);
        obj;
        JVM INSTR monitorexit ;
        playerstatesubscription.subscribe();
        return;
        playerstateobserver;
        obj;
        JVM INSTR monitorexit ;
        throw playerstateobserver;
    }

    public void restore(String s, Player.RestoreCallback restorecallback)
    {
        Object obj = new SnapshotParameters();
        obj.snapshot = s;
        try
        {
            s = sObjectMapper.writeValueAsBytes(obj);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new PlayerInternalError(s);
        }
        obj = Collections.emptyMap();
        mResolver.resolve(new Request("PUT", "sp://player/v2/main/snapshot", ((Map) (obj)), s), new com.spotify.cosmos.android.Resolver.CallbackReceiver(restorecallback) {

            final ResolverPlayer this$0;
            final Player.RestoreCallback val$callback;

            protected void onError(Throwable throwable)
            {
                callback.onRestoreFailed();
            }

            protected void onResolved(Response response)
            {
                if (callback == null)
                {
                    return;
                }
                if (response.getStatus() == 200)
                {
                    callback.onRestoreSuccess();
                    return;
                } else
                {
                    callback.onRestoreFailed();
                    return;
                }
            }

            
            {
                this$0 = ResolverPlayer.this;
                callback = restorecallback;
                super(final_handler);
            }
        });
    }

    public void resume()
    {
        sendRequestWithAction("resume", new ActionParameters(), null);
    }

    public void save(Player.SaveCallback savecallback)
    {
        mResolver.resolve(new Request("GET", "sp://player/v2/main/snapshot"), new JsonCallbackReceiver(com/spotify/mobile/android/cosmos/player/v2/internal/SnapshotParameters, sObjectMapper, savecallback) {

            final ResolverPlayer this$0;
            final Player.SaveCallback val$callback;

            protected void onError(Throwable throwable, com.spotify.mobile.android.cosmos.ParsingCallbackReceiver.ErrorCause errorcause)
            {
                callback.onSaveFailed();
            }

            protected void onResolved(Response response, SnapshotParameters snapshotparameters)
            {
                if (response.getStatus() == 200)
                {
                    response = snapshotparameters.snapshot;
                    if (response != null)
                    {
                        callback.onSnapshotReceived(response);
                        return;
                    } else
                    {
                        Assertion.b("Null snapshot received");
                        return;
                    }
                } else
                {
                    callback.onSaveFailed();
                    return;
                }
            }

            protected volatile void onResolved(Response response, Object obj)
            {
                onResolved(response, (SnapshotParameters)obj);
            }

            
            {
                this$0 = ResolverPlayer.this;
                callback = savecallback;
                super(final_handler, class1, objectmapper);
            }
        });
    }

    public void seekTo(long l)
    {
        ActionParameters actionparameters = new ActionParameters();
        actionparameters.value = Long.valueOf(l);
        sendRequestWithAction("seek_to", actionparameters, null);
    }

    public void setQueue(PlayerQueue playerqueue, Player.SetQueueCallback setqueuecallback)
    {
        try
        {
            playerqueue = new Request("PUT", "sp://player/v2/main/queue", null, sObjectMapper.writeValueAsBytes(playerqueue));
            mResolver.resolve(playerqueue, new com.spotify.cosmos.android.Resolver.CallbackReceiver(setqueuecallback) {

                final ResolverPlayer this$0;
                final Player.SetQueueCallback val$callback;

                protected void onError(Throwable throwable)
                {
                    if (callback != null)
                    {
                        callback.onSetQueueFailed();
                    }
                }

                protected void onResolved(Response response)
                {
                    if (callback != null)
                    {
                        callback.onSetQueueSuccess();
                    }
                }

            
            {
                this$0 = ResolverPlayer.this;
                callback = setqueuecallback;
                super(final_handler);
            }
            });
            return;
        }
        // Misplaced declaration of an exception variable
        catch (PlayerQueue playerqueue)
        {
            throw new RuntimeException("Failed to write player queue to JSON");
        }
    }

    public void setRepeatingContext(boolean flag)
    {
        ActionParameters actionparameters = new ActionParameters();
        actionparameters.value = Boolean.valueOf(flag);
        sendRequestWithAction("set_repeating_context", actionparameters, null);
    }

    public void setRepeatingTrack(boolean flag)
    {
        ActionParameters actionparameters = new ActionParameters();
        actionparameters.value = Boolean.valueOf(flag);
        sendRequestWithAction("set_repeating_track", actionparameters, null);
    }

    public void setShufflingContext(boolean flag)
    {
        ActionParameters actionparameters = new ActionParameters();
        actionparameters.value = Boolean.valueOf(flag);
        sendRequestWithAction("set_shuffling_context", actionparameters, null);
    }

    public void skipToFutureTrack(PlayerTrack playertrack)
    {
        SkipToTrackParameters skiptotrackparameters = new SkipToTrackParameters();
        skiptotrackparameters.track = playertrack;
        sendRequestWithAction("skip_next", skiptotrackparameters, null);
    }

    public void skipToFutureTrack(PlayerTrack playertrack, boolean flag)
    {
        SkipToTrackParameters skiptotrackparameters = new SkipToTrackParameters();
        skiptotrackparameters.track = playertrack;
        skiptotrackparameters.overrideRestrictions = flag;
        sendRequestWithAction("skip_next", skiptotrackparameters, null);
    }

    public void skipToNextTrack()
    {
        sendRequestWithAction("skip_next", new ActionParameters(), null);
    }

    public void skipToNextTrack(boolean flag)
    {
        SkipToTrackParameters skiptotrackparameters = new SkipToTrackParameters();
        skiptotrackparameters.overrideRestrictions = flag;
        sendRequestWithAction("skip_next", skiptotrackparameters, null);
    }

    public void skipToPastTrack(PlayerTrack playertrack)
    {
        SkipToTrackParameters skiptotrackparameters = new SkipToTrackParameters();
        skiptotrackparameters.track = playertrack;
        sendRequestWithAction("skip_prev", skiptotrackparameters, null);
    }

    public void skipToPreviousTrack()
    {
        sendRequestWithAction("skip_prev", new ActionParameters(), null);
    }

    public void skipToPreviousTrack(boolean flag)
    {
        SkipToTrackParameters skiptotrackparameters = new SkipToTrackParameters();
        skiptotrackparameters.overrideRestrictions = flag;
        sendRequestWithAction("skip_prev", skiptotrackparameters, null);
    }

    public void unregisterPlayerQueueObserver(Player.PlayerQueueObserver playerqueueobserver)
    {
        synchronized (mPlayerQueueObservers)
        {
            mPlayerQueueObservers.remove(playerqueueobserver);
        }
        return;
        playerqueueobserver;
        map;
        JVM INSTR monitorexit ;
        throw playerqueueobserver;
    }

    public void unregisterPlayerStateObserver(Player.PlayerStateObserver playerstateobserver)
    {
        Object obj = mPlayerStateObserversMutex;
        obj;
        JVM INSTR monitorenter ;
        playerstateobserver = (PlayerStateSubscription)mPlayerStateObservers.remove(playerstateobserver);
        if (playerstateobserver == null)
        {
            break MISSING_BLOCK_LABEL_29;
        }
        playerstateobserver.unsubscribe();
        obj;
        JVM INSTR monitorexit ;
        return;
        playerstateobserver;
        obj;
        JVM INSTR monitorexit ;
        throw playerstateobserver;
    }

    public void updateWithContext(PlayerContext playercontext)
    {
        updateWithContext(playercontext, null);
    }

    public void updateWithContext(PlayerContext playercontext, Player.PlayCallback playcallback)
    {
        PlayParameters playparameters = new PlayParameters();
        playparameters.context = playercontext;
        sendRequestWithAction("update", playparameters, playcallback);
    }

    static 
    {
        sObjectMapper = ((gni)dmz.a(gni)).a().a(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false).a(SerializationFeature.FAIL_ON_EMPTY_BEANS, false).a(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL).a();
    }






/*
    static PlayerState access$402(ResolverPlayer resolverplayer, PlayerState playerstate)
    {
        resolverplayer.mLastPlayerState = playerstate;
        return playerstate;
    }

*/




    private class SubscriptionKeeper
        implements com.spotify.cosmos.android.Resolver.ConnectionCallback
    {

        final ResolverPlayer this$0;

        public final void onServiceConnected(Resolver resolver)
        {
            for (resolver = mPlayerStateObservers.values().iterator(); resolver.hasNext(); ((PlayerStateSubscription)resolver.next()).subscribe()) { }
        }

        public final void onServiceConnectionFailed(Resolver resolver, com.spotify.cosmos.android.Resolver.ConnectionError connectionerror)
        {
            for (resolver = mPlayerStateObservers.values().iterator(); resolver.hasNext(); ((PlayerStateSubscription)resolver.next()).unsubscribe()) { }
        }

        public final void onServiceDisconnected(Resolver resolver)
        {
            for (resolver = mPlayerStateObservers.values().iterator(); resolver.hasNext(); ((PlayerStateSubscription)resolver.next()).unsubscribe()) { }
        }

        private SubscriptionKeeper()
        {
            this$0 = ResolverPlayer.this;
            super();
        }

    }


    private class PlayerStateSubscription extends JsonCallbackReceiver
    {

        private final Player.PlayerStateObserver mObserver;
        private final Request mRequest;
        private Subscription mSubscription;
        final ResolverPlayer this$0;

        protected final void onError(Throwable throwable, com.spotify.mobile.android.cosmos.ParsingCallbackReceiver.ErrorCause errorcause)
        {
            Logger.b(throwable, (new StringBuilder("Failed to resolve state: ")).append(errorcause).toString(), new Object[0]);
        }

        protected final void onResolved(Response response, PlayerState playerstate)
        {
label0:
            {
                synchronized (mPlayerStateObserversMutex)
                {
                    if (mPlayerStateObservers.containsKey(mObserver))
                    {
                        break label0;
                    }
                }
                return;
            }
            mLastPlayerState = playerstate;
            mObserver.onPlayerStateReceived(playerstate);
            response;
            JVM INSTR monitorexit ;
            return;
            playerstate;
            response;
            JVM INSTR monitorexit ;
            throw playerstate;
        }

        protected final volatile void onResolved(Response response, Object obj)
        {
            onResolved(response, (PlayerState)obj);
        }

        final void subscribe()
        {
            this;
            JVM INSTR monitorenter ;
            if (mSubscription == null || !mSubscription.isActive())
            {
                mSubscription = mResolver.subscribe(mRequest, this);
            }
            this;
            JVM INSTR monitorexit ;
            return;
            Exception exception;
            exception;
            throw exception;
        }

        final void unsubscribe()
        {
            this;
            JVM INSTR monitorenter ;
            Subscription subscription = mSubscription;
            if (subscription != null) goto _L2; else goto _L1
_L1:
            this;
            JVM INSTR monitorexit ;
            return;
_L2:
            mSubscription.unsubscribe();
            mSubscription = null;
            if (true) goto _L1; else goto _L3
_L3:
            Exception exception;
            exception;
            throw exception;
        }

        PlayerStateSubscription(Player.PlayerStateObserver playerstateobserver, int i, int j)
        {
            this$0 = ResolverPlayer.this;
            super(mHandler, com/spotify/mobile/android/cosmos/player/v2/PlayerState, ResolverPlayer.sObjectMapper);
            mObserver = playerstateobserver;
            mRequest = new Request("SUB", String.format("sp://player/v2/main?reverse_cap=%d&future_cap=%d", new Object[] {
                Integer.valueOf(i), Integer.valueOf(j)
            }));
        }
    }

}
