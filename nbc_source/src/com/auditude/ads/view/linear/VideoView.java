// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.auditude.ads.view.linear;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.widget.MediaController;
import java.io.IOException;
import java.util.Map;

public class VideoView extends SurfaceView
    implements android.widget.MediaController.MediaPlayerControl
{

    private static final int STATE_ERROR = -1;
    private static final int STATE_IDLE = 0;
    private static final int STATE_PAUSED = 4;
    private static final int STATE_PLAYBACK_COMPLETED = 5;
    private static final int STATE_PLAYING = 3;
    private static final int STATE_PREPARED = 2;
    private static final int STATE_PREPARING = 1;
    private String TAG;
    private android.media.MediaPlayer.OnBufferingUpdateListener mBufferingUpdateListener = new android.media.MediaPlayer.OnBufferingUpdateListener() {

        final VideoView this$0;

        public void onBufferingUpdate(MediaPlayer mediaplayer, int i)
        {
            mCurrentBufferPercentage = i;
        }

            
            {
                this$0 = VideoView.this;
                super();
            }
    };
    private boolean mCanPause;
    private boolean mCanSeekBack;
    private boolean mCanSeekForward;
    private android.media.MediaPlayer.OnCompletionListener mCompletionListener = new android.media.MediaPlayer.OnCompletionListener() {

        final VideoView this$0;

        public void onCompletion(MediaPlayer mediaplayer)
        {
            mCurrentState = 5;
            mTargetState = 5;
            if (mMediaController != null)
            {
                mMediaController.hide();
            }
            if (mOnCompletionListener != null)
            {
                mOnCompletionListener.onCompletion(mMediaPlayer);
            }
        }

            
            {
                this$0 = VideoView.this;
                super();
            }
    };
    private int mCurrentBufferPercentage;
    private int mCurrentState;
    private int mDuration;
    private android.media.MediaPlayer.OnErrorListener mErrorListener = new android.media.MediaPlayer.OnErrorListener() {

        final VideoView this$0;

        public boolean onError(MediaPlayer mediaplayer, int i, int j)
        {
            Log.d(TAG, (new StringBuilder("Error: ")).append(i).append(",").append(j).toString());
            mCurrentState = -1;
            mTargetState = -1;
            if (mMediaController != null)
            {
                mMediaController.hide();
            }
            if (mOnErrorListener != null && mOnErrorListener.onError(mMediaPlayer, i, j))
            {
                return true;
            } else
            {
                getWindowToken();
                return true;
            }
        }

            
            {
                this$0 = VideoView.this;
                super();
            }
    };
    private MediaController mMediaController;
    private MediaPlayer mMediaPlayer;
    private android.media.MediaPlayer.OnCompletionListener mOnCompletionListener;
    private android.media.MediaPlayer.OnErrorListener mOnErrorListener;
    private android.media.MediaPlayer.OnPreparedListener mOnPreparedListener;
    android.media.MediaPlayer.OnPreparedListener mPreparedListener = new android.media.MediaPlayer.OnPreparedListener() {

        final VideoView this$0;

        public void onPrepared(MediaPlayer mediaplayer)
        {
            int i;
            mCurrentState = 2;
            if (mOnPreparedListener != null)
            {
                mOnPreparedListener.onPrepared(mMediaPlayer);
            }
            if (mMediaController != null)
            {
                mMediaController.setEnabled(true);
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
            if (mMediaController != null)
            {
                mMediaController.show();
            }
_L4:
            setZOrderOnTop(true);
            setZOrderMediaOverlay(true);
            return;
_L6:
            if (!isPlaying() && (i != 0 || getCurrentPosition() > 0) && mMediaController != null)
            {
                mMediaController.show(0);
            }
            continue; /* Loop/switch isn't completed */
_L2:
            if (mTargetState == 3)
            {
                start();
            }
            if (true) goto _L4; else goto _L7
_L7:
        }

            
            {
                this$0 = VideoView.this;
                super();
            }
    };
    android.view.SurfaceHolder.Callback mSHCallback = new android.view.SurfaceHolder.Callback() {

        final VideoView this$0;

        public void surfaceChanged(SurfaceHolder surfaceholder, int i, int j, int k)
        {
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
                j = 1;
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
            openVideo();
        }

        public void surfaceDestroyed(SurfaceHolder surfaceholder)
        {
            mSurfaceHolder = null;
            if (mMediaController != null)
            {
                mMediaController.hide();
            }
            release(true);
        }

            
            {
                this$0 = VideoView.this;
                super();
            }
    };
    private int mSeekWhenPrepared;
    android.media.MediaPlayer.OnVideoSizeChangedListener mSizeChangedListener = new android.media.MediaPlayer.OnVideoSizeChangedListener() {

        final VideoView this$0;

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
                this$0 = VideoView.this;
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

    public VideoView(Context context)
    {
        super(context);
        TAG = "VideoView";
        mCurrentState = 0;
        mTargetState = 0;
        mSurfaceHolder = null;
        mMediaPlayer = null;
        initVideoView();
    }

    public VideoView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
        initVideoView();
    }

    public VideoView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        TAG = "VideoView";
        mCurrentState = 0;
        mTargetState = 0;
        mSurfaceHolder = null;
        mMediaPlayer = null;
        initVideoView();
    }

    private void attachMediaController()
    {
        if (mMediaPlayer != null && mMediaController != null)
        {
            mMediaController.setMediaPlayer(this);
            Object obj;
            if (getParent() instanceof View)
            {
                obj = (View)getParent();
            } else
            {
                obj = this;
            }
            mMediaController.setAnchorView(((View) (obj)));
            mMediaController.setEnabled(isInPlaybackState());
        }
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
        setZOrderOnTop(true);
        setZOrderMediaOverlay(true);
    }

    private boolean isInPlaybackState()
    {
        return mMediaPlayer != null && mCurrentState != -1 && mCurrentState != 0 && mCurrentState != 1;
    }

    private void openVideo()
    {
        if (mUri == null || mSurfaceHolder == null)
        {
            return;
        }
        (new Intent("com.android.music.musicservicecommand")).putExtra("command", "pause");
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
            mCurrentBufferPercentage = 0;
            mMediaPlayer.setDataSource(getContext(), mUri);
            mMediaPlayer.setDisplay(mSurfaceHolder);
            mMediaPlayer.setAudioStreamType(3);
            mMediaPlayer.setScreenOnWhilePlaying(true);
            mMediaPlayer.prepareAsync();
            mCurrentState = 1;
            attachMediaController();
            return;
        }
        catch (IOException ioexception)
        {
            Log.w(TAG, (new StringBuilder("Unable to open content: ")).append(mUri).toString(), ioexception);
            mCurrentState = -1;
            mTargetState = -1;
            mErrorListener.onError(mMediaPlayer, 1, 0);
            return;
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            Log.w(TAG, (new StringBuilder("Unable to open content: ")).append(mUri).toString(), illegalargumentexception);
        }
        mCurrentState = -1;
        mTargetState = -1;
        mErrorListener.onError(mMediaPlayer, 1, 0);
    }

    private void release(boolean flag)
    {
        if (mMediaPlayer != null)
        {
            mMediaPlayer.reset();
            mMediaPlayer.release();
            mMediaPlayer = null;
            mCurrentState = 0;
            if (flag)
            {
                mTargetState = 0;
            }
        }
    }

    private void toggleMediaControlsVisiblity()
    {
        if (mMediaController.isShowing())
        {
            mMediaController.hide();
            return;
        } else
        {
            mMediaController.show();
            return;
        }
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

    public int getAudioSessionId()
    {
        return 0;
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

    public boolean isPlaying()
    {
        return isInPlaybackState() && mMediaPlayer.isPlaying();
    }

    public boolean onKeyDown(int i, KeyEvent keyevent)
    {
        boolean flag;
        if (i != 4 && i != 24 && i != 25 && i != 82 && i != 5 && i != 6)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!isInPlaybackState() || !flag || mMediaController == null)
        {
            break MISSING_BLOCK_LABEL_140;
        }
        if (i != 79 && i != 85) goto _L2; else goto _L1
_L1:
        if (!mMediaPlayer.isPlaying()) goto _L4; else goto _L3
_L3:
        pause();
        mMediaController.show();
_L6:
        return true;
_L4:
        start();
        mMediaController.hide();
        return true;
_L2:
        if (i != 86)
        {
            break; /* Loop/switch isn't completed */
        }
        if (mMediaPlayer.isPlaying())
        {
            pause();
            mMediaController.show();
            return true;
        }
        if (true) goto _L6; else goto _L5
_L5:
        toggleMediaControlsVisiblity();
        return super.onKeyDown(i, keyevent);
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
        if (isInPlaybackState() && mMediaController != null)
        {
            toggleMediaControlsVisiblity();
        }
        return false;
    }

    public boolean onTrackballEvent(MotionEvent motionevent)
    {
        if (isInPlaybackState() && mMediaController != null)
        {
            toggleMediaControlsVisiblity();
        }
        return false;
    }

    public void pause()
    {
        if (isInPlaybackState() && mMediaPlayer.isPlaying())
        {
            mMediaPlayer.pause();
            mCurrentState = 4;
        }
        mTargetState = 4;
    }

    public int resolveAdjustedSize(int i, int j)
    {
        int k = android.view.View.MeasureSpec.getMode(j);
        j = android.view.View.MeasureSpec.getSize(j);
        switch (k)
        {
        default:
            return i;

        case 0: // '\0'
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

    public void seekTo(int i)
    {
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

    public void setMediaController(MediaController mediacontroller)
    {
        if (mMediaController != null)
        {
            mMediaController.hide();
        }
        mMediaController = mediacontroller;
        attachMediaController();
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
        setVideoURI(uri, null);
    }

    public void setVideoURI(Uri uri, Map map)
    {
        mUri = uri;
        mSeekWhenPrepared = 0;
        openVideo();
        requestLayout();
        invalidate();
    }

    public void start()
    {
        if (isInPlaybackState())
        {
            mMediaPlayer.start();
            mCurrentState = 3;
        }
        mTargetState = 3;
    }

    public void stopPlayback()
    {
        if (mMediaPlayer != null)
        {
            mMediaPlayer.stop();
            mMediaPlayer.release();
            mMediaPlayer = null;
            mCurrentState = 0;
            mTargetState = 0;
        }
    }

    public void suspend()
    {
        release(false);
    }






















}
