// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import cuw;
import cvh;
import java.util.Iterator;

// Referenced classes of package com.google.common.collect:
//            ImmutableCollection, ImmutableMap, ImmutableSet, Maps, 
//            ImmutableList, ImmutableAsList

final class ImmutableMapValues extends ImmutableCollection
{

    private final ImmutableMap map;

    ImmutableMapValues(ImmutableMap immutablemap)
    {
        map = immutablemap;
    }

    public final cvh a()
    {
        return Maps.a(map.b().a());
    }

    public final boolean contains(Object obj)
    {
        return obj != null && cuw.a(a(), obj);
    }

    final boolean e()
    {
        return true;
    }

    final ImmutableList f()
    {
        return new ImmutableAsList() {

            final ImmutableMapValues this$0;
            final ImmutableList val$entryList;

            final ImmutableCollection c()
            {
                return ImmutableMapValues.this;
            }

            public Object get(int i)
            {
                return ((java.util.Map.Entry)entryList.get(i)).getValue();
            }

            
            {
                this$0 = ImmutableMapValues.this;
                entryList = immutablelist;
                super();
            }
        };
    }

    public final Iterator iterator()
    {
        return a();
    }

    public final int size()
    {
        return map.size();
    }

    final Object writeReplace()
    {
        return new SerializedForm(map);
    }

    private class SerializedForm
        implements Serializable
    {

        private static final long serialVersionUID = 0L;
        final ImmutableMap map;

        Object readResolve()
        {
            return map.f();
        }

        SerializedForm(ImmutableMap immutablemap)
        {
            map = immutablemap;
        }
    }

}
