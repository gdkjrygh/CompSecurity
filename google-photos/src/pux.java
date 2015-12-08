// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class pux
{

    private final k a;

    private pux(k k)
    {
        a = k;
    }

    public static Runnable a(pux pux1, Runnable runnable)
    {
        if (pux1 == null)
        {
            return runnable;
        } else
        {
            return puv.a(pux1.a, runnable);
        }
    }

    public static pux a()
    {
        return new pux(puy.a());
    }

    public final String toString()
    {
        if (a == null)
        {
            return "null ref";
        } else
        {
            return a.toString();
        }
    }
}
