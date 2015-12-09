// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package net.hockeyapp.android.d;

import android.content.Context;
import android.content.SharedPreferences;

public class g
{

    private SharedPreferences a;
    private android.content.SharedPreferences.Editor b;
    private SharedPreferences c;
    private android.content.SharedPreferences.Editor d;

    private g()
    {
    }

    g(_cls1 _pcls1)
    {
        this();
    }

    public static g a()
    {
    /* block-local class not found */
    class a {}

        return a.a;
    }

    public static void a(android.content.SharedPreferences.Editor editor)
    {
        if (b().booleanValue())
        {
            editor.apply();
            return;
        } else
        {
            editor.commit();
            return;
        }
    }

    public static Boolean b()
    {
        boolean flag;
        if (android.os.Build.VERSION.SDK_INT >= 9)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return Boolean.valueOf(flag);
        NoClassDefFoundError noclassdeffounderror;
        noclassdeffounderror;
        return Boolean.valueOf(false);
    }

    public String a(Context context)
    {
        if (context != null)
        {
            a = context.getSharedPreferences("net.hockeyapp.android.prefs_feedback_token", 0);
            if (a != null)
            {
                return a.getString("net.hockeyapp.android.prefs_key_feedback_token", null);
            }
        }
        return null;
    }

    public void a(Context context, String s)
    {
        if (context != null)
        {
            a = context.getSharedPreferences("net.hockeyapp.android.prefs_feedback_token", 0);
            if (a != null)
            {
                b = a.edit();
                b.putString("net.hockeyapp.android.prefs_key_feedback_token", s);
                a(b);
            }
        }
    }

    public void a(Context context, String s, String s1, String s2)
    {
        if (context != null)
        {
            c = context.getSharedPreferences("net.hockeyapp.android.prefs_name_email", 0);
            if (c != null)
            {
                d = c.edit();
                if (s == null || s1 == null || s2 == null)
                {
                    d.putString("net.hockeyapp.android.prefs_key_name_email", null);
                } else
                {
                    d.putString("net.hockeyapp.android.prefs_key_name_email", String.format("%s|%s|%s", new Object[] {
                        s, s1, s2
                    }));
                }
                a(d);
            }
        }
    }

    public String b(Context context)
    {
        if (context != null)
        {
            c = context.getSharedPreferences("net.hockeyapp.android.prefs_name_email", 0);
            if (c != null)
            {
                return c.getString("net.hockeyapp.android.prefs_key_name_email", null);
            }
        }
        return null;
    }
}
