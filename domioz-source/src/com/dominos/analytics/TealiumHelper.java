// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.analytics;

import com.dominos.App;
import com.dominos.MobileSession;
import com.dominos.android.sdk.app.ApplicationEventBus;
import com.dominos.android.sdk.common.StringHelper;
import com.dominos.android.sdk.core.analytics.AnalyticsEvent;
import com.dominos.android.sdk.core.analytics.AnalyticsProcessor;
import com.dominos.android.sdk.core.analytics.AnalyticsService;
import com.dominos.android.sdk.extension.advertising.AdvertisingManager;
import com.tealium.library.Tealium;
import java.util.HashMap;
import java.util.Map;

public class TealiumHelper extends AnalyticsProcessor
{

    private static final String TAG = "tealium";
    private AdvertisingManager mAdvertisingManager;
    App mApp;
    MobileSession mMobileSession;

    public TealiumHelper()
    {
    }

    private void postApplicationStart()
    {
        String s;
        if (App.isDebugMode())
        {
            s = "dev";
        } else
        {
            s = "prod";
        }
        Tealium.initialize(com.tealium.library.Tealium.Config.create(mApp, "dominos", "android", s).setLibraryLogLevel(com.tealium.library.Tealium.LogLevel.a));
    }

    private void track(Map map, String s)
    {
        Tealium.track(null, map, s);
    }

    void initialize()
    {
        AnalyticsService analyticsservice = (AnalyticsService)mMobileSession.getManager("analytics_manager");
        mAdvertisingManager = (AdvertisingManager)mMobileSession.getManager("advertising_manager");
        postApplicationStart();
        App.getInstance().bus.register(this);
        analyticsservice.register(this);
    }

    public void onPause(com.dominos.bus.events.ActivityLifecycleEvents.PauseEvent pauseevent)
    {
        Tealium.onPause(pauseevent.getActivity());
    }

    public void onResume(com.dominos.bus.events.ActivityLifecycleEvents.ResumeEvent resumeevent)
    {
        Tealium.onResume(resumeevent.getActivity());
    }

    protected void processEvent(AnalyticsEvent analyticsevent)
    {
        _cls1..SwitchMap.com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE[analyticsevent.eventType.ordinal()];
        JVM INSTR tableswitch 1 2: default 32
    //                   1 92
    //                   2 98;
           goto _L1 _L2 _L3
_L3:
        break MISSING_BLOCK_LABEL_98;
_L1:
        String s = "view";
_L4:
        HashMap hashmap = new HashMap();
        if (analyticsevent.eventData != null)
        {
            hashmap.putAll(analyticsevent.eventData);
        }
        if (StringHelper.isNotEmpty(mAdvertisingManager.getAdvertisingId()))
        {
            hashmap.put("altid.md5.adid", mAdvertisingManager.getAdvertisingId());
            track(hashmap, s);
            return;
        } else
        {
            retryAdIdAndSendEvent(analyticsevent, hashmap, s);
            return;
        }
_L2:
        s = "view";
          goto _L4
        s = "link";
          goto _L4
    }

    protected void retryAdIdAndSendEvent(AnalyticsEvent analyticsevent, Map map, String s)
    {
        if (mAdvertisingManager.initializeAdId() && StringHelper.isNotEmpty(mAdvertisingManager.getAdvertisingId()))
        {
            map.put("altid.md5.adid", mAdvertisingManager.getAdvertisingId());
        }
        track(map, s);
    }

    private class _cls1
    {

        static final int $SwitchMap$com$dominos$android$sdk$core$analytics$AnalyticsConstants$EVENT_TYPE[];

        static 
        {
            $SwitchMap$com$dominos$android$sdk$core$analytics$AnalyticsConstants$EVENT_TYPE = new int[com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.values().length];
            try
            {
                $SwitchMap$com$dominos$android$sdk$core$analytics$AnalyticsConstants$EVENT_TYPE[com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.VIEW.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                $SwitchMap$com$dominos$android$sdk$core$analytics$AnalyticsConstants$EVENT_TYPE[com.dominos.android.sdk.core.analytics.AnalyticsConstants.EVENT_TYPE.EVENT.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }

}
