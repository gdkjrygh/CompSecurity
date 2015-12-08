// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.leaderboard;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.common.internal.o;
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

        public String toString()
        {
            return n.h(this).a("RawScore", Long.valueOf(rawScore)).a("FormattedScore", formattedScore).a("ScoreTag", scoreTag).a("NewBest", Boolean.valueOf(newBest)).toString();
        }

        public Result(long l, String s, String s1, boolean flag)
        {
            rawScore = l;
            formattedScore = s;
            scoreTag = s1;
            newBest = flag;
        }
    }


    private static final String abs[] = {
        "leaderboardId", "playerId", "timeSpan", "hasResult", "rawScore", "formattedScore", "newBest", "scoreTag"
    };
    private int HF;
    private String VK;
    private HashMap abY;
    private String abu;

    public ScoreSubmissionData(DataHolder dataholder)
    {
        HF = dataholder.getStatusCode();
        abY = new HashMap();
        int j = dataholder.getCount();
        boolean flag;
        if (j == 3)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        o.K(flag);
        for (int i = 0; i < j; i++)
        {
            int k = dataholder.ar(i);
            if (i == 0)
            {
                abu = dataholder.c("leaderboardId", i, k);
                VK = dataholder.c("playerId", i, k);
            }
            if (dataholder.d("hasResult", i, k))
            {
                a(new Result(dataholder.a("rawScore", i, k), dataholder.c("formattedScore", i, k), dataholder.c("scoreTag", i, k), dataholder.d("newBest", i, k)), dataholder.b("timeSpan", i, k));
            }
        }

    }

    private void a(Result result, int i)
    {
        abY.put(Integer.valueOf(i), result);
    }

    public String getLeaderboardId()
    {
        return abu;
    }

    public String getPlayerId()
    {
        return VK;
    }

    public Result getScoreResult(int i)
    {
        return (Result)abY.get(Integer.valueOf(i));
    }

    public String toString()
    {
        com.google.android.gms.common.internal.n.a a1 = n.h(this).a("PlayerId", VK).a("StatusCode", Integer.valueOf(HF));
        int i = 0;
        while (i < 3) 
        {
            Object obj = (Result)abY.get(Integer.valueOf(i));
            a1.a("TimesSpan", TimeSpan.dH(i));
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
