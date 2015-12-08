// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.common;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.AssetManager;
import com.worklight.nativeandroid.common.WLUtils;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;

public class WLConfig
{

    private static final String ANDROID_ASSET = "/android_asset";
    private static final String APP_INSTALL_TIME_KEY = "appInstallTime";
    private static final String CLEAR_CACHE_NEXT_LOAD = "com.worklight.clearCacheNextLoad";
    public static final String ENABLE_SETTINGS = "enableSettings";
    private static final String EXIT_ON_SKIN_LOADER = "exitOnSkinLoader";
    private static final String IGNORED_FILE_EXTENSIONS = "ignoredFileExtensions";
    private static final String IN_PROGRESS_CHECKSUM = "inProgressChecksum";
    private static final String LANGUAGE_PREFS = "languagePreferences";
    private static final String NATIVE_EMPTY_APP_HTML = "NativeEmptyApp.html";
    private static final String USE_CUSTOM_SERVER_URL = "useCustomServerUrl";
    public static final String WL_APP_ID = "wlAppId";
    public static final String WL_APP_VERSION = "wlAppVersion";
    public static final String WL_CLIENT_PROPS_NAME = "wlclient.properties";
    private static final String WL_DEFAULT_SERVER_URL = "WLDefaultServerURL";
    private static final String WL_DIRECT_UPDATE_PUBLIC_KEY = "wlSecureDirectUpdatePublicKey";
    public static final String WL_DIRECT_UPDATE_TEMP_FOLDER = "wlDirectUppdateTempFolder";
    private static final String WL_ENVIRONMENT = "wlEnvironment";
    public static final String WL_GCM_SENDER = "GcmSenderId";
    private static final String WL_IS_EXTERNAL_WEBRESOURCES = "WLIsExternalWebResources";
    public static final String WL_MAIN_FILE_PATH = "wlMainFilePath";
    public static final String WL_PLATFORM_VERSION = "wlPlatformVersion";
    private static final String WL_PREFS = "WLPrefs";
    private static final String WL_RESOURCES_CHECKSUM_PREF_KEY = "wlResourcesChecksum";
    public static final String WL_SERVER_CONTEXT = "wlServerContext";
    public static final String WL_SERVER_HOST = "wlServerHost";
    public static final String WL_SERVER_PORT = "wlServerPort";
    public static final String WL_SERVER_PROTOCOL = "wlServerProtocol";
    private static final String WL_SERVER_URL = "WLServerURL";
    public static final String WL_SHARE_COOKIES = "wlShareCookies";
    public static final String WL_SHARE_USER_CERT = "wlShareUserCert";
    private static final String WL_SKIN_NAME_PREF_KEY = "wlSkinName";
    private static final String WL_TEST_WEB_RESOURCES_CHECKSUM = "testWebResourcesChecksum";
    public static final String WL_WEB_RESOURCES_UNPACKD_SIZE = "webResourcesSize";
    public static final String WL_X_PLATFORM_VERSION = "x-wl-platform-version";
    public static final String WL_X_VERSION_HEADER = "x-wl-app-version";
    private static WLConfig singleton = null;
    private String absolutePathToExternalAppFiles;
    private boolean isApplicationForeground;
    private boolean isInitComplete;
    private SharedPreferences prefs;
    private Properties wlProperties;

    private WLConfig(Context context)
    {
        wlProperties = new Properties();
        prefs = null;
        isInitComplete = false;
        isApplicationForeground = false;
        try
        {
            wlProperties.load(context.getAssets().open("wlclient.properties"));
            prefs = context.getSharedPreferences("WLPrefs", 0);
            absolutePathToExternalAppFiles = context.getFilesDir().getAbsolutePath();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new RuntimeException("WLConfig(): Can't load wlclient.properties file");
        }
    }

    public static void createInstance(Context context)
    {
        com/worklight/common/WLConfig;
        JVM INSTR monitorenter ;
        if (singleton == null)
        {
            singleton = new WLConfig(context.getApplicationContext());
        }
        com/worklight/common/WLConfig;
        JVM INSTR monitorexit ;
        return;
        context;
        throw context;
    }

    private String getDefaultHost()
    {
        return wlProperties.getProperty("wlServerHost");
    }

    private String getDefaultPort()
    {
        return wlProperties.getProperty("wlServerPort");
    }

    private String getDefaultProtocol()
    {
        return wlProperties.getProperty("wlServerProtocol");
    }

    private String getDefaultRootUrl()
    {
        String s;
        String s1;
        boolean flag;
        if ("https".equalsIgnoreCase(getDefaultProtocol()) && "443".equals(getDefaultPort()))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (WLUtils.isStringEmpty(getDefaultPort()) || flag)
        {
            s = "";
        } else
        {
            s = (new StringBuilder()).append(":").append(getDefaultPort()).toString();
        }
        if (WLUtils.isStringEmpty(getDefaultProtocol()) || getDefaultServerContext().equals("/"))
        {
            s1 = "";
        } else
        {
            s1 = getDefaultServerContext();
        }
        s1 = String.format("%s://%s%s%s", new Object[] {
            getDefaultProtocol(), getDefaultHost(), s, s1
        });
        s = s1;
        if (s1.endsWith("/"))
        {
            s = s1.substring(0, s1.length() - 1);
        }
        return s;
    }

