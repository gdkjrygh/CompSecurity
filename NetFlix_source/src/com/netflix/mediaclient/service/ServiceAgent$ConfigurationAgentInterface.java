// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service;

import com.netflix.mediaclient.media.PlayerType;
import com.netflix.mediaclient.media.bitrate.VideoBitrateRange;
import com.netflix.mediaclient.net.IpConnectivityPolicy;
import com.netflix.mediaclient.service.configuration.ConfigurationAgentWebCallback;
import com.netflix.mediaclient.service.configuration.KidsOnPhoneConfiguration;
import com.netflix.mediaclient.service.configuration.SubtitleConfiguration;
import com.netflix.mediaclient.service.configuration.drm.DrmManager;
import com.netflix.mediaclient.service.configuration.esn.EsnProvider;
import com.netflix.mediaclient.service.webclient.ApiEndpointRegistry;
import com.netflix.mediaclient.service.webclient.model.leafs.ConsolidatedLoggingSessionSpecification;
import com.netflix.mediaclient.util.DeviceCategory;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package com.netflix.mediaclient.service:
//            ServiceAgent

public static interface SessionSpecification
{

    public abstract void clearAccountConfigData();

    public abstract void esnMigrationComplete();

    public abstract void fetchAccountConfigData(ConfigurationAgentWebCallback configurationagentwebcallback);

    public abstract ApiEndpointRegistry getApiEndpointRegistry();

    public abstract int getApmUserSessionDurationInSeconds();

    public abstract int getAppVersionCode();

    public abstract int getBitrateCap();

    public abstract JSONArray getCastWhiteList();

    public abstract ConsolidatedLoggingSessionSpecification getConsolidatedLoggingSessionSpecification(String s);

    public abstract PlayerType getCurrentPlayerType();

    public abstract int getDataRequestTimeout();

    public abstract DeviceCategory getDeviceCategory();

    public abstract int getDiskCacheSizeBytes();

    public abstract DrmManager getDrmManager();

    public abstract EsnProvider getEsnProvider();

    public abstract long getImageCacheMinimumTtl();

    public abstract int getImageCacheSizeBytes();

    public abstract IpConnectivityPolicy getIpConnectivityPolicy();

    public abstract JSONObject getJPlayerConfig();

    public abstract KidsOnPhoneConfiguration getKidsOnPhoneConfiguration();

    public abstract JSONArray getMdxBlackListTargets();

    public abstract int getPresentationTrackingAggregationSize();

    public abstract int getResFetcherThreadPoolSize();

    public abstract int getResourceRequestTimeout();

    public abstract String getSoftwareVersion();

    public abstract String getStreamingQoe();

    public abstract SubtitleConfiguration getSubtitleConfiguration();

    public abstract VideoBitrateRange[] getVideoBitrateRange();

    public abstract int getVideoBufferSize();

    public abstract boolean isCurrentDrmWidevine();

    public abstract boolean isDeviceLowMem();

    public abstract boolean isDisableMdx();

    public abstract boolean isDisableWebsocket();

    public abstract boolean isDisableWidevine();

    public abstract boolean isEnableCast();

    public abstract boolean isEsnMigrationRequired();

    public abstract boolean isLogoutRequired();

    public abstract void userAgentLogoutComplete();
}
