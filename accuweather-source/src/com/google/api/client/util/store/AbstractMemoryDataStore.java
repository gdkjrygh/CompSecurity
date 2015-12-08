// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.util.store;

import com.google.api.client.util.IOUtils;
import com.google.api.client.util.Lists;
import com.google.api.client.util.Maps;
import com.google.api.client.util.Preconditions;
import java.io.IOException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

// Referenced classes of package com.google.api.client.util.store:
//            AbstractDataStore, DataStoreUtils, DataStoreFactory, DataStore

class AbstractMemoryDataStore extends AbstractDataStore
{

    HashMap keyValueMap;
    private final Lock lock = new ReentrantLock();

    protected AbstractMemoryDataStore(DataStoreFactory datastorefactory, String s)
    {
        super(datastorefactory, s);
        keyValueMap = Maps.newHashMap();
    }

    public final DataStore clear()
        throws IOException
    {
        lock.lock();
        keyValueMap.clear();
        save();
        lock.unlock();
        return this;
        Exception exception;
        exception;
        lock.unlock();
        throw exception;
    }

    public boolean containsKey(String s)
        throws IOException
    {
        if (s == null)
        {
            return false;
        }
        lock.lock();
        boolean flag = keyValueMap.containsKey(s);
        lock.unlock();
        return flag;
        s;
        lock.unlock();
        throw s;
    }

    public boolean containsValue(Serializable serializable)
        throws IOException
    {
        if (serializable == null)
        {
            return false;
        }
        lock.lock();
        Iterator iterator;
        serializable = IOUtils.serialize(serializable);
        iterator = keyValueMap.values().iterator();
_L1:
        boolean flag;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_71;
        }
        flag = Arrays.equals(serializable, (byte[])iterator.next());
        if (flag)
        {
            lock.unlock();
            return true;
        }
          goto _L1
        lock.unlock();
        return false;
        serializable;
        lock.unlock();
        throw serializable;
    }

    public DataStore delete(String s)
        throws IOException
    {
        if (s == null)
        {
            return this;
        }
        lock.lock();
        keyValueMap.remove(s);
        save();
        lock.unlock();
        return this;
        s;
        lock.unlock();
        throw s;
    }

    public final Serializable get(String s)
        throws IOException
    {
        if (s == null)
        {
            return null;
        }
        lock.lock();
        s = IOUtils.deserialize((byte[])keyValueMap.get(s));
        lock.unlock();
        return s;
        s;
        lock.unlock();
        throw s;
    }

    public boolean isEmpty()
        throws IOException
    {
        lock.lock();
        boolean flag = keyValueMap.isEmpty();
        lock.unlock();
        return flag;
        Exception exception;
        exception;
        lock.unlock();
        throw exception;
    }

    public final Set keySet()
        throws IOException
    {
        lock.lock();
        Set set1 = Collections.unmodifiableSet(keyValueMap.keySet());
        lock.unlock();
        return set1;
        Exception exception;
        exception;
        lock.unlock();
        throw exception;
    }

    void save()
        throws IOException
    {
    }

    public final DataStore set(String s, Serializable serializable)
        throws IOException
    {
        Preconditions.checkNotNull(s);
        Preconditions.checkNotNull(serializable);
        lock.lock();
        keyValueMap.put(s, IOUtils.serialize(serializable));
        save();
        lock.unlock();
        return this;
        s;
        lock.unlock();
        throw s;
    }

    public int size()
        throws IOException
    {
        lock.lock();
        int i = keyValueMap.size();
        lock.unlock();
        return i;
        Exception exception;
        exception;
        lock.unlock();
        throw exception;
    }

    public String toString()
    {
        return DataStoreUtils.toString(this);
    }

    public final Collection values()
        throws IOException
    {
        lock.lock();
        Object obj;
        obj = Lists.newArrayList();
        for (Iterator iterator = keyValueMap.values().iterator(); iterator.hasNext(); ((List) (obj)).add(IOUtils.deserialize((byte[])iterator.next()))) { }
        break MISSING_BLOCK_LABEL_69;
        obj;
        lock.unlock();
        throw obj;
        obj = Collections.unmodifiableList(((List) (obj)));
        lock.unlock();
        return ((Collection) (obj));
    }
}
