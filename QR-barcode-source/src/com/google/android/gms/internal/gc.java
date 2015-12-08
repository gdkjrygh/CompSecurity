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
//            gs, av

public class gc
{

    private final Object mw = new Object();
    private final String vL;
    private int vX;
    private long vY;
    private long vZ;
    private int wa;
    private int wb;

    public gc(String s)
    {
        vX = 0;
        vY = -1L;
        vZ = -1L;
        wa = 0;
        wb = -1;
        vL = s;
    }

    public static boolean m(Context context)
    {
        ComponentName componentname;
        int i;
        i = context.getResources().getIdentifier("Theme.Translucent", "style", "android");
        if (i == 0)
        {
            gs.U("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
            return false;
        }
        componentname = new ComponentName(context.getPackageName(), "com.google.android.gms.ads.AdActivity");
        if (i == context.getPackageManager().getActivityInfo(componentname, 0).theme)
        {
            return true;
        }
        try
        {
            gs.U("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            gs.W("Fail to fetch AdActivity theme");
            gs.U("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
            return false;
        }
        return false;
    }

    public Bundle b(Context context, String s)
    {
        Bundle bundle;
        synchronized (mw)
        {
            bundle = new Bundle();
            bundle.putString("session_id", vL);
            bundle.putLong("basets", vZ);
            bundle.putLong("currts", vY);
            bundle.putString("seq_num", s);
            bundle.putInt("preqs", wb);
            bundle.putInt("pclick", vX);
            bundle.putInt("pimp", wa);
            bundle.putBoolean("support_transparent_background", m(context));
        }
        return bundle;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
    }

    public void b(av av1, long l)
    {
        Object obj = mw;
        obj;
        JVM INSTR monitorenter ;
        if (vZ != -1L)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        vZ = l;
        vY = vZ;
_L2:
        if (av1.extras == null || av1.extras.getInt("gw", 2) != 1)
        {
            break MISSING_BLOCK_LABEL_72;
        }
        return;
        vY = l;
        if (true) goto _L2; else goto _L1
_L1:
        av1;
        obj;
        JVM INSTR monitorexit ;
        throw av1;
        wb = wb + 1;
        obj;
        JVM INSTR monitorexit ;
    }

    public void cO()
    {
        synchronized (mw)
        {
            wa = wa + 1;
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void cP()
    {
        synchronized (mw)
        {
            vX = vX + 1;
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public long dh()
    {
        return vZ;
    }
}
