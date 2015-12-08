// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.player;

import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.event.nrdp.media.Error;
import com.netflix.mediaclient.event.nrdp.media.NccpError;
import com.netflix.mediaclient.javabridge.ui.IMedia;
import com.netflix.mediaclient.javabridge.ui.Nrdp;
import com.netflix.mediaclient.service.NrdController;
import com.netflix.mediaclient.service.player.subtitles.SubtitleScreen;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.netflix.mediaclient.service.player:
//            PlayerAgent

class PlayerListenerManager
{
    public static interface PlayerListenerHandler
    {

        public transient abstract void handle(com.netflix.mediaclient.servicemgr.IPlayer.PlayerListener playerlistener, Object aobj[]);
    }

    private class PlayerListenerOnAudioChangeHandler
        implements PlayerListenerHandler
    {

        final PlayerListenerManager this$0;

        public transient void handle(com.netflix.mediaclient.servicemgr.IPlayer.PlayerListener playerlistener, Object aobj[])
        {
            while (!playerlistener.isListening() || aobj == null || aobj.length < 1) 
            {
                return;
            }
            playerlistener.onAudioChange(((Integer)aobj[0]).intValue());
        }

        private PlayerListenerOnAudioChangeHandler()
        {
            this$0 = PlayerListenerManager.this;
            super();
        }

    }

    private class PlayerListenerOnBandwidthChangeHandler
        implements PlayerListenerHandler
    {

        final PlayerListenerManager this$0;

        public transient void handle(com.netflix.mediaclient.servicemgr.IPlayer.PlayerListener playerlistener, Object aobj[])
        {
            while (!playerlistener.isListening() || aobj == null || aobj.length < 1) 
            {
                return;
            }
            playerlistener.onBandwidthChange(((Integer)aobj[0]).intValue());
        }

        private PlayerListenerOnBandwidthChangeHandler()
        {
            this$0 = PlayerListenerManager.this;
            super();
        }

    }

    private class PlayerListenerOnBufferingUpdateHandler
        implements PlayerListenerHandler
    {

        final PlayerListenerManager this$0;

        public transient void handle(com.netflix.mediaclient.servicemgr.IPlayer.PlayerListener playerlistener, Object aobj[])
        {
            while (!playerlistener.isListening() || aobj == null || aobj.length < 1) 
            {
                return;
            }
            playerlistener.onBufferingUpdate(((Integer)aobj[0]).intValue());
        }

        private PlayerListenerOnBufferingUpdateHandler()
        {
            this$0 = PlayerListenerManager.this;
            super();
        }

    }

    private class PlayerListenerOnCompletionHandler
        implements PlayerListenerHandler
    {

        final PlayerListenerManager this$0;

        public transient void handle(com.netflix.mediaclient.servicemgr.IPlayer.PlayerListener playerlistener, Object aobj[])
        {
            if (playerlistener.isListening())
            {
                playerlistener.onCompletion();
            }
        }

        private PlayerListenerOnCompletionHandler()
        {
            this$0 = PlayerListenerManager.this;
            super();
        }

    }

    private class PlayerListenerOnMediaErrorHandler
        implements PlayerListenerHandler
    {

        final PlayerListenerManager this$0;

        public transient void handle(com.netflix.mediaclient.servicemgr.IPlayer.PlayerListener playerlistener, Object aobj[])
        {
            while (!playerlistener.isListening() || aobj == null || aobj.length < 1 || !(aobj[0] instanceof Error)) 
            {
                return;
            }
            playerlistener.onMediaError((Error)aobj[0]);
        }

        private PlayerListenerOnMediaErrorHandler()
        {
            this$0 = PlayerListenerManager.this;
            super();
        }

    }

    private class PlayerListenerOnNccpErrorHandler
        implements PlayerListenerHandler
    {

        final PlayerListenerManager this$0;

        public transient void handle(com.netflix.mediaclient.servicemgr.IPlayer.PlayerListener playerlistener, Object aobj[])
        {
            while (!playerlistener.isListening() || aobj == null || aobj.length < 1 || !(aobj[0] instanceof NccpError)) 
            {
                return;
            }
            playerlistener.onNccpError((NccpError)aobj[0]);
        }

        private PlayerListenerOnNccpErrorHandler()
        {
            this$0 = PlayerListenerManager.this;
            super();
        }

    }

