// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.content.browser;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import java.util.Iterator;
import java.util.List;

public class PepperPluginManager
{

    private static final String DESCRIPTION = "description";
    private static final String FILENAME = "filename";
    private static final String LOGTAG = "PepperPluginManager";
    private static final String MIMETYPE = "mimetype";
    private static final String NAME = "name";
    public static final String PEPPER_PLUGIN_ACTION = "org.chromium.intent.PEPPERPLUGIN";
    public static final String PEPPER_PLUGIN_ROOT = "/system/lib/pepperplugin/";
    private static final String VERSION = "version";

    public PepperPluginManager()
    {
    }

    private static String getPluginDescription(Bundle bundle)
    {
        String s1 = bundle.getString("filename");
        String s;
        if (s1 != null && !s1.isEmpty())
        {
            if ((s = bundle.getString("mimetype")) != null && !s.isEmpty())
            {
                StringBuffer stringbuffer = new StringBuffer("/system/lib/pepperplugin/");
                stringbuffer.append(s1);
                s1 = bundle.getString("name");
                String s2 = bundle.getString("description");
                bundle = bundle.getString("version");
                if (s1 != null && !s1.isEmpty())
                {
                    stringbuffer.append("#");
                    stringbuffer.append(s1);
                    if (s2 != null && !s2.isEmpty())
                    {
                        stringbuffer.append("#");
                        stringbuffer.append(s2);
                        if (bundle != null && !bundle.isEmpty())
                        {
                            stringbuffer.append("#");
                            stringbuffer.append(bundle);
                        }
                    }
                }
                stringbuffer.append(';');
                stringbuffer.append(s);
                return stringbuffer.toString();
            }
        }
        return null;
    }

    public static String getPlugins(Context context)
    {
        StringBuffer stringbuffer;
        Iterator iterator;
        stringbuffer = new StringBuffer();
        context = context.getPackageManager();
        iterator = context.queryIntentServices(new Intent("org.chromium.intent.PEPPERPLUGIN"), 132).iterator();
_L2:
        Object obj;
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        ResolveInfo resolveinfo = (ResolveInfo)iterator.next();
        obj = resolveinfo.serviceInfo;
        if (obj == null || ((ServiceInfo) (obj)).metaData == null || ((ServiceInfo) (obj)).packageName == null)
        {
            Log.e("PepperPluginManager", (new StringBuilder()).append("Can't get service information from ").append(resolveinfo).toString());
            continue; /* Loop/switch isn't completed */
        }
        PackageInfo packageinfo = context.getPackageInfo(((ServiceInfo) (obj)).packageName, 0);
        if (packageinfo != null && (packageinfo.applicationInfo.flags & 1) != 0)
        {
            Log.i("PepperPluginManager", (new StringBuilder()).append("The given plugin package is preloaded: ").append(((ServiceInfo) (obj)).packageName).toString());
            obj = getPluginDescription(((ServiceInfo) (obj)).metaData);
            if (obj != null)
            {
                if (stringbuffer.length() > 0)
                {
                    stringbuffer.append(',');
                }
                stringbuffer.append(((String) (obj)));
            }
        }
        continue; /* Loop/switch isn't completed */
        android.content.pm.PackageManager.NameNotFoundException namenotfoundexception;
        namenotfoundexception;
        Log.e("PepperPluginManager", (new StringBuilder()).append("Can't find plugin: ").append(((ServiceInfo) (obj)).packageName).toString());
        if (true) goto _L2; else goto _L1
_L1:
        return stringbuffer.toString();
    }
}
