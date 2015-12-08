// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.achievement;

import android.content.Intent;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.api.Result;

// Referenced classes of package com.google.android.gms.games.achievement:
//            AchievementEntity, AchievementBuffer

public interface Achievements
{
    public static interface LoadAchievementsResult
        extends Releasable, Result
    {

        public abstract AchievementBuffer getAchievements();
    }


    public abstract Intent getAchievementDescriptionIntentRestricted(GoogleApiClient googleapiclient, AchievementEntity achievemententity);

    public abstract PendingResult load$4b6585cf(GoogleApiClient googleapiclient);

    public abstract PendingResult loadFirstParty(GoogleApiClient googleapiclient, String s, String s1, boolean flag);
}
