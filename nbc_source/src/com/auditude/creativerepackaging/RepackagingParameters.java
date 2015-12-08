// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.auditude.creativerepackaging;


public class RepackagingParameters
{

    private final String HLS_FORMAT = "m3u8";
    private final String HLS_MIMETYPE = "application/x-mpegURL";
    private String creativeURL;
    private String requiredFormat;
    private int videoHeight;
    private int videoWidth;

    public RepackagingParameters()
    {
    }

    public String getCreativeURL()
    {
        return creativeURL;
    }

    public String getRequiredFormat()
    {
        return requiredFormat;
    }

    public int getVideoHeight()
    {
        return videoHeight;
    }

    public int getVideoWidth()
    {
        return videoWidth;
    }

    public void setCreativeURL(String s)
    {
        creativeURL = s;
    }

    public void setRequiredFormat(String s)
    {
        if (s.equalsIgnoreCase("application/x-mpegURL"))
        {
            requiredFormat = "m3u8";
            return;
        } else
        {
            requiredFormat = null;
            return;
        }
    }

    public void setVideoHeight(int i)
    {
        videoHeight = i;
    }

    public void setVideoWidth(int i)
    {
        videoWidth = i;
    }
}
