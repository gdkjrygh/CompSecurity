// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.view.View;

// Referenced classes of package android.support.v7.widget:
//            ActionMenuPresenter, j

final class a extends a
{

    final ActionMenuPresenter a;
    final b b;

    public final j a()
    {
        if (ActionMenuPresenter.a(b.b) == null)
        {
            return null;
        } else
        {
            return ActionMenuPresenter.a(b.b).b();
        }
    }

    public final boolean b()
    {
        b.b.g();
        return true;
    }

    public final boolean c()
    {
        if (ActionMenuPresenter.b(b.b) != null)
        {
            return false;
        } else
        {
            b.b.h();
            return true;
        }
    }

    ( , View view, ActionMenuPresenter actionmenupresenter)
    {
        b = ;
        a = actionmenupresenter;
        super(view);
    }
}
