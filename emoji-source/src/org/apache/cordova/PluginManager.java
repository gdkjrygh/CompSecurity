// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.cordova;

import android.content.Intent;
import android.net.Uri;
import android.os.Debug;
import android.util.Log;
import java.io.PrintStream;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;

// Referenced classes of package org.apache.cordova:
//            ConfigXmlParser, CordovaInterface, CordovaPlugin, PluginEntry, 
//            CordovaWebView, PluginResult, CallbackContext, LOG

public class PluginManager
{

    private static final int SLOW_EXEC_WARNING_THRESHOLD;
    private static String TAG = "PluginManager";
    private final CordovaWebView app;
    private final CordovaInterface ctx;
    private final HashMap entryMap;
    private final HashMap pluginMap;
    protected HashMap urlMap;

    PluginManager(CordovaWebView cordovawebview, CordovaInterface cordovainterface)
    {
        this(cordovawebview, cordovainterface, null);
    }

    PluginManager(CordovaWebView cordovawebview, CordovaInterface cordovainterface, List list)
    {
        pluginMap = new HashMap();
        entryMap = new HashMap();
        urlMap = new HashMap();
        ctx = cordovainterface;
        app = cordovawebview;
        cordovawebview = list;
        if (list == null)
        {
            cordovawebview = new ConfigXmlParser();
            cordovawebview.parse(ctx.getActivity());
            cordovawebview = cordovawebview.getPluginEntries();
        }
        setPluginEntries(cordovawebview);
    }

