// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.auditude.ads.view.linear;

import android.content.Context;
import android.media.MediaPlayer;
import android.os.Handler;
import com.auditude.ads.core.AdSettings;
import com.auditude.ads.core.AuditudeEnv;
import com.auditude.ads.model.IAsset;
import com.auditude.ads.model.LinearAsset;
import com.auditude.ads.model.media.MediaFile;
import com.auditude.ads.util.StringUtil;
import com.auditude.ads.util.log.ILogger;
import com.auditude.ads.util.log.Log;
import com.auditude.ads.view.AdView;
import com.auditude.ads.view.ILinearAdView;
import com.auditude.ads.view.IViewController;
import com.auditude.ads.view.model.IAdViewSource;

// Referenced classes of package com.auditude.ads.view.linear:
//            VideoView

public class LinearVideoView extends AdView
    implements android.media.MediaPlayer.OnCompletionListener, android.media.MediaPlayer.OnErrorListener, android.media.MediaPlayer.OnPreparedListener, ILinearAdView
{

    private static final String CATEGORY = "LinearVideoView";
    private static final int UPDATE_FREQUENCY = 500;
    private boolean isVideoReadyToBePlayed;
    private MediaPlayer player;
    private final Handler positionHandler = new Handler();
    private final Runnable updatePositionRunnable = new Runnable() {

        final LinearVideoView this$0;

        public void run()
        {
            updatePosition();
        }

            
            {
                this$0 = LinearVideoView.this;
                super();
            }
    };
    private VideoView videoView;

    public LinearVideoView(Context context)
    {
        super(context);
        isVideoReadyToBePlayed = false;
        setBackgroundColor(0xff000000);
        videoView = new VideoView(context);
        addView(videoView, new android.widget.FrameLayout.LayoutParams(-1, -1, 17));
        videoView.setOnErrorListener(this);
        videoView.setOnPreparedListener(this);
        videoView.setOnCompletionListener(this);
    }

    private void close()
    {
        try
        {
            positionHandler.removeCallbacks(updatePositionRunnable);
            stopVideoPlayback();
        }
        catch (Exception exception) { }
        isVideoReadyToBePlayed = false;
        player = null;
    }

    private void notifyError()
    {
        notifyError(null);
    }

    private void notifyError(String s)
    {
        Log.getLogger("LinearVideoView").info((new StringBuilder("--> LinearVideoView onError")).append(s).toString());
        notifyAdEvent(com.auditude.ads.view.AdViewEvent.AdViewEventType.AD_ERROR);
    }

    private void startVideoPlayback()
    {
        try
        {
            notifyAdEvent(com.auditude.ads.view.AdViewEvent.AdViewEventType.AD_START);
            Log.getLogger("LinearVideoView").info("--> LinearVideoView startVideoPlayback");
            if (player != null)
            {
                player.setVolume(getController().getLeftVolume(), getController().getRightVolume());
            }
            videoView.start();
            videoView.invalidate();
            updatePosition();
            return;
        }
        catch (Exception exception)
        {
            notifyAdEvent(com.auditude.ads.view.AdViewEvent.AdViewEventType.AD_ERROR);
        }
    }

    private void stopVideoPlayback()
    {
        if (player != null)
        {
            Log.getLogger("LinearVideoView").info("--> LinearVideoView stopVideoPlayback");
            videoView.stopPlayback();
        }
    }

    private void updatePosition()
    {
        positionHandler.removeCallbacks(updatePositionRunnable);
        notifyAdEvent(com.auditude.ads.view.AdViewEvent.AdViewEventType.AD_PROGRESS);
        videoView.invalidate();
        positionHandler.postDelayed(updatePositionRunnable, 500L);
    }

    public void dispose()
    {
        close();
        if (videoView != null)
        {
            if (indexOfChild(videoView) >= 0)
            {
                removeView(videoView);
            }
            player = null;
        }
        super.dispose();
    }

    public int getDuration()
    {
        return videoView.getDuration();
    }

    public int getPosition()
    {
        return videoView.getCurrentPosition();
    }

    public void hide(IAdViewSource iadviewsource)
    {
        close();
        super.hide(iadviewsource);
    }

    public void initialize(IViewController iviewcontroller)
    {
        super.initialize(iviewcontroller);
    }

    public void onCompletion(MediaPlayer mediaplayer)
    {
        Log.getLogger("LinearVideoView").info("--> LinearVideoView onCompletion");
        notifyAdEvent(com.auditude.ads.view.AdViewEvent.AdViewEventType.AD_COMPLETE);
    }

    public boolean onError(MediaPlayer mediaplayer, int i, int j)
    {
        switch (i)
        {
        default:
            notifyError("Unknown error");
            return false;

        case 1: // '\001'
            notifyError("Unable to play media");
            return false;

        case 100: // 'd'
            notifyError("Server failed");
            return false;

        case 200: 
            notifyError("Invalid media");
            break;
        }
        return false;
    }

    public void onPrepared(MediaPlayer mediaplayer)
    {
        Log.getLogger("LinearVideoView").info("--> LinearVideoView OnPrepared");
        isVideoReadyToBePlayed = true;
        player = mediaplayer;
        if (isVideoReadyToBePlayed)
        {
            startVideoPlayback();
        }
    }

    public final void pause()
    {
        try
        {
            videoView.pause();
            return;
        }
        catch (IllegalStateException illegalstateexception)
        {
            return;
        }
    }

    public void reset()
    {
        super.reset();
        close();
    }

    protected void resize(int i, int j)
    {
        super.resize(i, j);
    }

    public final void resume()
    {
        try
        {
            videoView.start();
            return;
        }
        catch (IllegalStateException illegalstateexception)
        {
            return;
        }
    }

    public void setVolume(float f, float f1)
    {
        if (player != null)
        {
            player.setVolume(f, f1);
        }
    }

    public void show(IAdViewSource iadviewsource)
    {
        String s;
        AdSettings adsettings;
        boolean flag;
        super.show(iadviewsource);
        adsettings = AuditudeEnv.getInstance().getAdSettings();
        flag = false;
        if (adsettings.getProperty("repackageCreativeEnabled") != null)
        {
            flag = Boolean.valueOf(adsettings.getProperty("repackageCreativeEnabled").toString()).booleanValue();
        }
        s = "";
        if (adsettings.getProperty("repackageCreativeFormat") != null)
        {
            s = adsettings.getProperty("repackageCreativeFormat").toString();
        }
        adsettings = null;
        if (!StringUtil.isNotNullOrEmpty(s) || !flag) goto _L2; else goto _L1
_L1:
        s = adsettings;
        if (getAsset() != null)
        {
            s = adsettings;
            if (iadviewsource.getAsset() instanceof LinearAsset)
            {
                s = ((LinearAsset)getAsset()).getBestMediaFile().source;
            }
        }
_L4:
        if (s == null)
        {
            notifyError();
            return;
        }
        break; /* Loop/switch isn't completed */
_L2:
        s = adsettings;
        if (getAsset() != null)
        {
            s = getAsset().getUrl();
        }
        if (true) goto _L4; else goto _L3
_L3:
        try
        {
            videoView.setVideoPath(s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (IAdViewSource iadviewsource)
        {
            iadviewsource.printStackTrace();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (IAdViewSource iadviewsource)
        {
            iadviewsource.printStackTrace();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (IAdViewSource iadviewsource)
        {
            iadviewsource.printStackTrace();
        }
        return;
    }

}
