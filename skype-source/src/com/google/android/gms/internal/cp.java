// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.p;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            co, cq, hi

public final class cp
    implements Iterable
{

    private final List a = new LinkedList();

    public cp()
    {
    }

    public static boolean a(hi hi)
    {
        hi = c(hi);
        if (hi != null)
        {
            ((co) (hi)).b.b();
            return true;
        } else
        {
            return false;
        }
    }

    public static boolean b(hi hi)
    {
        return c(hi) != null;
    }

    private static co c(hi hi)
    {
        for (Iterator iterator1 = p.r().iterator(); iterator1.hasNext();)
        {
            co co1 = (co)iterator1.next();
            if (co1.a == hi)
            {
                return co1;
            }
        }

        return null;
    }

    public final void a(co co1)
    {
        a.add(co1);
    }

    public final void b(co co1)
    {
        a.remove(co1);
    }

    public final Iterator iterator()
    {
        return a.iterator();
    }
}
