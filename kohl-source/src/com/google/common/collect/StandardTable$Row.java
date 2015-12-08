// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            StandardTable, Iterators, ForwardingMapEntry

private class tNull extends actMap
{
    private class RowEntrySet extends AbstractSet
    {

        final StandardTable.Row this$1;

        public void clear()
        {
            backingMap.remove(rowKey);
        }

        public boolean contains(Object obj)
        {
            if (obj instanceof java.util.Map.Entry)
            {
                obj = (java.util.Map.Entry)obj;
                return StandardTable.access$300(this$0, rowKey, ((java.util.Map.Entry) (obj)).getKey(), ((java.util.Map.Entry) (obj)).getValue());
            } else
            {
                return false;
            }
        }

        public Iterator iterator()
        {
            Map map = (Map)backingMap.get(rowKey);
            if (map == null)
            {
                return Iterators.emptyModifiableIterator();
            } else
            {
                return map. new Iterator() {

                    final RowEntrySet this$2;
                    final Iterator val$iterator;
                    final Map val$map;

                    public boolean hasNext()
                    {
                        return iterator.hasNext();
                    }

                    public volatile Object next()
                    {
                        return next();
                    }

                    public java.util.Map.Entry next()
                    {
                        return ((java.util.Map.Entry)iterator.next()). new ForwardingMapEntry() {

                            final RowEntrySet._cls1 this$3;
                            final java.util.Map.Entry val$entry;

                            protected volatile Object _mthdelegate()
                            {
                                return _mthdelegate();
                            }

                            protected java.util.Map.Entry _mthdelegate()
                            {
                                return entry;
                            }

                            public Object setValue(Object obj)
                            {
                                return super.setValue(Preconditions.checkNotNull(obj));
                            }

            
            {
                this$3 = final__pcls1;
                entry = java.util.Map.Entry.this;
                super();
            }
                        };
                    }

                    public void remove()
                    {
                        iterator.remove();
                        if (map.isEmpty())
                        {
                            backingMap.remove(rowKey);
                        }
                    }

            
            {
                this$2 = final_rowentryset;
                iterator = iterator1;
                map = Map.this;
                super();
            }
                };
            }
        }

        public boolean remove(Object obj)
        {
            if (obj instanceof java.util.Map.Entry)
            {
                obj = (java.util.Map.Entry)obj;
                return StandardTable.access$400(this$0, rowKey, ((java.util.Map.Entry) (obj)).getKey(), ((java.util.Map.Entry) (obj)).getValue());
            } else
            {
                return false;
            }
        }

        public int size()
        {
            Map map = (Map)backingMap.get(rowKey);
            if (map == null)
            {
                return 0;
            } else
            {
                return map.size();
            }
        }

        private RowEntrySet()
        {
            this$1 = StandardTable.Row.this;
            super();
        }

        RowEntrySet(StandardTable._cls1 _pcls1)
        {
            this();
        }
    }


    final Object rowKey;
    final StandardTable this$0;

    public boolean containsKey(Object obj)
    {
        return contains(rowKey, obj);
    }

    protected Set createEntrySet()
    {
        return new RowEntrySet(null);
    }

    public Object get(Object obj)
    {
        return StandardTable.this.get(rowKey, obj);
    }

    public Object put(Object obj, Object obj1)
    {
        return StandardTable.this.put(rowKey, obj, obj1);
    }

    public Object remove(Object obj)
    {
        return StandardTable.this.remove(rowKey, obj);
    }

    RowEntrySet(Object obj)
    {
        this$0 = StandardTable.this;
        super();
        rowKey = Preconditions.checkNotNull(obj);
    }
}
