// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.http.protocol;

import com.google.common.a.ik;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.facebook.http.protocol:
//            am, v, y, j, 
//            l

public class w
{

    private final am a;

    public w(am am1)
    {
        a = am1;
    }

    public void a(String s, List list)
    {
        a(s, list, null);
    }

    public void a(String s, List list, l l)
    {
        j j1 = a.a();
        java.util.HashMap hashmap = ik.a();
        for (list = list.iterator(); list.hasNext();)
        {
            Object obj1 = (v)list.next();
            List list1 = ((v) (obj1)).a();
            hashmap.put(obj1, list1);
            obj1 = list1.iterator();
            while (((Iterator) (obj1)).hasNext()) 
            {
                j1.a((y)((Iterator) (obj1)).next());
            }
        }

        j1.a(s, l);
        for (s = hashmap.entrySet().iterator(); s.hasNext(); list.a(l))
        {
            Object obj = (java.util.Map.Entry)s.next();
            list = (v)((java.util.Map.Entry) (obj)).getKey();
            l = ik.a();
            String s1;
            for (obj = ((List)((java.util.Map.Entry) (obj)).getValue()).iterator(); ((Iterator) (obj)).hasNext(); l.put(s1, j1.a(s1)))
            {
                s1 = ((y)((Iterator) (obj)).next()).c();
            }

        }

    }
}
