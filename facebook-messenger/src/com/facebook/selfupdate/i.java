// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.selfupdate;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import com.facebook.f.n;
import com.facebook.prefs.shared.ae;
import com.facebook.prefs.shared.d;

public class i
{

    static final ae a = n.a("fbandroid_self_update");
    private final Context b;
    private final d c;
    private final com.facebook.common.process.d d;

    public i(Context context, d d1, com.facebook.common.process.d d2)
    {
        b = context;
        c = d1;
        d = d2;
    }

    private boolean a(Context context)
    {
        boolean flag = false;
        PackageManager packagemanager = context.getPackageManager();
        context = context.getPackageName();
        int j;
        try
        {
            j = packagemanager.getApplicationInfo(context, 0).flags;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return false;
        }
        if ((j & 1) != 0)
        {
            flag = true;
        }
        return flag;
    }

    private boolean c()
    {
        boolean flag = false;
        if (b() || c.a(a, false) || a(b))
        {
            flag = true;
        }
        return flag;
    }

    public boolean a()
    {
        return c() && android.os.Build.VERSION.SDK_INT >= 9 && d.a(b.getPackageName());
    }

    public final boolean b()
    {
        int j;
        try
        {
            j = android.provider.Settings.Secure.getInt(b.getContentResolver(), "install_non_market_apps");
        }
        catch (android.provider.Settings.SettingNotFoundException settingnotfoundexception)
        {
            return false;
        }
        return j == 1;
    }

}
