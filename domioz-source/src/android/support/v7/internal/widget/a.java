// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.support.v4.view.bp;
import android.support.v4.view.cy;
import android.support.v7.a.b;
import android.support.v7.a.l;
import android.support.v7.internal.view.i;
import android.support.v7.widget.ActionMenuPresenter;
import android.support.v7.widget.ActionMenuView;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;

// Referenced classes of package android.support.v7.internal.widget:
//            b

abstract class a extends ViewGroup
{

    private static final Interpolator i = new DecelerateInterpolator();
    protected final android.support.v7.internal.widget.b a;
    protected final Context b;
    protected ActionMenuView c;
    protected ActionMenuPresenter d;
    protected ViewGroup e;
    protected boolean f;
    protected int g;
    protected cy h;

    a(Context context)
    {
        this(context, null);
    }

    a(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    a(Context context, AttributeSet attributeset, int j)
    {
        super(context, attributeset, j);
        a = new android.support.v7.internal.widget.b(this);
        attributeset = new TypedValue();
        if (context.getTheme().resolveAttribute(b.a, attributeset, true) && ((TypedValue) (attributeset)).resourceId != 0)
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
        return Math.max(0, (j - view.getMeasuredWidth()) + 0);
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

    public void a(int j)
    {
        g = j;
        requestLayout();
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

    public void b(int j)
    {
        if (h != null)
        {
            h.b();
        }
        if (j == 0)
        {
            if (getVisibility() != 0)
            {
                bp.c(this, 0.0F);
                if (e != null && c != null)
                {
                    bp.c(c, 0.0F);
                }
            }
            cy cy1 = bp.o(this).a(1.0F);
            cy1.a(200L);
            cy1.a(i);
            if (e != null && c != null)
            {
                i k = new i();
                cy cy3 = bp.o(c).a(1.0F);
                cy3.a(200L);
                k.a(a.a(cy1, j));
                k.a(cy1).a(cy3);
                k.a();
                return;
            } else
            {
                cy1.a(a.a(cy1, j));
                cy1.c();
                return;
            }
        }
        cy cy2 = bp.o(this).a(0.0F);
        cy2.a(200L);
        cy2.a(i);
        if (e != null && c != null)
        {
            i i1 = new i();
            cy cy4 = bp.o(c).a(0.0F);
            cy4.a(200L);
            i1.a(a.a(cy2, j));
            i1.a(cy2).a(cy4);
            i1.a();
            return;
        } else
        {
            cy2.a(a.a(cy2, j));
            cy2.c();
            return;
        }
    }

    protected void onConfigurationChanged(Configuration configuration)
    {
        if (android.os.Build.VERSION.SDK_INT >= 8)
        {
            super.onConfigurationChanged(configuration);
        }
        configuration = getContext().obtainStyledAttributes(null, l.a, b.c, 0);
        a(configuration.getLayoutDimension(l.l, 0));
        configuration.recycle();
        if (d != null)
        {
            d.c();
        }
    }

}
