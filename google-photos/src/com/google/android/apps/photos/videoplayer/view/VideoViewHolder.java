// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.photos.videoplayer.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.media.MediaPlayer;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import b;
import jfq;
import jgx;
import jhg;
import jhh;
import noy;
import noz;
import olm;
import onh;
import p;

public final class VideoViewHolder extends FrameLayout
    implements jhg
{

    private static final jhg a;
    private static final onh b = new onh("debug.videoplayer.surface_layer", false);
    private final Context c;
    private final noz d;
    private jhg e;
    private boolean f;

    public VideoViewHolder(Context context)
    {
        this(context, null);
    }

    public VideoViewHolder(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        e = a;
        c = context;
        d = noz.a(context, 2, "VideoTextureViewHolder", new String[0]);
    }

    public static VideoViewHolder a(View view)
    {
        view = view.findViewById(b.CJ);
        p.a(view);
        return (VideoViewHolder)view;
    }

    public final void a()
    {
        TypedArray typedarray = c.getTheme().obtainStyledAttributes(new int[] {
            0x1010058
        });
        boolean flag = typedarray.getBoolean(0, false);
        typedarray.recycle();
        f = false;
        e = ((jhh)olm.a(c, jhh)).a(this, flag);
        e.a();
    }

    public final void a(jfq jfq)
    {
        e.a(jfq);
    }

    public final void a(boolean flag)
    {
        e.a(flag);
    }

    public final boolean a(Canvas canvas)
    {
        if (!e.a(canvas))
        {
            canvas.drawColor(0x330000ff);
        }
        return true;
    }

    public final void b()
    {
        if (d.a())
        {
            noy.a("VideoTextureViewHolder", this);
        }
        e.b();
    }

    public final void b(boolean flag)
    {
        if (!flag)
        {
            setVisibility(4);
            return;
        } else
        {
            d();
            return;
        }
    }

    public final void c()
    {
        if (d.a())
        {
            noy.a("VideoTextureViewHolder", this);
        }
        e.c();
    }

    public final void d()
    {
        setVisibility(0);
        e.d();
    }

    protected final void dispatchDraw(Canvas canvas)
    {
        super.dispatchDraw(canvas);
        if (!f)
        {
            return;
        } else
        {
            a(canvas);
            return;
        }
    }

    public final boolean e()
    {
        return e.e();
    }

    public final void f()
    {
        e.f();
    }

    public final Bitmap g()
    {
        return e.g();
    }

    protected final void onFinishInflate()
    {
        super.onFinishInflate();
        a();
    }

    public final void onVideoSizeChanged(MediaPlayer mediaplayer, int i, int j)
    {
        e.onVideoSizeChanged(mediaplayer, i, j);
    }

    public final String toString()
    {
        String s = String.valueOf(super.toString());
        String s1 = String.valueOf(e);
        boolean flag;
        if (getVisibility() == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return (new StringBuilder(String.valueOf(s).length() + 29 + String.valueOf(s1).length())).append(s).append("{strategy=").append(s1).append(", visibility=").append(flag).append("}").toString();
    }

    static 
    {
        a = jgx.a;
    }
}
