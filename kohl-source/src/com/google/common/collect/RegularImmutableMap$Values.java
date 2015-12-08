// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Iterator;

// Referenced classes of package com.google.common.collect:
//            ImmutableCollection, RegularImmutableMap, UnmodifiableIterator, AbstractIndexedListIterator

private static class map extends ImmutableCollection
{

    final RegularImmutableMap map;

    public boolean contains(Object obj)
    {
        return map.containsValue(obj);
    }

    boolean isPartialView()
    {
        return true;
    }

    public UnmodifiableIterator iterator()
    {
        return new AbstractIndexedListIterator(RegularImmutableMap.access$000(map).length) {

            final RegularImmutableMap.Values this$0;

            protected Object get(int i)
            {
                return RegularImmutableMap.access$000(map)[i].getValue();
            }

            
            {
                this$0 = RegularImmutableMap.Values.this;
                super(i);
            }
        };
    }

    public volatile Iterator iterator()
    {
        return iterator();
    }

    public int size()
    {
        return RegularImmutableMap.access$000(map).length;
    }

    (RegularImmutableMap regularimmutablemap)
    {
        map = regularimmutablemap;
    }
}
