// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.service;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.os.Process;
import android.os.RemoteException;
import android.text.TextUtils;
import com.android.common.SharedPreferencesCompat;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.GoogleSignatureVerifier;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.config.GservicesValue;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.gservices.GServicesHelper;
import com.google.android.gms.common.images.ImageBroker;
import com.google.android.gms.common.internal.AbstractServiceBroker;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.common.internal.GetServiceRequest;
import com.google.android.gms.common.internal.IGmsCallbacks;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
import com.google.android.gms.common.oob.SignUp;
import com.google.android.gms.common.permission.PermissionChecker;
import com.google.android.gms.common.ui.UnpackingRedirectActivity;
import com.google.android.gms.common.util.AccountUtils;
import com.google.android.gms.common.util.AndroidUtils;
import com.google.android.gms.common.util.ClientLibraryUtils;
import com.google.android.gms.common.util.ImageUtils;
import com.google.android.gms.common.util.NumberUtils;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.ScopeUtil;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.drive.Drive;
import com.google.android.gms.drive.DriveContents;
import com.google.android.gms.drive.internal.DriveContentsImpl;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameBuffer;
import com.google.android.gms.games.GamesSharedPrefs;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerBuffer;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.games.PlayerRef;
import com.google.android.gms.games.achievement.AchievementEntity;
import com.google.android.gms.games.broker.Agents;
import com.google.android.gms.games.broker.AppContentContext;
import com.google.android.gms.games.broker.GameEventListenerRegistry;
import com.google.android.gms.games.broker.GamesClientContext;
import com.google.android.gms.games.config.G;
import com.google.android.gms.games.internal.AbstractGamesCallbacks;
import com.google.android.gms.games.internal.GamesConstants;
import com.google.android.gms.games.internal.GamesIntents;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.internal.IGamesCallbacks;
import com.google.android.gms.games.internal.IGamesClient;
import com.google.android.gms.games.internal.constants.LeaderboardCollection;
import com.google.android.gms.games.internal.constants.NotificationChannel;
import com.google.android.gms.games.internal.constants.QuestState;
import com.google.android.gms.games.internal.constants.TimeSpan;
import com.google.android.gms.games.internal.events.EventIncrementCache;
import com.google.android.gms.games.internal.events.EventIncrementManager;
import com.google.android.gms.games.internal.multiplayer.ZInvitationCluster;
import com.google.android.gms.games.internal.request.GameRequestCluster;
import com.google.android.gms.games.leaderboard.LeaderboardScoreBufferHeader;
import com.google.android.gms.games.logging.GamesPlayLogger;
import com.google.android.gms.games.multiplayer.Invitation;
import com.google.android.gms.games.multiplayer.InvitationBuffer;
import com.google.android.gms.games.multiplayer.ParticipantEntity;
import com.google.android.gms.games.multiplayer.ParticipantResult;
import com.google.android.gms.games.multiplayer.ParticipantUtils;
import com.google.android.gms.games.multiplayer.realtime.Room;
import com.google.android.gms.games.multiplayer.realtime.RoomBuffer;
import com.google.android.gms.games.multiplayer.realtime.RoomEntity;
import com.google.android.gms.games.provider.ColumnSpec;
import com.google.android.gms.games.server.GamesServer;
import com.google.android.gms.games.signin.SignInCache;
import com.google.android.gms.games.snapshot.SnapshotMetadataChange;
import com.google.android.gms.games.snapshot.SnapshotMetadataChangeEntity;
import com.google.android.gms.games.ui.popup.BasePopup;
import com.google.android.gms.games.ui.popup.InvitationPopup;
import com.google.android.gms.games.ui.popup.WelcomePopup;
import com.google.android.gms.games.ui.util.UiUtils;
import com.google.android.gms.games.util.PanoUtils;
import com.google.android.gms.games.utils.GamesDataUtils;
import com.google.android.gms.games.utils.UriUtils;
import com.google.android.gms.games.video.VideoConfiguration;
import com.google.android.gms.nearby.Nearby;
import com.google.android.gms.nearby.messages.Message;
import com.google.android.gms.nearby.messages.MessageListener;
import com.google.android.gms.nearby.messages.Messages;
import com.google.android.gms.nearby.messages.MessagesInternal;
import com.google.android.gms.plus.internal.PlusCommonExtras;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.google.android.gms.games.service:
//            GamesSessionRecorder, PlayGamesAsyncService, RoomServiceClient, WrappedGamesCallbacks, 
//            ApiClientTracker, GamesNotificationHelper

public final class PlayGamesServiceBroker extends AbstractServiceBroker
{
    private static final class ClientContextEqualityWrapper
    {

        private final ClientContext mClientContext;

        public final boolean equals(Object obj)
        {
            if (obj == null || !(obj instanceof ClientContextEqualityWrapper))
            {
                return false;
            }
            Object obj1 = (ClientContextEqualityWrapper)obj;
            obj = mClientContext;
            obj1 = ((ClientContextEqualityWrapper) (obj1)).mClientContext;
            if (!((ClientContext) (obj1)).equals(obj))
            {
                return false;
            }
            if (!(new HashSet(((ClientContext) (obj)).mGrantedScopes)).equals(new HashSet(((ClientContext) (obj1)).mGrantedScopes)))
            {
                return false;
            }
            if (!(new HashSet(((ClientContext) (obj)).mVisibleActions)).equals(new HashSet(((ClientContext) (obj1)).mVisibleActions)))
            {
                return false;
            }
            Object obj2 = ((ClientContext) (obj)).mExtras.keySet();
            if (!((Set) (obj2)).equals(((ClientContext) (obj1)).mExtras.keySet()))
            {
                return false;
            }
            for (obj2 = ((Set) (obj2)).iterator(); ((Iterator) (obj2)).hasNext();)
            {
                String s = (String)((Iterator) (obj2)).next();
                if (!Objects.equal(((ClientContext) (obj)).mExtras.get(s), ((ClientContext) (obj1)).mExtras.get(s)))
                {
                    return false;
                }
            }

            return true;
        }

        public final int hashCode()
        {
            return mClientContext.hashCode();
        }

        ClientContextEqualityWrapper(ClientContext clientcontext)
        {
            Preconditions.checkNotNull(clientcontext);
            mClientContext = clientcontext;
        }
    }

    public static final class GamesService extends com.google.android.gms.games.internal.IGamesService.Stub
    {

        public ApiClientTracker mApiClientTracker;
        final ClientContext mClientContext;
        private final int mClientVersion;
        private final Context mContext;
        final HashMap mCopresenceListeners = new HashMap();
        final Object mCopresenceMessageLock = new Object();
        public ContentValues mCurrentGameValues;
        public ContentValues mCurrentPlayerValues;
        public final String mExternalGameId;
        private AtomicBoolean mHasUsedRealtimeMultiplayer;
        private final EventIncrementManager mIncrementCache = new _cls1();
        public final boolean mIsHeadless;
        private final HashMap mPublishedCopresenceMessages = new HashMap();
        public final GamesSessionRecorder mSessionRecorder;
        public final Map mTrackedApis = new HashMap();

        private Intent buildQuestIntent(String s)
        {
            s = new Intent(s);
            s.putExtra("com.google.android.gms.games.GAME_PACKAGE_NAME", mClientContext.mCallingPackageName);
            s.addFlags(0x4000000);
            return s;
        }

        private void checkFirstPartyAllowed()
            throws SecurityException
        {
            checkGoogleSigned();
            if (!mClientContext.hasScope("https://www.googleapis.com/auth/games.firstparty") || mClientContext.hasScope("https://www.googleapis.com/auth/games"))
            {
                throw new SecurityException("Incorrect scope configuration - 1P access denied");
            } else
            {
                return;
            }
        }

        private void checkGoogleSigned()
            throws SecurityException
        {
            GoogleSignatureVerifier.getInstance().verifyUidIsGoogleSigned(mContext.getPackageManager(), Binder.getCallingUid());
        }

