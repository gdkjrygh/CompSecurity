// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.client.leaderboards;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.GamesMetadata;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.internal.constants.LeaderboardCollection;
import com.google.android.gms.games.internal.constants.TimeSpan;
import com.google.android.gms.games.ui.client.ClientFragmentActivity;
import com.google.android.gms.games.ui.common.leaderboards.LeaderboardMetadataProvider;

public final class ClientLeaderboardScoreActivity extends ClientFragmentActivity
    implements LeaderboardMetadataProvider
{

    private int mCollection;
    private String mGameName;
    private String mLeaderboardId;
    private int mTimeSpan;

    public ClientLeaderboardScoreActivity()
    {
        super(0x7f0400a4, 0x7f12000d);
    }

    public final int getCollection()
    {
        return mCollection;
    }

    public final String getGameId()
    {
        return null;
    }

    public final String getGameName()
    {
        return mGameName;
    }

    public final String getGamePackageName()
    {
        return super.mClientPackageName;
    }

    public final String getLeaderboardId()
    {
        return mLeaderboardId;
    }

    protected final int getLogEventType()
    {
        return 3;
    }

    public final int getTimeSpan()
    {
        return mTimeSpan;
    }

    public final void onConnected(Bundle bundle)
    {
        super.onConnected(bundle);
        mGameName = Games.GamesMetadata.getCurrentGame(getGoogleApiClient()).getDisplayName();
    }

    public final void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setTitle("");
        mShowGameNameAsTitle = false;
        bundle = getIntent();
        mLeaderboardId = bundle.getStringExtra("com.google.android.gms.games.LEADERBOARD_ID");
        if (TextUtils.isEmpty(mLeaderboardId))
        {
            GamesLog.e("ClientLeaderboardScore", "EXTRA_LEADERBOARD_ID extra missing; bailing out...");
            finish();
        }
        mTimeSpan = bundle.getIntExtra("com.google.android.gms.games.LEADERBOARD_TIME_SPAN", -1);
        if (mTimeSpan != -1 && !TimeSpan.isValidTimeSpan(mTimeSpan))
        {
            GamesLog.e("ClientLeaderboardScore", (new StringBuilder("Invalid timespan ")).append(mTimeSpan).toString());
            mTimeSpan = -1;
        }
        mCollection = getIntent().getIntExtra("com.google.android.gms.games.LEADERBOARD_COLLECTION", -1);
        if (mCollection != -1 && !LeaderboardCollection.isValid(mCollection))
        {
            GamesLog.e("ClientLeaderboardScore", (new StringBuilder("Invalid collection ")).append(mCollection).toString());
            mCollection = -1;
        }
    }

    protected final boolean useGameThemeColorAsBackground()
    {
        return true;
    }
}
