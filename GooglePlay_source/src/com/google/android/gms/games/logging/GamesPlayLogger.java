// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.logging;

import android.content.Context;
import android.support.v4.util.ArrayMap;
import com.google.android.gms.common.config.GservicesValue;
import com.google.android.gms.games.config.G;
import com.google.android.gms.games.internal.GamesLog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.android.gms.games.logging:
//            GamesLogHelper

public final class GamesPlayLogger
{
    public static final class NotificationData
    {

        public final String gameId;
        public final String notificationId;
        public final int notificationType;

        public NotificationData(String s, String s1, int i)
        {
            gameId = s;
            notificationId = s1;
            notificationType = i;
        }
    }


    private static final boolean DBG;
    private static boolean sLoggingEnabled = true;

    public static void logAddToCirclesAction(Context context, String s, String s1, int i, boolean flag)
    {
        com.google.android.gms.games.proto.PlayGames.PlaylogGamesExtension playloggamesextension = new com.google.android.gms.games.proto.PlayGames.PlaylogGamesExtension();
        playloggamesextension.requestInfo = GamesLogHelper.getRequestInfo(context, context.getPackageName(), s);
        s = new com.google.android.gms.games.proto.PlayGames.PlaylogGamesModifyCirclesAction();
        s.source = i;
        s.added = flag;
        playloggamesextension.modifyCircles = s;
        logEvent(context, s1, playloggamesextension);
    }

    private static void logEvent(Context context, String s, com.google.android.gms.games.proto.PlayGames.PlaylogGamesExtension playloggamesextension)
    {
        if (!sLoggingEnabled)
        {
            return;
        } else
        {
            (new GamesLogHelper(context)).logEvent(s, playloggamesextension);
            return;
        }
    }

    public static void logInGameAction(Context context, String s, String s1, String s2, int i)
    {
        com.google.android.gms.games.proto.PlayGames.PlaylogGamesExtension playloggamesextension = new com.google.android.gms.games.proto.PlayGames.PlaylogGamesExtension();
        playloggamesextension.requestInfo = GamesLogHelper.getRequestInfo(context, s, s1);
        s = new com.google.android.gms.games.proto.PlayGames.PlaylogGamesInGameAction();
        s.type = i;
        playloggamesextension.inGame = s;
        logEvent(context, s2, playloggamesextension);
    }

    public static void logLeaderboardAction(Context context, String s, String s1, String s2, String s3, int i, int j)
    {
        com.google.android.gms.games.proto.PlayGames.PlaylogGamesExtension playloggamesextension = new com.google.android.gms.games.proto.PlayGames.PlaylogGamesExtension();
        playloggamesextension.requestInfo = GamesLogHelper.getRequestInfo(context, s, s1);
        s = new com.google.android.gms.games.proto.PlayGames.PlaylogGamesInGameAction();
        s.type = 3;
        s.leaderboard = new com.google.android.gms.games.proto.PlayGames.PlaylogGamesLeaderboardAction();
        ((com.google.android.gms.games.proto.PlayGames.PlaylogGamesInGameAction) (s)).leaderboard.leaderboardId = s3;
        ((com.google.android.gms.games.proto.PlayGames.PlaylogGamesInGameAction) (s)).leaderboard.leaderboardType = i;
        ((com.google.android.gms.games.proto.PlayGames.PlaylogGamesInGameAction) (s)).leaderboard.scoreWindowType = j;
        playloggamesextension.inGame = s;
        logEvent(context, s2, playloggamesextension);
    }

    public static void logNearbyPlayer(Context context, String s, String s1, String s2, int i)
    {
        com.google.android.gms.games.proto.PlayGames.PlaylogGamesExtension playloggamesextension = new com.google.android.gms.games.proto.PlayGames.PlaylogGamesExtension();
        playloggamesextension.requestInfo = GamesLogHelper.getRequestInfo(context, s, s1);
        s = new com.google.android.gms.games.proto.PlayGames.PlaylogGamesNearbyPlayerAction();
        s.type = 1;
        s.numNearbyPlayers = i;
        playloggamesextension.nearbyPlayer = s;
        logEvent(context, s2, playloggamesextension);
    }

