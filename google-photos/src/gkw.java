// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Iterator;
import java.util.List;

final class gkw
    implements Runnable
{

    private ehr a;
    private int b;
    private long c;
    private List d;
    private List e;
    private gkt f;

    gkw(gkt gkt1, ehr ehr, int i, long l, List list, List list1)
    {
        f = gkt1;
        a = ehr;
        b = i;
        c = l;
        d = list;
        e = list1;
        super();
    }

    public final void run()
    {
        Object obj = gkt.a(f, a);
        obj.d = b;
        if (!((glj) (obj)).a())
        {
            if (gkt.d(f).a())
            {
                noy.a("key", a);
                noy.a("count", Long.valueOf(c));
                noy.a("num pages", Integer.valueOf(d.size()));
            }
            gla gla1 = gkt.a(f);
            ehr ehr = a;
            b.u();
            gla1.a.b(ehr);
            gla1.a(ehr).a();
            gkt.a(f).a(a, (int)c);
            gkz gkz1;
            for (Iterator iterator = d.iterator(); iterator.hasNext(); gkt.a(f).a(a, gkt.b(f).a(gkz1.a, gkz1.b)))
            {
                gkz1 = (gkz)iterator.next();
            }

            ((glj) (obj)).a(-1, -1);
            obj = e.iterator();
            while (((Iterator) (obj)).hasNext()) 
            {
                ((Runnable)((Iterator) (obj)).next()).run();
            }
        }
    }
}
