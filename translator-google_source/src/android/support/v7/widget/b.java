// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.support.v7.internal.view.menu.c;
import android.support.v7.internal.view.menu.t;

// Referenced classes of package android.support.v7.widget:
//            ActionMenuPresenter, ListPopupWindow

final class b extends c
{

    final ActionMenuPresenter a;

    b(ActionMenuPresenter actionmenupresenter)
    {
        a = actionmenupresenter;
        super();
    }

    public final ListPopupWindow a()
    {
        if (a.p != null)
        {
            return ((t) (a.p)).c;
        } else
        {
            return null;
        }
    }
}
