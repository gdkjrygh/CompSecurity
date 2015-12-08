// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import java.util.List;

public final class ifr
    implements dhw, omb, opv
{

    private ejz a;
    private final Activity b;
    private final am c;
    private Context d;
    private mmr e;
    private mpk f;
    private ekb g;
    private dgk h;
    private ifj i;
    private ivy j;
    private fiz k;
    private ekq l;
    private boolean m;
    private final mpj n;

    public ifr(am am1, opd opd1)
    {
        n = new ifs(this);
        b = null;
        c = am1;
        opd1.a(this);
    }

    public ifr(Activity activity, opd opd1)
    {
        n = new ifs(this);
        b = activity;
        c = null;
        opd1.a(this);
    }

    static ekb a(ifr ifr1)
    {
        return ifr1.g;
    }

    static void a(ifr ifr1, ihk ihk1)
    {
        int i1 = ifr1.e.d();
        String s;
        if (!ifr1.i.a(i1))
        {
            if (ihk1.a())
            {
                s = ifr1.d.getString(b.yX);
            } else
            {
                s = null;
            }
        } else
        if (ihk1.d)
        {
            if (ihk1.a())
            {
                s = ifr1.d.getString(b.za);
            } else
            {
                s = ifr1.d.getString(b.zb, new Object[] {
                    ihk1.e
                });
            }
        } else
        if (ihk1.a())
        {
            if (ihk1.c)
            {
                s = ifr1.d.getString(b.yZ);
            } else
            {
                s = ifr1.d.getString(b.yY);
            }
        } else
        if (ihk1.c)
        {
            s = ifr1.d.getString(b.zd, new Object[] {
                ihk1.e
            });
        } else
        {
            s = ifr1.d.getString(b.zc, new Object[] {
                ihk1.e
            });
        }
        if (s != null)
        {
            dgg dgg1 = ifr1.h.a();
            dgg1.d = s;
            if (ifr1.i.a(i1))
            {
                int j1 = b.ze;
                ifr1 = new ift(ifr1, i1, ihk1);
                ihk1 = dgg1.b.getString(j1);
                boolean flag;
                if (dgg1.c.size() <= 0)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                p.b(flag, "You can only add %s buttons.", new Object[] {
                    Integer.valueOf(1)
                });
                dgg1.c.add(new dgj(ihk1, ifr1, 0));
            }
            dgg1.a().c();
        }
    }

    static boolean a(ifr ifr1, boolean flag)
    {
        ifr1.m = false;
        return false;
    }

    static void b(ifr ifr1)
    {
        if (ifr1.i.a(ifr1.e.d()))
        {
            ifr1 = ifr1.k;
        }
    }

    private Activity c()
    {
        if (b == null)
        {
            return c.O_();
        } else
        {
            return b;
        }
    }

    static Context c(ifr ifr1)
    {
        return ifr1.d;
    }

    public final void a()
    {
        a(((List) (g.a())), ((dhx) (null)));
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        d = context;
        e = (mmr)olm1.a(mmr);
        f = (mpk)olm1.a(mpk);
        f.a(b.yW, n);
        g = (ekb)olm1.a(ekb);
        h = (dgk)olm1.a(dgk);
        i = (ifj)olm1.a(ifj);
        j = (ivy)olm1.a(ivy);
        k = (fiz)olm1.a(fiz);
        a = (ejz)olm1.b(ejz);
    }

    public final void a(List list, dhx dhx)
    {
        if (m)
        {
            return;
        } else
        {
            int i1 = e.d();
            ifx ifx1 = new ifx(d, i1);
            ifx1.a = list;
            ifx1.c = dhx;
            ifx1.d = j.a;
            list = ifx1.a();
            f.a(b.yW, list);
            m = true;
            c().overridePendingTransition(q.av, 0);
            return;
        }
    }

    public final void b()
    {
        if (!m)
        {
            int i1 = e.d();
            if (a != null && a.b() != null)
            {
                l = a.b();
                Object obj = new ifx(d, i1);
                obj.b = l;
                obj.d = j.a;
                obj = ((ifx) (obj)).a();
                f.a(b.yW, ((android.content.Intent) (obj)));
                m = true;
                c().overridePendingTransition(q.av, 0);
                return;
            }
        }
    }
}
