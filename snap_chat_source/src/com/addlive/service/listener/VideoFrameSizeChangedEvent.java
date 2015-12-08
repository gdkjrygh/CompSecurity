// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.addlive.service.listener;

import org.json.JSONObject;

public class VideoFrameSizeChangedEvent
{

    private int height;
    private String sinkId;
    private int width;

    public VideoFrameSizeChangedEvent(JSONObject jsonobject)
    {
        sinkId = jsonobject.getString("sinkId");
        height = jsonobject.getInt("height");
        width = jsonobject.getInt("width");
    }

    public int getHeight()
    {
        return height;
    }

    public String getSinkId()
    {
        return sinkId;
    }

    public int getWidth()
    {
        return width;
    }

    public String toString()
    {
        return (new StringBuilder("VideoFrameSizeChangedEvent{sinkId=")).append(sinkId).append(", width=").append(width).append(", height=").append(height).append("}").toString();
    }
}
