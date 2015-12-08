// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.f.f;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Locale;
import kik.a.d.aa;
import kik.a.f.j;
import kik.a.f.n;
import kik.a.f.o;

// Referenced classes of package kik.a.f.f:
//            w

public final class ad extends w
{

    private String a;
    private String b;
    private String i;
    private String j;
    private String k;
    private String l;
    private String m;
    private String n;
    private String o;
    private String p;
    private Hashtable q;
    private String r;
    private Date s;
    private int t;

    public ad(j j1, String s1, String s2, String s3, String s4, String s5, String s6, 
            String s7, Date date, String s8, Hashtable hashtable)
    {
        super(j1, "set");
        t = -1;
        i = s1;
        j = s2;
        k = s5;
        b = s4;
        a = s3;
        l = s6;
        m = s7;
        q = hashtable;
        p = s8;
        s = date;
    }

    protected final void a(n n1)
    {
        n1.a(null, "query");
        n1.b("xmlns", "jabber:iq:register");
        for (; !n1.b("query"); n1.next())
        {
            if (n1.a("node"))
            {
                r = n1.nextText();
            }
        }

        if (r == null)
        {
            t = 0;
            b(100);
            return;
        } else
        {
            t = 200;
            return;
        }
    }

    protected final void b(n n1)
    {
        n1.a(null, "query");
        n1.b("xmlns", "jabber:iq:register");
        t = 0;
        for (; !n1.b("query"); n1.next()) { }
        n1.next();
        if (!n1.a("error")) goto _L2; else goto _L1
_L1:
        if (!"cancel".equals(n1.getAttributeValue(null, "type"))) goto _L4; else goto _L3
_L3:
        t = 0;
_L9:
        if (n1.b("error")) goto _L2; else goto _L5
_L5:
        if (!n1.a("already-registered")) goto _L7; else goto _L6
_L6:
        c(201);
        a(i);
_L2:
        return;
_L4:
        if ("modify".equals(n1.getAttributeValue(null, "type")))
        {
            t = 1;
        }
        continue; /* Loop/switch isn't completed */
_L7:
        if (n1.a("username-already-exists"))
        {
            c(202);
            a(k);
            return;
        }
        if (n1.a("captcha-url"))
        {
            c(203);
            n = n1.nextText();
            return;
        }
        if (!n1.a("message"))
        {
            break; /* Loop/switch isn't completed */
        }
        c(204);
        o = n1.nextText();
_L10:
        n1.next();
        if (true) goto _L9; else goto _L8
_L8:
        if (n1.a("invalid-birthday"))
        {
            c(205);
            return;
        }
        if (n1.a("username-rejected"))
        {
            c(206);
            return;
        }
          goto _L10
        if (true) goto _L9; else goto _L11
_L11:
    }

    protected final void b(o o1)
    {
        o1.a("query");
        o1.a("xmlns", "jabber:iq:register");
        o1.a("email");
        o1.c(i);
        o1.b("email");
        o1.a("passkey-e");
        o1.c(a);
        o1.b("passkey-e");
        o1.a("passkey-u");
        o1.c(b);
        o1.b("passkey-u");
        o1.a("device-id");
        o1.c(j);
        o1.b("device-id");
        o1.a("username");
        o1.c(k);
        o1.b("username");
        o1.a("first");
        o1.c(l);
        o1.b("first");
        o1.a("last");
        o1.c(m);
        o1.b("last");
        o1.a("birthday");
        o1.c((new SimpleDateFormat("yyyy-MM-dd", Locale.US)).format(s));
        o1.b("birthday");
        if (p.length() > 0)
        {
            o1.a("challenge");
            o1.a("response");
            o1.c(p);
            o1.b("response");
            o1.b("challenge");
        }
        if (q != null)
        {
            String s1;
            for (Enumeration enumeration = q.keys(); enumeration.hasMoreElements(); o1.b(s1, (String)q.get(s1)))
            {
                s1 = (String)enumeration.nextElement();
            }

        }
        o1.b("query");
    }

    public final aa d()
    {
        aa aa1 = new aa();
        aa1.c = k;
        aa1.a = i;
        aa1.d = l;
        aa1.e = m;
        return aa1;
    }

    public final String e()
    {
        return r;
    }

    public final String f()
    {
        return k;
    }

    public final String g()
    {
        return n;
    }

    public final String n()
    {
        return o;
    }
}
