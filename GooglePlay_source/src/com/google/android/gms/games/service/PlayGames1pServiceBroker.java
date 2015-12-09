// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.service;

import android.accounts.Account;
import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v4.util.ArrayMap;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.google.android.gms.clearcut.ClearcutLogger;
import com.google.android.gms.clearcut.ClearcutLoggerApi;
import com.google.android.gms.clearcut.LogEventParcelable;
import com.google.android.gms.common.GoogleSignatureVerifier;
import com.google.android.gms.common.config.GservicesValue;
import com.google.android.gms.common.internal.AbstractServiceBroker;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.common.internal.GetServiceRequest;
import com.google.android.gms.common.internal.IGmsCallbacks;
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
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;

// Referenced classes of package com.google.android.gms.games.service:
//            PlayGamesAsyncService

public final class PlayGames1pServiceBroker extends AbstractServiceBroker
{
    public static final class PlayGamesService extends com.google.android.gms.games.client.IPlayGamesService.Stub
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
            as = new com.google.android.gms.games.broker.GamesClientContext.Builder(mContext, clientcontext);
            as.mExternalCurrentPlayerId = mPlayerId;
            as.mForceReload = flag;
            as.mExternalTargetGameId = s;
            as.mExternalTargetPlayerId = s1;
            if (!TextUtils.isEmpty(s2))
            {
                as.mExternalOwningGameId = s2;
            }
            return as.build();
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
            com.google.android.play.analytics.EventLogger.Configuration configuration;
            String s1;
            String s2;
            configuration = new com.google.android.play.analytics.EventLogger.Configuration();
            configuration.mServerUrl = (String)G.odysseyServerUrl.get();
            configuration.logDirectoryName = "games_logs";
            s1 = ((TelephonyManager)mContext.getSystemService("phone")).getSimOperator();
            s2 = UiUtils.getDestinationAppVersionName(mContext);
            if (s != null) goto _L2; else goto _L1
_L1:
            obj = null;
_L4:
            obj = new EventLogger(mContext, "oauth2:https://www.googleapis.com/auth/games", com.google.android.play.analytics.EventLogger.LogSource.GAMES, PlayUtils.getDefaultUserAgentString(mContext), AndroidUtils.getAndroidId$faab219(), s2, s1, configuration, ((Account) (obj)));
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
            Set set = GamesExperiments.getInstance().getExperimentIds(mClientContext);
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
        //                       0 96
        //                       1 96
        //                       2 96
        //                       3 96
        //                       4 96
        //                       5 96
        //                       6 96
        //                       7 96;
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
                abyte0 = (com.google.android.gms.games.proto.PlayGames.PlaylogGamesExtension)MessageNano.mergeFrom$1ec43da(new com.google.android.gms.games.proto.PlayGames.PlaylogGamesExtension(), abyte0, abyte0.length);
                if (((com.google.android.gms.games.proto.PlayGames.PlaylogGamesExtension) (abyte0)).requestInfo == null)
                {
                    abyte0.requestInfo = new com.google.android.gms.games.proto.PlayGames.PlaylogGamesRequestInfo();
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
            ((com.google.android.gms.games.proto.PlayGames.PlaylogGamesExtension) (abyte0)).requestInfo.targetId = ArrayUtils.toLongArray(((PlayExperiments) (obj)).getExperiments());
            j = UiUtils.getDestinationAppVersion(mContext);
            i = j;
            if (j == 0)
            {
                i = -1;
            }
            ((com.google.android.gms.games.proto.PlayGames.PlaylogGamesExtension) (abyte0)).requestInfo.playGamesVersion = i;
            if (((Boolean)G.verboseGamesPlaylogLogging.get()).booleanValue())
            {
                GamesLog.d("GamesLog", abyte0.toString());
            }
            if (!((Boolean)G.useEventLogger.get()).booleanValue())
            {
                break MISSING_BLOCK_LABEL_242;
            }
            s = getLogger(s);
            abyte0 = MessageNano.toByteArray(abyte0);
            l = System.currentTimeMillis();
            Assertions.checkState(true, "Extras must be null or of even length.");
            obj = (com.google.android.play.analytics.ClientAnalytics.LogEvent)((EventLogger) (s)).mProtoCache.mCacheLogEvent.obtain();
            obj.eventTimeMs = l;
            obj.timezoneOffsetSeconds = TimeZone.getDefault().getRawOffset() / 1000;
            obj.tag = "GAMES";
            obj.exp = null;
            if (abyte0 == null)
            {
                break MISSING_BLOCK_LABEL_229;
            }
            obj.sourceExtension = abyte0;
            ((EventLogger) (s)).mHandler.obtainMessage(2, obj).sendToTarget();
            return;
            l = Binder.clearCallingIdentity();
            s = new com.google.android.gms.clearcut.ClearcutLogger.LogEventBuilder(new ClearcutLogger(mContext, "GAMES", s), com.google.android.gms.games.proto.PlayGames.PlaylogGamesExtension.toByteArray(abyte0), '\0');
            s.mLogSource = 5;
            if (((com.google.android.gms.clearcut.ClearcutLogger.LogEventBuilder) (s)).mIsConsumed)
            {
                throw new IllegalStateException("do not reuse LogEventBuilder");
            }
            break MISSING_BLOCK_LABEL_319;
            s;
            Binder.restoreCallingIdentity(l);
            throw s;
            s.mIsConsumed = true;
            ClearcutLogger.access$1300(((com.google.android.gms.clearcut.ClearcutLogger.LogEventBuilder) (s)).this$0).logEventAsync(ClearcutLogger.access$1400(((com.google.android.gms.clearcut.ClearcutLogger.LogEventBuilder) (s)).this$0), new LogEventParcelable(new PlayLoggerContext(ClearcutLogger.access$1000(((com.google.android.gms.clearcut.ClearcutLogger.LogEventBuilder) (s)).this$0), ClearcutLogger.access$1100(((com.google.android.gms.clearcut.ClearcutLogger.LogEventBuilder) (s)).this$0), ((com.google.android.gms.clearcut.ClearcutLogger.LogEventBuilder) (s)).mLogSource, ((com.google.android.gms.clearcut.ClearcutLogger.LogEventBuilder) (s)).mLogSourceName, ((com.google.android.gms.clearcut.ClearcutLogger.LogEventBuilder) (s)).mUploadAccountName, ((com.google.android.gms.clearcut.ClearcutLogger.LogEventBuilder) (s)).mLoggingId, ClearcutLogger.access$900(((com.google.android.gms.clearcut.ClearcutLogger.LogEventBuilder) (s)).this$0), ((com.google.android.gms.clearcut.ClearcutLogger.LogEventBuilder) (s)).mQosTier), ((com.google.android.gms.clearcut.ClearcutLogger.LogEventBuilder) (s)).mLogEvent, null, null, ClearcutLogger.access$1200(null)));
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

        public PlayGamesService(Context context)
        {
            this(context, null, -1, null, false, null);
        }

        public PlayGamesService(Context context, ClientContext clientcontext, int i, String s, boolean flag, String s1)
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


    static final Map LOGGER_MAP = new ArrayMap();

    public PlayGames1pServiceBroker(Context context)
    {
        super(context);
    }

    protected final Set getRequiredPermissionGroups()
    {
        return Collections.emptySet();
    }

    public final void onGetService(IGmsCallbacks igmscallbacks, GetServiceRequest getservicerequest)
    {
        GamesLog.d("Games1pServiceBroker", (new StringBuilder("client connected with version: ")).append(getservicerequest.clientVersion).toString());
        String s = getservicerequest.callingPackage;
        if (TextUtils.isEmpty(s))
        {
            throw new IllegalArgumentException("invalid package name");
        }
        Bundle bundle = getservicerequest.extraArgs;
        bundle.setClassLoader(getClass().getClassLoader());
        if (!"com.google.android.play.games".equals(s))
        {
            boolean flag = bundle.getBoolean("unauthenticated");
            boolean flag1 = GoogleSignatureVerifier.getInstance().isPackageGoogleSigned(mContext.getPackageManager(), s);
            if (!flag || !flag1)
            {
                Asserts.fail("Only Play Games can use this package!");
            }
        }
        AndroidUtils.verifyPackageName(mContext, s);
        PlayGamesAsyncService.validatePlayService(mContext, igmscallbacks, getservicerequest);
    }

}
