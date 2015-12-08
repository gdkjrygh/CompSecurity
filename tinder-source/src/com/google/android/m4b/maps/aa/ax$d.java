// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.aa;

import com.google.android.m4b.maps.y.j;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.m4b.maps.aa:
//            ax

static class a extends a
{

    final Map a;

    public void clear()
    {
        a.clear();
    }

    public boolean contains(Object obj)
    {
        return a.containsKey(obj);
    }

    public boolean isEmpty()
    {
        return a.isEmpty();
    }

    public Iterator iterator()
    {
        return ax.a(a.entrySet().iterator());
    }

    public boolean remove(Object obj)
    {
        if (contains(obj))
        {
            a.remove(obj);
            return true;
        } else
        {
            return false;
        }
    }

    public int size()
    {
        return a.size();
    }

    (Map map)
    {
        a = (Map)j.a(map);
    }
}
