// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.util.SparseArray;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class mov
    implements mou, omb, opm, opo, opq, opt, opv
{

    private final rz a;
    private int b;
    private boolean c;
    private Handler d;
    private Runnable e;
    private ArrayList f;
    private ArrayList g;
    private ArrayList h;
    private SparseArray i;
    private mox j;

    public mov(rz rz1, opd opd1, int l)
    {
        d = new Handler();
        e = new mow(this);
        f = new ArrayList();
        g = new ArrayList();
        h = new ArrayList();
        i = new SparseArray();
        a = rz1;
        b = l;
        opd1.a(this);
    }

    static rz a(mov mov1)
    {
        return mov1.a;
    }

    static rv b(mov mov1)
    {
        return mov1.c();
    }

    private rv c()
    {
        return a.e().a();
    }

    private void d()
    {
        boolean flag = false;
        if (!c)
        {
            return;
        }
        ArrayList arraylist = new ArrayList();
        rv rv;
        ArrayList arraylist1;
        int l;
        int i1;
        if (!g.isEmpty())
        {
            arraylist.add(g.get(g.size() - 1));
        } else
        {
            arraylist.addAll(f);
        }
        rv = c();
        arraylist1 = h;
        l = 0;
        do
        {
            i1 = ((flag) ? 1 : 0);
            if (l >= arraylist1.size())
            {
                break;
            }
            arraylist.contains((moy)arraylist1.get(l));
            l++;
        } while (true);
        for (; i1 < arraylist.size(); i1++)
        {
            moy moy1 = (moy)arraylist.get(i1);
            if (!arraylist1.contains(moy1))
            {
                moy1.a(rv);
            }
        }

        h = arraylist;
        a();
    }

    public final void X_()
    {
        c = true;
        d();
    }

    public final mou a(moy moy1)
    {
        return c(moy1);
    }

    public final mov a(olm olm1)
    {
        olm1.a(mou, this);
        return this;
    }

    public final void a()
    {
        d.removeCallbacks(e);
        d.post(e);
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        int l;
        for (context = olm1.c(mos).iterator(); context.hasNext(); i.put(l, olm1))
        {
            olm1 = (mos)context.next();
            l = olm1.a();
            if (i.get(l) != null)
            {
                context = String.valueOf(olm1.getClass());
                throw new IllegalStateException((new StringBuilder(String.valueOf(context).length() + 30)).append("Multiple ActionBarController: ").append(context).toString());
            }
            olm1 = olm1.b();
        }

    }

    public final boolean a(Menu menu)
    {
        boolean flag = false;
        a.getMenuInflater().inflate(b, menu);
        j = new mox(this, menu);
        menu = j;
        for (int l = 0; l < ((mox) (menu)).c.i.size(); l++)
        {
            ((mox) (menu)).c.i.valueAt(l);
        }

        for (int i1 = 0; i1 < ((mox) (menu)).a.size(); i1++)
        {
            ((mox) (menu)).a.getItem(i1).setVisible(false);
        }

        int j1 = ((mox) (menu)).c.h.size() - 1;
        int k1;
        do
        {
            k1 = ((flag) ? 1 : 0);
            if (j1 < 0)
            {
                break;
            }
            ((moy)((mox) (menu)).c.h.get(j1)).a(menu);
            j1--;
        } while (true);
        for (; k1 < ((mox) (menu)).c.i.size(); k1++)
        {
            ((mox) (menu)).c.i.valueAt(k1);
        }

        return true;
    }

    public final boolean a(MenuItem menuitem)
    {
label0:
        {
            for (int l = h.size() - 1; l >= 0; l--)
            {
                if (((moy)h.get(l)).a(menuitem))
                {
                    return true;
                }
            }

            menuitem = (List)j.b.get(menuitem.getItemId());
            if (menuitem == null)
            {
                break label0;
            }
            menuitem = menuitem.iterator();
            do
            {
                if (!menuitem.hasNext())
                {
                    break label0;
                }
            } while (!((k)menuitem.next()).y());
            return true;
        }
        return false;
    }

    public final mou b(moy moy1)
    {
        if (!f.contains(moy1))
        {
            throw new IllegalStateException("Attempt to remove non-present ActionBarListener");
        } else
        {
            f.remove(moy1);
            d();
            return this;
        }
    }

    public final mov c(moy moy1)
    {
        if (f.contains(moy1))
        {
            throw new IllegalStateException("Attempt to add ActionBarListener twice");
        } else
        {
            f.add(moy1);
            d();
            return this;
        }
    }
}
