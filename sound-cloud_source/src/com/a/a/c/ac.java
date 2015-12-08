// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a.c;

import android.content.Context;
import b.a.a.a.a.b.h;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.a.a.c:
//            b, f

final class ac
{

    private static final b f = com.a.a.c.b.a("0");
    android.app.ActivityManager.RunningAppProcessInfo a;
    Thread b[];
    List c;
    StackTraceElement d[];
    final Context e;
    private final b g;
    private final b h;
    private final int i = 8;

    public ac(Context context, String s, String s1)
    {
        e = context;
        g = com.a.a.c.b.a(s1);
        if (s == null)
        {
            context = null;
        } else
        {
            context = com.a.a.c.b.a(s.replace("-", ""));
        }
        h = context;
    }

    static int a(int j, int k, long l, long l1)
    {
        return com.a.a.c.f.a() + 0 + com.a.a.c.f.c(j) + com.a.a.c.f.b(3) + com.a.a.c.f.c(4, k) + com.a.a.c.f.b(5, l) + com.a.a.c.f.b(6, l1);
    }

    private static int a(b.a.a.a.a.b.t.a a1, String s)
    {
        return com.a.a.c.f.d(1, a1.h) + com.a.a.c.f.b(2, com.a.a.c.b.a(s));
    }

    static int a(b b1)
    {
        return com.a.a.c.f.b(1, b1);
    }

    static int a(b b1, b b2)
    {
        return com.a.a.c.f.d(1, 3) + 0 + com.a.a.c.f.b(2, b1) + com.a.a.c.f.b(3, b2) + com.a.a.c.f.b(4);
    }

    private static int a(StackTraceElement stacktraceelement, boolean flag)
    {
        int j;
        int k;
        if (stacktraceelement.isNativeMethod())
        {
            j = com.a.a.c.f.b(1, Math.max(stacktraceelement.getLineNumber(), 0)) + 0;
        } else
        {
            j = com.a.a.c.f.b(1, 0L) + 0;
        }
        k = j + com.a.a.c.f.b(2, com.a.a.c.b.a((new StringBuilder()).append(stacktraceelement.getClassName()).append(".").append(stacktraceelement.getMethodName()).toString()));
        j = k;
        if (stacktraceelement.getFileName() != null)
        {
            j = k + com.a.a.c.f.b(3, com.a.a.c.b.a(stacktraceelement.getFileName()));
        }
        if (!stacktraceelement.isNativeMethod() && stacktraceelement.getLineNumber() > 0)
        {
            j += com.a.a.c.f.b(4, stacktraceelement.getLineNumber());
        }
        if (flag)
        {
            k = 2;
        } else
        {
            k = 0;
        }
        return com.a.a.c.f.c(5, k) + j;
    }

    private static int a(String s, String s1)
    {
        int j = com.a.a.c.f.b(1, com.a.a.c.b.a(s));
        s = s1;
        if (s1 == null)
        {
            s = "";
        }
        return j + com.a.a.c.f.b(2, com.a.a.c.b.a(s));
    }

    private int a(Thread thread, Throwable throwable)
    {
        int j = a(thread, d, 4, true);
        int i1 = com.a.a.c.f.d(1);
        int j1 = com.a.a.c.f.f(j);
        int l = b.length;
        int k = 0;
        j = j + (i1 + j1) + 0;
        for (; k < l; k++)
        {
            i1 = a(b[k], (StackTraceElement[])c.get(k), 0, false);
            j += i1 + (com.a.a.c.f.d(1) + com.a.a.c.f.f(i1));
        }

        k = a(throwable, 1);
        l = com.a.a.c.f.d(2);
        i1 = com.a.a.c.f.f(k);
        j1 = c();
        int k1 = com.a.a.c.f.d(3);
        int l1 = com.a.a.c.f.f(j1);
        int i2 = b();
        return k + (l + i1) + j + (j1 + (k1 + l1)) + (i2 + (com.a.a.c.f.d(3) + com.a.a.c.f.f(i2)));
    }

    private static int a(Thread thread, StackTraceElement astacktraceelement[], int j, boolean flag)
    {
        int k = com.a.a.c.f.b(1, com.a.a.c.b.a(thread.getName()));
        k = com.a.a.c.f.c(2, j) + k;
        int l = astacktraceelement.length;
        for (j = 0; j < l; j++)
        {
            int i1 = a(astacktraceelement[j], flag);
            k += i1 + (com.a.a.c.f.d(3) + com.a.a.c.f.f(i1));
        }

        return k;
    }

