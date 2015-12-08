// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.analytics.c;
import com.google.android.gms.common.internal.g;
import com.google.android.gms.common.internal.y;
import com.google.android.gms.internal.io;
import com.google.android.gms.internal.je;

// Referenced classes of package com.google.android.gms.analytics.internal:
//            s, g, al, ae, 
//            o, ai, n, j, 
//            aa, a, x, ah

public class p
{

    private final s a;

    protected p(s s1)
    {
        com.google.android.gms.common.internal.y.a(s1);
        a = s1;
    }

    private static String a(Object obj)
    {
        if (obj == null)
        {
            return "";
        }
        if (obj instanceof String)
        {
            return (String)obj;
        }
        if (obj instanceof Boolean)
        {
            if (obj == Boolean.TRUE)
            {
                return "true";
            } else
            {
                return "false";
            }
        }
        if (obj instanceof Throwable)
        {
            return ((Throwable)obj).toString();
        } else
        {
            return obj.toString();
        }
    }

    private void a(int i, String s1, Object obj, Object obj1, Object obj2)
    {
        com.google.android.gms.analytics.internal.g g1 = null;
        if (a != null)
        {
            g1 = a.f();
        }
        if (g1 != null)
        {
            g1.a(i, s1, obj, obj1, obj2);
        } else
        {
            String s2 = (String)com.google.android.gms.analytics.internal.al.c.a();
            if (Log.isLoggable(s2, i))
            {
                Log.println(i, s2, c(s1, obj, obj1, obj2));
                return;
            }
        }
    }

    protected static String c(String s1, Object obj, Object obj1, Object obj2)
    {
        String s2 = s1;
        if (s1 == null)
        {
            s2 = "";
        }
        String s3 = a(obj);
        obj1 = a(obj1);
        obj2 = a(obj2);
        StringBuilder stringbuilder = new StringBuilder();
        s1 = "";
        if (!TextUtils.isEmpty(s2))
        {
            stringbuilder.append(s2);
            s1 = ": ";
        }
        obj = s1;
        if (!TextUtils.isEmpty(s3))
        {
            stringbuilder.append(s1);
            stringbuilder.append(s3);
            obj = ", ";
        }
        s1 = ((String) (obj));
        if (!TextUtils.isEmpty(((CharSequence) (obj1))))
        {
            stringbuilder.append(((String) (obj)));
            stringbuilder.append(((String) (obj1)));
            s1 = ", ";
        }
        if (!TextUtils.isEmpty(((CharSequence) (obj2))))
        {
            stringbuilder.append(s1);
            stringbuilder.append(((String) (obj2)));
        }
        return stringbuilder.toString();
    }

    protected static void k()
    {
        if (g.a)
        {
            throw new IllegalStateException("Call only supported on the client side");
        } else
        {
            return;
        }
    }

    public static boolean z()
    {
        return Log.isLoggable((String)com.google.android.gms.analytics.internal.al.c.a(), 2);
    }

    public final void a(String s1, Object obj)
    {
        a(2, s1, obj, null, null);
    }

    public final void a(String s1, Object obj, Object obj1)
    {
        a(2, s1, obj, obj1, null);
    }

    public final void a(String s1, Object obj, Object obj1, Object obj2)
    {
        a(3, s1, obj, obj1, obj2);
    }

    public final void b(String s1, Object obj)
    {
        a(3, s1, obj, null, null);
    }

    public final void b(String s1, Object obj, Object obj1)
    {
        a(3, s1, obj, obj1, null);
    }

    public final void b(String s1, Object obj, Object obj1, Object obj2)
    {
        a(5, s1, obj, obj1, obj2);
    }

    public final void c(String s1)
    {
        a(2, s1, null, null, null);
    }

    public final void c(String s1, Object obj)
    {
        a(4, s1, obj, null, null);
    }

    public final void c(String s1, Object obj, Object obj1)
    {
        a(5, s1, obj, obj1, null);
    }

    public final void d(String s1)
    {
        a(3, s1, null, null, null);
    }

    public final void d(String s1, Object obj)
    {
        a(5, s1, obj, null, null);
    }

    public final void d(String s1, Object obj, Object obj1)
    {
        a(6, s1, obj, obj1, null);
    }

    public final void e(String s1)
    {
        a(4, s1, null, null, null);
    }

    public final void e(String s1, Object obj)
    {
        a(6, s1, obj, null, null);
    }

    public final void f(String s1)
    {
        a(5, s1, null, null, null);
    }

    public final void g(String s1)
    {
        a(6, s1, null, null, null);
    }

    public final s j()
    {
        return a;
    }

    protected final io l()
    {
        return a.c();
    }

    protected final Context m()
    {
        return a.a();
    }

    protected final com.google.android.gms.analytics.internal.g n()
    {
        return a.e();
    }

    protected final ae o()
    {
        return a.d();
    }

    protected final je p()
    {
        return a.g();
    }

    public final c q()
    {
        return a.j();
    }

    protected final o r()
    {
        return a.h();
    }

    protected final ai s()
    {
        return a.i();
    }

    protected final n t()
    {
        return a.k();
    }

    protected final j u()
    {
        return a.l();
    }

    protected final aa v()
    {
        return a.o();
    }

    protected final a w()
    {
        return a.n();
    }

    protected final x x()
    {
        return a.p();
    }

    protected final ah y()
    {
        return a.q();
    }
}
