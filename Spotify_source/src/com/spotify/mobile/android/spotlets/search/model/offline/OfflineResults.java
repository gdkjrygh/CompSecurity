// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.search.model.offline;

import com.spotify.mobile.android.cosmos.JacksonModel;
import ctz;

public class OfflineResults
    implements JacksonModel
{

    public final String searchTerm;
    public final ResultList tracks;

    OfflineResults(String s, ResultList resultlist)
    {
        searchTerm = (String)ctz.a(s);
        tracks = ResultList.fromNullable(resultlist);
    }

    private class ResultList
        implements JacksonModel
    {

        private static final ResultList EMPTY = new ResultList(null, 0);
        public final int count;
        public final List results;

        public static ResultList fromNullable(ResultList resultlist)
        {
            ResultList resultlist1 = resultlist;
            if (resultlist == null)
            {
                resultlist1 = EMPTY;
            }
            return resultlist1;
        }

        public boolean hasResults()
        {
            return !results.isEmpty();
        }


        public ResultList(List list, int i)
        {
            results = ggi.a(list);
            count = i;
        }
    }

}
