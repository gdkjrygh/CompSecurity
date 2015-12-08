// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view.menu;

import android.support.v7.widget.ac;
import android.support.v7.widget.ah;

// Referenced classes of package android.support.v7.internal.view.menu:
//            ActionMenuItemView, c, i

class b extends ah
{

    final ActionMenuItemView a;

    public b(ActionMenuItemView actionmenuitemview)
    {
        a = actionmenuitemview;
        super(actionmenuitemview);
    }

    public ac a()
    {
        if (ActionMenuItemView.a(a) != null)
        {
            return ActionMenuItemView.a(a).a();
        } else
        {
            return null;
        }
    }

    protected boolean b()
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (ActionMenuItemView.b(a) != null)
        {
            flag = flag1;
            if (ActionMenuItemView.b(a).a(ActionMenuItemView.c(a)))
            {
                ac ac1 = a();
                flag = flag1;
                if (ac1 != null)
                {
                    flag = flag1;
                    if (ac1.k())
                    {
                        flag = true;
                    }
                }
            }
        }
        return flag;
    }
}
