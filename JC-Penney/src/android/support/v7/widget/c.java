// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.support.v7.b.b;
import android.support.v7.internal.view.menu.aa;
import android.support.v7.internal.view.menu.j;
import android.support.v7.internal.view.menu.s;
import android.view.MenuItem;
import android.view.View;

// Referenced classes of package android.support.v7.widget:
//            a

class c extends s
{

    final a c;
    private aa d;

    public c(a a1, Context context, aa aa1)
    {
        boolean flag1 = false;
        c = a1;
        super(context, aa1, null, false, b.actionOverflowMenuStyle);
        d = aa1;
        int i;
        if (!((j)aa1.getItem()).j())
        {
            int k;
            boolean flag;
            if (a.d(a1) == null)
            {
                context = (View)a.e(a1);
            } else
            {
                context = a.d(a1);
            }
            a(context);
        }
        a(a1.g);
        k = aa1.size();
        i = 0;
        do
        {
label0:
            {
                flag = flag1;
                if (i < k)
                {
                    a1 = aa1.getItem(i);
                    if (!a1.isVisible() || a1.getIcon() == null)
                    {
                        break label0;
                    }
                    flag = true;
                }
                a(flag);
                return;
            }
            i++;
        } while (true);
    }

    public void onDismiss()
    {
        super.onDismiss();
        a.a(c, null);
        c.h = 0;
    }
}
