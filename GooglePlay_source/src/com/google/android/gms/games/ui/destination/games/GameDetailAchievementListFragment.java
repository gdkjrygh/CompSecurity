// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.destination.games;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.games.app.PowerUpPlayLogger;
import com.google.android.gms.games.ui.common.achievements.AchievementFragment;
import com.google.android.gms.games.ui.destination.DestinationFragmentActivityBase;
import com.google.android.gms.games.ui.destination.LoggablePage;

// Referenced classes of package com.google.android.gms.games.ui.destination.games:
//            GameDetailActivity

public final class GameDetailAchievementListFragment extends AchievementFragment
    implements LoggablePage, com.google.android.gms.games.ui.util.GamesFragmentPagerAdapter.OnPageScrolledToListener
{

    private GameDetailActivity mParent;

    public GameDetailAchievementListFragment()
    {
    }

    public final boolean hasPlayHeader()
    {
        return false;
    }

    public final void logPageView(PowerUpPlayLogger powerupplaylogger)
    {
        powerupplaylogger.logGameAction(mParent.mCurrentGame, 2, false);
    }

    public final void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        Asserts.checkState(super.mActivity instanceof GameDetailActivity);
        mParent = (GameDetailActivity)super.mActivity;
        if (PlatformVersion.checkVersion(21) && bundle == null && super.mActivity.getIntent().getIntExtra("com.google.android.gms.games.ANIMATION", -1) != -1)
        {
            postponeInitialReveal();
        }
    }

    public final void onPageScrolledTo()
    {
        logPageView(((DestinationFragmentActivityBase) (mParent)).mPlayLogger);
    }

    public final void onPageSelected()
    {
    }
}
