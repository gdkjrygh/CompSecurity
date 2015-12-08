// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;

public class bmq extends bmb
    implements bpo
{

    private static final String b = bmq.getSimpleName();
    public final bpl a;
    private final bto e = new bmr(this, this, bmx);
    private final bmy f = new bms(this);
    private final bph g = new bmt(this);
    private final Context h;
    private final bmv i;
    private final bqa j;
    private final bnm k;
    private final brl l;
    private final noq m;
    private int n;

    bmq(bmb bmb1, Context context, bmv bmv1, bqa bqa1, bnm bnm1, brl brl1)
    {
        super(bmb1);
        new bmu(this, this, new bxg[] {
            bxg.t
        });
        n = 0;
        h = (Context)b.a(context, "context", null);
        i = (bmv)b.a(bmv1, "display", null);
        j = (bqa)b.a(bqa1, "playerScreenController", null);
        k = (bnm)b.a(bnm1, "initEditorFlow", null);
        l = (brl)b.a(brl1, "saveFlow", null);
        a = new bpl(this, bmv1, this);
        m = (noq)olm.a(context, noq);
    }

    static bmy a(bmq bmq1)
    {
        return bmq1.f;
    }

    static void a(bmq bmq1, int i1)
    {
        if (!bmq1.l.b.f())
        {
            bmq1.n = i1;
            if (bmq1.c.x() == bxd.c)
            {
                bmq1.k.b();
            } else
            if (bmq1.c.b.a == bxf.d)
            {
                bmq1.b();
                return;
            }
        }
    }

    static bmv b(bmq bmq1)
    {
        return bmq1.i;
    }

    private void b()
    {
        int i1 = n;
        n = 0;
        switch (i1)
        {
        default:
            return;

        case 1: // '\001'
            d();
            return;

        case 2: // '\002'
            c();
            j.k();
            i.h();
            bww bww1 = c;
            cyy cyy = c.b.t;
            bww1.b.u = cyy;
            c.a(bwy.b);
            m.a(23, null, false);
            return;

        case 3: // '\003'
            c();
            break;
        }
        if (c.c.d && c.f())
        {
            ((bqv)j.a.b).K_();
            c.a(bwy.d);
            m.a(24, null, false);
            return;
        } else
        {
            m.b(24);
            Log.e(b, "Can't edit storyboard if the storyboard was null or not ready.");
            return;
        }
    }

    static brl c(bmq bmq1)
    {
        return bmq1.l;
    }

    private void d()
    {
        c();
        j.k();
        NetworkInfo networkinfo = ((dds)olm.a(h, dds)).a.getActiveNetworkInfo();
        boolean flag;
        if (networkinfo != null && networkinfo.isConnected())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            i.p();
            m.b(25);
            return;
        } else
        {
            i.f();
            c.a(bwy.c);
            m.a(25, null, false);
            return;
        }
    }

    static void d(bmq bmq1)
    {
        bmq1.b();
    }

    public final void C_()
    {
        i.b(g);
        super.C_();
    }

    public final void a(bmx bmx1)
    {
        e.c(bmx1);
    }

    public final void a(boolean flag)
    {
        if (flag)
        {
            d();
        }
    }

    public final void b(bmx bmx1)
    {
        e.d(bmx1);
    }

    public final void e()
    {
        super.e();
        i.a(g);
    }

}
