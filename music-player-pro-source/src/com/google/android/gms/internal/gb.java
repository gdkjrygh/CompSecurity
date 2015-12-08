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
//            gr, av

public class gb
{

    private final Object mH = new Object();
    private final String vZ;
    private int wm;
    private long wn;
    private long wo;
    private int wp;
    private int wq;

    public gb(String s)
    {
        wm = 0;
        wn = -1L;
        wo = -1L;
        wp = 0;
        wq = -1;
        vZ = s;
    }

    public static boolean m(Context context)
    {
        ComponentName componentname;
        int i;
        i = context.getResources().getIdentifier("Theme.Translucent", "style", "android");
        if (i == 0)
        {
            gr.U("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
            return false;
        }
        componentname = new ComponentName(context.getPackageName(), "com.google.android.gms.ads.AdActivity");
        if (i == context.getPackageManager().getActivityInfo(componentname, 0).theme)
        {
            return true;
        }
        try
        {
            gr.U("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            gr.W("Fail to fetch AdActivity theme");
            gr.U("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
            return false;
        }
        return false;
    }

    public Bundle b(Context context, String s)
    {
        Bundle bundle;
        synchronized (mH)
        {
            bundle = new Bundle();
            bundle.putString("session_id", vZ);
            bundle.putLong("basets", wo);
            bundle.putLong("currts", wn);
            bundle.putString("seq_num", s);
            bundle.putInt("preqs", wq);
            bundle.putInt("pclick", wm);
            bundle.putInt("pimp", wp);
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
        Object obj = mH;
        obj;
        JVM INSTR monitorenter ;
        if (wo != -1L)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        wo = l;
        wn = wo;
_L2:
        if (av1.extras == null || av1.extras.getInt("gw", 2) != 1)
        {
            break MISSING_BLOCK_LABEL_72;
        }
        return;
        wn = l;
        if (true) goto _L2; else goto _L1
_L1:
        av1;
        obj;
        JVM INSTR monitorexit ;
        throw av1;
        wq = wq + 1;
        obj;
        JVM INSTR monitorexit ;
    }

    public void cW()
    {
        synchronized (mH)
        {
            wp = wp + 1;
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void cX()
    {
        synchronized (mH)
        {
            wm = wm + 1;
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public long dq()
    {
        return wo;
    }
}
