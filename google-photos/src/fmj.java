// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.MenuItem;

final class fmj
    implements dhf
{

    private final fnj a;
    private fme b;

    public fmj(fme fme1, fnj fnj)
    {
        b = fme1;
        super();
        a = fnj;
    }

    public final void a(MenuItem menuitem)
    {
        boolean flag;
        if (fme.c(b) && fme.d(b).c != a)
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
        fme.a(b, a);
    }
}
