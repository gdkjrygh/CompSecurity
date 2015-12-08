// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.internal.util;


// Referenced classes of package com.google.inject.internal.util:
//            $CustomConcurrentHashMap

static class ntry
    implements ntry
{

    public ntry copyEntry(Object obj, ntry ntry, ntry ntry1)
    {
        return new ntry(obj, ntry.hash, ntry.value, ntry1);
    }

    public volatile Object copyEntry(Object obj, Object obj1, Object obj2)
    {
        return copyEntry(obj, (ntry)obj1, (ntry)obj2);
    }

    public boolean equalKeys(Object obj, Object obj1)
    {
        return obj.equals(obj1);
    }

    public boolean equalValues(Object obj, Object obj1)
    {
        return obj.equals(obj1);
    }

    public int getHash(ntry ntry)
    {
        return ntry.hash;
    }

    public volatile int getHash(Object obj)
    {
        return getHash((ntry)obj);
    }

    public Object getKey(ntry ntry)
    {
        return ntry.key;
    }

    public volatile Object getKey(Object obj)
    {
        return getKey((ntry)obj);
    }

    public ntry getNext(ntry ntry)
    {
        return ntry.next;
    }

    public volatile Object getNext(Object obj)
    {
        return getNext((ntry)obj);
    }

    public Object getValue(ntry ntry)
    {
        return ntry.value;
    }

    public volatile Object getValue(Object obj)
    {
        return getValue((ntry)obj);
    }

    public int hashKey(Object obj)
    {
        return obj.hashCode();
    }

    public ntry newEntry(Object obj, int i, ntry ntry)
    {
        return new ntry(obj, i, null, ntry);
    }

    public volatile Object newEntry(Object obj, int i, Object obj1)
    {
        return newEntry(obj, i, (ntry)obj1);
    }

    public void setInternals(ntry ntry)
    {
    }

    public void setValue(ntry ntry, Object obj)
    {
        ntry.value = obj;
    }

    public volatile void setValue(Object obj, Object obj1)
    {
        setValue((ntry)obj, obj1);
    }

    ntry()
    {
    }
}
