// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.f.f;

import java.util.Vector;
import kik.a.d.s;
import kik.a.f.l;
import kik.a.f.o;
import kik.a.f.t;

// Referenced classes of package kik.a.f.f:
//            z

public final class x extends z
{

    private final Vector a;
    private final String b;
    private final String c;
    private final String d = String.valueOf(l.a());

    public x(Vector vector)
    {
        boolean flag = true;
        super(null);
        if (vector == null || vector.size() == 0)
        {
            throw new IllegalArgumentException("Illegal arguments to OutgoingReceiptStanza");
        }
        b = ((s)vector.elementAt(0)).h();
        for (int i = 1; i < vector.size(); i++)
        {
            if (!b.equals(((s)vector.elementAt(i)).h()))
            {
                throw new IllegalArgumentException("Illegal arguments: not all receipts go to same receiver");
            }
        }

        c = ((s)vector.elementAt(0)).i();
        for (int j = ((flag) ? 1 : 0); j < vector.size(); j++)
        {
            if (!c.equals(((s)vector.elementAt(j)).i()))
            {
                throw new IllegalArgumentException("Illegal arguments: not all receipts go to same bin");
            }
        }

        a = vector;
    }

    public final void a(o o1)
    {
        int i = 0;
        o1.a("message");
        o1.a("type", "receipt");
        o1.a("id", d);
        o1.a("to", ((s)a.elementAt(0)).h());
        if (f)
        {
            o1.a("cts", Long.toString(g));
        }
        t.a(o1, false, true, g);
        o1.a("receipt");
        o1.a("xmlns", "kik:message:receipt");
        o1.a("type", "read");
        for (; i < a.size(); i++)
        {
            o1.a("msgid");
            o1.a("id", ((s)a.elementAt(i)).b());
            o1.b("msgid");
        }

        o1.b("receipt");
        if (!c.equals(b))
        {
            o1.a("g");
            o1.a("jid", c);
            o1.b("g");
        }
        o1.b("message");
        o1.c();
    }

    public final String l_()
    {
        return d;
    }
}
