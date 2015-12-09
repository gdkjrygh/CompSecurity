// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.games.achievement.Achievements;
import com.google.android.gms.games.appcontent.AppContents;
import com.google.android.gms.games.event.Events;
import com.google.android.gms.games.internal.GamesClientImpl;
import com.google.android.gms.games.internal.IGamesService;
import com.google.android.gms.games.internal.api.AchievementsImpl;
import com.google.android.gms.games.internal.api.AclsImpl;
import com.google.android.gms.games.internal.api.AppContentsImpl;
import com.google.android.gms.games.internal.api.EventsImpl;
import com.google.android.gms.games.internal.api.GamesMetadataImpl;
import com.google.android.gms.games.internal.api.InvitationsImpl;
import com.google.android.gms.games.internal.api.LeaderboardsImpl;
import com.google.android.gms.games.internal.api.MultiplayerImpl;
import com.google.android.gms.games.internal.api.NotificationsImpl;
import com.google.android.gms.games.internal.api.PlayersImpl;
import com.google.android.gms.games.internal.api.QuestsImpl;
import com.google.android.gms.games.internal.api.RealTimeMultiplayerImpl;
import com.google.android.gms.games.internal.api.RequestsImpl;
import com.google.android.gms.games.internal.api.SnapshotsImpl;
import com.google.android.gms.games.internal.api.StatsImpl;
import com.google.android.gms.games.internal.api.TurnBasedMultiplayerImpl;
import com.google.android.gms.games.internal.api.VideosImpl;
import com.google.android.gms.games.internal.events.EventIncrementManager;
import com.google.android.gms.games.internal.game.Acls;
import com.google.android.gms.games.leaderboard.Leaderboards;
import com.google.android.gms.games.multiplayer.Invitations;
import com.google.android.gms.games.multiplayer.Multiplayer;
import com.google.android.gms.games.multiplayer.realtime.RealTimeMultiplayer;
import com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer;
import com.google.android.gms.games.quest.Quests;
import com.google.android.gms.games.request.Requests;
import com.google.android.gms.games.snapshot.Snapshots;
import com.google.android.gms.games.stats.Stats;
import com.google.android.gms.games.video.Videos;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.google.android.gms.games:
//            GamesMetadata, Notifications, Players

public final class Games
{
    public static abstract class BaseGamesApiMethodImpl extends com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    {

        public BaseGamesApiMethodImpl(GoogleApiClient googleapiclient)
        {
            super(Games.CLIENT_KEY, googleapiclient);
        }
    }

    private static abstract class GamesClientBuilder extends com.google.android.gms.common.api.Api.AbstractClientBuilder
    {

        public final volatile com.google.android.gms.common.api.Api.Client buildClient(Context context, Looper looper, ClientSettings clientsettings, Object obj, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
        {
            obj = (GamesOptions)obj;
            if (obj == null)
            {
                obj = new GamesOptions((byte)0);
            }
            return new GamesClientImpl(context, looper, clientsettings, ((GamesOptions) (obj)), connectioncallbacks, onconnectionfailedlistener);
        }

        public final int getPriority()
        {
            return 1;
        }

        private GamesClientBuilder()
        {
        }

        GamesClientBuilder(byte byte0)
        {
            this();
        }
    }

