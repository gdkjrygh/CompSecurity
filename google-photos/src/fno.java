// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import android.view.MenuItem;

public final class fno
    implements moy, omb, opt, opu, opv
{

    private final int a;
    private final fnl b;
    private mou c;
    private dhk d;
    private fnt e;

    public fno(opd opd1, int i, fnl fnl)
    {
        a = i;
        b = fnl;
        opd1.a(this);
    }

    public final void V_()
    {
        c.b(this);
    }

    public final void X_()
    {
        c.a(this);
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        e = (fnt)olm1.a(fnt);
        c = (mou)olm1.a(mou);
        d = (dhk)olm1.a(dhk);
    }

    public final void a(moz moz1)
    {
        moz1.a(a);
    }

    public final void a(rv rv)
    {
    }

    public final boolean a(MenuItem menuitem)
    {
        if (menuitem.getItemId() == a)
        {
            d.a(pwr.k);
            e.a(b);
            return true;
        } else
        {
            return false;
        }
    }
}
