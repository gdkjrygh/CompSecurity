// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import android.content.Context;
import android.content.SharedPreferences;

public final class m
{

    public final SharedPreferences a;

    public m(Context context)
    {
        a = context.getSharedPreferences("com.appboy.offline.storagemap", 0);
    }

    public static android.content.SharedPreferences.Editor a(Context context)
    {
        return context.getSharedPreferences("com_appboy_override_configuration_cache", 0).edit();
    }

    public final String a()
    {
        return a.getString("last_user", "");
    }
}
