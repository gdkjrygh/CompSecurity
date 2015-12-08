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

                final Status CW;
                final AcceptImpl Zw;

                public Quest getQuest()
                {
                    return null;
                }

                public Status getStatus()
                {
                    return CW;
                }

            
            {
                Zw = acceptimpl;
                CW = status;
                super();
            }
            };
        }

        public Result c(Status status)
        {
            return ah(status);
        }

        private AcceptImpl()
        {
        }

    }

    private static abstract class ClaimImpl extends com.google.android.gms.games.Games.BaseGamesApiMethodImpl
    {

        public com.google.android.gms.games.quest.Quests.ClaimMilestoneResult ai(Status status)
        {
            return new com.google.android.gms.games.quest.Quests.ClaimMilestoneResult(this, status) {

                final Status CW;
                final ClaimImpl Zx;

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
                    return CW;
                }

            
            {
                Zx = claimimpl;
                CW = status;
                super();
            }
            };
        }

        public Result c(Status status)
        {
            return ai(status);
        }

        private ClaimImpl()
        {
        }

    }

    private static abstract class LoadsImpl extends com.google.android.gms.games.Games.BaseGamesApiMethodImpl
    {

        public com.google.android.gms.games.quest.Quests.LoadQuestsResult aj(Status status)
        {
            return new com.google.android.gms.games.quest.Quests.LoadQuestsResult(this, status) {

                final Status CW;
                final LoadsImpl Zy;

                public QuestBuffer getQuests()
                {
                    return new QuestBuffer(DataHolder.as(CW.getStatusCode()));
                }

                public Status getStatus()
                {
                    return CW;
                }

                public void release()
                {
                }

            
            {
                Zy = loadsimpl;
                CW = status;
                super();
            }
            };
        }

        public Result c(Status status)
        {
            return aj(status);
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

            final String Zq;
            final QuestsImpl Zr;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((GamesClientImpl)a1);
            }

            protected void a(GamesClientImpl gamesclientimpl)
            {
                gamesclientimpl.i(this, Zq);
            }

            
            {
                Zr = QuestsImpl.this;
                Zq = s;
                super();
            }
        });
    }

    public PendingResult claim(GoogleApiClient googleapiclient, String s, String s1)
    {
        return googleapiclient.b(new ClaimImpl(s, s1) {

            final String Zq;
            final QuestsImpl Zr;
            final String Zs;

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((GamesClientImpl)a1);
            }

            protected void a(GamesClientImpl gamesclientimpl)
            {
                gamesclientimpl.b(this, Zq, Zs);
            }

            
            {
                Zr = QuestsImpl.this;
                Zq = s;
                Zs = s1;
                super();
            }
        });
    }

    public Intent getQuestIntent(GoogleApiClient googleapiclient, String s)
    {
        return Games.c(googleapiclient).bC(s);
    }

    public Intent getQuestsIntent(GoogleApiClient googleapiclient, int ai[])
    {
        return Games.c(googleapiclient).b(ai);
    }

    public PendingResult load(GoogleApiClient googleapiclient, int ai[], int i, boolean flag)
    {
        return googleapiclient.a(new LoadsImpl(ai, i, flag) {

            final int YF;
            final boolean Yf;
            final QuestsImpl Zr;
            final int Zt[];

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((GamesClientImpl)a1);
            }

            protected void a(GamesClientImpl gamesclientimpl)
            {
                gamesclientimpl.a(this, Zt, YF, Yf);
            }

            
            {
                Zr = QuestsImpl.this;
                Zt = ai;
                YF = i;
                Yf = flag;
                super();
            }
        });
    }

    public transient PendingResult loadByIds(GoogleApiClient googleapiclient, boolean flag, String as[])
    {
        return googleapiclient.a(new LoadsImpl(flag, as) {

            final boolean Yf;
            final QuestsImpl Zr;
            final String Zu[];

            protected volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((GamesClientImpl)a1);
            }

            protected void a(GamesClientImpl gamesclientimpl)
            {
                gamesclientimpl.b(this, Yf, Zu);
            }

            
            {
                Zr = QuestsImpl.this;
                Yf = flag;
                Zu = as;
                super();
            }
        });
    }

    public void registerQuestUpdateListener(GoogleApiClient googleapiclient, QuestUpdateListener questupdatelistener)
    {
        Games.c(googleapiclient).a(questupdatelistener);
    }

    public void showStateChangedPopup(GoogleApiClient googleapiclient, String s)
    {
        Games.c(googleapiclient).bD(s);
    }

    public void unregisterQuestUpdateListener(GoogleApiClient googleapiclient)
    {
        Games.c(googleapiclient).kk();
    }

    // Unreferenced inner class com/google/android/gms/games/internal/api/QuestsImpl$5

/* anonymous class */
    class _cls5 extends LoadsImpl
    {

        final int YF;
        final boolean Yf;
        final String Yi;
        final int Zt[];
        final String Zv;

        protected volatile void a(com.google.android.gms.common.api.Api.a a1)
            throws RemoteException
        {
            a((GamesClientImpl)a1);
        }

        protected void a(GamesClientImpl gamesclientimpl)
        {
            gamesclientimpl.a(this, Yi, Zv, Zt, YF, Yf);
        }
    }


    // Unreferenced inner class com/google/android/gms/games/internal/api/QuestsImpl$6

/* anonymous class */
    class _cls6 extends LoadsImpl
    {

        final boolean Yf;
        final String Yi;
        final String Zu[];
        final String Zv;

        protected volatile void a(com.google.android.gms.common.api.Api.a a1)
            throws RemoteException
        {
            a((GamesClientImpl)a1);
        }

        protected void a(GamesClientImpl gamesclientimpl)
        {
            gamesclientimpl.a(this, Yi, Zv, Yf, Zu);
        }
    }

}
