// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.video.analytics;


public class VideoDataSourceInfo
{

    private VideoAnalytics.StreamSourceType a;

    public VideoDataSourceInfo()
    {
        a = VideoAnalytics.StreamSourceType.FROM_STREAM;
    }

    public final VideoAnalytics.StreamSourceType a()
    {
        return a;
    }

    public final void a(VideoAnalytics.StreamSourceType streamsourcetype)
    {
        a = streamsourcetype;
    }
}
