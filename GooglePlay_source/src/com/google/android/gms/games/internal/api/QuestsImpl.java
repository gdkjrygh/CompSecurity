// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.api;

import android.os.RemoteException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.internal.GamesClientImpl;
import com.google.android.gms.games.internal.IGamesService;
import com.google.android.gms.games.internal.events.EventIncrementManager;
import com.google.android.gms.games.quest.Quest;
import com.google.android.gms.games.quest.QuestBuffer;
import com.google.android.gms.games.quest.QuestUpdateListener;
import com.google.android.gms.games.quest.Quests;

public final class QuestsImpl
    implements Quests
{
    private static abstract class AcceptImpl extends com.google.android.gms.games.Games.BaseGamesApiMethodImpl
    {

        public final volatile Result createFailedResult(Status status)
        {
            return status. new com.google.android.gms.games.quest.Quests.AcceptQuestResult() {

                final AcceptImpl this$0;
                final Status val$status;

                public final Quest getQuest()
                {
                    return null;
                }

                public final Status getStatus()
                {
                    return status;
                }

            
            {
                this$0 = final_acceptimpl;
                status = Status.this;
                super();
            }
            };
        }

        private AcceptImpl(GoogleApiClient googleapiclient)
        {
            super(googleapiclient);
        }

        AcceptImpl(GoogleApiClient googleapiclient, byte byte0)
        {
            this(googleapiclient);
        }
    }

    private static abstract class LoadsImpl extends com.google.android.gms.games.Games.BaseGamesApiMethodImpl
    {

        public final volatile Result createFailedResult(Status status)
        {
            return status. new com.google.android.gms.games.quest.Quests.LoadQuestsResult() {

                final LoadsImpl this$0;
                final Status val$status;

                public final QuestBuffer getQuests()
                {
                    return new QuestBuffer(DataHolder.empty(status.mStatusCode));
                }

                public final Status getStatus()
                {
                    return status;
                }

                public final void release()
                {
                }

            
            {
                this$0 = final_loadsimpl;
                status = Status.this;
                super();
            }
            };
        }

        private LoadsImpl(GoogleApiClient googleapiclient)
        {
            super(googleapiclient);
        }

        LoadsImpl(GoogleApiClient googleapiclient, byte byte0)
        {
            this(googleapiclient);
        }
    }


    public QuestsImpl()
    {
    }

    public final PendingResult accept(final GoogleApiClient final_googleapiclient, String s)
    {
        return final_googleapiclient.execute(new AcceptImpl(s) {

            final QuestsImpl this$0;
            final String val$questId;

            protected final volatile void doExecute(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                client = (GamesClientImpl)client;
                String s1 = questId;
                ((GamesClientImpl) (client)).mIncrementCache.flush();
                ((IGamesService)client.getService()).acceptQuest(new com.google.android.gms.games.internal.GamesClientImpl.QuestAcceptedBinderCallbacks(this), s1);
            }

            
            {
                this$0 = QuestsImpl.this;
                questId = s;
                super(final_googleapiclient, (byte)0);
            }
        });
    }

    public final PendingResult load$522b3926(final GoogleApiClient final_googleapiclient, final int questSelectors[], boolean flag)
    {
        return final_googleapiclient.enqueue(new LoadsImpl(flag) {

            final QuestsImpl this$0;
            final boolean val$forceReload;
            final int val$questSelectors[];
            final int val$sortOrder = 0;

            protected final volatile void doExecute(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                client = (GamesClientImpl)client;
                int ai[] = questSelectors;
                int i = sortOrder;
                boolean flag1 = forceReload;
                ((GamesClientImpl) (client)).mIncrementCache.flush();
                ((IGamesService)client.getService()).loadQuests(new com.google.android.gms.games.internal.GamesClientImpl.QuestsLoadedBinderCallbacks(this), ai, i, flag1);
            }

            
            {
                this$0 = QuestsImpl.this;
                questSelectors = ai;
                forceReload = flag;
                super(final_googleapiclient, (byte)0);
            }
        });
    }

    public final transient PendingResult loadByIdFirstParty$6a627986(final GoogleApiClient final_googleapiclient, final String gameId, final String currentPlayerId, String as[])
    {
        return final_googleapiclient.enqueue(new LoadsImpl(as) {

            final QuestsImpl this$0;
            final String val$currentPlayerId;
            final boolean val$forceReload = false;
            final String val$gameId;
            final String val$questIds[];

            protected final volatile void doExecute(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                client = (GamesClientImpl)client;
                String s = gameId;
                String s1 = currentPlayerId;
                boolean flag = forceReload;
                String as1[] = questIds;
                ((GamesClientImpl) (client)).mIncrementCache.flush();
                ((IGamesService)client.getService()).loadQuestsByIdFirstParty(new com.google.android.gms.games.internal.GamesClientImpl.QuestsLoadedBinderCallbacks(this), s, s1, as1, flag);
            }

            
            {
                this$0 = QuestsImpl.this;
                gameId = s;
                currentPlayerId = s1;
                questIds = as;
                super(final_googleapiclient, (byte)0);
            }
        });
    }

    public final transient PendingResult loadByIds$18ed36e6(final GoogleApiClient final_googleapiclient, String as[])
    {
        return final_googleapiclient.enqueue(new LoadsImpl(as) {

            final QuestsImpl this$0;
            final boolean val$forceReload = false;
            final String val$questIds[];

            protected final volatile void doExecute(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                client = (GamesClientImpl)client;
                boolean flag = forceReload;
                String as1[] = questIds;
                ((GamesClientImpl) (client)).mIncrementCache.flush();
                ((IGamesService)client.getService()).loadQuestsById(new com.google.android.gms.games.internal.GamesClientImpl.QuestsLoadedBinderCallbacks(this), as1, flag);
            }

            
            {
                this$0 = QuestsImpl.this;
                questIds = as;
                super(final_googleapiclient, (byte)0);
            }
        });
    }

    public final PendingResult loadFirstParty(final GoogleApiClient final_googleapiclient, final String gameId, final String currentPlayerId, final int questSelectors[], final int sortOrder, boolean flag)
    {
        return final_googleapiclient.enqueue(new LoadsImpl(flag) {

            final QuestsImpl this$0;
            final String val$currentPlayerId;
            final boolean val$forceReload;
            final String val$gameId;
            final int val$questSelectors[];
            final int val$sortOrder;

            protected final volatile void doExecute(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                client = (GamesClientImpl)client;
                String s = gameId;
                String s1 = currentPlayerId;
                int ai[] = questSelectors;
                int i = sortOrder;
                boolean flag1 = forceReload;
                ((GamesClientImpl) (client)).mIncrementCache.flush();
                ((IGamesService)client.getService()).loadQuestsFirstParty(new com.google.android.gms.games.internal.GamesClientImpl.QuestsLoadedBinderCallbacks(this), s, s1, ai, i, flag1);
            }

            
            {
                this$0 = QuestsImpl.this;
                gameId = s;
                currentPlayerId = s1;
                questSelectors = ai;
                sortOrder = i;
                forceReload = flag;
                super(final_googleapiclient, (byte)0);
            }
        });
    }

    public final void registerQuestUpdateListener(GoogleApiClient googleapiclient, QuestUpdateListener questupdatelistener)
    {
        GamesClientImpl gamesclientimpl;
        gamesclientimpl = Games.getConnectedClientImpl(googleapiclient, false);
        if (gamesclientimpl == null)
        {
            break MISSING_BLOCK_LABEL_42;
        }
        googleapiclient = googleapiclient.registerListener(questupdatelistener);
        googleapiclient = new com.google.android.gms.games.internal.GamesClientImpl.QuestUpdateBinderCallback(googleapiclient);
        ((IGamesService)gamesclientimpl.getService()).registerQuestUpdateListener(googleapiclient, gamesclientimpl.mClientId);
        return;
        googleapiclient;
        GamesClientImpl.printExceptionLog(googleapiclient);
        return;
    }

    public final void registerQuestUpdateListenerFirstParty(GoogleApiClient googleapiclient, QuestUpdateListener questupdatelistener, String s)
    {
        GamesClientImpl gamesclientimpl;
        gamesclientimpl = Games.getConnectedClientImpl(googleapiclient, false);
        if (gamesclientimpl == null)
        {
            break MISSING_BLOCK_LABEL_47;
        }
        googleapiclient = googleapiclient.registerListener(questupdatelistener);
        googleapiclient = new com.google.android.gms.games.internal.GamesClientImpl.QuestUpdateBinderCallback(googleapiclient);
        ((IGamesService)gamesclientimpl.getService()).registerQuestUpdateListenerFirstParty(googleapiclient, gamesclientimpl.mClientId, s);
        return;
        googleapiclient;
        GamesClientImpl.printExceptionLog(googleapiclient);
        return;
    }

    public final void unregisterQuestUpdateListener(GoogleApiClient googleapiclient)
    {
        googleapiclient = Games.getConnectedClientImpl(googleapiclient, false);
        if (googleapiclient == null)
        {
            break MISSING_BLOCK_LABEL_26;
        }
        ((IGamesService)googleapiclient.getService()).unregisterQuestUpdateListener(((GamesClientImpl) (googleapiclient)).mClientId);
        return;
        googleapiclient;
        GamesClientImpl.printExceptionLog(googleapiclient);
        return;
    }

    public final void unregisterQuestUpdateListenerFirstParty(GoogleApiClient googleapiclient, String s)
    {
        googleapiclient = Games.getConnectedClientImpl(googleapiclient, false);
        if (googleapiclient == null)
        {
            break MISSING_BLOCK_LABEL_27;
        }
        ((IGamesService)googleapiclient.getService()).unregisterQuestUpdateListenerFirstParty(((GamesClientImpl) (googleapiclient)).mClientId, s);
        return;
        googleapiclient;
        GamesClientImpl.printExceptionLog(googleapiclient);
        return;
    }
}
