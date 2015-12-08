// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view.menu;

import android.support.v7.widget.ListPopupWindow;
import android.support.v7.widget.y;
import android.widget.PopupWindow;

// Referenced classes of package android.support.v7.internal.view.menu:
//            ActionMenuItemView, c, k

final class b extends y
{

    final ActionMenuItemView a;

    public b(ActionMenuItemView actionmenuitemview)
    {
        a = actionmenuitemview;
        super(actionmenuitemview);
    }

    public final ListPopupWindow a()
    {
        if (ActionMenuItemView.a(a) != null)
        {
            return ActionMenuItemView.a(a).a();
        } else
        {
            return null;
        }
    }

    protected final boolean b()
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (ActionMenuItemView.b(a) != null)
        {
            flag = flag1;
            if (ActionMenuItemView.b(a).a(ActionMenuItemView.c(a)))
            {
                ListPopupWindow listpopupwindow = a();
                flag = flag1;
                if (listpopupwindow != null)
                {
                    flag = flag1;
                    if (listpopupwindow.c.isShowing())
                    {
                        flag = true;
                    }
                }
            }
        }
        return flag;
    }
}
