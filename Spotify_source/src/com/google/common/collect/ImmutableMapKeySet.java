// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import cvh;
import java.util.Iterator;

// Referenced classes of package com.google.common.collect:
//            ImmutableSet, ImmutableList, ImmutableMap, ImmutableAsList, 
//            ImmutableCollection

final class ImmutableMapKeySet extends ImmutableSet
{

    private final ImmutableMap map;

    ImmutableMapKeySet(ImmutableMap immutablemap)
    {
        map = immutablemap;
    }

    public final cvh a()
    {
        return b().a();
    }

    public final boolean contains(Object obj)
    {
        return map.containsKey(obj);
    }

    final boolean e()
    {
        return true;
    }

    final ImmutableList f()
    {
        return new ImmutableAsList() {

            final ImmutableMapKeySet this$0;
            final ImmutableList val$entryList;

            final ImmutableCollection c()
            {
                return ImmutableMapKeySet.this;
            }

            public Object get(int i)
            {
                return ((java.util.Map.Entry)entryList.get(i)).getKey();
            }

            
            {
                this$0 = ImmutableMapKeySet.this;
                entryList = immutablelist;
                super();
            }
        };
    }

    public final Iterator iterator()
    {
        return b().a();
    }

    public final int size()
    {
        return map.size();
    }

    final Object writeReplace()
    {
        return new KeySetSerializedForm(map);
    }

    private class KeySetSerializedForm
        implements Serializable
    {

        private static final long serialVersionUID = 0L;
        final ImmutableMap map;

        Object readResolve()
        {
            return map.d();
        }

        KeySetSerializedForm(ImmutableMap immutablemap)
        {
            map = immutablemap;
        }
    }

}
