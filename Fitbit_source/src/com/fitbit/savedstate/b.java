// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.savedstate;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.fitbit.activity.ui.charts.ActivityType;

// Referenced classes of package com.fitbit.savedstate:
//            a

public class b extends a
{

    private static final b b = new b();
    private static final String c = "LAST_SELECTED_INTERVAL";
    private static final String d = "LAST_SELECTED_CHART";

    b()
    {
        super("ActivityChartSavedState");
    }

    public static int a(String s)
    {
        return b.b().getInt((new StringBuilder()).append("LAST_SELECTED_INTERVAL").append(s).toString(), 0);
    }

    public static void a(int i)
    {
        b.c().putInt("LAST_SELECTED_CHART", i).apply();
    }

    public static void a(int i, String s)
    {
        b.c().putInt((new StringBuilder()).append("LAST_SELECTED_INTERVAL").append(s).toString(), i).apply();
    }

    protected static a g()
    {
        return b;
    }

    public static int h()
    {
        return b.b().getInt("LAST_SELECTED_CHART", 0);
    }

    public volatile int a()
    {
        return super.a();
    }

    public volatile SharedPreferences a(Context context)
    {
        return super.a(context);
    }

    public volatile void a(Context context, int i, int j, android.content.SharedPreferences.Editor editor)
    {
        super.a(context, i, j, editor);
    }

    public volatile SharedPreferences b()
    {
        return super.b();
    }

    public void b(Context context, int i, int j, android.content.SharedPreferences.Editor editor)
    {
        context = PreferenceManager.getDefaultSharedPreferences(context);
        android.content.SharedPreferences.Editor editor1 = context.edit();
        if (context.contains("SavedState.ActivityChartState.LAST_SELECTED_INTERVAL"))
        {
            editor.putInt("LAST_SELECTED_INTERVAL", context.getInt("SavedState.ActivityChartState.LAST_SELECTED_INTERVAL", 0));
            editor1.remove("SavedState.ActivityChartState.LAST_SELECTED_INTERVAL");
        }
        if (context.contains("SavedState.ActivityChartState.LAST_SELECTED_CHART"))
        {
            editor.putInt("LAST_SELECTED_CHART", context.getInt("SavedState.ActivityChartState.LAST_SELECTED_CHART", 0));
            editor1.remove("SavedState.ActivityChartState.LAST_SELECTED_CHART");
        }
        editor1.apply();
    }

    public volatile android.content.SharedPreferences.Editor c()
    {
        return super.c();
    }

    public void d()
    {
        android.content.SharedPreferences.Editor editor = b.c();
        editor.putInt("LAST_SELECTED_CHART", 0);
        editor.putInt("LAST_SELECTED_INTERVAL", 0);
        ActivityType aactivitytype[] = ActivityType.values();
        int j = aactivitytype.length;
        for (int i = 0; i < j; i++)
        {
            ActivityType activitytype = aactivitytype[i];
            editor.putInt((new StringBuilder()).append("LAST_SELECTED_INTERVAL").append(activitytype).toString(), 0);
        }

        editor.apply();
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
