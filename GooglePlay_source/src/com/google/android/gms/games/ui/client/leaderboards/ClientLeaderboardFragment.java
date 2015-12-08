// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.client.leaderboards;

import android.content.Intent;
import android.content.res.Resources;
import android.view.View;
import android.view.Window;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.leaderboard.Leaderboard;
import com.google.android.gms.games.leaderboard.Leaderboards;
import com.google.android.gms.games.ui.GamesFragmentActivity;
import com.google.android.gms.games.ui.client.ClientFragmentActivity;
import com.google.android.gms.games.ui.common.leaderboards.LeaderboardFragment;
import com.google.android.gms.games.ui.util.UiUtils;

public final class ClientLeaderboardFragment extends LeaderboardFragment
{

    public ClientLeaderboardFragment()
    {
    }

    public final boolean alwaysUseFloatingBackground()
    {
        return false;
    }

    protected final int getPlaylogElementType()
    {
        return 36;
    }

    public final boolean hasPlayHeader()
    {
        return true;
    }

    public final void onActivityResult(int i, int j, Intent intent)
    {
        super.onActivityResult(i, j, intent);
        mParent.onActivityResult(i, j, intent);
        mView.setVisibility(0);
        if (mParent instanceof ClientFragmentActivity)
        {
            intent = (ClientFragmentActivity)mParent;
            intent.setWindowBackground(((ClientFragmentActivity) (intent)).mGameThemeColor);
        }
    }

    protected final void showLeaderboardScoreUi(Leaderboard leaderboard)
    {
        leaderboard = leaderboard.getLeaderboardId();
        com.google.android.gms.common.api.GoogleApiClient googleapiclient = getGoogleApiClient();
        if (UiUtils.checkClientDisconnected(googleapiclient, mParent))
        {
            GamesLog.w("ClientLeaderboard", "onClick: not connected; ignoring...");
            return;
        } else
        {
            UiUtils.startActivityForResultFromFragment(this, Games.Leaderboards.getLeaderboardIntentInternal(googleapiclient, leaderboard, mParent.getIntent().getStringExtra("com.google.android.gms.games.GAME_PACKAGE_NAME")), 900);
            mView.setVisibility(4);
            mParent.getWindow().getDecorView().setBackgroundColor(getResources().getColor(0x106000d));
            return;
        }
    }
}
