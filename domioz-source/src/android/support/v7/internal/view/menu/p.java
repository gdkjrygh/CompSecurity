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
//            o

class p extends n
{

    final ActionProvider a;
    final o b;

    public p(o o1, Context context, ActionProvider actionprovider)
    {
        b = o1;
        super(context);
        a = actionprovider;
    }

    public final View a()
    {
        return a.onCreateActionView();
    }

    public final void a(SubMenu submenu)
    {
        a.onPrepareSubMenu(b.a(submenu));
    }

    public final boolean d()
    {
        return a.onPerformDefaultAction();
    }

    public final boolean e()
    {
        return a.hasSubMenu();
    }
}
