// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;
import java.util.ArrayList;

public final class afz
    implements wj
{

    public vy a;
    private vu b;
    private Toolbar c;

    public afz(Toolbar toolbar)
    {
        c = toolbar;
        super();
    }

    public final void a(Context context, vu vu1)
    {
        if (b != null && a != null)
        {
            b.b(a);
        }
        b = vu1;
    }

    public final void a(vu vu1, boolean flag)
    {
    }

    public final boolean a()
    {
        return false;
    }

    public final boolean a(wo wo)
    {
        return false;
    }

    public final void b(boolean flag)
    {
        boolean flag2 = false;
        if (a == null) goto _L2; else goto _L1
_L1:
        boolean flag1 = flag2;
        if (b == null) goto _L4; else goto _L3
_L3:
        int i;
        int j;
        j = b.size();
        i = 0;
_L9:
        flag1 = flag2;
        if (i >= j) goto _L4; else goto _L5
_L5:
        if (b.getItem(i) != a) goto _L7; else goto _L6
_L6:
        flag1 = true;
_L4:
        if (!flag1)
        {
            c(a);
        }
_L2:
        return;
_L7:
        i++;
        if (true) goto _L9; else goto _L8
_L8:
    }

    public final boolean b(vy vy1)
    {
        Toolbar.b(c);
        if (Toolbar.c(c).getParent() != c)
        {
            c.addView(Toolbar.c(c));
        }
        c.e = vy1.getActionView();
        a = vy1;
        if (c.e.getParent() != c)
        {
            aga aga1 = Toolbar.h();
            aga1.a = 0x800003 | Toolbar.d(c) & 0x70;
            aga1.b = 2;
            c.e.setLayoutParams(aga1);
            c.addView(c.e);
        }
        Toolbar toolbar = c;
        for (int i = toolbar.getChildCount() - 1; i >= 0; i--)
        {
            View view = toolbar.getChildAt(i);
            if (((aga)view.getLayoutParams()).b != 2 && view != toolbar.a)
            {
                toolbar.removeViewAt(i);
                toolbar.m.add(view);
            }
        }

        c.requestLayout();
        vy1.e(true);
        if (c.e instanceof aax)
        {
            ((aax)c.e).a();
        }
        return true;
    }

    public final boolean c(vy vy1)
    {
        if (c.e instanceof aax)
        {
            ((aax)c.e).b();
        }
        c.removeView(c.e);
        c.removeView(Toolbar.c(c));
        c.e = null;
        Toolbar toolbar = c;
        for (int i = toolbar.m.size() - 1; i >= 0; i--)
        {
            toolbar.addView((View)toolbar.m.get(i));
        }

        toolbar.m.clear();
        a = null;
        c.requestLayout();
        vy1.e(false);
        return true;
    }
}
