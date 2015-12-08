// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package lombok;


public class Lombok
{

    public Lombok()
    {
    }

    public static Object preventNullAnalysis(Object obj)
    {
        return obj;
    }

    public static RuntimeException sneakyThrow(Throwable throwable)
    {
        if (throwable == null)
        {
            throw new NullPointerException("t");
        } else
        {
            sneakyThrow0(throwable);
            return null;
        }
    }

    private static void sneakyThrow0(Throwable throwable)
        throws Throwable
    {
        throw throwable;
    }
}
