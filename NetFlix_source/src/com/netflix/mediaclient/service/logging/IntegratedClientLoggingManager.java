// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.logging;

import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.NetflixApplication;
import com.netflix.mediaclient.android.app.ApplicationStateListener;
import com.netflix.mediaclient.android.app.UserInputManager;
import com.netflix.mediaclient.javabridge.ui.Nrdp;
import com.netflix.mediaclient.service.NetflixService;
import com.netflix.mediaclient.service.NrdController;
import com.netflix.mediaclient.service.logging.client.ClientLoggingWebCallback;
import com.netflix.mediaclient.service.logging.client.ClientLoggingWebClient;
import com.netflix.mediaclient.service.logging.client.ClientLoggingWebClientFactory;
import com.netflix.mediaclient.service.logging.client.LoggingSession;
import com.netflix.mediaclient.service.logging.client.model.DataContext;
import com.netflix.mediaclient.service.logging.client.model.Event;
import com.netflix.mediaclient.service.logging.client.model.LoggingRequest;
import com.netflix.mediaclient.service.resfetcher.ResourceFetcher;
import com.netflix.mediaclient.service.webclient.model.leafs.ConsolidatedLoggingSessionSpecification;
import com.netflix.mediaclient.servicemgr.ApplicationPerformanceMetricsLogging;
import com.netflix.mediaclient.servicemgr.UIViewLogging;
import com.netflix.mediaclient.servicemgr.UserActionLogging;
import com.netflix.mediaclient.servicemgr.UserProfile;
import com.netflix.mediaclient.util.DeviceUtils;
import com.netflix.mediaclient.util.EventQueue;
import com.netflix.mediaclient.util.LogUtils;
import com.netflix.mediaclient.util.StringUtils;
import com.netflix.mediaclient.util.data.DataRepository;
import com.netflix.mediaclient.util.data.FileSystemDataRepositoryImpl;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONObject;

// Referenced classes of package com.netflix.mediaclient.service.logging:
//            EventHandler, ApmLoggingImpl, LoggingAgent, UserActionLoggingImpl, 
//            UIViewLoggingImpl

