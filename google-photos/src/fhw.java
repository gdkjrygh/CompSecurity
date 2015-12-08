// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import android.view.MenuItem;
import java.util.Collections;
import java.util.List;

public final class fhw
    implements dhf, hhv, omb, opp, opr, opv
{

    private ekq a;
    private hhu b;
    private dha c;
    private grn d;
    private int e;

    public fhw()
    {
        e = fhy.a;
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        a = ((ejz)olm1.a(ejz)).b();
        b = (hhu)olm1.a(hhu);
        c = (dha)olm1.a(dha);
        d = (grn)olm1.a(grn);
    }

    public final void a(MenuItem menuitem)
    {
        ilc ilc1 = (ilc)d.b.b(ilc);
        if (ilc1 == null)
        {
            menuitem.setVisible(false);
            return;
        }
        int i;
        if (ilc1.a)
        {
            i = fhy.c;
        } else
        {
            i = fhy.a;
        }
        e = i;
        menuitem.setVisible(true);
        switch (fhx.a[e - 1])
        {
        default:
            return;

        case 1: // '\001'
            menuitem.setEnabled(true);
            menuitem.setIcon(b.pb);
            return;

        case 2: // '\002'
            menuitem.setEnabled(false);
            menuitem.setActionView(b.pc);
            return;

        case 3: // '\003'
            menuitem.setEnabled(false);
            break;
        }
        menuitem.setIcon(b.oY);
    }

    public final void a(ekq ekq)
    {
    }

    public final void a(List list)
    {
        if (list.contains(d.b))
        {
            e = fhy.c;
            c.a();
        }
    }

    public final void al_()
    {
        b.a(this);
    }

    public final void am_()
    {
        b.b(this);
    }

    public final void b(MenuItem menuitem)
    {
        b.a(Collections.singletonMap(a, Collections.singletonList(d.b)));
        e = fhy.b;
        c.a();
    }

    public final void b(ekq ekq)
    {
    }

    public final void b(List list)
    {
        if (list.contains(d.b))
        {
            e = fhy.a;
            c.a();
        }
    }
}
