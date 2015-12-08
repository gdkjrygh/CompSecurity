// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.advertising.android;

import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import java.util.Set;
import java.util.TreeSet;

// Referenced classes of package com.microsoft.advertising.android:
//            av, d, l, p

final class af
{

    private static final Set a = new TreeSet() {

            
            {
                add("e6a9bbf12d4fb4c25de4f678531dcffa");
                add("2b87efdedf64b7c0708abcaa53e43e67");
                add("ccdc2b07927ead196877a55547faf6a3");
                add("386c1d58f174725194bbcbf0972dd3ba");
                add("8ba403ad42e6c81ac832f3d3509b01d1");
            }
    };

    public static Activity a(Context context)
    {
        boolean flag;
        if (context != null && android/app/Activity.isAssignableFrom(context.getClass()))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (a(flag, "context should be an activity"))
        {
            return (Activity)context;
        } else
        {
            return null;
        }
    }

    private static RuntimeException a(String s)
    {
        RuntimeException runtimeexception = new RuntimeException(s);
        av.a("DebugManager", (new StringBuilder("Debug Manager failing on: ")).append(s).toString(), runtimeexception);
        return runtimeexception;
    }

    public static void a(d d1)
    {
        boolean flag = true;
        if (a())
        {
            if (d1 == null || d1.c().a(1) <= -1L)
            {
                flag = false;
            }
            a(flag, "condition failed");
        }
    }

    public static void a(Exception exception)
    {
        if (a())
        {
            av.a("DebugManager", (new StringBuilder("Debug Manager failing on: ")).append(exception.getMessage()).toString(), exception);
            if (exception instanceof RuntimeException)
            {
                exception = (RuntimeException)exception;
            } else
            {
                exception = new RuntimeException(exception);
            }
            throw exception;
        } else
        {
            return;
        }
    }

    public static boolean a()
    {
        return p.a().c() && a.contains(p.a().f());
    }

    public static boolean a(boolean flag)
    {
        return a(flag, "condition failed");
    }

    public static boolean a(boolean flag, String s)
    {
        if (a() && !flag)
        {
            throw a(s);
        } else
        {
            return flag;
        }
    }

    public static transient boolean a(Object aobj[])
    {
        int i;
        int j;
        boolean flag;
        flag = true;
        j = aobj.length;
        i = 0;
_L2:
        if (i >= j)
        {
            return flag;
        }
        Object obj = aobj[i];
        if (!flag)
        {
            break; /* Loop/switch isn't completed */
        }
        if (obj != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!a(flag, "parameter cannot be null"))
        {
            break; /* Loop/switch isn't completed */
        }
        flag = true;
_L3:
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        flag = false;
          goto _L3
        if (true) goto _L2; else goto _L4
_L4:
    }

    public static boolean b()
    {
        boolean flag;
        if (Looper.myLooper() == Looper.getMainLooper())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return a(flag, "we should be on the UI thread but we are not");
    }

    public static boolean b(boolean flag)
    {
        if (flag && a())
        {
            throw a("condition failed");
        } else
        {
            return flag;
        }
    }

    public static boolean b(boolean flag, String s)
    {
        return a(flag, s);
    }

}
