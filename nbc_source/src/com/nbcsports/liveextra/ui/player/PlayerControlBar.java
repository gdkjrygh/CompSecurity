// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.view.Window;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.adobe.mediacore.MediaPlayer;
import com.adobe.mediacore.MediaPlayerItem;
import com.adobe.mediacore.MediaPlayerNotification;
import com.adobe.mediacore.MediaPlayerView;
import com.adobe.mediacore.info.AudioTrack;
import com.adobe.mediacore.metadata.TimedMetadata;
import com.adobe.mediacore.qos.metrics.PlaybackMetrics;
import com.adobe.mediacore.timeline.advertising.Ad;
import com.adobe.mediacore.timeline.advertising.AdBreak;
import com.adobe.mediacore.utils.TimeRange;
import com.nbcsports.liveextra.content.FavoriteService;
import com.nbcsports.liveextra.library.api.models.VideoSource;
import com.nbcsports.liveextra.library.player.AdPlaybackEventListenerStub;
import com.nbcsports.liveextra.library.player.PlaybackEventListenerStub;
import com.nbcsports.liveextra.library.player.QosEventListenerStub;
import com.nbcsports.liveextra.library.preferences.AppPreferences;
import com.nbcsports.liveextra.ui.main.core.AssetViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.joda.time.Duration;
import org.joda.time.format.PeriodFormatter;
import org.joda.time.format.PeriodFormatterBuilder;
import rx.Observable;
import rx.Subscriber;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import timber.log.Timber;

// Referenced classes of package com.nbcsports.liveextra.ui.player:
//            PlayerActivity, PlayerPresenter, AltCamPresenter, PlayerPresenterListener, 
//            SeekBarOverlay, AbstractPresenterListener

public class PlayerControlBar extends RelativeLayout
{

