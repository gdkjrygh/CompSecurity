// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.mp4parser.util;


public class IntHashMap
{
    private static class Entry
    {

        int hash;
        int key;
        Entry next;
        Object value;

        protected Entry(int i, int j, Object obj, Entry entry)
        {
            hash = i;
            key = j;
            value = obj;
            next = entry;
        }
    }


    private transient int count;
    private float loadFactor;
    private transient Entry table[];
    private int threshold;

    public IntHashMap()
    {
        this(20, 0.75F);
    }

    public IntHashMap(int i)
    {
        this(i, 0.75F);
    }

    public IntHashMap(int i, float f)
    {
        if (i < 0)
        {
            throw new IllegalArgumentException((new StringBuilder("Illegal Capacity: ")).append(i).toString());
        }
        if (f <= 0.0F)
        {
            throw new IllegalArgumentException((new StringBuilder("Illegal Load: ")).append(f).toString());
        }
        int j = i;
        if (i == 0)
        {
            j = 1;
        }
        loadFactor = f;
        table = new Entry[j];
        threshold = (int)((float)j * f);
    }

    public void clear()
    {
        this;
        JVM INSTR monitorenter ;
        Entry aentry[];
        int i;
        aentry = table;
        i = aentry.length;
_L2:
        i--;
        if (i >= 0)
        {
            break MISSING_BLOCK_LABEL_26;
        }
        count = 0;
        this;
        JVM INSTR monitorexit ;
        return;
        aentry[i] = null;
        if (true) goto _L2; else goto _L1
_L1:
        Exception exception;
        exception;
        throw exception;
    }

    public boolean contains(Object obj)
    {
        Entry aentry[];
        int i;
        if (obj == null)
        {
            throw new NullPointerException();
        }
        aentry = table;
        i = aentry.length;
_L2:
        int j = i - 1;
        if (i <= 0)
        {
            return false;
        }
        Entry entry = aentry[j];
        do
        {
label0:
            {
                if (entry != null)
                {
                    break label0;
                }
                i = j;
            }
            if (true)
            {
                continue;
            }
            if (entry.value.equals(obj))
            {
                return true;
            }
            entry = entry.next;
        } while (true);
        if (true) goto _L2; else goto _L1
_L1:
    }

    public boolean containsKey(int i)
    {
        Entry aentry[] = table;
        Entry entry = aentry[(0x7fffffff & i) % aentry.length];
        do
        {
            if (entry == null)
            {
                return false;
            }
            if (entry.hash == i)
            {
                return true;
            }
            entry = entry.next;
        } while (true);
    }

    public boolean containsValue(Object obj)
    {
        return contains(obj);
    }

    public Object get(int i)
    {
        Entry aentry[] = table;
        Entry entry = aentry[(0x7fffffff & i) % aentry.length];
        do
        {
            if (entry == null)
            {
                return null;
            }
            if (entry.hash == i)
            {
                return entry.value;
            }
            entry = entry.next;
        } while (true);
    }

    public boolean isEmpty()
    {
        return count == 0;
    }

    public Object put(int i, Object obj)
    {
        Entry aentry[] = table;
        int j = (i & 0x7fffffff) % aentry.length;
        Object obj1 = aentry[j];
        do
        {
            if (obj1 == null)
            {
                obj1 = aentry;
                if (count >= threshold)
                {
                    rehash();
                    obj1 = table;
                    j = (i & 0x7fffffff) % obj1.length;
                }
                obj1[j] = new Entry(i, i, obj, obj1[j]);
                count = count + 1;
                return null;
            }
            if (((Entry) (obj1)).hash == i)
            {
                Object obj2 = ((Entry) (obj1)).value;
                obj1.value = obj;
                return obj2;
            }
            obj1 = ((Entry) (obj1)).next;
        } while (true);
    }

    protected void rehash()
    {
        Entry aentry[];
        Entry aentry1[];
        int i;
        int k;
        i = table.length;
        aentry = table;
        k = i * 2 + 1;
        aentry1 = new Entry[k];
        threshold = (int)((float)k * loadFactor);
        table = aentry1;
_L2:
        int j = i - 1;
        if (i <= 0)
        {
            return;
        }
        Entry entry = aentry[j];
        do
        {
label0:
            {
                if (entry != null)
                {
                    break label0;
                }
                i = j;
            }
            if (true)
            {
                continue;
            }
            Entry entry1 = entry.next;
            i = (entry.hash & 0x7fffffff) % k;
            entry.next = aentry1[i];
            aentry1[i] = entry;
            entry = entry1;
        } while (true);
        if (true) goto _L2; else goto _L1
_L1:
    }

    public Object remove(int i)
    {
        Entry aentry[] = table;
        int j = (0x7fffffff & i) % aentry.length;
        Entry entry = aentry[j];
        Object obj = null;
        do
        {
            if (entry == null)
            {
                return null;
            }
            if (entry.hash == i)
            {
                if (obj != null)
                {
                    obj.next = entry.next;
                } else
                {
                    aentry[j] = entry.next;
                }
                count = count - 1;
                obj = entry.value;
                entry.value = null;
                return obj;
            }
            Entry entry1 = entry.next;
            obj = entry;
            entry = entry1;
        } while (true);
    }

    public int size()
    {
        return count;
    }
}
