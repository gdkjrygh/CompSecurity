// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.controls;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.widget.MediaController;
import java.util.Map;
import me.lyft.android.logging.L;

public class TextureVideoView extends TextureView
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

        final TextureVideoView this$0;

        public void onBufferingUpdate(MediaPlayer mediaplayer, int i)
        {
            mCurrentBufferPercentage = i;
        }

            
            {
                this$0 = TextureVideoView.this;
                super();
            }
    };
    private android.media.MediaPlayer.OnCompletionListener mCompletionListener = new android.media.MediaPlayer.OnCompletionListener() {

        final TextureVideoView this$0;

        public void onCompletion(MediaPlayer mediaplayer)
        {
            if (mCurrentState != 5)
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
                    return;
                }
            }
        }

            
            {
                this$0 = TextureVideoView.this;
                super();
            }
    };
    private Context mContext;
    private int mCurrentBufferPercentage;
    private int mCurrentState;
    private android.media.MediaPlayer.OnErrorListener mErrorListener = new android.media.MediaPlayer.OnErrorListener() {

        final TextureVideoView this$0;

        public boolean onError(MediaPlayer mediaplayer, int i, int j)
        {
            mediaplayer = (new StringBuilder()).append("Error: ").append(i).append(",").append(j).toString();
            L.e(new IllegalStateException((new StringBuilder()).append(TAG).append(" ").append(mediaplayer).toString()), mediaplayer, new Object[0]);
            mCurrentState = -1;
            mTargetState = -1;
            if (mMediaController != null)
            {
                mMediaController.hide();
            }
            while (mOnErrorListener != null && mOnErrorListener.onError(mMediaPlayer, i, j) || getWindowToken() == null || mOnCompletionListener == null) 
            {
                return true;
            }
            mOnCompletionListener.onCompletion(mMediaPlayer);
            return true;
        }

            
            {
                this$0 = TextureVideoView.this;
                super();
            }
    };
    private android.media.MediaPlayer.OnInfoListener mInfoListener = new android.media.MediaPlayer.OnInfoListener() {

        final TextureVideoView this$0;

        public boolean onInfo(MediaPlayer mediaplayer, int i, int j)
        {
            return true;
        }

            
            {
                this$0 = TextureVideoView.this;
                super();
            }
    };
    private MediaController mMediaController;
    private MediaPlayer mMediaPlayer;
    private android.media.MediaPlayer.OnCompletionListener mOnCompletionListener;
    private android.media.MediaPlayer.OnErrorListener mOnErrorListener;
    private android.media.MediaPlayer.OnPreparedListener mOnPreparedListener;
    android.media.MediaPlayer.OnPreparedListener mPreparedListener = new android.media.MediaPlayer.OnPreparedListener() {

        final TextureVideoView this$0;

        public void onPrepared(MediaPlayer mediaplayer)
        {
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
            if (mVideoWidth == 0 || mVideoHeight == 0) goto _L2; else goto _L1
_L1:
            getSurfaceTexture().setDefaultBufferSize(mVideoWidth, mVideoHeight);
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
            return;
_L6:
            if (!isPlaying() && getCurrentPosition() > 0 && mMediaController != null)
            {
                mMediaController.show(0);
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
                this$0 = TextureVideoView.this;
                super();
            }
    };
    android.media.MediaPlayer.OnVideoSizeChangedListener mSizeChangedListener = new android.media.MediaPlayer.OnVideoSizeChangedListener() {

        final TextureVideoView this$0;

        public void onVideoSizeChanged(MediaPlayer mediaplayer, int i, int j)
        {
            mVideoWidth = mediaplayer.getVideoWidth();
            mVideoHeight = mediaplayer.getVideoHeight();
            if (mVideoWidth != 0 && mVideoHeight != 0)
            {
                getSurfaceTexture().setDefaultBufferSize(mVideoWidth, mVideoHeight);
                requestLayout();
            }
        }

            
            {
                this$0 = TextureVideoView.this;
                super();
            }
    };
    private Surface mSurface;
    private int mSurfaceHeight;
    android.view.TextureView.SurfaceTextureListener mSurfaceTextureListener = new android.view.TextureView.SurfaceTextureListener() {

        final TextureVideoView this$0;

        public void onSurfaceTextureAvailable(SurfaceTexture surfacetexture, int i, int j)
        {
            mSurface = new Surface(surfacetexture);
            openVideo();
        }

        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfacetexture)
        {
            mSurface.release();
            mSurface = null;
            if (mMediaController != null)
            {
                mMediaController.hide();
            }
            release(true);
            return true;
        }

        public void onSurfaceTextureSizeChanged(SurfaceTexture surfacetexture, int i, int j)
        {
            boolean flag1 = true;
            mSurfaceWidth = getWidth();
            mSurfaceHeight = getHeight();
            boolean flag;
            if (mTargetState == 3)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (mVideoWidth == i && mVideoHeight == j)
            {
                i = ((flag1) ? 1 : 0);
            } else
            {
                i = 0;
            }
            if (mMediaPlayer != null && flag && i != 0)
            {
                start();
            }
        }

        public void onSurfaceTextureUpdated(SurfaceTexture surfacetexture)
        {
        }

            
            {
                this$0 = TextureVideoView.this;
                super();
            }
    };
    private int mSurfaceWidth;
    private int mTargetState;
    private Uri mUri;
    private int mVideoHeight;
    private int mVideoWidth;

    public TextureVideoView(Context context)
    {
        super(context);
        TAG = "TextureVideoView";
        mCurrentState = 0;
        mTargetState = 0;
        mSurface = null;
        mMediaPlayer = null;
        initVideoView();
    }

    public TextureVideoView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        TAG = "TextureVideoView";
        mCurrentState = 0;
        mTargetState = 0;
        mSurface = null;
        mMediaPlayer = null;
        initVideoView();
    }

    public TextureVideoView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        TAG = "TextureVideoView";
        mCurrentState = 0;
        mTargetState = 0;
        mSurface = null;
        mMediaPlayer = null;
        initVideoView();
    }

    public TextureVideoView(Context context, AttributeSet attributeset, int i, int j)
    {
        super(context, attributeset, i, j);
        TAG = "TextureVideoView";
        mCurrentState = 0;
        mTargetState = 0;
        mSurface = null;
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
        mContext = getContext();
        mVideoWidth = 0;
        mVideoHeight = 0;
        setSurfaceTextureListener(mSurfaceTextureListener);
        mCurrentState = 0;
        mTargetState = 0;
    }

    private boolean isInPlaybackState()
    {
        return mMediaPlayer != null && mCurrentState != -1 && mCurrentState != 0 && mCurrentState != 1;
    }

    private void openVideo()
    {
        if (mUri == null || mSurface == null)
        {
            return;
        }
        release(false);
        try
        {
            mMediaPlayer = new MediaPlayer();
            mMediaPlayer.setOnPreparedListener(mPreparedListener);
            mMediaPlayer.setOnVideoSizeChangedListener(mSizeChangedListener);
            mMediaPlayer.setOnCompletionListener(mCompletionListener);
            mMediaPlayer.setOnErrorListener(mErrorListener);
            mMediaPlayer.setOnInfoListener(mInfoListener);
            mMediaPlayer.setOnBufferingUpdateListener(mBufferingUpdateListener);
            mCurrentBufferPercentage = 0;
            mMediaPlayer.setDataSource(mContext, mUri, null);
            mMediaPlayer.setSurface(mSurface);
            mMediaPlayer.setAudioStreamType(3);
            mMediaPlayer.setScreenOnWhilePlaying(true);
            mMediaPlayer.prepareAsync();
            mCurrentState = 1;
            attachMediaController();
            return;
        }
        catch (Throwable throwable)
        {
            L.e(throwable, (new StringBuilder()).append(TAG).append(" Unable to open content: ").append(mUri).toString(), new Object[0]);
        }
        mCurrentState = -1;
        mTargetState = -1;
        mErrorListener.onError(mMediaPlayer, 1, 0);
    }

    public boolean canPause()
    {
        return false;
    }

    public boolean canSeekBackward()
    {
        return false;
    }

    public boolean canSeekForward()
    {
        return false;
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
            return mMediaPlayer.getDuration();
        } else
        {
            return -1;
        }
    }

    public boolean isPlaying()
    {
        return isInPlaybackState() && mMediaPlayer.isPlaying();
    }

    protected void onMeasure(int i, int j)
    {
        int k;
        int l;
        int i1;
        int k1;
        i1 = getDefaultSize(mVideoWidth, i);
        k1 = getDefaultSize(mVideoHeight, j);
        l = k1;
        k = i1;
        if (mVideoWidth <= 0) goto _L2; else goto _L1
_L1:
        l = k1;
        k = i1;
        if (mVideoHeight <= 0) goto _L2; else goto _L3
_L3:
        int l1;
        k1 = android.view.View.MeasureSpec.getMode(i);
        i = android.view.View.MeasureSpec.getSize(i);
        l1 = android.view.View.MeasureSpec.getMode(j);
        j = android.view.View.MeasureSpec.getSize(j);
        if (k1 != 0x40000000 || l1 != 0x40000000) goto _L5; else goto _L4
_L4:
        if (mVideoWidth * j < mVideoHeight * i)
        {
            k = (mVideoWidth * j) / mVideoHeight;
            l = j;
        } else
        if (mVideoWidth * j > mVideoHeight * i)
        {
            l = (mVideoHeight * i) / mVideoWidth;
            k = i;
        } else
        {
            l = j;
            k = i;
        }
_L2:
        setMeasuredDimension(k, l);
        return;
_L5:
        if (k1 == 0x40000000)
        {
            l = (mVideoHeight * i) / mVideoWidth;
            int j1;
            if (l1 == 0x80000000 && l > j)
            {
                l = j;
                k = i;
            } else
            {
                k = i;
            }
        } else
        if (l1 == 0x40000000)
        {
            j1 = (mVideoWidth * j) / mVideoHeight;
            l = j;
            k = j1;
            if (k1 == 0x80000000)
            {
                l = j;
                k = j1;
                if (j1 > i)
                {
                    l = j;
                    k = i;
                }
            }
        } else
        {
            j1 = mVideoWidth;
            k = mVideoHeight;
            if (l1 == 0x80000000 && k > j)
            {
                j1 = (mVideoWidth * j) / mVideoHeight;
            } else
            {
                j = k;
            }
            l = j;
            k = j1;
            if (k1 == 0x80000000)
            {
                l = j;
                k = j1;
                if (j1 > i)
                {
                    l = (mVideoHeight * i) / mVideoWidth;
                    k = i;
                }
            }
        }
        if (true) goto _L2; else goto _L6
_L6:
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

    public void release(boolean flag)
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

    public void seekTo(int i)
    {
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



/*
    static int access$002(TextureVideoView texturevideoview, int i)
    {
        texturevideoview.mVideoWidth = i;
        return i;
    }

*/




/*
    static int access$102(TextureVideoView texturevideoview, int i)
    {
        texturevideoview.mVideoHeight = i;
        return i;
    }

*/



/*
    static int access$1202(TextureVideoView texturevideoview, int i)
    {
        texturevideoview.mCurrentBufferPercentage = i;
        return i;
    }

*/



/*
    static Surface access$1302(TextureVideoView texturevideoview, Surface surface)
    {
        texturevideoview.mSurface = surface;
        return surface;
    }

*/




/*
    static int access$202(TextureVideoView texturevideoview, int i)
    {
        texturevideoview.mCurrentState = i;
        return i;
    }

*/






/*
    static int access$602(TextureVideoView texturevideoview, int i)
    {
        texturevideoview.mSurfaceWidth = i;
        return i;
    }

*/



/*
    static int access$702(TextureVideoView texturevideoview, int i)
    {
        texturevideoview.mSurfaceHeight = i;
        return i;
    }

*/



/*
    static int access$802(TextureVideoView texturevideoview, int i)
    {
        texturevideoview.mTargetState = i;
        return i;
    }

*/

}
