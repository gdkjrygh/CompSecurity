// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a;

import a.a.b.c;
import a.a.b.d;
import a.a.d.b;
import a.a.d.e;
import java.io.IOException;
import java.util.Random;

// Referenced classes of package a.a:
//            c, b

public abstract class a
    implements a.a.c
{

    private String a;
    private String b;
    private String c;
    private a.a.d.c d;
    private e e;
    private a.a.c.a f;
    private a.a.c.a g;
    private boolean h;
    private final Random i = new Random(System.nanoTime());

    public a(String s, String s1)
    {
        a = s;
        b = s1;
        a(new b());
        a(new a.a.d.a());
    }

    public a.a.c.b a(a.a.c.b b1)
        throws d, c, a.a.b.a
    {
        this;
        JVM INSTR monitorenter ;
        if (a == null)
        {
            throw new c("consumer key not set");
        }
        break MISSING_BLOCK_LABEL_24;
        b1;
        this;
        JVM INSTR monitorexit ;
        throw b1;
        if (b == null)
        {
            throw new c("consumer secret not set");
        }
        g = new a.a.c.a();
        if (f != null)
        {
            g.a(f, false);
        }
        a(b1, g);
        c(b1, g);
        b(b1, g);
        a(g);
        g.c("oauth_signature");
        String s = d.a(b1, g);
        a.a.b.a("signature", s);
        e.a(s, b1, g);
        a.a.b.a("Request URL", b1.b());
        this;
        JVM INSTR monitorexit ;
        return b1;
        b1;
        throw new a.a.b.a(b1);
    }

    public a.a.c.b a(Object obj)
        throws d, c, a.a.b.a
    {
        this;
        JVM INSTR monitorenter ;
        obj = a(b(obj));
        this;
        JVM INSTR monitorexit ;
        return ((a.a.c.b) (obj));
        obj;
        throw obj;
    }

    protected String a()
    {
        return Long.toString(System.currentTimeMillis() / 1000L);
    }

    protected void a(a.a.c.a a1)
    {
        if (!a1.containsKey("oauth_consumer_key"))
        {
            a1.a("oauth_consumer_key", a, true);
        }
        if (!a1.containsKey("oauth_signature_method"))
        {
            a1.a("oauth_signature_method", d.a(), true);
        }
        if (!a1.containsKey("oauth_timestamp"))
        {
            a1.a("oauth_timestamp", a(), true);
        }
        if (!a1.containsKey("oauth_nonce"))
        {
            a1.a("oauth_nonce", b(), true);
        }
        if (!a1.containsKey("oauth_version"))
        {
            a1.a("oauth_version", "1.0", true);
        }
        if (!a1.containsKey("oauth_token") && (c != null && !c.equals("") || h))
        {
            a1.a("oauth_token", c, true);
        }
    }

    protected void a(a.a.c.b b1, a.a.c.a a1)
    {
        a1.a(a.a.b.e(b1.a("Authorization")), false);
    }

    public void a(a.a.d.c c1)
    {
        d = c1;
        c1.a(b);
    }

    public void a(e e1)
    {
        e = e1;
    }

    public void a(String s, String s1)
    {
        c = s;
        d.b(s1);
    }

    protected abstract a.a.c.b b(Object obj);

    protected String b()
    {
        return Long.toString(i.nextLong());
    }

    protected void b(a.a.c.b b1, a.a.c.a a1)
        throws IOException
    {
        String s = b1.c();
        if (s != null && s.startsWith("application/x-www-form-urlencoded"))
        {
            a1.a(a.a.b.a(b1.d()), true);
        }
    }

    protected void c(a.a.c.b b1, a.a.c.a a1)
    {
        b1 = b1.b();
        int j = b1.indexOf('?');
        if (j >= 0)
        {
            a1.a(c(b1.substring(j + 1)), true);
        }
    }
}
