// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ads;

import com.adobe.mediacore.metadata.AdSignalingMode;
import com.adobe.mediacore.metadata.AdvertisingMetadata;
import com.adobe.mediacore.metadata.AuditudeSettings;
import com.adobe.mediacore.metadata.Metadata;
import com.adobe.mediacore.metadata.MetadataNode;
import com.nbcsports.liveextra.library.api.models.Asset;
import com.nbcsports.liveextra.library.player.AuditudeConfiguration;
import com.nbcsports.liveextra.ui.main.core.AssetViewModel;

public class NbcAuditudeConfiguration
    implements AuditudeConfiguration
{

    private static final String AD_DOMAIN = "auditude.com";
    private static final String AD_MEDIA_ID = "nbcsports_default_vod";
    private static final String AD_ZONEID = "114100";
    private String platform;
    private AuditudeSettings result;

    public NbcAuditudeConfiguration()
    {
    }

    public AdvertisingMetadata create(AssetViewModel assetviewmodel, String s, String s1)
    {
        platform = s1;
        result = new AuditudeSettings();
        int i = assetviewmodel.asset().getStatus();
        String s2;
        MetadataNode metadatanode;
        if (i == 0)
        {
            s2 = "vod";
            result.setSignalingMode(AdSignalingMode.SERVER_MAP);
        } else
        if (5 == i)
        {
            s2 = "fer";
            result.setSignalingMode(AdSignalingMode.MANIFEST_CUES);
        } else
        {
            s2 = "preroll";
            result.setSignalingMode(AdSignalingMode.MANIFEST_CUES);
        }
        result.setZoneId("114100");
        result.setDomain("auditude.com");
        result.setMediaId("nbcsports_default_vod");
        metadatanode = new MetadataNode();
        metadatanode.setValue("PROFILE_ID", "nbcu_olympics_mobile_live");
        metadatanode.setValue("NW_ID", "169843");
        metadatanode.setValue("AF_ID", "52390769");
        metadatanode.setValue("ASSET_ID", assetviewmodel.getId());
        metadatanode.setValue("SF_ID", (new StringBuilder()).append("nbcsports_liveapp_").append(s1).toString());
        metadatanode.setValue("SITE_SECTION_ID", (new StringBuilder()).append("nbcsports_liveapp_").append(s1).toString());
        metadatanode.setValue("POS_ID", "0");
        metadatanode.setValue("MVPD", s);
        metadatanode.setValue("TIME_POSITION", "0.000000");
        metadatanode.setValue("AD_OPPORTUNITY_ID", s2);
        result.setCustomParameters(metadatanode);
        assetviewmodel = new MetadataNode();
        assetviewmodel.setValue("AD_OPPORTUNITY_ID", s2);
        assetviewmodel.setValue("device", s1);
        result.setTargetingParameters(assetviewmodel);
        return result;
    }

    public void setupMidrolls(AssetViewModel assetviewmodel)
    {
        if (result != null)
        {
            assetviewmodel = new MetadataNode();
            String s = result.getTargetingParameters().getValue("AD_OPPORTUNITY_ID");
            if (s == null || !s.equals("midroll"))
            {
                assetviewmodel.setValue("AD_OPPORTUNITY_ID", "midroll");
                assetviewmodel.setValue("device", platform);
                result.setTargetingParameters(assetviewmodel);
                return;
            }
        }
    }

    public void updateAssetId(AssetViewModel assetviewmodel)
    {
        if (result != null)
        {
            Metadata metadata = result.getCustomParameters();
            String s = metadata.getValue("ASSET_ID");
            if (s == null || !s.equals(assetviewmodel.getId()))
            {
                metadata.setValue("ASSET_ID", assetviewmodel.getId());
                return;
            }
        }
    }
}
