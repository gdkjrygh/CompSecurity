// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.destination.leaderboards;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.text.TextUtils;
import android.view.MenuItem;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.internal.constants.LeaderboardCollection;
import com.google.android.gms.games.internal.constants.TimeSpan;
import com.google.android.gms.games.ui.common.leaderboards.LeaderboardMetadataProvider;
import com.google.android.gms.games.ui.common.leaderboards.LeaderboardScoreFragment;
import com.google.android.gms.games.ui.destination.DestinationFragmentActivity;

public final class DestinationLeaderboardScoreActivity extends DestinationFragmentActivity
    implements LeaderboardMetadataProvider
{

    private int mCollection;
    private String mGameId;
    private String mGameName;
    private String mGamePackageName;
    private String mLeaderboardId;
    private int mTimeSpan;

    public DestinationLeaderboardScoreActivity()
    {
        super(0x7f04005f, 0x7f120014, true);
    }

    public final int getCollection()
    {
        return mCollection;
    }

    public final String getGameId()
    {
        return mGameId;
    }

    public final String getGameName()
    {
        return mGameName;
    }

    public final String getGamePackageName()
    {
        return mGamePackageName;
    }

    public final String getLeaderboardId()
    {
        return mLeaderboardId;
    }

    public final int getTimeSpan()
    {
        return mTimeSpan;
    }

    public final void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setTitle("");
        getIntent();
        bundle = (Game)getIntent().getParcelableExtra("com.google.android.gms.games.GAME");
        if (bundle != null)
        {
            mGameId = bundle.getApplicationId();
            mGameName = bundle.getDisplayName();
            mGamePackageName = bundle.getInstancePackageName();
        } else
        {
            mGameId = getIntent().getStringExtra("com.google.android.gms.games.GAME_ID");
            mGameName = getIntent().getStringExtra("com.google.android.gms.games.GAME_TITLE");
            mGamePackageName = getIntent().getStringExtra("com.google.android.gms.games.GAME_PACKAGE_NAME");
        }
        if (!TextUtils.isEmpty(mGameId) && !TextUtils.isEmpty(mGameName) && !TextUtils.isEmpty(mGamePackageName)) goto _L2; else goto _L1
_L1:
        GamesLog.e("DestLeaderboardScoreAct", "Extras missing; either EXTRA_GAME or all of EXTRA_GAME_ID, _TITLE, and _PACKAGE_NAME must be set; bailing out...");
        finish();
_L4:
        updateTaskDescription(mGameName);
        ((LeaderboardScoreFragment)super.mFragments.findFragmentById(0x7f0d016b)).enableSwipeToRefresh();
        return;
_L2:
        mLeaderboardId = getIntent().getStringExtra("com.google.android.gms.games.LEADERBOARD_ID");
        if (TextUtils.isEmpty(mLeaderboardId))
        {
            GamesLog.e("DestLeaderboardScoreAct", "EXTRA_LEADERBOARD_ID extra missing; bailing out...");
            finish();
        }
        mTimeSpan = getIntent().getIntExtra("com.google.android.gms.games.LEADERBOARD_TIME_SPAN", -1);
        if (mTimeSpan != -1 && !TimeSpan.isValidTimeSpan(mTimeSpan))
        {
            GamesLog.e("DestLeaderboardScoreAct", (new StringBuilder("Invalid timespan ")).append(mTimeSpan).toString());
            mTimeSpan = -1;
        }
        mCollection = getIntent().getIntExtra("com.google.android.gms.games.LEADERBOARD_COLLECTION", -1);
        if (mCollection != -1 && !LeaderboardCollection.isValid(mCollection))
        {
            GamesLog.e("DestLeaderboardScoreAct", (new StringBuilder("Invalid collection ")).append(mCollection).toString());
            mCollection = -1;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final boolean onOptionsItemSelected(MenuItem menuitem)
    {
        switch (menuitem.getItemId())
        {
        default:
            return super.onOptionsItemSelected(menuitem);

        case 2131558480: 
            ((LeaderboardScoreFragment)super.mFragments.findFragmentById(0x7f0d016b)).onPulledToRefresh();
            break;
        }
        return true;
    }
}
