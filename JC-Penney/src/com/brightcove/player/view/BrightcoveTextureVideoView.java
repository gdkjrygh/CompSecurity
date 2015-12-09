// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.view;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.TextureView;
import com.brightcove.player.display.VideoDisplayComponent;
import com.brightcove.player.event.EventEmitter;

// Referenced classes of package com.brightcove.player.view:
//            BaseVideoView, BrightcoveTextureView, ak, RenderView

public class BrightcoveTextureVideoView extends BaseVideoView
{

    private static final String o = com/brightcove/player/view/BrightcoveTextureVideoView.getSimpleName();
    protected ak m;
    protected BrightcoveTextureView n;

    public BrightcoveTextureVideoView(Context context)
    {
        super(context);
    }

    public BrightcoveTextureVideoView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public BrightcoveTextureVideoView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    static String h()
    {
        return o;
    }

    protected VideoDisplayComponent a(EventEmitter eventemitter)
    {
        return new VideoDisplayComponent(n, eventemitter);
    }

    protected void a()
    {
        if (n != null)
        {
            n.setVideoSize(0, 0);
        }
        super.a();
    }

    protected void a(Context context)
    {
        Log.i(o, "init");
        n = new BrightcoveTextureView(context);
        m = new ak(this, null);
        n.setSurfaceTextureListener(m);
        addView(n);
        super.a(context);
    }

    protected boolean e()
    {
        return n.isShown();
    }

    public RenderView getRenderView()
    {
        return n;
    }

    public TextureView getTextureView()
    {
        return n;
    }

    public int getVideoHeight()
    {
        return n.getVideoHeight();
    }

    public int getVideoWidth()
    {
        return n.getVideoWidth();
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        Log.i(o, "onTouchEvent");
        d();
        return false;
    }

    protected void setChildLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        android.widget.FrameLayout.LayoutParams layoutparams1 = new android.widget.FrameLayout.LayoutParams(layoutparams.width, layoutparams.height);
        layoutparams1.gravity = 17;
        n.setLayoutParams(layoutparams1);
        super.setChildLayoutParams(layoutparams);
    }

}
