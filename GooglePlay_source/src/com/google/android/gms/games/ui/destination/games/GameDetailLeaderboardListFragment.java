// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.destination.games;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.app.PowerUpPlayLogger;
import com.google.android.gms.games.app.PowerUpUtils;
import com.google.android.gms.games.leaderboard.Leaderboard;
import com.google.android.gms.games.ui.GamesFragmentActivity;
import com.google.android.gms.games.ui.common.leaderboards.LeaderboardFragment;
import com.google.android.gms.games.ui.destination.DestinationFragmentActivityBase;
import com.google.android.gms.games.ui.destination.LoggablePage;
import com.google.android.gms.games.ui.destination.leaderboards.DestinationLeaderboardScoreActivity;

// Referenced classes of package com.google.android.gms.games.ui.destination.games:
//            GameDetailActivity

public final class GameDetailLeaderboardListFragment extends LeaderboardFragment
    implements LoggablePage, com.google.android.gms.games.ui.util.GamesFragmentPagerAdapter.OnPageScrolledToListener
{

    private GameDetailActivity mParentActivity;

    public GameDetailLeaderboardListFragment()
    {
    }

    protected final int getPlaylogElementType()
    {
        return 25;
    }

    public final boolean hasPlayHeader()
    {
        return false;
    }

    public final void logPageView(PowerUpPlayLogger powerupplaylogger)
    {
        powerupplaylogger.logGameAction(mParentActivity.mCurrentGame, 3, false);
    }

    public final void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        Asserts.checkState(mParent instanceof GameDetailActivity);
        mParentActivity = (GameDetailActivity)mParent;
        if (PlatformVersion.checkVersion(21) && bundle == null && super.mActivity.getIntent().getIntExtra("com.google.android.gms.games.ANIMATION", -1) != -1)
        {
            postponeInitialReveal();
        }
    }

    public final void onPageScrolledTo()
    {
        logPageView(((DestinationFragmentActivityBase) (mParentActivity)).mPlayLogger);
    }

    public final void onPageSelected()
    {
    }

    protected final void showLeaderboardScoreUi(Leaderboard leaderboard)
    {
        leaderboard = leaderboard.getLeaderboardId();
        Game game = mParentActivity.mCurrentGame;
        Intent intent = new Intent(mParent, com/google/android/gms/games/ui/destination/leaderboards/DestinationLeaderboardScoreActivity);
        intent.putExtra("com.google.android.gms.games.LEADERBOARD_ID", leaderboard);
        intent.putExtra("com.google.android.gms.games.GAME", (Parcelable)game.freeze());
        intent.putExtra("com.google.android.gms.games.EXTRA_GAME_THEME_COLOR", PowerUpUtils.getGameThemeColor(mParent, (Game)game.freeze()));
        mParent.startActivity(intent);
    }
}
