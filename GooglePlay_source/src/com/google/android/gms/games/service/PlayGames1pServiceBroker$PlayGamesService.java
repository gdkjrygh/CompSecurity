// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.service;

import android.accounts.Account;
import android.content.Context;
import android.os.Binder;
import android.os.Handler;
import android.os.Message;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.google.android.gms.clearcut.ClearcutLogger;
import com.google.android.gms.clearcut.ClearcutLoggerApi;
import com.google.android.gms.clearcut.LogEventParcelable;
import com.google.android.gms.common.GoogleSignatureVerifier;
import com.google.android.gms.common.config.GservicesValue;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.AndroidUtils;
import com.google.android.gms.common.util.ArrayUtils;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.games.broker.Agents;
import com.google.android.gms.games.broker.GamesClientContext;
import com.google.android.gms.games.broker.GamesExperiments;
import com.google.android.gms.games.client.IPlayGamesCallbacks;
import com.google.android.gms.games.config.G;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.signin.SignInCache;
import com.google.android.gms.games.ui.util.UiUtils;
import com.google.android.gms.games.video.VideoConfiguration;
import com.google.android.gms.playlog.internal.PlayLoggerContext;
import com.google.android.play.analytics.EventLogger;
import com.google.android.play.analytics.ProtoCache;
import com.google.android.play.experiments.PlayExperiments;
import com.google.android.play.utils.Assertions;
import com.google.android.play.utils.PlayUtils;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import com.google.protobuf.nano.MessageNano;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;

// Referenced classes of package com.google.android.gms.games.service:
//            PlayGames1pServiceBroker, PlayGamesAsyncService

public static final class mPlayerId extends com.google.android.gms.games.client.
{

    private final ClientContext mClientContext;
    private final int mClientVersion;
    private final Context mContext;
    private final String mExternalGameId;
    private final boolean mIsHeadless;
    private final String mPlayerId;

    private void checkFirstPartyAllowed()
        throws SecurityException
    {
        GoogleSignatureVerifier.getInstance().verifyUidIsGoogleSigned(mContext.getPackageManager(), Binder.getCallingUid());
        if (!mClientContext.hasScope("https://www.googleapis.com/auth/games.firstparty") || mClientContext.hasScope("https://www.googleapis.com/auth/games"))
        {
            throw new SecurityException("Incorrect scope configuration - 1P access denied");
        } else
        {
            return;
        }
    }

    private void checkHeadlessAllowed()
        throws SecurityException
    {
        if (!mIsHeadless)
        {
            checkIsSignedIn();
        }
    }

    private void checkIsSignedIn()
        throws SecurityException
    {
        if (mIsHeadless)
        {
            throw new IllegalStateException("Can't be headless when checking if signed in");
        }
        if (!SignInCache.isSignedIn(mContext, mClientContext))
        {
            throw new SecurityException("Not signed in when calling API");
        } else
        {
            return;
        }
    }

    private GamesClientContext getGamesContextFirstParty(String s)
    {
        return getGamesContextFirstParty(s, null, false, new String[0]);
    }

    private transient GamesClientContext getGamesContextFirstParty(String s, String s1, boolean flag, String as[])
    {
        ClientContext clientcontext1 = mClientContext;
        String s2 = mExternalGameId;
        ClientContext clientcontext = clientcontext1;
        if (as.length > 0)
        {
            clientcontext1 = Agents.cloneClientContext(clientcontext1);
            int i = 0;
            int j = as.length;
            do
            {
                clientcontext = clientcontext1;
                if (i >= j)
                {
                    break;
                }
                clientcontext1.addGrantedScope(as[i]);
                i++;
            } while (true);
        }
        as = new com.google.android.gms.games.broker..mExternalGameId(mContext, clientcontext);
        as.tPlayerId = mPlayerId;
        as.mPlayerId = flag;
        as.GameId = s;
        as.PlayerId = s1;
        if (!TextUtils.isEmpty(s2))
        {
            as.GameId = s2;
        }
        return as.GameId();
    }

