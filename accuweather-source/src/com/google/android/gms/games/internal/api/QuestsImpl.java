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

        public com.google.android.gms.games.quest.Quests.AcceptQuestResult S(Status status)
        {
            return new com.google.android.gms.games.quest.Quests.AcceptQuestResult(this, status) {

                final AcceptImpl Qq;
                final Status yG;

                public Quest getQuest()
                {
                    return null;
                }

                public Status getStatus()
                {
                    return yG;
                }

            
            {
                Qq = acceptimpl;
                yG = status;
                super();
            }
            };
        }

        public Result c(Status status)
        {
            return S(status);
        }

        private AcceptImpl()
        {
        }

    }

    private static abstract class ClaimImpl extends com.google.android.gms.games.Games.BaseGamesApiMethodImpl
    {

        public com.google.android.gms.games.quest.Quests.ClaimMilestoneResult T(Status status)
        {
            return new com.google.android.gms.games.quest.Quests.ClaimMilestoneResult(this, status) {

                final ClaimImpl Qr;
                final Status yG;

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
                    return yG;
                }

            
            {
                Qr = claimimpl;
                yG = status;
                super();
            }
            };
        }

        public Result c(Status status)
        {
            return T(status);
        }

        private ClaimImpl()
        {
        }

    }

    private static abstract class LoadsImpl extends com.google.android.gms.games.Games.BaseGamesApiMethodImpl
    {

        public com.google.android.gms.games.quest.Quests.LoadQuestsResult U(Status status)
        {
            return new com.google.android.gms.games.quest.Quests.LoadQuestsResult(this, status) {

                final LoadsImpl Qs;
                final Status yG;

                public QuestBuffer getQuests()
                {
                    return null;
                }

                public Status getStatus()
                {
                    return yG;
                }

                public void release()
                {
                }

            
            {
                Qs = loadsimpl;
                yG = status;
                super();
            }
            };
        }

        public Result c(Status status)
        {
            return U(status);
        }

        private LoadsImpl()
        {
        }

    }


    public QuestsImpl()
    {
    }

    public PendingResult accept(GoogleApiClient googleapiclient, String s)
    {
        return googleapiclient.b(new AcceptImpl(s) {

            final String Qk;
            final QuestsImpl Ql;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((GamesClientImpl)a1);
            }

            protected void a(GamesClientImpl gamesclientimpl)
            {
                gamesclientimpl.i(this, Qk);
            }

            
            {
                Ql = QuestsImpl.this;
                Qk = s;
                super();
            }
        });
    }

    public PendingResult claim(GoogleApiClient googleapiclient, String s, String s1)
    {
        return googleapiclient.b(new ClaimImpl(s, s1) {

            final String Qk;
            final QuestsImpl Ql;
            final String Qm;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((GamesClientImpl)a1);
            }

            protected void a(GamesClientImpl gamesclientimpl)
            {
                gamesclientimpl.b(this, Qk, Qm);
            }

            
            {
                Ql = QuestsImpl.this;
                Qk = s;
                Qm = s1;
                super();
            }
        });
    }

    public Intent getQuestIntent(GoogleApiClient googleapiclient, String s)
    {
        return Games.c(googleapiclient).aU(s);
    }

    public Intent getQuestsIntent(GoogleApiClient googleapiclient, int ai[])
    {
        return Games.c(googleapiclient).a(ai);
    }

    public PendingResult load(GoogleApiClient googleapiclient, int ai[], int i, boolean flag)
    {
        return googleapiclient.a(new LoadsImpl(ai, i, flag) {

            final int PB;
            final boolean Pb;
            final QuestsImpl Ql;
            final int Qn[];

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((GamesClientImpl)a1);
            }

            protected void a(GamesClientImpl gamesclientimpl)
            {
                gamesclientimpl.a(this, Qn, PB, Pb);
            }

            
            {
                Ql = QuestsImpl.this;
                Qn = ai;
                PB = i;
                Pb = flag;
                super();
            }
        });
    }

    public transient PendingResult loadByIds(GoogleApiClient googleapiclient, boolean flag, String as[])
    {
        return googleapiclient.a(new LoadsImpl(flag, as) {

            final boolean Pb;
            final QuestsImpl Ql;
            final String Qo[];

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((GamesClientImpl)a1);
            }

            protected void a(GamesClientImpl gamesclientimpl)
            {
                gamesclientimpl.b(this, Pb, Qo);
            }

            
            {
                Ql = QuestsImpl.this;
                Pb = flag;
                Qo = as;
                super();
            }
        });
    }

    public void registerQuestUpdateListener(GoogleApiClient googleapiclient, QuestUpdateListener questupdatelistener)
    {
        Games.c(googleapiclient).a(questupdatelistener);
    }

    public void unregisterQuestUpdateListener(GoogleApiClient googleapiclient)
    {
        Games.c(googleapiclient).he();
    }

    // Unreferenced inner class com/google/android/gms/games/internal/api/QuestsImpl$5

/* anonymous class */
    class _cls5 extends LoadsImpl
    {

        final int PB;
        final boolean Pb;
        final String Pe;
        final int Qn[];
        final String Qp;

        protected volatile void a(com.google.android.gms.common.api.Api.a a1)
            throws RemoteException
        {
            a((GamesClientImpl)a1);
        }

        protected void a(GamesClientImpl gamesclientimpl)
        {
            gamesclientimpl.a(this, Pe, Qp, Qn, PB, Pb);
        }
    }


    // Unreferenced inner class com/google/android/gms/games/internal/api/QuestsImpl$6

/* anonymous class */
    class _cls6 extends LoadsImpl
    {

        final boolean Pb;
        final String Pe;
        final String Qo[];
        final String Qp;

        protected volatile void a(com.google.android.gms.common.api.Api.a a1)
            throws RemoteException
        {
            a((GamesClientImpl)a1);
        }

        protected void a(GamesClientImpl gamesclientimpl)
        {
            gamesclientimpl.a(this, Pe, Qp, Pb, Qo);
        }
    }

}
