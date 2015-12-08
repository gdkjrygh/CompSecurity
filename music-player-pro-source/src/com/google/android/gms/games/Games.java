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
import com.google.android.gms.games.appcontent.AppContents;
import com.google.android.gms.games.event.Events;
import com.google.android.gms.games.internal.GamesClientImpl;
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
import com.google.android.gms.internal.jg;
import com.google.android.gms.internal.jx;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.games:
//            GamesMetadata, Notifications, Players

public final class Games
{
    public static abstract class BaseGamesApiMethodImpl extends com.google.android.gms.common.api.BaseImplementation.a
    {

        public BaseGamesApiMethodImpl(GoogleApiClient googleapiclient)
        {
            super(Games.DQ, googleapiclient);
        }
    }

    public static final class GamesOptions
        implements com.google.android.gms.common.api.Api.ApiOptions.Optional
    {

        public final boolean Xa;
        public final boolean Xb;
        public final int Xc;
        public final boolean Xd;
        public final int Xe;
        public final String Xf;
        public final ArrayList Xg;

        public static Builder builder()
        {
            return new Builder();
        }

        private GamesOptions()
        {
            Xa = false;
            Xb = true;
            Xc = 17;
            Xd = false;
            Xe = 4368;
            Xf = null;
            Xg = new ArrayList();
        }


        private GamesOptions(Builder builder1)
        {
            Xa = builder1.Xa;
            Xb = builder1.Xb;
            Xc = builder1.Xc;
            Xd = builder1.Xd;
            Xe = builder1.Xe;
            Xf = builder1.Xf;
            Xg = builder1.Xg;
        }

    }

    public static final class GamesOptions.Builder
    {

        boolean Xa;
        boolean Xb;
        int Xc;
        boolean Xd;
        int Xe;
        String Xf;
        ArrayList Xg;

        public GamesOptions build()
        {
            return new GamesOptions(this);
        }

        public GamesOptions.Builder setSdkVariant(int i)
        {
            Xe = i;
            return this;
        }

        public GamesOptions.Builder setShowConnectingPopup(boolean flag)
        {
            Xb = flag;
            Xc = 17;
            return this;
        }

        public GamesOptions.Builder setShowConnectingPopup(boolean flag, int i)
        {
            Xb = flag;
            Xc = i;
            return this;
        }

        private GamesOptions.Builder()
        {
            Xa = false;
            Xb = true;
            Xc = 17;
            Xd = false;
            Xe = 4368;
            Xf = null;
            Xg = new ArrayList();
        }

    }

    private static abstract class SignOutImpl extends BaseGamesApiMethodImpl
    {

        public Status b(Status status)
        {
            return status;
        }

        public Result c(Status status)
        {
            return b(status);
        }

        private SignOutImpl(GoogleApiClient googleapiclient)
        {
            super(googleapiclient);
        }

    }


    public static final Api API;
    public static final Achievements Achievements = new AchievementsImpl();
    static final com.google.android.gms.common.api.Api.c DQ;
    private static final com.google.android.gms.common.api.Api.b DR;
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
    public static final Scope WV;
    public static final Api WW;
    public static final AppContents WX = new AppContentsImpl();
    public static final Multiplayer WY = new MultiplayerImpl();
    public static final Acls WZ = new AclsImpl();

    private Games()
    {
    }

    public static GamesClientImpl d(GoogleApiClient googleapiclient)
    {
        boolean flag;
        if (googleapiclient != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        jx.b(flag, "GoogleApiClient parameter is required.");
        jx.a(googleapiclient.isConnected(), "GoogleApiClient must be connected.");
        return e(googleapiclient);
    }

    public static GamesClientImpl e(GoogleApiClient googleapiclient)
    {
        googleapiclient = (GamesClientImpl)googleapiclient.a(DQ);
        boolean flag;
        if (googleapiclient != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        jx.a(flag, "GoogleApiClient is not configured to use the Games Api. Pass Games.API into GoogleApiClient.Builder#addApi() to use this feature.");
        return googleapiclient;
    }

    public static String getAppId(GoogleApiClient googleapiclient)
    {
        return d(googleapiclient).lw();
    }

    public static String getCurrentAccountName(GoogleApiClient googleapiclient)
    {
        return d(googleapiclient).lh();
    }

    public static int getSdkVariant(GoogleApiClient googleapiclient)
    {
        return d(googleapiclient).lv();
    }

    public static Intent getSettingsIntent(GoogleApiClient googleapiclient)
    {
        return d(googleapiclient).lu();
    }

    public static void setGravityForPopups(GoogleApiClient googleapiclient, int i)
    {
        d(googleapiclient).dS(i);
    }

    public static void setViewForPopups(GoogleApiClient googleapiclient, View view)
    {
        jx.i(view);
        d(googleapiclient).k(view);
    }

    public static PendingResult signOut(GoogleApiClient googleapiclient)
    {
        return googleapiclient.b(new SignOutImpl(googleapiclient) {

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
        DQ = new com.google.android.gms.common.api.Api.c();
        DR = new com.google.android.gms.common.api.Api.b() {

            public volatile com.google.android.gms.common.api.Api.a a(Context context, Looper looper, jg jg1, Object obj, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
            {
                return a(context, looper, jg1, (GamesOptions)obj, connectioncallbacks, onconnectionfailedlistener);
            }

            public GamesClientImpl a(Context context, Looper looper, jg jg1, GamesOptions gamesoptions, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
            {
                if (gamesoptions == null)
                {
                    gamesoptions = new GamesOptions();
                }
                return new GamesClientImpl(context, looper, jg1.hq(), jg1.hm(), connectioncallbacks, onconnectionfailedlistener, jg1.hp(), jg1.hn(), jg1.hr(), gamesoptions);
            }

            public int getPriority()
            {
                return 1;
            }

        };
        SCOPE_GAMES = new Scope("https://www.googleapis.com/auth/games");
        API = new Api(DR, DQ, new Scope[] {
            SCOPE_GAMES
        });
        WV = new Scope("https://www.googleapis.com/auth/games.firstparty");
        WW = new Api(DR, DQ, new Scope[] {
            WV
        });
    }
}
