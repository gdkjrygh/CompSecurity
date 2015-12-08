// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.view;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import com.brightcove.player.display.VideoDisplayComponent;
import com.brightcove.player.event.EventEmitter;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

// Referenced classes of package com.brightcove.player.view:
//            BaseVideoView, BrightcoveSurfaceView, am, RenderView

public class BrightcoveVideoView extends BaseVideoView
{

    private static final String p = com/brightcove/player/view/BrightcoveVideoView.getSimpleName();
    protected am m;
    protected BrightcoveSurfaceView n;
    protected Class o;

    public BrightcoveVideoView(Context context)
    {
        super(context);
    }

    public BrightcoveVideoView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public BrightcoveVideoView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    static String h()
    {
        return p;
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
        Log.i(p, "init");
        if (o == null)
        {
            o = com/brightcove/player/view/BrightcoveSurfaceView;
        }
        try
        {
            n = (BrightcoveSurfaceView)o.getConstructors()[0].newInstance(new Object[] {
                context
            });
            m = new am(this, null);
            n.getHolder().addCallback(m);
        }
        catch (IllegalAccessException illegalaccessexception)
        {
            illegalaccessexception.printStackTrace();
        }
        catch (InstantiationException instantiationexception)
        {
            instantiationexception.printStackTrace();
        }
        catch (InvocationTargetException invocationtargetexception)
        {
            invocationtargetexception.printStackTrace();
        }
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

    public SurfaceView getSurfaceView()
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
        Log.i(p, "onTouchEvent");
        d();
        return false;
    }

    protected void setChildLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        boolean flag = false;
        int j = getChildCount();
        for (int i = 0; i < j; i++)
        {
            if (getChildAt(i).getClass().getName().equals("com.brightcove.ima.GoogleIMAVideoAdPlayer"))
            {
                flag = true;
            }
        }

        if (!flag)
        {
            android.widget.FrameLayout.LayoutParams layoutparams1 = new android.widget.FrameLayout.LayoutParams(layoutparams.width, layoutparams.height);
            layoutparams1.gravity = 17;
            n.setLayoutParams(layoutparams1);
        }
        super.setChildLayoutParams(layoutparams);
    }

}
