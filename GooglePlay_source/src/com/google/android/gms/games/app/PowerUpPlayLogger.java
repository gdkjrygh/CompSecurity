// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.app;

import android.content.Context;
import com.google.android.gms.common.config.GservicesValue;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.config.G;
import com.google.android.gms.games.logging.GamesLogHelper;
import java.util.ArrayList;

public final class PowerUpPlayLogger
{
    public static interface PowerUpPlayLoggerProvider
    {

        public abstract PowerUpPlayLogger getLogger();
    }


    private static final boolean DBG;
    public static final Object LOGGING_QUEUE_LOCK = new Object();
    public String mAccountName;
    private final Context mContext;
    public ArrayList mEventQueue;
    private final String mPackageName;

    public PowerUpPlayLogger(Context context)
    {
        mContext = context;
        mPackageName = context.getPackageName();
        mEventQueue = new ArrayList();
        mAccountName = null;
    }

    private static com.google.android.gms.games.proto.PlayGames.PlaylogGamesDestinationAppAction getDestinationAppInfo(int i, String s)
    {
        com.google.android.gms.games.proto.PlayGames.PlaylogGamesDestinationAppAction playloggamesdestinationappaction = new com.google.android.gms.games.proto.PlayGames.PlaylogGamesDestinationAppAction();
        playloggamesdestinationappaction.pageType = i;
        if (s != null)
        {
            playloggamesdestinationappaction.experimentIds = s;
        }
        return playloggamesdestinationappaction;
    }

    private static com.google.android.gms.games.proto.PlayGames.PlaylogGamesDestinationAppGameAction getGameAction(String s)
    {
        com.google.android.gms.games.proto.PlayGames.PlaylogGamesDestinationAppGameAction playloggamesdestinationappgameaction = new com.google.android.gms.games.proto.PlayGames.PlaylogGamesDestinationAppGameAction();
        playloggamesdestinationappgameaction.applicationId = s;
        return playloggamesdestinationappgameaction;
    }

    private com.google.android.gms.games.proto.PlayGames.PlaylogGamesRequestInfo getRequestInfo()
    {
        return getRequestInfo(mPackageName);
    }

    public static void start()
    {
    }

    public final void clearPendingEvents()
    {
        synchronized (LOGGING_QUEUE_LOCK)
        {
            mEventQueue.clear();
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final com.google.android.gms.games.proto.PlayGames.PlaylogGamesRequestInfo getRequestInfo(String s)
    {
        return GamesLogHelper.getRequestInfo(mContext, s, "593950602418");
    }

    public final void logBasicAction(int i, String s)
    {
        com.google.android.gms.games.proto.PlayGames.PlaylogGamesExtension playloggamesextension = new com.google.android.gms.games.proto.PlayGames.PlaylogGamesExtension();
        playloggamesextension.requestInfo = getRequestInfo();
        playloggamesextension.destApp = getDestinationAppInfo(i, s);
        logEventInternal(playloggamesextension);
    }

    public final void logEventInternal(com.google.android.gms.games.proto.PlayGames.PlaylogGamesExtension playloggamesextension)
    {
        Object obj = LOGGING_QUEUE_LOCK;
        obj;
        JVM INSTR monitorenter ;
        if (mAccountName != null)
        {
            break MISSING_BLOCK_LABEL_25;
        }
        mEventQueue.add(playloggamesextension);
_L2:
        return;
        logEventInternalImmediate(playloggamesextension);
        if (true) goto _L2; else goto _L1
_L1:
        playloggamesextension;
        obj;
        JVM INSTR monitorexit ;
        throw playloggamesextension;
    }

    public final void logEventInternalImmediate(com.google.android.gms.games.proto.PlayGames.PlaylogGamesExtension playloggamesextension)
    {
        (new GamesLogHelper(mContext)).logEvent(mAccountName, playloggamesextension);
    }

    public final void logGameAction(Game game, int i, boolean flag)
    {
        com.google.android.gms.games.proto.PlayGames.PlaylogGamesExtension playloggamesextension = new com.google.android.gms.games.proto.PlayGames.PlaylogGamesExtension();
        playloggamesextension.requestInfo = getRequestInfo();
        playloggamesextension.destApp = getDestinationAppInfo(5, null);
        playloggamesextension.destApp.gameAction = getGameAction(game.getApplicationId());
        playloggamesextension.destApp.gameAction.section = i;
        playloggamesextension.destApp.gameAction.launchedGame = flag;
        logEventInternal(playloggamesextension);
    }

    public final void logGameList(int i)
    {
        com.google.android.gms.games.proto.PlayGames.PlaylogGamesExtension playloggamesextension = new com.google.android.gms.games.proto.PlayGames.PlaylogGamesExtension();
        playloggamesextension.requestInfo = getRequestInfo();
        playloggamesextension.destApp = getDestinationAppInfo(2, null);
        com.google.android.gms.games.proto.PlayGames.PlaylogGamesDestinationAppAction playloggamesdestinationappaction = playloggamesextension.destApp;
        com.google.android.gms.games.proto.PlayGames.PlaylogGamesDestinationAppGameTabInfo playloggamesdestinationappgametabinfo = new com.google.android.gms.games.proto.PlayGames.PlaylogGamesDestinationAppGameTabInfo();
        playloggamesdestinationappgametabinfo.collection = i;
        playloggamesdestinationappgametabinfo.topOfList = true;
        playloggamesdestinationappaction.gameTabInfo = playloggamesdestinationappgametabinfo;
        logEventInternal(playloggamesextension);
    }

    public final void logLaunchFromHome(Game game)
    {
        com.google.android.gms.games.proto.PlayGames.PlaylogGamesExtension playloggamesextension = new com.google.android.gms.games.proto.PlayGames.PlaylogGamesExtension();
        playloggamesextension.requestInfo = getRequestInfo();
        playloggamesextension.destApp = getDestinationAppInfo(1, null);
        playloggamesextension.destApp.gameAction = getGameAction(game.getApplicationId());
        playloggamesextension.destApp.gameAction.launchedGame = true;
        logEventInternal(playloggamesextension);
    }

    public final void logOnboardAction(int i)
    {
        com.google.android.gms.games.proto.PlayGames.PlaylogGamesExtension playloggamesextension = new com.google.android.gms.games.proto.PlayGames.PlaylogGamesExtension();
        playloggamesextension.requestInfo = getRequestInfo();
        playloggamesextension.destApp = getDestinationAppInfo(1, null);
        playloggamesextension.destApp.onboardingEvent = new com.google.android.gms.games.proto.PlayGames.PlaylogGamesDestinationAppOnboardingAction();
        playloggamesextension.destApp.onboardingEvent.onboardingEvent = i;
        logEventInternalImmediate(playloggamesextension);
    }

    public final void logOneTouchCirclesAction(int i, int j)
    {
        com.google.android.gms.games.proto.PlayGames.PlaylogGamesExtension playloggamesextension = new com.google.android.gms.games.proto.PlayGames.PlaylogGamesExtension();
        playloggamesextension.requestInfo = getRequestInfo();
        playloggamesextension.destApp = getDestinationAppInfo(j, null);
        playloggamesextension.destApp.oneTouchCirclesAction = new com.google.android.gms.games.proto.PlayGames.PlaylogGamesOneTouchCirclesAction();
        playloggamesextension.destApp.oneTouchCirclesAction.circlesAction = i;
        logEventInternal(playloggamesextension);
    }

    static 
    {
        DBG = ((Boolean)G.verboseGamesPlaylogLogging.get()).booleanValue();
    }
}
