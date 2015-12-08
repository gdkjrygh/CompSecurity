// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.aa;

import com.google.android.m4b.maps.y.j;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

// Referenced classes of package com.google.android.m4b.maps.aa:
//            aq, ae, an, i, 
//            u, e, r, bu, 
//            x

final class bk extends aq
{

    private final transient ae b;

    bk(ae ae1, Comparator comparator)
    {
        super(comparator);
        b = ae1;
        boolean flag;
        if (!ae1.isEmpty())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        j.a(flag);
    }

    final int a(Object aobj[], int k)
    {
        return b.a(aobj, k);
    }

    final aq a(int k, int l)
    {
        if (k == 0 && l == size())
        {
            return this;
        }
        if (k < l)
        {
            return new bk(b.a(k, l), a);
        } else
        {
            return a(a);
        }
    }

    public final x a()
    {
        return b.a();
    }

    final aq b(Object obj)
    {
        return a(0, e(obj));
    }

    final aq b(Object obj, Object obj1)
    {
        return c(obj).b(obj1);
    }

    final ae c()
    {
        return new an(this, b);
    }

    final aq c(Object obj)
    {
        return a(f(obj), size());
    }

    public final boolean contains(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj != null)
        {
            int k;
            try
            {
                k = Collections.binarySearch(b, obj, a);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                return false;
            }
            flag = flag1;
            if (k >= 0)
            {
                flag = true;
            }
        }
        return flag;
    }

    public final boolean containsAll(Collection collection)
    {
        Object obj;
        boolean flag1;
        flag1 = true;
        obj = collection;
        if (collection instanceof i)
        {
            obj = ((i)collection).a();
        }
        if (u.a(comparator(), ((Iterable) (obj))) && ((Collection) (obj)).size() > 1) goto _L2; else goto _L1
_L1:
        boolean flag = super.containsAll(((Collection) (obj)));
_L7:
        return flag;
_L2:
        r r1;
        r1 = com.google.android.m4b.maps.aa.e.e(b.a());
        obj = ((Collection) (obj)).iterator();
        collection = ((Collection) (((Iterator) (obj)).next()));
_L4:
        int k;
        if (!r1.hasNext())
        {
            break MISSING_BLOCK_LABEL_153;
        }
        k = a(r1.a(), collection);
        if (k < 0)
        {
            try
            {
                r1.next();
            }
            // Misplaced declaration of an exception variable
            catch (Collection collection)
            {
                return false;
            }
            // Misplaced declaration of an exception variable
            catch (Collection collection)
            {
                return false;
            }
            continue; /* Loop/switch isn't completed */
        }
        if (k != 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (!((Iterator) (obj)).hasNext())
        {
            continue; /* Loop/switch isn't completed */
        }
        collection = ((Collection) (((Iterator) (obj)).next()));
        if (true) goto _L4; else goto _L3
_L3:
        continue; /* Loop/switch isn't completed */
        if (k <= 0) goto _L4; else goto _L5
_L5:
        return false;
        return false;
        if (true) goto _L7; else goto _L6
_L6:
    }

    final int d(Object obj)
    {
        if (obj != null)
        {
            int k;
            try
            {
                k = bu.a(b, obj, a, bu.b.a, bu.a.b);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                return -1;
            }
            if (k >= 0)
            {
                return k;
            }
        }
        return -1;
    }

    final boolean d()
    {
        return b.d();
    }

    final int e(Object obj)
    {
        return bu.a(b, j.a(obj), comparator(), bu.b.c, bu.a.a);
    }

    public final x e()
    {
        return b.f().a();
    }

    public final boolean equals(Object obj)
    {
        if (obj != this) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        if (!(obj instanceof Set))
        {
            return false;
        }
        obj = (Set)obj;
        if (size() != ((Set) (obj)).size())
        {
            return false;
        }
        if (!u.a(a, ((Iterable) (obj))))
        {
            break MISSING_BLOCK_LABEL_113;
        }
        obj = ((Set) (obj)).iterator();
        x x = b.a();
_L5:
        if (!x.hasNext()) goto _L1; else goto _L3
_L3:
        Object obj1;
        Object obj2;
        obj1 = x.next();
        obj2 = ((Iterator) (obj)).next();
        if (obj2 == null)
        {
            break; /* Loop/switch isn't completed */
        }
        int k;
        try
        {
            k = a(obj1, obj2);
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
        if (k == 0) goto _L5; else goto _L4
_L4:
        return false;
        return containsAll(((Collection) (obj)));
    }

    final int f(Object obj)
    {
        return bu.a(b, j.a(obj), comparator(), bu.b.c, bu.a.a);
    }

    public final Object first()
    {
        return b.get(0);
    }

    public final boolean isEmpty()
    {
        return false;
    }

    public final Iterator iterator()
    {
        return b.a();
    }

    public final Object last()
    {
        return b.get(size() - 1);
    }

    public final int size()
    {
        return b.size();
    }
}
