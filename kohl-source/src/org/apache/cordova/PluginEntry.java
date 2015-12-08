// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.cordova;

import java.util.List;

// Referenced classes of package org.apache.cordova:
//            CordovaPlugin

public class PluginEntry
{

    public boolean onload;
    public CordovaPlugin plugin;
    public String pluginClass;
    public String service;
    private List urlFilters;

    public PluginEntry(String s, String s1, boolean flag)
    {
        this(s, s1, flag, null, null);
    }

    public PluginEntry(String s, String s1, boolean flag, List list)
    {
        service = s;
        pluginClass = s1;
        onload = flag;
        urlFilters = list;
        plugin = null;
    }

    private PluginEntry(String s, String s1, boolean flag, CordovaPlugin cordovaplugin, List list)
    {
        service = s;
        pluginClass = s1;
        onload = flag;
        urlFilters = list;
        plugin = cordovaplugin;
    }

    public PluginEntry(String s, CordovaPlugin cordovaplugin)
    {
        this(s, cordovaplugin.getClass().getName(), true, cordovaplugin, null);
    }

    public List getUrlFilters()
    {
        return urlFilters;
    }
}
