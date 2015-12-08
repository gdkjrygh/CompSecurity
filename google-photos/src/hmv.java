// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.MenuItem;
import android.view.View;

final class hmv
    implements dhf
{

    final hmn a;

    hmv(hmn hmn1)
    {
        a = hmn1;
        super();
    }

    public final void a(MenuItem menuitem)
    {
        boolean flag;
        if (hmn.g(a) && hmn.h(a))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        menuitem.setVisible(flag);
        menuitem.getActionView().setOnClickListener(new hmw(this));
    }

    public final void b(MenuItem menuitem)
    {
    }
}
