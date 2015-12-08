// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.support.v7.internal.view.menu.ab;
import android.support.v7.internal.view.menu.d;
import android.support.v7.internal.view.menu.i;
import android.support.v7.internal.view.menu.w;
import android.view.MenuItem;

// Referenced classes of package android.support.v7.widget:
//            ActionMenuPresenter

final class f
    implements w
{

    final ActionMenuPresenter a;

    f(ActionMenuPresenter actionmenupresenter)
    {
        a = actionmenupresenter;
        super();
    }

    public final void a(i j, boolean flag)
    {
        if (j instanceof ab)
        {
            ((ab)j).l.a(false);
        }
        w w1 = ((d) (a)).f;
        if (w1 != null)
        {
            w1.a(j, flag);
        }
    }

    public final boolean a_(i j)
    {
        if (j == null)
        {
            return false;
        }
        a.s = ((ab)j).getItem().getItemId();
        w w1 = ((d) (a)).f;
        if (w1 != null)
        {
            return w1.a_(j);
        } else
        {
            return false;
        }
    }
}
