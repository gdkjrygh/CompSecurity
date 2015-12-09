// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            Multimaps, Multimap, Maps

static final class NotNull extends tractMap
{
    final class EntrySet extends Maps.EntrySet
    {

        final Multimaps.AsMap this$0;

        public final Iterator iterator()
        {
            return Maps.asMapEntryIterator(multimap.keySet(), new Function() {

                final EntrySet this$1;

                private Collection apply(Object obj)
                {
                    return multimap.get(obj);
                }

                public final volatile Object apply(Object obj)
                {
                    return apply(obj);
                }

            
            {
                this$1 = EntrySet.this;
                super();
            }
            });
        }

        final Map map()
        {
            return Multimaps.AsMap.this;
        }

        public final boolean remove(Object obj)
        {
            if (!contains(obj))
            {
                return false;
            } else
            {
                obj = (java.util.Map.Entry)obj;
                removeValuesForKey(((java.util.Map.Entry) (obj)).getKey());
                return true;
            }
        }

        EntrySet()
        {
            this$0 = Multimaps.AsMap.this;
            super();
        }
    }


    private final Multimap multimap;

    private Collection get(Object obj)
    {
        if (containsKey(obj))
        {
            return multimap.get(obj);
        } else
        {
            return null;
        }
    }

    private Collection remove(Object obj)
    {
        if (containsKey(obj))
        {
            return multimap.removeAll(obj);
        } else
        {
            return null;
        }
    }

    public final void clear()
    {
        multimap.clear();
    }

    public final boolean containsKey(Object obj)
    {
        return multimap.containsKey(obj);
    }

    protected final Set createEntrySet()
    {
        return new EntrySet();
    }

    public final volatile Object get(Object obj)
    {
        return get(obj);
    }

    public final boolean isEmpty()
    {
        return multimap.isEmpty();
    }

    public final Set keySet()
    {
        return multimap.keySet();
    }

    public final volatile Object remove(Object obj)
    {
        return remove(obj);
    }

    final void removeValuesForKey(Object obj)
    {
        multimap.keySet().remove(obj);
    }

    public final int size()
    {
        return multimap.keySet().size();
    }


    nit>(Multimap multimap1)
    {
        multimap = (Multimap)Preconditions.checkNotNull(multimap1);
    }
}
