// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.service.statemachine.roomclient;

import android.content.Context;
import android.os.SystemClock;
import java.util.ArrayList;

public final class RtmpWaitingRoomLog
{

    public String mCallingPackageName;
    public Context mContext;
    public ArrayList mEvents;
    public String mExternalGameId;
    public boolean mHasBeenDispatched;
    public final com.google.android.gms.games.proto.PlayGames.PlaylogRtmpWaitingRoomSession mLog = new com.google.android.gms.games.proto.PlayGames.PlaylogRtmpWaitingRoomSession();
    private final long mRealTimeAtStart = SystemClock.elapsedRealtime();
    public String mResolvedAccountName;

    public RtmpWaitingRoomLog()
    {
        mHasBeenDispatched = false;
        mEvents = new ArrayList();
        mLog.sessionStartTimeMs = System.currentTimeMillis();
    }

    public final long deltaNow()
    {
        return SystemClock.elapsedRealtime() - mRealTimeAtStart;
    }

    public final boolean hasContext()
    {
        return mContext != null && mCallingPackageName != null && mResolvedAccountName != null && mExternalGameId != null;
    }
}
