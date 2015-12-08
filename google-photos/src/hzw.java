// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.content.res.Resources;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;

public final class hzw
    implements dif
{

    private final hzh a;
    private final Activity b;
    private final EnumSet c;
    private final mmr d;
    private final ejz e;

    public hzw(Activity activity, hzh hzh1, EnumSet enumset)
    {
        b = activity;
        a = hzh1;
        c = enumset;
        d = (mmr)olm.a(activity, mmr);
        e = (ejz)olm.b(activity, ejz);
    }

    public final void a()
    {
        ((dhk)olm.a(b, dhk)).a(pwr.c);
        a.c();
    }

    public final void a(aav aav1)
    {
        aav1 = ((iwq)olm.a(b, iwq)).a();
        if (aav1 != null)
        {
            mk.c(aav1, 1);
        }
    }

    public final boolean a(aav aav1, Menu menu)
    {
        b.getMenuInflater().inflate(b.yq, menu);
        aav1 = ((iwq)olm.a(b, iwq)).a();
        if (aav1 != null)
        {
            mk.c(aav1, 4);
        }
        return true;
    }

    public final boolean a(aav aav1, MenuItem menuitem)
    {
        int i = menuitem.getItemId();
        aav1 = (dhk)olm.a(b, dhk);
        if (i == hzz.a.j)
        {
            aav1.a(pwr.y);
            ((dhw)olm.a(b, dhw)).a();
            return true;
        }
        if (i == hzz.b.j)
        {
            aav1.a(pwr.e);
            ((dho)olm.a(b, dho)).a();
            return true;
        }
        if (i == hzz.c.j)
        {
            aav1.a(pwr.f);
            ((dhr)olm.a(b, dhr)).a();
            return true;
        }
        if (i == hzz.d.j)
        {
            aav1.a(pwr.s);
            ((dhu)olm.a(b, dhu)).a();
            return true;
        }
        if (i == hzz.e.j || i == hzz.f.j)
        {
            aav1.a(pwr.f);
            ((dhp)olm.a(b, dhp)).a();
            return true;
        }
        if (i == hzz.g.j)
        {
            aav1.a(pwr.p);
            ((hkv)olm.a(b, hkv)).c();
            return true;
        }
        if (i == hzz.h.j)
        {
            aav1.a(pwr.q);
            ((dht)olm.a(b, dht)).a();
            return true;
        }
        if (i == hzz.i.j)
        {
            aav1.a(pwz.g);
            ((dhv)olm.a(b, dhv)).a();
            return true;
        } else
        {
            return false;
        }
    }

    public final boolean b(aav aav1, Menu menu)
    {
        Object obj;
        boolean flag;
        int i;
        int j = a.b();
        Object obj1;
        Object obj2;
        Object obj3;
        int k;
        if (j > 0)
        {
            obj = String.valueOf(j);
        } else
        {
            obj = b.getResources().getString(b.yu);
        }
        aav1.b(((CharSequence) (obj)));
        aav1 = hzz.values();
        k = aav1.length;
        i = 0;
_L12:
        if (i >= k) goto _L2; else goto _L1
_L1:
        obj1 = aav1[i];
        obj = menu.findItem(((hzz) (obj1)).j);
        boolean flag1;
        if (c.contains(obj1) && j > 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        ((MenuItem) (obj)).setVisible(flag1);
        if (obj1 == hzz.e && c.contains(obj1))
        {
            ((MenuItem) (obj)).setVisible(false);
            obj3 = a;
            obj2 = new hzx(this, ((MenuItem) (obj)));
            for (obj3 = hzj.a(((hzh) (obj3)).b).iterator(); ((Iterator) (obj3)).hasNext() && ((hzi) (obj2)).a((ekp)((Iterator) (obj3)).next());) { }
        }
        if (obj1 != hzz.g || !c.contains(obj1) || e == null) goto _L4; else goto _L3
_L3:
        obj1 = e.b();
        if (obj1 == null) goto _L4; else goto _L5
_L5:
        obj2 = (ila)((ekq) (obj1)).b(ila);
        if (obj2 != null && ((ila) (obj2)).a)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag) goto _L4; else goto _L6
_L6:
        obj1 = (hjv)((ekq) (obj1)).b(hjv);
        if (obj1 != null && ((hjv) (obj1)).a.a(d.g()))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag) goto _L8; else goto _L7
_L7:
        obj1 = a.b.a().iterator();
        flag = false;
        do
        {
            if (!((Iterator) (obj1)).hasNext())
            {
                break;
            }
            obj2 = (hkh)((ekp)((Iterator) (obj1)).next()).b(hkh);
            if (obj2 != null && ((hkh) (obj2)).a.a(d.g()))
            {
                flag = true;
            }
        } while (true);
        if (!flag) goto _L9; else goto _L8
_L8:
        boolean flag2 = true;
_L10:
        ((MenuItem) (obj)).setVisible(flag2);
_L4:
        i++;
        continue; /* Loop/switch isn't completed */
_L9:
        flag2 = false;
        if (true) goto _L10; else goto _L2
_L2:
        aav1 = (hzr)olm.b(b, hzr);
        if (aav1 != null)
        {
            if (((hzr) (aav1)).b != null)
            {
                ((hzr) (aav1)).b.b();
            }
            aav1.b = ((hzr) (aav1)).a.a(((hzr) (aav1)).c);
        }
        return true;
        if (true) goto _L12; else goto _L11
_L11:
    }
}