class IntegratedClientLoggingManager
    implements EventHandler, ApplicationStateListener
{
    private class ClientLoggingEventQueue extends EventQueue
    {

        final IntegratedClientLoggingManager this$0;

        protected void doFlush(List list)
        {
            sendEvents(list);
        }

        public ClientLoggingEventQueue()
        {
            this$0 = IntegratedClientLoggingManager.this;
            super("nf_icl_queue", 30, 60000L, true, true);
        }
    }

    private class ClientLoggingWebCallbackImpl
        implements ClientLoggingWebCallback
    {

        private String payload;
        final IntegratedClientLoggingManager this$0;

        public void onEventsDelivered(String s)
        {
            if (Log.isLoggable("nf_log", 3))
            {
                Log.d("nf_log", (new StringBuilder()).append("Events delivered for  ").append(s).toString());
            }
            mOwner.clearFailureCounter();
            removeSavedEvents(s);
        }

        public void onEventsDeliveryFailed(String s)
        {
            if (Log.isLoggable("nf_log", 6))
            {
                Log.e("nf_log", (new StringBuilder()).append("Events delivery failed for  ").append(s).toString());
            }
            if (StringUtils.isEmpty(s))
            {
                return;
            } else
            {
                mExecutor.schedule(s. new Runnable() {

                    final ClientLoggingWebCallbackImpl this$1;
                    final String val$deliveryRequestId;

                    public void run()
                    {
                        loadAndSendEvent(deliveryRequestId);
                    }

            
            {
                this$1 = final_clientloggingwebcallbackimpl;
                deliveryRequestId = String.this;
                super();
            }
                }, mOwner.getNextTimeToDeliverAfterFailure(), TimeUnit.MILLISECONDS);
                return;
            }
        }

        public ClientLoggingWebCallbackImpl(String s)
        {
            this$0 = IntegratedClientLoggingManager.this;
            super();
        }
    }


    private static final int CL_MAX_TIME_THAN_EVENT_CAN_STAY_IN_QUEUE_MS = 60000;
    private static final int CL_MIN_NUMBER_OF_EVENTS_TO_POST = 30;
    private static final int DEFAULT_USER_SESSION_TIMEOUT_MS = 0x1b7740;
    static final String REPOSITORY_DIR = "iclevents";
    private static final String TAG = "nf_log";
    private UserActionLoggingImpl mActionLogging;
    private ApmLoggingImpl mApmLogging;
    private ClientLoggingWebClient mClientLoggingWebClient;
    private final Context mContext;
    private DataRepository mDataRepository;
    private final Map mEventPerSessionRndGeneratorMap = new HashMap();
    private final ClientLoggingEventQueue mEventQueue = new ClientLoggingEventQueue();
    private ScheduledExecutorService mExecutor;
    private UserInputManager mInputManager;
    private final List mLoggingSessions = Collections.synchronizedList(new ArrayList());
    private final LoggingAgent mOwner;
    private final AtomicLong mSequence = new AtomicLong(1L);
    private final NetflixService mService;
    private UIViewLoggingImpl mUIViewLogging;
    private final com.netflix.mediaclient.service.ServiceAgent.UserAgentInterface mUser;
    private final Map mUserSessionEnabledStatusMap = new HashMap();

    IntegratedClientLoggingManager(Context context, LoggingAgent loggingagent, com.netflix.mediaclient.service.ServiceAgent.UserAgentInterface useragentinterface, NetflixService netflixservice)
    {
        mOwner = loggingagent;
        mContext = context;
        mUser = useragentinterface;
        mService = netflixservice;
    }

    private void checkUserSessionState()
    {
        long l = mInputManager.getTimeSinceLastUserInteraction();
        if (Log.isLoggable("nf_log", 3))
        {
            Log.d("nf_log", (new StringBuilder()).append("Since last user interaction elapsed (sec): ").append(l / 1000L).toString());
        }
        long l1 = getUserSessionDurationInMs();
        if (l >= l1 && mApmLogging.isUserSessionExist())
        {
            Log.d("nf_log", "It is more than 30 minutes and user session exist. End user session");
            mApmLogging.endUserSession(com.netflix.mediaclient.servicemgr.ApplicationPerformanceMetricsLogging.EndReason.timeout, System.currentTimeMillis() - l);
        } else
        if (l < l1 && !mApmLogging.isUserSessionExist())
        {
            Log.d("nf_log", "It is less than 30 minutes and user session does NOT exist. Start user session");
            mApmLogging.startUserSession(com.netflix.mediaclient.servicemgr.ApplicationPerformanceMetricsLogging.Trigger.inputEvent);
            return;
        }
    }

    private void deliverSavedPayloads(com.netflix.mediaclient.util.data.DataRepository.Entry aentry[])
    {
        if (aentry == null || aentry.length < 1)
        {
            Log.d("nf_log", "No saved events found");
        }
        if (Log.isLoggable("nf_log", 3))
        {
            Log.d("nf_log", (new StringBuilder()).append("Found ").append(aentry.length).append(" payloads waiting").toString());
        }
        int j = aentry.length;
        for (int i = 0; i < j; i++)
        {
            final String deliveryRequestId = aentry[i].getKey();
            mExecutor.schedule(new Runnable() {

                final IntegratedClientLoggingManager this$0;
                final String val$deliveryRequestId;

                public void run()
                {
                    loadAndSendEvent(deliveryRequestId);
                }

            
            {
                this$0 = IntegratedClientLoggingManager.this;
                deliveryRequestId = s;
                super();
            }
            }, mOwner.getNextTimeToDeliverAfterFailure(), TimeUnit.MILLISECONDS);
        }

    }

    private void flushEventQueueIfCriteriaIsFulfilled()
    {
        if (mEventQueue.flushIfCriteriaIsFulfilled())
        {
            Log.d("nf_log", "Events were send recently. We reached timeout, force send");
        }
    }

    private long getUserSessionDurationInMs()
    {
        com.netflix.mediaclient.service.ServiceAgent.ConfigurationAgentInterface configurationagentinterface = mService.getConfiguration();
        if (configurationagentinterface == null)
        {
            return 0x1b7740L;
        } else
        {
            return 1000L * (long)configurationagentinterface.getApmUserSessionDurationInSeconds();
        }
    }

    private void initDataRepository()
    {
        Log.d("nf_log", "ICLManager::init data repository started ");
        mDataRepository = new FileSystemDataRepositoryImpl(new File(mContext.getFilesDir(), "iclevents"));
        mExecutor.execute(new Runnable() {

            final IntegratedClientLoggingManager this$0;

            public void run()
            {
                Log.d("nf_log", "Check if we have not delivered events from last time our app was runnung...");
                com.netflix.mediaclient.util.data.DataRepository.LoadedCallback loadedcallback = new com.netflix.mediaclient.util.data.DataRepository.LoadedCallback() {

                    final _cls1 this$1;

                    public void onLoaded(com.netflix.mediaclient.util.data.DataRepository.Entry aentry[])
                    {
                        if (aentry != null && aentry.length > 0)
                        {
                            deliverSavedPayloads(aentry);
                            return;
                        } else
                        {
                            Log.d("nf_log", "No saved payloads found.");
                            return;
                        }
                    }

            
            {
                this$1 = _cls1.this;
                super();
            }
                };
                mDataRepository.loadAll(loadedcallback);
            }

            
            {
                this$0 = IntegratedClientLoggingManager.this;
                super();
            }
        });
        Log.d("nf_log", "ICLManager::init data repository done ");
    }

    private boolean isEventSuppressed(String s, String s1)
    {
        String s2;
        boolean flag;
        boolean flag1;
        flag1 = true;
        flag = true;
        s2 = LogUtils.createSessionLookupKey(s, s1);
        s = mService.getConfiguration();
        if (s != null) goto _L2; else goto _L1
_L1:
        flag = false;
_L4:
        return flag;
_L2:
        ConsolidatedLoggingSessionSpecification consolidatedloggingsessionspecification;
        consolidatedloggingsessionspecification = s.getConsolidatedLoggingSessionSpecification(s2);
        if (consolidatedloggingsessionspecification != null)
        {
            break; /* Loop/switch isn't completed */
        }
        if (Log.isLoggable("nf_log", 3))
        {
            Log.d("nf_log", (new StringBuilder()).append("CL session specification overide not found. Event can be sent for ").append(s2).toString());
            return true;
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (Log.isLoggable("nf_log", 3))
        {
            Log.d("nf_log", (new StringBuilder()).append("CL session specification overide found: ").append(consolidatedloggingsessionspecification).toString());
        }
        if (consolidatedloggingsessionspecification.getDisableChancePercentagePerUserSession() <= 0)
        {
            Log.d("nf_log", "Event should NOT be suppressed.");
            return true;
        }
        if (consolidatedloggingsessionspecification.getDisableChancePercentagePerUserSession() >= 100)
        {
            Log.d("nf_log", "Event is fully suppressed.");
            return true;
        }
        if (Log.isLoggable("nf_log", 3))
        {
            Log.d("nf_log", (new StringBuilder()).append("Event is suppressed with restriction that ").append(consolidatedloggingsessionspecification.getSuppressPercentagePerEvent()).append(" of created events will not be logged.").toString());
        }
        s1 = (Random)mEventPerSessionRndGeneratorMap.get(s2);
        s = s1;
        if (s1 == null)
        {
            s = new Random();
            mEventPerSessionRndGeneratorMap.put(s2, s);
        }
        int i = s.nextInt(100);
        if (i < consolidatedloggingsessionspecification.getSuppressPercentagePerEvent())
        {
            flag1 = false;
        }
        flag = flag1;
        if (Log.isLoggable("nf_log", 3))
        {
            Log.d("nf_log", (new StringBuilder()).append("Rnd value ").append(i).append(", event can be sent").append(flag1).toString());
            return flag1;
        }
        if (true) goto _L4; else goto _L5
_L5:
    }

    private boolean isKids()
    {
        Object obj = mUser;
        if (obj == null)
        {
            Log.w("nf_log", "getUiMode:: getUserAgent is null! isKids() = false");
            return false;
        }
        if (!((com.netflix.mediaclient.service.ServiceAgent.UserAgentInterface) (obj)).isUserLoggedIn())
        {
            Log.d("nf_log", "getUiMode:: user is NOT logged in. isKids() = false");
            return false;
        }
        obj = ((com.netflix.mediaclient.service.ServiceAgent.UserAgentInterface) (obj)).getCurrentProfile();
        if (obj == null)
        {
            Log.w("nf_log", "getUiMode:: user is logged in, but profile is null. isKids() = false");
            return false;
        } else
        {
            return ((UserProfile) (obj)).isKidsProfile();
        }
    }

    private void loadAndSendEvent(final String deliveryRequestId)
    {
        if (Log.isLoggable("nf_log", 3))
        {
            Log.d("nf_log", (new StringBuilder()).append("Load event ").append(deliveryRequestId).toString());
        }
        mDataRepository.load(deliveryRequestId, new com.netflix.mediaclient.util.data.DataRepository.DataLoadedCallback() {

            final IntegratedClientLoggingManager this$0;
            final String val$deliveryRequestId;

            public void onDataLoaded(String s, byte abyte0[], long l)
            {
                if (abyte0 == null || abyte0.length < 1)
                {
                    Log.e("nf_log", "We failed to retrieve payload. Trying to delete it");
                    removeSavedEvents(deliveryRequestId);
                    return;
                }
                try
                {
                    s = new String(abyte0, "utf-8");
                    mClientLoggingWebClient.sendLoggingEvents(deliveryRequestId, s, new ClientLoggingWebCallbackImpl(s));
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (String s)
                {
                    Log.e("nf_log", "Failed to send events. Try to delete it.", s);
                }
                removeSavedEvents(deliveryRequestId);
            }

            
            {
                this$0 = IntegratedClientLoggingManager.this;
                deliveryRequestId = s;
                super();
            }
        });
    }

    private void removeSavedEvents(String s)
    {
        try
        {
            mDataRepository.remove(s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.e("nf_log", "Failed to remove payload from repository", s);
        }
    }

    private String saveEvents(String s)
    {
        try
        {
            s = mDataRepository.save(String.valueOf(System.currentTimeMillis()), s.getBytes("utf-8"));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.e("nf_log", "Failed to save payload to repository", s);
            return null;
        }
        return s;
    }

    private void sendEvents(List list)
    {
        if (Log.isLoggable("nf_log", 3))
        {
            Log.d("nf_log", (new StringBuilder()).append("Send events ").append(list.size()).toString());
        }
        Object obj = new LoggingRequest(mContext, mService.getConfiguration(), mUser, mService.getCurrentAppLocale());
        ((LoggingRequest) (obj)).addAllEvent(list);
        try
        {
            list = ((LoggingRequest) (obj)).toJSONObject().toString();
            if (Log.isLoggable("nf_log", 2))
            {
                Log.v("nf_log", "Payload for log request: ");
                Log.dumpVerbose("nf_log", list);
            }
            obj = saveEvents(list);
            mClientLoggingWebClient.sendLoggingEvents(((String) (obj)), list, new ClientLoggingWebCallbackImpl(list));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (List list)
        {
            Log.e("nf_log", "Failed to create JSON object for logging request", list);
        }
    }

    public void addSession(LoggingSession loggingsession)
    {
        if (loggingsession == null)
        {
            return;
        } else
        {
            mLoggingSessions.add(loggingsession);
            return;
        }
    }

    public boolean canSendEvent(String s, String s1)
    {
        return isConsolidatedLoggingSessionEnabled(s, s1) && isEventSuppressed(s, s1);
    }

    void checkState()
    {
        flushEventQueueIfCriteriaIsFulfilled();
        checkUserSessionState();
    }

    public void createUserSession(com.netflix.mediaclient.javabridge.ui.Log.ResetSessionIdCallback resetsessionidcallback)
    {
        mOwner.getNrdController().getNrdp().getLog().resetSessionID(resetsessionidcallback);
        newUserSession();
    }

    public void executeInBackground(Runnable runnable)
    {
        mExecutor.execute(runnable);
    }

    void flush()
    {
        mEventQueue.flushEvents();
    }

    public UserActionLogging getActionLogging()
    {
        return mActionLogging;
    }

    List getActiveSessions()
    {
        this;
        JVM INSTR monitorenter ;
        Object obj;
        Object obj1 = mLoggingSessions;
        obj = new ArrayList();
        for (obj1 = ((List) (obj1)).iterator(); ((Iterator) (obj1)).hasNext(); ((List) (obj)).add(((LoggingSession)((Iterator) (obj1)).next()).getKey())) { }
        break MISSING_BLOCK_LABEL_60;
        obj;
        throw obj;
        this;
        JVM INSTR monitorexit ;
        return ((List) (obj));
    }

    public ApplicationPerformanceMetricsLogging getApmLogging()
    {
        return mApmLogging;
    }

    public String getApplicationId()
    {
        return mOwner.getNrdController().getNrdp().getLog().getAppId();
    }

    long getNextSequence()
    {
        return mSequence.getAndAdd(1L);
    }

    public UIViewLogging getUiViewLogging()
    {
        return mUIViewLogging;
    }

    public String getUserSessionId()
    {
        return mOwner.getNrdController().getNrdp().getLog().getSessionId();
    }

    public void handleConnectivityChange(Intent intent)
    {
        mApmLogging.handleConnectivityChange(mContext);
    }

    void handleIntent(Intent intent)
    {
        boolean flag = DeviceUtils.isPortrait(mContext);
        if (mApmLogging.handleIntent(intent, flag))
        {
            Log.d("nf_log", "Handled by APM logger");
            return;
        }
        if (mActionLogging.handleIntent(intent, flag))
        {
            Log.d("nf_log", "Handled by UI Action logger");
            return;
        }
        if (mUIViewLogging.handleIntent(intent, flag))
        {
            Log.d("nf_log", "Handled by UI View logger");
            return;
        } else
        {
            Log.w("nf_log", "Action not handled!");
            return;
        }
    }

    void init(ScheduledExecutorService scheduledexecutorservice)
    {
        mExecutor = scheduledexecutorservice;
        mInputManager = mOwner.getApplication().getUserInput();
        Log.d("nf_log", "ClientLoggingAgent::init web client start ");
        mClientLoggingWebClient = ClientLoggingWebClientFactory.create(mOwner.getResourceFetcher().getApiNextWebClient());
        Log.d("nf_log", "ClientLoggingAgent::init web client done ");
        mApmLogging = new ApmLoggingImpl(this);
        mActionLogging = new UserActionLoggingImpl(this);
        mUIViewLogging = new UIViewLoggingImpl(this);
        Log.d("nf_log", "Add ICL manager as listener on user input...");
        mOwner.getApplication().getUserInput().addListener(this);
        Log.d("nf_log", "Add ICL manager as listener on user input done.");
        initDataRepository();
        mApmLogging.handleConnectivityChange(mContext);
    }

    public boolean isConsolidatedLoggingSessionEnabled(String s, String s1)
    {
        boolean flag2 = true;
        boolean flag = true;
        s = LogUtils.createSessionLookupKey(s, s1);
        s1 = (Boolean)mUserSessionEnabledStatusMap.get(s);
        if (s1 != null)
        {
            if (Log.isLoggable("nf_log", 3))
            {
                Log.d("nf_log", (new StringBuilder()).append("CL session specification overide exist and status enabled : ").append(s1).toString());
            }
            flag = s1.booleanValue();
        } else
        {
            Log.d("nf_log", "CL session cached status not found, check if overide exist");
            s1 = mService.getConfiguration();
            if (s1 == null)
            {
                return false;
            }
            s1 = s1.getConsolidatedLoggingSessionSpecification(s);
            if (s1 == null)
            {
                if (Log.isLoggable("nf_log", 3))
                {
                    Log.d("nf_log", (new StringBuilder()).append("CL session specification overide not found. Session is enabled for ").append(s).toString());
                    return true;
                }
            } else
            {
                if (Log.isLoggable("nf_log", 3))
                {
                    Log.d("nf_log", (new StringBuilder()).append("CL session specification overide found: ").append(s1).toString());
                }
                if (s1.getDisableChancePercentagePerUserSession() <= 0)
                {
                    Log.d("nf_log", "CL session is enabled without restrictions");
                    return true;
                }
                if (s1.getDisableChancePercentagePerUserSession() >= 100)
                {
                    Log.d("nf_log", "CL session is disabled");
                    return true;
                }
                if (Log.isLoggable("nf_log", 3))
                {
                    Log.d("nf_log", (new StringBuilder()).append("CL session is enabled with restriction that ").append(s1.getDisableChancePercentagePerUserSession()).append(" of user sessions will not be logged.").toString());
                }
                int i = (new Random()).nextInt(100);
                boolean flag1;
                if (i >= s1.getDisableChancePercentagePerUserSession())
                {
                    flag1 = flag2;
                } else
                {
                    flag1 = false;
                }
                if (Log.isLoggable("nf_log", 3))
                {
                    Log.d("nf_log", (new StringBuilder()).append("Rnd value ").append(i).append(", session is enabled ").append(flag1).toString());
                }
                mUserSessionEnabledStatusMap.put(s, Boolean.valueOf(flag1));
                return flag1;
            }
        }
        return flag;
    }

    void newUserSession()
    {
        mEventPerSessionRndGeneratorMap.clear();
        mUserSessionEnabledStatusMap.clear();
    }

    public void onBackground(UserInputManager userinputmanager)
    {
        Log.d("nf_log", "App in background");
    }

    public void onForeground(UserInputManager userinputmanager)
    {
        Log.d("nf_log", "App in foreground");
        long l = SystemClock.elapsedRealtime() - userinputmanager.getTimeSinceLastUserInteraction();
        if (l > 0L)
        {
            mApmLogging.startUserSession(com.netflix.mediaclient.servicemgr.ApplicationPerformanceMetricsLogging.Trigger.resumeFromBackground, l);
            return;
        } else
        {
            mApmLogging.startUserSession(com.netflix.mediaclient.servicemgr.ApplicationPerformanceMetricsLogging.Trigger.resumeFromBackground);
            return;
        }
    }

    public void onUiGone(UserInputManager userinputmanager)
    {
        Log.d("nf_log", "App ui gone");
        mApmLogging.endUserSession(com.netflix.mediaclient.servicemgr.ApplicationPerformanceMetricsLogging.EndReason.appClose, System.currentTimeMillis() - userinputmanager.getTimeSinceLastUserInteraction());
    }

    public void onUiStarted(UserInputManager userinputmanager)
    {
        Log.d("nf_log", "App ui started");
        long l = SystemClock.elapsedRealtime() - userinputmanager.getTimeSinceLastUserInteraction();
        if (l > 0L)
        {
            mApmLogging.startUserSession(com.netflix.mediaclient.servicemgr.ApplicationPerformanceMetricsLogging.Trigger.appStart, l);
            return;
        } else
        {
            mApmLogging.startUserSession(com.netflix.mediaclient.servicemgr.ApplicationPerformanceMetricsLogging.Trigger.appStart);
            return;
        }
    }

    void pauseDelivery()
    {
        mEventQueue.pauseDelivery();
    }

    public void post(Event event)
    {
        event.addAllActiveSession(getActiveSessions());
        event.setSequence(getNextSequence());
        event.setUptime(mOwner.getUptime());
        event.setKids(isKids());
        if (event.getModalView() != null) goto _L2; else goto _L1
_L1:
        com.netflix.mediaclient.servicemgr.IClientLogging.ModalView modalview = mApmLogging.getCurrentUiView();
        if (Log.isLoggable("nf_log", 3))
        {
            Log.d("nf_log", (new StringBuilder()).append("UI modalView is not preset, set it to ").append(modalview).toString());
        }
        event.setModalView(modalview);
_L4:
        if (Log.isLoggable("nf_log", 3))
        {
            Log.d("nf_log", (new StringBuilder()).append("Event received ").append(event).toString());
        }
        mEventQueue.post(event);
        return;
_L2:
        if (Log.isLoggable("nf_log", 3))
        {
            Log.d("nf_log", (new StringBuilder()).append("UI modalView is preset to ").append(event.getModalView()).toString());
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void removeSession(LoggingSession loggingsession)
    {
        if (loggingsession != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (!mLoggingSessions.remove(loggingsession))
        {
            continue; /* Loop/switch isn't completed */
        }
        if (!Log.isLoggable("nf_log", 3)) goto _L1; else goto _L3
_L3:
        Log.d("nf_log", (new StringBuilder()).append("Session ").append(loggingsession.getName()).append(" was removed from active sessions").toString());
        return;
        if (!Log.isLoggable("nf_log", 5)) goto _L1; else goto _L4
_L4:
        Log.w("nf_log", (new StringBuilder()).append("Session ").append(loggingsession.getName()).append(" was not found in active sessions").toString());
        return;
    }

    void resumeDelivery(boolean flag)
    {
        mEventQueue.resumeDelivery(flag);
    }

    public void setDataContext(DataContext datacontext)
    {
        mApmLogging.setDataContext(datacontext);
        mActionLogging.setDataContext(datacontext);
    }








}
