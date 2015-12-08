// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view.menu;

import android.view.View;

// Referenced classes of package android.support.v7.internal.view.menu:
//            ActionMenuPresenter, f

private class b
    implements Runnable
{

    final ActionMenuPresenter a;
    private a b;

    public void run()
    {
        a.e.f();
        View view = (View)a.h;
        if (view != null && view.getWindowToken() != null && b.a())
        {
            ActionMenuPresenter.a(a, b);
        }
        ActionMenuPresenter.a(a, null);
    }

    public A(ActionMenuPresenter actionmenupresenter, A a1)
    {
        a = actionmenupresenter;
        super();
        b = a1;
    }
}
