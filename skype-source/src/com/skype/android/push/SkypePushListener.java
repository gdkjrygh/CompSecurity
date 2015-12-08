// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.push;

import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.skype.Account;
import com.skype.Setup;
import com.skype.SkyLib;
import com.skype.android.analytics.AnalyticsPersistentStorage;
import com.skype.android.config.ApplicationConfig;
import com.skype.android.config.PeriodicWakeupConfig;
import com.skype.android.config.SkypeLogFormatter;
import com.skype.android.config.ecs.EcsClient;
import com.skype.android.config.ecs.OnEcsDone;
import com.skype.android.event.EventBus;
import com.skype.android.inject.AccountProvider;
import com.skype.android.inject.EventSubscriberBinder;
import com.skype.android.inject.LoginManager;
import com.skype.android.telemetry.SCTManager;
import com.skype.android.util.ConversationUtil;
import com.skype.android.util.NetworkUtil;
import com.skype.android.util.concurrent.KeyedJoin;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;

// Referenced classes of package com.skype.android.push:
//            PushListener, PushManager, PushRetryScheduler, PushTelemetry, 
//            PushEventType, PushMessageListener, PushServiceType, PushConfiguration, 
//            PushRegistration, PushMessage, a, SkyLibPushMessage, 
//            DisplayResult, b, CallPushMessageListener, PushMessageRepository, 
//            PushToMobileMessageListener, ConciergePushMessageListener, RegistrationReason, OnMessageConsumedListener

