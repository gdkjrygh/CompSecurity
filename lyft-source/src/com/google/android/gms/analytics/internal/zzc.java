// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.analytics.GoogleAnalytics;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.internal.zzlb;
import com.google.android.gms.internal.zzns;

// Referenced classes of package com.google.android.gms.analytics.internal:
//            zzf, zzaf, zzy, zzr, 
//            zzu, zzb, zzv, zzan, 
//            zzai, zzn, zza, zzk

public class zzc
{

    private final zzf a;

    protected zzc(zzf zzf1)
    {
        zzu.a(zzf1);
        a = zzf1;
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
        zzaf zzaf1 = null;
        if (a != null)
        {
            zzaf1 = a.g();
        }
        if (zzaf1 != null)
        {
            zzaf1.a(i, s1, obj, obj1, obj2);
        } else
        {
            String s2 = (String)zzy.c.a();
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

    protected com.google.android.gms.analytics.internal.zzu A()
    {
        return a.r();
    }

    public boolean B()
    {
        return Log.isLoggable((String)zzy.c.a(), 2);
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

    public zzf k()
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

    protected zzlb n()
    {
        return a.d();
    }

    protected Context o()
    {
        return a.b();
    }

    protected zzaf p()
    {
        return a.f();
    }

    protected zzr q()
    {
        return a.e();
    }

    protected zzns r()
    {
        return a.h();
    }

    public GoogleAnalytics s()
    {
        return a.k();
    }

    protected zzb t()
    {
        return a.i();
    }

    protected zzv u()
    {
        return a.j();
    }

    protected zzan v()
    {
        return a.l();
    }

    protected zzai w()
    {
        return a.m();
    }

    protected zzn x()
    {
        return a.p();
    }

    protected zza y()
    {
        return a.o();
    }

    protected zzk z()
    {
        return a.q();
    }
}
