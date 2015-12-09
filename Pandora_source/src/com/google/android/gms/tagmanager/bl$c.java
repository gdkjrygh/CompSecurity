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
//            bl

private static class a
{

    private final Set a = new HashSet();
    private final Map b = new HashMap();
    private final Map c = new HashMap();
    private final Map d = new HashMap();
    private final Map e = new HashMap();
    private com.google.android.gms.internal.zza f;

    public Set a()
    {
        return a;
    }

    public void a(com.google.android.gms.internal.zza zza)
    {
        f = zza;
    }

    public void a(com.google.android.gms.internal.zze zze)
    {
        a.add(zze);
    }

    public void a(com.google.android.gms.internal.zze zze, com.google.android.gms.internal.zza zza)
    {
        List list = (List)b.get(zze);
        Object obj = list;
        if (list == null)
        {
            obj = new ArrayList();
            b.put(zze, obj);
        }
        ((List) (obj)).add(zza);
    }

    public void a(com.google.android.gms.internal.zze zze, String s)
    {
        List list = (List)d.get(zze);
        Object obj = list;
        if (list == null)
        {
            obj = new ArrayList();
            d.put(zze, obj);
        }
        ((List) (obj)).add(s);
    }

    public Map b()
    {
        return b;
    }

    public void b(com.google.android.gms.internal.zze zze, com.google.android.gms.internal.zza zza)
    {
        List list = (List)c.get(zze);
        Object obj = list;
        if (list == null)
        {
            obj = new ArrayList();
            c.put(zze, obj);
        }
        ((List) (obj)).add(zza);
    }

    public void b(com.google.android.gms.internal.zze zze, String s)
    {
        List list = (List)e.get(zze);
        Object obj = list;
        if (list == null)
        {
            obj = new ArrayList();
            e.put(zze, obj);
        }
        ((List) (obj)).add(s);
    }

    public Map c()
    {
        return d;
    }

    public Map d()
    {
        return e;
    }

    public Map e()
    {
        return c;
    }

    public com.google.android.gms.internal.zza f()
    {
        return f;
    }

    public a()
    {
    }
}
