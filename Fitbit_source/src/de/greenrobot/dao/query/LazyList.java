// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package de.greenrobot.dao.query;

import android.database.Cursor;
import de.greenrobot.dao.DaoException;
import de.greenrobot.dao.InternalQueryDaoAccess;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.locks.ReentrantLock;

// Referenced classes of package de.greenrobot.dao.query:
//            CloseableListIterator

public class LazyList
    implements Closeable, List
{

    private final Cursor cursor;
    private final InternalQueryDaoAccess daoAccess;
    private final List entities;
    private volatile int loadedCount;
    private final ReentrantLock lock = new ReentrantLock();
    private final int size;

    LazyList(InternalQueryDaoAccess internalquerydaoaccess, Cursor cursor1, boolean flag)
    {
        cursor = cursor1;
        daoAccess = internalquerydaoaccess;
        size = cursor1.getCount();
        if (flag)
        {
            entities = new ArrayList(size);
            for (int i = 0; i < size; i++)
            {
                entities.add(null);
            }

        } else
        {
            entities = null;
        }
        if (size == 0)
        {
            cursor1.close();
        }
    }

    public void add(int i, Object obj)
    {
        throw new UnsupportedOperationException();
    }

    public boolean add(Object obj)
    {
        throw new UnsupportedOperationException();
    }

    public boolean addAll(int i, Collection collection)
    {
        throw new UnsupportedOperationException();
    }

    public boolean addAll(Collection collection)
    {
        throw new UnsupportedOperationException();
    }

    protected void checkCached()
    {
        if (entities == null)
        {
            throw new DaoException("This operation only works with cached lazy lists");
        } else
        {
            return;
        }
    }

    public void clear()
    {
        throw new UnsupportedOperationException();
    }

    public void close()
    {
        cursor.close();
    }

    public boolean contains(Object obj)
    {
        loadRemaining();
        return entities.contains(obj);
    }

    public boolean containsAll(Collection collection)
    {
        loadRemaining();
        return entities.containsAll(collection);
    }

    public Object get(int i)
    {
        Object obj;
        if (entities == null)
        {
            break MISSING_BLOCK_LABEL_119;
        }
        Object obj1 = entities.get(i);
        obj = obj1;
        if (obj1 != null)
        {
            break MISSING_BLOCK_LABEL_107;
        }
        lock.lock();
        Object obj2 = entities.get(i);
        obj = obj2;
        if (obj2 != null)
        {
            break MISSING_BLOCK_LABEL_100;
        }
        obj2 = loadEntity(i);
        entities.set(i, obj2);
        loadedCount = loadedCount + 1;
        obj = obj2;
        if (loadedCount != size)
        {
            break MISSING_BLOCK_LABEL_100;
        }
        cursor.close();
        obj = obj2;
        lock.unlock();
        return obj;
        Exception exception;
        exception;
        lock.unlock();
        throw exception;
        return loadEntity(i);
    }

    public int getLoadedCount()
    {
        return loadedCount;
    }

    public int indexOf(Object obj)
    {
        loadRemaining();
        return entities.indexOf(obj);
    }

    public boolean isClosed()
    {
        return cursor.isClosed();
    }

    public boolean isEmpty()
    {
        return size == 0;
    }

    public boolean isLoadedCompletely()
    {
        return loadedCount == size;
    }

    public Iterator iterator()
    {
    /* block-local class not found */
    class LazyIterator {}

        return new LazyIterator(0, false);
    }

    public int lastIndexOf(Object obj)
    {
        loadRemaining();
        return entities.lastIndexOf(obj);
    }

    public CloseableListIterator listIterator()
    {
        return new LazyIterator(0, false);
    }

    public volatile ListIterator listIterator()
    {
        return listIterator();
    }

    public ListIterator listIterator(int i)
    {
        return new LazyIterator(i, false);
    }

    public CloseableListIterator listIteratorAutoClose()
    {
        return new LazyIterator(0, true);
    }

    protected Object loadEntity(int i)
    {
        cursor.moveToPosition(i);
        Object obj = daoAccess.loadCurrent(cursor, 0, true);
        if (obj == null)
        {
            throw new DaoException((new StringBuilder()).append("Loading of entity failed (null) at position ").append(i).toString());
        } else
        {
            return obj;
        }
    }

    public void loadRemaining()
    {
        checkCached();
        int j = entities.size();
        for (int i = 0; i < j; i++)
        {
            get(i);
        }

    }

    public Object peak(int i)
    {
        if (entities != null)
        {
            return entities.get(i);
        } else
        {
            return null;
        }
    }

    public Object remove(int i)
    {
        throw new UnsupportedOperationException();
    }

    public boolean remove(Object obj)
    {
        throw new UnsupportedOperationException();
    }

    public boolean removeAll(Collection collection)
    {
        throw new UnsupportedOperationException();
    }

    public boolean retainAll(Collection collection)
    {
        throw new UnsupportedOperationException();
    }

    public Object set(int i, Object obj)
    {
        throw new UnsupportedOperationException();
    }

    public int size()
    {
        return size;
    }

    public List subList(int i, int j)
    {
        checkCached();
        for (int k = i; k < j; k++)
        {
            entities.get(k);
        }

        return entities.subList(i, j);
    }

    public Object[] toArray()
    {
        loadRemaining();
        return entities.toArray();
    }

    public Object[] toArray(Object aobj[])
    {
        loadRemaining();
        return entities.toArray(aobj);
    }

}
