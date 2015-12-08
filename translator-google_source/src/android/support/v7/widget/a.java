// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.support.v7.a.b;
import android.support.v7.internal.view.menu.ab;
import android.support.v7.internal.view.menu.m;
import android.support.v7.internal.view.menu.t;
import android.view.MenuItem;
import android.view.View;

// Referenced classes of package android.support.v7.widget:
//            ActionMenuPresenter

final class a extends t
{

    final ActionMenuPresenter g;
    private ab h;

    public a(ActionMenuPresenter actionmenupresenter, Context context, ab ab1)
    {
        boolean flag1 = false;
        g = actionmenupresenter;
        super(context, ab1, null, false, b.actionOverflowMenuStyle);
        h = ab1;
        int i;
        if (!((m)ab1.getItem()).f())
        {
            int j;
            boolean flag;
            if (actionmenupresenter.i == null)
            {
                context = (View)actionmenupresenter.g;
            } else
            {
                context = actionmenupresenter.i;
            }
            super.b = context;
        }
        super.d = actionmenupresenter.r;
        j = ab1.size();
        i = 0;
        do
        {
label0:
            {
                flag = flag1;
                if (i < j)
                {
                    actionmenupresenter = ab1.getItem(i);
                    if (!actionmenupresenter.isVisible() || actionmenupresenter.getIcon() == null)
                    {
                        break label0;
                    }
                    flag = true;
                }
                super.e = flag;
                return;
            }
            i++;
        } while (true);
    }

    public final void onDismiss()
    {
        super.onDismiss();
        g.p = null;
        g.s = 0;
    }
}
