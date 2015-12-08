// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.f.f;

import java.util.Enumeration;
import java.util.Hashtable;
import kik.a.d.aa;
import kik.a.f.j;
import kik.a.f.n;
import kik.a.f.o;

// Referenced classes of package kik.a.f.f:
//            w

public final class ae extends w
{

    private String a;
    private String b;
    private String i;
    private String j;
    private String k;
    private String l;
    private String m;
    private int n;
    private Hashtable o;
    private aa p;

    public ae(j j1, String s, String s1, String s2, String s3, Hashtable hashtable)
    {
        super(j1, "set");
        n = -1;
        a = s;
        l = s3;
        b = s2;
        o = hashtable;
        k = s1;
    }

    protected final void a(n n1)
    {
        n1.a(null, "query");
        n1.b("xmlns", "jabber:iq:register");
        p = new aa();
        while (!n1.b("query")) 
        {
            if (n1.a("node"))
            {
                m = n1.nextText();
            } else
            if (n1.a("email"))
            {
                p.b = new Boolean("true".equals(n1.getAttributeValue(null, "confirmed")));
                p.a = n1.nextText();
            } else
            if (n1.a("first"))
            {
                p.d = n1.nextText();
            } else
            if (n1.a("last"))
            {
                p.e = n1.nextText();
            } else
            if (n1.a("username"))
            {
                p.c = n1.nextText();
            } else
            if (n1.a("pic"))
            {
                p.f = n1.nextText();
            } else
            if (n1.a("notify-new-people"))
            {
                p.h = new Boolean("true".equals(n1.nextText()));
            }
            n1.next();
        }
        if (m == null)
        {
            n = 0;
            b(100);
            return;
        } else
        {
            n = 200;
            return;
        }
    }

    protected final void b(n n1)
    {
        n1.a(null, "query");
        n1.b("xmlns", "jabber:iq:register");
        for (; !n1.b("query"); n1.next()) { }
        n1.next();
        if (!n1.a("error")) goto _L2; else goto _L1
_L1:
        if (!"cancel".equals(n1.getAttributeValue(null, "type")) && "modify".equals(n1.getAttributeValue(null, "type")))
        {
            n = 1;
        } else
        {
            n = 0;
        }
_L9:
        if (n1.b("error")) goto _L2; else goto _L3
_L3:
        if (!n1.a("not-registered")) goto _L5; else goto _L4
_L4:
        if (a.indexOf("@") <= 0) goto _L7; else goto _L6
_L6:
        c(201);
        a(a);
_L2:
        return;
_L7:
        c(202);
        a(a);
        return;
_L5:
        if (n1.a("password-mismatch"))
        {
            c(203);
            return;
        }
        if (n1.a("device-change-timeout"))
        {
            c(204);
            return;
        }
        if (n1.a("captcha-url"))
        {
            c(205);
            i = n1.nextText();
            return;
        }
        if (n1.a("message"))
        {
            c(206);
            j = n1.nextText();
        }
        n1.next();
        if (true) goto _L9; else goto _L8
_L8:
    }

    protected final void b(o o1)
    {
        o1.a("query");
        o1.a("xmlns", "jabber:iq:register");
        Object obj;
        if (a.indexOf('@') >= 0)
        {
            o1.b("email", a);
        } else
        {
            o1.b("username", a);
        }
        if (a.indexOf('@') >= 0)
        {
            obj = "passkey-e";
        } else
        {
            obj = "passkey-u";
        }
        o1.a(((String) (obj)));
        o1.c(l);
        o1.b(((String) (obj)));
        if (k.length() > 0)
        {
            o1.a("challenge");
            o1.a("response");
            o1.c(k);
            o1.b("response");
            o1.b("challenge");
        }
        o1.a("device-id");
        o1.c(b);
        o1.b("device-id");
        if (o != null)
        {
            String s;
            for (obj = o.keys(); ((Enumeration) (obj)).hasMoreElements(); o1.b(s, (String)o.get(s)))
            {
                s = (String)((Enumeration) (obj)).nextElement();
            }

        }
        o1.b("query");
    }

    public final aa d()
    {
        return p;
    }

    public final String e()
    {
        return m;
    }

    public final String f()
    {
        return i;
    }

    public final String g()
    {
        return j;
    }
}
