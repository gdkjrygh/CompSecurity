// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view.menu;

import android.content.Context;
import android.support.v4.view.n;
import android.view.ActionProvider;
import android.view.SubMenu;
import android.view.View;

// Referenced classes of package android.support.v7.internal.view.menu:
//            l

class m extends n
{

    final ActionProvider a;
    final l b;

    public m(l l1, Context context, ActionProvider actionprovider)
    {
        b = l1;
        super(context);
        a = actionprovider;
    }

    public View a()
    {
        return a.onCreateActionView();
    }

    public void a(SubMenu submenu)
    {
        a.onPrepareSubMenu(b.a(submenu));
    }

    public boolean d()
    {
        return a.onPerformDefaultAction();
    }

    public boolean e()
    {
        return a.hasSubMenu();
    }
}
