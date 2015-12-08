// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service;

import android.content.Context;
import android.os.Handler;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.NetflixApplication;
import com.netflix.mediaclient.android.app.BackgroundTask;
import com.netflix.mediaclient.media.PlayerType;
import com.netflix.mediaclient.media.bitrate.VideoBitrateRange;
import com.netflix.mediaclient.net.IpConnectivityPolicy;
import com.netflix.mediaclient.service.browse.BrowseAgentCallback;
import com.netflix.mediaclient.service.configuration.ConfigurationAgentWebCallback;
import com.netflix.mediaclient.service.configuration.KidsOnPhoneConfiguration;
import com.netflix.mediaclient.service.configuration.SubtitleConfiguration;
import com.netflix.mediaclient.service.configuration.drm.DrmManager;
import com.netflix.mediaclient.service.configuration.esn.EsnProvider;
import com.netflix.mediaclient.service.player.subtitles.TextStyle;
import com.netflix.mediaclient.service.resfetcher.ResourceFetcher;
import com.netflix.mediaclient.service.user.UserAgentWebCallback;
import com.netflix.mediaclient.service.webclient.ApiEndpointRegistry;
import com.netflix.mediaclient.service.webclient.UserCredentialRegistry;
import com.netflix.mediaclient.service.webclient.model.leafs.ConsolidatedLoggingSessionSpecification;
import com.netflix.mediaclient.servicemgr.UserProfile;
import com.netflix.mediaclient.util.DeviceCategory;
import com.netflix.mediaclient.util.ThreadUtils;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package com.netflix.mediaclient.service:
//            NrdController, NetflixService

public abstract class ServiceAgent
{
    public static interface AgentContext
    {

        public abstract NetflixApplication getApplication();

        public abstract BrowseAgentInterface getBrowseAgent();

        public abstract ConfigurationAgentInterface getConfigurationAgent();

        public abstract NrdController getNrdController();

        public abstract ResourceFetcher getResourceFetcher();

        public abstract NetflixService getService();

        public abstract UserAgentInterface getUserAgent();
    }

    public static interface BrowseAgentInterface
    {

        public abstract void fetchEpisodeDetails(String s, BrowseAgentCallback browseagentcallback);

        public abstract void fetchMovieDetails(String s, BrowseAgentCallback browseagentcallback);

        public abstract void fetchSeasonDetails(String s, BrowseAgentCallback browseagentcallback);

        public abstract void fetchShowDetails(String s, String s1, BrowseAgentCallback browseagentcallback);
    }

    public static interface ConfigurationAgentInterface
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

    public static interface InitCallback
    {

        public abstract void onInitComplete(ServiceAgent serviceagent, int i);
    }

    public static interface UserAgentInterface
    {

        public abstract void doDummyWebCall(UserAgentWebCallback useragentwebcallback);

        public abstract UserProfile getCurrentProfile();

        public abstract String getCurrentProfileId();

        public abstract String getGeoCountry();

        public abstract String getLanguagesInCsv();

        public abstract String getReqCountry();

        public abstract TextStyle getSubtitleDefaults();

        public abstract UserCredentialRegistry getUserCredentialRegistry();

        public abstract TextStyle getUserSubtitlePreferences();

        public abstract boolean isCurrentProfileIQEnabled();

        public abstract boolean isProfileSwitchingDisabled();

        public abstract boolean isUserLoggedIn();

        public abstract void logoutUser();

        public abstract void refreshProfileSwitchingStatus();
    }


    private static final String TAG = "nf_service_ServiceAgent";
    private AgentContext agentContext;
    private InitCallback initCallback;
    private boolean initCalled;
    private int initErrorCode;
    private Handler mainHandler;

    public ServiceAgent()
    {
        initErrorCode = -1;
    }

    public void destroy()
    {
        Log.d("nf_service_ServiceAgent", (new StringBuilder()).append("Destroying ").append(getClass().getSimpleName()).toString());
        agentContext = null;
    }

