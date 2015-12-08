// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.internal:
//            wb, vs, vv, vx, 
//            vy, wa

public class vr extends wb
    implements Map
{

    vv a;

    public vr()
    {
    }

    private vv b()
    {
        if (a == null)
        {
            a = new vs(this);
        }
        return a;
    }

    public Set entrySet()
    {
        vv vv1 = b();
        if (vv1.b == null)
        {
            vv1.b = new vx(vv1);
        }
        return vv1.b;
    }

    public Set keySet()
    {
        vv vv1 = b();
        if (vv1.c == null)
        {
            vv1.c = new vy(vv1);
        }
        return vv1.c;
    }

    public void putAll(Map map)
    {
        a(h + map.size());
        java.util.Map.Entry entry;
        for (map = map.entrySet().iterator(); map.hasNext(); put(entry.getKey(), entry.getValue()))
        {
            entry = (java.util.Map.Entry)map.next();
        }

    }

    public Collection values()
    {
        vv vv1 = b();
        if (vv1.d == null)
        {
            vv1.d = new wa(vv1);
        }
        return vv1.d;
    }
}
