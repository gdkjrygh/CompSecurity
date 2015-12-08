// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.content.browser;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.DialogInterface;
import android.graphics.Point;
import android.util.Log;
import android.view.Display;
import android.view.KeyEvent;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import org.chromium.base.ThreadUtils;
import org.chromium.ui.base.ViewAndroid;
import org.chromium.ui.base.ViewAndroidDelegate;
import org.chromium.ui.base.WindowAndroid;

// Referenced classes of package org.chromium.content.browser:
//            ContentVideoViewClient

public class ContentVideoView extends FrameLayout
    implements android.view.SurfaceHolder.Callback, ViewAndroidDelegate
{
    private static class ProgressView extends LinearLayout
    {

        private final ProgressBar mProgressBar;
        private final TextView mTextView;

        public ProgressView(Context context, String s)
        {
            super(context);
            setOrientation(1);
            setLayoutParams(new android.widget.LinearLayout.LayoutParams(-2, -2));
            mProgressBar = new ProgressBar(context, null, 0x101007a);
            mTextView = new TextView(context);
            mTextView.setText(s);
            addView(mProgressBar);
            addView(mTextView);
        }
    }

    private class VideoSurfaceView extends SurfaceView
    {

        final ContentVideoView this$0;

        protected void onMeasure(int i, int j)
        {
            boolean flag = true;
            boolean flag1 = true;
            int k = ((flag1) ? 1 : 0);
            int l = ((flag) ? 1 : 0);
            if (mVideoWidth > 0)
            {
                k = ((flag1) ? 1 : 0);
                l = ((flag) ? 1 : 0);
                if (mVideoHeight > 0)
                {
                    i = getDefaultSize(mVideoWidth, i);
                    j = getDefaultSize(mVideoHeight, j);
                    if (mVideoWidth * j > mVideoHeight * i)
                    {
                        k = (mVideoHeight * i) / mVideoWidth;
                        l = i;
                    } else
                    {
                        k = j;
                        l = i;
                        if (mVideoWidth * j < mVideoHeight * i)
                        {
                            l = (mVideoWidth * j) / mVideoHeight;
                            k = j;
                        }
                    }
                }
            }
            if (mUmaRecorded)
            {
                if (mPlaybackStartTime == mOrientationChangedTime)
                {
                    if (isOrientationPortrait() != mInitialOrientation)
                    {
                        mOrientationChangedTime = System.currentTimeMillis();
                    }
                } else
                if (!mPossibleAccidentalChange && isOrientationPortrait() == mInitialOrientation && System.currentTimeMillis() - mOrientationChangedTime < 5000L)
                {
                    mPossibleAccidentalChange = true;
                }
            }
            setMeasuredDimension(l, k);
        }

        public VideoSurfaceView(Context context)
        {
            this$0 = ContentVideoView.this;
            super(context);
        }
    }


    private static final int MEDIA_BUFFERING_UPDATE = 3;
    private static final int MEDIA_ERROR = 100;
    public static final int MEDIA_ERROR_INVALID_CODE = 3;
    public static final int MEDIA_ERROR_NOT_VALID_FOR_PROGRESSIVE_PLAYBACK = 2;
    private static final int MEDIA_INFO = 200;
    private static final int MEDIA_NOP = 0;
    private static final int MEDIA_PLAYBACK_COMPLETE = 2;
    private static final int MEDIA_PREPARED = 1;
    private static final int MEDIA_SEEK_COMPLETE = 4;
    private static final int MEDIA_SET_VIDEO_SIZE = 5;
    private static final int STATE_ERROR = -1;
    private static final int STATE_IDLE = 0;
    private static final int STATE_PAUSED = 2;
    private static final int STATE_PLAYBACK_COMPLETED = 3;
    private static final int STATE_PLAYING = 1;
    private static final String TAG = "ContentVideoView";
    private final ContentVideoViewClient mClient;
    private int mCurrentState;
    private int mDuration;
    private String mErrorButton;
    private String mErrorTitle;
    private final Runnable mExitFullscreenRunnable = new Runnable() {

        final ContentVideoView this$0;

        public void run()
        {
            exitFullscreen(true);
        }

            
            {
                this$0 = ContentVideoView.this;
                super();
            }
    };
    private boolean mInitialOrientation;
    private long mNativeContentVideoView;
    private long mOrientationChangedTime;
    private String mPlaybackErrorText;
    private long mPlaybackStartTime;
    private boolean mPossibleAccidentalChange;
    private View mProgressView;
    private SurfaceHolder mSurfaceHolder;
    private boolean mUmaRecorded;
    private String mUnknownErrorText;
    private int mVideoHeight;
    private String mVideoLoadingText;
    private VideoSurfaceView mVideoSurfaceView;
    private int mVideoWidth;
    private ViewAndroid mViewAndroid;

    protected ContentVideoView(Context context, long l, ContentVideoViewClient contentvideoviewclient)
    {
        super(context);
        mCurrentState = 0;
        mNativeContentVideoView = l;
        mViewAndroid = new ViewAndroid(new WindowAndroid(context.getApplicationContext()), this);
        mClient = contentvideoviewclient;
        mUmaRecorded = false;
        mPossibleAccidentalChange = false;
        initResources(context);
        mVideoSurfaceView = new VideoSurfaceView(context);
        showContentVideoView();
        setVisibility(0);
    }

    private static ContentVideoView createContentVideoView(Context context, long l, ContentVideoViewClient contentvideoviewclient)
    {
        ThreadUtils.assertOnUiThread();
        context = new ContentVideoView(context, l, contentvideoviewclient);
        if (context.getContentVideoViewClient().onShowCustomView(context))
        {
            return context;
        } else
        {
            return null;
        }
    }

    public static ContentVideoView getContentVideoView()
    {
        return nativeGetSingletonJavaContentVideoView();
    }

    private long getNativeViewAndroid()
    {
        return mViewAndroid.getNativePointer();
    }

    private void initResources(Context context)
    {
        if (mPlaybackErrorText != null)
        {
            return;
        } else
        {
            mPlaybackErrorText = context.getString(org.chromium.content.R.string.media_player_error_text_invalid_progressive_playback);
            mUnknownErrorText = context.getString(org.chromium.content.R.string.media_player_error_text_unknown);
            mErrorButton = context.getString(org.chromium.content.R.string.media_player_error_button);
            mErrorTitle = context.getString(org.chromium.content.R.string.media_player_error_title);
            mVideoLoadingText = context.getString(org.chromium.content.R.string.media_player_loading_video);
            return;
        }
    }

    private static boolean isActivityContext(Context context)
    {
        if ((context instanceof ContextWrapper) && !(context instanceof Activity))
        {
            return isActivityContext(((ContextWrapper)context).getBaseContext());
        } else
        {
            return context instanceof Activity;
        }
    }

    private boolean isOrientationPortrait()
    {
        boolean flag = false;
        Display display = ((WindowManager)getContext().getSystemService("window")).getDefaultDisplay();
        Point point = new Point(0, 0);
        display.getSize(point);
        if (point.x <= point.y)
        {
            flag = true;
        }
        return flag;
    }

    private native void nativeExitFullscreen(long l, boolean flag);

    private native int nativeGetCurrentPosition(long l);

    private native int nativeGetDurationInMilliSeconds(long l);

    private static native ContentVideoView nativeGetSingletonJavaContentVideoView();

    private native int nativeGetVideoHeight(long l);

    private native int nativeGetVideoWidth(long l);

    private native boolean nativeIsPlaying(long l);

    private native void nativePause(long l);

    private native void nativePlay(long l);

    private native void nativeRecordExitFullscreenPlayback(long l, boolean flag, long l1, long l2);

    private native void nativeRecordFullscreenPlayback(long l, boolean flag, boolean flag1);

    private native void nativeRequestMediaMetadata(long l);

    private native void nativeSeekTo(long l, int i);

    private native void nativeSetSurface(long l, Surface surface);

    private void onExitFullscreen()
    {
        exitFullscreen(false);
    }

    private void onPlaybackComplete()
    {
        onCompletion();
    }

    private void onVideoSizeChanged(int i, int j)
    {
        mVideoWidth = i;
        mVideoHeight = j;
        mVideoSurfaceView.getHolder().setFixedSize(mVideoWidth, mVideoHeight);
    }

    public View acquireAnchorView()
    {
        View view = new View(getContext());
        addView(view);
        return view;
    }

    protected void destroyContentVideoView(boolean flag)
    {
        if (mVideoSurfaceView != null)
        {
            removeSurfaceView();
            setVisibility(8);
            mClient.onDestroyContentVideoView();
        }
        if (flag)
        {
            mNativeContentVideoView = 0L;
        }
    }

    public void exitFullscreen(boolean flag)
    {
        destroyContentVideoView(false);
        if (mNativeContentVideoView != 0L)
        {
            if (mUmaRecorded && !mPossibleAccidentalChange)
            {
                long l = System.currentTimeMillis();
                long l3 = mOrientationChangedTime - mPlaybackStartTime;
                long l1 = l - mOrientationChangedTime;
                long l2 = l3;
                l = l1;
                if (l3 == 0L)
                {
                    l = 0L;
                    l2 = l1;
                }
                nativeRecordExitFullscreenPlayback(mNativeContentVideoView, mInitialOrientation, l2, l);
            }
            nativeExitFullscreen(mNativeContentVideoView, flag);
            mNativeContentVideoView = 0L;
        }
    }

    protected ContentVideoViewClient getContentVideoViewClient()
    {
        return mClient;
    }

    protected int getCurrentPosition()
    {
        if (isInPlaybackState() && mNativeContentVideoView != 0L)
        {
            return nativeGetCurrentPosition(mNativeContentVideoView);
        } else
        {
            return 0;
        }
    }

    protected int getDuration()
    {
        if (isInPlaybackState())
        {
            if (mDuration > 0)
            {
                return mDuration;
            }
            if (mNativeContentVideoView != 0L)
            {
                mDuration = nativeGetDurationInMilliSeconds(mNativeContentVideoView);
            } else
            {
                mDuration = 0;
            }
            return mDuration;
        } else
        {
            mDuration = -1;
            return mDuration;
        }
    }

    protected SurfaceView getSurfaceView()
    {
        return mVideoSurfaceView;
    }

    protected boolean isInPlaybackState()
    {
        return mCurrentState != -1 && mCurrentState != 0;
    }

    public boolean isPlaying()
    {
        return mNativeContentVideoView != 0L && nativeIsPlaying(mNativeContentVideoView);
    }

    protected void onBufferingUpdate(int i)
    {
    }

    protected void onCompletion()
    {
        mCurrentState = 3;
    }

    public boolean onKeyUp(int i, KeyEvent keyevent)
    {
        if (i == 4)
        {
            exitFullscreen(false);
            return true;
        } else
        {
            return super.onKeyUp(i, keyevent);
        }
    }

    public void onMediaPlayerError(int i)
    {
        Log.d("ContentVideoView", (new StringBuilder()).append("OnMediaPlayerError: ").append(i).toString());
        break MISSING_BLOCK_LABEL_26;
        if (mCurrentState != -1 && mCurrentState != 3 && i != 3)
        {
            mCurrentState = -1;
            if (!isActivityContext(getContext()))
            {
                Log.w("ContentVideoView", "Unable to show alert dialog because it requires an activity context");
                return;
            }
            if (getWindowToken() != null)
            {
                String s;
                if (i == 2)
                {
                    s = mPlaybackErrorText;
                } else
                {
                    s = mUnknownErrorText;
                }
                try
                {
                    (new android.app.AlertDialog.Builder(getContext())).setTitle(mErrorTitle).setMessage(s).setPositiveButton(mErrorButton, new android.content.DialogInterface.OnClickListener() {

                        final ContentVideoView this$0;

                        public void onClick(DialogInterface dialoginterface, int j)
                        {
                            onCompletion();
                        }

            
            {
                this$0 = ContentVideoView.this;
                super();
            }
                    }).setCancelable(false).show();
                    return;
                }
                catch (RuntimeException runtimeexception)
                {
                    Log.e("ContentVideoView", (new StringBuilder()).append("Cannot show the alert dialog, error message: ").append(s).toString(), runtimeexception);
                }
                return;
            }
        }
        return;
    }

    protected void onUpdateMediaMetadata(int i, int j, int k, boolean flag, boolean flag1, boolean flag2)
    {
        flag = true;
        mDuration = k;
        mProgressView.setVisibility(8);
        if (isPlaying())
        {
            k = 1;
        } else
        {
            k = 2;
        }
        mCurrentState = k;
        onVideoSizeChanged(i, j);
        if (!mUmaRecorded)
        {
            try
            {
                k = android.provider.Settings.System.getInt(getContext().getContentResolver(), "accelerometer_rotation");
            }
            catch (android.provider.Settings.SettingNotFoundException settingnotfoundexception)
            {
                return;
            }
            if (k != 0)
            {
                mInitialOrientation = isOrientationPortrait();
                mUmaRecorded = true;
                mPlaybackStartTime = System.currentTimeMillis();
                mOrientationChangedTime = mPlaybackStartTime;
                long l = mNativeContentVideoView;
                if (j <= i)
                {
                    flag = false;
                }
                nativeRecordFullscreenPlayback(l, flag, mInitialOrientation);
                return;
            }
        }
    }

    protected void openVideo()
    {
        if (mSurfaceHolder != null)
        {
            mCurrentState = 0;
            if (mNativeContentVideoView != 0L)
            {
                nativeRequestMediaMetadata(mNativeContentVideoView);
                nativeSetSurface(mNativeContentVideoView, mSurfaceHolder.getSurface());
            }
        }
    }

    protected void pause()
    {
        if (isInPlaybackState() && isPlaying())
        {
            if (mNativeContentVideoView != 0L)
            {
                nativePause(mNativeContentVideoView);
            }
            mCurrentState = 2;
        }
    }

    public void releaseAnchorView(View view)
    {
        removeView(view);
    }

    public void removeSurfaceView()
    {
        removeView(mVideoSurfaceView);
        removeView(mProgressView);
        mVideoSurfaceView = null;
        mProgressView = null;
    }

    protected void seekTo(int i)
    {
        if (mNativeContentVideoView != 0L)
        {
            nativeSeekTo(mNativeContentVideoView, i);
        }
    }

    public void setAnchorViewPosition(View view, float f, float f1, float f2, float f3)
    {
        Log.e("ContentVideoView", "setAnchorViewPosition isn't implemented");
    }

    protected void showContentVideoView()
    {
        mVideoSurfaceView.getHolder().addCallback(this);
        addView(mVideoSurfaceView, new android.widget.FrameLayout.LayoutParams(-2, -2, 17));
        mProgressView = mClient.getVideoLoadingProgressView();
        if (mProgressView == null)
        {
            mProgressView = new ProgressView(getContext(), mVideoLoadingText);
        }
        addView(mProgressView, new android.widget.FrameLayout.LayoutParams(-2, -2, 17));
    }

    protected void start()
    {
        if (isInPlaybackState())
        {
            if (mNativeContentVideoView != 0L)
            {
                nativePlay(mNativeContentVideoView);
            }
            mCurrentState = 1;
        }
    }

    public void surfaceChanged(SurfaceHolder surfaceholder, int i, int j, int k)
    {
    }

    public void surfaceCreated(SurfaceHolder surfaceholder)
    {
        mSurfaceHolder = surfaceholder;
        openVideo();
    }

    public void surfaceDestroyed(SurfaceHolder surfaceholder)
    {
        if (mNativeContentVideoView != 0L)
        {
            nativeSetSurface(mNativeContentVideoView, null);
        }
        mSurfaceHolder = null;
        post(mExitFullscreenRunnable);
    }







/*
    static long access$402(ContentVideoView contentvideoview, long l)
    {
        contentvideoview.mOrientationChangedTime = l;
        return l;
    }

*/





/*
    static boolean access$702(ContentVideoView contentvideoview, boolean flag)
    {
        contentvideoview.mPossibleAccidentalChange = flag;
        return flag;
    }

*/
}
