// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.f.f;

import java.io.IOException;
import kik.a.f.j;
import kik.a.f.l;
import kik.a.f.n;
import kik.a.f.o;
import org.d.a.b;

// Referenced classes of package kik.a.f.f:
//            z

public abstract class y extends z
{

    protected String c;
    protected String d;
    protected String e;

    public y(j j, String s)
    {
        super(j);
        d = s;
        e = l.a();
        c = null;
        b(15000L);
    }

    protected abstract void a(n n1);

    public void a(o o1)
    {
        o1.c(null, "iq");
        if (c != null)
        {
            o1.a(null, "to", c);
        }
        if (d != null)
        {
            o1.a(null, "type", d);
        }
        o1.a(null, "id", e);
        if (f && i())
        {
            o1.a("cts", Long.toString(g));
        }
        b(o1);
        o1.d(null, "iq");
        o1.c();
    }

    protected void b(n n1)
    {
    }

    protected abstract void b(o o1);

    public final void c(n n1)
    {
        n1.a(null, "iq");
        if (!e.equals(n1.getAttributeValue(null, "id")))
        {
            throw new b("Wrong iq id");
        }
        if (!n1.getAttributeValue(null, "type").equals("result")) goto _L2; else goto _L1
_L1:
        n1.nextTag();
        if (!n1.b("iq"))
        {
            a(n1);
        }
        a(2);
_L3:
        for (; n1.getEventType() != 3 || !"iq".equals(n1.getName()); n1.next()) { }
        break MISSING_BLOCK_LABEL_188;
_L2:
        if (!n1.getAttributeValue(null, "type").equals("error"))
        {
            break MISSING_BLOCK_LABEL_178;
        }
        n1.nextTag();
        if (n1.b("iq"))
        {
            break MISSING_BLOCK_LABEL_159;
        }
        c(103);
        b(n1);
_L4:
        a(3);
          goto _L3
        try
        {
            c(105);
        }
        // Misplaced declaration of an exception variable
        catch (n n1)
        {
            a(106, n1);
            throw n1;
        }
        // Misplaced declaration of an exception variable
        catch (n n1)
        {
            a(107, n1);
            throw n1;
        }
          goto _L4
        throw new b("Got unknown iq type.");
          goto _L3
    }

    public final boolean h()
    {
        return true;
    }

    protected boolean i()
    {
        return false;
    }

    public final String l_()
    {
        return e;
    }
}
