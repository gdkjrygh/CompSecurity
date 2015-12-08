// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.view;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Looper;

// Referenced classes of package com.brightcove.player.view:
//            BrightcoveSurfaceView

public class BrightcoveClosedCaptioningSurfaceView extends BrightcoveSurfaceView
{

    private android.media.SubtitleTrack.RenderingWidget a;
    private android.media.SubtitleTrack.RenderingWidget.OnChangedListener b;

    public BrightcoveClosedCaptioningSurfaceView(Context context)
    {
        super(context);
    }

    public void draw(Canvas canvas)
    {
        super.draw(canvas);
        if (a != null)
        {
            int i = canvas.save();
            canvas.translate(getPaddingLeft(), getPaddingTop());
            a.draw(canvas);
            canvas.restoreToCount(i);
        }
    }

    public Looper getSubtitleLooper()
    {
        return Looper.getMainLooper();
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        if (a != null)
        {
            a.onAttachedToWindow();
        }
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        if (a != null)
        {
            a.onDetachedFromWindow();
        }
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        super.onLayout(flag, i, j, k, l);
        if (a != null)
        {
            i = getWidth();
            j = getPaddingLeft();
            k = getPaddingRight();
            l = getHeight();
            int i1 = getPaddingTop();
            int j1 = getPaddingBottom();
            a.setSize(i - j - k, l - i1 - j1);
        }
    }

    public void setSubtitleWidget(android.media.SubtitleTrack.RenderingWidget renderingwidget)
    {
        if (a == renderingwidget)
        {
            return;
        }
        boolean flag = isAttachedToWindow();
        if (a != null)
        {
            if (flag)
            {
                a.onDetachedFromWindow();
            }
            a.setOnChangedListener(null);
        }
        a = renderingwidget;
        if (renderingwidget != null)
        {
            if (b == null)
            {
                b = new android.media.SubtitleTrack.RenderingWidget.OnChangedListener() {

                };
            }
            setWillNotDraw(false);
            renderingwidget.setOnChangedListener(b);
            if (flag)
            {
                renderingwidget.onAttachedToWindow();
                requestLayout();
            }
        } else
        {
            setWillNotDraw(true);
        }
        invalidate();
    }

    static 
    {
        com/brightcove/player/view/BrightcoveClosedCaptioningSurfaceView.getSimpleName();
    }
}
