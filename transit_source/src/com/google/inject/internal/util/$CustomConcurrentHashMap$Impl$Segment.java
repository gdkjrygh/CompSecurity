// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.internal.util;

import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.ReentrantLock;

// Referenced classes of package com.google.inject.internal.util:
//            $CustomConcurrentHashMap

final class newEntryArray extends ReentrantLock
{

    volatile int count;
    int modCount;
    volatile AtomicReferenceArray table;
    final table this$0;
    int threshold;

    void clear()
    {
        if (count == 0)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        lock();
        AtomicReferenceArray atomicreferencearray = table;
        int i = 0;
_L2:
        if (i >= atomicreferencearray.length())
        {
            break; /* Loop/switch isn't completed */
        }
        atomicreferencearray.set(i, null);
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        modCount = modCount + 1;
        count = 0;
        unlock();
        return;
        Exception exception;
        exception;
        unlock();
        throw exception;
    }

    boolean containsKey(Object obj, int i)
    {
        Object obj1;
        unlock unlock;
        boolean flag;
        boolean flag1;
        flag1 = false;
        unlock = ;
        flag = flag1;
        if (count == 0)
        {
            break MISSING_BLOCK_LABEL_107;
        }
        obj1 = getFirst(i);
_L2:
        flag = flag1;
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_107;
        }
        if (unlock.ash(obj1) == i)
        {
            break; /* Loop/switch isn't completed */
        }
_L4:
        obj1 = unlock.ext(obj1);
        Object obj2;
        if (true) goto _L2; else goto _L1
_L1:
        if ((obj2 = unlock.ey(obj1)) == null || !unlock.lKeys(obj2, obj)) goto _L4; else goto _L3
_L3:
        flag = flag1;
        if (unlock.alue(obj1) != null)
        {
            flag = true;
        }
        return flag;
    }

    boolean containsValue(Object obj)
    {
        alue alue;
        AtomicReferenceArray atomicreferencearray;
        int i;
        int j;
        alue = ;
        if (count == 0)
        {
            break MISSING_BLOCK_LABEL_98;
        }
        atomicreferencearray = table;
        j = atomicreferencearray.length();
        i = 0;
_L8:
        if (i >= j) goto _L2; else goto _L1
_L1:
        Object obj1 = atomicreferencearray.get(i);
_L5:
        Object obj2;
        if (obj1 == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        obj2 = alue.alue(obj1);
          goto _L3
_L7:
        obj1 = alue.ext(obj1);
        if (true) goto _L5; else goto _L4
_L4:
        continue; /* Loop/switch isn't completed */
_L3:
        if (obj2 == null || !alue.lValues(obj2, obj)) goto _L7; else goto _L6
_L6:
        return true;
        i++;
          goto _L8
_L2:
        return false;
    }

    void expand()
    {
        AtomicReferenceArray atomicreferencearray = table;
        int j1 = atomicreferencearray.length();
        if (j1 >= 0x40000000)
        {
            return;
        }
        lValues lvalues = ;
        AtomicReferenceArray atomicreferencearray1 = newEntryArray(j1 << 1);
        threshold = (int)((float)atomicreferencearray1.length() * or);
        int k1 = atomicreferencearray1.length() - 1;
        int i = 0;
        while (i < j1) 
        {
            Object obj1 = atomicreferencearray.get(i);
            if (obj1 != null)
            {
                Object obj = lvalues.ext(obj1);
                int j = lvalues.ash(obj1) & k1;
                if (obj == null)
                {
                    atomicreferencearray1.set(j, obj1);
                } else
                {
                    Object obj3 = obj1;
                    while (obj != null) 
                    {
                        int i1 = lvalues.ash(obj) & k1;
                        int l = j;
                        if (i1 != j)
                        {
                            l = i1;
                            obj3 = obj;
                        }
                        obj = lvalues.ext(obj);
                        j = l;
                    }
                    atomicreferencearray1.set(j, obj3);
                    obj = obj1;
                    while (obj != obj3) 
                    {
                        Object obj2 = lvalues.ey(obj);
                        if (obj2 != null)
                        {
                            int k = lvalues.ash(obj) & k1;
                            atomicreferencearray1.set(k, lvalues.Entry(obj2, obj, atomicreferencearray1.get(k)));
                        }
                        obj = lvalues.ext(obj);
                    }
                }
            }
            i++;
        }
        table = atomicreferencearray1;
    }

    Object get(Object obj, int i)
    {
        obj = getEntry(obj, i);
        if (obj == null)
        {
            return null;
        } else
        {
            return .alue(obj);
        }
    }

    public Object getEntry(Object obj, int i)
    {
        Object obj1;
        alue alue;
        alue = ;
        if (count == 0)
        {
            break MISSING_BLOCK_LABEL_80;
        }
        obj1 = getFirst(i);
_L2:
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_80;
        }
        if (alue.ash(obj1) == i)
        {
            break; /* Loop/switch isn't completed */
        }
_L4:
        obj1 = alue.ext(obj1);
        Object obj2;
        if (true) goto _L2; else goto _L1
_L1:
        if ((obj2 = alue.ey(obj1)) == null || !alue.lKeys(obj2, obj)) goto _L4; else goto _L3
_L3:
        return obj1;
        return null;
    }

    Object getFirst(int i)
    {
        AtomicReferenceArray atomicreferencearray = table;
        return atomicreferencearray.get(atomicreferencearray.length() - 1 & i);
    }

    AtomicReferenceArray newEntryArray(int i)
    {
        return new AtomicReferenceArray(i);
    }

    Object put(Object obj, int i, Object obj1, boolean flag)
    {
        table table1;
        table1 = ;
        lock();
        Object obj3;
        AtomicReferenceArray atomicreferencearray;
        int j;
        int k;
        j = count;
        if (j > threshold)
        {
            expand();
        }
        atomicreferencearray = table;
        k = i & atomicreferencearray.length() - 1;
        obj3 = atomicreferencearray.get(k);
        Object obj2 = obj3;
_L1:
        if (obj2 == null)
        {
            break MISSING_BLOCK_LABEL_164;
        }
        Object obj4 = table1.ey(obj2);
        if (table1.ash(obj2) != i || obj4 == null)
        {
            break MISSING_BLOCK_LABEL_150;
        }
        if (!table1.lKeys(obj, obj4))
        {
            break MISSING_BLOCK_LABEL_150;
        }
        obj = table1.alue(obj2);
        if (flag && obj != null)
        {
            unlock();
            return obj;
        }
        table1.alue(obj2, obj1);
        unlock();
        return obj;
        obj2 = table1.ext(obj2);
          goto _L1
        modCount = modCount + 1;
        obj = table1.ntry(obj, i, obj3);
        table1.alue(obj, obj1);
        atomicreferencearray.set(k, obj);
        count = j + 1;
        unlock();
        return null;
        obj;
        unlock();
        throw obj;
    }

    Object remove(Object obj, int i)
    {
        unlock unlock;
        unlock = ;
        lock();
        Object obj2;
        AtomicReferenceArray atomicreferencearray;
        int j;
        int k;
        j = count;
        atomicreferencearray = table;
        k = i & atomicreferencearray.length() - 1;
        obj2 = atomicreferencearray.get(k);
        Object obj1 = obj2;
_L4:
        if (obj1 == null)
        {
            break; /* Loop/switch isn't completed */
        }
        Object obj3 = unlock.ey(obj1);
        if (unlock.ash(obj1) != i || obj3 == null)
        {
            break MISSING_BLOCK_LABEL_212;
        }
        Object obj4;
        if (!unlock.lKeys(obj3, obj))
        {
            break MISSING_BLOCK_LABEL_212;
        }
        obj4 = .alue(obj1);
        modCount = modCount + 1;
        obj3 = unlock.ext(obj1);
        obj = obj2;
        obj2 = obj3;
_L2:
        if (obj == obj1)
        {
            break; /* Loop/switch isn't completed */
        }
        Object obj5 = unlock.ey(obj);
        obj3 = obj2;
        if (obj5 == null)
        {
            break MISSING_BLOCK_LABEL_172;
        }
        obj3 = unlock.Entry(obj5, obj, obj2);
        obj = unlock.ext(obj);
        obj2 = obj3;
        if (true) goto _L2; else goto _L1
_L1:
        atomicreferencearray.set(k, obj2);
        count = j - 1;
        unlock();
        return obj4;
        obj1 = unlock.ext(obj1);
        if (true) goto _L4; else goto _L3
_L3:
        unlock();
        return null;
        obj;
        unlock();
        throw obj;
    }

    boolean remove(Object obj, int i, Object obj1)
    {
        unlock unlock;
        unlock = ;
        lock();
        Object obj3;
        AtomicReferenceArray atomicreferencearray;
        int j;
        int k;
        j = count;
        atomicreferencearray = table;
        k = i & atomicreferencearray.length() - 1;
        obj3 = atomicreferencearray.get(k);
        Object obj2 = obj3;
_L4:
        if (obj2 == null)
        {
            break; /* Loop/switch isn't completed */
        }
        Object obj4 = unlock.ey(obj2);
        if (unlock.ash(obj2) != i || obj4 == null)
        {
            break MISSING_BLOCK_LABEL_239;
        }
        if (!unlock.lKeys(obj4, obj))
        {
            break MISSING_BLOCK_LABEL_239;
        }
        obj = .alue(obj2);
        if (obj1 == obj)
        {
            break MISSING_BLOCK_LABEL_136;
        }
        if (obj1 == null || obj == null)
        {
            break MISSING_BLOCK_LABEL_233;
        }
        if (!unlock.lValues(obj, obj1))
        {
            break MISSING_BLOCK_LABEL_233;
        }
        modCount = modCount + 1;
        obj1 = unlock.ext(obj2);
        obj = obj3;
_L2:
        if (obj == obj2)
        {
            break; /* Loop/switch isn't completed */
        }
        obj4 = unlock.ey(obj);
        obj3 = obj1;
        if (obj4 == null)
        {
            break MISSING_BLOCK_LABEL_196;
        }
        obj3 = unlock.Entry(obj4, obj, obj1);
        obj = unlock.ext(obj);
        obj1 = obj3;
        if (true) goto _L2; else goto _L1
_L1:
        atomicreferencearray.set(k, obj1);
        count = j - 1;
        unlock();
        return true;
        unlock();
        return false;
        obj2 = unlock.ext(obj2);
        if (true) goto _L4; else goto _L3
_L3:
        unlock();
        return false;
        obj;
        unlock();
        throw obj;
    }

    public boolean removeEntry(Object obj, int i)
    {
        unlock unlock;
        unlock = ;
        lock();
        Object obj2;
        AtomicReferenceArray atomicreferencearray;
        int j;
        int k;
        j = count;
        atomicreferencearray = table;
        k = i & atomicreferencearray.length() - 1;
        obj2 = atomicreferencearray.get(k);
        Object obj1 = obj2;
_L4:
        if (obj1 == null)
        {
            break; /* Loop/switch isn't completed */
        }
        Object obj3;
        if (unlock.ash(obj1) != i || !obj.equals(obj1))
        {
            break MISSING_BLOCK_LABEL_176;
        }
        modCount = modCount + 1;
        obj3 = unlock.ext(obj1);
        obj = obj2;
        obj2 = obj3;
_L2:
        if (obj == obj1)
        {
            break; /* Loop/switch isn't completed */
        }
        Object obj4 = unlock.ey(obj);
        obj3 = obj2;
        if (obj4 == null)
        {
            break MISSING_BLOCK_LABEL_137;
        }
        obj3 = unlock.Entry(obj4, obj, obj2);
        obj = unlock.ext(obj);
        obj2 = obj3;
        if (true) goto _L2; else goto _L1
_L1:
        atomicreferencearray.set(k, obj2);
        count = j - 1;
        unlock();
        return true;
        obj1 = unlock.ext(obj1);
        if (true) goto _L4; else goto _L3
_L3:
        unlock();
        return false;
        obj;
        unlock();
        throw obj;
    }

    public boolean removeEntry(Object obj, int i, Object obj1)
    {
        unlock unlock;
        unlock = ;
        lock();
        Object obj3;
        AtomicReferenceArray atomicreferencearray;
        int j;
        int k;
        j = count;
        atomicreferencearray = table;
        k = i & atomicreferencearray.length() - 1;
        obj3 = atomicreferencearray.get(k);
        Object obj2 = obj3;
_L4:
        if (obj2 == null)
        {
            break; /* Loop/switch isn't completed */
        }
        if (unlock.ash(obj2) != i || !obj.equals(obj2))
        {
            break MISSING_BLOCK_LABEL_210;
        }
        obj = unlock.alue(obj2);
        if (obj == obj1)
        {
            break MISSING_BLOCK_LABEL_107;
        }
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_204;
        }
        if (!unlock.lValues(obj, obj1))
        {
            break MISSING_BLOCK_LABEL_204;
        }
        modCount = modCount + 1;
        obj1 = unlock.ext(obj2);
        obj = obj3;
