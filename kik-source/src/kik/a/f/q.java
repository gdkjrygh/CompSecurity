// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.f;


public final class q extends Exception
{

    private int a;
    private Object b;

    public q(int i, Object obj)
    {
        a = i;
        b = obj;
    }

    public static int a(Throwable throwable)
    {
        if (throwable instanceof q)
        {
            return ((q)throwable).a;
        } else
        {
            return -1;
        }
    }

    public static String b(Throwable throwable)
    {
        if (throwable instanceof q)
        {
            throwable = ((Throwable) (((q)throwable).b));
            if (throwable != null && (throwable instanceof String))
            {
                return (String)throwable;
            }
        }
        return "";
    }

    public final int a()
    {
        return a;
    }

    public final Object b()
    {
        return b;
    }
}
