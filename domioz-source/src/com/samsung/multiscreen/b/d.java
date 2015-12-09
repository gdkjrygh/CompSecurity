// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.samsung.multiscreen.b;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.samsung.multiscreen.b:
//            c

public final class d
{

    private Map a;
    private String b;

    protected d()
    {
        a = new HashMap();
    }

    public final c a(String s)
    {
        return (c)a.get(s);
    }

    protected final void a()
    {
        b = null;
        a.clear();
    }

    protected final void a(c c1)
    {
        a.put(c1.a(), c1);
    }

    protected final void a(String s, List list)
    {
        b = s;
        a.clear();
        for (s = list.iterator(); s.hasNext(); a.put(list.a(), list))
        {
            list = (c)s.next();
        }

    }

    protected final void b(c c1)
    {
        a.remove(c1.a());
    }
}
