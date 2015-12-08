// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.common;


// Referenced classes of package com.mopub.common:
//            Preconditions

public final class 
{

    private static volatile boolean a = false;

    public static boolean checkArgument(boolean flag)
    {
        return Preconditions.a(flag, a, "Illegal argument", new Object[] {
            ""
        });
    }

    public static boolean checkArgument(boolean flag, String s)
    {
        return Preconditions.a(flag, a, s, new Object[] {
            ""
        });
    }

    public static transient boolean checkArgument(boolean flag, String s, Object aobj[])
    {
        return Preconditions.a(flag, a, s, aobj);
    }

    public static boolean checkNotNull(Object obj)
    {
        return Preconditions.a(obj, a, "Object can not be null.", new Object[] {
            ""
        });
    }

    public static boolean checkNotNull(Object obj, String s)
    {
        return Preconditions.a(obj, a, s, new Object[] {
            ""
        });
    }

    public static transient boolean checkNotNull(Object obj, String s, Object aobj[])
    {
        return Preconditions.a(obj, a, s, aobj);
    }

    public static boolean checkState(boolean flag)
    {
        return Preconditions.b(flag, a, "Illegal state.", new Object[] {
            ""
        });
    }

    public static boolean checkState(boolean flag, String s)
    {
        return Preconditions.b(flag, a, s, new Object[] {
            ""
        });
    }

    public static transient boolean checkState(boolean flag, String s, Object aobj[])
    {
        return Preconditions.b(flag, a, s, aobj);
    }

    public static boolean checkUiThread()
    {
        return Preconditions.a(a, "This method must be called from the UI thread.", new Object[] {
            ""
        });
    }

    public static boolean checkUiThread(String s)
    {
        return Preconditions.a(a, s, new Object[] {
            ""
        });
    }

    public static transient boolean checkUiThread(String s, Object aobj[])
    {
        return Preconditions.a(false, s, aobj);
    }

    public static void setStrictMode(boolean flag)
    {
        a = flag;
    }


    public ()
    {
    }
}
