// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.productentity.sephoraproductentity;

import java.util.List;

public class Result
{

    private String productId;
    private Integer rating;
    private String reviewText;
    private String submissionTime;
    private String title;
    private String userNickname;
    private List videos;

    public Result()
    {
    }

    public String getProductId()
    {
        return productId;
    }

    public Integer getRating()
    {
        return rating;
    }

    public String getReviewText()
    {
        return reviewText;
    }

    public String getSubmissionTime()
    {
        return submissionTime;
    }

    public String getTitle()
    {
        return title;
    }

    public String getUserNickname()
    {
        return userNickname;
    }

    public List getVideos()
    {
        return videos;
    }

    public void setProductId(String s)
    {
        productId = s;
    }

    public void setRating(Integer integer)
    {
        rating = integer;
    }

    public void setSubmissionTime(String s)
    {
        submissionTime = s;
    }

    public void setTitle(String s)
    {
        title = s;
    }

    public void setUserNickname(String s)
    {
        userNickname = s;
    }

    public void setVideos(List list)
    {
        videos = list;
    }
}
