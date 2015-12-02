// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.engine;

import com.qihoo.security.services.d;
import java.util.List;

public class com.qihoo.security.engine.a
    implements Runnable
{
    public static interface a
    {

        public abstract void a(int i, int j, List list);

        public abstract void a(int i, List list);

        public abstract void a(int i, List list, String s);
    }


    public final int a;
    public final List b;
    final d c;
    final a d;
    private int e;
    private boolean f;
    private boolean g;

    public com.qihoo.security.engine.a(int i, d d1, List list, a a1)
    {
        f = false;
        g = false;
        a = i;
        c = d1;
        b = list;
        d = a1;
        e = 1;
    }

    public int a()
    {
        g = true;
        if (f)
        {
            com.qihoo.security.services.a a1 = c.a(a);
            if (a1 != null)
            {
                int i;
                try
                {
                    i = a1.f(a);
                }
                catch (Exception exception)
                {
                    return 0x8000ffff;
                }
                return i;
            }
        }
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (obj != null && (obj instanceof com.qihoo.security.engine.a))
        {
            obj = (com.qihoo.security.engine.a)obj;
            if (((com.qihoo.security.engine.a) (obj)).a == a)
            {
                return ((com.qihoo.security.engine.a) (obj)).b.equals(b);
            }
        }
        return false;
    }

    public void run()
    {
        if (!g) goto _L2; else goto _L1
_L1:
        com.qihoo.security.services.a a1;
        Object obj;
        if (g)
        {
            d.a(a, b);
            return;
        } else
        {
            d.a(a, e, b);
            return;
        }
_L2:
        a1 = c.a(a);
        if (a1 == null) goto _L1; else goto _L3
_L3:
        f = true;
        e = a1.a(a, b);
        f = false;
          goto _L1
        obj;
        e = 0x80004005;
        d.a(a, b, ((Exception) (obj)).toString());
        f = false;
          goto _L1
        obj;
        f = false;
        throw obj;
    }

    public String toString()
    {
        return String.valueOf(a);
    }
}
