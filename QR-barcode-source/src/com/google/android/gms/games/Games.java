// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games;

import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.o;
import com.google.android.gms.games.achievement.Achievements;
import com.google.android.gms.games.event.Events;
import com.google.android.gms.games.internal.GamesClientImpl;
import com.google.android.gms.games.internal.api.AchievementsImpl;
import com.google.android.gms.games.internal.api.AclsImpl;
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
import com.google.android.gms.games.internal.api.TurnBasedMultiplayerImpl;
import com.google.android.gms.games.internal.game.Acls;
import com.google.android.gms.games.leaderboard.Leaderboards;
import com.google.android.gms.games.multiplayer.Invitations;
import com.google.android.gms.games.multiplayer.Multiplayer;
import com.google.android.gms.games.multiplayer.realtime.RealTimeMultiplayer;
import com.google.android.gms.games.multiplayer.turnbased.TurnBasedMultiplayer;
import com.google.android.gms.games.quest.Quests;
import com.google.android.gms.games.request.Requests;
import com.google.android.gms.games.snapshot.Snapshots;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.games:
//            GamesMetadata, Notifications, Players

public final class Games
{
    public static abstract class BaseGamesApiMethodImpl extends com.google.android.gms.common.api.BaseImplementation.a
    {

        public BaseGamesApiMethodImpl()
        {
            super(Games.CU);
        }
    }

    public static final class GamesOptions
        implements com.google.android.gms.common.api.Api.ApiOptions.Optional
    {

        public final boolean VD;
        public final boolean VE;
        public final int VF;
        public final boolean VG;
        public final int VH;
        public final String VI;
        public final ArrayList VJ;

        public static Builder builder()
        {
            return new Builder();
        }

        private GamesOptions()
        {
            VD = false;
            VE = true;
            VF = 17;
            VG = false;
            VH = 4368;
            VI = null;
            VJ = new ArrayList();
        }


        private GamesOptions(Builder builder1)
        {
            VD = builder1.VD;
            VE = builder1.VE;
            VF = builder1.VF;
            VG = builder1.VG;
            VH = builder1.VH;
            VI = builder1.VI;
            VJ = builder1.VJ;
        }

    }

    public static final class GamesOptions.Builder
    {

        boolean VD;
        boolean VE;
        int VF;
        boolean VG;
        int VH;
        String VI;
        ArrayList VJ;

        public GamesOptions build()
        {
            return new GamesOptions(this);
        }

        public GamesOptions.Builder setSdkVariant(int i)
        {
            VH = i;
            return this;
        }

        public GamesOptions.Builder setShowConnectingPopup(boolean flag)
        {
            VE = flag;
            VF = 17;
            return this;
        }

        public GamesOptions.Builder setShowConnectingPopup(boolean flag, int i)
        {
            VE = flag;
            VF = i;
            return this;
        }

        private GamesOptions.Builder()
        {
            VD = false;
            VE = true;
            VF = 17;
            VG = false;
            VH = 4368;
            VI = null;
            VJ = new ArrayList();
        }

    }

    private static abstract class SignOutImpl extends BaseGamesApiMethodImpl
    {

        public Result c(Status status)
        {
            return d(status);
        }

        public Status d(Status status)
        {
            return status;
        }

        private SignOutImpl()
        {
        }

    }