    private CordovaPlugin instantiatePlugin(String s)
    {
_L2:
        if (flag & org/apache/cordova/CordovaPlugin.isAssignableFrom(((Class) (obj))))
        {
            cordovaplugin = (CordovaPlugin)((Class) (obj)).newInstance();
        }
        return cordovaplugin;
        CordovaPlugin cordovaplugin = null;
        Object obj1 = null;
        Object obj = obj1;
        boolean flag;
        if (s != null)
        {
            obj = obj1;
            try
            {
                if (!"".equals(s))
                {
                    obj = Class.forName(s);
                }
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                ((Exception) (obj)).printStackTrace();
                System.out.println((new StringBuilder()).append("Error adding plugin ").append(s).append(".").toString());
                return null;
            }
        }
        while (obj == null) 
        {
            flag = false;
            continue; /* Loop/switch isn't completed */
        }
        flag = true;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public void addService(String s, String s1)
    {
        addService(new PluginEntry(s, s1, false));
    }

    public void addService(PluginEntry pluginentry)
    {
        entryMap.put(pluginentry.service, pluginentry);
        List list = pluginentry.getUrlFilters();
        if (list != null)
        {
            urlMap.put(pluginentry.service, list);
        }
        if (pluginentry.plugin != null)
        {
            pluginentry.plugin.privateInitialize(ctx, app, app.getPreferences());
            pluginMap.put(pluginentry.service, pluginentry.plugin);
        }
    }

    public void clearPluginObjects()
    {
        pluginMap.clear();
    }

    public void exec(String s, String s1, String s2, String s3)
    {
        CordovaPlugin cordovaplugin = getPlugin(s);
        if (cordovaplugin != null) goto _L2; else goto _L1
_L1:
        Log.d(TAG, (new StringBuilder()).append("exec() call to unknown plugin: ").append(s).toString());
        s = new PluginResult(PluginResult.Status.CLASS_NOT_FOUND_EXCEPTION);
        app.sendPluginResult(s, s2);
_L4:
        return;
_L2:
        s2 = new CallbackContext(s2, app);
        boolean flag;
        long l = System.currentTimeMillis();
        flag = cordovaplugin.execute(s1, s3, s2);
        l = System.currentTimeMillis() - l;
        if (l > (long)SLOW_EXEC_WARNING_THRESHOLD)
        {
            Log.w(TAG, (new StringBuilder()).append("THREAD WARNING: exec() call to ").append(s).append(".").append(s1).append(" blocked the main thread for ").append(l).append("ms. Plugin should use CordovaInterface.getThreadPool().").toString());
        }
        if (!flag)
        {
            try
            {
                s2.sendPluginResult(new PluginResult(PluginResult.Status.INVALID_ACTION));
                return;
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                s2.sendPluginResult(new PluginResult(PluginResult.Status.JSON_EXCEPTION));
                return;
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                Log.e(TAG, "Uncaught exception from plugin", s);
            }
            s2.error(s.getMessage());
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void exec(String s, String s1, String s2, String s3, boolean flag)
    {
        exec(s, s1, s2, s3);
    }

    public CordovaPlugin getPlugin(String s)
    {
        CordovaPlugin cordovaplugin = (CordovaPlugin)pluginMap.get(s);
        Object obj = cordovaplugin;
        if (cordovaplugin == null)
        {
            obj = (PluginEntry)entryMap.get(s);
            if (obj == null)
            {
                return null;
            }
            if (((PluginEntry) (obj)).plugin != null)
            {
                obj = ((PluginEntry) (obj)).plugin;
            } else
            {
                obj = instantiatePlugin(((PluginEntry) (obj)).pluginClass);
            }
            ((CordovaPlugin) (obj)).privateInitialize(ctx, app, app.getPreferences());
            pluginMap.put(s, obj);
        }
        return ((CordovaPlugin) (obj));
    }

    public void init()
    {
        LOG.d(TAG, "init()");
        onPause(false);
        onDestroy();
        pluginMap.clear();
        startupPlugins();
    }

    public void loadPlugins()
    {
    }

    public void onDestroy()
    {
        for (Iterator iterator = pluginMap.values().iterator(); iterator.hasNext(); ((CordovaPlugin)iterator.next()).onDestroy()) { }
    }

    public void onNewIntent(Intent intent)
    {
        for (Iterator iterator = pluginMap.values().iterator(); iterator.hasNext(); ((CordovaPlugin)iterator.next()).onNewIntent(intent)) { }
    }

    public boolean onOverrideUrlLoading(String s)
    {
        Iterator iterator = entryMap.values().iterator();
label0:
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Object obj = (PluginEntry)iterator.next();
            Object obj1 = (List)urlMap.get(((PluginEntry) (obj)).service);
            if (obj1 != null)
            {
                obj1 = ((List) (obj1)).iterator();
                do
                {
                    if (!((Iterator) (obj1)).hasNext())
                    {
                        continue label0;
                    }
                } while (!s.startsWith((String)((Iterator) (obj1)).next()));
                return getPlugin(((PluginEntry) (obj)).service).onOverrideUrlLoading(s);
            }
            obj = (CordovaPlugin)pluginMap.get(((PluginEntry) (obj)).service);
            if (obj != null && ((CordovaPlugin) (obj)).onOverrideUrlLoading(s))
            {
                return true;
            }
        } while (true);
        return false;
    }

    public void onPause(boolean flag)
    {
        for (Iterator iterator = pluginMap.values().iterator(); iterator.hasNext(); ((CordovaPlugin)iterator.next()).onPause(flag)) { }
    }

    public void onReset()
    {
        for (Iterator iterator = pluginMap.values().iterator(); iterator.hasNext(); ((CordovaPlugin)iterator.next()).onReset()) { }
    }

    public void onResume(boolean flag)
    {
        for (Iterator iterator = pluginMap.values().iterator(); iterator.hasNext(); ((CordovaPlugin)iterator.next()).onResume(flag)) { }
    }

    public Object postMessage(String s, Object obj)
    {
        Object obj1 = ctx.onMessage(s, obj);
        if (obj1 != null)
        {
            return obj1;
        }
        for (Iterator iterator = pluginMap.values().iterator(); iterator.hasNext();)
        {
            Object obj2 = ((CordovaPlugin)iterator.next()).onMessage(s, obj);
            if (obj2 != null)
            {
                return obj2;
            }
        }

        return null;
    }

    Uri remapUri(Uri uri)
    {
        for (Iterator iterator = pluginMap.values().iterator(); iterator.hasNext();)
        {
            Uri uri1 = ((CordovaPlugin)iterator.next()).remapUri(uri);
            if (uri1 != null)
            {
                return uri1;
            }
        }

        return null;
    }

    public void setPluginEntries(List list)
    {
        onPause(false);
        onDestroy();
        pluginMap.clear();
        urlMap.clear();
        for (list = list.iterator(); list.hasNext(); addService((PluginEntry)list.next())) { }
    }

    public void startupPlugins()
    {
        Iterator iterator = entryMap.values().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            PluginEntry pluginentry = (PluginEntry)iterator.next();
            if (pluginentry.onload)
            {
                getPlugin(pluginentry.service);
            }
        } while (true);
    }

    static 
    {
        int i;
        if (Debug.isDebuggerConnected())
        {
            i = 60;
        } else
        {
            i = 16;
        }
        SLOW_EXEC_WARNING_THRESHOLD = i;
    }
}
