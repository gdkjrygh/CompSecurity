// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.configuration;

import android.content.Context;
import com.netflix.mediaclient.service.configuration.volley.FetchConfigDataRequest;
import com.netflix.mediaclient.service.webclient.ApiEndpointRegistry;
import com.netflix.mediaclient.servicemgr.ProfileType;
import com.netflix.mediaclient.servicemgr.UserProfile;
import com.netflix.mediaclient.ui.kids.KidsUtils;
import com.netflix.mediaclient.util.AndroidUtils;
import com.netflix.mediaclient.util.AppStoreHelper;
import com.netflix.mediaclient.util.StringUtils;
import com.netflix.mediaclient.util.UriUtil;

// Referenced classes of package com.netflix.mediaclient.service.configuration:
//            KidsOnPhoneConfiguration, DeviceModel, ImagePrefRepository

public class EndpointRegistryProvider
    implements ApiEndpointRegistry
{

    private static final String ANDROID_CONFIG_ENDPOINT_FULL = "/android/samurai/config";
    private static final String ANDROID_ENDPOINT_FULL = "/android/3.7/api";
    private static final boolean BROWSE_AUTO_REDIRECT_TRUE = true;
    private static final String BROWSE_RESP_AUTO_REDIRECT = "&routing=redirect";
    private static final String BROWSE_RESP_FORMAT_FULL = "responseFormat=json&pathFormat=hierarchical&progressive=false";
    private static final String BROWSE_RESP_MANUAL_REDIRECT = "&routing=reject";
    private static final String CLIENT_LOGGING_ENDPOINT = "ichnaea.netflix.com";
    private static final String CLIENT_LOGGING_PATH = "/log";
    private static final String ENDPOINT_REVISION_LATEST = "&revision=latest";
    protected static final String HTTP = "http://";
    protected static final String HTTPS = "https://";
    public static final String IMG_PREFERENCE_JPG = "jpg";
    public static final String IMG_PREFERENCE_WEBP = "webp";
    private static final String PARAM_API_LEVEL = "api";
    private static final String PARAM_APK_VERSION = "appVer";
    private static final String PARAM_APP_INSTALL_STORE = "store";
    private static final String PARAM_APP_TYPE = "appType";
    public static final String PARAM_BOXART_TYPE = "bat";
    private static final String PARAM_BUILD_BOARD = "osBoard";
    private static final String PARAM_BUILD_DEVICE = "osDevice";
    private static final String PARAM_BUILD_DISPLAY = "osDisplay";
    public static final String PARAM_CUR_NETFLIX_ID_HASH = "ckh";
    private static final String PARAM_DEBUG_BUILD = "dbg";
    private static final String PARAM_FORM_FACTOR = "ffbc";
    private static final String PARAM_IMG_PREFERENCE = "imgpref";
    public static final String PARAM_KOP_EXPERIENCE = "kop";
    private static final String PARAM_LANGUAGES = "languages";
    private static final String PARAM_MANUFACTURER = "mnf";
    private static final String PARAM_MODEL_ID = "mId";
    private static final String PARAM_PQL_PATH = "path";
    public static final String PARAM_PROFILE_TYPE = "prfType";
    private static final String PARAM_RESOLUTION = "res";
    private static final String PARAM_VIDEO_CAPABILITY = "qlty";
    private static final String PRESENTATION_TRACKING_ENDPOINT = "presentationtracking.netflix.com";
    private static final String PRESENTATION_TRACKING_PATH = "/users/presentationtracking";
    private static final String WEBCLIENT_ENDPOINT = "api-global.netflix.com";
    private String mApiEndpointUrl;
    private String mClientLogEndpointUrl;
    private com.netflix.mediaclient.service.ServiceAgent.ConfigurationAgentInterface mConfigAgent;
    private String mConfigEndpointUrl;
    private final Context mContext;
    private final Boolean mDeviceHd;
    private final DeviceModel mDeviceModel;
    private String mEndpointHost;
    private final ImagePrefRepository mImagePrefRepository;
    private String mPresentationTrackingUrl;
    private final String mUiResolutionType;
    private com.netflix.mediaclient.service.ServiceAgent.UserAgentInterface mUserAgent;

    public EndpointRegistryProvider(Context context, DeviceModel devicemodel, Boolean boolean1, ImagePrefRepository imageprefrepository, String s)
    {
        mContext = context;
        mDeviceModel = devicemodel;
        mDeviceHd = boolean1;
        mImagePrefRepository = imageprefrepository;
        mUiResolutionType = s;
        mEndpointHost = "api-global.netflix.com";
    }

    private StringBuilder addDynamicParams(StringBuilder stringbuilder)
    {
        if (mUserAgent != null && StringUtils.isNotEmpty(mUserAgent.getLanguagesInCsv()))
        {
            stringbuilder.append(buildUrlParam("languages", UriUtil.urlEncodeParam(mUserAgent.getLanguagesInCsv())));
        }
        if (mUserAgent != null && KidsUtils.isKidsProfile(mUserAgent.getCurrentProfile()))
        {
            stringbuilder.append(buildUrlParam("prfType", mUserAgent.getCurrentProfile().getProfileType().toString()));
            if (KidsUtils.isKoPExperience(mConfigAgent, mUserAgent.getCurrentProfile()))
            {
                stringbuilder.append(buildUrlParam("kop", Boolean.TRUE.toString()));
                if (mConfigAgent.getKidsOnPhoneConfiguration().isKidsOnPhoneEnabled())
                {
                    stringbuilder.append(buildUrlParam("bat", mConfigAgent.getKidsOnPhoneConfiguration().getLolomoImageType().toString()));
                }
            }
        }
        return stringbuilder;
    }

    private String buildConfigUrl(boolean flag)
    {
        StringBuilder stringbuilder = new StringBuilder();
        String s;
        if (isSecure())
        {
            stringbuilder.append("https://");
        } else
        {
            stringbuilder.append("http://");
        }
        stringbuilder.append(mEndpointHost);
        stringbuilder.append("/android/samurai/config");
        stringbuilder.append("?");
        stringbuilder.append("responseFormat=json&pathFormat=hierarchical&progressive=false");
        if (flag)
        {
            s = "&routing=redirect";
        } else
        {
            s = "&routing=reject";
        }
        stringbuilder.append(s);
        stringbuilder.append(buildUrlParam("appType", mDeviceModel.getAppType()));
        if (mDeviceHd.booleanValue())
        {
            s = "hd";
        } else
        {
            s = "sd";
        }
        stringbuilder.append(buildUrlParam("qlty", s));
        stringbuilder.append(buildUrlParam("ffbc", mDeviceModel.getFormFactor()));
        stringbuilder.append(buildUrlParam("osBoard", UriUtil.urlEncodeParam(mDeviceModel.getBuildPropBoard())));
        stringbuilder.append(buildUrlParam("osDevice", UriUtil.urlEncodeParam(mDeviceModel.getBuildPropDevice())));
        stringbuilder.append(buildUrlParam("osDisplay", UriUtil.urlEncodeParam(mDeviceModel.getBuildPropDisplay())));
        stringbuilder.append(buildUrlParam("appVer", Integer.toString(mDeviceModel.getApkVer())));
        stringbuilder.append(buildUrlParam("mId", UriUtil.urlEncodeParam(mDeviceModel.getEsnModelId())));
        stringbuilder.append(buildUrlParam("api", Integer.toString(mDeviceModel.getApiLevel())));
        stringbuilder.append(buildUrlParam("mnf", UriUtil.urlEncodeParam(mDeviceModel.getManufacturer())));
        stringbuilder.append(buildUrlParam("store", AppStoreHelper.getInstallationSource(mContext)));
        return stringbuilder.toString();
    }

    private String buildUrlParam(String s, String s1)
    {
        return UriUtil.buildUrlParam(s, s1);
    }

    private String getImagePreference()
    {
        String s = mImagePrefRepository.getImgPreference();
        if (StringUtils.isNotEmpty(s))
        {
            return s;
        }
        if (AndroidUtils.getAndroidVersion() >= 14)
        {
            s = "webp";
        } else
        {
            s = "jpg";
        }
        return s;
    }

    public String getApiUrlFull()
    {
        if (StringUtils.isNotEmpty(mApiEndpointUrl))
        {
            return addDynamicParams(new StringBuilder(mApiEndpointUrl)).toString();
        }
        StringBuilder stringbuilder = new StringBuilder();
        if (isSecure())
        {
            stringbuilder.append("https://");
        } else
        {
            stringbuilder.append("http://");
        }
        stringbuilder.append(mEndpointHost);
        stringbuilder.append("/android/3.7/api");
        stringbuilder.append("?");
        stringbuilder.append("responseFormat=json&pathFormat=hierarchical&progressive=false");
        stringbuilder.append("&routing=reject");
        stringbuilder.append(buildUrlParam("res", mUiResolutionType));
        stringbuilder.append(buildUrlParam("imgpref", getImagePreference()));
        mApiEndpointUrl = stringbuilder.toString();
        return addDynamicParams(stringbuilder).toString();
    }

    public String getClientLoggingUrlFull()
    {
        this;
        JVM INSTR monitorenter ;
        if (!StringUtils.isNotEmpty(mClientLogEndpointUrl)) goto _L2; else goto _L1
_L1:
        Object obj = mClientLogEndpointUrl;
_L3:
        this;
        JVM INSTR monitorexit ;
        return ((String) (obj));
_L2:
        obj = new StringBuilder();
        if (!isSecure())
        {
            break MISSING_BLOCK_LABEL_73;
        }
        ((StringBuilder) (obj)).append("https://");
_L4:
        ((StringBuilder) (obj)).append("ichnaea.netflix.com");
        ((StringBuilder) (obj)).append("/log");
        mClientLogEndpointUrl = ((StringBuilder) (obj)).toString();
        obj = mClientLogEndpointUrl;
          goto _L3
        ((StringBuilder) (obj)).append("http://");
          goto _L4
        Exception exception;
        exception;
        throw exception;
    }

    public String getConfigUrlFull()
    {
        if (StringUtils.isNotEmpty(mConfigEndpointUrl))
        {
            return mConfigEndpointUrl;
        } else
        {
            mConfigEndpointUrl = buildConfigUrl(false);
            return mConfigEndpointUrl;
        }
    }

    public String getDeviceConfigUrl()
    {
        return (new StringBuilder(buildConfigUrl(true))).append(buildUrlParam("path", UriUtil.urlEncodeParam(FetchConfigDataRequest.deviceConfigPql))).toString();
    }

    public String getPresentationTrackingUrlFull()
    {
        this;
        JVM INSTR monitorenter ;
        if (!StringUtils.isNotEmpty(mPresentationTrackingUrl)) goto _L2; else goto _L1
_L1:
        Object obj = mPresentationTrackingUrl;
_L3:
        this;
        JVM INSTR monitorexit ;
        return ((String) (obj));
_L2:
        obj = new StringBuilder();
        if (!isSecure())
        {
            break MISSING_BLOCK_LABEL_73;
        }
        ((StringBuilder) (obj)).append("https://");
_L4:
        ((StringBuilder) (obj)).append("presentationtracking.netflix.com");
        ((StringBuilder) (obj)).append("/users/presentationtracking");
        mPresentationTrackingUrl = ((StringBuilder) (obj)).toString();
        obj = mPresentationTrackingUrl;
          goto _L3
        ((StringBuilder) (obj)).append("http://");
          goto _L4
        Exception exception;
        exception;
        throw exception;
    }

    public boolean isSecure()
    {
        return true;
    }

    public void setConfigurationAgentInterface(com.netflix.mediaclient.service.ServiceAgent.ConfigurationAgentInterface configurationagentinterface)
    {
        mConfigAgent = configurationagentinterface;
    }

    public void setUserAgentInterface(com.netflix.mediaclient.service.ServiceAgent.UserAgentInterface useragentinterface)
    {
        mUserAgent = useragentinterface;
    }

    public void updateApiEndpointHost(String s)
    {
        mEndpointHost = s;
        mApiEndpointUrl = null;
        mConfigEndpointUrl = null;
    }
}
