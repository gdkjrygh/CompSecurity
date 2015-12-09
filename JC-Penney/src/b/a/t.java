// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import org.json.JSONArray;

// Referenced classes of package b.a:
//            ek, q, et, au, 
//            du, el, ds, bd, 
//            ec, eb, ab

final class t extends ek
{

    final Throwable a;
    final long b;
    final q c;

    t(q q1, Throwable throwable, long l)
    {
        c = q1;
        a = throwable;
        b = l;
        super();
    }

    public final void a()
    {
        if (c.g.b())
        {
            return;
        }
        synchronized (c.q)
        {
            if (c.G < 10)
            {
                Object obj = new au(a, b);
                ((au) (obj)).a("current_session", c.l);
                ((au) (obj)).a(c.m);
                obj.e = "he";
                obj.g = true;
                if (c.q.a())
                {
                    obj = (new JSONArray()).put(((au) (obj)).a());
                    (new el((new ds(q.a)).a(bd.b.f(), ((JSONArray) (obj))), new ec((new eb(c.z.k(), "/android_v2/handle_exceptions")).a()), null)).run();
                    obj = c;
                    obj.G = ((q) (obj)).G + 1;
                    c.q.b();
                }
            }
        }
    }
}
