// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.SystemClock;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public final class bpa
    implements blw
{

    private static final String b = bpa.getSimpleName();
    private static final int c;
    public bxh a;
    private final ay d;
    private final rz e;
    private final ba f = new bpb(this);
    private final deg g = new deg(new bpc(this));
    private final bww h;
    private List i;
    private MenuItem j;
    private MenuItem k;
    private MenuItem l;
    private MenuItem m;
    private MenuItem n;
    private MenuItem o;
    private MenuItem p;
    private boolean q;

    private bpa(rz rz1, ay ay1, bww bww1)
    {
        i = new ArrayList();
        e = (rz)b.a(rz1, "activity", null);
        d = (ay)b.a(ay1, "fragmentManager", null);
        h = (bww)b.a(bww1, "applicationState", null);
        a = new bpd(this, h);
        d.a(f);
    }

    public static bpa a(rz rz1, ay ay1, bww bww1)
    {
        rz1 = new bpa(rz1, ay1, bww1);
        rz1.x();
        return rz1;
    }

    private static String a(Class class1)
    {
        class1 = String.valueOf(class1.getSimpleName());
        String s1 = String.valueOf("#");
        long l1 = SystemClock.elapsedRealtimeNanos();
        return (new StringBuilder(String.valueOf(class1).length() + 20 + String.valueOf(s1).length())).append(class1).append(s1).append(l1).toString();
    }

    private void a(al al1)
    {
        String s1 = a(al1.getClass());
        bp bp1 = d.a().a(s1);
        al1.g = false;
        al1.h = true;
        bp1.a(al1, s1);
        al1.f = false;
        al1.d = bp1.b();
        int i1 = al1.d;
    }

    private void a(am am, int i1, int j1)
    {
        String s1 = a(am.getClass());
        d.a().b(b.fM, am, s1).a(0, j1).a(s1).b();
    }

    static void a(bpa bpa1)
    {
        bpa1.x();
    }

    static ay b(bpa bpa1)
    {
        return bpa1.d;
    }

    static List c(bpa bpa1)
    {
        return bpa1.i;
    }

    static int w()
    {
        return c;
    }

    private void x()
    {
        int j1 = d.e();
        Object obj1 = g;
        Object obj;
        boolean flag;
        if (!((deg) (obj1)).d)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        c.a(flag, "beginEdit() called twice. Did you forget to call endEdit()?");
        obj1.d = true;
        if (((deg) (obj1)).c == ((deg) (obj1)).a)
        {
            obj = ((deg) (obj1)).b;
        } else
        {
            obj = ((deg) (obj1)).a;
        }
        ((Set) (obj)).clear();
        ((Set) (obj)).addAll(((deg) (obj1)).c);
        ((Set) (obj)).clear();
        for (int i1 = 0; i1 < j1; i1++)
        {
            obj1 = d.b(i1);
            obj1 = d.a(((az) (obj1)).d());
            if (obj1 != null)
            {
                ((Set) (obj)).add(obj1);
            }
        }

        obj1 = g;
        c.a(((deg) (obj1)).d, "endEdit() called without beginEdit()");
        obj1.d = false;
        Set set;
        if (((deg) (obj1)).c == ((deg) (obj1)).a)
        {
            obj = ((deg) (obj1)).b;
        } else
        {
            obj = ((deg) (obj1)).a;
        }
        set = ((deg) (obj1)).c;
        ((deg) (obj1)).a(set, ((Set) (obj)));
        obj1.c = ((Set) (obj));
        set.clear();
        if (e.e().a() != null)
        {
            e.e().a().d(false);
        }
        obj = v();
        if (obj instanceof chg)
        {
            ((chg)obj).r();
        }
    }

    public final void a()
    {
        a(((al) (new ceh())));
    }

    public final void a(Menu menu)
    {
        j = menu.findItem(b.gd);
        k = menu.findItem(b.gc);
        l = menu.findItem(b.gf);
        m = menu.findItem(b.fZ);
        n = menu.findItem(b.fY);
        o = menu.findItem(b.ga);
        p = menu.findItem(b.ge);
        q = true;
        u();
    }

    public final void a(bph bph)
    {
        i.add(b.a(bph, "listener", null));
    }

    public final void a(boolean flag)
    {
        am am = v();
        if (am instanceof chh)
        {
            ((chh)am).a(flag);
        }
        d.c();
    }

    public final void b(bph bph)
    {
        i.remove(b.a(bph, "listener", null));
    }

    public final boolean b()
    {
        return d.e() != 0;
    }

    public final boolean c()
    {
        return d.e() != 0 && !(v() instanceof cec);
    }

    public final void d()
    {
        int i1 = 0;
        deg deg1 = g;
        boolean flag;
        if (!deg1.d)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        c.a(flag, "Do not call this method between beginEdit() and endEdit()");
        deg1.a(deg1.c, Collections.emptySet());
        deg1.a.clear();
        deg1.b.clear();
        for (int j1 = d.e(); i1 < j1; i1++)
        {
            d.c();
        }

        m();
    }

    public final void e()
    {
        if (b.w(e))
        {
            a(cek.r());
            return;
        } else
        {
            ay ay1 = d;
            nuq nuq1 = new nuq();
            nuq1.a = nup.j;
            nuq1.c = "offline_retry_tag_delete_movie";
            nuq1.e = true;
            nuo.a(ay1, nuq1);
            return;
        }
    }

    public final void f()
    {
        cgp cgp1 = new cgp();
        cgp1.a = true;
        a(cgp1, 0, b.fI);
    }

    public final void g()
    {
        a(new cez(), 0, b.fI);
    }

    public final void h()
    {
        cgz cgz1 = new cgz();
        String s1 = a(cgz1.getClass());
        d.a().b(b.fK, cgz1, s1).a(s1).b();
    }

    public final void i()
    {
        cec cec1 = new cec();
        String s1 = a(cec1.getClass());
        d.a().b(b.fM, cec1, s1).a(s1).b();
    }

    public final void j()
    {
        a(cex.r());
    }

    public final void k()
    {
        a(new ceu());
    }

    public final boolean l()
    {
        am am = v();
        if (am == null)
        {
            return false;
        }
        if ((am instanceof che) && ((che)am).s())
        {
            return true;
        }
        if (b())
        {
            a(true);
            return true;
        } else
        {
            return false;
        }
    }

    public final void m()
    {
        d.b();
    }

    public final void n()
    {
        a(new ceq());
    }

    public final void o()
    {
        a(new cen());
    }

    public final void p()
    {
        a(new cfd());
    }

    public final void q()
    {
        a(cfg.a(cfk.a));
    }

    public final void r()
    {
        a(cfg.a(cfk.b));
    }

    public final void s()
    {
        a(new cgl());
    }

    public final void t()
    {
        a(new chc());
    }

    public final void u()
    {
        boolean flag2 = true;
        boolean flag3 = b();
        Object obj = e.e().a();
        ((rv) (obj)).b(true);
        int i1;
        if (flag3)
        {
            i1 = b.fe;
        } else
        {
            i1 = b.fd;
        }
        ((rv) (obj)).e(i1);
        if (!flag3)
        {
            ((rv) (obj)).a(0.0F);
        }
        if (!q)
        {
            return;
        }
        k.setVisible(flag3);
        boolean flag;
        boolean flag1;
        boolean flag4;
        if (!bpe.b(e))
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (!flag3 && !h.b.G.e && (h.b.a == bxf.i || h.b.a == bxf.d))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        flag4 = h.b.V;
        obj = j;
        if (flag && flag4)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        ((MenuItem) (obj)).setVisible(flag1);
        j.setIcon(null);
        j.setEnabled(h.b.W);
        obj = l;
        if (flag && !flag4)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        ((MenuItem) (obj)).setVisible(flag1);
        obj = m;
        if (flag && !flag4)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        ((MenuItem) (obj)).setVisible(flag1);
        obj = n;
        if (flag && !flag4)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        ((MenuItem) (obj)).setVisible(flag1);
        obj = o;
        if (flag && i1)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        ((MenuItem) (obj)).setVisible(flag1);
        obj = p;
        if (flag3 && i1)
        {
            flag1 = flag2;
        } else
        {
            flag1 = false;
        }
        ((MenuItem) (obj)).setVisible(flag1);
    }

    public final am v()
    {
        Object obj = null;
        int i1 = d.e();
        if (i1 > 0)
        {
            obj = d.b(i1 - 1);
            obj = d.a(((az) (obj)).d());
        }
        Object obj1 = obj;
        if (obj == null)
        {
            obj1 = d.a(c);
        }
        if (obj1 == null)
        {
            Log.w(b, "top fragment was null");
        }
        return ((am) (obj1));
    }

    static 
    {
        c = b.gB;
    }
}
