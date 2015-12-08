// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.configuration;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import bo.app.cy;
import bo.app.ev;
import bo.app.n;
import com.appboy.Constants;
import com.appboy.support.AppboyLogger;
import com.appboy.support.PackageUtils;
import java.util.Locale;
import java.util.Map;

// Referenced classes of package com.appboy.configuration:
//            CachedConfigurationProvider

public class XmlAppConfigurationProvider extends CachedConfigurationProvider
{

    private static final String a;
    private final Context b;

    public XmlAppConfigurationProvider(Context context)
    {
        super(context);
        b = context;
    }

    private int a(n n1)
    {
        if (n1.equals(n.b))
        {
            n1 = "com_appboy_push_large_notification_icon";
        } else
        {
            n1 = "com_appboy_push_small_notification_icon";
        }
        if (mConfigurationCache.containsKey(n1))
        {
            return ((Integer)mConfigurationCache.get(n1)).intValue();
        } else
        {
            int i = b.getResources().getIdentifier(n1, "drawable", PackageUtils.getResourcePackageName(b));
            mConfigurationCache.put(n1, Integer.valueOf(i));
            return i;
        }
    }

    public cy getAppboyApiKey()
    {
        cy cy2 = (cy)mConfigurationCache.get("com_appboy_api_key");
        cy cy1 = cy2;
        if (cy2 == null)
        {
            String s = b.getSharedPreferences("com_appboy_override_configuration_cache", 0).getString("com_appboy_api_key", null);
            if (s != null)
            {
                AppboyLogger.i(a, "Found an override api key.  Using it to configure Appboy.");
            } else
            {
                s = getAppboyApiKeyStringFromLocaleMapping(Locale.getDefault());
                if (s != null)
                {
                    AppboyLogger.i(a, "Found a locale that matches the current locale in appboy.xml.  Using the associated api key");
                } else
                {
                    s = readStringResourceValue("com_appboy_api_key", null);
                }
            }
            cy1 = cy2;
            if (s != null)
            {
                cy1 = new cy(s);
                mConfigurationCache.put("com_appboy_api_key", cy1);
            }
        }
        if (cy1 == null)
        {
            AppboyLogger.e(a, "****************************************************");
            AppboyLogger.e(a, "**                                                **");
            AppboyLogger.e(a, "**                 !! WARNING !!                  **");
            AppboyLogger.e(a, "**                                                **");
            AppboyLogger.e(a, "**     No API key set in res/values/appboy.xml    **");
            AppboyLogger.e(a, "** No cached API Key found from Appboy.configure  **");
            AppboyLogger.e(a, "**         Appboy functionality disabled          **");
            AppboyLogger.e(a, "**                                                **");
            AppboyLogger.e(a, "****************************************************");
            throw new RuntimeException("Unable to read the Appboy API key from the res/values/appboy.xml file. See log for more details.");
        } else
        {
            return cy1;
        }
    }

    public String getAppboyApiKeyStringFromLocaleMapping(Locale locale)
    {
        if (locale == null)
        {
            locale = a;
        } else
        {
            String as[] = readStringArrayResourceValue("com_appboy_locale_api_key_map", null);
            if (as == null)
            {
                locale = a;
                return null;
            }
            int j = as.length;
            int i = 0;
            while (i < j) 
            {
                String s = as[i];
                if (ev.a(s, ",") == 1)
                {
                    String as1[] = s.split(",");
                    if (as1.length == 2)
                    {
                        String s1 = as1[0].trim().toLowerCase();
                        boolean flag = s1.equals(locale.toString().toLowerCase());
                        if (s1.equals(locale.getCountry().toLowerCase()) || flag)
                        {
                            return as1[1].trim();
                        }
                    }
                }
                i++;
            }
        }
        return null;
    }

    public int getApplicationIconResourceId()
    {
        String s;
        int i;
        i = 0;
        if (mConfigurationCache.containsKey("application_icon"))
        {
            return ((Integer)mConfigurationCache.get("application_icon")).intValue();
        }
        s = b.getPackageName();
        int j = b.getPackageManager().getApplicationInfo(s, 0).icon;
        i = j;
_L2:
        mConfigurationCache.put("application_icon", Integer.valueOf(i));
        return i;
        android.content.pm.PackageManager.NameNotFoundException namenotfoundexception;
        namenotfoundexception;
        AppboyLogger.e(a, String.format("Cannot find package named %s", new Object[] {
            s
        }));
        j = b.getPackageManager().getApplicationInfo(b.getPackageName(), 0).icon;
        i = j;
        continue; /* Loop/switch isn't completed */
        namenotfoundexception;
        AppboyLogger.e(a, String.format("Cannot find package named %s", new Object[] {
            s
        }));
        if (true) goto _L2; else goto _L1
_L1:
    }

    public String getBaseUrlForRequests()
    {
        if ("STAGING".equals(getStringValue("com_appboy_server_target", "PROD").toUpperCase(Locale.US)))
        {
            return "https://sondheim.appboy.com/api/v2/";
        } else
        {
            return "https://dev.appboy.com/api/v2/";
        }
    }

    public int getDefaultNotificationAccentColor()
    {
        return getIntValue("com_appboy_default_notification_accent_color", 0);
    }

    public String getGcmSenderId()
    {
        return getStringValue("com_appboy_push_gcm_sender_id", null);
    }

    public int getLargeNotificationIconResourceId()
    {
        return a(n.b);
    }

    public float getLocationUpdateDistanceInMeters()
    {
        return (float)getIntValue("com_appboy_location_update_distance", -1);
    }

    public long getLocationUpdateTimeIntervalInMillis()
    {
        return 1000L * (long)getIntValue("com_appboy_location_update_time_interval", -1);
    }

    public int getSessionTimeoutSeconds()
    {
        return getIntValue("com_appboy_session_timeout", 10);
    }

    public int getSmallNotificationIconResourceId()
    {
        return a(n.a);
    }

    public int getVersionCode()
    {
        if (mConfigurationCache.containsKey("version_code"))
        {
            return ((Integer)mConfigurationCache.get("version_code")).intValue();
        }
        int i;
        try
        {
            String s = PackageUtils.getResourcePackageName(b);
            i = b.getPackageManager().getPackageInfo(s, 0).versionCode;
        }
        catch (android.content.pm.PackageManager.NameNotFoundException namenotfoundexception)
        {
            AppboyLogger.e(a, "Unable to read the version code.");
            i = -1;
        }
        mConfigurationCache.put("version_code", Integer.valueOf(i));
        return i;
    }

    public boolean isAdmMessagingRegistrationEnabled()
    {
        return getBooleanValue("com_appboy_push_adm_messaging_registration_enabled", false);
    }

    public boolean isBackgroundLocationCollectionEnabled()
    {
        return getBooleanValue("com_appboy_enable_background_location_collection", false);
    }

    public boolean isGcmMessagingRegistrationEnabled()
    {
        return getBooleanValue("com_appboy_push_gcm_messaging_registration_enabled", false);
    }

    public boolean isLocationCollectionEnabled()
    {
        boolean flag = false;
        if (!getBooleanValue("com_appboy_disable_location_collection", false))
        {
            flag = true;
        }
        return flag;
    }

    static 
    {
        a = String.format("%s.%s", new Object[] {
            Constants.APPBOY_LOG_TAG_PREFIX, com/appboy/configuration/XmlAppConfigurationProvider.getName()
        });
    }
}
