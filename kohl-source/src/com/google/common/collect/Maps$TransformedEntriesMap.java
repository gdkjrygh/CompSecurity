// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            Maps, AbstractMapEntry

static class transformer extends AbstractMap
{
    class EntrySet extends AbstractSet
    {

        final Maps.TransformedEntriesMap this$0;

        public void clear()
        {
            fromMap.clear();
        }

        public boolean contains(Object obj)
        {
            if (obj instanceof java.util.Map.Entry)
            {
                Object obj1 = (java.util.Map.Entry)obj;
                obj = ((java.util.Map.Entry) (obj1)).getKey();
                obj1 = ((java.util.Map.Entry) (obj1)).getValue();
                Object obj2 = get(obj);
                if (obj2 != null)
                {
                    return obj2.equals(obj1);
                }
                if (obj1 == null && containsKey(obj))
                {
                    return true;
                }
            }
            return false;
        }

        public Iterator iterator()
        {
            return fromMap.entrySet().iterator(). new Iterator() {

                final EntrySet this$1;
                final Iterator val$mapIterator;

                public boolean hasNext()
                {
                    return mapIterator.hasNext();
                }

                public volatile Object next()
                {
                    return next();
                }

                public java.util.Map.Entry next()
                {
                    return ((java.util.Map.Entry)mapIterator.next()). new AbstractMapEntry() {

                        final EntrySet._cls1 this$2;
                        final java.util.Map.Entry val$entry;

                        public Object getKey()
                        {
                            return entry.getKey();
                        }

                        public Object getValue()
                        {
                            return transformer.transformEntry(entry.getKey(), entry.getValue());
                        }

            
            {
                this$2 = final__pcls1;
                entry = java.util.Map.Entry.this;
                super();
            }
                    };
                }

                public void remove()
                {
                    mapIterator.remove();
                }

            
            {
                this$1 = final_entryset;
                mapIterator = Iterator.this;
                super();
            }
            };
        }

        public boolean remove(Object obj)
        {
            if (contains(obj))
            {
                obj = ((java.util.Map.Entry)obj).getKey();
                fromMap.remove(obj);
                return true;
            } else
            {
                return false;
            }
        }

        public int size()
        {
            return Maps.TransformedEntriesMap.this.size();
        }

        EntrySet()
        {
            this$0 = Maps.TransformedEntriesMap.this;
            super();
        }
    }


    EntrySet entrySet;
    final Map fromMap;
    final EntrySet transformer;

    public void clear()
    {
        fromMap.clear();
    }

    public boolean containsKey(Object obj)
    {
        return fromMap.containsKey(obj);
    }

    public Set entrySet()
    {
        EntrySet entryset1 = entrySet;
        EntrySet entryset = entryset1;
        if (entryset1 == null)
        {
            entryset = new EntrySet();
            entrySet = entryset;
        }
        return entryset;
    }

    public Object get(Object obj)
    {
        Object obj1 = fromMap.get(obj);
        if (obj1 != null || fromMap.containsKey(obj))
        {
            return transformer.formEntry(obj, obj1);
        } else
        {
            return null;
        }
    }

    public Object remove(Object obj)
    {
        if (fromMap.containsKey(obj))
        {
            return transformer.formEntry(obj, fromMap.remove(obj));
        } else
        {
            return null;
        }
    }

    public int size()
    {
        return fromMap.size();
    }

    EntrySet.this._cls0(Map map, EntrySet.this._cls0 _pcls0)
    {
        fromMap = (Map)Preconditions.checkNotNull(map);
        transformer = (transformer)Preconditions.checkNotNull(_pcls0);
    }
}
