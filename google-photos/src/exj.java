// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import android.util.SparseArray;
import java.util.Calendar;

public final class exj
    implements nug, omb, opt, opu, opv
{

    public exv a;
    private exm b;
    private fqi c;
    private boolean d;
    private boolean e;
    private Context f;
    private exl g;
    private final eyz h;
    private ekq i;
    private ekw j;

    public exj(opd opd1, eyz eyz1, exl exl1)
    {
        this(opd1, eyz1, exl1, (byte)0);
    }

    private exj(opd opd1, eyz eyz1, exl exl1, byte byte0)
    {
        g = exl1;
        h = eyz1;
        opd1.a(this);
    }

    public final void V_()
    {
        if (!d)
        {
            return;
        } else
        {
            b.a(i, j, h).a().a(this);
            return;
        }
    }

    public final void X_()
    {
        e = true;
        if (!d)
        {
            return;
        } else
        {
            b.a(i, j, h).a().a(this, true);
            return;
        }
    }

    public final exh a()
    {
        return b.a(i, j, h);
    }

    public final gml a(ekq ekq1, ekw ekw1, gml gml, int k, exk exk)
    {
        i = (ekq)p.a(ekq1);
        j = (ekw)p.a(ekw1);
        boolean flag;
        if (!e)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.a(flag, "Cannot build factory after onStart");
        d = true;
        a = new exv(f, ekq1, ekw1, h, gml, k, exk);
        return a;
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        f = context;
        c = (fqi)olm1.a(fqi);
        b = (exm)olm1.a(exm);
    }

    public final void b_(Object obj)
    {
        obj = (exh)obj;
        p.a(d, "Notified but not initialized.");
        obj = ((exh) (obj)).c().a();
        Calendar calendar = ivc.a();
        SparseArray sparsearray = new SparseArray();
        while (((eyh) (obj)).a()) 
        {
            calendar.setTimeInMillis(((eyh) (obj)).c());
            int k = ((eyh) (obj)).b();
            Context context = f;
            boolean flag;
            if (!eyz.d.equals(h))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            sparsearray.put(k, new fsi(context, calendar, flag));
        }
        c.a(sparsearray);
        if (g != null)
        {
            g.a();
        }
    }
}
