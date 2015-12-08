// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.orm.dsl;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Collection
{
    public static class Entry
    {

        Object key;
        Object value;

        public Entry(Object obj, Object obj1)
        {
            key = obj;
            value = obj1;
        }
    }


    public Collection()
    {
    }

    public static Entry entry(Object obj, Object obj1)
    {
        return new Entry(obj, obj1);
    }

    public static transient List list(Object aobj[])
    {
        return Arrays.asList(aobj);
    }

    public static transient Map map(Entry aentry[])
    {
        HashMap hashmap = new HashMap(aentry.length);
        int j = aentry.length;
        for (int i = 0; i < j; i++)
        {
            Entry entry1 = aentry[i];
            if (entry1.value != null)
            {
                hashmap.put(entry1.key, entry1.value);
            }
        }

        return hashmap;
    }

    public static transient Set set(Object aobj[])
    {
        HashSet hashset = new HashSet(aobj.length);
        hashset.addAll(Arrays.asList(aobj));
        return hashset;
    }
}
