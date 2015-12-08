// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore.timeline;

import com.adobe.mediacore.timeline.advertising.PlacementInformation;

public abstract class TimelineOperation
    implements Comparable
{

    protected PlacementInformation _placementInformation;

    protected TimelineOperation(PlacementInformation placementinformation)
    {
        if (placementinformation == null)
        {
            throw new IllegalArgumentException("The placement parameter must be not null. A valid operation must indicate which position on the timeline will be affected.");
        } else
        {
            _placementInformation = placementinformation;
            return;
        }
    }

    public int compareTo(TimelineOperation timelineoperation)
    {
        if (_placementInformation.getTime() < timelineoperation.getPlacement().getTime())
        {
            return -1;
        }
        return _placementInformation.getTime() != timelineoperation._placementInformation.getTime() ? 1 : 0;
    }

    public volatile int compareTo(Object obj)
    {
        return compareTo((TimelineOperation)obj);
    }

    public PlacementInformation getPlacement()
    {
        return _placementInformation;
    }

    public abstract boolean isValid();

    public void setPlacement(PlacementInformation placementinformation)
    {
        _placementInformation = placementinformation;
    }
}
