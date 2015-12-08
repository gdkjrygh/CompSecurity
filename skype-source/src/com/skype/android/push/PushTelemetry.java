// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.push;

import a.a.a.h;
import android.app.Application;
import android.os.Build;
import android.util.Base64;
import android.util.Pair;
import com.skype.Account;
import com.skype.SkyLib;
import com.skype.android.analytics.AnalyticsPersistentStorage;
import com.skype.android.config.ecs.EcsClient;
import com.skype.android.telemetry.RecordBuilder;
import com.skype.android.telemetry.SCTManager;
import com.skype.android.telemetry.TelemetryHelper;
import com.skype.android.util.NetworkUtil;
import com.skype.android.util.TimeUtil;
import com.skype.msnp.MsnpMessage;
import java.security.MessageDigest;
import java.util.Collections;
import java.util.EnumMap;
import java.util.Locale;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

// Referenced classes of package com.skype.android.push:
//            PushServiceType, a, PushMessage, ChatPushMessage, 
//            CallPushMessage, PushEventType, SkyLibPushMessage, RegistrationReason

final class PushTelemetry extends TelemetryHelper
{
    public static final class RegistrationCheckpoint extends Enum
    {

        private static final RegistrationCheckpoint $VALUES[];
        public static final RegistrationCheckpoint COMPLETE;
        public static final RegistrationCheckpoint CONTEXTS;
        public static final RegistrationCheckpoint FAILED;
        public static final RegistrationCheckpoint RECOVERABLE;
        public static final RegistrationCheckpoint REGISTER;
        public static final RegistrationCheckpoint SUPPORTED;

        public static RegistrationCheckpoint valueOf(String s)
        {
            return (RegistrationCheckpoint)Enum.valueOf(com/skype/android/push/PushTelemetry$RegistrationCheckpoint, s);
        }

        public static RegistrationCheckpoint[] values()
        {
            return (RegistrationCheckpoint[])$VALUES.clone();
        }

        static 
        {
            SUPPORTED = new RegistrationCheckpoint("SUPPORTED", 0);
            REGISTER = new RegistrationCheckpoint("REGISTER", 1);
            RECOVERABLE = new RegistrationCheckpoint("RECOVERABLE", 2);
            FAILED = new RegistrationCheckpoint("FAILED", 3);
            COMPLETE = new RegistrationCheckpoint("COMPLETE", 4);
            CONTEXTS = new RegistrationCheckpoint("CONTEXTS", 5);
            $VALUES = (new RegistrationCheckpoint[] {
                SUPPORTED, REGISTER, RECOVERABLE, FAILED, COMPLETE, CONTEXTS
            });
        }

        private RegistrationCheckpoint(String s, int i)
        {
            super(s, i);
        }
    }


    private static final String ATTRIBUTE_CLIENT_MESSAGE_ID = "client_message_id";
    private static final String ATTRIBUTE_CLIENT_REGISTRATION_ID = "registration_id";
    private static final String ATTRIBUTE_CONVO_CALL_ID = "convoCallId";
    private static final String ATTRIBUTE_CORRELATION_ID = "CorrelationId";
    private static final String ATTRIBUTE_DELETED_MESSAGE_EXTRA = "deleted_extra";
    private static final String ATTRIBUTE_DISPLAY_RESULT = "display_result";
    private static final String ATTRIBUTE_EVENT_ID = "event_id";
    private static final String ATTRIBUTE_EVENT_SUBTYPE = "eventSubType";
    private static final String ATTRIBUTE_FIRMWARE_ID = "firmware_id";
    private static final String ATTRIBUTE_HANDLING_BEGIN_TIMESTAMP_MS = "begin_timestamp_ms";
    private static final String ATTRIBUTE_HANDLING_ELAPSED_MS = "elapsed_ms";
    private static final String ATTRIBUTE_HANDLING_RESULT = "handling_result";
    private static final String ATTRIBUTE_LANGUAGE_ID = "language_id";
    private static final String ATTRIBUTE_PAYLOAD_SIZE = "payload_size";
    private static final String ATTRIBUTE_REGISTRATION_FORCED = "registration_forced";
    private static final String ATTRIBUTE_REGISTRATION_REASON = "registration_reason";
    private static final String ATTRIBUTE_REGISTRATION_TOKEN = "registration_token";
    private static final String ATTRIBUTE_SERVER_MESSAGE_ID = "message_id";
    private static final String ATTRIBUTE_SERVICE_ID = "service_id";
    private static final String ATTRIBUTE_TRANSACTION_ID = "TransactionId";
    private static final String COLLECTION_INCOMING_NOTIFICATION = "incoming_notification";
    private static final String COLLECTION_MESSAGE_DELETED = "deleted_notification";
    private static final String COLLECTION_SERVICE_REGISTRATION = "service_registration";
    private static final String EVENT_SUBTYPE_DELETED_NOTIFICATION = "deleted_notification";
    private static final String EVENT_SUBTYPE_DISPLAYED_NOTIFICATION = "notification_displayed";
    private static final String EVENT_SUBTYPE_HANDLED_NOTIFICATION = "notification_handled";
    private static final String EVENT_SUBTYPE_INCOMING_NOTIFICATION = "incoming_notification";
    private static final String TYPE_PLATFORM_NOTIFICATION = "platform_notification";
    private String correlationId;
    private String interactionId;
    private final SkyLib lib;
    final Queue queue = new ConcurrentLinkedQueue();
    private final Map tokenHashes = Collections.synchronizedMap(new EnumMap(com/skype/android/push/PushServiceType));