    public static void logNotificationAction(Context context, String s, int i, ArrayList arraylist)
    {
        com.google.android.gms.games.proto.PlayGames.PlaylogGamesExtension playloggamesextension;
        com.google.android.gms.games.proto.PlayGames.PlaylogGamesAndroidNotificationDetails aplayloggamesandroidnotificationdetails[];
        int k;
        int l;
        playloggamesextension = new com.google.android.gms.games.proto.PlayGames.PlaylogGamesExtension();
        playloggamesextension.requestInfo = GamesLogHelper.getRequestInfo(context, context.getPackageName(), "");
        l = arraylist.size();
        aplayloggamesandroidnotificationdetails = new com.google.android.gms.games.proto.PlayGames.PlaylogGamesAndroidNotificationDetails[l];
        k = 0;
_L8:
        Object obj;
        int j;
        if (k >= l)
        {
            break MISSING_BLOCK_LABEL_256;
        }
        NotificationData notificationdata = (NotificationData)arraylist.get(k);
        aplayloggamesandroidnotificationdetails[k] = new com.google.android.gms.games.proto.PlayGames.PlaylogGamesAndroidNotificationDetails();
        aplayloggamesandroidnotificationdetails[k].applicationId = notificationdata.gameId;
        String s1 = notificationdata.notificationId;
        obj = s1;
        if (s1 == null)
        {
            obj = "";
        }
        aplayloggamesandroidnotificationdetails[k].notificationId = ((String) (obj));
        obj = aplayloggamesandroidnotificationdetails[k];
        j = notificationdata.notificationType;
        j;
        JVM INSTR lookupswitch 5: default 180
    //                   1: 226
    //                   2: 232
    //                   4: 238
    //                   8: 244
    //                   16: 250;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L6:
        break MISSING_BLOCK_LABEL_250;
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        GamesLog.e("GamesPlayLogger", (new StringBuilder("The notification type: ")).append(j).append(" is not supported. Please add it to the proto google3/logs/proto/wireless/android/play/playlog/play_games.proto, sync with the server, and update mapping in GamesPlayerLogger.").toString());
        j = 0;
_L9:
        obj.notificationType = j;
        k++;
        if (true) goto _L8; else goto _L7
_L7:
        j = 1;
          goto _L9
_L3:
        j = 2;
          goto _L9
_L4:
        j = 3;
          goto _L9
_L5:
        j = 4;
          goto _L9
        j = 5;
          goto _L9
        arraylist = new com.google.android.gms.games.proto.PlayGames.PlaylogGamesGenericNotificationAction();
        arraylist.actionType = 1;
        com.google.android.gms.games.proto.PlayGames.PlaylogGamesAndroidNotificationAction playloggamesandroidnotificationaction = new com.google.android.gms.games.proto.PlayGames.PlaylogGamesAndroidNotificationAction();
        playloggamesandroidnotificationaction.actionType = i;
        if (l > 0)
        {
            playloggamesandroidnotificationaction.notificationDetails = aplayloggamesandroidnotificationdetails;
        }
        if (l >= 0)
        {
            playloggamesandroidnotificationaction.displayedCount = l;
        }
        arraylist.androidAction = playloggamesandroidnotificationaction;
        playloggamesextension.genericNotification = arraylist;
        logEvent(context, s, playloggamesextension);
        return;
    }

    public static void logNotificationAction(Context context, String s, String s1, int i, int j, String s2)
    {
        ArrayList arraylist = new ArrayList();
        if (s2 != null)
        {
            arraylist.add(new NotificationData(s, s2, i));
        }
        logNotificationAction(context, s1, j, arraylist);
    }