    private class PlayerListenerOnNrdFatalErrorHandler
        implements PlayerListenerHandler
    {

        final PlayerListenerManager this$0;

        public transient void handle(com.netflix.mediaclient.servicemgr.IPlayer.PlayerListener playerlistener, Object aobj[])
        {
            if (playerlistener.isListening())
            {
                playerlistener.onNrdFatalError();
            }
        }

        private PlayerListenerOnNrdFatalErrorHandler()
        {
            this$0 = PlayerListenerManager.this;
            super();
        }

    }

    private class PlayerListenerOnPlayingHandler
        implements PlayerListenerHandler
    {

        final PlayerListenerManager this$0;

        public transient void handle(com.netflix.mediaclient.servicemgr.IPlayer.PlayerListener playerlistener, Object aobj[])
        {
            if (playerlistener.isListening())
            {
                playerlistener.onPlaying();
            }
        }

        private PlayerListenerOnPlayingHandler()
        {
            this$0 = PlayerListenerManager.this;
            super();
        }

    }

    private class PlayerListenerOnSeekCompleteHandler
        implements PlayerListenerHandler
    {

        final PlayerListenerManager this$0;

        public transient void handle(com.netflix.mediaclient.servicemgr.IPlayer.PlayerListener playerlistener, Object aobj[])
        {
            if (playerlistener.isListening())
            {
                playerlistener.onSeekComplete();
            }
        }

        private PlayerListenerOnSeekCompleteHandler()
        {
            this$0 = PlayerListenerManager.this;
            super();
        }

    }

    private class PlayerListenerOnStalledHandler
        implements PlayerListenerHandler
    {

        final PlayerListenerManager this$0;

        public transient void handle(com.netflix.mediaclient.servicemgr.IPlayer.PlayerListener playerlistener, Object aobj[])
        {
            if (playerlistener.isListening())
            {
                playerlistener.onStalled();
            }
        }

        private PlayerListenerOnStalledHandler()
        {
            this$0 = PlayerListenerManager.this;
            super();
        }

    }

    private class PlayerListenerOnStartedHandler
        implements PlayerListenerHandler
    {

        final PlayerListenerManager this$0;

        public transient void handle(com.netflix.mediaclient.servicemgr.IPlayer.PlayerListener playerlistener, Object aobj[])
        {
            if (playerlistener.isListening())
            {
                playerlistener.onStarted();
            }
        }

        private PlayerListenerOnStartedHandler()
        {
            this$0 = PlayerListenerManager.this;
            super();
        }

    }

    private class PlayerListenerOnSubtitleChangeHandler
        implements PlayerListenerHandler
    {

        final PlayerListenerManager this$0;

        public transient void handle(com.netflix.mediaclient.servicemgr.IPlayer.PlayerListener playerlistener, Object aobj[])
        {
            while (!playerlistener.isListening() || aobj == null || aobj.length < 1 || !(aobj[0] instanceof SubtitleScreen)) 
            {
                return;
            }
            playerlistener.onSubtitleChange((SubtitleScreen)aobj[0]);
        }

        private PlayerListenerOnSubtitleChangeHandler()
        {
            this$0 = PlayerListenerManager.this;
            super();
        }

    }

    private class PlayerListenerOnSubtitleFailedHandler
        implements PlayerListenerHandler
    {

        final PlayerListenerManager this$0;

        public transient void handle(com.netflix.mediaclient.servicemgr.IPlayer.PlayerListener playerlistener, Object aobj[])
        {
            if (playerlistener.isListening())
            {
                playerlistener.onSubtitleFailed();
            }
        }

        private PlayerListenerOnSubtitleFailedHandler()
        {
            this$0 = PlayerListenerManager.this;
            super();
        }

    }

