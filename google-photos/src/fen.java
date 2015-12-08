// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;

public final class fen
    implements mti, omb, opr, opv
{

    private final Activity a;
    private mtj b;
    private noz c;

    public fen(Activity activity, opd opd1)
    {
        a = activity;
        opd1.a(this);
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        b = ((mtj)olm1.a(mtj)).a(this);
        c = noz.a(context, 3, "OldCacheCleaner", new String[0]);
    }

    public final void a(String s, mue mue1, mua mua)
    {
        if ("com.google.android.apps.photos.diskcache.OldCacheCleaner.DeleteCacheTask".equals(s) && mue1 != null)
        {
            boolean flag;
            if (!mue1.c())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                PreferenceManager.getDefaultSharedPreferences(a).edit().putBoolean("com.google.android.apps.photos.diskcache.OldCacheCleaner", true).apply();
            }
            if (c.a())
            {
                noy.a("success", Boolean.valueOf(flag));
            }
        }
    }

    public final void al_()
    {
        if (!PreferenceManager.getDefaultSharedPreferences(a).getBoolean("com.google.android.apps.photos.diskcache.OldCacheCleaner", false) && !b.a("com.google.android.apps.photos.diskcache.OldCacheCleaner.DeleteCacheTask"))
        {
            b.a(new feo());
        }
    }
}
