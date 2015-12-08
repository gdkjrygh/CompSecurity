// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.brightcove.player.management;

import com.brightcove.player.event.AbstractComponent;
import com.brightcove.player.event.Event;
import com.brightcove.player.event.EventEmitter;
import com.brightcove.player.event.EventListener;
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
    public class OnRegisterPluginListener
        implements EventListener
    {

        private BrightcovePluginManager a;

        public void processEvent(Event event)
        {
            if (event.properties.containsKey("pluginName"))
            {
                event = (String)event.properties.get("pluginName");
                BrightcovePluginManager.a();
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


    private static final String a = com/brightcove/player/management/BrightcovePluginManager.getSimpleName();
    private static String b = "";
    private static String c = "";
    private Class d;
    private Method e;
    private boolean f;
    private List g;
    private OnRegisterPluginListener h;

    public BrightcovePluginManager(EventEmitter eventemitter)
    {
        Object obj;
        super(eventemitter, com/brightcove/player/management/BrightcovePluginManager);
        Object obj1 = new Properties();
        EventEmitter eventemitter1 = null;
        obj = null;
        try
        {
            eventemitter = com/brightcove/player/management/BrightcovePluginManager.getClassLoader().getResourceAsStream("build-version.properties");
        }
        // Misplaced declaration of an exception variable
        catch (EventEmitter eventemitter)
        {
            if (obj != null)
            {
                try
                {
                    ((InputStream) (obj)).close();
                }
                // Misplaced declaration of an exception variable
                catch (EventEmitter eventemitter) { }
            }
            break MISSING_BLOCK_LABEL_124;
        }
        // Misplaced declaration of an exception variable
        catch (EventEmitter eventemitter)
        {
            if (eventemitter1 != null)
            {
                try
                {
                    eventemitter1.close();
                }
                // Misplaced declaration of an exception variable
                catch (EventEmitter eventemitter) { }
            }
            break MISSING_BLOCK_LABEL_124;
        }
        finally
        {
            obj = null;
        }
        obj = eventemitter;
        eventemitter1 = eventemitter;
        ((Properties) (obj1)).load(eventemitter);
        obj = eventemitter;
        eventemitter1 = eventemitter;
        b = ((Properties) (obj1)).getProperty("commitSHA");
        obj = eventemitter;
        eventemitter1 = eventemitter;
        c = ((Properties) (obj1)).getProperty("buildVersion");
        obj = eventemitter;
        eventemitter1 = eventemitter;
        obj1 = new HashMap();
        obj = eventemitter;
        eventemitter1 = eventemitter;
        ((Map) (obj1)).put("buildVersion", c);
        obj = eventemitter;
        eventemitter1 = eventemitter;
        getEventEmitter().emit("version", ((Map) (obj1)));
        if (eventemitter != null)
        {
            try
            {
                eventemitter.close();
            }
            // Misplaced declaration of an exception variable
            catch (EventEmitter eventemitter) { }
        }
        (new StringBuilder("BrightcovePluginManager: git commit SHA: + ")).append(b).append(", release: ").append(c);
        g = new ArrayList();
        h = new OnRegisterPluginListener();
        addListener("registerPlugin", h);
        try
        {
            d = Class.forName("com.crashlytics.android.Crashlytics");
            f = true;
        }
        // Misplaced declaration of an exception variable
        catch (EventEmitter eventemitter)
        {
            f = false;
        }
        if (f)
        {
            try
            {
                e = d.getMethod("log", new Class[] {
                    java/lang/String
                });
            }
            // Misplaced declaration of an exception variable
            catch (EventEmitter eventemitter) { }
        }
        crashlyticsLog((new StringBuilder("Git Commit SHA: ")).append(b).toString());
        crashlyticsLog((new StringBuilder("Release Number: ")).append(c).toString());
        return;
_L2:
        if (obj != null)
        {
            try
            {
                ((InputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
        }
        throw eventemitter;
        Exception exception;
        exception;
        obj = eventemitter;
        eventemitter = exception;
        if (true) goto _L2; else goto _L1
_L1:
    }

    static String a()
    {
        return a;
    }

    static List a(BrightcovePluginManager brightcovepluginmanager)
    {
        return brightcovepluginmanager.g;
    }

    public void crashlyticsLog(String s)
    {
        if (!f || e == null)
        {
            break MISSING_BLOCK_LABEL_31;
        }
        e.invoke(null, new Object[] {
            s
        });
        return;
        s;
        return;
        s;
        return;
        s;
    }

    public String getCommitIdentifier()
    {
        return b;
    }

    public List getPluginsInUse()
    {
        return g;
    }

    public String getReleaseIdentifier()
    {
        return c;
    }

}