    private class PlayerListenerOnSubtitleRemoveHandler
        implements PlayerListenerHandler
    {

        final PlayerListenerManager this$0;

        public transient void handle(com.netflix.mediaclient.servicemgr.IPlayer.PlayerListener playerlistener, Object aobj[])
        {
            if (playerlistener.isListening())
            {
                playerlistener.onSubtitleRemove();
            }
        }

        private PlayerListenerOnSubtitleRemoveHandler()
        {
            this$0 = PlayerListenerManager.this;
            super();
        }

    }

    private class PlayerListenerOnSubtitleShowHandler
        implements PlayerListenerHandler
    {

        final PlayerListenerManager this$0;

        public transient void handle(com.netflix.mediaclient.servicemgr.IPlayer.PlayerListener playerlistener, Object aobj[])
        {
            while (!playerlistener.isListening() || aobj == null || aobj.length < 1 || !(aobj[0] instanceof String)) 
            {
                return;
            }
            playerlistener.onSubtitleShow((String)aobj[0]);
        }

        private PlayerListenerOnSubtitleShowHandler()
        {
            this$0 = PlayerListenerManager.this;
            super();
        }

    }

    private class PlayerListenerOnUpdatePtsHandler
        implements PlayerListenerHandler
    {

        final PlayerListenerManager this$0;

        public transient void handle(com.netflix.mediaclient.servicemgr.IPlayer.PlayerListener playerlistener, Object aobj[])
        {
            while (!playerlistener.isListening() || aobj == null || aobj.length < 1) 
            {
                return;
            }
            playerlistener.onUpdatePts(((Integer)aobj[0]).intValue());
        }

        private PlayerListenerOnUpdatePtsHandler()
        {
            this$0 = PlayerListenerManager.this;
            super();
        }

    }

    private class PlayerListenerPlaybackClosedHandler
        implements PlayerListenerHandler
    {

        final PlayerListenerManager this$0;

        public transient void handle(com.netflix.mediaclient.servicemgr.IPlayer.PlayerListener playerlistener, Object aobj[])
        {
            playerlistener.playbackClosed();
        }

        private PlayerListenerPlaybackClosedHandler()
        {
            this$0 = PlayerListenerManager.this;
            super();
        }

    }

    private class PlayerListenerPrepareHandler
        implements PlayerListenerHandler
    {

        final PlayerListenerManager this$0;

        public transient void handle(com.netflix.mediaclient.servicemgr.IPlayer.PlayerListener playerlistener, Object aobj[])
        {
            if (playerlistener.isListening())
            {
                playerlistener.onPrepared();
                aobj = mPlayer.getNrdController().getNrdp().getMedia();
                playerlistener.onVideoSizeChanged(((IMedia) (aobj)).getVideoWidth(), ((IMedia) (aobj)).getVideoHeight());
            }
        }

        private PlayerListenerPrepareHandler()
        {
            this$0 = PlayerListenerManager.this;
            super();
        }

    }

    private class PlayerListenerRestartPlaybackHandler
        implements PlayerListenerHandler
    {

        final PlayerListenerManager this$0;

        public transient void handle(com.netflix.mediaclient.servicemgr.IPlayer.PlayerListener playerlistener, Object aobj[])
        {
            while (!playerlistener.isListening() || aobj == null || aobj.length < 1 || !(aobj[0] instanceof NccpError)) 
            {
                return;
            }
            playerlistener.restartPlayback((NccpError)aobj[0]);
        }

        private PlayerListenerRestartPlaybackHandler()
        {
            this$0 = PlayerListenerManager.this;
            super();
        }

    }


