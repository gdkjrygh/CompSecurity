// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.debug.log;

import android.util.Log;

// Referenced classes of package com.facebook.debug.log:
//            c, g, l

public class b
{

    private static c a;
    private static volatile int b = 2;

    public b()
    {
    }

    public static void a(int i)
    {
        b = i;
    }

    public static void a(int i, String s, String s1)
    {
label0:
        {
            if (b <= i)
            {
                if (a == null)
                {
                    break label0;
                }
                a.a(i, s, s1);
            }
            return;
        }
        Log.println(i, s, s1);
    }

    public static void a(c c1)
    {
        a = c1;
    }

    public static void a(l l, Class class1, String s)
    {
label0:
        {
            if (b <= 6)
            {
                if (a == null)
                {
                    break label0;
                }
                a.a(l, g.a(class1), s);
            }
            return;
        }
        Log.wtf(g.a(class1), s);
    }

    public static void a(l l, Class class1, String s, Throwable throwable)
    {
label0:
        {
            if (b <= 6)
            {
                if (a == null)
                {
                    break label0;
                }
                a.a(l, g.a(class1), s, throwable);
            }
            return;
        }
        Log.wtf(g.a(class1), s, throwable);
    }

    public static transient void a(l l, Class class1, String s, Object aobj[])
    {
label0:
        {
            if (b <= 6)
            {
                s = String.format(s, aobj);
                if (a == null)
                {
                    break label0;
                }
                a.a(l, g.a(class1), s);
            }
            return;
        }
        Log.wtf(g.a(class1), s);
    }

    public static void a(l l, Class class1, Throwable throwable)
    {
label0:
        {
            if (b <= 6)
            {
                if (a == null)
                {
                    break label0;
                }
                a.a(l, g.a(class1), throwable);
            }
            return;
        }
        Log.wtf(g.a(class1), throwable);
    }

    public static void a(Class class1, String s)
    {
label0:
        {
            if (b <= 2)
            {
                if (a == null)
                {
                    break label0;
                }
                a.a(g.a(class1), s);
            }
            return;
        }
        Log.v(g.a(class1), s);
    }

    public static void a(Class class1, String s, Throwable throwable)
    {
label0:
        {
            if (b <= 2)
            {
                if (a == null)
                {
                    break label0;
                }
                a.a(g.a(class1), s, throwable);
            }
            return;
        }
        Log.v(g.a(class1), s, throwable);
    }

    public static transient void a(Class class1, String s, Object aobj[])
    {
label0:
        {
            if (b <= 2)
            {
                s = String.format(s, aobj);
                if (a == null)
                {
                    break label0;
                }
                a.a(g.a(class1), s);
            }
            return;
        }
        Log.v(g.a(class1), s);
    }

    public static void a(Class class1, Throwable throwable)
    {
label0:
        {
            if (b <= 5)
            {
                if (a == null)
                {
                    break label0;
                }
                a.a(g.a(class1), throwable);
            }
            return;
        }
        Log.w(g.a(class1), throwable);
    }

    public static void a(String s, String s1)
    {
label0:
        {
            if (b <= 2)
            {
                if (a == null)
                {
                    break label0;
                }
                a.a(s, s1);
            }
            return;
        }
        Log.v(s, s1);
    }

    public static void a(String s, String s1, Throwable throwable)
    {
label0:
        {
            if (b <= 3)
            {
                if (a == null)
                {
                    break label0;
                }
                a.b(s, s1, throwable);
            }
            return;
        }
        Log.d(s, s1, throwable);
    }

    public static transient void a(String s, String s1, Object aobj[])
    {
label0:
        {
            if (b <= 2)
            {
                s1 = String.format(s1, aobj);
                if (a == null)
                {
                    break label0;
                }
                a.a(s, s1);
            }
            return;
        }
        Log.v(s, s1);
    }

    public static void a(String s, Throwable throwable)
    {
label0:
        {
            if (b <= 5)
            {
                if (a == null)
                {
                    break label0;
                }
                a.a(s, throwable);
            }
            return;
        }
        Log.w(s, throwable);
    }

    public static boolean a(String s, int i)
    {
        return i >= b && Log.isLoggable(s, i);
    }

    public static void b(int i, String s, String s1)
    {
label0:
        {
            if (b <= i)
            {
                if (a == null)
                {
                    break label0;
                }
                a.a(i, s, s1);
            }
            return;
        }
        Log.println(i, s, s1);
    }

    public static void b(Class class1, String s)
    {
label0:
        {
            if (b <= 3)
            {
                if (a == null)
                {
                    break label0;
                }
                a.b(g.a(class1), s);
            }
            return;
        }
        Log.d(g.a(class1), s);
    }

    public static void b(Class class1, String s, Throwable throwable)
    {
label0:
        {
            if (b <= 3)
            {
                if (a == null)
                {
                    break label0;
                }
                a.b(g.a(class1), s, throwable);
            }
            return;
        }
        Log.d(g.a(class1), s, throwable);
    }

    public static transient void b(Class class1, String s, Object aobj[])
    {
label0:
        {
            if (b <= 3)
            {
                s = String.format(s, aobj);
                if (a == null)
                {
                    break label0;
                }
                a.b(g.a(class1), s);
            }
            return;
        }
        Log.d(g.a(class1), s);
    }

