// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import com.google.common.base.Preconditions;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

// Referenced classes of package com.google.common.a:
//            fy, es, ld, kz, 
//            kx, kw, fo, mh

final class kh extends fy
{

    private final transient es b;

    kh(es es1, Comparator comparator)
    {
        super(comparator);
        b = es1;
        boolean flag;
        if (!es1.isEmpty())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
    }

    private fy a(int j, int k)
    {
        if (j == 0 && k == size())
        {
            return this;
        }
        if (j < k)
        {
            return new kh(b.a(j, k), a);
        } else
        {
            return a(a);
        }
    }

    private int e(Object obj)
    {
        Comparator comparator = a;
        return Collections.binarySearch(b, obj, comparator);
    }

    int a(Object obj)
    {
        if (obj == null)
        {
            return -1;
        }
        int j;
        try
        {
            j = kx.a(b, obj, comparator(), ld.ANY_PRESENT, kz.INVERTED_INSERTION_INDEX);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return -1;
        }
        if (j < 0 || !b.get(j).equals(obj))
        {
            j = -1;
        }
        return j;
    }

    fy a(Object obj, boolean flag)
    {
        int j;
        if (flag)
        {
            j = kx.a(b, Preconditions.checkNotNull(obj), comparator(), ld.FIRST_AFTER, kz.NEXT_HIGHER);
        } else
        {
            j = kx.a(b, Preconditions.checkNotNull(obj), comparator(), ld.FIRST_PRESENT, kz.NEXT_HIGHER);
        }
        return a(0, j);
    }

    fy a(Object obj, boolean flag, Object obj1, boolean flag1)
    {
        return b(obj, flag).a(obj1, flag1);
    }

    boolean a()
    {
        return b.a();
    }

    fy b(Object obj, boolean flag)
    {
        int j;
        if (flag)
        {
            j = kx.a(b, Preconditions.checkNotNull(obj), comparator(), ld.FIRST_PRESENT, kz.NEXT_HIGHER);
        } else
        {
            j = kx.a(b, Preconditions.checkNotNull(obj), comparator(), ld.FIRST_AFTER, kz.NEXT_HIGHER);
        }
        return a(j, size());
    }

    public boolean contains(Object obj)
    {
        if (obj != null)
        {
            int j;
            try
            {
                j = e(obj);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                return false;
            }
            if (j >= 0)
            {
                return true;
            }
        }
        return false;
    }

    public boolean containsAll(Collection collection)
    {
        mh mh;
        Iterator iterator1;
        if (!kw.a(comparator(), collection) || collection.size() <= 1)
        {
            return super.containsAll(collection);
        }
        mh = h_();
        iterator1 = collection.iterator();
        collection = ((Collection) (iterator1.next()));
_L2:
        int j;
        if (!mh.hasNext())
        {
            break MISSING_BLOCK_LABEL_107;
        }
        j = b(mh.next(), collection);
        if (j != 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (!iterator1.hasNext())
        {
            return true;
        }
        try
        {
            collection = ((Collection) (iterator1.next()));
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
        if (true) goto _L2; else goto _L1
_L1:
        if (j <= 0) goto _L4; else goto _L3
_L3:
        break MISSING_BLOCK_LABEL_99;
_L4:
        break; /* Loop/switch isn't completed */
        return false;
        return false;
    }

    public boolean equals(Object obj)
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
        if (!kw.a(a, ((Iterable) (obj))))
        {
            break MISSING_BLOCK_LABEL_110;
        }
        obj = ((Set) (obj)).iterator();
        mh mh = h_();
_L5:
        if (!mh.hasNext()) goto _L1; else goto _L3
_L3:
        Object obj1;
        Object obj2;
        obj1 = mh.next();
        obj2 = ((Iterator) (obj)).next();
        if (obj2 == null)
        {
            break; /* Loop/switch isn't completed */
        }
        int j;
        try
        {
            j = b(obj1, obj2);
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
        if (j == 0) goto _L5; else goto _L4
_L4:
        return false;
        return containsAll(((Collection) (obj)));
    }

    public Object first()
    {
        return b.get(0);
    }

    public mh h_()
    {
        return b.h_();
    }

    es i()
    {
        return new fo(this, b);
    }

    public boolean isEmpty()
    {
        return false;
    }

    public Iterator iterator()
    {
        return h_();
    }

    public Object last()
    {
        return b.get(size() - 1);
    }

    public int size()
    {
        return b.size();
    }

    public Object[] toArray()
    {
        return b.toArray();
    }

    public Object[] toArray(Object aobj[])
    {
        return b.toArray(aobj);
    }
}
