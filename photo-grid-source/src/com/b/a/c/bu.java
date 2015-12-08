// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.b.a.c;

import a.a.a.a.a.b.j;
import a.a.a.a.a.b.y;
import a.a.a.a.f;
import android.content.Context;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.b.a.c:
//            b, f, aw

final class bu
{

    private static final b a = com.b.a.c.b.a("0");
    private android.app.ActivityManager.RunningAppProcessInfo b;
    private Thread c[];
    private List d;
    private StackTraceElement e[];
    private final Context f;
    private final b g;
    private final b h;
    private final int i = 8;

    public bu(Context context, String s, String s1)
    {
        f = context;
        g = com.b.a.c.b.a(s1);
        if (s == null)
        {
            context = null;
        } else
        {
            context = com.b.a.c.b.a(s.replace("-", ""));
        }
        h = context;
    }

    private int a()
    {
        new j();
        return com.b.a.c.f.b(1, com.b.a.c.b.a(j.a(f))) + 0;
    }

    private static int a(int k, int l, long l1, long l2)
    {
        return com.b.a.c.f.a() + 0 + com.b.a.c.f.c(k) + com.b.a.c.f.b(3) + com.b.a.c.f.c(4, l) + com.b.a.c.f.b(5, l1) + com.b.a.c.f.b(6, l2);
    }

    private static int a(y y1, String s)
    {
        return com.b.a.c.f.d(1, y1.h) + com.b.a.c.f.b(2, com.b.a.c.b.a(s));
    }

    private static int a(StackTraceElement stacktraceelement, boolean flag)
    {
        int k;
        int l;
        if (stacktraceelement.isNativeMethod())
        {
            k = com.b.a.c.f.b(1, Math.max(stacktraceelement.getLineNumber(), 0)) + 0;
        } else
        {
            k = com.b.a.c.f.b(1, 0L) + 0;
        }
        l = k + com.b.a.c.f.b(2, com.b.a.c.b.a((new StringBuilder()).append(stacktraceelement.getClassName()).append(".").append(stacktraceelement.getMethodName()).toString()));
        k = l;
        if (stacktraceelement.getFileName() != null)
        {
            k = l + com.b.a.c.f.b(3, com.b.a.c.b.a(stacktraceelement.getFileName()));
        }
        if (!stacktraceelement.isNativeMethod() && stacktraceelement.getLineNumber() > 0)
        {
            k += com.b.a.c.f.b(4, stacktraceelement.getLineNumber());
        }
        if (flag)
        {
            l = 2;
        } else
        {
            l = 0;
        }
        return com.b.a.c.f.c(5, l) + k;
    }

    private static int a(String s, String s1)
    {
        int k = com.b.a.c.f.b(1, com.b.a.c.b.a(s));
        s = s1;
        if (s1 == null)
        {
            s = "";
        }
        return k + com.b.a.c.f.b(2, com.b.a.c.b.a(s));
    }

    private int a(Thread thread, Throwable throwable)
    {
        int k = a(thread, e, 4, true);
        int j1 = com.b.a.c.f.d(1);
        int k1 = com.b.a.c.f.f(k);
        int i1 = c.length;
        int l = 0;
        k = k + (j1 + k1) + 0;
        for (; l < i1; l++)
        {
            j1 = a(c[l], (StackTraceElement[])d.get(l), 0, false);
            k += j1 + (com.b.a.c.f.d(1) + com.b.a.c.f.f(j1));
        }

        l = a(throwable, 1);
        i1 = com.b.a.c.f.d(2);
        j1 = com.b.a.c.f.f(l);
        k1 = c();
        int l1 = com.b.a.c.f.d(3);
        int i2 = com.b.a.c.f.f(k1);
        int j2 = b();
        return l + (i1 + j1) + k + (k1 + (l1 + i2)) + (j2 + (com.b.a.c.f.d(3) + com.b.a.c.f.f(j2)));
    }

