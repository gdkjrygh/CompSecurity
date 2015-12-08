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

            final AchievementsImpl.LoadImpl Pk;
            final Status yJ;

            public AchievementBuffer getAchievements()
            {
                return new AchievementBuffer(DataHolder.af(14));
            }

            public Status getStatus()
            {
                return yJ;
            }

            public void release()
            {
            }

            
            {
                Pk = AchievementsImpl.LoadImpl.this;
                yJ = status;
                super();
            }
        };
    }

    private _cls1.yJ()
    {
    }

    _cls1.yJ(_cls1.yJ yj)
    {
        this();
    }
}
