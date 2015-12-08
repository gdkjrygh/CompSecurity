// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore.timeline;

import com.adobe.mediacore.MediaResource;

public abstract class TimelineItem
{

    protected final long _duration;
    private final MediaResource _resource;

    protected TimelineItem(MediaResource mediaresource, long l)
    {
        if (mediaresource == null)
        {
            throw new IllegalArgumentException("Resource parameter of TimelineItem constructor must be not nul");
        }
        if (l <= 0L)
        {
            throw new IllegalArgumentException("Duration parameter of TimelineItem constructor must be greater than 0.");
        } else
        {
            _resource = mediaresource;
            _duration = l;
            return;
        }
    }

    public boolean equals(TimelineItem timelineitem)
    {
        return timelineitem != null && _resource.equals(timelineitem.getMediaResource());
    }

    public final long getDuration()
    {
        return _duration;
    }

    public final MediaResource getMediaResource()
    {
        return _resource;
    }
}
