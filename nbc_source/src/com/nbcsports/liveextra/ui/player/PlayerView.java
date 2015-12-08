// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.Toast;
import butterknife.ButterKnife;
import com.adobe.adobepass.accessenabler.api.AccessEnabler;
import com.adobe.adobepass.accessenabler.models.Mvpd;
import com.adobe.mediacore.MediaPlayer;
import com.adobe.mediacore.MediaPlayerItem;
import com.adobe.mediacore.MediaPlayerNotification;
import com.adobe.mediacore.MediaPlayerView;
import com.adobe.mediacore.MediaResource;
import com.adobe.mediacore.metadata.DefaultMetadataKeys;
import com.adobe.mediacore.metadata.MetadataNode;
import com.adobe.mediacore.metadata.TimedMetadata;
import com.adobe.mediacore.timeline.advertising.Ad;
import com.adobe.mediacore.timeline.advertising.AdBreak;
import com.adobe.mediacore.timeline.advertising.AdClick;
import com.crashlytics.android.Crashlytics;
import com.nbcsports.liveextra.library.api.models.Asset;
import com.nbcsports.liveextra.library.configuration.Configuration;
import com.nbcsports.liveextra.library.player.AuditudeConfiguration;
import com.nbcsports.liveextra.library.player.PlaybackEventListenerStub;
import com.nbcsports.liveextra.library.player.QosEventListenerStub;
import com.nbcsports.liveextra.library.tve.AuthService;
import com.nbcsports.liveextra.library.ui.SavedState;
import com.nbcsports.liveextra.ui.core.CaptionStyle;
import com.nbcsports.liveextra.ui.main.core.AssetViewModel;
import com.phunware.nbc.sochi.metrics.TrackingHelper;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.RequestCreator;
import org.joda.time.DateTime;
import timber.log.Timber;

// Referenced classes of package com.nbcsports.liveextra.ui.player:
//            PlayerActivity, PlayerFrameLayout, PlayerPresenter, PlayerPresenterListener, 
//            AbstractPresenterListener

public class PlayerView extends RelativeLayout
{

    PlayerActivity activity;
    AuditudeConfiguration auditudeConfiguration;
    private boolean backupRetried;
    CaptionStyle captionStyle;
    Configuration configuration;
    private Handler handler;
    private boolean isInitialized;
    private Long lastKnownTime;
    private com.adobe.mediacore.MediaPlayer.PlayerState lastPlayerState;
    private MetadataNode metadata;
    AuthService pass;
    Picasso picasso;
    MediaPlayer player;
    PlayerFrameLayout playerFrame;
    ImageView posterArt;
    private double prerollDuration;
    private boolean prerollPlaying;
    PlayerPresenter presenter;
    private PlayerPresenterListener presenterListener = new AbstractPresenterListener() {

        final PlayerView this$0;

        public void onPlayComplete()
        {
            player.replaceCurrentItem(resource);
        }

            
            {
                this$0 = PlayerView.this;
                super();
            }
    };
    ProgressBar progress;
    ViewStub qosStub;
    private MediaResource resource;
    private long savedMovieHeight;
    private long savedMovieWidth;
    private com.adobe.mediacore.MediaPlayer.PlayerState savedPlayerState;
    TrackingHelper trackingHelper;
    private boolean videoRetried;
    private AssetViewModel viewModel;

    public PlayerView(Context context)
    {
        this(context, null);
    }

