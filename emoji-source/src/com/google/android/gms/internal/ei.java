// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;

// Referenced classes of package com.google.android.gms.internal:
//            eu, ai

public class ei
{

    private final Object ls = new Object();
    private final String rR;
    private int rX;
    private long rY;
    private long rZ;
    private int sa;
    private int sb;

    public ei(String s)
    {
        rX = 0;
        rY = -1L;
        rZ = -1L;
        sa = 0;
        sb = -1;
        rR = s;
    }

    public static boolean l(Context context)
    {
        ComponentName componentname;
        int i;
        i = context.getResources().getIdentifier("Theme.Translucent", "style", "android");
        if (i == 0)
        {
            eu.B("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
            return false;
        }
        componentname = new ComponentName(context.getPackageName(), "com.google.android.gms.ads.AdActivity");
        if (i == context.getPackageManager().getActivityInfo(componentname, 0).theme)
        {
            return true;
        }
        try
        {
            eu.B("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            eu.D("Fail to fetch AdActivity theme");
            eu.B("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
            return false;
        }
        return false;
    }

    public Bundle b(Context context, String s)
    {
        Bundle bundle;
        synchronized (ls)
        {
            bundle = new Bundle();
            bundle.putString("session_id", rR);
            bundle.putLong("basets", rZ);
            bundle.putLong("currts", rY);
            bundle.putString("seq_num", s);
            bundle.putInt("preqs", sb);
            bundle.putInt("pclick", rX);
            bundle.putInt("pimp", sa);
            bundle.putBoolean("support_transparent_background", l(context));
        }
        return bundle;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
    }

    public void b(ai ai1, long l1)
    {
        Object obj = ls;
        obj;
        JVM INSTR monitorenter ;
        if (rZ != -1L)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        rZ = l1;
        rY = rZ;
_L2:
        if (ai1.extras == null || ai1.extras.getInt("gw", 2) != 1)
        {
            break MISSING_BLOCK_LABEL_72;
        }
        return;
        rY = l1;
        if (true) goto _L2; else goto _L1
_L1:
        ai1;
        obj;
        JVM INSTR monitorexit ;
        throw ai1;
        sb = sb + 1;
        obj;
        JVM INSTR monitorexit ;
    }

    public void bB()
    {
        synchronized (ls)
        {
            sa = sa + 1;
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void bC()
    {
        synchronized (ls)
        {
            rX = rX + 1;
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public long bO()
    {
        return rZ;
    }
}
