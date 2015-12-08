// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.MenuItem;

public final class ime
    implements dhf
{

    private final imd a;

    public ime(imd imd1)
    {
        a = imd1;
    }

    public final void a(MenuItem menuitem)
    {
        menuitem.setVisible(a.a());
    }

    public final void b(MenuItem menuitem)
    {
        a.a(true);
    }
}
