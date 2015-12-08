// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.support.v7.internal.view.menu.i;
import android.support.v7.internal.view.menu.j;
import android.view.View;

// Referenced classes of package android.support.v7.widget:
//            ActionMenuPresenter, e

final class c
    implements Runnable
{

    final ActionMenuPresenter a;
    private e b;

    public c(ActionMenuPresenter actionmenupresenter, e e1)
    {
        a = actionmenupresenter;
        super();
        b = e1;
    }

    public final void run()
    {
        Object obj = a.c;
        if (((i) (obj)).b != null)
        {
            ((i) (obj)).b.a(((i) (obj)));
        }
        obj = (View)a.g;
        if (obj != null && ((View) (obj)).getWindowToken() != null && b.c())
        {
            a.o = b;
        }
        a.q = null;
    }
}
