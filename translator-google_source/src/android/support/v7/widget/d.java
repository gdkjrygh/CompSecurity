// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.support.v7.internal.view.menu.t;
import android.view.View;

// Referenced classes of package android.support.v7.widget:
//            y, ActionMenuPresenter, ListPopupWindow

final class d extends y
{

    final ActionMenuPresenter a;
    final ActionMenuPresenter.OverflowMenuButton b;

    d(ActionMenuPresenter.OverflowMenuButton overflowmenubutton, View view, ActionMenuPresenter actionmenupresenter)
    {
        b = overflowmenubutton;
        a = actionmenupresenter;
        super(view);
    }

    public final ListPopupWindow a()
    {
        if (b.a.o == null)
        {
            return null;
        } else
        {
            return ((t) (b.a.o)).c;
        }
    }

    public final boolean b()
    {
        b.a.c();
        return true;
    }

    public final boolean c()
    {
        if (b.a.q != null)
        {
            return false;
        } else
        {
            b.a.d();
            return true;
        }
    }
}
