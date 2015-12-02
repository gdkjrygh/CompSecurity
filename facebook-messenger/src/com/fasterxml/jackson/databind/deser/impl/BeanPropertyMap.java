// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.util.NameTransformer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

public final class BeanPropertyMap
    implements Iterable
{

    private final Bucket _buckets[];
    private final int _hashMask;
    private final int _size;

    public BeanPropertyMap(Collection collection)
    {
        _size = collection.size();
        int i = findSize(_size);
        _hashMask = i - 1;
        Bucket abucket[] = new Bucket[i];
        for (collection = collection.iterator(); collection.hasNext();)
        {
            SettableBeanProperty settablebeanproperty = (SettableBeanProperty)collection.next();
            String s = settablebeanproperty.getName();
            int j = s.hashCode() & _hashMask;
            abucket[j] = new Bucket(abucket[j], s, settablebeanproperty);
        }

        _buckets = abucket;
    }

    private BeanPropertyMap(Bucket abucket[], int i)
    {
        _buckets = abucket;
        _size = i;
        _hashMask = abucket.length - 1;
    }

    private SettableBeanProperty _findWithEquals(String s, int i)
    {
        for (Bucket bucket = _buckets[i]; bucket != null; bucket = bucket.next)
        {
            if (s.equals(bucket.key))
            {
                return bucket.value;
            }
        }

        return null;
    }

    private static final int findSize(int i)
    {
        int j;
        if (i <= 32)
        {
            i += i;
        } else
        {
            i = (i >> 2) + i;
        }
        for (j = 2; j < i; j += j) { }
        return j;
    }

    public BeanPropertyMap assignIndexes()
    {
        Bucket abucket[] = _buckets;
        int k = abucket.length;
        int i = 0;
        int j = 0;
        for (; i < k; i++)
        {
            for (Bucket bucket = abucket[i]; bucket != null;)
            {
                bucket.value.assignIndex(j);
                bucket = bucket.next;
                j++;
            }

        }

        return this;
    }

    public SettableBeanProperty find(String s)
    {
        int i = s.hashCode();
        i = _hashMask & i;
        Bucket bucket1 = _buckets[i];
        if (bucket1 == null)
        {
            return null;
        }
        Bucket bucket = bucket1;
        if (bucket1.key == s)
        {
            return bucket1.value;
        }
        do
        {
            Bucket bucket2 = bucket.next;
            if (bucket2 != null)
            {
                bucket = bucket2;
                if (bucket2.key == s)
                {
                    return bucket2.value;
                }
            } else
            {
                return _findWithEquals(s, i);
            }
        } while (true);
    }

    public Iterator iterator()
    {
        return new IteratorImpl(_buckets);
    }

    public void remove(SettableBeanProperty settablebeanproperty)
    {
        String s = settablebeanproperty.getName();
        int i = s.hashCode() & _buckets.length - 1;
        Bucket bucket = _buckets[i];
        boolean flag = false;
        Bucket bucket1 = null;
        while (bucket != null) 
        {
            if (!flag && bucket.key.equals(s))
            {
                flag = true;
            } else
            {
                bucket1 = new Bucket(bucket1, bucket.key, bucket.value);
            }
            bucket = bucket.next;
        }
        if (!flag)
        {
            throw new NoSuchElementException((new StringBuilder()).append("No entry '").append(settablebeanproperty).append("' found, can't remove").toString());
        } else
        {
            _buckets[i] = bucket1;
            return;
        }
    }

    public BeanPropertyMap renameAll(NameTransformer nametransformer)
    {
        if (nametransformer == null || nametransformer == NameTransformer.NOP)
        {
            return this;
        }
        Iterator iterator1 = iterator();
        ArrayList arraylist = new ArrayList();
        SettableBeanProperty settablebeanproperty;
        for (; iterator1.hasNext(); arraylist.add(settablebeanproperty))
        {
            settablebeanproperty = (SettableBeanProperty)iterator1.next();
            SettableBeanProperty settablebeanproperty1 = settablebeanproperty.withName(nametransformer.transform(settablebeanproperty.getName()));
            JsonDeserializer jsondeserializer = settablebeanproperty1.getValueDeserializer();
            settablebeanproperty = settablebeanproperty1;
            if (jsondeserializer == null)
            {
                continue;
            }
            JsonDeserializer jsondeserializer1 = jsondeserializer.unwrappingDeserializer(nametransformer);
            settablebeanproperty = settablebeanproperty1;
            if (jsondeserializer1 != jsondeserializer)
            {
                settablebeanproperty = settablebeanproperty1.withValueDeserializer(jsondeserializer1);
            }
        }

        return new BeanPropertyMap(arraylist);
    }

    public void replace(SettableBeanProperty settablebeanproperty)
    {
        String s = settablebeanproperty.getName();
        int i = s.hashCode() & _buckets.length - 1;
        Bucket bucket = _buckets[i];
        boolean flag = false;
        Bucket bucket1 = null;
        while (bucket != null) 
        {
            if (!flag && bucket.key.equals(s))
            {
                flag = true;
            } else
            {
                bucket1 = new Bucket(bucket1, bucket.key, bucket.value);
            }
            bucket = bucket.next;
        }
        if (!flag)
        {
            throw new NoSuchElementException((new StringBuilder()).append("No entry '").append(settablebeanproperty).append("' found, can't replace").toString());
        } else
        {
            _buckets[i] = new Bucket(bucket1, s, settablebeanproperty);
            return;
        }
    }

    public int size()
    {
        return _size;
    }

    public BeanPropertyMap withProperty(SettableBeanProperty settablebeanproperty)
    {
        int i = _buckets.length;
        Bucket abucket[] = new Bucket[i];
        System.arraycopy(_buckets, 0, abucket, 0, i);
        String s = settablebeanproperty.getName();
        if (find(settablebeanproperty.getName()) == null)
        {
            i = s.hashCode() & _hashMask;
            abucket[i] = new Bucket(abucket[i], s, settablebeanproperty);
            return new BeanPropertyMap(abucket, _size + 1);
        } else
        {
            BeanPropertyMap beanpropertymap = new BeanPropertyMap(abucket, i);
            beanpropertymap.replace(settablebeanproperty);
            return beanpropertymap;
        }
    }

    private class Bucket
    {

        public final String key;
        public final Bucket next;
        public final SettableBeanProperty value;

        public Bucket(Bucket bucket, String s, SettableBeanProperty settablebeanproperty)
        {
            next = bucket;
            key = s;
            value = settablebeanproperty;
        }
    }


    private class IteratorImpl
        implements Iterator
    {

        private final Bucket _buckets[];
        private Bucket _currentBucket;
        private int _nextBucketIndex;

        public boolean hasNext()
        {
            return _currentBucket != null;
        }

        public SettableBeanProperty next()
        {
            Bucket bucket = _currentBucket;
            if (bucket == null)
            {
                throw new NoSuchElementException();
            }
            Object obj;
            int i;
            for (obj = bucket.next; obj == null && _nextBucketIndex < _buckets.length; obj = obj[i])
            {
                obj = _buckets;
                i = _nextBucketIndex;
                _nextBucketIndex = i + 1;
            }

            _currentBucket = ((Bucket) (obj));
            return bucket.value;
        }

        public volatile Object next()
        {
            return next();
        }

        public void remove()
        {
            throw new UnsupportedOperationException();
        }

        public IteratorImpl(Bucket abucket[])
        {
            int i;
            int k;
            _buckets = abucket;
            i = 0;
            k = _buckets.length;
_L3:
            int j;
            if (i >= k)
            {
                break MISSING_BLOCK_LABEL_57;
            }
            abucket = _buckets;
            j = i + 1;
            abucket = abucket[i];
            if (abucket == null) goto _L2; else goto _L1
_L1:
            _currentBucket = abucket;
_L4:
            _nextBucketIndex = j;
            return;
_L2:
            i = j;
              goto _L3
            j = i;
              goto _L4
        }
    }

}
