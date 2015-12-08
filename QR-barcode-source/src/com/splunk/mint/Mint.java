// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.splunk.mint;

import android.content.Context;
import com.splunk.mint.network.MonitorRegistry;
import com.splunk.mint.network.NetLogManager;
import com.splunk.mint.network.http.MonitorableURLStreamHandlerFactory;
import com.splunk.mint.network.socket.MonitoringSocketFactory;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URL;
import java.util.HashMap;
import javax.net.ssl.SSLServerSocket;
import javax.net.ssl.SSLSocket;
import org.json.JSONObject;

// Referenced classes of package com.splunk.mint:
//            Properties, ExtraData, ExcludedUrls, CrashInfo, 
//            ActionEvent, DataSaver, Utils, DataFlusher, 
//            Logger, LowPriorityThreadFactory, ExceptionHandler, BreadcrumbsLimited, 
//            ActionError, EnumActionType, EnumExceptionType, ActionView, 
//            ActionTransactionStop, ActionTransactionStart, MintCallback, MintLogLevel, 
//            MintUrls, NetSender

public final class Mint
{

    protected static boolean DEBUG = false;
    private static boolean isSessionActive = false;
    protected static MintCallback mintCallback = null;
    static boolean netInitializedSuccessfully = false;
    private static boolean networkMonitoringEnabled = true;
    private static MonitorRegistry registry = new MonitorRegistry();
    static boolean triedToInitNet = false;

    public Mint()
    {
    }

    public static void addExtraData(String s, String s1)
    {
        if (Properties.isPluginInitialized() && s != null)
        {
            String s2 = s1;
            if (s1 == null)
            {
                s2 = "null";
            }
            Properties.extraData.addExtraData(s, s2);
        }
    }

    public static void addExtraDataMap(HashMap hashmap)
    {
        if (Properties.isPluginInitialized() && hashmap != null)
        {
            Properties.extraData.addExtraDataMap(hashmap);
        }
    }

    public static void addURLToBlackList(String s)
    {
        if (s != null)
        {
            Properties.excludedUrls.addValue(s);
        }
    }

    public static void clearExtraData()
    {
        if (Properties.isPluginInitialized())
        {
            Properties.extraData.clearData();
        }
    }

    public static void clearTotalCrashesNum()
    {
        if (Properties.isPluginInitialized())
        {
            (new CrashInfo()).clearCrashCounter();
        }
    }

    public static void closeSession(Context context)
    {
        if (Properties.isPluginInitialized() && isSessionActive)
        {
            isSessionActive = false;
            ActionEvent.createGnip().save(new DataSaver());
            Utils.clearLastPingSentTime(context);
        }
    }

    public static void disableNetworkMonitoring()
    {
        networkMonitoringEnabled = false;
    }

    public static void enableDebug()
    {
        DEBUG = true;
    }

    public static void enableLogging(boolean flag)
    {
        Properties.SEND_LOG = flag;
    }

    public static void flush()
    {
        if (Properties.isPluginInitialized())
        {
            (new DataFlusher()).send();
        }
    }

    public static JSONObject getDevSettings()
    {
        return Properties.RemoteSettingsProps.devSettings;
    }

    public static HashMap getExtraData()
    {
        return Properties.extraData.getExtraData();
    }

    public static String getLastCrashID()
    {
        return CrashInfo.getLastCrashID();
    }

    public static int getTotalCrashesNum()
    {
        return CrashInfo.getCrashCounter();
    }

    public static void initAndStartSession(Context context, String s)
    {
        initAndStartSession(context, s, null);
    }

    private static void initAndStartSession(Context context, String s, String s1)
    {
        if (context == null)
        {
            Logger.logWarning("Context is null!");
            return;
        }
        if (s == null || s.length() < 8 || s.length() > 14)
        {
            throw new IllegalArgumentException("Your Mint API Key is invalid!");
        } else
        {
            Properties.API_KEY = s;
            Properties.TIMESTAMP = System.currentTimeMillis();
            (new LowPriorityThreadFactory()).newThread(new Runnable(context, s1, s) {

                final String val$apiKey;
                final Context val$context;
                final String val$url;

                public void run()
                {
                    Properties.initialize(context);
                    new MintUrls(url, apiKey);
                    Mint.installExceptionHandler();
                    if (!Mint.netInitializedSuccessfully)
                    {
                        Mint.initializeNetworkMonitoring();
                    }
                    Mint.startSession(context);
                    Mint.flush();
                }

            
            {
                context = context1;
                url = s;
                apiKey = s1;
                super();
            }
            }).start();
            return;
        }
    }

