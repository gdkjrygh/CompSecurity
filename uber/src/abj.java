// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.SharedPreferences;

public abstract class abj
    implements abg
{

    private final String a;
    private final Object b;

    private abj(String s, Object obj)
    {
        a = s;
        b = obj;
        ot.l().a(this);
    }

    abj(String s, Object obj, byte byte0)
    {
        this(s, obj);
    }

    public static abj a(String s)
    {
        s = a(s, ((String) (null)));
        ot.l().a(s);
        return s;
    }

    public static abj a(String s, int i)
    {
        return new _cls2(s, Integer.valueOf(i));
    }

    public static abj a(String s, long l)
    {
        return new _cls3(s, Long.valueOf(l));
    }

    public static abj a(String s, Boolean boolean1)
    {
        return new _cls1(s, boolean1);
    }

    public static abj a(String s, String s1)
    {
        return new _cls4(s, s1);
    }

    public static abj b(String s)
    {
        s = a(s, ((String) (null)));
        ot.l().a(s);
        return s;
    }

    protected abstract Object a(SharedPreferences sharedpreferences);

    public final String a()
    {
        return a;
    }

    public final Object b()
    {
        return b;
    }

    public final Object c()
    {
        return ot.m().a(this);
    }

    public abstract ald d();

    /* member class not found */
    class _cls2 {}


    /* member class not found */
    class _cls3 {}


    /* member class not found */
    class _cls1 {}


    /* member class not found */
    class _cls4 {}

}
