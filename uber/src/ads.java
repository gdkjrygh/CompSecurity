// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class ads
    implements Iterable
{

    private final List a = new LinkedList();

    public ads()
    {
    }

    public static boolean a(akk akk)
    {
        akk = c(akk);
        if (akk != null)
        {
            ((adr) (akk)).b.a();
            return true;
        } else
        {
            return false;
        }
    }

    public static boolean b(akk akk)
    {
        return c(akk) != null;
    }

    private static adr c(akk akk)
    {
        for (Iterator iterator1 = ot.p().iterator(); iterator1.hasNext();)
        {
            adr adr1 = (adr)iterator1.next();
            if (adr1.a == akk)
            {
                return adr1;
            }
        }

        return null;
    }

    public final void a(adr adr1)
    {
        a.add(adr1);
    }

    public final void b(adr adr1)
    {
        a.remove(adr1);
    }

    public final Iterator iterator()
    {
        return a.iterator();
    }
}
