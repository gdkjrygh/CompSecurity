// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.destination.players;

import android.net.Uri;
import com.google.android.gms.games.Player;

// Referenced classes of package com.google.android.gms.games.ui.destination.players:
//            AchievementComparisonFragment, BaseAchievementComparisonItem

final class this._cls0
    implements com.google.android.gms.games.ui.destination.util.vementComparisonFactory
{

    final AchievementComparisonFragment this$0;

    public final BaseAchievementComparisonItem makeAchievementComparison(String s, String s1, String s2, long l, long l1, 
            Uri uri, Uri uri1, Player player, int i, Player player1, int j)
    {
        return new hievementComparisonItem(s, s1, s2, l, l1, uri, uri1, player, i, player1, j);
    }

    hievementComparisonItem()
    {
        this$0 = AchievementComparisonFragment.this;
        super();
    }
}
