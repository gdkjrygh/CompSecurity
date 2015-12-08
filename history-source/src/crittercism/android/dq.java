// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package crittercism.android;

import android.content.Context;
import android.content.SharedPreferences;

public final class dq
{

    public static boolean a = false;

    public static Boolean a(Context context)
    {
        return Boolean.valueOf(context.getSharedPreferences("com.crittercism.usersettings", 0).getBoolean("crashedOnLastLoad", false));
    }

    public static void a(Context context, boolean flag)
    {
        context = context.getSharedPreferences("com.crittercism.usersettings", 0).edit();
        context.putBoolean("crashedOnLastLoad", flag);
        context.commit();
    }

}
