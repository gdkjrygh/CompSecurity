// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.player;

import android.content.ContextWrapper;
import android.content.res.Resources;
import android.widget.Toast;
import com.adobe.mediacore.MediaPlayer;
import com.adobe.mediacore.timeline.advertising.AdBreak;
import com.nbcsports.liveextra.content.FavoriteService;
import com.nbcsports.liveextra.library.api.models.Asset;
import com.nbcsports.liveextra.library.api.models.VideoSource;
import com.nbcsports.liveextra.library.player.AdPlaybackEventListenerStub;
import com.nbcsports.liveextra.library.player.PlaybackEventListenerStub;
import com.nbcsports.liveextra.library.preferences.AppPreferences;
import com.nbcsports.liveextra.library.ui.systemui.SystemUiHelper;
import com.nbcsports.liveextra.ui.main.core.AssetViewModel;
import com.nbcsports.liveextra.ui.player.dataviews.DataEngine;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.joda.time.DateTime;
import rx.Observable;
import rx.functions.Func0;

// Referenced classes of package com.nbcsports.liveextra.ui.player:
//            PlayerActivity, PlayerPresenterListener

public class PlayerPresenter extends ContextWrapper
{

    private final PlayerActivity activity;
    private final com.adobe.mediacore.MediaPlayer.EventListener adListener = new AdPlaybackEventListenerStub() {

        final PlayerPresenter this$0;

        public void onAdBreakComplete(AdBreak adbreak)
        {
            super.onAdBreakComplete(adbreak);
            isInAdBreak = false;
            for (adbreak = listeners.iterator(); adbreak.hasNext(); ((PlayerPresenterListener)adbreak.next()).onAdBreakComplete()) { }
        }

        public void onAdBreakStart(AdBreak adbreak)
        {
            super.onAdBreakStart(adbreak);
            isInAdBreak = true;
            for (adbreak = listeners.iterator(); adbreak.hasNext(); ((PlayerPresenterListener)adbreak.next()).onAdBreakStart()) { }
        }

            
            {
                this$0 = PlayerPresenter.this;
                super();
            }
    };
    private Observable clock;
    private final String device = getString(0x7f070032);
    private final FavoriteService favorites;
    private boolean hasOverlays;
    private boolean isFullScreen;
    private boolean isInAdBreak;
    private List listeners;
    private final com.adobe.mediacore.MediaPlayer.EventListener playbackListener = new PlaybackEventListenerStub() {

        final PlayerPresenter this$0;

        public void onPlayComplete()
        {
            super.onPlayComplete();
            for (Iterator iterator = listeners.iterator(); iterator.hasNext(); ((PlayerPresenterListener)iterator.next()).onPlayComplete()) { }
        }

            
            {
                this$0 = PlayerPresenter.this;
                super();
            }
    };
    private final MediaPlayer player;
    private final AppPreferences preferences;
    private final SystemUiHelper systemUiHelper;
    private final AssetViewModel viewModel;

