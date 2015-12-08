// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;

public class jrj
{

    public final jrk d;

    public jrj(jrk jrk1)
    {
        b.d(jrk1);
        d = jrk1;
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

    private void a(int i1, String s, Object obj, Object obj1, Object obj2)
    {
        jso jso1 = null;
        if (d != null)
        {
            jso1 = d.e;
        }
        if (jso1 != null)
        {
            jso1.a(i1, s, obj, obj1, obj2);
        } else
        {
            String s1 = (String)jsl.b.a();
            if (Log.isLoggable(s1, i1))
            {
                Log.println(i1, s1, c(s, obj, obj1, obj2));
                return;
            }
        }
    }

    protected static String c(String s, Object obj, Object obj1, Object obj2)
    {
        String s1 = s;
        if (s == null)
        {
            s1 = "";
        }
        String s2 = a(obj);
        obj1 = a(obj1);
        obj2 = a(obj2);
        StringBuilder stringbuilder = new StringBuilder();
        s = "";
        if (!TextUtils.isEmpty(s1))
        {
            stringbuilder.append(s1);
            s = ": ";
        }
        obj = s;
        if (!TextUtils.isEmpty(s2))
        {
            stringbuilder.append(s);
            stringbuilder.append(s2);
            obj = ", ";
        }
        s = ((String) (obj));
        if (!TextUtils.isEmpty(((CharSequence) (obj1))))
        {
            stringbuilder.append(((String) (obj)));
            stringbuilder.append(((String) (obj1)));
            s = ", ";
        }
        if (!TextUtils.isEmpty(((CharSequence) (obj2))))
        {
            stringbuilder.append(s);
            stringbuilder.append(((String) (obj2)));
        }
        return stringbuilder.toString();
    }

    public static boolean l()
    {
        return Log.isLoggable((String)jsl.b.a(), 2);
    }

    public final void a(String s, Object obj)
    {
        a(2, s, obj, null, null);
    }

    public final void a(String s, Object obj, Object obj1)
    {
        a(2, s, obj, obj1, null);
    }

    public final void a(String s, Object obj, Object obj1, Object obj2)
    {
        a(3, s, obj, obj1, obj2);
    }

    public final void b(String s)
    {
        a(2, s, null, null, null);
    }

    public final void b(String s, Object obj)
    {
        a(3, s, obj, null, null);
    }

    public final void b(String s, Object obj, Object obj1)
    {
        a(3, s, obj, obj1, null);
    }

    public final void b(String s, Object obj, Object obj1, Object obj2)
    {
        a(5, s, obj, obj1, obj2);
    }

    public final void c(String s)
    {
        a(3, s, null, null, null);
    }

    public final void c(String s, Object obj)
    {
        a(4, s, obj, null, null);
    }

    public final void c(String s, Object obj, Object obj1)
    {
        a(5, s, obj, obj1, null);
    }

    public final void d(String s)
    {
        a(4, s, null, null, null);
    }

    public final void d(String s, Object obj)
    {
        a(5, s, obj, null, null);
    }

    public final void d(String s, Object obj, Object obj1)
    {
        a(6, s, obj, obj1, null);
    }

    public final void e(String s)
    {
        a(5, s, null, null, null);
    }

    public final void e(String s, Object obj)
    {
        a(6, s, obj, null, null);
    }

    protected final void f()
    {
        if (kbe.a)
        {
            throw new IllegalStateException("Call only supported on the client side");
        } else
        {
            return;
        }
    }

    public final void f(String s)
    {
        a(6, s, null, null, null);
    }

    public final kdh g()
    {
        return d.c;
    }

    protected final Context h()
    {
        return d.a;
    }

    protected final jsh i()
    {
        return d.d;
    }

    protected final jsj j()
    {
        jrk jrk1 = d;
        jrk.a(jrk1.f);
        return jrk1.f;
    }

    protected final jss k()
    {
        jrk jrk1 = d;
        jrk.a(jrk1.g);
        return jrk1.g;
    }
}
