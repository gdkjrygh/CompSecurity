// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.management;

import android.util.Log;
import com.brightcove.player.event.AbstractComponent;
import com.brightcove.player.event.EventEmitter;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

public class BrightcovePluginManager extends AbstractComponent
{

    private static final String b = com/brightcove/player/management/BrightcovePluginManager.getSimpleName();
    private static String c = "";
    private static String d = "";
    OnRegisterPluginListener a;
    private Class e;
    private Method f;
    private boolean g;
    private List h;

    public BrightcovePluginManager(EventEmitter eventemitter)
    {
        super(eventemitter, com/brightcove/player/management/BrightcovePluginManager);
        a();
        Log.d(b, (new StringBuilder()).append("BrightcovePluginManager: git commit SHA: + ").append(c).append(", release: ").append(d).toString());
        h = new ArrayList();
        b();
        c();
        d();
        crashlyticsLog((new StringBuilder()).append("Git Commit SHA: ").append(c).toString());
        crashlyticsLog((new StringBuilder()).append("Release Number: ").append(d).toString());
    }

    static List a(BrightcovePluginManager brightcovepluginmanager)
    {
        return brightcovepluginmanager.h;
    }

    static String e()
    {
        return b;
    }

    protected void a()
    {
        Object obj;
        InputStream inputstream;
        Object obj2;
        Object obj3;
        obj3 = new Properties();
        obj2 = null;
        obj = null;
        inputstream = null;
        InputStream inputstream1 = com/brightcove/player/management/BrightcovePluginManager.getClassLoader().getResourceAsStream("build-version.properties");
        inputstream = inputstream1;
        obj2 = inputstream1;
        obj = inputstream1;
        ((Properties) (obj3)).load(inputstream1);
        inputstream = inputstream1;
        obj2 = inputstream1;
        obj = inputstream1;
        c = ((Properties) (obj3)).getProperty("commitSHA");
        inputstream = inputstream1;
        obj2 = inputstream1;
        obj = inputstream1;
        d = ((Properties) (obj3)).getProperty("buildVersion");
        inputstream = inputstream1;
        obj2 = inputstream1;
        obj = inputstream1;
        obj3 = new HashMap();
        inputstream = inputstream1;
        obj2 = inputstream1;
        obj = inputstream1;
        ((Map) (obj3)).put("buildVersion", d);
        inputstream = inputstream1;
        obj2 = inputstream1;
        obj = inputstream1;
        getEventEmitter().emit("version", ((Map) (obj3)));
        if (inputstream1 == null)
        {
            break MISSING_BLOCK_LABEL_153;
        }
        inputstream1.close();
_L2:
        return;
        obj;
        Log.e(b, "Failed to close stream.", ((Throwable) (obj)));
        return;
        obj2;
        obj = inputstream;
        Log.e(b, "Failed to load build version properties. Commit and Release numbers will be empty.", ((Throwable) (obj2)));
        if (inputstream == null) goto _L2; else goto _L1
_L1:
        try
        {
            inputstream.close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Log.e(b, "Failed to close stream.", ((Throwable) (obj)));
        }
        return;
        Object obj1;
        obj1;
        obj = obj2;
        Log.e(b, "Failed to load build-version.properties", ((Throwable) (obj1)));
        if (obj2 == null) goto _L2; else goto _L3
_L3:
        try
        {
            ((InputStream) (obj2)).close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Log.e(b, "Failed to close stream.", ((Throwable) (obj)));
        }
        return;
        obj1;
        if (obj != null)
        {
            try
            {
                ((InputStream) (obj)).close();
            }
            catch (IOException ioexception)
            {
                Log.e(b, "Failed to close stream.", ioexception);
            }
        }
        throw obj1;
    }

    protected void b()
    {
        a = new OnRegisterPluginListener();
        addListener("registerPlugin", a);
    }

    protected void c()
    {
        try
        {
            e = Class.forName("com.crashlytics.android.Crashlytics");
            g = true;
            return;
        }
        catch (ClassNotFoundException classnotfoundexception)
        {
            Log.i(b, "Crashlytics was not found. Logging to console only.");
        }
        g = false;
    }

    public void crashlyticsLog(String s)
    {
        Log.d(b, (new StringBuilder()).append("crashlyticsLog: ").append(s).toString());
        if (!g || f == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        f.invoke(null, new Object[] {
            s
        });
        return;
        s;
        Log.i(b, "crashlyticsLog: Illegal argument exception occurred.");
        return;
        s;
        Log.i(b, "crashlyticsLog: Illegal access exception occurred.");
        return;
        s;
        Log.i(b, "crashlyticsLog: Invocation target exception occurred.");
        return;
    }

    protected void d()
    {
        if (!g)
        {
            break MISSING_BLOCK_LABEL_29;
        }
        f = e.getMethod("log", new Class[] {
            java/lang/String
        });
        return;
        NoSuchMethodException nosuchmethodexception;
        nosuchmethodexception;
        Log.i(b, "Failed to wrap crashlytics methods.");
        return;
    }

    public String getCommitIdentifier()
    {
        return c;
    }

    public List getPluginsInUse()
    {
        return h;
    }

    public String getReleaseIdentifier()
    {
        return d;
    }


    private class OnRegisterPluginListener
        implements EventListener
    {

        final BrightcovePluginManager a;

        public void processEvent(Event event)
        {
            if (event.properties.containsKey("pluginName"))
            {
                event = (String)event.properties.get("pluginName");
                Log.v(BrightcovePluginManager.e(), (new StringBuilder()).append("OnRegisterPluginListener: plugin: ").append(event).toString());
                if (!BrightcovePluginManager.a(a).contains(event))
                {
                    BrightcovePluginManager.a(a).add(event);
                }
            }
        }

        protected OnRegisterPluginListener()
        {
            a = BrightcovePluginManager.this;
            super();
        }
    }

}
