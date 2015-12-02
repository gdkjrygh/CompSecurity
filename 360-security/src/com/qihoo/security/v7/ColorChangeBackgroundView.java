// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.v7;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.nineoldandroids.a.a;
import com.nineoldandroids.a.d;
import com.nineoldandroids.a.k;
import com.nineoldandroids.a.o;
import com.qihoo.security.widget.c;

public class ColorChangeBackgroundView extends View
    implements com.nineoldandroids.a.a.a, com.nineoldandroids.a.o.b
{
    private class a
        implements android.support.v4.view.ViewPager.e
    {

        final ColorChangeBackgroundView a;

        public void a(int i)
        {
        }

        public void a(int i, float f, int j)
        {
            com.qihoo.security.v7.ColorChangeBackgroundView.a(a, i, f);
        }

        public void b(int i)
        {
        }

        private a()
        {
            a = ColorChangeBackgroundView.this;
            super();
        }

    }


    private o a;
    private int b[];
    private a c;

    public ColorChangeBackgroundView(Context context)
    {
        this(context, null, 0);
    }

    public ColorChangeBackgroundView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public ColorChangeBackgroundView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a = null;
        c = new a();
    }

    private void a(int i, float f)
    {
        if (b != null)
        {
            int j = b.length - 1;
            if (j != 0)
            {
                a((int)((((float)i + f) / (float)j) * 1000F));
            }
        }
    }

    private void a(long l)
    {
        if (a == null)
        {
            b(b);
        }
        a.e(l);
    }

    static void a(ColorChangeBackgroundView colorchangebackgroundview, int i, float f)
    {
        colorchangebackgroundview.a(i, f);
    }

    private transient void b(int ai[])
    {
        if (ai == null)
        {
            throw new IllegalStateException("ColorChangeBackgroundView colors can not null");
        } else
        {
            b = ai;
            a = k.a(this, "backgroundColor", b);
            a.a(new d());
            a.d(1000L);
            a.a(this);
            return;
        }
    }

    public void a(com.nineoldandroids.a.a a1)
    {
    }

    public void a(o o1)
    {
        invalidate();
    }

    public transient void a(c c1, int ai[])
    {
        c1.a(c);
        b(ai);
    }

    public transient void a(int ai[])
    {
        if (a == null)
        {
            b(ai);
        }
        b = ai;
        a.a(b);
        invalidate();
    }

    public void b(com.nineoldandroids.a.a a1)
    {
    }

    public void c(com.nineoldandroids.a.a a1)
    {
    }

    public void d(com.nineoldandroids.a.a a1)
    {
    }

    public int getCurrentColor()
    {
        return ((Integer)a.o()).intValue();
    }

    public void setCurrentItem(int i)
    {
        a(i, 0.0F);
    }
}
