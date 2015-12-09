// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            hl, hn, hm, ho, 
//            hp

public abstract class hk
{

    private static final Object c = new Object();
    private static hp d = null;
    private static int e = 0;
    protected final String a;
    protected final Object b;
    private Object f;

    protected hk(String s, Object obj)
    {
        f = null;
        a = s;
        b = obj;
    }

    public static int a()
    {
        return e;
    }

    public static hk a(String s)
    {
        return new hl(s, Boolean.valueOf(false));
    }

    public static hk a(String s, Integer integer)
    {
        return new hn(s, integer);
    }

    public static hk a(String s, Long long1)
    {
        return new hm(s, long1);
    }

    public static hk a(String s, String s1)
    {
        return new ho(s, s1);
    }

    public static boolean b()
    {
        return d != null;
    }

    static hp e()
    {
        return d;
    }

    protected abstract Object c();

    public final Object d()
    {
        if (f != null)
        {
            return f;
        } else
        {
            return c();
        }
    }

}
