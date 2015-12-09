// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.internal.view.menu.f;
import android.support.v7.internal.view.menu.h;
import android.support.v7.internal.view.menu.l;
import android.support.v7.internal.view.menu.p;
import android.view.View;
import android.widget.LinearLayout;
import p.h.b;

// Referenced classes of package android.support.v7.internal.widget:
//            ActionBarView, ScrollingTabContainerView, d

private class <init>
    implements l
{

    f a;
    h b;
    final ActionBarView c;

    public void a(Context context, f f1)
    {
        if (a != null && b != null)
        {
            a.d(b);
        }
        a = f1;
    }

    public void a(f f1, boolean flag)
    {
    }

    public boolean a(f f1, h h1)
    {
        c.g = h1.getActionView();
        ActionBarView.e(c).a(ActionBarView.d(c).getConstantState().newDrawable(c.getResources()));
        b = h1;
        if (c.g.getParent() != c)
        {
            c.addView(c.g);
        }
        if (ActionBarView.e(c).getParent() != c)
        {
            c.addView(ActionBarView.e(c));
        }
        android.support.v7.internal.widget.ActionBarView.f(c).setVisibility(8);
        if (ActionBarView.g(c) != null)
        {
            ActionBarView.g(c).setVisibility(8);
        }
        if (android.support.v7.internal.widget.ActionBarView.h(c) != null)
        {
            android.support.v7.internal.widget.ActionBarView.h(c).setVisibility(8);
        }
        if (ActionBarView.i(c) != null)
        {
            ActionBarView.i(c).setVisibility(8);
        }
        if (ActionBarView.j(c) != null)
        {
            ActionBarView.j(c).setVisibility(8);
        }
        c.requestLayout();
        h1.e(true);
        if (c.g instanceof b)
        {
            ((b)c.g).a();
        }
        return true;
    }

    public boolean a(p p)
    {
        return false;
    }

    public boolean b(f f1, h h1)
    {
        if (c.g instanceof b)
        {
            ((b)c.g).b();
        }
        c.removeView(c.g);
        c.removeView(ActionBarView.e(c));
        c.g = null;
        if ((ActionBarView.k(c) & 2) != 0)
        {
            android.support.v7.internal.widget.ActionBarView.f(c).setVisibility(0);
        }
        if ((ActionBarView.k(c) & 8) != 0)
        {
            if (ActionBarView.g(c) == null)
            {
                android.support.v7.internal.widget.ActionBarView.l(c);
            } else
            {
                ActionBarView.g(c).setVisibility(0);
            }
        }
        if (android.support.v7.internal.widget.ActionBarView.h(c) != null && ActionBarView.m(c) == 2)
        {
            android.support.v7.internal.widget.ActionBarView.h(c).setVisibility(0);
        }
        if (ActionBarView.i(c) != null && ActionBarView.m(c) == 1)
        {
            ActionBarView.i(c).setVisibility(0);
        }
        if (ActionBarView.j(c) != null && (ActionBarView.k(c) & 0x10) != 0)
        {
            ActionBarView.j(c).setVisibility(0);
        }
        ActionBarView.e(c).a(null);
        b = null;
        c.requestLayout();
        h1.e(false);
        return true;
    }

    public void c(boolean flag)
    {
        if (b == null) goto _L2; else goto _L1
_L1:
        int i;
        int j;
        if (a == null)
        {
            break MISSING_BLOCK_LABEL_74;
        }
        j = a.size();
        i = 0;
_L5:
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_74;
        }
        if ((p.c.b)a.getItem(i) != b) goto _L4; else goto _L3
_L3:
        i = 1;
_L6:
        if (i == 0)
        {
            b(a, b);
        }
_L2:
        return;
_L4:
        i++;
          goto _L5
        i = 0;
          goto _L6
    }

    public boolean g()
    {
        return false;
    }

    private ainerView(ActionBarView actionbarview)
    {
        c = actionbarview;
        super();
    }

    c(ActionBarView actionbarview, c c1)
    {
        this(actionbarview);
    }
}
