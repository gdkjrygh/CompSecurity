// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.cordova.api;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.webkit.WebView;
import com.EnterpriseMobileBanking.AppHelper;
import com.EnterpriseMobileBanking.Plugins.BusyJSI;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import org.apache.cordova.CordovaWebView;
import org.json.JSONException;
import org.xmlpull.v1.XmlPullParserException;

// Referenced classes of package org.apache.cordova.api:
//            PluginEntry, LOG, PluginResult, CallbackContext, 
//            CordovaPlugin, CordovaInterface

public class PluginManager
{

    private static String TAG = "PluginManager";
    private final CordovaWebView app;
    private final CordovaInterface ctx;
    private final HashMap entries = new HashMap();
    private boolean firstRun;
    protected HashMap urlMap;

    public PluginManager(CordovaWebView cordovawebview, CordovaInterface cordovainterface)
    {
        urlMap = new HashMap();
        ctx = cordovainterface;
        app = cordovawebview;
        firstRun = true;
    }

    private CordovaPlugin getPlugin(String s)
    {
        PluginEntry pluginentry = (PluginEntry)entries.get(s);
        if (pluginentry == null)
        {
            s = null;
        } else
        {
            CordovaPlugin cordovaplugin = pluginentry.plugin;
            s = cordovaplugin;
            if (cordovaplugin == null)
            {
                return pluginentry.createPlugin(app, ctx);
            }
        }
        return s;
    }

    private void pluginConfigurationMissing()
    {
        LOG.e(TAG, "=====================================================================================");
        LOG.e(TAG, "ERROR: plugin.xml is missing.  Add res/xml/plugins.xml to your project.");
        LOG.e(TAG, "https://git-wip-us.apache.org/repos/asf?p=incubator-cordova-android.git;a=blob;f=framework/res/xml/plugins.xml");
        LOG.e(TAG, "=====================================================================================");
    }

    public void addService(String s, String s1)
    {
        addService(new PluginEntry(s, s1, false));
    }

    public void addService(PluginEntry pluginentry)
    {
        entries.put(pluginentry.service, pluginentry);
    }

    public void clearPluginObjects()
    {
        for (Iterator iterator = entries.values().iterator(); iterator.hasNext();)
        {
            ((PluginEntry)iterator.next()).plugin = null;
        }

    }

    public boolean exec(String s, String s1, String s2, String s3)
    {
        if (!s3.contains("exitOnSkinLoader") || !s3.contains("true")) goto _L2; else goto _L1
_L1:
        String s4;
        s4 = s3.replace("true", "false");
        Log.d(TAG, (new StringBuilder()).append("rawArgs is now: ").append(s4).toString());
_L4:
        s = getPlugin(s);
        if (s == null)
        {
            s = new PluginResult(PluginResult.Status.CLASS_NOT_FOUND_EXCEPTION);
            app.sendPluginResult(s, s2);
            return true;
        }
        break; /* Loop/switch isn't completed */
_L2:
        s4 = s3;
        if (s1.contains("loadSkin"))
        {
            s4 = s3.substring(0, s3.lastIndexOf(',') + 1).concat((new StringBuilder()).append("\"").append(AppHelper.getLobPage()).append("\"]").toString());
            AppHelper.getAppView().postDelayed(new Runnable() {

                final PluginManager this$0;

                public void run()
                {
                    BusyJSI.forceHide();
                }

            
            {
                this$0 = PluginManager.this;
                super();
            }
            }, 2000L);
        }
        if (true) goto _L4; else goto _L3
_L3:
        s3 = new CallbackContext(s2, app);
        if (s.execute(s1, s4, s3))
        {
            break MISSING_BLOCK_LABEL_218;
        }
        s = new PluginResult(PluginResult.Status.INVALID_ACTION);
        app.sendPluginResult(s, s2);
        return true;
        boolean flag;
        try
        {
            flag = s3.isFinished();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s = new PluginResult(PluginResult.Status.JSON_EXCEPTION);
            app.sendPluginResult(s, s2);
            return true;
        }
        return flag;
    }

    public boolean exec(String s, String s1, String s2, String s3, boolean flag)
    {
        return exec(s, s1, s2, s3);
    }

    public void init()
    {
        LOG.d(TAG, "init()");
        if (firstRun)
        {
            loadPlugins();
            firstRun = false;
        } else
        {
            onPause(false);
            onDestroy();
            clearPluginObjects();
        }
        startupPlugins();
    }

