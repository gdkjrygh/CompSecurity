// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.api;

import android.content.Intent;
import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerBuffer;
import com.google.android.gms.games.Players;
import com.google.android.gms.games.internal.GamesClientImpl;
import com.google.android.gms.games.internal.IGamesService;
import com.google.android.gms.games.internal.experience.ExperienceEventBuffer;
import java.util.ArrayList;
import java.util.List;

public final class PlayersImpl
    implements Players
{
    private static abstract class LoadPlayersImpl extends com.google.android.gms.games.Games.BaseGamesApiMethodImpl
    {

        public final volatile Result createFailedResult(Status status)
        {
            return status. new com.google.android.gms.games.Players.LoadPlayersResult() {

                final LoadPlayersImpl this$0;
                final Status val$status;

                public final PlayerBuffer getPlayers()
                {
                    return new PlayerBuffer(DataHolder.empty(14));
                }

                public final Status getStatus()
                {
                    return status;
                }

                public final void release()
                {
                }

            
            {
                this$0 = final_loadplayersimpl;
                status = Status.this;
                super();
            }
            };
        }

        private LoadPlayersImpl(GoogleApiClient googleapiclient)
        {
            super(googleapiclient);
        }

        LoadPlayersImpl(GoogleApiClient googleapiclient, byte byte0)
        {
            this(googleapiclient);
        }
    }

    private static abstract class LoadProfileSettingsResultImpl extends com.google.android.gms.games.Games.BaseGamesApiMethodImpl
    {

        protected final volatile Result createFailedResult(Status status)
        {
            return status. new com.google.android.gms.games.Players.LoadProfileSettingsResult() {

                final LoadProfileSettingsResultImpl this$0;
                final Status val$status;

                public final Status getStatus()
                {
                    return status;
                }

                public final boolean isProfileVisible()
                {
                    return true;
                }

            
            {
                this$0 = final_loadprofilesettingsresultimpl;
                status = Status.this;
                super();
            }
            };
        }

        private LoadProfileSettingsResultImpl(GoogleApiClient googleapiclient)
        {
            super(googleapiclient);
        }

        LoadProfileSettingsResultImpl(GoogleApiClient googleapiclient, byte byte0)
        {
            this(googleapiclient);
        }
    }

    private static abstract class LoadXpForGameCategoriesResultImpl extends com.google.android.gms.games.Games.BaseGamesApiMethodImpl
    {

        public final volatile Result createFailedResult(Status status)
        {
            return status. new com.google.android.gms.games.Players.LoadXpForGameCategoriesResult() {

                final LoadXpForGameCategoriesResultImpl this$0;
                final Status val$status;

                public final List getGameCategories()
                {
                    return null;
                }

                public final Status getStatus()
                {
                    return status;
                }

                public final long getXpForCategory(String s)
                {
                    return -1L;
                }

            
            {
                this$0 = final_loadxpforgamecategoriesresultimpl;
                status = Status.this;
                super();
            }
            };
        }

        private LoadXpForGameCategoriesResultImpl(GoogleApiClient googleapiclient)
        {
            super(googleapiclient);
        }

        LoadXpForGameCategoriesResultImpl(GoogleApiClient googleapiclient, byte byte0)
        {
            this(googleapiclient);
        }
    }

    private static abstract class LoadXpStreamResultImpl extends com.google.android.gms.games.Games.BaseGamesApiMethodImpl
    {

        public final volatile Result createFailedResult(Status status)
        {
            return status. new com.google.android.gms.games.Players.LoadXpStreamResult() {

                final LoadXpStreamResultImpl this$0;
                final Status val$status;

                public final ExperienceEventBuffer getExperienceEvents()
                {
                    return new ExperienceEventBuffer(DataHolder.empty(status.mStatusCode));
                }

                public final Status getStatus()
                {
                    return status;
                }

            
            {
                this$0 = final_loadxpstreamresultimpl;
                status = Status.this;
                super();
            }
            };
        }

        private LoadXpStreamResultImpl(GoogleApiClient googleapiclient)
        {
            super(googleapiclient);
        }

        LoadXpStreamResultImpl(GoogleApiClient googleapiclient, byte byte0)
        {
            this(googleapiclient);
        }
    }

    private static abstract class UpdateProfileSettingsResultImpl extends com.google.android.gms.games.Games.BaseGamesApiMethodImpl
    {

        protected final volatile Result createFailedResult(Status status)
        {
            return status;
        }

        private UpdateProfileSettingsResultImpl(GoogleApiClient googleapiclient)
        {
            super(googleapiclient);
        }

        UpdateProfileSettingsResultImpl(GoogleApiClient googleapiclient, byte byte0)
        {
            this(googleapiclient);
        }
    }


    public PlayersImpl()
    {
    }

    public final Player getCurrentPlayer(GoogleApiClient googleapiclient)
    {
        return Games.getConnectedClientImpl(googleapiclient).getCurrentPlayer();
    }

    public final String getCurrentPlayerId(GoogleApiClient googleapiclient)
    {
        return Games.getConnectedClientImpl(googleapiclient).getCurrentPlayerId();
    }

    public final Intent getPlayerSearchIntentInternal(GoogleApiClient googleapiclient, String s)
    {
        googleapiclient = Games.getConnectedClientImpl(googleapiclient).getPlayerSearchIntent();
        if (googleapiclient != null)
        {
            googleapiclient.putExtra("com.google.android.gms.games.GAME_PACKAGE_NAME", s);
        }
        return googleapiclient;
    }

    public final Intent getPlusUpgradeIntentFirstParty(GoogleApiClient googleapiclient)
    {
        return Games.getConnectedClientImpl(googleapiclient).getPlusUpgradeIntentFirstParty();
    }

    public final PendingResult loadConnectedPlayers(final GoogleApiClient final_googleapiclient, boolean flag)
    {
        return final_googleapiclient.enqueue(new LoadPlayersImpl(flag) {

            final PlayersImpl this$0;
            final boolean val$forceReload;

            protected final volatile void doExecute(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                client = (GamesClientImpl)client;
                boolean flag1 = forceReload;
                ((IGamesService)client.getService()).loadConnectedPlayers(new com.google.android.gms.games.internal.GamesClientImpl.PlayersLoadedBinderCallback(this), flag1);
            }

            
            {
                this$0 = PlayersImpl.this;
                forceReload = flag;
                super(final_googleapiclient, (byte)0);
            }
        });
    }

    public final PendingResult loadInvitablePlayers(final GoogleApiClient final_googleapiclient, final int pageSize, boolean flag)
    {
        return final_googleapiclient.enqueue(new LoadPlayersImpl(flag) {

            final PlayersImpl this$0;
            final boolean val$forceReload;
            final int val$pageSize;

            protected final volatile void doExecute(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                ((GamesClientImpl)client).loadInvitablePlayers(this, pageSize, false, forceReload);
            }

            
            {
                this$0 = PlayersImpl.this;
                pageSize = i;
                forceReload = flag;
                super(final_googleapiclient, (byte)0);
            }
        });
    }

    public final PendingResult loadMoreInvitablePlayers(final GoogleApiClient final_googleapiclient, int i)
    {
        return final_googleapiclient.enqueue(new LoadPlayersImpl(i) {

            final PlayersImpl this$0;
            final int val$pageSize;

            protected final volatile void doExecute(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                ((GamesClientImpl)client).loadInvitablePlayers(this, pageSize, true, false);
            }

            
            {
                this$0 = PlayersImpl.this;
                pageSize = i;
                super(final_googleapiclient, (byte)0);
            }
        });
    }

    public final PendingResult loadMorePlayersFirstParty(GoogleApiClient googleapiclient, String s, int i)
    {
        return loadMorePlayersFirstParty(googleapiclient, s, null, i);
    }

    public final PendingResult loadMorePlayersFirstParty(final GoogleApiClient final_googleapiclient, final String collection, final String externalGameId, int i)
    {
        return final_googleapiclient.enqueue(new LoadPlayersImpl(i) {

            final PlayersImpl this$0;
            final String val$collection;
            final String val$externalGameId;
            final int val$pageSize;

            protected final volatile void doExecute(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                ((GamesClientImpl)client).loadPlayersFirstParty(this, collection, externalGameId, pageSize, true, false);
            }

            
            {
                this$0 = PlayersImpl.this;
                collection = s;
                externalGameId = s1;
                pageSize = i;
                super(final_googleapiclient, (byte)0);
            }
        });
    }

    public final PendingResult loadMoreXpStreamFirstParty(final GoogleApiClient final_googleapiclient, final String externalPlayerId, int i)
    {
        return final_googleapiclient.enqueue(new LoadXpStreamResultImpl(i) {

            final PlayersImpl this$0;
            final String val$externalPlayerId;
            final int val$numExperienceEvents;

            protected final volatile void doExecute(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                client = (GamesClientImpl)client;
                String s = externalPlayerId;
                int j = numExperienceEvents;
                ((IGamesService)client.getService()).loadMoreXpStreamFirstParty(new com.google.android.gms.games.internal.GamesClientImpl.PlayerXpStreamLoadedBinderCallback(this), s, j);
            }

            
            {
                this$0 = PlayersImpl.this;
                externalPlayerId = s;
                numExperienceEvents = i;
                super(final_googleapiclient, (byte)0);
            }
        });
    }

    public final PendingResult loadNearbyPlayersInternal(final GoogleApiClient final_googleapiclient, final String gameId, int i)
    {
        return final_googleapiclient.enqueue(new LoadPlayersImpl(i) {

            final PlayersImpl this$0;
            final String val$gameId;
            final int val$pageSize;

            protected final volatile void doExecute(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                ((GamesClientImpl)client).loadPlayersInternal$4b9c992e(this, "nearby", gameId, pageSize, false);
            }

            
            {
                this$0 = PlayersImpl.this;
                gameId = s;
                pageSize = i;
                super(final_googleapiclient, (byte)0);
            }
        });
    }

    public final PendingResult loadPlayer(final GoogleApiClient final_googleapiclient, String s)
    {
        return final_googleapiclient.enqueue(new LoadPlayersImpl(s) {

            final PlayersImpl this$0;
            final String val$playerId;

            protected final volatile void doExecute(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                ((GamesClientImpl)client).loadPlayer(this, playerId, false);
            }

            
            {
                this$0 = PlayersImpl.this;
                playerId = s;
                super(final_googleapiclient, (byte)0);
            }
        });
    }

    public final PendingResult loadPlayer$70b7f367(final GoogleApiClient final_googleapiclient, final String playerId)
    {
        return final_googleapiclient.enqueue(new LoadPlayersImpl(true) {

            final PlayersImpl this$0;
            final boolean val$forceReload = true;
            final String val$playerId;

            protected final volatile void doExecute(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                ((GamesClientImpl)client).loadPlayer(this, playerId, forceReload);
            }

            
            {
                this$0 = PlayersImpl.this;
                playerId = s;
                super(final_googleapiclient, (byte)0);
            }
        });
    }

    public final PendingResult loadPlayers(final GoogleApiClient final_googleapiclient, ArrayList arraylist)
    {
        return final_googleapiclient.enqueue(new LoadPlayersImpl((String[])arraylist.toArray(new String[arraylist.size()])) {

            final PlayersImpl this$0;
            final String val$playerIdsArr[];

            protected final volatile void doExecute(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                client = (GamesClientImpl)client;
                String as[] = playerIdsArr;
                ((IGamesService)client.getService()).loadPlayersArray(new com.google.android.gms.games.internal.GamesClientImpl.PlayersLoadedBinderCallback(this), as);
            }

            
            {
                this$0 = PlayersImpl.this;
                playerIdsArr = as;
                super(final_googleapiclient, (byte)0);
            }
        });
    }

    public final PendingResult loadPlayersFirstParty(final GoogleApiClient final_googleapiclient, final String collection, final String externalGameId, final int pageSize, boolean flag)
    {
        return final_googleapiclient.enqueue(new LoadPlayersImpl(false) {

            final PlayersImpl this$0;
            final String val$collection;
            final String val$externalGameId;
            final boolean val$forceReload;
            final int val$pageSize;

            protected final volatile void doExecute(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                ((GamesClientImpl)client).loadPlayersFirstParty(this, collection, externalGameId, pageSize, false, forceReload);
            }

            
            {
                this$0 = PlayersImpl.this;
                collection = s;
                externalGameId = s1;
                pageSize = i;
                forceReload = flag;
                super(final_googleapiclient, (byte)0);
            }
        });
    }

    public final PendingResult loadPlayersFirstParty$4189436a(GoogleApiClient googleapiclient, String s, int i)
    {
        return loadPlayersFirstParty(googleapiclient, s, null, i, false);
    }

    public final PendingResult loadProfileSettingsInternal$4b6585cf(final GoogleApiClient final_googleapiclient)
    {
        return final_googleapiclient.enqueue(new LoadProfileSettingsResultImpl(true) {

            final PlayersImpl this$0;
            final boolean val$forceReload = true;

            protected final volatile void doExecute(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                client = (GamesClientImpl)client;
                boolean flag = forceReload;
                ((IGamesService)client.getService()).loadProfileSettingsInternal(new com.google.android.gms.games.internal.GamesClientImpl.ProfileSettingsLoadedBinderCallback(this), flag);
            }

            
            {
                this$0 = PlayersImpl.this;
                super(final_googleapiclient, (byte)0);
            }
        });
    }

    public final PendingResult loadRecentlyPlayedWithPlayersInternal$4189436a(final GoogleApiClient final_googleapiclient, final String gameId, boolean flag)
    {
        return final_googleapiclient.enqueue(new LoadPlayersImpl(flag) {

            final PlayersImpl this$0;
            final boolean val$forceReload;
            final String val$gameId;
            final int val$pageSize = 4;

            protected final volatile void doExecute(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                ((GamesClientImpl)client).loadPlayersInternal$4b9c992e(this, "played_with", gameId, pageSize, forceReload);
            }

            
            {
                this$0 = PlayersImpl.this;
                gameId = s;
                forceReload = flag;
                super(final_googleapiclient, (byte)0);
            }
        });
    }

    public final PendingResult loadXpForGameCategoriesFirstParty(final GoogleApiClient final_googleapiclient, String s)
    {
        return final_googleapiclient.enqueue(new LoadXpForGameCategoriesResultImpl(s) {

            final PlayersImpl this$0;
            final String val$externalPlayerId;

            protected final volatile void doExecute(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                client = (GamesClientImpl)client;
                String s1 = externalPlayerId;
                ((IGamesService)client.getService()).loadXpForGameCategoriesFirstParty(new com.google.android.gms.games.internal.GamesClientImpl.PlayerXpForGameCategoriesLoadedBinderCallback(this), s1);
            }

            
            {
                this$0 = PlayersImpl.this;
                externalPlayerId = s;
                super(final_googleapiclient, (byte)0);
            }
        });
    }

    public final PendingResult loadXpStreamFirstParty(final GoogleApiClient final_googleapiclient, final String externalPlayerId, int i)
    {
        return final_googleapiclient.enqueue(new LoadXpStreamResultImpl(i) {

            final PlayersImpl this$0;
            final String val$externalPlayerId;
            final int val$numExperienceEvents;

            protected final volatile void doExecute(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                client = (GamesClientImpl)client;
                String s = externalPlayerId;
                int j = numExperienceEvents;
                ((IGamesService)client.getService()).loadXpStreamFirstParty(new com.google.android.gms.games.internal.GamesClientImpl.PlayerXpStreamLoadedBinderCallback(this), s, j);
            }

            
            {
                this$0 = PlayersImpl.this;
                externalPlayerId = s;
                numExperienceEvents = i;
                super(final_googleapiclient, (byte)0);
            }
        });
    }

    public final PendingResult searchForMorePlayersInternal(final GoogleApiClient final_googleapiclient, final String query, int i)
    {
        return final_googleapiclient.enqueue(new LoadPlayersImpl(i) {

            final PlayersImpl this$0;
            final int val$pageSize;
            final String val$query;

            protected final volatile void doExecute(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                ((GamesClientImpl)client).searchForPlayersInternal(this, query, pageSize, true, false);
            }

            
            {
                this$0 = PlayersImpl.this;
                query = s;
                pageSize = i;
                super(final_googleapiclient, (byte)0);
            }
        });
    }

    public final PendingResult searchForPlayersInternal$4189436a(final GoogleApiClient final_googleapiclient, final String query, final int pageSize)
    {
        return final_googleapiclient.enqueue(new LoadPlayersImpl(false) {

            final PlayersImpl this$0;
            final boolean val$forceReload = false;
            final int val$pageSize;
            final String val$query;

            protected final volatile void doExecute(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                ((GamesClientImpl)client).searchForPlayersInternal(this, query, pageSize, false, forceReload);
            }

            
            {
                this$0 = PlayersImpl.this;
                query = s;
                pageSize = i;
                super(final_googleapiclient, (byte)0);
            }
        });
    }

    public final void setNearbyPlayerDetectionEnabledInternal(GoogleApiClient googleapiclient, boolean flag)
    {
        googleapiclient = Games.getConnectedClientImpl(googleapiclient, false);
        if (googleapiclient == null)
        {
            break MISSING_BLOCK_LABEL_23;
        }
        ((IGamesService)googleapiclient.getService()).setNearbyPlayerDetectionEnabled(flag);
        return;
        googleapiclient;
        GamesClientImpl.printExceptionLog(googleapiclient);
        return;
    }

    public final PendingResult updateProfileSettingsInternal(final GoogleApiClient final_googleapiclient, boolean flag)
    {
        return final_googleapiclient.execute(new UpdateProfileSettingsResultImpl(flag) {

            final PlayersImpl this$0;
            final boolean val$profileVisible;

            protected final volatile void doExecute(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                client = (GamesClientImpl)client;
                boolean flag1 = profileVisible;
                ((IGamesService)client.getService()).updateProfileSettingsInternal(new com.google.android.gms.games.internal.GamesClientImpl.ProfileSettingsUpdatedBinderCallback(this), flag1);
            }

            
            {
                this$0 = PlayersImpl.this;
                profileVisible = flag;
                super(final_googleapiclient, (byte)0);
            }
        });
    }
}
