// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.core;

import android.content.Context;
import io.fabric.sdk.android.services.common.g;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.crashlytics.android.core:
//            ByteString, CodedOutputStream

class SessionDataWriter
{

    private static final ByteString f = ByteString.a("0");
    android.app.ActivityManager.RunningAppProcessInfo a;
    Thread b[];
    List c;
    StackTraceElement d[];
    final Context e;
    private final ByteString g;
    private final ByteString h;
    private final int i = 8;

    public SessionDataWriter(Context context, String s, String s1)
    {
        e = context;
        g = ByteString.a(s1);
        if (s == null)
        {
            context = null;
        } else
        {
            context = ByteString.a(s.replace("-", ""));
        }
        h = context;
    }

    static int a(int j, int k, long l, long l1)
    {
        return CodedOutputStream.a() + 0 + CodedOutputStream.c(j) + CodedOutputStream.b(3) + CodedOutputStream.c(4, k) + CodedOutputStream.b(5, l) + CodedOutputStream.b(6, l1);
    }

    static int a(ByteString bytestring)
    {
        return CodedOutputStream.b(1, bytestring);
    }

    static int a(ByteString bytestring, ByteString bytestring1)
    {
        return CodedOutputStream.d(1, 3) + 0 + CodedOutputStream.b(2, bytestring) + CodedOutputStream.b(3, bytestring1) + CodedOutputStream.b(4);
    }

    private static int a(io.fabric.sdk.android.services.common.IdManager.DeviceIdentifierType deviceidentifiertype, String s)
    {
        return CodedOutputStream.d(1, deviceidentifiertype.h) + CodedOutputStream.b(2, ByteString.a(s));
    }

    private static int a(StackTraceElement stacktraceelement, boolean flag)
    {
        int j;
        int k;
        if (stacktraceelement.isNativeMethod())
        {
            j = CodedOutputStream.b(1, Math.max(stacktraceelement.getLineNumber(), 0)) + 0;
        } else
        {
            j = CodedOutputStream.b(1, 0L) + 0;
        }
        k = j + CodedOutputStream.b(2, ByteString.a((new StringBuilder()).append(stacktraceelement.getClassName()).append(".").append(stacktraceelement.getMethodName()).toString()));
        j = k;
        if (stacktraceelement.getFileName() != null)
        {
            j = k + CodedOutputStream.b(3, ByteString.a(stacktraceelement.getFileName()));
        }
        if (!stacktraceelement.isNativeMethod() && stacktraceelement.getLineNumber() > 0)
        {
            j += CodedOutputStream.b(4, stacktraceelement.getLineNumber());
        }
        if (flag)
        {
            k = 2;
        } else
        {
            k = 0;
        }
        return CodedOutputStream.c(5, k) + j;
    }

    private static int a(String s, String s1)
    {
        int j = CodedOutputStream.b(1, ByteString.a(s));
        s = s1;
        if (s1 == null)
        {
            s = "";
        }
        return j + CodedOutputStream.b(2, ByteString.a(s));
    }

    private int a(Thread thread, Throwable throwable)
    {
        int j = a(thread, d, 4, true);
        int i1 = CodedOutputStream.d(1);
        int j1 = CodedOutputStream.f(j);
        int l = b.length;
        int k = 0;
        j = j + (i1 + j1) + 0;
        for (; k < l; k++)
        {
            i1 = a(b[k], (StackTraceElement[])c.get(k), 0, false);
            j += i1 + (CodedOutputStream.d(1) + CodedOutputStream.f(i1));
        }

        k = a(throwable, 1);
        l = CodedOutputStream.d(2);
        i1 = CodedOutputStream.f(k);
        j1 = c();
        int k1 = CodedOutputStream.d(3);
        int l1 = CodedOutputStream.f(j1);
        int i2 = b();
        return k + (l + i1) + j + (j1 + (k1 + l1)) + (i2 + (CodedOutputStream.d(3) + CodedOutputStream.f(i2)));
    }

