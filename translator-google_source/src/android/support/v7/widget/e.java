// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.support.v7.a.b;
import android.support.v7.internal.view.menu.i;
import android.support.v7.internal.view.menu.t;
import android.view.View;

// Referenced classes of package android.support.v7.widget:
//            ActionMenuPresenter

final class e extends t
{

    final ActionMenuPresenter g;

    public e(ActionMenuPresenter actionmenupresenter, Context context, i j, View view)
    {
        g = actionmenupresenter;
        super(context, j, view, true, b.actionOverflowMenuStyle);
        super.f = 0x800005;
        super.d = actionmenupresenter.r;
    }

    public final void onDismiss()
    {
        super.onDismiss();
        g.c.close();
        g.o = null;
    }
}