    public static final class GamesOptions
        implements com.google.android.gms.common.api.Api.ApiOptions.Optional
    {

        public final boolean allowHeadlessAccess;
        public final String forceResolveAccountKey;
        public final int gravityForConnectingPopup;
        public final ArrayList proxyApis;
        public final boolean retryingSignIn;
        public final int sdkVariant;
        public final boolean showConnectingPopup;

        public static Builder builder()
        {
            return new Builder((byte)0);
        }

        public final Bundle getAsBundle()
        {
            Bundle bundle = new Bundle();
            bundle.putBoolean("com.google.android.gms.games.key.isHeadless", allowHeadlessAccess);
            bundle.putBoolean("com.google.android.gms.games.key.showConnectingPopup", showConnectingPopup);
            bundle.putInt("com.google.android.gms.games.key.connectingPopupGravity", gravityForConnectingPopup);
            bundle.putBoolean("com.google.android.gms.games.key.retryingSignIn", retryingSignIn);
            bundle.putInt("com.google.android.gms.games.key.sdkVariant", sdkVariant);
            bundle.putString("com.google.android.gms.games.key.forceResolveAccountKey", forceResolveAccountKey);
            bundle.putStringArrayList("com.google.android.gms.games.key.proxyApis", proxyApis);
            return bundle;
        }

        private GamesOptions()
        {
            allowHeadlessAccess = false;
            showConnectingPopup = true;
            gravityForConnectingPopup = 17;
            retryingSignIn = false;
            sdkVariant = 4368;
            forceResolveAccountKey = null;
            proxyApis = new ArrayList();
        }

        GamesOptions(byte byte0)
        {
            this();
        }

        private GamesOptions(Builder builder1)
        {
            allowHeadlessAccess = builder1.allowHeadlessAccess;
            showConnectingPopup = builder1.showConnectingPopup;
            gravityForConnectingPopup = builder1.gravityForConnectingPopup;
            retryingSignIn = builder1.retryingSignIn;
            sdkVariant = builder1.sdkVariant;
            forceResolveAccountKey = builder1.forceResolveAccountKey;
            proxyApis = builder1.proxyApis;
        }

        GamesOptions(Builder builder1, byte byte0)
        {
            this(builder1);
        }
    }

    public static final class GamesOptions.Builder
    {

        public boolean allowHeadlessAccess;
        public String forceResolveAccountKey;
        int gravityForConnectingPopup;
        ArrayList proxyApis;
        public boolean retryingSignIn;
        int sdkVariant;
        boolean showConnectingPopup;

        public final GamesOptions.Builder addProxyApi(String s)
        {
            proxyApis.add(s);
            return this;
        }

        public final GamesOptions build()
        {
            return new GamesOptions(this, (byte)0);
        }

        public final GamesOptions.Builder setShowConnectingPopup$371b5ca1()
        {
            showConnectingPopup = false;
            gravityForConnectingPopup = 17;
            return this;
        }

        private GamesOptions.Builder()
        {
            allowHeadlessAccess = false;
            showConnectingPopup = true;
            gravityForConnectingPopup = 17;
            retryingSignIn = false;
            sdkVariant = 4368;
            forceResolveAccountKey = null;
            proxyApis = new ArrayList();
        }

        GamesOptions.Builder(byte byte0)
        {
            this();
        }
    }

    private static abstract class SignOutImpl extends BaseGamesApiMethodImpl
    {

        public final volatile Result createFailedResult(Status status)
        {
            return status;
        }

        private SignOutImpl(GoogleApiClient googleapiclient)
        {
            super(googleapiclient);
        }

        SignOutImpl(GoogleApiClient googleapiclient, byte byte0)
        {
            this(googleapiclient);
        }
    }


    public static final Api API;
    public static final Api API_1P;
    public static final Achievements Achievements = new AchievementsImpl();
    public static final Acls Acls = new AclsImpl();
    public static final AppContents AppContents = new AppContentsImpl();
    private static final com.google.android.gms.common.api.Api.AbstractClientBuilder CLIENT_BUILDER;
    private static final com.google.android.gms.common.api.Api.AbstractClientBuilder CLIENT_BUILDER_1P;
    static final com.google.android.gms.common.api.Api.ClientKey CLIENT_KEY;
    public static final Events Events = new EventsImpl();
    public static final GamesMetadata GamesMetadata = new GamesMetadataImpl();
    public static final Invitations Invitations = new InvitationsImpl();
    public static final Leaderboards Leaderboards = new LeaderboardsImpl();
    public static final Multiplayer Multiplayer = new MultiplayerImpl();
    public static final Notifications Notifications = new NotificationsImpl();
    public static final Players Players = new PlayersImpl();
    public static final Quests Quests = new QuestsImpl();
    public static final RealTimeMultiplayer RealTimeMultiplayer = new RealTimeMultiplayerImpl();
    public static final Requests Requests = new RequestsImpl();
    public static final Scope SCOPE_GAMES = new Scope("https://www.googleapis.com/auth/games");
    public static final Scope SCOPE_GAMES_1P = new Scope("https://www.googleapis.com/auth/games.firstparty");
    public static final Snapshots Snapshots = new SnapshotsImpl();
    public static final Stats Stats = new StatsImpl();
    public static final TurnBasedMultiplayer TurnBasedMultiplayer = new TurnBasedMultiplayerImpl();
    public static final Videos Videos = new VideosImpl();

