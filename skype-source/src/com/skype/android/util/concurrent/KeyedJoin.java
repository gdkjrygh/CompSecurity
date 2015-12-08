// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.util.concurrent;

import android.util.Pair;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public abstract class KeyedJoin
{
    public static interface ExpirationCheck
    {

        public abstract boolean a();
    }


    private final ConcurrentMap map;

    public KeyedJoin()
    {
        this(((ConcurrentMap) (new ConcurrentHashMap(16, 0.75F, 1))));
    }

    public KeyedJoin(ConcurrentMap concurrentmap)
    {
        map = concurrentmap;
    }

    private void join(Object obj, Pair pair, Object obj1, Object obj2)
    {
        if (map.remove(obj, pair))
        {
            onJoin(obj, obj1, obj2);
        }
    }

    public void clear()
    {
        map.clear();
    }

    protected abstract void onJoin(Object obj, Object obj1, Object obj2);

    public void putFirst(Object obj, Object obj1)
    {
        Pair pair = new Pair(obj1, null);
        pair = (Pair)map.putIfAbsent(obj, pair);
        if (pair != null && pair.second != null)
        {
            join(obj, pair, obj1, pair.second);
        }
    }

    public void putSecond(Object obj, Object obj1)
    {
        Pair pair = new Pair(null, obj1);
        pair = (Pair)map.putIfAbsent(obj, pair);
        if (pair != null && pair.first != null)
        {
            join(obj, pair, pair.first, obj1);
        }
    }

    public void removeExpired(ExpirationCheck expirationcheck)
    {
        Iterator iterator = map.entrySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Object obj = (java.util.Map.Entry)iterator.next();
            ((java.util.Map.Entry) (obj)).getKey();
            Object obj1 = ((Pair)((java.util.Map.Entry) (obj)).getValue()).first;
            obj = ((Pair)((java.util.Map.Entry) (obj)).getValue()).second;
            if (expirationcheck.a())
            {
                iterator.remove();
            }
        } while (true);
    }
}
