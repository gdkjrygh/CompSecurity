// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.crashlytics.android.core.CodedOutputStream;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

final class and
{

    private static final alr f = alr.a("0");
    android.app.ActivityManager.RunningAppProcessInfo a;
    Thread b[];
    List c;
    StackTraceElement d[];
    final Context e;
    private final alr g;
    private final alr h;

    public and(Context context, String s, String s1)
    {
        e = context;
        g = alr.a(s1);
        if (s == null)
        {
            context = null;
        } else
        {
            context = alr.a(s.replace("-", ""));
        }
        h = context;
    }

    static int a(int i, int j, long l, long l1)
    {
        return CodedOutputStream.a() + 0 + CodedOutputStream.c(i) + CodedOutputStream.b(3) + CodedOutputStream.c(4, j) + CodedOutputStream.b(5, l) + CodedOutputStream.b(6, l1);
    }

    static int a(alr alr1)
    {
        return CodedOutputStream.b(1, alr1);
    }

    static int a(alr alr1, alr alr2)
    {
        return CodedOutputStream.d(1, 3) + 0 + CodedOutputStream.b(2, alr1) + CodedOutputStream.b(3, alr2) + CodedOutputStream.b(4);
    }

    private static int a(io.fabric.sdk.android.services.common.IdManager.DeviceIdentifierType deviceidentifiertype, String s)
    {
        return CodedOutputStream.d(1, deviceidentifiertype.protobufIndex) + CodedOutputStream.b(2, alr.a(s));
    }

    private static int a(StackTraceElement stacktraceelement, boolean flag)
    {
        int i;
        int j;
        if (stacktraceelement.isNativeMethod())
        {
            i = CodedOutputStream.b(1, Math.max(stacktraceelement.getLineNumber(), 0)) + 0;
        } else
        {
            i = CodedOutputStream.b(1, 0L) + 0;
        }
        j = i + CodedOutputStream.b(2, alr.a((new StringBuilder()).append(stacktraceelement.getClassName()).append(".").append(stacktraceelement.getMethodName()).toString()));
        i = j;
        if (stacktraceelement.getFileName() != null)
        {
            i = j + CodedOutputStream.b(3, alr.a(stacktraceelement.getFileName()));
        }
        if (!stacktraceelement.isNativeMethod() && stacktraceelement.getLineNumber() > 0)
        {
            i += CodedOutputStream.b(4, stacktraceelement.getLineNumber());
        }
        if (flag)
        {
            j = 2;
        } else
        {
            j = 0;
        }
        return CodedOutputStream.c(5, j) + i;
    }

    private static int a(String s, String s1)
    {
        int i = CodedOutputStream.b(1, alr.a(s));
        s = s1;
        if (s1 == null)
        {
            s = "";
        }
        return i + CodedOutputStream.b(2, alr.a(s));
    }

    private int a(Thread thread, Throwable throwable)
    {
        int i = a(thread, d, 4, true);
        int l = CodedOutputStream.d(1);
        int i1 = CodedOutputStream.f(i);
        int k = b.length;
        int j = 0;
        i = i + (l + i1) + 0;
        for (; j < k; j++)
        {
            l = a(b[j], (StackTraceElement[])c.get(j), 0, false);
            i += l + (CodedOutputStream.d(1) + CodedOutputStream.f(l));
        }

        j = a(throwable, 1);
        k = CodedOutputStream.d(2);
        l = CodedOutputStream.f(j);
        i1 = c();
        int j1 = CodedOutputStream.d(3);
        int k1 = CodedOutputStream.f(i1);
        int l1 = b();
        return j + (k + l) + i + (i1 + (j1 + k1)) + (l1 + (CodedOutputStream.d(3) + CodedOutputStream.f(l1)));
    }

    private static int a(Thread thread, StackTraceElement astacktraceelement[], int i, boolean flag)
    {
        int j = CodedOutputStream.b(1, alr.a(thread.getName()));
        j = CodedOutputStream.c(2, i) + j;
        int k = astacktraceelement.length;
        for (i = 0; i < k; i++)
        {
            int l = a(astacktraceelement[i], flag);
            j += l + (CodedOutputStream.d(3) + CodedOutputStream.f(l));
        }

        return j;
    }

