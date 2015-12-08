// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package rx.internal.util;

import java.io.PrintStream;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;
import rx.Subscription;
import rx.functions.Func1;

// Referenced classes of package rx.internal.util:
//            PlatformDependent, ObjectPool

public final class IndexedRingBuffer
    implements Subscription
{
    private static class ElementSection
    {

        private final AtomicReferenceArray array;
        private final AtomicReference next;

        ElementSection getNext()
        {
            if (next.get() != null)
            {
                return (ElementSection)next.get();
            }
            ElementSection elementsection = new ElementSection();
            if (next.compareAndSet(null, elementsection))
            {
                return elementsection;
            } else
            {
                return (ElementSection)next.get();
            }
        }



        private ElementSection()
        {
            array = new AtomicReferenceArray(IndexedRingBuffer.SIZE);
            next = new AtomicReference();
        }

    }

    private static class IndexSection
    {

        private final AtomicReference _next;
        private final AtomicIntegerArray unsafeArray;

        public int getAndSet(int i, int j)
        {
            return unsafeArray.getAndSet(i, j);
        }

        IndexSection getNext()
        {
            if (_next.get() != null)
            {
                return (IndexSection)_next.get();
            }
            IndexSection indexsection = new IndexSection();
            if (_next.compareAndSet(null, indexsection))
            {
                return indexsection;
            } else
            {
                return (IndexSection)_next.get();
            }
        }

        public void set(int i, int j)
        {
            unsafeArray.set(i, j);
        }

        private IndexSection()
        {
            unsafeArray = new AtomicIntegerArray(IndexedRingBuffer.SIZE);
            _next = new AtomicReference();
        }

    }


    private static final ObjectPool POOL = new ObjectPool() {

        protected volatile Object createObject()
        {
            return createObject();
        }

        protected IndexedRingBuffer createObject()
        {
            return new IndexedRingBuffer();
        }

    };
    static final int SIZE;
    static int _size;
    private final ElementSection elements;
    final AtomicInteger index;
    private final IndexSection removed;
    final AtomicInteger removedIndex;

    private IndexedRingBuffer()
    {
        elements = new ElementSection();
        removed = new IndexSection();
        index = new AtomicInteger();
        removedIndex = new AtomicInteger();
    }


    private int forEach(Func1 func1, int i, int j)
    {
        ElementSection elementsection;
        int k;
        int l;
        int j1;
        j1 = index.get();
        int i1 = i;
        elementsection = elements;
        l = i1;
        k = i;
        if (i >= SIZE)
        {
            elementsection = getElementSection(i);
            k = i % SIZE;
            l = i1;
        }
_L10:
        i = l;
        if (elementsection == null) goto _L2; else goto _L1
_L1:
        if (k >= SIZE)
        {
            break; /* Loop/switch isn't completed */
        }
        if (l < j1 && l < j) goto _L4; else goto _L3
_L3:
        i = l;
_L2:
        return i;
_L4:
        Object obj = elementsection.array.get(k);
          goto _L5
_L8:
        k++;
        l++;
        if (true) goto _L1; else goto _L6
_L5:
        if (obj == null || ((Boolean)func1.call(obj)).booleanValue()) goto _L8; else goto _L7
_L7:
        return l;
_L6:
        elementsection = (ElementSection)elementsection.next.get();
        k = 0;
        if (true) goto _L10; else goto _L9
_L9:
    }

    private ElementSection getElementSection(int i)
    {
        if (i >= SIZE) goto _L2; else goto _L1
_L1:
        ElementSection elementsection1 = elements;
_L4:
        return elementsection1;
_L2:
        int j = i / SIZE;
        ElementSection elementsection = elements;
        i = 0;
        do
        {
            elementsection1 = elementsection;
            if (i >= j)
            {
                continue;
            }
            elementsection = elementsection.getNext();
            i++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    private int getIndexForAdd()
    {
        this;
        JVM INSTR monitorenter ;
        int i = getIndexFromPreviouslyRemoved();
        if (i < 0) goto _L2; else goto _L1
_L1:
        if (i >= SIZE) goto _L4; else goto _L3
_L3:
        i = removed.getAndSet(i, -1);
_L8:
        int j = i;
        if (i != index.get())
        {
            break MISSING_BLOCK_LABEL_51;
        }
        index.getAndIncrement();
        j = i;
_L6:
        this;
        JVM INSTR monitorexit ;
        return j;
_L4:
        j = SIZE;
        i = getIndexSection(i).getAndSet(i % j, -1);
        continue; /* Loop/switch isn't completed */
_L2:
        j = index.getAndIncrement();
        if (true) goto _L6; else goto _L5
_L5:
        Exception exception;
        exception;
        throw exception;
        if (true) goto _L8; else goto _L7
_L7:
    }

    private int getIndexFromPreviouslyRemoved()
    {
        this;
        JVM INSTR monitorenter ;
_L4:
        int i = removedIndex.get();
        if (i <= 0) goto _L2; else goto _L1
_L1:
        boolean flag = removedIndex.compareAndSet(i, i - 1);
        if (!flag) goto _L4; else goto _L3
_L3:
        i--;
_L6:
        this;
        JVM INSTR monitorexit ;
        return i;
_L2:
        i = -1;
        if (true) goto _L6; else goto _L5
_L5:
        Exception exception;
        exception;
        throw exception;
    }

    private IndexSection getIndexSection(int i)
    {
        if (i >= SIZE) goto _L2; else goto _L1
_L1:
        IndexSection indexsection1 = removed;
_L4:
        return indexsection1;
_L2:
        int j = i / SIZE;
        IndexSection indexsection = removed;
        i = 0;
        do
        {
            indexsection1 = indexsection;
            if (i >= j)
            {
                continue;
            }
            indexsection = indexsection.getNext();
            i++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static final IndexedRingBuffer getInstance()
    {
        return (IndexedRingBuffer)POOL.borrowObject();
    }

    private void pushRemovedIndex(int i)
    {
        this;
        JVM INSTR monitorenter ;
        int j = removedIndex.getAndIncrement();
        if (j >= SIZE) goto _L2; else goto _L1
_L1:
        removed.set(j, i);
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        int k = SIZE;
        getIndexSection(j).set(j % k, i);
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public int add(Object obj)
    {
        int i = getIndexForAdd();
        if (i < SIZE)
        {
            elements.array.set(i, obj);
            return i;
        } else
        {
            int j = SIZE;
            getElementSection(i).array.set(i % j, obj);
            return i;
        }
    }

    public int forEach(Func1 func1)
    {
        return forEach(func1, 0);
    }

    public int forEach(Func1 func1, int i)
    {
        int j = forEach(func1, i, index.get());
        if (i > 0 && j == index.get())
        {
            i = forEach(func1, 0, i);
        } else
        {
            i = j;
            if (j == index.get())
            {
                return 0;
            }
        }
        return i;
    }

    public boolean isUnsubscribed()
    {
        return false;
    }

    public void releaseToPool()
    {
        ElementSection elementsection;
        int i;
        int k;
        k = index.get();
        i = 0;
        elementsection = elements;
_L7:
        if (elementsection == null) goto _L2; else goto _L1
_L1:
        int j = 0;
_L5:
        if (j >= SIZE)
        {
            break; /* Loop/switch isn't completed */
        }
        if (i < k) goto _L3; else goto _L2
_L2:
        index.set(0);
        removedIndex.set(0);
        POOL.returnObject(this);
        return;
_L3:
        elementsection.array.set(j, null);
        j++;
        i++;
        if (true) goto _L5; else goto _L4
_L4:
        elementsection = (ElementSection)elementsection.next.get();
        if (true) goto _L7; else goto _L6
_L6:
    }

    public Object remove(int i)
    {
        Object obj;
        if (i < SIZE)
        {
            obj = elements.array.getAndSet(i, null);
        } else
        {
            int j = SIZE;
            obj = getElementSection(i).array.getAndSet(i % j, null);
        }
        pushRemovedIndex(i);
        return obj;
    }

    public void unsubscribe()
    {
        releaseToPool();
    }

    static 
    {
        _size = 256;
        if (PlatformDependent.isAndroid())
        {
            _size = 8;
        }
        String s = System.getProperty("rx.indexed-ring-buffer.size");
        if (s != null)
        {
            try
            {
                _size = Integer.parseInt(s);
            }
            catch (Exception exception)
            {
                System.err.println((new StringBuilder()).append("Failed to set 'rx.indexed-ring-buffer.size' with value ").append(s).append(" => ").append(exception.getMessage()).toString());
            }
        }
        SIZE = _size;
    }
}
