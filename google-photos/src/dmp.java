// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Map;
import java.util.Set;

final class dmp
    implements eyt
{

    private static final ekz a;
    private static final Set b;
    private final Context c;
    private final noz d;

    dmp(Context context)
    {
        c = context;
        d = noz.a(context, 3, "Search-OnDevice", new String[] {
            "perf"
        });
    }

    public final Class a()
    {
        return dms;
    }

    public final Map a(ekq ekq, ekw ekw, Set set)
    {
        ekq = (dms)ekq;
        p.a(b.containsAll(set));
        long l = noy.a();
        int i = ((dms) (ekq)).a;
        ekw = mvj.b(c, i);
        olm.a(c, gjr);
        ekq = new gjl(dd.b(ekw, gjr.a(((dms) (ekq)).b).a));
        if (d.a())
        {
            noy.a(i);
            noy.a("duration", l);
        }
        long l1 = noy.a();
        ekq = ekq.a(set);
        if (d.a())
        {
            noy.a(i);
            noy.a("duration", l);
            noy.a("processing time", l1);
            noy.a("total types", Integer.valueOf(ekq.size()));
        }
        return ekq;
    }

    public final boolean b(ekq ekq, ekw ekw, Set set)
    {
        return b.containsAll(set) && a.a(ekw);
    }

    static 
    {
        ela ela1 = new ela();
        ela1.c = true;
        a = ela1.a();
        b = Collections.unmodifiableSet(EnumSet.of(eyz.a, eyz.b));
    }
}
