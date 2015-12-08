// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import android.util.Log;

public class bnc
{

    public final bnf f;

    public bnc(bnf bnf1)
    {
        btl.a(bnf1);
        f = bnf1;
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

    protected static String a(String s, Object obj, Object obj1, Object obj2)
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

    public static boolean k()
    {
        return Log.isLoggable((String)bnz.b.a, 2);
    }

    void a(int l, String s, Object obj, Object obj1, Object obj2)
    {
        bmp bmp1 = null;
        if (f != null)
        {
            bmp1 = f.e;
        }
        if (bmp1 != null)
        {
            bmp1.a(l, s, obj, obj1, obj2);
        } else
        {
            String s1 = (String)bnz.b.a;
            if (Log.isLoggable(s1, l))
            {
                Log.println(l, s1, a(s, obj, obj1, obj2));
                return;
            }
        }
    }

    public final void a(String s, Object obj)
    {
        a(2, s, obj, null, null);
    }

    public final void a(String s, Object obj, Object obj1)
    {
        a(2, s, obj, obj1, null);
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

    public final void f(String s)
    {
        a(6, s, null, null, null);
    }

    protected final bnw i()
    {
        bnf bnf1 = f;
        bnf.a(bnf1.f);
        return bnf1.f;
    }

    protected final bmt j()
    {
        bnf bnf1 = f;
        bnf.a(bnf1.g);
        return bnf1.g;
    }
}