    private String getDefaultServerContext()
    {
        return wlProperties.getProperty("wlServerContext");
    }

    public static WLConfig getInstance()
    {
        if (singleton == null)
        {
            throw new IllegalStateException("getInstance can't be called before createInstance");
        } else
        {
            return singleton;
        }
    }

    private String getPropertyOrPref(String s, String s1)
    {
        String s2 = prefs.getString(s1, null);
        s1 = s2;
        if (s2 == null)
        {
            s1 = (String)wlProperties.get(s);
        }
        return s1;
    }

    public void clearWLPref()
    {
        android.content.SharedPreferences.Editor editor = prefs.edit();
        editor.clear();
        editor.commit();
    }

    public String getAppId()
    {
        return getPropertyOrPref("wlAppId", "appIdPref");
    }

    public URL getAppURL()
    {
        URL url;
        try
        {
            url = new URL((new StringBuilder()).append(getRootURL()).append("/apps/services/api/").append(getAppId()).append("/").append(getWLEnvironment()).append("/").toString());
        }
        catch (MalformedURLException malformedurlexception)
        {
            throw new RuntimeException((new StringBuilder()).append("Could not parse URL; check assets/wlclient.properties. ").append(malformedurlexception.getMessage()).toString(), malformedurlexception);
        }
        return url;
    }

    public String getAppWebUrl(String s)
    {
        String s1 = getMainFileFromDescriptor();
        if ((new File((new StringBuilder()).append(getWebResourcesUrl()).append("/").append(s).append("/").append("NativeEmptyApp.html").toString())).exists())
        {
            s1 = "NativeEmptyApp.html";
        }
        return (new StringBuilder()).append(getWebUrl()).append("/").append(s).append("/").append(s1).toString();
    }

    public String getApplicationAbsolutePathToExternalAppFiles()
    {
        return absolutePathToExternalAppFiles;
    }

    public String getApplicationAbsolutePathToExternalWWWFiles()
    {
        return (new StringBuilder()).append(absolutePathToExternalAppFiles).append("/www").toString();
    }

    public long getApplicationInstallTime()
    {
        return readLongWLPref("appInstallTime");
    }

    public String getApplicationVersion()
    {
        return getPropertyOrPref("wlAppVersion", "appVersionPref");
    }

    public String getDirectUpdatePublicKey()
    {
        return wlProperties.getProperty("wlSecureDirectUpdatePublicKey", "");
    }

    public String getHost()
    {
        String s = getRootURL();
        if (s != null)
        {
            try
            {
                s = (new URL(s)).getHost();
            }
            catch (MalformedURLException malformedurlexception)
            {
                return wlProperties.getProperty("wlServerHost");
            }
            return s;
        } else
        {
            return wlProperties.getProperty("wlServerHost");
        }
    }

    public long getInProgressChecksumPref()
    {
        return readLongWLPref("inProgressChecksum");
    }

    public String getLanguagePreferences()
    {
        return wlProperties.getProperty("languagePreferences");
    }

    public String getLocalStorageRoot()
    {
        if (isExternalWebResources())
        {
            return getApplicationAbsolutePathToExternalAppFiles();
        } else
        {
            return "/android_asset";
        }
    }

    public String getMainFileFromDescriptor()
    {
        return wlProperties.getProperty("wlMainFilePath");
    }

    public String getMainFilePath()
    {
        return (new StringBuilder()).append(getAppId()).append(".html").toString();
    }

    public String[] getMediaExtensions()
    {
        String s = wlProperties.getProperty("ignoredFileExtensions");
        if (s != null)
        {
            return s.replaceAll(" ", "").split(",");
        } else
        {
            return null;
        }
    }

    public String getPlatformVersion()
    {
        return wlProperties.getProperty("wlPlatformVersion");
    }

    public String getPort()
    {
        Object obj = getRootURL();
        if (obj != null)
        {
            try
            {
                obj = new URL(((String) (obj)));
                obj = (new StringBuilder()).append("").append(((URL) (obj)).getPort()).toString();
            }
            catch (MalformedURLException malformedurlexception)
            {
                return wlProperties.getProperty("wlServerPort");
            }
            return ((String) (obj));
        } else
        {
            return wlProperties.getProperty("wlServerPort");
        }
    }

    public String getProtocol()
    {
        String s = getRootURL();
        if (s != null)
        {
            try
            {
                s = (new URL(s)).getProtocol();
            }
            catch (MalformedURLException malformedurlexception)
            {
                return wlProperties.getProperty("wlServerProtocol");
            }
            return s;
        } else
        {
            return wlProperties.getProperty("wlServerProtocol");
        }
    }