    protected abstract void doInit();

    public NetflixApplication getApplication()
    {
        AgentContext agentcontext = agentContext;
        if (agentcontext != null)
        {
            return agentcontext.getApplication();
        } else
        {
            return null;
        }
    }

    protected BrowseAgentInterface getBrowseAgent()
    {
        AgentContext agentcontext = agentContext;
        if (agentcontext != null)
        {
            return agentcontext.getBrowseAgent();
        } else
        {
            return null;
        }
    }

    public ConfigurationAgentInterface getConfigurationAgent()
    {
        AgentContext agentcontext = agentContext;
        if (agentcontext != null)
        {
            return agentcontext.getConfigurationAgent();
        } else
        {
            return null;
        }
    }

    protected Context getContext()
    {
        AgentContext agentcontext = agentContext;
        if (agentcontext != null)
        {
            return agentcontext.getService();
        } else
        {
            return null;
        }
    }

    protected Handler getMainHandler()
    {
        return mainHandler;
    }

    public NrdController getNrdController()
    {
        AgentContext agentcontext = agentContext;
        if (agentcontext != null)
        {
            return agentcontext.getNrdController();
        } else
        {
            return null;
        }
    }

    public ResourceFetcher getResourceFetcher()
    {
        AgentContext agentcontext = agentContext;
        if (agentcontext != null)
        {
            return agentcontext.getResourceFetcher();
        } else
        {
            return null;
        }
    }

    protected NetflixService getService()
    {
        AgentContext agentcontext = agentContext;
        if (agentcontext != null)
        {
            return agentcontext.getService();
        } else
        {
            return null;
        }
    }

    protected UserAgentInterface getUserAgent()
    {
        AgentContext agentcontext = agentContext;
        if (agentcontext != null)
        {
            return agentcontext.getUserAgent();
        } else
        {
            return null;
        }
    }

    public final void init(AgentContext agentcontext, InitCallback initcallback)
    {
        this;
        JVM INSTR monitorenter ;
        ThreadUtils.assertOnMain();
        Log.d("nf_service_ServiceAgent", (new StringBuilder()).append("Request to init ").append(getClass().getSimpleName()).toString());
        if (initCalled)
        {
            throw new IllegalStateException("ServiceAgent init already called");
        }
        break MISSING_BLOCK_LABEL_58;
        agentcontext;
        this;
        JVM INSTR monitorexit ;
        throw agentcontext;
        if (agentcontext != null)
        {
            break MISSING_BLOCK_LABEL_72;
        }
        throw new NullPointerException("AgentContext can not be null");
        agentContext = agentcontext;
        initCalled = true;
        initCallback = initcallback;
        mainHandler = new Handler();
        (new BackgroundTask()).execute(new Runnable() {

            final ServiceAgent this$0;

            public void run()
            {
                Log.d("nf_service_ServiceAgent", (new StringBuilder()).append("Initing ").append(getClass().getSimpleName()).toString());
                doInit();
            }

            
            {
                this$0 = ServiceAgent.this;
                super();
            }
        });
        this;
        JVM INSTR monitorexit ;
    }

    protected final void initCompleted(int i)
    {
        this;
        JVM INSTR monitorenter ;
        initErrorCode = i;
        Log.d("nf_service_ServiceAgent", (new StringBuilder()).append("InitComplete with errorCode ").append(initErrorCode).append(" for ").append(getClass().getSimpleName()).toString());
        if (initCallback != null)
        {
            mainHandler.post(new Runnable() {

                final ServiceAgent this$0;

                public void run()
                {
                    initCallback.onInitComplete(ServiceAgent.this, initErrorCode);
                }

            
            {
                this$0 = ServiceAgent.this;
                super();
            }
            });
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public boolean isReady()
    {
        this;
        JVM INSTR monitorenter ;
        int i = initErrorCode;
        boolean flag;
        if (i == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        this;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        throw exception;
    }


}
