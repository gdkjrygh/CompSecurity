// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.support.v7.internal.view.menu.f;
import android.view.View;

// Referenced classes of package android.support.v7.widget:
//            ActionMenuPresenter

private final class b
    implements Runnable
{

    final ActionMenuPresenter a;
    private a b;

    public final void run()
    {
        ActionMenuPresenter.g(a).f();
        View view = (View)ActionMenuPresenter.h(a);
        if (view != null && view.getWindowToken() != null && b.g())
        {
            ActionMenuPresenter.a(a, b);
        }
        ActionMenuPresenter.i(a);
    }

    public (ActionMenuPresenter actionmenupresenter,  )
    {
        a = actionmenupresenter;
        super();
        b = ;
    }
}
