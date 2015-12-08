// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import android.view.MenuItem;
import java.util.List;

public final class fhu
    implements dhf, hhv, omb, opp, opr, opv
{

    public ekq a;
    private hhu b;
    private dha c;
    private mmr d;
    private ifj e;
    private boolean f;
    private int g;

    public fhu()
    {
        g = fhy.a;
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        b = (hhu)olm1.a(hhu);
        c = (dha)olm1.a(dha);
        d = (mmr)olm1.a(mmr);
        e = (ifj)olm1.a(ifj);
    }

    public final void a(MenuItem menuitem)
    {
        if (a == null || f)
        {
            menuitem.setVisible(false);
        } else
        {
            if (g != fhy.b)
            {
                iku iku1 = (iku)a.b(iku);
                if (iku1 != null && iku1.a)
                {
                    g = fhy.c;
                }
            }
            menuitem.setVisible(true);
            if (!f)
            {
                hjv hjv1;
                switch (fhv.a[g - 1])
                {
                default:
                    return;

                case 1: // '\001'
                    menuitem.setEnabled(true);
                    if (e.a(d.d()))
                    {
                        menuitem.setIcon(b.pa);
                        return;
                    } else
                    {
                        menuitem.setIcon(b.oZ);
                        return;
                    }

                case 2: // '\002'
                    menuitem.setEnabled(false);
                    menuitem.setActionView(b.pc);
                    return;

                case 3: // '\003'
                    menuitem.setEnabled(false);
                    menuitem.setIcon(b.oY);
                    hjv1 = (hjv)a.b(hjv);
                    break;
                }
                boolean flag;
                if (hjv1 != null && hjv1.a.a(d.g()))
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (flag)
                {
                    hjz hjz1 = (hjz)a.b(hjz);
                    if (hjz1 == null || hjz1.b == 1)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    if (flag)
                    {
                        menuitem.setVisible(false);
                        return;
                    }
                }
            }
        }
    }

    public final void a(ekq ekq1)
    {
        if (a.equals(ekq1))
        {
            g = fhy.c;
            c.a();
        }
    }

    public final void a(List list)
    {
    }

    public final void a(boolean flag)
    {
        f = flag;
        if (c != null)
        {
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
        menuitem = b;
        ekq ekq1 = a;
        ((hhu) (menuitem)).a.a(new hly(((hhu) (menuitem)).b.d(), ekq1));
        g = fhy.b;
        c.a();
    }

    public final void b(ekq ekq1)
    {
        if (a.equals(ekq1))
        {
            g = fhy.a;
            c.a();
        }
    }

    public final void b(List list)
    {
    }
}
