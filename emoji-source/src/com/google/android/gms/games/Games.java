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
import com.google.android.gms.internal.gy;
import com.google.android.gms.internal.hm;

// Referenced classes of package com.google.android.gms.games:
//            GamesMetadata, Notifications, Players

public final class Games
{
    public static abstract class BaseGamesApiMethodImpl extends com.google.android.gms.common.api.a.b
    {

        public BaseGamesApiMethodImpl()
        {
            super(Games.yH);
        }
    }

    public static final class GamesOptions
        implements com.google.android.gms.common.api.Api.ApiOptions.Optional
    {

        final boolean MM;
        final boolean MN;
        final int MO;
        final boolean MP;
        final int MQ;
        final String MR;

        public static Builder builder()
        {
            return new Builder();
        }

        private GamesOptions()
        {
            MM = false;
            MN = true;
            MO = 17;
            MP = false;
            MQ = 4368;
            MR = null;
        }


        private GamesOptions(Builder builder1)
        {
            MM = builder1.MM;
            MN = builder1.MN;
            MO = builder1.MO;
            MP = builder1.MP;
            MQ = builder1.MQ;
            MR = builder1.MR;
        }

    }

    public static final class GamesOptions.Builder
    {

        boolean MM;
        boolean MN;
        int MO;
        boolean MP;
        int MQ;
        String MR;

        public GamesOptions build()
        {
            return new GamesOptions(this);
        }

        public GamesOptions.Builder setSdkVariant(int i)
        {
            MQ = i;
            return this;
        }

        public GamesOptions.Builder setShowConnectingPopup(boolean flag)
        {
            MN = flag;
            MO = 17;
            return this;
        }

        public GamesOptions.Builder setShowConnectingPopup(boolean flag, int i)
        {
            MN = flag;
            MO = i;
            return this;
        }

        private GamesOptions.Builder()
        {
            MM = false;
            MN = true;
            MO = 17;
            MP = false;
            MQ = 4368;
            MR = null;
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
    public static final String EXTRA_PLAYER_IDS = "players";
    public static final Events Events = new EventsImpl();
    public static final GamesMetadata GamesMetadata = new GamesMetadataImpl();
    public static final Invitations Invitations = new InvitationsImpl();
    public static final Leaderboards Leaderboards = new LeaderboardsImpl();
    public static final Scope MI;
    public static final Api MJ;
    public static final Multiplayer MK = new MultiplayerImpl();
    public static final Acls ML = new AclsImpl();
    public static final Notifications Notifications = new NotificationsImpl();
    public static final Players Players = new PlayersImpl();
    public static final Quests Quests = new QuestsImpl();
    public static final RealTimeMultiplayer RealTimeMultiplayer = new RealTimeMultiplayerImpl();
    public static final Requests Requests = new RequestsImpl();
    public static final Scope SCOPE_GAMES;
    public static final Snapshots Snapshots = new SnapshotsImpl();
    public static final TurnBasedMultiplayer TurnBasedMultiplayer = new TurnBasedMultiplayerImpl();
    static final com.google.android.gms.common.api.Api.c yH;
    private static final com.google.android.gms.common.api.Api.b yI;

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
        hm.b(flag, "GoogleApiClient parameter is required.");
        hm.a(googleapiclient.isConnected(), "GoogleApiClient must be connected.");
        return d(googleapiclient);
    }

    public static GamesClientImpl d(GoogleApiClient googleapiclient)
    {
        googleapiclient = (GamesClientImpl)googleapiclient.a(yH);
        boolean flag;
        if (googleapiclient != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        hm.a(flag, "GoogleApiClient is not configured to use the Games Api. Pass Games.API into GoogleApiClient.Builder#addApi() to use this feature.");
        return googleapiclient;
    }

    public static String getAppId(GoogleApiClient googleapiclient)
    {
        return c(googleapiclient).ho();
    }

    public static String getCurrentAccountName(GoogleApiClient googleapiclient)
    {
        return c(googleapiclient).gZ();
    }

    public static int getSdkVariant(GoogleApiClient googleapiclient)
    {
        return c(googleapiclient).hn();
    }

    public static Intent getSettingsIntent(GoogleApiClient googleapiclient)
    {
        return c(googleapiclient).hm();
    }

    public static void setGravityForPopups(GoogleApiClient googleapiclient, int i)
    {
        c(googleapiclient).cg(i);
    }

    public static void setViewForPopups(GoogleApiClient googleapiclient, View view)
    {
        hm.f(view);
        c(googleapiclient).f(view);
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
        yH = new com.google.android.gms.common.api.Api.c();
        yI = new com.google.android.gms.common.api.Api.b() {

            public volatile com.google.android.gms.common.api.Api.a a(Context context, Looper looper, gy gy1, Object obj, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
            {
                return a(context, looper, gy1, (GamesOptions)obj, connectioncallbacks, onconnectionfailedlistener);
            }

            public GamesClientImpl a(Context context, Looper looper, gy gy1, GamesOptions gamesoptions, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
            {
                GamesOptions gamesoptions1 = gamesoptions;
                if (gamesoptions == null)
                {
                    gamesoptions1 = new GamesOptions();
                }
                return new GamesClientImpl(context, looper, gy1.fn(), gy1.fj(), connectioncallbacks, onconnectionfailedlistener, gy1.fm(), gy1.fk(), gy1.fo(), gamesoptions1.MM, gamesoptions1.MN, gamesoptions1.MO, gamesoptions1.MP, gamesoptions1.MQ, gamesoptions1.MR);
            }

            public int getPriority()
            {
                return 1;
            }

        };
        SCOPE_GAMES = new Scope("https://www.googleapis.com/auth/games");
        API = new Api(yI, yH, new Scope[] {
            SCOPE_GAMES
        });
        MI = new Scope("https://www.googleapis.com/auth/games.firstparty");
        MJ = new Api(yI, yH, new Scope[] {
            MI
        });
    }
}
