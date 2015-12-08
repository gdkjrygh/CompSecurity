// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.cc;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

// Referenced classes of package p.cc:
//            e, g

public class d
{

    Map a;
    Map b;

    d()
    {
        a = new HashMap();
        b = new HashMap();
    }

    public e a(String s)
    {
        return (e)b.get(s);
    }

    void a(e e1)
    {
        b.put(e1.c(), e1);
    }

    void a(g g1)
    {
        a.put(g1.a(), g1);
    }

    public boolean b(String s)
    {
        return b.containsKey(s);
    }

    public List c(String s)
    {
        ArrayList arraylist = new ArrayList();
        Iterator iterator = b.values().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            e e1 = (e)iterator.next();
            if (e1.a().equals(s))
            {
                arraylist.add(e1.c());
            }
        } while (true);
        return arraylist;
    }
}
