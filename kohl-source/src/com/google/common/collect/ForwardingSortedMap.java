// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;

// Referenced classes of package com.google.common.collect:
//            ForwardingMap

public abstract class ForwardingSortedMap extends ForwardingMap
    implements SortedMap
{

    protected ForwardingSortedMap()
    {
    }

    private int unsafeCompare(Object obj, Object obj1)
    {
        Comparator comparator1 = comparator();
        if (comparator1 == null)
        {
            return ((Comparable)obj).compareTo(obj1);
        } else
        {
            return comparator1.compare(obj, obj1);
        }
    }

    public Comparator comparator()
    {
        return _mthdelegate().comparator();
    }

    protected volatile Object _mthdelegate()
    {
        return _mthdelegate();
    }

    protected volatile Map _mthdelegate()
    {
        return _mthdelegate();
    }

    protected abstract SortedMap _mthdelegate();

    public Object firstKey()
    {
        return _mthdelegate().firstKey();
    }

    public SortedMap headMap(Object obj)
    {
        return _mthdelegate().headMap(obj);
    }

    public Object lastKey()
    {
        return _mthdelegate().lastKey();
    }

    protected boolean standardContainsKey(Object obj)
    {
        boolean flag = false;
        int i;
        try
        {
            i = unsafeCompare(tailMap(obj).firstKey(), obj);
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
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return false;
        }
        if (i == 0)
        {
            flag = true;
        }
        return flag;
    }

    protected Object standardRemove(Object obj)
    {
label0:
        {
            try
            {
                Iterator iterator = tailMap(obj).entrySet().iterator();
                if (!iterator.hasNext())
                {
                    break label0;
                }
                java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
                if (unsafeCompare(entry.getKey(), obj) != 0)
                {
                    break label0;
                }
                obj = entry.getValue();
                iterator.remove();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                return null;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                return null;
            }
            return obj;
        }
        return null;
    }

    protected SortedMap standardSubMap(Object obj, Object obj1)
    {
        return tailMap(obj).headMap(obj1);
    }

    public SortedMap subMap(Object obj, Object obj1)
    {
        return _mthdelegate().subMap(obj, obj1);
    }

    public SortedMap tailMap(Object obj)
    {
        return _mthdelegate().tailMap(obj);
    }
}
