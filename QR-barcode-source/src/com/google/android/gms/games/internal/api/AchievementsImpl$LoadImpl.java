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

    public com.google.android.gms.games.achievement.ntsResult J(Status status)
    {
        return new com.google.android.gms.games.achievement.Achievements.LoadAchievementsResult(status) {

            final Status CW;
            final AchievementsImpl.LoadImpl Yl;

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
                Yl = AchievementsImpl.LoadImpl.this;
                CW = status;
                super();
            }
        };
    }

    public Result c(Status status)
    {
        return J(status);
    }

    private _cls1.CW()
    {
    }

    _cls1.CW(_cls1.CW cw)
    {
        this();
    }
}
