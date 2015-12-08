// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Collection;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            m, ed, AbstractMapBasedMultimap

final class q extends m
    implements Set
{

    final AbstractMapBasedMultimap a;

    q(AbstractMapBasedMultimap abstractmapbasedmultimap, Object obj, Set set)
    {
        a = abstractmapbasedmultimap;
        super(abstractmapbasedmultimap, obj, set, null);
    }

    public final boolean removeAll(Collection collection)
    {
        boolean flag;
        if (collection.isEmpty())
        {
            flag = false;
        } else
        {
            int i = size();
            boolean flag1 = ed.a((Set)c, collection);
            flag = flag1;
            if (flag1)
            {
                int j = c.size();
                AbstractMapBasedMultimap.access$212(a, j - i);
                b();
                return flag1;
            }
        }
        return flag;
    }
}
