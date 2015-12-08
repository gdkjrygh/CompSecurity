// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.c.f;
import com.google.android.gms.common.internal.bl;
import com.google.android.gms.common.internal.i;
import com.google.android.gms.internal.wg;

// Referenced classes of package com.google.android.gms.analytics.internal:
//            aa, j, bh, bi, 
//            az, s, be, r, 
//            n, as, b, al, 
//            bd

public class x
{

    private final aa a;

    protected x(aa aa1)
    {
        bl.a(aa1);
        a = aa1;
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

    private void a(int i1, String s1, Object obj, Object obj1, Object obj2)
    {
        j j1 = null;
        if (a != null)
        {
            j1 = a.f();
        }
        if (j1 != null)
        {
            j1.a(i1, s1, obj, obj1, obj2);
        } else
        {
            String s2 = (String)bh.c.a();
            if (Log.isLoggable(s2, i1))
            {
                Log.println(i1, s2, c(s1, obj, obj1, obj2));
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
        if (i.a)
        {
            throw new IllegalStateException("Call only supported on the client side");
        } else
        {
            return;
        }
    }

    public static boolean z()
    {
        return Log.isLoggable((String)bh.c.a(), 2);
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

    public final void b(String s1)
    {
        a(2, s1, null, null, null);
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
        a(3, s1, null, null, null);
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
        a(4, s1, null, null, null);
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
        a(5, s1, null, null, null);
    }

    public final void e(String s1, Object obj)
    {
        a(6, s1, obj, null, null);
    }

    public final void f(String s1)
    {
        a(6, s1, null, null, null);
    }

    public final aa j()
    {
        return a;
    }

    protected final wg l()
    {
        return a.c();
    }

    protected final Context m()
    {
        return a.a();
    }

    protected final j n()
    {
        return a.e();
    }

    protected final az o()
    {
        return a.d();
    }

    protected final f p()
    {
        return a.g();
    }

    public final com.google.android.gms.analytics.f q()
    {
        return a.j();
    }

    protected final s r()
    {
        return a.h();
    }

    protected final be s()
    {
        return a.i();
    }

    protected final r t()
    {
        return a.k();
    }

    protected final n u()
    {
        return a.l();
    }

    protected final as v()
    {
        return a.o();
    }

    protected final b w()
    {
        return a.n();
    }

    protected final al x()
    {
        return a.p();
    }

    protected final bd y()
    {
        return a.q();
    }
}
