// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.android.c;

import com.kik.n.a.j.c;
import java.util.Comparator;
import kik.android.util.DeviceUtils;
import org.json.JSONException;
import org.json.JSONObject;

public class e
{
    public static final class a
        implements Comparator
    {

        public final int compare(Object obj, Object obj1)
        {
            obj = (e)obj;
            obj1 = (e)obj1;
            if (obj != null || obj1 != null) goto _L2; else goto _L1
_L1:
            return 0;
_L2:
            if (obj == null)
            {
                return -1;
            }
            if (obj1 == null)
            {
                break; /* Loop/switch isn't completed */
            }
            if (((e) (obj)).i() == ((e) (obj1)).i())
            {
                continue; /* Loop/switch isn't completed */
            }
            if (((e) (obj)).i() < ((e) (obj1)).i())
            {
                return -1;
            }
            break; /* Loop/switch isn't completed */
            if (true) goto _L1; else goto _L3
_L3:
            return 1;
        }

        public a()
        {
        }
    }


    private String a;
    private String b;
    private String c;
    private String d;
    private boolean e;
    private boolean f;
    private long g;

    protected e(String s, String s1, String s2, String s3, long l)
    {
        d = s1;
        a = s;
        b = s2;
        c = s3;
        f = true;
        g = l;
        e = false;
    }

    static e a(String s, String s1, String s2, String s3, long l)
    {
        return new e(s, s1, s2, s3, l);
    }

    private static String a()
    {
        if (DeviceUtils.c())
        {
            return "https://kik-shop-dev.herokuapp.com/#";
        } else
        {
            return "https://my.kik.com/#";
        }
    }

    public static String a(String s)
    {
        JSONObject jsonobject = new JSONObject();
        try
        {
            jsonobject.put("smiley_id", s);
        }
        // Misplaced declaration of an exception variable
        catch (String s) { }
        return (new StringBuilder()).append(a()).append(jsonobject.toString()).toString();
    }

    public static String b(String s)
    {
        JSONObject jsonobject = new JSONObject();
        try
        {
            jsonobject.put("type", s);
        }
        // Misplaced declaration of an exception variable
        catch (String s) { }
        return (new StringBuilder()).append(a()).append(jsonobject.toString()).toString();
    }

    public c b()
    {
        c c1 = new c();
        c1.b(b);
        c1.a(Long.valueOf(g));
        c1.d(c);
        c1.a(d);
        c1.c(a);
        return c1;
    }

    final void c()
    {
        e = true;
    }

    public final String d()
    {
        return a;
    }

    public final String e()
    {
        return b;
    }

    public final String f()
    {
        return c;
    }

    public final String g()
    {
        return d;
    }

    public final boolean h()
    {
        return e;
    }

    public final long i()
    {
        return g;
    }
}
