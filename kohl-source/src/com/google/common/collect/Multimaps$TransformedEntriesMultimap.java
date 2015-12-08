// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            Multimap, Multimaps, Maps, Collections2, 
//            Multiset, AbstractMapEntry

private static class transformer
    implements Multimap
{
    private class TransformedEntries extends Collections2.TransformedCollection
    {

        final Multimaps.TransformedEntriesMultimap this$0;

        public boolean contains(Object obj)
        {
            if (obj instanceof java.util.Map.Entry)
            {
                obj = (java.util.Map.Entry)obj;
                return containsEntry(((java.util.Map.Entry) (obj)).getKey(), ((java.util.Map.Entry) (obj)).getValue());
            } else
            {
                return false;
            }
        }

        public boolean remove(Object obj)
        {
            if (obj instanceof java.util.Map.Entry)
            {
                obj = (java.util.Map.Entry)obj;
                return get(((java.util.Map.Entry) (obj)).getKey()).remove(((java.util.Map.Entry) (obj)).getValue());
            } else
            {
                return false;
            }
        }

        TransformedEntries(final Maps.EntryTransformer transformer)
        {
            this.this$0 = Multimaps.TransformedEntriesMultimap.this;
            super(fromMultimap.entries(), new _cls1());
        }
    }


    private transient Map asMap;
    private transient Collection entries;
    final Multimap fromMultimap;
    final values transformer;
    private transient Collection values;

    public Map asMap()
    {
        if (asMap == null)
        {
            Map map = Maps.transformEntries(fromMultimap.asMap(), new Maps.EntryTransformer() {

                final Multimaps.TransformedEntriesMultimap this$0;

                public volatile Object transformEntry(Object obj, Object obj1)
                {
                    return transformEntry(obj, (Collection)obj1);
                }

                public Collection transformEntry(Object obj, Collection collection)
                {
                    return transform(obj, collection);
                }

            
            {
                this$0 = Multimaps.TransformedEntriesMultimap.this;
                super();
            }
            });
            asMap = map;
            return map;
        } else
        {
            return asMap;
        }
    }

    public void clear()
    {
        fromMultimap.clear();
    }

    public boolean containsEntry(Object obj, Object obj1)
    {
        return get(obj).contains(obj1);
    }

    public boolean containsKey(Object obj)
    {
        return fromMultimap.containsKey(obj);
    }

    public boolean containsValue(Object obj)
    {
        return values().contains(obj);
    }

    public Collection entries()
    {
        if (entries == null)
        {
            TransformedEntries transformedentries = new TransformedEntries(transformer);
            entries = transformedentries;
            return transformedentries;
        } else
        {
            return entries;
        }
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof Multimap)
        {
            obj = (Multimap)obj;
            return asMap().equals(((Multimap) (obj)).asMap());
        } else
        {
            return false;
        }
    }

    public Collection get(Object obj)
    {
        return transform(obj, fromMultimap.get(obj));
    }

    public int hashCode()
    {
        return asMap().hashCode();
    }

    public boolean isEmpty()
    {
        return fromMultimap.isEmpty();
    }

    public Set keySet()
    {
        return fromMultimap.keySet();
    }

    public Multiset keys()
    {
        return fromMultimap.keys();
    }

    public boolean put(Object obj, Object obj1)
    {
        throw new UnsupportedOperationException();
    }

    public boolean putAll(Multimap multimap)
    {
        throw new UnsupportedOperationException();
    }

    public boolean putAll(Object obj, Iterable iterable)
    {
        throw new UnsupportedOperationException();
    }

    public boolean remove(Object obj, Object obj1)
    {
        return get(obj).remove(obj1);
    }

    public Collection removeAll(Object obj)
    {
        return transform(obj, fromMultimap.removeAll(obj));
    }

    public Collection replaceValues(Object obj, Iterable iterable)
    {
        throw new UnsupportedOperationException();
    }

    public int size()
    {
        return fromMultimap.size();
    }

    public String toString()
    {
        return asMap().toString();
    }

    Collection transform(final Object key, Collection collection)
    {
        return Collections2.transform(collection, new Function() {

            final Multimaps.TransformedEntriesMultimap this$0;
            final Object val$key;

            public Object apply(Object obj)
            {
                return transformer.transformEntry(key, obj);
            }

            
            {
                this$0 = Multimaps.TransformedEntriesMultimap.this;
                key = obj;
                super();
            }
        });
    }

    public Collection values()
    {
        if (values == null)
        {
            Collection collection = Collections2.transform(fromMultimap.entries(), new Function() {

                final Multimaps.TransformedEntriesMultimap this$0;

                public volatile Object apply(Object obj)
                {
                    return apply((java.util.Map.Entry)obj);
                }

                public Object apply(java.util.Map.Entry entry)
                {
                    return transformer.transformEntry(entry.getKey(), entry.getValue());
                }

            
            {
                this$0 = Multimaps.TransformedEntriesMultimap.this;
                super();
            }
            });
            values = collection;
            return collection;
        } else
        {
            return values;
        }
    }

    _cls3.this._cls0(Multimap multimap, _cls3.this._cls0 _pcls0)
    {
        fromMultimap = (Multimap)Preconditions.checkNotNull(multimap);
        transformer = (transformer)Preconditions.checkNotNull(_pcls0);
    }

    // Unreferenced inner class com/google/common/collect/Multimaps$TransformedEntriesMultimap$TransformedEntries$1

/* anonymous class */
    class TransformedEntries._cls1
        implements Function
    {

        final Multimaps.TransformedEntriesMultimap val$this$0;
        final Maps.EntryTransformer val$transformer;

        public volatile Object apply(Object obj)
        {
            return apply((java.util.Map.Entry)obj);
        }

        public java.util.Map.Entry apply(java.util.Map.Entry entry)
        {
            return entry. new AbstractMapEntry() {

                final TransformedEntries._cls1 this$2;
                final java.util.Map.Entry val$entry;

                public Object getKey()
                {
                    return entry.getKey();
                }

                public Object getValue()
                {
    class TransformedEntries._cls1
        implements Function
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

            
            {
                this$0 = transformedentriesmultimap;
                transformer = entrytransformer;
                super();
            }
    }

}
