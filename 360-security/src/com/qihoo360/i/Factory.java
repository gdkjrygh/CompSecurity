// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo360.i;

import android.content.Context;

// Referenced classes of package com.qihoo360.i:
//            IPluginManager, IModule

public class Factory
{

    public static final String PLUGIN_ENTRY_CLASS_NAME = "Entry";
    public static final String PLUGIN_ENTRY_EXPORT_METHOD_NAME = "create";
    public static final Class PLUGIN_ENTRY_EXPORT_METHOD_PARAMS[] = {
        android/content/Context, com/qihoo360/i/IPluginManager
    };
    public static final String PLUGIN_ENTRY_PACKAGE_PREFIX = "com.qihoo360.plugin";
    public static IPluginManager sPluginManager;

    public Factory()
    {
    }

    public static final IModule query(String s, Class class1)
    {
        return sPluginManager.query(s, class1);
    }

    public static final Context queryPluginContext(String s)
    {
        return sPluginManager.queryPluginContext(s);
    }

}
