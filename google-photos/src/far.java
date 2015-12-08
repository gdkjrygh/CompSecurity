// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

public final class far
{

    static final oni a = new oni("debug.photos.check_sdcard_write");

    public static void a(Context context, int i)
    {
        context = PreferenceManager.getDefaultSharedPreferences(context).edit();
        context.putInt("com.google.android.apps.photos.delete.sdcard.can_write_pref_key", i);
        context.apply();
    }

    public static boolean a(Context context)
    {
        return false;
    }

    public static fas b(Context context)
    {
        int i = PreferenceManager.getDefaultSharedPreferences(context).getInt("com.google.android.apps.photos.delete.sdcard.can_write_pref_key", fas.c.d);
        if (i == fas.a.d)
        {
            return fas.a;
        }
        if (i == fas.b.d)
        {
            return fas.b;
        } else
        {
            return fas.c;
        }
    }

}
