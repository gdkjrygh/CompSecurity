// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.b;

import com.google.a.a.ad;
import com.google.a.a.t;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.a.b:
//            ag, bz, ab, cl, 
//            cw, x, cm, y, 
//            ar, bi, z, by

public abstract class cn
    implements Comparator
{

    protected cn()
    {
    }

    public static transient cn a(Object obj, Object aobj[])
    {
        return new ag(new bz(obj, aobj));
    }

    public static cn a(Comparator comparator)
    {
        if (comparator instanceof cn)
        {
            return (cn)comparator;
        } else
        {
            return new ab(comparator);
        }
    }

    public static cn b()
    {
        return cl.a;
    }

    public cn a()
    {
        return new cw(this);
    }

    public final cn a(t t)
    {
        return new x(t, this);
    }

    public Object a(Object obj, Object obj1)
    {
        if (compare(obj, obj1) <= 0)
        {
            return obj;
        } else
        {
            return obj1;
        }
    }

    public final List a(Iterable iterable)
    {
        Object aobj1[];
        if (iterable instanceof Collection)
        {
            Collection collection = (Collection)iterable;
            if ((long)collection.size() <= 2L)
            {
                Object aobj[] = (Object[])collection.toArray();
                Arrays.sort(aobj, this);
                iterable = ((Iterable) (aobj));
                if (aobj.length > 1)
                {
                    iterable = ((Iterable) (cm.b(aobj, 1)));
                }
                return Collections.unmodifiableList(Arrays.asList(iterable));
            }
        }
        Iterator iterator = iterable.iterator();
        ad.a(iterator);
        y.a(1, "k");
        if (!iterator.hasNext())
        {
            return ar.d();
        }
        aobj1 = (Object[])new Object[2];
        Object obj = iterator.next();
        aobj1[0] = obj;
        do
        {
label0:
            {
                do
                {
                    if (!iterator.hasNext())
                    {
                        break label0;
                    }
                    iterable = ((Iterable) (iterator.next()));
                } while (compare(iterable, obj) >= 0);
                aobj1[1] = iterable;
                int l = 0;
                int k = 1;
                int i = 0;
                do
                {
                    if (i >= k)
                    {
                        break;
                    }
                    int j = i + k + 1 >>> 1;
                    iterable = ((Iterable) (aobj1[j]));
                    aobj1[j] = aobj1[k];
                    aobj1[k] = iterable;
                    j = i;
                    for (int i1 = i; i1 < k;)
                    {
                        int j1 = j;
                        if (compare(aobj1[i1], iterable) < 0)
                        {
                            cm.a(aobj1, j, i1);
                            j1 = j + 1;
                        }
                        i1++;
                        j = j1;
                    }

                    cm.a(aobj1, k, j);
                    if (j > 1)
                    {
                        k = j - 1;
                        continue;
                    }
                    if (j > 0)
                    {
                        break;
                    }
                    i = Math.max(j, i + 1);
                    l = j;
                } while (true);
                iterable = ((Iterable) (aobj1[l]));
                i = l + 1;
                do
                {
                    obj = iterable;
                    if (i > 0)
                    {
                        break;
                    }
                    iterable = ((Iterable) (b(iterable, aobj1[i])));
                    i++;
                } while (true);
            }
        } while (true);
        Arrays.sort(aobj1, 0, 1, this);
        return Collections.unmodifiableList(Arrays.asList(cm.b(aobj1, Math.min(1, 1))));
    }

    public Object b(Object obj, Object obj1)
    {
        if (compare(obj, obj1) >= 0)
        {
            return obj;
        } else
        {
            return obj1;
        }
    }

    public final List b(Iterable iterable)
    {
        iterable = ((Iterable) ((Object[])bi.a(iterable)));
        Arrays.sort(iterable, this);
        iterable = Arrays.asList(iterable);
        ad.a(iterable);
        if (iterable instanceof Collection)
        {
            return new ArrayList(z.a(iterable));
        } else
        {
            return by.a(iterable.iterator());
        }
    }

    public final ar c(Iterable iterable)
    {
        iterable = ((Iterable) ((Object[])bi.a(iterable)));
        int j = iterable.length;
        for (int i = 0; i < j; i++)
        {
            ad.a(iterable[i]);
        }

        Arrays.sort(iterable, this);
        return ar.b(iterable);
    }

    public abstract int compare(Object obj, Object obj1);
}
