// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.unveil.env;

import android.util.Log;
import java.util.HashSet;
import java.util.Set;

// Referenced classes of package com.google.android.apps.unveil.env:
//            w, y

public final class af
{

    private static final Set a;
    private static w b = new w();
    private static long c = 0L;
    private final String d;
    private final String e;

    public af()
    {
        this("goggles", null);
    }

    public af(String s, String s1)
    {
        d = s;
        s = s1;
        if (s1 == null)
        {
            s = b();
        }
        s1 = s;
        if (s.length() > 0)
        {
            s1 = String.valueOf(s).concat(": ");
        }
        e = s1;
    }

    public static boolean a()
    {
        return false;
    }

    private static String b()
    {
        StackTraceElement astacktraceelement[] = Thread.currentThread().getStackTrace();
        int j = astacktraceelement.length;
        for (int i = 0; i < j; i++)
        {
            String s = astacktraceelement[i].getClassName();
            if (!a.contains(s))
            {
                String as[] = s.split("\\.");
                return as[as.length - 1];
            }
        }

        return com/google/android/apps/unveil/env/af.getSimpleName();
    }

    private transient String g(String s, Object aobj[])
    {
        String s2 = String.valueOf(e);
        String s1 = s;
        if (aobj.length > 0)
        {
            s1 = String.format(s, aobj);
        }
        s = String.valueOf(s1);
        if (s.length() != 0)
        {
            return s2.concat(s);
        } else
        {
            return new String(s2);
        }
    }

    public final transient void a(String s, Object aobj[])
    {
        if (Log.isLoggable(d, 3))
        {
            g(s, aobj);
        }
    }

    public final transient void b(String s, Object aobj[])
    {
        if (Log.isLoggable(d, 4))
        {
            g(s, aobj);
        }
    }

    public final transient void c(String s, Object aobj[])
    {
        if (Log.isLoggable(d, 5))
        {
            g(s, aobj);
        }
    }

    public final transient void d(String s, Object aobj[])
    {
        if (Log.isLoggable(d, 5))
        {
            g(s, aobj);
        }
    }

    public final transient void e(String s, Object aobj[])
    {
        if (Log.isLoggable(d, 6))
        {
            g(s, aobj);
            y.a();
        }
    }

    public final transient void f(String s, Object aobj[])
    {
        if (Log.isLoggable(d, 6))
        {
            g(s, aobj);
            y.a();
        }
    }

    static 
    {
        HashSet hashset = new HashSet(3);
        a = hashset;
        hashset.add("dalvik.system.VMStack");
        a.add("java.lang.Thread");
        a.add(com/google/android/apps/unveil/env/af.getCanonicalName());
    }
}
