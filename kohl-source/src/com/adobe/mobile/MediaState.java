// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mobile;

import java.util.Date;

// Referenced classes of package com.adobe.mobile:
//            StaticMethods

public final class MediaState
{

    public boolean ad;
    public boolean clicked;
    public boolean complete;
    public boolean eventFirstTime;
    protected int eventType;
    public double length;
    public String mediaEvent;
    public int milestone;
    public String name;
    public double offset;
    public int offsetMilestone;
    public Date openTime;
    public double percent;
    public String playerName;
    public String segment;
    public double segmentLength;
    public int segmentNum;
    public double timePlayed;
    private double timePlayedSinceTrack;
    private long timestamp;

    protected MediaState(MediaState mediastate)
    {
        openTime = new Date();
        complete = false;
        clicked = false;
        name = mediastate.name;
        length = mediastate.length;
        playerName = mediastate.playerName;
        mediaEvent = mediastate.mediaEvent;
        eventFirstTime = mediastate.eventFirstTime;
        openTime = mediastate.openTime;
        offset = mediastate.offset;
        percent = mediastate.percent;
        timePlayed = mediastate.timePlayed;
        milestone = mediastate.milestone;
        offsetMilestone = mediastate.offsetMilestone;
        segmentNum = mediastate.segmentNum;
        segment = mediastate.segment;
        segmentLength = mediastate.segmentLength;
        complete = mediastate.complete;
        eventType = mediastate.eventType;
        timestamp = mediastate.timestamp;
        timePlayedSinceTrack = mediastate.timePlayedSinceTrack;
        clicked = mediastate.clicked;
        ad = mediastate.ad;
    }

    protected MediaState(String s, double d, String s1, long l)
    {
        openTime = new Date();
        complete = false;
        clicked = false;
        name = s;
        length = d;
        playerName = s1;
        timestamp = StaticMethods.getTimeSince1970();
        segment = "";
        segmentNum = 0;
        segmentLength = 0.0D;
        openTime.setTime(l);
    }

    private void checkComplete()
    {
        if (length == -1D)
        {
            complete = false;
        } else
        if (percent >= 100D)
        {
            complete = true;
            return;
        }
    }

    private void generatePercent()
    {
        double d = 100D;
        if (length != -1D)
        {
            percent = (offset / length) * 100D;
            if (percent < 100D)
            {
                d = percent;
            }
            percent = d;
        }
    }

    protected int getEventType()
    {
        return eventType;
    }

    protected double getTimePlayed()
    {
        return timePlayed;
    }

    protected double getTimePlayedSinceTrack()
    {
        return timePlayedSinceTrack;
    }

    protected double getTimestamp()
    {
        return (double)timestamp;
    }

    protected void setEventType(int i)
    {
        eventType = i;
        eventType;
        JVM INSTR tableswitch 1 6: default 48
    //                   1 57
    //                   2 63
    //                   3 69
    //                   4 75
    //                   5 81
    //                   6 87;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L1:
        String s = "CLOSE";
_L9:
        mediaEvent = s;
        return;
_L2:
        s = "PLAY";
        continue; /* Loop/switch isn't completed */
_L3:
        s = "STOP";
        continue; /* Loop/switch isn't completed */
_L4:
        s = "MONITOR";
        continue; /* Loop/switch isn't completed */
_L5:
        s = "TRACK";
        continue; /* Loop/switch isn't completed */
_L6:
        s = "COMPLETE";
        continue; /* Loop/switch isn't completed */
_L7:
        s = "CLICK";
        if (true) goto _L9; else goto _L8
_L8:
    }

    protected void setOffset(double d)
    {
        offset = d;
        if (length > 0.0D)
        {
            if (d >= length)
            {
                d = length;
            }
            offset = d;
        }
        if (offset < 0.0D)
        {
            offset = 0.0D;
        }
        generatePercent();
        checkComplete();
    }

    protected void setTimePlayed(double d)
    {
        timePlayed = d;
    }

    protected void setTimePlayedSinceTrack(double d)
    {
        timePlayedSinceTrack = d;
    }
}
