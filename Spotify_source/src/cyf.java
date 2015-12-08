// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class cyf
{

    public final int a;
    final Object b;
    final Number c;
    final Number d;
    private final Object e;

    cyf(int i, Object obj, Number number, Number number1, Object obj1)
    {
        a = i;
        b = obj;
        c = number;
        d = number1;
        e = obj1;
    }

    public final String a()
    {
        String s = null;
        String s1 = (String)b;
        s = s1;
_L2:
        String s2;
        try
        {
            s2 = (String)e;
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

    public final Number b()
    {
        Object obj1 = Integer.valueOf(0);
        Object obj = obj1;
        if (b != null)
        {
            try
            {
                obj = (Number)b;
            }
            catch (ClassCastException classcastexception)
            {
                classcastexception = ((ClassCastException) (obj1));
            }
        }
        obj1 = obj;
        if (e != null)
        {
            try
            {
                obj1 = (Number)e;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1)
            {
                return ((Number) (obj));
            }
        }
        return ((Number) (obj1));
    }

    public final Boolean c()
    {
        Object obj1 = Boolean.valueOf(false);
        Object obj = obj1;
        if (b != null)
        {
            try
            {
                obj = (Boolean)b;
            }
            catch (ClassCastException classcastexception)
            {
                classcastexception = ((ClassCastException) (obj1));
            }
        }
        obj1 = obj;
        if (e != null)
        {
            try
            {
                obj1 = (Boolean)e;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1)
            {
                return ((Boolean) (obj));
            }
        }
        return ((Boolean) (obj1));
    }
}
