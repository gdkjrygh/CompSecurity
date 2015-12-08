// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.k;

import com.c.b.as;
import com.kik.m.e;
import kik.a.f.f.y;
import kik.a.f.n;
import kik.a.f.o;

// Referenced classes of package kik.a.k:
//            b

public final class d extends y
{

    private final String a;
    private final String b;
    private final as i;
    private final b j;
    private Object k;

    private d(b b1)
    {
        super(null, "set");
        j = b1;
        a = b1.a();
        b = b1.b();
        i = b1.c();
    }

    public static d a(b b1)
    {
        return new d(b1);
    }

    protected final void a(n n1)
    {
        String s = null;
        n1.a(null, "query");
        n1.b("xmlns", "kik:iq:xiphias:bridge");
        while (!n1.b("query")) 
        {
            String s1 = s;
            if (n1.a("body"))
            {
                try
                {
                    s1 = n1.nextText();
                }
                catch (Exception exception)
                {
                    exception = s;
                }
            }
            n1.next();
            s = s1;
        }
        if (s != null)
        {
            k = j.a(e.a(s, 16));
        }
    }

    protected final void b(o o1)
    {
        o1.a("query");
        o1.a("xmlns", "kik:iq:xiphias:bridge");
        o1.a("service", a);
        o1.a("method", b);
        o1.a("body");
        o1.c(e.b(i.b_()));
        o1.b("body");
        o1.b("query");
    }

    public final Object d()
    {
        return k;
    }
}
