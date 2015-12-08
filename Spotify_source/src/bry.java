// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class bry
{

    public final Set a;
    final Set b;
    public final Map c;
    public final String d;
    final String e;
    public final col f;
    public Integer g;

    public bry(Set set, Map map, String s, String s1, col col)
    {
        if (set == null)
        {
            set = Collections.EMPTY_SET;
        } else
        {
            set = Collections.unmodifiableSet(set);
        }
        a = set;
        set = map;
        if (map == null)
        {
            set = Collections.EMPTY_MAP;
        }
        c = set;
        d = s;
        e = s1;
        f = col;
        set = new HashSet(a);
        for (map = c.values().iterator(); map.hasNext(); set.addAll(((brz)map.next()).a)) { }
        b = Collections.unmodifiableSet(set);
    }
}
