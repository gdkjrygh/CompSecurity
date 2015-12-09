// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class cdy
    implements Iterable
{

    final List a = new LinkedList();

    public cdy()
    {
    }

    public static boolean a(ckw ckw)
    {
        ckw = b(ckw);
        if (ckw != null)
        {
            ((cdx) (ckw)).b.b();
            return true;
        } else
        {
            return false;
        }
    }

    static cdx b(ckw ckw)
    {
        for (Iterator iterator1 = bkv.r().iterator(); iterator1.hasNext();)
        {
            cdx cdx1 = (cdx)iterator1.next();
            if (cdx1.a == ckw)
            {
                return cdx1;
            }
        }

        return null;
    }

    public final Iterator iterator()
    {
        return a.iterator();
    }
}
