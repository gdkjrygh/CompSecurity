// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.zzd;
import com.google.android.gms.common.internal.zzx;

// Referenced classes of package com.google.android.gms.analytics.internal:
//            Z, v, g, W, 
//            j

public class s
{

    public final v i;

    public s(v v1)
    {
        zzx.zzv(v1);
        i = v1;
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

    protected static String a(String s1, Object obj, Object obj1, Object obj2)
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

    protected static void j()
    {
        if (zzd.zzacF)
        {
            throw new IllegalStateException("Call only supported on the client side");
        } else
        {
            return;
        }
    }

    public static boolean m()
    {
        return Log.isLoggable((String)Z.c.a(), 2);
    }

    public void a(int i1, String s1, Object obj, Object obj1, Object obj2)
    {
        g g1 = null;
        if (i != null)
        {
            g1 = i.e;
        }
        if (g1 != null)
        {
            g1.a(i1, s1, obj, obj1, obj2);
        } else
        {
            String s2 = (String)Z.c.a();
            if (Log.isLoggable(s2, i1))
            {
                Log.println(i1, s2, a(s1, obj, obj1, obj2));
                return;
            }
        }
    }

    public final void a(String s1, Object obj)
    {
        a(2, s1, obj, null, null);
    }

    public final void a(String s1, Object obj, Object obj1)
    {
        a(2, s1, obj, obj1, null);
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

    public final void c(String s1)
    {
        a(3, s1, null, null, null);
    }

    public final void c(String s1, Object obj)
    {
        a(5, s1, obj, null, null);
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
        a(6, s1, obj, null, null);
    }

    public final void d(String s1, Object obj, Object obj1)
    {
        a(6, s1, obj, obj1, null);
    }

    public final void e(String s1)
    {
        a(5, s1, null, null, null);
    }

    public final void f(String s1)
    {
        a(6, s1, null, null, null);
    }

    protected final W k()
    {
        v v1 = i;
        v.a(v1.f);
        return v1.f;
    }

    protected final j l()
    {
        v v1 = i;
        v.a(v1.g);
        return v1.g;
    }
}
