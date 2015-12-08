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
import com.google.android.gms.games.achievement.AchievementBuffer;
import com.google.android.gms.games.achievement.Achievements;
import com.google.android.gms.games.internal.GamesClientImpl;

public final class AchievementsImpl
    implements Achievements
{
    private static abstract class LoadImpl extends com.google.android.gms.games.Games.BaseGamesApiMethodImpl
    {

        public Result d(Status status)
        {
            return t(status);
        }

        public com.google.android.gms.games.achievement.Achievements.LoadAchievementsResult t(Status status)
        {
            return new com.google.android.gms.games.achievement.Achievements.LoadAchievementsResult(this, status) {

                final LoadImpl JW;
                final Status wz;

                public AchievementBuffer getAchievements()
                {
                    return new AchievementBuffer(DataHolder.empty(14));
                }

                public Status getStatus()
                {
                    return wz;
                }

                public void release()
                {
                }

            
            {
                JW = loadimpl;
                wz = status;
                super();
            }
            };
        }

        private LoadImpl()
        {
        }

    }

    private static abstract class UpdateImpl extends com.google.android.gms.games.Games.BaseGamesApiMethodImpl
    {

        private final String wp;

        static String a(UpdateImpl updateimpl)
        {
            return updateimpl.wp;
        }

        public Result d(Status status)
        {
            return u(status);
        }

        public com.google.android.gms.games.achievement.Achievements.UpdateAchievementResult u(Status status)
        {
            return new com.google.android.gms.games.achievement.Achievements.UpdateAchievementResult(this, status) {

                final UpdateImpl JX;
                final Status wz;

                public String getAchievementId()
                {
                    return UpdateImpl.a(JX);
                }

                public Status getStatus()
                {
                    return wz;
                }

            
            {
                JX = updateimpl;
                wz = status;
                super();
            }
            };
        }

        public UpdateImpl(String s)
        {
            wp = s;
        }
    }


    public AchievementsImpl()
    {
    }

    public Intent getAchievementsIntent(GoogleApiClient googleapiclient)
    {
        return Games.c(googleapiclient).gq();
    }

    public void increment(GoogleApiClient googleapiclient, String s, int i)
    {
        googleapiclient.b(new UpdateImpl(s, s, i) {

            final AchievementsImpl JR;
            final String JU;
            final int JV;

            public volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((GamesClientImpl)a1);
            }

            public void a(GamesClientImpl gamesclientimpl)
            {
                gamesclientimpl.a(null, JU, JV);
            }

            
            {
                JR = AchievementsImpl.this;
                JU = s1;
                JV = i;
                super(s);
            }
        });
    }

    public PendingResult incrementImmediate(GoogleApiClient googleapiclient, String s, int i)
    {
        return googleapiclient.b(new UpdateImpl(s, s, i) {

            final AchievementsImpl JR;
            final String JU;
            final int JV;

            public volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((GamesClientImpl)a1);
            }

            public void a(GamesClientImpl gamesclientimpl)
            {
                gamesclientimpl.a(this, JU, JV);
            }

            
            {
                JR = AchievementsImpl.this;
                JU = s1;
                JV = i;
                super(s);
            }
        });
    }

    public PendingResult load(GoogleApiClient googleapiclient, boolean flag)
    {
        return googleapiclient.a(new LoadImpl(flag) {

            final boolean JQ;
            final AchievementsImpl JR;

            public volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((GamesClientImpl)a1);
            }

            public void a(GamesClientImpl gamesclientimpl)
            {
                gamesclientimpl.c(this, JQ);
            }

            
            {
                JR = AchievementsImpl.this;
                JQ = flag;
                super();
            }
        });
    }

    public void reveal(GoogleApiClient googleapiclient, String s)
    {
        googleapiclient.b(new UpdateImpl(s, s) {

            final AchievementsImpl JR;
            final String JU;

            public volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((GamesClientImpl)a1);
            }

            public void a(GamesClientImpl gamesclientimpl)
            {
                gamesclientimpl.b(null, JU);
            }

            
            {
                JR = AchievementsImpl.this;
                JU = s1;
                super(s);
            }
        });
    }

    public PendingResult revealImmediate(GoogleApiClient googleapiclient, String s)
    {
        return googleapiclient.b(new UpdateImpl(s, s) {

            final AchievementsImpl JR;
            final String JU;

            public volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((GamesClientImpl)a1);
            }

            public void a(GamesClientImpl gamesclientimpl)
            {
                gamesclientimpl.b(this, JU);
            }

            
            {
                JR = AchievementsImpl.this;
                JU = s1;
                super(s);
            }
        });
    }

    public void setSteps(GoogleApiClient googleapiclient, String s, int i)
    {
        googleapiclient.b(new UpdateImpl(s, s, i) {

            final AchievementsImpl JR;
            final String JU;
            final int JV;

            public volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((GamesClientImpl)a1);
            }

            public void a(GamesClientImpl gamesclientimpl)
            {
                gamesclientimpl.b(null, JU, JV);
            }

            
            {
                JR = AchievementsImpl.this;
                JU = s1;
                JV = i;
                super(s);
            }
        });
    }

    public PendingResult setStepsImmediate(GoogleApiClient googleapiclient, String s, int i)
    {
        return googleapiclient.b(new UpdateImpl(s, s, i) {

            final AchievementsImpl JR;
            final String JU;
            final int JV;

            public volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((GamesClientImpl)a1);
            }

            public void a(GamesClientImpl gamesclientimpl)
            {
                gamesclientimpl.b(this, JU, JV);
            }

            
            {
                JR = AchievementsImpl.this;
                JU = s1;
                JV = i;
                super(s);
            }
        });
    }

    public void unlock(GoogleApiClient googleapiclient, String s)
    {
        googleapiclient.b(new UpdateImpl(s, s) {

            final AchievementsImpl JR;
            final String JU;

            public volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((GamesClientImpl)a1);
            }

            public void a(GamesClientImpl gamesclientimpl)
            {
                gamesclientimpl.c(null, JU);
            }

            
            {
                JR = AchievementsImpl.this;
                JU = s1;
                super(s);
            }
        });
    }

    public PendingResult unlockImmediate(GoogleApiClient googleapiclient, String s)
    {
        return googleapiclient.b(new UpdateImpl(s, s) {

            final AchievementsImpl JR;
            final String JU;

            public volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((GamesClientImpl)a1);
            }

            public void a(GamesClientImpl gamesclientimpl)
            {
                gamesclientimpl.c(this, JU);
            }

            
            {
                JR = AchievementsImpl.this;
                JU = s1;
                super(s);
            }
        });
    }

    // Unreferenced inner class com/google/android/gms/games/internal/api/AchievementsImpl$10

/* anonymous class */
    class _cls10 extends LoadImpl
    {

        final boolean JQ;
        final String JS;
        final String JT;

        public volatile void a(com.google.android.gms.common.api.Api.a a1)
            throws RemoteException
        {
            a((GamesClientImpl)a1);
        }

        public void a(GamesClientImpl gamesclientimpl)
        {
            gamesclientimpl.b(this, JS, JT, JQ);
        }
    }

}
