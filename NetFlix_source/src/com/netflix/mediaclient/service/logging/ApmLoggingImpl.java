// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.logging;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.service.logging.apm.ApplicationSession;
import com.netflix.mediaclient.service.logging.apm.MobileNetworkConnectionSession;
import com.netflix.mediaclient.service.logging.apm.NetworkConnectionSession;
import com.netflix.mediaclient.service.logging.apm.UIAssetRequestSession;
import com.netflix.mediaclient.service.logging.apm.UIBrowseStartupSession;
import com.netflix.mediaclient.service.logging.apm.UIDataRequestSession;
import com.netflix.mediaclient.service.logging.apm.UIModelessViewSession;
import com.netflix.mediaclient.service.logging.apm.UIStartupSession;
import com.netflix.mediaclient.service.logging.apm.UserSession;
import com.netflix.mediaclient.service.logging.apm.WifiNetworkConnectionSession;
import com.netflix.mediaclient.service.logging.apm.WiredNetworkConnectionSession;
import com.netflix.mediaclient.service.logging.apm.model.AppSessionStartedEvent;
import com.netflix.mediaclient.service.logging.apm.model.Display;
import com.netflix.mediaclient.service.logging.apm.model.UIModalViewChangedEvent;
import com.netflix.mediaclient.service.logging.apm.model.UserSessionEndedEvent;
import com.netflix.mediaclient.service.logging.apm.model.UserSessionStartedEvent;
import com.netflix.mediaclient.service.logging.client.model.DataContext;
import com.netflix.mediaclient.service.logging.client.model.DeviceUniqueId;
import com.netflix.mediaclient.service.logging.client.model.Error;
import com.netflix.mediaclient.service.logging.client.model.Event;
import com.netflix.mediaclient.service.logging.client.model.FalcorPathResult;
import com.netflix.mediaclient.service.logging.client.model.HttpResponse;
import com.netflix.mediaclient.service.logging.client.model.UIError;
import com.netflix.mediaclient.servicemgr.ApplicationPerformanceMetricsLogging;
import com.netflix.mediaclient.util.StringUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.netflix.mediaclient.service.logging:
//            EventHandler

