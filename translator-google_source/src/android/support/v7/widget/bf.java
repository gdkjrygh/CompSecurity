// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.support.v7.c.c;
import android.support.v7.internal.view.menu.ab;
import android.support.v7.internal.view.menu.i;
import android.support.v7.internal.view.menu.m;
import android.support.v7.internal.view.menu.v;
import android.view.View;
import android.widget.ImageButton;
import java.util.ArrayList;

// Referenced classes of package android.support.v7.widget:
//            Toolbar, bg

public final class bf
    implements v
{

    i a;
    public m b;
    final Toolbar c;

    bf(Toolbar toolbar)
    {
        c = toolbar;
        super();
    }

    public final void a(Context context, i j)
    {
        if (a != null && b != null)
        {
            a.b(b);
        }
        a = j;
    }

    public final void a(i j, boolean flag)
    {
    }

    public final boolean a()
    {
        return false;
    }

    public final boolean a(ab ab)
    {
        return false;
    }

    public final void b(boolean flag)
    {
        boolean flag2 = false;
        if (b == null) goto _L2; else goto _L1
_L1:
        boolean flag1 = flag2;
        if (a == null) goto _L4; else goto _L3
_L3:
        int j;
        int k;
        k = a.size();
        j = 0;
_L9:
        flag1 = flag2;
        if (j >= k) goto _L4; else goto _L5
_L5:
        if (a.getItem(j) != b) goto _L7; else goto _L6
_L6:
        flag1 = true;
_L4:
        if (!flag1)
        {
            c(b);
        }
_L2:
        return;
_L7:
        j++;
        if (true) goto _L9; else goto _L8
_L8:
    }

    public final boolean b(m m1)
    {
        Toolbar.b(c);
        if (android.support.v7.widget.Toolbar.c(c).getParent() != c)
        {
            c.addView(android.support.v7.widget.Toolbar.c(c));
        }
        c.b = m1.getActionView();
        b = m1;
        if (c.b.getParent() != c)
        {
            bg bg1 = Toolbar.d();
            bg1.a = 0x800003 | Toolbar.d(c) & 0x70;
            bg1.b = 2;
            c.b.setLayoutParams(bg1);
            c.addView(c.b);
        }
        Toolbar toolbar = c;
        for (int j = toolbar.getChildCount() - 1; j >= 0; j--)
        {
            View view = toolbar.getChildAt(j);
            if (((bg)view.getLayoutParams()).b != 2 && view != toolbar.a)
            {
                toolbar.removeViewAt(j);
                toolbar.c.add(view);
            }
        }

        c.requestLayout();
        m1.d(true);
        if (c.b instanceof c)
        {
            ((c)c.b).a();
        }
        return true;
    }

    public final boolean c(m m1)
    {
        if (c.b instanceof c)
        {
            ((c)c.b).b();
        }
        c.removeView(c.b);
        c.removeView(android.support.v7.widget.Toolbar.c(c));
        c.b = null;
        Toolbar toolbar = c;
        for (int j = toolbar.c.size() - 1; j >= 0; j--)
        {
            toolbar.addView((View)toolbar.c.get(j));
        }

        toolbar.c.clear();
        b = null;
        c.requestLayout();
        m1.d(false);
        return true;
    }
}
