// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.df;

import android.text.TextUtils;
import android.util.Log;
import java.util.Locale;

public final class a
{

    private static boolean a = false;
    private static int b = 4;
    private static boolean c = false;
    private static long d;

    private static String a(String s)
    {
        String s1 = b();
        StringBuffer stringbuffer = new StringBuffer(123);
        stringbuffer.append("PANDORA");
        stringbuffer.append(" - ");
        stringbuffer.append(s1);
        stringbuffer.append("} : ");
        stringbuffer.append(s);
        return stringbuffer.toString();
    }

    private static transient String a(String s, Object aobj[])
    {
        if (TextUtils.isEmpty(s))
        {
            return "";
        } else
        {
            return String.format(Locale.US, s, aobj);
        }
    }

    public static void a(String s, String s1)
    {
        if (!a(3))
        {
            return;
        } else
        {
            Log.d(s, a(s1));
            return;
        }
    }

    public static void a(String s, String s1, Throwable throwable)
    {
        if (!a(3))
        {
            return;
        } else
        {
            Log.d(s, a(s1), throwable);
            return;
        }
    }

    public static transient void a(String s, String s1, Object aobj[])
    {
        if (!a(3))
        {
            return;
        } else
        {
            Log.d(s, a(a(s1, aobj)));
            return;
        }
    }

    public static void a(String s, Throwable throwable)
    {
        if (!a(5))
        {
            return;
        } else
        {
            Log.w(s, a(((String) (null))), throwable);
            return;
        }
    }

    public static transient void a(String s, Throwable throwable, String s1, Object aobj[])
    {
        if (!a(4))
        {
            return;
        } else
        {
            Log.i(s, a(a(s1, aobj)), throwable);
            return;
        }
    }

    public static void a(boolean flag)
    {
        a = flag;
    }

    public static final void a(boolean flag, int i)
        throws IllegalStateException
    {
        p/df/a;
        JVM INSTR monitorenter ;
        if (c)
        {
            throw new IllegalStateException("Illegal state, Logger has been configured previously.");
        }
        break MISSING_BLOCK_LABEL_25;
        Exception exception;
        exception;
        p/df/a;
        JVM INSTR monitorexit ;
        throw exception;
        a = flag;
        b = i;
        c = true;
        p/df/a;
        JVM INSTR monitorexit ;
    }

    public static boolean a()
    {
        return a;
    }

    private static boolean a(int i)
    {
        return a && i >= b;
    }

    private static String b()
    {
        String s = Long.toString(System.currentTimeMillis() - d);
        for (int i = 4 - s.length(); i > 0; i--)
        {
            s = (new StringBuilder()).append("0").append(s).toString();
        }

        return (new StringBuilder()).append(s.substring(0, s.length() - 3)).append(".").append(s.substring(s.length() - 3)).toString();
    }

    public static void b(String s, String s1)
    {
        if (!a(6))
        {
            return;
        } else
        {
            Log.e(s, a(s1));
            return;
        }
    }

    public static void b(String s, String s1, Throwable throwable)
    {
        if (!a(6))
        {
            return;
        } else
        {
            Log.e(s, a(s1), throwable);
            return;
        }
    }

    public static transient void b(String s, String s1, Object aobj[])
    {
        if (!a(6))
        {
            return;
        } else
        {
            Log.e(s, a(a(s1, aobj)));
            return;
        }
    }

    public static void b(String s, Throwable throwable)
    {
        if (!a(5))
        {
            return;
        } else
        {
            Log.wtf(s, a(((String) (null))), throwable);
            return;
        }
    }

    public static transient void b(String s, Throwable throwable, String s1, Object aobj[])
    {
        if (!a(5))
        {
            return;
        } else
        {
            Log.w(s, a(a(s1, aobj)), throwable);
            return;
        }
    }

    public static void c(String s, String s1)
    {
        if (!a(4))
        {
            return;
        } else
        {
            Log.i(s, a(s1));
            return;
        }
    }

    public static void c(String s, String s1, Throwable throwable)
    {
        if (!a(4))
        {
            return;
        } else
        {
            Log.i(s, a(s1), throwable);
            return;
        }
    }

    public static transient void c(String s, String s1, Object aobj[])
    {
        if (!a(4))
        {
            return;
        } else
        {
            Log.i(s, a(a(s1, aobj)));
            return;
        }
    }

    public static void d(String s, String s1)
    {
        if (!a(2))
        {
            return;
        } else
        {
            Log.v(s, a(s1));
            return;
        }
    }

    public static void d(String s, String s1, Throwable throwable)
    {
        if (!a(2))
        {
            return;
        } else
        {
            Log.v(s, a(s1), throwable);
            return;
        }
    }

    public static transient void d(String s, String s1, Object aobj[])
    {
        if (!a(5))
        {
            return;
        } else
        {
            Log.w(s, a(a(s1, aobj)));
            return;
        }
    }

    public static void e(String s, String s1)
    {
        if (!a(5))
        {
            return;
        } else
        {
            Log.w(s, a(s1));
            return;
        }
    }

    public static void e(String s, String s1, Throwable throwable)
    {
        if (!a(5))
        {
            return;
        } else
        {
            Log.w(s, a(s1), throwable);
            return;
        }
    }

    public static void f(String s, String s1, Throwable throwable)
    {
        if (!a(5))
        {
            return;
        } else
        {
            Log.wtf(s, a(s1), throwable);
            return;
        }
    }

    public Object clone()
        throws CloneNotSupportedException
    {
        throw new CloneNotSupportedException();
    }

}