    public static String getAppId(GoogleApiClient googleapiclient)
    {
        return getConnectedClientImpl(googleapiclient, true).getAppId();
    }

    public static GamesClientImpl getConnectedClientImpl(GoogleApiClient googleapiclient)
    {
        return getConnectedClientImpl(googleapiclient, true);
    }

    public static GamesClientImpl getConnectedClientImpl(GoogleApiClient googleapiclient, boolean flag)
    {
        boolean flag1;
        if (googleapiclient != null)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        Preconditions.checkArgument(flag1, "GoogleApiClient parameter is required.");
        Preconditions.checkState(googleapiclient.isConnected(), "GoogleApiClient must be connected.");
        Preconditions.checkState(googleapiclient.hasApi(API), "GoogleApiClient is not configured to use the Games Api. Pass Games.API into GoogleApiClient.Builder#addApi() to use this feature.");
        flag1 = googleapiclient.hasConnectedApi(API);
        if (flag && !flag1)
        {
            throw new IllegalStateException("GoogleApiClient has an optional Games.API and is not connected to Games. Use GoogleApiClient.hasConnectedApi(Games.API) to guard this call.");
        }
        if (flag1)
        {
            return (GamesClientImpl)googleapiclient.getClient(CLIENT_KEY);
        } else
        {
            return null;
        }
    }

    public static String getCurrentAccountName(GoogleApiClient googleapiclient)
    {
        return getConnectedClientImpl(googleapiclient, true).getCurrentAccountName();
    }

    public static ParcelFileDescriptor getParcelFileDescriptorFirstParty(GoogleApiClient googleapiclient, Uri uri)
    {
        return getConnectedClientImpl(googleapiclient, true).getParcelFileDescriptorFirstParty(uri);
    }

    public static String getSelectedAccountForGameRestricted(GoogleApiClient googleapiclient, String s)
    {
        return getConnectedClientImpl(googleapiclient, true).getSelectedAccountForGameRestricted(s);
    }

    public static Intent getSettingsIntent(GoogleApiClient googleapiclient)
    {
        return getConnectedClientImpl(googleapiclient, true).getSettingsIntent();
    }

    public static void setIdentitySharingConfirmedInternal(GoogleApiClient googleapiclient)
    {
        googleapiclient = getConnectedClientImpl(googleapiclient, false);
        if (googleapiclient == null)
        {
            break MISSING_BLOCK_LABEL_22;
        }
        ((IGamesService)googleapiclient.getService()).setIdentitySharingConfirmedInternal();
        return;
        googleapiclient;
        GamesClientImpl.printExceptionLog(googleapiclient);
        return;
    }

    public static PendingResult signOut(GoogleApiClient googleapiclient)
    {
        return googleapiclient.execute(new SignOutImpl(googleapiclient) {

            protected final volatile void doExecute(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                client = (GamesClientImpl)client;
                ((GamesClientImpl) (client)).mIncrementCache.flush();
                ((IGamesService)client.getService()).signOut(new com.google.android.gms.games.internal.GamesClientImpl.SignOutCompleteBinderCallbacks(this));
            }

        });
    }

    public static void updateSelectedAccountForGameRestricted(GoogleApiClient googleapiclient, String s, String s1)
    {
        googleapiclient = getConnectedClientImpl(googleapiclient, false);
        if (googleapiclient == null)
        {
            break MISSING_BLOCK_LABEL_24;
        }
        ((IGamesService)googleapiclient.getService()).updateSelectedAccountForGameRestricted(s, s1);
        return;
        googleapiclient;
        GamesClientImpl.printExceptionLog(googleapiclient);
        return;
    }

    static 
    {
        CLIENT_KEY = new com.google.android.gms.common.api.Api.ClientKey();
        CLIENT_BUILDER = new GamesClientBuilder() {

            public final volatile List getImpliedScopes$505be9ea()
            {
                return Collections.singletonList(Games.SCOPE_GAMES);
            }

        };
        CLIENT_BUILDER_1P = new GamesClientBuilder() {

            public final volatile List getImpliedScopes$505be9ea()
            {
                return Collections.singletonList(Games.SCOPE_GAMES_1P);
            }

        };
        API = new Api("Games.API", CLIENT_BUILDER, CLIENT_KEY);
        API_1P = new Api("Games.API_1P", CLIENT_BUILDER_1P, CLIENT_KEY);
    }
}
