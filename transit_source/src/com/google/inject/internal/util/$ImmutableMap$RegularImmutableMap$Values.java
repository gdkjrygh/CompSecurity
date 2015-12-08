// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.internal.util;

import java.util.Iterator;

// Referenced classes of package com.google.inject.internal.util:
//            $ImmutableCollection, $ImmutableMap, $Iterators, $UnmodifiableIterator, 
//            $AbstractIterator

private static class map extends $ImmutableCollection
{

    final map map;

    public boolean contains(Object obj)
    {
        return map.sValue(obj);
    }

    public boolean isEmpty()
    {
        return false;
    }

    public $UnmodifiableIterator iterator()
    {
        return $Iterators.unmodifiableIterator(new $AbstractIterator() {

            int index;
            final .ImmutableMap.RegularImmutableMap.Values this$0;

            protected Object computeNext()
            {
                if (index < .ImmutableMap.RegularImmutableMap.access$500(map).length)
                {
                    java.util.Map.Entry aentry[] = .ImmutableMap.RegularImmutableMap.access$500(map);
                    int i = index;
                    index = i + 1;
                    return aentry[i].getValue();
                } else
                {
                    return endOfData();
                }
            }

            
            {
                this$0 = .ImmutableMap.RegularImmutableMap.Values.this;
                super();
                index = 0;
            }
        });
    }

    public volatile Iterator iterator()
    {
        return iterator();
    }

    public int size()
    {
        return _mth500(map).length;
    }

    _cls1.index(_cls1.index index)
    {
        map = index;
    }
}
