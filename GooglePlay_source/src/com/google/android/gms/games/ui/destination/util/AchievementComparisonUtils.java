// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.destination.util;

import android.net.Uri;
import com.google.android.gms.common.api.BatchResult;
import com.google.android.gms.common.api.BatchResultToken;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.achievement.AchievementBuffer;
import com.google.android.gms.games.ui.destination.players.BaseAchievementComparisonItem;
import java.util.Comparator;

public final class AchievementComparisonUtils
{
    public static interface AchievementComparisonDataLoadedListener
    {

        public abstract void onAchievementComparisonDataLoaded(int i, AchievementBuffer achievementbuffer, AchievementBuffer achievementbuffer1);
    }

    public static interface AchievementComparisonFactory
    {

        public abstract BaseAchievementComparisonItem makeAchievementComparison(String s, String s1, String s2, long l, long l1, 
                Uri uri, Uri uri1, Player player, int i, Player player1, int j);
    }


    // Unreferenced inner class com/google/android/gms/games/ui/destination/util/AchievementComparisonUtils$1

/* anonymous class */
    public static final class _cls1
        implements ResultCallback
    {

        final AchievementComparisonDataLoadedListener val$listener;
        final BatchResultToken val$myAchievementsResultToken;
        final BatchResultToken val$theirAchievementsResultToken;

        public final volatile void onResult(Result result)
        {
            Object obj;
            AchievementBuffer achievementbuffer;
            AchievementBuffer achievementbuffer1;
            int i;
            obj = (BatchResult)result;
            i = ((BatchResult) (obj)).mStatus.mStatusCode;
            result = (com.google.android.gms.games.achievement.Achievements.LoadAchievementsResult)((BatchResult) (obj)).take(myAchievementsResultToken);
            obj = (com.google.android.gms.games.achievement.Achievements.LoadAchievementsResult)((BatchResult) (obj)).take(theirAchievementsResultToken);
            achievementbuffer = result.getAchievements();
            achievementbuffer1 = ((com.google.android.gms.games.achievement.Achievements.LoadAchievementsResult) (obj)).getAchievements();
            listener.onAchievementComparisonDataLoaded(i, achievementbuffer, achievementbuffer1);
            result.release();
            ((com.google.android.gms.games.achievement.Achievements.LoadAchievementsResult) (obj)).release();
            return;
            Exception exception;
            exception;
            result.release();
            ((com.google.android.gms.games.achievement.Achievements.LoadAchievementsResult) (obj)).release();
            throw exception;
        }

            public 
            {
                myAchievementsResultToken = batchresulttoken;
                theirAchievementsResultToken = batchresulttoken1;
                listener = achievementcomparisondataloadedlistener;
                super();
            }
    }


    // Unreferenced inner class com/google/android/gms/games/ui/destination/util/AchievementComparisonUtils$2

/* anonymous class */
    public static final class _cls2
        implements Comparator
    {

        public final volatile int compare(Object obj, Object obj1)
        {
            byte byte1 = 2;
            boolean flag = false;
            obj = (BaseAchievementComparisonItem)obj;
            obj1 = (BaseAchievementComparisonItem)obj1;
            byte byte0;
            int i;
            int j;
            if (((BaseAchievementComparisonItem) (obj)).myAchievementState == 0)
            {
                byte0 = 2;
            } else
            {
                byte0 = 0;
            }
            if (((BaseAchievementComparisonItem) (obj)).theirAchievementState == 0)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            j = byte0 + 0 + i;
            if (((BaseAchievementComparisonItem) (obj1)).myAchievementState == 0)
            {
                byte0 = byte1;
            } else
            {
                byte0 = 0;
            }
            if (((BaseAchievementComparisonItem) (obj1)).theirAchievementState == 0)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            i += byte0 + 0;
            if (j > i)
            {
                byte0 = -1;
            } else
            {
                byte0 = flag;
                if (j != i)
                {
                    return 1;
                }
            }
            return byte0;
        }

    }

}
