// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;

public class ggk extends Drawable
{

    private int a;
    public final View b;
    private int c;

    public ggk(View view)
    {
        a = -1;
        c = -1;
        b = view;
    }

    public static ggk a(View view)
    {
        ggk ggk1 = new ggk(view);
        int i = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
        view.measure(i, i);
        i = view.getMeasuredWidth();
        int j = view.getMeasuredHeight();
        if (i > 0 && j > 0)
        {
            ggk1.a = i;
            ggk1.c = j;
            ggk1.setBounds(0, 0, i, j);
        }
        return ggk1;
    }

    public void draw(Canvas canvas)
    {
        b.draw(canvas);
    }

    public int getIntrinsicHeight()
    {
        return c;
    }

    public int getIntrinsicWidth()
    {
        return a;
    }

    public int getOpacity()
    {
        return !b.isOpaque() ? 0 : -1;
    }

    public void setAlpha(int i)
    {
        b.setAlpha(i);
    }

    public void setBounds(int i, int j, int k, int l)
    {
        super.setBounds(i, j, k, l);
        b.measure(android.view.View.MeasureSpec.makeMeasureSpec(k - i, 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(l - j, 0x40000000));
        b.layout(i, j, k, l);
    }

    public void setColorFilter(ColorFilter colorfilter)
    {
        if (b instanceof ImageView)
        {
            ((ImageView)b).setColorFilter(colorfilter);
        }
    }
}
