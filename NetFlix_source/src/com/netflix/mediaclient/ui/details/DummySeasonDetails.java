// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.details;

import android.content.Context;
import com.netflix.mediaclient.servicemgr.SeasonDetails;
import com.netflix.mediaclient.servicemgr.VideoType;
import java.util.ArrayList;
import java.util.List;

public class DummySeasonDetails
    implements SeasonDetails
{

    private final String id;
    private final int seasonNumber;

    public DummySeasonDetails(String s, int i)
    {
        id = s;
        seasonNumber = i;
    }

    public static List createDummyArray()
    {
        ArrayList arraylist = new ArrayList();
        for (int i = 0; i < 100; i++)
        {
            arraylist.add(new DummySeasonDetails(String.valueOf(i), i));
        }

        return arraylist;
    }

    public int getCurrentEpisodeNumber()
    {
        return 0;
    }

    public String getId()
    {
        return id;
    }

    public int getNumOfEpisodes()
    {
        return 0;
    }

    public int getSeasonNumber()
    {
        return 0;
    }

    public String getSeasonNumberTitle(Context context)
    {
        return context.getString(0x7f0c0139, new Object[] {
            Integer.valueOf(seasonNumber)
        });
    }

    public String getTitle()
    {
        return null;
    }

    public VideoType getType()
    {
        return VideoType.UNKNOWN;
    }

    public int getYear()
    {
        return 0;
    }
}
