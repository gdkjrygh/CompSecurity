// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.support.v4.view.bt;
import android.support.v4.view.dq;
import android.support.v7.c.a;
import android.support.v7.c.b;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;

// Referenced classes of package android.support.v7.app:
//            AppCompatDelegateImplV7, af

final class ae
    implements b
{

    final AppCompatDelegateImplV7 a;
    private b b;

    public ae(AppCompatDelegateImplV7 appcompatdelegateimplv7, b b1)
    {
        a = appcompatdelegateimplv7;
        super();
        b = b1;
    }

    public final void a(a a1)
    {
        b.a(a1);
        if (a.r != null)
        {
            a.b.getDecorView().removeCallbacks(a.s);
        }
        if (a.q != null)
        {
            a.l();
            a.t = bt.l(a.q).a(0.0F);
            a.t.a(new af(this));
        }
        a.p = null;
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