    private static final String TAG = com/netflix/mediaclient/service/player/PlayerAgent.getSimpleName();
    private PlayerAgent mPlayer;
    private PlayerListenerOnAudioChangeHandler mPlayerListenerOnAudioChangeHandler;
    private PlayerListenerOnBandwidthChangeHandler mPlayerListenerOnBandwidthChangeHandler;
    private PlayerListenerOnBufferingUpdateHandler mPlayerListenerOnBufferingUpdateHandler;
    private PlayerListenerOnCompletionHandler mPlayerListenerOnCompletionHandler;
    private PlayerListenerOnMediaErrorHandler mPlayerListenerOnMediaErrorHandler;
    private PlayerListenerOnNccpErrorHandler mPlayerListenerOnNccpErrorHandler;
    private PlayerListenerOnNrdFatalErrorHandler mPlayerListenerOnNrdFatalErrorHandler;
    private PlayerListenerOnPlayingHandler mPlayerListenerOnPlayingHandler;
    private PlayerListenerOnSeekCompleteHandler mPlayerListenerOnSeekCompleteHandler;
    private PlayerListenerOnStalledHandler mPlayerListenerOnStalledHandler;
    private PlayerListenerOnStartedHandler mPlayerListenerOnStartedHandler;
    private PlayerListenerOnSubtitleChangeHandler mPlayerListenerOnSubtitleChangeHandler;
    private PlayerListenerOnSubtitleFailedHandler mPlayerListenerOnSubtitleFailedHandler;
    private PlayerListenerOnSubtitleRemoveHandler mPlayerListenerOnSubtitleRemoveHandler;
    private PlayerListenerOnSubtitleShowHandler mPlayerListenerOnSubtitleShowHandler;
    private PlayerListenerOnUpdatePtsHandler mPlayerListenerOnUpdatePtsHandler;
    private PlayerListenerPlaybackClosedHandler mPlayerListenerPlaybackClosedHandler;
    private PlayerListenerPrepareHandler mPlayerListenerPrepareHandler;
    private PlayerListenerRestartPlaybackHandler mPlayerListenerRestartPlaybackHandler;
    private final List mPlayerListeners = new ArrayList();

    PlayerListenerManager(PlayerAgent playeragent)
    {
        mPlayerListenerPrepareHandler = new PlayerListenerPrepareHandler();
        mPlayerListenerOnUpdatePtsHandler = new PlayerListenerOnUpdatePtsHandler();
        mPlayerListenerOnAudioChangeHandler = new PlayerListenerOnAudioChangeHandler();
        mPlayerListenerOnBandwidthChangeHandler = new PlayerListenerOnBandwidthChangeHandler();
        mPlayerListenerOnBufferingUpdateHandler = new PlayerListenerOnBufferingUpdateHandler();
        mPlayerListenerOnCompletionHandler = new PlayerListenerOnCompletionHandler();
        mPlayerListenerOnMediaErrorHandler = new PlayerListenerOnMediaErrorHandler();
        mPlayerListenerOnNccpErrorHandler = new PlayerListenerOnNccpErrorHandler();
        mPlayerListenerOnNrdFatalErrorHandler = new PlayerListenerOnNrdFatalErrorHandler();
        mPlayerListenerOnPlayingHandler = new PlayerListenerOnPlayingHandler();
        mPlayerListenerOnSeekCompleteHandler = new PlayerListenerOnSeekCompleteHandler();
        mPlayerListenerOnStalledHandler = new PlayerListenerOnStalledHandler();
        mPlayerListenerOnStartedHandler = new PlayerListenerOnStartedHandler();
        mPlayerListenerOnSubtitleChangeHandler = new PlayerListenerOnSubtitleChangeHandler();
        mPlayerListenerOnSubtitleFailedHandler = new PlayerListenerOnSubtitleFailedHandler();
        mPlayerListenerOnSubtitleRemoveHandler = new PlayerListenerOnSubtitleRemoveHandler();
        mPlayerListenerOnSubtitleShowHandler = new PlayerListenerOnSubtitleShowHandler();
        mPlayerListenerPlaybackClosedHandler = new PlayerListenerPlaybackClosedHandler();
        mPlayerListenerRestartPlaybackHandler = new PlayerListenerRestartPlaybackHandler();
        mPlayer = playeragent;
    }

    void addPlayerListener(com.netflix.mediaclient.servicemgr.IPlayer.PlayerListener playerlistener)
    {
        this;
        JVM INSTR monitorenter ;
        if (!mPlayerListeners.contains(playerlistener))
        {
            mPlayerListeners.add(playerlistener);
        }
        if (Log.isLoggable(TAG, 6) && mPlayerListeners.size() > 2)
        {
            Log.e(TAG, (new StringBuilder()).append("Listener count should not be generally greater than 2, count:").append(mPlayerListeners.size()).toString());
        }
        this;
        JVM INSTR monitorexit ;
        return;
        playerlistener;
        throw playerlistener;
    }

