// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.recorder.instrumentation;

import android.os.SystemClock;

// Referenced classes of package com.google.android.gms.games.recorder.instrumentation:
//            TimingTracker

public final class ProfileScope
{

    boolean mIsActive;
    long mStartTime;
    TimingTracker mTracker;

    public ProfileScope(TimingTracker timingtracker)
    {
        mTracker = timingtracker;
        mStartTime = SystemClock.elapsedRealtimeNanos();
        mIsActive = true;
    }
}
