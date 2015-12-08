// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view.menu;

import android.view.MenuItem;

// Referenced classes of package android.support.v7.internal.view.menu:
//            ActionMenuPresenter, p, f

private class <init>
    implements <init>
{

    final ActionMenuPresenter a;

    public void a(f f1, boolean flag)
    {
        if (f1 instanceof p)
        {
            ((p)f1).p().a(false);
        }
    }

    public boolean b(f f1)
    {
        if (f1 == null)
        {
            return false;
        } else
        {
            a.b = ((p)f1).getItem().getItemId();
            return false;
        }
    }

    private A(ActionMenuPresenter actionmenupresenter)
    {
        a = actionmenupresenter;
        super();
    }

    a(ActionMenuPresenter actionmenupresenter, a a1)
    {
        this(actionmenupresenter);
    }
}
