// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import com.google.common.base.Preconditions;
import com.google.common.c.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.RandomAccess;

// Referenced classes of package com.google.common.a:
//            ax, hu, ht, hs, 
//            hr, gg

public final class hq
{

    private hq()
    {
    }

    static int a(int i)
    {
        boolean flag;
        if (i >= 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        return com.google.common.c.a.b(5L + (long)i + (long)(i / 10));
    }

    public static ArrayList a()
    {
        return new ArrayList();
    }

    public static ArrayList a(Iterable iterable)
    {
        Preconditions.checkNotNull(iterable);
        if (iterable instanceof Collection)
        {
            return new ArrayList(com.google.common.a.ax.a(iterable));
        } else
        {
            return a(iterable.iterator());
        }
    }

    public static ArrayList a(Iterator iterator)
    {
        Preconditions.checkNotNull(iterator);
        ArrayList arraylist = a();
        for (; iterator.hasNext(); arraylist.add(iterator.next())) { }
        return arraylist;
    }

    public static transient ArrayList a(Object aobj[])
    {
        Preconditions.checkNotNull(((Object) (aobj)));
        ArrayList arraylist = new ArrayList(a(aobj.length));
        Collections.addAll(arraylist, aobj);
        return arraylist;
    }

    public static List a(List list)
    {
        if (list instanceof hu)
        {
            return ((hu)list).a();
        }
        if (list instanceof RandomAccess)
        {
            return new ht(list);
        } else
        {
            return new hu(list);
        }
    }

    public static List a(List list, int i)
    {
        Preconditions.checkNotNull(list);
        boolean flag;
        if (i > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        if (list instanceof RandomAccess)
        {
            return new hs(list, i);
        } else
        {
            return new hr(list, i);
        }
    }

    static boolean a(List list, Object obj)
    {
        if (obj != Preconditions.checkNotNull(list))
        {
            if (!(obj instanceof List))
            {
                return false;
            }
            obj = (List)obj;
            if (list.size() != ((List) (obj)).size() || !com.google.common.a.gg.a(list.iterator(), ((List) (obj)).iterator()))
            {
                return false;
            }
        }
        return true;
    }

    static int b(List list)
    {
        int i = 1;
        list = list.iterator();
        while (list.hasNext()) 
        {
            Object obj = list.next();
            int j;
            if (obj == null)
            {
                j = 0;
            } else
            {
                j = obj.hashCode();
            }
            i = j + i * 31;
        }
        return i;
    }

    public static ArrayList b(int i)
    {
        boolean flag;
        if (i >= 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        return new ArrayList(i);
    }

    public static LinkedList b()
    {
        return new LinkedList();
    }

    public static ArrayList c(int i)
    {
        return new ArrayList(a(i));
    }
}
