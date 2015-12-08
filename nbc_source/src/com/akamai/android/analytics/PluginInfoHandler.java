// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.akamai.android.analytics;

import java.net.URL;
import java.net.URLConnection;

// Referenced classes of package com.akamai.android.analytics:
//            PluginConfigInfo

class PluginInfoHandler extends Thread
{

    public static String configXMLCache = null;
    public static boolean isLoadingCache = false;
    public static long lastModifiedTimeofConfigCache = 0L;
    public static PluginConfigInfo plugInfoCache = null;
    public static Object staticFieldLock = new Object();
    public static int usageCountCache = 0;
    public static boolean xmlLoadSuccessCache = false;
    private String configXML;
    private PluginConfigInfo.ParserEventListener eventListenerFromHandler;
    private PluginConfigInfo.ParserEventListener eventListenerFromPlugin;
    private boolean isLoading;
    private boolean isUsingCache;
    private long lastModifiedTimeofConfig;
    public PluginConfigInfo plugInfo;
    private boolean xmlLoadSuccess;

    public PluginInfoHandler(String s, PluginConfigInfo.ParserEventListener parsereventlistener)
    {
        configXML = s;
        eventListenerFromPlugin = parsereventlistener;
        eventListenerFromHandler = new PluginConfigInfo.ParserEventListener() {

            final PluginInfoHandler this$0;

            public void event(InternalCodes.PARSER_EVENT parser_event, String s1)
            {
                boolean flag = false;
                Object obj;
                PluginInfoHandler plugininfohandler;
                try
                {
                    if (parser_event == InternalCodes.PARSER_EVENT.DEBUG)
                    {
                        sendEvent(parser_event, s1);
                        return;
                    }
                }
                // Misplaced declaration of an exception variable
                catch (InternalCodes.PARSER_EVENT parser_event)
                {
                    return;
                }
                obj = PluginInfoHandler.staticFieldLock;
                obj;
                JVM INSTR monitorenter ;
                plugininfohandler = PluginInfoHandler.this;
                if (parser_event == InternalCodes.PARSER_EVENT.XML_LOADED)
                {
                    flag = true;
                }
                plugininfohandler.updateXMLStatus(false, flag);
                if (isUsingCache)
                {
                    updateStaticVariables(PluginInfoHandler.configXMLCache, PluginInfoHandler.plugInfoCache, PluginInfoHandler.usageCountCache, xmlLoadSuccess, isLoading, PluginInfoHandler.lastModifiedTimeofConfigCache);
                }
                sendEvent(parser_event, s1);
                obj;
                JVM INSTR monitorexit ;
                return;
                parser_event;
                obj;
                JVM INSTR monitorexit ;
                throw parser_event;
            }

            
            {
                this$0 = PluginInfoHandler.this;
                super();
            }
        };
        try
        {
            setName("AkamaiConfigXMLChecker");
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            debugException(s);
        }
        try
        {
            start();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            debugException(s);
        }
    }

