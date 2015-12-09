// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.savedstate;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.fitbit.FitBitApplication;

abstract class a
{

    public static final int a = 1;
    private final int b;
    private final String c;
    private final String d;

    protected a(int i, String s)
    {
        this(((Context) (FitBitApplication.a())), i, s);
    }

    protected a(Context context, int i, String s)
    {
        int j;
        d = "version";
        if (TextUtils.isEmpty(s))
        {
            com.fitbit.e.a.a("AbstractSavedState", (new StringBuilder()).append("ERROR FILENAME IS EMPTY in class").append(getClass().getSimpleName()).toString(), new Object[0]);
        }
        b = i;
        c = s;
        s = context.getSharedPreferences(s, 0);
        j = s.getInt("version", 0);
        if (j == i) goto _L2; else goto _L1
_L1:
        com.fitbit.e.a.d(f(), String.format("Attempting Migration from version %s to %s", new Object[] {
            Integer.valueOf(j), Integer.valueOf(i)
        }), new Object[0]);
        s = s.edit();
        if (j >= i) goto _L4; else goto _L3
_L3:
        b(context, j, i, s);
_L6:
        s.putInt("version", i);
        s.apply();
        com.fitbit.e.a.d(f(), String.format("Successfully Migrated from version %s to %s", new Object[] {
            Integer.valueOf(j), Integer.valueOf(i)
        }), new Object[0]);
_L2:
        return;
_L4:
        if (j > i)
        {
            a(context, j, i, s);
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    protected a(String s)
    {
        this(1, s);
    }

    public int a()
    {
        return b;
    }

    public SharedPreferences a(Context context)
    {
        return context.getSharedPreferences(c, 0);
    }

    public void a(Context context, int i, int j, android.content.SharedPreferences.Editor editor)
    {
        throw new RuntimeException("Cannot downgrade - override if you know what you are doing");
    }

    public SharedPreferences b()
    {
        return a(FitBitApplication.a());
    }

    public abstract void b(Context context, int i, int j, android.content.SharedPreferences.Editor editor);

    public android.content.SharedPreferences.Editor c()
    {
        return b().edit();
    }

    public abstract void d();

    public void e()
    {
        c().clear().putInt("version", b).apply();
    }

    public String f()
    {
        return c;
    }
}