    public PushTelemetry(Application application, NetworkUtil networkutil, SCTManager sctmanager, SkyLib skylib, EcsClient ecsclient, AnalyticsPersistentStorage analyticspersistentstorage)
    {
        super(application, sctmanager, ecsclient, networkutil, analyticspersistentstorage);
        lib = skylib;
        setComponentName("cn");
        setUseFlavorAsNamespace(false);
        setUseComponentNameAsNamespace(true);
    }

    private RecordBuilder createGenericPushTelemetryRecord(String s, PushServiceType pushservicetype)
    {
        return addFullNetworkInfo(startBuildingRecord().b("eventSubType", s).a("service_id", getProviderKey(pushservicetype)).a("firmware_id", Build.FINGERPRINT).a("registration_id", lib.getRegistrationId()).a("language_id", Locale.getDefault().getLanguage()));
    }

    private String getProviderKey(PushServiceType pushservicetype)
    {
        static final class _cls1
        {

            static final int $SwitchMap$com$skype$android$push$PushServiceType[];

            static 
            {
                $SwitchMap$com$skype$android$push$PushServiceType = new int[PushServiceType.values().length];
                try
                {
                    $SwitchMap$com$skype$android$push$PushServiceType[PushServiceType.AMAZON_ADM.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$com$skype$android$push$PushServiceType[PushServiceType.GOOGLE_GCM.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$skype$android$push$PushServiceType[PushServiceType.NOKIA_NNA.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$skype$android$push$PushServiceType[PushServiceType.SKYPE_TROUTER.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1..SwitchMap.com.skype.android.push.PushServiceType[pushservicetype.ordinal()])
        {
        default:
            return pushservicetype.name();

        case 1: // '\001'
            return "ADM";

        case 2: // '\002'
            return "GCM";

        case 3: // '\003'
            return "NNA";

        case 4: // '\004'
            return "Trouter";
        }
    }

    private long getReferenceTime()
    {
        return System.currentTimeMillis();
    }

    private String hash(PushServiceType pushservicetype, String s)
    {
        if (s == null)
        {
            return null;
        }
        Pair pair = (Pair)tokenHashes.get(pushservicetype);
        if (pair != null && s.equals(pair.first))
        {
            return (String)pair.second;
        }
        try
        {
            s = new Pair(s, Base64.encodeToString(MessageDigest.getInstance("SHA-256").digest(s.getBytes("UTF-8")), 0));
            tokenHashes.put(pushservicetype, s);
            pushservicetype = (String)((Pair) (s)).second;
        }
        // Misplaced declaration of an exception variable
        catch (PushServiceType pushservicetype)
        {
            return null;
        }
        return pushservicetype;
    }

    public final RecordBuilder createNotificationTelemetryRecord(Account account, String s, PushMessage pushmessage, String s1)
    {
        int i = 0;
        Object obj = null;
        if (pushmessage instanceof a)
        {
            obj = (a)pushmessage;
            i = ((a) (obj)).getRawPayloadSize();
            obj = ((a) (obj)).getEventType();
        }
        account = createGenericPushTelemetryRecord(s, pushmessage.getServiceType()).a((new StringBuilder()).append(createPrefix()).append("incoming_notification").toString()).b(account);
        int j;
        if (obj == null)
        {
            j = 0;
        } else
        {
            j = ((PushEventType) (obj)).value();
        }
        account = account.a("event_id", Integer.valueOf(j)).a("registration_token", hash(pushmessage.getServiceType(), s1));
        if (i > 0)
        {
            account.a("payload_size", Integer.valueOf(i));
        }
        if (pushmessage instanceof ChatPushMessage)
        {
            account.b(((ChatPushMessage)pushmessage).getSenderId());
            account.c(((ChatPushMessage)pushmessage).getConversationIdentity());
            s = ((ChatPushMessage)pushmessage).getMsnpMessage();
            if (s != null)
            {
                account.a("message_id", s.d());
                account.a("client_message_id", s.e());
            }
        }
        if (pushmessage instanceof CallPushMessage)
        {
            s = (CallPushMessage)pushmessage;
            account.c(s.getConversationId());
            s = s.getCallId();
            account.d(s);
            account.a("convoCallId", s);
        }
        return account;
    }

    public final RecordBuilder createRegistrationTelemetryRecord(RegistrationCheckpoint registrationcheckpoint, Account account, PushServiceType pushservicetype)
    {
        return createGenericPushTelemetryRecord(registrationcheckpoint.name().toLowerCase(), pushservicetype).a((new StringBuilder()).append(createPrefix()).append("service_registration").toString()).a("CorrelationId", correlationId).a("TransactionId", interactionId).a(account);
    }

    protected final String getComponentType()
    {
        return "platform_notification";
    }

    protected final long getTimeMs()
    {
        return TimeUtil.f(lib.getServerTime());
    }

    public final void reportMessageDeleted(Account account, String s, PushServiceType pushservicetype, String s1)
    {
        sendRecord(createGenericPushTelemetryRecord("deleted_notification", pushservicetype).a((new StringBuilder()).append(createPrefix()).append("deleted_notification").toString()).b(account).a("registration_token", hash(pushservicetype, s)).a("service_id", getProviderKey(pushservicetype)).a("deleted_extra", s1));
    }

    public final void reportMessageDisplayed(Account account, PushMessage pushmessage, String s, String s1)
    {
        account = createNotificationTelemetryRecord(account, "notification_displayed", pushmessage, s);
        account.a("display_result", s1);
        sendRecord(account);
    }

    public final void reportMessageHandled(Account account, SkyLibPushMessage skylibpushmessage, String s, com.skype.SkyLib.PUSHHANDLINGRESULT pushhandlingresult)
    {
        account = createNotificationTelemetryRecord(account, "notification_handled", skylibpushmessage, s);
        account.a("begin_timestamp_ms", Long.valueOf(skylibpushmessage.getHandlingStartedTimestamp()));
        account.a("elapsed_ms", Long.valueOf(skylibpushmessage.getElapsedHandlingTime()));
        account.a("handling_result", pushhandlingresult.name());
        sendRecord(account);
    }

    public final void reportMessageReceived(Account account, PushMessage pushmessage, String s)
    {
        sendRecord(createNotificationTelemetryRecord(account, "incoming_notification", pushmessage, s));
    }

    public final void reportRegistrationAttempt(Account account, PushServiceType pushservicetype, RegistrationReason registrationreason, boolean flag)
    {
        sendRecord(createRegistrationTelemetryRecord(RegistrationCheckpoint.REGISTER, account, pushservicetype).a("registration_reason", registrationreason.toString()).a("registration_forced", Boolean.valueOf(flag)));
    }

    public final void reportRegistrationCheckpoint(Account account, PushServiceType pushservicetype, RegistrationCheckpoint registrationcheckpoint)
    {
        sendRecord(createRegistrationTelemetryRecord(registrationcheckpoint, account, pushservicetype));
    }

    public final void reportRegistrationCompleted(Account account, PushServiceType pushservicetype, String s)
    {
        sendRecord(createRegistrationTelemetryRecord(RegistrationCheckpoint.COMPLETE, account, pushservicetype).a("registration_token", hash(pushservicetype, s)));
    }

    public final void reportRegistrationError(Account account, PushServiceType pushservicetype, String s, boolean flag)
    {
        RegistrationCheckpoint registrationcheckpoint;
        if (flag)
        {
            registrationcheckpoint = RegistrationCheckpoint.RECOVERABLE;
        } else
        {
            registrationcheckpoint = RegistrationCheckpoint.FAILED;
        }
        sendRecord(createRegistrationTelemetryRecord(registrationcheckpoint, account, pushservicetype).e(s));
    }

    public final void sendRecord(RecordBuilder recordbuilder)
    {
        long l = recordbuilder.a().a();
        if (l == 0L)
        {
            recordbuilder.b(getReferenceTime());
            queue.add(recordbuilder);
            return;
        }
        long l1 = getReferenceTime();
        do
        {
            RecordBuilder recordbuilder1 = (RecordBuilder)queue.poll();
            if (recordbuilder1 != null)
            {
                recordbuilder1.a(recordbuilder1.b() + (l - l1));
                super.sendRecord(recordbuilder1);
            } else
            {
                super.sendRecord(recordbuilder);
                return;
            }
        } while (true);
    }

    public final void setInteractionState(String s, String s1)
    {
        correlationId = s;
        interactionId = s1;
    }
}
