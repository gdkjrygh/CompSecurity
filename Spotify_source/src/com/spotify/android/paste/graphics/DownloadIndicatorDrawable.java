// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.android.paste.graphics;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.TypedValue;
import dfh;
import dft;
import dfz;

// Referenced classes of package com.spotify.android.paste.graphics:
//            SpotifyIcon

public final class DownloadIndicatorDrawable extends Drawable
    implements Runnable
{

    private int a;
    private int b;
    private long c;
    private final dfz d;
    private Drawable e;
    private DownloadState f;

    public DownloadIndicatorDrawable(Context context)
    {
        d = new dfz(context, SpotifyIcon.p);
        int j = dft.b(16F, context.getResources());
        TypedValue typedvalue = new TypedValue();
        int i = j;
        if (context.getTheme().resolveAttribute(0x7f010204, typedvalue, true))
        {
            context = context.obtainStyledAttributes(typedvalue.resourceId, dfh.G);
            i = context.getDimensionPixelSize(dfh.K, j);
            e = context.getDrawable(dfh.J);
            a = context.getColor(dfh.H, 0xff00ff00);
            b = context.getColor(dfh.I, 0xff888888);
            context.recycle();
        }
        d.a(i);
        f = DownloadState.a;
    }

    public final void a(DownloadState downloadstate)
    {
        if (f == downloadstate)
        {
            return;
        }
        f = downloadstate;
        if (f == DownloadState.b)
        {
            c = SystemClock.uptimeMillis();
            scheduleSelf(this, c);
        } else
        {
            unscheduleSelf(this);
        }
        invalidateSelf();
    }

    public final void draw(Canvas canvas)
    {
        e.setCallback(getCallback());
        d.setBounds(getBounds());
        e.setBounds(getBounds());
        final class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[DownloadState.values().length];
                try
                {
                    a[DownloadState.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[DownloadState.c.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[DownloadState.b.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1.a[f.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            d.a(b);
            d.draw(canvas);
            return;

        case 2: // '\002'
            d.a(a);
            d.draw(canvas);
            return;

        case 3: // '\003'
            e.draw(canvas);
            break;
        }
    }

    public final int getIntrinsicHeight()
    {
        return d.getIntrinsicHeight();
    }

    public final int getIntrinsicWidth()
    {
        return d.getIntrinsicWidth();
    }

    public final int getOpacity()
    {
        if (f == DownloadState.b)
        {
            return e.getOpacity();
        } else
        {
            return d.getOpacity();
        }
    }

    protected final void onBoundsChange(Rect rect)
    {
        super.onBoundsChange(rect);
        d.setBounds(rect);
        e.setBounds(rect);
    }

    public final void run()
    {
        long l = SystemClock.uptimeMillis();
        float f1 = (float)((l - c) % 3500L) / 3500F;
        e.setLevel((int)(f1 * 10000F));
        invalidateSelf();
        scheduleSelf(this, l + 16L);
    }

    public final void setAlpha(int i)
    {
        d.setAlpha(i);
        e.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorfilter)
    {
        d.setColorFilter(colorfilter);
        e.setColorFilter(colorfilter);
    }

    private class DownloadState extends Enum
    {

        public static final DownloadState a;
        public static final DownloadState b;
        public static final DownloadState c;
        private static final DownloadState d[];

        public static DownloadState valueOf(String s)
        {
            return (DownloadState)Enum.valueOf(com/spotify/android/paste/graphics/DownloadIndicatorDrawable$DownloadState, s);
        }

        public static DownloadState[] values()
        {
            return (DownloadState[])d.clone();
        }

        static 
        {
            a = new DownloadState("WAITING", 0);
            b = new DownloadState("DOWNLOADING", 1);
            c = new DownloadState("DOWNLOADED", 2);
            d = (new DownloadState[] {
                a, b, c
            });
        }

        private DownloadState(String s, int i)
        {
            super(s, i);
        }
    }

}