    private static void initializeNetworkMonitoring()
    {
        if (networkMonitoringEnabled && !triedToInitNet && NetLogManager.deviceSupporsNetworkMonitoring() && Properties.RemoteSettingsProps.netMonitoringEnabled.booleanValue())
        {
            Logger.logInfo("Initializing Network Monitoring");
            triedToInitNet = true;
            try
            {
                URL.setURLStreamHandlerFactory(new MonitorableURLStreamHandlerFactory(registry));
            }
            catch (Exception exception)
            {
                netInitializedSuccessfully = false;
                Logger.logWarning("Unable to set URLStreamHandlerFactory.");
            }
            try
            {
                MonitoringSocketFactory monitoringsocketfactory = new MonitoringSocketFactory(registry);
                Socket.setSocketImplFactory(monitoringsocketfactory);
                ServerSocket.setSocketFactory(monitoringsocketfactory);
                SSLSocket.setSocketImplFactory(monitoringsocketfactory);
                SSLServerSocket.setSocketFactory(monitoringsocketfactory);
                netInitializedSuccessfully = true;
            }
            catch (IOException ioexception)
            {
                netInitializedSuccessfully = false;
            }
            if (netInitializedSuccessfully)
            {
                Logger.logInfo("Network monitoring was initialized successfully!");
            }
        }
    }

    private static void installExceptionHandler()
    {
        Logger.logInfo("Registering the exception handler");
        Thread.UncaughtExceptionHandler uncaughtexceptionhandler = Thread.getDefaultUncaughtExceptionHandler();
        if (!(uncaughtexceptionhandler instanceof ExceptionHandler))
        {
            Thread.setDefaultUncaughtExceptionHandler(new ExceptionHandler(uncaughtexceptionhandler));
        }
    }

    public static void leaveBreadcrumb(String s)
    {
        if (Properties.isPluginInitialized() && s != null)
        {
            Properties.breadcrumbs.addToList(s);
        }
    }

    public static void logEvent(String s)
    {
        if (Properties.isPluginInitialized() && s != null)
        {
            ActionEvent.createEvent(s).save(new DataSaver());
        }
    }

    public static void logEvent(String s, MintLogLevel mintloglevel)
    {
        if (Properties.isPluginInitialized() && s != null)
        {
            ActionEvent.createEvent(s, mintloglevel).save(new DataSaver());
        }
    }

    public static void logException(Exception exception)
    {
        logExceptionMap(new HashMap(0), exception);
    }

    public static void logExceptionMap(HashMap hashmap, Exception exception)
    {
        if (Properties.isPluginInitialized())
        {
            StringWriter stringwriter = new StringWriter();
            exception.printStackTrace(new PrintWriter(stringwriter));
            hashmap = new ExtraData(hashmap);
            (new ActionError(EnumActionType.error, stringwriter.toString(), EnumExceptionType.HANDLED, hashmap)).save(new DataSaver());
        }
    }

    public static void logExceptionMessage(String s, String s1, Exception exception)
    {
        HashMap hashmap = new HashMap(1);
        if (s != null && s1 != null)
        {
            hashmap.put(s, s1);
        }
        logExceptionMap(hashmap, exception);
    }

    private static void logView(String s)
    {
        if (Properties.isPluginInitialized() && s != null)
        {
            ActionView.logView(s).save(new DataSaver());
        }
    }

    public static void removeExtraData(String s)
    {
        if (Properties.isPluginInitialized() && s != null)
        {
            Properties.extraData.removeKey(s);
        }
    }

    public static void setLogging(int i)
    {
        if (i > 0)
        {
            Properties.SEND_LOG = true;
            Properties.LOG_LINES = i;
        }
    }

    public static void setLogging(int i, String s)
    {
        if (s != null && i > 0)
        {
            Properties.SEND_LOG = true;
            Properties.LOG_LINES = i;
            Properties.LOG_FILTER = s;
        }
    }

    public static void setLogging(String s)
    {
        if (s != null)
        {
            Properties.SEND_LOG = true;
            Properties.LOG_FILTER = s;
        }
    }

    public static final void setMintCallback(MintCallback mintcallback)
    {
        mintCallback = mintcallback;
    }

    public static void setUserIdentifier(String s)
    {
        Properties.userIdentifier = s;
    }

    public static void startSession(Context context)
    {
        if (context == null)
        {
            Logger.logWarning("Context is null!");
            return;
        }
        if (!isSessionActive)
        {
            isSessionActive = true;
            Properties.initialize(context);
        }
        (new LowPriorityThreadFactory()).newThread(new Runnable(context) {

            final Context val$context;

            public void run()
            {
                if (Utils.shouldSendPing(context))
                {
                    ActionEvent.createPing().send(context, new NetSender(), true);
                }
            }

            
            {
                context = context1;
                super();
            }
        }).start();
    }

    public static void transactionCancel(String s, String s1)
    {
        if (Properties.isPluginInitialized() && s != null)
        {
            ActionTransactionStop.createTransactionCancel(s, s1).save(new DataSaver());
        }
    }

    public static void transactionStart(String s)
    {
        if (Properties.isPluginInitialized() && s != null)
        {
            ActionTransactionStart.createTransactionStart(s).save(new DataSaver());
        }
    }

    public static void transactionStop(String s)
    {
        if (Properties.isPluginInitialized() && s != null)
        {
            ActionTransactionStop.createTransactionStop(s).save(new DataSaver());
        }
    }

    public MonitorRegistry getRegistry()
    {
        if (registry == null)
        {
            registry = new MonitorRegistry();
        }
        return registry;
    }



}
