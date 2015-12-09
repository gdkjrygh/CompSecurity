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

    public Result d(Status status)
    {
        return t(status);
    }

    public com.google.android.gms.games.achievement.ntsResult t(Status status)
    {
        return new com.google.android.gms.games.achievement.Achievements.LoadAchievementsResult(status) {

            final AchievementsImpl.LoadImpl JW;
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
                JW = AchievementsImpl.LoadImpl.this;
                wz = status;
                super();
            }
        };
    }

    private _cls1.wz()
    {
    }

    _cls1.wz(_cls1.wz wz)
    {
        this();
    }
}
