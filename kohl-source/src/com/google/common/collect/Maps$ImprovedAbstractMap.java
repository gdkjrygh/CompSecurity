// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            Maps, ForwardingSet, ForwardingCollection

static abstract class t> extends AbstractMap
{

    private Set entrySet;
    private Set keySet;
    private Collection values;

    protected abstract Set createEntrySet();

    public Set entrySet()
    {
        Set set1 = entrySet;
        Set set = set1;
        if (set1 == null)
        {
            set = createEntrySet();
            entrySet = set;
        }
        return set;
    }

    public boolean isEmpty()
    {
        return entrySet().isEmpty();
    }

    public Set keySet()
    {
        Set set = keySet;
        Object obj = set;
        if (set == null)
        {
            obj = new ForwardingSet() {

                final Maps.ImprovedAbstractMap this$0;
                final Set val$delegate;

                protected volatile Object _mthdelegate()
                {
                    return _mthdelegate();
                }

                protected volatile Collection _mthdelegate()
                {
                    return _mthdelegate();
                }

                protected Set _mthdelegate()
                {
                    return delegate;
                }

                public boolean isEmpty()
                {
                    return Maps.ImprovedAbstractMap.this.isEmpty();
                }

                public boolean remove(Object obj1)
                {
                    if (contains(obj1))
                    {
                        Maps.ImprovedAbstractMap.this.remove(obj1);
                        return true;
                    } else
                    {
                        return false;
                    }
                }

            
            {
                this$0 = Maps.ImprovedAbstractMap.this;
                delegate = set;
                super();
            }
            };
            keySet = ((Set) (obj));
        }
        return ((Set) (obj));
    }

    public Collection values()
    {
        Collection collection = values;
        Object obj = collection;
        if (collection == null)
        {
            obj = new ForwardingCollection() {

                final Maps.ImprovedAbstractMap this$0;
                final Collection val$delegate;

                protected volatile Object _mthdelegate()
                {
                    return _mthdelegate();
                }

                protected Collection _mthdelegate()
                {
                    return delegate;
                }

                public boolean isEmpty()
                {
                    return Maps.ImprovedAbstractMap.this.isEmpty();
                }

            
            {
                this$0 = Maps.ImprovedAbstractMap.this;
                delegate = collection;
                super();
            }
            };
            values = ((Collection) (obj));
        }
        return ((Collection) (obj));
    }

    t>()
    {
    }
}
