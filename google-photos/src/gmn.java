// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;

public final class gmn
    implements gkj, gmt, omb, opp, opr, opv
{

    private static final gmp a = new gmo();
    private final gmp b;
    private gkh c;
    private boolean d;
    private boolean e;
    private int f;
    private ehr g;
    private gmk h;
    private gml i;
    private hgq j;

    public gmn(am am, opd opd1)
    {
        this(opd1, a);
    }

    public gmn(opd opd1, gmp gmp1)
    {
        this(opd1, gmp1, (byte)0);
    }

    private gmn(opd opd1, gmp gmp1, byte byte0)
    {
        b = gmp1;
        opd1.a(this);
    }

    public final void a(int k)
    {
        f = k;
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        j = (hgq)olm1.a(hgq);
    }

    public final void a(ehr ehr, gkh gkh1, gmk gmk1, gml gml)
    {
        boolean flag;
        if (!e)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.b(flag, "You cannot initialize after onStart");
        g = ehr;
        c = gkh1;
        h = gmk1;
        i = gml;
        d = true;
    }

    public final void al_()
    {
        e = true;
        if (!d)
        {
            return;
        } else
        {
            c.a(g, this);
            j.a("onStart in PageManagerMixin");
            return;
        }
    }

    public final void am_()
    {
        if (!d)
        {
            return;
        } else
        {
            c.b(g, this);
            return;
        }
    }

    public final gki b(int k, int l)
    {
        if (k != -1 && l != -1)
        {
            k = h.a(i, k);
            l = h.a(i, l);
            hgq hgq1 = j;
            l -= k;
            if (!hgq1.a())
            {
                if (hgq1.b.a())
                {
                    noy noy1 = hgq1.d;
                    noy.a("startPosition", Integer.valueOf(k));
                    noy.a("count", Integer.valueOf(l));
                    noy.a("reason", "PageManagerMixin collection updated");
                    noy.a("isVisible", Boolean.valueOf(hgq1.f));
                    noy.a("isInitialized", Boolean.valueOf(hgq1.g));
                }
            } else
            {
                hgq1.e = false;
                if (hgq1.a.a())
                {
                    noy noy2 = hgq1.d;
                    noy.a("reason", "PageManagerMixin collection updated");
                    noy.a("start", Integer.valueOf(k));
                    noy.a("count", Integer.valueOf(l));
                }
                ((aen) (hgq1.c)).a.a(k, l, null);
            }
        } else
        {
            j.a("PageManagerMixin collection updated");
        }
        b.a();
        return null;
    }

    public final int d()
    {
        return f;
    }

}