    private int a(Thread thread, Throwable throwable, int k, Map map)
    {
        int l = a(thread, throwable);
        l = l + (com.b.a.c.f.d(1) + com.b.a.c.f.f(l)) + 0;
        if (map != null)
        {
            thread = map.entrySet().iterator();
            int i1 = l;
            do
            {
                l = i1;
                if (!thread.hasNext())
                {
                    break;
                }
                throwable = (java.util.Map.Entry)thread.next();
                l = a((String)throwable.getKey(), (String)throwable.getValue());
                i1 = l + (com.b.a.c.f.d(2) + com.b.a.c.f.f(l)) + i1;
            } while (true);
        }
        int j1 = l;
        if (b != null)
        {
            j1 = b.importance;
            j1 = l + com.b.a.c.f.b(3);
        }
        return com.b.a.c.f.c(4, k) + j1;
    }

    private static int a(Thread thread, StackTraceElement astacktraceelement[], int k, boolean flag)
    {
        int l = com.b.a.c.f.b(1, com.b.a.c.b.a(thread.getName()));
        l = com.b.a.c.f.c(2, k) + l;
        int i1 = astacktraceelement.length;
        for (k = 0; k < i1; k++)
        {
            int j1 = a(astacktraceelement[k], flag);
            l += j1 + (com.b.a.c.f.d(3) + com.b.a.c.f.f(j1));
        }

        return l;
    }

    private int a(Throwable throwable, int k)
    {
        int l;
        int i1;
label0:
        {
            boolean flag = false;
            i1 = com.b.a.c.f.b(1, com.b.a.c.b.a(throwable.getClass().getName())) + 0;
            Object obj = throwable.getLocalizedMessage();
            l = i1;
            if (obj != null)
            {
                l = i1 + com.b.a.c.f.b(3, com.b.a.c.b.a(((String) (obj))));
            }
            StackTraceElement astacktraceelement[] = throwable.getStackTrace();
            int j1 = astacktraceelement.length;
            for (i1 = 0; i1 < j1;)
            {
                int k1 = a(astacktraceelement[i1], true);
                int l1 = com.b.a.c.f.d(4);
                int i2 = com.b.a.c.f.f(k1);
                i1++;
                l = k1 + (l1 + i2) + l;
            }

            astacktraceelement = throwable.getCause();
            i1 = l;
            if (astacktraceelement != null)
            {
                i1 = ((flag) ? 1 : 0);
                throwable = astacktraceelement;
                if (k >= i)
                {
                    break label0;
                }
                k = a(((Throwable) (astacktraceelement)), k + 1);
                i1 = l + (k + (com.b.a.c.f.d(6) + com.b.a.c.f.f(k)));
            }
            return i1;
        }
        while (throwable != null) 
        {
            throwable = throwable.getCause();
            i1++;
        }
        return l + com.b.a.c.f.c(7, i1);
    }

    private static b a(String s)
    {
        if (s == null)
        {
            return null;
        } else
        {
            return com.b.a.c.b.a(s);
        }
    }

    private static void a(com.b.a.c.f f1, int k, StackTraceElement stacktraceelement, boolean flag)
    {
        byte byte0 = 4;
        f1.e(k, 2);
        f1.e(a(stacktraceelement, flag));
        if (stacktraceelement.isNativeMethod())
        {
            f1.a(1, Math.max(stacktraceelement.getLineNumber(), 0));
        } else
        {
            f1.a(1, 0L);
        }
        f1.a(2, com.b.a.c.b.a((new StringBuilder()).append(stacktraceelement.getClassName()).append(".").append(stacktraceelement.getMethodName()).toString()));
        if (stacktraceelement.getFileName() != null)
        {
            f1.a(3, com.b.a.c.b.a(stacktraceelement.getFileName()));
        }
        if (!stacktraceelement.isNativeMethod() && stacktraceelement.getLineNumber() > 0)
        {
            f1.a(4, stacktraceelement.getLineNumber());
        }
        if (flag)
        {
            k = byte0;
        } else
        {
            k = 0;
        }
        f1.a(5, k);
    }

