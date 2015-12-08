// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Iterator;
import java.util.List;

public final class cjg
    implements cje
{

    public final List a;
    public int b;

    public cjg(List list)
    {
        a = (List)b.a(list, "sources", null);
        if (a.isEmpty())
        {
            b = -1;
            return;
        } else
        {
            b = 0;
            return;
        }
    }

    public final void a()
    {
        for (Iterator iterator = a.iterator(); iterator.hasNext(); ((cje)iterator.next()).a()) { }
    }

    public final void a(ciw ciw1)
    {
        ((cje)a.get(b)).a(ciw1);
        if (ciw1.b)
        {
            b = b + 1;
            if (b == a.size())
            {
                b = -1;
            }
        }
    }

    public final volatile void a(Object obj)
    {
        a((ciw)obj);
    }

    public final Object b()
    {
        return c();
    }

    public final ciw c()
    {
        if (b == -1)
        {
            return null;
        } else
        {
            return (ciw)((cje)a.get(b)).b();
        }
    }
}
