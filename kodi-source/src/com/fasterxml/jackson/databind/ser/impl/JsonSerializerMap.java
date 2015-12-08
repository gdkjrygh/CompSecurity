// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.databind.JsonSerializer;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class JsonSerializerMap
{
    private static final class Bucket
    {

        public final com.fasterxml.jackson.databind.ser.SerializerCache.TypeKey key;
        public final Bucket next;
        public final JsonSerializer value;

        public Bucket(Bucket bucket, com.fasterxml.jackson.databind.ser.SerializerCache.TypeKey typekey, JsonSerializer jsonserializer)
        {
            next = bucket;
            key = typekey;
            value = jsonserializer;
        }
    }


    private final Bucket _buckets[];
    private final int _size;

    public JsonSerializerMap(Map map)
    {
        int i = findSize(map.size());
        _size = i;
        Bucket abucket[] = new Bucket[i];
        for (map = map.entrySet().iterator(); map.hasNext();)
        {
            java.util.Map.Entry entry = (java.util.Map.Entry)map.next();
            com.fasterxml.jackson.databind.ser.SerializerCache.TypeKey typekey = (com.fasterxml.jackson.databind.ser.SerializerCache.TypeKey)entry.getKey();
            int j = typekey.hashCode() & i - 1;
            abucket[j] = new Bucket(abucket[j], typekey, (JsonSerializer)entry.getValue());
        }

        _buckets = abucket;
    }

    private static final int findSize(int i)
    {
        int j;
        if (i <= 64)
        {
            i += i;
        } else
        {
            i += i >> 2;
        }
        for (j = 8; j < i; j += j) { }
        return j;
    }

    public JsonSerializer find(com.fasterxml.jackson.databind.ser.SerializerCache.TypeKey typekey)
    {
        Bucket bucket1;
        int i = typekey.hashCode();
        int j = _buckets.length;
        bucket1 = _buckets[i & j - 1];
        if (bucket1 != null) goto _L2; else goto _L1
_L1:
        return null;
_L2:
        Bucket bucket = bucket1;
        if (typekey.equals(bucket1.key))
        {
            return bucket1.value;
        }
        do
        {
            Bucket bucket2 = bucket.next;
            if (bucket2 == null)
            {
                continue; /* Loop/switch isn't completed */
            }
            bucket = bucket2;
            if (typekey.equals(bucket2.key))
            {
                return bucket2.value;
            }
        } while (true);
        if (true) goto _L1; else goto _L3
_L3:
    }
}
