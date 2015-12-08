// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.photos.videoplayer.view;

import android.content.Context;
import android.media.MediaPlayer;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import jfq;
import noy;
import noz;

public final class VideoSurfaceView extends SurfaceView
    implements android.media.MediaPlayer.OnVideoSizeChangedListener, android.view.SurfaceHolder.Callback
{

    public noz a;
    public SurfaceHolder b;
    public jfq c;
    public android.view.SurfaceHolder.Callback d;
    private noz e;
    private int f;
    private int g;
    private int h;
    private int i;

    public VideoSurfaceView(Context context)
    {
        super(context);
        a(context);
    }

    public VideoSurfaceView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a(context);
    }

    public VideoSurfaceView(Context context, AttributeSet attributeset, int j)
    {
        super(context, attributeset, j);
        a(context);
    }

    public VideoSurfaceView(Context context, AttributeSet attributeset, int j, int k)
    {
        super(context, attributeset, j, k);
        a(context);
    }

    private void a(Context context)
    {
        e = noz.a(context, "VideoSurfaceView", new String[0]);
        a = noz.a(context, 2, "VideoSurfaceView", new String[0]);
        getHolder().addCallback(this);
    }

    public void a(int j, int k)
    {
        f = j;
        for (g = k; f == 0 || g == 0 || i == g && h == f;)
        {
            return;
        }

        getHolder().setFixedSize(f, g);
        requestLayout();
        invalidate();
    }

    protected final void onMeasure(int j, int k)
    {
        int l;
        int i1;
        int j1;
        int l1;
        j1 = getDefaultSize(f, j);
        l1 = getDefaultSize(g, k);
        i1 = l1;
        l = j1;
        if (f <= 0) goto _L2; else goto _L1
_L1:
        i1 = l1;
        l = j1;
        if (g <= 0) goto _L2; else goto _L3
_L3:
        int i2;
        l1 = android.view.View.MeasureSpec.getMode(j);
        j = android.view.View.MeasureSpec.getSize(j);
        i2 = android.view.View.MeasureSpec.getMode(k);
        k = android.view.View.MeasureSpec.getSize(k);
        if (l1 != 0x40000000 || i2 != 0x40000000) goto _L5; else goto _L4
_L4:
        if (f * k < g * j)
        {
            l = (f * k) / g;
            i1 = k;
        } else
        if (f * k > g * j)
        {
            i1 = (g * j) / f;
            l = j;
        } else
        {
            i1 = k;
            l = j;
        }
_L2:
        setMeasuredDimension(l, i1);
        return;
_L5:
        if (l1 == 0x40000000)
        {
            i1 = (g * j) / f;
            int k1;
            if (i2 == 0x80000000 && i1 > k)
            {
                i1 = k;
                l = j;
            } else
            {
                l = j;
            }
        } else
        if (i2 == 0x40000000)
        {
            k1 = (f * k) / g;
            i1 = k;
            l = k1;
            if (l1 == 0x80000000)
            {
                i1 = k;
                l = k1;
                if (k1 > j)
                {
                    i1 = k;
                    l = j;
                }
            }
        } else
        {
            k1 = f;
            l = g;
            if (i2 == 0x80000000 && l > k)
            {
                k1 = (f * k) / g;
            } else
            {
                k = l;
            }
            i1 = k;
            l = k1;
            if (l1 == 0x80000000)
            {
                i1 = k;
                l = k1;
                if (k1 > j)
                {
                    i1 = (g * j) / f;
                    l = j;
                }
            }
        }
        if (true) goto _L2; else goto _L6
_L6:
    }

    public final void onVideoSizeChanged(MediaPlayer mediaplayer, int j, int k)
    {
        a(mediaplayer.getVideoWidth(), mediaplayer.getVideoHeight());
    }

    public final void surfaceChanged(SurfaceHolder surfaceholder, int j, int k, int l)
    {
        if (a.a())
        {
            noy.a("VideoSurfaceView", this);
            noy.a("holder", surfaceholder.getSurface());
        }
        h = k;
        i = l;
        if (d != null)
        {
            d.surfaceChanged(surfaceholder, j, k, l);
        }
    }

    public final void surfaceCreated(SurfaceHolder surfaceholder)
    {
        if (a.a())
        {
            noy.a("VideoSurfaceView", this);
            noy.a("holder", surfaceholder.getSurface());
        }
        b = surfaceholder;
        if (c != null)
        {
            c.a(surfaceholder);
            if (d != null)
            {
                d.surfaceCreated(surfaceholder);
                return;
            }
        }
    }

    public final void surfaceDestroyed(SurfaceHolder surfaceholder)
    {
        if (a.a())
        {
            noy.a("VideoSurfaceView", this);
            noy.a("holder", surfaceholder.getSurface());
        }
        b = null;
        c = null;
        if (d != null)
        {
            d.surfaceDestroyed(surfaceholder);
        }
    }
}
