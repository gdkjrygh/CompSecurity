// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.util;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

// Referenced classes of package com.google.api.client.util:
//            ClassInfo, Preconditions, FieldInfo

final class DataMap extends AbstractMap
{
    final class Entry
        implements java.util.Map.Entry
    {

        private final FieldInfo fieldInfo;
        private Object fieldValue;
        final DataMap this$0;

        public boolean equals(Object obj)
        {
            if (this != obj)
            {
                if (!(obj instanceof java.util.Map.Entry))
                {
                    return false;
                }
                obj = (java.util.Map.Entry)obj;
                if (!getKey().equals(((java.util.Map.Entry) (obj)).getKey()) || !getValue().equals(((java.util.Map.Entry) (obj)).getValue()))
                {
                    return false;
                }
            }
            return true;
        }

        public volatile Object getKey()
        {
            return getKey();
        }

        public String getKey()
        {
            String s1 = fieldInfo.getName();
            String s = s1;
            if (classInfo.getIgnoreCase())
            {
                s = s1.toLowerCase();
            }
            return s;
        }

        public Object getValue()
        {
            return fieldValue;
        }

        public int hashCode()
        {
            return getKey().hashCode() ^ getValue().hashCode();
        }

        public Object setValue(Object obj)
        {
            Object obj1 = fieldValue;
            fieldValue = Preconditions.checkNotNull(obj);
            fieldInfo.setValue(object, obj);
            return obj1;
        }

        Entry(FieldInfo fieldinfo, Object obj)
        {
            this$0 = DataMap.this;
            super();
            fieldInfo = fieldinfo;
            fieldValue = Preconditions.checkNotNull(obj);
        }
    }

    final class EntryIterator
        implements Iterator
    {

        private FieldInfo currentFieldInfo;
        private boolean isComputed;
        private boolean isRemoved;
        private FieldInfo nextFieldInfo;
        private Object nextFieldValue;
        private int nextKeyIndex;
        final DataMap this$0;

        public boolean hasNext()
        {
            if (!isComputed)
            {
                isComputed = true;
                nextFieldValue = null;
                do
                {
                    if (nextFieldValue != null)
                    {
                        break;
                    }
                    int i = nextKeyIndex + 1;
                    nextKeyIndex = i;
                    if (i >= classInfo.names.size())
                    {
                        break;
                    }
                    nextFieldInfo = classInfo.getFieldInfo((String)classInfo.names.get(nextKeyIndex));
                    nextFieldValue = nextFieldInfo.getValue(object);
                } while (true);
            }
            return nextFieldValue != null;
        }

        public volatile Object next()
        {
            return next();
        }

        public java.util.Map.Entry next()
        {
            if (!hasNext())
            {
                throw new NoSuchElementException();
            } else
            {
                currentFieldInfo = nextFieldInfo;
                Object obj = nextFieldValue;
                isComputed = false;
                isRemoved = false;
                nextFieldInfo = null;
                nextFieldValue = null;
                return new DataMap.Entry(currentFieldInfo, obj);
            }
        }

        public void remove()
        {
            boolean flag;
            if (currentFieldInfo != null && !isRemoved)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkState(flag);
            isRemoved = true;
            currentFieldInfo.setValue(object, null);
        }

        EntryIterator()
        {
            this$0 = DataMap.this;
            super();
            nextKeyIndex = -1;
        }
    }

    final class EntrySet extends AbstractSet
    {

        final DataMap this$0;

        public void clear()
        {
            String s;
            for (Iterator iterator1 = classInfo.names.iterator(); iterator1.hasNext(); classInfo.getFieldInfo(s).setValue(object, null))
            {
                s = (String)iterator1.next();
            }

        }

        public boolean isEmpty()
        {
            for (Iterator iterator1 = classInfo.names.iterator(); iterator1.hasNext();)
            {
                String s = (String)iterator1.next();
                if (classInfo.getFieldInfo(s).getValue(object) != null)
                {
                    return false;
                }
            }

            return true;
        }

        public EntryIterator iterator()
        {
            return new EntryIterator();
        }

        public volatile Iterator iterator()
        {
            return iterator();
        }

        public int size()
        {
            int i = 0;
            Iterator iterator1 = classInfo.names.iterator();
            do
            {
                if (!iterator1.hasNext())
                {
                    break;
                }
                String s = (String)iterator1.next();
                if (classInfo.getFieldInfo(s).getValue(object) != null)
                {
                    i++;
                }
            } while (true);
            return i;
        }

        EntrySet()
        {
            this$0 = DataMap.this;
            super();
        }
    }


    final ClassInfo classInfo;
    final Object object;

    DataMap(Object obj, boolean flag)
    {
        object = obj;
        classInfo = ClassInfo.of(obj.getClass(), flag);
        if (!classInfo.isEnum())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
    }

    public boolean containsKey(Object obj)
    {
        return get(obj) != null;
    }

    public EntrySet entrySet()
    {
        return new EntrySet();
    }

    public volatile Set entrySet()
    {
        return entrySet();
    }

    public Object get(Object obj)
    {
        if (obj instanceof String)
        {
            if ((obj = classInfo.getFieldInfo((String)obj)) != null)
            {
                return ((FieldInfo) (obj)).getValue(object);
            }
        }
        return null;
    }

    public volatile Object put(Object obj, Object obj1)
    {
        return put((String)obj, obj1);
    }

    public Object put(String s, Object obj)
    {
        FieldInfo fieldinfo = classInfo.getFieldInfo(s);
        Preconditions.checkNotNull(fieldinfo, (new StringBuilder()).append("no field of key ").append(s).toString());
        s = ((String) (fieldinfo.getValue(object)));
        fieldinfo.setValue(object, Preconditions.checkNotNull(obj));
        return s;
    }
}
