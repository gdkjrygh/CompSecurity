// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.addlive.service.listener;

import org.json.JSONObject;

public class MediaStats
{

    private long audioDelay;
    private long avOffset;
    private long avgJitter;
    private long bitRate;
    private long cpu;
    private int direction;
    private long fps;
    private int height;
    private int layer;
    private long loss;
    private long maxJitter;
    private int processingTime;
    private long psnr;
    private int quality;
    private long queueDelay;
    private long rtt;
    private long ssrc;
    private long timestamp;
    private long totalCpu;
    private int totalLoss;
    private int totalVideoKbps;
    private int width;

    public MediaStats(JSONObject jsonobject)
    {
        direction = jsonobject.getInt("direction");
        bitRate = jsonobject.getLong("netBps");
        rtt = jsonobject.getLong("rtt");
        totalLoss = jsonobject.getInt("cumulativePacketLoss");
        loss = jsonobject.getInt("fractionLoss");
        timestamp = jsonobject.getInt("timestamp");
        ssrc = jsonobject.getInt("ssrc");
        avgJitter = jsonobject.getInt("interarrivalJitter");
        if (!jsonobject.has("layer")) goto _L2; else goto _L1
_L1:
        layer = jsonobject.getInt("layer");
        fps = jsonobject.getInt("fps");
        processingTime = jsonobject.getInt("processingTime");
        width = jsonobject.getInt("width");
        height = jsonobject.getInt("height");
        if (direction != 0) goto _L4; else goto _L3
_L3:
        totalVideoKbps = jsonobject.getInt("totalKbps");
        cpu = jsonobject.getInt("cpu");
        totalCpu = jsonobject.getInt("totalCpu");
        psnr = jsonobject.getInt("psnr");
        queueDelay = jsonobject.getInt("queueDelay");
        quality = jsonobject.getInt("quality");
_L6:
        return;
_L4:
        avOffset = jsonobject.getInt("avOffset");
        return;
_L2:
        if (direction == 1)
        {
            maxJitter = jsonobject.getInt("maxJitter");
            audioDelay = jsonobject.getInt("audioDelay");
            return;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public long getAudioDelay()
    {
        return audioDelay;
    }

    public long getAvOffset()
    {
        return avOffset;
    }

    public long getAvgJitter()
    {
        return avgJitter;
    }

    public long getBitRate()
    {
        return bitRate;
    }

    public long getCpu()
    {
        return cpu;
    }

    public int getDirection()
    {
        return direction;
    }

    public long getFps()
    {
        return fps;
    }

    public int getHeight()
    {
        return height;
    }

    public int getLayer()
    {
        return layer;
    }

    public long getLoss()
    {
        return loss;
    }

    public long getMaxJitter()
    {
        return maxJitter;
    }

    public int getProcessingTime()
    {
        return processingTime;
    }

    public long getPsnr()
    {
        return psnr;
    }

    public int getQuality()
    {
        return quality;
    }

    public long getQueueDelay()
    {
        return queueDelay;
    }

    public long getRtt()
    {
        return rtt;
    }

    public long getSsrc()
    {
        return ssrc;
    }

    public long getTimestamp()
    {
        return timestamp;
    }

    public long getTotalCpu()
    {
        return totalCpu;
    }

    public int getTotalLoss()
    {
        return totalLoss;
    }

    public int getTotalVideoKbps()
    {
        return totalVideoKbps;
    }

    public int getWidth()
    {
        return width;
    }
}
