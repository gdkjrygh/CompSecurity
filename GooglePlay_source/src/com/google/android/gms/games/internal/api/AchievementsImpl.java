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
import com.google.android.gms.games.achievement.AchievementEntity;
import com.google.android.gms.games.achievement.Achievements;
import com.google.android.gms.games.internal.GamesClientImpl;
import com.google.android.gms.games.internal.IGamesService;

public final class AchievementsImpl
    implements Achievements
{
    private static abstract class LoadImpl extends com.google.android.gms.games.Games.BaseGamesApiMethodImpl
    {

        public final volatile Result createFailedResult(Status status)
        {
            return status. new com.google.android.gms.games.achievement.Achievements.LoadAchievementsResult() {

                final LoadImpl this$0;
                final Status val$status;

                public final AchievementBuffer getAchievements()
                {
                    return new AchievementBuffer(DataHolder.empty(14));
                }

                public final Status getStatus()
                {
                    return status;
                }

                public final void release()
                {
                }

            
            {
                this$0 = final_loadimpl;
                status = Status.this;
                super();
            }
            };
        }

        private LoadImpl(GoogleApiClient googleapiclient)
        {
            super(googleapiclient);
        }

        LoadImpl(GoogleApiClient googleapiclient, byte byte0)
        {
            this(googleapiclient);
        }
    }


    public AchievementsImpl()
    {
    }

    public final Intent getAchievementDescriptionIntentRestricted(GoogleApiClient googleapiclient, AchievementEntity achievemententity)
    {
        return Games.getConnectedClientImpl(googleapiclient).getAchievementDescriptionIntentRestricted(achievemententity);
    }

    public final PendingResult load$4b6585cf(final GoogleApiClient final_googleapiclient)
    {
        return final_googleapiclient.enqueue(new LoadImpl(false) {

            final AchievementsImpl this$0;
            final boolean val$forceReload = false;

            public final volatile void doExecute(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                client = (GamesClientImpl)client;
                boolean flag = forceReload;
                ((IGamesService)client.getService()).loadAchievementsV2(new com.google.android.gms.games.internal.GamesClientImpl.AchievementsLoadedBinderCallback(this), flag);
            }

            
            {
                this$0 = AchievementsImpl.this;
                super(final_googleapiclient, (byte)0);
            }
        });
    }

    public final PendingResult loadFirstParty(final GoogleApiClient final_googleapiclient, final String playerId, final String gameId, boolean flag)
    {
        return final_googleapiclient.enqueue(new LoadImpl(flag) {

            final AchievementsImpl this$0;
            final boolean val$forceReload;
            final String val$gameId;
            final String val$playerId;

            public final volatile void doExecute(com.google.android.gms.common.api.Api.Client client)
                throws RemoteException
            {
                client = (GamesClientImpl)client;
                String s = playerId;
                String s1 = gameId;
                boolean flag1 = forceReload;
                ((IGamesService)client.getService()).loadAchievementsFirstPartyV2(new com.google.android.gms.games.internal.GamesClientImpl.AchievementsLoadedBinderCallback(this), s, s1, flag1);
            }

            
            {
                this$0 = AchievementsImpl.this;
                playerId = s;
                gameId = s1;
                forceReload = flag;
                super(final_googleapiclient, (byte)0);
            }
        });
    }
}
