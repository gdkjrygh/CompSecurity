// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.support.v4.view.af;
import android.support.v4.view.aj;
import android.support.v4.view.m;
import android.support.v4.view.x;
import android.support.v7.widget.ActionMenuPresenter;
import android.support.v7.widget.ActionMenuView;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

abstract class android.support.v7.internal.widget.a extends ViewGroup
{
    protected final class a
        implements aj
    {

        int a;
        final android.support.v7.internal.widget.a b;
        private boolean c;

        public final a a(af af1, int i)
        {
            b.f = af1;
            a = i;
            return this;
        }

        public final void a(View view)
        {
            android.support.v7.internal.widget.a.a(b);
            c = false;
        }

        public final void b(View view)
        {
            if (c)
            {
                return;
            } else
            {
                b.f = null;
                android.support.v7.internal.widget.a.a(b, a);
                return;
            }
        }

        public final void c(View view)
        {
            c = true;
        }

        protected a()
        {
            b = android.support.v7.internal.widget.a.this;
            super();
            c = false;
        }
    }


    protected final a a;
    protected final Context b;
    protected ActionMenuView c;
    protected ActionMenuPresenter d;
    protected int e;
    protected af f;
    private boolean g;
    private boolean h;

    android.support.v7.internal.widget.a(Context context)
    {
        this(context, null);
    }

    android.support.v7.internal.widget.a(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    android.support.v7.internal.widget.a(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a = new a();
        attributeset = new TypedValue();
        if (context.getTheme().resolveAttribute(android.support.v7.appcompat.a.actionBarPopupTheme, attributeset, true) && ((TypedValue) (attributeset)).resourceId != 0)
        {
            b = new ContextThemeWrapper(context, ((TypedValue) (attributeset)).resourceId);
            return;
        } else
        {
            b = context;
            return;
        }
    }

    protected static int a(int i, int j, boolean flag)
    {
        if (flag)
        {
            return i - j;
        } else
        {
            return i + j;
        }
    }

    protected static int a(View view, int i, int j)
    {
        view.measure(android.view.View.MeasureSpec.makeMeasureSpec(i, 0x80000000), j);
        return Math.max(0, (i - view.getMeasuredWidth()) + 0);
    }

    protected static int a(View view, int i, int j, int k, boolean flag)
    {
        int l = view.getMeasuredWidth();
        int i1 = view.getMeasuredHeight();
        j += (k - i1) / 2;
        if (flag)
        {
            view.layout(i - l, j, i, j + i1);
        } else
        {
            view.layout(i, j, i + l, j + i1);
        }
        i = l;
        if (flag)
        {
            i = -l;
        }
        return i;
    }

    static void a(android.support.v7.internal.widget.a a1)
    {
        a1.View.setVisibility(0);
    }

    static void a(android.support.v7.internal.widget.a a1, int i)
    {
        a1.View.setVisibility(i);
    }

    public af a(int i, long l)
    {
        if (f != null)
        {
            f.d();
        }
        if (i == 0)
        {
            if (getVisibility() != 0)
            {
                x.c(this, 0.0F);
            }
            af af1 = x.s(this).a(1.0F);
            af1.a(l);
            af1.a(a.a(af1, i));
            return af1;
        } else
        {
            af af2 = x.s(this).a(0.0F);
            af2.a(l);
            af2.a(a.a(af2, i));
            return af2;
        }
    }

    public boolean a()
    {
        if (d != null)
        {
            return d.g();
        } else
        {
            return false;
        }
    }

    protected void onConfigurationChanged(Configuration configuration)
    {
        if (android.os.Build.VERSION.SDK_INT >= 8)
        {
            super.onConfigurationChanged(configuration);
        }
        configuration = getContext().obtainStyledAttributes(null, android.support.v7.appcompat.k.ActionBar, android.support.v7.appcompat.a.actionBarStyle, 0);
        setContentHeight(configuration.getLayoutDimension(android.support.v7.appcompat.k.ActionBar_height, 0));
        configuration.recycle();
        if (d != null)
        {
            d.e();
        }
    }

    public boolean onHoverEvent(MotionEvent motionevent)
    {
        int i = m.a(motionevent);
        if (i == 9)
        {
            h = false;
        }
        if (!h)
        {
            boolean flag = super.onHoverEvent(motionevent);
            if (i == 9 && !flag)
            {
                h = true;
            }
        }
        if (i == 10 || i == 3)
        {
            h = false;
        }
        return true;
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        int i = m.a(motionevent);
        if (i == 0)
        {
            g = false;
        }
        if (!g)
        {
            boolean flag = super.onTouchEvent(motionevent);
            if (i == 0 && !flag)
            {
                g = true;
            }
        }
        if (i == 1 || i == 3)
        {
            g = false;
        }
        return true;
    }

    public void setContentHeight(int i)
    {
        e = i;
        requestLayout();
    }

    public void setVisibility(int i)
    {
        if (i != getVisibility())
        {
            if (f != null)
            {
                f.d();
            }
            super.setVisibility(i);
        }
    }
}