    public static void logPlayerSelections(Context context, String s, String s1, String s2, ArrayMap arraymap, int i)
    {
        com.google.android.gms.games.proto.PlayGames.PlaylogGamesExtension playloggamesextension = new com.google.android.gms.games.proto.PlayGames.PlaylogGamesExtension();
        playloggamesextension.requestInfo = GamesLogHelper.getRequestInfo(context, s, s1);
        playloggamesextension.selectedPlayers = new com.google.android.gms.games.proto.PlayGames.PlaylogGamesSelectedPlayers();
        playloggamesextension.selectedPlayers.numAutomatch = i;
        playloggamesextension.selectedPlayers.source = new int[arraymap.size()];
        i = 0;
        for (s = arraymap.entrySet().iterator(); s.hasNext();)
        {
            s1 = (java.util.Map.Entry)s.next();
            playloggamesextension.selectedPlayers.source[i] = ((Integer)s1.getValue()).intValue();
            i++;
        }

        logEvent(context, s2, playloggamesextension);
    }

    public static void logPlusUpgradeDialogFinishEvent(Context context, String s, int i, Integer integer, int j)
    {
        logPlusUpgradeEvent(context, s, 5, i, integer, Integer.valueOf(j));
    }

    public static void logPlusUpgradeDialogShowEvent(Context context, String s, int i, Integer integer)
    {
        logPlusUpgradeEvent(context, s, 4, i, integer, null);
    }

    private static void logPlusUpgradeEvent(Context context, String s, int i, int j, Integer integer, Integer integer1)
    {
        com.google.android.gms.games.proto.PlayGames.PlaylogGamesExtension playloggamesextension = new com.google.android.gms.games.proto.PlayGames.PlaylogGamesExtension();
        playloggamesextension.requestInfo = GamesLogHelper.getRequestInfo(context, context.getPackageName(), "593950602418");
        playloggamesextension.plusUpgrade = new com.google.android.gms.games.proto.PlayGames.PlaylogPlusUpgrade();
        playloggamesextension.plusUpgrade.upgradeStep = i;
        playloggamesextension.plusUpgrade.upgradeSource = j;
        if (integer != null)
        {
            playloggamesextension.plusUpgrade.upgradeSubSource = integer.intValue();
        }
        if (integer1 != null)
        {
            playloggamesextension.plusUpgrade.resultCode = integer1.intValue();
        }
        logEvent(context, s, playloggamesextension);
    }

    public static void logPlusUpgradeFinishEvent(Context context, String s, int i, Integer integer, int j)
    {
        logPlusUpgradeEvent(context, s, 3, i, integer, Integer.valueOf(j));
    }

    public static void logPlusUpgradeStartEvent(Context context, String s, int i, Integer integer)
    {
        logPlusUpgradeEvent(context, s, 2, i, integer, null);
    }

    public static void logPlusUpgradeViewEvent(Context context, String s, int i, Integer integer)
    {
        logPlusUpgradeEvent(context, s, 1, i, integer, null);
    }

    public static void logRtmpEvent(Context context, String s, String s1, String s2, com.google.android.gms.games.proto.PlayGames.PlaylogGamesRtmpSession playloggamesrtmpsession)
    {
        com.google.android.gms.games.proto.PlayGames.PlaylogGamesExtension playloggamesextension = new com.google.android.gms.games.proto.PlayGames.PlaylogGamesExtension();
        playloggamesextension.requestInfo = GamesLogHelper.getRequestInfo(context, s, s1);
        playloggamesextension.rtmpSession = playloggamesrtmpsession;
        logEvent(context, s2, playloggamesextension);
    }

    public static void logRtmpWaitingRoomEvent(Context context, String s, String s1, String s2, com.google.android.gms.games.proto.PlayGames.PlaylogRtmpWaitingRoomSession playlogrtmpwaitingroomsession)
    {
        com.google.android.gms.games.proto.PlayGames.PlaylogGamesExtension playloggamesextension = new com.google.android.gms.games.proto.PlayGames.PlaylogGamesExtension();
        playloggamesextension.requestInfo = GamesLogHelper.getRequestInfo(context, s, s1);
        playloggamesextension.rtmpWaitingRoomSession = playlogrtmpwaitingroomsession;
        logEvent(context, s2, playloggamesextension);
    }

