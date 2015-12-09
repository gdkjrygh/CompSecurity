// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.support.v4.view.ba;
import android.support.v4.view.dn;
import android.support.v7.b.b;
import android.support.v7.b.k;
import android.support.v7.widget.ActionMenuView;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

// Referenced classes of package android.support.v7.internal.widget:
//            b

abstract class a extends ViewGroup
{

    protected final android.support.v7.internal.widget.b a;
    protected final Context b;
    protected ActionMenuView c;
    protected android.support.v7.widget.a d;
    protected int e;
    protected dn f;
    private boolean g;
    private boolean h;

    a(Context context)
    {
        this(context, null);
    }

    a(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    a(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a = new android.support.v7.internal.widget.b(this);
        attributeset = new TypedValue();
        if (context.getTheme().resolveAttribute(b.actionBarPopupTheme, attributeset, true) && ((TypedValue) (attributeset)).resourceId != 0)
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

    static void a(a a1, int i)
    {
        a1.View.setVisibility(i);
    }

    static void b(a a1, int i)
    {
        a1.View.setVisibility(i);
    }

    protected int a(View view, int i, int j, int l)
    {
        view.measure(android.view.View.MeasureSpec.makeMeasureSpec(i, 0x80000000), j);
        return Math.max(0, i - view.getMeasuredWidth() - l);
    }

    protected int a(View view, int i, int j, int l, boolean flag)
    {
        int i1 = view.getMeasuredWidth();
        int j1 = view.getMeasuredHeight();
        j = (l - j1) / 2 + j;
        if (flag)
        {
            view.layout(i - i1, j, i, j1 + j);
        } else
        {
            view.layout(i, j, i + i1, j1 + j);
        }
        i = i1;
        if (flag)
        {
            i = -i1;
        }
        return i;
    }

    public int getAnimatedVisibility()
    {
        if (f != null)
        {
            return a.a;
        } else
        {
            return getVisibility();
        }
    }

    public int getContentHeight()
    {
        return e;
    }

    protected void onConfigurationChanged(Configuration configuration)
    {
        if (android.os.Build.VERSION.SDK_INT >= 8)
        {
            super.onConfigurationChanged(configuration);
        }
        TypedArray typedarray = getContext().obtainStyledAttributes(null, k.ActionBar, b.actionBarStyle, 0);
        setContentHeight(typedarray.getLayoutDimension(k.ActionBar_height, 0));
        typedarray.recycle();
        if (d != null)
        {
            d.a(configuration);
        }
    }

    public boolean onHoverEvent(MotionEvent motionevent)
    {
        int i = ba.a(motionevent);
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
        int i = ba.a(motionevent);
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
                f.a();
            }
            super.setVisibility(i);
        }
    }
}
