// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translatedecoder.decoder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.logging.Logger;

// Referenced classes of package com.google.android.apps.translatedecoder.decoder:
//            p, a

public final class c
{

    private static final Logger d = Logger.getLogger("translate");
    private final Map a;
    private final Map b;
    private final a c;

    public c()
    {
        this(null);
    }

    public c(a a1)
    {
        a = new HashMap();
        b = new HashMap();
        c = a1;
    }

    public final p a(int i, int ai[])
    {
        p p2 = (p)b.get(p.a(ai));
        p p1 = p2;
        if (p2 == null)
        {
            p1 = new p(i, ai);
            b.put(p.a(p1.b), p1);
            List list = (List)a.get(Integer.valueOf(i));
            ai = list;
            if (list == null)
            {
                ai = new ArrayList();
                a.put(Integer.valueOf(i), ai);
            }
            ai.add(p1);
        }
        return p1;
    }

    public final boolean a(int i)
    {
        List list = (List)a.get(Integer.valueOf(i));
        return list != null && list.size() > 0;
    }

    public final List b(int i)
    {
        return (List)a.get(Integer.valueOf(i));
    }

    public final void c(int i)
    {
        b.clear();
        while (!a(i) || c == null) 
        {
            return;
        }
        Map map = a;
        a a1 = c;
        List list = (List)a.get(Integer.valueOf(i));
        int k = a1.b;
        a1.a.addAll(list);
        ArrayList arraylist = new ArrayList();
        for (int j = 0; j < k && j < list.size(); j++)
        {
            arraylist.add(a1.a.poll());
        }

        a1.a.clear();
        map.put(Integer.valueOf(i), arraylist);
    }

}
