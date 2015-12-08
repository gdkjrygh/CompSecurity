// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import com.brightcove.player.display.VideoDisplayComponent;
import com.brightcove.player.event.EventEmitter;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

// Referenced classes of package com.brightcove.player.view:
//            BaseVideoView, BrightcoveSurfaceView, RenderView

public class BrightcoveVideoView extends BaseVideoView
{
    final class a
        implements android.view.SurfaceHolder.Callback
    {

        private BrightcoveVideoView a;

        public final void surfaceChanged(SurfaceHolder surfaceholder, int j, int k, int l)
        {
            BrightcoveVideoView.f();
            (new StringBuilder("Surface changed to ")).append(k).append(", ").append(l);
            a.b.surfaceChanged(surfaceholder, j, k, l);
        }

        public final void surfaceCreated(SurfaceHolder surfaceholder)
        {
            BrightcoveVideoView.f();
            a.a.emit("readyToPlay");
            a.b.surfaceCreated(surfaceholder);
        }

        public final void surfaceDestroyed(SurfaceHolder surfaceholder)
        {
            BrightcoveVideoView.f();
            a.b.surfaceDestroyed(surfaceholder);
        }

        private a()
        {
            a = BrightcoveVideoView.this;
            super();
        }

        a(byte byte0)
        {
            this();
        }
    }


    private static final String f = com/brightcove/player/view/BrightcoveVideoView.getSimpleName();
    private a g;
    private BrightcoveSurfaceView h;
    private Class i;

    public BrightcoveVideoView(Context context)
    {
        super(context);
    }

    public BrightcoveVideoView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public BrightcoveVideoView(Context context, AttributeSet attributeset, int j)
    {
        super(context, attributeset, j);
    }

    static String f()
    {
        return f;
    }

    protected final VideoDisplayComponent a(EventEmitter eventemitter)
    {
        return new VideoDisplayComponent(h, eventemitter);
    }

    protected final void a()
    {
        if (h != null)
        {
            h.setVideoSize(0, 0);
        }
        super.a();
    }

    protected final void a(Context context)
    {
        if (i == null)
        {
            i = com/brightcove/player/view/BrightcoveSurfaceView;
        }
        try
        {
            h = (BrightcoveSurfaceView)i.getConstructors()[0].newInstance(new Object[] {
                context
            });
            g = new a((byte)0);
            h.getHolder().addCallback(g);
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
        addView(h);
        super.a(context);
    }

    protected final void a(android.view.ViewGroup.LayoutParams layoutparams)
    {
        boolean flag = false;
        int k = getChildCount();
        for (int j = 0; j < k; j++)
        {
            if (getChildAt(j).getClass().getName().equals("com.brightcove.ima.GoogleIMAVideoAdPlayer"))
            {
                flag = true;
            }
        }

        if (!flag)
        {
            android.widget.FrameLayout.LayoutParams layoutparams1 = new android.widget.FrameLayout.LayoutParams(layoutparams.width, layoutparams.height);
            layoutparams1.gravity = 17;
            h.setLayoutParams(layoutparams1);
        }
        super.a(layoutparams);
    }

    protected final boolean c()
    {
        return h.isShown();
    }

    public RenderView getRenderView()
    {
        return h;
    }

    public SurfaceView getSurfaceView()
    {
        return h;
    }

    public int getVideoHeight()
    {
        return h.getVideoHeight();
    }

    public int getVideoWidth()
    {
        return h.getVideoWidth();
    }

}
