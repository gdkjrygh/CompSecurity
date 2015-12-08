// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.logging.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v4.content.LocalBroadcastManager;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.android.app.BackgroundTask;
import com.netflix.mediaclient.service.configuration.esn.EsnProvider;
import com.netflix.mediaclient.service.logging.LoggingAgent;
import com.netflix.mediaclient.service.logging.ads.model.AdvertiserIdRequest;
import com.netflix.mediaclient.service.resfetcher.ResourceFetcher;
import com.netflix.mediaclient.servicemgr.AdvertiserIdLogging;
import com.netflix.mediaclient.util.DeviceUtils;
import com.netflix.mediaclient.util.PreferenceUtils;

// Referenced classes of package com.netflix.mediaclient.service.logging.ads:
//            AdvertiserIdLoggingWebClient, AdvertisingIdProvider, AdvertiserIdLoggingWebClientFactory, AdvertisingIdProviderFactory, 
//            AdvertiserIdLoggingCallback

public final class AdvertiserIdLoggingManager
    implements AdvertiserIdLogging
{

    private static final long DAY_IN_MS = 0x5265c00L;
    private static final String TAG = "nf_adv_id";
    private String mAdIdReported;
    private Boolean mAdIdReportedOptedIn;
    private long mAdIdReportedTimestamp;
    private AdvertisingIdProvider mAdvertisingIdProvider;
    private Context mContext;
    private AdvertiserIdLoggingWebClient mLoggingWebClient;
    private LoggingAgent mOwner;
    private com.netflix.mediaclient.servicemgr.AdvertiserIdLogging.EventType mPostponedEvent;
    private final BroadcastReceiver mReceiver = new BroadcastReceiver() {

        final AdvertiserIdLoggingManager this$0;

        public void onReceive(Context context1, Intent intent)
        {
            if (Log.isLoggable("nf_adv_id", 2))
            {
                Log.v("nf_adv_id", (new StringBuilder()).append("Received intent ").append(intent).toString());
            }
            context1 = intent.getAction();
            if ("com.netflix.mediaclient.intent.action.PUSH_ONLOGIN".equals(context1))
            {
                Log.d("nf_adv_id", "onLogin");
                onLogin();
            } else
            {
                if ("com.netflix.mediaclient.intent.action.PUSH_ONLOGOUT".equals(context1))
                {
                    Log.d("nf_adv_id", "onLogout");
                    onLogout();
                    return;
                }
                if ("com.netflix.mediaclient.intent.action.ONSIGNUP".equals(context1))
                {
                    Log.d("nf_adv_id", "onSignUp");
                    sendAdvertiserId(com.netflix.mediaclient.servicemgr.AdvertiserIdLogging.EventType.sign_up);
                    return;
                }
                if (Log.isLoggable("nf_adv_id", 3))
                {
                    Log.d("nf_adv_id", (new StringBuilder()).append("We do not support action ").append(context1).toString());
                    return;
                }
            }
        }

            
            {
                this$0 = AdvertiserIdLoggingManager.this;
                super();
            }
    };

    public AdvertiserIdLoggingManager(Context context, LoggingAgent loggingagent)
    {
        mContext = context;
        mOwner = loggingagent;
        initProvider();
    }

    private void doSendAdvertiserId(final String id, final Boolean optedIn, com.netflix.mediaclient.servicemgr.AdvertiserIdLogging.EventType eventtype)
    {
        Object obj = null;
        String s = obj;
        if (mOwner != null)
        {
            s = obj;
            if (mOwner.getConfigurationAgent() != null)
            {
                s = obj;
                if (mOwner.getConfigurationAgent().getEsnProvider() != null)
                {
                    s = mOwner.getConfigurationAgent().getEsnProvider().getDeviceModel();
                }
            }
        }
        eventtype = new AdvertiserIdRequest(id, optedIn.booleanValue(), eventtype, s);
        id = new AdvertiserIdLoggingCallback() {

            final AdvertiserIdLoggingManager this$0;
            final String val$id;
            final Boolean val$optedIn;

            public void onFailure()
            {
                Log.d("nf_adv_id", "Advertiser ID failed to be delivered");
            }

            public void onSuccess()
            {
                Log.d("nf_adv_id", "Advertiser ID delivered");
                long l = System.currentTimeMillis();
                PreferenceUtils.putStringPref(mContext, "advertisement_id", id);
                PreferenceUtils.putLongPref(mContext, "advertisement_id_ts", l);
                PreferenceUtils.putBooleanPref(mContext, "advertisement_id_opted_in", optedIn.booleanValue());
                mAdIdReported = id;
                mAdIdReportedTimestamp = l;
                mAdIdReportedOptedIn = optedIn;
            }

            
            {
                this$0 = AdvertiserIdLoggingManager.this;
                id = s;
                optedIn = boolean1;
                super();
            }
        };
        mLoggingWebClient.sendLoggingEvent(eventtype.toJson(), id);
    }

    private void initProvider()
    {
        (new BackgroundTask()).execute(new Runnable() {

            final AdvertiserIdLoggingManager this$0;

            public void run()
            {
                mAdIdReported = PreferenceUtils.getStringPref(mContext, "advertisement_id", null);
                mAdIdReportedTimestamp = PreferenceUtils.getLongPref(mContext, "advertisement_id_ts", 0L);
                mAdIdReportedOptedIn = Boolean.valueOf(PreferenceUtils.getBooleanPref(mContext, "advertisement_id_opted_in", false));
                mAdvertisingIdProvider = AdvertisingIdProviderFactory.getInstance(mContext);
                com.netflix.mediaclient.servicemgr.AdvertiserIdLogging.EventType eventtype = mPostponedEvent;
                mPostponedEvent = null;
                if (!DeviceUtils.isFirstApplicationStartAfterInstallation(mContext))
                {
                    Log.d("nf_adv_id", "Not first start after installation");
                } else
                {
                    Log.d("nf_adv_id", "First start after installation");
                    sendAdvertiserId(com.netflix.mediaclient.servicemgr.AdvertiserIdLogging.EventType.install);
                }
                if (eventtype != null)
                {
                    sendAdvertiserId(eventtype);
                }
            }

            
            {
                this$0 = AdvertiserIdLoggingManager.this;
                super();
            }
        });
    }

    private boolean isAlreadySentInLastPeriod()
    {
        long l = System.currentTimeMillis();
        return mAdIdReportedTimestamp > 0L && l < 0x5265c00L + mAdIdReportedTimestamp;
    }

    private void onLogin()
    {
        sendAdvertiserId(com.netflix.mediaclient.servicemgr.AdvertiserIdLogging.EventType.sign_in);
    }

    private void onLogout()
    {
    }

    private void registerReceiver()
    {
        Log.d("nf_adv_id", "Register receiver");
        IntentFilter intentfilter = new IntentFilter("com.netflix.mediaclient.intent.action.PUSH_ONLOGIN");
        intentfilter.addAction("com.netflix.mediaclient.intent.action.PUSH_ONLOGOUT");
        intentfilter.addAction("com.netflix.mediaclient.intent.action.ONSIGNUP");
        intentfilter.addCategory("com.netflix.mediaclient.intent.category.PUSH");
        intentfilter.addCategory("com.netflix.mediaclient.intent.category.LOGGING");
        intentfilter.setPriority(999);
        try
        {
            LocalBroadcastManager.getInstance(mContext).registerReceiver(mReceiver, intentfilter);
            return;
        }
        catch (Throwable throwable)
        {
            Log.e("nf_adv_id", "Failed to register ", throwable);
        }
    }

    private void unregisterReceiver()
    {
        try
        {
            LocalBroadcastManager.getInstance(mContext).unregisterReceiver(mReceiver);
            return;
        }
        catch (Throwable throwable)
        {
            Log.e("nf_adv_id", "Failed to unregister ", throwable);
        }
    }

    public void destroy()
    {
        Log.d("nf_adv_id", "Destroy and unregister receiver");
        unregisterReceiver();
    }

    public com.netflix.mediaclient.servicemgr.AdvertiserIdLogging.AdverisingATrackingPreference getAdverisingTrackingPreference()
    {
        if (isSupported())
        {
            if (mAdvertisingIdProvider.isLimitAdTrackingEnabled())
            {
                return com.netflix.mediaclient.servicemgr.AdvertiserIdLogging.AdverisingATrackingPreference.OPT_OUT;
            } else
            {
                return com.netflix.mediaclient.servicemgr.AdvertiserIdLogging.AdverisingATrackingPreference.OPT_IN;
            }
        } else
        {
            return null;
        }
    }

    public String getAdvertiserId()
    {
        if (isSupported())
        {
            return mAdvertisingIdProvider.getId();
        } else
        {
            return null;
        }
    }

    public void init()
    {
        Log.d("nf_adv_id", "AdvertiserIdLoggingManager::init web client start ");
        mLoggingWebClient = AdvertiserIdLoggingWebClientFactory.create(mOwner.getResourceFetcher().getApiNextWebClient());
        registerReceiver();
        Log.d("nf_adv_id", "AdvertiserIdLoggingManager::init web client done ");
    }

    public boolean isSupported()
    {
        return mAdvertisingIdProvider != null;
    }

    public void sendAdvertiserId(com.netflix.mediaclient.servicemgr.AdvertiserIdLogging.EventType eventtype)
    {
        this;
        JVM INSTR monitorenter ;
        if (mAdvertisingIdProvider != null) goto _L2; else goto _L1
_L1:
        Log.d("nf_adv_id", "User is logged in, but ADV ID provider is not readu, postpone sending ID");
        mPostponedEvent = eventtype;
_L3:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        String s;
        mPostponedEvent = null;
        Log.d("nf_adv_id", "Ad ID provider is ready and request to send AD ID exist, execute.");
        s = mAdvertisingIdProvider.getId();
        boolean flag;
        if (!mAdvertisingIdProvider.isLimitAdTrackingEnabled())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (Log.isLoggable("nf_adv_id", 3))
        {
            Log.d("nf_adv_id", (new StringBuilder()).append("Ad ID provider exist, if we need to send ID ").append(s).append(", opted in ").append(flag).toString());
        }
        if (s != null)
        {
            break MISSING_BLOCK_LABEL_135;
        }
        Log.e("nf_adv_id", "Ad id can not be null!");
          goto _L3
        eventtype;
        throw eventtype;
label0:
        {
            if (eventtype == com.netflix.mediaclient.servicemgr.AdvertiserIdLogging.EventType.check_in)
            {
                break label0;
            }
            Log.d("nf_adv_id", "Not check in, execute");
            doSendAdvertiserId(s, Boolean.valueOf(flag), eventtype);
        }
          goto _L3
label1:
        {
            Log.d("nf_adv_id", "Check in, validate");
            if (mAdIdReported != null && mAdIdReported.equals(mAdvertisingIdProvider.getId()))
            {
                break label1;
            }
            Log.d("nf_adv_id", "Ad ID changed, execute");
            doSendAdvertiserId(s, Boolean.valueOf(flag), eventtype);
        }
          goto _L3
label2:
        {
            if (mAdIdReportedOptedIn != null && flag == mAdIdReportedOptedIn.booleanValue())
            {
                break label2;
            }
            Log.d("nf_adv_id", "opt in status changed, execute");
            doSendAdvertiserId(s, Boolean.valueOf(flag), eventtype);
        }
          goto _L3
label3:
        {
            Log.d("nf_adv_id", "Adverising ID is not changed, check when it was last time sent.");
            if (!isAlreadySentInLastPeriod())
            {
                break label3;
            }
            Log.d("nf_adv_id", "Ad id and opt in status already sent in last 24 hours, do not send again");
        }
          goto _L3
        Log.d("nf_adv_id", "Ad id and opt in status were NOT sent in last 24 hours, execute");
        doSendAdvertiserId(s, Boolean.valueOf(flag), eventtype);
          goto _L3
    }


/*
    static String access$002(AdvertiserIdLoggingManager advertiseridloggingmanager, String s)
    {
        advertiseridloggingmanager.mAdIdReported = s;
        return s;
    }

*/



/*
    static long access$202(AdvertiserIdLoggingManager advertiseridloggingmanager, long l)
    {
        advertiseridloggingmanager.mAdIdReportedTimestamp = l;
        return l;
    }

*/


/*
    static Boolean access$302(AdvertiserIdLoggingManager advertiseridloggingmanager, Boolean boolean1)
    {
        advertiseridloggingmanager.mAdIdReportedOptedIn = boolean1;
        return boolean1;
    }

*/


/*
    static AdvertisingIdProvider access$402(AdvertiserIdLoggingManager advertiseridloggingmanager, AdvertisingIdProvider advertisingidprovider)
    {
        advertiseridloggingmanager.mAdvertisingIdProvider = advertisingidprovider;
        return advertisingidprovider;
    }

*/



/*
    static com.netflix.mediaclient.servicemgr.AdvertiserIdLogging.EventType access$502(AdvertiserIdLoggingManager advertiseridloggingmanager, com.netflix.mediaclient.servicemgr.AdvertiserIdLogging.EventType eventtype)
    {
        advertiseridloggingmanager.mPostponedEvent = eventtype;
        return eventtype;
    }

*/


}
