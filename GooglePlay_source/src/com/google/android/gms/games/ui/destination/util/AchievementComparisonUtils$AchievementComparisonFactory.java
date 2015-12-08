// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.destination.util;

import android.net.Uri;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.ui.destination.players.BaseAchievementComparisonItem;

// Referenced classes of package com.google.android.gms.games.ui.destination.util:
//            AchievementComparisonUtils

public static interface 
{

    public abstract BaseAchievementComparisonItem makeAchievementComparison(String s, String s1, String s2, long l, long l1, 
            Uri uri, Uri uri1, Player player, int i, Player player1, int j);
}
