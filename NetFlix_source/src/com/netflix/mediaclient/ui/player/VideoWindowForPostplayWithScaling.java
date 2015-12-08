// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.player;

import android.view.TextureView;
import android.view.View;
import android.widget.RelativeLayout;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.android.widget.TappableSurfaceView;
import com.netflix.mediaclient.util.AndroidUtils;
import com.netflix.mediaclient.util.DeviceUtils;
import com.netflix.mediaclient.util.ViewUtils;

// Referenced classes of package com.netflix.mediaclient.ui.player:
//            VideoWindowForPostplay, PlayerActivity

public class VideoWindowForPostplayWithScaling
    implements VideoWindowForPostplay
{
    protected static class SurfaceState
    {

        int bottomMargin;
        int leftMargin;
        int rightMargin;
        int surfaceMode;
        int topMargin;

        SurfaceState(int i, int j, int k, int l, int i1)
        {
            bottomMargin = i;
            topMargin = j;
            leftMargin = k;
            rightMargin = l;
            surfaceMode = i1;
        }
    }


    protected static String TAG = "nf_postplay";
    private final int END_MARGIN_LEFT_DP = 12;
    private final int END_MARGIN_TOP_DP = 12;
    private final int END_WIDTH_DP = 300;
    protected PlayerActivity mContext;
    protected SurfaceState mOriginalSurfaceState;
    protected VideoWindowForPostplayWithAnimation.ScaleAnimationParameters mParams;
    protected RelativeLayout mParent;
    protected TappableSurfaceView mSurface;
    protected TextureView mSurface2;

    VideoWindowForPostplayWithScaling(PlayerActivity playeractivity)
    {
        mContext = playeractivity;
        mSurface = (TappableSurfaceView)playeractivity.findViewById(0x7f070147);
        mSurface2 = (TextureView)playeractivity.findViewById(0x7f07014c);
        mParent = (RelativeLayout)playeractivity.findViewById(0x7f0700ff);
        if (mSurface == null)
        {
            Log.w(TAG, "PostPlayWithScaling:: surface not found");
        }
        if (mSurface2 == null)
        {
            Log.w(TAG, "PostPlayWithScaling:: surface2 not found");
        }
        if (mParent == null)
        {
            Log.w(TAG, "PostPlayWithScaling:: rootFrame not found");
        }
        int i = DeviceUtils.getScreenWidthInPixels(mContext);
        int j = AndroidUtils.dipToPixels(mContext, 12);
        mParams = new VideoWindowForPostplayWithAnimation.ScaleAnimationParameters(0, 0, 0, 1.0F, AndroidUtils.dipToPixels(mContext, 12), j, (float)AndroidUtils.dipToPixels(mContext, 300) / (float)i);
    }

    protected void addCenterInParent(View view)
    {
        if (view != null)
        {
            android.widget.RelativeLayout.LayoutParams layoutparams = (android.widget.RelativeLayout.LayoutParams)view.getLayoutParams();
            layoutparams.addRule(13, -1);
            view.setLayoutParams(layoutparams);
        }
    }

    public void animateIn()
    {
        Log.d(TAG, "PostPlayWithScaling:: doTransitionToPostPlay starts");
        mOriginalSurfaceState = getCurrentSurfaceState();
        if (Log.isLoggable(TAG, 3))
        {
            Log.d(TAG, (new StringBuilder()).append("doTransitionToPostPlay bottom margin: ").append(mOriginalSurfaceState.bottomMargin).toString());
            Log.d(TAG, (new StringBuilder()).append("doTransitionToPostPlay top margin: ").append(mOriginalSurfaceState.topMargin).toString());
            Log.d(TAG, (new StringBuilder()).append("doTransitionToPostPlay left margin: ").append(mOriginalSurfaceState.leftMargin).toString());
            Log.d(TAG, (new StringBuilder()).append("doTransitionToPostPlay right margin: ").append(mOriginalSurfaceState.rightMargin).toString());
            Log.d(TAG, (new StringBuilder()).append("doTransitionToPostPlay new left margin: ").append(0).toString());
            Log.d(TAG, (new StringBuilder()).append("doTransitionToPostPlay new top margin: ").append(0).toString());
        }
        removeCenterInParent(mSurface);
        removeCenterInParent(mSurface2);
        resizeVideo(0, 0, mParams.getEndScale());
        Log.d(TAG, "PostPlayWithScaling:: doTransitionToPostPlay ends after request layout");
    }

    public void animateOut(Runnable runnable)
    {
        Log.d(TAG, "PostPlayWithScaling:: doTransitionFromPostPlay starts");
        runnable = (android.widget.RelativeLayout.LayoutParams)mSurface.getLayoutParams();
        if (mOriginalSurfaceState == null)
        {
            Log.e(TAG, "Previos state unknown");
            mOriginalSurfaceState = new SurfaceState(0, 0, 0, 0, 0);
        }
        runnable.addRule(13, -1);
        runnable.setMargins(mOriginalSurfaceState.leftMargin, mOriginalSurfaceState.topMargin, mOriginalSurfaceState.rightMargin, mOriginalSurfaceState.bottomMargin);
        mSurface.setLayoutParams(runnable);
        mSurface.setMode(mOriginalSurfaceState.surfaceMode);
        mSurface.postInvalidate();
        if (mSurface2 != null)
        {
            runnable = (android.widget.RelativeLayout.LayoutParams)mSurface2.getLayoutParams();
            runnable.addRule(13, -1);
            runnable.setMargins(mOriginalSurfaceState.leftMargin, mOriginalSurfaceState.topMargin, mOriginalSurfaceState.rightMargin, mOriginalSurfaceState.bottomMargin);
            mSurface2.setLayoutParams(runnable);
            mSurface2.postInvalidate();
        }
        Log.d(TAG, "PostPlayWithScaling:: doTransitionFromPostPlay ends after request layout");
    }

    public boolean canVideoVindowResize()
    {
        return true;
    }

    protected SurfaceState getCurrentSurfaceState()
    {
        android.widget.RelativeLayout.LayoutParams layoutparams = (android.widget.RelativeLayout.LayoutParams)mSurface.getLayoutParams();
        return new SurfaceState(layoutparams.bottomMargin, layoutparams.topMargin, layoutparams.leftMargin, layoutparams.rightMargin, mSurface.getMode());
    }

    protected VideoWindowForPostplayWithAnimation.ScaleAnimationParameters getTransitionToPostPlayAnimationParameters()
    {
        return mParams;
    }

    protected void removeCenterInParent(View view)
    {
        if (view == null)
        {
            return;
        }
        android.widget.RelativeLayout.LayoutParams layoutparams = (android.widget.RelativeLayout.LayoutParams)view.getLayoutParams();
        if (AndroidUtils.getAndroidVersion() >= 17)
        {
            layoutparams.removeRule(13);
        } else
        {
            layoutparams.addRule(13, 0);
        }
        view.setLayoutParams(layoutparams);
    }

    protected void resizeSurfaceView(int i, int j, float f)
    {
        android.widget.RelativeLayout.LayoutParams layoutparams = (android.widget.RelativeLayout.LayoutParams)mSurface.getLayoutParams();
        layoutparams.setMargins(i, j, 0, 0);
        mSurface.setLayoutParams(layoutparams);
        mSurface.setScale(f);
        mSurface.postInvalidate();
    }

    protected void resizeTextureView(int i, int j)
    {
        if (mSurface2 != null)
        {
            android.widget.RelativeLayout.LayoutParams layoutparams = (android.widget.RelativeLayout.LayoutParams)mSurface2.getLayoutParams();
            layoutparams.setMargins(i, j, 0, 0);
            mSurface2.setLayoutParams(layoutparams);
            mSurface2.postInvalidate();
        }
    }

    protected void resizeVideo(final int leftMargin, final int topMargin, final float scale)
    {
        mContext.runInUiThread(new Runnable() {

            final VideoWindowForPostplayWithScaling this$0;
            final int val$leftMargin;
            final float val$scale;
            final int val$topMargin;

            public void run()
            {
                resizeSurfaceView(leftMargin, topMargin, scale);
                resizeTextureView(leftMargin, topMargin);
            }

            
            {
                this$0 = VideoWindowForPostplayWithScaling.this;
                leftMargin = i;
                topMargin = j;
                scale = f;
                super();
            }
        });
    }

    public void setVisible(boolean flag)
    {
        if (flag)
        {
            ViewUtils.setVisibility(mSurface, com.netflix.mediaclient.util.ViewUtils.Visibility.VISIBLE);
            ViewUtils.setVisibility(mSurface2, com.netflix.mediaclient.util.ViewUtils.Visibility.VISIBLE);
            return;
        } else
        {
            ViewUtils.setVisibility(mSurface, com.netflix.mediaclient.util.ViewUtils.Visibility.INVISIBLE);
            ViewUtils.setVisibility(mSurface2, com.netflix.mediaclient.util.ViewUtils.Visibility.INVISIBLE);
            return;
        }
    }

}
