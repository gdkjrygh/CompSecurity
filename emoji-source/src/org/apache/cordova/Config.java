// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.cordova;

import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import java.util.List;

// Referenced classes of package org.apache.cordova:
//            ConfigXmlParser, Whitelist, CordovaPreferences

public class Config
{

    private static final String TAG = "Config";
    static ConfigXmlParser parser;

    private Config()
    {
    }

    public static void addWhiteListEntry(String s, boolean flag)
    {
        if (parser == null)
        {
            Log.e("Config", "Config was not initialised. Did you forget to Config.init(this)?");
            return;
        } else
        {
            parser.getInternalWhitelist().addWhiteListEntry(s, flag);
            return;
        }
    }

    public static String getErrorUrl()
    {
        return parser.getPreferences().getString("errorurl", null);
    }

    public static Whitelist getExternalWhitelist()
    {
        return parser.getExternalWhitelist();
    }

    public static List getPluginEntries()
    {
        return parser.getPluginEntries();
    }

    public static CordovaPreferences getPreferences()
    {
        return parser.getPreferences();
    }

    public static String getStartUrl()
    {
        if (parser == null)
        {
            return "file:///android_asset/www/index.html";
        } else
        {
            return parser.getLaunchUrl();
        }
    }

    public static Whitelist getWhitelist()
    {
        return parser.getInternalWhitelist();
    }

    public static void init()
    {
        if (parser == null)
        {
            parser = new ConfigXmlParser();
        }
    }

    public static void init(Activity activity)
    {
        parser = new ConfigXmlParser();
        parser.parse(activity);
        parser.getPreferences().setPreferencesBundle(activity.getIntent().getExtras());
        parser.getPreferences().copyIntoIntentExtras(activity);
    }

    public static boolean isInitialized()
    {
        return parser != null;
    }

    public static boolean isUrlExternallyWhiteListed(String s)
    {
        if (parser == null)
        {
            Log.e("Config", "Config was not initialised. Did you forget to Config.init(this)?");
            return false;
        } else
        {
            return parser.getExternalWhitelist().isUrlWhiteListed(s);
        }
    }

    public static boolean isUrlWhiteListed(String s)
    {
        if (parser == null)
        {
            Log.e("Config", "Config was not initialised. Did you forget to Config.init(this)?");
            return false;
        } else
        {
            return parser.getInternalWhitelist().isUrlWhiteListed(s);
        }
    }
}
