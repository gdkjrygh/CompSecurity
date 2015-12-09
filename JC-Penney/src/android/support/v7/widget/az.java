// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.support.v7.d.a;
import android.support.v7.internal.view.menu.aa;
import android.support.v7.internal.view.menu.g;
import android.support.v7.internal.view.menu.j;
import android.support.v7.internal.view.menu.u;
import android.view.View;
import android.widget.ImageButton;

// Referenced classes of package android.support.v7.widget:
//            Toolbar, ba, aw

class az
    implements u
{

    g a;
    j b;
    final Toolbar c;

    private az(Toolbar toolbar)
    {
        c = toolbar;
        super();
    }

    az(Toolbar toolbar, aw aw)
    {
        this(toolbar);
    }

    public void a(Context context, g g1)
    {
        if (a != null && b != null)
        {
            a.d(b);
        }
        a = g1;
    }

    public void a(g g1, boolean flag)
    {
    }

    public boolean a(aa aa)
    {
        return false;
    }

    public boolean a(g g1, j j1)
    {
        Toolbar.b(c);
        if (Toolbar.c(c).getParent() != c)
        {
            c.addView(Toolbar.c(c));
        }
        c.a = j1.getActionView();
        b = j1;
        if (c.a.getParent() != c)
        {
            g1 = c.d();
            g1.a = 0x800003 | Toolbar.d(c) & 0x70;
            g1.b = 2;
            c.a.setLayoutParams(g1);
            c.addView(c.a);
        }
        c.e();
        c.requestLayout();
        j1.e(true);
        if (c.a instanceof a)
        {
            ((a)c.a).a();
        }
        return true;
    }

    public void b(boolean flag)
    {
        boolean flag2 = false;
        if (b == null) goto _L2; else goto _L1
_L1:
        boolean flag1 = flag2;
        if (a == null) goto _L4; else goto _L3
_L3:
        int i;
        int k;
        k = a.size();
        i = 0;
_L9:
        flag1 = flag2;
        if (i >= k) goto _L4; else goto _L5
_L5:
        if (a.getItem(i) != b) goto _L7; else goto _L6
_L6:
        flag1 = true;
_L4:
        if (!flag1)
        {
            b(a, b);
        }
_L2:
        return;
_L7:
        i++;
        if (true) goto _L9; else goto _L8
_L8:
    }

    public boolean b()
    {
        return false;
    }

    public boolean b(g g1, j j1)
    {
        if (c.a instanceof a)
        {
            ((a)c.a).b();
        }
        c.removeView(c.a);
        c.removeView(Toolbar.c(c));
        c.a = null;
        c.f();
        b = null;
        c.requestLayout();
        j1.e(false);
        return true;
    }
}
