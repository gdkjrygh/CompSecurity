// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package crittercism.android;

import android.content.Context;
import android.content.SharedPreferences;

public final class dt
{

    public SharedPreferences a;

    protected dt()
    {
    }

    public dt(Context context)
    {
        a = context.getSharedPreferences("com.crittercism.ratemyapp", 0);
    }

    public final int a()
    {
        return a.getInt("numAppLoads", 0);
    }

    public final void a(boolean flag)
    {
        a.edit().putBoolean("rateMyAppEnabled", flag).commit();
    }

    public final String b()
    {
        return a.getString("rateAppMessage", "Would you mind taking a second to rate my app?  I would really appreciate it!");
    }

    public final String c()
    {
        return a.getString("rateAppTitle", "Rate My App");
    }

    public final void d()
    {
        a.edit().putBoolean("hasRatedApp", true).commit();
    }
}
