// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.SharedPreferences;

public final class ago
{

    private static String a = "versionInfo";

    public static String a(Context context)
    {
        if (context != null)
        {
            return context.getSharedPreferences("HockeyApp", 0).getString(a, "[]");
        } else
        {
            return "[]";
        }
    }

    public static void a(Context context, String s)
    {
        if (context != null)
        {
            context = context.getSharedPreferences("HockeyApp", 0).edit();
            context.putString(a, s);
            agl.a(context);
        }
    }

}