    public PlayerView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public PlayerView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        handler = new Handler();
        lastPlayerState = com.adobe.mediacore.MediaPlayer.PlayerState.IDLE;
        savedPlayerState = com.adobe.mediacore.MediaPlayer.PlayerState.IDLE;
        if (isInEditMode())
        {
            return;
        } else
        {
            PlayerActivity.component().inject(this);
            return;
        }
    }

    private void addEventListeners()
    {
        bindQosPanel();
        player.addEventListener(com.adobe.mediacore.MediaPlayer.Event.PLAYBACK, getPlaybackEventListener());
        player.addEventListener(com.adobe.mediacore.MediaPlayer.Event.QOS, getQosEventListener());
        player.addEventListener(com.adobe.mediacore.MediaPlayer.Event.AD_PLAYBACK, getAdEventListener());
    }

    private void bindQosPanel()
    {
    }

    private boolean failover()
    {
        player.reset();
        if (!videoRetried)
        {
            videoRetried = true;
            handler.postDelayed(new Runnable() {

                final PlayerView this$0;

                public void run()
                {
                    setMediaResource();
                }

            
            {
                this$0 = PlayerView.this;
                super();
            }
            }, 1000L);
            return true;
        }
        if (!backupRetried && viewModel.canFailover())
        {
            backupRetried = true;
            viewModel.failover();
            if (viewModel.isFree())
            {
                setMediaResource();
                return true;
            } else
            {
                activity.verifyAuth();
                return true;
            }
        } else
        {
            return false;
        }
    }

    private com.adobe.mediacore.MediaPlayer.AdPlaybackEventListener getAdEventListener()
    {
        return new com.adobe.mediacore.MediaPlayer.AdPlaybackEventListener() {

            final PlayerView this$0;

            private void completeAdBreak(AdBreak adbreak)
            {
                if (adbreak.getType().equals(com.adobe.mediacore.timeline.advertising.AdBreak.Type.PRE_ROLL))
                {
                    prerollDuration = (double)adbreak.getDuration();
                    prerollPlaying = false;
                }
            }

            public void onAdBreakComplete(AdBreak adbreak)
            {
                Timber.d("AD BREAK COMPLETE CALL", new Object[0]);
                Timber.d("Ad Break Current Time: %s", new Object[] {
                    new DateTime(player.getLocalTime())
                });
                completeAdBreak(adbreak);
            }

            public void onAdBreakSkipped(AdBreak adbreak)
            {
                Timber.d("AD BREAK SKIPPED", new Object[0]);
                completeAdBreak(adbreak);
            }

            public void onAdBreakStart(AdBreak adbreak)
            {
                Timber.d((new StringBuilder()).append("adBreak.getDuration(): ").append(adbreak.getDuration()).toString(), new Object[0]);
                Timber.d((new StringBuilder()).append("adBreak.getInitialReplaceDuration(): ").append(adbreak.getInitialReplaceDuration()).toString(), new Object[0]);
                Timber.d((new StringBuilder()).append("adBreak.getReplaceDuration(): ").append(adbreak.getReplaceDuration()).toString(), new Object[0]);
                if (adbreak.getType().equals(com.adobe.mediacore.timeline.advertising.AdBreak.Type.PRE_ROLL))
                {
                    if (prerollDuration > 0.0D)
                    {
                        Timber.d("ADBreak playing again!", new Object[0]);
                    }
                    prerollPlaying = true;
                }
            }

            public void onAdClick(AdBreak adbreak, Ad ad, AdClick adclick)
            {
            }

            public void onAdComplete(AdBreak adbreak, Ad ad)
            {
                Timber.d("AD COMPLETE CALL", new Object[0]);
            }

            public void onAdProgress(AdBreak adbreak, Ad ad, int i)
            {
            }

            public void onAdStart(AdBreak adbreak, Ad ad)
            {
                if (ad == null)
                {
                    return;
                } else
                {
                    Timber.d("AD START CALL", new Object[0]);
                    return;
                }
            }

            
            {
                this$0 = PlayerView.this;
                super();
            }
        };
    }

    private com.adobe.mediacore.MediaPlayer.PlaybackEventListener getPlaybackEventListener()
    {
        return new PlaybackEventListenerStub() {

            final PlayerView this$0;

            public void onPlayComplete()
            {
                activity.keepScreenOn(false);
                if (viewModel.isLive() && activity != null && !activity.isFinishing())
                {
                    activity.finish();
                }
            }

            public void onPlayStart()
            {
                if (!savedPlayerState.equals(com.adobe.mediacore.MediaPlayer.PlayerState.IDLE))
                {
                    player.pause();
                }
                Timber.d("Play Start Current Time: %s", new Object[] {
                    new DateTime(player.getLocalTime())
                });
                activity.keepScreenOn(true);
                posterArt.setVisibility(8);
                setupMidrolls();
            }

            public void onPrepared()
            {
                setupClosedCaptioning();
                MediaPlayerItem mediaplayeritem = player.getCurrentItem();
                Timber.d("OnPrepared Local Time: %s", new Object[] {
                    new DateTime(player.getLocalTime())
                });
                if (mediaplayeritem != null)
                {
                    if (lastKnownTime != null && !mediaplayeritem.isLive())
                    {
                        Timber.d("OnPrepared Last Known Time: %s", new Object[] {
                            new DateTime(lastKnownTime)
                        });
                        player.seekToLocalTime((long)((double)lastKnownTime.longValue() + prerollDuration));
                    }
                    if (!savedPlayerState.equals(com.adobe.mediacore.MediaPlayer.PlayerState.PAUSED) && !savedPlayerState.equals(com.adobe.mediacore.MediaPlayer.PlayerState.SUSPENDED))
                    {
                        player.play();
                    }
                    savedPlayerState = com.adobe.mediacore.MediaPlayer.PlayerState.IDLE;
                }
            }

            public void onSizeAvailable(long l, long l1)
            {
                if (l1 != savedMovieWidth || l != savedMovieHeight)
                {
                    savedMovieWidth = l1;
                    savedMovieHeight = l;
                    setPlayerViewSize(playerFrame.getWidth(), playerFrame.getHeight());
                }
            }

            public void onStateChanged(com.adobe.mediacore.MediaPlayer.PlayerState playerstate, MediaPlayerNotification mediaplayernotification)
            {
                static class _cls8
                {

                    static final int $SwitchMap$com$adobe$mediacore$MediaPlayer$PlayerState[];

                    static 
                    {
                        $SwitchMap$com$adobe$mediacore$MediaPlayer$PlayerState = new int[com.adobe.mediacore.MediaPlayer.PlayerState.values().length];
                        try
                        {
                            $SwitchMap$com$adobe$mediacore$MediaPlayer$PlayerState[com.adobe.mediacore.MediaPlayer.PlayerState.IDLE.ordinal()] = 1;
                        }
                        catch (NoSuchFieldError nosuchfielderror6) { }
                        try
                        {
                            $SwitchMap$com$adobe$mediacore$MediaPlayer$PlayerState[com.adobe.mediacore.MediaPlayer.PlayerState.INITIALIZING.ordinal()] = 2;
                        }
                        catch (NoSuchFieldError nosuchfielderror5) { }
                        try
                        {
                            $SwitchMap$com$adobe$mediacore$MediaPlayer$PlayerState[com.adobe.mediacore.MediaPlayer.PlayerState.INITIALIZED.ordinal()] = 3;
                        }
                        catch (NoSuchFieldError nosuchfielderror4) { }
                        try
                        {
                            $SwitchMap$com$adobe$mediacore$MediaPlayer$PlayerState[com.adobe.mediacore.MediaPlayer.PlayerState.PLAYING.ordinal()] = 4;
                        }
                        catch (NoSuchFieldError nosuchfielderror3) { }
                        try
                        {
                            $SwitchMap$com$adobe$mediacore$MediaPlayer$PlayerState[com.adobe.mediacore.MediaPlayer.PlayerState.PAUSED.ordinal()] = 5;
                        }
                        catch (NoSuchFieldError nosuchfielderror2) { }
                        try
                        {
                            $SwitchMap$com$adobe$mediacore$MediaPlayer$PlayerState[com.adobe.mediacore.MediaPlayer.PlayerState.COMPLETE.ordinal()] = 6;
                        }
                        catch (NoSuchFieldError nosuchfielderror1) { }
                        try
                        {
                            $SwitchMap$com$adobe$mediacore$MediaPlayer$PlayerState[com.adobe.mediacore.MediaPlayer.PlayerState.ERROR.ordinal()] = 7;
                        }
                        catch (NoSuchFieldError nosuchfielderror)
                        {
                            return;
                        }
                    }
                }

                switch (_cls8..SwitchMap.com.adobe.mediacore.MediaPlayer.PlayerState[playerstate.ordinal()])
                {
                default:
                    return;

                case 1: // '\001'
                    activity.keepScreenOn(false);
                    return;

                case 2: // '\002'
                    activity.keepScreenOn(true);
                    return;

                case 3: // '\003'
                    player.prepareToPlay();
                    return;

                case 4: // '\004'
                    lastPlayerState = playerstate;
                    return;

                case 5: // '\005'
                    activity.keepScreenOn(false);
                    lastPlayerState = playerstate;
                    return;

                case 6: // '\006'
                    activity.keepScreenOn(false);
                    posterArt.setVisibility(0);
                    lastPlayerState = playerstate;
                    return;

                case 7: // '\007'
                    handlePlaybackError(playerstate, mediaplayernotification);
                    break;
                }
            }

            public void onTimedMetadata(TimedMetadata timedmetadata)
            {
                super.onTimedMetadata(timedmetadata);
                Timber.d((new StringBuilder()).append("Qos Timed Metadata: ").append(timedmetadata.getMetadata().toString()).toString(), new Object[0]);
            }

            public void onTimelineUpdated()
            {
            }

            
            {
                this$0 = PlayerView.this;
                super();
            }
        };
    }

    private com.adobe.mediacore.MediaPlayer.QOSEventListener getQosEventListener()
    {
        return new QosEventListenerStub() {

            final PlayerView this$0;

            public void onBufferComplete()
            {
                hideProgress();
            }

            public void onBufferStart()
            {
                showProgress();
            }

            public void onOperationFailed(com.adobe.mediacore.MediaPlayerNotification.Warning warning)
            {
                super.onOperationFailed(warning);
                Timber.d((new StringBuilder()).append("Qos Error: ").append(warning.getDescription()).toString(), new Object[0]);
                handlePlaybackError(player.getStatus(), warning);
            }

            public void onSeekComplete(long l)
            {
                super.onSeekComplete(l);
                Timber.d("After Seek Current Time: %s, Adjusted Time: %s", new Object[] {
                    new DateTime(player.getLocalTime()), new DateTime(l)
                });
            }

            public void onSeekStart()
            {
                super.onSeekStart();
                Timber.d("Before Seek Current Time: %s", new Object[] {
                    new DateTime(player.getLocalTime())
                });
            }

            
            {
                this$0 = PlayerView.this;
                super();
            }
        };
    }

    private void handlePlaybackError(com.adobe.mediacore.MediaPlayer.PlayerState playerstate, MediaPlayerNotification mediaplayernotification)
    {
        com.adobe.mediacore.MediaPlayerNotification.NotificationCode notificationcode;
        long l;
        if (activity == null || activity.isFinishing())
        {
            return;
        }
        activity.keepScreenOn(false);
        notificationcode = mediaplayernotification.getCode();
        l = notificationcode.getCode();
        if ((l < 0x18a88L || l > 0x18ed5L) && (l < 0x19e10L || l > 0x19e15L)) goto _L2; else goto _L1
_L1:
        if (failover())
        {
            Timber.i((new StringBuilder()).append("Playback ").append(mediaplayernotification.getClass().getSimpleName()).append(": ").append(notificationcode).toString(), new Object[0]);
            Timber.i((new StringBuilder()).append("Playback ").append(mediaplayernotification.getClass().getSimpleName()).append(" Notification: ").append(mediaplayernotification).toString(), new Object[0]);
            return;
        }
        Timber.e("Unable to continue playback, exiting", new Object[] {
            mediaplayernotification
        });
        progress.setVisibility(8);
        lastPlayerState = playerstate;
        if (mediaplayernotification.getInnerNotification() == null) goto _L4; else goto _L3
_L3:
        playerstate = getResources().getString(0x7f0700e1);
        if (mediaplayernotification.getInnerNotification().getInnerNotification() != null) goto _L6; else goto _L5
_L5:
        mediaplayernotification = mediaplayernotification.getInnerNotification().getDescription();
        playerstate = mediaplayernotification;
_L8:
        Toast.makeText(getContext().getApplicationContext(), playerstate, 1).show();
_L4:
        activity.finish();
        return;
_L6:
        mediaplayernotification = mediaplayernotification.getInnerNotification().getInnerNotification().getDescription();
        playerstate = mediaplayernotification;
        continue; /* Loop/switch isn't completed */
_L2:
        Timber.i((new StringBuilder()).append("Playback ").append(mediaplayernotification.getClass().getSimpleName()).append(": ").append(notificationcode).toString(), new Object[0]);
        Timber.i((new StringBuilder()).append("Playback ").append(mediaplayernotification.getClass().getSimpleName()).append(" Notification: ").append(mediaplayernotification).toString(), new Object[0]);
        return;
        mediaplayernotification;
        if (true) goto _L8; else goto _L7
_L7:
    }

    private void hideProgress()
    {
        progress.setVisibility(8);
    }

    private void setMediaResource()
    {
        if (metadata != null) goto _L2; else goto _L1
_L1:
        Object obj;
        metadata = new MetadataNode();
        obj = pass.getSelectedMvpd();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_335;
        }
        obj = ((Mvpd) (obj)).getId();