    public void loadPlugins()
    {
        int i;
        int j = ctx.getActivity().getResources().getIdentifier("config", "xml", ctx.getActivity().getPackageName());
        i = j;
        if (j == 0)
        {
            i = ctx.getActivity().getResources().getIdentifier("plugins", "xml", ctx.getActivity().getPackageName());
            LOG.i(TAG, "Using plugins.xml instead of config.xml.  plugins.xml will eventually be deprecated");
        }
        if (i != 0) goto _L2; else goto _L1
_L1:
        pluginConfigurationMissing();
_L6:
        return;
_L2:
        String s2;
        String s3;
        XmlResourceParser xmlresourceparser;
        int k;
        int l;
        xmlresourceparser = ctx.getActivity().getResources().getXml(i);
        k = -1;
        s2 = "";
        s3 = "";
        l = 0;
_L4:
        String s;
        String s1;
        if (k == 1)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (k == 2)
        {
            String s4 = xmlresourceparser.getName();
            if (s4.equals("plugin"))
            {
                s1 = xmlresourceparser.getAttributeValue(null, "name");
                s = xmlresourceparser.getAttributeValue(null, "value");
                addService(new PluginEntry(s1, s, "true".equals(xmlresourceparser.getAttributeValue(null, "onload"))));
                i = l;
            } else
            if (s4.equals("url-filter"))
            {
                urlMap.put(xmlresourceparser.getAttributeValue(null, "value"), s2);
                i = l;
                s = s3;
                s1 = s2;
            } else
            if (s4.equals("feature"))
            {
                i = 1;
                xmlresourceparser.getAttributeValue(null, "name");
                s = s3;
                s1 = s2;
            } else
            {
                i = l;
                s = s3;
                s1 = s2;
                if (s4.equals("param"))
                {
                    i = l;
                    s = s3;
                    s1 = s2;
                    if (l != 0)
                    {
                        s = xmlresourceparser.getAttributeValue(null, "name");
                        String s5;
                        if (s.equals("service"))
                        {
                            s5 = xmlresourceparser.getAttributeValue(null, "value");
                        } else
                        {
                            s5 = s2;
                            if (s.equals("package"))
                            {
                                s3 = xmlresourceparser.getAttributeValue(null, "value");
                                s5 = s2;
                            }
                        }
                        i = l;
                        s = s3;
                        s1 = s5;
                        if (s5.length() > 0)
                        {
                            i = l;
                            s = s3;
                            s1 = s5;
                            if (s3.length() > 0)
                            {
                                addService(new PluginEntry(s5, s3, "true".equals(xmlresourceparser.getAttributeValue(null, "onload"))));
                                s1 = "";
                                s = "";
                                i = l;
                            }
                        }
                    }
                }
            }
        } else
        {
            i = l;
            s = s3;
            s1 = s2;
            if (k == 3)
            {
                i = l;
                s = s3;
                s1 = s2;
                if (xmlresourceparser.getName().equals("feature"))
                {
                    s1 = "";
                    s = "";
                    i = 0;
                }
            }
        }
        l = xmlresourceparser.next();
        k = l;
        l = i;
        s3 = s;
        s2 = s1;
        break; /* Loop/switch isn't completed */
        Object obj;
        obj;
        ((XmlPullParserException) (obj)).printStackTrace();
        l = i;
        s3 = s;
        obj = s1;
        break; /* Loop/switch isn't completed */
        obj;
        ((IOException) (obj)).printStackTrace();
        l = i;
        s3 = s;
        obj = s1;
        if (true) goto _L4; else goto _L3
_L3:
        if (true) goto _L6; else goto _L5
_L5:
    }

    public void onDestroy()
    {
        Iterator iterator = entries.values().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            PluginEntry pluginentry = (PluginEntry)iterator.next();
            if (pluginentry.plugin != null)
            {
                pluginentry.plugin.onDestroy();
            }
        } while (true);
    }

    public void onNewIntent(Intent intent)
    {
        Iterator iterator = entries.values().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            PluginEntry pluginentry = (PluginEntry)iterator.next();
            if (pluginentry.plugin != null)
            {
                pluginentry.plugin.onNewIntent(intent);
            }
        } while (true);
    }

    public boolean onOverrideUrlLoading(String s)
    {
        for (Iterator iterator = urlMap.entrySet().iterator(); iterator.hasNext();)
        {
            java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
            if (s.startsWith((String)entry.getKey()))
            {
                return getPlugin((String)entry.getValue()).onOverrideUrlLoading(s);
            }
        }

        return false;
    }

    public void onPause(boolean flag)
    {
        Iterator iterator = entries.values().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            PluginEntry pluginentry = (PluginEntry)iterator.next();
            if (pluginentry.plugin != null)
            {
                pluginentry.plugin.onPause(flag);
            }
        } while (true);
    }

    public void onReset()
    {
        Iterator iterator = entries.values().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            CordovaPlugin cordovaplugin = ((PluginEntry)iterator.next()).plugin;
            if (cordovaplugin != null)
            {
                cordovaplugin.onReset();
            }
        } while (true);
    }

    public void onResume(boolean flag)
    {
        Iterator iterator = entries.values().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            PluginEntry pluginentry = (PluginEntry)iterator.next();
            if (pluginentry.plugin != null)
            {
                pluginentry.plugin.onResume(flag);
            }
        } while (true);
    }

    public Object postMessage(String s, Object obj)
    {
        Object obj1 = ctx.onMessage(s, obj);
        if (obj1 != null)
        {
            return obj1;
        }
        for (Iterator iterator = entries.values().iterator(); iterator.hasNext();)
        {
            Object obj2 = (PluginEntry)iterator.next();
            if (((PluginEntry) (obj2)).plugin != null)
            {
                obj2 = ((PluginEntry) (obj2)).plugin.onMessage(s, obj);
                if (obj2 != null)
                {
                    return obj2;
                }
            }
        }

        return null;
    }

    public void startupPlugins()
    {
        Iterator iterator = entries.values().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            PluginEntry pluginentry = (PluginEntry)iterator.next();
            if (pluginentry.onload)
            {
                pluginentry.createPlugin(app, ctx);
            }
        } while (true);
    }

}
