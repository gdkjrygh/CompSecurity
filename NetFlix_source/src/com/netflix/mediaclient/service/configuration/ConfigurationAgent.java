// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.configuration;

import android.os.Handler;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.android.app.BackgroundTask;
import com.netflix.mediaclient.javabridge.transport.NativeTransport;
import com.netflix.mediaclient.media.PlayerType;
import com.netflix.mediaclient.media.bitrate.VideoBitrateRange;
import com.netflix.mediaclient.nccp.NccpKeyStore;
import com.netflix.mediaclient.net.IpConnectivityPolicy;
import com.netflix.mediaclient.service.NetflixService;
import com.netflix.mediaclient.service.ServiceAgent;
import com.netflix.mediaclient.service.configuration.drm.DrmManager;
import com.netflix.mediaclient.service.configuration.drm.DrmManagerRegistry;
import com.netflix.mediaclient.service.configuration.esn.EsnProvider;
import com.netflix.mediaclient.service.configuration.esn.EsnProviderRegistry;
import com.netflix.mediaclient.service.resfetcher.ResourceFetcher;
import com.netflix.mediaclient.service.webclient.ApiEndpointRegistry;
import com.netflix.mediaclient.service.webclient.model.leafs.ConfigData;
import com.netflix.mediaclient.service.webclient.model.leafs.ConsolidatedLoggingSessionSpecification;
import com.netflix.mediaclient.servicemgr.AdvertiserIdLogging;
import com.netflix.mediaclient.servicemgr.IClientLogging;
import com.netflix.mediaclient.util.AndroidManifestUtils;
import com.netflix.mediaclient.util.AndroidUtils;
import com.netflix.mediaclient.util.DeviceCategory;
import com.netflix.mediaclient.util.DeviceUtils;
import com.netflix.mediaclient.util.PreferenceUtils;
import com.netflix.mediaclient.util.api.Api19Util;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package com.netflix.mediaclient.service.configuration:
//            ConfigurationWebClient, DeviceConfiguration, AccountConfiguration, EndpointRegistryProvider, 
//            ConfigurationWebClientFactory, DeviceModel, PlayerTypeFactory, BitrateRangeFactory, 
//            KidsOnPhoneConfiguration, ConfigurationAgentWebCallback, SignUpConfiguration, SubtitleConfiguration, 
//            SimpleConfigurationAgentWebCallback

