// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public final class dip extends ViewGroup
{

    final dio a;
    private dii b;
    private final ImageView c;
    private final View d;
    private CharSequence e;
    private View f;
    private View g;

    public dip(Context context, View view)
    {
        super(context);
        b = dii.a;
        Object obj = new TypedValue();
        if (context.getTheme().resolveAttribute(0x7f010203, ((TypedValue) (obj)), true))
        {
            int i = ((TypedValue) (obj)).resourceId;
            obj = context.getTheme().obtainStyledAttributes(i, dfh.aw);
            boolean flag = ((TypedArray) (obj)).getBoolean(dfh.aA, false);
            i = ((TypedArray) (obj)).getColor(dfh.ay, 0xff000000);
            android.graphics.drawable.Drawable drawable = ((TypedArray) (obj)).getDrawable(dfh.az);
            int j = ((TypedArray) (obj)).getDimensionPixelSize(dfh.ax, dft.b(24F, getResources()));
            ((TypedArray) (obj)).recycle();
            c = new ImageView(context);
            c.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
            c.setColorFilter(i);
            dgo.a(c, drawable);
            addView(c);
            if (flag)
            {
                c.setVisibility(0);
            } else
            {
                c.setVisibility(8);
            }
            d = view;
            addView(d);
            if (d instanceof dij)
            {
                a = new dim(this, c, d, j);
                return;
            } else
            {
                a = new din(this, c, d, j, b);
                return;
            }
        } else
        {
            throw new IllegalStateException("Unable to resolve PrettyHeaderView style.");
        }
    }

    public final ImageView a()
    {
        return a.c();
    }

    public final void a(int i)
    {
        a.a(i);
    }

    public final void a(int i, float f1)
    {
        a.a(i, f1);
        if (a.h())
        {
            invalidate(0, 0, getMeasuredWidth(), a.g() - i);
        }
    }

    public final void a(View view)
    {
        if (f != null)
        {
            removeView(f);
        }
        f = view;
        a.a(view);
        if (view != null)
        {
            addView(view);
        }
        requestLayout();
    }

    public final void a(dii dii1)
    {
        b = dii1;
        a.a(dii1);
    }

    public final void a(CharSequence charsequence)
    {
        e = charsequence;
        a.a(e);
        dii dii1 = b;
        String s;
        if (charsequence != null)
        {
            s = charsequence.toString();
        } else
        {
            s = null;
        }
        dii1.a(s);
        if (d instanceof dij)
        {
            ((dij)d).e().a(charsequence);
        }
    }

    public final void b()
    {
        a.a(true);
    }

    public final void b(int i)
    {
        a.b(i);
    }

    public final void b(View view)
    {
        if (g != null)
        {
            removeView(g);
        }
        g = view;
        a.b(view);
        if (view != null)
        {
            addView(view);
            if (f != null)
            {
                a(f);
            }
        }
        requestLayout();
    }

    public final View c()
    {
        return f;
    }

    public final void c(int i)
    {
        a.d(i);
    }

    public final View d()
    {
        return g;
    }

    protected final boolean drawChild(Canvas canvas, View view, long l)
    {
        if (a.h() && (view == c || view == d))
        {
            canvas.save();
            canvas.clipRect(0, 0, getWidth(), a.g());
            boolean flag = super.drawChild(canvas, view, l);
            canvas.restore();
            return flag;
        } else
        {
            return super.drawChild(canvas, view, l);
        }
    }

    public final void e()
    {
        a.f();
    }

    protected final void onLayout(boolean flag, int i, int j, int k, int l)
    {
        a.b(i, k);
    }

    protected final void onMeasure(int i, int j)
    {
        a.a(i, j);
        setMeasuredDimension(a.a(), a.b());
    }
}
