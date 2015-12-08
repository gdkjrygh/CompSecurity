// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.ibm.eo.service;

import android.app.Application;
import android.content.res.AssetManager;
import android.content.res.Resources;
import com.ibm.eo.EOCore;
import com.ibm.eo.EOLifecycleObject;
import com.ibm.eo.EOLifecycleObjectName;
import com.ibm.eo.util.LogInternal;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import org.json.JSONObject;

public class ConfigService
    implements EOLifecycleObject
{

    public static final String ADVANCED_CONFIGURATION_FILENAME = "AdvancedConfig.json";
    public static final String BASIC_CONFIGURATION_FILENAME = "BasicConfig.properties";
    public static final String DISPLAY_LOGGING = "DisplayLogging";
    public static final String PERSIST_LOCAL_CACHE = "PersistLocalCache";
    public static final String TAG = "EOCore";
    public static final String TLF_BUFFER_LIMIT = "BufferLimit";
    public static final String TLF_BUFFER_PERCENT = "BufferPercent";
    public static final String TLF_CACHED_FILE_MAX_BYTES_SIZE = "CachedFileMaxBytesSize";
    public static final String TLF_CACHED_LEVEL = "CachingLevel";
    public static final String TLF_CACHE_DIR = "TLFCache";
    public static final String TLF_COMPRESS_POST_MESSAGE = "CompressPostMessage";
    public static final String TLF_COOKIE_DOMAIN = "CookieDomain";
    public static final String TLF_COOKIE_EXPIRES = "CookieExpires";
    public static final String TLF_COOKIE_EXPIRES_FORMAT = "CookieExpiresFormat";
    public static final String TLF_COOKIE_PARAM = "CookieParam";
    public static final String TLF_COOKIE_PARAM_NATIVE_REPLAY = "TlNativeReplay";
    public static final String TLF_COOKIE_PATH = "CookiePath";
    public static final String TLF_COOKIE_SECURE = "CookieSecure";
    public static final String TLF_COOKIE_URL = "CookieUrl";
    public static final String TLF_DO_POSTS_ON_INTERVALS = "DoPostOnIntervals";
    public static final String TLF_HASUICDATA_HEADER = "X-TEALEAF_HASUICDATA";
    public static final String TLF_HEADER = "X-Tealeaf";
    public static final String TLF_KILL_SWITCH_ASYNC = "KillSwitchAsync";
    public static final String TLF_KILL_SWITCH_ENABLED = "KillSwitchEnabled";
    public static final String TLF_KILL_SWITCH_MAX_NUMBER_OF_TRIES = "KillSwitchMaxNumberOfTries";
    public static final String TLF_KILL_SWITCH_TIME_INTERVAL = "KillSwitchTimeInterval";
    public static final String TLF_KILL_SWITCH_URL = "KillSwitchUrl";
    public static final String TLF_LIBRARY_VERSION = "LibraryVersion";
    public static final String TLF_LOGGING_LEVEL = "LoggingLevel";
    public static final String TLF_MANUAL_POST_ENABLED = "ManualPostEnabled";
    public static final String TLF_MAX_STRINGS_LENGTH = "MaxStringsLength";
    public static final String TLF_MESSAGE_VERSION = "MessageVersion";
    public static final String TLF_POST_MESSAGE_LEVEL_CELLULAR = "PostMessageLevelCellular";
    public static final String TLF_POST_MESSAGE_LEVEL_WIFI = "PostMessageLevelWiFi";
    public static final String TLF_POST_MESSAGE_MAX_BYTES_SIZE = "PostMessageMaxBytesSize";
    public static final String TLF_POST_MESSAGE_SOCKET_TIMEOUT = "PostMessageSocketTimeout";
    public static final String TLF_POST_MESSAGE_TIMEOUT = "PostMessageTimeout";
    public static final String TLF_POST_MESSAGE_TIME_INTERVALS = "PostMessageTimeInterval";
    public static final String TLF_POST_MESSAGE_URL = "PostMessageUrl";
    public static final String TLF_PROPERTY_HEADER = "X-Tealeaf-Property";
    public static final String TLF_RANDOM_SAMPLE_PARAM = "RandomSampleParam";
    public static final String TLF_SESSION_HEADER = "X-Tealeaf-Session";
    public static final String TLF_SESSION_TIMEOUT = "SessionTimeout";
    public static final String TLF_SESSION_TIMEOUT_KILLSWITCH = "SessionTimeoutKillSwitch";
    public static final String TLF_USE_RANDOM_SAMPLE = "UseRandomSample";
    public static final String TLF_USE_WHITE_LIST = "UseWhiteList";
    public static final String TLF_WHITE_LIST_PARAM = "WhiteListParam";
    private Application application;
    private Map configurations;
    private Boolean isEnabled;

    public ConfigService()
    {
        isEnabled = Boolean.valueOf(false);
        application = EOCore.getApplication();
        configurations = new HashMap();
        loadConfig(EOCore.getInstance());
    }

    private Map jsonConfigForBundle(String s)
    {
        HashMap hashmap = new HashMap();
        try
        {
            Object obj = application.getResources().getAssets().open(s);
            byte abyte0[] = new byte[((InputStream) (obj)).available()];
            ((InputStream) (obj)).read(abyte0);
            ((InputStream) (obj)).close();
            obj = new JSONObject(new String(abyte0, "UTF-8"));
            if (((JSONObject) (obj)).length() != 0)
            {
                String s1;
                for (Iterator iterator = ((JSONObject) (obj)).keys(); iterator.hasNext(); hashmap.put(s1, ((JSONObject) (obj)).getString(s1)))
                {
                    s1 = (String)iterator.next();
                }

            }
        }
        catch (Exception exception)
        {
            LogInternal.logException(exception, (new StringBuilder()).append("Trying to load properties file: ").append(s).toString());
        }
        return hashmap;
    }

    private Map propertiesConfigForBundle(String s)
    {
        HashMap hashmap = new HashMap();
        try
        {
            InputStream inputstream = application.getResources().getAssets().open(s);
            Properties properties = new Properties();
            properties.load(inputstream);
            if (!properties.isEmpty())
            {
                String s1;
                for (Enumeration enumeration = properties.keys(); enumeration.hasMoreElements(); hashmap.put(s1, properties.getProperty(s1)))
                {
                    s1 = (String)enumeration.nextElement();
                }

            }
        }
        catch (Exception exception)
        {
            LogInternal.logException(exception, (new StringBuilder()).append("Trying to load properties file: ").append(s).toString());
        }
        return hashmap;
    }

    public final boolean disable()
    {
        configurations = null;
        isEnabled = Boolean.valueOf(false);
        return true;
    }

    public final boolean enable()
    {
        isEnabled = Boolean.valueOf(true);
        return true;
    }

    public final Map getConfig(EOLifecycleObjectName eolifecycleobjectname)
    {
        Map map;
        Map map1;
        if (configurations != null)
        {
            map = (Map)configurations.get(eolifecycleobjectname.name());
        } else
        {
            map = null;
        }
        map1 = map;
        if (map == null)
        {
            map1 = map;
            if (application != null)
            {
                map1 = propertiesConfigForBundle((new StringBuilder()).append(eolifecycleobjectname.name()).append("BasicConfig.properties").toString());
                map1.putAll(jsonConfigForBundle((new StringBuilder()).append(eolifecycleobjectname.name()).append("AdvancedConfig.json").toString()));
            }
        }
        return map1;
    }

    public final String getConfigItem(String s, EOLifecycleObjectName eolifecycleobjectname)
    {
        if (configurations != null && configurations.get(eolifecycleobjectname.name()) != null)
        {
            return (String)((Map)configurations.get(eolifecycleobjectname.name())).get(s);
        } else
        {
            return null;
        }
    }

    public final HashMap httpHeaders()
    {
        return null;
    }

    public final boolean isEnabled()
    {
        return isEnabled.booleanValue();
    }

    public final Boolean loadConfig(EOLifecycleObjectName eolifecycleobjectname)
    {
        Map map = getConfig(eolifecycleobjectname);
        if (map != null && configurations != null)
        {
            configurations.put(eolifecycleobjectname.name(), map);
            return Boolean.valueOf(configurations.containsKey(eolifecycleobjectname.name()));
        } else
        {
            LogInternal.log("Error loading configuration ");
            return Boolean.valueOf(false);
        }
    }

    public final String name()
    {
        return "Configuration Service";
    }

    public final boolean onDestroyEO()
    {
        return true;
    }

    public final boolean onLowMemoryEO()
    {
        return true;
    }

    public final boolean onPauseEO()
    {
        return true;
    }

    public final boolean onResumeEO()
    {
        return true;
    }

    public final boolean onTerminateEO()
    {
        return true;
    }

    public final Boolean updateConfig(String s, String s1, EOLifecycleObjectName eolifecycleobjectname)
    {
        if (configurations != null && configurations.get(eolifecycleobjectname.name()) != null)
        {
            ((Map)configurations.get(eolifecycleobjectname.name())).put(s, s1);
            return Boolean.valueOf(((Map)configurations.get(eolifecycleobjectname.name())).containsKey(s));
        } else
        {
            return Boolean.valueOf(false);
        }
    }
}