public class SkypePushListener
    implements PushListener
{
    private static abstract class a extends Enum
    {

        private static final a $VALUES[];
        public static final a NGC_AND_P2P;
        public static final a P2P;

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(com/skype/android/push/SkypePushListener$a, s);
        }

        public static a[] values()
        {
            return (a[])$VALUES.clone();
        }

        abstract String[] getContextLabels(SkyLib skylib);

        String[] getUnregisterContextLabels(SkyLib skylib, a a1)
        {
            HashSet hashset = new HashSet();
            Collections.addAll(hashset, getContextLabels(skylib));
            skylib = a1.getContextLabels(skylib);
            int j = skylib.length;
            for (int i = 0; i < j; i++)
            {
                hashset.remove(skylib[i]);
            }

            return (String[])hashset.toArray(new String[hashset.size()]);
        }

        static 
        {
            P2P = new a("P2P", 0) {

                final String[] getContextLabels(SkyLib skylib)
                {
                    return (new String[] {
                        ""
                    });
                }

            };
            NGC_AND_P2P = new a("NGC_AND_P2P", 1) {

                final String[] getContextLabels(SkyLib skylib)
                {
                    LinkedHashSet linkedhashset = new LinkedHashSet();
                    skylib = ConversationUtil.a(skylib);
                    if (skylib.contains(com.skype.SkyLib.NGC_CAPABILITIES.NGC_LYNC_CALLING_ENABLED))
                    {
                        linkedhashset.add("NGCL2S");
                    }
                    if (skylib.contains(com.skype.SkyLib.NGC_CAPABILITIES.NGC_SKYPE_CALLING_ENABLED))
                    {
                        linkedhashset.add("NGCS2S");
                    }
                    if (skylib.contains(com.skype.SkyLib.NGC_CAPABILITIES.NGC_GROUP_CALLING_ENABLED))
                    {
                        linkedhashset.add("NGCGVC");
                    }
                    linkedhashset.add("");
                    return (String[])linkedhashset.toArray(new String[linkedhashset.size()]);
                }

            };
            $VALUES = (new a[] {
                P2P, NGC_AND_P2P
            });
        }

        private a(String s, int i)
        {
            super(s, i);
        }

    }


    private static final String ADM_TEMPLATE_KEY = "SkypeAmazon:Android_1.1.4";
    private static final String APP_ID_ADM = "SkypeAmazon";
    private static final String APP_ID_GCM = "Android";
    private static final String APP_ID_NNA = "SkypeNokia";
    private static final String DEFAULT_TEMPLATE_KEY = "Android_1.1.4";
    private static final String NGC_ADM_TEMPLATE_KEY = "SkypeAmazon:Android_2.0.3";
    private static final String NGC_DEFAULT_TEMPLATE_KEY = "Android_2.0.3";
    private static final String PLATFORM = "android";
    private static Logger log = Logger.getLogger("SkypePushListener");
    private AccountProvider accountProvider;
    private final String correlationId;
    private a currentContextType;
    private final KeyedJoin handlingTracker = new KeyedJoin() {

        final SkypePushListener this$0;

        protected final void onJoin(Integer integer, SkyLibPushMessage skylibpushmessage, com.skype.SkyLib.PUSHHANDLINGRESULT pushhandlingresult)
        {
            pushTelemetry.reportMessageHandled(accountProvider.get(), skylibpushmessage, skylibpushmessage.getServiceToken(), pushhandlingresult);
        }

        protected final volatile void onJoin(Object obj, Object obj1, Object obj2)
        {
            onJoin((Integer)obj, (SkyLibPushMessage)obj1, (com.skype.SkyLib.PUSHHANDLINGRESULT)obj2);
        }

            
            {
                this$0 = SkypePushListener.this;
                super();
            }
    };
    private SkyLib lib;
    private EnumMap listenerMap;
    private LoginManager loginManager;
    private PushManager pushManager;
    private PushTelemetry pushTelemetry;
    private PushRetryScheduler retryScheduler;
    private final b stampingListener = new b() {

        final SkypePushListener this$0;

        public final void onStamped(int i, SkyLibPushMessage skylibpushmessage)
        {
            handlingTracker.putFirst(Integer.valueOf(i), skylibpushmessage);
        }

        public final volatile void onStamped(int i, Object obj)
        {
            onStamped(i, (SkyLibPushMessage)obj);
        }

            
            {
                this$0 = SkypePushListener.this;
                super();
            }
    };

    public SkypePushListener(Application application, SkyLib skylib, SCTManager sctmanager, LoginManager loginmanager, NetworkUtil networkutil, AccountProvider accountprovider, EcsClient ecsclient, 
            EventBus eventbus, AnalyticsPersistentStorage analyticspersistentstorage, CallPushMessageListener callpushmessagelistener, PushMessageRepository pushmessagerepository, PushToMobileMessageListener pushtomobilemessagelistener, ConciergePushMessageListener conciergepushmessagelistener, AnalyticsPersistentStorage analyticspersistentstorage1)
    {
        currentContextType = a.P2P;
        lib = skylib;
        loginManager = loginmanager;
        accountProvider = accountprovider;
        pushManager = PushManager.getInstance(application);
        retryScheduler = new PushRetryScheduler(application);
        pushTelemetry = new PushTelemetry(application, networkutil, sctmanager, skylib, ecsclient, analyticspersistentstorage1);
        correlationId = analyticspersistentstorage.b();
        listenerMap = new EnumMap(com/skype/android/push/PushEventType);
        for (application = Arrays.asList(new PushMessageListener[] {
    callpushmessagelistener, pushmessagerepository, pushtomobilemessagelistener, conciergepushmessagelistener
}).iterator(); application.hasNext();)
        {
            skylib = (PushMessageListener)application.next();
            sctmanager = skylib.getSupportedEventTypes().iterator();
            while (sctmanager.hasNext()) 
            {
                loginmanager = (PushEventType)sctmanager.next();
                listenerMap.put(loginmanager, skylib);
            }
        }

        (new EventSubscriberBinder(eventbus, this)).bind();
    }

    private String getAppId(PushServiceType pushservicetype)
    {
        static final class _cls4
        {

            static final int $SwitchMap$com$skype$android$push$PushServiceType[];
            static final int $SwitchMap$com$skype$android$push$SkypePushListener$ContextType[];

            static 
            {
                $SwitchMap$com$skype$android$push$PushServiceType = new int[PushServiceType.values().length];
                try
                {
                    $SwitchMap$com$skype$android$push$PushServiceType[PushServiceType.AMAZON_ADM.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    $SwitchMap$com$skype$android$push$PushServiceType[PushServiceType.GOOGLE_GCM.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$com$skype$android$push$PushServiceType[PushServiceType.NOKIA_NNA.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                $SwitchMap$com$skype$android$push$SkypePushListener$ContextType = new int[a.values().length];
                try
                {
                    $SwitchMap$com$skype$android$push$SkypePushListener$ContextType[a.NGC_AND_P2P.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$skype$android$push$SkypePushListener$ContextType[a.P2P.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls4..SwitchMap.com.skype.android.push.PushServiceType[pushservicetype.ordinal()])
        {
        default:
            return null;

        case 1: // '\001'
            return "SkypeAmazon";

        case 2: // '\002'
            return "Android";

        case 3: // '\003'
            return "SkypeNokia";
        }
    }

    private String getTemplateKey(PushServiceType pushservicetype)
    {
        switch (_cls4..SwitchMap.com.skype.android.push.PushServiceType[pushservicetype.ordinal()])
        {
        default:
            if (isNgcEnabled())
            {
                return "Android_2.0.3";
            } else
            {
                return "Android_1.1.4";
            }

        case 1: // '\001'
            break;
        }
        if (isNgcEnabled())
        {
            return "SkypeAmazon:Android_2.0.3";
        } else
        {
            return "SkypeAmazon:Android_1.1.4";
        }
    }

    private boolean isNgcEnabled()
    {
        return ConversationUtil.a(lib).contains(com.skype.SkyLib.NGC_CAPABILITIES.NGC_ENABLED);
    }

    private boolean needToSwitchContexts()
    {
        _cls4..SwitchMap.com.skype.android.push.SkypePushListener.ContextType[currentContextType.ordinal()];
        JVM INSTR tableswitch 1 2: default 32
    //                   1 34
    //                   2 43;
           goto _L1 _L2 _L3
_L1:
        return false;
_L2:
        if (!isNgcEnabled())
        {
            return true;
        }
          goto _L1
_L3:
        return isNgcEnabled();
    }

    private void registerPushWithCoreLib(PushServiceType pushservicetype, String s)
    {
        Account account = accountProvider.get();
        if (loginManager.isLoggedOut())
        {
            log.info("User is logged out, attempt to register will bring him online");
            return;
        }
        if (!loginManager.loginIfRequired())
        {
            log.info("Retry failed user is not logged in");
            retryScheduler.scheduleRetry();
            return;
        }
        pushTelemetry.reportRegistrationCompleted(account, pushservicetype, s);
        log.info((new StringBuilder("registerPushWithCoreLib type: ")).append(pushservicetype).append(" token: ").append(s).toString());
        com.skype.SkyLib.SERVICE_TYPE service_type;
        String as[];
        com.skype.SkyLib.SERVICE_TYPE aservice_type[];
        String as1[];
        int ai[];
        int j;
        int k;
        if (isNgcEnabled())
        {
            currentContextType = a.NGC_AND_P2P;
        } else
        {
            currentContextType = a.P2P;
        }
        j = pushManager.getConfiguration().getRegistrationTTLSeconds(pushservicetype);
        service_type = getSkyLibType(pushservicetype);
        as = currentContextType.getContextLabels(lib);
        log.info(SkypeLogFormatter.arrayToString("Registering contexts: ", as));
        k = as.length;
        aservice_type = new com.skype.SkyLib.SERVICE_TYPE[k];
        as1 = new String[k];
        ai = new int[k];
        for (int i = 0; i < k; i++)
        {
            aservice_type[i] = service_type;
            as1[i] = s;
            ai[i] = j;
        }

        lib.registerContextsEx(aservice_type, "android", getTemplateKey(pushservicetype), as, as1, ai, getAppId(pushservicetype));
        pushTelemetry.reportRegistrationCheckpoint(account, pushservicetype, PushTelemetry.RegistrationCheckpoint.CONTEXTS);
        ApplicationConfig.getInstance().getPeriodicWakeupConfig().setForegroundTaskEnabled(true);
        lib.getSetup().setInt("Lib/SessionFilteringMode", 0);
        lib.getSetup().setInt("*Lib/MSNP/SessionTimeout", 0x11940);
        log.info(String.format("registered push service %s", new Object[] {
            pushservicetype
        }));
    }

    public com.skype.SkyLib.SERVICE_TYPE getSkyLibType(PushServiceType pushservicetype)
    {
        switch (_cls4..SwitchMap.com.skype.android.push.PushServiceType[pushservicetype.ordinal()])
        {
        default:
            return null;

        case 1: // '\001'
            return com.skype.SkyLib.SERVICE_TYPE.ADM;

        case 2: // '\002'
            return com.skype.SkyLib.SERVICE_TYPE.GOOGLE_AGCM;

        case 3: // '\003'
            return com.skype.SkyLib.SERVICE_TYPE.NNA;
        }
    }

    public void onBeforeRegister(PushRegistration pushregistration, RegistrationReason registrationreason)
    {
        boolean flag;
        if (!TextUtils.isEmpty(pushregistration.getRegistrationToken()))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        pushTelemetry.setInteractionState(correlationId, UUID.randomUUID().toString());
        pushTelemetry.reportRegistrationAttempt(accountProvider.get(), pushregistration.getServiceType(), registrationreason, flag);
    }

    public void onEvent(OnEcsDone onecsdone)
    {
        if (pushManager.isAnyServiceRegistered() && needToSwitchContexts())
        {
            PushServiceType pushservicetype;
            for (onecsdone = pushManager.getRegisteredServices().iterator(); onecsdone.hasNext(); registerPushWithCoreLib(pushservicetype, pushManager.getRegistrationToken(pushservicetype)))
            {
                pushservicetype = (PushServiceType)onecsdone.next();
            }

        }
    }

    public void onEvent(com.skype.android.gen.SkyLibListener.OnPushHandlingComplete onpushhandlingcomplete)
    {
        handlingTracker.putSecond(Integer.valueOf(onpushhandlingcomplete.getPushId()), onpushhandlingcomplete.getResult());
    }

    public void onEvent(com.skype.android.gen.SkyLibListener.OnRegisterContextsComplete onregistercontextscomplete)
    {
        onregistercontextscomplete = onregistercontextscomplete.getSuccess();
        log.info((new StringBuilder("OnRegisterContextsComplete result: ")).append(onregistercontextscomplete.name()).toString());
        if (onregistercontextscomplete != com.skype.SkyLib.PNM_REGISTER_CONTEXTS_RESULT.REGISTER_CONTEXTS_SUCCEEDED)
        {
            retryScheduler.scheduleRetry();
        } else
        {
            if (isNgcEnabled())
            {
                onregistercontextscomplete = a.P2P.getUnregisterContextLabels(lib, a.NGC_AND_P2P);
            } else
            {
                onregistercontextscomplete = a.NGC_AND_P2P.getUnregisterContextLabels(lib, a.P2P);
            }
            if (onregistercontextscomplete.length != 0)
            {
                log.info(SkypeLogFormatter.arrayToString("Unregistered contexts: ", onregistercontextscomplete));
                lib.unregisterContexts(onregistercontextscomplete);
                return;
            }
        }
    }

    public void onPushMessage(PushRegistration pushregistration, PushMessage pushmessage)
    {
        if (pushmessage != null)
        {
            if (pushmessage.getIntent() != null)
            {
                String s = pushmessage.getIntent().getStringExtra("rawPayload");
                log.info((new StringBuilder("Push dump:\n")).append(s).toString());
                if (s == null)
                {
                    Bundle bundle = pushmessage.getIntent().getExtras();
                    if (bundle != null)
                    {
                        String s1;
                        for (Iterator iterator = bundle.keySet().iterator(); iterator.hasNext(); log.info((new StringBuilder()).append(s1).append(" => ").append(bundle.get(s1)).toString()))
                        {
                            s1 = (String)iterator.next();
                        }

                    }
                }
            }
            pushTelemetry.reportMessageReceived(accountProvider.get(), pushmessage, pushregistration.getRegistrationToken());
            if (pushmessage instanceof com.skype.android.push.a)
            {
                final com.skype.android.push.a abstractPushMessage = (com.skype.android.push.a)pushmessage;
                log.info((new StringBuilder("handle message type ")).append(abstractPushMessage.getEventType()).append(" from ").append(pushmessage.getServiceType()).toString());
                abstractPushMessage.setServiceToken(pushregistration.getRegistrationToken());
                if (pushmessage instanceof SkyLibPushMessage)
                {
                    ((SkyLibPushMessage)pushmessage).setOnStampedListener(stampingListener);
                }
                abstractPushMessage.setOnMessageConsumedListener(new OnMessageConsumedListener() {

                    final Account account;
                    final SkypePushListener this$0;
                    final com.skype.android.push.a val$abstractPushMessage;

                    public final void onMessageConsumed(DisplayResult displayresult)
                    {
                        pushTelemetry.reportMessageDisplayed(account, abstractPushMessage, abstractPushMessage.getServiceToken(), displayresult.toString());
                    }

            
            {
                this$0 = SkypePushListener.this;
                abstractPushMessage = a1;
                super();
                account = accountProvider.get();
            }
                });
                if (loginManager.isLoggedOut())
                {
                    log.info("User is logged out, can't continue processing");
                    abstractPushMessage.onMessageConsumed(DisplayResult.USER_LOGGED_OUT);
                    return;
                }
                pushregistration = (PushMessageListener)listenerMap.get(abstractPushMessage.getEventType());
                if (pushregistration != null)
                {
                    pushregistration.onPushMessage(pushmessage);
                    return;
                }
            }
        }
    }

    public void onPushMessagesDeleted(PushRegistration pushregistration, Intent intent)
    {
        if (intent != null)
        {
            intent = intent.getExtras();
            if (intent == null)
            {
                intent = null;
            } else
            {
                intent = intent.toString();
            }
            log.info((new StringBuilder("message was deleted: ")).append(intent).toString());
            pushTelemetry.reportMessageDeleted(accountProvider.get(), pushregistration.getRegistrationToken(), pushregistration.getServiceType(), intent);
        }
    }

    public void onRegistered(PushRegistration pushregistration)
    {
        registerPushWithCoreLib(pushregistration.getServiceType(), pushregistration.getRegistrationToken());
    }

    public void onRegistrationError(PushRegistration pushregistration, Exception exception)
    {
        pushregistration = pushregistration.getServiceType();
        log.log(Level.WARNING, String.format("registration failed for %s with error %s", new Object[] {
            pushregistration, exception.getMessage()
        }), exception);
        pushTelemetry.reportRegistrationError(accountProvider.get(), pushregistration, exception.getMessage(), false);
        retryScheduler.scheduleRetry();
    }

    public void onRegistrationExpired(PushRegistration pushregistration)
    {
        log.info(String.format("registration expired for %s", new Object[] {
            pushregistration.getServiceType()
        }));
    }

    public void onUnregistered(PushRegistration pushregistration)
    {
        log.info(String.format("unregistered push service %s", new Object[] {
            pushregistration.getServiceType()
        }));
        lib.getSetup().setInt("Lib/SessionFilteringMode", 2);
        lib.getSetup().setInt("*Lib/MSNP/SessionTimeout", 0);
    }

    public void unregisterPushDuringLogout()
    {
        lib.unregisterAllContexts(correlationId, "logout");
    }




}
