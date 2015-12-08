// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.addlive.service;

import org.json.JSONObject;

public class VideoStreamDescriptor
{

    private int maxBitRate;
    private int maxFps;
    private int maxHeight;
    private int maxWidth;
    private boolean publish;
    private boolean receive;
    private boolean useAdaptation;

    public VideoStreamDescriptor()
    {
        maxWidth = 640;
        maxHeight = 480;
        maxBitRate = 1024;
        maxFps = 15;
        publish = true;
        receive = true;
        useAdaptation = true;
    }

    public int getMaxFps()
    {
        return maxFps;
    }

    public int getMaxHeight()
    {
        return maxHeight;
    }

    public int getMaxWidth()
    {
        return maxWidth;
    }

    public boolean isUseAdaptation()
    {
        return useAdaptation;
    }

    public void setMaxFps(int i)
    {
        maxFps = i;
    }

    public void setMaxHeight(int i)
    {
        maxHeight = i;
    }

    public void setMaxWidth(int i)
    {
        maxWidth = i;
    }

    public void setUseAdaptation(boolean flag)
    {
        useAdaptation = flag;
    }

    public JSONObject toJSON()
    {
        JSONObject jsonobject = new JSONObject();
        jsonobject.put("maxWidth", maxWidth);
        jsonobject.put("maxHeight", maxHeight);
        jsonobject.put("maxFps", maxFps);
        jsonobject.put("useAdaptation", useAdaptation);
        return jsonobject;
    }

    public String toString()
    {
        return (new StringBuilder("VideoStreamDescriptor{maxWidth=")).append(maxWidth).append(", maxHeight=").append(maxHeight).append(", maxFps=").append(maxFps).append(", useAdaptation=").append(useAdaptation).append("}").toString();
    }
}
