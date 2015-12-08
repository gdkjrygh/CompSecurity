// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.mpmetrics;


// Referenced classes of package com.mixpanel.android.mpmetrics:
//            t

public static class <init>
{

    public final int a;
    private final Object b;
    private final Object c;
    private final Number d;
    private final Number e;

    public <init> a(Object obj)
    {
        return new <init>(a, c, d, e, obj);
    }

    public String a()
    {
        String s = null;
        String s1 = (String)c;
        s = s1;
_L2:
        String s2;
        try
        {
            s2 = (String)b;
        }
        catch (ClassCastException classcastexception)
        {
            return s;
        }
        return s2;
        ClassCastException classcastexception1;
        classcastexception1;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public Number b()
    {
        Object obj1 = Integer.valueOf(0);
        Object obj = obj1;
        if (c != null)
        {
            try
            {
                obj = (Number)c;
            }
            catch (ClassCastException classcastexception)
            {
                classcastexception = ((ClassCastException) (obj1));
            }
        }
        obj1 = obj;
        if (b != null)
        {
            try
            {
                obj1 = (Number)b;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1)
            {
                return ((Number) (obj));
            }
        }
        return ((Number) (obj1));
    }

    public Boolean c()
    {
        Object obj1 = Boolean.valueOf(false);
        Object obj = obj1;
        if (c != null)
        {
            try
            {
                obj = (Boolean)c;
            }
            catch (ClassCastException classcastexception)
            {
                classcastexception = ((ClassCastException) (obj1));
            }
        }
        obj1 = obj;
        if (b != null)
        {
            try
            {
                obj1 = (Boolean)b;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1)
            {
                return ((Boolean) (obj));
            }
        }
        return ((Boolean) (obj1));
    }

    private (int i, Object obj, Number number, Number number1, Object obj1)
    {
        a = i;
        c = obj;
        d = number;
        e = number1;
        b = obj1;
    }

    b(int i, Object obj, Number number, Number number1, Object obj1, b b1)
    {
        this(i, obj, number, number1, obj1);
    }
}
