// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.f.f;

import java.net.MalformedURLException;
import java.net.URL;
import kik.a.f.j;
import kik.a.f.n;
import kik.a.f.o;

// Referenced classes of package kik.a.f.f:
//            y

public final class b extends y
{

    private final String a;
    private final String b;
    private final String i;
    private String j;
    private long k;
    private boolean l;

    public b(j j1, String s, String s1, String s2)
    {
        super(j1, "set");
        l = false;
        a = s;
        b = s1;
        i = s2;
        b(30000L);
    }

    private static boolean a(String s)
    {
        try
        {
            new URL(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return false;
        }
        return true;
    }

    public final String a()
    {
        return j;
    }

    protected final void a(n n1)
    {
        for (; !n1.b("query") && !n1.b("iq"); n1.next())
        {
            if (n1.a("url"))
            {
                j = n1.nextText();
                if (!a(j))
                {
                    j = null;
                    b(105);
                }
            }
            if (!n1.a("revalidate"))
            {
                continue;
            }
            String s = n1.nextText();
            if (s != null)
            {
                k = Long.valueOf(s).longValue();
            }
        }

    }

    public final long b()
    {
        return k * 1000L;
    }

    protected final void b(n n1)
    {
        super.b(n1);
        for (; !n1.b("query") && !n1.b("iq"); n1.next())
        {
            if (n1.a("regenerate-key"))
            {
                l = true;
            }
        }

    }

    protected final void b(o o1)
    {
        o1.a("query");
        o1.a("xmlns", "kik:auth:cert");
        if (i != null)
        {
            o1.b("url", i);
        }
        o1.a("key");
        o1.a("type", "rsa");
        o1.b("der", a);
        o1.b("signature", b);
        o1.b("key");
        o1.b("query");
    }

    public final boolean d()
    {
        return l;
    }
}
