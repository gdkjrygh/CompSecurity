// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback;

import android.app.Service;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import com.soundcloud.android.SoundCloudApplication;
import com.soundcloud.android.accounts.AccountOperations;
import com.soundcloud.android.ads.AdsOperations;
import com.soundcloud.android.events.EventQueue;
import com.soundcloud.android.events.PlaybackProgressEvent;
import com.soundcloud.android.events.PlayerLifeCycleEvent;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.playback.notification.PlaybackNotificationController;
import com.soundcloud.java.optional.Optional;
import com.soundcloud.rx.eventbus.EventBus;
import dagger.Lazy;
import dagger.b;
import java.lang.ref.WeakReference;

// Referenced classes of package com.soundcloud.android.playback:
//            PlaybackProgress, PlaybackItem, StreamPlayer, IAudioManager, 
//            PlaybackSessionAnalyticsController, PlaybackReceiver

public class PlaybackService extends Service
    implements IAudioManager.MusicFocusable, Player.PlayerListener
{
    public static interface Action
    {

        public static final String PAUSE = "com.soundcloud.android.playback.pause";
        public static final String PLAY = "com.soundcloud.android.playback.play";
        public static final String PLAY_CURRENT = "com.soundcloud.android.playback.playcurrent";
        public static final String RESET_ALL = "com.soundcloud.android.playback.reset";
        public static final String RESUME = "com.soundcloud.android.playback.playcurrent";
        public static final String SEEK = "com.soundcloud.android.playback.seek";
        public static final String STOP = "com.soundcloud.android.playback.stop";
        public static final String TOGGLE_PLAYBACK = "com.soundcloud.android.playback.toggleplayback";
    }

    public static interface ActionExtras
    {

        public static final String PLAYBACK_ITEM = "playback_item";
        public static final String POSITION = "seek_position";
    }

    public static interface Broadcasts
    {

        public static final String META_CHANGED = "com.soundcloud.android.metachanged";
        public static final String PLAYSTATE_CHANGED = "com.soundcloud.android.playstatechanged";
    }

    private static final class DelayedStopHandler extends Handler
    {

        private final WeakReference serviceRef;

        public final void handleMessage(Message message)
        {
            message = (PlaybackService)serviceRef.get();
            if (message != null && !((PlaybackService) (message)).streamPlayer.isPlaying() && ((PlaybackService) (message)).focusLossState == FocusLossState.NONE)
            {
                message.stopSelf();
            }
        }

        private DelayedStopHandler(PlaybackService playbackservice)
        {
            serviceRef = new WeakReference(playbackservice);
        }

        DelayedStopHandler(PlaybackService playbackservice, _cls1 _pcls1)
        {
            this(playbackservice);
        }
    }

    private static final class FadeHandler extends Handler
    {

        private static final int DUCK = 3;
        private static final float DUCK_VOLUME = 0.1F;
        private static final float FADE_CHANGE = 0.02F;
        private static final int FADE_IN = 1;
        private static final int FADE_OUT = 2;
        private float currentVolume;
        private final WeakReference serviceRef;

        public final void handleMessage(Message message)
        {
            PlaybackService playbackservice = (PlaybackService)serviceRef.get();
            if (playbackservice == null)
            {
                return;
            }
            switch (message.what)
            {
            default:
                return;

            case 1: // '\001'
                removeMessages(2);
                if (!playbackservice.streamPlayer.isPlaying())
                {
                    currentVolume = 0.0F;
                    playbackservice.streamPlayer.setVolume(0.0F);
                    playbackservice.play();
                    sendEmptyMessageDelayed(1, 10L);
                    return;
                }
                currentVolume = currentVolume + 0.02F;
                (new StringBuilder("Fading volume in at : ")).append(currentVolume);
                if (currentVolume < 1.0F)
                {
                    sendEmptyMessageDelayed(1, 10L);
                } else
                {
                    currentVolume = 1.0F;
                }
                playbackservice.streamPlayer.setVolume(currentVolume);
                return;

            case 2: // '\002'
                removeMessages(1);
                if (playbackservice.streamPlayer.isPlaying())
                {
                    currentVolume = currentVolume - 0.02F;
                    (new StringBuilder("Fading out at ")).append(currentVolume);
                    if (currentVolume > 0.0F)
                    {
                        sendEmptyMessageDelayed(2, 10L);
                    } else
                    {
                        playbackservice.pause();
                        currentVolume = 0.0F;
                    }
                    playbackservice.streamPlayer.setVolume(currentVolume);
                    return;
                } else
                {
                    playbackservice.streamPlayer.setVolume(0.0F);
                    return;
                }

            case 3: // '\003'
                removeMessages(1);
                removeMessages(2);
                playbackservice.streamPlayer.setVolume(0.1F);
                return;
            }
        }

        private FadeHandler(PlaybackService playbackservice)
        {
            serviceRef = new WeakReference(playbackservice);
        }

        FadeHandler(PlaybackService playbackservice, _cls1 _pcls1)
        {
            this(playbackservice);
        }
    }

    private static final class FocusLossState extends Enum
    {

        private static final FocusLossState $VALUES[];
        public static final FocusLossState LOST;
        public static final FocusLossState NONE;
        public static final FocusLossState TRANSIENT;

        public static FocusLossState valueOf(String s)
        {
            return (FocusLossState)Enum.valueOf(com/soundcloud/android/playback/PlaybackService$FocusLossState, s);
        }

        public static FocusLossState[] values()
        {
            return (FocusLossState[])$VALUES.clone();
        }

        static 
        {
            NONE = new FocusLossState("NONE", 0);
            TRANSIENT = new FocusLossState("TRANSIENT", 1);
            LOST = new FocusLossState("LOST", 2);
            $VALUES = (new FocusLossState[] {
                NONE, TRANSIENT, LOST
            });
        }

        private FocusLossState(String s, int i)
        {
            super(s, i);
        }
    }


    private static final int IDLE_DELAY = 0x2bf20;
    public static final String TAG = "PlaybackService";
    static PlaybackService instance;
    AccountOperations accountOperations;
    AdsOperations adsOperations;
    PlaybackSessionAnalyticsController analyticsController;
    private IAudioManager audioManager;
    private Optional currentPlaybackItem;
    private final Handler delayedStopHandler;
    EventBus eventBus;
    private final Handler fadeHandler;
    private FocusLossState focusLossState;
    PlaybackNotificationController playbackNotificationController;
    private PlaybackReceiver playbackReceiver;
    PlaybackReceiver.Factory playbackReceiverFactory;
    Lazy remoteAudioManagerProvider;
    StreamPlayer streamPlayer;

    public PlaybackService()
    {
        fadeHandler = new FadeHandler(this, null);
        delayedStopHandler = new DelayedStopHandler(this, null);
        currentPlaybackItem = Optional.absent();
        focusLossState = FocusLossState.NONE;
        SoundCloudApplication.getObjectGraph().a(this);
    }

    PlaybackService(EventBus eventbus, AccountOperations accountoperations, StreamPlayer streamplayer, PlaybackReceiver.Factory factory, Lazy lazy, PlaybackNotificationController playbacknotificationcontroller, PlaybackSessionAnalyticsController playbacksessionanalyticscontroller, 
            AdsOperations adsoperations)
    {
        fadeHandler = new FadeHandler(this, null);
        delayedStopHandler = new DelayedStopHandler(this, null);
        currentPlaybackItem = Optional.absent();
        focusLossState = FocusLossState.NONE;
        eventBus = eventbus;
        accountOperations = accountoperations;
        streamPlayer = streamplayer;
        playbackReceiverFactory = factory;
        remoteAudioManagerProvider = lazy;
        playbackNotificationController = playbacknotificationcontroller;
        analyticsController = playbacksessionanalyticscontroller;
        adsOperations = adsoperations;
    }

    private static Player.StateTransition correctUnknownDuration(Player.StateTransition statetransition, PlaybackItem playbackitem)
    {
        PlaybackProgress playbackprogress = statetransition.getProgress();
        if (!playbackprogress.isDurationValid())
        {
            playbackprogress.setDuration(playbackitem.getDuration());
        }
        return statetransition;
    }

    private void onIdleState()
    {
        (new StringBuilder("On Idle State (focusLossState=")).append(focusLossState).append(")");
        scheduleServiceShutdownCheck();
        fadeHandler.removeMessages(2);
        fadeHandler.removeMessages(1);
    }

    private void resetVolume()
    {
        fadeHandler.removeCallbacksAndMessages(null);
        streamPlayer.setVolume(1.0F);
    }

    private void scheduleServiceShutdownCheck()
    {
        delayedStopHandler.removeCallbacksAndMessages(null);
        delayedStopHandler.sendEmptyMessageDelayed(0, 0x2bf20L);
    }

    public void focusGained()
    {
        (new StringBuilder("focusGained with state ")).append(focusLossState);
        if (focusLossState == FocusLossState.TRANSIENT)
        {
            fadeHandler.sendEmptyMessage(1);
        } else
        {
            streamPlayer.setVolume(1.0F);
        }
        focusLossState = FocusLossState.NONE;
    }

    public void focusLost(boolean flag, boolean flag1)
    {
label0:
        {
            (new StringBuilder("focusLost(")).append(flag).append(", canDuck=").append(flag1).append(")");
            if (streamPlayer.isPlaying())
            {
                if (!flag)
                {
                    break label0;
                }
                focusLossState = FocusLossState.TRANSIENT;
                Handler handler = fadeHandler;
                byte byte0;
                if (flag1)
                {
                    byte0 = 3;
                } else
                {
                    byte0 = 2;
                }
                handler.sendEmptyMessage(byte0);
            }
            return;
        }
        focusLossState = FocusLossState.LOST;
        pause();
    }

    public boolean isPlayerPlaying()
    {
        return streamPlayer.isPlayerPlaying();
    }

    public boolean isPlaying()
    {
        return streamPlayer.isPlaying();
    }

    public IBinder onBind(Intent intent)
    {
        return null;
    }

    public void onCreate()
    {
        super.onCreate();
        streamPlayer.setListener(this);
        playbackReceiver = playbackReceiverFactory.create(this, accountOperations, eventBus);
        audioManager = (IAudioManager)remoteAudioManagerProvider.a();
        IntentFilter intentfilter = new IntentFilter();
        intentfilter.addAction("com.soundcloud.android.playback.toggleplayback");
        intentfilter.addAction("com.soundcloud.android.playback.playcurrent");
        intentfilter.addAction("com.soundcloud.android.playback.pause");
        intentfilter.addAction("com.soundcloud.android.playback.seek");
        intentfilter.addAction("com.soundcloud.android.playback.reset");
        intentfilter.addAction("com.soundcloud.android.playback.stop");
        intentfilter.addAction("android.media.AUDIO_BECOMING_NOISY");
        registerReceiver(playbackReceiver, intentfilter);
        scheduleServiceShutdownCheck();
        instance = this;
        eventBus.publish(EventQueue.PLAYER_LIFE_CYCLE, PlayerLifeCycleEvent.forCreated());
    }

    public void onDestroy()
    {
        stop();
        streamPlayer.destroy();
        delayedStopHandler.removeCallbacksAndMessages(null);
        fadeHandler.removeCallbacksAndMessages(null);
        audioManager.abandonMusicFocus(false);
        unregisterReceiver(playbackReceiver);
        eventBus.publish(EventQueue.PLAYER_LIFE_CYCLE, PlayerLifeCycleEvent.forDestroyed());
        instance = null;
        super.onDestroy();
    }

    public void onPlaystateChanged(Player.StateTransition statetransition)
    {
        (new StringBuilder("Received new playState ")).append(statetransition);
        if (currentPlaybackItem.isPresent() && ((PlaybackItem)currentPlaybackItem.get()).getTrackUrn().equals(statetransition.getTrackUrn()))
        {
            if (!statetransition.isPlaying())
            {
                onIdleState();
            }
            analyticsController.onStateTransition(statetransition);
            eventBus.publish(EventQueue.PLAYBACK_STATE_CHANGED, correctUnknownDuration(statetransition, (PlaybackItem)currentPlaybackItem.get()));
        }
    }

    public void onProgressEvent(long l, long l1)
    {
        if (currentPlaybackItem.isPresent())
        {
            PlaybackProgressEvent playbackprogressevent = new PlaybackProgressEvent(new PlaybackProgress(l, l1), ((PlaybackItem)currentPlaybackItem.get()).getTrackUrn());
            eventBus.publish(EventQueue.PLAYBACK_PROGRESS, playbackprogressevent);
        }
    }

    public int onStartCommand(Intent intent, int i, int j)
    {
        playbackNotificationController.subscribe(this);
        delayedStopHandler.removeCallbacksAndMessages(null);
        eventBus.publish(EventQueue.PLAYER_LIFE_CYCLE, PlayerLifeCycleEvent.forStarted());
        if (intent != null)
        {
            playbackReceiver.onReceive(this, intent);
            scheduleServiceShutdownCheck();
            return 1;
        } else
        {
            delayedStopHandler.removeCallbacksAndMessages(null);
            delayedStopHandler.sendEmptyMessage(0);
            return 2;
        }
    }

    void pause()
    {
        streamPlayer.pause();
    }

    void play()
    {
        if (!streamPlayer.isPlaying() && currentPlaybackItem.isPresent() && audioManager.requestMusicFocus(this, 1))
        {
            streamPlayer.resume();
            resetVolume();
        }
    }

    void play(PlaybackItem playbackitem)
    {
        currentPlaybackItem = Optional.of(playbackitem);
        streamPlayer.play(playbackitem);
    }

    public boolean requestAudioFocus()
    {
        return audioManager.requestMusicFocus(this, 1);
    }

    public void resetAll()
    {
        stop();
        currentPlaybackItem = Optional.absent();
        audioManager.abandonMusicFocus(false);
    }

    public long seek(long l, boolean flag)
    {
        return streamPlayer.seek(l, flag);
    }

    void stop()
    {
        playbackNotificationController.unsubscribe();
        streamPlayer.stop();
        stopForeground(true);
        eventBus.publish(EventQueue.PLAYER_LIFE_CYCLE, PlayerLifeCycleEvent.forStopped());
    }

    public void togglePlayback()
    {
        if (streamPlayer.isPlaying())
        {
            pause();
        } else
        if (currentPlaybackItem.isPresent())
        {
            play();
            return;
        }
    }

}
