// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.MenuItem;

final class hmt
    implements dhf
{

    private hmn a;

    hmt(hmn hmn1)
    {
        a = hmn1;
        super();
    }

    public final void a(MenuItem menuitem)
    {
        menuitem.setVisible(true);
    }

    public final void b(MenuItem menuitem)
    {
        hmn.c(a).b(true);
    }
}
