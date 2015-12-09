// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.api;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.achievement.AchievementBuffer;

// Referenced classes of package com.google.android.gms.games.internal.api:
//            AchievementsImpl

private static abstract class <init> extends com.google.android.gms.games.pl
{

    public final volatile Result createFailedResult(final Status status)
    {
        return new com.google.android.gms.games.achievement.Achievements.LoadAchievementsResult() {

            final AchievementsImpl.LoadImpl this$0;
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
                this$0 = AchievementsImpl.LoadImpl.this;
                status = status1;
                super();
            }
        };
    }

    private _cls1.val.status(GoogleApiClient googleapiclient)
    {
        super(googleapiclient);
    }

    _cls1.val.status(GoogleApiClient googleapiclient, byte byte0)
    {
        this(googleapiclient);
    }
}
