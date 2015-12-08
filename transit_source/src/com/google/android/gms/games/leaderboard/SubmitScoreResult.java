// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.leaderboard;

import com.google.android.gms.common.data.d;
import com.google.android.gms.internal.dl;
import com.google.android.gms.internal.dm;
import com.google.android.gms.internal.ev;
import java.util.HashMap;

public final class SubmitScoreResult
{
    public static final class Result
    {

        public final String formattedScore;
        public final boolean newBest;
        public final long rawScore;
        public final String scoreTag;

        public String toString()
        {
            return dl.d(this).a("RawScore", Long.valueOf(rawScore)).a("FormattedScore", formattedScore).a("ScoreTag", scoreTag).a("NewBest", Boolean.valueOf(newBest)).toString();
        }

        public Result(long l, String s, String s1, boolean flag)
        {
            rawScore = l;
            formattedScore = s;
            scoreTag = s1;
            newBest = flag;
        }
    }


    private static final String nI[] = {
        "leaderboardId", "playerId", "timeSpan", "hasResult", "rawScore", "formattedScore", "newBest", "scoreTag"
    };
    private int iC;
    private String mD;
    private String nJ;
    private HashMap nK;

    public SubmitScoreResult(int i, String s, String s1)
    {
        this(i, s, s1, new HashMap());
    }

    public SubmitScoreResult(int i, String s, String s1, HashMap hashmap)
    {
        iC = i;
        nJ = s;
        mD = s1;
        nK = hashmap;
    }

    public SubmitScoreResult(d d1)
    {
        iC = d1.getStatusCode();
        nK = new HashMap();
        int j = d1.getCount();
        boolean flag;
        if (j == 3)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        dm.m(flag);
        for (int i = 0; i < j; i++)
        {
            int k = d1.q(i);
            if (i == 0)
            {
                nJ = d1.c("leaderboardId", i, k);
                mD = d1.c("playerId", i, k);
            }
            if (d1.d("hasResult", i, k))
            {
                a(new Result(d1.a("rawScore", i, k), d1.c("formattedScore", i, k), d1.c("scoreTag", i, k), d1.d("newBest", i, k)), d1.b("timeSpan", i, k));
            }
        }

    }

    private void a(Result result, int i)
    {
        nK.put(Integer.valueOf(i), result);
    }

    public String getLeaderboardId()
    {
        return nJ;
    }

    public String getPlayerId()
    {
        return mD;
    }

    public Result getScoreResult(int i)
    {
        return (Result)nK.get(Integer.valueOf(i));
    }

    public int getStatusCode()
    {
        return iC;
    }

    public String toString()
    {
        com.google.android.gms.internal.dl.a a1 = dl.d(this).a("PlayerId", mD).a("StatusCode", Integer.valueOf(iC));
        int i = 0;
        while (i < 3) 
        {
            Object obj = (Result)nK.get(Integer.valueOf(i));
            a1.a("TimesSpan", ev.R(i));
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
