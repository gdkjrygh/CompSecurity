// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.android.paste.graphics;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import dfm;

public final class BadgedDrawable extends Drawable
{

    public static final BadgePosition a;
    private final BadgePosition b;
    private final int c;
    private final int d;
    private final Drawable e;
    private final Drawable f;
    private final boolean g;
    private final Rect h;
    private final Matrix i = new Matrix();
    private final Matrix j = new Matrix();

    public BadgedDrawable(Drawable drawable, Drawable drawable1, dfm dfm1)
    {
        if (drawable == null)
        {
            throw new NullPointerException("null drawable");
        }
        if (dfm1 == null)
        {
            throw new NullPointerException("null badge params");
        }
        if (dfm1.a == null)
        {
            throw new NullPointerException("null position");
        } else
        {
            e = drawable;
            f = drawable1;
            b = dfm1.a;
            d = dfm1.e;
            c = dfm1.d;
            h = new Rect(0, 0, a(dfm1.b, drawable1.getIntrinsicWidth()), a(dfm1.c, drawable1.getIntrinsicHeight()));
            g = dfm1.f;
            return;
        }
    }

    private static int a(int k, int l)
    {
        if (k < 0)
        {
            k = l;
            if (l < 0)
            {
                throw new IllegalArgumentException("The drawable has no intrinsic measures, set them manually.");
            }
        }
        return k;
    }

    public static dfm a()
    {
        return new dfm();
    }

    private static void a(Canvas canvas, Drawable drawable, Matrix matrix)
    {
        if (!matrix.isIdentity())
        {
            int k = canvas.save();
            canvas.concat(matrix);
            drawable.draw(canvas);
            canvas.restoreToCount(k);
            return;
        } else
        {
            drawable.draw(canvas);
            return;
        }
    }

    private static void a(Drawable drawable, Rect rect, Matrix matrix, boolean flag)
    {
        RectF rectf = new RectF();
        RectF rectf1 = new RectF();
        int k = drawable.getIntrinsicHeight();
        int l = drawable.getIntrinsicWidth();
        matrix.reset();
        if (!flag && k >= 0 && l >= 0)
        {
            drawable.setBounds(0, 0, l, k);
            rectf.set(0.0F, 0.0F, l, k);
            rectf1.set(rect);
            if (!rectf.equals(rectf1))
            {
                matrix.setRectToRect(rectf, rectf1, android.graphics.Matrix.ScaleToFit.CENTER);
                matrix.mapRect(rectf);
                float f1 = Math.max(rectf1.width() / rectf.width(), rectf1.height() / rectf.height());
                matrix.postScale(f1, f1, rectf1.centerX(), rectf1.centerY());
            }
            return;
        } else
        {
            drawable.setBounds(rect);
            return;
        }
    }

    public final void draw(Canvas canvas)
    {
        a(canvas, e, i);
        a(canvas, f, j);
    }

    public final int getIntrinsicHeight()
    {
        if (g)
        {
            return -1;
        } else
        {
            return e.getIntrinsicHeight();
        }
    }

    public final int getIntrinsicWidth()
    {
        if (g)
        {
            return -1;
        } else
        {
            return e.getIntrinsicWidth();
        }
    }

    public final int getOpacity()
    {
        return resolveOpacity(e.getOpacity(), f.getOpacity());
    }

    protected final void onBoundsChange(Rect rect)
    {
        boolean flag = true;
        Object obj = e;
        Matrix matrix = i;
        int k;
        int l;
        boolean flag1;
        if (!g)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        a(((Drawable) (obj)), rect, matrix, flag1);
        if (b == BadgePosition.c || b == BadgePosition.a)
        {
            l = 1;
        } else
        {
            l = 0;
        }
        k = ((flag) ? 1 : 0);
        if (b != BadgePosition.a)
        {
            if (b == BadgePosition.b)
            {
                k = ((flag) ? 1 : 0);
            } else
            {
                k = 0;
            }
        }
        obj = h;
        if (l != 0)
        {
            l = d;
        } else
        {
            l = rect.right - d - h.width();
        }
        if (k != 0)
        {
            k = c;
        } else
        {
            k = rect.bottom - c - h.height();
        }
        ((Rect) (obj)).offsetTo(l, k);
        a(f, h, j, false);
    }

    public final void setAlpha(int k)
    {
        e.setAlpha(k);
        f.setAlpha(k);
    }

    public final void setColorFilter(ColorFilter colorfilter)
    {
        e.setColorFilter(colorfilter);
    }

    static 
    {
        a = BadgePosition.d;
    }

    private class BadgePosition extends Enum
    {

        public static final BadgePosition a;
        public static final BadgePosition b;
        public static final BadgePosition c;
        public static final BadgePosition d;
        private static final BadgePosition e[];

        public static BadgePosition valueOf(String s)
        {
            return (BadgePosition)Enum.valueOf(com/spotify/android/paste/graphics/BadgedDrawable$BadgePosition, s);
        }

        public static BadgePosition[] values()
        {
            return (BadgePosition[])e.clone();
        }

        static 
        {
            a = new BadgePosition("TOP_LEFT", 0);
            b = new BadgePosition("TOP_RIGHT", 1);
            c = new BadgePosition("BOTTOM_LEFT", 2);
            d = new BadgePosition("BOTTOM_RIGHT", 3);
            e = (new BadgePosition[] {
                a, b, c, d
            });
        }

        private BadgePosition(String s, int k)
        {
            super(s, k);
        }
    }

}