    List getListeners()
    {
        this;
        JVM INSTR monitorenter ;
        List list = mPlayerListeners;
        this;
        JVM INSTR monitorexit ;
        return list;
        Exception exception;
        exception;
        throw exception;
    }

    PlayerListenerOnAudioChangeHandler getPlayerListenerOnAudioChangeHandler()
    {
        return mPlayerListenerOnAudioChangeHandler;
    }

    PlayerListenerOnBandwidthChangeHandler getPlayerListenerOnBandwidthChangeHandler()
    {
        return mPlayerListenerOnBandwidthChangeHandler;
    }

    PlayerListenerOnBufferingUpdateHandler getPlayerListenerOnBufferingUpdateHandler()
    {
        return mPlayerListenerOnBufferingUpdateHandler;
    }

    PlayerListenerOnCompletionHandler getPlayerListenerOnCompletionHandler()
    {
        return mPlayerListenerOnCompletionHandler;
    }

    PlayerListenerOnMediaErrorHandler getPlayerListenerOnMediaErrorHandler()
    {
        return mPlayerListenerOnMediaErrorHandler;
    }

    PlayerListenerOnNccpErrorHandler getPlayerListenerOnNccpErrorHandler()
    {
        return mPlayerListenerOnNccpErrorHandler;
    }

    PlayerListenerOnNrdFatalErrorHandler getPlayerListenerOnNrdFatalErrorHandler()
    {
        return mPlayerListenerOnNrdFatalErrorHandler;
    }

    PlayerListenerOnPlayingHandler getPlayerListenerOnPlayingHandler()
    {
        return mPlayerListenerOnPlayingHandler;
    }

    PlayerListenerOnSeekCompleteHandler getPlayerListenerOnSeekCompleteHandler()
    {
        return mPlayerListenerOnSeekCompleteHandler;
    }

    PlayerListenerOnStalledHandler getPlayerListenerOnStalledHandler()
    {
        return mPlayerListenerOnStalledHandler;
    }

    PlayerListenerOnStartedHandler getPlayerListenerOnStartedHandler()
    {
        return mPlayerListenerOnStartedHandler;
    }

    PlayerListenerOnSubtitleChangeHandler getPlayerListenerOnSubtitleChangeHandler()
    {
        return mPlayerListenerOnSubtitleChangeHandler;
    }

    PlayerListenerOnSubtitleFailedHandler getPlayerListenerOnSubtitleFailedHandler()
    {
        return mPlayerListenerOnSubtitleFailedHandler;
    }

    PlayerListenerOnSubtitleRemoveHandler getPlayerListenerOnSubtitleRemoveHandler()
    {
        return mPlayerListenerOnSubtitleRemoveHandler;
    }

    PlayerListenerOnSubtitleShowHandler getPlayerListenerOnSubtitleShowHandler()
    {
        return mPlayerListenerOnSubtitleShowHandler;
    }

    PlayerListenerOnUpdatePtsHandler getPlayerListenerOnUpdatePtsHandler()
    {
        return mPlayerListenerOnUpdatePtsHandler;
    }

    PlayerListenerPlaybackClosedHandler getPlayerListenerPlaybackClosedHandler()
    {
        return mPlayerListenerPlaybackClosedHandler;
    }

    PlayerListenerPrepareHandler getPlayerListenerPrepareHandler()
    {
        return mPlayerListenerPrepareHandler;
    }

    PlayerListenerRestartPlaybackHandler getPlayerListenerRestartPlaybackHandler()
    {
        return mPlayerListenerRestartPlaybackHandler;
    }

    void removePlayerListener(com.netflix.mediaclient.servicemgr.IPlayer.PlayerListener playerlistener)
    {
        this;
        JVM INSTR monitorenter ;
        mPlayerListeners.remove(playerlistener);
        this;
        JVM INSTR monitorexit ;
        return;
        playerlistener;
        throw playerlistener;
    }

    void setPlayerListenerOnAudioChangeHandler(PlayerListenerOnAudioChangeHandler playerlisteneronaudiochangehandler)
    {
        mPlayerListenerOnAudioChangeHandler = playerlisteneronaudiochangehandler;
    }

