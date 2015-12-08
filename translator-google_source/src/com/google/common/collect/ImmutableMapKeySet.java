// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Iterator;

// Referenced classes of package com.google.common.collect:
//            ImmutableSet, ImmutableMap, ImmutableList, ej

final class ImmutableMapKeySet extends ImmutableSet
{

    private final ImmutableMap map;

    ImmutableMapKeySet(ImmutableMap immutablemap)
    {
        map = immutablemap;
    }

    public final boolean contains(Object obj)
    {
        return map.containsKey(obj);
    }

    final ImmutableList createAsList()
    {
        return new _cls1();
    }

    final boolean isPartialView()
    {
        return true;
    }

    public final ej iterator()
    {
        return asList().iterator();
    }

    public final volatile Iterator iterator()
    {
        return iterator();
    }

    public final int size()
    {
        return map.size();
    }

    final Object writeReplace()
    {
        return new KeySetSerializedForm(map);
    }

    private class _cls1 extends ImmutableAsList
    {

        final ImmutableMapKeySet this$0;
        final ImmutableList val$entryList;

        ImmutableCollection delegateCollection()
        {
            return ImmutableMapKeySet.this;
        }

        public Object get(int i)
        {
            return ((java.util.Map.Entry)entryList.get(i)).getKey();
        }

        _cls1()
        {
            this$0 = ImmutableMapKeySet.this;
            entryList = immutablelist;
            super();
        }
    }


    private class KeySetSerializedForm
        implements Serializable
    {

        private static final long serialVersionUID = 0L;
        final ImmutableMap map;

        Object readResolve()
        {
            return map.keySet();
        }

        KeySetSerializedForm(ImmutableMap immutablemap)
        {
            map = immutablemap;
        }
    }

}
