// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.gsa.shared.io;

import com.google.common.base.p;
import com.google.common.base.q;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.apps.gsa.shared.io:
//            i, HttpRedirectException, HttpException

public final class o
{

    public final int a;
    final String b;
    final ImmutableList c;

    public o(int j, String s, Map map)
    {
        a = j;
        b = (String)p.a(s);
        p.a(map);
        s = new ArrayList(map.size());
        map = map.entrySet().iterator();
        do
        {
            if (!map.hasNext())
            {
                break;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry)map.next();
            if (entry.getKey() != null)
            {
                Iterator iterator = ((List)entry.getValue()).iterator();
                while (iterator.hasNext()) 
                {
                    String s1 = (String)iterator.next();
                    s.add(new i((String)entry.getKey(), s1));
                }
            }
        } while (true);
        c = ImmutableList.copyOf(s);
    }

    public final String a(String s, String s1)
    {
        com.google.common.collect.ej ej = c.iterator();
        Object obj;
        do
        {
            obj = s1;
            if (!ej.hasNext())
            {
                break;
            }
            obj = (i)ej.next();
            if (!((i) (obj)).b.equalsIgnoreCase(s))
            {
                continue;
            }
            obj = ((i) (obj)).c;
            break;
        } while (true);
        return ((String) (obj));
    }

    public final void a(q q1)
    {
        if (!q1.apply(Integer.valueOf(a)))
        {
            boolean flag;
            if (a("Location", null) != null && (a == 302 || a == 301))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                throw new HttpRedirectException(this, (String)p.a(a("Location", null)));
            } else
            {
                throw new HttpException(this);
            }
        } else
        {
            return;
        }
    }
}
