// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.volley.toolbox;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

// Referenced classes of package com.android.volley.toolbox:
//            i

final class l
    implements Runnable
{

    final i a;

    l(i j)
    {
        a = j;
        super();
    }

    public final void run()
    {
        for (Iterator iterator = i.a(a).values().iterator(); iterator.hasNext();)
        {
            i.a a1 = (i.a)iterator.next();
            Iterator iterator1 = i.a.a(a1).iterator();
            while (iterator1.hasNext()) 
            {
                i.c c = (i.c)iterator1.next();
                if (i.c.a(c) != null)
                {
                    if (a1.a() == null)
                    {
                        i.c.a(c, i.a.b(a1));
                        i.c.a(c).a(c, false);
                    } else
                    {
                        i.c.a(c).a(a1.a());
                    }
                }
            }
        }

        i.a(a).clear();
        i.b(a);
    }
}
