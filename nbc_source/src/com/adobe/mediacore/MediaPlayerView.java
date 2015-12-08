// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.animation.Animation;
import com.adobe.ave.PlayState;
import com.adobe.ave.VideoEngineView;
import com.adobe.mediacore.logging.Log;
import com.adobe.mediacore.logging.Logger;
import com.adobe.mediacore.metadata.TimedMetadata;

// Referenced classes of package com.adobe.mediacore:
//            VideoEngineDispatcher, VideoEngineAdapter, AdClickEvent, MediaPlayerNotification

public final class MediaPlayerView extends ViewGroup
{
    class ScreenReceiver extends BroadcastReceiver
    {

        final MediaPlayerView this$0;

        public void onReceive(Context context, Intent intent)
        {
            if (intent.getAction().equals("android.intent.action.SCREEN_OFF"))
            {
                MediaPlayerView._logger.i((new StringBuilder()).append(MediaPlayerView.LOG_TAG).append("::ScreenReceiver#onReceive").toString(), "Device screen was turned off.");
                suspendPlayer();
            } else
            if (intent.getAction().equals("android.intent.action.SCREEN_ON"))
            {
                MediaPlayerView._logger.i((new StringBuilder()).append(MediaPlayerView.LOG_TAG).append("::ScreenReceiver#onReceive").toString(), "Device screen was turned on.");
                restorePlayer();
                return;
            }
        }

        ScreenReceiver()
        {
            this$0 = MediaPlayerView.this;
            super();
        }
    }

    private class VideoEngineViewCallback
    {

        private boolean _hasSurface;
        private SurfaceHolder _viewHolder;
        private android.view.SurfaceHolder.Callback _viewHolderCallback;
        final MediaPlayerView this$0;

        private void release()
        {
            if (_viewHolder != null)
            {
                _viewHolder.removeCallback(_viewHolderCallback);
                _viewHolder = null;
            }
        }

        public boolean hasSurface()
        {
            return _hasSurface;
        }



/*
        static boolean access$302(VideoEngineViewCallback videoengineviewcallback, boolean flag)
        {
            videoengineviewcallback._hasSurface = flag;
            return flag;
        }

*/

        public VideoEngineViewCallback(SurfaceView surfaceview)
        {
            this$0 = MediaPlayerView.this;
            super();
            _hasSurface = false;
            _viewHolderCallback = new _cls1();
            if (surfaceview != null && _viewHolder == null)
            {
                _viewHolder = surfaceview.getHolder();
                if (_viewHolder != null)
                {
                    _viewHolder.addCallback(_viewHolderCallback);
                }
            }
        }
    }


    private static final String LOG_TAG = (new StringBuilder()).append("[PSDK]::").append(com/adobe/mediacore/MediaPlayerView.getSimpleName()).toString();
    private static Logger _logger = Log.getLogger(LOG_TAG);
    private BroadcastReceiver _mReceiver;
    private MediaPlayer.PlaybackEventListener _playbackEventListener;
    private VideoEngineAdapter _videoEngineAdapter;
    private VideoEngineDispatcher _videoEngineDispatcher;
    private VideoEngineView _videoEngineView;
    private VideoEngineViewCallback _videoEngineViewCallback;
    private MediaPlayer.PlayerState currentPlayerState;
    private MediaPlayer.PlayerState oldPlayerState;

    MediaPlayerView(Context context, VideoEngineAdapter videoengineadapter, VideoEngineDispatcher videoenginedispatcher)
    {
        super(context);
        _playbackEventListener = new MediaPlayer.PlaybackEventListener() {

            final MediaPlayerView this$0;

            public void onPlayComplete()
            {
            }

            public void onPlayStart()
            {
            }

            public void onPrepared()
            {
            }

            public void onProfileChanged(long l, long l1)
            {
            }

            public void onRatePlaying(float f)
            {
            }

            public void onRateSelected(float f)
            {
            }

            public void onReplaceMediaPlayerItem()
            {
            }

            public void onSizeAvailable(long l, long l1)
            {
            }

            public void onStateChanged(MediaPlayer.PlayerState playerstate, MediaPlayerNotification mediaplayernotification)
            {
                currentPlayerState = playerstate;
            }

            public void onTimedMetadata(TimedMetadata timedmetadata)
            {
            }

            public void onTimelineUpdated()
            {
            }

            public void onUpdated()
            {
            }

            
            {
                this$0 = MediaPlayerView.this;
                super();
            }
        };
        if (videoengineadapter == null)
        {
            throw new IllegalArgumentException("Video engine adapter parameter must not be null.");
        }
        if (videoenginedispatcher == null)
        {
            throw new IllegalArgumentException("Video engine adapter parameter must not be null.");
        } else
        {
            _videoEngineAdapter = videoengineadapter;
            _videoEngineDispatcher = videoenginedispatcher;
            initialize(context);
            return;
        }
    }

    private void initialiseVideoEngineViewCallback(Context context)
    {
        _videoEngineView = new VideoEngineView(context);
        _videoEngineViewCallback = new VideoEngineViewCallback(_videoEngineView);
        addView(_videoEngineView);
    }

