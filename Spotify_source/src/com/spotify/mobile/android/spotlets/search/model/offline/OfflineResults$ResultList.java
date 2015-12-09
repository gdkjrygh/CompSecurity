// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.search.model.offline;

import com.spotify.mobile.android.cosmos.JacksonModel;
import ggi;
import java.util.List;

public class count
    implements JacksonModel
{

    private static final results EMPTY = new <init>(null, 0);
    public final int count;
    public final List results;

    public static count fromNullable(count count1)
    {
        count count2 = count1;
        if (count1 == null)
        {
            count2 = EMPTY;
        }
        return count2;
    }

    public boolean hasResults()
    {
        return !results.isEmpty();
    }


    public (List list, int i)
    {
        results = ggi.a(list);
        count = i;
    }
}