    private static int a(Thread thread, StackTraceElement astacktraceelement[], int j, boolean flag)
    {
        int k = CodedOutputStream.b(1, ByteString.a(thread.getName()));
        k = CodedOutputStream.c(2, j) + k;
        int l = astacktraceelement.length;
        for (j = 0; j < l; j++)
        {
            int i1 = a(astacktraceelement[j], flag);
            k += i1 + (CodedOutputStream.d(3) + CodedOutputStream.f(i1));
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
            l = CodedOutputStream.b(1, ByteString.a(throwable.getClass().getName())) + 0;
            Object obj = throwable.getLocalizedMessage();
            k = l;
            if (obj != null)
            {
                k = l + CodedOutputStream.b(3, ByteString.a(((String) (obj))));
            }
            StackTraceElement astacktraceelement[] = throwable.getStackTrace();
            int i1 = astacktraceelement.length;
            for (l = 0; l < i1;)
            {
                int j1 = a(astacktraceelement[l], true);
                int k1 = CodedOutputStream.d(4);
                int l1 = CodedOutputStream.f(j1);
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
                l = k + (j + (CodedOutputStream.d(6) + CodedOutputStream.f(j)));
            }
            return l;
        }
        while (throwable != null) 
        {
            throwable = throwable.getCause();
            l++;
        }
        return k + CodedOutputStream.c(7, l);
    }

    static ByteString a(String s)
    {
        if (s == null)
        {
            return null;
        } else
        {
            return ByteString.a(s);
        }
    }

    private static void a(CodedOutputStream codedoutputstream, int j, StackTraceElement stacktraceelement, boolean flag)
        throws Exception
    {
        byte byte0 = 4;
        codedoutputstream.e(j, 2);
        codedoutputstream.e(a(stacktraceelement, flag));
        if (stacktraceelement.isNativeMethod())
        {
            codedoutputstream.a(1, Math.max(stacktraceelement.getLineNumber(), 0));
        } else
        {
            codedoutputstream.a(1, 0L);
        }
        codedoutputstream.a(2, ByteString.a((new StringBuilder()).append(stacktraceelement.getClassName()).append(".").append(stacktraceelement.getMethodName()).toString()));
        if (stacktraceelement.getFileName() != null)
        {
            codedoutputstream.a(3, ByteString.a(stacktraceelement.getFileName()));
        }
        if (!stacktraceelement.isNativeMethod() && stacktraceelement.getLineNumber() > 0)
        {
            codedoutputstream.a(4, stacktraceelement.getLineNumber());
        }
        if (flag)
        {
            j = byte0;
        } else
        {
            j = 0;
        }
        codedoutputstream.a(5, j);
    }

