// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.support.v7.internal.view.menu.c;

// Referenced classes of package android.support.v7.widget:
//            ActionMenuPresenter, a, ListPopupWindow

final class b extends c
{

    final ActionMenuPresenter a;

    private b(ActionMenuPresenter actionmenupresenter)
    {
        a = actionmenupresenter;
        super();
    }

    b(ActionMenuPresenter actionmenupresenter, byte byte0)
    {
        this(actionmenupresenter);
    }

    public final ListPopupWindow a()
    {
        if (ActionMenuPresenter.j(a) != null)
        {
            return ActionMenuPresenter.j(a).d();
        } else
        {
            return null;
        }
    }
}