class ApmLoggingImpl
    implements ApplicationPerformanceMetricsLogging
{
    private class NetworkStatusMonitor
    {

        private boolean mMobileConnected;
        private boolean mWiFiConnected;
        private boolean mWiredConnected;
        final ApmLoggingImpl this$0;

        private void lostConnectivity()
        {
            reset();
            endWiredNetworkConnectivitySession();
            endWifiNetworkConnectivitySession();
            endMobileNetworkConnectivitySession();
        }

        private void reset()
        {
            mWiFiConnected = false;
            mMobileConnected = false;
            mWiredConnected = false;
        }

        public void handleConnectivityChange(Context context)
        {
            context = (ConnectivityManager)context.getSystemService("connectivity");
            if (context == null)
            {
                Log.w("nf_log_apm", "Connectivity manager is gone! Connectivity is lost!");
                lostConnectivity();
                return;
            }
            context = context.getActiveNetworkInfo();
            if (context == null)
            {
                Log.w("nf_log_apm", "Connectivity manager exist, but no active connection! Connectivity is lost!");
                lostConnectivity();
                return;
            }
            boolean flag = context.isConnectedOrConnecting();
            int i = context.getType();
            switch (i)
            {
            default:
                Log.d("nf_log_apm", (new StringBuilder()).append("Not supported network type ").append(i).toString());
                return;

            case 9: // '\t'
                mWiFiConnected = false;
                mMobileConnected = false;
                mWiredConnected = flag;
                if (flag)
                {
                    startWiredNetworkConnectivitySession();
                } else
                {
                    endWiredNetworkConnectivitySession();
                }
                endWifiNetworkConnectivitySession();
                endMobileNetworkConnectivitySession();
                return;

            case 1: // '\001'
                mWiFiConnected = flag;
                mMobileConnected = false;
                mWiredConnected = false;
                if (flag)
                {
                    startWifiNetworkConnectivitySession();
                } else
                {
                    endWifiNetworkConnectivitySession();
                }
                endWiredNetworkConnectivitySession();
                endMobileNetworkConnectivitySession();
                return;

            case 0: // '\0'
            case 6: // '\006'
                mWiFiConnected = false;
                mMobileConnected = flag;
                mWiredConnected = false;
                break;
            }
            if (flag)
            {
                startMobileNetworkConnectivitySession();
            } else
            {
                endMobileNetworkConnectivitySession();
            }
            endWiredNetworkConnectivitySession();
            endWifiNetworkConnectivitySession();
        }

        public boolean isMobileConnected()
        {
            return mMobileConnected;
        }

        public boolean isWiFiConnected()
        {
            return mWiFiConnected;
        }

        public boolean isWiredConnected()
        {
            return mWiredConnected;
        }

        private NetworkStatusMonitor()
        {
            this$0 = ApmLoggingImpl.this;
            super();
        }

    }


    private static final String TAG = "nf_log_apm";
    private ApplicationSession mApplicationSession;
    private Map mAssetRequests;
    private com.netflix.mediaclient.servicemgr.IClientLogging.ModalView mCurrentUiView;
    private DataContext mDataContext;
    private Map mDataRequests;
    private Map mDialogSessions;
    private EventHandler mEventHandler;
    private Map mNetworkConnectionSessions;
    private NetworkStatusMonitor mNetworkStatusMonitor;
    private String mNrdpLogSessionId;
    private UIBrowseStartupSession mUIBrowseStartupSession;
    private UIStartupSession mUIStartupSession;
    private UserSession mUserSession;

    ApmLoggingImpl(EventHandler eventhandler)
    {
        mDataRequests = Collections.synchronizedMap(new HashMap());
        mAssetRequests = Collections.synchronizedMap(new HashMap());
        mDialogSessions = Collections.synchronizedMap(new HashMap());
        mNetworkConnectionSessions = Collections.synchronizedMap(new HashMap());
        mNetworkStatusMonitor = new NetworkStatusMonitor();
        mEventHandler = eventhandler;
    }

    private void endMobileNetworkConnectivitySession()
    {
        Log.d("nf_log_apm", "Mobile networking session ended and posted to executor");
        final DataContext dataContext = mDataContext;
        final com.netflix.mediaclient.servicemgr.IClientLogging.ModalView ui = mCurrentUiView;
        mEventHandler.executeInBackground(new Runnable() {

            final ApmLoggingImpl this$0;
            final DataContext val$dataContext;
            final com.netflix.mediaclient.servicemgr.IClientLogging.ModalView val$ui;

            public void run()
            {
                Log.d("nf_log_apm", "Mobile networking session ended");
                handleEndedNetworkConnectionSession("mobileNetworkConnection", dataContext, ui);
                Log.d("nf_log_apm", "Mobile networking session end event posted.");
            }

            
            {
                this$0 = ApmLoggingImpl.this;
                dataContext = datacontext;
                ui = modalview;
                super();
            }
        });
        Log.d("nf_log_apm", "Mobile networking session end done.");
    }

    private void endWifiNetworkConnectivitySession()
    {
        Log.d("nf_log_apm", "Wifi networking session ended and posted to executor");
        final DataContext dataContext = mDataContext;
        final com.netflix.mediaclient.servicemgr.IClientLogging.ModalView ui = mCurrentUiView;
        mEventHandler.executeInBackground(new Runnable() {

            final ApmLoggingImpl this$0;
            final DataContext val$dataContext;
            final com.netflix.mediaclient.servicemgr.IClientLogging.ModalView val$ui;

            public void run()
            {
                Log.d("nf_log_apm", "Wifi networking session ended");
                handleEndedNetworkConnectionSession("wifiNetworkConnection", dataContext, ui);
                Log.d("nf_log_apm", "Wifi networking session end event posted.");
            }

            
            {
                this$0 = ApmLoggingImpl.this;
                dataContext = datacontext;
                ui = modalview;
                super();
            }
        });
        Log.d("nf_log_apm", "Wifi networking session end done.");
    }

    private void endWiredNetworkConnectivitySession()
    {
        Log.d("nf_log_apm", "Wired networking session ended and posted to executor");
        final DataContext dataContext = mDataContext;
        final com.netflix.mediaclient.servicemgr.IClientLogging.ModalView ui = mCurrentUiView;
        mEventHandler.executeInBackground(new Runnable() {

            final ApmLoggingImpl this$0;
            final DataContext val$dataContext;
            final com.netflix.mediaclient.servicemgr.IClientLogging.ModalView val$ui;

            public void run()
            {
                Log.d("nf_log_apm", "Wired networking session ended");
                handleEndedNetworkConnectionSession("wiredNetworkConnection", dataContext, ui);
                Log.d("nf_log_apm", "Wired networking session end event posted.");
            }

            
            {
                this$0 = ApmLoggingImpl.this;
                dataContext = datacontext;
                ui = modalview;
                super();
            }
        });
        Log.d("nf_log_apm", "Wired networking session end done.");
    }

    private void handleEndedNetworkConnectionSession(String s, DataContext datacontext, com.netflix.mediaclient.servicemgr.IClientLogging.ModalView modalview)
    {
        datacontext = (NetworkConnectionSession)mNetworkConnectionSessions.get(s);
        if (datacontext != null)
        {
            mEventHandler.removeSession(datacontext);
        } else
        if (Log.isLoggable("nf_log_apm", 6))
        {
            Log.e("nf_log_apm", (new StringBuilder()).append("Trying to terminate ").append(s).append(" networking session that does not exist!").toString());
            return;
        }
    }

    private void handleStartNetworkConnectionSession(NetworkConnectionSession networkconnectionsession, DataContext datacontext, com.netflix.mediaclient.servicemgr.IClientLogging.ModalView modalview)
    {
        NetworkConnectionSession networkconnectionsession1 = (NetworkConnectionSession)mNetworkConnectionSessions.get(networkconnectionsession.getName());
        if (networkconnectionsession1 != null)
        {
            mEventHandler.removeSession(networkconnectionsession1);
        }
        mNetworkConnectionSessions.put(networkconnectionsession.getName(), networkconnectionsession);
        mEventHandler.addSession(networkconnectionsession);
        networkconnectionsession = networkconnectionsession.createStartEvent();
        populateEvent(networkconnectionsession, datacontext, modalview);
        mEventHandler.post(networkconnectionsession);
        if (Log.isLoggable("nf_log_apm", 2))
        {
            datacontext = (new StringBuilder()).append("Started network connection session, event: ");
            if (networkconnectionsession == null)
            {
                networkconnectionsession = "n/a";
            } else
            {
                networkconnectionsession = networkconnectionsession.toString();
            }
            Log.v("nf_log_apm", datacontext.append(networkconnectionsession).toString());
        }
    }

    private void populateEvent(Event event, DataContext datacontext, com.netflix.mediaclient.servicemgr.IClientLogging.ModalView modalview)
    {
        if (event == null)
        {
            return;
        } else
        {
            event.setDataContext(datacontext);
            event.setModalView(modalview);
            return;
        }
    }

    private void sendUserSessionEvent(UserSessionStartedEvent usersessionstartedevent, DataContext datacontext, com.netflix.mediaclient.servicemgr.IClientLogging.ModalView modalview)
    {
        populateEvent(usersessionstartedevent, datacontext, modalview);
        mEventHandler.post(usersessionstartedevent);
        Log.d("nf_log_apm", "User session start event posted.");
    }

    private void startMobileNetworkConnectivitySession()
    {
        Log.d("nf_log_apm", "Mobile networking session started and posted to executor");
        final DataContext dataContext = mDataContext;
        final com.netflix.mediaclient.servicemgr.IClientLogging.ModalView ui = mCurrentUiView;
        mEventHandler.executeInBackground(new Runnable() {

            final ApmLoggingImpl this$0;
            final DataContext val$dataContext;
            final com.netflix.mediaclient.servicemgr.IClientLogging.ModalView val$ui;

            public void run()
            {
                Log.d("nf_log_apm", "Mobile networking session started and posted to executor");
                handleStartNetworkConnectionSession(new MobileNetworkConnectionSession(), dataContext, ui);
                Log.d("nf_log_apm", "Mobile networking session start event posted.");
            }

            
            {
                this$0 = ApmLoggingImpl.this;
                dataContext = datacontext;
                ui = modalview;
                super();
            }
        });
        Log.d("nf_log_apm", "Mobile networking session start done.");
    }

    private void startWifiNetworkConnectivitySession()
    {
        Log.d("nf_log_apm", "Wifi networking session started and posted to executor");
        final DataContext dataContext = mDataContext;
        final com.netflix.mediaclient.servicemgr.IClientLogging.ModalView ui = mCurrentUiView;
        mEventHandler.executeInBackground(new Runnable() {

            final ApmLoggingImpl this$0;
            final DataContext val$dataContext;
            final com.netflix.mediaclient.servicemgr.IClientLogging.ModalView val$ui;

            public void run()
            {
                Log.d("nf_log_apm", "Wifi networking session started and posted to executor");
                handleStartNetworkConnectionSession(new WifiNetworkConnectionSession(), dataContext, ui);
                Log.d("nf_log_apm", "Wifi networking session start event posted.");
            }

            
            {
                this$0 = ApmLoggingImpl.this;
                dataContext = datacontext;
                ui = modalview;
                super();
            }
        });
        Log.d("nf_log_apm", "Wifi networking session start done.");
    }

    private void startWiredNetworkConnectivitySession()
    {
        Log.d("nf_log_apm", "Wired networking session started and posted to executor");
        final DataContext dataContext = mDataContext;
        final com.netflix.mediaclient.servicemgr.IClientLogging.ModalView ui = mCurrentUiView;
        mEventHandler.executeInBackground(new Runnable() {

            final ApmLoggingImpl this$0;
            final DataContext val$dataContext;
            final com.netflix.mediaclient.servicemgr.IClientLogging.ModalView val$ui;

            public void run()
            {
                Log.d("nf_log_apm", "Wired networking session started and posted to executor");
                handleStartNetworkConnectionSession(new WiredNetworkConnectionSession(), dataContext, ui);
                Log.d("nf_log_apm", "Wired networking session start event posted.");
            }

            
            {
                this$0 = ApmLoggingImpl.this;
                dataContext = datacontext;
                ui = modalview;
                super();
            }
        });
        Log.d("nf_log_apm", "Wired networking session start done.");
    }

    public void endApplicationSession()
    {
        Log.d("nf_log_apm", "Application session ended and posted to executor");
        final DataContext dataContext = mDataContext;
        final com.netflix.mediaclient.servicemgr.IClientLogging.ModalView ui = mCurrentUiView;
        mEventHandler.executeInBackground(new Runnable() {

            final ApmLoggingImpl this$0;
            final DataContext val$dataContext;
            final com.netflix.mediaclient.servicemgr.IClientLogging.ModalView val$ui;

            public void run()
            {
                Log.d("nf_log_apm", "Application session ended");
                if (mApplicationSession == null)
                {
                    Log.w("nf_log_apm", "Application session does NOT exist!");
                    return;
                } else
                {
                    mEventHandler.removeSession(mApplicationSession);
                    Log.d("nf_log_apm", "Application session end event posting...");
                    com.netflix.mediaclient.service.logging.apm.model.AppSessionEndedEvent appsessionendedevent = mApplicationSession.createEndedEvent();
                    populateEvent(appsessionendedevent, dataContext, ui);
                    mEventHandler.post(appsessionendedevent);
                    mApplicationSession = null;
                    Log.d("nf_log_apm", "Application session end event posted.");
                    return;
                }
            }

            
            {
                this$0 = ApmLoggingImpl.this;
                dataContext = datacontext;
                ui = modalview;
                super();
            }
        });
        Log.d("nf_log_apm", "Application session end done.");
    }

    public void endAssetRequestSession(final String url, final com.netflix.mediaclient.servicemgr.IClientLogging.CompletionReason completionReason, final HttpResponse httpResponse, final Error error)
    {
        Log.d("nf_log_apm", "Asset request session ended and executed in backgound");
        final DataContext dataContext = mDataContext;
        final com.netflix.mediaclient.servicemgr.IClientLogging.ModalView ui = mCurrentUiView;
        mEventHandler.executeInBackground(new Runnable() {

            final ApmLoggingImpl this$0;
            final com.netflix.mediaclient.servicemgr.IClientLogging.CompletionReason val$completionReason;
            final DataContext val$dataContext;
            final Error val$error;
            final HttpResponse val$httpResponse;
            final com.netflix.mediaclient.servicemgr.IClientLogging.ModalView val$ui;
            final String val$url;

            public void run()
            {
                Object obj = (UIAssetRequestSession)mAssetRequests.remove(url);
                if (obj == null)
                {
                    if (Log.isLoggable("nf_log_apm", 3))
                    {
                        Log.d("nf_log_apm", (new StringBuilder()).append("UI Asset Request session does not exist (probably due to sampling) - url: ").append(url).toString());
                    }
                    return;
                } else
                {
                    mEventHandler.removeSession(((com.netflix.mediaclient.service.logging.client.LoggingSession) (obj)));
                    Log.d("nf_log_apm", "Asset request session end event posting...");
                    obj = ((UIAssetRequestSession) (obj)).createEndedEvent(completionReason, httpResponse, error);
                    populateEvent(((Event) (obj)), dataContext, ui);
                    mEventHandler.post(((Event) (obj)));
                    Log.d("nf_log_apm", "Asset request session end event posted.");
                    return;
                }
            }

            
            {
                this$0 = ApmLoggingImpl.this;
                url = s;
                completionReason = completionreason;
                httpResponse = httpresponse;
                error = error1;
                dataContext = datacontext;
                ui = modalview;
                super();
            }
        });
        Log.d("nf_log_apm", "Asset request session end done.");
    }

    public void endDataRequestSession(final String sessionId, final List dataContext, final com.netflix.mediaclient.servicemgr.IClientLogging.CompletionReason completionReason, final HttpResponse httpResponse, final Error error)
    {
        Log.d("nf_log_apm", "Data request session ended and posted to executor");
        dataContext = mDataContext;
        final com.netflix.mediaclient.servicemgr.IClientLogging.ModalView ui = mCurrentUiView;
        mEventHandler.executeInBackground(new Runnable() {

            final ApmLoggingImpl this$0;
            final com.netflix.mediaclient.servicemgr.IClientLogging.CompletionReason val$completionReason;
            final DataContext val$dataContext;
            final Error val$error;
            final HttpResponse val$httpResponse;
            final String val$sessionId;
            final com.netflix.mediaclient.servicemgr.IClientLogging.ModalView val$ui;

            public void run()
            {
                Object obj = (UIDataRequestSession)mDataRequests.remove(sessionId);
                if (obj == null)
                {
                    if (Log.isLoggable("nf_log_apm", 3))
                    {
                        Log.d("nf_log_apm", (new StringBuilder()).append("UI data request session does not exist (probably due to sampling) - sessionId: ").append(sessionId).toString());
                    }
                    return;
                } else
                {
                    mEventHandler.removeSession(((com.netflix.mediaclient.service.logging.client.LoggingSession) (obj)));
                    Log.d("nf_log_apm", "Data request session end event posting...");
                    obj = ((UIDataRequestSession) (obj)).createEndedEvent(completionReason, httpResponse, error);
                    populateEvent(((Event) (obj)), dataContext, ui);
                    mEventHandler.post(((Event) (obj)));
                    Log.d("nf_log_apm", "Data request session end event posted.");
                    return;
                }
            }

            
            {
                this$0 = ApmLoggingImpl.this;
                sessionId = s;
                completionReason = completionreason;
                httpResponse = httpresponse;
                error = error1;
                dataContext = datacontext;
                ui = modalview;
                super();
            }
        });
        Log.d("nf_log_apm", "Data request session end done.");
    }

    public void endUiBrowseStartupSession(final long timeToBrowseInteractive, final boolean success, final UIError error)
    {
        Log.d("nf_log_apm", "UI startup session ended and posted to executor");
        final DataContext dataContext = mDataContext;
        final com.netflix.mediaclient.servicemgr.IClientLogging.ModalView ui = mCurrentUiView;
        mEventHandler.executeInBackground(new Runnable() {

            final ApmLoggingImpl this$0;
            final DataContext val$dataContext;
            final UIError val$error;
            final boolean val$success;
            final long val$timeToBrowseInteractive;
            final com.netflix.mediaclient.servicemgr.IClientLogging.ModalView val$ui;

            public void run()
            {
                Log.d("nf_log_apm", "UI browse startup session ended");
                if (mUIBrowseStartupSession == null)
                {
                    Log.w("nf_log_apm", "UI browse startup session does NOT exist!");
                    return;
                } else
                {
                    mEventHandler.removeSession(mUIBrowseStartupSession);
                    Log.d("nf_log_apm", "UI browse startup session end event posting...");
                    com.netflix.mediaclient.service.logging.apm.model.UIBrowseStartupSessionEndedEvent uibrowsestartupsessionendedevent = mUIBrowseStartupSession.createEndedEvent(timeToBrowseInteractive, success, error);
                    populateEvent(uibrowsestartupsessionendedevent, dataContext, ui);
                    mEventHandler.post(uibrowsestartupsessionendedevent);
                    mUIBrowseStartupSession = null;
                    Log.d("nf_log_apm", "UI browse startup session end event posted.");
                    return;
                }
            }

            
            {
                this$0 = ApmLoggingImpl.this;
                timeToBrowseInteractive = l;
                success = flag;
                error = uierror;
                dataContext = datacontext;
                ui = modalview;
                super();
            }
        });
        Log.d("nf_log_apm", "UI browse startup session end done.");
    }

    public void endUiModelessViewSession(final String requestId)
    {
        Log.d("nf_log_apm", "UI modeless session ended and posted to executor");
        final DataContext dataContext = mDataContext;
        final com.netflix.mediaclient.servicemgr.IClientLogging.ModalView ui = mCurrentUiView;
        mEventHandler.executeInBackground(new Runnable() {

            final ApmLoggingImpl this$0;
            final DataContext val$dataContext;
            final String val$requestId;
            final com.netflix.mediaclient.servicemgr.IClientLogging.ModalView val$ui;

            public void run()
            {
                Log.d("nf_log_apm", "UI modeless session ended");
                Object obj = (UIModelessViewSession)mDialogSessions.get(requestId);
                if (obj == null)
                {
                    Log.w("nf_log_apm", (new StringBuilder()).append("UI modeless session does NOT exist for request ID:").append(requestId).toString());
                    return;
                } else
                {
                    mEventHandler.removeSession(((com.netflix.mediaclient.service.logging.client.LoggingSession) (obj)));
                    Log.d("nf_log_apm", "UI modeless session end event posting...");
                    obj = ((UIModelessViewSession) (obj)).createEndedEvent();
                    populateEvent(((Event) (obj)), dataContext, ui);
                    mEventHandler.post(((Event) (obj)));
                    Log.d("nf_log_apm", "UI modeless session end event posted.");
                    return;
                }
            }

            
            {
                this$0 = ApmLoggingImpl.this;
                requestId = s;
                dataContext = datacontext;
                ui = modalview;
                super();
            }
        });
        Log.d("nf_log_apm", "UI modeless session end done.");
    }

    public void endUiStartupSession(final boolean success, final UIError error)
    {
        if (mUIStartupSession == null)
        {
            return;
        } else
        {
            Log.d("nf_log_apm", "UI startup session ended and posted to executor");
            final DataContext dataContext = mDataContext;
            final com.netflix.mediaclient.servicemgr.IClientLogging.ModalView ui = mCurrentUiView;
            mEventHandler.executeInBackground(new Runnable() {

                final ApmLoggingImpl this$0;
                final DataContext val$dataContext;
                final UIError val$error;
                final boolean val$success;
                final com.netflix.mediaclient.servicemgr.IClientLogging.ModalView val$ui;

                public void run()
                {
                    Log.d("nf_log_apm", "UI startup session ended");
                    if (mUIStartupSession == null)
                    {
                        Log.w("nf_log_apm", "UI startup session does NOT exist!");
                        return;
                    } else
                    {
                        mEventHandler.removeSession(mUIStartupSession);
                        Log.d("nf_log_apm", "UI startup session end event posting...");
                        com.netflix.mediaclient.service.logging.apm.model.UIStartupSessionEndedEvent uistartupsessionendedevent = mUIStartupSession.createEndedEvent(success, error);
                        populateEvent(uistartupsessionendedevent, dataContext, ui);
                        mEventHandler.post(uistartupsessionendedevent);
                        mUIStartupSession = null;
                        Log.d("nf_log_apm", "UI startup session end event posted.");
                        return;
                    }
                }

            
            {
                this$0 = ApmLoggingImpl.this;
                success = flag;
                error = uierror;
                dataContext = datacontext;
                ui = modalview;
                super();
            }
            });
            Log.d("nf_log_apm", "UI startup session end done.");
            return;
        }
    }

    public void endUserSession(final com.netflix.mediaclient.servicemgr.ApplicationPerformanceMetricsLogging.EndReason endReason, final long lastUserActivityTime)
    {
        Log.d("nf_log_apm", "User session ended and posted to executor");
        final DataContext dataContext = mDataContext;
        final com.netflix.mediaclient.servicemgr.IClientLogging.ModalView ui = mCurrentUiView;
        mEventHandler.executeInBackground(new Runnable() {

            final ApmLoggingImpl this$0;
            final DataContext val$dataContext;
            final com.netflix.mediaclient.servicemgr.ApplicationPerformanceMetricsLogging.EndReason val$endReason;
            final long val$lastUserActivityTime;
            final com.netflix.mediaclient.servicemgr.IClientLogging.ModalView val$ui;

            public void run()
            {
                Log.d("nf_log_apm", "User session ended");
                if (mUserSession == null)
                {
                    Log.w("nf_log_apm", "User session does NOT exist!");
                    return;
                }
                UserSessionEndedEvent usersessionendedevent = mUserSession.createEndedEvent(endReason, lastUserActivityTime, dataContext, ui);
                if (usersessionendedevent == null)
                {
                    Log.d("nf_log_apm", "User session still waits on session id, do not post at this time.");
                    return;
                } else
                {
                    mEventHandler.removeSession(mUserSession);
                    Log.d("nf_log_apm", "User session end event posting...");
                    mEventHandler.post(usersessionendedevent);
                    mUserSession = null;
                    Log.d("nf_log_apm", "User session end event posted.");
                    return;
                }
            }

            
            {
                this$0 = ApmLoggingImpl.this;
                endReason = endreason;
                lastUserActivityTime = l;
                dataContext = datacontext;
                ui = modalview;
                super();
            }
        });
        Log.d("nf_log_apm", "User session end done.");
    }

    com.netflix.mediaclient.servicemgr.IClientLogging.ModalView getCurrentUiView()
    {
        return mCurrentUiView;
    }

    public void handleAssetRequestEnded(Intent intent)
    {
        UIError uierror;
        Object obj;
        String s;
        com.netflix.mediaclient.servicemgr.IClientLogging.CompletionReason completionreason;
        Log.d("nf_log_apm", "Handle asset request ended intent. Running it on main thread.");
        s = intent.getStringExtra("url");
        completionreason = com.netflix.mediaclient.servicemgr.IClientLogging.CompletionReason.valueOf(intent.getStringExtra("reason"));
        uierror = null;
        obj = null;
        UIError uierror1 = Error.createInstance(intent.getStringExtra("error"));
        uierror = uierror1;
        intent = HttpResponse.createInstance(intent.getStringExtra("http_response"));
        uierror = uierror1;
_L2:
        endAssetRequestSession(s, completionreason, intent, uierror);
        return;
        intent;
        Log.e("nf_log_apm", "Failed to parse properties", intent);
        intent = obj;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public void handleAssetRequestStarted(Intent intent)
    {
        Log.d("nf_log_apm", "Handle asset request started intent. Running it on main thread.");
        startAssetRequestSession(intent.getStringExtra("url"), com.netflix.mediaclient.servicemgr.IClientLogging.AssetType.valueOf(intent.getStringExtra("asset_type")));
    }

    public void handleConnectivityChange(Context context)
    {
        mNetworkStatusMonitor.handleConnectivityChange(context);
    }

    public void handleDataRequestEnded(Intent intent)
    {
        HttpResponse httpresponse;
        UIError uierror;
        HttpResponse httpresponse1;
        Object obj;
        String s;
        com.netflix.mediaclient.servicemgr.IClientLogging.CompletionReason completionreason;
        Log.d("nf_log_apm", "Handle data request ended intent. Running it on main thread.");
        s = intent.getStringExtra("request_id");
        completionreason = com.netflix.mediaclient.servicemgr.IClientLogging.CompletionReason.valueOf(intent.getStringExtra("reason"));
        uierror = null;
        httpresponse1 = null;
        obj = null;
        httpresponse = httpresponse1;
        UIError uierror1 = Error.createInstance(intent.getStringExtra("error"));
        httpresponse = httpresponse1;
        uierror = uierror1;
        httpresponse1 = HttpResponse.createInstance(intent.getStringExtra("http_response"));
        httpresponse = httpresponse1;
        uierror = uierror1;
        intent = FalcorPathResult.createList(intent.getStringExtra("falcorPathResults"));
        uierror = uierror1;
        httpresponse = httpresponse1;
_L2:
        endDataRequestSession(s, intent, completionreason, httpresponse, uierror);
        return;
        intent;
        Log.e("nf_log_apm", "Failed to parse properties", intent);
        intent = obj;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public void handleDataRequestStarted(Intent intent)
    {
        Log.d("nf_log_apm", "Handle data request started intent. Running it on main thread.");
        startDataRequestSession(intent.getStringExtra("url"), intent.getStringExtra("request_id"));
    }

    public void handleDialogDisplayed(Intent intent, boolean flag)
    {
        startUiModelessViewSession(flag, com.netflix.mediaclient.servicemgr.IClientLogging.ModalView.valueOf(intent.getStringExtra("dialog_type")), intent.getStringExtra("dialog_id"));
    }

    public void handleDialogRemoved(Intent intent)
    {
        endUiModelessViewSession(intent.getStringExtra("dialog_id"));
    }

    public boolean handleIntent(Intent intent, boolean flag)
    {
        String s = intent.getAction();
        if ("com.netflix.mediaclient.intent.action.LOG_APM_ASSET_REQUEST_STARTED".equals(s))
        {
            Log.d("nf_log_apm", "ASSET_REQUEST_STARTED");
            handleAssetRequestStarted(intent);
            return true;
        }
        if ("com.netflix.mediaclient.intent.action.LOG_APM_ASSET_REQUEST_ENDED".equals(s))
        {
            Log.d("nf_log_apm", "ASSET_REQUEST_ENDED");
            handleAssetRequestEnded(intent);
            return true;
        }
        if ("com.netflix.mediaclient.intent.action.LOG_APM_DATA_REQUEST_STARTED".equals(s))
        {
            Log.d("nf_log_apm", "DATA_REQUEST_STARTED");
            handleDataRequestStarted(intent);
            return true;
        }
        if ("com.netflix.mediaclient.intent.action.LOG_APM_DATA_REQUEST_ENDED".equals(s))
        {
            Log.d("nf_log_apm", "DATA_REQUEST_ENDED");
            handleDataRequestEnded(intent);
            return true;
        }
        if ("com.netflix.mediaclient.intent.action.LOG_APM_DIALOG_DISPLAYED".equals(s))
        {
            Log.d("nf_log_apm", "DIALOG_DISPLAYED");
            handleDialogDisplayed(intent, flag);
            return true;
        }
        if ("com.netflix.mediaclient.intent.action.LOG_APM_DIALOG_REMOVED".equals(s))
        {
            Log.d("nf_log_apm", "DIALOG_REMOVED");
            handleDialogRemoved(intent);
            return true;
        }
        if ("com.netflix.mediaclient.intent.action.LOG_APM_UI_MODAL_VIEW_CHANGED".equals(s))
        {
            Log.d("nf_log_apm", "UI_MODAL_VIEW_CHANGED");
            handleViewChanged(intent, flag);
            return true;
        }
        if (Log.isLoggable("nf_log_apm", 3))
        {
            Log.d("nf_log_apm", (new StringBuilder()).append("We do not support action ").append(s).toString());
        }
        return false;
    }

    public void handleViewChanged(Intent intent, boolean flag)
    {
        uiViewChanged(flag, com.netflix.mediaclient.servicemgr.IClientLogging.ModalView.valueOf(intent.getStringExtra("view")));
    }

    public boolean isUserSessionExist()
    {
        return mUserSession != null;
    }

    public void setDataContext(DataContext datacontext)
    {
        mDataContext = datacontext;
    }

    public void startApplicationSession(final boolean lastShutdownGraceful)
    {
        Log.d("nf_log_apm", "Application session started and posted to executor");
        final DataContext dataContext = mDataContext;
        final com.netflix.mediaclient.servicemgr.IClientLogging.ModalView ui = mCurrentUiView;
        mEventHandler.executeInBackground(new Runnable() {

            final ApmLoggingImpl this$0;
            final DataContext val$dataContext;
            final boolean val$lastShutdownGraceful;
            final com.netflix.mediaclient.servicemgr.IClientLogging.ModalView val$ui;

            public void run()
            {
                Log.d("nf_log_apm", "Application session created");
                Object obj = mEventHandler.getApplicationId();
                if (Log.isLoggable("nf_log_apm", 3))
                {
                    Log.d("nf_log_apm", (new StringBuilder()).append("startApplicationSession: Application id ").append(((String) (obj))).toString());
                }
                long l = Long.parseLong(((String) (obj)));
                mApplicationSession = new ApplicationSession();
                mApplicationSession.setId(l);
                mEventHandler.addSession(mApplicationSession);
                Log.d("nf_log_apm", "Application session start event posting...");
                obj = mApplicationSession.createStartEvent(lastShutdownGraceful);
                populateEvent(((Event) (obj)), dataContext, ui);
                ((AppSessionStartedEvent) (obj)).setSessionId(new DeviceUniqueId(l));
                mEventHandler.post(((Event) (obj)));
                Log.d("nf_log_apm", "Application session start event posted.");
            }

            
            {
                this$0 = ApmLoggingImpl.this;
                lastShutdownGraceful = flag;
                dataContext = datacontext;
                ui = modalview;
                super();
            }
        });
        Log.d("nf_log_apm", "Application session start done.");
    }

    public String startAssetRequestSession(String s, com.netflix.mediaclient.servicemgr.IClientLogging.AssetType assettype)
    {
        if ((UIAssetRequestSession)mAssetRequests.get(s) != null)
        {
            if (Log.isLoggable("nf_log_apm", 3))
            {
                Log.d("nf_log_apm", (new StringBuilder()).append("UI Asset request session already in progress for URL: ").append(s).toString());
            }
            return null;
        }
        if (!mEventHandler.canSendEvent("uiQOE", "uiAssetRequest"))
        {
            Log.d("nf_log_apm", "Asset request started. Asset request tracking is not enabled. Done.");
            return null;
        } else
        {
            Log.d("nf_log_apm", "Asset request session created");
            assettype = new UIAssetRequestSession(s, assettype);
            mEventHandler.addSession(assettype);
            mAssetRequests.put(s, assettype);
            Log.d("nf_log_apm", "Asset session start done.");
            return s;
        }
    }

    public boolean startDataRequestSession(String s, String s1)
    {
        if (StringUtils.isEmpty(s))
        {
            Log.e("nf_log_apm", "Data request session: url is empty, can not create session!");
            return false;
        }
        if (StringUtils.isEmpty(s1))
        {
            Log.e("nf_log_apm", "Data request session: requestId is empty, can not create session!");
            return false;
        }
        if (!mEventHandler.canSendEvent("uiQOE", "uiDataRequest"))
        {
            Log.d("nf_log_apm", "Data request started. Data request tracking is not enabled. Done.");
            return false;
        }
        s = new UIDataRequestSession(s, s1);
        mEventHandler.addSession(s);
        mDataRequests.put(s1, s);
        if (Log.isLoggable("nf_log_apm", 3))
        {
            Log.d("nf_log_apm", (new StringBuilder()).append("UI data request session added for '").append(s1).append("'").toString());
        }
        Log.d("nf_log_apm", "Data session start done.");
        return true;
    }

    public void startUiBrowseStartupSession(long l)
    {
        Log.d("nf_log_apm", "UI browse startup session started.");
        UIBrowseStartupSession uibrowsestartupsession = new UIBrowseStartupSession();
        uibrowsestartupsession.setStarted(l);
        mEventHandler.removeSession(mUIBrowseStartupSession);
        mEventHandler.addSession(uibrowsestartupsession);
        mUIBrowseStartupSession = uibrowsestartupsession;
    }

    public void startUiModelessViewSession(final boolean portrait, final com.netflix.mediaclient.servicemgr.IClientLogging.ModalView view, final String dialogId)
    {
        if (Log.isLoggable("nf_log_apm", 3))
        {
            Log.d("nf_log_apm", (new StringBuilder()).append("UI modeless session started and posted to executor ").append(view).append(". In portrait ").append(portrait).append(". Dialog id: ").append(dialogId).toString());
        }
        final DataContext dataContext = mDataContext;
        final com.netflix.mediaclient.servicemgr.IClientLogging.ModalView ui = mCurrentUiView;
        mEventHandler.executeInBackground(new Runnable() {

            final ApmLoggingImpl this$0;
            final DataContext val$dataContext;
            final String val$dialogId;
            final boolean val$portrait;
            final com.netflix.mediaclient.servicemgr.IClientLogging.ModalView val$ui;
            final com.netflix.mediaclient.servicemgr.IClientLogging.ModalView val$view;

            public void run()
            {
                if (Log.isLoggable("nf_log_apm", 3))
                {
                    Log.d("nf_log_apm", (new StringBuilder()).append("UI modeless session created for ").append(view).append(". In portrait ").append(portrait).append(". Session ID: ").append(dialogId).toString());
                }
                Object obj = new UIModelessViewSession();
                mDialogSessions.put(dialogId, obj);
                mEventHandler.addSession(((com.netflix.mediaclient.service.logging.client.LoggingSession) (obj)));
                Log.d("nf_log_apm", "UI modeless session start event posting...");
                obj = ((UIModelessViewSession) (obj)).createStartEvent(portrait, view);
                populateEvent(((Event) (obj)), dataContext, ui);
                mEventHandler.post(((Event) (obj)));
                Log.d("nf_log_apm", "UI modeless session start event posted.");
            }

            
            {
                this$0 = ApmLoggingImpl.this;
                view = modalview;
                portrait = flag;
                dialogId = s;
                dataContext = datacontext;
                ui = modalview1;
                super();
            }
        });
        Log.d("nf_log_apm", "User modeless session start done.");
    }

    public void startUiStartupSession(final com.netflix.mediaclient.servicemgr.ApplicationPerformanceMetricsLogging.UiStartupTrigger trigger, final com.netflix.mediaclient.servicemgr.IClientLogging.ModalView destination, final int trackId, final String searchTerm, final Map activeABTests, final Long started, final Display display)
    {
        Log.d("nf_log_apm", "UI startup session started and posted to executor");
        mEventHandler.executeInBackground(new Runnable() {

            final ApmLoggingImpl this$0;
            final Map val$activeABTests;
            final com.netflix.mediaclient.servicemgr.IClientLogging.ModalView val$destination;
            final Display val$display;
            final String val$searchTerm;
            final Long val$started;
            final int val$trackId;
            final com.netflix.mediaclient.servicemgr.ApplicationPerformanceMetricsLogging.UiStartupTrigger val$trigger;

            public void run()
            {
                Log.d("nf_log_apm", "UI startup session created");
                UIStartupSession uistartupsession = new UIStartupSession(trigger, destination, trackId, searchTerm, activeABTests, display);
                if (started != null)
                {
                    uistartupsession.setStarted(started.longValue());
                }
                mEventHandler.removeSession(mUIStartupSession);
                mUIStartupSession = uistartupsession;
                mEventHandler.addSession(uistartupsession);
            }

            
            {
                this$0 = ApmLoggingImpl.this;
                trigger = uistartuptrigger;
                destination = modalview;
                trackId = i;
                searchTerm = s;
                activeABTests = map;
                display = display1;
                started = long1;
                super();
            }
        });
        Log.d("nf_log_apm", "UI startup start done.");
    }

    public void startUiStartupSession(final com.netflix.mediaclient.servicemgr.ApplicationPerformanceMetricsLogging.UiStartupTrigger trigger, final com.netflix.mediaclient.servicemgr.IClientLogging.ModalView destination, final Long started, final Display display)
    {
        Log.d("nf_log_apm", "UI startup session started and posted to executor");
        mEventHandler.executeInBackground(new Runnable() {

            final ApmLoggingImpl this$0;
            final com.netflix.mediaclient.servicemgr.IClientLogging.ModalView val$destination;
            final Display val$display;
            final Long val$started;
            final com.netflix.mediaclient.servicemgr.ApplicationPerformanceMetricsLogging.UiStartupTrigger val$trigger;

            public void run()
            {
                if (mUIStartupSession != null)
                {
                    Log.e("nf_log_apm", "UI startup session already exist, we do not recreate it!");
                    return;
                }
                Log.d("nf_log_apm", "UI startup session created");
                UIStartupSession uistartupsession = new UIStartupSession(trigger, destination, display);
                if (started != null)
                {
                    uistartupsession.setStarted(started.longValue());
                }
                mEventHandler.removeSession(mUIStartupSession);
                mUIStartupSession = uistartupsession;
                mEventHandler.addSession(uistartupsession);
            }

            
            {
                this$0 = ApmLoggingImpl.this;
                trigger = uistartuptrigger;
                destination = modalview;
                display = display1;
                started = long1;
                super();
            }
        });
        Log.d("nf_log_apm", "UI startup start done.");
    }

    public void startUserSession(com.netflix.mediaclient.servicemgr.ApplicationPerformanceMetricsLogging.Trigger trigger)
    {
        startUserSession(trigger, 0L);
    }

    public void startUserSession(final com.netflix.mediaclient.servicemgr.ApplicationPerformanceMetricsLogging.Trigger trigger, final long idleTime)
    {
        if (mUserSession != null)
        {
            Log.d("nf_log_apm", "User session already exist");
            return;
        } else
        {
            Log.d("nf_log_apm", "User session started and posted to executor");
            final DataContext dataContext = mDataContext;
            final com.netflix.mediaclient.servicemgr.IClientLogging.ModalView ui = mCurrentUiView;
            mEventHandler.executeInBackground(new Runnable() {

                final ApmLoggingImpl this$0;
                final DataContext val$dataContext;
                final long val$idleTime;
                final com.netflix.mediaclient.servicemgr.ApplicationPerformanceMetricsLogging.Trigger val$trigger;
                final com.netflix.mediaclient.servicemgr.IClientLogging.ModalView val$ui;

                public void run()
                {
                    if (mUserSession != null)
                    {
                        Log.d("nf_log_apm", "User session already exist");
                        return;
                    }
                    Log.d("nf_log_apm", "User session created");
                    final UserSession us = new UserSession();
                    Log.d("nf_log_apm", "User session start event posting...");
                    UserSessionStartedEvent usersessionstartedevent = us.createStartEvent(trigger, idleTime);
                    String s = mEventHandler.getUserSessionId();
                    if (Log.isLoggable("nf_log_apm", 3))
                    {
                        Log.d("nf_log_apm", (new StringBuilder()).append("startUserSession: Current nrdp.log.sessionid ").append(s).toString());
                        Log.d("nf_log_apm", (new StringBuilder()).append("startUserSession: Last used nrdp.log.sessionid ").append(mNrdpLogSessionId).toString());
                    }
                    com.netflix.mediaclient.javabridge.ui.Log.ResetSessionIdCallback resetsessionidcallback = usersessionstartedevent. new com.netflix.mediaclient.javabridge.ui.Log.ResetSessionIdCallback() {

                        final _cls3 this$1;
                        final UserSessionStartedEvent val$ev;
                        final UserSession val$us;

                        public void sessionCreated(String s)
                        {
                            mEventHandler.removeSession(mUserSession);
                            mUserSession = us;
                            us.setId(Long.valueOf(s).longValue());
                            mNrdpLogSessionId = s;
                            mEventHandler.addSession(mUserSession);
                            s = us.getId();
                            ev.setSessionId(s);
                            sendUserSessionEvent(ev, dataContext, ui);
                            UserSessionEndedEvent usersessionendedevent = us.getPendingEndEvent();
                            if (usersessionendedevent != null)
                            {
                                usersessionendedevent.setSessionId(s);
                                mEventHandler.post(usersessionendedevent);
                                Log.d("nf_log_apm", "Pending user session end event posted.");
                            }
                        }

            
            {
                this$1 = final__pcls3;
                us = usersession;
                ev = UserSessionStartedEvent.this;
                super();
            }
                    };
                    if (mNrdpLogSessionId == null)
                    {
                        Log.d("nf_log_apm", "We never used nrdp.log.sessionid, use it now if user session exist in nrdp");
                        if (StringUtils.isEmpty(s))
                        {
                            Log.e("nf_log_apm", "User session is not yet created. This should NOT happen!");
                            mEventHandler.createUserSession(resetsessionidcallback);
                            return;
                        } else
                        {
                            Log.d("nf_log_apm", "User session is created. Set it to event and post event");
                            mEventHandler.removeSession(mUserSession);
                            mUserSession = us;
                            us.setId(Long.valueOf(s).longValue());
                            mNrdpLogSessionId = s;
                            mEventHandler.addSession(mUserSession);
                            usersessionstartedevent.setSessionId(us.getId());
                            sendUserSessionEvent(usersessionstartedevent, dataContext, ui);
                            return;
                        }
                    }
                    if (StringUtils.isEmpty(s))
                    {
                        Log.e("nf_log_apm", "User session is not yet created. This should NOT happen!");
                    } else
                    if (mNrdpLogSessionId.equals(s))
                    {
                        Log.e("nf_log_apm", "User session is not yet created. This should NOT happen!");
                    } else
                    {
                        Log.w("nf_log_apm", "Known used and current user session ids are NOT same, this should not happen");
                    }
                    mEventHandler.createUserSession(resetsessionidcallback);
                }

            
            {
                this$0 = ApmLoggingImpl.this;
                trigger = trigger1;
                idleTime = l;
                dataContext = datacontext;
                ui = modalview;
                super();
            }
            });
            Log.d("nf_log_apm", "User session start done.");
            return;
        }
    }

    public void uiViewChanged(final boolean portrait, final com.netflix.mediaclient.servicemgr.IClientLogging.ModalView view)
    {
        if (Log.isLoggable("nf_log_apm", 3))
        {
            Log.d("nf_log_apm", (new StringBuilder()).append("UI view changed and posted to executor ").append(view).toString());
        }
        final DataContext dataContext = mDataContext;
        final com.netflix.mediaclient.servicemgr.IClientLogging.ModalView ui = mCurrentUiView;
        mCurrentUiView = view;
        mEventHandler.executeInBackground(new Runnable() {

            final ApmLoggingImpl this$0;
            final DataContext val$dataContext;
            final boolean val$portrait;
            final com.netflix.mediaclient.servicemgr.IClientLogging.ModalView val$ui;
            final com.netflix.mediaclient.servicemgr.IClientLogging.ModalView val$view;

            public void run()
            {
                if (Log.isLoggable("nf_log_apm", 3))
                {
                    Log.d("nf_log_apm", (new StringBuilder()).append("UI view changed ").append(view).toString());
                }
                UIModalViewChangedEvent uimodalviewchangedevent = new UIModalViewChangedEvent(portrait, view);
                populateEvent(uimodalviewchangedevent, dataContext, ui);
                mEventHandler.post(uimodalviewchangedevent);
                Log.d("nf_log_apm", "UI view changed event posted.");
            }

            
            {
                this$0 = ApmLoggingImpl.this;
                view = modalview;
                portrait = flag;
                dataContext = datacontext;
                ui = modalview1;
                super();
            }
        });
        Log.d("nf_log_apm", "UI view changed done.");
    }

    public void uiViewChanged(final boolean portrait, final com.netflix.mediaclient.servicemgr.IClientLogging.ModalView view, final long timestamp)
    {
        Log.d("nf_log_apm", "UI view changed and posted to executor");
        final DataContext dataContext = mDataContext;
        final com.netflix.mediaclient.servicemgr.IClientLogging.ModalView ui = mCurrentUiView;
        mEventHandler.executeInBackground(new Runnable() {

            final ApmLoggingImpl this$0;
            final DataContext val$dataContext;
            final boolean val$portrait;
            final long val$timestamp;
            final com.netflix.mediaclient.servicemgr.IClientLogging.ModalView val$ui;
            final com.netflix.mediaclient.servicemgr.IClientLogging.ModalView val$view;

            public void run()
            {
                Log.d("nf_log_apm", "UI view changed");
                UIModalViewChangedEvent uimodalviewchangedevent = new UIModalViewChangedEvent(portrait, view);
                uimodalviewchangedevent.setTime(timestamp);
                populateEvent(uimodalviewchangedevent, dataContext, ui);
                mEventHandler.post(uimodalviewchangedevent);
                Log.d("nf_log_apm", "UI modeless session end event posted.");
            }

            
            {
                this$0 = ApmLoggingImpl.this;
                portrait = flag;
                view = modalview;
                timestamp = l;
                dataContext = datacontext;
                ui = modalview1;
                super();
            }
        });
        Log.d("nf_log_apm", "UI modeless session end done.");
    }














/*
    static ApplicationSession access$202(ApmLoggingImpl apmloggingimpl, ApplicationSession applicationsession)
    {
        apmloggingimpl.mApplicationSession = applicationsession;
        return applicationsession;
    }

*/




/*
    static UserSession access$402(ApmLoggingImpl apmloggingimpl, UserSession usersession)
    {
        apmloggingimpl.mUserSession = usersession;
        return usersession;
    }

*/



/*
    static String access$502(ApmLoggingImpl apmloggingimpl, String s)
    {
        apmloggingimpl.mNrdpLogSessionId = s;
        return s;
    }

*/




/*
    static UIStartupSession access$702(ApmLoggingImpl apmloggingimpl, UIStartupSession uistartupsession)
    {
        apmloggingimpl.mUIStartupSession = uistartupsession;
        return uistartupsession;
    }

*/



/*
    static UIBrowseStartupSession access$802(ApmLoggingImpl apmloggingimpl, UIBrowseStartupSession uibrowsestartupsession)
    {
        apmloggingimpl.mUIBrowseStartupSession = uibrowsestartupsession;
        return uibrowsestartupsession;
    }

*/

}