    public static void b(String s, String s1)
    {
label0:
        {
            if (b <= 3)
            {
                if (a == null)
                {
                    break label0;
                }
                a.b(s, s1);
            }
            return;
        }
        Log.d(s, s1);
    }

    public static void b(String s, String s1, Throwable throwable)
    {
label0:
        {
            if (b <= 4)
            {
                if (a == null)
                {
                    break label0;
                }
                a.c(s, s1, throwable);
            }
            return;
        }
        Log.i(s, s1, throwable);
    }

    public static transient void b(String s, String s1, Object aobj[])
    {
label0:
        {
            if (b <= 5)
            {
                s1 = String.format(s1, aobj);
                if (a == null)
                {
                    break label0;
                }
                a.d(s, s1);
            }
            return;
        }
        Log.w(s, s1);
    }

    public static boolean b(int i)
    {
        return i >= b;
    }

    public static void c(Class class1, String s)
    {
label0:
        {
            if (b <= 4)
            {
                if (a == null)
                {
                    break label0;
                }
                a.c(g.a(class1), s);
            }
            return;
        }
        Log.i(g.a(class1), s);
    }

    public static void c(Class class1, String s, Throwable throwable)
    {
label0:
        {
            if (b <= 4)
            {
                if (a == null)
                {
                    break label0;
                }
                a.c(g.a(class1), s, throwable);
            }
            return;
        }
        Log.i(g.a(class1), s, throwable);
    }

    public static transient void c(Class class1, String s, Object aobj[])
    {
label0:
        {
            if (b <= 4)
            {
                s = String.format(s, aobj);
                if (a == null)
                {
                    break label0;
                }
                a.c(g.a(class1), s);
            }
            return;
        }
        Log.i(g.a(class1), s);
    }

    public static void c(String s, String s1)
    {
label0:
        {
            if (b <= 4)
            {
                if (a == null)
                {
                    break label0;
                }
                a.c(s, s1);
            }
            return;
        }
        Log.i(s, s1);
    }

    public static void c(String s, String s1, Throwable throwable)
    {
label0:
        {
            if (b <= 5)
            {
                if (a == null)
                {
                    break label0;
                }
                a.d(s, s1, throwable);
            }
            return;
        }
        Log.w(s, s1, throwable);
    }

    public static transient void c(String s, String s1, Object aobj[])
    {
label0:
        {
            if (b <= 6)
            {
                s1 = String.format(s1, aobj);
                if (a == null)
                {
                    break label0;
                }
                a.e(s, s1);
            }
            return;
        }
        Log.e(s, s1);
    }

    public static void d(Class class1, String s)
    {
label0:
        {
            if (b <= 5)
            {
                if (a == null)
                {
                    break label0;
                }
                a.d(g.a(class1), s);
            }
            return;
        }
        Log.w(g.a(class1), s);
    }

    public static void d(Class class1, String s, Throwable throwable)
    {
label0:
        {
            if (b <= 5)
            {
                if (a == null)
                {
                    break label0;
                }
                a.d(g.a(class1), s, throwable);
            }
            return;
        }
        Log.w(g.a(class1), s, throwable);
    }

    public static transient void d(Class class1, String s, Object aobj[])
    {
label0:
        {
            if (b <= 5)
            {
                s = String.format(s, aobj);
                if (a == null)
                {
                    break label0;
                }
                a.d(g.a(class1), s);
            }
            return;
        }
        Log.w(g.a(class1), s);
    }

    public static void d(String s, String s1)
    {
label0:
        {
            if (b <= 5)
            {
                if (a == null)
                {
                    break label0;
                }
                a.d(s, s1);
            }
            return;
        }
        Log.w(s, s1);
    }

    public static void d(String s, String s1, Throwable throwable)
    {
label0:
        {
            if (b <= 6)
            {
                if (a == null)
                {
                    break label0;
                }
                a.e(s, s1, throwable);
            }
            return;
        }
        Log.e(s, s1, throwable);
    }

    public static void e(Class class1, String s)
    {
label0:
        {
            if (b <= 6)
            {
                if (a == null)
                {
                    break label0;
                }
                a.e(g.a(class1), s);
            }
            return;
        }
        Log.e(g.a(class1), s);
    }

    public static void e(Class class1, String s, Throwable throwable)
    {
label0:
        {
            if (b <= 6)
            {
                if (a == null)
                {
                    break label0;
                }
                a.e(g.a(class1), s, throwable);
            }
            return;
        }
        Log.e(g.a(class1), s, throwable);
    }

    public static transient void e(Class class1, String s, Object aobj[])
    {
label0:
        {
            if (b <= 6)
            {
                s = String.format(s, aobj);
                if (a == null)
                {
                    break label0;
                }
                a.e(g.a(class1), s);
            }
            return;
        }
        Log.e(g.a(class1), s);
    }

    public static void e(String s, String s1)
    {
label0:
        {
            if (b <= 6)
            {
                if (a == null)
                {
                    break label0;
                }
                a.e(s, s1);
            }
            return;
        }
        Log.e(s, s1);
    }

}
