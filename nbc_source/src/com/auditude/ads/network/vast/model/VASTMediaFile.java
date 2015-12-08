// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.auditude.ads.network.vast.model;

import com.auditude.ads.util.ObjectUtil;
import com.auditude.ads.util.StringUtil;

public class VASTMediaFile
{

    public static final String DELIVERY_PROGRESSIVE = "progressive";
    public static final String DELIVERY_STREAMING = "streaming";
    public String apiFramework;
    public int bitrate;
    public String delivery;
    public int height;
    public String id;
    public boolean maintainAspectRatio;
    public boolean scalable;
    public String type;
    public String url;
    public int width;

    public VASTMediaFile()
    {
        bitrate = 0;
    }

    public static int parseDuration(String s)
    {
        if (StringUtil.isNullOrEmpty(s))
        {
            return 0;
        }
        String as[] = s.split(":");
        if (as.length <= 1)
        {
            return ObjectUtil.convertToInt(s, 0);
        } else
        {
            int i = ObjectUtil.convertToInt(as[0], 0);
            int j = ObjectUtil.convertToInt(as[1], 0);
            return ObjectUtil.convertToInt(as[2], 0) + (i * 3600 + j * 60);
        }
    }
}
