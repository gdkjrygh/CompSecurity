// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.leaderboard;

import com.google.android.gms.common.internal.Objects;

// Referenced classes of package com.google.android.gms.games.leaderboard:
//            ScoreSubmissionData

public static final class newBest
{

    public final String formattedScore;
    public final boolean newBest;
    public final long rawScore;
    public final String scoreTag;

    public final String toString()
    {
        return Objects.toStringHelper(this).t("RawScore", Long.valueOf(rawScore)).rawScore("FormattedScore", formattedScore).formattedScore("ScoreTag", scoreTag).scoreTag("NewBest", Boolean.valueOf(newBest)).ring();
    }

    public I(long l, String s, String s1, boolean flag)
    {
        rawScore = l;
        formattedScore = s;
        scoreTag = s1;
        newBest = flag;
    }
}
