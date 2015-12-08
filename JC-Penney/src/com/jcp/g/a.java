// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.g;

import android.content.Context;
import android.content.SharedPreferences;
import com.jcp.pojo.Accordion;
import com.squareup.a.ak;
import java.util.List;

public class a
{

    private static boolean a;
    private static boolean b;
    private static boolean c;
    private static boolean d;
    private static Context e;
    private static boolean h;
    private static a i;
    private List f;
    private Accordion g[];

    public a(Context context)
    {
        e = context;
        i = this;
        b();
    }

    public static ak a()
    {
        return ak.a(e);
    }

    public static void a(boolean flag)
    {
        a = flag;
    }

    public static void b(boolean flag)
    {
        b = flag;
    }

    public static void c(boolean flag)
    {
        c = flag;
    }

    public static void d(boolean flag)
    {
        d = flag;
    }

    public static void e(boolean flag)
    {
        h = flag;
    }

    public static boolean f()
    {
        return a;
    }

    public static boolean g()
    {
        return b;
    }

    public static boolean h()
    {
        return c;
    }

    public static boolean i()
    {
        return d;
    }

    public static boolean j()
    {
        return h;
    }

    public String a(String s)
    {
        if (e != null)
        {
            s = e.getSharedPreferences("SAVED_ITEM_ID", 1).getString(s, "null");
            if (s != null && !s.equals("null"))
            {
                return s;
            } else
            {
                return "null";
            }
        } else
        {
            return "null";
        }
    }

    public void a(String s, String s1)
    {
        android.content.SharedPreferences.Editor editor = b();
        editor.putString(s, s1);
        editor.commit();
    }

    public void a(List list)
    {
        f = list;
    }

    public void a(Accordion aaccordion[])
    {
        g = aaccordion;
    }

    public android.content.SharedPreferences.Editor b()
    {
        if (e != null)
        {
            return e.getSharedPreferences("SAVED_ITEM_ID", 1).edit();
        } else
        {
            return null;
        }
    }

    public void b(String s)
    {
        android.content.SharedPreferences.Editor editor = b();
        editor.remove(s);
        editor.commit();
    }

    public Accordion[] c()
    {
        return g;
    }

    public void d()
    {
    }

    public List e()
    {
        return f;
    }
}