public class ConfigurationAgent extends ServiceAgent
    implements com.netflix.mediaclient.service.ServiceAgent.ConfigurationAgentInterface
{
    public static interface ConfigAgentListener
    {

        public abstract void onConfigRefreshed(int i);
    }

    private class FetchConfigDataTask extends FetchTask
    {

        final ConfigurationAgent this$0;
        private final ConfigurationAgentWebCallback webClientCallback = new _cls1();

        public void run()
        {
            mConfigurationWebClient.fetchConfigData(webClientCallback);
        }

        public FetchConfigDataTask(ConfigurationAgentWebCallback configurationagentwebcallback)
        {
            this$0 = ConfigurationAgent.this;
            super(configurationagentwebcallback);
        }
    }

    private static abstract class FetchTask
        implements Runnable
    {

        private final ConfigurationAgentWebCallback callback;

        protected ConfigurationAgentWebCallback getCallback()
        {
            return callback;
        }

        public FetchTask(ConfigurationAgentWebCallback configurationagentwebcallback)
        {
            callback = configurationagentwebcallback;
        }
    }


    private static final int APM_USER_SESSION_TIMEOUT_SEC = 1800;
    private static final long CONFIG_REFRESH_DELAY_MS = 0x1b77400L;
    private static final int DATA_REQUEST_TIMEOUT_MS = 10000;
    private static final float DISK_CACHE_SIZE_AS_PERCENTAGE_OF_AVLBLMEM = 0.25F;
    private static final KidsOnPhoneConfiguration DUMMY_KIDS_CONFIG = new KidsOnPhoneConfiguration() {

        public KidsOnPhoneConfiguration.ActionBarNavType getActionBarNavType()
        {
            return KidsOnPhoneConfiguration.ActionBarNavType.UP;
        }

        public KidsOnPhoneConfiguration.LolomoImageType getLolomoImageType()
        {
            return KidsOnPhoneConfiguration.LolomoImageType.HORIZONTAL;
        }

        public KidsOnPhoneConfiguration.ScrollBehavior getScrollBehavior()
        {
            return KidsOnPhoneConfiguration.ScrollBehavior.LRUD;
        }

        public boolean isKidsOnPhoneEnabled()
        {
            return true;
        }

        public boolean shouldShowKidsEntryInActionBar()
        {
            return true;
        }

        public boolean shouldShowKidsEntryInGenreLomo()
        {
            return true;
        }

        public boolean shouldShowKidsEntryInMenu()
        {
            return true;
        }

    };
    private static final int HIGH_MEM_THREAD_COUNT = 4;
    private static final float IMAGE_CACHE_SIZE_AS_PERCENTAGE_OF_MAX_HEAP = 0.5F;
    private static final String LEVEL_HIGH = "high";
    private static final String LEVEL_LOW = "low";
    private static final long LOW_MEMORY_CONFIG_THRESHOLD_IN_BYTES = 0x2000000L;
    private static final int LOW_MEM_THREAD_COUNT = 2;
    private static final int MAX_DISK_CACHE_SIZE_IN_BYTES = 0x1900000;
    private static final int MAX_VIDEO_BUFFERSIZE = 0x2000000;
    private static final long MILLISECONDS_PER_DAY = 0x5265c00L;
    public static final long MINIMUM_IMAGE_CACHE_TTL = 0x48190800L;
    private static final int MIN_DISK_CACHE_SIZE_IN_BYTES = 0x500000;
    private static final int MIN_VIDEO_BUFFERSIZE = 0x400000;
    private static final boolean OVERRIDE_SERVER_CONFIG_FOR_KIDS_ON_PHONE = false;
    public static final int RESOURCE_REQUEST_TIMEOUT_MS = 1000;
    private static final String TAG = "nf_configurationagent";
    private static final String VIDEO_PLAYREADY_H264_BPL30_DASH = "playready-h264bpl30-dash";
    private static final String VIDEO_PLAYREADY_H264_MPL30_DASH = "playready-h264mpl30-dash";
    private static final String VIDEO_PLAYREADY_H264_MPL31_DASH = "playready-h264mpl31-dash";
    private static final String sMemLevel = getMemLevel();
    private AccountConfiguration mAccountConfigOverride;
    private int mAppVersionCode;
    private final ArrayList mConfigAgentListeners = new ArrayList();
    private int mConfigRefreshStatus;
    private ConfigurationWebClient mConfigurationWebClient;
    private DeviceConfiguration mDeviceConfigOverride;
    private int mDiskCacheSizeBytes;
    private DrmManager mDrmManager;
    private EsnProvider mESN;
    private EndpointRegistryProvider mEndpointRegistry;
    private int mImageCacheSizeBytes;
    private boolean mIsConfigRefreshInBackground;
    private boolean mNeedEsMigration;
    private boolean mNeedLogout;
    private String mSoftwareVersion;
    private Handler refreshHandler;
    private final Runnable refreshRunnable = new Runnable() {

        final ConfigurationAgent this$0;

        public void run()
        {
            Log.i("nf_configurationagent", "Refreshing config via runnable");
            fetchAccountConfigData(null);
            Log.i("nf_configurationagent", "Check if we should report ad id via runnable");
            Object obj = getService().getClientLogging();
            if (obj == null)
            {
                Log.e("nf_configurationagent", "CL is not available!");
                return;
            }
            obj = ((IClientLogging) (obj)).getAdvertiserIdLogging();
            if (obj == null)
            {
                Log.e("nf_configurationagent", "AD logger is not available!");
                return;
            } else
            {
                ((AdvertiserIdLogging) (obj)).sendAdvertiserId(com.netflix.mediaclient.servicemgr.AdvertiserIdLogging.EventType.check_in);
                return;
            }
        }

            
            {
                this$0 = ConfigurationAgent.this;
                super();
            }
    };

    public ConfigurationAgent()
    {
        mIsConfigRefreshInBackground = false;
        mConfigRefreshStatus = -1;
        mAppVersionCode = -1;
        mSoftwareVersion = null;
        mNeedLogout = false;
        mNeedEsMigration = false;
    }

    private void doRefreshConfig(ConfigurationAgentWebCallback configurationagentwebcallback)
    {
        mIsConfigRefreshInBackground = true;
        fetchConfigData(configurationagentwebcallback);
    }

    private void fetchConfigData(ConfigurationAgentWebCallback configurationagentwebcallback)
    {
        prepareConfigWebClient();
        Log.d("nf_configurationagent", "fetchConfigData");
        mIsConfigRefreshInBackground = true;
        launchTask(new FetchConfigDataTask(configurationagentwebcallback));
    }

    public static String getMemLevel()
    {
        String s = "high";
        long l = Runtime.getRuntime().maxMemory();
        if (l <= 0x2000000L)
        {
            s = "low";
        }
        String s1 = s;
        if (AndroidUtils.getAndroidVersion() >= 19)
        {
            s1 = s;
            if (Api19Util.isLowRamDevice())
            {
                Log.v("nf_configurationagent", "isLowRamDevice() is true");
                s1 = "low";
            }
        }
        if (Log.isLoggable("nf_configurationagent", 4))
        {
            Log.i("nf_configurationagent", String.format("maxMemoryAllocated: %d, memLevel: %s", new Object[] {
                Long.valueOf(l), s1
            }));
        }
        return s1;
    }

    private String getUiResolutionType()
    {
        return sMemLevel;
    }

    private void launchTask(FetchTask fetchtask)
    {
        if (Log.isLoggable("nf_configurationagent", 2))
        {
            Log.v("nf_configurationagent", (new StringBuilder()).append("Launching task: ").append(fetchtask.getClass().getSimpleName()).toString());
        }
        if (mConfigurationWebClient.isSynchronous())
        {
            (new BackgroundTask()).execute(fetchtask);
            return;
        } else
        {
            fetchtask.run();
            return;
        }
    }

    private void notifyConfigRefreshed()
    {
        getMainHandler().post(new Runnable() {

            final ConfigurationAgent this$0;

            public void run()
            {
                ConfigurationAgent configurationagent = ConfigurationAgent.this;
                configurationagent;
                JVM INSTR monitorenter ;
                Log.d("nf_configurationagent", "Invoking ConfigAgentListeners.");
                mIsConfigRefreshInBackground = false;
                for (Iterator iterator = mConfigAgentListeners.iterator(); iterator.hasNext(); ((ConfigAgentListener)iterator.next()).onConfigRefreshed(mConfigRefreshStatus)) { }
                break MISSING_BLOCK_LABEL_73;
                Exception exception;
                exception;
                configurationagent;
                JVM INSTR monitorexit ;
                throw exception;
                mConfigAgentListeners.clear();
                configurationagent;
                JVM INSTR monitorexit ;
            }

            
            {
                this$0 = ConfigurationAgent.this;
                super();
            }
        });
    }

    private void persistConfigOverride(ConfigData configdata)
    {
        if (Log.isLoggable("nf_configurationagent", 3))
        {
            Log.d("nf_configurationagent", String.format("persistConfigOverride configData %s", new Object[] {
                configdata.toString()
            }));
        }
        mDeviceConfigOverride.persistDeviceConfigOverride(configdata.getDeviceConfig());
        mAccountConfigOverride.persistStreamingOverride(configdata.getStreamingConfig());
        mAccountConfigOverride.persistAccountConfigOverride(configdata.getAccountConfig());
    }

    private void prepareConfigWebClient()
    {
        mEndpointRegistry.setUserAgentInterface(getUserAgent());
        mEndpointRegistry.setConfigurationAgentInterface(getConfigurationAgent());
        if (mConfigurationWebClient == null)
        {
            mConfigurationWebClient = ConfigurationWebClientFactory.create(getService(), getResourceFetcher().getApiNextWebClient());
        }
    }

    public static boolean shouldUseLowMemConfig()
    {
        return "low".equals(sMemLevel);
    }

    public void addConfigAgentListener(ConfigAgentListener configagentlistener)
    {
        this;
        JVM INSTR monitorenter ;
        if (configagentlistener == null)
        {
            break MISSING_BLOCK_LABEL_15;
        }
        mConfigAgentListeners.add(configagentlistener);
        this;
        JVM INSTR monitorexit ;
        return;
        configagentlistener;
        throw configagentlistener;
    }

    public void clearAccountConfigData()
    {
        mAccountConfigOverride.clear();
    }

    public void destroy()
    {
        super.destroy();
        if (refreshHandler != null)
        {
            refreshHandler.removeCallbacks(refreshRunnable);
        }
        if (mDeviceConfigOverride != null)
        {
            mDeviceConfigOverride.clear();
        }
        if (mConfigAgentListeners != null)
        {
            mConfigAgentListeners.clear();
        }
        if (mDrmManager != null)
        {
            mDrmManager.destroy();
        }
        if (mESN != null)
        {
            mESN.destroy();
        }
    }

    protected void doInit()
    {
        mNeedLogout = false;
        mNeedEsMigration = false;
        mImageCacheSizeBytes = Math.round((float)Runtime.getRuntime().maxMemory() * 0.5F);
        Log.i("nf_configurationagent", (new StringBuilder()).append("Use low mem config: ").append(shouldUseLowMemConfig()).toString());
        mDiskCacheSizeBytes = PreferenceUtils.getIntPref(getContext(), "disk_cache_size", 0);
        if (mDiskCacheSizeBytes == 0)
        {
            long l = AndroidUtils.getAvailableInternalMemory();
            mDiskCacheSizeBytes = (int)Math.min((float)l * 0.25F, 2.62144E+07F);
            mDiskCacheSizeBytes = Math.max(mDiskCacheSizeBytes, 0x500000);
            PreferenceUtils.putIntPref(getContext(), "disk_cache_size", mDiskCacheSizeBytes);
            if (Log.isLoggable("nf_configurationagent", 3))
            {
                Log.d("nf_configurationagent", (new StringBuilder()).append("Available disk space in bytes = ").append(l).append(" Saving disk Cache Size = ").append(mDiskCacheSizeBytes).toString());
            }
        }
        mAppVersionCode = AndroidManifestUtils.getVersionCode(getContext());
        if (Log.isLoggable("nf_configurationagent", 4))
        {
            Log.i("nf_configurationagent", (new StringBuilder()).append("Current app version code = ").append(mAppVersionCode).toString());
        }
        mSoftwareVersion = AndroidManifestUtils.getVersionName(getContext());
        if (Log.isLoggable("nf_configurationagent", 4))
        {
            Log.i("nf_configurationagent", (new StringBuilder()).append("Current softwareVersion = ").append(mSoftwareVersion).toString());
        }
        DeviceModel devicemodel = new DeviceModel(mAppVersionCode, getContext());
        mDeviceConfigOverride = new DeviceConfiguration(getContext());
        mAccountConfigOverride = new AccountConfiguration(getContext());
        mEndpointRegistry = new EndpointRegistryProvider(getContext(), devicemodel, Boolean.valueOf(isDeviceHd()), mDeviceConfigOverride.getImageRepository(), getUiResolutionType());
        int i = mDeviceConfigOverride.loadDeviceConfigOverrides(mEndpointRegistry.getDeviceConfigUrl());
        if (i != 0)
        {
            initCompleted(i);
            return;
        } else
        {
            com.netflix.mediaclient.service.configuration.drm.DrmManager.DrmReadyCallback drmreadycallback = new com.netflix.mediaclient.service.configuration.drm.DrmManager.DrmReadyCallback() {

                final ConfigurationAgent this$0;

                public void drmError(int j)
                {
                    if (Log.isLoggable("nf_configurationagent", 6))
                    {
                        Log.d("nf_configurationagent", (new StringBuilder()).append("DRM failed to initialize, Error code: ").append(j).toString());
                    }
                    initCompleted(j);
                }

                public void drmReady()
                {
                    Log.d("nf_configurationagent", "DRM manager is ready");
                    if (DrmManagerRegistry.isDrmSystemChanged())
                    {
                        mNeedEsMigration = true;
                    }
                    initCompleted(0);
                }

            
            {
                this$0 = ConfigurationAgent.this;
                super();
            }
            };
            NccpKeyStore.init(getContext());
            mDrmManager = DrmManagerRegistry.createDrmManager(getContext(), this, getUserAgent(), getService().getClientLogging().getErrorLogging(), drmreadycallback);
            mESN = EsnProviderRegistry.createESN(getContext(), mDrmManager, this);
            Log.d("nf_configurationagent", "Inject ESN to PlayerTypeFactory");
            PlayerTypeFactory.initialize(mESN);
            mDrmManager.init();
            return;
        }
    }

    public void esnMigrationComplete()
    {
        mNeedEsMigration = false;
    }

    public void fetchAccountConfigData(ConfigurationAgentWebCallback configurationagentwebcallback)
    {
        if (refreshHandler == null)
        {
            refreshHandler = new Handler();
        }
        refreshConfig(configurationagentwebcallback, null);
    }

    public ApiEndpointRegistry getApiEndpointRegistry()
    {
        return mEndpointRegistry;
    }

    public int getApmUserSessionDurationInSeconds()
    {
        int i = mDeviceConfigOverride.getUserSessionDurationInSeconds();
        if (i > 0)
        {
            return i;
        } else
        {
            return 1800;
        }
    }

    public int getAppVersionCode()
    {
        return mAppVersionCode;
    }

    public int getBitrateCap()
    {
        return BitrateRangeFactory.getBitrateCap(getContext());
    }

    public JSONArray getCastWhiteList()
    {
        return mAccountConfigOverride.getCastWhitelist();
    }

    public ConsolidatedLoggingSessionSpecification getConsolidatedLoggingSessionSpecification(String s)
    {
        return mDeviceConfigOverride.getConsolidatedLoggingSessionSpecification(s);
    }

    public PlayerType getCurrentPlayerType()
    {
        return PlayerTypeFactory.getCurrentType(getContext());
    }

    public int getDataRequestTimeout()
    {
        return 10000;
    }

    public DeviceCategory getDeviceCategory()
    {
        DeviceCategory devicecategory = mDeviceConfigOverride.getCategory();
        if (devicecategory != null)
        {
            if (Log.isLoggable("nf_configurationagent", 3))
            {
                Log.d("nf_configurationagent", (new StringBuilder()).append("Device category is overriden by configuration server: ").append(devicecategory).toString());
            }
            return devicecategory;
        }
        if (DeviceUtils.isTabletByContext(getContext()))
        {
            return DeviceCategory.TABLET;
        } else
        {
            return DeviceCategory.PHONE;
        }
    }

    public VideoBitrateRange[] getDeviceVideoProfiles()
    {
        String as[] = NativeTransport.getSupportedVideoProfiles();
        VideoBitrateRange avideobitraterange[] = new VideoBitrateRange[as.length];
        PlayerType playertype;
        int i;
        int j;
        int k;
        boolean flag;
        if (!isTablet())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        playertype = getCurrentPlayerType();
        if (Log.isLoggable("nf_configurationagent", 3))
        {
            Log.d("VideoBitrateRange", (new StringBuilder()).append("Device is phone: ").append(flag).append(",PlayerType: ").append(playertype).toString());
        }
        j = 0;
        k = as.length;
        i = 0;
        do
        {
            if (i < k)
            {
                String s = as[i];
                char c = '\u12C0';
                char c1;
                if (s.equalsIgnoreCase("playready-h264bpl30-dash"))
                {
                    c = '\u0546';
                    Log.d("VideoBitrateRange", "player support BP30");
                } else
                if (s.equalsIgnoreCase("playready-h264mpl30-dash"))
                {
                    c = '\u06D6';
                    Log.d("VideoBitrateRange", "player support MP30");
                } else
                if (s.equalsIgnoreCase("playready-h264mpl31-dash"))
                {
                    c = '\u0E10';
                    Log.d("VideoBitrateRange", "player support MP31");
                }
                c1 = c;
                if (!PlayerTypeFactory.isJPlayer2(playertype))
                {
                    c1 = c;
                    if (flag)
                    {
                        if (s.equalsIgnoreCase("playready-h264bpl30-dash"))
                        {
                            c1 = '\u01F4';
                        } else
                        {
                            c1 = c;
                            if (s.equalsIgnoreCase("playready-h264mpl30-dash"))
                            {
                                c1 = '\u02EE';
                            }
                        }
                    }
                }
                if (Log.isLoggable("nf_configurationagent", 3))
                {
                    Log.d("VideoBitrateRange", (new StringBuilder()).append("Profile: ").append(s).append(", min: ").append(0).append(", max: ").append(c1).toString());
                }
                avideobitraterange[j] = new VideoBitrateRange(0, c1, s);
                j++;
                i++;
                continue;
            }
            return avideobitraterange;
        } while (true);
    }

    public int getDiskCacheSizeBytes()
    {
        return mDiskCacheSizeBytes;
    }

    public DrmManager getDrmManager()
    {
        return mDrmManager;
    }

    public EsnProvider getEsnProvider()
    {
        return mESN;
    }

    public long getImageCacheMinimumTtl()
    {
        return 0x48190800L;
    }

    public int getImageCacheSizeBytes()
    {
        return mImageCacheSizeBytes;
    }

    public IpConnectivityPolicy getIpConnectivityPolicy()
    {
        return mDeviceConfigOverride.getIpConnectivityPolicy();
    }

    public JSONObject getJPlayerConfig()
    {
        return mAccountConfigOverride.getJPlayerConfig();
    }

    public KidsOnPhoneConfiguration getKidsOnPhoneConfiguration()
    {
        return mAccountConfigOverride.getKidsOnPhoneConfiguration();
    }

    public JSONArray getMdxBlackListTargets()
    {
        return mAccountConfigOverride.getMdxBlacklist();
    }

    public int getPresentationTrackingAggregationSize()
    {
        return mDeviceConfigOverride.getPTAggregationSize();
    }

    public int getResFetcherThreadPoolSize()
    {
        return !shouldUseLowMemConfig() ? 4 : 2;
    }

    public int getResourceRequestTimeout()
    {
        return 1000;
    }

    public SignUpConfiguration getSignUpConfiguration()
    {
        return mDeviceConfigOverride.getSignUpConfiguration();
    }

    public String getSoftwareVersion()
    {
        return mSoftwareVersion;
    }

    public String getStreamingQoe()
    {
        return mAccountConfigOverride.getStreamingQoe();
    }

    public SubtitleConfiguration getSubtitleConfiguration()
    {
        return mDeviceConfigOverride.getSubtitleConfiguration();
    }

    public VideoBitrateRange[] getVideoBitrateRange()
    {
        VideoBitrateRange avideobitraterange[] = getDeviceVideoProfiles();
        int i1 = getBitrateCap();
        VideoBitrateRange avideobitraterange1[] = new VideoBitrateRange[avideobitraterange.length];
        int k = 0;
        int j1 = avideobitraterange.length;
        for (int j = 0; j < j1; j++)
        {
            VideoBitrateRange videobitraterange = avideobitraterange[j];
            int l = videobitraterange.getMaximal();
            int i = l;
            if (l > 0x7fffffff)
            {
                i = 0x7fffffff;
                Log.d("nf_configurationagent", "use limit");
            }
            l = i;
            if (i1 > 0)
            {
                l = i;
                if (i > i1)
                {
                    l = i1;
                    Log.d("nf_configurationagent", "use bitratecap");
                }
            }
            avideobitraterange1[k] = new VideoBitrateRange(videobitraterange.getMinimal(), l, videobitraterange.getProfile());
            if (Log.isLoggable("nf_configurationagent", 3))
            {
                Log.d("nf_configurationagent", (new StringBuilder()).append(" VideoBitrateRange[").append(k).append("] ").append(avideobitraterange1[k]).toString());
            }
            k++;
        }

        return avideobitraterange1;
    }

    public int getVideoBufferSize()
    {
        int i;
label0:
        {
            int j = mAccountConfigOverride.getVideoBufferSize();
            if (j >= 0x400000)
            {
                i = j;
                if (j <= 0x2000000)
                {
                    break label0;
                }
            }
            j = 0;
            i = j;
            if (Log.isLoggable("nf_configurationagent", 3))
            {
                Log.d("nf_configurationagent", (new StringBuilder()).append(" Invalid VideoBufferSize ").append(0).toString());
                i = j;
            }
        }
        return i;
    }

    public boolean isAppVersionObsolete()
    {
        int i = mDeviceConfigOverride.getAppMinimalVersion();
        if (Log.isLoggable("nf_configurationagent", 3))
        {
            StringBuilder stringbuilder = (new StringBuilder()).append("minimalVersion = ").append(i).append(" appVersionCode = ").append(mAppVersionCode).append(" so isAppVersionObsolete = ");
            boolean flag;
            if (mAppVersionCode < i)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Log.i("nf_configurationagent", stringbuilder.append(flag).toString());
        }
        return mAppVersionCode < i;
    }

    public boolean isAppVersionRecommended()
    {
        int i = mDeviceConfigOverride.getAppRecommendedVersion();
        if (Log.isLoggable("nf_configurationagent", 3))
        {
            StringBuilder stringbuilder = (new StringBuilder()).append("recommendedVersion = ").append(i).append(" appVersionCode = ").append(mAppVersionCode).append(" so isAppVersionRecommended = ");
            boolean flag;
            if (mAppVersionCode >= i)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Log.i("nf_configurationagent", stringbuilder.append(flag).toString());
        }
        return mAppVersionCode >= i;
    }

    public boolean isCurrentDrmWidevine()
    {
        return DrmManagerRegistry.isCurrentDrmWidevine();
    }

    public boolean isDeviceHd()
    {
        return DrmManagerRegistry.drmSupportsHd();
    }

    public boolean isDeviceLowMem()
    {
        return getMemLevel().equals("low");
    }

    public boolean isDisableMdx()
    {
        return mDeviceConfigOverride.isDisableMdx();
    }

    public boolean isDisableWebsocket()
    {
        return mDeviceConfigOverride.isDisableWebsocket();
    }

    public boolean isDisableWidevine()
    {
        return mDeviceConfigOverride.isDisableWidevine();
    }

    public boolean isEnableCast()
    {
        return mAccountConfigOverride.getCastEnabled();
    }

    public boolean isEsnMigrationRequired()
    {
        return mNeedEsMigration;
    }

    public boolean isLogoutRequired()
    {
        return mNeedLogout;
    }

    public boolean isTablet()
    {
        DeviceCategory devicecategory = getDeviceCategory();
        return DeviceCategory.TABLET.equals(devicecategory);
    }

    public void refreshConfig(ConfigurationAgentWebCallback configurationagentwebcallback, ConfigAgentListener configagentlistener)
    {
        this;
        JVM INSTR monitorenter ;
        if (configagentlistener == null)
        {
            break MISSING_BLOCK_LABEL_15;
        }
        mConfigAgentListeners.add(configagentlistener);
        if (mIsConfigRefreshInBackground) goto _L2; else goto _L1
_L1:
        Log.i("nf_configurationagent", "Starting a config refresh in the background.");
        doRefreshConfig(configurationagentwebcallback);
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        Log.i("nf_configurationagent", "Ignoring request to refreshConfig because one is on-going.");
        if (true) goto _L4; else goto _L3
_L3:
        configurationagentwebcallback;
        throw configurationagentwebcallback;
    }

    public void removeConfigAgentListener(ConfigAgentListener configagentlistener)
    {
        this;
        JVM INSTR monitorenter ;
        if (configagentlistener == null)
        {
            break MISSING_BLOCK_LABEL_15;
        }
        mConfigAgentListeners.remove(configagentlistener);
        this;
        JVM INSTR monitorexit ;
        return;
        configagentlistener;
        throw configagentlistener;
    }

    public void userAgentLogoutComplete()
    {
        mNeedLogout = false;
    }



/*
    static boolean access$002(ConfigurationAgent configurationagent, boolean flag)
    {
        configurationagent.mNeedEsMigration = flag;
        return flag;
    }

*/






/*
    static boolean access$302(ConfigurationAgent configurationagent, boolean flag)
    {
        configurationagent.mIsConfigRefreshInBackground = flag;
        return flag;
    }

*/




/*
    static int access$502(ConfigurationAgent configurationagent, int i)
    {
        configurationagent.mConfigRefreshStatus = i;
        return i;
    }

*/





    // Unreferenced inner class com/netflix/mediaclient/service/configuration/ConfigurationAgent$FetchConfigDataTask$1

/* anonymous class */
    class FetchConfigDataTask._cls1 extends SimpleConfigurationAgentWebCallback
    {

        final FetchConfigDataTask this$1;

        public void onConfigDataFetched(ConfigData configdata, int i)
        {
            Log.d("nf_configurationagent", String.format("onConfigDataFetched statusCode=%d", new Object[] {
                Integer.valueOf(i)
            }));
            mConfigRefreshStatus = -7;
            if (i == 0 && configdata != null)
            {
                persistConfigOverride(configdata);
                mConfigRefreshStatus = 0;
            }
            mIsConfigRefreshInBackground = false;
            refreshHandler.postDelayed(refreshRunnable, 0x1b77400L);
            notifyConfigRefreshed();
            if (getCallback() != null)
            {
                getCallback().onConfigDataFetched(configdata, mConfigRefreshStatus);
            }
        }

            
            {
                this$1 = FetchConfigDataTask.this;
                super();
            }
    }

}