_L12:
        obj = auditudeConfiguration.create(viewModel, ((String) (obj)), getResources().getString(0x7f070033));
        metadata.setNode(DefaultMetadataKeys.AUDITUDE_METADATA_KEY.getValue(), ((com.adobe.mediacore.metadata.Metadata) (obj)));
_L10:
        String s = viewModel.getAuthenticatedStreamUrl();
        obj = s;
        if (s.endsWith("m3u"))
        {
            obj = s.replace("m3u", "m3u8");
        }
        lastKnownTime = Long.valueOf(player.getLocalTime());
        Timber.d("Last Known Current Time: %s", new Object[] {
            new DateTime(lastKnownTime)
        });
        if (!savedPlayerState.equals(com.adobe.mediacore.MediaPlayer.PlayerState.IDLE)) goto _L4; else goto _L3
_L3:
        if (resource == null) goto _L6; else goto _L5
_L5:
        boolean flag = resource.getUrl().equals(obj);
        if (!flag) goto _L6; else goto _L4
_L4:
        if (!savedPlayerState.equals(com.adobe.mediacore.MediaPlayer.PlayerState.PLAYING)) goto _L8; else goto _L7
_L7:
        player.play();
_L11:
        savedPlayerState = com.adobe.mediacore.MediaPlayer.PlayerState.IDLE;
        return;
