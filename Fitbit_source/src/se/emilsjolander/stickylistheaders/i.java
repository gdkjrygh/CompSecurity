// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package se.emilsjolander.stickylistheaders;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;

public class i extends ViewGroup
{

    View a;
    Drawable b;
    int c;
    View d;
    int e;

    i(Context context)
    {
        super(context);
    }

    void a(View view, View view1, Drawable drawable, int j)
    {
        if (view == null)
        {
            throw new NullPointerException("List view item must not be null.");
        }
        if (a != view)
        {
            removeView(a);
            a = view;
            android.view.ViewParent viewparent = view.getParent();
            if (viewparent != null && viewparent != this && (viewparent instanceof ViewGroup))
            {
                ((ViewGroup)viewparent).removeView(view);
            }
            addView(view);
        }
        if (d != view1)
        {
            if (d != null)
            {
                removeView(d);
            }
            d = view1;
            if (view1 != null)
            {
                addView(view1);
            }
        }
        if (b != drawable)
        {
            b = drawable;
            c = j;
            invalidate();
        }
    }

    public boolean a()
    {
        return d != null;
    }

    public View b()
    {
        return a;
    }

    public View c()
    {
        return d;
    }

    protected void dispatchDraw(Canvas canvas)
    {
        super.dispatchDraw(canvas);
        if (d == null && b != null && a.getVisibility() != 8)
        {
            if (android.os.Build.VERSION.SDK_INT < 11)
            {
                canvas.clipRect(0, 0, getWidth(), c);
            }
            b.draw(canvas);
        }
    }

    protected void onLayout(boolean flag, int j, int k, int l, int i1)
    {
        j = getWidth();
        k = getHeight();
        if (d != null)
        {
            l = d.getMeasuredHeight();
            d.layout(0, 0, j, l);
            e = l;
            a.layout(0, l, j, k);
            return;
        }
        if (b != null)
        {
            b.setBounds(0, 0, j, c);
            e = c;
            a.layout(0, c, j, k);
            return;
        } else
        {
            e = 0;
            a.layout(0, 0, j, k);
            return;
        }
    }

    protected void onMeasure(int j, int k)
    {
        k = android.view.View.MeasureSpec.getSize(j);
        int l = android.view.View.MeasureSpec.makeMeasureSpec(k, 0x40000000);
        android.view.ViewGroup.LayoutParams layoutparams;
        if (d != null)
        {
            layoutparams = d.getLayoutParams();
            if (layoutparams != null && layoutparams.height > 0)
            {
                d.measure(l, android.view.View.MeasureSpec.makeMeasureSpec(layoutparams.height, 0x40000000));
            } else
            {
                d.measure(l, android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
            }
            j = d.getMeasuredHeight() + 0;
        } else
        if (b != null && a.getVisibility() != 8)
        {
            j = c + 0;
        } else
        {
            j = 0;
        }
        layoutparams = a.getLayoutParams();
        if (a.getVisibility() == 8)
        {
            a.measure(l, android.view.View.MeasureSpec.makeMeasureSpec(0, 0x40000000));
        } else
        if (layoutparams != null && layoutparams.height >= 0)
        {
            a.measure(l, android.view.View.MeasureSpec.makeMeasureSpec(layoutparams.height, 0x40000000));
            j += a.getMeasuredHeight();
        } else
        {
            a.measure(l, android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
            j += a.getMeasuredHeight();
        }
        setMeasuredDimension(k, j);
    }
}
