// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

final class dkz
    implements djx
{

    private static final ekz b = (new ela()).a();
    private final gcf c;
    private final dpp d;
    private final noz e;

    dkz(Context context)
    {
        c = (gcf)olm.a(context, gcf);
        d = (dpp)olm.a(context, dpp);
        e = noz.a(context, 2, "AllMediaProvider", new String[] {
            "perf"
        });
    }

    private static eyg a(eyg eyg1)
    {
        dtz dtz1 = new dtz();
        ive ive1 = new ive();
        Object obj = null;
        int i = 0;
        eyh eyh1 = eyg1.a();
        eyg1 = obj;
        while (eyh1.a()) 
        {
            long l = eyh1.c();
            if (eyg1 == null || !eyg1.a(l))
            {
                eyg1 = ive1.a(l);
                dtz1.b(eyh1.b() - i, eyg1.a());
            } else
            {
                i++;
            }
        }
        return eyn.a(dtz1);
    }

    public final boolean a(dke dke1, ekw ekw, Set set)
    {
        return a.containsAll(set) && c.a(dke1.a) && b.a(ekw);
    }

    public final Map b(dke dke1, ekw ekw, Set set)
    {
        p.a(a.containsAll(set));
        long l = noy.a();
        ekw = d.a(dke1.a).b();
        if (e.a())
        {
            noy.a(dke1.a);
            noy.a("duration", l);
        }
        dke1 = new HashMap(set.size());
        if (set.contains(eyz.a))
        {
            dke1.put(eyz.a, ekw);
        }
        if (set.contains(eyz.b))
        {
            dke1.put(eyz.b, a(ekw));
        }
        return dke1;
    }

}
