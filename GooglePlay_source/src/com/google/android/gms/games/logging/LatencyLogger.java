// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.logging;

import android.content.Context;
import android.os.SystemClock;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.util.ExperimentUtils;
import java.util.ArrayList;
import java.util.LinkedList;

// Referenced classes of package com.google.android.gms.games.logging:
//            GamesLogHelper

public final class LatencyLogger
{
    public static final class LatencyEvent
    {

        public final int eventType;
        public final long timeMs;

        private LatencyEvent(int i, long l)
        {
            eventType = i;
            timeMs = l;
        }

        LatencyEvent(int i, long l, byte byte0)
        {
            this(i, l);
        }
    }


    private String mAccountName;
    private final String mAppId;
    private final Context mContext;
    private final ArrayList mEvents = new ArrayList();
    private final int mLatencyId;
    private final String mPackageName;
    private final LinkedList mPendingLogs = new LinkedList();
    private long mStartTimeElapsed;
    private long mStartTimeMillis;
    private int mState;

    private LatencyLogger(Context context, int i, String s)
    {
        mContext = context;
        mPackageName = context.getPackageName();
        mLatencyId = i;
        mAppId = s;
        mAccountName = null;
        reset();
        mState = 0;
    }

    public static LatencyLogger createDestAppLatencyLogger(Context context, int i)
    {
        return new LatencyLogger(context, i, "593950602418");
    }

    private transient void logEventsInternal(long l, int ai[])
    {
        int i;
        boolean flag;
        boolean flag2;
        flag2 = false;
        flag = false;
        i = 0;
_L18:
        if (i >= ai.length) goto _L2; else goto _L1
_L1:
        ai[i];
        JVM INSTR tableswitch 6 8: default 48
    //                   6 134
    //                   7 134
    //                   8 134;
           goto _L3 _L4 _L4 _L4
_L3:
        int i1;
        boolean flag3;
        int j1;
        flag3 = false;
        i1 = 0;
        j1 = mEvents.size();
_L9:
        boolean flag1 = flag3;
        if (i1 >= j1) goto _L6; else goto _L5
_L5:
        if (((LatencyEvent)mEvents.get(i1)).eventType != ai[i]) goto _L8; else goto _L7
_L7:
        flag1 = true;
_L6:
        if (!flag1)
        {
            mEvents.add(new LatencyEvent(ai[i], l, (byte)0));
        }
        i++;
        continue; /* Loop/switch isn't completed */
_L4:
        flag = true;
          goto _L3
_L8:
        i1++;
          goto _L9
_L2:
        if (!flag) goto _L11; else goto _L10
_L10:
        if (mState == 2) goto _L13; else goto _L12
_L12:
        com.google.android.gms.games.proto.PlayGames.PlaylogGamesExtension playloggamesextension;
        int k = mEvents.size();
        ai = new com.google.android.gms.games.proto.PlayGames.PlaylogGamesLatencyAction.LatencyEvent[k];
        for (int j = ((flag2) ? 1 : 0); j < k; j++)
        {
            LatencyEvent latencyevent = (LatencyEvent)mEvents.get(j);
            ai[j] = new com.google.android.gms.games.proto.PlayGames.PlaylogGamesLatencyAction.LatencyEvent();
            ai[j].eventType = latencyevent.eventType;
            ai[j].deltaMs = latencyevent.timeMs;
        }

        playloggamesextension = new com.google.android.gms.games.proto.PlayGames.PlaylogGamesExtension();
        playloggamesextension.requestInfo = GamesLogHelper.getRequestInfo(mContext, mPackageName, mAppId);
        playloggamesextension.latency = new com.google.android.gms.games.proto.PlayGames.PlaylogGamesLatencyAction();
        playloggamesextension.latency.latencyId = mLatencyId;
        playloggamesextension.latency.startTimestampMs = mStartTimeMillis;
        playloggamesextension.latency.events = ai;
        if (mState != 1) goto _L15; else goto _L14
_L14:
        (new GamesLogHelper(mContext)).logEvent(mAccountName, playloggamesextension);
_L13:
        reset();
_L11:
        return;
_L15:
        if (mState == 0)
        {
            mPendingLogs.add(playloggamesextension);
            if (mPendingLogs.size() >= 10)
            {
                mPendingLogs.poll();
            }
        }
        if (true) goto _L13; else goto _L16
_L16:
        if (true) goto _L18; else goto _L17
_L17:
    }

    private void reset()
    {
        mEvents.clear();
        mStartTimeElapsed = 0L;
        mStartTimeMillis = 0L;
    }

    public final transient void ensureStarted(int ai[])
    {
        if (mStartTimeElapsed == 0L)
        {
            mStartTimeElapsed = SystemClock.elapsedRealtime();
            mStartTimeMillis = System.currentTimeMillis();
            logEventsInternal(0L, new int[] {
                1
            });
            if (ai.length != 0)
            {
                logEventsInternal(0L, ai);
            }
            return;
        } else
        {
            logEvents(ai);
            return;
        }
    }

    public final transient void logEvents(int ai[])
    {
        if (mStartTimeElapsed != 0L && ai != null && ai.length != 0)
        {
            logEventsInternal(SystemClock.elapsedRealtime() - mStartTimeElapsed, ai);
        }
    }

    public final void onConnected(GoogleApiClient googleapiclient)
    {
        if (googleapiclient != null && googleapiclient.isConnected())
        {
            mAccountName = Games.getCurrentAccountName(googleapiclient);
            int i;
            if (mAccountName != null && ExperimentUtils.ENABLE_LATENCY_BACKOUT_LOGGING.get(googleapiclient))
            {
                i = 1;
            } else
            {
                i = 2;
            }
            mState = i;
            if (mPendingLogs.size() > 0)
            {
                if (mState == 2)
                {
                    mPendingLogs.clear();
                } else
                {
                    while (mPendingLogs.size() > 0) 
                    {
                        (new GamesLogHelper(mContext)).logEvent(mAccountName, (com.google.android.gms.games.proto.PlayGames.PlaylogGamesExtension)mPendingLogs.poll());
                    }
                }
            }
        }
    }
}
