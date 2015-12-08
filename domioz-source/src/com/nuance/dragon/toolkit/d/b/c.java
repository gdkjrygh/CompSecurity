// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.dragon.toolkit.d.b;

import com.nuance.dragon.toolkit.d.e;

// Referenced classes of package com.nuance.dragon.toolkit.d.b:
//            d

public final class c
{

    public c()
    {
    }

    public static Object a(String s, Object obj)
    {
        if (obj == null)
        {
            a((new StringBuilder()).append(s).append(" must not be null").toString());
        }
        return obj;
    }

    public static String a(String s, String s1)
    {
        if (s1 == null || s1.length() == 0)
        {
            a((new StringBuilder()).append(s).append(" must not be null or empty").toString());
        }
        return s1;
    }

    public static void a(Object obj, boolean flag)
    {
        a(obj, flag, ((String) (null)));
    }

    public static void a(Object obj, boolean flag, String s)
    {
        if (!flag)
        {
            if (obj instanceof String)
            {
                obj = (String)obj;
            } else
            if (obj != null)
            {
                obj = d.a(obj.getClass());
            } else
            {
                obj = null;
            }
            if (obj == null)
            {
                if (s == null)
                {
                    obj = new IllegalStateException();
                } else
                {
                    obj = new IllegalStateException(s);
                }
            } else
            if (s == null)
            {
                obj = new IllegalStateException((new StringBuilder()).append(((String) (obj))).append(" is in an invalid state").toString());
            } else
            {
                obj = new IllegalStateException((new StringBuilder()).append(((String) (obj))).append(" is in an invalid state: ").append(s).toString());
            }
            e.a(com/nuance/dragon/toolkit/d/b/c, "State check failed", ((Throwable) (obj)));
            throw obj;
        } else
        {
            return;
        }
    }

    private static void a(String s)
    {
        IllegalArgumentException illegalargumentexception = new IllegalArgumentException(s);
        e.d(com/nuance/dragon/toolkit/d/b/c, s);
        throw illegalargumentexception;
    }

    public static void a(String s, String s1, boolean flag)
    {
        if (!flag)
        {
            throw new IllegalArgumentException((new StringBuilder()).append(s).append(" must be ").append(s1).toString());
        } else
        {
            return;
        }
    }
}
