// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.support.v7.internal.view.menu.ActionMenuPresenter;
import android.support.v7.internal.view.menu.ActionMenuView;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

// Referenced classes of package android.support.v7.internal.widget:
//            ActionBarContainer

abstract class a extends ViewGroup
{

    protected ActionMenuView a;
    protected ActionMenuPresenter b;
    protected ActionBarContainer c;
    protected boolean d;
    protected boolean e;
    protected int f;

    a(Context context)
    {
        super(context);
    }

    a(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    a(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    protected int a(View view, int i, int j, int k)
    {
        view.measure(android.view.View.MeasureSpec.makeMeasureSpec(i, 0x80000000), j);
        return Math.max(0, i - view.getMeasuredWidth() - k);
    }

    public boolean a()
    {
        if (b != null)
        {
            return b.a();
        } else
        {
            return false;
        }
    }

    protected int b(View view, int i, int j, int k)
    {
        int l = view.getMeasuredWidth();
        int i1 = view.getMeasuredHeight();
        j = (k - i1) / 2 + j;
        view.layout(i, j, i + l, i1 + j);
        return l;
    }

    public void b()
    {
        post(new Runnable() {

            final a a;

            public void run()
            {
                a.a();
            }

            
            {
                a = a.this;
                super();
            }
        });
    }

    protected int c(View view, int i, int j, int k)
    {
        int l = view.getMeasuredWidth();
        int i1 = view.getMeasuredHeight();
        j = (k - i1) / 2 + j;
        view.layout(i - l, j, i, i1 + j);
        return l;
    }

    public boolean c()
    {
        if (b != null)
        {
            return b.b();
        } else
        {
            return false;
        }
    }

    public boolean d()
    {
        if (b != null)
        {
            return b.e();
        } else
        {
            return false;
        }
    }

    public boolean e()
    {
        return b != null && b.f();
    }

    public void f()
    {
        if (b != null)
        {
            b.c();
        }
    }

    public int getAnimatedVisibility()
    {
        return getVisibility();
    }

    public int getContentHeight()
    {
        return f;
    }

    protected void onConfigurationChanged(Configuration configuration)
    {
        if (android.os.Build.VERSION.SDK_INT >= 8)
        {
            super.onConfigurationChanged(configuration);
        }
        TypedArray typedarray = getContext().obtainStyledAttributes(null, android.support.v7.appcompat.R.styleable.ActionBar, android.support.v7.appcompat.R.attr.actionBarStyle, 0);
        setContentHeight(typedarray.getLayoutDimension(0, 0));
        typedarray.recycle();
        if (e)
        {
            setSplitActionBar(getContext().getResources().getBoolean(android.support.v7.appcompat.R.bool.abc_split_action_bar_is_narrow));
        }
        if (b != null)
        {
            b.a(configuration);
        }
    }

    public void setContentHeight(int i)
    {
        f = i;
        requestLayout();
    }

    public void setSplitActionBar(boolean flag)
    {
        d = flag;
    }

    public void setSplitView(ActionBarContainer actionbarcontainer)
    {
        c = actionbarcontainer;
    }

    public void setSplitWhenNarrow(boolean flag)
    {
        e = flag;
    }

    public void setVisibility(int i)
    {
        if (i != getVisibility())
        {
            super.setVisibility(i);
        }
    }
}
