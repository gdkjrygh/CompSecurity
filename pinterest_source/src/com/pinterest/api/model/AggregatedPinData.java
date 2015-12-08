// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.model;

import com.pinterest.network.json.PinterestJsonObject;

public class AggregatedPinData
{

    private Integer likes;
    private Integer saves;
    private String uid;

    public AggregatedPinData()
    {
    }

    public AggregatedPinData(String s, Integer integer, Integer integer1)
    {
        uid = s;
        saves = integer;
        likes = integer1;
    }

    public static AggregatedPinData make(PinterestJsonObject pinterestjsonobject)
    {
        if (pinterestjsonobject == null)
        {
            pinterestjsonobject = null;
        } else
        {
            Object obj = pinterestjsonobject.c("data");
            if (obj != null)
            {
                pinterestjsonobject = ((PinterestJsonObject) (obj));
            }
            obj = pinterestjsonobject.c("aggregated_pin_data");
            if (obj != null)
            {
                pinterestjsonobject = ((PinterestJsonObject) (obj));
            }
            obj = (AggregatedPinData)pinterestjsonobject.a(com/pinterest/api/model/AggregatedPinData);
            PinterestJsonObject pinterestjsonobject1 = pinterestjsonobject.c("aggregated_stats");
            pinterestjsonobject = ((PinterestJsonObject) (obj));
            if (pinterestjsonobject1 != null)
            {
                ((AggregatedPinData) (obj)).setSaves(Integer.valueOf(pinterestjsonobject1.a("saves", 0)));
                ((AggregatedPinData) (obj)).setLikes(Integer.valueOf(pinterestjsonobject1.a("likes", 0)));
                return ((AggregatedPinData) (obj));
            }
        }
        return pinterestjsonobject;
    }

    public int getLikeCountDisplay()
    {
        if (getLikes() == null || getLikes().intValue() <= 0)
        {
            return 0;
        } else
        {
            return getLikes().intValue();
        }
    }

    public Integer getLikes()
    {
        return likes;
    }

    public int getSaveCountDisplay()
    {
        if (getSaves() == null || getSaves().intValue() <= 0)
        {
            return 1;
        } else
        {
            return getSaves().intValue();
        }
    }

    public Integer getSaves()
    {
        return saves;
    }

    public String getUid()
    {
        return uid;
    }

    public void setLikes(Integer integer)
    {
        likes = integer;
    }

    public void setSaves(Integer integer)
    {
        saves = integer;
    }

    public void setUid(String s)
    {
        uid = s;
    }
}
