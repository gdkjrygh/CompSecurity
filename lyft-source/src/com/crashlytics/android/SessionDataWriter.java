// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android;

import android.content.Context;
import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Logger;
import io.fabric.sdk.android.services.common.ApiKey;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.crashlytics.android:
//            ByteString, CodedOutputStream, LogFileManager

class SessionDataWriter
{

    private static final ByteString a = ByteString.a("0");
    private android.app.ActivityManager.RunningAppProcessInfo b;
    private Thread c[];
    private List d;
    private StackTraceElement e[];
    private final Context f;
    private final ByteString g;
    private final ByteString h;
    private final int i = 8;

    public SessionDataWriter(Context context, String s, String s1)
    {
        f = context;
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

    private int a()
    {
        return 0 + CodedOutputStream.b(1, ByteString.a((new ApiKey()).a(f)));
    }

    private int a(float f1, int j, boolean flag, int k, long l, long l1)
    {
        return 0 + CodedOutputStream.b(1, f1) + CodedOutputStream.f(2, j) + CodedOutputStream.b(3, flag) + CodedOutputStream.d(4, k) + CodedOutputStream.b(5, l) + CodedOutputStream.b(6, l1);
    }

    private int a(int j, ByteString bytestring, ByteString bytestring1, int k, long l, long l1, boolean flag, Map map, int i1, ByteString bytestring2, ByteString bytestring3)
    {
        int j1 = CodedOutputStream.b(1, bytestring);
        int k1 = CodedOutputStream.e(3, j);
        if (bytestring1 == null)
        {
            j = 0;
        } else
        {
            j = CodedOutputStream.b(4, bytestring1);
        }
        j = j + (k1 + (0 + j1)) + CodedOutputStream.d(5, k) + CodedOutputStream.b(6, l) + CodedOutputStream.b(7, l1) + CodedOutputStream.b(10, flag);
        if (map != null)
        {
            bytestring = map.entrySet().iterator();
            do
            {
                k = j;
                if (!bytestring.hasNext())
                {
                    break;
                }
                bytestring1 = (java.util.Map.Entry)bytestring.next();
                k = a((io.fabric.sdk.android.services.common.IdManager.DeviceIdentifierType)bytestring1.getKey(), (String)bytestring1.getValue());
                j = k + (CodedOutputStream.j(11) + CodedOutputStream.l(k)) + j;
            } while (true);
        } else
        {
            k = j;
        }
        j1 = CodedOutputStream.d(12, i1);
        if (bytestring2 == null)
        {
            j = 0;
        } else
        {
            j = CodedOutputStream.b(13, bytestring2);
        }
        if (bytestring3 == null)
        {
            i1 = 0;
        } else
        {
            i1 = CodedOutputStream.b(14, bytestring3);
        }
        return i1 + (k + j1 + j);
    }

    private int a(ByteString bytestring)
    {
        return CodedOutputStream.b(1, bytestring);
    }

    private int a(ByteString bytestring, ByteString bytestring1, ByteString bytestring2, ByteString bytestring3, int j)
    {
        int k = CodedOutputStream.b(1, bytestring);
        int l = CodedOutputStream.b(2, bytestring1);
        int i1 = CodedOutputStream.b(3, bytestring2);
        int j1 = a();
        return 0 + k + l + i1 + (j1 + (CodedOutputStream.j(5) + CodedOutputStream.l(j1))) + CodedOutputStream.b(6, bytestring3) + CodedOutputStream.e(10, j);
    }

    private int a(ByteString bytestring, ByteString bytestring1, boolean flag)
    {
        return 0 + CodedOutputStream.e(1, 3) + CodedOutputStream.b(2, bytestring) + CodedOutputStream.b(3, bytestring1) + CodedOutputStream.b(4, flag);
    }

    private int a(io.fabric.sdk.android.services.common.IdManager.DeviceIdentifierType deviceidentifiertype, String s)
    {
        return CodedOutputStream.e(1, deviceidentifiertype.protobufIndex) + CodedOutputStream.b(2, ByteString.a(s));
    }

    private int a(StackTraceElement stacktraceelement, boolean flag)
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
        return CodedOutputStream.d(5, k) + j;
    }

