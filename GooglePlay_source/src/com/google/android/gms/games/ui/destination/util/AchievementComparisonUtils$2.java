// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.destination.util;

import com.google.android.gms.games.ui.destination.players.BaseAchievementComparisonItem;
import java.util.Comparator;

// Referenced classes of package com.google.android.gms.games.ui.destination.util:
//            AchievementComparisonUtils

public static final class tem
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

    public tem()
    {
    }
}
