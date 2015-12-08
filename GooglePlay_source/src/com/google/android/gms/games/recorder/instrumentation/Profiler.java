// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.recorder.instrumentation;

import android.os.SystemClock;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.util.VideoUtils;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

// Referenced classes of package com.google.android.gms.games.recorder.instrumentation:
//            Counter, TimingTracker, ProfileScope

public final class Profiler
{

    private static final Profiler sInstance = new Profiler();
    public ConcurrentHashMap mCounters;
    public ProfileScope mGlobalProfileScope;
    public boolean mIsEnabled;
    public boolean mLogToPlayLogEnabled;
    public ConcurrentHashMap mTrackers;

    private Profiler()
    {
        mIsEnabled = VideoUtils.DBG;
        clearProfiler();
    }

    public static Profiler getInstance()
    {
        return sInstance;
    }

    public final void clearProfiler()
    {
        mTrackers = new ConcurrentHashMap();
        mCounters = new ConcurrentHashMap();
        mGlobalProfileScope = null;
        mLogToPlayLogEnabled = false;
    }

    public final Counter getCounter(String s)
    {
        if (!mIsEnabled)
        {
            return null;
        } else
        {
            return (Counter)mCounters.get(s);
        }
    }

    public final void incrementCounter(String s, int i)
    {
        if (!mIsEnabled)
        {
            return;
        }
        if (!mCounters.containsKey(s))
        {
            mCounters.putIfAbsent(s, new Counter(s));
        }
        ((Counter)mCounters.get(s)).markEvent(i);
    }

    public final void printResults()
    {
        if (mIsEnabled)
        {
            for (Iterator iterator = mTrackers.values().iterator(); iterator.hasNext(); GamesLog.d("Profiler", ((TimingTracker)iterator.next()).getDescription())) { }
            Iterator iterator1 = mCounters.values().iterator();
            while (iterator1.hasNext()) 
            {
                GamesLog.d("Profiler", ((Counter)iterator1.next()).getDescription());
            }
        }
    }

    public final ProfileScope startTiming(String s)
    {
        if (!mIsEnabled)
        {
            return null;
        }
        if (!mTrackers.containsKey(s))
        {
            mTrackers.putIfAbsent(s, new TimingTracker(s));
        }
        return new ProfileScope((TimingTracker)mTrackers.get(s));
    }

    public final void stopTiming(ProfileScope profilescope)
    {
        while (!mIsEnabled || profilescope == null || !profilescope.mIsActive) 
        {
            return;
        }
        long l = SystemClock.elapsedRealtimeNanos();
        long l1 = profilescope.mStartTime;
        if (profilescope.mTracker != null)
        {
            profilescope.mTracker.markTime(l - l1);
        }
        profilescope.mIsActive = false;
    }

}
