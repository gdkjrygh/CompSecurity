// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.analytics.tracking.android;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.analytics.tracking.android:
//            ae, at, as, ar, 
//            be

final class af
    implements Runnable
{

    final Map a;
    final long b;
    final ae c;

    af(ae ae1, Map map, long l)
    {
        c = ae1;
        a = map;
        b = l;
        super();
    }

    public final void run()
    {
        a.put("clientId", ae.a(c));
        if (ae.b(c) || ae.b(a))
        {
            return;
        }
        if (!TextUtils.isEmpty(ae.c(c)))
        {
            a.put("campaign", ae.c(c));
            ae.d(c);
        }
        ae.a(c, a);
        ae.c(a);
        ae.b(c, a);
        ar ar1 = ae.e(c);
        Map map = a;
        HashMap hashmap = new HashMap();
        Iterator iterator = map.entrySet().iterator();
        do
        {
            if (iterator.hasNext())
            {
                Object obj1 = (java.util.Map.Entry)iterator.next();
                String s = (String)((java.util.Map.Entry) (obj1)).getKey();
                Object obj;
                if (s.startsWith("&"))
                {
                    obj = new at(s.substring(1), null, null);
                } else
                {
                    obj = s;
                    if (s.contains("*"))
                    {
                        obj = s.substring(0, s.indexOf("*"));
                    }
                    obj = (at)ar1.a.get(obj);
                }
                if (obj != null)
                {
                    String s1 = ((at) (obj)).a((String)((java.util.Map.Entry) (obj1)).getKey());
                    if (s1 != null)
                    {
                        obj1 = (String)((java.util.Map.Entry) (obj1)).getValue();
                        s = ((String) (obj1));
                        if (((at) (obj)).b != null)
                        {
                            s = ((at) (obj)).b.a(((String) (obj1)));
                        }
                        if (s != null && !s.equals(((at) (obj)).a))
                        {
                            hashmap.put(s1, s);
                        }
                    }
                }
            } else
            {
                ae.g(c).a(hashmap, b, ae.d(a), ae.f(c));
                return;
            }
        } while (true);
    }
}
