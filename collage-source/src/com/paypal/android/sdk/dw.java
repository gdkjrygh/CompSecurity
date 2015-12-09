// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk;

import android.util.Log;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

// Referenced classes of package com.paypal.android.sdk:
//            dx, as, ef, du, 
//            ap

public abstract class dw
{

    private static final String a = com/paypal/android/sdk/dw.getSimpleName();
    private static long j = 1L;
    private String b;
    private String c;
    private Map d;
    private final dx e;
    private final ef f;
    private du g;
    private String h;
    private ap i;
    private long k;
    private Integer l;
    private String m;

    public dw(du du, dx dx1, ef ef)
    {
        this(du, dx1, ef, null);
    }

    public dw(du du, dx dx1, ef ef, String s1)
    {
        long l1 = j;
        j = 1L + l1;
        k = l1;
        g = du;
        h = s1;
        e = dx1;
        f = ef;
        d = new LinkedHashMap();
    }

    public static void l()
    {
    }

    public String a(du du)
    {
        String s1 = e.a(du);
        if (s1 != null)
        {
            du = s1;
            if (h != null)
            {
                du = (new StringBuilder()).append(s1).append(h).toString();
            }
            return du;
        } else
        {
            throw new RuntimeException((new StringBuilder("API ")).append(du.toString()).append(" has no record for server ").append(e.c()).toString());
        }
    }

    public final void a(ap ap)
    {
        if (i != null)
        {
            IllegalStateException illegalstateexception = new IllegalStateException("Multiple exceptions reported");
            Log.e(a, (new StringBuilder("first error=")).append(i).toString());
            Log.e(a, (new StringBuilder("second error=")).append(ap).toString());
            Log.e(a, "", illegalstateexception);
            throw illegalstateexception;
        } else
        {
            i = ap;
            return;
        }
    }

    public final void a(Integer integer)
    {
        l = integer;
    }

    public final void a(String s1)
    {
        b = s1;
    }

    protected final void a(String s1, String s2)
    {
        d.put(s1, s2);
    }

    public final void a(String s1, String s2, String s3)
    {
        a(((ap) (new as(s1, s2, s3))));
    }

    public boolean a()
    {
        return false;
    }

    public abstract String b();

    public final void b(String s1)
    {
        c = s1;
    }

    public abstract void c();

    public final void c(String s1)
    {
        m = s1;
    }

    public abstract void d();

    public abstract String e();

    public final ef f()
    {
        return f;
    }

    public final String g()
    {
        return b;
    }

    public final String h()
    {
        return c;
    }

    public final du i()
    {
        return g;
    }

    public final Map j()
    {
        return d;
    }

    public final String k()
    {
        return m;
    }

    public void m()
    {
    }

    protected final JSONObject n()
    {
        String s1 = c;
        Object obj = (new JSONTokener(s1)).nextValue();
        if (!(obj instanceof JSONObject))
        {
            throw new JSONException((new StringBuilder("could not parse:")).append(s1).append("\nnextValue:").append(obj).toString());
        } else
        {
            return (JSONObject)obj;
        }
    }

    public final String o()
    {
        return (new StringBuilder()).append(getClass().getSimpleName()).append(" SN:").append(k).toString();
    }

    public final long p()
    {
        return k;
    }

    public final ap q()
    {
        return i;
    }

    public final boolean r()
    {
        return i == null;
    }

    public final Integer s()
    {
        return l;
    }

    public final dx t()
    {
        return e;
    }

}
