// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.analytics.f;
import com.google.android.gms.common.internal.u;
import com.google.android.gms.d.ad;
import com.google.android.gms.d.q;

// Referenced classes of package com.google.android.gms.analytics.internal:
//            ab, j, bj, bk, 
//            bb, bf, t, bg, 
//            s, n, au, b, 
//            am

public class y
{

    private final ab a;

    protected y(ab ab1)
    {
        com.google.android.gms.common.internal.u.a(ab1);
        a = ab1;
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
                obj = "true";
            } else
            {
                obj = "false";
            }
            return ((String) (obj));
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
        j j1 = null;
        if (a != null)
        {
            j1 = a.g();
        }
        if (j1 != null)
        {
            j1.a(i, s1, obj, obj1, obj2);
        } else
        {
            String s2 = (String)bj.c.a();
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

    protected bf A()
    {
        return a.r();
    }

    public boolean B()
    {
        return Log.isLoggable((String)bj.c.a(), 2);
    }

    public void a(String s1, Object obj)
    {
        a(2, s1, obj, null, null);
    }

    public void a(String s1, Object obj, Object obj1)
    {
        a(2, s1, obj, obj1, null);
    }

    public void a(String s1, Object obj, Object obj1, Object obj2)
    {
        a(3, s1, obj, obj1, obj2);
    }

    public void b(String s1)
    {
        a(2, s1, null, null, null);
    }

    public void b(String s1, Object obj)
    {
        a(3, s1, obj, null, null);
    }

    public void b(String s1, Object obj, Object obj1)
    {
        a(3, s1, obj, obj1, null);
    }

    public void b(String s1, Object obj, Object obj1, Object obj2)
    {
        a(5, s1, obj, obj1, obj2);
    }

    public void c(String s1)
    {
        a(3, s1, null, null, null);
    }

    public void c(String s1, Object obj)
    {
        a(4, s1, obj, null, null);
    }

    public void c(String s1, Object obj, Object obj1)
    {
        a(5, s1, obj, obj1, null);
    }

    public void d(String s1)
    {
        a(4, s1, null, null, null);
    }

    public void d(String s1, Object obj)
    {
        a(5, s1, obj, null, null);
    }

    public void d(String s1, Object obj, Object obj1)
    {
        a(6, s1, obj, obj1, null);
    }

    public void e(String s1)
    {
        a(5, s1, null, null, null);
    }

    public void e(String s1, Object obj)
    {
        a(6, s1, obj, null, null);
    }

    public void f(String s1)
    {
        a(6, s1, null, null, null);
    }

    public ab k()
    {
        return a;
    }

    protected void l()
    {
        if (q().a())
        {
            throw new IllegalStateException("Call only supported on the client side");
        } else
        {
            return;
        }
    }

    protected void m()
    {
        a.s();
    }

    protected q n()
    {
        return a.d();
    }

    protected Context o()
    {
        return a.b();
    }

    protected j p()
    {
        return a.f();
    }

    protected bb q()
    {
        return a.e();
    }

    protected ad r()
    {
        return a.h();
    }

    public f s()
    {
        return a.k();
    }

    protected t t()
    {
        return a.i();
    }

    protected bg u()
    {
        return a.j();
    }

    protected s v()
    {
        return a.l();
    }

    protected n w()
    {
        return a.m();
    }

    protected au x()
    {
        return a.p();
    }

    protected b y()
    {
        return a.o();
    }

    protected am z()
    {
        return a.q();
    }
}
