// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.a;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.roidapp.photogrid.a:
//            o

public final class n
{

    Map a;
    Map b;

    n()
    {
        a = new HashMap();
        b = new HashMap();
    }

    public final o a(String s)
    {
        return (o)b.get(s);
    }

    final List b(String s)
    {
        ArrayList arraylist = new ArrayList();
        Iterator iterator = b.values().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            o o1 = (o)iterator.next();
            if (o1.a.equals(s))
            {
                arraylist.add(o1.d);
            }
        } while (true);
        return arraylist;
    }
}
