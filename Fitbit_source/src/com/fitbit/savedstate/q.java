// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.savedstate;

import android.content.Context;
import android.content.SharedPreferences;
import com.fitbit.util.o;
import java.util.Date;

// Referenced classes of package com.fitbit.savedstate:
//            a

public class q extends a
{

    private static final String b = "SHOW_WHATS_NEW";
    private static final String c = "SHOW_WHATS_NEW_SIMULATION";
    private static final q d = new q();
    private static final String e = "WHATS_NEW_CLICKED_NAME";
    private static final String f = "WHATS_NEW_SAVED_NAME";
    private static final String g = "WHATS_NEW_SAVED_DATE";

    q()
    {
        super("ShowWhatsNewSavedState");
    }

    private static void a(boolean flag)
    {
        android.content.SharedPreferences.Editor editor = d.b().edit();
        editor.putBoolean("SHOW_WHATS_NEW_SIMULATION", flag);
        editor.apply();
    }

    public static boolean a(String s)
    {
        SharedPreferences sharedpreferences = d.b();
        String s1 = sharedpreferences.getString("WHATS_NEW_SAVED_NAME", "");
        long l = sharedpreferences.getLong("WHATS_NEW_SAVED_DATE", 0L);
        if (!s1.equals(s))
        {
            sharedpreferences.edit().putLong("WHATS_NEW_SAVED_DATE", o.a(new Date(), 30, 6).getTime()).apply();
            sharedpreferences.edit().putString("WHATS_NEW_SAVED_NAME", s).apply();
        } else
        {
            if ((new Date(l)).before(new Date()))
            {
                return false;
            }
            if (s.equals(sharedpreferences.getString("WHATS_NEW_CLICKED_NAME", "")))
            {
                return false;
            }
        }
        return true;
    }

    public static void b(String s)
    {
        d.c().putString("WHATS_NEW_CLICKED_NAME", s).apply();
    }

    protected static a g()
    {
        return d;
    }

    public static void h()
    {
        boolean flag;
        if (!i())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a(flag);
    }

    public static boolean i()
    {
        return d.b().getBoolean("SHOW_WHATS_NEW_SIMULATION", false);
    }

    public volatile int a()
    {
        return super.a();
    }

    public volatile SharedPreferences a(Context context)
    {
        return super.a(context);
    }

    public volatile void a(Context context, int j, int k, android.content.SharedPreferences.Editor editor)
    {
        super.a(context, j, k, editor);
    }

    public volatile SharedPreferences b()
    {
        return super.b();
    }

    public void b(Context context, int j, int k, android.content.SharedPreferences.Editor editor)
    {
    }

    public volatile android.content.SharedPreferences.Editor c()
    {
        return super.c();
    }

    public void d()
    {
        d.c().remove("SHOW_WHATS_NEW").apply();
    }

    public volatile void e()
    {
        super.e();
    }

    public volatile String f()
    {
        return super.f();
    }

}
