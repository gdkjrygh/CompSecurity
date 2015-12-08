// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import android.util.Log;

// Referenced classes of package bo.app:
//            ip

public final class kt
{

    private static volatile boolean a = false;

    private static transient void a(int i, Throwable throwable, String s, Object aobj[])
    {
        if (a)
        {
            return;
        }
        if (aobj.length > 0)
        {
            s = String.format(s, aobj);
        }
        if (throwable != null)
        {
            aobj = s;
            if (s == null)
            {
                aobj = throwable.getMessage();
            }
            s = String.format("%1$s\n%2$s", new Object[] {
                aobj, Log.getStackTraceString(throwable)
            });
        }
        Log.println(i, ip.a, s);
    }

    public static transient void a(String s, Object aobj[])
    {
        a(3, null, s, aobj);
    }

    public static void a(Throwable throwable)
    {
        a(6, throwable, null, new Object[0]);
    }

    public static transient void b(String s, Object aobj[])
    {
        a(4, null, s, aobj);
    }

    public static transient void c(String s, Object aobj[])
    {
        a(5, null, s, aobj);
    }

    public static transient void d(String s, Object aobj[])
    {
        a(6, null, s, aobj);
    }

}