    private int a(Throwable throwable, int j)
    {
        int k;
        int l;
label0:
        {
            boolean flag = false;
            l = com.a.a.c.f.b(1, com.a.a.c.b.a(throwable.getClass().getName())) + 0;
            Object obj = throwable.getLocalizedMessage();
            k = l;
            if (obj != null)
            {
                k = l + com.a.a.c.f.b(3, com.a.a.c.b.a(((String) (obj))));
            }
            StackTraceElement astacktraceelement[] = throwable.getStackTrace();
            int i1 = astacktraceelement.length;
            for (l = 0; l < i1;)
            {
                int j1 = a(astacktraceelement[l], true);
                int k1 = com.a.a.c.f.d(4);
                int l1 = com.a.a.c.f.f(j1);
                l++;
                k = j1 + (k1 + l1) + k;
            }

            astacktraceelement = throwable.getCause();
            l = k;
            if (astacktraceelement != null)
            {
                l = ((flag) ? 1 : 0);
                throwable = astacktraceelement;
                if (j >= i)
                {
                    break label0;
                }
                j = a(((Throwable) (astacktraceelement)), j + 1);
                l = k + (j + (com.a.a.c.f.d(6) + com.a.a.c.f.f(j)));
            }
            return l;
        }
        while (throwable != null) 
        {
            throwable = throwable.getCause();
            l++;
        }
        return k + com.a.a.c.f.c(7, l);
    }

    static b a(String s)
    {
        if (s == null)
        {
            return null;
        } else
        {
            return com.a.a.c.b.a(s);
        }
    }

    private static void a(f f1, int j, StackTraceElement stacktraceelement, boolean flag)
        throws Exception
    {
        byte byte0 = 4;
        f1.e(j, 2);
        f1.e(a(stacktraceelement, flag));
        if (stacktraceelement.isNativeMethod())
        {
            f1.a(1, Math.max(stacktraceelement.getLineNumber(), 0));
        } else
        {
            f1.a(1, 0L);
        }
        f1.a(2, com.a.a.c.b.a((new StringBuilder()).append(stacktraceelement.getClassName()).append(".").append(stacktraceelement.getMethodName()).toString()));
        if (stacktraceelement.getFileName() != null)
        {
            f1.a(3, com.a.a.c.b.a(stacktraceelement.getFileName()));
        }
        if (!stacktraceelement.isNativeMethod() && stacktraceelement.getLineNumber() > 0)
        {
            f1.a(4, stacktraceelement.getLineNumber());
        }
        if (flag)
        {
            j = byte0;
        } else
        {
            j = 0;
        }
        f1.a(5, j);
    }

    public static void a(f f1, String s, int j, String s1, int k, long l, long l1, boolean flag, Map map, int i1, String s2, String s3)
        throws Exception
    {
        s = com.a.a.c.b.a(s);
        b b1 = a(s1);
        s1 = a(s3);
        s2 = a(s2);
        f1.e(9, 2);
        int k1 = com.a.a.c.f.b(1, s);
        int i2 = com.a.a.c.f.d(3, j);
        int j1;
        if (b1 == null)
        {
            j1 = 0;
        } else
        {
            j1 = com.a.a.c.f.b(4, b1);
        }
        j1 = j1 + (i2 + (k1 + 0)) + com.a.a.c.f.c(5, k) + com.a.a.c.f.b(6, l) + com.a.a.c.f.b(7, l1) + com.a.a.c.f.b(10);
        if (map != null)
        {
            s3 = map.entrySet().iterator();
            do
            {
                k1 = j1;
                if (!s3.hasNext())
                {
                    break;
                }
                java.util.Map.Entry entry = (java.util.Map.Entry)s3.next();
                k1 = a((b.a.a.a.a.b.t.a)entry.getKey(), (String)entry.getValue());
                j1 = k1 + (com.a.a.c.f.d(11) + com.a.a.c.f.f(k1)) + j1;
            } while (true);
        } else
        {
            k1 = j1;
        }
        int j2 = com.a.a.c.f.c(12, i1);
        if (s2 == null)
        {
            j1 = 0;
        } else
        {
            j1 = com.a.a.c.f.b(13, s2);
        }
        if (s1 == null)
        {
            i2 = 0;
        } else
        {
            i2 = com.a.a.c.f.b(14, s1);
        }
        f1.e(i2 + (k1 + j2 + j1));
        f1.a(1, s);
        f1.b(3, j);
        f1.a(4, b1);
        f1.a(5, k);
        f1.a(6, l);
        f1.a(7, l1);
        f1.a(10, flag);
        for (s = map.entrySet().iterator(); s.hasNext(); f1.a(2, com.a.a.c.b.a((String)map.getValue())))
        {
            map = (java.util.Map.Entry)s.next();
            f1.e(11, 2);
            f1.e(a((b.a.a.a.a.b.t.a)map.getKey(), (String)map.getValue()));
            f1.b(1, ((b.a.a.a.a.b.t.a)map.getKey()).h);
        }

        f1.a(12, i1);
        if (s2 != null)
        {
            f1.a(13, s2);
        }
        if (s1 != null)
        {
            f1.a(14, s1);
        }
    }

