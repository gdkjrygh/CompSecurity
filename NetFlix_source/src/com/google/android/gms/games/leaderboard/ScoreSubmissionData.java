// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.leaderboard;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.internal.constants.TimeSpan;
import com.google.android.gms.internal.fo;
import com.google.android.gms.internal.fq;
import java.util.HashMap;

public final class ScoreSubmissionData
{
    public static final class Result
    {

        public final String formattedScore;
        public final boolean newBest;
        public final long rawScore;
        public final String scoreTag;

        public String toString()
        {
            return fo.e(this).a("RawScore", Long.valueOf(rawScore)).a("FormattedScore", formattedScore).a("ScoreTag", scoreTag).a("NewBest", Boolean.valueOf(newBest)).toString();
        }

        public Result(long l, String s, String s1, boolean flag)
        {
            rawScore = l;
            formattedScore = s;
            scoreTag = s1;
            newBest = flag;
        }
    }


    private static final String LN[] = {
        "leaderboardId", "playerId", "timeSpan", "hasResult", "rawScore", "formattedScore", "newBest", "scoreTag"
    };
    private int Ah;
    private String Ie;
    private String LP;
    private HashMap Mt;

    public ScoreSubmissionData(DataHolder dataholder)
    {
        Ah = dataholder.getStatusCode();
        Mt = new HashMap();
        int j = dataholder.getCount();
        boolean flag;
        if (j == 3)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        fq.z(flag);
        for (int i = 0; i < j; i++)
        {
            int k = dataholder.G(i);
            if (i == 0)
            {
                LP = dataholder.getString("leaderboardId", i, k);
                Ie = dataholder.getString("playerId", i, k);
            }
            if (dataholder.getBoolean("hasResult", i, k))
            {
                a(new Result(dataholder.getLong("rawScore", i, k), dataholder.getString("formattedScore", i, k), dataholder.getString("scoreTag", i, k), dataholder.getBoolean("newBest", i, k)), dataholder.getInteger("timeSpan", i, k));
            }
        }

    }

    private void a(Result result, int i)
    {
        Mt.put(Integer.valueOf(i), result);
    }

    public String getLeaderboardId()
    {
        return LP;
    }

    public String getPlayerId()
    {
        return Ie;
    }

    public Result getScoreResult(int i)
    {
        return (Result)Mt.get(Integer.valueOf(i));
    }

    public String toString()
    {
        com.google.android.gms.internal.fo.a a1 = fo.e(this).a("PlayerId", Ie).a("StatusCode", Integer.valueOf(Ah));
        int i = 0;
        while (i < 3) 
        {
            Object obj = (Result)Mt.get(Integer.valueOf(i));
            a1.a("TimesSpan", TimeSpan.bd(i));
            if (obj == null)
            {
                obj = "null";
            } else
            {
                obj = ((Result) (obj)).toString();
            }
            a1.a("Result", obj);
            i++;
        }
        return a1.toString();
    }

}
