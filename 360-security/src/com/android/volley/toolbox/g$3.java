// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.volley.toolbox;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

// Referenced classes of package com.android.volley.toolbox:
//            g

class a
    implements Runnable
{

    final g a;

    public void run()
    {
        Iterator iterator = g.b(a).values().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                g.b(a).clear();
                g.a(a, null);
                return;
            }
            a a1 = (a)iterator.next();
            Iterator iterator1 = a(a1).iterator();
            while (iterator1.hasNext()) 
            {
                a a2 = (a)iterator1.next();
                if (a(a2) != null)
                {
                    if (a1.a() == null)
                    {
                        a(a2, b(a1));
                        a(a2).a(a2, false);
                    } else
                    {
                        a(a2).a(a1.a());
                    }
                }
            }
        } while (true);
    }

    (g g1)
    {
        a = g1;
        super();
    }
}
