// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.support.v4.view.bp;
import android.support.v7.c.a;
import android.support.v7.c.b;
import android.support.v7.internal.widget.ActionBarContextView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.widget.PopupWindow;

// Referenced classes of package android.support.v7.app:
//            AppCompatDelegateImplV7

final class y
    implements b
{

    final AppCompatDelegateImplV7 a;
    private b b;

    public y(AppCompatDelegateImplV7 appcompatdelegateimplv7, b b1)
    {
        a = appcompatdelegateimplv7;
        super();
        b = b1;
    }

    public final void a(a a1)
    {
        b.a(a1);
        if (a.l == null) goto _L2; else goto _L1
_L1:
        a.b.getDecorView().removeCallbacks(a.m);
        a.l.dismiss();
_L4:
        if (a.k != null)
        {
            a.k.removeAllViews();
        }
        a.j = null;
        return;
_L2:
        if (a.k != null)
        {
            a.k.setVisibility(8);
            if (a.k.getParent() != null)
            {
                bp.r((View)a.k.getParent());
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final boolean a(a a1, Menu menu)
    {
        return b.a(a1, menu);
    }

    public final boolean a(a a1, MenuItem menuitem)
    {
        return b.a(a1, menuitem);
    }

    public final boolean b(a a1, Menu menu)
    {
        return b.b(a1, menu);
    }
}
