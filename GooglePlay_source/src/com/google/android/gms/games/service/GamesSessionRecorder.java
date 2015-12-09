// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.service;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.games.broker.GamesClientContext;
import com.google.android.gms.games.internal.GamesLog;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.android.gms.games.service:
//            ApiClientTracker, PlayGamesAsyncService

public final class GamesSessionRecorder
{
    public static interface GamesSessionCalls
    {

        public abstract com.google.android.gms.ads.identifier.AdvertisingIdClient.Info getAdInfo(Context context);

        public abstract void recordSession(Context context, ClientContext clientcontext, String s, String s1, long l, long l1, com.google.android.gms.ads.identifier.AdvertisingIdClient.Info info);
    }


    public com.google.android.gms.ads.identifier.AdvertisingIdClient.Info mAdInfo;
    public final ClientContext mClientContext;
    public final Clock mClock;
    public final Context mContext;
    public final GamesSessionCalls mOperationWrapper;
    int mPendingRefCounter;
    int mRefCounter;
    private final PlayGamesServiceBroker.GamesService mService;
    public String mSessionId;
    final Object mSessionLock;
    public long mSessionStartTimeMillis;

    public GamesSessionRecorder(Context context, ClientContext clientcontext, PlayGamesServiceBroker.GamesService gamesservice)
    {
        this(context, clientcontext, gamesservice, DefaultClock.getInstance(), new GamesSessionCalls() {

            public final com.google.android.gms.ads.identifier.AdvertisingIdClient.Info getAdInfo(Context context1)
            {
                try
                {
                    context1 = AdvertisingIdClient.getAdvertisingIdInfo(context1);
                }
                // Misplaced declaration of an exception variable
                catch (Context context1)
                {
                    GamesLog.e("GamesSessionRecorder", "Failed to retrieve tracking information", context1);
                    return null;
                }
                return context1;
            }

            public final void recordSession(Context context1, ClientContext clientcontext1, String s, String s1, long l, long l1, com.google.android.gms.ads.identifier.AdvertisingIdClient.Info info)
            {
                clientcontext1 = GamesClientContext.buildContextForTargetGame(context1, clientcontext1, s);
                context1 = null;
                boolean flag = false;
                if (info != null)
                {
                    context1 = info.mAdvertisingId;
                    flag = info.mLimitAdTrackingEnabled;
                }
                PlayGamesAsyncService.recordApplicationSession(clientcontext1, s1, l, l1, context1, flag);
            }

        });
    }

    private GamesSessionRecorder(Context context, ClientContext clientcontext, PlayGamesServiceBroker.GamesService gamesservice, Clock clock, GamesSessionCalls gamessessioncalls)
    {
        mSessionLock = new Object();
        mContext = context;
        mClientContext = clientcontext;
        mService = gamesservice;
        mClock = clock;
        mOperationWrapper = gamessessioncalls;
    }

    final void attemptEndSession_locked()
    {
        if (mRefCounter == 0 && mPendingRefCounter == 0)
        {
            endSession_locked();
        }
    }

    final void endSession_locked()
    {
        PlayGamesServiceBroker.GamesService gamesservice1;
        long l = mClock.elapsedRealtime();
        if (mSessionId != null && l > mSessionStartTimeMillis)
        {
            mOperationWrapper.recordSession(mContext, mClientContext, mService.mExternalGameId, mSessionId, mSessionStartTimeMillis, l, mAdInfo);
        }
        gamesservice1 = mService;
        Object obj = gamesservice1.mCopresenceMessageLock;
        obj;
        JVM INSTR monitorenter ;
        for (Iterator iterator = gamesservice1.mCopresenceListeners.keySet().iterator(); iterator.hasNext(); gamesservice1.endCopresence((String)iterator.next())) { }
        break MISSING_BLOCK_LABEL_121;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        obj;
        JVM INSTR monitorexit ;
        PlayGamesServiceBroker.GamesService gamesservice = mService;
        if (gamesservice.mApiClientTracker != null)
        {
            gamesservice.mApiClientTracker.decRef();
            gamesservice.mApiClientTracker = null;
        }
        mSessionId = null;
        mSessionStartTimeMillis = 0L;
        mRefCounter = 0;
        mPendingRefCounter = 0;
        return;
    }

    public final boolean shouldStartSession()
    {
        boolean flag = false;
        Object obj = mSessionLock;
        obj;
        JVM INSTR monitorenter ;
        if (mRefCounter == 0)
        {
            flag = true;
        }
        mRefCounter = mRefCounter + 1;
        obj;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