    public static void a(com.b.a.c.f f1, String s, int k, String s1, int l, long l1, long l2, boolean flag, Map map, int i1, String s2, String s3)
    {
        s = com.b.a.c.b.a(s);
        b b1 = a(s1);
        s1 = a(s3);
        s2 = a(s2);
        f1.e(9, 2);
        int k1 = com.b.a.c.f.b(1, s);
        int i2 = com.b.a.c.f.d(3, k);
        int j1;
        if (b1 == null)
        {
            j1 = 0;
        } else
        {
            j1 = com.b.a.c.f.b(4, b1);
        }
        j1 = j1 + (i2 + (k1 + 0)) + com.b.a.c.f.c(5, l) + com.b.a.c.f.b(6, l1) + com.b.a.c.f.b(7, l2) + com.b.a.c.f.b(10);
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
                k1 = a((y)entry.getKey(), (String)entry.getValue());
                j1 = k1 + (com.b.a.c.f.d(11) + com.b.a.c.f.f(k1)) + j1;
            } while (true);
        } else
        {
            k1 = j1;
        }
        int j2 = com.b.a.c.f.c(12, i1);
        if (s2 == null)
        {
            j1 = 0;
        } else
        {
            j1 = com.b.a.c.f.b(13, s2);
        }
        if (s1 == null)
        {
            i2 = 0;
        } else
        {
            i2 = com.b.a.c.f.b(14, s1);
        }
        f1.e(i2 + (k1 + j2 + j1));
        f1.a(1, s);
        f1.b(3, k);
        f1.a(4, b1);
        f1.a(5, l);
        f1.a(6, l1);
        f1.a(7, l2);
        f1.a(10, flag);
        for (s = map.entrySet().iterator(); s.hasNext(); f1.a(2, com.b.a.c.b.a((String)map.getValue())))
        {
            map = (java.util.Map.Entry)s.next();
            f1.e(11, 2);
            f1.e(a((y)map.getKey(), (String)map.getValue()));
            f1.b(1, ((y)map.getKey()).h);
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

    public static void a(com.b.a.c.f f1, String s, String s1, long l)
    {
        f1.a(1, com.b.a.c.b.a(s1));
        f1.a(2, com.b.a.c.b.a(s));
        f1.a(3, l);
    }

    public static void a(com.b.a.c.f f1, String s, String s1, String s2)
    {
        Object obj = s;
        if (s == null)
        {
            obj = "";
        }
        s = com.b.a.c.b.a(((String) (obj)));
        obj = a(s1);
        b b1 = a(s2);
        int l = com.b.a.c.f.b(1, s) + 0;
        int k = l;
        if (s1 != null)
        {
            k = l + com.b.a.c.f.b(2, ((b) (obj)));
        }
        l = k;
        if (s2 != null)
        {
            l = k + com.b.a.c.f.b(3, b1);
        }
        f1.e(6, 2);
        f1.e(l);
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

    private static void a(com.b.a.c.f f1, Thread thread, StackTraceElement astacktraceelement[], int k, boolean flag)
    {
        f1.e(1, 2);
        f1.e(a(thread, astacktraceelement, k, flag));
        f1.a(1, com.b.a.c.b.a(thread.getName()));
        f1.a(2, k);
        int l = astacktraceelement.length;
        for (k = 0; k < l; k++)
        {
            a(f1, 3, astacktraceelement[k], flag);
        }

    }

    public static void a(com.b.a.c.f f1, boolean flag)
    {
        b b1 = com.b.a.c.b.a(android.os.Build.VERSION.RELEASE);
        b b2 = com.b.a.c.b.a(android.os.Build.VERSION.CODENAME);
        f1.e(8, 2);
        f1.e(com.b.a.c.f.d(1, 3) + 0 + com.b.a.c.f.b(2, b1) + com.b.a.c.f.b(3, b2) + com.b.a.c.f.b(4));
        f1.b(1, 3);
        f1.a(2, b1);
        f1.a(3, b2);
        f1.a(4, flag);
    }

    private int b()
    {
        int l = com.b.a.c.f.b(1, 0L) + 0 + com.b.a.c.f.b(2, 0L) + com.b.a.c.f.b(3, g);
        int k = l;
        if (h != null)
        {
            k = l + com.b.a.c.f.b(4, h);
        }
        return k;
    }

    private static int c()
    {
        return com.b.a.c.f.b(1, a) + 0 + com.b.a.c.f.b(2, a) + com.b.a.c.f.b(3, 0L);
    }

    public final void a(com.b.a.c.f f1, long l, Thread thread, Throwable throwable, String s, Thread athread[], 
            float f2, int k, boolean flag, int i1, long l1, long l2, android.app.ActivityManager.RunningAppProcessInfo runningappprocessinfo, List list, StackTraceElement astacktraceelement[], aw aw1, Map map)
    {
label0:
        {
            b = runningappprocessinfo;
            d = list;
            e = astacktraceelement;
            c = athread;
            athread = aw1.a();
            if (athread == null)
            {
                a.a.a.a.f.d();
            }
            aw1.b();
            f1.e(10, 2);
            int j1 = com.b.a.c.f.b(1, l);
            int k1 = com.b.a.c.f.b(2, com.b.a.c.b.a(s));
            int i2 = a(thread, throwable, i1, map);
            int k2 = com.b.a.c.f.d(3);
            int i3 = com.b.a.c.f.f(i2);
            int j3 = a(k, i1, l1, l2);
            k1 = j3 + (com.b.a.c.f.d(5) + com.b.a.c.f.f(j3)) + (j1 + 0 + k1 + (i2 + (k2 + i3)));
            j1 = k1;
            if (athread != null)
            {
                j1 = com.b.a.c.f.b(1, athread);
                j1 = k1 + (j1 + (com.b.a.c.f.d(6) + com.b.a.c.f.f(j1)));
            }
            f1.e(j1);
            f1.a(1, l);
            f1.a(2, com.b.a.c.b.a(s));
            f1.e(3, 2);
            f1.e(a(thread, throwable, i1, map));
            f1.e(1, 2);
            f1.e(a(thread, throwable));
            a(f1, thread, e, 4, true);
            k1 = c.length;
            for (j1 = 0; j1 < k1; j1++)
            {
                a(f1, c[j1], (StackTraceElement[])d.get(j1), 0, false);
            }

            j1 = 1;
            k1 = 2;
            do
            {
                f1.e(k1, 2);
                f1.e(a(throwable, 1));
                f1.a(1, com.b.a.c.b.a(throwable.getClass().getName()));
                thread = throwable.getLocalizedMessage();
                if (thread != null)
                {
                    f1.a(3, com.b.a.c.b.a(thread));
                }
                thread = throwable.getStackTrace();
                int j2 = thread.length;
                for (k1 = 0; k1 < j2; k1++)
                {
                    a(f1, 4, thread[k1], true);
                }

                throwable = throwable.getCause();
                if (throwable == null)
                {
                    break label0;
                }
                if (j1 >= i)
                {
                    break;
                }
                j1++;
                k1 = 6;
            } while (true);
            for (j1 = 0; throwable != null; j1++)
            {
                throwable = throwable.getCause();
            }

            f1.a(7, j1);
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
            for (s = map.entrySet().iterator(); s.hasNext(); f1.a(2, com.b.a.c.b.a(thread)))
            {
                thread = (java.util.Map.Entry)s.next();
                f1.e(2, 2);
                f1.e(a((String)thread.getKey(), (String)thread.getValue()));
                f1.a(1, com.b.a.c.b.a((String)thread.getKey()));
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
        f1.a(4, i1);
        f1.e(5, 2);
        f1.e(a(k, i1, l1, l2));
        f1.a(f2);
        f1.a(k);
        f1.a(3, flag);
        f1.a(4, i1);
        f1.a(5, l1);
        f1.a(6, l2);
        if (athread != null)
        {
            f1.e(6, 2);
            f1.e(com.b.a.c.f.b(1, athread));
            f1.a(1, athread);
        }
    }

    public final void a(com.b.a.c.f f1, String s, String s1, String s2, String s3, int k)
    {
        s = com.b.a.c.b.a(s);
        s1 = com.b.a.c.b.a(s1);
        b b1 = com.b.a.c.b.a(s2);
        s2 = com.b.a.c.b.a(s3);
        f1.e(7, 2);
        int l = com.b.a.c.f.b(1, s);
        int i1 = com.b.a.c.f.b(2, s1);
        int j1 = com.b.a.c.f.b(3, b1);
        int k1 = a();
        f1.e(l + 0 + i1 + j1 + (k1 + (com.b.a.c.f.d(5) + com.b.a.c.f.f(k1))) + com.b.a.c.f.b(6, s2) + com.b.a.c.f.d(10, k));
        f1.a(1, s);
        f1.a(2, s1);
        f1.a(3, b1);
        f1.e(5, 2);
        f1.e(a());
        new j();
        s = j.a(f);
        f1.e(1, 2);
        s = s.getBytes("UTF-8");
        f1.e(s.length);
        f1.a(s);
        f1.a(6, s2);
        f1.b(10, k);
    }

}
