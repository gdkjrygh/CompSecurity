// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.SharedPreferences;

public final class abd
{

    public static void a(Context context, boolean flag)
    {
        context = context.getSharedPreferences("com.crittercism.usersettings", 0).edit();
        context.putBoolean("crashedOnLastLoad", flag);
        context.commit();
    }
}
