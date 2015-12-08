// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            ImmutableMultiset, Multiset

static final class counts
    implements Serializable
{

    final int counts[];
    final Object elements[];

    (Multiset multiset)
    {
        int i = multiset.entrySet().size();
        elements = new Object[i];
        counts = new int[i];
        i = 0;
        for (multiset = multiset.entrySet().iterator(); multiset.hasNext();)
        {
              = (counts)multiset.next();
            elements[i] = .elements();
            counts[i] = .counts();
            i++;
        }

    }
}
