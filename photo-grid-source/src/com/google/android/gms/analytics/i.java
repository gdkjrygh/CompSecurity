// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.text.TextUtils;
import com.google.android.gms.analytics.a.a;
import com.google.android.gms.analytics.a.b;
import com.google.android.gms.analytics.a.c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.analytics:
//            q

public class i
{

    b a;
    Map b;
    List c;
    List d;
    private Map e;

    protected i()
    {
        e = new HashMap();
        b = new HashMap();
        c = new ArrayList();
        d = new ArrayList();
    }

    public final i a(int j, String s)
    {
        a(com.google.android.gms.analytics.q.a(j), s);
        return this;
    }

    public final i a(String s, String s1)
    {
        if (s != null)
        {
            e.put(s, s1);
            return this;
        } else
        {
            com.google.android.gms.analytics.internal.i.a(" HitBuilder.set() called with a null paramName.");
            return this;
        }
    }

    public Map a()
    {
        HashMap hashmap = new HashMap(e);
        if (a != null)
        {
            hashmap.putAll(a.a());
        }
        Iterator iterator = c.iterator();
        for (int j = 1; iterator.hasNext(); j++)
        {
            hashmap.putAll(((c)iterator.next()).a(q.f(j)));
        }

        iterator = d.iterator();
        for (int k = 1; iterator.hasNext(); k++)
        {
            hashmap.putAll(((a)iterator.next()).a(q.d(k)));
        }

        iterator = b.entrySet().iterator();
        for (int l = 1; iterator.hasNext(); l++)
        {
            java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
            Object obj = (List)entry.getValue();
            String s = q.i(l);
            obj = ((List) (obj)).iterator();
            for (int i1 = 1; ((Iterator) (obj)).hasNext(); i1++)
            {
                hashmap.putAll(((a)((Iterator) (obj)).next()).a((new StringBuilder()).append(s).append(q.h(i1)).toString()));
            }

            if (!TextUtils.isEmpty((CharSequence)entry.getKey()))
            {
                hashmap.put((new StringBuilder()).append(s).append("nm").toString(), entry.getKey());
            }
        }

        return hashmap;
    }
}
