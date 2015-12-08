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

        public Result c(Status status)
        {
            return v(status);
        }

        public com.google.android.gms.games.achievement.Achievements.LoadAchievementsResult v(Status status)
        {
            return new com.google.android.gms.games.achievement.Achievements.LoadAchievementsResult(this, status) {

                final LoadImpl Ph;
                final Status yG;

                public AchievementBuffer getAchievements()
                {
                    return new AchievementBuffer(DataHolder.af(14));
                }

                public Status getStatus()
                {
                    return yG;
                }

                public void release()
                {
                }

            
            {
                Ph = loadimpl;
                yG = status;
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

        private final String xD;

        static String a(UpdateImpl updateimpl)
        {
            return updateimpl.xD;
        }

        public Result c(Status status)
        {
            return w(status);
        }

        public com.google.android.gms.games.achievement.Achievements.UpdateAchievementResult w(Status status)
        {
            return new com.google.android.gms.games.achievement.Achievements.UpdateAchievementResult(this, status) {

                final UpdateImpl Pi;
                final Status yG;

                public String getAchievementId()
                {
                    return UpdateImpl.a(Pi);
                }

                public Status getStatus()
                {
                    return yG;
                }

            
            {
                Pi = updateimpl;
                yG = status;
                super();
            }
            };
        }

        public UpdateImpl(String s)
        {
            xD = s;
        }
    }


    public AchievementsImpl()
    {
    }

    public Intent getAchievementsIntent(GoogleApiClient googleapiclient)
    {
        return Games.c(googleapiclient).gZ();
    }

    public void increment(GoogleApiClient googleapiclient, String s, int i)
    {
        googleapiclient.b(new UpdateImpl(s, s, i) {

            final AchievementsImpl Pc;
            final String Pf;
            final int Pg;

            public volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((GamesClientImpl)a1);
            }

            public void a(GamesClientImpl gamesclientimpl)
            {
                gamesclientimpl.a(null, Pf, Pg);
            }

            
            {
                Pc = AchievementsImpl.this;
                Pf = s1;
                Pg = i;
                super(s);
            }
        });
    }

    public PendingResult incrementImmediate(GoogleApiClient googleapiclient, String s, int i)
    {
        return googleapiclient.b(new UpdateImpl(s, s, i) {

            final AchievementsImpl Pc;
            final String Pf;
            final int Pg;

            public volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((GamesClientImpl)a1);
            }

            public void a(GamesClientImpl gamesclientimpl)
            {
                gamesclientimpl.a(this, Pf, Pg);
            }

            
            {
                Pc = AchievementsImpl.this;
                Pf = s1;
                Pg = i;
                super(s);
            }
        });
    }

    public PendingResult load(GoogleApiClient googleapiclient, boolean flag)
    {
        return googleapiclient.a(new LoadImpl(flag) {

            final boolean Pb;
            final AchievementsImpl Pc;

            public volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((GamesClientImpl)a1);
            }

            public void a(GamesClientImpl gamesclientimpl)
            {
                gamesclientimpl.c(this, Pb);
            }

            
            {
                Pc = AchievementsImpl.this;
                Pb = flag;
                super();
            }
        });
    }

    public void reveal(GoogleApiClient googleapiclient, String s)
    {
        googleapiclient.b(new UpdateImpl(s, s) {

            final AchievementsImpl Pc;
            final String Pf;

            public volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((GamesClientImpl)a1);
            }

            public void a(GamesClientImpl gamesclientimpl)
            {
                gamesclientimpl.b(null, Pf);
            }

            
            {
                Pc = AchievementsImpl.this;
                Pf = s1;
                super(s);
            }
        });
    }

    public PendingResult revealImmediate(GoogleApiClient googleapiclient, String s)
    {
        return googleapiclient.b(new UpdateImpl(s, s) {

            final AchievementsImpl Pc;
            final String Pf;

            public volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((GamesClientImpl)a1);
            }

            public void a(GamesClientImpl gamesclientimpl)
            {
                gamesclientimpl.b(this, Pf);
            }

            
            {
                Pc = AchievementsImpl.this;
                Pf = s1;
                super(s);
            }
        });
    }

    public void setSteps(GoogleApiClient googleapiclient, String s, int i)
    {
        googleapiclient.b(new UpdateImpl(s, s, i) {

            final AchievementsImpl Pc;
            final String Pf;
            final int Pg;

            public volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((GamesClientImpl)a1);
            }

            public void a(GamesClientImpl gamesclientimpl)
            {
                gamesclientimpl.b(null, Pf, Pg);
            }

            
            {
                Pc = AchievementsImpl.this;
                Pf = s1;
                Pg = i;
                super(s);
            }
        });
    }

    public PendingResult setStepsImmediate(GoogleApiClient googleapiclient, String s, int i)
    {
        return googleapiclient.b(new UpdateImpl(s, s, i) {

            final AchievementsImpl Pc;
            final String Pf;
            final int Pg;

            public volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((GamesClientImpl)a1);
            }

            public void a(GamesClientImpl gamesclientimpl)
            {
                gamesclientimpl.b(this, Pf, Pg);
            }

            
            {
                Pc = AchievementsImpl.this;
                Pf = s1;
                Pg = i;
                super(s);
            }
        });
    }

    public void unlock(GoogleApiClient googleapiclient, String s)
    {
        googleapiclient.b(new UpdateImpl(s, s) {

            final AchievementsImpl Pc;
            final String Pf;

            public volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((GamesClientImpl)a1);
            }

            public void a(GamesClientImpl gamesclientimpl)
            {
                gamesclientimpl.c(null, Pf);
            }

            
            {
                Pc = AchievementsImpl.this;
                Pf = s1;
                super(s);
            }
        });
    }

    public PendingResult unlockImmediate(GoogleApiClient googleapiclient, String s)
    {
        return googleapiclient.b(new UpdateImpl(s, s) {

            final AchievementsImpl Pc;
            final String Pf;

            public volatile void a(com.google.android.gms.common.api.Api.a a1)
                throws RemoteException
            {
                a((GamesClientImpl)a1);
            }

            public void a(GamesClientImpl gamesclientimpl)
            {
                gamesclientimpl.c(this, Pf);
            }

            
            {
                Pc = AchievementsImpl.this;
                Pf = s1;
                super(s);
            }
        });
    }

    // Unreferenced inner class com/google/android/gms/games/internal/api/AchievementsImpl$10

/* anonymous class */
    class _cls10 extends LoadImpl
    {

        final boolean Pb;
        final String Pd;
        final String Pe;

        public volatile void a(com.google.android.gms.common.api.Api.a a1)
            throws RemoteException
        {
            a((GamesClientImpl)a1);
        }

        public void a(GamesClientImpl gamesclientimpl)
        {
            gamesclientimpl.b(this, Pd, Pe, Pb);
        }
    }

}
