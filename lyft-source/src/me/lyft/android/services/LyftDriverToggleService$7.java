// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.services;

import android.view.MotionEvent;
import me.lyft.android.analytics.studies.DriverAnalytics;

// Referenced classes of package me.lyft.android.services:
//            LyftDriverToggleService

class r extends android.view.stureListener
{

    final LyftDriverToggleService this$0;

    public boolean onSingleTapUp(MotionEvent motionevent)
    {
        DriverAnalytics.trackDriverDefenseButtonTap();
        LyftDriverToggleService.access$1400(LyftDriverToggleService.this);
        stopSelf();
        return true;
    }

    r()
    {
        this$0 = LyftDriverToggleService.this;
        super();
    }
}