    private int a(Throwable throwable, int i)
    {
        int j;
        int k;
label0:
        {
            boolean flag = false;
            k = CodedOutputStream.b(1, alr.a(throwable.getClass().getName())) + 0;
            Object obj = throwable.getLocalizedMessage();
            j = k;
            if (obj != null)
            {
                j = k + CodedOutputStream.b(3, alr.a(((String) (obj))));
            }
            StackTraceElement astacktraceelement[] = throwable.getStackTrace();
            int l = astacktraceelement.length;
            for (k = 0; k < l;)
            {
                int i1 = a(astacktraceelement[k], true);
                int j1 = CodedOutputStream.d(4);
                int k1 = CodedOutputStream.f(i1);
                k++;
                j = i1 + (j1 + k1) + j;
            }

            astacktraceelement = throwable.getCause();
            k = j;
            if (astacktraceelement != null)
            {
                k = ((flag) ? 1 : 0);
                throwable = astacktraceelement;
                if (i >= 8)
                {
                    break label0;
                }
                i = a(((Throwable) (astacktraceelement)), i + 1);
                k = j + (i + (CodedOutputStream.d(6) + CodedOutputStream.f(i)));
            }
            return k;
        }
        while (throwable != null) 
        {
            throwable = throwable.getCause();
            k++;
        }
        return j + CodedOutputStream.c(7, k);
    }

    static alr a(String s)
    {
        if (s == null)
        {
            return null;
        } else
        {
            return alr.a(s);
        }
    }

    private static void a(CodedOutputStream codedoutputstream, int i, StackTraceElement stacktraceelement, boolean flag)
    {
        byte byte0 = 4;
        codedoutputstream.e(i, 2);
        codedoutputstream.e(a(stacktraceelement, flag));
        if (stacktraceelement.isNativeMethod())
        {
            codedoutputstream.a(1, Math.max(stacktraceelement.getLineNumber(), 0));
        } else
        {
            codedoutputstream.a(1, 0L);
        }
        codedoutputstream.a(2, alr.a((new StringBuilder()).append(stacktraceelement.getClassName()).append(".").append(stacktraceelement.getMethodName()).toString()));
        if (stacktraceelement.getFileName() != null)
        {
            codedoutputstream.a(3, alr.a(stacktraceelement.getFileName()));
        }
        if (!stacktraceelement.isNativeMethod() && stacktraceelement.getLineNumber() > 0)
        {
            codedoutputstream.a(4, stacktraceelement.getLineNumber());
        }
        if (flag)
        {
            i = byte0;
        } else
        {
            i = 0;
        }
        codedoutputstream.a(5, i);
    }

    public static void a(CodedOutputStream codedoutputstream, String s, int i, String s1, int j, long l, long l1, boolean flag, Map map, int k, String s2, String s3)
    {
        s = alr.a(s);
        alr alr1 = a(s1);
        s1 = a(s3);
        s2 = a(s2);
        codedoutputstream.e(9, 2);
        int j1 = CodedOutputStream.b(1, s);
        int k1 = CodedOutputStream.d(3, i);
        int i1;
        if (alr1 == null)
        {
            i1 = 0;
        } else
        {
            i1 = CodedOutputStream.b(4, alr1);
        }
        i1 = i1 + (k1 + (j1 + 0)) + CodedOutputStream.c(5, j) + CodedOutputStream.b(6, l) + CodedOutputStream.b(7, l1) + CodedOutputStream.b(10);
        if (map != null)
        {
            s3 = map.entrySet().iterator();
            do
            {
                j1 = i1;
                if (!s3.hasNext())
                {
                    break;
                }
                java.util.Map.Entry entry = (java.util.Map.Entry)s3.next();
                j1 = a((io.fabric.sdk.android.services.common.IdManager.DeviceIdentifierType)entry.getKey(), (String)entry.getValue());
                i1 = j1 + (CodedOutputStream.d(11) + CodedOutputStream.f(j1)) + i1;
            } while (true);
        } else
        {
            j1 = i1;
        }
        int i2 = CodedOutputStream.c(12, k);
        if (s2 == null)
        {
            i1 = 0;
        } else
        {
            i1 = CodedOutputStream.b(13, s2);
        }
        if (s1 == null)
        {
            k1 = 0;
        } else
        {
            k1 = CodedOutputStream.b(14, s1);
        }
        codedoutputstream.e(k1 + (j1 + i2 + i1));
        codedoutputstream.a(1, s);
        codedoutputstream.b(3, i);
        codedoutputstream.a(4, alr1);
        codedoutputstream.a(5, j);
        codedoutputstream.a(6, l);
        codedoutputstream.a(7, l1);
        codedoutputstream.a(10, flag);
        for (s = map.entrySet().iterator(); s.hasNext(); codedoutputstream.a(2, alr.a((String)map.getValue())))
        {
            map = (java.util.Map.Entry)s.next();
            codedoutputstream.e(11, 2);
            codedoutputstream.e(a((io.fabric.sdk.android.services.common.IdManager.DeviceIdentifierType)map.getKey(), (String)map.getValue()));
            codedoutputstream.b(1, ((io.fabric.sdk.android.services.common.IdManager.DeviceIdentifierType)map.getKey()).protobufIndex);
        }

        codedoutputstream.a(12, k);
        if (s2 != null)
        {
            codedoutputstream.a(13, s2);
        }
        if (s1 != null)
        {
            codedoutputstream.a(14, s1);
        }
    }

