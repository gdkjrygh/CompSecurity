// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

// Referenced classes of package com.google.common.a:
//            t, kv, mf

class mg extends t
    implements kv, SortedSet
{

    final mf b;

    mg(mf mf, SortedMap sortedmap)
    {
        b = mf;
        super(mf, sortedmap);
    }

    public Comparator comparator()
    {
        return g().comparator();
    }

    public Object first()
    {
        return g().firstKey();
    }

    SortedMap g()
    {
        return (SortedMap)d();
    }

    public SortedSet headSet(Object obj)
    {
        return new mg(b, g().headMap(obj));
    }

    public Object last()
    {
        return g().lastKey();
    }

    public boolean remove(Object obj)
    {
        boolean flag;
        try
        {
            flag = super.remove(obj);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return false;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return false;
        }
        return flag;
    }

    public SortedSet subSet(Object obj, Object obj1)
    {
        return new mg(b, g().subMap(obj, obj1));
    }

    public SortedSet tailSet(Object obj)
    {
        return new mg(b, g().tailMap(obj));
    }
}
