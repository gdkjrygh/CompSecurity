// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.configuration;

import android.content.Context;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.net.IpConnectivityPolicy;
import com.netflix.mediaclient.service.configuration.drm.DrmManagerRegistry;
import com.netflix.mediaclient.service.configuration.volley.FetchConfigDataRequest;
import com.netflix.mediaclient.service.webclient.model.leafs.ConfigData;
import com.netflix.mediaclient.service.webclient.model.leafs.ConsolidatedLoggingSessionSpecification;
import com.netflix.mediaclient.service.webclient.model.leafs.DeviceConfigData;
import com.netflix.mediaclient.service.webclient.volley.FalcorParseUtils;
import com.netflix.mediaclient.util.DeviceCategory;
import com.netflix.mediaclient.util.PreferenceUtils;
import com.netflix.mediaclient.util.StringUtils;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

// Referenced classes of package com.netflix.mediaclient.service.configuration:
//            SubtitleConfiguration, DeviceRepository, ImagePrefRepository, SignUpConfiguration, 
//            PlayerTypeFactory, BitrateRangeFactory

public class DeviceConfiguration
{

    private static final boolean DISABLE_MDX_DEF = false;
    private static final boolean DISABLE_WEBSOCKET_DEF = true;
    private static String TAG = "nf_configuration_device";
    private int mAppMinimalVersion;
    private int mAppRecommendedVersion;
    private Map mConsolidatedLoggingSpecification;
    private Context mContext;
    private DeviceRepository mDeviceRepository;
    private ImagePrefRepository mImagePrefRepository;
    private IpConnectivityPolicy mIpConnectivityPolicy;
    private boolean mIsDisableMdx;
    private boolean mIsDisableWebsocket;
    private boolean mIsDisableWidevine;
    private int mPTAggregationSize;
    private SignUpConfiguration mSignUpConfig;
    private SubtitleConfiguration mSubtitleConfiguration;
    private int mUserSessionDurationInSeconds;

    public DeviceConfiguration(Context context)
    {
        boolean flag = true;
        super();
        mSubtitleConfiguration = SubtitleConfiguration.ENHANCED_XML;
        mConsolidatedLoggingSpecification = new HashMap();
        mContext = context;
        mDeviceRepository = new DeviceRepository(mContext);
        mImagePrefRepository = new ImagePrefRepository(mContext);
        mSignUpConfig = new SignUpConfiguration(mContext);
        mSubtitleConfiguration = SubtitleConfiguration.load(mContext);
        mConsolidatedLoggingSpecification = loadConsolidateLoggingSpecification();
        mIpConnectivityPolicy = loadIpConnectivityPolicy();
        mPTAggregationSize = PreferenceUtils.getIntPref(mContext, "pt_aggregation_size", -1);
        mAppRecommendedVersion = PreferenceUtils.getIntPref(mContext, "config_recommended_version", -1);
        mAppMinimalVersion = PreferenceUtils.getIntPref(mContext, "config_min_version", -1);
        mIsDisableMdx = PreferenceUtils.getBooleanPref(mContext, "disable_mdx", false);
        mIsDisableWebsocket = PreferenceUtils.getBooleanPref(mContext, "disable_websocket", true);
        context = mContext;
        if (DrmManagerRegistry.isDevicePredeterminedToUseWV())
        {
            flag = false;
        }
        mIsDisableWidevine = PreferenceUtils.getBooleanPref(context, "disable_widevine", flag);
        mUserSessionDurationInSeconds = loadUserSessionTimeoutDuration();
    }

    private int fetchDeviceConfigSynchronously(String s)
    {
        Log.d(TAG, "Need to fetchdeviceConfig synchronously ");
        try
        {
            Log.d(TAG, String.format("configurationUrl %s", new Object[] {
                s
            }));
            s = StringUtils.getRemoteDataAsString(s);
            Log.d(TAG, String.format("Device config data=%s", new Object[] {
                s
            }));
            s = FetchConfigDataRequest.parseConfigString(s);
            if (((ConfigData) (s)).deviceConfig == null)
            {
                throw new IOException();
            }
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s = s.toString().toLowerCase(Locale.US);
            Log.e(TAG, (new StringBuilder()).append("Could not fetch configuration! ").append(s).toString());
            return !s.contains("could not validate certificate") && !s.contains("sslhandshakeexception") ? -12 : -121;
        }
        persistDeviceConfigOverride(s.getDeviceConfig());
        return 0;
    }

