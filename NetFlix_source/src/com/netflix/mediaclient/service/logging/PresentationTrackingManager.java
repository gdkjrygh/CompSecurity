// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.logging;

import android.content.Context;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.service.logging.presentation.PresentationEvent;
import com.netflix.mediaclient.service.logging.presentation.PresentationRequest;
import com.netflix.mediaclient.service.logging.presentation.PresentationWebCallback;
import com.netflix.mediaclient.service.logging.presentation.PresentationWebClient;
import com.netflix.mediaclient.service.logging.presentation.PresentationWebClientFactory;
import com.netflix.mediaclient.service.resfetcher.ResourceFetcher;
import com.netflix.mediaclient.servicemgr.PresentationTracking;
import com.netflix.mediaclient.servicemgr.Trackable;
import com.netflix.mediaclient.servicemgr.UiLocation;
import com.netflix.mediaclient.util.EventQueue;
import com.netflix.mediaclient.util.StringUtils;
import com.netflix.mediaclient.util.data.DataRepository;
import com.netflix.mediaclient.util.data.FileSystemDataRepositoryImpl;
import java.io.File;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

// Referenced classes of package com.netflix.mediaclient.service.logging:
//            LoggingAgent

class PresentationTrackingManager
    implements PresentationTracking
{
    private class PresentationTrackingEventQueue extends EventQueue
    {

        final PresentationTrackingManager this$0;

        protected void doFlush(List list)
        {
            sendPresentationEvents(list);
        }

        public PresentationTrackingEventQueue(int i)
        {
            this$0 = PresentationTrackingManager.this;
            super("nf_pt_queue", i, 0x493e0L, true, true);
        }
    }

    private class PresentationWebCallbackImpl
        implements PresentationWebCallback
    {

        private String payload;
        final PresentationTrackingManager this$0;

        public void onEventsDelivered(String s)
        {
            if (Log.isLoggable("nf_presentation", 3))
            {
                Log.d("nf_presentation", (new StringBuilder()).append("Events delivered for  ").append(s).toString());
            }
            mOwner.clearFailureCounter();
            removeSavedEvents(s);
        }

        public void onEventsDeliveryFailed(String s)
        {
            if (Log.isLoggable("nf_presentation", 6))
            {
                Log.e("nf_presentation", (new StringBuilder()).append("Events delivery failed for  ").append(s).toString());
            }
            if (StringUtils.isEmpty(s))
            {
                return;
            } else
            {
                mExecutor.schedule(s. new Runnable() {

                    final PresentationWebCallbackImpl this$1;
                    final String val$deliveryRequestId;

                    public void run()
                    {
                        loadAndSendEvent(deliveryRequestId);
                    }

            
            {
                this$1 = final_presentationwebcallbackimpl;
                deliveryRequestId = String.this;
                super();
            }
                }, mOwner.getNextTimeToDeliverAfterFailure(), TimeUnit.MILLISECONDS);
                return;
            }
        }

        public PresentationWebCallbackImpl(String s)
        {
            this$0 = PresentationTrackingManager.this;
            super();
        }
    }


    private static final int PT_MAX_TIME_EVENT_CAN_STAY_IN_QUEUE_MS = 0x493e0;
    private static final int PT_MIN_NUMBER_OF_PAGES_TO_POST = 50;
    static final String REPOSITORY_DIR = "ptevents";
    public static final String TAG = "nf_presentation";
    private Context mContext;
    private DataRepository mDataRepository;
    private ScheduledExecutorService mExecutor;
    private LoggingAgent mOwner;
    private PresentationTrackingEventQueue mPresentationEventQueue;
    private PresentationWebClient mPresentationWebClient;
    private com.netflix.mediaclient.service.ServiceAgent.UserAgentInterface mUser;

    PresentationTrackingManager(Context context, LoggingAgent loggingagent, com.netflix.mediaclient.service.ServiceAgent.UserAgentInterface useragentinterface)
    {
        mOwner = loggingagent;
        mContext = context;
        mUser = useragentinterface;
    }

    private void deliverSavedPayloads(com.netflix.mediaclient.util.data.DataRepository.Entry aentry[])
    {
        if (aentry == null || aentry.length < 1)
        {
            Log.d("nf_presentation", "No saved events found");
        }
        if (Log.isLoggable("nf_presentation", 3))
        {
            Log.d("nf_presentation", (new StringBuilder()).append("Found ").append(aentry.length).append(" payloads waiting").toString());
        }
        int j = aentry.length;
        for (int i = 0; i < j; i++)
        {
            final String deliveryRequestId = aentry[i].getKey();
            mExecutor.schedule(new Runnable() {

                final PresentationTrackingManager this$0;
                final String val$deliveryRequestId;

                public void run()
                {
                    loadAndSendEvent(deliveryRequestId);
                }

            
            {
                this$0 = PresentationTrackingManager.this;
                deliveryRequestId = s;
                super();
            }
            }, mOwner.getNextTimeToDeliverAfterFailure(), TimeUnit.MILLISECONDS);
        }

    }

    private void initDataRepository()
    {
        Log.d("nf_presentation", "PtManager::init data repository started ");
        mDataRepository = new FileSystemDataRepositoryImpl(new File(mContext.getFilesDir(), "ptevents"));
        mExecutor.execute(new Runnable() {

            final PresentationTrackingManager this$0;

            public void run()
            {
                Log.d("nf_presentation", "Check if we have not delivered events from last time our app was runnung...");
                com.netflix.mediaclient.util.data.DataRepository.LoadedCallback loadedcallback = new com.netflix.mediaclient.util.data.DataRepository.LoadedCallback() {

                    final _cls2 this$1;

                    public void onLoaded(com.netflix.mediaclient.util.data.DataRepository.Entry aentry[])
                    {
                        if (aentry != null && aentry.length > 0)
                        {
                            deliverSavedPayloads(aentry);
                            return;
                        } else
                        {
                            Log.d("nf_presentation", "No saved payloads found.");
                            return;
                        }
                    }

            
            {
                this$1 = _cls2.this;
                super();
            }
                };
                mDataRepository.loadAll(loadedcallback);
            }

            
            {
                this$0 = PresentationTrackingManager.this;
                super();
            }
        });
        Log.d("nf_presentation", "PtManager::init data repository done ");
    }

    private void initPresentationQueue()
    {
        int i = 50;
        int j = mOwner.getConfigurationAgent().getPresentationTrackingAggregationSize();
        if (j != -1)
        {
            i = j;
        }
        mPresentationEventQueue = new PresentationTrackingEventQueue(i);
    }

    private void loadAndSendEvent(final String deliveryRequestId)
    {
        if (Log.isLoggable("nf_presentation", 3))
        {
            Log.d("nf_presentation", (new StringBuilder()).append("Load event ").append(deliveryRequestId).toString());
        }
        mDataRepository.load(deliveryRequestId, new com.netflix.mediaclient.util.data.DataRepository.DataLoadedCallback() {

            final PresentationTrackingManager this$0;
            final String val$deliveryRequestId;

            public void onDataLoaded(String s, byte abyte0[], long l)
            {
                if (abyte0 == null || abyte0.length < 1)
                {
                    Log.e("nf_presentation", "We failed to retrieve payload. Trying to delete it");
                    removeSavedEvents(deliveryRequestId);
                    return;
                }
                s = new PresentationRequest();
                try
                {
                    abyte0 = new String(abyte0, "utf-8");
                    s.initFromString(abyte0);
                    mPresentationWebClient.sendPresentationEvents(deliveryRequestId, s, new PresentationWebCallbackImpl(abyte0));
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (String s)
                {
                    Log.e("nf_presentation", "Failed to send events. Try to delete it.", s);
                }
                removeSavedEvents(deliveryRequestId);
            }

            
            {
                this$0 = PresentationTrackingManager.this;
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
            Log.e("nf_presentation", "Failed to remove payload from repository", s);
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
            Log.e("nf_presentation", "Failed to save payload to repository", s);
            return null;
        }
        return s;
    }

    private void sendPresentationEvents(List list)
    {
        if (Log.isLoggable("nf_presentation", 3))
        {
            Log.d("nf_presentation", (new StringBuilder()).append("Send events ").append(list.size()).toString());
        }
        PresentationRequest presentationrequest = new PresentationRequest(mContext, mOwner.getConfigurationAgent(), mUser);
        presentationrequest.addAllEvent(list);
        try
        {
            list = presentationrequest.toJSONObject().toString();
            if (Log.isLoggable("nf_presentation", 2))
            {
                Log.d("nf_presentation", (new StringBuilder()).append("Payload for presentation request ").append(list).toString());
            }
            String s = saveEvents(list);
            mPresentationWebClient.sendPresentationEvents(s, presentationrequest, new PresentationWebCallbackImpl(list));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (List list)
        {
            Log.e("nf_presentation", "Failed to create JSON object for presentation request", list);
        }
    }

    void checkState()
    {
        if (mPresentationEventQueue.flushIfCriteriaIsFulfilled())
        {
            Log.d("nf_presentation", "Presentation tracking events were send recently ms. We reached timeout, force send");
        }
    }

    void flush()
    {
        mPresentationEventQueue.flushEvents();
    }

    void init(ScheduledExecutorService scheduledexecutorservice)
    {
        mExecutor = scheduledexecutorservice;
        initPresentationQueue();
        mPresentationWebClient = PresentationWebClientFactory.create(mOwner.getResourceFetcher().getApiNextWebClient());
        initDataRepository();
    }

    void pauseDelivery()
    {
        mPresentationEventQueue.pauseDelivery();
    }

    public void reportPresentation(final Trackable trackable, final List videoIds, final int videoPos, final UiLocation uiLocation)
    {
        mExecutor.execute(new Runnable() {

            final PresentationTrackingManager this$0;
            final Trackable val$trackable;
            final UiLocation val$uiLocation;
            final List val$videoIds;
            final int val$videoPos;

            public void run()
            {
                PresentationEvent presentationevent = new PresentationEvent(trackable, videoIds, videoPos, uiLocation);
                if (Log.isLoggable("nf_presentation", 3))
                {
                    Log.d("nf_presentation", (new StringBuilder()).append("PresentationEvent received ").append(presentationevent).toString());
                }
                mPresentationEventQueue.post(presentationevent);
            }

            
            {
                this$0 = PresentationTrackingManager.this;
                trackable = trackable1;
                videoIds = list;
                videoPos = i;
                uiLocation = uilocation;
                super();
            }
        });
    }

    void resumeDelivery(boolean flag)
    {
        mPresentationEventQueue.resumeDelivery(flag);
    }









}