    public void close()
    {
        synchronized (staticFieldLock)
        {
            if (usageCountCache == 0 && !isLoading && xmlLoadSuccess)
            {
                updateStaticVariables(configXML, plugInfo, usageCountCache, xmlLoadSuccess, isLoading, lastModifiedTimeofConfig);
            }
            removeListener();
            plugInfo = null;
            lastModifiedTimeofConfig = 0L;
            configXML = null;
            isUsingCache = false;
            xmlLoadSuccess = false;
            isLoading = false;
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void debug(String s)
    {
        sendEvent(InternalCodes.PARSER_EVENT.DEBUG, s);
    }

    public void debugException(Exception exception)
    {
        debug(getExceptionMessage(exception));
    }

    public String getExceptionMessage(Exception exception)
    {
        if (exception != null)
        {
            return (new StringBuilder("Cause:")).append(exception.getCause()).append(":Message:").append(exception.getLocalizedMessage()).toString();
        } else
        {
            return "";
        }
    }

    public void removeListener()
    {
        if (plugInfo != null && plugInfo.eventListener == eventListenerFromHandler)
        {
            plugInfo.setOnParserEventListener(null);
        }
        eventListenerFromPlugin = null;
        eventListenerFromHandler = null;
    }

    public void run()
    {
        boolean flag = false;
label0:
        {
            synchronized (staticFieldLock)
            {
                if (configXML != null)
                {
                    break label0;
                }
                sendEvent(InternalCodes.PARSER_EVENT.XML_NOT_LOADED, "Because the XML is null");
            }
            return;
        }
        lastModifiedTimeofConfig = (new URL(configXML)).openConnection().getLastModified();
        debug((new StringBuilder("Config file:")).append(configXML).append(":LastModified:").append(lastModifiedTimeofConfig).append(":LastModifiedCache:").append(lastModifiedTimeofConfigCache).toString());
_L10:
        if (lastModifiedTimeofConfig > lastModifiedTimeofConfigCache || configXMLCache == null || !configXMLCache.equals(configXML)) goto _L2; else goto _L1
_L1:
        int i = ((flag) ? 1 : 0);
        if (isLoadingCache) goto _L4; else goto _L3
_L3:
        if (!xmlLoadSuccessCache) goto _L2; else goto _L5
_L5:
        i = ((flag) ? 1 : 0);
_L4:
        isUsingCache = true;
        if (i == 0) goto _L7; else goto _L6
_L6:
        plugInfo = new PluginConfigInfo(configXML, eventListenerFromHandler);
        updateXMLStatus(true, false);
        if (usageCountCache != 0) goto _L9; else goto _L8
_L8:
        updateStaticVariables(configXML, plugInfo, 1, xmlLoadSuccess, isLoading, lastModifiedTimeofConfig);
_L11:
        obj;
        JVM INSTR monitorexit ;
        return;
        exception1;
        obj;
        JVM INSTR monitorexit ;
        try
        {
            throw exception1;
        }
        catch (Exception exception)
        {
            return;
        }
        Exception exception2;
        exception2;
        sendEvent(InternalCodes.PARSER_EVENT.XML_NOT_LOADED, (new StringBuilder("URL Connection failed")).append(getExceptionMessage(exception2)).toString());
          goto _L10
_L9:
        isUsingCache = false;
          goto _L11
_L7:
        updateXMLStatus(isLoadingCache, xmlLoadSuccessCache);
        plugInfo = plugInfoCache;
        usageCountCache++;
        if (isLoading)
        {
            break MISSING_BLOCK_LABEL_382;
        }
        sendEvent(plugInfo.lastEventCode, plugInfo.lastMessageDispatched);
          goto _L11
_L13:
        if (i <= 0) goto _L11; else goto _L12
_L12:
label1:
        {
            if (plugInfo == null || plugInfo.isLoading)
            {
                break label1;
            }
            sendEvent(plugInfo.lastEventCode, plugInfo.lastMessageDispatched);
        }
          goto _L11
        staticFieldLock.wait(500L);
_L14:
        i--;
          goto _L13
        exception2;
        debugException(exception2);
          goto _L14
_L2:
        i = 1;
          goto _L4
        i = 40;
          goto _L13
    }

    public void sendEvent(InternalCodes.PARSER_EVENT parser_event, String s)
    {
        try
        {
            if (eventListenerFromPlugin != null)
            {
                eventListenerFromPlugin.event(parser_event, s);
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (InternalCodes.PARSER_EVENT parser_event)
        {
            return;
        }
    }

    public void updateStaticVariables(String s, PluginConfigInfo pluginconfiginfo, int i, boolean flag, boolean flag1, long l)
    {
        synchronized (staticFieldLock)
        {
            configXMLCache = s;
            plugInfoCache = pluginconfiginfo;
            usageCountCache = i;
            xmlLoadSuccessCache = flag;
            isLoadingCache = flag1;
            lastModifiedTimeofConfigCache = l;
        }
        return;
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
    }

    public void updateXMLStatus(boolean flag, boolean flag1)
    {
        synchronized (staticFieldLock)
        {
            xmlLoadSuccess = flag1;
            isLoading = flag;
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }




}
