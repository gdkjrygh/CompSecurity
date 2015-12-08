// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.support.v7.internal.view.menu.i;
import android.view.View;

// Referenced classes of package android.support.v7.widget:
//            ActionMenuPresenter, f

final class c
    implements Runnable
{

    final ActionMenuPresenter a;
    private f b;

    public c(ActionMenuPresenter actionmenupresenter, f f1)
    {
        a = actionmenupresenter;
        super();
        b = f1;
    }

    public final void run()
    {
        ActionMenuPresenter.g(a).f();
        View view = (View)ActionMenuPresenter.h(a);
        if (view != null && view.getWindowToken() != null && b.e())
        {
            ActionMenuPresenter.a(a, b);
        }
        android.support.v7.widget.ActionMenuPresenter.i(a);
    }
}