_L2:
        if (obj == obj2)
        {
            break; /* Loop/switch isn't completed */
        }
        Object obj4 = unlock.ey(obj);
        obj3 = obj1;
        if (obj4 == null)
        {
            break MISSING_BLOCK_LABEL_167;
        }
        obj3 = unlock.Entry(obj4, obj, obj1);
        obj = unlock.ext(obj);
        obj1 = obj3;
        if (true) goto _L2; else goto _L1
_L1:
        atomicreferencearray.set(k, obj1);
        count = j - 1;
        unlock();
        return true;
        unlock();
        return false;
        obj2 = unlock.ext(obj2);
        if (true) goto _L4; else goto _L3
_L3:
        unlock();
        return false;
        obj;
        unlock();
        throw obj;
    }

    Object replace(Object obj, int i, Object obj1)
    {
        unlock unlock;
        unlock = ;
        lock();
        Object obj2 = getFirst(i);
_L2:
        if (obj2 == null)
        {
            break; /* Loop/switch isn't completed */
        }
        Object obj3 = unlock.ey(obj2);
        if (unlock.ash(obj2) != i || obj3 == null)
        {
            break MISSING_BLOCK_LABEL_103;
        }
        if (!unlock.lKeys(obj, obj3))
        {
            break MISSING_BLOCK_LABEL_103;
        }
        obj = unlock.alue(obj2);
        if (obj == null)
        {
            unlock();
            return null;
        }
        unlock.alue(obj2, obj1);
        unlock();
        return obj;
        obj2 = unlock.ext(obj2);
        if (true) goto _L2; else goto _L1
_L1:
        unlock();
        return null;
        obj;
        unlock();
        throw obj;
    }

    boolean replace(Object obj, int i, Object obj1, Object obj2)
    {
        unlock unlock;
        unlock = ;
        lock();
        Object obj3 = getFirst(i);
_L2:
        if (obj3 == null)
        {
            break; /* Loop/switch isn't completed */
        }
        Object obj4 = unlock.ey(obj3);
        if (unlock.ash(obj3) != i || obj4 == null)
        {
            break MISSING_BLOCK_LABEL_119;
        }
        if (!unlock.lKeys(obj, obj4))
        {
            break MISSING_BLOCK_LABEL_119;
        }
        obj4 = unlock.alue(obj3);
        if (obj4 == null)
        {
            unlock();
            return false;
        }
        if (!unlock.lValues(obj4, obj1))
        {
            break MISSING_BLOCK_LABEL_119;
        }
        unlock.alue(obj3, obj2);
        unlock();
        return true;
        obj3 = unlock.ext(obj3);
        if (true) goto _L2; else goto _L1
_L1:
        unlock();
        return false;
        obj;
        unlock();
        throw obj;
    }

    void setTable(AtomicReferenceArray atomicreferencearray)
    {
        threshold = (int)((float)atomicreferencearray.length() * or);
        table = atomicreferencearray;
    }

    (int i)
    {
        this$0 = this._cls0.this;
        super();
        setTable(newEntryArray(i));
    }
}
