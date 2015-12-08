// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.cosmos.player.v2.stateful;

import android.os.Handler;
import com.spotify.mobile.android.cosmos.player.v2.PlayOptions;
import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerContext;
import com.spotify.mobile.android.cosmos.player.v2.PlayerOptions;
import com.spotify.mobile.android.cosmos.player.v2.PlayerQueue;
import com.spotify.mobile.android.cosmos.player.v2.PlayerRestrictions;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import ctz;
import gcf;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.spotify.mobile.android.cosmos.player.v2.stateful:
//            StatefulPlayerValue, StatefulPlayerPosition, StatefulPlayerQueue

public class StatefulPlayer
    implements Player
{

    private static final int INCORRECT_STATE_RETRY_GRACE_PERIOD = 200;
    private gcf mClock;
    private Handler mHandler;
    private final StatefulPlayerValue mIsPaused = new StatefulPlayerValue();
    private final List mObservers = new ArrayList();
    private final Player mPlayer;
    private StatefulPlayerPosition mPlayerPosition;
    private StatefulPlayerQueue mPlayerQueue;
    private PlayerState mPlayerState;
    private com.spotify.mobile.android.cosmos.player.v2.Player.PlayerStateObserver mPlayerStateObserver;
    private final StatefulPlayerValue mRepeatContext = new StatefulPlayerValue();
    private final StatefulPlayerValue mRepeatTrack = new StatefulPlayerValue();
    private Runnable mRetryRunnable;
    private final StatefulPlayerValue mShuffleContext = new StatefulPlayerValue();

    public StatefulPlayer(Player player)
    {
        mClock = gcf.a;
        mPlayerStateObserver = new com.spotify.mobile.android.cosmos.player.v2.Player.PlayerStateObserver() {

            final StatefulPlayer this$0;

            public void onPlayerStateReceived(PlayerState playerstate)
            {
                updatePlayerState(playerstate, StateOrigin.REMOTE);
            }

            
            {
                this$0 = StatefulPlayer.this;
                super();
            }

            private class StateOrigin extends Enum
            {

                private static final StateOrigin $VALUES[];
                public static final StateOrigin LOCAL;
                public static final StateOrigin REMOTE;

                public static StateOrigin valueOf(String s)
                {
                    return (StateOrigin)Enum.valueOf(com/spotify/mobile/android/cosmos/player/v2/stateful/StatefulPlayer$StateOrigin, s);
                }

                public static StateOrigin[] values()
                {
                    return (StateOrigin[])$VALUES.clone();
                }

                static 
                {
                    LOCAL = new StateOrigin("LOCAL", 0);
                    REMOTE = new StateOrigin("REMOTE", 1);
                    $VALUES = (new StateOrigin[] {
                        LOCAL, REMOTE
                    });
                }

                private StateOrigin(String s, int i)
                {
                    super(s, i);
                }
            }

        };
        mPlayer = (Player)ctz.a(player);
        mPlayerPosition = new StatefulPlayerPosition(mPlayer);
        mPlayerQueue = new StatefulPlayerQueue();
        mHandler = new Handler();
    }

    private Set generateDisallowPausingReasons(PlayerRestrictions playerrestrictions)
    {
        playerrestrictions = new HashSet(playerrestrictions.disallowPausingReasons());
        if (mIsPaused.getValue())
        {
            playerrestrictions.add("already_paused");
            return playerrestrictions;
        } else
        {
            playerrestrictions.remove("already_paused");
            return playerrestrictions;
        }
    }

    private Set generateDisallowResumingReasons(PlayerRestrictions playerrestrictions)
    {
        playerrestrictions = new HashSet(playerrestrictions.disallowResumingReasons());
        if (mIsPaused.getValue())
        {
            playerrestrictions.remove("not_paused");
            return playerrestrictions;
        } else
        {
            playerrestrictions.add("not_paused");
            return playerrestrictions;
        }
    }

    private PlayerRestrictions generateRestrictions(PlayerRestrictions playerrestrictions)
    {
        return new PlayerRestrictions(playerrestrictions.disallowPlayingReasons(), playerrestrictions.disallowStoppingReasons(), playerrestrictions.disallowPeekingPrevReasons(), playerrestrictions.disallowPeekingNextReasons(), playerrestrictions.disallowSkippingPrevReasons(), playerrestrictions.disallowSkippingNextReasons(), generateDisallowPausingReasons(playerrestrictions), generateDisallowResumingReasons(playerrestrictions), playerrestrictions.disallowTogglingRepeatContextReasons(), playerrestrictions.disallowTogglingRepeatTrackReasons(), playerrestrictions.disallowTogglingShuffleReasons(), playerrestrictions.disallowSeekingReasons(), playerrestrictions.disallowTransferringPlaybackReasons(), playerrestrictions.disallowRemoteControlReasons());
    }

    private void scheduleRetry(final PlayerState source, final StateOrigin stateOrigin)
    {
        mRetryRunnable = new Runnable() {

            final StatefulPlayer this$0;
            final PlayerState val$source;
            final StateOrigin val$stateOrigin;

            public void run()
            {
                updatePlayerState(source, stateOrigin, true);
            }

            
            {
                this$0 = StatefulPlayer.this;
                source = playerstate;
                stateOrigin = stateorigin;
                super();
            }
        };
        mHandler.postDelayed(mRetryRunnable, 200L);
    }

    private void updatePlayerState(PlayerState playerstate, StateOrigin stateorigin)
    {
        updatePlayerState(playerstate, stateorigin, false);
    }

    private void updatePlayerState(PlayerState playerstate, StateOrigin stateorigin, boolean flag)
    {
        if (playerstate == null)
        {
            return;
        }
        long l2 = gcf.a();
        mIsPaused.updateValue(playerstate.isPaused(), playerstate.timestamp(), false);
        mRepeatTrack.updateValue(playerstate.options().repeatingTrack(), playerstate.timestamp(), false);
        mRepeatContext.updateValue(playerstate.options().repeatingContext(), playerstate.timestamp(), false);
        mShuffleContext.updateValue(playerstate.options().shufflingContext(), playerstate.timestamp(), false);
        if (stateorigin == StateOrigin.REMOTE)
        {
            mPlayerPosition.setPlayerState(playerstate);
            mPlayerQueue.setPlayerState(playerstate, flag);
        }
        boolean flag1 = mPlayerQueue.isInSync();
        mHandler.removeCallbacks(mRetryRunnable);
        if (!flag1 && !flag)
        {
            scheduleRetry(playerstate, stateorigin);
            return;
        }
        flag = mPlayerPosition.isSeekPending();
        boolean flag2 = mIsPaused.getValue();
        float f;
        long l;
        long l1;
        if (flag1)
        {
            l = mPlayerPosition.currentPlaybackPosition(l2);
        } else
        {
            l = -1L;
        }
        if (flag1)
        {
            l1 = mPlayerPosition.getDuration();
        } else
        {
            l1 = -1L;
        }
        if (flag1 && !flag && !flag2)
        {
            f = mPlayerPosition.getPlaybackSpeed();
        } else
        {
            f = 0.0F;
        }
        stateorigin = new PlayerOptions(mShuffleContext.getValue(), mRepeatContext.getValue(), mRepeatTrack.getValue());
        mPlayerState = new PlayerState(l2, playerstate.entityUri(), playerstate.playOrigin(), mPlayerQueue.getTrack(), mPlayerQueue.getPlaybackId(), mPlayerQueue.getIndex(), f, l, l1, playerstate.isPlaying(), flag2, stateorigin, generateRestrictions(playerstate.restrictions()), playerstate.suppressions(), mPlayerQueue.getFuture(), mPlayerQueue.getReverse(), playerstate.contextMetadata(), playerstate.pageMetadata());
        notifyObservers();
    }

    private void updateValuePerformActionAndRendezvousOnPlayerState(final StatefulPlayerValue rendezvous, boolean flag, Runnable runnable)
    {
        rendezvous.updateValue(flag, System.currentTimeMillis(), true);
        runnable.run();
        rendezvous = rendezvous.rendezvous();
        mPlayer.fetchState(new com.spotify.mobile.android.cosmos.player.v2.Player.PlayerStateObserver() {

            final StatefulPlayer this$0;
            final StatefulPlayerValue.Rendezvous val$rendezvous;

            public void onPlayerStateReceived(PlayerState playerstate)
            {
                if (!rendezvous.tryComplete())
                {
                    return;
                } else
                {
                    updatePlayerState(playerstate, StateOrigin.REMOTE);
                    return;
                }
            }

            
            {
                this$0 = StatefulPlayer.this;
                rendezvous = rendezvous1;
                super();
            }
        });
        updatePlayerState(mPlayerState, StateOrigin.LOCAL);
    }

    public void fetchState(final com.spotify.mobile.android.cosmos.player.v2.Player.PlayerStateObserver callback)
    {
        mPlayer.fetchState(new com.spotify.mobile.android.cosmos.player.v2.Player.PlayerStateObserver() {

            final StatefulPlayer this$0;
            final com.spotify.mobile.android.cosmos.player.v2.Player.PlayerStateObserver val$callback;

            public void onPlayerStateReceived(PlayerState playerstate)
            {
                updatePlayerState(playerstate, StateOrigin.REMOTE);
                callback.onPlayerStateReceived(mPlayerState);
            }

            
            {
                this$0 = StatefulPlayer.this;
                callback = playerstateobserver;
                super();
            }
        });
    }

    public void fetchState(com.spotify.mobile.android.cosmos.player.v2.Player.PlayerStateObserver playerstateobserver, int i, int j)
    {
        throw new UnsupportedOperationException("fetchState with explicit caps not implemented in stateful player!");
    }

    public String getFeatureIdentifier()
    {
        return mPlayer.getFeatureIdentifier();
    }

    public PlayerState getLastPlayerState()
    {
        return mPlayerState;
    }

    public void getQueue(com.spotify.mobile.android.cosmos.player.v2.Player.GetQueueCallback getqueuecallback)
    {
        mPlayer.getQueue(getqueuecallback);
    }

    public String getViewUri()
    {
        return mPlayer.getViewUri();
    }

    final void notifyObservers()
    {
        com.spotify.mobile.android.cosmos.player.v2.Player.PlayerStateObserver aplayerstateobserver[];
        synchronized (mObservers)
        {
            aplayerstateobserver = (com.spotify.mobile.android.cosmos.player.v2.Player.PlayerStateObserver[])mObservers.toArray(new com.spotify.mobile.android.cosmos.player.v2.Player.PlayerStateObserver[mObservers.size()]);
        }
        int j = aplayerstateobserver.length;
        for (int i = 0; i < j; i++)
        {
            aplayerstateobserver[i].onPlayerStateReceived(mPlayerState);
        }

        break MISSING_BLOCK_LABEL_70;
        exception;
        list;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void pause()
    {
        updateValuePerformActionAndRendezvousOnPlayerState(mIsPaused, true, new Runnable() {

            final StatefulPlayer this$0;

            public void run()
            {
                mPlayer.pause();
            }

            
            {
                this$0 = StatefulPlayer.this;
                super();
            }
        });
    }

    public void play(PlayerContext playercontext, PlayOptions playoptions)
    {
        mPlayer.play(playercontext, playoptions);
    }

    public void play(PlayerContext playercontext, PlayOptions playoptions, com.spotify.mobile.android.cosmos.player.v2.Player.PlayCallback playcallback)
    {
        mPlayer.play(playercontext, playoptions, playcallback);
    }

    public void playWithViewUri(PlayerContext playercontext, PlayOptions playoptions, String s)
    {
        mPlayer.playWithViewUri(playercontext, playoptions, s);
    }

    public void playWithViewUri(PlayerContext playercontext, PlayOptions playoptions, String s, com.spotify.mobile.android.cosmos.player.v2.Player.PlayCallback playcallback)
    {
        mPlayer.playWithViewUri(playercontext, playoptions, s, playcallback);
    }

    public void preparePlay(PlayerContext playercontext, PlayOptions playoptions, com.spotify.mobile.android.cosmos.player.v2.Player.PreparePlayCallback prepareplaycallback)
    {
        mPlayer.preparePlay(playercontext, playoptions, prepareplaycallback);
    }

    public void preparePlay(PlayerContext playercontext, PlayOptions playoptions, String s, com.spotify.mobile.android.cosmos.player.v2.Player.PreparePlayCallback prepareplaycallback)
    {
        mPlayer.preparePlay(playercontext, playoptions, s, prepareplaycallback);
    }

    public void registerPlayerQueueObserver(com.spotify.mobile.android.cosmos.player.v2.Player.PlayerQueueObserver playerqueueobserver)
    {
        mPlayer.registerPlayerQueueObserver(playerqueueobserver);
    }

    public void registerPlayerStateObserver(com.spotify.mobile.android.cosmos.player.v2.Player.PlayerStateObserver playerstateobserver)
    {
        synchronized (mObservers)
        {
            if (!mObservers.contains(playerstateobserver))
            {
                mObservers.add(playerstateobserver);
                if (mObservers.size() == 1)
                {
                    mPlayer.registerPlayerStateObserver(mPlayerStateObserver);
                }
            }
        }
        return;
        playerstateobserver;
        list;
        JVM INSTR monitorexit ;
        throw playerstateobserver;
    }

    public void registerPlayerStateObserver(com.spotify.mobile.android.cosmos.player.v2.Player.PlayerStateObserver playerstateobserver, int i, int j)
    {
        registerPlayerStateObserver(playerstateobserver);
    }

    public void restore(String s, com.spotify.mobile.android.cosmos.player.v2.Player.RestoreCallback restorecallback)
    {
        mPlayer.restore(s, null);
    }

    public void resume()
    {
        updateValuePerformActionAndRendezvousOnPlayerState(mIsPaused, false, new Runnable() {

            final StatefulPlayer this$0;

            public void run()
            {
                mPlayer.resume();
            }

            
            {
                this$0 = StatefulPlayer.this;
                super();
            }
        });
    }

    public void save(com.spotify.mobile.android.cosmos.player.v2.Player.SaveCallback savecallback)
    {
        mPlayer.save(savecallback);
    }

    public void seekTo(long l)
    {
        mPlayerPosition.seekTo(l);
        updatePlayerState(mPlayerState, StateOrigin.LOCAL);
    }

    void setClock(gcf gcf1)
    {
        mClock = gcf1;
    }

    void setHandler(Handler handler)
    {
        mHandler = handler;
    }

    void setPlayerPosition(StatefulPlayerPosition statefulplayerposition)
    {
        mPlayerPosition = statefulplayerposition;
    }

    void setPlayerQueue(StatefulPlayerQueue statefulplayerqueue)
    {
        mPlayerQueue = statefulplayerqueue;
    }

    public void setQueue(PlayerQueue playerqueue, com.spotify.mobile.android.cosmos.player.v2.Player.SetQueueCallback setqueuecallback)
    {
        mPlayer.setQueue(playerqueue, setqueuecallback);
    }

    public void setRepeatingContext(final boolean enabled)
    {
        updateValuePerformActionAndRendezvousOnPlayerState(mRepeatContext, enabled, new Runnable() {

            final StatefulPlayer this$0;
            final boolean val$enabled;

            public void run()
            {
                mPlayer.setRepeatingContext(enabled);
            }

            
            {
                this$0 = StatefulPlayer.this;
                enabled = flag;
                super();
            }
        });
    }

    public void setRepeatingTrack(final boolean enabled)
    {
        updateValuePerformActionAndRendezvousOnPlayerState(mRepeatTrack, enabled, new Runnable() {

            final StatefulPlayer this$0;
            final boolean val$enabled;

            public void run()
            {
                mPlayer.setRepeatingTrack(enabled);
            }

            
            {
                this$0 = StatefulPlayer.this;
                enabled = flag;
                super();
            }
        });
    }

    public void setShufflingContext(final boolean enabled)
    {
        updateValuePerformActionAndRendezvousOnPlayerState(mShuffleContext, enabled, new Runnable() {

            final StatefulPlayer this$0;
            final boolean val$enabled;

            public void run()
            {
                mPlayer.setShufflingContext(enabled);
            }

            
            {
                this$0 = StatefulPlayer.this;
                enabled = flag;
                super();
            }
        });
    }

    public void skipToFutureTrack(PlayerTrack playertrack)
    {
        throw new UnsupportedOperationException("not implemented in StatefulPlayer!");
    }

    public void skipToFutureTrack(PlayerTrack playertrack, boolean flag)
    {
        throw new UnsupportedOperationException("not implemented in StatefulPlayer!");
    }

    public void skipToNextTrack()
    {
        mPlayerQueue.skipToNextTrack();
        mPlayer.skipToNextTrack();
        updatePlayerState(mPlayerState, StateOrigin.LOCAL);
    }

    public void skipToNextTrack(boolean flag)
    {
        throw new UnsupportedOperationException("not implemented in StatefulPlayer!");
    }

    public void skipToPastTrack(PlayerTrack playertrack)
    {
        throw new UnsupportedOperationException("not implemented in StatefulPlayer!");
    }

    public void skipToPreviousTrack()
    {
        mPlayerQueue.skipToPreviousTrack();
        mPlayer.skipToPreviousTrack();
        updatePlayerState(mPlayerState, StateOrigin.LOCAL);
    }

    public void skipToPreviousTrack(boolean flag)
    {
        throw new UnsupportedOperationException("not implemented in StatefulPlayer!");
    }

    public void unregisterPlayerQueueObserver(com.spotify.mobile.android.cosmos.player.v2.Player.PlayerQueueObserver playerqueueobserver)
    {
        mPlayer.unregisterPlayerQueueObserver(playerqueueobserver);
    }

    public void unregisterPlayerStateObserver(com.spotify.mobile.android.cosmos.player.v2.Player.PlayerStateObserver playerstateobserver)
    {
        synchronized (mObservers)
        {
            if (mObservers.remove(playerstateobserver) && mObservers.isEmpty())
            {
                mPlayer.unregisterPlayerStateObserver(mPlayerStateObserver);
            }
        }
        return;
        playerstateobserver;
        list;
        JVM INSTR monitorexit ;
        throw playerstateobserver;
    }

    public void updateWithContext(PlayerContext playercontext)
    {
        mPlayer.updateWithContext(playercontext);
    }

    public void updateWithContext(PlayerContext playercontext, com.spotify.mobile.android.cosmos.player.v2.Player.PlayCallback playcallback)
    {
        mPlayer.updateWithContext(playercontext, playcallback);
    }




}
