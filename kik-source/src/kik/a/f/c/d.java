// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.f.c;

import java.util.Vector;
import kik.a.d.j;
import kik.a.d.u;
import kik.a.f.n;

// Referenced classes of package kik.a.f.c:
//            c

public class d extends c
{

    private int j;
    private Vector k;
    private u l;

    protected d()
    {
        super(9);
        k = new Vector();
        l = null;
    }

    protected final void a()
    {
        super.a();
        if (j != -1 && b != null && c != null)
        {
            l = new u(j, c.a(), b.a(), k, e);
        }
    }

    protected final void a(n n1)
    {
        if (!n1.a("receipt") || !"kik:message:receipt".equals(n1.getAttributeValue(null, "xmlns"))) goto _L2; else goto _L1
_L1:
        String s = n1.getAttributeValue(null, "type");
        if (!s.equals("sent")) goto _L4; else goto _L3
_L3:
        j = 200;
_L6:
        for (; !n1.b("receipt"); n1.next())
        {
            if (n1.a("msgid"))
            {
                k.addElement(n1.getAttributeValue(null, "id"));
            }
        }

        break; /* Loop/switch isn't completed */
_L4:
        if (s.equals("pushed"))
        {
            j = 300;
        } else
        if (s.equals("delivered"))
        {
            j = 400;
        } else
        if (s.equals("read"))
        {
            j = 500;
        } else
        if (s.equals("error"))
        {
            j = 600;
        }
        if (true) goto _L6; else goto _L5
_L2:
        super.a(n1);
_L5:
    }

    public final u b()
    {
        return l;
    }
}
