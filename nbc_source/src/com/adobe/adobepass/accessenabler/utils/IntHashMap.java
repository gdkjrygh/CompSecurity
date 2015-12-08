// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.adobepass.accessenabler.utils;


class IntHashMap
{
    private static class Entry
    {

        final int hash;
        final int key;
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
    private final float loadFactor;
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
            throw new IllegalArgumentException((new StringBuilder()).append("Illegal Capacity: ").append(i).toString());
        }
        if (f <= 0.0F)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Illegal Load: ").append(f).toString());
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
        do
        {
            i--;
            if (i < 0)
            {
                break;
            }
            aentry[i] = null;
        } while (true);
          goto _L1
        Exception exception;
        exception;
        throw exception;
_L1:
        count = 0;
        this;
        JVM INSTR monitorexit ;
    }

    public boolean contains(Object obj)
    {
        if (obj == null)
        {
            throw new NullPointerException();
        }
        Entry aentry[] = table;
        int i = aentry.length;
        do
        {
            int j = i - 1;
            if (i > 0)
            {
                for (Entry entry = aentry[j]; entry != null; entry = entry.next)
                {
                    if (entry.value.equals(obj))
                    {
                        return true;
                    }
                }

                i = j;
            } else
            {
                return false;
            }
        } while (true);
    }

    public boolean containsKey(int i)
    {
        Entry aentry[] = table;
        for (Entry entry = aentry[(0x7fffffff & i) % aentry.length]; entry != null; entry = entry.next)
        {
            if (entry.hash == i)
            {
                return true;
            }
        }

        return false;
    }

    public boolean containsValue(Object obj)
    {
        return contains(obj);
    }

    public Object get(int i)
    {
        Entry aentry[] = table;
        for (Entry entry = aentry[(0x7fffffff & i) % aentry.length]; entry != null; entry = entry.next)
        {
            if (entry.hash == i)
            {
                return entry.value;
            }
        }

        return null;
    }

    public boolean isEmpty()
    {
        return count == 0;
    }

    public Object put(int i, Object obj)
    {
        Entry aentry1[] = table;
        int j = (i & 0x7fffffff) % aentry1.length;
        for (Entry entry = aentry1[j]; entry != null; entry = entry.next)
        {
            if (entry.hash == i)
            {
                aentry1 = ((Entry []) (entry.value));
                entry.value = obj;
                return aentry1;
            }
        }

        Entry aentry[] = aentry1;
        if (count >= threshold)
        {
            rehash();
            aentry = table;
            j = (i & 0x7fffffff) % aentry.length;
        }
        aentry[j] = new Entry(i, i, obj, aentry[j]);
        count = count + 1;
        return null;
    }

    protected void rehash()
    {
        int i = table.length;
        Entry aentry[] = table;
        int k = i * 2 + 1;
        Entry aentry1[] = new Entry[k];
        threshold = (int)((float)k * loadFactor);
        table = aentry1;
        do
        {
            int j = i - 1;
            if (i > 0)
            {
                Entry entry1;
                for (Entry entry = aentry[j]; entry != null; entry = entry1)
                {
                    entry1 = entry.next;
                    i = (entry.hash & 0x7fffffff) % k;
                    entry.next = aentry1[i];
                    aentry1[i] = entry;
                }

                i = j;
            } else
            {
                return;
            }
        } while (true);
    }

    public Object remove(int i)
    {
        Entry aentry[] = table;
        int j = (0x7fffffff & i) % aentry.length;
        Entry entry = aentry[j];
        Object obj = null;
        for (; entry != null; entry = entry.next)
        {
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
            obj = entry;
        }

        return null;
    }

    public int size()
    {
        return count;
    }
}
