// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.video.model;

import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.Map;

public class VideoPlayerEvent
    implements JacksonModel
{

    public Map data;
    public long localEndTime;
    public long localStartTime;
    public String type;

    public VideoPlayerEvent()
    {
    }
}