    private EventLogger getLogger(String s)
    {
        Map map = PlayGames1pServiceBroker.LOGGER_MAP;
        map;
        JVM INSTR monitorenter ;
        Object obj = (EventLogger)PlayGames1pServiceBroker.LOGGER_MAP.get(s);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_27;
        }
        map;
        JVM INSTR monitorexit ;
        return ((EventLogger) (obj));
        com.google.android.play.analytics.ce ce;
        String s1;
        String s2;
        ce = new com.google.android.play.analytics.ce();
        ce.ce = (String)G.odysseyServerUrl.get();
        ce. = "games_logs";
        s1 = ((TelephonyManager)mContext.getSystemService("phone")).getSimOperator();
        s2 = UiUtils.getDestinationAppVersionName(mContext);
        if (s != null) goto _L2; else goto _L1
_L1:
        obj = null;
_L4:
        obj = new EventLogger(mContext, "oauth2:https://www.googleapis.com/auth/games", com.google.android.play.analytics.ce.mContext, PlayUtils.getDefaultUserAgentString(mContext), AndroidUtils.getAndroidId$faab219(), s2, s1, ce, ((Account) (obj)));
        PlayGames1pServiceBroker.LOGGER_MAP.put(s, obj);
        map;
        JVM INSTR monitorexit ;
        return ((EventLogger) (obj));
_L2:
        obj = new Account(s, "com.google");
        if (true) goto _L4; else goto _L3
_L3:
        s;
        map;
        JVM INSTR monitorexit ;
        throw s;
    }

    public final List getExperiments()
    {
        checkFirstPartyAllowed();
        checkHeadlessAllowed();
        java.util.Set set = GamesExperiments.getInstance().getExperimentIds(mClientContext);
        if (set == null)
        {
            return null;
        } else
        {
            return new ArrayList(set);
        }
    }

    public final void launchGameForRecording(IPlayGamesCallbacks iplaygamescallbacks, String s, String s1, VideoConfiguration videoconfiguration)
    {
        boolean flag1 = true;
        checkFirstPartyAllowed();
        checkIsSignedIn();
        Preconditions.checkNotNull(iplaygamescallbacks, "Must provide a valid callback object");
        Preconditions.checkState(PlatformVersion.checkVersion(21), "Must be at least lollipop to support video recording");
        boolean flag;
        if (!TextUtils.isEmpty(s1))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag, "Package name must not be empty");
        if (!TextUtils.isEmpty(s))
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag, "Game ID must not be empty");
        Preconditions.checkNotNull(videoconfiguration, "A configuration must be provided");
        PlayGamesAsyncService.launchGameForRecordingFirstParty(getGamesContextFirstParty(s, null, false, new String[0]), iplaygamescallbacks, s1, videoconfiguration);
    }

    public final void listVideos(IPlayGamesCallbacks iplaygamescallbacks, String s)
    {
        checkFirstPartyAllowed();
        checkIsSignedIn();
        Preconditions.checkNotNull(iplaygamescallbacks, "Must provide a valid callback object");
        Preconditions.checkState(PlatformVersion.checkVersion(21), "Must be at least lollipop to support video recording");
        PlayGamesAsyncService.listVideosFirstParty(getGamesContextFirstParty(s), iplaygamescallbacks);
    }

    public final void loadCommonGames(IPlayGamesCallbacks iplaygamescallbacks, String s, int i, boolean flag, boolean flag1)
    {
        checkFirstPartyAllowed();
        checkIsSignedIn();
        Preconditions.checkNotNull(iplaygamescallbacks, "Must provide a valid callback object");
        boolean flag2;
        if (!TextUtils.isEmpty(s))
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        Preconditions.checkState(flag2, "Player ID must not be empty or null.");
        PlayGamesAsyncService.loadCommonGames(getGamesContextFirstParty(null, s, flag1, new String[0]), iplaygamescallbacks, i, flag);
    }

    public final void loadDisjointGames(IPlayGamesCallbacks iplaygamescallbacks, String s, int i, boolean flag, boolean flag1)
    {
        checkFirstPartyAllowed();
        checkIsSignedIn();
        Preconditions.checkNotNull(iplaygamescallbacks, "Must provide a valid callback object");
        boolean flag2;
        if (!TextUtils.isEmpty(s))
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        Preconditions.checkState(flag2, "Player ID must not be empty or null.");
        PlayGamesAsyncService.loadDisjointGames(getGamesContextFirstParty(null, s, flag1, new String[0]), iplaygamescallbacks, i, flag);
    }

    public final void loadExperiments(IPlayGamesCallbacks iplaygamescallbacks)
    {
        checkFirstPartyAllowed();
        checkHeadlessAllowed();
        Preconditions.checkNotNull(iplaygamescallbacks, "Must provide a valid callback object");
        PlayGamesAsyncService.loadExperiments(getGamesContextFirstParty(null, null, false, new String[0]), iplaygamescallbacks);
    }

    public final void loadGame(IPlayGamesCallbacks iplaygamescallbacks, String s)
    {
        checkFirstPartyAllowed();
        checkHeadlessAllowed();
        Preconditions.checkNotNull(iplaygamescallbacks, "Must provide a valid callback object");
        boolean flag;
        if (!TextUtils.isEmpty(s))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag, "Game ID must not be empty");
        PlayGamesAsyncService.loadGameFirstParty(getGamesContextFirstParty(s), iplaygamescallbacks);
    }

    public final void loadGameCollection(IPlayGamesCallbacks iplaygamescallbacks, int i, int j, boolean flag, boolean flag1)
    {
        checkFirstPartyAllowed();
        checkHeadlessAllowed();
        Preconditions.checkNotNull(iplaygamescallbacks, "Must provide a valid callback object");
        j;
        JVM INSTR tableswitch 0 7: default 64
    //                   0 96
    //                   1 96
    //                   2 96
    //                   3 96
    //                   4 96
    //                   5 96
    //                   6 96
    //                   7 96;
           goto _L1 _L2 _L2 _L2 _L2 _L2 _L2 _L2 _L2
_L1:
        boolean flag2 = false;
_L4:
        Preconditions.checkState(flag2, "Invalid game collection type");
        PlayGamesAsyncService.loadGamesCollection(getGamesContextFirstParty(null, null, flag1, new String[0]), iplaygamescallbacks, i, j, flag);
        return;
_L2:
        flag2 = true;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void loadRecentlyPlayedGames(IPlayGamesCallbacks iplaygamescallbacks, String s, int i, boolean flag, boolean flag1)
    {
        checkFirstPartyAllowed();
        checkIsSignedIn();
        boolean flag2;
        if (i <= 50)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        Preconditions.checkState(flag2, "We don't handle loading more than %d games simultaneously", new Object[] {
            Integer.valueOf(50)
        });
        PlayGamesAsyncService.loadPlayGamesRecentlyPlayed(getGamesContextFirstParty(null, s, flag1, new String[] {
            "https://www.googleapis.com/auth/drive.appdata"
        }), iplaygamescallbacks, i, flag);
    }

    public final void logEvent(String s, byte abyte0[])
    {
        long l;
        Preconditions.checkNotNull(abyte0);
        Object obj;
        int i;
        int j;
        try
        {
            abyte0 = (com.google.android.gms.games.proto.e)MessageNano.mergeFrom$1ec43da(new com.google.android.gms.games.proto.e(), abyte0, abyte0.length);
            if (((com.google.android.gms.games.proto.e) (abyte0)).o == null)
            {
                abyte0.o = new com.google.android.gms.games.proto.o();
            }
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new IllegalArgumentException("Invalid proto", s);
        }
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        obj = GamesExperiments.getInstance().getLocalExperiments(new Account(s, "com.google"));
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        ((com.google.android.gms.games.proto.o) (abyte0)).o. = ArrayUtils.toLongArray(((PlayExperiments) (obj)).getExperiments());
        j = UiUtils.getDestinationAppVersion(mContext);
        i = j;
        if (j == 0)
        {
            i = -1;
        }
        ((com.google.android.gms.games.proto.e.mContext) (abyte0)).o.sVersion = i;
        if (((Boolean)G.verboseGamesPlaylogLogging.get()).booleanValue())
        {
            GamesLog.d("GamesLog", abyte0.sVersion());
        }
        if (!((Boolean)G.useEventLogger.get()).booleanValue())
        {
            break MISSING_BLOCK_LABEL_242;
        }
        s = getLogger(s);
        abyte0 = MessageNano.toByteArray(abyte0);
        l = System.currentTimeMillis();
        Assertions.checkState(true, "Extras must be null or of even length.");
        obj = (com.google.android.play.analytics.ce.getLogger)((EventLogger) (s)).mProtoCache.mCacheLogEvent.getLogger();
        obj.getLogger = l;
        obj.onds = TimeZone.getDefault().getRawOffset() / 1000;
        obj.onds = "GAMES";
        obj.onds = null;
        if (abyte0 == null)
        {
            break MISSING_BLOCK_LABEL_229;
        }
        obj.onds = abyte0;
        ((EventLogger) (s)).mHandler.obtainMessage(2, obj).sendToTarget();
        return;
        l = Binder.clearCallingIdentity();
        s = new com.google.android.gms.clearcut.(new ClearcutLogger(mContext, "GAMES", s), com.google.android.gms.games.proto.y(abyte0), '\0');
        s.rray = 5;
        if (((com.google.android.gms.clearcut.rray) (s)).)
        {
            throw new IllegalStateException("do not reuse LogEventBuilder");
        }
        break MISSING_BLOCK_LABEL_319;
        s;
        Binder.restoreCallingIdentity(l);
        throw s;
        s. = true;
        ClearcutLogger.access$1300(((com.google.android.gms.clearcut.) (s)).).logEventAsync(ClearcutLogger.access$1400(((com.google.android.gms.clearcut.) (s)).), new LogEventParcelable(new PlayLoggerContext(ClearcutLogger.access$1000(((com.google.android.gms.clearcut.) (s)).), ClearcutLogger.access$1100(((com.google.android.gms.clearcut.) (s)).), ((com.google.android.gms.clearcut.) (s))., ((com.google.android.gms.clearcut.) (s)).ame, ((com.google.android.gms.clearcut.ame) (s)).untName, ((com.google.android.gms.clearcut.untName) (s)).untName, ClearcutLogger.access$900(((com.google.android.gms.clearcut.untName) (s)).untName), ((com.google.android.gms.clearcut.untName) (s)).untName), ((com.google.android.gms.clearcut.untName) (s)).untName, null, null, ClearcutLogger.access$1200(null)));
        Binder.restoreCallingIdentity(l);
        return;
    }

    public final void searchForGames(IPlayGamesCallbacks iplaygamescallbacks, String s, int i, boolean flag, boolean flag1)
    {
        checkFirstPartyAllowed();
        checkIsSignedIn();
        boolean flag2;
        if (!TextUtils.isEmpty(s))
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        Preconditions.checkState(flag2, "Query must not be empty");
        PlayGamesAsyncService.searchForGames(getGamesContextFirstParty(null, null, flag1, new String[0]), iplaygamescallbacks, s, i, flag);
    }

    public (Context context)
    {
        this(context, null, -1, null, false, null);
    }

    public <init>(Context context, ClientContext clientcontext, int i, String s, boolean flag, String s1)
    {
        GservicesValue.init(context.getApplicationContext());
        mContext = context;
        mClientContext = clientcontext;
        mClientVersion = i;
        mExternalGameId = s;
        mIsHeadless = flag;
        mPlayerId = s1;
    }
}
