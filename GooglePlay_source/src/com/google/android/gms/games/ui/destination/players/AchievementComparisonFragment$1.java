// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.destination.players;

import android.support.v4.app.Fragment;
import com.google.android.gms.games.achievement.AchievementBuffer;

// Referenced classes of package com.google.android.gms.games.ui.destination.players:
//            AchievementComparisonFragment

final class this._cls0
    implements com.google.android.gms.games.ui.destination.util.vementComparisonDataLoadedListener
{

    final AchievementComparisonFragment this$0;

    public final void onAchievementComparisonDataLoaded(int i, AchievementBuffer achievementbuffer, AchievementBuffer achievementbuffer1)
    {
        if (mDetached || mRemoving || AchievementComparisonFragment.access$000(AchievementComparisonFragment.this))
        {
            return;
        } else
        {
            AchievementComparisonFragment.access$100(AchievementComparisonFragment.this, i, achievementbuffer, achievementbuffer1);
            return;
        }
    }

    entComparisonDataLoadedListener()
    {
        this$0 = AchievementComparisonFragment.this;
        super();
    }
}