    public PlayerPresenter(PlayerActivity playeractivity, MediaPlayer mediaplayer, SystemUiHelper systemuihelper, AppPreferences apppreferences, AssetViewModel assetviewmodel, FavoriteService favoriteservice, DataEngine dataengine)
    {
        super(playeractivity);
        listeners = new ArrayList();
        clock = Observable.defer(new Func0() {

            final PlayerPresenter this$0;

            public volatile Object call()
            {
                return call();
            }

            public Observable call()
            {
                return Observable.timer(0L, 1L, TimeUnit.SECONDS);
            }

            
            {
                this$0 = PlayerPresenter.this;
                super();
            }
        });
        activity = playeractivity;
        player = mediaplayer;
        systemUiHelper = systemuihelper;
        preferences = apppreferences;
        viewModel = assetviewmodel;
        favorites = favoriteservice;
        boolean flag;
        if (dataengine != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        hasOverlays = flag;
        isFullScreen = apppreferences.showFullScreen();
        if (mediaplayer != null)
        {
            mediaplayer.addEventListener(com.adobe.mediacore.MediaPlayer.Event.PLAYBACK, playbackListener);
            mediaplayer.addEventListener(com.adobe.mediacore.MediaPlayer.Event.AD_PLAYBACK, adListener);
        }
    }

    private void setFullScreenPreference()
    {
        (new Thread(new Runnable() {

            final PlayerPresenter this$0;

            public void run()
            {
                preferences.showFullScreen(isFullScreen);
            }

            
            {
                this$0 = PlayerPresenter.this;
                super();
            }
        })).start();
    }

    public void addFavorite()
    {
        favorites.addFavorite(viewModel.asset());
        Toast.makeText(getBaseContext(), getResources().getString(0x7f07010c), 0).show();
    }

    public void close()
    {
        activity.onBackPressed();
    }

    public Observable getClock()
    {
        return clock;
    }

    public VideoSource getSelectedSource()
    {
        return viewModel.getSelectedSource();
    }

    public String getTitle()
    {
        if (getSelectedSource() == null)
        {
            return viewModel.asset().getTitle();
        } else
        {
            return String.format("%s - %s", new Object[] {
                viewModel.asset().getTitle(), getSelectedSource().getName()
            });
        }
    }

    public int getVideoSourceCount()
    {
        List list = getVideoSources();
        if (list == null)
        {
            return 0;
        } else
        {
            return list.size();
        }
    }

    public List getVideoSources()
    {
        return viewModel.asset().getVideoSources(device);
    }

    public boolean hasOverlays()
    {
        return hasOverlays;
    }

    public void hideChrome()
    {
        if (isFullScreen() || !isFullScreen && android.os.Build.VERSION.SDK_INT >= 19)
        {
            systemUiHelper.hide();
        }
        for (Iterator iterator = listeners.iterator(); iterator.hasNext(); ((PlayerPresenterListener)iterator.next()).onHideChrome()) { }
    }

    public boolean isFavorite()
    {
        return favorites.isFavorite(viewModel.asset().getCoalescedEventId());
    }

    public boolean isFree()
    {
        return viewModel.isFree();
    }

    public boolean isFullScreen()
    {
        return !hasOverlays || hasOverlays && isFullScreen;
    }

    public boolean isInAdBreak()
    {
        return !isReady() || isInAdBreak;
    }

    public boolean isReady()
    {
        if (player == null)
        {
            return true;
        }
        static class _cls5
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
                    $SwitchMap$com$adobe$mediacore$MediaPlayer$PlayerState[com.adobe.mediacore.MediaPlayer.PlayerState.PREPARING.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$com$adobe$mediacore$MediaPlayer$PlayerState[com.adobe.mediacore.MediaPlayer.PlayerState.RELEASED.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$adobe$mediacore$MediaPlayer$PlayerState[com.adobe.mediacore.MediaPlayer.PlayerState.SUSPENDED.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$adobe$mediacore$MediaPlayer$PlayerState[com.adobe.mediacore.MediaPlayer.PlayerState.COMPLETE.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls5..SwitchMap.com.adobe.mediacore.MediaPlayer.PlayerState[player.getStatus().ordinal()])
        {
        default:
            return true;

        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
        case 6: // '\006'
        case 7: // '\007'
            return false;
        }
    }

    public void playerTouched()
    {
        for (Iterator iterator = listeners.iterator(); iterator.hasNext(); ((PlayerPresenterListener)iterator.next()).onPlayerTouch()) { }
    }

    public void register(PlayerPresenterListener playerpresenterlistener)
    {
        if (listeners.contains(playerpresenterlistener))
        {
            return;
        } else
        {
            listeners.add(playerpresenterlistener);
            playerpresenterlistener.onSourceSelected(getSelectedSource());
            playerpresenterlistener.onToggleFullScreen(isFullScreen());
            return;
        }
    }

    public void removeFavorite()
    {
        favorites.deleteFavorite(viewModel.asset().getCoalescedEventId());
        android.content.Context context = getBaseContext();
        Resources resources = getResources();
        int i;
        if (viewModel.asset().isLive() || viewModel.asset().isFuture())
        {
            i = 0x7f070172;
        } else
        {
            i = 0x7f070110;
        }
        Toast.makeText(context, resources.getString(i), 1).show();
    }

    public void seekTo(DateTime datetime)
    {
        player.seek(datetime.getMillis());
    }

    public void selectSource(VideoSource videosource)
    {
        if ((videosource != null || viewModel.getSelectedSource() != null) && (videosource == null || !videosource.equals(viewModel.getSelectedSource())))
        {
            viewModel.setSelectedSource(videosource);
            Iterator iterator = listeners.iterator();
            while (iterator.hasNext()) 
            {
                ((PlayerPresenterListener)iterator.next()).onSourceSelected(videosource);
            }
        }
    }

    public void showChrome()
    {
        for (Iterator iterator = listeners.iterator(); iterator.hasNext(); ((PlayerPresenterListener)iterator.next()).onShowChrome()) { }
    }

    public void showFullScreen(boolean flag)
    {
        isFullScreen = flag;
        for (Iterator iterator = listeners.iterator(); iterator.hasNext(); ((PlayerPresenterListener)iterator.next()).onToggleFullScreen(isFullScreen)) { }
        setFullScreenPreference();
    }

    public void showTempPass(boolean flag)
    {
        if (activity != null && !activity.isFinishing())
        {
            activity.showTempPassDialog(flag);
            if (player.getStatus() == com.adobe.mediacore.MediaPlayer.PlayerState.PLAYING)
            {
                player.pause();
                return;
            }
        }
    }

    public void toggleFullScreen()
    {
        boolean flag;
        if (!isFullScreen)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        isFullScreen = flag;
        for (Iterator iterator = listeners.iterator(); iterator.hasNext(); ((PlayerPresenterListener)iterator.next()).onToggleFullScreen(isFullScreen)) { }
        setFullScreenPreference();
    }

    public void togglePlayPause()
    {
        if (player.getStatus() == com.adobe.mediacore.MediaPlayer.PlayerState.COMPLETE)
        {
            player.reset();
            for (Iterator iterator = listeners.iterator(); iterator.hasNext(); ((PlayerPresenterListener)iterator.next()).onPlayComplete()) { }
        } else
        if (player.getStatus() == com.adobe.mediacore.MediaPlayer.PlayerState.PLAYING)
        {
            player.pause();
        } else
        if (player.getStatus() == com.adobe.mediacore.MediaPlayer.PlayerState.PAUSED)
        {
            player.play();
            return;
        }
    }

    public void toggleQoS()
    {
        for (Iterator iterator = listeners.iterator(); iterator.hasNext(); ((PlayerPresenterListener)iterator.next()).onToggleQos()) { }
    }

    public void unregister(PlayerPresenterListener playerpresenterlistener)
    {
        listeners.remove(playerpresenterlistener);
    }





/*
    static boolean access$302(PlayerPresenter playerpresenter, boolean flag)
    {
        playerpresenter.isInAdBreak = flag;
        return flag;
    }

*/
}
