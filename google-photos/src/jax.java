// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import android.view.MenuItem;

public final class jax
    implements dhf, nug, omb, opn, opv
{

    private grn a;
    private dhp b;
    private MenuItem c;

    public jax()
    {
    }

    private boolean a()
    {
        Object obj = a.b;
        if (obj != null)
        {
            obj = (hpg)((ekp) (obj)).b(hpg);
            return obj != null && ((hpg) (obj)).c() != null;
        } else
        {
            return false;
        }
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        b = (dhp)olm1.a(dhp);
        a = (grn)olm1.a(grn);
        a.a.a(this, false);
    }

    public final void a(MenuItem menuitem)
    {
        c = menuitem;
        menuitem.setVisible(a());
    }

    public final void b(MenuItem menuitem)
    {
        b.a();
    }

    public final void b_(Object obj)
    {
        if (c != null)
        {
            c.setVisible(a());
        }
    }

    public final void c()
    {
        a.a.a(this);
    }
}
