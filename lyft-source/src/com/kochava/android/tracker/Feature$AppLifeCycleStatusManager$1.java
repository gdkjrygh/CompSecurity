// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kochava.android.tracker;

import android.util.Log;

// Referenced classes of package com.kochava.android.tracker:
//            Feature

class a extends Thread
{

    private final String a;

    public void run()
    {
        if (a) goto _L2; else goto _L1
_L1:
        Log.e("KochavaTracker", "AppLifeCycleStatusManager - not active");
_L4:
        return;
_L2:
        if (!a.equals("is_focused"))
        {
            continue; /* Loop/switch isn't completed */
        }
        if (a) goto _L4; else goto _L3
_L3:
        Log.e("KochavaTracker", "AppLifeCycleStatusManager - not already resumed, starting session...");
        Feature.l();
        a = true;
        return;
        if (!a.equals("is_in_background") || !a) goto _L4; else goto _L5
_L5:
        Log.e("KochavaTracker", "AppLifeCycleStatusManager - going to background from app, ending session");
        Feature.m();
        a = false;
        return;
    }

    (String s)
    {
        a = s;
        super();
    }
}
