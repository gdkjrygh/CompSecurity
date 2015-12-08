// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import android.view.MenuItem;
import java.util.List;

public final class hey
    implements moy, omb, opv
{

    private nfw a;
    private mmv b;
    private dhk c;

    public hey(opd opd1)
    {
        opd1.a(this);
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        a = (nfw)olm1.a(nfw);
        b = (mmv)olm1.a(mmv);
        c = (dhk)olm1.a(dhk);
        ((mou)olm1.a(mou)).a(this);
    }

    public final void a(moz moz1)
    {
        boolean flag = true;
        if (b.a(new String[] {
    "logged_in"
}).size() <= 1)
        {
            flag = false;
        }
        moz1.b(aw.f).setVisible(flag);
    }

    public final void a(rv rv)
    {
    }

    public final boolean a(MenuItem menuitem)
    {
        if (menuitem.getItemId() == aw.f)
        {
            c.a(pwv.f);
            menuitem = a;
            ngg ngg1 = new ngg();
            ngg1.d = true;
            ngg1.i = true;
            menuitem.a(ngg1.a(ngl, null));
            return true;
        } else
        {
            return false;
        }
    }
}
