// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.admarvel.android.ads;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.util.Log;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import com.admarvel.android.util.Logging;
import java.io.IOException;
import java.lang.ref.WeakReference;

// Referenced classes of package com.admarvel.android.ads:
//            Utils, AdMarvelVideoActivity

class AdMarvelVideoView extends SurfaceView
    implements android.widget.MediaController.MediaPlayerControl
{
    public static interface AdMarvelVideoViewListener
    {

        public abstract void onLoadingFinish();

        public abstract void onNetworkUnavailable();

        public abstract void onVideoPause();

        public abstract void onVideoResume();

        public abstract void onVideoStop();

        public abstract void onVideoTouch();
    }


    private static final int STATE_ERROR = -1;
    private static final int STATE_IDLE = 0;
    private static final int STATE_PAUSED = 4;
    private static final int STATE_PLAYBACK_COMPLETED = 5;
    private static final int STATE_PLAYING = 3;
    private static final int STATE_PREPARED = 2;
    private static final int STATE_PREPARING = 1;
    private final WeakReference activityReference;
    private AdMarvelVideoViewListener listener;
    private android.media.MediaPlayer.OnBufferingUpdateListener mBufferingUpdateListener = new android.media.MediaPlayer.OnBufferingUpdateListener() {

        final AdMarvelVideoView this$0;

        public void onBufferingUpdate(MediaPlayer mediaplayer, int i)
        {
            mCurrentBufferPercentage = i;
        }

            
            {
                this$0 = AdMarvelVideoView.this;
                super();
            }
    };
    private boolean mCanPause;
    private boolean mCanSeekBack;
    private boolean mCanSeekForward;
    private android.media.MediaPlayer.OnCompletionListener mCompletionListener = new android.media.MediaPlayer.OnCompletionListener() {

        final AdMarvelVideoView this$0;

        public void onCompletion(MediaPlayer mediaplayer)
        {
            mCurrentState = 5;
            mTargetState = 5;
            if (mOnCompletionListener != null)
            {
                mOnCompletionListener.onCompletion(mMediaPlayer);
            }
        }

            
            {
                this$0 = AdMarvelVideoView.this;
                super();
            }
    };
    private Context mContext;
    private int mCurrentBufferPercentage;
    private int mCurrentState;
    private int mDuration;
    private android.media.MediaPlayer.OnErrorListener mErrorListener = new android.media.MediaPlayer.OnErrorListener() {

        final AdMarvelVideoView this$0;

        public boolean onError(MediaPlayer mediaplayer, int i, int j)
        {
            mCurrentState = -1;
            mTargetState = -1;
            if (listener != null)
            {
                listener.onLoadingFinish();
            }
            if (mOnErrorListener != null)
            {
                if (!mOnErrorListener.onError(mMediaPlayer, i, j));
            }
            return true;
        }

            
            {
                this$0 = AdMarvelVideoView.this;
                super();
            }
    };
    private MediaPlayer mMediaPlayer;
    private android.media.MediaPlayer.OnCompletionListener mOnCompletionListener;
    private android.media.MediaPlayer.OnErrorListener mOnErrorListener;
    private android.media.MediaPlayer.OnPreparedListener mOnPreparedListener;
    android.media.MediaPlayer.OnPreparedListener mPreparedListener = new android.media.MediaPlayer.OnPreparedListener() {

        final AdMarvelVideoView this$0;

        public void onPrepared(MediaPlayer mediaplayer)
        {
            int i;
            mCurrentState = 2;
            AdMarvelVideoView admarvelvideoview = AdMarvelVideoView.this;
            AdMarvelVideoView admarvelvideoview1 = AdMarvelVideoView.this;
            mCanSeekForward = true;
            admarvelvideoview1.mCanSeekBack = true;
            admarvelvideoview.mCanPause = true;
            if (mOnPreparedListener != null)
            {
                mOnPreparedListener.onPrepared(mMediaPlayer);
            }
            if (listener != null)
            {
                listener.onLoadingFinish();
            }
            mVideoWidth = mediaplayer.getVideoWidth();
            mVideoHeight = mediaplayer.getVideoHeight();
            i = mSeekWhenPrepared;
            if (i != 0)
            {
                seekTo(i);
            }
            if (mVideoWidth == 0 || mVideoHeight == 0) goto _L2; else goto _L1
_L1:
            getHolder().setFixedSize(mVideoWidth, mVideoHeight);
            if (mSurfaceWidth != mVideoWidth || mSurfaceHeight != mVideoHeight) goto _L4; else goto _L3
_L3:
            if (mTargetState != 3) goto _L6; else goto _L5
_L5:
            start();
_L4:
            return;
_L6:
            if (!isPlaying() && i == 0)
            {
                getCurrentPosition();
                return;
            }
            continue; /* Loop/switch isn't completed */
_L2:
            if (mTargetState == 3)
            {
                start();
                return;
            }
            if (true) goto _L4; else goto _L7
_L7:
        }

            
            {
                this$0 = AdMarvelVideoView.this;
                super();
            }
    };
    android.view.SurfaceHolder.Callback mSHCallback = new android.view.SurfaceHolder.Callback() {

        final AdMarvelVideoView this$0;

        public void surfaceChanged(SurfaceHolder surfaceholder, int i, int j, int k)
        {
            boolean flag = true;
            mSurfaceWidth = j;
            mSurfaceHeight = k;
            if (mTargetState == 3)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            if (mVideoWidth == j && mVideoHeight == k)
            {
                j = ((flag) ? 1 : 0);
            } else
            {
                j = 0;
            }
            if (mMediaPlayer != null && i != 0 && j != 0)
            {
                if (mSeekWhenPrepared != 0)
                {
                    seekTo(mSeekWhenPrepared);
                }
                start();
            }
        }

        public void surfaceCreated(SurfaceHolder surfaceholder)
        {
            mSurfaceHolder = surfaceholder;
            if (activityReference != null)
            {
                surfaceholder = (AdMarvelVideoActivity)activityReference.get();
                if (surfaceholder != null && ((AdMarvelVideoActivity) (surfaceholder)).videoState != AdMarvelVideoActivity.VideoPlayerState.Stopped && ((AdMarvelVideoActivity) (surfaceholder)).videoState != AdMarvelVideoActivity.VideoPlayerState.Finished && ((AdMarvelVideoActivity) (surfaceholder)).videoState != AdMarvelVideoActivity.VideoPlayerState.PausedByToolbar)
                {
                    openVideo();
                }
                return;
            } else
            {
                openVideo();
                return;
            }
        }

        public void surfaceDestroyed(SurfaceHolder surfaceholder)
        {
            mSurfaceHolder = null;
            release(true);
        }

            
            {
                this$0 = AdMarvelVideoView.this;
                super();
            }
    };
    private android.media.MediaPlayer.OnSeekCompleteListener mSeekCompleteListener = new android.media.MediaPlayer.OnSeekCompleteListener() {

        final AdMarvelVideoView this$0;

        public void onSeekComplete(MediaPlayer mediaplayer)
        {
            if (listener != null)
            {
                listener.onLoadingFinish();
            }
        }

            
            {
                this$0 = AdMarvelVideoView.this;
                super();
            }
    };
    private int mSeekWhenPrepared;
    android.media.MediaPlayer.OnVideoSizeChangedListener mSizeChangedListener = new android.media.MediaPlayer.OnVideoSizeChangedListener() {

        final AdMarvelVideoView this$0;

        public void onVideoSizeChanged(MediaPlayer mediaplayer, int i, int j)
        {
            mVideoWidth = mediaplayer.getVideoWidth();
            mVideoHeight = mediaplayer.getVideoHeight();
            if (mVideoWidth != 0 && mVideoHeight != 0)
            {
                getHolder().setFixedSize(mVideoWidth, mVideoHeight);
            }
        }

            
            {
                this$0 = AdMarvelVideoView.this;
                super();
            }
    };
    private int mSurfaceHeight;
    private SurfaceHolder mSurfaceHolder;
    private int mSurfaceWidth;
    private int mTargetState;
    private Uri mUri;
    private int mVideoHeight;
    private int mVideoWidth;
    private int videoCurrentPosition;

    public AdMarvelVideoView(Context context)
    {
        super(context);
        mCurrentState = 0;
        mTargetState = 0;
        mSurfaceHolder = null;
        mMediaPlayer = null;
        videoCurrentPosition = 0;
        mContext = context;
        activityReference = null;
        initVideoView();
    }

    public AdMarvelVideoView(AdMarvelVideoActivity admarvelvideoactivity, Context context)
    {
        super(context);
        mCurrentState = 0;
        mTargetState = 0;
        mSurfaceHolder = null;
        mMediaPlayer = null;
        videoCurrentPosition = 0;
        mContext = context;
        activityReference = new WeakReference(admarvelvideoactivity);
        initVideoView();
    }

    private void initVideoView()
    {
        mVideoWidth = 0;
        mVideoHeight = 0;
        getHolder().addCallback(mSHCallback);
        getHolder().setType(3);
        setFocusable(true);
        setFocusableInTouchMode(true);
        requestFocus();
        mCurrentState = 0;
        mTargetState = 0;
    }

    private boolean isInPlaybackState()
    {
        return mMediaPlayer != null && mCurrentState != -1 && mCurrentState != 0 && mCurrentState != 1;
    }

    private void openVideo()
    {
        if (mUri != null && mSurfaceHolder != null)
        {
            if (!Utils.checkNetworkConnection(mContext))
            {
                if (listener != null)
                {
                    listener.onNetworkUnavailable();
                    return;
                }
            } else
            {
                Intent intent = new Intent("com.android.music.musicservicecommand");
                intent.putExtra("command", "pause");
                mContext.sendBroadcast(intent);
                release(false);
                try
                {
                    mMediaPlayer = new MediaPlayer();
                    mMediaPlayer.setOnPreparedListener(mPreparedListener);
                    mMediaPlayer.setOnVideoSizeChangedListener(mSizeChangedListener);
                    mDuration = -1;
                    mMediaPlayer.setOnCompletionListener(mCompletionListener);
                    mMediaPlayer.setOnErrorListener(mErrorListener);
                    mMediaPlayer.setOnBufferingUpdateListener(mBufferingUpdateListener);
                    mMediaPlayer.setOnSeekCompleteListener(mSeekCompleteListener);
                    mCurrentBufferPercentage = 0;
                    mMediaPlayer.setDataSource(mContext, mUri);
                    mMediaPlayer.setDisplay(mSurfaceHolder);
                    mMediaPlayer.setAudioStreamType(3);
                    mMediaPlayer.setScreenOnWhilePlaying(true);
                    mMediaPlayer.prepareAsync();
                    mCurrentState = 1;
                    return;
                }
                catch (IOException ioexception)
                {
                    mCurrentState = -1;
                    mTargetState = -1;
                    mErrorListener.onError(mMediaPlayer, 1, 0);
                    return;
                }
                catch (IllegalArgumentException illegalargumentexception)
                {
                    mCurrentState = -1;
                }
                mTargetState = -1;
                mErrorListener.onError(mMediaPlayer, 1, 0);
                return;
            }
        }
    }

    private int valueInSeconds(long l)
    {
        return (int)l / 1000;
    }

    public boolean canPause()
    {
        return mCanPause;
    }

    public boolean canSeekBackward()
    {
        return mCanSeekBack;
    }

    public boolean canSeekForward()
    {
        return mCanSeekForward;
    }

    public int getBufferPercentage()
    {
        if (mMediaPlayer != null)
        {
            return mCurrentBufferPercentage;
        } else
        {
            return 0;
        }
    }

    public int getCurrentPosition()
    {
        if (isInPlaybackState())
        {
            return mMediaPlayer.getCurrentPosition();
        } else
        {
            return 0;
        }
    }

    public int getDuration()
    {
        if (isInPlaybackState())
        {
            if (mDuration > 0)
            {
                return mDuration;
            } else
            {
                mDuration = mMediaPlayer.getDuration();
                return mDuration;
            }
        } else
        {
            mDuration = -1;
            return mDuration;
        }
    }

    public int getVideoHeight()
    {
        if (mMediaPlayer != null)
        {
            return mMediaPlayer.getVideoHeight();
        } else
        {
            return 0;
        }
    }

    public boolean isPlaying()
    {
        return isInPlaybackState() && mMediaPlayer.isPlaying();
    }

    public void mute()
    {
        if (isInPlaybackState())
        {
            mMediaPlayer.setVolume(0.0F, 0.0F);
        }
    }

    protected void onMeasure(int i, int j)
    {
        int k;
        int l;
        k = getDefaultSize(mVideoWidth, i);
        l = getDefaultSize(mVideoHeight, j);
        i = l;
        j = k;
        if (mVideoWidth <= 0) goto _L2; else goto _L1
_L1:
        i = l;
        j = k;
        if (mVideoHeight <= 0) goto _L2; else goto _L3
_L3:
        if (mVideoWidth * l <= mVideoHeight * k) goto _L5; else goto _L4
_L4:
        i = (mVideoHeight * k) / mVideoWidth;
        j = k;
_L2:
        setMeasuredDimension(j, i);
        return;
_L5:
        i = l;
        j = k;
        if (mVideoWidth * l < mVideoHeight * k)
        {
            j = (mVideoWidth * l) / mVideoHeight;
            i = l;
        }
        if (true) goto _L2; else goto _L6
_L6:
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        if (listener != null)
        {
            listener.onVideoTouch();
        }
        return false;
    }

    public boolean onTrackballEvent(MotionEvent motionevent)
    {
        return false;
    }

    public void pause()
    {
        try
        {
            if (isInPlaybackState() && mMediaPlayer.isPlaying())
            {
                mMediaPlayer.pause();
                mCurrentState = 4;
                if (listener != null)
                {
                    listener.onVideoPause();
                }
                videoCurrentPosition = getCurrentPosition();
            }
            mTargetState = 4;
            return;
        }
        catch (IllegalStateException illegalstateexception)
        {
            Logging.log(Log.getStackTraceString(illegalstateexception));
        }
    }

    public void release(boolean flag)
    {
        try
        {
            if (mMediaPlayer == null)
            {
                break MISSING_BLOCK_LABEL_40;
            }
            mMediaPlayer.reset();
            mMediaPlayer.release();
            mMediaPlayer = null;
            mCurrentState = 0;
        }
        catch (Exception exception)
        {
            Logging.log(Log.getStackTraceString(exception));
            return;
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_40;
        }
        mTargetState = 0;
    }

    public int resolveAdjustedSize(int i, int j)
    {
        int k = android.view.View.MeasureSpec.getMode(j);
        j = android.view.View.MeasureSpec.getSize(j);
        switch (k)
        {
        case 0: // '\0'
        default:
            return i;

        case -2147483648: 
            return Math.min(i, j);

        case 1073741824: 
            return j;
        }
    }

    public void resume()
    {
        openVideo();
    }

    public void resumeVideoIfPaused()
    {
        if (videoCurrentPosition > 0)
        {
            if (valueInSeconds(videoCurrentPosition) == valueInSeconds(getCurrentPosition()))
            {
                start();
                if (listener != null)
                {
                    listener.onLoadingFinish();
                }
            } else
            {
                seekToNow(videoCurrentPosition);
            }
            if (listener != null)
            {
                listener.onVideoResume();
            }
            return;
        } else
        {
            start();
            return;
        }
    }

    public void seekTo(int i)
    {
        if (!Utils.checkNetworkConnection(mContext))
        {
            if (listener != null)
            {
                listener.onNetworkUnavailable();
            }
            return;
        }
        if (isInPlaybackState())
        {
            mMediaPlayer.seekTo(i);
            mSeekWhenPrepared = 0;
            return;
        } else
        {
            mSeekWhenPrepared = i;
            return;
        }
    }

    public void seekToNow(int i)
    {
        if (!Utils.checkNetworkConnection(mContext))
        {
            if (listener != null)
            {
                listener.onNetworkUnavailable();
            }
            return;
        }
        if (mMediaPlayer == null)
        {
            mSeekWhenPrepared = i;
            openVideo();
            return;
        } else
        {
            mMediaPlayer.seekTo(i);
            return;
        }
    }

    public void setListener(AdMarvelVideoViewListener admarvelvideoviewlistener)
    {
        listener = admarvelvideoviewlistener;
    }

    public void setOnCompletionListener(android.media.MediaPlayer.OnCompletionListener oncompletionlistener)
    {
        mOnCompletionListener = oncompletionlistener;
    }

    public void setOnErrorListener(android.media.MediaPlayer.OnErrorListener onerrorlistener)
    {
        mOnErrorListener = onerrorlistener;
    }

    public void setOnPreparedListener(android.media.MediaPlayer.OnPreparedListener onpreparedlistener)
    {
        mOnPreparedListener = onpreparedlistener;
    }

    public void setVideoPath(String s)
    {
        setVideoURI(Uri.parse(s));
    }

    public void setVideoURI(Uri uri)
    {
        try
        {
            if (mMediaPlayer != null)
            {
                Logging.log("AdMarvelVideoView-ResetMedia Player");
                mMediaPlayer.reset();
            }
            mUri = uri;
            mSeekWhenPrepared = 0;
            openVideo();
            requestLayout();
            invalidate();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Uri uri)
        {
            Logging.log(Log.getStackTraceString(uri));
        }
    }

    public void start()
    {
        try
        {
            if (isInPlaybackState())
            {
                mMediaPlayer.start();
                mCurrentState = 3;
            }
            mTargetState = 3;
            videoCurrentPosition = 0;
            return;
        }
        catch (IllegalStateException illegalstateexception)
        {
            Logging.log(Log.getStackTraceString(illegalstateexception));
        }
    }

    public void stopPlayback()
    {
        try
        {
            if (mMediaPlayer != null)
            {
                mMediaPlayer.stop();
                mMediaPlayer.reset();
                mMediaPlayer.release();
                mMediaPlayer = null;
                mCurrentState = 0;
                mTargetState = 0;
                if (listener != null)
                {
                    listener.onVideoStop();
                }
            }
            return;
        }
        catch (Exception exception)
        {
            Logging.log(Log.getStackTraceString(exception));
        }
    }

    public void suspend()
    {
        if (!Utils.checkNetworkConnection(mContext))
        {
            if (listener != null)
            {
                listener.onNetworkUnavailable();
            }
            return;
        } else
        {
            release(false);
            return;
        }
    }

    public void unmute()
    {
        if (isInPlaybackState())
        {
            mMediaPlayer.setVolume(1.0F, 1.0F);
        }
    }

    public void updateCurrentPosition()
    {
        videoCurrentPosition = getCurrentPosition();
    }
























}
