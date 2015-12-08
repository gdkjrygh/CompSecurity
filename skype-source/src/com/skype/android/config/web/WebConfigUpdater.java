// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.config.web;

import android.content.Context;
import com.skype.android.config.ApplicationConfig;
import com.skype.android.config.UpdateConfig;
import com.skype.android.util.HttpUtil;
import com.skype.android.util.MethodTrace;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.skype.android.config.web:
//            UpdateConfigParser, CrashReporterConfigParser, ConfigParser

public class WebConfigUpdater
{

    private static final int FIVE_MINUTES = 0x493e0;
    private static final Logger LOG = Logger.getLogger("WebConfigUpdater");
    private static final int TWENTY_FOUR_HOURS = 0x5265c00;
    private static final int WHITELIST_MAX_AGE = 0x5265c00;
    private ApplicationConfig config;
    private Context context;
    private HttpUtil httpUtil;
    private List updateConfigParsers;

    public WebConfigUpdater(Context context1, HttpUtil httputil)
    {
        context = context1;
        config = ApplicationConfig.getInstance();
        httpUtil = httputil;
        updateConfigParsers = new ArrayList();
        updateConfigParsers.add(new UpdateConfigParser());
        updateConfigParsers.add(new CrashReporterConfigParser());
    }

    private String downloadUrlString(String s)
        throws IOException
    {
        LOG.info(String.format("GET: %s", new Object[] {
            s
        }));
        s = httpUtil.a(s);
        return httpUtil.c(s);
    }

    private Object getJsonFor(JSONObject jsonobject, ConfigParser configparser)
    {
        if (configparser.isArray())
        {
            return jsonobject.optJSONArray(configparser.getKey());
        } else
        {
            return jsonobject.optJSONObject(configparser.getKey());
        }
    }

    private void parseConfigEntry(JSONObject jsonobject, List list)
        throws JSONException
    {
        if (jsonobject != null)
        {
            list = list.iterator();
            do
            {
                if (!list.hasNext())
                {
                    break;
                }
                ConfigParser configparser = (ConfigParser)list.next();
                Object obj = getJsonFor(jsonobject, configparser);
                if (obj != null)
                {
                    configparser.parse(context, config, obj);
                }
            } while (true);
        }
    }

    public boolean shouldRefreshConfig()
    {
        boolean flag2 = false;
        UpdateConfig updateconfig = config.getUpdateConfig();
        boolean flag;
        boolean flag1;
        if (updateconfig.getLastOsVersion() != android.os.Build.VERSION.SDK_INT)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (System.currentTimeMillis() - updateconfig.getLastUpdateTimestamp() > 0x5265c00L)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (flag || flag1)
        {
            flag2 = true;
        }
        return flag2;
    }

    public boolean updateVersionInfo(String s)
        throws JSONException, IOException
    {
        if (shouldRefreshConfig())
        {
            MethodTrace methodtrace = new MethodTrace("WebConfigUpdater", "updateVersionInfo");
            s = downloadUrlString(s);
            if (s != null)
            {
                parseConfigEntry((new JSONObject(s)).getJSONObject("android"), updateConfigParsers);
                methodtrace.b();
                return true;
            }
        }
        return false;
    }

}
