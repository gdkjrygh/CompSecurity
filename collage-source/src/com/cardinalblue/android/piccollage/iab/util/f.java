// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.iab.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.cardinalblue.android.piccollage.iab.util:
//            g, i

public class f
{

    Map a;
    Map b;

    f()
    {
        a = new HashMap();
        b = new HashMap();
    }

    public g a(String s)
    {
        return (g)b.get(s);
    }

    void a(g g1)
    {
        b.put(g1.d(), g1);
    }

    void a(i j)
    {
        a.put(j.a(), j);
    }

    List b(String s)
    {
        ArrayList arraylist = new ArrayList();
        Iterator iterator = b.values().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            g g1 = (g)iterator.next();
            if (g1.a().equals(s))
            {
                arraylist.add(g1.d());
            }
        } while (true);
        return arraylist;
    }
}