        private void checkGoogleSignedOrSelf()
            throws SecurityException
        {
            if (Process.myUid() != Binder.getCallingUid())
            {
                checkGoogleSigned();
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

        private void checkPermissionsSelf()
            throws SecurityException
        {
            if (!GooglePlayServicesUtil.uidHasPackageName(mContext, Binder.getCallingUid(), "com.google.android.play.games"))
            {
                throw new SecurityException("Self permission check failed");
            } else
            {
                return;
            }
        }

        private String getCurrentPlayerIdForService()
        {
            if (mIsHeadless)
            {
                return null;
            } else
            {
                checkIsSignedIn();
                Preconditions.checkNotNull(mCurrentPlayerValues);
                return mCurrentPlayerValues.getAsString("external_player_id");
            }
        }

        private GamesClientContext getGamesContext3PTo1P(String s)
        {
            return getGamesContext3PTo1P(s, null, false, new String[0]);
        }

        private transient GamesClientContext getGamesContext3PTo1P(String s, String s1, boolean flag, String as[])
        {
            ClientContext clientcontext = Agents.buildFirstPartyClientContext(mClientContext);
            for (int i = as.length - 1; i >= 0; i--)
            {
                clientcontext.addGrantedScope(as[i]);
            }

            as = new com.google.android.gms.games.broker.GamesClientContext.Builder(mContext, clientcontext);
            as.mExternalCurrentPlayerId = getCurrentPlayerIdForService();
            as.mForceReload = flag;
            as.mExternalTargetPlayerId = s1;
            if (!TextUtils.isEmpty(s))
            {
                as.mExternalTargetGameId = s;
            }
            return as.build();
        }

        private GamesClientContext getGamesContextFirstParty(String s)
        {
            return getGamesContextFirstParty(s, null, false, new String[0]);
        }

        private transient GamesClientContext getGamesContextFirstParty(String s, String s1, boolean flag, String as[])
        {
            ClientContext clientcontext1 = mClientContext;
            boolean flag1 = "593950602418".equals(mExternalGameId);
            boolean flag2 = GamesClientContext.isFirstPartyAppId(clientcontext1, mExternalGameId);
            boolean flag3 = ((Boolean)G.useSeparateIdForPlayGamesAndGmsCore.getBinderSafe()).booleanValue();
            String s3 = mExternalGameId;
            ClientContext clientcontext = clientcontext1;
            String s2 = s3;
            if (!flag3)
            {
                clientcontext = clientcontext1;
                s2 = s3;
                if (flag1)
                {
                    clientcontext = Agents.buildFirstPartyClientContext(mClientContext);
                    s2 = null;
                }
            }
            clientcontext1 = clientcontext;
            if (as.length > 0)
            {
                int i;
                int j;
                if (flag3 && flag1 || flag2)
                {
                    clientcontext = Agents.cloneClientContext(clientcontext);
                } else
                {
                    clientcontext = Agents.buildFirstPartyClientContext(mClientContext);
                }
                i = 0;
                j = as.length;
                do
                {
                    clientcontext1 = clientcontext;
                    if (i >= j)
                    {
                        break;
                    }
                    clientcontext.addGrantedScope(as[i]);
                    i++;
                } while (true);
            }
            as = new com.google.android.gms.games.broker.GamesClientContext.Builder(mContext, clientcontext1);
            as.mExternalCurrentPlayerId = getCurrentPlayerIdForService();
            as.mForceReload = flag;
            as.mExternalTargetGameId = s;
            as.mExternalTargetPlayerId = s1;
            if (mIsHeadless)
            {
                if (getCurrentPlayerIdForService() == null)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                Preconditions.checkState(flag, "Current player should be null in the headless UI");
                as.mExternalCurrentPlayerId = s1;
            }
            if (!TextUtils.isEmpty(s2))
            {
                as.mExternalOwningGameId = s2;
            }
            return as.build();
        }

        private static ArrayList getRequestTypeArray(int i)
        {
            ArrayList arraylist = new ArrayList();
            if ((i & 1) != 0)
            {
                arraylist.add(Integer.valueOf(1));
            }
            if ((i & 2) != 0)
            {
                arraylist.add(Integer.valueOf(2));
            }
            return arraylist;
        }

        private RoomServiceClient getRoomServiceClient()
        {
            mHasUsedRealtimeMultiplayer.set(true);
            return RoomServiceClient.Holder.access$100();
        }

        private final Intent prepForClient(Intent intent)
        {
            intent.setPackage("com.google.android.play.games");
            return GamesIntents.prepForClient(intent, mClientVersion, mClientContext.getResolvedAccountName());
        }

        private void signOut(IGamesCallbacks igamescallbacks, boolean flag)
        {
            checkIsSignedIn();
            mIncrementCache.flush();
            mCurrentPlayerValues = null;
            GameEventListenerRegistry.getInstance().clear(mClientContext.getResolvedAccountName());
            if (mHasUsedRealtimeMultiplayer.get())
            {
                getRoomServiceClient().onSignOut(mContext, mClientContext);
            }
            igamescallbacks = wrapCallbacks(igamescallbacks, true);
            PlayGamesAsyncService.signOut(mContext, mClientContext, igamescallbacks, flag);
            if (flag)
            {
                GamesPlayLogger.logInGameAction(mContext, mClientContext.mCallingPackageName, mExternalGameId, mClientContext.getResolvedAccountName(), 6);
            }
        }

        private static void validateExternalIds(String as[])
        {
            int i;
            boolean flag;
            if (as != null && as.length > 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkState(flag, "Must provide at least one ID!");
            i = 0;
            while (i < as.length) 
            {
                if (!TextUtils.isEmpty(as[i]))
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                Preconditions.checkState(flag, (new StringBuilder("Not a valid external ID: ")).append(as[i]).toString());
                i++;
            }
        }

        private static void validateMatchTurnStatuses(int ai[])
        {
            int i;
            boolean flag;
            if (ai.length > 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkState(flag, "Must provide at least one turn status!");
            i = 0;
            while (i < ai.length) 
            {
                int j = ai[i];
                if (j >= 0 && j < 4)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                Preconditions.checkState(flag, "Not a valid turn status: %s", new Object[] {
                    Integer.valueOf(j)
                });
                i++;
            }
        }

        private void validateSnapshotSizes(SnapshotMetadataChange snapshotmetadatachange, DriveContents drivecontents)
        {
            if (snapshotmetadatachange != null)
            {
                Object obj = snapshotmetadatachange.getCoverImage();
                if (obj != null)
                {
                    int k = ImageUtils.calculateBytes(((Bitmap) (obj)));
                    int i = getMaxSnapshotCoverImageBytes();
                    if (k > i)
                    {
                        GamesLog.w("GamesServiceBroker", (new StringBuilder("Snapshot cover image is too large. Currently at ")).append(k).append(" bytes; max is ").append(i).append(". Image will be scaled").toString());
                        k = ((Bitmap) (obj)).getHeight();
                        int l = ((Bitmap) (obj)).getWidth();
                        int i1 = ((Bitmap) (obj)).getRowBytes() / l;
                        float f = (float)l / (float)k;
                        float f1 = i1;
                        i = (int)Math.sqrt((float)i / (f * f1));
                        obj = new BitmapTeleporter(Bitmap.createScaledBitmap(((Bitmap) (obj)), (int)(((float)i / (float)k) * (float)l), i, true));
                        ((BitmapTeleporter) (obj)).setTempDir(mContext.getCacheDir());
                        snapshotmetadatachange.replaceCoverImage(((BitmapTeleporter) (obj)));
                    }
                }
            }
            int j;
            long l1;
            boolean flag;
            if (drivecontents.getMode() != 0x20000000)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Asserts.checkState(flag, "Provided an unreadable contents object!");
            l1 = drivecontents.getParcelFileDescriptor().getStatSize();
            j = getMaxSnapshotDataBytes();
            if (l1 > (long)j)
            {
                throw new IllegalArgumentException((new StringBuilder("Contents are too large - provided ")).append(l1).append(" bytes; max is ").append(j).toString());
            } else
            {
                return;
            }
        }

        private void verifySnapshotsEnabled()
        {
            while (mCurrentGameValues == null || mCurrentGameValues.getAsBoolean("snapshots_enabled").booleanValue()) 
            {
                return;
            }
            signOut(null, false);
            Asserts.fail("Cannot use snapshots without enabling the 'Saved Game' feature in the Play console");
        }

        private WrappedGamesCallbacks wrapCallbacks(IGamesCallbacks igamescallbacks, boolean flag)
        {
            Object obj = null;
            if (igamescallbacks != null)
            {
                igamescallbacks = new WrappedGamesCallbacks(igamescallbacks, mExternalGameId);
            } else
            {
                igamescallbacks = obj;
                if (!flag)
                {
                    Asserts.fail("Cannot wrap a null callback here!");
                    return null;
                }
            }
            return igamescallbacks;
        }

        public final void acceptQuest(IGamesCallbacks igamescallbacks, String s)
        {
            checkIsSignedIn();
            igamescallbacks = wrapCallbacks(igamescallbacks, false);
            Preconditions.checkNotEmpty(s, "Must provide a valid quest id");
            mIncrementCache.flush();
            PlayGamesAsyncService.acceptQuest(getDefaultGamesContext(false), igamescallbacks, s);
        }

        public final void acceptRequests(IGamesCallbacks igamescallbacks, String as[])
        {
            checkIsSignedIn();
            igamescallbacks = wrapCallbacks(igamescallbacks, false);
            validateExternalIds(as);
            PlayGamesAsyncService.acceptRequests(getGamesContext3PTo1P(mExternalGameId), igamescallbacks, as);
        }

        public final void acceptTurnBasedInvitation(IGamesCallbacks igamescallbacks, String s)
        {
            checkIsSignedIn();
            igamescallbacks = wrapCallbacks(igamescallbacks, false);
            boolean flag;
            if (!TextUtils.isEmpty(s))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkState(flag, "Match ID must not be empty");
            PlayGamesAsyncService.acceptTurnBasedInvitation(getDefaultGamesContext(false), igamescallbacks, s);
        }

        public final void acceptTurnBasedInvitationFirstParty(IGamesCallbacks igamescallbacks, String s, String s1)
        {
            boolean flag1 = true;
            checkFirstPartyAllowed();
            checkHeadlessAllowed();
            igamescallbacks = wrapCallbacks(igamescallbacks, false);
            boolean flag;
            if (!TextUtils.isEmpty(s))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkState(flag, "Must accept turn-based invite on behalf of a valid game");
            if (!TextUtils.isEmpty(s1))
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
            Preconditions.checkState(flag, "Match ID must not be empty");
            PlayGamesAsyncService.acceptTurnBasedInvitation(getGamesContextFirstParty(s), igamescallbacks, s1);
        }

        public final void cancelPopups()
        {
            BasePopup.removePopups();
        }

        public final void cancelTurnBasedMatch(IGamesCallbacks igamescallbacks, String s)
        {
            boolean flag = true;
            checkIsSignedIn();
            igamescallbacks = wrapCallbacks(igamescallbacks, true);
            if (TextUtils.isEmpty(s))
            {
                flag = false;
            }
            Preconditions.checkState(flag, "Match ID must not be empty");
            PlayGamesAsyncService.cancelTurnBasedMatch(getDefaultGamesContext(false), igamescallbacks, s);
        }

        public final void claimMilestone(IGamesCallbacks igamescallbacks, String s, String s1)
        {
            checkIsSignedIn();
            igamescallbacks = wrapCallbacks(igamescallbacks, false);
            Preconditions.checkNotEmpty(s1, "Must provide a valid milestone id");
            Preconditions.checkNotEmpty(s, "Must provide a valid quest id");
            mIncrementCache.flush();
            PlayGamesAsyncService.claimMilestone(getDefaultGamesContext(false), igamescallbacks, s, s1);
        }

        public final void clearNotifications(int i)
        {
            checkIsSignedIn();
            String s = UriUtils.getDataStoreNameFromClientContext(mClientContext);
            PlayGamesAsyncService.clearNotifications$182ca992(mContext, s, mExternalGameId, i);
        }

        public final void clearNotificationsFirstParty(String s, int i)
        {
            checkFirstPartyAllowed();
            checkHeadlessAllowed();
            String s1;
            boolean flag;
            if (s == null || s.length() > 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkState(flag, "Must provide a valid Game ID, or null for 'all games'");
            s1 = UriUtils.getDataStoreNameFromClientContext(mClientContext);
            PlayGamesAsyncService.clearNotifications$182ca992(mContext, s1, s, i);
        }

        public final void clearPendingEvents()
            throws RemoteException
        {
            checkIsSignedIn();
            mIncrementCache.flush();
            PlayGamesAsyncService.clearPendingEvents(getDefaultGamesContext(false));
        }

        public final void clientDisconnecting(long l)
        {
            GamesSessionRecorder gamessessionrecorder;
            mIncrementCache.flush();
            GameEventListenerRegistry.getInstance().clearClient(l);
            if (mHasUsedRealtimeMultiplayer.get())
            {
                getRoomServiceClient().onClientDisconnecting(mContext, mClientContext, l);
            }
            gamessessionrecorder = mSessionRecorder;
            Object obj = gamessessionrecorder.mSessionLock;
            obj;
            JVM INSTR monitorenter ;
            if (gamessessionrecorder.mSessionId == null)
            {
                break MISSING_BLOCK_LABEL_98;
            }
            boolean flag;
            if (gamessessionrecorder.mRefCounter > 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkState(flag, "We should never be decrementing the session reference counter, unless it is greater than 0.");
            gamessessionrecorder.mRefCounter = gamessessionrecorder.mRefCounter - 1;
            gamessessionrecorder.attemptEndSession_locked();
            obj;
            JVM INSTR monitorexit ;
            if (PlatformVersion.checkVersion(21))
            {
                PlayGamesAsyncService.stopVideoRecording(mContext, mClientContext.mCallingPackageName);
            }
            return;
            Exception exception;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public final void commitAndCloseSnapshot(IGamesCallbacks igamescallbacks, String s, SnapshotMetadataChangeEntity snapshotmetadatachangeentity, Contents contents)
        {
            checkIsSignedIn();
            DriveContentsImpl drivecontentsimpl = new DriveContentsImpl(contents);
            Preconditions.checkState(usesApi(Drive.API), "Must include Drive.SCOPE_APPFOLDER to use snapshots!");
            verifySnapshotsEnabled();
            igamescallbacks = wrapCallbacks(igamescallbacks, false);
            Preconditions.checkNotEmpty(s, "Must provide a non-empty snapshot ID");
            Preconditions.checkNotNull(snapshotmetadatachangeentity, "Must provide a non-null metadata change");
            Preconditions.checkNotNull(contents, "Must provide non-null contents");
            validateSnapshotSizes(snapshotmetadatachangeentity, drivecontentsimpl);
            mApiClientTracker.incRef();
            PlayGamesAsyncService.commitAndCloseSnapshot(getDefaultGamesContext(false), igamescallbacks, mApiClientTracker, s, snapshotmetadatachangeentity, drivecontentsimpl);
        }

        public final ParcelFileDescriptor createNativeSocket(String s)
        {
            checkIsSignedIn();
            Preconditions.checkState(ParticipantUtils.isValidParticipantId(s), "Invalid participant ID %s", new Object[] {
                s
            });
            return getRoomServiceClient().createNativeSocket(new com.google.android.gms.games.service.statemachine.roomclient.Messages.CreateNativeSocketData(s));
        }

        public final void createRoom(IGamesCallbacks igamescallbacks, IBinder ibinder, int i, String as[], Bundle bundle, boolean flag, long l)
        {
            checkIsSignedIn();
            igamescallbacks = wrapCallbacks(igamescallbacks, false);
            Preconditions.checkNotNull(as, "Invited players must not be null");
            boolean flag1;
            if (i != -1)
            {
                String s;
                int j;
                int k;
                if (i > 0)
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                Preconditions.checkState(flag1, "Variant must be a positive integer if provided! Input was %s", new Object[] {
                    Integer.valueOf(i)
                });
            }
            if (bundle != null)
            {
                j = bundle.getInt("min_automatch_players");
                k = bundle.getInt("max_automatch_players");
                if (j >= 0)
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                Preconditions.checkState(flag1, "Min players must be a positive integer");
                if (j <= k)
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                Preconditions.checkState(flag1, "Min players must be less than or equal to max players");
            }
            s = mClientContext.getResolvedAccountName();
            getRoomServiceClient().enterRoom(new com.google.android.gms.games.service.statemachine.roomclient.Messages.CreateRoomData(mContext, mClientContext, mExternalGameId, igamescallbacks, ibinder, i, as, bundle, flag, l, s, getCurrentPlayerIdForService()));
        }

        public final String createSocketConnection(String s)
        {
            checkIsSignedIn();
            Preconditions.checkState(ParticipantUtils.isValidParticipantId(s), "Invalid participant ID %s", new Object[] {
                s
            });
            return getRoomServiceClient().createSocketConnection(new com.google.android.gms.games.service.statemachine.roomclient.Messages.CreateSocketConnectionData(s));
        }

        public final void createTurnBasedMatch(IGamesCallbacks igamescallbacks, int i, int j, String as[], Bundle bundle)
        {
            boolean flag1 = true;
            checkIsSignedIn();
            igamescallbacks = wrapCallbacks(igamescallbacks, false);
            Preconditions.checkNotNull(as, "Invited players must not be null");
            boolean flag;
            if (i != -1)
            {
                int k;
                int l;
                if (i > 0)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                Preconditions.checkState(flag, (new StringBuilder("Variant must be a positive integer if provided! Input was ")).append(i).toString());
            }
            if (bundle != null)
            {
                k = bundle.getInt("min_automatch_players");
                l = bundle.getInt("max_automatch_players");
                if (k >= 0)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                Preconditions.checkState(flag, "Min players must be a positive integer");
                if (k <= l)
                {
                    flag = flag1;
                } else
                {
                    flag = false;
                }
                Preconditions.checkState(flag, "Min players must be less than or equal to max players");
            }
            PlayGamesAsyncService.createTurnBasedMatch(getDefaultGamesContext(false), igamescallbacks, i, j, as, bundle);
        }

        public final void declineInvitation(String s, int i)
        {
            checkIsSignedIn();
            boolean flag;
            if (!TextUtils.isEmpty(s))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkState(flag, "Invitation ID must not be null or empty");
            PlayGamesAsyncService.declineInvitation(getDefaultGamesContext(false), s, i);
        }

        public final void declineInvitationFirstParty(String s, String s1, int i)
        {
            boolean flag1 = true;
            checkFirstPartyAllowed();
            checkHeadlessAllowed();
            boolean flag;
            if (!TextUtils.isEmpty(s))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkState(flag, "Must decline invite on behalf of a valid game");
            if (!TextUtils.isEmpty(s1))
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
            Preconditions.checkState(flag, "Invitation ID must not be null or empty");
            PlayGamesAsyncService.declineInvitation(getGamesContextFirstParty(s), s1, i);
            GamesNotificationHelper.setUseNewPlayerNotifications(mContext, false);
        }

        public final void deleteSnapshot(IGamesCallbacks igamescallbacks, String s)
        {
            checkIsSignedIn();
            Preconditions.checkState(usesApi(Drive.API), "Must include Drive.SCOPE_APPFOLDER to use snapshots!");
            verifySnapshotsEnabled();
            igamescallbacks = wrapCallbacks(igamescallbacks, false);
            Preconditions.checkNotEmpty(s, "Must provide a non-empty snapshot ID");
            mApiClientTracker.incRef();
            PlayGamesAsyncService.deleteSnapshot(getDefaultGamesContext(false), igamescallbacks, mApiClientTracker, s);
        }

        public final void discardSnapshotContents(Contents contents)
        {
            checkIsSignedIn();
            DriveContentsImpl drivecontentsimpl = new DriveContentsImpl(contents);
            Preconditions.checkState(usesApi(Drive.API), "Must include Drive.SCOPE_APPFOLDER to use snapshots!");
            verifySnapshotsEnabled();
            Preconditions.checkNotNull(contents, "Must provide non-null contents");
            drivecontentsimpl.discard(mApiClientTracker.getApiClient());
        }

        public final void dismissInvitation(String s, int i)
        {
            checkIsSignedIn();
            boolean flag;
            if (!TextUtils.isEmpty(s))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkState(flag, "Invitation ID must not be null or empty");
            PlayGamesAsyncService.dismissInvitation(getDefaultGamesContext(false), s, i);
        }

        public final void dismissInvitationFirstParty(String s, String s1, int i)
        {
            boolean flag1 = true;
            checkFirstPartyAllowed();
            checkHeadlessAllowed();
            boolean flag;
            if (!TextUtils.isEmpty(s))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkState(flag, "Must dismiss invitation on behalf of a valid game");
            if (!TextUtils.isEmpty(s1))
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
            Preconditions.checkState(flag, "Invitation ID must not be null or empty");
            PlayGamesAsyncService.dismissInvitation(getGamesContextFirstParty(s), s1, i);
        }

        public final void dismissMatch(String s)
        {
            checkIsSignedIn();
            Preconditions.checkNotNull(s, "Match ID must not be null");
            PlayGamesAsyncService.dismissMatch(getDefaultGamesContext(false), s);
        }

        public final void dismissPlayerSuggestionFirstParty(String s)
        {
            checkFirstPartyAllowed();
            checkIsSignedIn();
            boolean flag;
            if (!TextUtils.isEmpty(s))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkState(flag, "Player ID must not be empty");
            PlayGamesAsyncService.dismissPlayerSuggestion(getGamesContextFirstParty(null, s, false, new String[] {
                "https://www.googleapis.com/auth/plus.circles.write"
            }));
        }

        public final void dismissRequests(IGamesCallbacks igamescallbacks, String as[])
        {
            checkIsSignedIn();
            igamescallbacks = wrapCallbacks(igamescallbacks, false);
            validateExternalIds(as);
            PlayGamesAsyncService.dismissRequests(getGamesContext3PTo1P(mExternalGameId), igamescallbacks, as);
        }

        public final void dismissRequestsFirstParty(IGamesCallbacks igamescallbacks, String s, String s1, String as[])
        {
            checkFirstPartyAllowed();
            checkHeadlessAllowed();
            igamescallbacks = wrapCallbacks(igamescallbacks, false);
            boolean flag;
            if (!TextUtils.isEmpty(s))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkState(flag, "Must provide a valid game ID");
            validateExternalIds(as);
            s = getGamesContextFirstParty(s, s1, false, new String[0]);
            Preconditions.checkState(s.isTargetingCurrentPlayer(), "Attempting to load requests for another player");
            PlayGamesAsyncService.dismissRequests(s, igamescallbacks, as);
        }

        public final void dismissTurnBasedMatchFirstParty(String s, String s1)
        {
            boolean flag1 = true;
            checkFirstPartyAllowed();
            checkHeadlessAllowed();
            boolean flag;
            if (!TextUtils.isEmpty(s))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkState(flag, "Must dismiss match on behalf of a valid game");
            if (!TextUtils.isEmpty(s1))
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
            Preconditions.checkState(flag, "Match ID must not be empty");
            PlayGamesAsyncService.dismissMatch(getGamesContextFirstParty(s), s1);
        }

        final void endCopresence(String s)
        {
            if (!usesApi(Nearby.MESSAGES_API))
            {
                break MISSING_BLOCK_LABEL_86;
            }
            Object obj = mCopresenceMessageLock;
            obj;
            JVM INSTR monitorenter ;
            MessageListener messagelistener = (MessageListener)mCopresenceListeners.remove(s);
            if (messagelistener == null)
            {
                break MISSING_BLOCK_LABEL_78;
            }
            GoogleApiClient googleapiclient = mApiClientTracker.getApiClient();
            Nearby.Messages.unsubscribe(googleapiclient, messagelistener);
            s = (Message)mPublishedCopresenceMessages.remove(s);
            Nearby.Messages.unpublish(googleapiclient, s);
            obj;
            JVM INSTR monitorexit ;
            return;
            s;
            obj;
            JVM INSTR monitorexit ;
            throw s;
        }

        public final void finishTurnBasedMatch(IGamesCallbacks igamescallbacks, String s, byte abyte0[], ParticipantResult aparticipantresult[])
        {
            checkIsSignedIn();
            igamescallbacks = wrapCallbacks(igamescallbacks, false);
            boolean flag;
            if (!TextUtils.isEmpty(s))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkState(flag, "Match ID must not be empty");
            if (abyte0 != null)
            {
                if (abyte0.length <= getMaxTurnBasedMatchDataSize())
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                Preconditions.checkState(flag, "Match data is too large (%d bytes). The maximum is %d", new Object[] {
                    Integer.valueOf(abyte0.length), Integer.valueOf(getMaxTurnBasedMatchDataSize())
                });
            }
            PlayGamesAsyncService.finishTurnBasedMatch(getDefaultGamesContext(false), igamescallbacks, s, abyte0, aparticipantresult);
        }

        public final Intent getAchievementDescriptionIntentRestricted(AchievementEntity achievemententity)
        {
            checkGoogleSignedOrSelf();
            checkHeadlessAllowed();
            Preconditions.checkNotNull(achievemententity, "Must provide a valid achievement");
            Intent intent = new Intent("com.google.android.gms.games.VIEW_ACHIEVEMENT");
            intent.putExtra("com.google.android.gms.games.ACHIEVEMENT", achievemententity);
            return prepForClient(intent);
        }

        public final Intent getAchievementsIntent()
        {
            checkIsSignedIn();
            Intent intent = new Intent("com.google.android.gms.games.VIEW_ACHIEVEMENTS");
            intent.addFlags(0x4000000);
            return prepForClient(intent);
        }

        public final Intent getAllLeaderboardsIntent()
        {
            checkIsSignedIn();
            Intent intent = new Intent("com.google.android.gms.games.VIEW_LEADERBOARDS");
            intent.putExtra("com.google.android.gms.games.GAME_PACKAGE_NAME", mClientContext.mCallingPackageName);
            intent.addFlags(0x4000000);
            return prepForClient(intent);
        }

        public final String getAppId()
        {
            return mExternalGameId;
        }

        public final Intent getCompareProfileIntent(PlayerEntity playerentity)
        {
            checkIsSignedIn();
            Preconditions.checkNotNull(playerentity, "Must provide a valid player object");
            Intent intent = new Intent("com.google.android.gms.games.VIEW_PROFILE");
            intent.putExtra("com.google.android.gms.games.GAME_PACKAGE_NAME", mClientContext.mCallingPackageName);
            intent.putExtra("com.google.android.gms.games.PLAYER", playerentity);
            intent.putExtra("com.google.android.gms.games.IS_SELF", playerentity.mPlayerId.equals(getCurrentPlayerIdForService()));
            intent.putExtra("com.google.android.gms.games.ACCOUNT_NAME", mClientContext.mResolvedAccount.name);
            intent.addFlags(0x4000000);
            return prepForClient(intent);
        }

        public final Bundle getConnectionHint()
        {
            HashMap hashmap = PlayGamesServiceBroker.sConnectionHintMap;
            hashmap;
            JVM INSTR monitorenter ;
            Bundle bundle1 = (Bundle)PlayGamesServiceBroker.sConnectionHintMap.remove(mClientContext.mCallingPackageName);
            Bundle bundle;
            bundle = bundle1;
            if (bundle1 == null)
            {
                break MISSING_BLOCK_LABEL_59;
            }
            bundle = bundle1;
            if (!bundle1.containsKey("com.google.android.gms.games.ACCOUNT_KEY"))
            {
                break MISSING_BLOCK_LABEL_59;
            }
            bundle = bundle1;
            if (!GamesIntents.checkObfuscatedAccount(bundle1, mClientContext.getResolvedAccountName()))
            {
                bundle = null;
            }
            hashmap;
            JVM INSTR monitorexit ;
            return bundle;
            Exception exception;
            exception;
            hashmap;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public final String getCurrentAccountName()
        {
            checkIsSignedIn();
            if (!GooglePlayServicesUtil.uidHasPackageName(mContext, Binder.getCallingUid(), "com.google.android.play.games") && PermissionChecker.createInstance(mContext, mClientContext).checkPermission("android.permission.GET_ACCOUNTS") != 1)
            {
                String s = mClientContext.mCallingPackageName;
                throw new SecurityException((new StringBuilder("Package ")).append(s).append(" is missing permission android.permission.GET_ACCOUNTS").toString());
            } else
            {
                return mClientContext.getResolvedAccountName();
            }
        }

        public final DataHolder getCurrentGame()
        {
            checkIsSignedIn();
            Object obj = DataHolder.builder(GamesDataUtils.GAME_SPEC.mColumnNames);
            if (mCurrentGameValues == null)
            {
                obj = ((com.google.android.gms.common.data.DataHolder.Builder) (obj)).build(0);
            } else
            {
                obj = ((com.google.android.gms.common.data.DataHolder.Builder) (obj)).withRow(mCurrentGameValues).build(0);
            }
            obj.mIsLeakDetectionEnabled = false;
            return ((DataHolder) (obj));
        }

        public final DataHolder getCurrentPlayer()
        {
            checkIsSignedIn();
            Preconditions.checkNotNull(mCurrentPlayerValues);
            if (!GamesClientContext.isPlayerIdGPlusEnabled(getCurrentPlayerIdForService()))
            {
                return DataHolder.builder(com.google.android.gms.games.provider.GamesContractInternal.Players.ALL_COLUMNS).withRow(PlayerRef.copyForNonGplusUser(mCurrentPlayerValues)).build(0);
            } else
            {
                DataHolder dataholder = DataHolder.builder(com.google.android.gms.games.provider.GamesContractInternal.Players.ALL_COLUMNS).withRow(mCurrentPlayerValues).build(0);
                dataholder.mIsLeakDetectionEnabled = false;
                return dataholder;
            }
        }

        public final String getCurrentPlayerId()
        {
            String s1 = getCurrentPlayerIdForService();
            String s = s1;
            if (!GamesClientContext.isPlayerIdGPlusEnabled(s1))
            {
                s = null;
            }
            return s;
        }

        public final GamesClientContext getDefaultGamesContext(boolean flag)
        {
            if (mIsHeadless)
            {
                throw new IllegalStateException("Can't be headless with the default games context");
            } else
            {
                return GamesClientContext.buildContextFor3P(mContext, mClientContext, mExternalGameId, getCurrentPlayerIdForService(), flag);
            }
        }

        public final void getGamesAuthToken(IGamesCallbacks igamescallbacks)
        {
            checkIsSignedIn();
            igamescallbacks = wrapCallbacks(igamescallbacks, false);
            PlayGamesAsyncService.getGamesAuthToken(getDefaultGamesContext(false), igamescallbacks);
        }

        public final Uri getGamesContentUriRestricted(String s)
        {
            checkGoogleSigned();
            checkIsSignedIn();
            if (s != null)
            {
                return com.google.android.gms.games.provider.GamesContractInternal.Games.getUriForExternalGameId(mClientContext, s);
            } else
            {
                return com.google.android.gms.games.provider.GamesContractInternal.Games.getContentUri(mClientContext);
            }
        }

        public final void getInboxActivityCountsFirstParty(IGamesCallbacks igamescallbacks, String s)
        {
            boolean flag = false;
            checkFirstPartyAllowed();
            checkHeadlessAllowed();
            igamescallbacks = wrapCallbacks(igamescallbacks, false);
            if (s == null)
            {
                flag = true;
            }
            Preconditions.checkState(flag, "Game ID filtering not supported!");
            PlayGamesAsyncService.getInboxActivityCounts(getGamesContextFirstParty(s), igamescallbacks);
        }

        public final Intent getInvitationInboxIntent()
        {
            checkIsSignedIn();
            Intent intent = new Intent("com.google.android.gms.games.SHOW_INVITATIONS");
            intent.putExtra("com.google.android.gms.games.GAME_PACKAGE_NAME", mClientContext.mCallingPackageName);
            intent.addFlags(0x4000000);
            return prepForClient(intent);
        }

        public final Intent getLeaderboardIntent(String s)
        {
            return getLeaderboardIntentV2(s, -1);
        }

        public final Intent getLeaderboardIntentV2(String s, int i)
        {
            return getLeaderboardIntentV3(s, -1, -1);
        }

        public final Intent getLeaderboardIntentV3(String s, int i, int j)
        {
            checkIsSignedIn();
            if (i != -1)
            {
                Preconditions.checkState(TimeSpan.isValidTimeSpan(i), "Unrecognized time span %s", new Object[] {
                    Integer.valueOf(i)
                });
            }
            if (j != -1)
            {
                Preconditions.checkState(LeaderboardCollection.isValid(j), "Unknown collection %s", new Object[] {
                    Integer.valueOf(j)
                });
            }
            Intent intent = new Intent("com.google.android.gms.games.VIEW_LEADERBOARD_SCORES");
            intent.putExtra("com.google.android.gms.games.LEADERBOARD_ID", s);
            intent.putExtra("com.google.android.gms.games.LEADERBOARD_TIME_SPAN", i);
            intent.putExtra("com.google.android.gms.games.LEADERBOARD_COLLECTION", j);
            intent.putExtra("com.google.android.gms.games.GAME_PACKAGE_NAME", mClientContext.mCallingPackageName);
            intent.addFlags(0x4000000);
            return prepForClient(intent);
        }

        public final void getLeaderboardScore(IGamesCallbacks igamescallbacks, String s, String s1, int i, int j)
        {
            checkIsSignedIn();
            WrappedGamesCallbacks wrappedgamescallbacks = wrapCallbacks(igamescallbacks, false);
            boolean flag;
            if (!TextUtils.isEmpty(s1))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkState(flag, "External leaderboard ID must not be empty or null");
            Preconditions.checkArgument(TimeSpan.isValidTimeSpan(i), "Must provide a valid time span");
            Preconditions.checkArgument(LeaderboardCollection.isValid(j), "Must provide a valid leaderboard collection");
            igamescallbacks = s;
            if (TextUtils.isEmpty(s))
            {
                igamescallbacks = getCurrentPlayerIdForService();
            }
            s = getDefaultGamesContext(false).getBuilder();
            s.mExternalTargetPlayerId = igamescallbacks;
            PlayGamesAsyncService.getLeaderboardScore(s.build(), wrappedgamescallbacks, s1, i, j);
        }

        public final Intent getMatchInboxIntent()
        {
            checkIsSignedIn();
            Intent intent = new Intent("com.google.android.gms.games.SHOW_MULTIPLAYER_INBOX");
            intent.putExtra("com.google.android.gms.games.GAME_PACKAGE_NAME", mClientContext.mCallingPackageName);
            intent.addFlags(0x4000000);
            return prepForClient(intent);
        }

        public final int getMaxRequestLifetimeDays()
        {
            return GServicesHelper.getInt(G.maxRequestLifetimeDays);
        }

        public final int getMaxRequestPayloadSize()
        {
            return GServicesHelper.getInt(G.maxRequestPayloadBytes);
        }

        public final int getMaxSnapshotCoverImageBytes()
        {
            return GServicesHelper.getInt(G.maxSnapshotCoverImageBytes);
        }

        public final int getMaxSnapshotDataBytes()
        {
            return GServicesHelper.getInt(G.maxSnapshotBytes);
        }

        public final int getMaxTurnBasedMatchDataSize()
        {
            return GServicesHelper.getInt(G.maxTurnBasedMatchDataBytes);
        }

        public final Intent getParcelCompatIntent()
        {
            checkIsSignedIn();
            return prepForClient(new Intent("com.google.android.gms.games.PARCEL_COMPAT"));
        }

        public final ParcelFileDescriptor getParcelFileDescriptorFirstParty(Uri uri)
        {
            long l;
            checkIsSignedIn();
            checkFirstPartyAllowed();
            Preconditions.checkNotNull(uri, "Uri cannot be null");
            l = Binder.clearCallingIdentity();
            uri = ImageBroker.acquireBroker$3d64b9a2(mContext).loadImageFile(mContext, uri).getParcelFileDescriptor();
            Binder.restoreCallingIdentity(l);
            return uri;
            uri;
            Binder.restoreCallingIdentity(l);
            throw uri;
        }

        public final Intent getParticipantListIntentRestricted(ParticipantEntity aparticipantentity[], String s, String s1, Uri uri, Uri uri1)
        {
            return getParticipantListIntentRestrictedV2(aparticipantentity, s, s1, uri, uri1, mExternalGameId);
        }

        public final Intent getParticipantListIntentRestrictedV2(ParticipantEntity aparticipantentity[], String s, String s1, Uri uri, Uri uri1, String s2)
        {
            checkGoogleSignedOrSelf();
            checkHeadlessAllowed();
            Intent intent = new Intent("com.google.android.gms.games.VIEW_PARTICIPANTS");
            intent.putExtra("com.google.android.gms.games.PARTICIPANTS", aparticipantentity);
            intent.putExtra("com.google.android.gms.games.ACCOUNT_NAME", s);
            intent.putExtra("com.google.android.gms.games.PLAYER_ID", s1);
            intent.putExtra("com.google.android.gms.games.FEATURED_URI", uri);
            intent.putExtra("com.google.android.gms.games.ICON_URI", uri1);
            intent.putExtra("com.google.android.gms.games.GAME_ID", s2);
            return prepForClient(intent);
        }

        public final Intent getPlayerSearchIntent()
        {
            checkIsSignedIn();
            Intent intent = new Intent("com.google.android.gms.games.PLAYER_SEARCH");
            intent.putExtra("com.google.android.gms.games.GAME_PACKAGE_NAME", mClientContext.mCallingPackageName);
            return prepForClient(intent);
        }

        public final Intent getPlusUpgradeIntentFirstParty()
        {
            checkIsSignedIn();
            checkFirstPartyAllowed();
            Object obj;
            if (PanoUtils.isPano(mContext))
            {
                obj = new com.google.android.gms.plus.PlusIntents.SignUpIntentBuilder(mContext, mClientContext);
                obj.mSignUpState = 2;
                obj = ((com.google.android.gms.plus.PlusIntents.SignUpIntentBuilder) (obj)).build();
            } else
            {
                obj = SignUp.newSignUpIntent(mClientContext.mResolvedAccount.name);
            }
            SafeParcelableSerializer.serializeToIntentExtra(new PlusCommonExtras(), ((Intent) (obj)), "android.gms.plus.internal.PlusCommonExtras.extraPlusCommon");
            obj = PendingIntent.getActivity(mContext, 0, ((Intent) (obj)), 0x40000000);
            return UnpackingRedirectActivity.createDefaultIntent(mContext, ((PendingIntent) (obj)));
        }

        public final Intent getPublicInvitationListIntentRestricted(ZInvitationCluster zinvitationcluster, String s, String s1)
        {
            checkGoogleSignedOrSelf();
            checkHeadlessAllowed();
            Intent intent = new Intent("com.google.android.gms.games.SHOW_PUBLIC_INVITATIONS");
            intent.putExtra("com.google.android.gms.games.GAME_PACKAGE_NAME", mClientContext.mCallingPackageName);
            intent.putExtra("com.google.android.gms.games.INVITATION_CLUSTER", zinvitationcluster);
            intent.putExtra("com.google.android.gms.games.ACCOUNT_NAME", s);
            intent.putExtra("com.google.android.gms.games.PLAYER_ID", s1);
            return prepForClient(intent);
        }

        public final Intent getPublicRequestListIntentRestricted(GameRequestCluster gamerequestcluster, String s)
        {
            checkGoogleSignedOrSelf();
            checkHeadlessAllowed();
            Intent intent = new Intent("com.google.android.gms.games.SHOW_PUBLIC_REQUESTS");
            intent.putExtra("com.google.android.gms.games.GAME_PACKAGE_NAME", mClientContext.mCallingPackageName);
            intent.putExtra("com.google.android.gms.games.GAME_REQUEST_CLUSTER", gamerequestcluster);
            intent.putExtra("com.google.android.gms.games.ACCOUNT_NAME", s);
            return prepForClient(intent);
        }

        public final Intent getQuestIntent(String s)
        {
            checkIsSignedIn();
            Preconditions.checkNotNull(s, "Must provide a valid quest ID");
            mIncrementCache.flush();
            Intent intent = buildQuestIntent("com.google.android.gms.games.SHOW_QUEST");
            intent.putExtra("com.google.android.gms.games.QUEST_ID", s);
            return prepForClient(intent);
        }

        public final Intent getQuestsIntent(int ai[])
        {
            checkIsSignedIn();
            Intent intent;
            boolean flag;
            if (ai.length != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkState(flag, "Must provide at least one quest state");
            Preconditions.checkNotNull(ai, "Must provide a non-null array of quest states");
            Preconditions.checkState(QuestState.areValidSelectors(ai), "Invalid quest state provided.");
            mIncrementCache.flush();
            intent = buildQuestIntent("com.google.android.gms.games.SHOW_QUESTS");
            intent.putExtra("com.google.android.gms.games.QUEST_STATES", ai);
            return prepForClient(intent);
        }

        public final Intent getRealTimeSelectOpponentsIntent(int i, int j, boolean flag)
        {
            checkIsSignedIn();
            Intent intent = new Intent("com.google.android.gms.games.SELECT_OPPONENTS_REAL_TIME");
            intent.putExtra("com.google.android.gms.games.MIN_SELECTIONS", i);
            intent.putExtra("com.google.android.gms.games.MAX_SELECTIONS", j);
            intent.putExtra("com.google.android.gms.games.SHOW_AUTOMATCH", flag);
            intent.putExtra("com.google.android.gms.games.MULTIPLAYER_TYPE", 1);
            return prepForClient(intent);
        }

        public final Intent getRealTimeWaitingRoomIntent(RoomEntity roomentity, int i)
        {
            checkIsSignedIn();
            Preconditions.checkNotNull(roomentity, "Room parameter must not be null");
            Intent intent;
            boolean flag;
            if (i >= 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkState(flag, "minParticipantsToStart must be >= 0");
            intent = new Intent("com.google.android.gms.games.SHOW_REAL_TIME_WAITING_ROOM");
            intent.putExtra("room", roomentity);
            intent.putExtra("com.google.android.gms.games.MIN_PARTICIPANTS_TO_START", i);
            return prepForClient(intent);
        }

        public final Intent getRequestInboxIntent()
        {
            checkIsSignedIn();
            Intent intent = new Intent("com.google.android.gms.games.SHOW_REQUEST_INBOX");
            intent.putExtra("com.google.android.gms.games.GAME_PACKAGE_NAME", mClientContext.mCallingPackageName);
            intent.addFlags(0x4000000);
            return prepForClient(intent);
        }

        public final int getSdkVariant()
        {
            return GamesServer.getSdkVariant(mClientContext);
        }

        public final Intent getSelectSnapshotIntent(String s, boolean flag, boolean flag1, int i)
        {
label0:
            {
                boolean flag3 = false;
                checkIsSignedIn();
                Preconditions.checkState(usesApi(Drive.API), "Must include Drive.SCOPE_APPFOLDER to use snapshots!");
                verifySnapshotsEnabled();
                Intent intent;
                boolean flag2;
                if (!TextUtils.isEmpty(s))
                {
                    flag2 = true;
                } else
                {
                    flag2 = false;
                }
                Preconditions.checkState(flag2, "Must provide a valid title");
                if (i != -1)
                {
                    flag2 = flag3;
                    if (i <= 0)
                    {
                        break label0;
                    }
                }
                flag2 = true;
            }
            Preconditions.checkState(flag2, (new StringBuilder("maxSnapshots must be greater than 0 or equal to -1")).toString());
            intent = new Intent("com.google.android.gms.games.SHOW_SELECT_SNAPSHOT");
            intent.putExtra("com.google.android.gms.games.GAME_PACKAGE_NAME", mClientContext.mCallingPackageName);
            intent.putExtra("com.google.android.gms.games.TITLE", s);
            intent.putExtra("com.google.android.gms.games.ALLOW_CREATE_SNAPSHOT", flag);
            intent.putExtra("com.google.android.gms.games.ALLOW_DELETE_SNAPSHOT", flag1);
            intent.putExtra("com.google.android.gms.games.MAX_SNAPSHOTS", i);
            intent.addFlags(0x4000000);
            return prepForClient(intent);
        }

        public final String getSelectedAccountForGameRestricted(String s)
        {
            checkGoogleSignedOrSelf();
            checkHeadlessAllowed();
            boolean flag;
            if (!TextUtils.isEmpty(s))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkState(flag, "Game package name must not be empty");
            return AccountUtils.getValidSelectedAccount(mContext, s);
        }

        public final Intent getSendRequestIntent(int i, byte abyte0[], int j, String s)
        {
            boolean flag1 = true;
            checkIsSignedIn();
            Intent intent;
            boolean flag;
            if (i == 1 || i == 2)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkState(flag, "Must provide a valid type.");
            Preconditions.checkNotNull(abyte0, "Must provide a non-null payload.");
            if (abyte0.length <= getMaxRequestPayloadSize())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkState(flag, "Payload is too big");
            if (j <= getMaxRequestLifetimeDays() && (j > 0 || j == -1))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkState(flag, (new StringBuilder("Request lifetime days must be <= ")).append(getMaxRequestLifetimeDays()).append(", greater than zero, or -1 for server default.").toString());
            if (!TextUtils.isEmpty(s))
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
            Preconditions.checkState(flag, "Must provide a valid item description");
            intent = new Intent("com.google.android.gms.games.SEND_REQUEST");
            intent.putExtra("com.google.android.gms.games.REQUEST_TYPE", i);
            intent.putExtra("com.google.android.gms.games.PAYLOAD", abyte0);
            intent.putExtra("com.google.android.gms.games.REQUEST_LIFETIME", j);
            if (!TextUtils.isEmpty(s))
            {
                intent.putExtra("com.google.android.gms.games.REQUEST_ITEM_NAME", s);
            }
            intent.putExtra("com.google.android.gms.games.GAME_PACKAGE_NAME", mClientContext.mCallingPackageName);
            intent.addFlags(0x4000000);
            return prepForClient(intent);
        }

        public final Intent getSettingsIntent()
        {
            checkIsSignedIn();
            Intent intent = new Intent("com.google.android.gms.games.SHOW_SETTINGS");
            intent.putExtra("com.google.android.gms.games.GAME_PACKAGE_NAME", mClientContext.mCallingPackageName);
            intent.addFlags(0x4000000);
            return prepForClient(intent);
        }

        public final void getTurnBasedMatch(IGamesCallbacks igamescallbacks, String s)
        {
            checkIsSignedIn();
            igamescallbacks = wrapCallbacks(igamescallbacks, false);
            boolean flag;
            if (!TextUtils.isEmpty(s))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkState(flag, "Match ID must not be empty");
            PlayGamesAsyncService.getTurnBasedMatch(getDefaultGamesContext(false), igamescallbacks, s);
        }

        public final Intent getTurnBasedSelectOpponentsIntent(int i, int j, boolean flag)
        {
            checkIsSignedIn();
            Intent intent = new Intent("com.google.android.gms.games.SELECT_OPPONENTS_TURN_BASED");
            intent.putExtra("com.google.android.gms.games.MIN_SELECTIONS", i);
            intent.putExtra("com.google.android.gms.games.MAX_SELECTIONS", j);
            intent.putExtra("com.google.android.gms.games.SHOW_AUTOMATCH", flag);
            intent.putExtra("com.google.android.gms.games.MULTIPLAYER_TYPE", 0);
            return prepForClient(intent);
        }

        public final Intent getVideoOverlayRecordingIntent()
        {
            checkIsSignedIn();
            Intent intent;
            boolean flag;
            if (getCurrentGame().mRowCount > 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkState(flag, "Must have a current game");
            Preconditions.checkState(PlatformVersion.checkVersion(21), "Must be at least lollipop to support video recording");
            intent = new Intent("com.google.android.gms.games.DIALOG_LAUNCHER");
            intent.putExtra("GAMES_DIALOG_ID", 1);
            intent.putExtra("com.google.android.gms.games.GAME_PACKAGE_NAME", mClientContext.mCallingPackageName);
            intent.putExtra("com.google.android.gms.games.GAME", (Parcelable)(new GameBuffer(getCurrentGame())).get(0).freeze());
            intent.addFlags(0x4000000);
            return prepForClient(intent);
        }

        public final void incrementAchievement(IGamesCallbacks igamescallbacks, String s, int i, IBinder ibinder, Bundle bundle)
        {
            boolean flag1 = true;
            checkIsSignedIn();
            igamescallbacks = wrapCallbacks(igamescallbacks, true);
            boolean flag;
            if (!TextUtils.isEmpty(s))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkState(flag, "Achievement ID must not be null or empty");
            if (i > 0)
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
            Preconditions.checkState(flag, "Number of steps must be greater than 0");
            ibinder = new com.google.android.gms.games.internal.PopupManager.PopupLocationInfo(bundle, ibinder);
            PlayGamesAsyncService.incrementAchievement(getDefaultGamesContext(false), igamescallbacks, s, i, ibinder);
        }

        public final void incrementEvent(String s, int i)
            throws RemoteException
        {
            boolean flag1 = true;
            checkIsSignedIn();
            EventIncrementCache eventincrementcache;
            Object obj;
            Object obj1;
            Object obj2;
            boolean flag;
            if (!TextUtils.isEmpty(s))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkState(flag, "Event ID must not be null or empty");
            if (i >= 0)
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
            Preconditions.checkState(flag, "Number of steps must be >= 0");
            obj1 = mIncrementCache;
            obj = (EventIncrementCache)((EventIncrementManager) (obj1)).mEventIncrementCache.get();
            eventincrementcache = ((EventIncrementCache) (obj));
            if (obj == null)
            {
                obj = ((EventIncrementManager) (obj1)).buildCache();
                eventincrementcache = ((EventIncrementCache) (obj));
                if (!((EventIncrementManager) (obj1)).mEventIncrementCache.compareAndSet(null, obj))
                {
                    eventincrementcache = (EventIncrementCache)((EventIncrementManager) (obj1)).mEventIncrementCache.get();
                }
            }
            obj2 = eventincrementcache.mEventIncrementLock;
            obj2;
            JVM INSTR monitorenter ;
            if (!eventincrementcache.mFlushTimerOutstanding)
            {
                eventincrementcache.mFlushTimerOutstanding = true;
                eventincrementcache.mEventHandler.postDelayed(new com.google.android.gms.games.internal.events.EventIncrementCache._cls1(eventincrementcache), eventincrementcache.mFlushIntervalMillis);
            }
            obj1 = (AtomicInteger)eventincrementcache.mEventIncrementCache.get(s);
            obj = obj1;
            if (obj1 != null)
            {
                break MISSING_BLOCK_LABEL_188;
            }
            obj = new AtomicInteger();
            eventincrementcache.mEventIncrementCache.put(s, obj);
            ((AtomicInteger) (obj)).addAndGet(i);
            obj2;
            JVM INSTR monitorexit ;
            return;
            s;
            obj2;
            JVM INSTR monitorexit ;
            throw s;
        }

        public final void invalidateAppContentCacheFirstParty(String as[])
        {
            checkGoogleSigned();
            checkHeadlessAllowed();
            PlayGamesAsyncService.invalidateAppContentCache(getGamesContextFirstParty(null), as);
        }

        public final void isGameMutedInternal(IGamesCallbacks igamescallbacks, String s)
        {
            boolean flag = false;
            checkGoogleSignedOrSelf();
            checkHeadlessAllowed();
            igamescallbacks = wrapCallbacks(igamescallbacks, false);
            if (!TextUtils.isEmpty(s))
            {
                flag = true;
            }
            Preconditions.checkState(flag, "Game ID must not be empty");
            PlayGamesAsyncService.isGameMuted(getGamesContext3PTo1P(s), igamescallbacks);
        }

        public final void joinRoom(IGamesCallbacks igamescallbacks, IBinder ibinder, String s, boolean flag, long l)
        {
            checkIsSignedIn();
            igamescallbacks = wrapCallbacks(igamescallbacks, false);
            String s1;
            boolean flag1;
            if (!TextUtils.isEmpty(s))
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            Preconditions.checkState(flag1, "Room ID must not be null or empty");
            s1 = mClientContext.getResolvedAccountName();
            getRoomServiceClient().enterRoom(new com.google.android.gms.games.service.statemachine.roomclient.Messages.JoinRoomData(mContext, mClientContext, mExternalGameId, igamescallbacks, ibinder, flag, l, s1, getCurrentPlayerIdForService(), s));
        }

        public final void launchGameForRecordingRestricted(IGamesCallbacks igamescallbacks, String s, String s1, VideoConfiguration videoconfiguration)
        {
            checkGoogleSignedOrSelf();
            checkIsSignedIn();
            Preconditions.checkNotNull(igamescallbacks, "Must provide a valid callback object");
            Preconditions.checkState(PlatformVersion.checkVersion(21), "Must be at least lollipop to support video recording");
            GamesClientContext gamesclientcontext;
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
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkState(flag, "Game ID must not be empty");
            Preconditions.checkNotNull(videoconfiguration, "A configuration must be provided");
            if (videoconfiguration.mCaptureMode == 1)
            {
                gamesclientcontext = getGamesContextFirstParty(s, null, false, new String[] {
                    "https://www.googleapis.com/auth/youtube"
                });
            } else
            {
                gamesclientcontext = getGamesContextFirstParty(s, null, false, new String[0]);
            }
            PlayGamesAsyncService.launchGameForRecording(gamesclientcontext, new WrappedGamesCallbacks(igamescallbacks, s), s1, videoconfiguration);
        }

        public final void leaveRoom(IGamesCallbacks igamescallbacks, String s)
        {
            boolean flag = false;
            checkIsSignedIn();
            igamescallbacks = wrapCallbacks(igamescallbacks, false);
            if (!TextUtils.isEmpty(s))
            {
                flag = true;
            }
            Preconditions.checkState(flag, "Room ID must not be null or empty");
            getRoomServiceClient().leaveRoom(new com.google.android.gms.games.service.statemachine.roomclient.Messages.ClientLeaveRoomData(mContext, mClientContext, igamescallbacks, s));
        }

        public final void leaveTurnBasedMatch(IGamesCallbacks igamescallbacks, String s)
        {
            checkIsSignedIn();
            igamescallbacks = wrapCallbacks(igamescallbacks, false);
            boolean flag;
            if (!TextUtils.isEmpty(s))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkState(flag, "Match ID must not be empty");
            PlayGamesAsyncService.leaveTurnBasedMatch(getDefaultGamesContext(false), igamescallbacks, s, false, null);
        }

        public final void leaveTurnBasedMatchDuringTurn(IGamesCallbacks igamescallbacks, String s, String s1)
        {
            checkIsSignedIn();
            igamescallbacks = wrapCallbacks(igamescallbacks, false);
            boolean flag;
            if (!TextUtils.isEmpty(s))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkState(flag, "Match ID must not be empty");
            if (s1 != null)
            {
                Preconditions.checkState(ParticipantUtils.isValidParticipantId(s1), "Invalid participant ID %s", new Object[] {
                    s1
                });
            }
            PlayGamesAsyncService.leaveTurnBasedMatch(getDefaultGamesContext(false), igamescallbacks, s, true, s1);
        }

        public final void listVideos(IGamesCallbacks igamescallbacks)
        {
            checkIsSignedIn();
            Preconditions.checkNotNull(igamescallbacks, "Must provide a valid callback object");
            Preconditions.checkState(PlatformVersion.checkVersion(21), "Must be at least lollipop to support video recording");
            igamescallbacks = new WrappedGamesCallbacks(igamescallbacks, mExternalGameId);
            PlayGamesAsyncService.listVideos(getGamesContext3PTo1P(mExternalGameId), igamescallbacks);
        }

        public final void loadAchievements(IGamesCallbacks igamescallbacks)
        {
            loadAchievementsV2(igamescallbacks, false);
        }

        public final void loadAchievementsFirstParty(IGamesCallbacks igamescallbacks, String s, String s1)
        {
            String s2 = s;
            if (TextUtils.isEmpty(s))
            {
                s2 = getCurrentPlayerIdForService();
            }
            loadAchievementsFirstPartyV2(igamescallbacks, s2, s1, false);
        }

        public final void loadAchievementsFirstPartyV2(IGamesCallbacks igamescallbacks, String s, String s1, boolean flag)
        {
            checkFirstPartyAllowed();
            checkIsSignedIn();
            WrappedGamesCallbacks wrappedgamescallbacks = wrapCallbacks(igamescallbacks, false);
            boolean flag1;
            if (!TextUtils.isEmpty(s1))
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            Preconditions.checkState(flag1, "Game ID must not be empty");
            igamescallbacks = s;
            if (TextUtils.isEmpty(s))
            {
                igamescallbacks = getCurrentPlayerIdForService();
            }
            PlayGamesAsyncService.loadAchievementsInternal(getGamesContextFirstParty(s1, igamescallbacks, flag, new String[0]), wrappedgamescallbacks);
        }

        public final void loadAchievementsV2(IGamesCallbacks igamescallbacks, boolean flag)
        {
            checkIsSignedIn();
            igamescallbacks = wrapCallbacks(igamescallbacks, false);
            PlayGamesAsyncService.loadAchievements(getDefaultGamesContext(flag), igamescallbacks);
        }

        public final void loadAppContentFirstParty(IGamesCallbacks igamescallbacks, int i, String s, String as[], boolean flag)
        {
            checkGoogleSigned();
            checkHeadlessAllowed();
            igamescallbacks = wrapCallbacks(igamescallbacks, false);
            PlayGamesAsyncService.loadAppContentStream(getGamesContextFirstParty(null, null, flag, new String[0]), igamescallbacks, new AppContentContext(s, i, as));
        }

        public final void loadCircledPlayersFirstParty(IGamesCallbacks igamescallbacks, int i, boolean flag, boolean flag1)
        {
            checkFirstPartyAllowed();
            checkIsSignedIn();
            igamescallbacks = wrapCallbacks(igamescallbacks, false);
            PlayGamesAsyncService.loadCircledPlayers(getGamesContextFirstParty(null, null, flag1, new String[] {
                "https://www.googleapis.com/auth/plus.circles.read"
            }), igamescallbacks, i, flag);
        }

        public final void loadCommonGamesFirstParty(IGamesCallbacks igamescallbacks, String s, int i, boolean flag, boolean flag1)
        {
            Asserts.fail("Nothing should be calling this method any more!");
        }

        public final void loadConnectedPlayers(IGamesCallbacks igamescallbacks, boolean flag)
        {
            checkIsSignedIn();
            igamescallbacks = wrapCallbacks(igamescallbacks, false);
            PlayGamesAsyncService.loadConnectedPlayers(getDefaultGamesContext(flag), igamescallbacks, 0);
        }

        public final void loadConnectedPlayersFirstParty(IGamesCallbacks igamescallbacks, String s, int i, boolean flag)
        {
            boolean flag1;
            checkFirstPartyAllowed();
            checkIsSignedIn();
            igamescallbacks = wrapCallbacks(igamescallbacks, false);
            if (!TextUtils.isEmpty(s))
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            Preconditions.checkState(flag1, "Game ID must not be empty");
            Preconditions.checkState(NumberUtils.isNumeric(s), "Game ID must be numeric!");
            i;
            JVM INSTR tableswitch 0 2: default 72
        //                       0 124
        //                       1 124
        //                       2 124;
               goto _L1 _L2 _L2 _L2
_L1:
            flag1 = false;
_L4:
            Preconditions.checkState(flag1, "Unrecognized ROP level %s", new Object[] {
                Integer.valueOf(i)
            });
            PlayGamesAsyncService.loadConnectedPlayers(getGamesContextFirstParty(s, null, flag, new String[] {
                "https://www.googleapis.com/auth/plus.circles.members"
            }), igamescallbacks, i);
            return;
_L2:
            flag1 = true;
            if (true) goto _L4; else goto _L3
_L3:
        }

        public final void loadContactSettingsInternal(IGamesCallbacks igamescallbacks)
        {
            checkGoogleSigned();
            checkHeadlessAllowed();
            igamescallbacks = wrapCallbacks(igamescallbacks, false);
            ClientContext clientcontext = Agents.buildFirstPartyClientContext(mClientContext);
            PlayGamesAsyncService.loadContactSettings(mContext, clientcontext, igamescallbacks);
        }

        public final void loadContactSettingsInternalV2(IGamesCallbacks igamescallbacks, boolean flag)
        {
            checkGoogleSigned();
            checkHeadlessAllowed();
            igamescallbacks = wrapCallbacks(igamescallbacks, false);
            ClientContext clientcontext = Agents.buildFirstPartyClientContext(mClientContext);
            PlayGamesAsyncService.loadContactSettingsV2(mContext, clientcontext, igamescallbacks, flag);
        }

        public final void loadDisjointGamesFirstParty(IGamesCallbacks igamescallbacks, String s, int i, boolean flag, boolean flag1)
        {
            Asserts.fail("Nothing should be calling this method any more!");
        }

        public final void loadEvents(IGamesCallbacks igamescallbacks, boolean flag)
            throws RemoteException
        {
            checkIsSignedIn();
            igamescallbacks = wrapCallbacks(igamescallbacks, false);
            mIncrementCache.flush();
            PlayGamesAsyncService.loadEvents(getDefaultGamesContext(flag), igamescallbacks);
        }

        public final void loadEventsById(IGamesCallbacks igamescallbacks, boolean flag, String as[])
            throws RemoteException
        {
            boolean flag1 = false;
            checkIsSignedIn();
            igamescallbacks = wrapCallbacks(igamescallbacks, false);
            Preconditions.checkNotNull(as, "eventIds must not be null");
            if (as.length != 0)
            {
                flag1 = true;
            }
            Preconditions.checkState(flag1, "must specify at least one event id");
            mIncrementCache.flush();
            PlayGamesAsyncService.loadEvents(getDefaultGamesContext(flag), igamescallbacks, as);
        }

        public final void loadGame(IGamesCallbacks igamescallbacks)
        {
            checkIsSignedIn();
            igamescallbacks = wrapCallbacks(igamescallbacks, false);
            PlayGamesAsyncService.loadGame$228b84a2(getDefaultGamesContext(false), igamescallbacks);
        }

        public final void loadGameCollectionFirstParty(IGamesCallbacks igamescallbacks, int i, int j, boolean flag, boolean flag1)
        {
            Asserts.fail("Nothing should be calling this method any more!");
        }

        public final void loadGameFirstParty(IGamesCallbacks igamescallbacks, String s)
        {
            Asserts.fail("Nothing should be calling this method any more!");
        }

        public final void loadGameInstancesFirstParty(IGamesCallbacks igamescallbacks, String s)
        {
            boolean flag = false;
            checkFirstPartyAllowed();
            checkIsSignedIn();
            igamescallbacks = wrapCallbacks(igamescallbacks, false);
            if (!TextUtils.isEmpty(s))
            {
                flag = true;
            }
            Preconditions.checkState(flag, "Game ID must not be empty");
            PlayGamesAsyncService.loadGameInstances(getGamesContextFirstParty(s), igamescallbacks);
        }

        public final void loadGameSearchSuggestionsFirstParty(IGamesCallbacks igamescallbacks, String s)
        {
            boolean flag = false;
            checkFirstPartyAllowed();
            checkIsSignedIn();
            igamescallbacks = wrapCallbacks(igamescallbacks, false);
            if (!TextUtils.isEmpty(s))
            {
                flag = true;
            }
            Preconditions.checkState(flag, "Query must not be empty");
            PlayGamesAsyncService.loadGameSearchSuggestions(mContext, mClientContext, igamescallbacks, s);
        }

        public final void loadInvitablePlayers(IGamesCallbacks igamescallbacks, int i, boolean flag, boolean flag1)
        {
            boolean flag3 = false;
            checkIsSignedIn();
            igamescallbacks = wrapCallbacks(igamescallbacks, false);
            boolean flag2 = flag3;
            if (i > 0)
            {
                flag2 = flag3;
                if (i <= 25)
                {
                    flag2 = true;
                }
            }
            Preconditions.checkState(flag2, "Page size must be between 1 and 25");
            PlayGamesAsyncService.loadInvitablePlayers(getDefaultGamesContext(flag1), igamescallbacks, i, flag);
        }

        public final void loadInvitablePlayersFirstParty(IGamesCallbacks igamescallbacks, int i, boolean flag, boolean flag1)
        {
            checkFirstPartyAllowed();
            checkIsSignedIn();
            igamescallbacks = wrapCallbacks(igamescallbacks, false);
            boolean flag2;
            if (i > 0 && i <= 25)
            {
                flag2 = true;
            } else
            {
                flag2 = false;
            }
            Preconditions.checkState(flag2, "Page size must be between 1 and 25");
            PlayGamesAsyncService.loadInvitablePlayers(getGamesContextFirstParty(null, null, flag1, new String[] {
                "https://www.googleapis.com/auth/plus.circles.read"
            }), igamescallbacks, i, flag);
        }

        public final void loadInvitationFirstParty(IGamesCallbacks igamescallbacks, String s)
        {
            boolean flag = false;
            checkFirstPartyAllowed();
            checkHeadlessAllowed();
            igamescallbacks = wrapCallbacks(igamescallbacks, false);
            if (!TextUtils.isEmpty(s))
            {
                flag = true;
            }
            Preconditions.checkState(flag, "Must provide a valid Invitation ID");
            PlayGamesAsyncService.loadInvitation(getGamesContextFirstParty(null), igamescallbacks, s);
        }

        public final void loadInvitations(IGamesCallbacks igamescallbacks)
        {
            loadInvitationsV2(igamescallbacks, 0);
        }

        public final void loadInvitationsFirstParty(IGamesCallbacks igamescallbacks, String s)
        {
            loadInvitationsFirstPartyV2(igamescallbacks, s, true);
        }

        public final void loadInvitationsFirstPartyV2(IGamesCallbacks igamescallbacks, String s, boolean flag)
        {
            loadInvitationsFirstPartyV3(igamescallbacks, s, 0, flag);
        }

        public final void loadInvitationsFirstPartyV3(IGamesCallbacks igamescallbacks, String s, int i, boolean flag)
        {
label0:
            {
                boolean flag2 = false;
                checkFirstPartyAllowed();
                checkHeadlessAllowed();
                igamescallbacks = wrapCallbacks(igamescallbacks, false);
                boolean flag1;
                if (i == 0 || i == 1)
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                Preconditions.checkState(flag1, "Invalid invitation sort order!");
                if (s != null)
                {
                    flag1 = flag2;
                    if (s.length() <= 0)
                    {
                        break label0;
                    }
                }
                flag1 = true;
            }
            Preconditions.checkState(flag1, "Must provide a valid Game ID, or null for 'all games'");
            PlayGamesAsyncService.loadInvitations(getGamesContextFirstParty(s), igamescallbacks, i, flag);
        }

        public final void loadInvitationsV2(IGamesCallbacks igamescallbacks, int i)
        {
            boolean flag1 = true;
            checkIsSignedIn();
            igamescallbacks = wrapCallbacks(igamescallbacks, false);
            boolean flag = flag1;
            if (i != 0)
            {
                if (i == 1)
                {
                    flag = flag1;
                } else
                {
                    flag = false;
                }
            }
            Preconditions.checkState(flag, "Invalid invitation sort order!");
            PlayGamesAsyncService.loadInvitations(getDefaultGamesContext(false), igamescallbacks, i, false);
        }

        public final void loadLeaderboard(IGamesCallbacks igamescallbacks, String s)
        {
            loadLeaderboardV2(igamescallbacks, s, false);
        }

        public final void loadLeaderboardFirstParty(IGamesCallbacks igamescallbacks, String s, String s1)
        {
            loadLeaderboardFirstPartyV2(igamescallbacks, s, s1, false);
        }

        public final void loadLeaderboardFirstPartyV2(IGamesCallbacks igamescallbacks, String s, String s1, boolean flag)
        {
            boolean flag2 = true;
            checkFirstPartyAllowed();
            checkIsSignedIn();
            igamescallbacks = wrapCallbacks(igamescallbacks, false);
            boolean flag1;
            if (!TextUtils.isEmpty(s))
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            Preconditions.checkState(flag1, "Game ID must not be empty");
            if (!TextUtils.isEmpty(s1))
            {
                flag1 = flag2;
            } else
            {
                flag1 = false;
            }
            Preconditions.checkState(flag1, "Leaderboard ID must not be null or empty");
            PlayGamesAsyncService.loadLeaderboards(getGamesContextFirstParty(s, null, flag, new String[0]), igamescallbacks, s1);
        }

        public final void loadLeaderboardV2(IGamesCallbacks igamescallbacks, String s, boolean flag)
        {
            boolean flag1 = false;
            checkIsSignedIn();
            igamescallbacks = wrapCallbacks(igamescallbacks, false);
            if (!TextUtils.isEmpty(s))
            {
                flag1 = true;
            }
            Preconditions.checkState(flag1, "Leaderboard ID must not be null or empty");
            PlayGamesAsyncService.loadLeaderboards(getDefaultGamesContext(flag), igamescallbacks, s);
        }

        public final void loadLeaderboards(IGamesCallbacks igamescallbacks)
        {
            loadLeaderboardsV2(igamescallbacks, false);
        }

        public final void loadLeaderboardsFirstParty(IGamesCallbacks igamescallbacks, String s)
        {
            loadLeaderboardsFirstPartyV2(igamescallbacks, s, false);
        }

        public final void loadLeaderboardsFirstPartyV2(IGamesCallbacks igamescallbacks, String s, boolean flag)
        {
            checkFirstPartyAllowed();
            checkIsSignedIn();
            igamescallbacks = wrapCallbacks(igamescallbacks, false);
            boolean flag1;
            if (!TextUtils.isEmpty(s))
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            Preconditions.checkState(flag1, "Game ID must not be empty");
            PlayGamesAsyncService.loadLeaderboards(getGamesContextFirstParty(s, null, flag, new String[0]), igamescallbacks, null);
        }

        public final void loadLeaderboardsV2(IGamesCallbacks igamescallbacks, boolean flag)
        {
            checkIsSignedIn();
            igamescallbacks = wrapCallbacks(igamescallbacks, false);
            PlayGamesAsyncService.loadLeaderboards(getDefaultGamesContext(flag), igamescallbacks, null);
        }

        public final void loadMoreScores(IGamesCallbacks igamescallbacks, Bundle bundle, int i, int j)
        {
            WrappedGamesCallbacks wrappedgamescallbacks;
            boolean flag;
            checkIsSignedIn();
            wrappedgamescallbacks = wrapCallbacks(igamescallbacks, false);
            Preconditions.checkNotNull(bundle, "Must provide a non-null bundle!");
            switch (j)
            {
            default:
                flag = false;
                break;

            case -1: 
            case 0: // '\0'
            case 1: // '\001'
                break MISSING_BLOCK_LABEL_158;
            }
_L1:
            Preconditions.checkState(flag, "Unrecognized page direction %s", new Object[] {
                Integer.valueOf(j)
            });
            int k = GServicesHelper.getInt(G.maxScoresPerPage);
            if (i > 0 && i <= k)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkState(flag, "Max results must be between 1 and %s", new Object[] {
                Integer.valueOf(k)
            });
            bundle = new LeaderboardScoreBufferHeader(bundle);
            if (GamesConstants.isFirstPartyAppId(mExternalGameId, true))
            {
                igamescallbacks = getGamesContextFirstParty(((LeaderboardScoreBufferHeader) (bundle)).mBundle.getString("external_game_id"));
            } else
            {
                igamescallbacks = getDefaultGamesContext(false);
            }
            PlayGamesAsyncService.loadMoreScores(igamescallbacks, wrappedgamescallbacks, bundle, i, j);
            return;
            flag = true;
              goto _L1
        }

        public final void loadMoreXpStreamFirstParty(IGamesCallbacks igamescallbacks, String s, int i)
        {
            checkFirstPartyAllowed();
            checkIsSignedIn();
            WrappedGamesCallbacks wrappedgamescallbacks = wrapCallbacks(igamescallbacks, false);
            boolean flag;
            if (i > 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkState(flag, "Must load at least 1 XP event");
            if (TextUtils.isEmpty(s))
            {
                igamescallbacks = getCurrentPlayerIdForService();
            } else
            {
                igamescallbacks = s;
            }
            PlayGamesAsyncService.loadMoreXpStream(getGamesContextFirstParty(null, igamescallbacks, false, new String[0]), wrappedgamescallbacks, i);
        }

        public final void loadNamedGameCollectionFirstParty(IGamesCallbacks igamescallbacks, String s, int i, boolean flag, boolean flag1, boolean flag2, boolean flag3)
        {
            Asserts.fail("Nothing should be calling this method any more!");
        }

        public final void loadNotifyAclInternal(IGamesCallbacks igamescallbacks)
        {
            checkGoogleSigned();
            checkHeadlessAllowed();
            igamescallbacks = wrapCallbacks(igamescallbacks, false);
            ClientContext clientcontext = Agents.buildFirstPartyClientContext(mClientContext);
            PlayGamesAsyncService.loadNotifyAcl(mContext, clientcontext, igamescallbacks);
        }

        public final void loadOwnerCoverPhotoUrisFirstParty(IGamesCallbacks igamescallbacks)
        {
            checkFirstPartyAllowed();
            Asserts.fail("Calling a deprecated method!");
        }

        public final void loadPlayer(IGamesCallbacks igamescallbacks, String s)
        {
            loadPlayerV2(igamescallbacks, s, false);
        }

        public final void loadPlayerCenteredScores(IGamesCallbacks igamescallbacks, String s, int i, int j, int k, boolean flag)
        {
            checkIsSignedIn();
            igamescallbacks = wrapCallbacks(igamescallbacks, false);
            int l;
            boolean flag1;
            if (!TextUtils.isEmpty(s))
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            Preconditions.checkState(flag1, "Leaderboard ID must not be null or empty");
            Preconditions.checkState(TimeSpan.isValidTimeSpan(i), "Unrecognized time span %s", new Object[] {
                Integer.valueOf(i)
            });
            Preconditions.checkState(LeaderboardCollection.isValid(j), "Unrecognized leaderboard collection %s", new Object[] {
                Integer.valueOf(j)
            });
            l = GServicesHelper.getInt(G.maxScoresPerPage);
            if (k > 0 && k <= l)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            Preconditions.checkState(flag1, "Max results must be between 1 and %d", new Object[] {
                Integer.valueOf(l)
            });
            PlayGamesAsyncService.loadPlayerCenteredScores(getDefaultGamesContext(flag), igamescallbacks, s, i, j, k);
        }

        public final void loadPlayerCenteredScoresFirstParty(IGamesCallbacks igamescallbacks, String s, String s1, int i, int j, int k, boolean flag)
        {
            checkFirstPartyAllowed();
            checkIsSignedIn();
            igamescallbacks = wrapCallbacks(igamescallbacks, false);
            int l;
            boolean flag1;
            if (!TextUtils.isEmpty(s))
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            Preconditions.checkState(flag1, "Game ID must not be empty");
            if (!TextUtils.isEmpty(s1))
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            Preconditions.checkState(flag1, "Leaderboard ID must not be null or empty");
            Preconditions.checkState(TimeSpan.isValidTimeSpan(i), "Unrecognized time span %s", new Object[] {
                Integer.valueOf(i)
            });
            Preconditions.checkState(LeaderboardCollection.isValid(j), "Unrecognized leaderboard collection %s", new Object[] {
                Integer.valueOf(j)
            });
            l = GServicesHelper.getInt(G.maxScoresPerPage);
            if (k > 0 && k <= l)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            Preconditions.checkState(flag1, "Max results must be between 1 and %d", new Object[] {
                Integer.valueOf(l)
            });
            PlayGamesAsyncService.loadPlayerCenteredScores(getGamesContextFirstParty(s, null, flag, new String[0]), igamescallbacks, s1, i, j, k);
        }

        public final void loadPlayerStats(IGamesCallbacks igamescallbacks, boolean flag)
        {
            checkIsSignedIn();
            igamescallbacks = wrapCallbacks(igamescallbacks, false);
            PlayGamesAsyncService.loadPlayerStats(getDefaultGamesContext(flag), igamescallbacks);
        }

        public final void loadPlayerV2(IGamesCallbacks igamescallbacks, String s, boolean flag)
        {
            String s1;
            WrappedGamesCallbacks wrappedgamescallbacks;
            checkIsSignedIn();
            wrappedgamescallbacks = wrapCallbacks(igamescallbacks, false);
            s1 = s;
            if (s == null)
            {
                s1 = getCurrentPlayerIdForService();
            }
            if (!mClientContext.isCurrentContext()) goto _L2; else goto _L1
_L1:
            igamescallbacks = getGamesContextFirstParty(null, s1, flag, new String[0]);
_L4:
            PlayGamesAsyncService.loadPlayer(igamescallbacks, wrappedgamescallbacks);
            return;
_L2:
            s = getDefaultGamesContext(flag);
            igamescallbacks = s;
            if (!((GamesClientContext) (s)).mExternalCurrentPlayerId.equals(s1))
            {
                igamescallbacks = s.getBuilder();
                igamescallbacks.mExternalTargetPlayerId = s1;
                igamescallbacks = igamescallbacks.build();
            }
            if (true) goto _L4; else goto _L3
_L3:
        }

        public final void loadPlayers(IGamesCallbacks igamescallbacks, String s, int i, boolean flag, boolean flag1)
        {
            boolean flag3 = false;
            checkIsSignedIn();
            igamescallbacks = wrapCallbacks(igamescallbacks, false);
            boolean flag2 = flag3;
            if (i > 0)
            {
                flag2 = flag3;
                if (i <= 25)
                {
                    flag2 = true;
                }
            }
            Preconditions.checkState(flag2, "Page size must be between 1 and 25");
            PlayGamesAsyncService.loadPlayers(getDefaultGamesContext(flag1), igamescallbacks, s, i, flag);
        }

        public final void loadPlayersArray(IGamesCallbacks igamescallbacks, String as[])
        {
            checkIsSignedIn();
            igamescallbacks = wrapCallbacks(igamescallbacks, false);
            boolean flag;
            if (as != null && as.length != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkState(flag, "Must provide at least 1 external player ID.");
            PlayGamesAsyncService.loadPlayersArray(getDefaultGamesContext(false), igamescallbacks, as);
        }

        public final void loadPlayersFirstParty(IGamesCallbacks igamescallbacks, String s, String s1, int i, boolean flag, boolean flag1)
        {
            checkFirstPartyAllowed();
            checkIsSignedIn();
            igamescallbacks = wrapCallbacks(igamescallbacks, false);
            PlayGamesAsyncService.loadFirstPartyPlayers(getGamesContextFirstParty(s1, null, flag1, new String[0]), igamescallbacks, s, i, flag);
        }

        public final void loadPlayersInternal(IGamesCallbacks igamescallbacks, String s, String s1, int i, boolean flag, boolean flag1)
        {
            checkGoogleSignedOrSelf();
            checkIsSignedIn();
            igamescallbacks = wrapCallbacks(igamescallbacks, false);
            PlayGamesAsyncService.loadPlayersInternal(getGamesContext3PTo1P(s1, null, flag1, new String[] {
                "https://www.googleapis.com/auth/plus.circles.read"
            }), igamescallbacks, s, i, flag);
        }

        public final void loadProfileSettingsInternal(IGamesCallbacks igamescallbacks, boolean flag)
        {
            checkGoogleSigned();
            checkHeadlessAllowed();
            igamescallbacks = wrapCallbacks(igamescallbacks, false);
            PlayGamesAsyncService.loadProfileSettings(getGamesContextFirstParty(null, null, flag, new String[0]), igamescallbacks);
        }

        public final void loadQuests(IGamesCallbacks igamescallbacks, int ai[], int i, boolean flag)
        {
label0:
            {
                boolean flag2 = false;
                checkIsSignedIn();
                igamescallbacks = wrapCallbacks(igamescallbacks, false);
                boolean flag1;
                if (ai.length != 0)
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                Preconditions.checkState(flag1, "Must provide at least one quest state");
                Preconditions.checkState(QuestState.areValidSelectors(ai), "Invalid quest state provided.");
                if (i != 1)
                {
                    flag1 = flag2;
                    if (i != 0)
                    {
                        break label0;
                    }
                }
                flag1 = true;
            }
            Preconditions.checkState(flag1, "Must provide a valid quest sort order.");
            mIncrementCache.flush();
            PlayGamesAsyncService.loadQuests(getDefaultGamesContext(flag), igamescallbacks, ai, i);
        }

        public final void loadQuestsById(IGamesCallbacks igamescallbacks, String as[], boolean flag)
        {
            boolean flag1 = false;
            checkIsSignedIn();
            igamescallbacks = wrapCallbacks(igamescallbacks, false);
            Preconditions.checkNotNull(as, "Must provide a valid quest id");
            if (as.length != 0)
            {
                flag1 = true;
            }
            Preconditions.checkState(flag1, "Must provide a valid quest id");
            mIncrementCache.flush();
            PlayGamesAsyncService.loadQuests(getDefaultGamesContext(flag), igamescallbacks, as);
        }

        public final void loadQuestsByIdFirstParty(IGamesCallbacks igamescallbacks, String s, String s1, String as[], boolean flag)
        {
            checkIsSignedIn();
            checkFirstPartyAllowed();
            igamescallbacks = wrapCallbacks(igamescallbacks, false);
            Preconditions.checkNotNull(as, "Must provide a valid quest id");
            boolean flag1;
            if (as.length != 0)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            Preconditions.checkState(flag1, "Must provide a valid quest id");
            mIncrementCache.flush();
            PlayGamesAsyncService.loadQuests(getGamesContextFirstParty(s, s1, flag, new String[0]), igamescallbacks, as);
        }

        public final void loadQuestsFirstParty(IGamesCallbacks igamescallbacks, String s, String s1, int ai[], int i, boolean flag)
        {
            boolean flag2 = true;
            checkFirstPartyAllowed();
            checkHeadlessAllowed();
            igamescallbacks = wrapCallbacks(igamescallbacks, false);
            Preconditions.checkState(QuestState.areValidSelectors(ai), "Invalid quest state provided.");
            boolean flag1 = flag2;
            if (i != 1)
            {
                if (i == 0)
                {
                    flag1 = flag2;
                } else
                {
                    flag1 = false;
                }
            }
            Preconditions.checkState(flag1, "Must provide a valid quest sort order.");
            mIncrementCache.flush();
            PlayGamesAsyncService.loadQuests(getGamesContextFirstParty(s, s1, flag, new String[0]), igamescallbacks, ai, i);
        }

        public final void loadRecentPlayersFirstParty(IGamesCallbacks igamescallbacks)
        {
            loadRecentPlayersFirstPartyV2(igamescallbacks, 12, false, false);
        }

        public final void loadRecentPlayersFirstPartyV2(IGamesCallbacks igamescallbacks, int i, boolean flag, boolean flag1)
        {
            loadPlayersFirstParty(igamescallbacks, "circled", null, i, flag, flag1);
        }

        public final void loadRecentlyPlayedGamesFirstParty(IGamesCallbacks igamescallbacks, String s, int i, boolean flag, boolean flag1)
        {
            Asserts.fail("Nothing should be calling this method any more!");
        }

        public final void loadRequestSummariesFirstParty(IGamesCallbacks igamescallbacks, String s, int i)
        {
            checkFirstPartyAllowed();
            checkHeadlessAllowed();
            igamescallbacks = wrapCallbacks(igamescallbacks, false);
            boolean flag;
            if (i != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkState(flag, "Must provide at least one request type");
            s = getGamesContextFirstParty(null, s, false, new String[0]);
            Preconditions.checkState(s.isTargetingCurrentPlayer(), "Attempting to load requests for another player");
            PlayGamesAsyncService.loadRequestSummaries(s, igamescallbacks, i);
        }

        public final void loadRequests(IGamesCallbacks igamescallbacks, int i, int j, int k)
        {
            boolean flag1 = true;
            checkIsSignedIn();
            igamescallbacks = wrapCallbacks(igamescallbacks, false);
            ArrayList arraylist;
            boolean flag;
            if (k == 0 || k == 1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkState(flag, "Invalid request sort order!");
            if (i == 0 || i == 1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkState(flag, "Invalid request direction!");
            if (j != 0)
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
            Preconditions.checkState(flag, "Must provide at least one request type");
            arraylist = getRequestTypeArray(j);
            PlayGamesAsyncService.loadRequests(getDefaultGamesContext(false), igamescallbacks, i, k, arraylist);
        }

        public final void loadRequestsFirstParty(IGamesCallbacks igamescallbacks, String s, String s1, int i, int j, int k)
        {
            checkFirstPartyAllowed();
            checkHeadlessAllowed();
            igamescallbacks = wrapCallbacks(igamescallbacks, false);
            ArrayList arraylist;
            Object obj;
            StringBuilder stringbuilder;
            boolean flag;
            if (s == null || s.length() > 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkState(flag, "Must provide a valid Game ID, or null for 'all games'");
            if (k == 0 || k == 1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkState(flag, "Invalid request sort order!");
            if (i == 0 || i == 1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkState(flag, "Invalid request direction!");
            if (j != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkState(flag, "Must provide at least one request type");
            arraylist = getRequestTypeArray(j);
            s = getGamesContextFirstParty(s, s1, false, new String[0]);
            obj = new StringBuilder("Input player null: ");
            if (s1 == null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            GamesLog.d("GamesServiceBroker", ((StringBuilder) (obj)).append(flag).toString());
            GamesLog.d("GamesServiceBroker", (new StringBuilder("IsHeadless: ")).append(mIsHeadless).toString());
            obj = ((GamesClientContext) (s)).mExternalTargetPlayerId;
            s1 = ((GamesClientContext) (s)).mExternalCurrentPlayerId;
            stringbuilder = new StringBuilder("Null target: ");
            if (obj == null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            GamesLog.d("GamesServiceBroker", stringbuilder.append(flag).toString());
            obj = new StringBuilder("Null current: ");
            if (s1 == null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            GamesLog.d("GamesServiceBroker", ((StringBuilder) (obj)).append(flag).toString());
            GamesLog.d("GamesServiceBroker", (new StringBuilder("Targeting current: ")).append(s.isTargetingCurrentPlayer()).toString());
            Preconditions.checkState(s.isTargetingCurrentPlayer(), "Attempting to load requests for another player");
            PlayGamesAsyncService.loadRequests(s, igamescallbacks, i, k, arraylist);
        }

        public final void loadSnapshots(IGamesCallbacks igamescallbacks, boolean flag)
        {
            checkIsSignedIn();
            Preconditions.checkState(usesApi(Drive.API), "Must include Drive.SCOPE_APPFOLDER to use snapshots!");
            verifySnapshotsEnabled();
            igamescallbacks = wrapCallbacks(igamescallbacks, false);
            mApiClientTracker.incRef();
            PlayGamesAsyncService.loadSnapshots(getDefaultGamesContext(flag), igamescallbacks, mApiClientTracker);
        }

        public final void loadSnapshotsFirstParty(IGamesCallbacks igamescallbacks, String s, String s1, boolean flag)
        {
            checkFirstPartyAllowed();
            checkIsSignedIn();
            WrappedGamesCallbacks wrappedgamescallbacks = wrapCallbacks(igamescallbacks, false);
            boolean flag1;
            if (!TextUtils.isEmpty(s1))
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            Preconditions.checkState(flag1, "Must be loading snapshots on behalf of a valid game");
            if (s == null || s.length() > 0)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            Preconditions.checkState(flag1, "Player ID must be either null or length > 0");
            igamescallbacks = s;
            if (s == null)
            {
                igamescallbacks = getCurrentPlayerIdForService();
            }
            PlayGamesAsyncService.loadSnapshots(getGamesContextFirstParty(s1, igamescallbacks, flag, new String[] {
                "https://www.googleapis.com/auth/drive.appdata"
            }), wrappedgamescallbacks, null);
        }

        public final void loadSuggestedPlayersFirstParty(IGamesCallbacks igamescallbacks)
        {
            loadSuggestedPlayersFirstPartyV2(igamescallbacks, 10, false, false);
        }

        public final void loadSuggestedPlayersFirstPartyV2(IGamesCallbacks igamescallbacks, int i, boolean flag, boolean flag1)
        {
            loadPlayersFirstParty(igamescallbacks, "you_may_know", null, i, flag, flag1);
        }

        public final void loadTopScores(IGamesCallbacks igamescallbacks, String s, int i, int j, int k, boolean flag)
        {
            checkIsSignedIn();
            igamescallbacks = wrapCallbacks(igamescallbacks, false);
            int l;
            boolean flag1;
            if (!TextUtils.isEmpty(s))
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            Preconditions.checkState(flag1, "Leaderboard ID must not be null or empty");
            Preconditions.checkState(TimeSpan.isValidTimeSpan(i), "Unrecognized time span %s", new Object[] {
                Integer.valueOf(i)
            });
            Preconditions.checkState(LeaderboardCollection.isValid(j), "Unrecognized leaderboard collection %s", new Object[] {
                Integer.valueOf(j)
            });
            l = GServicesHelper.getInt(G.maxScoresPerPage);
            if (k > 0 && k <= l)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            Preconditions.checkState(flag1, "Max results must be between 1 and %d", new Object[] {
                Integer.valueOf(l)
            });
            PlayGamesAsyncService.loadTopScores(getDefaultGamesContext(flag), igamescallbacks, s, i, j, k);
        }

        public final void loadTopScoresFirstParty(IGamesCallbacks igamescallbacks, String s, String s1, int i, int j, int k, boolean flag)
        {
            boolean flag2 = true;
            checkFirstPartyAllowed();
            checkIsSignedIn();
            igamescallbacks = wrapCallbacks(igamescallbacks, false);
            int l;
            boolean flag1;
            if (!TextUtils.isEmpty(s))
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            Preconditions.checkState(flag1, "Game ID must not be empty");
            if (!TextUtils.isEmpty(s1))
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            Preconditions.checkState(flag1, "Leaderboard ID must not be null or empty");
            Preconditions.checkState(TimeSpan.isValidTimeSpan(i), (new StringBuilder("Unrecognized time span ")).append(i).toString());
            Preconditions.checkState(LeaderboardCollection.isValid(j), (new StringBuilder("Unrecognized leaderboard collection ")).append(j).toString());
            l = GServicesHelper.getInt(G.maxScoresPerPage);
            if (k > 0 && k <= l)
            {
                flag1 = flag2;
            } else
            {
                flag1 = false;
            }
            Preconditions.checkState(flag1, (new StringBuilder("Max results must be between 1 and ")).append(l).toString());
            PlayGamesAsyncService.loadTopScores(getGamesContextFirstParty(s, null, flag, new String[0]), igamescallbacks, s1, i, j, k);
        }

        public final void loadTurnBasedMatches(IGamesCallbacks igamescallbacks, int ai[])
        {
            loadTurnBasedMatchesV2(igamescallbacks, 0, ai);
        }

        public final void loadTurnBasedMatchesFirstParty(IGamesCallbacks igamescallbacks, String s, int ai[])
        {
            loadTurnBasedMatchesFirstPartyV2(igamescallbacks, s, 0, ai);
        }

        public final void loadTurnBasedMatchesFirstPartyV2(IGamesCallbacks igamescallbacks, String s, int i, int ai[])
        {
label0:
            {
                boolean flag1 = false;
                checkFirstPartyAllowed();
                checkHeadlessAllowed();
                igamescallbacks = wrapCallbacks(igamescallbacks, false);
                boolean flag;
                if (s == null || s.length() > 0)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                Preconditions.checkState(flag, "Must provide a valid Game ID, or null for 'all games'");
                if (i != 0)
                {
                    flag = flag1;
                    if (i != 1)
                    {
                        break label0;
                    }
                }
                flag = true;
            }
            Preconditions.checkState(flag, "Invalid match sort order!");
            validateMatchTurnStatuses(ai);
            PlayGamesAsyncService.loadTurnBasedMatches(getGamesContextFirstParty(s), igamescallbacks, i, ai);
        }

        public final void loadTurnBasedMatchesV2(IGamesCallbacks igamescallbacks, int i, int ai[])
        {
            boolean flag1 = true;
            checkIsSignedIn();
            igamescallbacks = wrapCallbacks(igamescallbacks, false);
            boolean flag = flag1;
            if (i != 0)
            {
                if (i == 1)
                {
                    flag = flag1;
                } else
                {
                    flag = false;
                }
            }
            Preconditions.checkState(flag, "Invalid match sort order!");
            validateMatchTurnStatuses(ai);
            PlayGamesAsyncService.loadTurnBasedMatches(getDefaultGamesContext(false), igamescallbacks, i, ai);
        }

        public final void loadXpForGameCategoriesFirstParty(IGamesCallbacks igamescallbacks, String s)
        {
            checkFirstPartyAllowed();
            WrappedGamesCallbacks wrappedgamescallbacks = wrapCallbacks(igamescallbacks, false);
            igamescallbacks = s;
            if (TextUtils.isEmpty(s))
            {
                igamescallbacks = "me";
            }
            PlayGamesAsyncService.loadXpForGameCategory(getGamesContextFirstParty(null, igamescallbacks, false, new String[0]), wrappedgamescallbacks);
        }

        public final void loadXpStreamFirstParty(IGamesCallbacks igamescallbacks, String s, int i)
        {
            checkFirstPartyAllowed();
            checkIsSignedIn();
            WrappedGamesCallbacks wrappedgamescallbacks = wrapCallbacks(igamescallbacks, false);
            boolean flag;
            if (i > 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkState(flag, "Must load at least 1 XP event");
            if (TextUtils.isEmpty(s))
            {
                igamescallbacks = getCurrentPlayerIdForService();
            } else
            {
                igamescallbacks = s;
            }
            PlayGamesAsyncService.loadXpStream(getGamesContextFirstParty(null, igamescallbacks, false, new String[0]), wrappedgamescallbacks, i);
        }

        public final void notificationOpenedFirstParty()
        {
            checkFirstPartyAllowed();
            checkHeadlessAllowed();
            PlayGamesAsyncService.notificationOpened(mContext, mClientContext);
        }

        public final void openSnapshot(IGamesCallbacks igamescallbacks, String s, boolean flag)
        {
            openSnapshotV2(igamescallbacks, s, flag, -1);
        }

        public final void openSnapshotV2(IGamesCallbacks igamescallbacks, String s, boolean flag, int i)
        {
            checkIsSignedIn();
            Preconditions.checkState(usesApi(Drive.API), "Must include Drive.SCOPE_APPFOLDER to use snapshots!");
            verifySnapshotsEnabled();
            igamescallbacks = wrapCallbacks(igamescallbacks, false);
            Preconditions.checkNotEmpty(s, "Must provide a non empty fileName!");
            Preconditions.checkState(PlayGamesServiceBroker.VALID_SNAPSHOT_FILENAME_PATTERN.matcher(s).matches(), "Must provide a valid file name!");
            i;
            JVM INSTR tableswitch -1 4: default 92
        //                       -1 128
        //                       0 92
        //                       1 128
        //                       2 128
        //                       3 128
        //                       4 128;
               goto _L1 _L2 _L1 _L2 _L2 _L2 _L2
_L1:
            boolean flag1 = false;
_L4:
            Preconditions.checkState(flag1, "Must provide a valid conflict policy!");
            mApiClientTracker.incRef();
            PlayGamesAsyncService.openSnapshot(getDefaultGamesContext(false), igamescallbacks, mApiClientTracker, s, flag, i);
            return;
_L2:
            flag1 = true;
            if (true) goto _L4; else goto _L3
_L3:
        }

        public final void recordPlayerSuggestionActionFirstParty(String s, int i)
        {
            checkFirstPartyAllowed();
            checkIsSignedIn();
            boolean flag;
            if (!TextUtils.isEmpty(s))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkState(flag, "Player ID must not be empty");
            i;
            JVM INSTR tableswitch 0 3: default 56
        //                       0 86
        //                       1 86
        //                       2 117
        //                       3 86;
               goto _L1 _L2 _L2 _L3 _L2
_L1:
            throw new IllegalArgumentException((new StringBuilder("Unknown action: ")).append(i).toString());
_L2:
            boolean flag1 = true;
_L5:
            Preconditions.checkState(flag1, "Can only record positive actions with this API");
            PlayGamesAsyncService.recordPlayerSuggestionAction(getGamesContextFirstParty(null, s, false, new String[] {
                "https://www.googleapis.com/auth/plus.circles.write"
            }), i);
            return;
_L3:
            flag1 = false;
            if (true) goto _L5; else goto _L4
_L4:
        }

        public final void registerInvitationListener(IGamesCallbacks igamescallbacks, long l)
        {
            checkIsSignedIn();
            Preconditions.checkNotNull(igamescallbacks, "Must provide a valid callback object");
            GameEventListenerRegistry.getInstance().registerInvitationListener(mClientContext.getResolvedAccountName(), mExternalGameId, l, igamescallbacks);
        }

        public final void registerInvitationListenerFirstParty(IGamesCallbacks igamescallbacks, long l, String s)
        {
            checkFirstPartyAllowed();
            checkHeadlessAllowed();
            Preconditions.checkNotNull(igamescallbacks, "Must provide a valid callback object");
            boolean flag;
            if (s == null || s.length() > 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkState(flag, "Must provide a valid Game ID, or null for 'all games'");
            GameEventListenerRegistry.getInstance().registerInvitationListener(mClientContext.getResolvedAccountName(), s, l, igamescallbacks);
        }

        public final void registerInvitationPopupListenerRestricted(long l)
        {
            registerInvitationListener(new AbstractGamesCallbacks() {

                final GamesService this$0;

                public final void onInvitationReceived(DataHolder dataholder)
                {
                    Object obj;
                    obj = GameEventListenerRegistry.getInstance();
                    dataholder = new InvitationBuffer(dataholder);
                    obj = ((GameEventListenerRegistry) (obj)).getPopupLocationInfo(mClientContext.getResolvedAccountName(), mExternalGameId);
                    if (dataholder.getCount() > 0)
                    {
                        InvitationPopup.show(getDefaultGamesContext(false), ((com.google.android.gms.games.internal.PopupManager.PopupLocationInfo) (obj)), (Invitation)((Invitation)dataholder.get(0)).freeze());
                    }
                    dataholder.release();
                    return;
                    Exception exception;
                    exception;
                    dataholder.release();
                    throw exception;
                }

            
            {
                this$0 = GamesService.this;
                super();
            }
            }, l);
        }

        public final void registerMatchUpdateListener(IGamesCallbacks igamescallbacks, long l)
        {
            checkIsSignedIn();
            Preconditions.checkNotNull(igamescallbacks, "Must provide a valid callback object");
            GameEventListenerRegistry.getInstance().registerMatchUpdateListener(mClientContext.getResolvedAccountName(), mExternalGameId, l, igamescallbacks);
        }

        public final void registerMatchUpdateListenerFirstParty(IGamesCallbacks igamescallbacks, long l, String s)
        {
            checkFirstPartyAllowed();
            checkHeadlessAllowed();
            Preconditions.checkNotNull(igamescallbacks, "Must provide a valid callback object");
            boolean flag;
            if (s == null || s.length() > 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkState(flag, "Must provide a valid Game ID, or null for 'all games'");
            GameEventListenerRegistry.getInstance().registerMatchUpdateListener(mClientContext.getResolvedAccountName(), s, l, igamescallbacks);
        }

        public final void registerPopupLocationInfoListener(IGamesClient igamesclient, long l)
        {
            checkIsSignedIn();
            Preconditions.checkNotNull(igamesclient, "Must provide a valid callback object");
            GameEventListenerRegistry.getInstance().registerPopupLocationInfoListener(mClientContext.getResolvedAccountName(), mExternalGameId, l, igamesclient);
        }

        public final void registerQuestUpdateListener(IGamesCallbacks igamescallbacks, long l)
        {
            checkIsSignedIn();
            Preconditions.checkNotNull(igamescallbacks, "Must provide a valid callback object");
            GameEventListenerRegistry.getInstance().registerQuestUpdateListener(mClientContext.getResolvedAccountName(), mExternalGameId, l, igamescallbacks);
        }

        public final void registerQuestUpdateListenerFirstParty(IGamesCallbacks igamescallbacks, long l, String s)
        {
            checkFirstPartyAllowed();
            checkHeadlessAllowed();
            Preconditions.checkNotNull(igamescallbacks, "Must provide a valid callback object");
            boolean flag;
            if (s == null || s.length() > 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkState(flag, "The externalGameId must be null or a non-empty string.");
            GameEventListenerRegistry.getInstance().registerQuestUpdateListener(mClientContext.getResolvedAccountName(), s, l, igamescallbacks);
        }

        public final void registerRequestListener(IGamesCallbacks igamescallbacks, long l)
        {
            checkIsSignedIn();
            Preconditions.checkNotNull(igamescallbacks, "Must provide a valid callback object");
            GameEventListenerRegistry.getInstance().registerRequestListener(mClientContext.getResolvedAccountName(), mExternalGameId, l, igamescallbacks);
        }

        public final void registerRequestListenerFirstParty(IGamesCallbacks igamescallbacks, long l, String s)
        {
            checkFirstPartyAllowed();
            checkHeadlessAllowed();
            Preconditions.checkNotNull(igamescallbacks, "Must provide a valid callback object");
            boolean flag;
            if (s == null || s.length() > 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkState(flag, "Must provide a valid Game ID, or null for 'all games'");
            GameEventListenerRegistry.getInstance().registerRequestListener(mClientContext.getResolvedAccountName(), s, l, igamescallbacks);
        }

        public final RoomEntity registerWaitingRoomListenerRestricted(IGamesCallbacks igamescallbacks, String s)
            throws RemoteException
        {
            checkPermissionsSelf();
            checkIsSignedIn();
            igamescallbacks = wrapCallbacks(igamescallbacks, false);
            s = new RoomBuffer(getRoomServiceClient().registerWaitingRoomListenerRestricted(new com.google.android.gms.games.service.statemachine.roomclient.Messages.RegisterWaitingRoomListenerRestrictedData(igamescallbacks, s)));
            igamescallbacks = null;
            if (s.getCount() > 0)
            {
                igamescallbacks = (RoomEntity)((Room)s.get(0)).freeze();
            }
            s.release();
            return igamescallbacks;
            igamescallbacks;
            s.release();
            throw igamescallbacks;
        }

        public final void rematchTurnBasedMatch(IGamesCallbacks igamescallbacks, String s)
        {
            checkIsSignedIn();
            igamescallbacks = wrapCallbacks(igamescallbacks, false);
            boolean flag;
            if (!TextUtils.isEmpty(s))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkState(flag, "Match ID must not be empty");
            PlayGamesAsyncService.rematchTurnBasedMatch(getDefaultGamesContext(false), igamescallbacks, s);
        }

        public final void rematchTurnBasedMatchFirstParty(IGamesCallbacks igamescallbacks, String s, String s1)
        {
            boolean flag1 = true;
            checkFirstPartyAllowed();
            checkHeadlessAllowed();
            igamescallbacks = wrapCallbacks(igamescallbacks, false);
            boolean flag;
            if (!TextUtils.isEmpty(s))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkState(flag, "Must rematch on behalf of a valid game");
            if (!TextUtils.isEmpty(s1))
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
            Preconditions.checkState(flag, "Match ID must not be empty");
            PlayGamesAsyncService.rematchTurnBasedMatch(getGamesContextFirstParty(s), igamescallbacks, s1);
        }

        public final void resolveSnapshotConflict(IGamesCallbacks igamescallbacks, String s, String s1, SnapshotMetadataChangeEntity snapshotmetadatachangeentity, Contents contents)
        {
            checkIsSignedIn();
            DriveContentsImpl drivecontentsimpl = new DriveContentsImpl(contents);
            Preconditions.checkState(usesApi(Drive.API), "Must include Drive.SCOPE_APPFOLDER to use snapshots!");
            verifySnapshotsEnabled();
            igamescallbacks = wrapCallbacks(igamescallbacks, false);
            Preconditions.checkNotEmpty(s, "Must provide a non-empty conflict ID");
            Preconditions.checkNotEmpty(s1, "Must provide a non-empty snapshot ID");
            Preconditions.checkNotNull(snapshotmetadatachangeentity, "Must provide a non-null metadata change");
            Preconditions.checkNotNull(contents, "Must provide non-null contents");
            validateSnapshotSizes(snapshotmetadatachangeentity, drivecontentsimpl);
            mApiClientTracker.incRef();
            PlayGamesAsyncService.resolveSnapshotConflict(getDefaultGamesContext(false), igamescallbacks, mApiClientTracker, s, s1, snapshotmetadatachangeentity, drivecontentsimpl);
        }

        public final void revealAchievement(IGamesCallbacks igamescallbacks, String s, IBinder ibinder, Bundle bundle)
        {
            boolean flag = true;
            checkIsSignedIn();
            igamescallbacks = wrapCallbacks(igamescallbacks, true);
            if (TextUtils.isEmpty(s))
            {
                flag = false;
            }
            Preconditions.checkState(flag, "Achievement ID must not be null or empty");
            ibinder = new com.google.android.gms.games.internal.PopupManager.PopupLocationInfo(bundle, ibinder);
            PlayGamesAsyncService.revealAchievement(getDefaultGamesContext(false), igamescallbacks, s, ibinder);
        }

        public final void searchForGamesFirstParty(IGamesCallbacks igamescallbacks, String s, int i, boolean flag, boolean flag1)
        {
            Asserts.fail("Nothing should be calling this method any more!");
        }

        public final void searchForPlayersInternal(IGamesCallbacks igamescallbacks, String s, int i, boolean flag, boolean flag1)
        {
            checkGoogleSignedOrSelf();
            checkIsSignedIn();
            igamescallbacks = wrapCallbacks(igamescallbacks, false);
            boolean flag2;
            if (!TextUtils.isEmpty(s))
            {
                flag2 = true;
            } else
            {
                flag2 = false;
            }
            Preconditions.checkState(flag2, "Query must not be empty");
            PlayGamesAsyncService.searchForPlayers(getGamesContext3PTo1P(mExternalGameId, null, flag1, new String[] {
                "https://www.googleapis.com/auth/plus.circles.read"
            }), igamescallbacks, s, i, flag);
        }

        public final int sendReliableMessage(IGamesCallbacks igamescallbacks, byte abyte0[], String s, String s1)
        {
            checkIsSignedIn();
            igamescallbacks = wrapCallbacks(igamescallbacks, false);
            boolean flag;
            if (!TextUtils.isEmpty(s))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkState(flag, "Room ID must not be null or empty");
            Preconditions.checkState(ParticipantUtils.isValidParticipantId(s1), "Invalid participant ID %s", new Object[] {
                s1
            });
            Preconditions.checkNotNull(abyte0, "Cannot send a null message");
            return getRoomServiceClient().sendReliableMessage(new com.google.android.gms.games.service.statemachine.roomclient.Messages.SendReliableMessageData(igamescallbacks, abyte0, s, s1));
        }

        public final void sendRequestRestricted(IGamesCallbacks igamescallbacks, String s, String as[], int i, byte abyte0[], int j)
        {
            boolean flag;
            boolean flag1 = true;
            checkIsSignedIn();
            checkGoogleSignedOrSelf();
            igamescallbacks = wrapCallbacks(igamescallbacks, false);
            if (!TextUtils.isEmpty(s))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkState(flag, "Must provide a valid game ID");
            validateExternalIds(as);
            switch (i)
            {
            default:
                flag = false;
                break;

            case 1: // '\001'
            case 2: // '\002'
                break MISSING_BLOCK_LABEL_196;
            }
_L1:
            Preconditions.checkState(flag, "Must provide a valid request type");
            if (j <= getMaxRequestLifetimeDays() && (j > 0 || j == -1))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkState(flag, (new StringBuilder("Request lifetime days must be <= ")).append(getMaxRequestLifetimeDays()).append(" and greater than zero. Use -1 for server default.").toString());
            if (abyte0 != null && abyte0.length <= getMaxRequestPayloadSize())
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
            Preconditions.checkState(flag, (new StringBuilder("Payload must be non null and at most ")).append(getMaxRequestPayloadSize()).toString());
            PlayGamesAsyncService.sendRequest(getGamesContext3PTo1P(s), igamescallbacks, i, j, abyte0, as);
            return;
            flag = true;
              goto _L1
        }

        public final int sendUnreliableMessage(byte abyte0[], String s, String as[])
        {
            Preconditions.checkNotNull(abyte0, "Cannot send a null message");
            if (abyte0.length > 1168)
            {
                return -1;
            }
            checkIsSignedIn();
            boolean flag;
            if (!TextUtils.isEmpty(s))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkState(flag, "Room ID must not be null or empty");
            if (as != null)
            {
                for (int i = 0; i < as.length; i++)
                {
                    String s1 = as[i];
                    Preconditions.checkState(ParticipantUtils.isValidParticipantId(s1), "Invalid participant ID %s", new Object[] {
                        s1
                    });
                }

            }
            return getRoomServiceClient().sendUnreliableMessage(new com.google.android.gms.games.service.statemachine.roomclient.Messages.SendUnreliableMessageData(abyte0, s, as));
        }

        public final void setAchievementSteps(IGamesCallbacks igamescallbacks, String s, int i, IBinder ibinder, Bundle bundle)
        {
            boolean flag1 = true;
            checkIsSignedIn();
            igamescallbacks = wrapCallbacks(igamescallbacks, true);
            boolean flag;
            if (!TextUtils.isEmpty(s))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkState(flag, "Achievement ID must not be null or empty");
            if (i > 0)
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
            Preconditions.checkState(flag, "Number of steps must be greater than 0");
            ibinder = new com.google.android.gms.games.internal.PopupManager.PopupLocationInfo(bundle, ibinder);
            PlayGamesAsyncService.setAchievementSteps(getDefaultGamesContext(false), igamescallbacks, s, i, ibinder);
        }

        public final void setAllowLevelUpNotificationsFirstParty(boolean flag)
        {
            checkFirstPartyAllowed();
            checkHeadlessAllowed();
            android.content.SharedPreferences.Editor editor = GamesSharedPrefs.getSharedPrefs(mContext).edit();
            editor.putBoolean("allowLevelUpNotifications", flag);
            SharedPreferencesCompat.apply(editor);
        }

        public final void setGameMuteStatusInternal(IGamesCallbacks igamescallbacks, String s, boolean flag)
        {
            boolean flag1 = false;
            checkGoogleSignedOrSelf();
            checkHeadlessAllowed();
            igamescallbacks = wrapCallbacks(igamescallbacks, false);
            if (!TextUtils.isEmpty(s))
            {
                flag1 = true;
            }
            Preconditions.checkState(flag1, "Game ID must not be empty");
            PlayGamesAsyncService.setGameMuteStatus(getGamesContext3PTo1P(s), igamescallbacks, flag);
        }

        public final void setIdentitySharingConfirmedInternal()
        {
            checkPermissionsSelf();
            checkIsSignedIn();
            PlayGamesAsyncService.setIdentitySharingConfirmed(getGamesContext3PTo1P(mExternalGameId));
        }

        public final void setNearbyPlayerDetectionEnabled(boolean flag)
        {
            GoogleApiClient googleapiclient;
            Message message;
            Object obj1;
            checkGoogleSignedOrSelf();
            Preconditions.checkState(usesApi(Nearby.MESSAGES_API), "Must enable a Copresence client before calling!");
            if (!flag)
            {
                break MISSING_BLOCK_LABEL_244;
            }
            checkIsSignedIn();
            if (!usesApi(Nearby.MESSAGES_API))
            {
                break MISSING_BLOCK_LABEL_251;
            }
            googleapiclient = mApiClientTracker.getApiClient();
            message = new Message(getCurrentPlayerIdForService().getBytes(), "nearby_players");
            Nearby.MessagesInternal.setAppOptedIn(googleapiclient);
            com.google.android.gms.nearby.messages.Strategy strategy = (new com.google.android.gms.nearby.messages.Strategy.Builder()).build();
            Nearby.Messages.publish(googleapiclient, message, strategy);
            ((Long)G.nearbyPlayerLifetimeMillis.getBinderSafe()).longValue();
            obj1 = "nearby_players". new MessageListener() ;
            Nearby.Messages.subscribe(googleapiclient, ((MessageListener) (obj1)), strategy);
            Object obj = mCopresenceMessageLock;
            obj;
            JVM INSTR monitorenter ;
            MessageListener messagelistener = (MessageListener)mCopresenceListeners.remove("nearby_players");
            if (messagelistener == null)
            {
                break MISSING_BLOCK_LABEL_177;
            }
            Nearby.Messages.unsubscribe(googleapiclient, messagelistener);
            mCopresenceListeners.put("nearby_players", obj1);
            obj1 = (Message)mPublishedCopresenceMessages.remove("nearby_players");
            if (obj1 == null)
            {
                break MISSING_BLOCK_LABEL_222;
            }
            Nearby.Messages.unpublish(googleapiclient, ((Message) (obj1)));
            mPublishedCopresenceMessages.put("nearby_players", message);
            obj;
            JVM INSTR monitorexit ;
            return;
            Exception exception;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
            endCopresence("nearby_players");
        }

        public final void setSessionPending(boolean flag)
        {
            if (flag)
            {
                GamesSessionRecorder gamessessionrecorder = mSessionRecorder;
                synchronized (gamessessionrecorder.mSessionLock)
                {
                    gamessessionrecorder.mPendingRefCounter = gamessessionrecorder.mPendingRefCounter + 1;
                }
                return;
            }
            break MISSING_BLOCK_LABEL_34;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
            GamesSessionRecorder gamessessionrecorder1 = mSessionRecorder;
            synchronized (gamessessionrecorder1.mSessionLock)
            {
                if (gamessessionrecorder1.mPendingRefCounter > 0)
                {
                    gamessessionrecorder1.mPendingRefCounter = gamessessionrecorder1.mPendingRefCounter - 1;
                    gamessessionrecorder1.attemptEndSession_locked();
                }
            }
            return;
            exception1;
            obj1;
            JVM INSTR monitorexit ;
            throw exception1;
        }

        public final void setUseNewPlayerNotificationsFirstParty(boolean flag)
        {
            checkFirstPartyAllowed();
            checkHeadlessAllowed();
            GamesNotificationHelper.setUseNewPlayerNotifications(mContext, flag);
        }

        public final boolean shouldAllowLevelUpNotificationsFirstParty()
        {
            checkFirstPartyAllowed();
            checkHeadlessAllowed();
            return GamesNotificationHelper.shouldAllowLevelUpNotifications(mContext);
        }

        public final boolean shouldUseNewPlayerNotificationsFirstParty()
        {
            checkFirstPartyAllowed();
            checkHeadlessAllowed();
            return GamesNotificationHelper.shouldUseNewPlayerNotifications(mContext);
        }

        public final void showQuestStateChangedPopup(String s, IBinder ibinder, Bundle bundle)
        {
            checkIsSignedIn();
            boolean flag;
            if (!TextUtils.isEmpty(s))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkState(flag, "Must provide a valid quest ID");
            ibinder = new PopupLocationInfo(bundle, ibinder);
            PlayGamesAsyncService.showQuestStateChangedPopup(getDefaultGamesContext(false), s, ibinder, mClientVersion);
        }

        public final void showWelcomePopup(IBinder ibinder, Bundle bundle)
        {
            com.google.android.gms.games.internal.PopupManager.PopupLocationInfo popuplocationinfo;
            checkIsSignedIn();
            popuplocationinfo = new PopupLocationInfo(bundle, ibinder);
            ibinder = null;
            bundle = new PlayerBuffer(getCurrentPlayer());
            if (bundle.getCount() > 0)
            {
                ibinder = (PlayerEntity)bundle.get(0).freeze();
            }
            bundle.release();
            if (ibinder != null)
            {
                WelcomePopup.show(getDefaultGamesContext(false), popuplocationinfo, ibinder);
            }
            return;
            ibinder;
            bundle.release();
            throw ibinder;
        }

        public final void signOut(IGamesCallbacks igamescallbacks)
        {
            signOut(igamescallbacks, true);
        }

        public final void submitScore(IGamesCallbacks igamescallbacks, String s, long l)
        {
            submitScoreV2(igamescallbacks, s, l, null);
        }

        public final void submitScoreV2(IGamesCallbacks igamescallbacks, String s, long l, String s1)
        {
            boolean flag = true;
            checkIsSignedIn();
            igamescallbacks = wrapCallbacks(igamescallbacks, true);
            if (TextUtils.isEmpty(s))
            {
                flag = false;
            }
            Preconditions.checkState(flag, "Leaderboard ID must not be null or empty");
            if (s1 != null)
            {
                Preconditions.checkState(PlayGamesServiceBroker.VALID_SCORE_TAG.matcher(s1).matches(), (new StringBuilder("Score tags must be no more than 64 URI safe characters. Input was ")).append(s1).toString());
            }
            PlayGamesAsyncService.submitScore(getDefaultGamesContext(false), igamescallbacks, s, l, s1);
        }

        public final void unlockAchievement(IGamesCallbacks igamescallbacks, String s, IBinder ibinder, Bundle bundle)
        {
            boolean flag = true;
            checkIsSignedIn();
            igamescallbacks = wrapCallbacks(igamescallbacks, true);
            if (TextUtils.isEmpty(s))
            {
                flag = false;
            }
            Preconditions.checkState(flag, "Achievement ID must not be null or empty");
            ibinder = new PopupLocationInfo(bundle, ibinder);
            PlayGamesAsyncService.unlockAchievement(getDefaultGamesContext(false), igamescallbacks, s, ibinder);
        }

        public final void unregisterInvitationListener(long l)
        {
            GameEventListenerRegistry.getInstance().unregisterInvitationListener(mClientContext.getResolvedAccountName(), mExternalGameId, l);
        }

        public final void unregisterInvitationListenerFirstParty(long l, String s)
        {
            checkFirstPartyAllowed();
            boolean flag;
            if (s == null || s.length() > 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkState(flag, "Must provide a valid Game ID, or null for 'all games'");
            GameEventListenerRegistry.getInstance().unregisterInvitationListener(mClientContext.getResolvedAccountName(), s, l);
        }

        public final void unregisterMatchUpdateListener(long l)
        {
            GameEventListenerRegistry.getInstance().unregisterMatchUpdateListener(mClientContext.getResolvedAccountName(), mExternalGameId, l);
        }

        public final void unregisterMatchUpdateListenerFirstParty(long l, String s)
        {
            checkFirstPartyAllowed();
            boolean flag;
            if (s == null || s.length() > 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkState(flag, "Must provide a valid Game ID, or null for 'all games'");
            GameEventListenerRegistry.getInstance().unregisterMatchUpdateListener(mClientContext.getResolvedAccountName(), s, l);
        }

        public final void unregisterQuestUpdateListener(long l)
        {
            GameEventListenerRegistry.getInstance().unregisterQuestUpdateListener(mClientContext.getResolvedAccountName(), mExternalGameId, l);
        }

        public final void unregisterQuestUpdateListenerFirstParty(long l, String s)
        {
            checkFirstPartyAllowed();
            boolean flag;
            if (s == null || s.length() > 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkState(flag, "The externalGameId must be null or a non-empty string.");
            GameEventListenerRegistry.getInstance().unregisterQuestUpdateListener(mClientContext.getResolvedAccountName(), s, l);
        }

        public final void unregisterRequestListener(long l)
        {
            GameEventListenerRegistry.getInstance().unregisterRequestListener(mClientContext.getResolvedAccountName(), mExternalGameId, l);
        }

        public final void unregisterRequestListenerFirstParty(long l, String s)
        {
            checkFirstPartyAllowed();
            boolean flag;
            if (s == null || s.length() > 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkState(flag, "Must provide a valid Game ID, or null for 'all games'");
            GameEventListenerRegistry.getInstance().unregisterRequestListener(mClientContext.getResolvedAccountName(), s, l);
        }

        public final int unregisterWaitingRoomListenerRestricted(String s)
        {
            checkPermissionsSelf();
            return getRoomServiceClient().unregisterWaitingRoomListenerRestricted(new UnregisterWaitingRoomListenerRestrictedData(s));
        }

        public final void updateContactSettingsInternal(IGamesCallbacks igamescallbacks, boolean flag, Bundle bundle)
        {
            checkGoogleSigned();
            checkHeadlessAllowed();
            igamescallbacks = wrapCallbacks(igamescallbacks, false);
            Object obj = bundle.keySet().iterator();
            while (((Iterator) (obj)).hasNext()) 
            {
                String s = (String)((Iterator) (obj)).next();
                boolean flag1;
                if (NotificationChannel.fromString(s) != -1)
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                Asserts.checkState(flag1, (new StringBuilder("Unknown channel ")).append(s).toString());
            }
            obj = Agents.buildFirstPartyClientContext(mClientContext);
            PlayGamesAsyncService.updateContactSettings(mContext, ((ClientContext) (obj)), igamescallbacks, flag, bundle);
        }

        public final void updateNotifyAclInternal(IGamesCallbacks igamescallbacks, String s)
        {
            checkGoogleSigned();
            checkHeadlessAllowed();
            igamescallbacks = wrapCallbacks(igamescallbacks, false);
            Preconditions.checkNotNull(s, "ACL data must not be null");
            ClientContext clientcontext = Agents.buildFirstPartyClientContext(mClientContext);
            PlayGamesAsyncService.updateNotifyAcl(mContext, clientcontext, igamescallbacks, s);
        }

        public final void updateProfileSettingsInternal(IGamesCallbacks igamescallbacks, boolean flag)
        {
            checkGoogleSigned();
            checkHeadlessAllowed();
            igamescallbacks = wrapCallbacks(igamescallbacks, false);
            PlayGamesAsyncService.updateProfileSettings(getGamesContextFirstParty(null, null, false, new String[0]), igamescallbacks, flag);
        }

        public final void updateSelectedAccountForGameRestricted(String s, String s1)
        {
            boolean flag1 = true;
            checkGoogleSignedOrSelf();
            checkHeadlessAllowed();
            boolean flag;
            if (!TextUtils.isEmpty(s))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkState(flag, "Game package name must not be empty");
            if (!TextUtils.isEmpty(s1))
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
            Preconditions.checkState(flag, "Account name must not be empty");
            AccountUtils.setSelectedAccount(mContext, s, s1);
        }

        public final void updateTurnBasedMatch(IGamesCallbacks igamescallbacks, String s, byte abyte0[], String s1, ParticipantResult aparticipantresult[])
        {
            checkIsSignedIn();
            igamescallbacks = wrapCallbacks(igamescallbacks, false);
            boolean flag;
            if (!TextUtils.isEmpty(s))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkState(flag, "Match ID must not be empty");
            if (s1 != null)
            {
                Preconditions.checkState(ParticipantUtils.isValidParticipantId(s1), "Invalid participant ID %s", new Object[] {
                    s1
                });
            }
            if (abyte0 != null)
            {
                if (abyte0.length <= getMaxTurnBasedMatchDataSize())
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                Preconditions.checkState(flag, "Match data is too large (%d bytes). The maximum is %d", new Object[] {
                    Integer.valueOf(abyte0.length), Integer.valueOf(getMaxTurnBasedMatchDataSize())
                });
            }
            PlayGamesAsyncService.updateTurnBasedMatch(getDefaultGamesContext(false), igamescallbacks, s, s1, abyte0, aparticipantresult);
        }

        public final boolean usesApi(Api api)
        {
            if (mApiClientTracker == null)
            {
                return false;
            } else
            {
                return mApiClientTracker.getApiClient().hasApi(api);
            }
        }





/*
        static void access$300(GamesService gamesservice, String s)
        {
            String s1 = gamesservice.mClientContext.mCallingPackageName;
            PlayGamesAsyncService.addNearbyPlayer(gamesservice.getGamesContext3PTo1P(gamesservice.mExternalGameId, s, false, new String[0]), s1);
            return;
        }

*/

        public GamesService(Context context, ClientContext clientcontext, int i, String s, boolean flag)
        {
            mHasUsedRealtimeMultiplayer = new AtomicBoolean();
            mCurrentPlayerValues = null;
            mCurrentGameValues = null;
            GservicesValue.init(context.getApplicationContext());
            mContext = context;
            mClientContext = clientcontext;
            mClientVersion = i;
            mExternalGameId = s;
            mIsHeadless = flag;
            mSessionRecorder = new GamesSessionRecorder(context, clientcontext, this);
            mClientContext.setExtra("client_version", mClientVersion);
        }
    }

    private final class GamesService.GameServiceEventIncrementCache extends EventIncrementCache
    {

        final GamesService this$0;

        protected final void doIncrementEvent(String s, int i)
        {
            PlayGamesAsyncService.incrementEvents(getDefaultGamesContext(), s, i);
        }

        public GamesService.GameServiceEventIncrementCache()
        {
            this$0 = GamesService.this;
            super(mContext.getMainLooper(), 5000);
        }
    }


    static final Object SERVICE_CACHE_LOCK = new Object();
    private static final Pattern VALID_SCORE_TAG = Pattern.compile("[a-zA-Z0-9\\.\\-_~]{0,64}");
    private static final Pattern VALID_SNAPSHOT_FILENAME_PATTERN = Pattern.compile("[0-9a-zA-Z-._~]{1,100}");
    public static final HashMap sConnectionHintMap = new HashMap();
    static final HashMap sServiceCache = new HashMap();

    public PlayGamesServiceBroker(Context context)
    {
        super(context);
    }

    public static void cacheServiceInstance(ClientContext clientcontext, GamesService gamesservice)
    {
        Preconditions.checkNotNull(clientcontext, "Must provide a valid ClientContext");
        synchronized (SERVICE_CACHE_LOCK)
        {
            sServiceCache.put(new ClientContextEqualityWrapper(clientcontext), new WeakReference(gamesservice));
        }
        return;
        clientcontext;
        obj;
        JVM INSTR monitorexit ;
        throw clientcontext;
    }

    public static void clearServiceCache()
    {
        synchronized (SERVICE_CACHE_LOCK)
        {
            sServiceCache.clear();
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    static void dumpCachedServiceInstances(PrintWriter printwriter)
    {
        Object obj1 = SERVICE_CACHE_LOCK;
        obj1;
        JVM INSTR monitorenter ;
        Iterator iterator = sServiceCache.values().iterator();
_L8:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        Object obj = (WeakReference)iterator.next();
        if (obj != null) goto _L4; else goto _L3
_L3:
        obj = null;
_L5:
        if (obj == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        StringBuilder stringbuilder;
        printwriter.println("  GamesServiceInstance:");
        stringbuilder = new StringBuilder("    Game ID: ");
        if (!TextUtils.isEmpty(((GamesService) (obj)).mExternalGameId))
        {
            break MISSING_BLOCK_LABEL_137;
        }
        String s = null;
_L6:
        printwriter.println(stringbuilder.append(s).toString());
        printwriter.println((new StringBuilder("    Package name: ")).append(((GamesService) (obj)).mClientContext.mCallingPackageName).toString());
        continue; /* Loop/switch isn't completed */
        printwriter;
        obj1;
        JVM INSTR monitorexit ;
        throw printwriter;
_L4:
        obj = (GamesService)((WeakReference) (obj)).get();
          goto _L5
        s = ((GamesService) (obj)).mExternalGameId;
          goto _L6
_L2:
        obj1;
        JVM INSTR monitorexit ;
        return;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public static GamesService getServiceInstance(ClientContext clientcontext)
    {
        if (clientcontext == null)
        {
            return null;
        }
        Object obj = SERVICE_CACHE_LOCK;
        obj;
        JVM INSTR monitorenter ;
        clientcontext = new ClientContextEqualityWrapper(clientcontext);
        clientcontext = (WeakReference)sServiceCache.get(clientcontext);
        if (clientcontext != null)
        {
            break MISSING_BLOCK_LABEL_45;
        }
        obj;
        JVM INSTR monitorexit ;
        return null;
        clientcontext;
        obj;
        JVM INSTR monitorexit ;
        throw clientcontext;
        clientcontext = (GamesService)clientcontext.get();
        obj;
        JVM INSTR monitorexit ;
        return clientcontext;
    }

    public static void setConnectionHint(String s, Bundle bundle)
    {
        boolean flag;
        if (Process.myUid() == Binder.getCallingUid())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Asserts.checkState(flag, "Must be called from inside process!");
        synchronized (sConnectionHintMap)
        {
            sConnectionHintMap.put(s, bundle);
        }
        return;
        s;
        hashmap;
        JVM INSTR monitorexit ;
        throw s;
    }

    static void unbindCachedServiceInstances()
    {
        Object obj1 = SERVICE_CACHE_LOCK;
        obj1;
        JVM INSTR monitorenter ;
        Iterator iterator = sServiceCache.values().iterator();
_L5:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        obj = (WeakReference)iterator.next();
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_91;
        }
        obj = null;
_L3:
        if (obj == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        GamesSessionRecorder gamessessionrecorder;
        GameEventListenerRegistry.getInstance().clear(((GamesService) (obj)).mClientContext.getResolvedAccountName());
        gamessessionrecorder = ((GamesService) (obj)).mSessionRecorder;
        synchronized (gamessessionrecorder.mSessionLock)
        {
            gamessessionrecorder.endSession_locked();
        }
        continue; /* Loop/switch isn't completed */
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        obj;
        obj1;
        JVM INSTR monitorexit ;
        throw obj;
        obj = (GamesService)((WeakReference) (obj)).get();
          goto _L3
_L2:
        obj1;
        JVM INSTR monitorexit ;
        return;
        if (true) goto _L5; else goto _L4
_L4:
    }

    protected final Set getRequiredPermissionGroups()
    {
        return Collections.emptySet();
    }

    public final void onGetService(IGmsCallbacks igmscallbacks, GetServiceRequest getservicerequest)
    {
        Preconditions.checkNotNull(getservicerequest.clientRequestedAccount, "Account cannot be null.");
        int i = getservicerequest.clientVersion;
        GoogleApiAvailability.getInstance();
        GamesLog.w("GamesServiceBroker", String.format("Client connected with SDK %s, Services %s, and Games %s", new Object[] {
            Integer.valueOf(i), Integer.valueOf(GoogleApiAvailability.getApkVersion(mContext)), Integer.valueOf(UiUtils.getDestinationAppVersion(mContext))
        }));
        Object obj1 = getservicerequest.callingPackage;
        if (TextUtils.isEmpty(((CharSequence) (obj1))))
        {
            throw new IllegalArgumentException("invalid package name");
        }
        AndroidUtils.verifyPackageName(mContext, ((String) (obj1)));
        Bundle bundle = getservicerequest.extraArgs;
        bundle.setClassLoader(getClass().getClassLoader());
        Object obj = bundle.getString("com.google.android.gms.games.key.gamePackageName");
        i = bundle.getInt("com.google.android.gms.games.key.API_VERSION", 0);
        if (i > 2)
        {
            GamesLog.w("GamesServiceBroker", String.format("Rejecting connection - api version %d is too high", new Object[] {
                Integer.valueOf(i)
            }));
            getservicerequest = AndroidUtils.getMetadataTagForPackage(mContext, ((String) (obj)), "com.google.android.gms.games.APP_ID");
            obj1 = mContext;
            i = ((String) (obj)).hashCode();
            Intent intent = new Intent("com.google.android.gms.games.PLAY_GAMES_UPGRADE");
            intent.setPackage(((Context) (obj1)).getPackageName());
            intent.putExtra("com.google.android.gms.games.GAME_PACKAGE_NAME", ((String) (obj)));
            intent.putExtra("com.google.android.gms.games.GAME_ID", getservicerequest);
            getservicerequest = PendingIntent.getActivity(((Context) (obj1)), i, intent, 0x8000000);
            obj = new Bundle();
            ((Bundle) (obj)).putParcelable("pendingIntent", getservicerequest);
            try
            {
                igmscallbacks.onPostInitComplete(6, null, ((Bundle) (obj)));
                return;
            }
            // Misplaced declaration of an exception variable
            catch (IGmsCallbacks igmscallbacks)
            {
                GamesLog.w("GamesDestApi", "Remote exception during get service", igmscallbacks);
            }
            return;
        }
        if (GoogleApiAvailability.GOOGLE_PLAY_SERVICES_VERSION_CODE > ClientLibraryUtils.getClientVersion(mContext, "com.google.android.gms"))
        {
            GamesLog.w("GamesServiceBroker", "Play services is out of date; newer version required");
            try
            {
                igmscallbacks.onPostInitComplete(2, null, null);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (IGmsCallbacks igmscallbacks)
            {
                GamesLog.w("GamesServiceBroker", "Remote exception sending callback", igmscallbacks);
            }
            return;
        }
        Account account = getservicerequest.clientRequestedAccount;
        boolean flag1 = bundle.getBoolean("com.google.android.gms.games.key.isHeadless", false);
        boolean flag2 = bundle.getBoolean("com.google.android.gms.games.key.retryingSignIn", false);
        String s;
        ArrayList arraylist;
        int j;
        boolean flag;
        if (!"com.google.android.play.games".equals(obj1))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        flag = bundle.getBoolean("com.google.android.gms.games.key.showConnectingPopup", flag);
        i = bundle.getInt("com.google.android.gms.games.key.connectingPopupGravity", 17);
        j = bundle.getInt("com.google.android.gms.games.key.sdkVariant", 4368);
        s = bundle.getString("com.google.android.gms.games.key.forceResolveAccountKey");
        arraylist = bundle.getStringArrayList("com.google.android.gms.games.key.proxyApis");
        bundle = bundle.getBundle("com.google.android.gms.games.key.signInOptions");
        PlayGamesAsyncService.validateServiceConnection(mContext, igmscallbacks, Binder.getCallingUid(), ((String) (obj1)), getservicerequest.clientVersion, account, ((String) (obj)), ScopeUtil.toScopeString(getservicerequest.scopes), flag1, flag, i, flag2, j, s, arraylist, bundle);
    }




    // Unreferenced inner class com/google/android/gms/games/service/PlayGamesServiceBroker$GamesService$1

/* anonymous class */
    final class GamesService._cls1 extends EventIncrementManager
    {

        final GamesService this$0;

        public final EventIncrementCache buildCache()
        {
            return new GamesService.GameServiceEventIncrementCache();
        }

            
            {
                this$0 = GamesService.this;
                super();
            }
    }

}
