// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.support.v4.view.at;
import android.support.v4.view.bt;
import android.support.v4.view.dq;
import android.support.v7.a.b;
import android.support.v7.a.h;
import android.support.v7.a.l;
import android.support.v7.internal.view.menu.i;
import android.support.v7.widget.ActionMenuPresenter;
import android.support.v7.widget.ActionMenuView;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

// Referenced classes of package android.support.v7.internal.widget:
//            a

class AbsActionBarView extends ViewGroup
{

    public final a a;
    public final Context b;
    public ActionMenuView c;
    public ActionMenuPresenter d;
    public int e;
    public dq f;
    private boolean g;
    private boolean h;

    AbsActionBarView(Context context)
    {
        this(context, null);
    }

    AbsActionBarView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    AbsActionBarView(Context context, AttributeSet attributeset, int j)
    {
        super(context, attributeset, j);
        a = new a(this);
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

    protected static int a(int j, int k, boolean flag)
    {
        if (flag)
        {
            return j - k;
        } else
        {
            return j + k;
        }
    }

    protected static int a(View view, int j, int k)
    {
        view.measure(android.view.View.MeasureSpec.makeMeasureSpec(j, 0x80000000), k);
        return Math.max(0, j - view.getMeasuredWidth());
    }

    protected static int a(View view, int j, int k, int i1, boolean flag)
    {
        int j1 = view.getMeasuredWidth();
        int k1 = view.getMeasuredHeight();
        k = (i1 - k1) / 2 + k;
        if (flag)
        {
            view.layout(j - j1, k, j, k1 + k);
        } else
        {
            view.layout(j, k, j + j1, k1 + k);
        }
        j = j1;
        if (flag)
        {
            j = -j1;
        }
        return j;
    }

    static void a(AbsActionBarView absactionbarview)
    {
        absactionbarview.View.setVisibility(0);
    }

    static void a(AbsActionBarView absactionbarview, int j)
    {
        absactionbarview.View.setVisibility(j);
    }

    public dq a(int j, long l1)
    {
        if (f != null)
        {
            f.a();
        }
        if (j == 0)
        {
            if (getVisibility() != 0)
            {
                bt.b(this, 0.0F);
            }
            dq dq1 = bt.l(this).a(1.0F);
            dq1.a(l1);
            dq1.a(a.a(dq1, j));
            return dq1;
        } else
        {
            dq dq2 = bt.l(this).a(0.0F);
            dq2.a(l1);
            dq2.a(a.a(dq2, j));
            return dq2;
        }
    }

    public boolean a()
    {
        if (d != null)
        {
            return d.c();
        } else
        {
            return false;
        }
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
        configuration = getContext().obtainStyledAttributes(null, l.ActionBar, b.actionBarStyle, 0);
        setContentHeight(configuration.getLayoutDimension(l.ActionBar_height, 0));
        configuration.recycle();
        if (d != null)
        {
            configuration = d;
            if (!((ActionMenuPresenter) (configuration)).m)
            {
                configuration.l = ((ActionMenuPresenter) (configuration)).b.getResources().getInteger(h.abc_max_action_buttons);
            }
            if (((ActionMenuPresenter) (configuration)).c != null)
            {
                ((ActionMenuPresenter) (configuration)).c.b(true);
            }
        }
    }

    public boolean onHoverEvent(MotionEvent motionevent)
    {
        int j = at.a(motionevent);
        if (j == 9)
        {
            h = false;
        }
        if (!h)
        {
            boolean flag = super.onHoverEvent(motionevent);
            if (j == 9 && !flag)
            {
                h = true;
            }
        }
        if (j == 10 || j == 3)
        {
            h = false;
        }
        return true;
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        int j = at.a(motionevent);
        if (j == 0)
        {
            g = false;
        }
        if (!g)
        {
            boolean flag = super.onTouchEvent(motionevent);
            if (j == 0 && !flag)
            {
                g = true;
            }
        }
        if (j == 1 || j == 3)
        {
            g = false;
        }
        return true;
    }

    public void setContentHeight(int j)
    {
        e = j;
        requestLayout();
    }

    public void setVisibility(int j)
    {
        if (j != getVisibility())
        {
            if (f != null)
            {
                f.a();
            }
            super.setVisibility(j);
        }
    }
}
