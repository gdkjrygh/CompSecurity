// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.spotify.android.paste.graphics.SpotifyIcon;

public final class dfz extends Drawable
{

    public boolean a;
    public Paint b;
    public Path c;
    private SpotifyIcon d;
    private int e;
    private int f;
    private ColorStateList g;
    private Rect h;
    private float i[];
    private float j;
    private float k;

    public dfz(Context context, SpotifyIcon spotifyicon)
    {
        this(context, spotifyicon, dft.b(spotifyicon.mDefaultSize, context.getResources()));
    }

    public dfz(Context context, SpotifyIcon spotifyicon, float f1)
    {
        e = -1;
        f = 255;
        h = new Rect();
        i = new float[1];
        d = spotifyicon;
        context = dgd.a(context, "spoticon.ttf");
        b = new Paint();
        b.setColor(e);
        b.setTypeface(context);
        b.setTextSize(f1);
        b.setTextAlign(android.graphics.Paint.Align.LEFT);
        b.setAntiAlias(true);
        a();
    }

    private void b()
    {
        b.setAlpha((Color.alpha(e) * f) / 255);
    }

    public final void a()
    {
        b.getTextBounds(d.toString(), 0, 1, h);
        b.getTextWidths(d.toString(), 0, 1, i);
        k = b.getFontMetrics().top;
        j = b.getFontMetrics().bottom - k;
        if (a)
        {
            c.reset();
            b.getTextPath(d.toString(), 0, 1, 0.0F, 0.0F, c);
            c.close();
        }
    }

    public final void a(float f1)
    {
        b.setTextSize(f1);
        a();
        invalidateSelf();
    }

    public final void a(int l)
    {
        g = null;
        e = l;
        b.setColor(l);
        b();
        invalidateSelf();
    }

    public final void a(ColorStateList colorstatelist)
    {
        g = colorstatelist;
        onStateChange(getState());
        invalidateSelf();
    }

    public final void a(SpotifyIcon spotifyicon)
    {
        d = spotifyicon;
        a();
        invalidateSelf();
    }

    public final void draw(Canvas canvas)
    {
        int l = canvas.save();
        Rect rect = getBounds();
        canvas.translate(rect.centerX(), rect.centerY());
        canvas.translate(0.0F, -k);
        float f2 = i[0];
        float f3 = j;
        float f1;
        if (f2 / f3 > (float)rect.width() / (float)rect.height())
        {
            f1 = f2 / (float)rect.width();
        } else
        {
            f1 = f3 / (float)rect.height();
        }
        canvas.scale(f1, f1);
        canvas.translate(-f2 / 2.0F, -f3 / 2.0F);
        if (a)
        {
            canvas.drawPath(c, b);
        } else
        {
            canvas.drawText(d.toString(), 0, 1, 0.0F, 0.0F, b);
        }
        canvas.restoreToCount(l);
    }

    public final int getIntrinsicHeight()
    {
        return (int)j;
    }

    public final int getIntrinsicWidth()
    {
        return (int)i[0];
    }

    public final int getOpacity()
    {
        Paint paint = b;
        if (paint.getXfermode() == null)
        {
            int l = paint.getAlpha();
            if (l == 0)
            {
                return -2;
            }
            if (l == 255)
            {
                return -1;
            }
        }
        return -3;
    }

    public final boolean isStateful()
    {
        return g != null;
    }

    protected final boolean onStateChange(int ai[])
    {
        if (g == null)
        {
            return false;
        } else
        {
            int l = e;
            l = g.getColorForState(ai, l);
            e = l;
            b.setColor(l);
            b();
            invalidateSelf();
            return true;
        }
    }

    public final void setAlpha(int l)
    {
        f = l;
        b();
        invalidateSelf();
    }

    public final void setColorFilter(ColorFilter colorfilter)
    {
        b.setColorFilter(colorfilter);
        invalidateSelf();
    }
}
