// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.opti.trashclear;

import java.text.Collator;
import java.util.Comparator;
import java.util.Map;

// Referenced classes of package com.qihoo.security.opti.trashclear:
//            b

class a
    implements Comparator
{

    final b a;
    private final Collator b = Collator.getInstance();

    public int a(Map map, Map map1)
    {
        if (Integer.valueOf((String)map.get("pkgMemorySize")).intValue() < Integer.valueOf((String)map1.get("pkgMemorySize")).intValue())
        {
            return 1;
        }
        if (Integer.valueOf((String)map.get("pkgMemorySize")).intValue() > Integer.valueOf((String)map1.get("pkgMemorySize")).intValue())
        {
            return -1;
        }
        String s1 = (String)map.get("pkgName");
        String s = (String)map1.get("pkgName");
        map = s1;
        if (s1 == null)
        {
            map = "";
        }
        map1 = s;
        if (s == null)
        {
            map1 = "";
        }
        return b.compare(map, map1);
    }

    public int compare(Object obj, Object obj1)
    {
        return a((Map)obj, (Map)obj1);
    }

    (b b1)
    {
        a = b1;
        super();
    }
}
