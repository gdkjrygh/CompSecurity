// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class bra extends bmb
{

    public final bto a = new brb(this, this, bre);
    public final bto b = new bto(this, brg);
    public final brr e;
    public final List f = new ArrayList();
    private final brf g = new brc(this);
    private final bqa h;
    private final Set i = new HashSet();

    bra(bmb bmb1, brr brr1, bqa bqa1)
    {
        super(bmb1);
        e = (brr)b.a(brr1, "spinnerController", null);
        h = (bqa)b.a(bqa1, "playerController", null);
    }

    static brf a(bra bra1)
    {
        return bra1.g;
    }

    private void a(boolean flag)
    {
        e.a("saving", flag);
        ((brg)b.b).a(flag);
    }

    static List b(bra bra1)
    {
        return bra1.f;
    }

    private void e(String s)
    {
        if (!i.isEmpty())
        {
            i.remove(s);
            if (i.isEmpty())
            {
                a(false);
                return;
            }
        }
    }

    public final void a(String s)
    {
        boolean flag;
        if (!c.b.af && !c.b.ae)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (i.isEmpty())
        {
            a(flag);
            h.r();
        }
        i.add(s);
    }

    public final void b(String s)
    {
        if (!i.isEmpty())
        {
            i.remove(s);
            if (i.isEmpty())
            {
                a(false);
                for (s = f.iterator(); s.hasNext(); ((brd)s.next()).a()) { }
                ((brg)b.b).a();
                h.s();
                return;
            }
        }
    }

    public final void c(String s)
    {
        e(s);
        ((bre)a.b).a(true, c.bg);
    }

    public final void d(String s)
    {
        e(s);
        e.a("saving", false);
        a(false);
        ((brg)b.b).a();
    }

    static 
    {
        bra.getSimpleName();
    }
}