    public static final Api API;
    public static final Achievements Achievements = new AchievementsImpl();
    static final com.google.android.gms.common.api.Api.c CU;
    private static final com.google.android.gms.common.api.Api.b CV;
    public static final String EXTRA_PLAYER_IDS = "players";
    public static final Events Events = new EventsImpl();
    public static final GamesMetadata GamesMetadata = new GamesMetadataImpl();
    public static final Invitations Invitations = new InvitationsImpl();
    public static final Leaderboards Leaderboards = new LeaderboardsImpl();
    public static final Notifications Notifications = new NotificationsImpl();
    public static final Players Players = new PlayersImpl();
    public static final Quests Quests = new QuestsImpl();
    public static final RealTimeMultiplayer RealTimeMultiplayer = new RealTimeMultiplayerImpl();
    public static final Requests Requests = new RequestsImpl();
    public static final Scope SCOPE_GAMES;
    public static final Snapshots Snapshots = new SnapshotsImpl();
    public static final TurnBasedMultiplayer TurnBasedMultiplayer = new TurnBasedMultiplayerImpl();
    public static final Api VA;
    public static final Multiplayer VB = new MultiplayerImpl();
    public static final Acls VC = new AclsImpl();
    public static final Scope Vz;

    private Games()
    {
    }

    public static GamesClientImpl c(GoogleApiClient googleapiclient)
    {
        boolean flag;
        if (googleapiclient != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        o.b(flag, "GoogleApiClient parameter is required.");
        o.a(googleapiclient.isConnected(), "GoogleApiClient must be connected.");
        return d(googleapiclient);
    }

    public static GamesClientImpl d(GoogleApiClient googleapiclient)
    {
        googleapiclient = (GamesClientImpl)googleapiclient.a(CU);
        boolean flag;
        if (googleapiclient != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        o.a(flag, "GoogleApiClient is not configured to use the Games Api. Pass Games.API into GoogleApiClient.Builder#addApi() to use this feature.");
        return googleapiclient;
    }

    public static String getAppId(GoogleApiClient googleapiclient)
    {
        return c(googleapiclient).kp();
    }

    public static String getCurrentAccountName(GoogleApiClient googleapiclient)
    {
        return c(googleapiclient).ka();
    }

    public static int getSdkVariant(GoogleApiClient googleapiclient)
    {
        return c(googleapiclient).ko();
    }

    public static Intent getSettingsIntent(GoogleApiClient googleapiclient)
    {
        return c(googleapiclient).kn();
    }

    public static void setGravityForPopups(GoogleApiClient googleapiclient, int i)
    {
        c(googleapiclient).dB(i);
    }

    public static void setViewForPopups(GoogleApiClient googleapiclient, View view)
    {
        o.i(view);
        c(googleapiclient).k(view);
    }

    public static PendingResult signOut(GoogleApiClient googleapiclient)
    {
        return googleapiclient.b(new SignOutImpl() {

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((GamesClientImpl)a1);
            }

            protected void a(GamesClientImpl gamesclientimpl)
            {
                gamesclientimpl.b(this);
            }

        });
    }

    static 
    {
        CU = new com.google.android.gms.common.api.Api.c();
        CV = new com.google.android.gms.common.api.Api.b() {

            public volatile com.google.android.gms.common.api.Api.a a(Context context, Looper looper, ClientSettings clientsettings, Object obj, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
            {
                return a(context, looper, clientsettings, (GamesOptions)obj, connectioncallbacks, onconnectionfailedlistener);
            }

            public GamesClientImpl a(Context context, Looper looper, ClientSettings clientsettings, GamesOptions gamesoptions, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
            {
                if (gamesoptions == null)
                {
                    gamesoptions = new GamesOptions();
                }
                return new GamesClientImpl(context, looper, clientsettings.getRealClientPackageName(), clientsettings.getAccountNameOrDefault(), connectioncallbacks, onconnectionfailedlistener, clientsettings.getScopesArray(), clientsettings.getGravityForPopups(), clientsettings.getViewForPopups(), gamesoptions);
            }

            public int getPriority()
            {
                return 1;
            }

        };
        SCOPE_GAMES = new Scope("https://www.googleapis.com/auth/games");
        API = new Api(CV, CU, new Scope[] {
            SCOPE_GAMES
        });
        Vz = new Scope("https://www.googleapis.com/auth/games.firstparty");
        VA = new Api(CV, CU, new Scope[] {
            Vz
        });
    }
}
