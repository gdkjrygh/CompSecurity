// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a.c;

import android.content.Context;
import b.a.a.a.a.b.h;
import b.a.a.a.d;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.a.a.c:
//            b, f, ar

final class ay
{

    private static final b a = com.a.a.c.b.a("0");
    private android.app.ActivityManager.RunningAppProcessInfo b;
    private Thread c[];
    private List d;
    private StackTraceElement e[];
    private final Context f;
    private final b g;
    private final b h;
    private final int i = 8;

    public ay(Context context, String s, String s1)
    {
        f = context;
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

    private int a()
    {
        new h();
        return com.a.a.c.f.b(1, com.a.a.c.b.a(b.a.a.a.a.b.h.a(f))) + 0;
    }

    private static int a(int j, int k, long l, long l1)
    {
        return com.a.a.c.f.a() + 0 + com.a.a.c.f.c(j) + com.a.a.c.f.b(3) + com.a.a.c.f.c(4, k) + com.a.a.c.f.b(5, l) + com.a.a.c.f.b(6, l1);
    }

    private static int a(b.a.a.a.a.b.t.a a1, String s)
    {
        return com.a.a.c.f.d(1, a1.h) + com.a.a.c.f.b(2, com.a.a.c.b.a(s));
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
        int j = a(thread, e, 4, true);
        int i1 = com.a.a.c.f.d(1);
        int j1 = com.a.a.c.f.f(j);
        int l = c.length;
        int k = 0;
        j = j + (i1 + j1) + 0;
        for (; k < l; k++)
        {
            i1 = a(c[k], (StackTraceElement[])d.get(k), 0, false);
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

    private int a(Thread thread, Throwable throwable, int j, Map map)
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
        if (b != null)
        {
            i1 = b.importance;
            i1 = k + com.a.a.c.f.b(3);
        }
        return com.a.a.c.f.c(4, j) + i1;
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

    private static b a(String s)
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
    {
        f1.a(1, com.a.a.c.b.a(s1));
        f1.a(2, com.a.a.c.b.a(s));
        f1.a(3, l);
    }

    public static void a(f f1, String s, String s1, String s2)
    {
        Object obj = s;
        if (s == null)
        {
            obj = "";
        }
        s = com.a.a.c.b.a(((String) (obj)));
        obj = a(s1);
        b b1 = a(s2);
        int k = com.a.a.c.f.b(1, s) + 0;
        int j = k;
        if (s1 != null)
        {
            j = k + com.a.a.c.f.b(2, ((b) (obj)));
        }
        k = j;
        if (s2 != null)
        {
            k = j + com.a.a.c.f.b(3, b1);
        }
        f1.e(6, 2);
        f1.e(k);
        f1.a(1, s);
        if (s1 != null)
        {
            f1.a(2, ((b) (obj)));
        }
        if (s2 != null)
        {
            f1.a(3, b1);
        }
    }

    private static void a(f f1, Thread thread, StackTraceElement astacktraceelement[], int j, boolean flag)
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

    public static void a(f f1, boolean flag)
    {
        b b1 = com.a.a.c.b.a(android.os.Build.VERSION.RELEASE);
        b b2 = com.a.a.c.b.a(android.os.Build.VERSION.CODENAME);
        f1.e(8, 2);
        f1.e(com.a.a.c.f.d(1, 3) + 0 + com.a.a.c.f.b(2, b1) + com.a.a.c.f.b(3, b2) + com.a.a.c.f.b(4));
        f1.b(1, 3);
        f1.a(2, b1);
        f1.a(3, b2);
        f1.a(4, flag);
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
        return com.a.a.c.f.b(1, a) + 0 + com.a.a.c.f.b(2, a) + com.a.a.c.f.b(3, 0L);
    }

    public final void a(f f1, long l, Thread thread, Throwable throwable, String s, Thread athread[], 
            float f2, int j, boolean flag, int k, long l1, long l2, android.app.ActivityManager.RunningAppProcessInfo runningappprocessinfo, List list, StackTraceElement astacktraceelement[], ar ar1, Map map)
    {
label0:
        {
            b = runningappprocessinfo;
            d = list;
            e = astacktraceelement;
            c = athread;
            athread = ar1.a();
            if (athread == null)
            {
                b.a.a.a.d.c();
            }
            ar1.b();
            f1.e(10, 2);
            int i1 = com.a.a.c.f.b(1, l);
            int j1 = com.a.a.c.f.b(2, com.a.a.c.b.a(s));
            int k1 = a(thread, throwable, k, map);
            int j2 = com.a.a.c.f.d(3);
            int k2 = com.a.a.c.f.f(k1);
            int i3 = a(j, k, l1, l2);
            j1 = i3 + (com.a.a.c.f.d(5) + com.a.a.c.f.f(i3)) + (i1 + 0 + j1 + (k1 + (j2 + k2)));
            i1 = j1;
            if (athread != null)
            {
                i1 = com.a.a.c.f.b(1, athread);
                i1 = j1 + (i1 + (com.a.a.c.f.d(6) + com.a.a.c.f.f(i1)));
            }
            f1.e(i1);
            f1.a(1, l);
            f1.a(2, com.a.a.c.b.a(s));
            f1.e(3, 2);
            f1.e(a(thread, throwable, k, map));
            f1.e(1, 2);
            f1.e(a(thread, throwable));
            a(f1, thread, e, 4, true);
            j1 = c.length;
            for (i1 = 0; i1 < j1; i1++)
            {
                a(f1, c[i1], (StackTraceElement[])d.get(i1), 0, false);
            }

            i1 = 1;
            j1 = 2;
            do
            {
                f1.e(j1, 2);
                f1.e(a(throwable, 1));
                f1.a(1, com.a.a.c.b.a(throwable.getClass().getName()));
                thread = throwable.getLocalizedMessage();
                if (thread != null)
                {
                    f1.a(3, com.a.a.c.b.a(thread));
                }
                thread = throwable.getStackTrace();
                int i2 = thread.length;
                for (j1 = 0; j1 < i2; j1++)
                {
                    a(f1, 4, thread[j1], true);
                }

                throwable = throwable.getCause();
                if (throwable == null)
                {
                    break label0;
                }
                if (i1 >= i)
                {
                    break;
                }
                i1++;
                j1 = 6;
            } while (true);
            for (i1 = 0; throwable != null; i1++)
            {
                throwable = throwable.getCause();
            }

            f1.a(7, i1);
        }
        f1.e(3, 2);
        f1.e(c());
        f1.a(1, a);
        f1.a(2, a);
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
        if (map != null && !map.isEmpty())
        {
            for (s = map.entrySet().iterator(); s.hasNext(); f1.a(2, com.a.a.c.b.a(thread)))
            {
                thread = (java.util.Map.Entry)s.next();
                f1.e(2, 2);
                f1.e(a((String)thread.getKey(), (String)thread.getValue()));
                f1.a(1, com.a.a.c.b.a((String)thread.getKey()));
                throwable = (String)thread.getValue();
                thread = throwable;
                if (throwable == null)
                {
                    thread = "";
                }
            }

        }
        if (b != null)
        {
            boolean flag1;
            if (b.importance != 100)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            f1.a(3, flag1);
        }
        f1.a(4, k);
        f1.e(5, 2);
        f1.e(a(j, k, l1, l2));
        f1.a(f2);
        f1.a(j);
        f1.a(3, flag);
        f1.a(4, k);
        f1.a(5, l1);
        f1.a(6, l2);
        if (athread != null)
        {
            f1.e(6, 2);
            f1.e(com.a.a.c.f.b(1, athread));
            f1.a(1, athread);
        }
    }

    public final void a(f f1, String s, String s1, String s2, String s3, int j)
    {
        s = com.a.a.c.b.a(s);
        s1 = com.a.a.c.b.a(s1);
        b b1 = com.a.a.c.b.a(s2);
        s2 = com.a.a.c.b.a(s3);
        f1.e(7, 2);
        int k = com.a.a.c.f.b(1, s);
        int l = com.a.a.c.f.b(2, s1);
        int i1 = com.a.a.c.f.b(3, b1);
        int j1 = a();
        f1.e(k + 0 + l + i1 + (j1 + (com.a.a.c.f.d(5) + com.a.a.c.f.f(j1))) + com.a.a.c.f.b(6, s2) + com.a.a.c.f.d(10, j));
        f1.a(1, s);
        f1.a(2, s1);
        f1.a(3, b1);
        f1.e(5, 2);
        f1.e(a());
        new h();
        s = b.a.a.a.a.b.h.a(f);
        f1.e(1, 2);
        s = s.getBytes("UTF-8");
        f1.e(s.length);
        f1.a(s);
        f1.a(6, s2);
        f1.b(10, j);
    }

}
