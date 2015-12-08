// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.cordova.api;

import java.io.PrintStream;
import org.apache.cordova.CordovaWebView;

// Referenced classes of package org.apache.cordova.api:
//            CordovaPlugin, CordovaInterface

public class PluginEntry
{

    public boolean onload;
    public CordovaPlugin plugin;
    public String pluginClass;
    public String service;

    public PluginEntry(String s, String s1, boolean flag)
    {
        service = "";
        pluginClass = "";
        plugin = null;
        onload = false;
        service = s;
        pluginClass = s1;
        onload = flag;
    }

    private Class getClassByName(String s)
        throws ClassNotFoundException
    {
        Class class1 = null;
        if (s != null)
        {
            class1 = Class.forName(s);
        }
        return class1;
    }

    private boolean isCordovaPlugin(Class class1)
    {
        if (class1 != null)
        {
            return org/apache/cordova/api/CordovaPlugin.isAssignableFrom(class1);
        } else
        {
            return false;
        }
    }

    public CordovaPlugin createPlugin(CordovaWebView cordovawebview, CordovaInterface cordovainterface)
    {
        if (plugin != null)
        {
            return plugin;
        }
        Class class1 = getClassByName(pluginClass);
        if (!isCordovaPlugin(class1))
        {
            break MISSING_BLOCK_LABEL_94;
        }
        plugin = (CordovaPlugin)class1.newInstance();
        plugin.initialize(cordovainterface, cordovawebview);
        cordovawebview = plugin;
        return cordovawebview;
        cordovawebview;
        cordovawebview.printStackTrace();
        System.out.println((new StringBuilder()).append("Error adding plugin ").append(pluginClass).append(".").toString());
        return null;
    }
}