    private static final int BUFFER_SLOP = 24000;
    View aaButton;
    private com.adobe.mediacore.MediaPlayer.AdPlaybackEventListener adListener = new AdPlaybackEventListenerStub() {

        final PlayerControlBar this$0;

        public void onAdBreakComplete(AdBreak adbreak)
        {
            isInAdBreak = false;
            showPlayBar();
        }

        public void onAdBreakSkipped(AdBreak adbreak)
        {
            isInAdBreak = false;
        }

        public void onAdBreakStart(AdBreak adbreak)
        {
            isInAdBreak = true;
            if (playBar != null)
            {
                playBar.setVisibility(8);
            }
        }

        public void onAdStart(AdBreak adbreak, Ad ad)
        {
            isInAdBreak = true;
            if (playBar != null)
            {
                playBar.setVisibility(8);
            }
        }

            
            {
                this$0 = PlayerControlBar.this;
                super();
            }
    };
    AltCamPresenter altCamPresenter;
    View ccButton;
    private Subscription clockSubscription;
    private MediaPlayerItem currentItem;
    TextView durationClock;
    FavoriteService favorites;
    private Runnable hide = new Runnable() {

        final PlayerControlBar this$0;

        public void run()
        {
            if (isShown())
            {
                Animation animation = AnimationUtils.loadAnimation(getContext(), 0x10a0001);
                animation.setAnimationListener(new android.view.animation.Animation.AnimationListener() {

                    final _cls4 this$1;

                    public void onAnimationEnd(Animation animation)
                    {
                        setVisibility(8);
                    }

                    public void onAnimationRepeat(Animation animation)
                    {
                    }

                    public void onAnimationStart(Animation animation)
                    {
                        playerPresenter.hideChrome();
                    }

            
            {
                this$1 = _cls4.this;
                super();
            }
                });
                startAnimation(animation);
                altCamPresenter.showAltCams(false);
            }
        }

            
            {
                this$0 = PlayerControlBar.this;
                super();
            }
    };
    private boolean isInAdBreak;
    private boolean isSeeking;
    private boolean isStarted;
    private com.adobe.mediacore.MediaPlayer.PlayerState lastPlayerState;
    View playBar;
    List playButtons;
    TextView playClock;
    private com.adobe.mediacore.MediaPlayer.EventListener playbackListener = new PlaybackEventListenerStub() {

        final PlayerControlBar this$0;

        public void onPlayStart()
        {
            super.onPlayStart();
            isStarted = true;
        }

        public void onPrepared()
        {
            super.onPrepared();
            seekbar.setMax((int)player.getPlaybackRange().getDuration());
        }

        public void onStateChanged(com.adobe.mediacore.MediaPlayer.PlayerState playerstate, MediaPlayerNotification mediaplayernotification)
        {
            boolean flag;
            byte byte0;
            flag = false;
            byte0 = 4;
            if (playButtons != null) goto _L2; else goto _L1
_L1:
            return;
_L2:
            static class _cls13
            {

                static final int $SwitchMap$com$adobe$mediacore$MediaPlayer$PlayerState[];

                static 
                {
                    $SwitchMap$com$adobe$mediacore$MediaPlayer$PlayerState = new int[com.adobe.mediacore.MediaPlayer.PlayerState.values().length];
                    try
                    {
                        $SwitchMap$com$adobe$mediacore$MediaPlayer$PlayerState[com.adobe.mediacore.MediaPlayer.PlayerState.INITIALIZING.ordinal()] = 1;
                    }
                    catch (NoSuchFieldError nosuchfielderror8) { }
                    try
                    {
                        $SwitchMap$com$adobe$mediacore$MediaPlayer$PlayerState[com.adobe.mediacore.MediaPlayer.PlayerState.PREPARING.ordinal()] = 2;
                    }
                    catch (NoSuchFieldError nosuchfielderror7) { }
                    try
                    {
                        $SwitchMap$com$adobe$mediacore$MediaPlayer$PlayerState[com.adobe.mediacore.MediaPlayer.PlayerState.PREPARED.ordinal()] = 3;
                    }
                    catch (NoSuchFieldError nosuchfielderror6) { }
                    try
                    {
                        $SwitchMap$com$adobe$mediacore$MediaPlayer$PlayerState[com.adobe.mediacore.MediaPlayer.PlayerState.PLAYING.ordinal()] = 4;
                    }
                    catch (NoSuchFieldError nosuchfielderror5) { }
                    try
                    {
                        $SwitchMap$com$adobe$mediacore$MediaPlayer$PlayerState[com.adobe.mediacore.MediaPlayer.PlayerState.PAUSED.ordinal()] = 5;
                    }
                    catch (NoSuchFieldError nosuchfielderror4) { }
                    try
                    {
                        $SwitchMap$com$adobe$mediacore$MediaPlayer$PlayerState[com.adobe.mediacore.MediaPlayer.PlayerState.COMPLETE.ordinal()] = 6;
                    }
                    catch (NoSuchFieldError nosuchfielderror3) { }
                    try
                    {
                        $SwitchMap$com$adobe$mediacore$MediaPlayer$PlayerState[com.adobe.mediacore.MediaPlayer.PlayerState.ERROR.ordinal()] = 7;
                    }
                    catch (NoSuchFieldError nosuchfielderror2) { }
                    try
                    {
                        $SwitchMap$com$adobe$mediacore$MediaPlayer$PlayerState[com.adobe.mediacore.MediaPlayer.PlayerState.RELEASED.ordinal()] = 8;
                    }
                    catch (NoSuchFieldError nosuchfielderror1) { }
                    try
                    {
                        $SwitchMap$com$adobe$mediacore$MediaPlayer$PlayerState[com.adobe.mediacore.MediaPlayer.PlayerState.SUSPENDED.ordinal()] = 9;
                    }
                    catch (NoSuchFieldError nosuchfielderror)
                    {
                        return;
                    }
                }
            }

            switch (_cls13..SwitchMap.com.adobe.mediacore.MediaPlayer.PlayerState[playerstate.ordinal()])
            {
            default:
                return;

            case 1: // '\001'
                ButterKnife.apply(playButtons, new butterknife.ButterKnife.Action() {

                    final _cls8 this$1;

                    public volatile void apply(View view, int i)
                    {
                        apply((ImageButton)view, i);
                    }

                    public void apply(ImageButton imagebutton, int i)
                    {
                        imagebutton.setImageDrawable(null);
                    }

            
            {
                this$1 = _cls8.this;
                super();
            }
                });
                return;

            case 2: // '\002'
                if (playBar != null)
                {
                    playBar.setVisibility(8);
                }
                // fall through

            case 3: // '\003'
                ButterKnife.apply(playButtons, new butterknife.ButterKnife.Action() {

                    final _cls8 this$1;

                    public volatile void apply(View view, int i)
                    {
                        apply((ImageButton)view, i);
                    }

                    public void apply(ImageButton imagebutton, int i)
                    {
                        imagebutton.setImageDrawable(null);
                    }

            
            {
                this$1 = _cls8.this;
                super();
            }
                });
                currentItem = player.getCurrentItem();
                playerstate = seekbar;
                int j;
                if (currentItem.isLive())
                {
                    j = 4;
                } else
                {
                    j = 0;
                }
                playerstate.setVisibility(j);
                playerstate = seekbarOverlay;
                if (currentItem.isLive())
                {
                    j = 4;
                } else
                {
                    j = 0;
                }
                playerstate.setVisibility(j);
                playerstate = durationClock;
                if (currentItem.isLive())
                {
                    j = byte0;
                } else
                {
                    j = 0;
                }
                playerstate.setVisibility(j);
                playerstate = skipPrevButton;
                if (currentItem.isLive())
                {
                    j = 8;
                } else
                {
                    j = 0;
                }
                playerstate.setVisibility(j);
                playerstate = ccButton;
                if (currentItem.getClosedCaptionsTracks().size() > 0)
                {
                    j = ((flag) ? 1 : 0);
                } else
                {
                    j = 8;
                }
                playerstate.setVisibility(j);
                ccButton.setSelected(preferences.enableClosedCaptions());
                mediaplayernotification = player;
                if (preferences.enableClosedCaptions())
                {
                    playerstate = com.adobe.mediacore.MediaPlayer.Visibility.VISIBLE;
                } else
                {
                    playerstate = com.adobe.mediacore.MediaPlayer.Visibility.INVISIBLE;
                }
                mediaplayernotification.setCCVisibility(playerstate);
                return;

            case 4: // '\004'
                lastPlayerState = playerstate;
                showPlayBar();
                ButterKnife.apply(playButtons, new butterknife.ButterKnife.Action() {

                    final _cls8 this$1;

                    public volatile void apply(View view, int i)
                    {
                        apply((ImageButton)view, i);
                    }

                    public void apply(ImageButton imagebutton, int i)
                    {
                        imagebutton.setImageResource(0x7f020134);
                    }

            
            {
                this$1 = _cls8.this;
                super();
            }
                });
                if (clockSubscription == null || clockSubscription.isUnsubscribed())
                {
                    postDelayed(new Runnable() {

                        final _cls8 this$1;

                        public void run()
                        {
                            clockSubscription = subscribeClock();
                        }

            
            {
                this$1 = _cls8.this;
                super();
            }
                    }, 500L);
                }
                hide();
                return;

            case 5: // '\005'
                lastPlayerState = playerstate;
                ButterKnife.apply(playButtons, new butterknife.ButterKnife.Action() {

                    final _cls8 this$1;

                    public volatile void apply(View view, int i)
                    {
                        apply((ImageButton)view, i);
                    }

                    public void apply(ImageButton imagebutton, int i)
                    {
                        imagebutton.setImageResource(0x7f020135);
                    }

            
            {
                this$1 = _cls8.this;
                super();
            }
                });
                if (clockSubscription != null)
                {
                    clockSubscription.unsubscribe();
                }
                show();
                removeCallbacks(hide);
                return;

            case 6: // '\006'
                lastPlayerState = playerstate;
                ButterKnife.apply(playButtons, new butterknife.ButterKnife.Action() {

                    final _cls8 this$1;

                    public volatile void apply(View view, int i)
                    {
                        apply((ImageButton)view, i);
                    }

                    public void apply(ImageButton imagebutton, int i)
                    {
                        imagebutton.setImageResource(0x7f020136);
                    }

            
            {
                this$1 = _cls8.this;
                super();
            }
                });
                seekbar.setVisibility(4);
                seekbarOverlay.setVisibility(4);
                durationClock.setVisibility(4);
                playClock.setVisibility(4);
                if (ccButton.getVisibility() == 0)
                {
                    ccButton.setVisibility(4);
                }
                if (aaButton.getVisibility() == 0)
                {
                    aaButton.setVisibility(4);
                }
                if (skipPrevButton.getVisibility() == 0)
                {
                    skipPrevButton.setVisibility(4);
                }
                show();
                removeCallbacks(hide);
                return;

            case 7: // '\007'
                ButterKnife.apply(playButtons, new butterknife.ButterKnife.Action() {

                    final _cls8 this$1;

                    public volatile void apply(View view, int i)
                    {
                        apply((ImageButton)view, i);
                    }

                    public void apply(ImageButton imagebutton, int i)
                    {
                        imagebutton.setImageResource(0x7f0200b7);
                    }

            
            {
                this$1 = _cls8.this;
                super();
            }
                });
                return;

            case 8: // '\b'
                break;
            }
            if (true) goto _L1; else goto _L3
_L3:
        }

        public void onTimedMetadata(TimedMetadata timedmetadata)
        {
            super.onTimedMetadata(timedmetadata);
            seekbarOverlay.updateCues(timedmetadata);
        }

        public void onTimelineUpdated()
        {
            super.onTimelineUpdated();
            if (player == null || currentItem.isLive())
            {
                return;
            } else
            {
                seekbarOverlay.updateMarkers(player.getTimeline(), player.getPlaybackRange().getDuration());
                return;
            }
        }

            
            {
                this$0 = PlayerControlBar.this;
                super();
            }
    };
    MediaPlayer player;
    PlayerPresenter playerPresenter;
    public boolean playing;
    AppPreferences preferences;
    PlayerPresenterListener presenterListener = new AbstractPresenterListener() {

        final PlayerControlBar this$0;

        public void onPlayComplete()
        {
            show();
        }

        public void onPlayerTouch()
        {
            toggle();
        }

        public void onSourceSelected(VideoSource videosource)
        {
            super.onSourceSelected(videosource);
            if (clockSubscription != null)
            {
                clockSubscription.unsubscribe();
            }
            if (playBar != null)
            {
                playBar.setVisibility(8);
            }
            hide();
        }

            
            {
                this$0 = PlayerControlBar.this;
                super();
            }
    };
    com.adobe.mediacore.MediaPlayer.QOSEventListener qosListener = new QosEventListenerStub() {

        final PlayerControlBar this$0;

        public void onSeekComplete(long l)
        {
            super.onSeekComplete(l);
            isSeeking = false;
            if (playing)
            {
                player.play();
            }
        }

        public void onSeekStart()
        {
            super.onSeekStart();
            isSeeking = true;
            if (clockSubscription != null && !clockSubscription.isUnsubscribed())
            {
                clockSubscription.unsubscribe();
            }
        }

            
            {
                this$0 = PlayerControlBar.this;
                super();
            }
    };
    SeekBar seekbar;
    private android.widget.SeekBar.OnSeekBarChangeListener seekbarChangeListener = new android.widget.SeekBar.OnSeekBarChangeListener() {

        final PlayerControlBar this$0;

        public void onProgressChanged(SeekBar seekbar1, int j, boolean flag)
        {
            if (!flag)
            {
                return;
            }
            long l = getSeekTime(seekbar1, j);
            seekbar1 = player.getSeekableRange();
            String s = getPeriodString(new Duration(l));
            if (!seekbar1.contains(l))
            {
                Timber.d((new StringBuilder()).append("Seek time is out of seekable range. (").append(s).append(")").toString(), new Object[0]);
                return;
            } else
            {
                playClock.setText(s);
                return;
            }
        }

        public void onStartTrackingTouch(SeekBar seekbar1)
        {
            if (clockSubscription != null)
            {
                clockSubscription.unsubscribe();
            }
            if (!isSeeking)
            {
                playing = isPlaying();
                if (playing)
                {
                    player.pause();
                    return;
                }
            }
        }

        public void onStopTrackingTouch(SeekBar seekbar1)
        {
            int j = seekbar.getProgress();
            if (player.getStatus() == com.adobe.mediacore.MediaPlayer.PlayerState.PAUSED || player.getStatus() == com.adobe.mediacore.MediaPlayer.PlayerState.PLAYING)
            {
                player.seek(getSeekTime(seekbar1, j));
            }
        }

            
            {
                this$0 = PlayerControlBar.this;
                super();
            }
    };
    SeekBarOverlay seekbarOverlay;
    private int selectedAlternateAudio;
    ImageButton skipPrevButton;
    AssetViewModel viewModel;

