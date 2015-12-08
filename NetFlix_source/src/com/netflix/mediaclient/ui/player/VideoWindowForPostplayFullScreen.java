// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.player;

import android.view.TextureView;
import android.widget.RelativeLayout;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.android.widget.TappableSurfaceView;
import com.netflix.mediaclient.util.ViewUtils;

// Referenced classes of package com.netflix.mediaclient.ui.player:
//            VideoWindowForPostplay, PlayerActivity

public class VideoWindowForPostplayFullScreen
    implements VideoWindowForPostplay
{

    protected static String TAG = "nf_postplay";
    protected PlayerActivity mContext;
    protected RelativeLayout mParent;
    protected TappableSurfaceView mSurface;
    protected TextureView mSurface2;

    public VideoWindowForPostplayFullScreen(PlayerActivity playeractivity)
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
    }

    public void animateIn()
    {
    }

    public void animateOut(Runnable runnable)
    {
    }

    public boolean canVideoVindowResize()
    {
        return false;
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
