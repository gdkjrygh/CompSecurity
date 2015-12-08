// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.leaderboard;

import android.database.CharArrayBuffer;
import android.net.Uri;
import com.google.android.gms.common.data.Freezable;
import com.google.android.gms.games.Player;

public interface LeaderboardScore
    extends Freezable
{

    public static final int LEADERBOARD_RANK_UNKNOWN = -1;

    public abstract String getDisplayRank();

    public abstract void getDisplayRank(CharArrayBuffer chararraybuffer);

    public abstract String getDisplayScore();

    public abstract void getDisplayScore(CharArrayBuffer chararraybuffer);

    public abstract long getRank();

    public abstract long getRawScore();

    public abstract Player getScoreHolder();

    public abstract String getScoreHolderDisplayName();

    public abstract void getScoreHolderDisplayName(CharArrayBuffer chararraybuffer);

    public abstract Uri getScoreHolderHiResImageUri();

    public abstract String getScoreHolderHiResImageUrl();

    public abstract Uri getScoreHolderIconImageUri();

    public abstract String getScoreHolderIconImageUrl();

    public abstract String getScoreTag();

    public abstract long getTimestampMillis();
}
