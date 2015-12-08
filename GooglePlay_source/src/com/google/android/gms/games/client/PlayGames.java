// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.client;

import android.content.Context;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.games.client.games.GamesMetadata;
import com.google.android.gms.games.client.games.GamesMetadataImpl;
import com.google.android.gms.games.client.video.Videos;
import com.google.android.gms.games.client.video.VideosImpl;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.google.android.gms.games.client:
//            PlayGamesClientImpl, IPlayGamesService

public final class PlayGames
{
    public static abstract class BasePlayGamesApiMethodImpl extends com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl
    {

        public BasePlayGamesApiMethodImpl(GoogleApiClient googleapiclient)
        {
            super(PlayGames.CLIENT_KEY, googleapiclient);
        }
    }

    public static interface LoadExperimentsResult
        extends Result
    {

        public abstract Set getExperimentIds();
    }

    public static final class PlayGamesOptions
        implements com.google.android.gms.common.api.Api.ApiOptions.Optional
    {

        public final com.google.android.gms.games.Games.GamesOptions gamesOptions;
        public final boolean unauthenticated;

        public static Builder builder()
        {
            return new Builder(com.google.android.gms.games.Games.GamesOptions.builder().build(), (byte)0);
        }

        public static Builder builder(com.google.android.gms.games.Games.GamesOptions gamesoptions)
        {
            return new Builder(gamesoptions, (byte)0);
        }

        private PlayGamesOptions(Builder builder1)
        {
            gamesOptions = builder1.baseOptions;
            unauthenticated = builder1.unauthenticated;
        }

        PlayGamesOptions(Builder builder1, byte byte0)
        {
            this(builder1);
        }
    }

    public static final class PlayGamesOptions.Builder
    {

        com.google.android.gms.games.Games.GamesOptions baseOptions;
        public boolean unauthenticated;

        public final PlayGamesOptions build()
        {
            return new PlayGamesOptions(this, (byte)0);
        }

        private PlayGamesOptions.Builder(com.google.android.gms.games.Games.GamesOptions gamesoptions)
        {
            baseOptions = gamesoptions;
            unauthenticated = false;
        }

        PlayGamesOptions.Builder(com.google.android.gms.games.Games.GamesOptions gamesoptions, byte byte0)
        {
            this(gamesoptions);
        }
    }


    public static final Api API;
    private static final com.google.android.gms.common.api.Api.AbstractClientBuilder CLIENT_BUILDER;
    static final com.google.android.gms.common.api.Api.ClientKey CLIENT_KEY;
    public static final GamesMetadata GamesMetadata = new GamesMetadataImpl();
    public static final Scope SCOPE_GAMES_1P = new Scope("https://www.googleapis.com/auth/games.firstparty");
    public static final Videos Videos = new VideosImpl();

    public static List getExperiments(GoogleApiClient googleapiclient)
    {
        boolean flag;
        if (googleapiclient != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "GoogleApiClient parameter is required.");
        Preconditions.checkState(googleapiclient.isConnected(), "GoogleApiClient must be connected.");
        Preconditions.checkState(googleapiclient.hasApi(API), "GoogleApiClient is not configured to use the Play Games Api. Pass PlayGames.API into GoogleApiClient.Builder#addApi() to use this feature.");
        flag = googleapiclient.hasConnectedApi(API);
        if (!flag)
        {
            throw new IllegalStateException("GoogleApiClient has an optional PlayGames.API and is not connected to Play Games. Use GoogleApiClient.hasConnectedApi(PlayGames.API) to guard this call.");
        }
        if (flag)
        {
            googleapiclient = (PlayGamesClientImpl)googleapiclient.getClient(CLIENT_KEY);
        } else
        {
            googleapiclient = null;
        }
        return googleapiclient.getExperiments();
    }

    public static PendingResult loadExperiments(GoogleApiClient googleapiclient)
    {
        return googleapiclient.enqueue(new BasePlayGamesApiMethodImpl(googleapiclient) {

            protected final volatile Result createFailedResult(Status status)
            {
                return status. new LoadExperimentsResult() {

                    final _cls2 this$0;
                    final Status val$status;

                    public final Set getExperimentIds()
                    {
                        return new HashSet();
                    }

                    public final Status getStatus()
                    {
                        return status;
                    }

            
            {
                this$0 = final__pcls2;
                status = Status.this;
                super();
            }
                };
            }

            protected final volatile void doExecute(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                ((IPlayGamesService)((PlayGamesClientImpl)client).getService()).loadExperiments(new PlayGamesClientImpl.ExperimentsLoadedBinderCallback(this));
            }

        });
    }

    public static void logEvent(GoogleApiClient googleapiclient, String s, byte abyte0[])
    {
        googleapiclient.enqueue(new BasePlayGamesApiMethodImpl(googleapiclient, s, abyte0) {

            final String val$accountName;
            final byte val$logEvent[];

            protected final volatile Result createFailedResult(Status status)
            {
                return status;
            }

            protected final volatile void doExecute(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                client = (PlayGamesClientImpl)client;
                String s1 = accountName;
                byte abyte1[] = logEvent;
                ((IPlayGamesService)client.getService()).logEvent(s1, abyte1);
            }

            
            {
                accountName = s;
                logEvent = abyte0;
                super(googleapiclient);
            }
        });
    }

    static 
    {
        CLIENT_KEY = new com.google.android.gms.common.api.Api.ClientKey();
        CLIENT_BUILDER = new com.google.android.gms.common.api.Api.AbstractClientBuilder() {

            public final volatile com.google.android.gms.common.api.Api.Client buildClient(Context context, Looper looper, ClientSettings clientsettings, Object obj, com.google.android.gms.common.api.GoogleApiClient.ConnectionCallbacks connectioncallbacks, com.google.android.gms.common.api.GoogleApiClient.OnConnectionFailedListener onconnectionfailedlistener)
            {
                obj = (PlayGamesOptions)obj;
                if (obj == null)
                {
                    obj = PlayGamesOptions.builder().build();
                }
                return new PlayGamesClientImpl(context, looper, clientsettings, ((PlayGamesOptions) (obj)), connectioncallbacks, onconnectionfailedlistener);
            }

            public final volatile List getImpliedScopes$505be9ea()
            {
                return Arrays.asList(new Scope[] {
                    PlayGames.SCOPE_GAMES_1P
                });
            }

            public final int getPriority()
            {
                return 0x7fffffff;
            }

        };
        API = new Api("Games.API_1P", CLIENT_BUILDER, CLIENT_KEY);
    }
}