    private int a(String s, String s1)
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
        int j = a(thread, e, 4, true);
        int i1 = CodedOutputStream.j(1);
        int j1 = CodedOutputStream.l(j);
        int l = c.length;
        int k = 0;
        j = j + (i1 + j1) + 0;
        for (; k < l; k++)
        {
            i1 = a(c[k], (StackTraceElement[])d.get(k), 0, false);
            j += i1 + (CodedOutputStream.j(1) + CodedOutputStream.l(i1));
        }

        k = a(throwable, 1);
        l = CodedOutputStream.j(2);
        i1 = CodedOutputStream.l(k);
        j1 = c();
        int k1 = CodedOutputStream.j(3);
        int l1 = CodedOutputStream.l(j1);
        int i2 = b();
        return k + (l + i1) + j + (j1 + (k1 + l1)) + (i2 + (CodedOutputStream.j(3) + CodedOutputStream.l(i2)));
    }

    private int a(Thread thread, Throwable throwable, int j, Map map)
    {
        int k = a(thread, throwable);
        k = k + (CodedOutputStream.j(1) + CodedOutputStream.l(k)) + 0;
        int l;
        if (map != null)
        {
            thread = map.entrySet().iterator();
            do
            {
                l = k;
                if (!thread.hasNext())
                {
                    break;
                }
                throwable = (java.util.Map.Entry)thread.next();
                l = a((String)throwable.getKey(), (String)throwable.getValue());
                k = l + (CodedOutputStream.j(2) + CodedOutputStream.l(l)) + k;
            } while (true);
        } else
        {
            l = k;
        }
        k = l;
        if (b != null)
        {
            boolean flag;
            if (b.importance != 100)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            k = l + CodedOutputStream.b(3, flag);
        }
        return CodedOutputStream.d(4, j) + k;
    }

    private int a(Thread thread, Throwable throwable, String s, long l, Map map, float f1, 
            int j, boolean flag, int k, long l1, long l2, 
            ByteString bytestring)
    {
        int i1 = CodedOutputStream.b(1, l);
        int j1 = CodedOutputStream.b(2, ByteString.a(s));
        int k1 = a(thread, throwable, k, map);
        int i2 = CodedOutputStream.j(3);
        int j2 = CodedOutputStream.l(k1);
        j = a(f1, j, flag, k, l1, l2);
        k = 0 + i1 + j1 + (k1 + (i2 + j2)) + (j + (CodedOutputStream.j(5) + CodedOutputStream.l(j)));
        j = k;
        if (bytestring != null)
        {
            j = a(bytestring);
            j = k + (j + (CodedOutputStream.j(6) + CodedOutputStream.l(j)));
        }
        return j;
    }

    private int a(Thread thread, StackTraceElement astacktraceelement[], int j, boolean flag)
    {
        int k = CodedOutputStream.b(1, ByteString.a(thread.getName()));
        k = CodedOutputStream.d(2, j) + k;
        int l = astacktraceelement.length;
        for (j = 0; j < l; j++)
        {
            int i1 = a(astacktraceelement[j], flag);
            k += i1 + (CodedOutputStream.j(3) + CodedOutputStream.l(i1));
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
                int k1 = CodedOutputStream.j(4);
                int l1 = CodedOutputStream.l(j1);
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
                l = k + (j + (CodedOutputStream.j(6) + CodedOutputStream.l(j)));
            }
            return l;
        }
        while (throwable != null) 
        {
            throwable = throwable.getCause();
            l++;
        }
        return k + CodedOutputStream.d(7, l);
    }

    private ByteString a(String s)
    {
        if (s == null)
        {
            return null;
        } else
        {
            return ByteString.a(s);
        }
    }

    private void a(CodedOutputStream codedoutputstream, float f1, int j, boolean flag, int k, long l, 
            long l1)
    {
        codedoutputstream.g(5, 2);
        codedoutputstream.k(a(f1, j, flag, k, l, l1));
        codedoutputstream.a(1, f1);
        codedoutputstream.c(2, j);
        codedoutputstream.a(3, flag);
        codedoutputstream.a(4, k);
        codedoutputstream.a(5, l);
        codedoutputstream.a(6, l1);
    }

    private void a(CodedOutputStream codedoutputstream, int j, StackTraceElement stacktraceelement, boolean flag)
    {
        byte byte0 = 4;
        codedoutputstream.g(j, 2);
        codedoutputstream.k(a(stacktraceelement, flag));
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

    private void a(CodedOutputStream codedoutputstream, ByteString bytestring)
    {
        if (bytestring != null)
        {
            codedoutputstream.g(6, 2);
            codedoutputstream.k(a(bytestring));
            codedoutputstream.a(1, bytestring);
        }
    }

    private void a(CodedOutputStream codedoutputstream, Thread thread, Throwable throwable)
    {
        codedoutputstream.g(1, 2);
        codedoutputstream.k(a(thread, throwable));
        a(codedoutputstream, thread, e, 4, true);
        int k = c.length;
        for (int j = 0; j < k; j++)
        {
            a(codedoutputstream, c[j], (StackTraceElement[])d.get(j), 0, false);
        }

        a(codedoutputstream, throwable, 1, 2);
        codedoutputstream.g(3, 2);
        codedoutputstream.k(c());
        codedoutputstream.a(1, a);
        codedoutputstream.a(2, a);
        codedoutputstream.a(3, 0L);
        codedoutputstream.g(4, 2);
        codedoutputstream.k(b());
        codedoutputstream.a(1, 0L);
        codedoutputstream.a(2, 0L);
        codedoutputstream.a(3, g);
        if (h != null)
        {
            codedoutputstream.a(4, h);
        }
    }

    private void a(CodedOutputStream codedoutputstream, Thread thread, Throwable throwable, int j, Map map)
    {
        codedoutputstream.g(3, 2);
        codedoutputstream.k(a(thread, throwable, j, map));
        a(codedoutputstream, thread, throwable);
        if (map != null && !map.isEmpty())
        {
            a(codedoutputstream, map);
        }
        if (b != null)
        {
            boolean flag;
            if (b.importance != 100)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            codedoutputstream.a(3, flag);
        }
        codedoutputstream.a(4, j);
    }

    private void a(CodedOutputStream codedoutputstream, Thread thread, StackTraceElement astacktraceelement[], int j, boolean flag)
    {
        codedoutputstream.g(1, 2);
        codedoutputstream.k(a(thread, astacktraceelement, j, flag));
        codedoutputstream.a(1, ByteString.a(thread.getName()));
        codedoutputstream.a(2, j);
        int k = astacktraceelement.length;
        for (j = 0; j < k; j++)
        {
            a(codedoutputstream, 3, astacktraceelement[j], flag);
        }

    }

    private void a(CodedOutputStream codedoutputstream, Throwable throwable, int j, int k)
    {
label0:
        {
            boolean flag = false;
            codedoutputstream.g(k, 2);
            codedoutputstream.k(a(throwable, 1));
            codedoutputstream.a(1, ByteString.a(throwable.getClass().getName()));
            Object obj = throwable.getLocalizedMessage();
            if (obj != null)
            {
                codedoutputstream.a(3, ByteString.a(((String) (obj))));
            }
            StackTraceElement astacktraceelement[] = throwable.getStackTrace();
            int l = astacktraceelement.length;
            for (k = 0; k < l; k++)
            {
                a(codedoutputstream, 4, astacktraceelement[k], true);
            }

            astacktraceelement = throwable.getCause();
            if (astacktraceelement != null)
            {
                k = ((flag) ? 1 : 0);
                throwable = astacktraceelement;
                if (j >= i)
                {
                    break label0;
                }
                a(codedoutputstream, ((Throwable) (astacktraceelement)), j + 1, 6);
            }
            return;
        }
        while (throwable != null) 
        {
            throwable = throwable.getCause();
            k++;
        }
        codedoutputstream.a(7, k);
    }

    private void a(CodedOutputStream codedoutputstream, Map map)
    {
        for (Iterator iterator = map.entrySet().iterator(); iterator.hasNext(); codedoutputstream.a(2, ByteString.a(map)))
        {
            map = (java.util.Map.Entry)iterator.next();
            codedoutputstream.g(2, 2);
            codedoutputstream.k(a((String)map.getKey(), (String)map.getValue()));
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
        int k = 0 + CodedOutputStream.b(1, 0L) + CodedOutputStream.b(2, 0L) + CodedOutputStream.b(3, g);
        int j = k;
        if (h != null)
        {
            j = k + CodedOutputStream.b(4, h);
        }
        return j;
    }

    private int c()
    {
        return 0 + CodedOutputStream.b(1, a) + CodedOutputStream.b(2, a) + CodedOutputStream.b(3, 0L);
    }

    public void a(CodedOutputStream codedoutputstream, long l, Thread thread, Throwable throwable, String s, Thread athread[], 
            float f1, int j, boolean flag, int k, long l1, long l2, android.app.ActivityManager.RunningAppProcessInfo runningappprocessinfo, List list, StackTraceElement astacktraceelement[], LogFileManager logfilemanager, Map map)
    {
        b = runningappprocessinfo;
        d = list;
        e = astacktraceelement;
        c = athread;
        athread = logfilemanager.a();
        if (athread == null)
        {
            Fabric.g().a("Fabric", "No log data to include with this event.");
        }
        logfilemanager.b();
        codedoutputstream.g(10, 2);
        codedoutputstream.k(a(thread, throwable, s, l, map, f1, j, flag, k, l1, l2, ((ByteString) (athread))));
        codedoutputstream.a(1, l);
        codedoutputstream.a(2, ByteString.a(s));
        a(codedoutputstream, thread, throwable, k, map);
        a(codedoutputstream, f1, j, flag, k, l1, l2);
        a(codedoutputstream, ((ByteString) (athread)));
    }

    public void a(CodedOutputStream codedoutputstream, String s, int j, String s1, int k, long l, 
            long l1, boolean flag, Map map, int i1, String s2, String s3)
    {
        s = ByteString.a(s);
        ByteString bytestring = a(s1);
        s1 = a(s3);
        s2 = a(s2);
        codedoutputstream.g(9, 2);
        codedoutputstream.k(a(j, ((ByteString) (s)), bytestring, k, l, l1, flag, map, i1, ((ByteString) (s2)), ((ByteString) (s1))));
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
            codedoutputstream.g(11, 2);
            codedoutputstream.k(a((io.fabric.sdk.android.services.common.IdManager.DeviceIdentifierType)map.getKey(), (String)map.getValue()));
            codedoutputstream.b(1, ((io.fabric.sdk.android.services.common.IdManager.DeviceIdentifierType)map.getKey()).protobufIndex);
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

    public void a(CodedOutputStream codedoutputstream, String s, String s1, long l)
    {
        codedoutputstream.a(1, ByteString.a(s1));
        codedoutputstream.a(2, ByteString.a(s));
        codedoutputstream.a(3, l);
    }

    public void a(CodedOutputStream codedoutputstream, String s, String s1, String s2)
    {
        Object obj = s;
        if (s == null)
        {
            obj = "";
        }
        s = ByteString.a(((String) (obj)));
        obj = a(s1);
        ByteString bytestring = a(s2);
        int k = 0 + CodedOutputStream.b(1, s);
        int j = k;
        if (s1 != null)
        {
            j = k + CodedOutputStream.b(2, ((ByteString) (obj)));
        }
        k = j;
        if (s2 != null)
        {
            k = j + CodedOutputStream.b(3, bytestring);
        }
        codedoutputstream.g(6, 2);
        codedoutputstream.k(k);
        codedoutputstream.a(1, s);
        if (s1 != null)
        {
            codedoutputstream.a(2, ((ByteString) (obj)));
        }
        if (s2 != null)
        {
            codedoutputstream.a(3, bytestring);
        }
    }

    public void a(CodedOutputStream codedoutputstream, String s, String s1, String s2, String s3, int j)
    {
        s = ByteString.a(s);
        s1 = ByteString.a(s1);
        s2 = ByteString.a(s2);
        s3 = ByteString.a(s3);
        codedoutputstream.g(7, 2);
        codedoutputstream.k(a(((ByteString) (s)), ((ByteString) (s1)), ((ByteString) (s2)), ((ByteString) (s3)), j));
        codedoutputstream.a(1, s);
        codedoutputstream.a(2, s1);
        codedoutputstream.a(3, s2);
        codedoutputstream.g(5, 2);
        codedoutputstream.k(a());
        codedoutputstream.a(1, (new ApiKey()).a(f));
        codedoutputstream.a(6, s3);
        codedoutputstream.b(10, j);
    }

    public void a(CodedOutputStream codedoutputstream, boolean flag)
    {
        ByteString bytestring = ByteString.a(android.os.Build.VERSION.RELEASE);
        ByteString bytestring1 = ByteString.a(android.os.Build.VERSION.CODENAME);
        codedoutputstream.g(8, 2);
        codedoutputstream.k(a(bytestring, bytestring1, flag));
        codedoutputstream.b(1, 3);
        codedoutputstream.a(2, bytestring);
        codedoutputstream.a(3, bytestring1);
        codedoutputstream.a(4, flag);
    }

}
