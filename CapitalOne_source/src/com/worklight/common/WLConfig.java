// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.common;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.AssetManager;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

// Referenced classes of package com.worklight.common:
//            WLUtils

public class WLConfig
{

    public static final String ENABLE_SETTINGS = "enableSettings";
    private static final String IGNORED_FILE_EXTENSIONS = "ignoredFileExtensions";
    public static final String WL_APP_ID = "wlAppId";
    public static final String WL_APP_VERSION = "wlAppVersion";
    public static final String WL_CLIENT_PROPS_NAME = "wlclient.properties";
    public static final String WL_GCM_SENDER = "GcmSenderId";
    private static final String WL_PREFS = "WLPrefs";
    public static final String WL_SERVER_CONTEXT = "wlServerContext";
    public static final String WL_SERVER_HOST = "wlServerHost";
    public static final String WL_SERVER_PORT = "wlServerPort";
    public static final String WL_SERVER_PROTOCOL = "wlServerProtocol";
    private static final String WL_TEST_WEB_RESOURCES_CHECKSUM = "testWebResourcesChecksum";
    public static final String WL_X_VERSION_HEADER = "x-wl-app-version";
    private SharedPreferences prefs;
    private Properties wlProperties;

    public WLConfig(Activity activity)
    {
        this(((Context) (activity.getApplication())));
    }

    public WLConfig(Context context)
    {
        wlProperties = new Properties();
        prefs = null;
        try
        {
            wlProperties.load(context.getAssets().open("wlclient.properties"));
            prefs = context.getSharedPreferences("WLPrefs", 0);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new RuntimeException("WLConfig(): Can't load wlclient.properties file");
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

    public String getAppId()
    {
        return getPropertyOrPref("wlAppId", "appIdPref");
    }

    public URL getAppURL()
    {
        URL url;
        try
        {
            url = new URL((new StringBuilder(String.valueOf(getRootURL()))).append("/apps/services/api/").append(getAppId()).append("/android/0/").toString());
        }
        catch (MalformedURLException malformedurlexception)
        {
            throw new RuntimeException((new StringBuilder("Could not parse URL; check assets/wlclient.properties. ")).append(malformedurlexception.getMessage()).toString(), malformedurlexception);
        }
        return url;
    }

    public String getApplicationVersion()
    {
        return getPropertyOrPref("wlAppVersion", "appVersionPref");
    }

    public String getContext()
    {
        return (String)wlProperties.get("wlServerContext");
    }

    public String getDefaultRootUrl()
    {
        String s;
        String s1;
        if (WLUtils.isStringEmpty(getPort()))
        {
            s = "";
        } else
        {
            s = (new StringBuilder(":")).append(getPort()).toString();
        }
        if (WLUtils.isStringEmpty(getContext()) || getContext().equals("/"))
        {
            s1 = "";
        } else
        {
            s1 = getContext();
        }
        s1 = String.format("%s://%s%s%s", new Object[] {
            getProtocol(), getHost(), s, s1
        });
        s = s1;
        if (s1.endsWith("/"))
        {
            s = s1.substring(0, s1.length() - 1);
        }
        return s;
    }

    public String getGCMSender()
    {
        String s1 = wlProperties.getProperty("GcmSenderId");
        String s = s1;
        if (s1 != null)
        {
            s = s1.trim();
        }
        return s;
    }

    public String getHost()
    {
        return (String)wlProperties.get("wlServerHost");
    }

    public String getMainFilePath()
    {
        return (new StringBuilder(String.valueOf(getAppId()))).append(".html").toString();
    }

    public String[] getMediaExtensions()
    {
        String s = (String)wlProperties.get("ignoredFileExtensions");
        if (s != null)
        {
            return s.replaceAll(" ", "").split(",");
        } else
        {
            return null;
        }
    }

    public String getPort()
    {
        return (String)wlProperties.get("wlServerPort");
    }

    public String getProtocol()
    {
        return (String)wlProperties.get("wlServerProtocol");
    }

    public String getRootURL()
    {
        String s1 = prefs.getString("WLServerURL", null);
        String s = s1;
        if (s1 == null)
        {
            s = getDefaultRootUrl();
        }
        return s;
    }

    public String getSettingsFlag()
    {
        return (String)wlProperties.get("enableSettings");
    }

    public String getTestWebResourcesChecksumFlag()
    {
        return (String)wlProperties.get("testWebResourcesChecksum");
    }
}
