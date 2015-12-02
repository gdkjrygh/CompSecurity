// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.user.a;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;

// Referenced classes of package com.facebook.user.a:
//            d, c

public class a
{

    private static final String a;
    private static final String b;
    private static final String c;
    private static a d;
    private HashMap e;
    private d f;
    private String g;

    private a()
    {
        e = new HashMap();
        f = new d(this);
        a(((Locale) (null)));
    }

    private int a(int i)
    {
        int j = i;
        if (i == 2)
        {
            j = i;
            if (!b.equals(g))
            {
                j = i;
                if (!c.equals(g))
                {
                    j = 3;
                }
            }
        }
        return j;
    }

    public static a a()
    {
        com/facebook/user/a/a;
        JVM INSTR monitorenter ;
        a a1;
        if (d == null)
        {
            d = new a();
        }
        a1 = d;
        com/facebook/user/a/a;
        JVM INSTR monitorexit ;
        return a1;
        Exception exception;
        exception;
        throw exception;
    }

    private d a(Integer integer)
    {
        int i = integer.intValue();
        Integer integer1 = Integer.valueOf(a(i));
        integer = integer1;
        if (a.equals(g))
        {
            integer = integer1;
            if (i == 1)
            {
                integer = Integer.valueOf(3);
            }
        }
        return b(integer);
    }

    private d b(Integer integer)
    {
        this;
        JVM INSTR monitorenter ;
        d d1 = (d)e.get(integer);
        Object obj;
        obj = d1;
        if (d1 != null)
        {
            break MISSING_BLOCK_LABEL_50;
        }
        obj = d1;
        if (integer.intValue() == 3)
        {
            obj = new c(this, null);
            e.put(integer, obj);
        }
        integer = ((Integer) (obj));
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_61;
        }
        integer = f;
        this;
        JVM INSTR monitorexit ;
        return integer;
        integer;
        throw integer;
    }

    public Iterator a(String s, int i)
    {
        return a(Integer.valueOf(i)).a(s);
    }

    public void a(Locale locale)
    {
        if (locale == null)
        {
            g = Locale.getDefault().getLanguage().toLowerCase();
            return;
        } else
        {
            g = locale.getLanguage().toLowerCase();
            return;
        }
    }

    static 
    {
        a = Locale.CHINESE.getLanguage().toLowerCase();
        b = Locale.JAPANESE.getLanguage().toLowerCase();
        c = Locale.KOREAN.getLanguage().toLowerCase();
    }
}
