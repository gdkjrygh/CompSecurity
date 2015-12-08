// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.f.c;

import java.util.List;
import java.util.Vector;
import kik.a.d.a.b;
import kik.a.d.a.g;
import kik.a.d.a.h;
import kik.a.d.j;
import kik.a.d.s;
import kik.a.f.n;

// Referenced classes of package kik.a.f.c:
//            c

public class a extends c
{

    private Vector j;
    private s k;

    protected a()
    {
        super(7);
        j = new Vector();
    }

    protected final void a()
    {
        super.a();
        if (c != null && b != null)
        {
            k = s.a(c.a(), b.a(), e, f, c());
            k.a(h);
            if (d())
            {
                k.b(true);
                k.a(new b());
            } else
            {
                k.a(e());
                if (d != null)
                {
                    k.a(new h(d));
                }
                int i = 0;
                while (i < j.size()) 
                {
                    k.a((g)j.elementAt(i));
                    i++;
                }
            }
            if (this.i.size() > 0)
            {
                k.a(this.i);
            }
        }
    }

    protected final void a(n n1)
    {
        kik.a.f.e.g g1 = kik.a.f.e.h.a(n1.getName());
        if (n1.a("g"))
        {
            c = kik.a.d.j.a(n1.getAttributeValue(null, "jid"));
        }
        if (g1 != null)
        {
            n1 = g1.a(n1);
            if (n1 != null)
            {
                j.add(n1);
            }
            return;
        } else
        {
            super.a(n1);
            return;
        }
    }

    public final s b()
    {
        return k;
    }
}