    private void initialize(Context context)
    {
        initialiseVideoEngineViewCallback(context);
        _videoEngineDispatcher.addEventListener(MediaPlayer.Event.PLAYBACK, _playbackEventListener);
        IntentFilter intentfilter = new IntentFilter("android.intent.action.SCREEN_ON");
        intentfilter.addAction("android.intent.action.SCREEN_OFF");
        _mReceiver = new ScreenReceiver();
        context.registerReceiver(_mReceiver, intentfilter);
    }

    private void releaseVideoEngineViewCallback()
    {
        if (_videoEngineViewCallback != null)
        {
            _videoEngineViewCallback.release();
            _videoEngineViewCallback = null;
        }
    }

    private void restorePlayer()
    {
        if (_videoEngineViewCallback == null || !_videoEngineViewCallback.hasSurface())
        {
            _logger.w((new StringBuilder()).append(LOG_TAG).append("#restorePlayer").toString(), "Unable to restore player. View surface is not created.");
            return;
        } else
        {
            _videoEngineAdapter.restorePlayer(oldPlayerState);
            return;
        }
    }

    private void suspendPlayer()
    {
        if (_videoEngineAdapter != null && _videoEngineAdapter.getPlayerState() == PlayState.SUSPENDED)
        {
            _logger.w((new StringBuilder()).append(LOG_TAG).append("#suspendPlayer").toString(), "The player is already suspended.");
            return;
        } else
        {
            oldPlayerState = currentPlayerState;
            _videoEngineAdapter.suspendPlayer();
            return;
        }
    }

    public ViewPropertyAnimator animate()
    {
        if (_videoEngineView != null)
        {
            return _videoEngineView.animate();
        } else
        {
            return super.animate();
        }
    }

    public void buildDrawingCache()
    {
        if (_videoEngineView != null)
        {
            _videoEngineView.buildDrawingCache();
        }
    }

    public void buildDrawingCache(boolean flag)
    {
        if (_videoEngineView != null)
        {
            _videoEngineView.buildDrawingCache(flag);
        }
    }

    public void clearAnimation()
    {
        if (_videoEngineView != null)
        {
            _videoEngineView.clearAnimation();
        }
    }

    public void destroyDrawingCache()
    {
        if (_videoEngineView != null)
        {
            _videoEngineView.destroyDrawingCache();
        }
    }

    void detachView()
    {
        _logger.i((new StringBuilder()).append(LOG_TAG).append("#detachView").toString(), "Detaching view.");
        releaseVideoEngineViewCallback();
        if (_videoEngineDispatcher != null)
        {
            _videoEngineDispatcher.removeEventListener(MediaPlayer.Event.PLAYBACK, _playbackEventListener);
            _videoEngineDispatcher = null;
            _playbackEventListener = null;
        }
        _videoEngineView.getContext().unregisterReceiver(_mReceiver);
        _videoEngineView = null;
    }

    public Animation getAnimation()
    {
        if (_videoEngineView != null)
        {
            return _videoEngineView.getAnimation();
        } else
        {
            return super.getAnimation();
        }
    }

    public Drawable getBackground()
    {
        if (_videoEngineView != null)
        {
            return _videoEngineView.getBackground();
        } else
        {
            return super.getBackground();
        }
    }

    public Bitmap getDrawingCache()
    {
        if (_videoEngineView != null)
        {
            return _videoEngineView.getDrawingCache();
        } else
        {
            return super.getDrawingCache();
        }
    }

    public Bitmap getDrawingCache(boolean flag)
    {
        if (_videoEngineView != null)
        {
            return _videoEngineView.getDrawingCache(flag);
        } else
        {
            return super.getDrawingCache(flag);
        }
    }

    public int getDrawingCacheBackgroundColor()
    {
        if (_videoEngineView != null)
        {
            return _videoEngineView.getDrawingCacheBackgroundColor();
        } else
        {
            return super.getDrawingCacheBackgroundColor();
        }
    }

    public int getDrawingCacheQuality()
    {
        if (_videoEngineView != null)
        {
            return _videoEngineView.getDrawingCacheQuality();
        } else
        {
            return super.getDrawingCacheQuality();
        }
    }

    public long getDrawingTime()
    {
        if (_videoEngineView != null)
        {
            return _videoEngineView.getDrawingTime();
        } else
        {
            return super.getDrawingTime();
        }
    }

    public boolean getKeepScreenOn()
    {
        if (_videoEngineView != null)
        {
            return _videoEngineView.getKeepScreenOn();
        } else
        {
            return super.getKeepScreenOn();
        }
    }

    VideoEngineView getVideoEngineView()
    {
        return _videoEngineView;
    }

    public void invalidate()
    {
        if (_videoEngineView != null)
        {
            _videoEngineView.invalidate();
        }
    }

    public void invalidate(int i, int j, int k, int l)
    {
        if (_videoEngineView != null)
        {
            _videoEngineView.invalidate(i, j, k, l);
        }
    }

