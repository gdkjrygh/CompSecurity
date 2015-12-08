// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.leaderboard;

import android.content.ContentValues;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.games.internal.constants.TimeSpan;
import java.util.HashMap;

public final class ScoreSubmissionData
{
    public static final class Result
    {

        public final String formattedScore;
        public final boolean newBest;
        public final long rawScore;
        public final String scoreTag;

        public final String toString()
        {
            return Objects.toStringHelper(this).add("RawScore", Long.valueOf(rawScore)).add("FormattedScore", formattedScore).add("ScoreTag", scoreTag).add("NewBest", Boolean.valueOf(newBest)).toString();
        }

        public Result(long l, String s, String s1, boolean flag)
        {
            rawScore = l;
            formattedScore = s;
            scoreTag = s1;
            newBest = flag;
        }
    }


    private static final String COLUMNS[] = {
        "leaderboardId", "playerId", "timeSpan", "hasResult", "rawScore", "formattedScore", "newBest", "scoreTag"
    };
    private String mLeaderboardId;
    private String mPlayerId;
    private HashMap mResults;
    private int mStatusCode;

    public ScoreSubmissionData(int i, String s, String s1)
    {
        this(i, s, s1, new HashMap());
    }

    public ScoreSubmissionData(int i, String s, String s1, HashMap hashmap)
    {
        mStatusCode = i;
        mLeaderboardId = s;
        mPlayerId = s1;
        mResults = hashmap;
    }

    public final DataHolder toDataHolder()
    {
        com.google.android.gms.common.data.DataHolder.Builder builder = DataHolder.builder(COLUMNS);
        int i = 0;
        while (i < 3) 
        {
            Result result = (Result)mResults.get(Integer.valueOf(i));
            ContentValues contentvalues = new ContentValues();
            contentvalues.put("leaderboardId", mLeaderboardId);
            contentvalues.put("playerId", mPlayerId);
            contentvalues.put("timeSpan", Integer.valueOf(i));
            if (result != null)
            {
                contentvalues.put("rawScore", Long.valueOf(result.rawScore));
                contentvalues.put("formattedScore", result.formattedScore);
                contentvalues.put("scoreTag", result.scoreTag);
                contentvalues.put("newBest", Boolean.valueOf(result.newBest));
                contentvalues.put("hasResult", Boolean.valueOf(true));
            } else
            {
                contentvalues.put("hasResult", Boolean.valueOf(false));
            }
            builder.withRow(contentvalues);
            i++;
        }
        return builder.build(mStatusCode);
    }

    public final String toString()
    {
        com.google.android.gms.common.internal.Objects.ToStringHelper tostringhelper = Objects.toStringHelper(this).add("PlayerId", mPlayerId).add("StatusCode", Integer.valueOf(mStatusCode));
        int i = 0;
        while (i < 3) 
        {
            Object obj = (Result)mResults.get(Integer.valueOf(i));
            tostringhelper.add("TimesSpan", TimeSpan.fromInt(i));
            if (obj == null)
            {
                obj = "null";
            } else
            {
                obj = ((Result) (obj)).toString();
            }
            tostringhelper.add("Result", obj);
            i++;
        }
        return tostringhelper.toString();
    }

}