    public static void logSignInEvent(Context context, String s, String s1, String s2, int i, int j)
    {
        com.google.android.gms.games.proto.PlayGames.PlaylogGamesExtension playloggamesextension = new com.google.android.gms.games.proto.PlayGames.PlaylogGamesExtension();
        playloggamesextension.requestInfo = GamesLogHelper.getRequestInfo(context, s, s1);
        playloggamesextension.requestInfo.clientVersion = String.valueOf(i);
        s = new com.google.android.gms.games.proto.PlayGames.PlaylogGamesSignInAction();
        s.type = j;
        playloggamesextension.signIn = s;
        logEvent(context, s2, playloggamesextension);
    }

    public static void logSignInStep(Context context, String s, String s1, String s2, long l, int i, int j, 
            long l1)
    {
        com.google.android.gms.games.proto.PlayGames.PlaylogGamesExtension playloggamesextension = new com.google.android.gms.games.proto.PlayGames.PlaylogGamesExtension();
        playloggamesextension.requestInfo = GamesLogHelper.getRequestInfo(context, s, s1);
        playloggamesextension.signIn = new com.google.android.gms.games.proto.PlayGames.PlaylogGamesSignInAction();
        s = playloggamesextension.signIn;
        s1 = new com.google.android.gms.games.proto.PlayGames.PlaylogGamesAndroidSignIn();
        s1.step = i;
        s1.sessionId = l;
        s1.status = j;
        s1.elapsedTimeMillis = l1;
        s.androidAction = s1;
        logEvent(context, s2, playloggamesextension);
    }

    public static void logSnapshotAction(Context context, String s, String s1, String s2, int i, String s3, int j, long l)
    {
        logSnapshotAction(context, s, s1, s2, i, s3, "", j, l);
    }

    public static void logSnapshotAction(Context context, String s, String s1, String s2, int i, String s3, String s4, int j, 
            long l)
    {
        com.google.android.gms.games.proto.PlayGames.PlaylogGamesExtension playloggamesextension = new com.google.android.gms.games.proto.PlayGames.PlaylogGamesExtension();
        playloggamesextension.requestInfo = GamesLogHelper.getRequestInfo(context, s, s1);
        playloggamesextension.snapshot = new com.google.android.gms.games.proto.PlayGames.PlaylogGamesSnapshotAction();
        playloggamesextension.snapshot.actionType = i;
        playloggamesextension.snapshot.actionStatus = j;
        playloggamesextension.snapshot.snapshotId = s3;
        playloggamesextension.snapshot.source = 1;
        playloggamesextension.snapshot.coverImageFingerprintMd5 = s4;
        if (l >= 0L)
        {
            playloggamesextension.snapshot.contentSizeBytes = l;
        }
        logEvent(context, s2, playloggamesextension);
    }

    public static void logSyncEvent(Context context, String s, String s1, String s2, long l, boolean flag, int i, 
            boolean flag1, boolean flag2, int ai[])
    {
        com.google.android.gms.games.proto.PlayGames.PlaylogGamesExtension playloggamesextension = new com.google.android.gms.games.proto.PlayGames.PlaylogGamesExtension();
        playloggamesextension.requestInfo = GamesLogHelper.getRequestInfo(context, context.getPackageName(), "");
        playloggamesextension.sync = new com.google.android.gms.games.proto.PlayGames.PlaylogGamesAndroidSyncAction();
        playloggamesextension.sync.authority = s1;
        playloggamesextension.sync.feed = s2;
        playloggamesextension.sync.durationMillis = l;
        playloggamesextension.sync.success = flag;
        playloggamesextension.sync.numErrors = i;
        playloggamesextension.sync.periodic = flag1;
        playloggamesextension.sync.newSyncPending = flag2;
        if (ai != null && ai.length > 0)
        {
            playloggamesextension.sync.syncOps = ai;
        }
        logEvent(context, s, playloggamesextension);
    }

