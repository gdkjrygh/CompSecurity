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

        public com.google.android.gms.games.achievement.Achievements.LoadAchievementsResult I(Status status)
        {
            return new com.google.android.gms.games.achievement.Achievements.LoadAchievementsResult(this, status) {

                final Status DS;
                final LoadImpl aac;

                public AchievementBuffer getAchievements()
                {
                    return new AchievementBuffer(DataHolder.av(14));
                }

                public Status getStatus()
                {
                    return DS;
                }

                public void release()
                {
                }

            
            {
                aac = loadimpl;
                DS = status;
                super();
            }
            };
        }

        public Result c(Status status)
        {
            return I(status);
        }

        private LoadImpl(GoogleApiClient googleapiclient)
        {
            super(googleapiclient);
        }

    }

    private static abstract class UpdateImpl extends com.google.android.gms.games.Games.BaseGamesApiMethodImpl
    {

        private final String CE;

        static String a(UpdateImpl updateimpl)
        {
            return updateimpl.CE;
        }

        public com.google.android.gms.games.achievement.Achievements.UpdateAchievementResult J(Status status)
        {
            return new com.google.android.gms.games.achievement.Achievements.UpdateAchievementResult(this, status) {

                final Status DS;
                final UpdateImpl aad;

                public String getAchievementId()
                {
                    return UpdateImpl.a(aad);
                }

                public Status getStatus()
                {
                    return DS;
                }

            
            {
                aad = updateimpl;
                DS = status;
                super();
            }
            };
        }

        public Result c(Status status)
        {
            return J(status);
        }

        public UpdateImpl(String s, GoogleApiClient googleapiclient)
        {
            super(googleapiclient);
            CE = s;
        }
    }


    public AchievementsImpl()
    {
    }

    public Intent getAchievementsIntent(GoogleApiClient googleapiclient)
    {
        return Games.d(googleapiclient).lm();
    }

    public void increment(GoogleApiClient googleapiclient, String s, int i)
    {
        googleapiclient.b(new UpdateImpl(s, googleapiclient, s, i) {

            final AchievementsImpl ZX;
            final String aaa;
            final int aab;

            public volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((GamesClientImpl)a1);
            }

            public void a(GamesClientImpl gamesclientimpl)
            {
                gamesclientimpl.a(null, aaa, aab);
            }

            
            {
                ZX = AchievementsImpl.this;
                aaa = s1;
                aab = i;
                super(s, googleapiclient);
            }
        });
    }

    public PendingResult incrementImmediate(GoogleApiClient googleapiclient, String s, int i)
    {
        return googleapiclient.b(new UpdateImpl(s, googleapiclient, s, i) {

            final AchievementsImpl ZX;
            final String aaa;
            final int aab;

            public volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((GamesClientImpl)a1);
            }

            public void a(GamesClientImpl gamesclientimpl)
            {
                gamesclientimpl.a(this, aaa, aab);
            }

            
            {
                ZX = AchievementsImpl.this;
                aaa = s1;
                aab = i;
                super(s, googleapiclient);
            }
        });
    }

    public PendingResult load(GoogleApiClient googleapiclient, boolean flag)
    {
        return googleapiclient.a(new LoadImpl(googleapiclient, flag) {

            final boolean ZW;
            final AchievementsImpl ZX;

            public volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((GamesClientImpl)a1);
            }

            public void a(GamesClientImpl gamesclientimpl)
            {
                gamesclientimpl.c(this, ZW);
            }

            
            {
                ZX = AchievementsImpl.this;
                ZW = flag;
                super(googleapiclient);
            }
        });
    }

    public void reveal(GoogleApiClient googleapiclient, String s)
    {
        googleapiclient.b(new UpdateImpl(s, googleapiclient, s) {

            final AchievementsImpl ZX;
            final String aaa;

            public volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((GamesClientImpl)a1);
            }

            public void a(GamesClientImpl gamesclientimpl)
            {
                gamesclientimpl.a(null, aaa);
            }

            
            {
                ZX = AchievementsImpl.this;
                aaa = s1;
                super(s, googleapiclient);
            }
        });
    }

    public PendingResult revealImmediate(GoogleApiClient googleapiclient, String s)
    {
        return googleapiclient.b(new UpdateImpl(s, googleapiclient, s) {

            final AchievementsImpl ZX;
            final String aaa;

            public volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((GamesClientImpl)a1);
            }

            public void a(GamesClientImpl gamesclientimpl)
            {
                gamesclientimpl.a(this, aaa);
            }

            
            {
                ZX = AchievementsImpl.this;
                aaa = s1;
                super(s, googleapiclient);
            }
        });
    }

    public void setSteps(GoogleApiClient googleapiclient, String s, int i)
    {
        googleapiclient.b(new UpdateImpl(s, googleapiclient, s, i) {

            final AchievementsImpl ZX;
            final String aaa;
            final int aab;

            public volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((GamesClientImpl)a1);
            }

            public void a(GamesClientImpl gamesclientimpl)
            {
                gamesclientimpl.b(null, aaa, aab);
            }

            
            {
                ZX = AchievementsImpl.this;
                aaa = s1;
                aab = i;
                super(s, googleapiclient);
            }
        });
    }

    public PendingResult setStepsImmediate(GoogleApiClient googleapiclient, String s, int i)
    {
        return googleapiclient.b(new UpdateImpl(s, googleapiclient, s, i) {

            final AchievementsImpl ZX;
            final String aaa;
            final int aab;

            public volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((GamesClientImpl)a1);
            }

            public void a(GamesClientImpl gamesclientimpl)
            {
                gamesclientimpl.b(this, aaa, aab);
            }

            
            {
                ZX = AchievementsImpl.this;
                aaa = s1;
                aab = i;
                super(s, googleapiclient);
            }
        });
    }

    public void unlock(GoogleApiClient googleapiclient, String s)
    {
        googleapiclient.b(new UpdateImpl(s, googleapiclient, s) {

            final AchievementsImpl ZX;
            final String aaa;

            public volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((GamesClientImpl)a1);
            }

            public void a(GamesClientImpl gamesclientimpl)
            {
                gamesclientimpl.b(null, aaa);
            }

            
            {
                ZX = AchievementsImpl.this;
                aaa = s1;
                super(s, googleapiclient);
            }
        });
    }

    public PendingResult unlockImmediate(GoogleApiClient googleapiclient, String s)
    {
        return googleapiclient.b(new UpdateImpl(s, googleapiclient, s) {

            final AchievementsImpl ZX;
            final String aaa;

            public volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((GamesClientImpl)a1);
            }

            public void a(GamesClientImpl gamesclientimpl)
            {
                gamesclientimpl.b(this, aaa);
            }

            
            {
                ZX = AchievementsImpl.this;
                aaa = s1;
                super(s, googleapiclient);
            }
        });
    }

    // Unreferenced inner class com/google/android/gms/games/internal/api/AchievementsImpl$10

/* anonymous class */
    class _cls10 extends LoadImpl
    {

        final boolean ZW;
        final String ZY;
        final String ZZ;

        public volatile void a(com.google.android.gms.common.api.Api.a a1)
            throws RemoteException
        {
            a((GamesClientImpl)a1);
        }

        public void a(GamesClientImpl gamesclientimpl)
        {
            gamesclientimpl.b(this, ZY, ZZ, ZW);
        }
    }

}
