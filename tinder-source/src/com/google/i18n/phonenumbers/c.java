// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.i18n.phonenumbers;

import java.util.LinkedHashMap;
import java.util.regex.Pattern;

public final class c
{
    private static final class a
    {

        int a;
        private LinkedHashMap b;

        public final Object a(Object obj)
        {
            this;
            JVM INSTR monitorenter ;
            obj = b.get(obj);
            this;
            JVM INSTR monitorexit ;
            return obj;
            obj;
            throw obj;
        }

        public final void a(Object obj, Object obj1)
        {
            this;
            JVM INSTR monitorenter ;
            b.put(obj, obj1);
            this;
            JVM INSTR monitorexit ;
            return;
            obj;
            throw obj;
        }

        public a(int i)
        {
            a = i;
            b = new RegexCache.LRUCache._cls1(this, (i * 4) / 3 + 1);
        }
    }


    private a a;

    public c(int i)
    {
        a = new a(i);
    }

    public final Pattern a(String s)
    {
        Pattern pattern1 = (Pattern)a.a(s);
        Pattern pattern = pattern1;
        if (pattern1 == null)
        {
            pattern = Pattern.compile(s);
            a.a(s, pattern);
        }
        return pattern;
    }

    // Unreferenced inner class com/google/i18n/phonenumbers/RegexCache$LRUCache$1

/* anonymous class */
    class RegexCache.LRUCache._cls1 extends LinkedHashMap
    {

        final a a;

        protected boolean removeEldestEntry(java.util.Map.Entry entry)
        {
            return size() > a.a;
        }

            
            {
                a = a1;
                super(i, 0.75F, true);
            }
    }

}
