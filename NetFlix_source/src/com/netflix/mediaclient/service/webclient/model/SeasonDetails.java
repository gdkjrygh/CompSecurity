// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.webclient.model;

import android.content.Context;
import com.netflix.mediaclient.servicemgr.VideoType;

public class SeasonDetails
    implements com.netflix.mediaclient.servicemgr.SeasonDetails
{

    public com.netflix.mediaclient.service.webclient.model.branches.Season.Detail detail;

    public SeasonDetails()
    {
    }

    public int getCurrentEpisodeNumber()
    {
        if (detail == null)
        {
            return -1;
        } else
        {
            return detail.getCurrentEpisodeNumber();
        }
    }

    public String getId()
    {
        if (detail == null)
        {
            return null;
        } else
        {
            return detail.getId();
        }
    }

    public int getNumOfEpisodes()
    {
        if (detail == null)
        {
            return -1;
        } else
        {
            return detail.getEpisodeCount();
        }
    }

    public int getSeasonNumber()
    {
        if (detail == null)
        {
            return -1;
        } else
        {
            return detail.getNumber();
        }
    }

    public String getSeasonNumberTitle(Context context)
    {
        return String.format(context.getString(0x7f0c0139), new Object[] {
            Integer.valueOf(getSeasonNumber())
        });
    }

    public String getTitle()
    {
        if (detail == null)
        {
            return null;
        } else
        {
            return detail.getTitle();
        }
    }

    public VideoType getType()
    {
        return detail.getType();
    }

    public int getYear()
    {
        if (detail == null)
        {
            return 0;
        } else
        {
            return detail.getYear();
        }
    }
}