    public static void a(CodedOutputStream codedoutputstream, String s, int j, String s1, int k, long l, long l1, boolean flag, Map map, int i1, String s2, String s3)
        throws Exception
    {
        s = ByteString.a(s);
        ByteString bytestring = a(s1);
        s1 = a(s3);
        s2 = a(s2);
        codedoutputstream.e(9, 2);
        int k1 = CodedOutputStream.b(1, s);
        int i2 = CodedOutputStream.d(3, j);
        int j1;
        if (bytestring == null)
        {
            j1 = 0;
        } else
        {
            j1 = CodedOutputStream.b(4, bytestring);
        }
        j1 = j1 + (i2 + (k1 + 0)) + CodedOutputStream.c(5, k) + CodedOutputStream.b(6, l) + CodedOutputStream.b(7, l1) + CodedOutputStream.b(10);
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
                k1 = a((io.fabric.sdk.android.services.common.IdManager.DeviceIdentifierType)entry.getKey(), (String)entry.getValue());
                j1 = k1 + (CodedOutputStream.d(11) + CodedOutputStream.f(k1)) + j1;
            } while (true);
        } else
        {
            k1 = j1;
        }
        int j2 = CodedOutputStream.c(12, i1);
        if (s2 == null)
        {
            j1 = 0;
        } else
        {
            j1 = CodedOutputStream.b(13, s2);
        }
        if (s1 == null)
        {
            i2 = 0;
        } else
        {
            i2 = CodedOutputStream.b(14, s1);
        }
        codedoutputstream.e(i2 + (k1 + j2 + j1));
        codedoutputstream.a(1, s);
        codedoutputstream.b(3, j);
        codedoutputstream.a(4, bytestring);
        codedoutputstream.a(5, k);
        codedoutputstream.a(6, l);
        codedoutputstream.a(7, l1);
        codedoutputstream.a(10, flag);
        for (s = map.entrySet().iterator(); s.hasNext(); codedoutputstream.a(2, ByteString.a((String)map.getValue())))
        {
            map = (java.util.Map.Entry)s.next();
            codedoutputstream.e(11, 2);
            codedoutputstream.e(a((io.fabric.sdk.android.services.common.IdManager.DeviceIdentifierType)map.getKey(), (String)map.getValue()));
            codedoutputstream.b(1, ((io.fabric.sdk.android.services.common.IdManager.DeviceIdentifierType)map.getKey()).h);
        }

        codedoutputstream.a(12, i1);
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
        throws Exception
    {
        codedoutputstream.a(1, ByteString.a(s1));
        codedoutputstream.a(2, ByteString.a(s));
        codedoutputstream.a(3, l);
    }

    private static void a(CodedOutputStream codedoutputstream, Thread thread, StackTraceElement astacktraceelement[], int j, boolean flag)
        throws Exception
    {
        codedoutputstream.e(1, 2);
        codedoutputstream.e(a(thread, astacktraceelement, j, flag));
        codedoutputstream.a(1, ByteString.a(thread.getName()));
        codedoutputstream.a(2, j);
        int k = astacktraceelement.length;
        for (j = 0; j < k; j++)
        {
            a(codedoutputstream, 3, astacktraceelement[j], flag);
        }

    }

    static void a(CodedOutputStream codedoutputstream, Map map)
        throws Exception
    {
        for (Iterator iterator = map.entrySet().iterator(); iterator.hasNext(); codedoutputstream.a(2, ByteString.a(map)))
        {
            map = (java.util.Map.Entry)iterator.next();
            codedoutputstream.e(2, 2);
            codedoutputstream.e(a((String)map.getKey(), (String)map.getValue()));
            codedoutputstream.a(1, ByteString.a((String)map.getKey()));
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
        int k = CodedOutputStream.b(1, 0L) + 0 + CodedOutputStream.b(2, 0L) + CodedOutputStream.b(3, g);
        int j = k;
        if (h != null)
        {
            j = k + CodedOutputStream.b(4, h);
        }
        return j;
    }

    private static int c()
    {
        return CodedOutputStream.b(1, f) + 0 + CodedOutputStream.b(2, f) + CodedOutputStream.b(3, 0L);
    }

    final int a()
    {
        new g();
        return CodedOutputStream.b(1, ByteString.a(io.fabric.sdk.android.services.common.g.a(e))) + 0;
    }

    final int a(Thread thread, Throwable throwable, int j, Map map)
    {
        int k = a(thread, throwable);
        k = k + (CodedOutputStream.d(1) + CodedOutputStream.f(k)) + 0;
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
                l = k + (CodedOutputStream.d(2) + CodedOutputStream.f(k)) + l;
            } while (true);
        }
        int i1 = k;
        if (a != null)
        {
            i1 = a.importance;
            i1 = k + CodedOutputStream.b(3);
        }
        return CodedOutputStream.c(4, j) + i1;
    }

    final void a(CodedOutputStream codedoutputstream, Thread thread, Throwable throwable)
        throws Exception
    {
label0:
        {
            codedoutputstream.e(1, 2);
            codedoutputstream.e(a(thread, throwable));
            a(codedoutputstream, thread, d, 4, true);
            int l = b.length;
            for (int j = 0; j < l; j++)
            {
                a(codedoutputstream, b[j], (StackTraceElement[])c.get(j), 0, false);
            }

            l = 2;
            int k = 1;
            do
            {
                codedoutputstream.e(l, 2);
                codedoutputstream.e(a(throwable, 1));
                codedoutputstream.a(1, ByteString.a(throwable.getClass().getName()));
                thread = throwable.getLocalizedMessage();
                if (thread != null)
                {
                    codedoutputstream.a(3, ByteString.a(thread));
                }
                thread = throwable.getStackTrace();
                int i1 = thread.length;
                for (l = 0; l < i1; l++)
                {
                    a(codedoutputstream, 4, thread[l], true);
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

            codedoutputstream.a(7, k);
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
