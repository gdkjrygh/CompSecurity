// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.support.v7.c.c;
import android.support.v7.internal.view.menu.ad;
import android.support.v7.internal.view.menu.i;
import android.support.v7.internal.view.menu.m;
import android.support.v7.internal.view.menu.x;
import android.view.View;
import android.widget.ImageButton;

// Referenced classes of package android.support.v7.widget:
//            Toolbar

final class ch
    implements x
{

    i a;
    m b;
    final Toolbar c;

    private ch(Toolbar toolbar)
    {
        c = toolbar;
        super();
    }

    ch(Toolbar toolbar, byte byte0)
    {
        this(toolbar);
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

    public final boolean a(ad ad)
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

    public final boolean b()
    {
        return false;
    }

    public final boolean b(m m1)
    {
        Toolbar.a(c);
        if (Toolbar.b(c).getParent() != c)
        {
            c.addView(Toolbar.b(c));
        }
        c.a = m1.getActionView();
        b = m1;
        if (c.a.getParent() != c)
        {
            Toolbar.LayoutParams layoutparams = android.support.v7.widget.Toolbar.m();
            layoutparams.a = 0x800003 | android.support.v7.widget.Toolbar.c(c) & 0x70;
            layoutparams.b = 2;
            c.a.setLayoutParams(layoutparams);
            c.addView(c.a);
        }
        Toolbar.a(c, true);
        c.requestLayout();
        m1.e(true);
        if (c.a instanceof c)
        {
            ((c)c.a).a();
        }
        return true;
    }

    public final boolean c(m m1)
    {
        if (c.a instanceof c)
        {
            ((c)c.a).b();
        }
        c.removeView(c.a);
        c.removeView(Toolbar.b(c));
        c.a = null;
        Toolbar.a(c, false);
        b = null;
        c.requestLayout();
        m1.e(false);
        return true;
    }
}
