// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.flurry.sdk:
//            lp

public class ki
{

    private final HashMap a = new HashMap();

    public ki()
    {
    }

    public int a()
    {
        return a.size();
    }

    public String a(String s)
    {
        if (s == null)
        {
            return null;
        } else
        {
            return (String)a.get(s);
        }
    }

    public void a(String s, String s1)
    {
        if (s == null)
        {
            return;
        } else
        {
            a.put(s, s1);
            return;
        }
    }

    public String b()
    {
        StringBuilder stringbuilder = new StringBuilder();
        Object obj = a.entrySet();
        if (((Set) (obj)).size() > 0)
        {
            for (obj = ((Set) (obj)).iterator(); ((Iterator) (obj)).hasNext(); stringbuilder.append("&"))
            {
                java.util.Map.Entry entry = (java.util.Map.Entry)((Iterator) (obj)).next();
                stringbuilder.append(lp.c((String)entry.getKey()));
                stringbuilder.append("=");
                stringbuilder.append(lp.c((String)entry.getValue()));
            }

            stringbuilder.deleteCharAt(stringbuilder.length() - 1);
        }
        return stringbuilder.toString();
    }

    public boolean equals(Object obj)
    {
        if (obj == null || !(obj instanceof ki))
        {
            return false;
        }
        obj = (ki)obj;
        if (((ki) (obj)).a() != a())
        {
            return false;
        }
        for (Iterator iterator = a.entrySet().iterator(); iterator.hasNext();)
        {
            Object obj1 = (java.util.Map.Entry)iterator.next();
            String s = (String)((java.util.Map.Entry) (obj1)).getValue();
            obj1 = ((ki) (obj)).a((String)((java.util.Map.Entry) (obj1)).getKey());
            if (s != obj1 && (s == null || !s.equals(obj1)))
            {
                return false;
            }
        }

        return true;
    }
}
