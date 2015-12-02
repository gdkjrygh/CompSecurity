// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import com.google.common.base.Preconditions;
import com.google.common.base.Predicates;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

// Referenced classes of package com.google.common.a:
//            er, kn, ik, ax, 
//            ko, fi, kp

public final class kl
{

    private kl()
    {
    }

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
            i += j;
        }
        return i;
    }

    public static transient fi a(Enum enum, Enum aenum[])
    {
        return new er(EnumSet.of(enum, aenum));
    }

    public static kp a(Set set, Set set1)
    {
        Preconditions.checkNotNull(set, "set1");
        Preconditions.checkNotNull(set1, "set2");
        return new kn(set, Predicates.not(Predicates.in(set1)), set1);
    }

    public static HashSet a()
    {
        return new HashSet();
    }

    public static HashSet a(int i)
    {
        return new HashSet(ik.b(i));
    }

    public static HashSet a(Iterable iterable)
    {
        if (iterable instanceof Collection)
        {
            return new HashSet(ax.a(iterable));
        } else
        {
            return a(iterable.iterator());
        }
    }

    public static HashSet a(Iterator iterator)
    {
        HashSet hashset = a();
        for (; iterator.hasNext(); hashset.add(iterator.next())) { }
        return hashset;
    }

    public static transient HashSet a(Object aobj[])
    {
        HashSet hashset = a(aobj.length);
        Collections.addAll(hashset, aobj);
        return hashset;
    }

    public static Set a(Map map)
    {
        return new ko(map);
    }

    public static TreeSet a(Comparator comparator)
    {
        return new TreeSet((Comparator)Preconditions.checkNotNull(comparator));
    }

    static boolean a(Set set, Object obj)
    {
        boolean flag;
        boolean flag1;
        flag1 = true;
        flag = false;
        if (set != obj) goto _L2; else goto _L1
_L1:
        flag = true;
_L4:
        return flag;
_L2:
        if (!(obj instanceof Set)) goto _L4; else goto _L3
_L3:
        obj = (Set)obj;
        if (set.size() != ((Set) (obj)).size()) goto _L6; else goto _L5
_L5:
        flag = set.containsAll(((Collection) (obj)));
        if (!flag) goto _L6; else goto _L7
_L7:
        flag = flag1;
_L9:
        return flag;
_L6:
        flag = false;
        if (true) goto _L9; else goto _L8
_L8:
        set;
        return false;
        set;
        return false;
    }

    public static LinkedHashSet b()
    {
        return new LinkedHashSet();
    }

    public static TreeSet b(Iterable iterable)
    {
        TreeSet treeset = c();
        for (iterable = iterable.iterator(); iterable.hasNext(); treeset.add((Comparable)iterable.next())) { }
        return treeset;
    }

    public static TreeSet c()
    {
        return new TreeSet();
    }
}
