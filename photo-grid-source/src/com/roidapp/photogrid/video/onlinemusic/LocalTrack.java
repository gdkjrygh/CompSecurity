// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.video.onlinemusic;


// Referenced classes of package com.roidapp.photogrid.video.onlinemusic:
//            Track

public class LocalTrack
{

    public String filePath;
    public Track track;

    public LocalTrack(Track track1, String s)
    {
        track = track1;
        filePath = s;
    }

    public Track getTrack()
    {
        return track;
    }

    public String getTrackPath()
    {
        return filePath;
    }
}
