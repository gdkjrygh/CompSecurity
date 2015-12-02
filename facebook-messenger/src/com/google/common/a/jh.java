// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import com.google.common.c.a;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.common.a:
//            jf, jm, jn, jg, 
//            gg

public final class jh
{

    private jh()
    {
    }

    static int a(Iterable iterable)
    {
        if (iterable instanceof jf)
        {
            return ((jf)iterable).f().size();
        } else
        {
            return 11;
        }
    }

    public static jg a(Object obj, int i)
    {
        return new jm(obj, i);
    }

    static Iterator a(jf jf1)
    {
        return new jn(jf1, jf1.b().iterator());
    }

    static boolean a(jf jf1, Object obj)
    {
        if (obj == jf1)
        {
            return true;
        }
        if (obj instanceof jf)
        {
            obj = (jf)obj;
            if (jf1.size() != ((jf) (obj)).size() || jf1.b().size() != ((jf) (obj)).b().size())
            {
                return false;
            }
            for (obj = ((jf) (obj)).b().iterator(); ((Iterator) (obj)).hasNext();)
            {
                jg jg1 = (jg)((Iterator) (obj)).next();
                if (jf1.a(jg1.a()) != jg1.b())
                {
                    return false;
                }
            }

            return true;
        } else
        {
            return false;
        }
    }

    static boolean a(jf jf1, Collection collection)
    {
        if (collection.isEmpty())
        {
            return false;
        }
        if (collection instanceof jf)
        {
            jg jg1;
            for (collection = b(collection).b().iterator(); collection.hasNext(); jf1.a(jg1.a(), jg1.b()))
            {
                jg1 = (jg)collection.next();
            }

        } else
        {
            com.google.common.a.gg.a(jf1, collection.iterator());
        }
        return true;
    }

    static int b(jf jf1)
    {
        jf1 = jf1.b().iterator();
        long l;
        for (l = 0L; jf1.hasNext(); l += ((jg)jf1.next()).b()) { }
        return com.google.common.c.a.b(l);
    }

    static jf b(Iterable iterable)
    {
        return (jf)iterable;
    }

    static boolean b(jf jf1, Collection collection)
    {
        Object obj = collection;
        if (collection instanceof jf)
        {
            obj = ((jf)collection).f();
        }
        return jf1.f().removeAll(((Collection) (obj)));
    }

    static boolean c(jf jf1, Collection collection)
    {
        Object obj = collection;
        if (collection instanceof jf)
        {
            obj = ((jf)collection).f();
        }
        return jf1.f().retainAll(((Collection) (obj)));
    }
}
