// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.ch.qos.logback.core.joran.util;

import fs.ch.qos.logback.core.Context;
import fs.ch.qos.logback.core.joran.spi.ConfigurationWatchList;
import fs.ch.qos.logback.core.status.InfoStatus;
import fs.ch.qos.logback.core.status.Status;
import fs.ch.qos.logback.core.status.StatusManager;
import fs.ch.qos.logback.core.status.WarnStatus;
import java.io.PrintStream;
import java.net.URL;

public class ConfigurationWatchListUtil
{

    static final ConfigurationWatchListUtil origin = new ConfigurationWatchListUtil();

    private ConfigurationWatchListUtil()
    {
    }

    static void addInfo(Context context, String s)
    {
        addStatus(context, new InfoStatus(s, origin));
    }

    static void addStatus(Context context, Status status)
    {
        if (context == null)
        {
            System.out.println((new StringBuilder()).append("Null context in ").append(fs/ch/qos/logback/core/joran/spi/ConfigurationWatchList.getName()).toString());
        } else
        {
            context = context.getStatusManager();
            if (context != null)
            {
                context.add(status);
                return;
            }
        }
    }

    public static void addToWatchList(Context context, URL url)
    {
        ConfigurationWatchList configurationwatchlist = getConfigurationWatchList(context);
        if (configurationwatchlist == null)
        {
            addWarn(context, (new StringBuilder()).append("Null ConfigurationWatchList. Cannot add ").append(url).toString());
            return;
        } else
        {
            addInfo(context, (new StringBuilder()).append("Adding [").append(url).append("] to configuration watch list.").toString());
            configurationwatchlist.addToWatchList(url);
            return;
        }
    }

    static void addWarn(Context context, String s)
    {
        addStatus(context, new WarnStatus(s, origin));
    }

    public static ConfigurationWatchList getConfigurationWatchList(Context context)
    {
        if (context == null)
        {
            return null;
        } else
        {
            return (ConfigurationWatchList)context.getObject("CONFIGURATION_WATCH_LIST");
        }
    }

    public static URL getMainWatchURL(Context context)
    {
        context = getConfigurationWatchList(context);
        if (context == null)
        {
            return null;
        } else
        {
            return context.getMainURL();
        }
    }

    public static void setConfigurationWatchListResetFlag(Context context, boolean flag)
    {
        context.putObject("CONFIGURATION_WATCH_LIST_RESET", Boolean.valueOf(flag));
    }

    public static void setMainWatchURL(Context context, URL url)
    {
        if (context == null)
        {
            return;
        }
        ConfigurationWatchList configurationwatchlist = getConfigurationWatchList(context);
        if (configurationwatchlist == null)
        {
            configurationwatchlist = new ConfigurationWatchList();
            configurationwatchlist.setContext(context);
            context.putObject("CONFIGURATION_WATCH_LIST", configurationwatchlist);
        } else
        {
            configurationwatchlist.clear();
        }
        setConfigurationWatchListResetFlag(context, true);
        configurationwatchlist.setMainURL(url);
    }

    public static boolean wasConfigurationWatchListReset(Context context)
    {
        if (context == null)
        {
            return false;
        }
        context = ((Context) (context.getObject("CONFIGURATION_WATCH_LIST_RESET")));
        if (context == null)
        {
            return false;
        } else
        {
            return ((Boolean)context).booleanValue();
        }
    }

}