    public static void a(CodedOutputStream codedoutputstream, String s, String s1, long l)
    {
        codedoutputstream.a(1, alr.a(s1));
        codedoutputstream.a(2, alr.a(s));
        codedoutputstream.a(3, l);
    }

    private static void a(CodedOutputStream codedoutputstream, Thread thread, StackTraceElement astacktraceelement[], int i, boolean flag)
    {
        codedoutputstream.e(1, 2);
        codedoutputstream.e(a(thread, astacktraceelement, i, flag));
        codedoutputstream.a(1, alr.a(thread.getName()));
        codedoutputstream.a(2, i);
        int j = astacktraceelement.length;
        for (i = 0; i < j; i++)
        {
            a(codedoutputstream, 3, astacktraceelement[i], flag);
        }

    }

    static void a(CodedOutputStream codedoutputstream, Map map)
    {
        for (Iterator iterator = map.entrySet().iterator(); iterator.hasNext(); codedoutputstream.a(2, alr.a(map)))
        {
            map = (java.util.Map.Entry)iterator.next();
            codedoutputstream.e(2, 2);
            codedoutputstream.e(a((String)map.getKey(), (String)map.getValue()));
            codedoutputstream.a(1, alr.a((String)map.getKey()));
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
        int j = CodedOutputStream.b(1, 0L) + 0 + CodedOutputStream.b(2, 0L) + CodedOutputStream.b(3, g);
        int i = j;
        if (h != null)
        {
            i = j + CodedOutputStream.b(4, h);
        }
        return i;
    }

    private static int c()
    {
        return CodedOutputStream.b(1, f) + 0 + CodedOutputStream.b(2, f) + CodedOutputStream.b(3, 0L);
    }

    final int a()
    {
        new gyx();
        return CodedOutputStream.b(1, alr.a(gyx.a(e))) + 0;
    }

    final int a(Thread thread, Throwable throwable, int i, Map map)
    {
        int j = a(thread, throwable);
        j = j + (CodedOutputStream.d(1) + CodedOutputStream.f(j)) + 0;
        if (map != null)
        {
            thread = map.entrySet().iterator();
            int k = j;
            do
            {
                j = k;
                if (!thread.hasNext())
                {
                    break;
                }
                throwable = (java.util.Map.Entry)thread.next();
                j = a((String)throwable.getKey(), (String)throwable.getValue());
                k = j + (CodedOutputStream.d(2) + CodedOutputStream.f(j)) + k;
            } while (true);
        }
        int l = j;
        if (a != null)
        {
            l = a.importance;
            l = j + CodedOutputStream.b(3);
        }
        return CodedOutputStream.c(4, i) + l;
    }

    final void a(CodedOutputStream codedoutputstream, Thread thread, Throwable throwable)
    {
label0:
        {
            codedoutputstream.e(1, 2);
            codedoutputstream.e(a(thread, throwable));
            a(codedoutputstream, thread, d, 4, true);
            int k = b.length;
            for (int i = 0; i < k; i++)
            {
                a(codedoutputstream, b[i], (StackTraceElement[])c.get(i), 0, false);
            }

            k = 2;
            int j = 1;
            do
            {
                codedoutputstream.e(k, 2);
                codedoutputstream.e(a(throwable, 1));
                codedoutputstream.a(1, alr.a(throwable.getClass().getName()));
                thread = throwable.getLocalizedMessage();
                if (thread != null)
                {
                    codedoutputstream.a(3, alr.a(thread));
                }
                thread = throwable.getStackTrace();
                int l = thread.length;
                for (k = 0; k < l; k++)
                {
                    a(codedoutputstream, 4, thread[k], true);
                }

                throwable = throwable.getCause();
                if (throwable == null)
                {
                    break label0;
                }
                if (j >= 8)
                {
                    break;
                }
                j++;
                k = 6;
            } while (true);
            for (j = 0; throwable != null; j++)
            {
                throwable = throwable.getCause();
            }

            codedoutputstream.a(7, j);
        }
        codedoutputstream.e(3, 2);
        codedoutputstream.e(c());
        codedoutputstream.a(1, f);
        codedoutputstream.a(2, f);
        codedoutputstream.a(3, 0L);
        codedoutputstream.e(4, 2);
        codedoutputstream.e(b());
        codedoutputstream.a(1, 0L);
        codedoutputstream.a(2, 0L);
        codedoutputstream.a(3, g);
        if (h != null)
        {
            codedoutputstream.a(4, h);
        }
    }

}
