// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.debug.log;

import android.util.Log;
import com.facebook.common.e.h;
import com.facebook.common.e.m;
import com.facebook.common.e.n;
import com.facebook.common.p.a;
import com.facebook.common.time.c;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.facebook.debug.log:
//            c, l, k, e

public class d
    implements com.facebook.debug.log.c
{

    private static final a a = new a(com.facebook.common.time.c.b(), 5, 0x36ee80L);
    private final String b;
    private final Set c;
    private final h d;
    private final com.facebook.common.process.c e;

    public d(String s, Set set, h h1, com.facebook.common.process.d d1)
    {
        b = s;
        c = set;
        d = h1;
        e = d1.b();
    }

    private String a(String s)
    {
label0:
        {
            String s1 = s;
            if (b != null)
            {
                if (e == null)
                {
                    break label0;
                }
                s1 = (new StringBuilder()).append(b).append("(:").append(e.e()).append("):").append(s).toString();
            }
            return s1;
        }
        return (new StringBuilder()).append(b).append(":").append(s).toString();
    }

    private void a(l l1, String s, String s1, k k1)
    {
        if (l1.a() && a.a())
        {
            d.a(m.a(s, s1).a(k1).a(1).g());
        }
    }

    private int f(String s, String s1, Throwable throwable)
    {
        return a(7, s, com.facebook.common.w.c.a(new k(s1, throwable)));
    }

    public int a(int i, String s, String s1)
    {
        s = a(s);
        int j = Log.println(i, s, s1);
        for (Iterator iterator = c.iterator(); iterator.hasNext();)
        {
            e e1 = (e)iterator.next();
            try
            {
                e1.a(i, s, s1);
            }
            catch (Throwable throwable) { }
        }

        return j;
    }

    public int a(l l1, String s, String s1)
    {
        a(l1, s, s1, new k((new StringBuilder()).append(s).append(": ").append(s1).toString()));
        return f(s, s1, null);
    }

    public int a(l l1, String s, String s1, Throwable throwable)
    {
        a(l1, s, s1, new k((new StringBuilder()).append(s).append(": ").append(s1).toString(), throwable));
        return f(s, s1, throwable);
    }

    public int a(l l1, String s, Throwable throwable)
    {
        a(l1, s, throwable.getMessage(), new k(s, throwable));
        return f(s, throwable.getMessage(), throwable);
    }

    public int a(String s, String s1)
    {
        return a(2, s, s1);
    }

    public int a(String s, String s1, Throwable throwable)
    {
        return a(2, s, (new StringBuilder()).append(s1).append('\n').append(com.facebook.common.w.c.a(throwable)).toString());
    }

    public int a(String s, Throwable throwable)
    {
        return a(5, s, com.facebook.common.w.c.a(throwable));
    }

    public int b(String s, String s1)
    {
        return a(3, s, s1);
    }

    public int b(String s, String s1, Throwable throwable)
    {
        return a(3, s, (new StringBuilder()).append(s1).append('\n').append(com.facebook.common.w.c.a(throwable)).toString());
    }

    public int c(String s, String s1)
    {
        return a(4, s, s1);
    }

    public int c(String s, String s1, Throwable throwable)
    {
        return a(4, s, (new StringBuilder()).append(s1).append('\n').append(com.facebook.common.w.c.a(throwable)).toString());
    }

    public int d(String s, String s1)
    {
        return a(5, s, s1);
    }

    public int d(String s, String s1, Throwable throwable)
    {
        return a(5, s, (new StringBuilder()).append(s1).append('\n').append(com.facebook.common.w.c.a(throwable)).toString());
    }

    public int e(String s, String s1)
    {
        return a(6, s, s1);
    }

    public int e(String s, String s1, Throwable throwable)
    {
        return a(6, s, (new StringBuilder()).append(s1).append('\n').append(com.facebook.common.w.c.a(throwable)).toString());
    }

}
