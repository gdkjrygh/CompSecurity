// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.github.nkzawa.b;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentMap;

public class com.github.nkzawa.b.a
{
    public static interface a
    {

        public transient abstract void a(Object aobj[]);
    }

    private final class b
        implements a
    {

        public final String a;
        public final a b;
        final com.github.nkzawa.b.a c;

        public final transient void a(Object aobj[])
        {
            c.c(a, this);
            b.a(aobj);
        }

        public b(String s, a a2)
        {
            c = com.github.nkzawa.b.a.this;
            super();
            a = s;
            b = a2;
        }
    }


    public ConcurrentMap a;

    public com.github.nkzawa.b.a()
    {
        a = new ConcurrentHashMap();
    }

    public final com.github.nkzawa.b.a a()
    {
        a.clear();
        return this;
    }

    public final com.github.nkzawa.b.a a(String s, a a1)
    {
        ConcurrentLinkedQueue concurrentlinkedqueue = (ConcurrentLinkedQueue)a.get(s);
        Object obj = concurrentlinkedqueue;
        if (concurrentlinkedqueue == null)
        {
            obj = new ConcurrentLinkedQueue();
            s = (ConcurrentLinkedQueue)a.putIfAbsent(s, obj);
            if (s != null)
            {
                obj = s;
            }
        }
        ((ConcurrentLinkedQueue) (obj)).add(a1);
        return this;
    }

    public transient com.github.nkzawa.b.a a(String s, Object aobj[])
    {
        s = (ConcurrentLinkedQueue)a.get(s);
        if (s != null)
        {
            for (s = s.iterator(); s.hasNext(); ((a)s.next()).a(aobj)) { }
        }
        return this;
    }

    public final com.github.nkzawa.b.a b(String s, a a1)
    {
        a(s, new b(s, a1));
        return this;
    }

    public final com.github.nkzawa.b.a c(String s, a a1)
    {
label0:
        {
            s = (ConcurrentLinkedQueue)a.get(s);
            if (s == null)
            {
                break label0;
            }
            s = s.iterator();
            do
            {
                if (!s.hasNext())
                {
                    break label0;
                }
                a a2 = (a)s.next();
                boolean flag;
                if (a1.equals(a2))
                {
                    flag = true;
                } else
                if (a2 instanceof b)
                {
                    flag = a1.equals(((b)a2).b);
                } else
                {
                    flag = false;
                }
            } while (!flag);
            s.remove();
        }
        return this;
    }
}
