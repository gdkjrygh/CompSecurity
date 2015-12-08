// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class gfa
    implements gey
{

    private final int a;
    private final Set b;
    private final eto c;
    private final fps d;
    private final noz e;
    private final noz f;
    private List g;

    public gfa(Context context, int i, Set set)
    {
        g = Collections.emptyList();
        boolean flag;
        if (set != null && !set.isEmpty())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.a(flag, "can not process empty items");
        a = i;
        b = set;
        d = (fps)olm.a(context, fps);
        c = (eto)olm.a(context, eto);
        e = noz.a(context, 3, "RestoreItemProcesser", new String[] {
            "perf", "sync"
        });
        f = noz.a(context, 2, "RestoreItemProcesser", new String[] {
            "sync"
        });
    }

    public final void a(fkz fkz1)
    {
        long l = noy.a();
        fkz1 = fkz1.a;
        g = c.a(a, (new etj()).a(eun.b).c(fkz1), b);
        if (e.a())
        {
            noy.a("items", g);
            noy.a("duration", l);
        }
    }

    public final void a(List list)
    {
        if (!g.isEmpty())
        {
            long l = noy.a();
            int i;
            for (list = list.iterator(); list.hasNext(); c.a(i, g))
            {
                i = ((Integer)list.next()).intValue();
            }

            list = new hcq(new HashSet(g));
            d.a(a, list);
            if (e.a())
            {
                noy.a("items", g);
                noy.a("duration", l);
                return;
            }
        }
    }
}
