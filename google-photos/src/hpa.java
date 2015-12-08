// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import android.view.MenuItem;

public final class hpa
    implements dhf, omb, opv
{

    private hov a;
    private grg b;
    private ejz c;

    public hpa()
    {
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        a = (hov)olm1.b(hov);
        b = (grg)olm1.a(grg);
        c = (ejz)olm1.a(ejz);
    }

    public final void a(MenuItem menuitem)
    {
        boolean flag;
        if (a != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        menuitem.setVisible(flag);
    }

    public final void b(MenuItem menuitem)
    {
        menuitem = b.h;
        ekq ekq = c.b();
        hov hov1 = a;
        hov1.c = menuitem;
        hov1.b = ekq;
        hov1.a();
    }
}
