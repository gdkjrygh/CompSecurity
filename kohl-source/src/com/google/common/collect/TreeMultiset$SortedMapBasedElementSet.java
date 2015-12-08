// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

// Referenced classes of package com.google.common.collect:
//            TreeMultiset

private class ntSet extends ntSet
    implements SortedSet
{

    final TreeMultiset this$0;

    public Comparator comparator()
    {
        return sortedMap().comparator();
    }

    public Object first()
    {
        return sortedMap().firstKey();
    }

    public SortedSet headSet(Object obj)
    {
        return new <init>(sortedMap().headMap(obj));
    }

    public Object last()
    {
        return sortedMap().lastKey();
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

    SortedMap sortedMap()
    {
        return (SortedMap)getMap();
    }

    public SortedSet subSet(Object obj, Object obj1)
    {
        return new <init>(sortedMap().subMap(obj, obj1));
    }

    public SortedSet tailSet(Object obj)
    {
        return new <init>(sortedMap().tailMap(obj));
    }

    ntSet(SortedMap sortedmap)
    {
        this$0 = TreeMultiset.this;
        super(TreeMultiset.this, sortedmap);
    }
}
