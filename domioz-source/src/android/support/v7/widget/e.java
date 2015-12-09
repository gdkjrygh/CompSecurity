// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.view.View;

// Referenced classes of package android.support.v7.widget:
//            ak, d, ActionMenuPresenter, f, 
//            ListPopupWindow

final class e extends ak
{

    final ActionMenuPresenter a;
    final d b;

    e(d d1, View view, ActionMenuPresenter actionmenupresenter)
    {
        b = d1;
        a = actionmenupresenter;
        super(view);
    }

    public final ListPopupWindow a()
    {
        if (ActionMenuPresenter.a(b.a) == null)
        {
            return null;
        } else
        {
            return ActionMenuPresenter.a(b.a).d();
        }
    }

    public final boolean b()
    {
        b.a.g();
        return true;
    }

    public final boolean c()
    {
        if (ActionMenuPresenter.b(b.a) != null)
        {
            return false;
        } else
        {
            b.a.h();
            return true;
        }
    }
}