    void setPlayerListenerOnBandwidthChangeHandler(PlayerListenerOnBandwidthChangeHandler playerlisteneronbandwidthchangehandler)
    {
        mPlayerListenerOnBandwidthChangeHandler = playerlisteneronbandwidthchangehandler;
    }

    void setPlayerListenerOnBufferingUpdateHandler(PlayerListenerOnBufferingUpdateHandler playerlisteneronbufferingupdatehandler)
    {
        mPlayerListenerOnBufferingUpdateHandler = playerlisteneronbufferingupdatehandler;
    }

    void setPlayerListenerOnCompletionHandler(PlayerListenerOnCompletionHandler playerlisteneroncompletionhandler)
    {
        mPlayerListenerOnCompletionHandler = playerlisteneroncompletionhandler;
    }

    void setPlayerListenerOnMediaErrorHandler(PlayerListenerOnMediaErrorHandler playerlisteneronmediaerrorhandler)
    {
        mPlayerListenerOnMediaErrorHandler = playerlisteneronmediaerrorhandler;
    }

    void setPlayerListenerOnNccpErrorHandler(PlayerListenerOnNccpErrorHandler playerlisteneronnccperrorhandler)
    {
        mPlayerListenerOnNccpErrorHandler = playerlisteneronnccperrorhandler;
    }

    void setPlayerListenerOnNrdFatalErrorHandler(PlayerListenerOnNrdFatalErrorHandler playerlisteneronnrdfatalerrorhandler)
    {
        mPlayerListenerOnNrdFatalErrorHandler = playerlisteneronnrdfatalerrorhandler;
    }

    void setPlayerListenerOnPlayingHandler(PlayerListenerOnPlayingHandler playerlisteneronplayinghandler)
    {
        mPlayerListenerOnPlayingHandler = playerlisteneronplayinghandler;
    }

    void setPlayerListenerOnSeekCompleteHandler(PlayerListenerOnSeekCompleteHandler playerlisteneronseekcompletehandler)
    {
        mPlayerListenerOnSeekCompleteHandler = playerlisteneronseekcompletehandler;
    }

    void setPlayerListenerOnStalledHandler(PlayerListenerOnStalledHandler playerlisteneronstalledhandler)
    {
        mPlayerListenerOnStalledHandler = playerlisteneronstalledhandler;
    }

    void setPlayerListenerOnStartedHandler(PlayerListenerOnStartedHandler playerlisteneronstartedhandler)
    {
        mPlayerListenerOnStartedHandler = playerlisteneronstartedhandler;
    }

    void setPlayerListenerOnSubtitleChangeHandler(PlayerListenerOnSubtitleChangeHandler playerlisteneronsubtitlechangehandler)
    {
        mPlayerListenerOnSubtitleChangeHandler = playerlisteneronsubtitlechangehandler;
    }

    void setPlayerListenerOnSubtitleFailedHandler(PlayerListenerOnSubtitleFailedHandler playerlisteneronsubtitlefailedhandler)
    {
        mPlayerListenerOnSubtitleFailedHandler = playerlisteneronsubtitlefailedhandler;
    }

    void setPlayerListenerOnSubtitleRemoveHandler(PlayerListenerOnSubtitleRemoveHandler playerlisteneronsubtitleremovehandler)
    {
        mPlayerListenerOnSubtitleRemoveHandler = playerlisteneronsubtitleremovehandler;
    }

    void setPlayerListenerOnSubtitleShowHandler(PlayerListenerOnSubtitleShowHandler playerlisteneronsubtitleshowhandler)
    {
        mPlayerListenerOnSubtitleShowHandler = playerlisteneronsubtitleshowhandler;
    }

    void setPlayerListenerOnUpdatePtsHandler(PlayerListenerOnUpdatePtsHandler playerlisteneronupdateptshandler)
    {
        mPlayerListenerOnUpdatePtsHandler = playerlisteneronupdateptshandler;
    }

    void setPlayerListenerPrepareHandler(PlayerListenerPrepareHandler playerlistenerpreparehandler)
    {
        mPlayerListenerPrepareHandler = playerlistenerpreparehandler;
    }


}
