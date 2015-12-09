// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.phonenumbers;

import java.util.LinkedHashMap;
import java.util.regex.Pattern;

public final class RegexCache
{
    static final class LRUCache
    {

        private LinkedHashMap map;
        private int size;

        public final Object get(Object obj)
        {
            this;
            JVM INSTR monitorenter ;
            obj = map.get(obj);
            this;
            JVM INSTR monitorexit ;
            return obj;
            obj;
            throw obj;
        }

        public final void put(Object obj, Object obj1)
        {
            this;
            JVM INSTR monitorenter ;
            map.put(obj, obj1);
            this;
            JVM INSTR monitorexit ;
            return;
            obj;
            throw obj;
        }


        public LRUCache(int i)
        {
            size = i;
            map = new _cls1((i << 2) / 3 + 1, 0.75F, true);
        }
    }


    private LRUCache cache;

    public RegexCache(int i)
    {
        cache = new LRUCache(i);
    }

    public final Pattern getPatternForRegex(String s)
    {
        Pattern pattern1 = (Pattern)cache.get(s);
        Pattern pattern = pattern1;
        if (pattern1 == null)
        {
            pattern = Pattern.compile(s);
            cache.put(s, pattern);
        }
        return pattern;
    }

    // Unreferenced inner class com/google/android/libraries/phonenumbers/RegexCache$LRUCache$1

/* anonymous class */
    final class LRUCache._cls1 extends LinkedHashMap
    {

        final LRUCache this$0;

        protected final boolean removeEldestEntry(java.util.Map.Entry entry)
        {
            return size() > size;
        }

            
            {
                this$0 = LRUCache.this;
                super(i, f, flag);
            }
    }

}
