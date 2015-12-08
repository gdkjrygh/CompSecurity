// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.ax;

import com.google.android.m4b.maps.aa.bc;
import com.google.android.m4b.maps.bo.ac;
import com.google.android.m4b.maps.bo.g;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

// Referenced classes of package com.google.android.m4b.maps.ax:
//            f

public final class b
{

    public static LinkedHashSet a(f f1, int i, Collection collection, g g, int j, LinkedHashSet linkedhashset)
    {
        LinkedHashSet linkedhashset1;
        linkedhashset1 = linkedhashset;
        if (linkedhashset == null)
        {
            linkedhashset1 = new LinkedHashSet();
        }
        collection = new LinkedHashSet(bc.a(collection));
        linkedhashset = new LinkedHashSet();
        int l;
        if (!collection.isEmpty()) goto _L2; else goto _L1
_L2:
        obj = (ac)collection.iterator().next();
        j3 = ((ac) (obj)).a;
        k = 1 << j3;
        k3 = k - 1;
        l3 = k >> 1;
        l = ((ac) (obj)).b;
        for (Iterator iterator = collection.iterator(); iterator.hasNext();)
        {
            l = Math.min(l, ((ac)iterator.next()).b);
        }

        Iterator iterator1 = collection.iterator();
        do
        {
            if (!iterator1.hasNext())
            {
                break MISSING_BLOCK_LABEL_856;
            }
        } while (((ac)iterator1.next()).b - l < l3);
        l = 1;
_L3:
        Iterator iterator2 = collection.iterator();
        i1 = 0;
        int j1 = k;
        int l1 = 0;
        int j2 = k;
        while (iterator2.hasNext()) 
        {
            ac ac3 = (ac)iterator2.next();
            int i3 = ac3.b;
            int l2 = i3;
            if (l != 0)
            {
                l2 = i3;
                if (i3 < l3)
                {
                    l2 = i3 + k;
                }
            }
            j2 = Math.min(j2, l2);
            l1 = Math.max(l1, l2);
            j1 = Math.min(j1, ac3.c);
            i1 = Math.max(i1, ac3.c);
        }
        linkedhashset.add(((ac) (obj)).a(j3, j2 & k3, j1));
        linkedhashset.add(((ac) (obj)).a(j3, j2 & k3, i1));
        linkedhashset.add(((ac) (obj)).a(j3, l1 & k3, j1));
        linkedhashset.add(((ac) (obj)).a(j3, l1 & k3, i1));
_L1:
        collection = a(f1, ((Set) (collection)), g);
        linkedhashset = a(f1, ((Set) (linkedhashset)), g);
        int i1 = 1;
        int k = 0;
        for (l = j; !collection.isEmpty() && l > 0 && i1 <= i && k < 3;)
        {
            if (((ac)collection.iterator().next()).a <= 13 && (k <= 0 && collection.size() <= 2 || k < 2 && i1 >= 4 || k < 3 && i1 >= 6))
            {
                {
                    Object obj = collection.iterator();
                    j = l;
                    int j3;
                    int k3;
                    int l3;
                    do
                    {
                        if (!((Iterator) (obj)).hasNext())
                        {
                            break;
                        }
                        ac ac1 = (ac)((Iterator) (obj)).next();
                        if (j == 0)
                        {
                            break;
                        }
                        if (linkedhashset1.add(ac1))
                        {
                            j--;
                        }
                    } while (true);
                    ac ac2;
                    int k1;
                    int i2;
                    int k2;
                    if (l != j)
                    {
                        l = k + 1;
                        k = j;
                        j = l;
                    } else
                    {
                        l = j;
                        j = k;
                        k = l;
                    }
                }
                if (linkedhashset != null && (collection.size() <= 2 || i1 >= 3))
                {
                    collection.addAll(linkedhashset);
                    linkedhashset = null;
                }
                obj = collection;
                if (collection.size() <= 2)
                {
                    obj = new LinkedHashSet();
                    for (collection = collection.iterator(); collection.hasNext();)
                    {
                        ac2 = (ac)collection.next();
                        i2 = 1 << ac2.a;
                        l = -1;
                        while (l <= 1) 
                        {
                            for (k1 = -1; k1 <= 1; k1++)
                            {
                                k2 = ac2.c + k1;
                                if (k2 >= 0 && k2 < i2)
                                {
                                    ((Set) (obj)).add(ac2.a(ac2.a, ac2.b + l + i2 & i2 - 1, k2));
                                }
                            }

                            l++;
                        }
                    }

                }
                collection = linkedhashset;
                if (linkedhashset != null)
                {
                    collection = a(f1, ((Set) (linkedhashset)), g);
                }
                obj = a(f1, ((Set) (obj)), g);
                i1++;
                l = k;
                linkedhashset = collection;
                k = j;
                collection = ((Collection) (obj));
            } else
            {
                j = k;
                k = l;
                break MISSING_BLOCK_LABEL_588;
            }
        }

        return linkedhashset1;
        l = 0;
          goto _L3
    }

    private static Set a(f f1, Set set, g g)
    {
        LinkedHashSet linkedhashset = new LinkedHashSet();
        set = set.iterator();
        do
        {
            if (!set.hasNext())
            {
                break;
            }
            ac ac1 = f1.a((ac)set.next(), g);
            if (ac1 != null)
            {
                linkedhashset.add(ac1);
            }
        } while (true);
        return linkedhashset;
    }
}
