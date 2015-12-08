// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.b;

import android.net.Uri;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class a
{

    private final Pattern a;
    private HashMap b;

    public a(String s)
    {
        b = new HashMap();
        s = (new StringBuilder()).append(s).append("/?(\\?.*)?").toString();
        Pattern pattern = Pattern.compile("\\{[^/]+\\}");
        Matcher matcher;
        String s1;
        String s2;
        for (matcher = pattern.matcher(s); matcher.find(); b.put(s1, s2))
        {
            s2 = matcher.group();
            s1 = s2.replace("{", "").replace("}", "");
            s2 = pattern.matcher(s.replace(s2, "(.*)")).replaceAll("[^/]+");
        }

        a = Pattern.compile(matcher.replaceAll("[^/]+"), 2);
    }

    public final HashMap a(String s)
    {
        HashMap hashmap = new HashMap();
        if (!b(s))
        {
            throw new IllegalArgumentException("not a handled url");
        }
        Iterator iterator = b.entrySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
            Object obj = Pattern.compile((String)entry.getValue(), 2).matcher(s);
            if (((Matcher) (obj)).find())
            {
                String s1 = ((Matcher) (obj)).group(1);
                obj = s1;
                if (s1 != null)
                {
                    obj = Uri.decode(s1);
                }
                hashmap.put(entry.getKey(), obj);
            }
        } while (true);
        return hashmap;
    }

    public abstract void a(Map map, Map map1);

    public final boolean b(String s)
    {
        return a.matcher(s).matches();
    }
}