    public static void logSystemStats(Context context, String s, int i, int j, long l)
    {
        com.google.android.gms.games.proto.PlayGames.PlaylogGamesExtension playloggamesextension = new com.google.android.gms.games.proto.PlayGames.PlaylogGamesExtension();
        playloggamesextension.requestInfo = GamesLogHelper.getRequestInfo(context, context.getPackageName(), "");
        playloggamesextension.systemStats = new com.google.android.gms.games.proto.PlayGames.PlaylogGamesSystemStats();
        playloggamesextension.systemStats.numInstalledGames = i;
        playloggamesextension.systemStats.numSignedInGames = j;
        playloggamesextension.systemStats.lastPlayedGameTimeMs = l;
        logEvent(context, s, playloggamesextension);
    }

    public static void logVideoProfilingStats(Context context, String s, String s1, String s2, float f, float f1, float f2, int i, 
            int j, int k, int l, int i1, int j1, long l1)
    {
        com.google.android.gms.games.proto.PlayGames.PlaylogGamesExtension playloggamesextension = new com.google.android.gms.games.proto.PlayGames.PlaylogGamesExtension();
        playloggamesextension.requestInfo = GamesLogHelper.getRequestInfo(context, s, s1);
        playloggamesextension.video = new com.google.android.gms.games.proto.PlayGames.PlaylogGamesVideoAction();
        playloggamesextension.video.profiledRecordingDurationSeconds = f;
        playloggamesextension.video.profiledCaptureFramesPerSecond = f1;
        playloggamesextension.video.profiledVideoFramesPerSecond = f2;
        playloggamesextension.video.profiledVideoWidth = i;
        playloggamesextension.video.profiledVideoHeight = j;
        playloggamesextension.video.profiledVideoBitrate = k;
        playloggamesextension.video.profiledAudioChannels = l;
        playloggamesextension.video.profiledAudioSampleRate = i1;
        playloggamesextension.video.profiledAudioBitrate = j1;
        playloggamesextension.video.profiledFileSizeBytes = l1;
        logEvent(context, s2, playloggamesextension);
    }

    public static void logVideoServiceAction(Context context, String s, String s1, String s2, int i, int j)
    {
        com.google.android.gms.games.proto.PlayGames.PlaylogGamesExtension playloggamesextension = new com.google.android.gms.games.proto.PlayGames.PlaylogGamesExtension();
        playloggamesextension.requestInfo = GamesLogHelper.getRequestInfo(context, s, s1);
        playloggamesextension.video = new com.google.android.gms.games.proto.PlayGames.PlaylogGamesVideoAction();
        playloggamesextension.video.recordingState = i;
        playloggamesextension.video.statusCode = j;
        logEvent(context, s2, playloggamesextension);
    }

    public static void logVideoUiAction(Context context, String s, String s1, String s2, int i, boolean flag, boolean flag1, boolean flag2, 
            boolean flag3)
    {
        com.google.android.gms.games.proto.PlayGames.PlaylogGamesExtension playloggamesextension = new com.google.android.gms.games.proto.PlayGames.PlaylogGamesExtension();
        playloggamesextension.requestInfo = GamesLogHelper.getRequestInfo(context, s, s1);
        playloggamesextension.video = new com.google.android.gms.games.proto.PlayGames.PlaylogGamesVideoAction();
        playloggamesextension.video.uiState = i;
        playloggamesextension.video.isCameraAvailable = flag;
        playloggamesextension.video.isCameraEnabled = flag1;
        playloggamesextension.video.isMicAvailable = flag2;
        playloggamesextension.video.isMicEnabled = flag3;
        logEvent(context, s2, playloggamesextension);
    }

    static 
    {
        DBG = ((Boolean)G.verboseGamesPlaylogLogging.get()).booleanValue();
    }
}
