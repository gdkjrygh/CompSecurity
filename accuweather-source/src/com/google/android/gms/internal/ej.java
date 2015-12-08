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
//            ev, aj

public class ej
{

    private final Object lq = new Object();
    private final String rO;
    private int rU;
    private long rV;
    private long rW;
    private int rX;
    private int rY;

    public ej(String s)
    {
        rU = 0;
        rV = -1L;
        rW = -1L;
        rX = 0;
        rY = -1;
        rO = s;
    }

    public static boolean i(Context context)
    {
        ComponentName componentname;
        int j;
        j = context.getResources().getIdentifier("Theme.Translucent", "style", "android");
        if (j == 0)
        {
            ev.B("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
            return false;
        }
        componentname = new ComponentName(context.getPackageName(), "com.google.android.gms.ads.AdActivity");
        if (j == context.getPackageManager().getActivityInfo(componentname, 0).theme)
        {
            return true;
        }
        try
        {
            ev.B("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            ev.D("Fail to fetch AdActivity theme");
            ev.B("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
            return false;
        }
        return false;
    }

    public Bundle b(Context context, String s)
    {
        Bundle bundle;
        synchronized (lq)
        {
            bundle = new Bundle();
            bundle.putString("session_id", rO);
            bundle.putLong("basets", rW);
            bundle.putLong("currts", rV);
            bundle.putString("seq_num", s);
            bundle.putInt("preqs", rY);
            bundle.putInt("pclick", rU);
            bundle.putInt("pimp", rX);
            bundle.putBoolean("support_transparent_background", i(context));
        }
        return bundle;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
    }

    public void b(aj aj1, long l)
    {
        Object obj = lq;
        obj;
        JVM INSTR monitorenter ;
        if (rW != -1L)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        rW = l;
        rV = rW;
_L2:
        if (aj1.extras == null || aj1.extras.getInt("gw", 2) != 1)
        {
            break MISSING_BLOCK_LABEL_72;
        }
        return;
        rV = l;
        if (true) goto _L2; else goto _L1
_L1:
        aj1;
        obj;
        JVM INSTR monitorexit ;
        throw aj1;
        rY = rY + 1;
        obj;
        JVM INSTR monitorexit ;
    }

    public long bJ()
    {
        return rW;
    }

    public void bw()
    {
        synchronized (lq)
        {
            rX = rX + 1;
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void bx()
    {
        synchronized (lq)
        {
            rU = rU + 1;
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