_L2:
        if (viewModel.getSelectedSource() == null) goto _L10; else goto _L9
_L9:
        auditudeConfiguration.updateAssetId(viewModel);
          goto _L10
_L8:
        player.pause();
          goto _L11
        Exception exception;
        exception;
        try
        {
            resource = MediaResource.createFromUrl(((String) (obj)), metadata);
            player.replaceCurrentItem(resource);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            if (activity != null && !activity.isFinishing())
            {
                activity.finish();
                return;
            } else
            {
                return;
            }
        }
          goto _L11
_L6:
        resource = MediaResource.createFromUrl(((String) (obj)), metadata);
        player.replaceCurrentItem(resource);
          goto _L11
        obj = null;
          goto _L12
    }

    private void setupClosedCaptioning()
    {
        com.adobe.mediacore.TextFormat textformat = captionStyle.getTextFormat();
        if (textformat != null)
        {
            player.setCCStyle(textformat);
        }
    }

    private void setupMidrolls()
    {
        auditudeConfiguration.setupMidrolls(viewModel);
    }

    private void showProgress()
    {
        progress.setVisibility(0);
    }

    public void bind(AssetViewModel assetviewmodel)
    {
        viewModel = assetviewmodel;
        if (playerFrame == null)
        {
            return;
        }
        if (!isInitialized)
        {
            bindQosPanel();
            isInitialized = true;
            playerFrame.addView(player.getView());
            playerFrame.addOnSizeChangeListener(new PlayerFrameLayout.OnSizeChangeListener() {

                final PlayerView this$0;

                public void onSizeChanged(long l, long l1)
                {
                    setPlayerViewSize(l, l1);
                }

            
            {
                this$0 = PlayerView.this;
                super();
            }
            });
            addEventListeners();
            pass.getInstance().getSelectedProvider();
        }
        setMediaResource();
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        if (!isInEditMode())
        {
            ButterKnife.bind(this);
            presenter.register(presenterListener);
            if (viewModel != null)
            {
                bind(viewModel);
                try
                {
                    Crashlytics.setString("Video URL", viewModel.asset().getStreamUrl());
                    return;
                }
                catch (Exception exception)
                {
                    return;
                }
            }
        }
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        if (isInEditMode())
        {
            return;
        }
        ButterKnife.unbind(this);
        presenter.unregister(presenterListener);
        try
        {
            Crashlytics.setString("Video URL", null);
            return;
        }
        catch (Exception exception)
        {
            return;
        }
    }

    protected void onMeasure(int i, int j)
    {
        super.onMeasure(i, j);
        if (viewModel == null)
        {
            return;
        } else
        {
            picasso.load(viewModel.getImageUri(configuration.getImagesBaseURL(), (int)((float)getMeasuredWidth() * getResources().getDisplayMetrics().density))).placeholder(0x7f020132).into(posterArt);
            return;
        }
    }

    protected void onRestoreInstanceState(Parcelable parcelable)
    {
        if (!(parcelable instanceof SavedState))
        {
            super.onRestoreInstanceState(parcelable);
            return;
        } else
        {
            parcelable = (SavedState)parcelable;
            lastKnownTime = Long.valueOf(((SavedState) (parcelable)).bundle.getLong("currentTime"));
            savedPlayerState = (com.adobe.mediacore.MediaPlayer.PlayerState)((SavedState) (parcelable)).bundle.getSerializable("isPlaying");
            super.onRestoreInstanceState(parcelable.getSuperState());
            return;
        }
    }

    protected Parcelable onSaveInstanceState()
    {
        SavedState savedstate = new SavedState(super.onSaveInstanceState());
        Object obj;
        if (player == null || player.getStatus() == com.adobe.mediacore.MediaPlayer.PlayerState.COMPLETE)
        {
            obj = super.onSaveInstanceState();
        } else
        {
            savedstate.bundle.putLong("currentTime", player.getLocalTime());
            if (!lastPlayerState.equals(com.adobe.mediacore.MediaPlayer.PlayerState.PLAYING))
            {
                lastPlayerState = com.adobe.mediacore.MediaPlayer.PlayerState.PAUSED;
            }
            savedPlayerState = lastPlayerState;
            savedstate.bundle.putSerializable("isPlaying", savedPlayerState);
            obj = savedstate;
            if (player.getStatus() == com.adobe.mediacore.MediaPlayer.PlayerState.PLAYING)
            {
                player.pause();
                return savedstate;
            }
        }
        return ((Parcelable) (obj));
    }

    public void setPlayerViewSize(final long heightFinal, long l)
    {
        if (player == null || player.getView() == null)
        {
            Timber.w("Unable to find player scrollView.", new Object[0]);
            return;
        }
        Timber.i((new StringBuilder()).append("Original movie size: ").append(savedMovieWidth).append("x").append(savedMovieHeight).toString(), new Object[0]);
        float f = (float)heightFinal / (float)l;
        if (savedMovieWidth == 0L || savedMovieHeight == 0L)
        {
            savedMovieWidth = heightFinal;
            savedMovieHeight = l;
        }
        float f1 = (float)savedMovieWidth / (float)savedMovieHeight;
        final long widthFinal;
        if (f1 <= f)
        {
            widthFinal = (int)((float)l * f1);
            heightFinal = l;
        } else
        {
            l = heightFinal;
            heightFinal = (int)((float)heightFinal * (1.0F / f1));
            widthFinal = l;
        }
        Timber.i((new StringBuilder()).append("Setting player size to: ").append(widthFinal).append("x").append(heightFinal).toString(), new Object[0]);
        handler.post(new Runnable() {

            final PlayerView this$0;
            final long val$heightFinal;
            final long val$widthFinal;

            public void run()
            {
                if (player == null)
                {
                    break MISSING_BLOCK_LABEL_68;
                }
                if (player.getStatus().equals(com.adobe.mediacore.MediaPlayer.PlayerState.RELEASED))
                {
                    return;
                }
                try
                {
                    player.getView().setLayoutParams(new android.widget.FrameLayout.LayoutParams((int)widthFinal, (int)heightFinal, 17));
                    return;
                }
                catch (IllegalStateException illegalstateexception) { }
            }

            
            {
                this$0 = PlayerView.this;
                widthFinal = l;
                heightFinal = l1;
                super();
            }
        });
    }





/*
    static long access$1002(PlayerView playerview, long l)
    {
        playerview.savedMovieWidth = l;
        return l;
    }

*/



/*
    static long access$1102(PlayerView playerview, long l)
    {
        playerview.savedMovieHeight = l;
        return l;
    }

*/



/*
    static boolean access$1302(PlayerView playerview, boolean flag)
    {
        playerview.prerollPlaying = flag;
        return flag;
    }

*/







/*
    static double access$502(PlayerView playerview, double d)
    {
        playerview.prerollDuration = d;
        return d;
    }

*/



/*
    static com.adobe.mediacore.MediaPlayer.PlayerState access$602(PlayerView playerview, com.adobe.mediacore.MediaPlayer.PlayerState playerstate)
    {
        playerview.savedPlayerState = playerstate;
        return playerstate;
    }

*/




/*
    static com.adobe.mediacore.MediaPlayer.PlayerState access$902(PlayerView playerview, com.adobe.mediacore.MediaPlayer.PlayerState playerstate)
    {
        playerview.lastPlayerState = playerstate;
        return playerstate;
    }

*/
}