    private boolean isDeviceConfigInCache()
    {
        return PreferenceUtils.getBooleanPref(mContext, "nf_device_config_cached", false);
    }

    private Map loadConsolidateLoggingSpecification()
    {
        List list;
        List list1;
        String s;
        list1 = null;
        s = PreferenceUtils.getStringPref(mContext, "cl_configuration", null);
        if (StringUtils.isEmpty(s))
        {
            Log.d(TAG, "CL specification not found in file system");
            return new HashMap();
        }
        list = list1;
        java.lang.reflect.Type type = (new TypeToken() {

            final DeviceConfiguration this$0;

            
            {
                this$0 = DeviceConfiguration.this;
                super();
            }
        }).getType();
        list = list1;
        list1 = (List)FalcorParseUtils.getGson().fromJson(s, type);
        list = list1;
        Log.d(TAG, "CL specification loaded from file system");
        list = list1;
_L2:
        return toMap(list);
        Throwable throwable;
        throwable;
        Log.e(TAG, "Failed to load CL specification from file system", throwable);
        if (true) goto _L2; else goto _L1
_L1:
    }

    private IpConnectivityPolicy loadIpConnectivityPolicy()
    {
        return IpConnectivityPolicy.from(PreferenceUtils.getIntPref(mContext, "ip_connectivity_policy_overide", 0x80000000));
    }

    private int loadUserSessionTimeoutDuration()
    {
        return PreferenceUtils.getIntPref(mContext, "apm_user_session_timeout_duration_override", 0x80000000);
    }

    private static Map toMap(List list)
    {
        HashMap hashmap = new HashMap();
        if (list != null)
        {
            list = list.iterator();
            do
            {
                if (!list.hasNext())
                {
                    break;
                }
                ConsolidatedLoggingSessionSpecification consolidatedloggingsessionspecification = (ConsolidatedLoggingSessionSpecification)list.next();
                if (consolidatedloggingsessionspecification != null && consolidatedloggingsessionspecification.getSession() != null)
                {
                    hashmap.put(consolidatedloggingsessionspecification.getSession(), consolidatedloggingsessionspecification);
                }
            } while (true);
        }
        return hashmap;
    }

    private void updateConsolidatedLoggingSpecification(List list)
    {
        mConsolidatedLoggingSpecification = toMap(list);
        if (list == null || list.size() < 1)
        {
            PreferenceUtils.removePref(mContext, "cl_configuration");
            return;
        } else
        {
            Gson gson = FalcorParseUtils.getGson();
            PreferenceUtils.putStringPref(mContext, "cl_configuration", gson.toJson(list));
            return;
        }
    }

    private void updateDeviceConfigFlag(boolean flag)
    {
        Log.d(TAG, (new StringBuilder()).append("setting DeviceConfig preferences inCache= ").append(flag).toString());
        PreferenceUtils.putBooleanPref(mContext, "nf_device_config_cached", flag);
    }

    private void updateDisableMdxFlag(String s)
    {
        boolean flag;
        if (StringUtils.isNotEmpty(s))
        {
            flag = Boolean.parseBoolean(s);
        } else
        {
            flag = false;
        }
        PreferenceUtils.putBooleanPref(mContext, "disable_mdx", flag);
        mIsDisableMdx = flag;
    }

    private void updateDisableWebsocketFlag(String s)
    {
        boolean flag;
        if (StringUtils.isNotEmpty(s))
        {
            flag = Boolean.parseBoolean(s);
        } else
        {
            flag = true;
        }
        PreferenceUtils.putBooleanPref(mContext, "disable_websocket", flag);
        mIsDisableWebsocket = flag;
    }

    private void updateDisableWidevineFlag(String s)
    {
        boolean flag;
        if (StringUtils.isNotEmpty(s))
        {
            flag = Boolean.parseBoolean(s);
        } else
        if (!DrmManagerRegistry.isDevicePredeterminedToUseWV())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        PreferenceUtils.putBooleanPref(mContext, "disable_widevine", flag);
        mIsDisableWidevine = flag;
    }

    public void clear()
    {
        mDeviceRepository = null;
        mImagePrefRepository = null;
        mSignUpConfig = null;
    }

    public int getAppMinimalVersion()
    {
        return mAppMinimalVersion;
    }

    public int getAppRecommendedVersion()
    {
        return mAppRecommendedVersion;
    }

    public DeviceCategory getCategory()
    {
        return mDeviceRepository.getCategory();
    }

