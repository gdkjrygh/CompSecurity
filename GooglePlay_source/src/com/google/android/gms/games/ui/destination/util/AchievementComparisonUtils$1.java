// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.destination.util;

import com.google.android.gms.common.api.BatchResult;
import com.google.android.gms.common.api.BatchResultToken;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;

// Referenced classes of package com.google.android.gms.games.ui.destination.util:
//            AchievementComparisonUtils

public static final class val.listener
    implements ResultCallback
{

    final hievementComparisonDataLoadedListener val$listener;
    final BatchResultToken val$myAchievementsResultToken;
    final BatchResultToken val$theirAchievementsResultToken;

    public final volatile void onResult(Result result)
    {
        Object obj;
        com.google.android.gms.games.achievement.AchievementBuffer achievementbuffer;
        com.google.android.gms.games.achievement.AchievementBuffer achievementbuffer1;
        int i;
        obj = (BatchResult)result;
        i = ((BatchResult) (obj)).mStatus.mStatusCode;
        result = (com.google.android.gms.games.achievement.Result)((BatchResult) (obj)).take(val$myAchievementsResultToken);
        obj = (com.google.android.gms.games.achievement.Result)((BatchResult) (obj)).take(val$theirAchievementsResultToken);
        achievementbuffer = result.getAchievements();
        achievementbuffer1 = ((com.google.android.gms.games.achievement.Result) (obj)).getAchievements();
        val$listener.onAchievementComparisonDataLoaded(i, achievementbuffer, achievementbuffer1);
        result.release();
        ((com.google.android.gms.games.achievement.Result) (obj)).release();
        return;
        Exception exception;
        exception;
        result.release();
        ((com.google.android.gms.games.achievement.Result) (obj)).release();
        throw exception;
    }

    public hievementComparisonDataLoadedListener(BatchResultToken batchresulttoken, BatchResultToken batchresulttoken1, hievementComparisonDataLoadedListener hievementcomparisondataloadedlistener)
    {
        val$myAchievementsResultToken = batchresulttoken;
        val$theirAchievementsResultToken = batchresulttoken1;
        val$listener = hievementcomparisondataloadedlistener;
        super();
    }
}
