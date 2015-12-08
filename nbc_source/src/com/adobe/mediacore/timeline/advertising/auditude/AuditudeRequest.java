// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore.timeline.advertising.auditude;

import com.adobe.mediacore.metadata.AuditudeSettings;
import com.adobe.mediacore.metadata.Metadata;
import com.adobe.mediacore.timeline.PlacementOpportunity;
import com.adobe.mediacore.timeline.advertising.PlacementInformation;
import java.util.ArrayList;
import java.util.List;

public class AuditudeRequest
{

    private AuditudeSettings _auditudeSettings;
    private Metadata _availCustomParams;
    private List _placementInformations;
    private List _placementOpportunities;

    public AuditudeRequest(AuditudeSettings auditudesettings, PlacementOpportunity placementopportunity, Metadata metadata)
    {
        _placementOpportunities = new ArrayList();
        _placementInformations = new ArrayList();
        _auditudeSettings = auditudesettings;
        _availCustomParams = metadata;
        addOpportunity(placementopportunity);
    }

    private void addOpportunity(PlacementOpportunity placementopportunity)
    {
        _placementOpportunities.add(placementopportunity);
        if (placementopportunity.getPlacementInformation().getMode() == com.adobe.mediacore.timeline.advertising.PlacementInformation.Mode.INSERT)
        {
            _placementInformations.add(placementopportunity.getPlacementInformation());
        }
    }

    public void addPlacement(PlacementInformation placementinformation)
    {
        _placementInformations.add(placementinformation);
    }

    public AuditudeSettings getAuditudeSettings()
    {
        return _auditudeSettings;
    }

    public Metadata getAvailCustomParams()
    {
        return _availCustomParams;
    }

    public List getPlacementInformations()
    {
        return _placementInformations;
    }

    public List getPlacementOpportunities()
    {
        return _placementOpportunities;
    }
}
