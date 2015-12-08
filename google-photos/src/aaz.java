// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.view.MenuItem;
import android.view.View;

final class aaz extends wh
{

    private aay g;

    public aaz(aay aay1, Context context, wo wo1)
    {
        boolean flag1 = false;
        g = aay1;
        super(context, wo1, null, false, b.t);
        int i;
        if (!((vy)wo1.getItem()).f())
        {
            int j;
            boolean flag;
            if (aay1.f == null)
            {
                context = (View)aay1.e;
            } else
            {
                context = aay1.f;
            }
            super.b = context;
        }
        super.d = aay1.l;
        j = wo1.size();
        i = 0;
        do
        {
label0:
            {
                flag = flag1;
                if (i < j)
                {
                    aay1 = wo1.getItem(i);
                    if (!aay1.isVisible() || aay1.getIcon() == null)
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
        g.j = null;
    }
}