    public PlayerControlBar(Context context)
    {
        this(context, null);
    }

    public PlayerControlBar(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public PlayerControlBar(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        selectedAlternateAudio = -1;
        if (isInEditMode())
        {
            return;
        } else
        {
            PlayerActivity.component().inject(this);
            return;
        }
    }

    private String[] getAudioTracksAsArray()
    {
        ArrayList arraylist = new ArrayList();
        if (currentItem != null)
        {
            AudioTrack audiotrack;
            for (Iterator iterator = currentItem.getAudioTracks().iterator(); iterator.hasNext(); arraylist.add((new StringBuilder()).append(audiotrack.getName()).append("[ ").append(audiotrack.getLanguage()).append("]").toString()))
            {
                audiotrack = (AudioTrack)iterator.next();
            }

        }
        return (String[])arraylist.toArray(new String[arraylist.size()]);
    }

    private String getPeriodString(Duration duration)
    {
        PeriodFormatterBuilder periodformatterbuilder = (new PeriodFormatterBuilder()).printZeroAlways().minimumPrintedDigits(2);
        if (duration.getStandardHours() > 0L)
        {
            periodformatterbuilder.appendHours().appendSeparator(":");
        }
        periodformatterbuilder.appendMinutes().appendSeparator(":").appendSeconds();
        return periodformatterbuilder.toFormatter().print(duration.toPeriod());
    }

    private long getSeekTime(SeekBar seekbar1, int i)
    {
        float f = ((float)i * 1.0F) / (float)seekbar1.getMax();
        return (long)((float)player.getPlaybackRange().getDuration() * f);
    }

    private int getSelectedAudioTrackIndex()
    {
        List list = currentItem.getAudioTracks();
        AudioTrack audiotrack = currentItem.getSelectedAudioTrack();
        for (int i = 0; i < list.size(); i++)
        {
            if (((AudioTrack)list.get(i)).equals(audiotrack))
            {
                return i;
            }
        }

        return -1;
    }

    private boolean isPlaying()
    {
        return lastPlayerState != null && lastPlayerState.equals(com.adobe.mediacore.MediaPlayer.PlayerState.PLAYING);
    }

    private void setVisibilityListener()
    {
        ((Activity)getContext()).getWindow().getDecorView().setOnSystemUiVisibilityChangeListener(new android.view.View.OnSystemUiVisibilityChangeListener() {

            final PlayerControlBar this$0;

            public void onSystemUiVisibilityChange(int i)
            {
                if (i == 1024)
                {
                    hide();
                } else
                if (i == 0)
                {
                    show();
                    return;
                }
            }

            
            {
                this$0 = PlayerControlBar.this;
                super();
            }
        });
    }

    private boolean showPlayBar()
    {
        return postDelayed(new Runnable() {

            final PlayerControlBar this$0;

            public void run()
            {
                if (!isInAdBreak && playBar != null && playBar.getVisibility() != 0)
                {
                    playBar.setVisibility(0);
                }
            }

            
            {
                this$0 = PlayerControlBar.this;
                super();
            }
        }, 2000L);
    }

    private Subscription subscribeClock()
    {
        Observable observable = playerPresenter.getClock();
        if (observable == null)
        {
            return null;
        } else
        {
            return observable.observeOn(AndroidSchedulers.mainThread()).subscribe(new Subscriber() {

                final PlayerControlBar this$0;

                public void onCompleted()
                {
                }

                public void onError(Throwable throwable)
                {
                    Timber.i(throwable, "Error updating clock display on player", new Object[0]);
                }

                public void onNext(Long long1)
                {
                    updateClockDisplay();
                }

                public volatile void onNext(Object obj)
                {
                    onNext((Long)obj);
                }

            
            {
                this$0 = PlayerControlBar.this;
                super();
            }
            });
        }
    }

    private void updateClockDisplay()
    {
        if (player == null || playClock == null)
        {
            return;
        }
        if (currentItem == null)
        {
            playClock.setText("--:--");
            durationClock.setText("--:--");
            seekbar.setProgress(0);
            return;
        }
        Duration duration = new Duration(player.getCurrentTime());
        TimeRange timerange = player.getPlaybackRange();
        Duration duration1 = new Duration(timerange.getDuration());
        playClock.setText(getPeriodString(duration));
        if (currentItem.isLive())
        {
            if (timerange.getEnd() - player.getBufferedRange().getEnd() - player.getPlaybackMetrics().getBufferTime() - 24000L > 0L)
            {
                playClock.setText(0x7f070116);
                playClock.setTextColor(getResources().getColor(0x7f0e0068));
                playClock.setClickable(true);
                return;
            } else
            {
                playClock.setTextColor(getResources().getColor(0x7f0e004a));
                playClock.setText(0x7f07011e);
                playClock.setClickable(false);
                return;
            }
        } else
        {
            durationClock.setText(getPeriodString(duration1));
            seekbar.setProgress((int)((((float)player.getCurrentTime() * 1.0F) / (float)timerange.getDuration()) * (float)seekbar.getMax()));
            return;
        }
    }

    private void updateLayout(int i)
    {
        android.widget.RelativeLayout.LayoutParams layoutparams = (android.widget.RelativeLayout.LayoutParams)getLayoutParams();
        layoutparams.addRule(8, i);
        setLayoutParams(layoutparams);
    }

    private void updateView()
    {
        setVisibilityListener();
        if (playBar == null || viewModel == null)
        {
            return;
        } else
        {
            seekbar.setOnSeekBarChangeListener(seekbarChangeListener);
            return;
        }
    }

    public void attachPlayer()
    {
        player.addEventListener(com.adobe.mediacore.MediaPlayer.Event.PLAYBACK, playbackListener);
        player.addEventListener(com.adobe.mediacore.MediaPlayer.Event.AD_PLAYBACK, adListener);
        player.addEventListener(com.adobe.mediacore.MediaPlayer.Event.QOS, qosListener);
    }

    public void hide()
    {
        hide(7000);
    }

    public void hide(int i)
    {
        postDelayed(hide, i);
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        if (isInEditMode())
        {
            return;
        } else
        {
            playerPresenter.register(presenterListener);
            attachPlayer();
            ButterKnife.bind(this);
            updateView();
            updateLayout(player.getView().getId());
            updateView();
            return;
        }
    }

    public void onAudioTrackClick()
    {
        selectedAlternateAudio = getSelectedAudioTrackIndex();
        if (selectedAlternateAudio != -1)
        {
            String as[] = getAudioTracksAsArray();
            (new android.app.AlertDialog.Builder(getContext())).setTitle(0x7f070036).setSingleChoiceItems(as, selectedAlternateAudio, new android.content.DialogInterface.OnClickListener() {

                final PlayerControlBar this$0;

                public void onClick(DialogInterface dialoginterface, int i)
                {
                    AudioTrack audiotrack = (AudioTrack)currentItem.getAudioTracks().get(i);
                    if (currentItem.selectAudioTrack(audiotrack))
                    {
                        selectedAlternateAudio = i;
                    }
                    dialoginterface.cancel();
                }

            
            {
                this$0 = PlayerControlBar.this;
                super();
            }
            }).setNegativeButton(0x7f070038, new android.content.DialogInterface.OnClickListener() {

                final PlayerControlBar this$0;

                public void onClick(DialogInterface dialoginterface, int i)
                {
                }

            
            {
                this$0 = PlayerControlBar.this;
                super();
            }
            }).show();
            return;
        } else
        {
            Timber.d("Unable to detect the currently selected audio track", new Object[0]);
            return;
        }
    }

    public void onClosedCaptionToggle()
    {
        if (player == null)
        {
            return;
        }
        Object obj = ccButton;
        MediaPlayer mediaplayer;
        boolean flag;
        if (!ccButton.isSelected())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ((View) (obj)).setSelected(flag);
        mediaplayer = player;
        if (ccButton.isSelected())
        {
            obj = com.adobe.mediacore.MediaPlayer.Visibility.VISIBLE;
        } else
        {
            obj = com.adobe.mediacore.MediaPlayer.Visibility.INVISIBLE;
        }
        mediaplayer.setCCVisibility(((com.adobe.mediacore.MediaPlayer.Visibility) (obj)));
        preferences.enableClosedCaptions(ccButton.isSelected());
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        ButterKnife.unbind(this);
        playerPresenter.unregister(presenterListener);
        if (clockSubscription != null)
        {
            clockSubscription.unsubscribe();
        }
    }

    public void onGoLiveClick()
    {
        if (player.getStatus() != com.adobe.mediacore.MediaPlayer.PlayerState.PLAYING)
        {
            player.play();
        }
        player.seek(-2L);
    }

    void onPlayClick()
    {
        playerPresenter.togglePlayPause();
    }

    public void onSkipPrevClick()
    {
        if (player == null || !player.getStatus().equals(com.adobe.mediacore.MediaPlayer.PlayerState.PLAYING) && !player.getStatus().equals(com.adobe.mediacore.MediaPlayer.PlayerState.PAUSED))
        {
            return;
        }
        if (clockSubscription != null)
        {
            clockSubscription.unsubscribe();
        }
        long l = player.getCurrentTime() - 10000L;
        player.seek(l);
        seekbar.setProgress((int)((((float)l * 1.0F) / (float)player.getPlaybackRange().getDuration()) * (float)seekbar.getMax()));
        playClock.setText(getPeriodString(new Duration(l)));
    }

    public void show()
    {
        removeCallbacks(hide);
        if (!isShown())
        {
            Animation animation = AnimationUtils.loadAnimation(getContext(), 0x10a0000);
            animation.setAnimationListener(new android.view.animation.Animation.AnimationListener() {

                final PlayerControlBar this$0;

                public void onAnimationEnd(Animation animation1)
                {
                    if (isPlaying())
                    {
                        hide();
                    }
                }

                public void onAnimationRepeat(Animation animation1)
                {
                }

                public void onAnimationStart(Animation animation1)
                {
                    setVisibility(0);
                    if (!isInAdBreak || !isStarted)
                    {
                        showPlayBar();
                    }
                    playerPresenter.showChrome();
                }

            
            {
                this$0 = PlayerControlBar.this;
                super();
            }
            });
            startAnimation(animation);
            altCamPresenter.showAltCams(true);
        }
    }

    public void toggle()
    {
        if (isShown())
        {
            hide(0);
            return;
        } else
        {
            show();
            return;
        }
    }



/*
    static Subscription access$002(PlayerControlBar playercontrolbar, Subscription subscription)
    {
        playercontrolbar.clockSubscription = subscription;
        return subscription;
    }

*/




/*
    static boolean access$102(PlayerControlBar playercontrolbar, boolean flag)
    {
        playercontrolbar.isInAdBreak = flag;
        return flag;
    }

*/



/*
    static boolean access$1102(PlayerControlBar playercontrolbar, boolean flag)
    {
        playercontrolbar.isSeeking = flag;
        return flag;
    }

*/





/*
    static boolean access$202(PlayerControlBar playercontrolbar, boolean flag)
    {
        playercontrolbar.isStarted = flag;
        return flag;
    }

*/






/*
    static MediaPlayerItem access$602(PlayerControlBar playercontrolbar, MediaPlayerItem mediaplayeritem)
    {
        playercontrolbar.currentItem = mediaplayeritem;
        return mediaplayeritem;
    }

*/


/*
    static int access$702(PlayerControlBar playercontrolbar, int i)
    {
        playercontrolbar.selectedAlternateAudio = i;
        return i;
    }

*/


/*
    static com.adobe.mediacore.MediaPlayer.PlayerState access$802(PlayerControlBar playercontrolbar, com.adobe.mediacore.MediaPlayer.PlayerState playerstate)
    {
        playercontrolbar.lastPlayerState = playerstate;
        return playerstate;
    }

*/

}
