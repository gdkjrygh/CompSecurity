// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.p;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            Maps, dl, bl

public final class ed
{

    static int a(Set set)
    {
        set = set.iterator();
        int i = 0;
        while (set.hasNext()) 
        {
            Object obj = set.next();
            int j;
            if (obj != null)
            {
                j = obj.hashCode();
            } else
            {
                j = 0;
            }
            i = ~~(i + j);
        }
        return i;
    }

    public static HashSet a(int i)
    {
        return new HashSet(Maps.a(i));
    }

    public static transient HashSet a(Object aobj[])
    {
        HashSet hashset = a(aobj.length);
        Collections.addAll(hashset, aobj);
        return hashset;
    }

    static boolean a(Set set, Object obj)
    {
        if (set != obj) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        if (!(obj instanceof Set))
        {
            break MISSING_BLOCK_LABEL_54;
        }
        obj = (Set)obj;
        boolean flag;
        try
        {
            if (set.size() != ((Set) (obj)).size())
            {
                break; /* Loop/switch isn't completed */
            }
            flag = set.containsAll(((Collection) (obj)));
        }
        // Misplaced declaration of an exception variable
        catch (Set set)
        {
            return false;
        }
        // Misplaced declaration of an exception variable
        catch (Set set)
        {
            return false;
        }
        if (flag) goto _L1; else goto _L3
_L3:
        return false;
        return false;
    }

    static boolean a(Set set, Collection collection)
    {
        p.a(collection);
        Object obj = collection;
        if (collection instanceof dl)
        {
            obj = ((dl)collection).elementSet();
        }
        if ((obj instanceof Set) && ((Collection) (obj)).size() > set.size())
        {
            return bl.a(set.iterator(), ((Collection) (obj)));
        } else
        {
            return a(set, ((Collection) (obj)).iterator());
        }
    }

    static boolean a(Set set, Iterator iterator)
    {
        boolean flag;
        for (flag = false; iterator.hasNext(); flag |= set.remove(iterator.next())) { }
        return flag;
    }
}