    public String getResourceChecksumPref()
    {
        return readWLPref("wlResourcesChecksum");
    }

    public String getRootURL()
    {
        String s;
        if (!shouldUseCustomServerUrl())
        {
            s = getDefaultRootUrl();
        } else
        {
            String s1 = prefs.getString("WLServerURL", null);
            s = s1;
            if (s1 == null)
            {
                return getDefaultRootUrl();
            }
        }
        return s;
    }

    public String getServerContext()
    {
        String s = getRootURL();
        if (s != null)
        {
            try
            {
                s = (new URL(s)).getPath();
            }
            catch (MalformedURLException malformedurlexception)
            {
                return wlProperties.getProperty("wlServerContext");
            }
            return s;
        } else
        {
            return wlProperties.getProperty("wlServerContext");
        }
    }

    public String getSettingsFlag()
    {
        return wlProperties.getProperty("enableSettings");
    }

    public List getShareCookies()
    {
        String s1 = wlProperties.getProperty("wlShareCookies");
        String s = s1;
        if (s1 == null)
        {
            s = "";
        }
        return Arrays.asList(s.split(","));
    }

    public String getSkinNamePref()
    {
        return readWLPref("wlSkinName");
    }

    public String getTestWebResourcesChecksumFlag()
    {
        return wlProperties.getProperty("testWebResourcesChecksum");
    }

    public String getWLEnvironment()
    {
        String s1 = wlProperties.getProperty("wlEnvironment", null);
        String s = s1;
        if (s1 == null)
        {
            s = "android";
        }
        return s;
    }

    public String getWebResourcesUnpackedSize()
    {
        return wlProperties.getProperty("webResourcesSize");
    }

    public String getWebResourcesUrl()
    {
        return (new StringBuilder()).append(getLocalStorageRoot()).append("/www").toString();
    }

    public String getWebUrl()
    {
        return (new StringBuilder()).append("file://").append(getWebResourcesUrl()).toString();
    }

    public boolean isClearCacheNextLoad()
    {
        return prefs.getBoolean("com.worklight.clearCacheNextLoad", false);
    }

    public boolean isExternalWebResources()
    {
        return Boolean.valueOf(readWLPref("WLIsExternalWebResources")).booleanValue();
    }

    public boolean isHybridActivityInForeground()
    {
        return isApplicationForeground;
    }

    public boolean isInitComplete()
    {
        return isInitComplete;
    }

    public boolean isShareUserCert()
    {
        return Boolean.valueOf(wlProperties.getProperty("wlShareUserCert")).booleanValue();
    }

    public boolean isShouldTestWebResourcesChecksum()
    {
        return getTestWebResourcesChecksumFlag().equals("true");
    }

    public long readLongWLPref(String s)
    {
        return prefs.getLong(s, 0L);
    }

    public String readWLPref(String s)
    {
        return prefs.getString(s, null);
    }

    public void setApplicationInstallTime(long l)
    {
        writeLongWLPref("appInstallTime", l);
    }

    public void setClearCacheNextLoadPref(boolean flag)
    {
        android.content.SharedPreferences.Editor editor = prefs.edit();
        editor.putBoolean("com.worklight.clearCacheNextLoad", flag);
        editor.commit();
    }

    public void setDefaultRootUrlPref()
    {
        writeWLPref("WLDefaultServerURL", getDefaultRootUrl());
    }

    public void setExitOnSkinLoaderPref(boolean flag)
    {
        writeWLPref("exitOnSkinLoader", Boolean.toString(flag));
    }

    public void setExternalWebResourcesPref(boolean flag)
    {
        writeWLPref("WLIsExternalWebResources", Boolean.toString(flag));
    }

    public void setHybridActivityInForeground(boolean flag)
    {
        isApplicationForeground = flag;
    }

    public void setInProgressChecksumPref(long l)
    {
        writeLongWLPref("inProgressChecksum", l);
    }

    public void setInitComplete(boolean flag)
    {
        isInitComplete = flag;
    }

    public void setResourceChecksumPref(String s)
    {
        writeWLPref("wlResourcesChecksum", s);
    }

    public void setServerUrl(String s)
    {
        useCustomServerUrl(true);
        writeWLPref("WLServerURL", s);
    }

    public boolean shouldUseCustomServerUrl()
    {
        return Boolean.valueOf(prefs.getString("useCustomServerUrl", null)).booleanValue();
    }

    public void useCustomServerUrl(boolean flag)
    {
        writeWLPref("useCustomServerUrl", Boolean.toString(flag));
    }

    public void writeLongWLPref(String s, long l)
    {
        android.content.SharedPreferences.Editor editor = prefs.edit();
        editor.putLong(s, l);
        editor.commit();
    }

    public void writeWLPref(String s, String s1)
    {
        android.content.SharedPreferences.Editor editor = prefs.edit();
        editor.putString(s, s1);
        editor.commit();
    }

}
