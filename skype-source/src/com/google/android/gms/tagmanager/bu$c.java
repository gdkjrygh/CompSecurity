// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.tagmanager:
//            bu

private static final class 
{

    private final Set a = new HashSet();
    private final Map b = new HashMap();
    private final Map c = new HashMap();
    private final Map d = new HashMap();
    private final Map e = new HashMap();
    private com.google.android.gms.internal.c.f f;

    public final Set a()
    {
        return a;
    }

    public final void a(com.google.android.gms.internal.c c1)
    {
        f = c1;
    }

    public final void a(com.google.android.gms.internal.c c1)
    {
        a.add(c1);
    }

    public final void a(com.google.android.gms.internal.c c1, com.google.android.gms.internal.c c2)
    {
        List list = (List)b.get(c1);
        Object obj = list;
        if (list == null)
        {
            obj = new ArrayList();
            b.put(c1, obj);
        }
        ((List) (obj)).add(c2);
    }

    public final void a(com.google.android.gms.internal.c c1, String s)
    {
        List list = (List)d.get(c1);
        Object obj = list;
        if (list == null)
        {
            obj = new ArrayList();
            d.put(c1, obj);
        }
        ((List) (obj)).add(s);
    }

    public final Map b()
    {
        return b;
    }

    public final void b(com.google.android.gms.internal.c c1, com.google.android.gms.internal.c c2)
    {
        List list = (List)c.get(c1);
        Object obj = list;
        if (list == null)
        {
            obj = new ArrayList();
            c.put(c1, obj);
        }
        ((List) (obj)).add(c2);
    }

    public final void b(com.google.android.gms.internal.c c1, String s)
    {
        List list = (List)e.get(c1);
        Object obj = list;
        if (list == null)
        {
            obj = new ArrayList();
            e.put(c1, obj);
        }
        ((List) (obj)).add(s);
    }

    public final Map c()
    {
        return d;
    }

    public final Map d()
    {
        return e;
    }

    public final Map e()
    {
        return c;
    }

    public final com.google.android.gms.internal.c f()
    {
        return f;
    }

    public ()
    {
    }
}
