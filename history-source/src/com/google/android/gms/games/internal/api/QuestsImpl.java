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
import com.google.android.gms.games.internal.GamesClientImpl;
import com.google.android.gms.games.quest.Milestone;
import com.google.android.gms.games.quest.Quest;
import com.google.android.gms.games.quest.QuestBuffer;
import com.google.android.gms.games.quest.QuestUpdateListener;
import com.google.android.gms.games.quest.Quests;

public final class QuestsImpl
    implements Quests
{
    private static abstract class AcceptImpl extends com.google.android.gms.games.Games.BaseGamesApiMethodImpl
    {

        public com.google.android.gms.games.quest.Quests.AcceptQuestResult ah(Status status)
        {
            return new com.google.android.gms.games.quest.Quests.AcceptQuestResult(this, status) {

                final Status DS;
                final AcceptImpl abq;

                public Quest getQuest()
                {
                    return null;
                }

                public Status getStatus()
                {
                    return DS;
                }

            
            {
                abq = acceptimpl;
                DS = status;
                super();
            }
            };
        }

        public Result c(Status status)
        {
            return ah(status);
        }

        private AcceptImpl(GoogleApiClient googleapiclient)
        {
            super(googleapiclient);
        }

    }

    private static abstract class ClaimImpl extends com.google.android.gms.games.Games.BaseGamesApiMethodImpl
    {

        public com.google.android.gms.games.quest.Quests.ClaimMilestoneResult ai(Status status)
        {
            return new com.google.android.gms.games.quest.Quests.ClaimMilestoneResult(this, status) {

                final Status DS;
                final ClaimImpl abr;

                public Milestone getMilestone()
                {
                    return null;
                }

                public Quest getQuest()
                {
                    return null;
                }

                public Status getStatus()
                {
                    return DS;
                }

            
            {
                abr = claimimpl;
                DS = status;
                super();
            }
            };
        }

        public Result c(Status status)
        {
            return ai(status);
        }

        private ClaimImpl(GoogleApiClient googleapiclient)
        {
            super(googleapiclient);
        }

    }

    private static abstract class LoadsImpl extends com.google.android.gms.games.Games.BaseGamesApiMethodImpl
    {

        public com.google.android.gms.games.quest.Quests.LoadQuestsResult aj(Status status)
        {
            return new com.google.android.gms.games.quest.Quests.LoadQuestsResult(this, status) {

                final Status DS;
                final LoadsImpl abs;

                public QuestBuffer getQuests()
                {
                    return new QuestBuffer(DataHolder.av(DS.getStatusCode()));
                }

                public Status getStatus()
                {
                    return DS;
                }

                public void release()
                {
                }

            
            {
                abs = loadsimpl;
                DS = status;
                super();
            }
            };
        }

        public Result c(Status status)
        {
            return aj(status);
        }

        private LoadsImpl(GoogleApiClient googleapiclient)
        {
            super(googleapiclient);
        }

    }


    public QuestsImpl()
    {
    }

    public PendingResult accept(GoogleApiClient googleapiclient, String s)
    {
        return googleapiclient.b(new AcceptImpl(googleapiclient, s) {

            final String abk;
            final QuestsImpl abl;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((GamesClientImpl)a1);
            }

            protected void a(GamesClientImpl gamesclientimpl)
            {
                gamesclientimpl.h(this, abk);
            }

            
            {
                abl = QuestsImpl.this;
                abk = s;
                super(googleapiclient);
            }
        });
    }

    public PendingResult claim(GoogleApiClient googleapiclient, String s, String s1)
    {
        return googleapiclient.b(new ClaimImpl(googleapiclient, s, s1) {

            final String abk;
            final QuestsImpl abl;
            final String abm;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((GamesClientImpl)a1);
            }

            protected void a(GamesClientImpl gamesclientimpl)
            {
                gamesclientimpl.b(this, abk, abm);
            }

            
            {
                abl = QuestsImpl.this;
                abk = s;
                abm = s1;
                super(googleapiclient);
            }
        });
    }

    public Intent getQuestIntent(GoogleApiClient googleapiclient, String s)
    {
        return Games.d(googleapiclient).bE(s);
    }

    public Intent getQuestsIntent(GoogleApiClient googleapiclient, int ai[])
    {
        return Games.d(googleapiclient).b(ai);
    }

    public PendingResult load(GoogleApiClient googleapiclient, int ai[], int i, boolean flag)
    {
        return googleapiclient.a(new LoadsImpl(googleapiclient, ai, i, flag) {

            final boolean ZW;
            final int aaA;
            final QuestsImpl abl;
            final int abn[];

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((GamesClientImpl)a1);
            }

            protected void a(GamesClientImpl gamesclientimpl)
            {
                gamesclientimpl.a(this, abn, aaA, ZW);
            }

            
            {
                abl = QuestsImpl.this;
                abn = ai;
                aaA = i;
                ZW = flag;
                super(googleapiclient);
            }
        });
    }

    public transient PendingResult loadByIds(GoogleApiClient googleapiclient, boolean flag, String as[])
    {
        return googleapiclient.a(new LoadsImpl(googleapiclient, flag, as) {

            final boolean ZW;
            final QuestsImpl abl;
            final String abo[];

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((GamesClientImpl)a1);
            }

            protected void a(GamesClientImpl gamesclientimpl)
            {
                gamesclientimpl.b(this, ZW, abo);
            }

            
            {
                abl = QuestsImpl.this;
                ZW = flag;
                abo = as;
                super(googleapiclient);
            }
        });
    }

    public void registerQuestUpdateListener(GoogleApiClient googleapiclient, QuestUpdateListener questupdatelistener)
    {
        questupdatelistener = googleapiclient.d(questupdatelistener);
        Games.d(googleapiclient).c(questupdatelistener);
    }

    public void showStateChangedPopup(GoogleApiClient googleapiclient, String s)
    {
        Games.d(googleapiclient).bF(s);
    }

    public void unregisterQuestUpdateListener(GoogleApiClient googleapiclient)
    {
        Games.d(googleapiclient).lr();
    }

    // Unreferenced inner class com/google/android/gms/games/internal/api/QuestsImpl$5

/* anonymous class */
    class _cls5 extends LoadsImpl
    {

        final boolean ZW;
        final String ZZ;
        final int aaA;
        final int abn[];
        final String abp;

        protected volatile void a(com.google.android.gms.common.api.Api.a a1)
            throws RemoteException
        {
            a((GamesClientImpl)a1);
        }

        protected void a(GamesClientImpl gamesclientimpl)
        {
            gamesclientimpl.a(this, ZZ, abp, abn, aaA, ZW);
        }
    }


    // Unreferenced inner class com/google/android/gms/games/internal/api/QuestsImpl$6

/* anonymous class */
    class _cls6 extends LoadsImpl
    {

        final boolean ZW;
        final String ZZ;
        final String abo[];
        final String abp;

        protected volatile void a(com.google.android.gms.common.api.Api.a a1)
            throws RemoteException
        {
            a((GamesClientImpl)a1);
        }

        protected void a(GamesClientImpl gamesclientimpl)
        {
            gamesclientimpl.a(this, ZZ, abp, ZW, abo);
        }
    }

}