    public ConsolidatedLoggingSessionSpecification getConsolidatedLoggingSessionSpecification(String s)
    {
        if (StringUtils.isEmpty(s))
        {
            return null;
        } else
        {
            return (ConsolidatedLoggingSessionSpecification)mConsolidatedLoggingSpecification.get(s);
        }
    }

    public ImagePrefRepository getImageRepository()
    {
        return mImagePrefRepository;
    }

    public IpConnectivityPolicy getIpConnectivityPolicy()
    {
        return mIpConnectivityPolicy;
    }

    public int getPTAggregationSize()
    {
        return mPTAggregationSize;
    }

    public SignUpConfiguration getSignUpConfiguration()
    {
        return mSignUpConfig;
    }

    public SubtitleConfiguration getSubtitleConfiguration()
    {
        return mSubtitleConfiguration;
    }

    public int getUserSessionDurationInSeconds()
    {
        return mUserSessionDurationInSeconds;
    }

    public boolean isDisableMdx()
    {
        return mIsDisableMdx;
    }

    public boolean isDisableWebsocket()
    {
        return mIsDisableWebsocket;
    }

    public boolean isDisableWidevine()
    {
        return mIsDisableWidevine;
    }

    public int loadDeviceConfigOverrides(String s)
    {
        if (!isDeviceConfigInCache())
        {
            return fetchDeviceConfigSynchronously(s);
        } else
        {
            Log.d(TAG, "DeviceConfig in cache... proceed!");
            return 0;
        }
    }

    public void persistDeviceConfigOverride(DeviceConfigData deviceconfigdata)
    {
        byte byte0 = -1;
        if (deviceconfigdata != null)
        {
            if (Log.isLoggable(TAG, 3))
            {
                Log.d(TAG, String.format("writing configData to storage %s", new Object[] {
                    deviceconfigdata.toString()
                }));
            }
            PlayerTypeFactory.updateDevicePlayerType(mContext, deviceconfigdata.getPlayerType());
            mDeviceRepository.update(mContext, deviceconfigdata.getDeviceCategory());
            BitrateRangeFactory.updateDeviceBitrateCap(mContext, deviceconfigdata.getBitrateCap());
            mImagePrefRepository.update(mContext, deviceconfigdata.getImagePref());
            mSignUpConfig.update(mContext, deviceconfigdata.getSignUpEnabled(), deviceconfigdata.getSignUpTimeout());
            updateDisableWidevineFlag(deviceconfigdata.getWidevineDisabled());
            updateDisableWebsocketFlag(deviceconfigdata.getWebsocketDisabled());
            updateDisableMdxFlag(deviceconfigdata.getMdxDisabled());
            updateConsolidatedLoggingSpecification(deviceconfigdata.getConsolidatedloggingSpecification());
            mSubtitleConfiguration = SubtitleConfiguration.update(mContext, deviceconfigdata.getSubtitleConfiguration());
            int i;
            if (deviceconfigdata.getAppMinVresion() != null)
            {
                i = Integer.parseInt(deviceconfigdata.getAppMinVresion());
            } else
            {
                i = -1;
            }
            mAppMinimalVersion = i;
            PreferenceUtils.putIntPref(mContext, "config_min_version", mAppMinimalVersion);
            if (deviceconfigdata.getAppRecommendedVresion() != null)
            {
                i = Integer.parseInt(deviceconfigdata.getAppRecommendedVresion());
            } else
            {
                i = -1;
            }
            mAppRecommendedVersion = i;
            PreferenceUtils.putIntPref(mContext, "config_recommended_version", mAppRecommendedVersion);
            i = byte0;
            if (StringUtils.isNotEmpty(deviceconfigdata.getPTAggregationSize()))
            {
                i = Integer.parseInt(deviceconfigdata.getPTAggregationSize());
            }
            mPTAggregationSize = i;
            PreferenceUtils.putIntPref(mContext, "pt_aggregation_size", mPTAggregationSize);
            i = deviceconfigdata.getIpConnectivityPolicy();
            mIpConnectivityPolicy = IpConnectivityPolicy.from(i);
            PreferenceUtils.putIntPref(mContext, "ip_connectivity_policy_overide", i);
            mUserSessionDurationInSeconds = deviceconfigdata.getUserSessionTimeoutDuration();
            PreferenceUtils.putIntPref(mContext, "apm_user_session_timeout_duration_override", mUserSessionDurationInSeconds);
            if (!isDeviceConfigInCache())
            {
                updateDeviceConfigFlag(true);
                return;
            }
        }
    }

}
