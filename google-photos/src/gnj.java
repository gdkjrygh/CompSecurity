// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import java.util.HashSet;
import java.util.Set;

final class gnj
    implements gyh, omb, opv
{

    private Set a;
    private noe b;
    private gpx c;
    private egp d;
    private mmr e;

    public gnj(opd opd1)
    {
        a = new HashSet();
        opd1.a(this);
    }

    private void a(gpr gpr, boolean flag)
    {
        if (flag)
        {
            a.add(gpr);
        }
    }

    public final Set a()
    {
        return a;
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        b = (noe)olm1.a(noe);
        context = (gxg)olm1.a(gxg);
        e = (mmr)olm1.a(mmr);
        a.clear();
        a(gye.b, ((gxg) (context)).t);
        a(gye.c, ((gxg) (context)).h);
        a(gye.d, ((gxg) (context)).g);
        a(gye.a, ((gxg) (context)).s);
        c = (gpx)olm1.a(gpx);
        d = (egp)olm1.a(egp);
    }

    public final boolean a(gpr gpr, ekp ekp1)
    {
        if (c != null && !c.b())
        {
            return false;
        }
        if (ekp1 == null)
        {
            return true;
        }
        if (gpr == gye.c)
        {
            if (!d.b() || !euv.c.equals(ekp1.c()))
            {
                gpr = (gtg)ekp1.b(gtg);
                if (gpr != null && gpr.j())
                {
                    return true;
                }
                if (!b.b() || !b.a())
                {
                    return false;
                }
                gpr = (gfn)ekp1.b(gfn);
                if (gpr != null && gpr.g())
                {
                    return true;
                }
            }
            return false;
        }
        if (gpr == gye.b)
        {
            gpr = (gsc)ekp1.b(gsc);
            return gpr == null || ((gsc) (gpr)).a;
        }
        if (gpr == gye.a)
        {
            gpr = (hkh)ekp1.b(hkh);
            if (gpr == null)
            {
                return true;
            }
            gpr = ((hkh) (gpr)).a;
            return e.g().b("gaia_id").equals(((diy) (gpr)).c);
        } else
        {
            return true;
        }
    }
}
