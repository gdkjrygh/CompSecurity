// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.view;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Looper;

// Referenced classes of package com.brightcove.player.view:
//            BrightcoveSurfaceView, v

public class BrightcoveClosedCaptioningSurfaceView extends BrightcoveSurfaceView
    implements android.media.SubtitleController.Anchor
{

    private static final String a = com/brightcove/player/view/BrightcoveClosedCaptioningSurfaceView.getSimpleName();
    private android.media.SubtitleTrack.RenderingWidget b;
    private android.media.SubtitleTrack.RenderingWidget.OnChangedListener c;

    public BrightcoveClosedCaptioningSurfaceView(Context context)
    {
        super(context);
    }

    public void draw(Canvas canvas)
    {
        super.draw(canvas);
        if (b != null)
        {
            int i = canvas.save();
            canvas.translate(getPaddingLeft(), getPaddingTop());
            b.draw(canvas);
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
        if (b != null)
        {
            b.onAttachedToWindow();
        }
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        if (b != null)
        {
            b.onDetachedFromWindow();
        }
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        super.onLayout(flag, i, j, k, l);
        if (b != null)
        {
            i = getWidth();
            j = getPaddingLeft();
            k = getPaddingRight();
            l = getHeight();
            int i1 = getPaddingTop();
            int j1 = getPaddingBottom();
            b.setSize(i - j - k, l - i1 - j1);
        }
    }

    public void setSubtitleWidget(android.media.SubtitleTrack.RenderingWidget renderingwidget)
    {
        if (b == renderingwidget)
        {
            return;
        }
        boolean flag = isAttachedToWindow();
        if (b != null)
        {
            if (flag)
            {
                b.onDetachedFromWindow();
            }
            b.setOnChangedListener(null);
        }
        b = renderingwidget;
        if (renderingwidget != null)
        {
            if (c == null)
            {
                c = new v(this);
            }
            setWillNotDraw(false);
            renderingwidget.setOnChangedListener(c);
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

}
