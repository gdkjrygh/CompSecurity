// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cache;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

// Referenced classes of package com.kik.cache:
//            ad

final class ah
    implements Runnable
{

    final ad a;

    ah(ad ad1)
    {
        a = ad1;
        super();
    }

    public final void run()
    {
        for (Iterator iterator = ad.c(a).values().iterator(); iterator.hasNext();)
        {
            ad.a a1 = (ad.a)iterator.next();
            Iterator iterator1 = ad.a.b(a1).iterator();
            while (iterator1.hasNext()) 
            {
                ad.c c = (ad.c)iterator1.next();
                if (ad.c.a(c) != null)
                {
                    if (a1.a() == null)
                    {
                        ad.c.a(c, ad.a.c(a1));
                        ad.c.a(c).a(c, false);
                    } else
                    {
                        ad.c.a(c).a(a1.a());
                    }
                }
            }
        }

        ad.c(a).clear();
        ad.d(a);
    }
}
