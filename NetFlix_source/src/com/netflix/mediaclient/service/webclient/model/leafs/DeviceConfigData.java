// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.webclient.model.leafs;

import java.util.ArrayList;
import java.util.List;

public class DeviceConfigData
{

    private String bitrate_cap;
    private List consolidated_logging_specification;
    private String current_version;
    private String device_category;
    private String disable_mdx;
    private String disable_websocket;
    private String disable_widevine;
    private String image_pref;
    private int ip_connectivity_policy;
    private String min_version;
    private String pt_aggregation_size;
    private String signup_enabled;
    private String signup_timeout;
    private String subtitle_configuration;
    private String type;
    private int user_session_timeout_duration;

    public DeviceConfigData()
    {
        consolidated_logging_specification = new ArrayList();
        ip_connectivity_policy = -1;
        user_session_timeout_duration = -1;
    }

    public String getAppMinVresion()
    {
        return min_version;
    }

    public String getAppRecommendedVresion()
    {
        return current_version;
    }

    public String getBitrateCap()
    {
        return bitrate_cap;
    }

    public List getConsolidatedloggingSpecification()
    {
        return consolidated_logging_specification;
    }

    public String getDeviceCategory()
    {
        return device_category;
    }

    public String getImagePref()
    {
        return image_pref;
    }

    public int getIpConnectivityPolicy()
    {
        return ip_connectivity_policy;
    }

    public String getMdxDisabled()
    {
        return disable_mdx;
    }

    public String getPTAggregationSize()
    {
        return pt_aggregation_size;
    }

    public String getPlayerType()
    {
        return type;
    }

    public String getSignUpEnabled()
    {
        return signup_enabled;
    }

    public String getSignUpTimeout()
    {
        return signup_timeout;
    }

    public String getSubtitleConfiguration()
    {
        return subtitle_configuration;
    }

    public int getUserSessionTimeoutDuration()
    {
        return user_session_timeout_duration;
    }

    public String getWebsocketDisabled()
    {
        return disable_websocket;
    }

    public String getWidevineDisabled()
    {
        return disable_widevine;
    }
}
