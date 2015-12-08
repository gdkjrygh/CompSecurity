// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore.timeline;

import com.adobe.mediacore.metadata.Metadata;
import com.adobe.mediacore.timeline.advertising.PlacementInformation;

public final class PlacementOpportunity
{

    public final String _id;
    public final Metadata _metadata;
    public final PlacementInformation _placementInformation;

    public PlacementOpportunity(String s, PlacementInformation placementinformation, Metadata metadata)
    {
        _id = s;
        _placementInformation = placementinformation;
        _metadata = metadata;
    }

    public String getId()
    {
        return _id;
    }

    public Metadata getMetadata()
    {
        return _metadata;
    }

    public PlacementInformation getPlacementInformation()
    {
        return _placementInformation;
    }

    public String toString()
    {
        return (new StringBuilder()).append("PlacementOpportunity { id: ").append(getId()).append(", placementInformation: ").append(_placementInformation.toString()).append(" }").toString();
    }
}