    public static void a(f f1, String s, String s1, long l)
        throws Exception
    {
        f1.a(1, com.a.a.c.b.a(s1));
        f1.a(2, com.a.a.c.b.a(s));
        f1.a(3, l);
    }

    private static void a(f f1, Thread thread, StackTraceElement astacktraceelement[], int j, boolean flag)
        throws Exception
    {
        f1.e(1, 2);
        f1.e(a(thread, astacktraceelement, j, flag));
        f1.a(1, com.a.a.c.b.a(thread.getName()));
        f1.a(2, j);
        int k = astacktraceelement.length;
        for (j = 0; j < k; j++)
        {
            a(f1, 3, astacktraceelement[j], flag);
        }

    }

    static void a(f f1, Map map)
        throws Exception
    {
        for (Iterator iterator = map.entrySet().iterator(); iterator.hasNext(); f1.a(2, com.a.a.c.b.a(map)))
        {
            map = (java.util.Map.Entry)iterator.next();
            f1.e(2, 2);
            f1.e(a((String)map.getKey(), (String)map.getValue()));
            f1.a(1, com.a.a.c.b.a((String)map.getKey()));
            String s = (String)map.getValue();
            map = s;
            if (s == null)
            {
                map = "";
            }
        }

    }

    private int b()
    {
        int k = com.a.a.c.f.b(1, 0L) + 0 + com.a.a.c.f.b(2, 0L) + com.a.a.c.f.b(3, g);
        int j = k;
        if (h != null)
        {
            j = k + com.a.a.c.f.b(4, h);
        }
        return j;
    }

    private static int c()
    {
        return com.a.a.c.f.b(1, f) + 0 + com.a.a.c.f.b(2, f) + com.a.a.c.f.b(3, 0L);
    }

    final int a()
    {
        new h();
        return com.a.a.c.f.b(1, com.a.a.c.b.a(b.a.a.a.a.b.h.a(e))) + 0;
    }

    final int a(Thread thread, Throwable throwable, int j, Map map)
    {
        int k = a(thread, throwable);
        k = k + (com.a.a.c.f.d(1) + com.a.a.c.f.f(k)) + 0;
        if (map != null)
        {
            thread = map.entrySet().iterator();
            int l = k;
            do
            {
                k = l;
                if (!thread.hasNext())
                {
                    break;
                }
                throwable = (java.util.Map.Entry)thread.next();
                k = a((String)throwable.getKey(), (String)throwable.getValue());
                l = k + (com.a.a.c.f.d(2) + com.a.a.c.f.f(k)) + l;
            } while (true);
        }
        int i1 = k;
        if (a != null)
        {
            i1 = a.importance;
            i1 = k + com.a.a.c.f.b(3);
        }
        return com.a.a.c.f.c(4, j) + i1;
    }

    final void a(f f1, Thread thread, Throwable throwable)
        throws Exception
    {
label0:
        {
            f1.e(1, 2);
            f1.e(a(thread, throwable));
            a(f1, thread, d, 4, true);
            int l = b.length;
            for (int j = 0; j < l; j++)
            {
                a(f1, b[j], (StackTraceElement[])c.get(j), 0, false);
            }

            l = 2;
            int k = 1;
            do
            {
                f1.e(l, 2);
                f1.e(a(throwable, 1));
                f1.a(1, com.a.a.c.b.a(throwable.getClass().getName()));
                thread = throwable.getLocalizedMessage();
                if (thread != null)
                {
                    f1.a(3, com.a.a.c.b.a(thread));
                }
                thread = throwable.getStackTrace();
                int i1 = thread.length;
                for (l = 0; l < i1; l++)
                {
                    a(f1, 4, thread[l], true);
                }

                throwable = throwable.getCause();
                if (throwable == null)
                {
                    break label0;
                }
                if (k >= i)
                {
                    break;
                }
                k++;
                l = 6;
            } while (true);
            for (k = 0; throwable != null; k++)
            {
                throwable = throwable.getCause();
            }

            f1.a(7, k);
        }
        f1.e(3, 2);
        f1.e(c());
        f1.a(1, f);
        f1.a(2, f);
        f1.a(3, 0L);
        f1.e(4, 2);
        f1.e(b());
        f1.a(1, 0L);
        f1.a(2, 0L);
        f1.a(3, g);
        if (h != null)
        {
            f1.a(4, h);
        }
    }

}
