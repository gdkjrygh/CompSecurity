// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.api;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.achievement.AchievementBuffer;

// Referenced classes of package com.google.android.gms.games.internal.api:
//            AchievementsImpl

private static abstract class <init> extends com.google.android.gms.games.pl
{

    public Result c(Status status)
    {
        return v(status);
    }

    public com.google.android.gms.games.achievement.ntsResult v(Status status)
    {
        return new com.google.android.gms.games.achievement.Achievements.LoadAchievementsResult(status) {

            final AchievementsImpl.LoadImpl Ph;
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
                Ph = AchievementsImpl.LoadImpl.this;
                yG = status;
                super();
            }
        };
    }

    private _cls1.yG()
    {
    }

    _cls1.yG(_cls1.yG yg)
    {
        this();
    }
}
