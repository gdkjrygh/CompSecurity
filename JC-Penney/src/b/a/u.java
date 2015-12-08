// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;


// Referenced classes of package b.a:
//            ek, q, et, au, 
//            dj, be, cm, du, 
//            ef, ea, ab, dt

final class u extends ek
{

    final Throwable a;
    final long b;
    final q c;

    u(q q1, Throwable throwable, long l)
    {
        c = q1;
        a = throwable;
        b = l;
        super();
    }

    public final void a()
    {
        if (!c.g.b())
        {
            Object obj = new au(a, b);
            ((au) (obj)).a("current_session", c.l);
            obj.e = "he";
            if (a instanceof dj)
            {
                obj.g = ((dj)a).a();
            } else
            {
                obj.g = true;
            }
            if (c.i.a(((cz) (obj))))
            {
                c.n.a(new cm(((au) (obj)).b, ((au) (obj)).c));
                ((au) (obj)).a(c.m);
                ((au) (obj)).b(c.n);
                c.i.b(((cz) (obj)));
                if (c.q.a())
                {
                    obj = new ef(c.c);
                    ((ef) (obj)).a(c.i, new ea(), c.z.k(), "/android_v2/handle_exceptions", null, q.a, new dt());
                    ((ef) (obj)).a(c.r, c.t);
                    c.q.b();
                    return;
                }
            }
        }
    }
}
