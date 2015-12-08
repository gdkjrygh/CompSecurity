// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Map;

// Referenced classes of package com.google.common.collect:
//            do, Count, s, AbstractMapBasedMultiset

final class t extends do
{

    final java.util.Map.Entry a;
    final s b;

    t(s s1, java.util.Map.Entry entry)
    {
        b = s1;
        a = entry;
        super();
    }

    public final int getCount()
    {
        Count count = (Count)a.getValue();
        if (count == null || count.get() == 0)
        {
            Count count1 = (Count)AbstractMapBasedMultiset.access$000(b.c).get(getElement());
            if (count1 != null)
            {
                return count1.get();
            }
        }
        if (count == null)
        {
            return 0;
        } else
        {
            return count.get();
        }
    }

    public final Object getElement()
    {
        return a.getKey();
    }
}
