// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            StandardTable, Lists, ImmutableEntry, UnmodifiableIterator

private class <init> extends 
{
    class ColumnMapEntrySet extends StandardTable.TableSet
    {

        final StandardTable.ColumnMap this$1;

        public boolean contains(Object obj)
        {
            if (obj instanceof java.util.Map.Entry)
            {
                obj = (java.util.Map.Entry)obj;
                if (containsColumn(((java.util.Map.Entry) (obj)).getKey()))
                {
                    Object obj1 = ((java.util.Map.Entry) (obj)).getKey();
                    return get(obj1).equals(((java.util.Map.Entry) (obj)).getValue());
                }
            }
            return false;
        }

        public Iterator iterator()
        {
            return columnKeySet().iterator(). new UnmodifiableIterator() {

                final ColumnMapEntrySet this$2;
                final Iterator val$columnIterator;

                public boolean hasNext()
                {
                    return columnIterator.hasNext();
                }

                public volatile Object next()
                {
                    return next();
                }

                public java.util.Map.Entry next()
                {
                    Object obj = columnIterator.next();
                    return new ImmutableEntry(obj, column(obj));
                }

            
            {
                this$2 = final_columnmapentryset;
                columnIterator = Iterator.this;
                super();
            }
            };
        }

        public boolean remove(Object obj)
        {
            if (contains(obj))
            {
                obj = (java.util.Map.Entry)obj;
                StandardTable.access$1100(this$0, ((java.util.Map.Entry) (obj)).getKey());
                return true;
            } else
            {
                return false;
            }
        }

        public boolean removeAll(Collection collection)
        {
            boolean flag = false;
            for (collection = collection.iterator(); collection.hasNext();)
            {
                flag |= remove(collection.next());
            }

            return flag;
        }

        public boolean retainAll(Collection collection)
        {
            boolean flag = false;
            Iterator iterator1 = Lists.newArrayList(columnKeySet().iterator()).iterator();
            do
            {
                if (!iterator1.hasNext())
                {
                    break;
                }
                Object obj = iterator1.next();
                if (!collection.contains(new ImmutableEntry(obj, column(obj))))
                {
                    StandardTable.access$1100(this$0, obj);
                    flag = true;
                }
            } while (true);
            return flag;
        }

        public int size()
        {
            return columnKeySet().size();
        }

        ColumnMapEntrySet()
        {
            this$1 = StandardTable.ColumnMap.this;
            super(this$0, null);
        }
    }

    private class ColumnMapValues extends StandardTable.TableCollection
    {

        final StandardTable.ColumnMap this$1;

        public Iterator iterator()
        {
            return StandardTable.valueIteratorImpl(StandardTable.ColumnMap.this);
        }

        public boolean remove(Object obj)
        {
            for (Iterator iterator1 = entrySet().iterator(); iterator1.hasNext();)
            {
                java.util.Map.Entry entry = (java.util.Map.Entry)iterator1.next();
                if (((Map)entry.getValue()).equals(obj))
                {
                    StandardTable.access$1100(this$0, entry.getKey());
                    return true;
                }
            }

            return false;
        }

        public boolean removeAll(Collection collection)
        {
            Preconditions.checkNotNull(collection);
            boolean flag = false;
            Iterator iterator1 = Lists.newArrayList(columnKeySet().iterator()).iterator();
            do
            {
                if (!iterator1.hasNext())
                {
                    break;
                }
                Object obj = iterator1.next();
                if (collection.contains(column(obj)))
                {
                    StandardTable.access$1100(this$0, obj);
                    flag = true;
                }
            } while (true);
            return flag;
        }

        public boolean retainAll(Collection collection)
        {
            Preconditions.checkNotNull(collection);
            boolean flag = false;
            Iterator iterator1 = Lists.newArrayList(columnKeySet().iterator()).iterator();
            do
            {
                if (!iterator1.hasNext())
                {
                    break;
                }
                Object obj = iterator1.next();
                if (!collection.contains(column(obj)))
                {
                    StandardTable.access$1100(this$0, obj);
                    flag = true;
                }
            } while (true);
            return flag;
        }

        public int size()
        {
            return columnKeySet().size();
        }

        private ColumnMapValues()
        {
            this$1 = StandardTable.ColumnMap.this;
            super(this$0, null);
        }

        ColumnMapValues(StandardTable._cls1 _pcls1)
        {
            this();
        }
    }


    ColumnMapValues columnMapValues;
    final StandardTable this$0;

    public boolean containsKey(Object obj)
    {
        return containsColumn(obj);
    }

    public Set createEntrySet()
    {
        return new ColumnMapEntrySet();
    }

    public volatile Object get(Object obj)
    {
        return get(obj);
    }

    public Map get(Object obj)
    {
        if (containsColumn(obj))
        {
            return column(obj);
        } else
        {
            return null;
        }
    }

    public Set keySet()
    {
        return columnKeySet();
    }

    public volatile Object remove(Object obj)
    {
        return remove(obj);
    }

    public Map remove(Object obj)
    {
        if (containsColumn(obj))
        {
            return StandardTable.access$1100(StandardTable.this, obj);
        } else
        {
            return null;
        }
    }

    public Collection values()
    {
        ColumnMapValues columnmapvalues1 = columnMapValues;
        ColumnMapValues columnmapvalues = columnmapvalues1;
        if (columnmapvalues1 == null)
        {
            columnmapvalues = new ColumnMapValues(null);
            columnMapValues = columnmapvalues;
        }
        return columnmapvalues;
    }

    private ColumnMapValues()
    {
        this$0 = StandardTable.this;
        super();
    }

    ( )
    {
        this();
    }
}
