// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MenuItem;

public final class hog
    implements dhf, omb, opl, ops, opv
{

    Context a;
    boolean b;
    String c;
    String d;
    dgk e;
    dha f;
    private String g;
    private String h;
    private mtj i;
    private int j;

    public hog()
    {
        b = true;
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        a = context;
        g = context.getResources().getString(c.ej);
        h = context.getResources().getString(c.eq);
        f = (dha)olm1.a(dha);
        e = (dgk)olm1.a(dgk);
        context = (mmr)olm1.a(mmr);
        i = ((mtj)olm1.a(mtj)).a("remotemedia.tasks.JoinOrPinEnvelope", new hoh(this));
        j = context.d();
    }

    public final void a(Bundle bundle)
    {
        if (bundle != null)
        {
            b = bundle.getBoolean("PinMenuItemHandler.menu_item_state");
        }
    }

    public final void a(MenuItem menuitem)
    {
        boolean flag;
        if (b)
        {
            menuitem.setTitle(g);
        } else
        {
            menuitem.setTitle(h);
        }
        if (!TextUtils.isEmpty(d))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        menuitem.setEnabled(flag);
        menuitem.setVisible(flag);
    }

    public final void b(MenuItem menuitem)
    {
        menuitem.setEnabled(false);
        if (b)
        {
            menuitem = new fht(j, d, c, true);
            i.a(menuitem);
            return;
        } else
        {
            menuitem = new fht(j, d, c, false);
            i.a(menuitem);
            return;
        }
    }

    public final void e(Bundle bundle)
    {
        bundle.putBoolean("PinMenuItemHandler.menu_item_state", b);
    }
}
