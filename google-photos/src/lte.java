// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.List;
import java.util.Map;
import java.util.Set;

final class lte
    implements ltg
{

    private Map a;
    private Map b;
    private Map c;
    private Map d;

    lte(ltb ltb, Map map, Map map1, Map map2, Map map3)
    {
        a = map;
        b = map1;
        c = map2;
        d = map3;
        super();
    }

    public final void a(lfx lfx, Set set, Set set1, lsw lsw)
    {
        lsw = (List)a.get(lfx);
        b.get(lfx);
        if (lsw != null)
        {
            set.addAll(lsw);
        }
        set = (List)c.get(lfx);
        d.get(lfx);
        if (set != null)
        {
            set1.addAll(set);
        }
    }
}