    public void invalidate(Rect rect)
    {
        if (_videoEngineView != null)
        {
            _videoEngineView.invalidate(rect);
        }
    }

    public void invalidateDrawable(Drawable drawable)
    {
        if (_videoEngineView != null)
        {
            _videoEngineView.invalidateDrawable(drawable);
        }
    }

    public boolean isDrawingCacheEnabled()
    {
        if (_videoEngineView != null)
        {
            return _videoEngineView.isDrawingCacheEnabled();
        } else
        {
            return super.isDrawingCacheEnabled();
        }
    }

    public void notifyClick()
    {
        _videoEngineDispatcher.dispatch(AdClickEvent.createAdClickEvent());
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        _videoEngineView.layout(0, 0, super.getWidth(), super.getHeight());
    }

    public void refreshDrawableState()
    {
        if (_videoEngineView != null)
        {
            _videoEngineView.refreshDrawableState();
        }
    }

    void resetView()
    {
        updateView(_videoEngineView.getContext());
    }

    public void setAnimation(Animation animation)
    {
        if (_videoEngineView != null)
        {
            _videoEngineView.setAnimation(animation);
        }
    }

    public void setBackgroundColor(int i)
    {
        if (_videoEngineView != null)
        {
            _videoEngineView.setBackgroundColor(i);
        }
    }

    public void setBackgroundDrawable(Drawable drawable)
    {
        if (_videoEngineView != null)
        {
            _videoEngineView.setBackgroundDrawable(drawable);
        }
    }

    public void setBackgroundResource(int i)
    {
        if (_videoEngineView != null)
        {
            _videoEngineView.setBackgroundResource(i);
        }
    }

    public void setDrawingCacheBackgroundColor(int i)
    {
        if (_videoEngineView != null)
        {
            _videoEngineView.setDrawingCacheBackgroundColor(i);
        }
    }

    public void setDrawingCacheEnabled(boolean flag)
    {
        if (_videoEngineView != null)
        {
            _videoEngineView.setDrawingCacheEnabled(flag);
        }
    }

    public void setDrawingCacheQuality(int i)
    {
        if (_videoEngineView != null)
        {
            _videoEngineView.setDrawingCacheQuality(i);
        }
    }

    public void setKeepScreenOn(boolean flag)
    {
        if (_videoEngineView != null)
        {
            _videoEngineView.setKeepScreenOn(flag);
        }
    }

    public void setWillNotCacheDrawing(boolean flag)
    {
        if (_videoEngineView != null)
        {
            _videoEngineView.setWillNotCacheDrawing(flag);
        }
    }

    public void setWillNotDraw(boolean flag)
    {
        if (_videoEngineView != null)
        {
            _videoEngineView.setWillNotDraw(flag);
        }
    }

    public void startAnimation(Animation animation)
    {
        if (_videoEngineView != null)
        {
            _videoEngineView.startAnimation(animation);
        }
    }

    void updateVideoEngine(Context context, VideoEngineAdapter videoengineadapter)
    {
        _videoEngineAdapter = videoengineadapter;
        updateView(context);
    }

    void updateView(Context context)
    {
        releaseVideoEngineViewCallback();
        removeView(_videoEngineView);
        _videoEngineView = null;
        initialiseVideoEngineViewCallback(context);
        _videoEngineAdapter.setView(_videoEngineView);
    }

    public boolean willNotCacheDrawing()
    {
        if (_videoEngineView != null)
        {
            return _videoEngineView.willNotCacheDrawing();
        } else
        {
            return super.willNotCacheDrawing();
        }
    }

    public boolean willNotDraw()
    {
        if (_videoEngineView != null)
        {
            return _videoEngineView.willNotDraw();
        } else
        {
            return super.willNotDraw();
        }
    }







/*
    static MediaPlayer.PlayerState access$602(MediaPlayerView mediaplayerview, MediaPlayer.PlayerState playerstate)
    {
        mediaplayerview.currentPlayerState = playerstate;
        return playerstate;
    }

*/

    // Unreferenced inner class com/adobe/mediacore/MediaPlayerView$VideoEngineViewCallback$1

/* anonymous class */
    class VideoEngineViewCallback._cls1
        implements android.view.SurfaceHolder.Callback
    {

        final VideoEngineViewCallback this$1;

        public void surfaceChanged(SurfaceHolder surfaceholder, int i, int j, int k)
        {
        }

        public void surfaceCreated(SurfaceHolder surfaceholder)
        {
            MediaPlayerView._logger.i((new StringBuilder()).append(MediaPlayerView.LOG_TAG).append("#surfaceCreated").toString(), "Media player surface was created.");
            _hasSurface = true;
            restorePlayer();
        }

        public void surfaceDestroyed(SurfaceHolder surfaceholder)
        {
            MediaPlayerView._logger.i((new StringBuilder()).append(MediaPlayerView.LOG_TAG).append("#surfaceDestroyed").toString(), "Media player surface was destroyed.");
            _hasSurface = false;
            suspendPlayer();
        }

            
            {
                this$1 = VideoEngineViewCallback.this;
                super();
            }
    }

}
