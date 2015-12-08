// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.f.f;

import kik.a.d.aa;
import kik.a.f.j;
import kik.a.f.n;
import kik.a.f.o;
import kik.a.h.i;
import org.d.a.b;

// Referenced classes of package kik.a.f.f:
//            y

public final class ao extends y
{

    private String a;
    private String b;
    private String i;
    private String j;
    private String k;
    private Boolean l;
    private Boolean m;
    private aa n;

    public ao(j j1)
    {
        super(j1, "get");
        n = new aa();
    }

    public ao(j j1, String s, String s1, String s2, Boolean boolean1, String s3, String s4)
    {
        super(j1, "set");
        n = new aa();
        i = kik.a.h.i.c(s);
        j = kik.a.h.i.c(s1);
        k = kik.a.h.i.c(s2);
        a = s3;
        b = s4;
        l = null;
        m = boolean1;
        n.a = s2;
        n.d = s;
        n.e = s1;
    }

    protected final void a(n n1)
    {
        n.g = Boolean.valueOf(true);
        if (!n1.a("query") || !"kik:iq:user-profile".equals(n1.getAttributeValue(null, "xmlns")))
        {
            throw new b("Expected start of user-profile query.");
        }
        while (!n1.b("query")) 
        {
            if (n1.a("email"))
            {
                n.b = new Boolean("true".equals(n1.getAttributeValue(null, "confirmed")));
                n.a = n1.nextText();
            } else
            if (n1.a("first"))
            {
                n.d = n1.nextText();
            } else
            if (n1.a("last"))
            {
                n.e = n1.nextText();
            } else
            if (n1.a("username"))
            {
                n.c = n1.nextText();
            } else
            if (n1.a("pic"))
            {
                n.f = n1.nextText();
            } else
            if (n1.a("notify-new-people"))
            {
                n.h = new Boolean("true".equals(n1.nextText()));
            } else
            if (n1.a("verified"))
            {
                n.i = Boolean.valueOf(true);
            }
            n1.next();
        }
    }

    protected final void b(n n1)
    {
_L9:
        if (n1.b("iq")) goto _L2; else goto _L1
_L1:
        if (!n1.a("error"))
        {
            break MISSING_BLOCK_LABEL_76;
        }
_L7:
        if (n1.b("error")) goto _L4; else goto _L3
_L3:
        if (!n1.a("already-registered")) goto _L6; else goto _L5
_L5:
        c(201);
        a(k);
_L2:
        return;
_L6:
        if (n1.a("first-last-name-rejected"))
        {
            c(202);
        }
        n1.next();
          goto _L7
_L4:
        n1.next();
        if (true) goto _L9; else goto _L8
_L8:
    }

    protected final void b(o o1)
    {
        o1.a("query");
        o1.a("xmlns", "kik:iq:user-profile");
        if ("set".equals(d))
        {
            if (k != null)
            {
                o1.b("email", k);
            }
            if (i != null)
            {
                o1.b("first", i);
            }
            if (j != null)
            {
                o1.b("last", j);
            }
            if (a != null)
            {
                o1.b("passkey-e", a);
            }
            if (b != null)
            {
                o1.b("passkey-u", b);
            }
            if (l != null)
            {
                o1.b("listen-by-default", l.toString());
            }
            if (m != null)
            {
                o1.b("notify-new-people", m.toString());
            }
        }
        o1.b("query");
    }

    public final aa d()
    {
        return n;
    }
}
