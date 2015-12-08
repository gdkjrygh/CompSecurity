// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.MenuItem;

final class lq extends lp
{

    lq()
    {
    }

    public final boolean b(MenuItem menuitem)
    {
        return menuitem.expandActionView();
    }

    public final boolean c(MenuItem menuitem)
    {
        return menuitem.isActionViewExpanded();
    }
}
