// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class opd
{

    private static final Bundle d = new Bundle();
    public final List a = new ArrayList();
    private List b;
    private HashSet c;
    private opi e;
    private opi f;
    private opi g;
    private opi h;

    public opd()
    {
        b = new ArrayList();
        c = new HashSet();
    }

    static String a(opd opd1, opv opv1)
    {
        return b(opv1);
    }

    private static String b(opv opv1)
    {
label0:
        {
            String s = null;
            if (opv1 instanceof ops)
            {
                if (!(opv1 instanceof opw))
                {
                    break label0;
                }
                s = ((opw)opv1).a();
            }
            return s;
        }
        return opv1.getClass().getName();
    }

    public final Bundle a(opv opv1, Bundle bundle)
    {
label0:
        {
            Bundle bundle1 = null;
            if (bundle != null)
            {
                opv1 = b(opv1);
                if (opv1 == null)
                {
                    break label0;
                }
                bundle1 = bundle.getBundle(opv1);
            }
            return bundle1;
        }
        return d;
    }

    public final opi a(opi opi1)
    {
        for (int i = 0; i < a.size(); i++)
        {
            opi1.a((opv)a.get(i));
        }

        b.add(opi1);
        return opi1;
    }

    public final opv a(opv opv1)
    {
        String s = b(opv1);
        if (s != null)
        {
            if (c.contains(s))
            {
                throw new IllegalStateException(String.format("Duplicate observer tag: '%s'. Implement LifecycleObserverTag to provide unique tags.", new Object[] {
                    s
                }));
            }
            c.add(s);
        }
        a.add(opv1);
        for (int i = 0; i < b.size(); i++)
        {
            ((opi)b.get(i)).a(opv1);
        }

        return opv1;
    }

    public final void a(int i, int j, Intent intent)
    {
        for (int i1 = 0; i1 < a.size(); i1++)
        {
            opv opv1 = (opv)a.get(i1);
            if (opv1 instanceof opj)
            {
                ((opj)opv1).a(i, j, intent);
            }
        }

    }

    public final void a(int i, String as[], int ai[])
    {
        for (i = 0; i < a.size(); i++)
        {
            a.get(i);
        }

    }

    public final void a(ContextMenu contextmenu, View view, android.view.ContextMenu.ContextMenuInfo contextmenuinfo)
    {
        for (contextmenu = a.iterator(); contextmenu.hasNext(); contextmenu.next()) { }
    }

    public final boolean a(Menu menu)
    {
        Iterator iterator = a.iterator();
        boolean flag = false;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            opv opv1 = (opv)iterator.next();
            if (opv1 instanceof opm)
            {
                flag = ((opm)opv1).a(menu) | flag;
            }
        } while (true);
        return flag;
    }

    public final boolean a(MenuItem menuitem)
    {
        for (menuitem = a.iterator(); menuitem.hasNext();)
        {
            opv opv1 = (opv)menuitem.next();
            if ((opv1 instanceof opk) && ((opk)opv1).a())
            {
                return true;
            }
        }

        return false;
    }

    public void b()
    {
        b(g);
        for (int i = 0; i < a.size(); i++)
        {
            opv opv1 = (opv)a.get(i);
            if (opv1 instanceof opp)
            {
                ((opp)opv1).am_();
            }
        }

    }

    public final void b(opi opi1)
    {
        b.remove(opi1);
    }

    public final boolean b(Menu menu)
    {
        menu = a.iterator();
        boolean flag = false;
        do
        {
            if (!menu.hasNext())
            {
                break;
            }
            if ((opv)menu.next() instanceof opq)
            {
                flag |= true;
            }
        } while (true);
        return flag;
    }

    public final boolean b(MenuItem menuitem)
    {
        for (Iterator iterator = a.iterator(); iterator.hasNext();)
        {
            opv opv1 = (opv)iterator.next();
            if ((opv1 instanceof opo) && ((opo)opv1).a(menuitem))
            {
                return true;
            }
        }

        return false;
    }

    public void c()
    {
        b(h);
        b(e);
        for (int i = 0; i < a.size(); i++)
        {
            opv opv1 = (opv)a.get(i);
            if (opv1 instanceof opn)
            {
                ((opn)opv1).c();
            }
        }

    }

    public final void c(Bundle bundle)
    {
        e = a(new ope(this, bundle));
    }

    public final void d(Bundle bundle)
    {
        h = a(new oph(this, bundle));
    }

    public final void k()
    {
        f = a(new opf(this));
    }

    public final void l()
    {
        g = a(new opg(this));
    }

    public final void m()
    {
        b(f);
        for (int i = 0; i < a.size(); i++)
        {
            opv opv1 = (opv)a.get(i);
            if (opv1 instanceof opu)
            {
                ((opu)opv1).V_();
            }
        }

    }

    public final void n()
    {
        for (Iterator iterator = a.iterator(); iterator.hasNext(); iterator.next()) { }
    }

}
