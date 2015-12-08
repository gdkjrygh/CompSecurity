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

        public com.google.android.gms.games.achievement.Achievements.LoadAchievementsResult J(Status status)
        {
            return new com.google.android.gms.games.achievement.Achievements.LoadAchievementsResult(this, status) {

                final Status CW;
                final LoadImpl Yl;

                public AchievementBuffer getAchievements()
                {
                    return new AchievementBuffer(DataHolder.as(14));
                }

                public Status getStatus()
                {
                    return CW;
                }

                public void release()
                {
                }

            
            {
                Yl = loadimpl;
                CW = status;
                super();
            }
            };
        }

        public Result c(Status status)
        {
            return J(status);
        }

        private LoadImpl()
        {
        }

    }

    private static abstract class UpdateImpl extends com.google.android.gms.games.Games.BaseGamesApiMethodImpl
    {

        private final String BL;

        static String a(UpdateImpl updateimpl)
        {
            return updateimpl.BL;
        }

        public com.google.android.gms.games.achievement.Achievements.UpdateAchievementResult K(Status status)
        {
            return new com.google.android.gms.games.achievement.Achievements.UpdateAchievementResult(this, status) {

                final Status CW;
                final UpdateImpl Ym;

                public String getAchievementId()
                {
                    return UpdateImpl.a(Ym);
                }

                public Status getStatus()
                {
                    return CW;
                }

            
            {
                Ym = updateimpl;
                CW = status;
                super();
            }
            };
        }

        public Result c(Status status)
        {
            return K(status);
        }

        public UpdateImpl(String s)
        {
            BL = s;
        }
    }


    public AchievementsImpl()
    {
    }

    public Intent getAchievementsIntent(GoogleApiClient googleapiclient)
    {
        return Games.c(googleapiclient).kf();
    }

    public void increment(GoogleApiClient googleapiclient, String s, int i)
    {
        googleapiclient.b(new UpdateImpl(s, s, i) {

            final AchievementsImpl Yg;
            final String Yj;
            final int Yk;

            public volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((GamesClientImpl)a1);
            }

            public void a(GamesClientImpl gamesclientimpl)
            {
                gamesclientimpl.a(null, Yj, Yk);
            }

            
            {
                Yg = AchievementsImpl.this;
                Yj = s1;
                Yk = i;
                super(s);
            }
        });
    }

    public PendingResult incrementImmediate(GoogleApiClient googleapiclient, String s, int i)
    {
        return googleapiclient.b(new UpdateImpl(s, s, i) {

            final AchievementsImpl Yg;
            final String Yj;
            final int Yk;

            public volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((GamesClientImpl)a1);
            }

            public void a(GamesClientImpl gamesclientimpl)
            {
                gamesclientimpl.a(this, Yj, Yk);
            }

            
            {
                Yg = AchievementsImpl.this;
                Yj = s1;
                Yk = i;
                super(s);
            }
        });
    }

    public PendingResult load(GoogleApiClient googleapiclient, boolean flag)
    {
        return googleapiclient.a(new LoadImpl(flag) {

            final boolean Yf;
            final AchievementsImpl Yg;

            public volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((GamesClientImpl)a1);
            }

            public void a(GamesClientImpl gamesclientimpl)
            {
                gamesclientimpl.c(this, Yf);
            }

            
            {
                Yg = AchievementsImpl.this;
                Yf = flag;
                super();
            }
        });
    }

    public void reveal(GoogleApiClient googleapiclient, String s)
    {
        googleapiclient.b(new UpdateImpl(s, s) {

            final AchievementsImpl Yg;
            final String Yj;

            public volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((GamesClientImpl)a1);
            }

            public void a(GamesClientImpl gamesclientimpl)
            {
                gamesclientimpl.b(null, Yj);
            }

            
            {
                Yg = AchievementsImpl.this;
                Yj = s1;
                super(s);
            }
        });
    }

    public PendingResult revealImmediate(GoogleApiClient googleapiclient, String s)
    {
        return googleapiclient.b(new UpdateImpl(s, s) {

            final AchievementsImpl Yg;
            final String Yj;

            public volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((GamesClientImpl)a1);
            }

            public void a(GamesClientImpl gamesclientimpl)
            {
                gamesclientimpl.b(this, Yj);
            }

            
            {
                Yg = AchievementsImpl.this;
                Yj = s1;
                super(s);
            }
        });
    }

    public void setSteps(GoogleApiClient googleapiclient, String s, int i)
    {
        googleapiclient.b(new UpdateImpl(s, s, i) {

            final AchievementsImpl Yg;
            final String Yj;
            final int Yk;

            public volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((GamesClientImpl)a1);
            }

            public void a(GamesClientImpl gamesclientimpl)
            {
                gamesclientimpl.b(null, Yj, Yk);
            }

            
            {
                Yg = AchievementsImpl.this;
                Yj = s1;
                Yk = i;
                super(s);
            }
        });
    }

    public PendingResult setStepsImmediate(GoogleApiClient googleapiclient, String s, int i)
    {
        return googleapiclient.b(new UpdateImpl(s, s, i) {

            final AchievementsImpl Yg;
            final String Yj;
            final int Yk;

            public volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((GamesClientImpl)a1);
            }

            public void a(GamesClientImpl gamesclientimpl)
            {
                gamesclientimpl.b(this, Yj, Yk);
            }

            
            {
                Yg = AchievementsImpl.this;
                Yj = s1;
                Yk = i;
                super(s);
            }
        });
    }

    public void unlock(GoogleApiClient googleapiclient, String s)
    {
        googleapiclient.b(new UpdateImpl(s, s) {

            final AchievementsImpl Yg;
            final String Yj;

            public volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((GamesClientImpl)a1);
            }

            public void a(GamesClientImpl gamesclientimpl)
            {
                gamesclientimpl.c(null, Yj);
            }

            
            {
                Yg = AchievementsImpl.this;
                Yj = s1;
                super(s);
            }
        });
    }

    public PendingResult unlockImmediate(GoogleApiClient googleapiclient, String s)
    {
        return googleapiclient.b(new UpdateImpl(s, s) {

            final AchievementsImpl Yg;
            final String Yj;

            public volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((GamesClientImpl)a1);
            }

            public void a(GamesClientImpl gamesclientimpl)
            {
                gamesclientimpl.c(this, Yj);
            }

            
            {
                Yg = AchievementsImpl.this;
                Yj = s1;
                super(s);
            }
        });
    }

    // Unreferenced inner class com/google/android/gms/games/internal/api/AchievementsImpl$10

/* anonymous class */
    class _cls10 extends LoadImpl
    {

        final boolean Yf;
        final String Yh;
        final String Yi;

        public volatile void a(com.google.android.gms.common.api.Api.a a1)
            throws RemoteException
        {
            a((GamesClientImpl)a1);
        }

        public void a(GamesClientImpl gamesclientimpl)
        {
            gamesclientimpl.b(this, Yh, Yi, Yf);
        }
    }

}
