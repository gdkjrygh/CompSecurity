// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Iterator;

// Referenced classes of package com.google.common.collect:
//            ImmutableCollection, bl, ImmutableMap, ImmutableSet, 
//            Maps, ImmutableList, ej

final class ImmutableMapValues extends ImmutableCollection
{

    private final ImmutableMap map;

    ImmutableMapValues(ImmutableMap immutablemap)
    {
        map = immutablemap;
    }

    public final boolean contains(Object obj)
    {
        return obj != null && bl.a(iterator(), obj);
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
        return Maps.a(map.entrySet().iterator());
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
        return new SerializedForm(map);
    }

    private class _cls1 extends ImmutableAsList
    {

        final ImmutableMapValues this$0;
        final ImmutableList val$entryList;

        ImmutableCollection delegateCollection()
        {
            return ImmutableMapValues.this;
        }

        public Object get(int i)
        {
            return ((java.util.Map.Entry)entryList.get(i)).getValue();
        }

        _cls1()
        {
            this$0 = ImmutableMapValues.this;
            entryList = immutablelist;
            super();
        }
    }


    private class SerializedForm
        implements Serializable
    {

        private static final long serialVersionUID = 0L;
        final ImmutableMap map;

        Object readResolve()
        {
            return map.values();
        }

        SerializedForm(ImmutableMap immutablemap)
        {
            map = immutablemap;
        }
    }

}
