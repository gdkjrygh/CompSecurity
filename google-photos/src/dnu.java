// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.Collections;
import java.util.List;

final class dnu
    implements elf
{

    private static final ekz a;
    private static final ekz b = (new ela()).a();
    private final Context c;
    private final drw d;
    private final doo e;
    private final noz f;
    private final eto g;

    dnu(Context context, drw drw1, doo doo1)
    {
        c = context;
        d = drw1;
        e = doo1;
        g = (eto)olm.a(context, eto);
        f = noz.a(context, 3, "Search", new String[] {
            "perf"
        });
    }

    public final long a(ekq ekq, ekw ekw)
    {
        ekq = (dnx)ekq;
        return g.b(((dnx) (ekq)).c, ekq.c());
    }

    public final Class a()
    {
        return dnx;
    }

    public final List a(ekq ekq, ekw ekw, ekk ekk)
    {
        dnx dnx1 = (dnx)ekq;
        long l = noy.a();
        if (e.a(dnx1.a))
        {
            ekq = (new eky()).a(ekw).a(Collections.singleton(euv.c)).a();
            ekq ekq1 = b.a(dnx1.c, null);
            ekq = (List)b.a(c, ekq1).a(ekq1, ekq, ekk).a();
        } else
        {
            ekq = d.a(dnx1.c, ekw, ekk, new drx[] {
                new dnv(this, dnx1)
            });
        }
        if (f.a())
        {
            b.a(dnx1);
            b.a(ekk);
            b.a(ekw);
            noy.a("total", Integer.valueOf(ekq.size()));
            noy.a("duration", l);
        }
        return ekq;
    }

    public final ekz b()
    {
        return a;
    }

    public final ekz c()
    {
        return b;
    }

    static 
    {
        ela ela1 = new ela();
        ela1.a = true;
        ela1.b = true;
        ela1.f = true;
        ela1.g = true;
        ela1.e = true;
        a = ela1.a();
    }
}
