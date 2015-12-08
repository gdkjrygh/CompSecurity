// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;

public final class ciy
{

    public long a;
    public long b;
    public int c;
    public final Object d = new Object();
    public int e;
    public int f;
    private String g;

    public ciy(String s)
    {
        a = -1L;
        b = -1L;
        c = -1;
        e = 0;
        f = 0;
        g = s;
    }

    private static boolean a(Context context)
    {
        ComponentName componentname;
        int i;
        i = context.getResources().getIdentifier("Theme.Translucent", "style", "android");
        if (i == 0)
        {
            bka.c("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
            return false;
        }
        componentname = new ComponentName(context.getPackageName(), "com.google.android.gms.ads.AdActivity");
        if (i == context.getPackageManager().getActivityInfo(componentname, 0).theme)
        {
            return true;
        }
        try
        {
            bka.c("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            bka.e("Fail to fetch AdActivity theme");
            bka.c("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
            return false;
        }
        return false;
    }

    public final Bundle a(Context context, String s)
    {
        Bundle bundle;
        synchronized (d)
        {
            bundle = new Bundle();
            bundle.putString("session_id", g);
            bundle.putLong("basets", b);
            bundle.putLong("currts", a);
            bundle.putString("seq_num", s);
            bundle.putInt("preqs", c);
            bundle.putInt("pclick", e);
            bundle.putInt("pimp", f);
            bundle.putBoolean("support_transparent_background", a(context));
        }
        return bundle;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
    }
}
