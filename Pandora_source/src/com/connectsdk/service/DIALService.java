// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.connectsdk.service;

import android.util.Xml;
import com.connectsdk.core.AppInfo;
import com.connectsdk.core.Util;
import com.connectsdk.device.ConnectableDeviceListener;
import com.connectsdk.device.ConnectableDeviceStore;
import com.connectsdk.etc.helper.DeviceServiceReachability;
import com.connectsdk.service.capability.Launcher;
import com.connectsdk.service.capability.listeners.ResponseListener;
import com.connectsdk.service.command.NotSupportedServiceSubscription;
import com.connectsdk.service.command.ServiceCommand;
import com.connectsdk.service.command.ServiceCommandError;
import com.connectsdk.service.command.ServiceSubscription;
import com.connectsdk.service.config.ServiceConfig;
import com.connectsdk.service.config.ServiceDescription;
import com.connectsdk.service.sessions.LaunchSession;
import java.io.IOException;
import java.io.StringReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;
import java.util.concurrent.CopyOnWriteArrayList;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager;
import org.apache.http.util.EntityUtils;
import org.json.JSONException;
import org.json.JSONObject;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

// Referenced classes of package com.connectsdk.service:
//            DeviceService

public class DIALService extends DeviceService
    implements Launcher
{

    public static final String ID = "DIAL";
    private static List registeredApps;
    HttpClient httpClient;

    public DIALService(ServiceDescription servicedescription, ServiceConfig serviceconfig, ConnectableDeviceStore connectabledevicestore)
    {
        super(servicedescription, serviceconfig, connectabledevicestore);
        setCapabilities();
        httpClient = new DefaultHttpClient();
        servicedescription = httpClient.getConnectionManager();
        serviceconfig = httpClient.getParams();
        httpClient = new DefaultHttpClient(new ThreadSafeClientConnManager(serviceconfig, servicedescription.getSchemeRegistry()), serviceconfig);
        probeForAppSupport();
    }

    public static JSONObject discoveryParameters()
    {
        JSONObject jsonobject = new JSONObject();
        try
        {
            jsonobject.put("serviceId", "DIAL");
            jsonobject.put("filter", "urn:dial-multiscreen-org:service:dial:1");
        }
        catch (JSONException jsonexception)
        {
            return jsonobject;
        }
        return jsonobject;
    }

    private void hasApplication(String s, ResponseListener responselistener)
    {
        s = new ServiceCommand(this, requestURL(s), null, responselistener);
        s.setHttpMethod("GET");
        s.send();
    }

    private void launchApp(String s, JSONObject jsonobject, com.connectsdk.service.capability.Launcher.AppLaunchListener applaunchlistener)
    {
        if (s == null || s.length() == 0)
        {
            Util.postError(applaunchlistener, new ServiceCommandError(0, "Must pass a valid appId", null));
            return;
        } else
        {
            jsonobject = new AppInfo();
            jsonobject.setName(s);
            jsonobject.setId(s);
            launchAppWithInfo(jsonobject, applaunchlistener);
            return;
        }
    }

    private static com.connectsdk.service.capability.Launcher.AppState parseAppStateFromResponseString(String s)
    {
        com.connectsdk.service.capability.Launcher.AppState appstate;
        Stack stack;
        XmlPullParser xmlpullparser;
        stack = new Stack();
        appstate = new com.connectsdk.service.capability.Launcher.AppState();
        xmlpullparser = Xml.newPullParser();
        int i;
        xmlpullparser.setInput(new StringReader(s));
        i = xmlpullparser.getEventType();
        String s1 = null;
          goto _L1
_L12:
        i = xmlpullparser.next();
        s1 = s;
          goto _L1
_L8:
        try
        {
            s = new StringBuilder();
            stack.push(xmlpullparser.getName());
            continue; /* Loop/switch isn't completed */
        }
        // Misplaced declaration of an exception variable
        catch (String s) { }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return appstate;
        }
          goto _L2
_L9:
        if (!((String)stack.pop()).equals(xmlpullparser.getName()))
        {
            throw new RuntimeException("xml is malformed!");
        }
        if (!xmlpullparser.getName().equals("state")) goto _L4; else goto _L3
_L3:
        appstate.setState(s1.toString());
          goto _L5
_L4:
        if (xmlpullparser.getName().equals("message-url") && xmlpullparser.getNamespace().equals("urn:castchat-org:device:app"))
        {
            appstate.castChatMessageUrl = s1.toString();
        }
          goto _L5
_L10:
        s = s1;
        if (s1 == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        s1.append(xmlpullparser.getText());
        s = s1;
        continue; /* Loop/switch isn't completed */
_L1:
        if (i == 1) goto _L2; else goto _L6
_L6:
        i;
        JVM INSTR tableswitch 2 4: default 240
    //                   2 64
    //                   3 87
    //                   4 184;
           goto _L7 _L8 _L9 _L10
_L7:
        s = s1;
        continue; /* Loop/switch isn't completed */
_L2:
        return appstate;
_L5:
        s = null;
        if (true) goto _L12; else goto _L11
_L11:
    }

    private void probeForAppSupport()
    {
        final String appID;
        for (Iterator iterator = registeredApps.iterator(); iterator.hasNext(); hasApplication(appID, new ResponseListener() {

        final DIALService this$0;
        final String val$appID;

        public void onError(ServiceCommandError servicecommanderror)
        {
        }

        public void onSuccess(Object obj)
        {
            DIALService.parseAppStateFromResponseString((String)obj);
            addCapability((new StringBuilder()).append("Launcher.").append(appID).toString());
        }

            
            {
                this$0 = DIALService.this;
                appID = s;
                super();
            }
    }))
        {
            appID = (String)iterator.next();
        }

    }

    public static void registerApp(String s)
    {
        if (!registeredApps.contains(s))
        {
            registeredApps.add(s);
        }
    }

    private String requestURL(String s)
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(serviceDescription.getApplicationURL());
        stringbuilder.append(s);
        return stringbuilder.toString();
    }

    private void setCapabilities()
    {
        appendCapabilites(new String[] {
            "Launcher.Application", "Launcher.Application.Params", "Launcher.Application.Close", "Launcher.AppState"
        });
    }

    public void closeApp(final LaunchSession launchSession, final ResponseListener listener)
    {
        getAppState(launchSession.getAppName(), new com.connectsdk.service.capability.Launcher.AppStateListener() {

            final DIALService this$0;
            final LaunchSession val$launchSession;
            final ResponseListener val$listener;

            public void onError(ServiceCommandError servicecommanderror)
            {
                Util.postError(listener, servicecommanderror);
            }

            public void onSuccess(com.connectsdk.service.capability.Launcher.AppState appstate)
            {
                String s1 = requestURL(launchSession.getAppName());
                String s = s1;
                if (appstate.running)
                {
                    s = (new StringBuilder()).append(s1).append("/run").toString();
                }
                appstate = new ServiceCommand(launchSession.getService(), s, null, listener);
                appstate.setHttpMethod("DELETE");
                appstate.send();
            }

            public volatile void onSuccess(Object obj)
            {
                onSuccess((com.connectsdk.service.capability.Launcher.AppState)obj);
            }

            
            {
                this$0 = DIALService.this;
                launchSession = launchsession;
                listener = responselistener;
                super();
            }
        });
    }

    public void connect()
    {
        connected = true;
    }

    public void disconnect()
    {
        connected = false;
        if (mServiceReachability != null)
        {
            mServiceReachability.stop();
        }
        Util.runOnUI(new Runnable() {

            final DIALService this$0;

            public void run()
            {
                DeviceService.ConnectableDeviceListenerPair connectabledevicelistenerpair;
                for (Iterator iterator = deviceListeners.iterator(); iterator.hasNext(); connectabledevicelistenerpair.listener.onDeviceDisconnected(connectabledevicelistenerpair.device))
                {
                    connectabledevicelistenerpair = (DeviceService.ConnectableDeviceListenerPair)iterator.next();
                }

                deviceListeners.clear();
            }

            
            {
                this$0 = DIALService.this;
                super();
            }
        });
    }

    public void getAppList(com.connectsdk.service.capability.Launcher.AppListListener applistlistener)
    {
        Util.postError(applistlistener, ServiceCommandError.notSupported());
    }

    public void getAppState(LaunchSession launchsession, com.connectsdk.service.capability.Launcher.AppStateListener appstatelistener)
    {
        getAppState(launchsession.getAppName(), appstatelistener);
    }

    public void getAppState(String s, final com.connectsdk.service.capability.Launcher.AppStateListener listener)
    {
        listener = new ResponseListener() {

            final DIALService this$0;
            final com.connectsdk.service.capability.Launcher.AppStateListener val$listener;

            public void onError(ServiceCommandError servicecommanderror)
            {
                Util.postError(listener, servicecommanderror);
            }

            public void onSuccess(Object obj)
            {
                obj = DIALService.parseAppStateFromResponseString((String)obj);
                if (((com.connectsdk.service.capability.Launcher.AppState) (obj)).state != null)
                {
                    Util.postSuccess(listener, obj);
                    return;
                } else
                {
                    Util.postError(listener, new ServiceCommandError(0, "Malformed response for app state", null));
                    return;
                }
            }

            
            {
                this$0 = DIALService.this;
                listener = appstatelistener;
                super();
            }
        };
        s = new ServiceCommand(this, requestURL(s), null, listener);
        s.setHttpMethod("GET");
        s.send();
    }

    public Launcher getLauncher()
    {
        return this;
    }

    public com.connectsdk.service.capability.CapabilityMethods.CapabilityPriorityLevel getLauncherCapabilityLevel()
    {
        return com.connectsdk.service.capability.CapabilityMethods.CapabilityPriorityLevel.NORMAL;
    }

    public void getRunningApp(com.connectsdk.service.capability.Launcher.AppInfoListener appinfolistener)
    {
        Util.postError(appinfolistener, ServiceCommandError.notSupported());
    }

    public boolean isConnectable()
    {
        return true;
    }

    public void launchApp(String s, com.connectsdk.service.capability.Launcher.AppLaunchListener applaunchlistener)
    {
        launchApp(s, null, applaunchlistener);
    }

    public void launchAppWithInfo(AppInfo appinfo, com.connectsdk.service.capability.Launcher.AppLaunchListener applaunchlistener)
    {
        launchAppWithInfo(appinfo, null, applaunchlistener);
    }

    public void launchAppWithInfo(final AppInfo appInfo, Object obj, final com.connectsdk.service.capability.Launcher.AppLaunchListener listener)
    {
        (new ServiceCommand(this, requestURL(appInfo.getName()), obj, new ResponseListener() {

            final DIALService this$0;
            final AppInfo val$appInfo;
            final com.connectsdk.service.capability.Launcher.AppLaunchListener val$listener;

            public void onError(ServiceCommandError servicecommanderror)
            {
                Util.postError(listener, new ServiceCommandError(0, "Problem Launching app", null));
            }

            public void onSuccess(Object obj1)
            {
                LaunchSession launchsession = LaunchSession.launchSessionForAppId(appInfo.getId());
                launchsession.setAppName(appInfo.getName());
                launchsession.setRawData(obj1);
                launchsession.setService(DIALService.this);
                launchsession.setSessionType(com.connectsdk.service.sessions.LaunchSession.LaunchSessionType.App);
                Util.postSuccess(listener, launchsession);
            }

            
            {
                this$0 = DIALService.this;
                listener = applaunchlistener;
                appInfo = appinfo;
                super();
            }
        })).send();
    }

    public void onLoseReachability(DeviceServiceReachability deviceservicereachability)
    {
        if (connected)
        {
            disconnect();
            return;
        } else
        {
            mServiceReachability.stop();
            return;
        }
    }

    public void sendCommand(final ServiceCommand mCommand)
    {
        Util.runInBackground(new Runnable() {

            final DIALService this$0;
            final ServiceCommand val$mCommand;

            public void run()
            {
                Object obj;
                ServiceCommand servicecommand;
                HttpRequestBase httprequestbase;
                servicecommand = mCommand;
                obj = servicecommand.getPayload();
                httprequestbase = servicecommand.getRequest();
                if (obj == null || !servicecommand.getHttpMethod().equalsIgnoreCase("POST")) goto _L2; else goto _L1
_L1:
                HttpPost httppost;
                httprequestbase.setHeader("Content-Type", "text/plain; charset=\"utf-8\"");
                httppost = (HttpPost)httprequestbase;
                if (obj instanceof String)
                {
                    obj = new StringEntity((String)obj);
                    break MISSING_BLOCK_LABEL_64;
                }
                int i;
                try
                {
                    if (obj instanceof JSONObject)
                    {
                        obj = new StringEntity((String)obj);
                        continue; /* Loop/switch isn't completed */
                    }
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    obj = null;
                    continue; /* Loop/switch isn't completed */
                }
                obj = null;
                continue; /* Loop/switch isn't completed */
_L4:
                if (obj == null)
                {
                    Util.postError(servicecommand.getResponseListener(), new ServiceCommandError(0, "Unknown Error while preparing to send message", null));
                    return;
                }
                httppost.setEntity(((org.apache.http.HttpEntity) (obj)));
_L2:
                try
                {
                    obj = httpClient.execute(httprequestbase);
                    i = ((HttpResponse) (obj)).getStatusLine().getStatusCode();
                }
                catch (IllegalStateException illegalstateexception)
                {
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    return;
                }
                if (i != 200 && i != 201)
                {
                    break MISSING_BLOCK_LABEL_185;
                }
                obj = EntityUtils.toString(((HttpResponse) (obj)).getEntity(), "UTF-8");
                Util.postSuccess(servicecommand.getResponseListener(), obj);
                return;
                Util.postError(servicecommand.getResponseListener(), ServiceCommandError.getError(i));
                return;
                if (true) goto _L4; else goto _L3
_L3:
            }

            
            {
                this$0 = DIALService.this;
                mCommand = servicecommand;
                super();
            }
        });
    }

    public ServiceSubscription subscribeAppState(LaunchSession launchsession, com.connectsdk.service.capability.Launcher.AppStateListener appstatelistener)
    {
        return null;
    }

    public ServiceSubscription subscribeRunningApp(com.connectsdk.service.capability.Launcher.AppInfoListener appinfolistener)
    {
        Util.postError(appinfolistener, ServiceCommandError.notSupported());
        return new NotSupportedServiceSubscription();
    }

    static 
    {
        registeredApps = new ArrayList();
        registeredApps.add("pandora");
    }


}
