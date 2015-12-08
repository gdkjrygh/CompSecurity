// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.mnv;

import android.app.Application;
import android.content.ContentValues;
import android.content.Context;
import android.content.IntentFilter;
import android.text.TextUtils;
import com.skype.android.analytics.AnalyticsEvent;
import com.skype.android.app.settings.UserPreferences;
import com.skype.android.app.shortcircuit.ProfileServiceToken;
import com.skype.android.event.EventBus;
import java.util.logging.Logger;

// Referenced classes of package com.skype.android.app.mnv:
//            d, MnvStateData, MnvCases, MnvAnalytics, 
//            MnvManagerEvents, MnvSmsReceiver, MnvPostRequest, ProfileServicesClient, 
//            c, a

public class MnvManager
    implements d
{
    public static class OnPinReceived
    {

        private String pin;

        public String getPin()
        {
            return pin;
        }

        public OnPinReceived(String s)
        {
            pin = s;
        }
    }

    public static abstract class States extends Enum
    {

        private static final States $VALUES[];
        public static final States ADD_FRIENDS;
        public static final States ADD_PHONE_VERIFY_BY_SMS;
        public static final States ADD_PHONE_VERIFY_BY_VOICE;
        public static final States ADD_VERIFIED_SOURCE_MSA;
        public static final States CHECKING_ACCOUNT;
        public static final States COMPLETED;
        public static final States EDIT_PHONE_VERIFY_BY_SMS;
        public static final States EDIT_PHONE_VERIFY_BY_VOICE;
        public static final States EDIT_RESEND_PIN_BY_SMS;
        public static final States EDIT_RESEND_PIN_BY_VOICE;
        public static final States EDIT_VERIFY_PIN;
        public static final States ERRORS_PHONE;
        public static final States ERRORS_PIN;
        public static final States ERRORS_RETRY;
        public static final States ERRORS_UNABLE;
        public static final States ERRORS_UNKNOWN;
        public static final States ERRORS_UNSUPPORTED;
        public static final States HTTP_DISCONNECT;
        public static final States INITIALIZED;
        public static final States LEARN_MORE;
        public static final States NOT_INITIALIZED;
        public static final States PREVIOUS;
        public static final States PRE_CHECK;
        public static final States QOS_ALERT;
        public static final States SKIPPED;
        public static final States UNKNOWN_STATE;
        public static final States VERIFIED;

        public static States valueOf(String s)
        {
            return (States)Enum.valueOf(com/skype/android/app/mnv/MnvManager$States, s);
        }

        public static States[] values()
        {
            return (States[])$VALUES.clone();
        }

        protected abstract States performInternal(Context context1, MnvManager mnvmanager, ProfileServicesClient profileservicesclient);

        public States performRequest(Context context1, ProfileServicesClient profileservicesclient, ProfileServiceToken profileservicetoken, MnvManager mnvmanager)
        {
            profileservicesclient.setToken(profileservicetoken);
            return performInternal(context1, mnvmanager, profileservicesclient);
        }

        static 
        {
            NOT_INITIALIZED = new States("NOT_INITIALIZED", 0) {

                protected final States performInternal(Context context1, MnvManager mnvmanager, ProfileServicesClient profileservicesclient)
                {
                    return States.INITIALIZED;
                }

            };
            INITIALIZED = new States("INITIALIZED", 1) {

                protected final States performInternal(Context context1, MnvManager mnvmanager, ProfileServicesClient profileservicesclient)
                {
                    return States.CHECKING_ACCOUNT;
                }

            };
            CHECKING_ACCOUNT = new States("CHECKING_ACCOUNT", 2) {

                protected final States performInternal(Context context1, MnvManager mnvmanager, ProfileServicesClient profileservicesclient)
                {
                    profileservicesclient.register(mnvmanager);
                    if (profileservicesclient.call(c.PRE_CHECK, null))
                    {
                        return States.ADD_FRIENDS;
                    } else
                    {
                        return States.COMPLETED;
                    }
                }

            };
            ADD_FRIENDS = new States("ADD_FRIENDS", 3) {

                protected final States performInternal(Context context1, MnvManager mnvmanager, ProfileServicesClient profileservicesclient)
                {
                    return ADD_PHONE_VERIFY_BY_SMS;
                }

            };
            LEARN_MORE = new States("LEARN_MORE", 4) {

                protected final States performInternal(Context context1, MnvManager mnvmanager, ProfileServicesClient profileservicesclient)
                {
                    return null;
                }

            };
            ADD_PHONE_VERIFY_BY_SMS = new States("ADD_PHONE_VERIFY_BY_SMS", 5) {

                protected final States performInternal(Context context1, MnvManager mnvmanager, ProfileServicesClient profileservicesclient)
                {
                    profileservicesclient.register(mnvmanager);
                    if (profileservicesclient.call(c.ADD_PHONE_VERIFY_BY_SMS, mnvmanager.getPhoneEntry()))
                    {
                        return States.EDIT_VERIFY_PIN;
                    } else
                    {
                        return States.COMPLETED;
                    }
                }

            };
            EDIT_PHONE_VERIFY_BY_SMS = new States("EDIT_PHONE_VERIFY_BY_SMS", 6) {

                protected final States performInternal(Context context1, MnvManager mnvmanager, ProfileServicesClient profileservicesclient)
                {
                    profileservicesclient.register(mnvmanager);
                    if (profileservicesclient.call(c.EDIT_PHONE_VERIFY_BY_SMS, mnvmanager.getPhoneEntry()))
                    {
                        return States.EDIT_VERIFY_PIN;
                    } else
                    {
                        return States.COMPLETED;
                    }
                }

            };
            ADD_PHONE_VERIFY_BY_VOICE = new States("ADD_PHONE_VERIFY_BY_VOICE", 7) {

                protected final States performInternal(Context context1, MnvManager mnvmanager, ProfileServicesClient profileservicesclient)
                {
                    profileservicesclient.register(mnvmanager);
                    if (profileservicesclient.call(c.ADD_PHONE_VERIFY_BY_VOICE, mnvmanager.getPhoneEntry()))
                    {
                        return States.EDIT_VERIFY_PIN;
                    } else
                    {
                        return States.COMPLETED;
                    }
                }

            };
            EDIT_PHONE_VERIFY_BY_VOICE = new States("EDIT_PHONE_VERIFY_BY_VOICE", 8) {

                protected final States performInternal(Context context1, MnvManager mnvmanager, ProfileServicesClient profileservicesclient)
                {
                    profileservicesclient.register(mnvmanager);
                    if (profileservicesclient.call(c.EDIT_PHONE_VERIFY_BY_VOICE, mnvmanager.getPhoneEntry()))
                    {
                        return States.EDIT_VERIFY_PIN;
                    } else
                    {
                        return States.COMPLETED;
                    }
                }

            };
            ADD_VERIFIED_SOURCE_MSA = new States("ADD_VERIFIED_SOURCE_MSA", 9) {

                protected final States performInternal(Context context1, MnvManager mnvmanager, ProfileServicesClient profileservicesclient)
                {
                    profileservicesclient.register(mnvmanager);
                    if (profileservicesclient.call(c.ADD_VERIFIED_SOURCE_MSA, mnvmanager.getPhoneEntry()))
                    {
                        return States.EDIT_VERIFY_PIN;
                    } else
                    {
                        return States.COMPLETED;
                    }
                }

            };
            EDIT_VERIFY_PIN = new States("EDIT_VERIFY_PIN", 10) {

                protected final States performInternal(Context context1, MnvManager mnvmanager, ProfileServicesClient profileservicesclient)
                {
                    profileservicesclient.register(mnvmanager);
                    if (profileservicesclient.call(c.EDIT_VERIFY_PIN, mnvmanager.getPinEntry()))
                    {
                        return States.VERIFIED;
                    } else
                    {
                        return States.EDIT_VERIFY_PIN;
                    }
                }

            };
            EDIT_RESEND_PIN_BY_SMS = new States("EDIT_RESEND_PIN_BY_SMS", 11) {

                protected final States performInternal(Context context1, MnvManager mnvmanager, ProfileServicesClient profileservicesclient)
                {
                    profileservicesclient.register(mnvmanager);
                    if (profileservicesclient.call(c.EDIT_RESEND_PIN_BY_SMS, mnvmanager.getPhoneEntry()))
                    {
                        return States.EDIT_VERIFY_PIN;
                    } else
                    {
                        return States.COMPLETED;
                    }
                }

            };
            EDIT_RESEND_PIN_BY_VOICE = new States("EDIT_RESEND_PIN_BY_VOICE", 12) {

                protected final States performInternal(Context context1, MnvManager mnvmanager, ProfileServicesClient profileservicesclient)
                {
                    profileservicesclient.register(mnvmanager);
                    if (profileservicesclient.call(c.EDIT_RESEND_PIN_BY_VOICE, mnvmanager.getPhoneEntry()))
                    {
                        return States.EDIT_VERIFY_PIN;
                    } else
                    {
                        return States.COMPLETED;
                    }
                }

            };
            VERIFIED = new States("VERIFIED", 13) {

                protected final States performInternal(Context context1, MnvManager mnvmanager, ProfileServicesClient profileservicesclient)
                {
                    return States.COMPLETED;
                }

            };
            HTTP_DISCONNECT = new States("HTTP_DISCONNECT", 14) {

                protected final States performInternal(Context context1, MnvManager mnvmanager, ProfileServicesClient profileservicesclient)
                {
                    profileservicesclient.disconnect();
                    return States.ERRORS_UNABLE;
                }

            };
            ERRORS_RETRY = new States("ERRORS_RETRY", 15) {

                protected final States performInternal(Context context1, MnvManager mnvmanager, ProfileServicesClient profileservicesclient)
                {
                    return States.ERRORS_RETRY;
                }

            };
            ERRORS_UNABLE = new States("ERRORS_UNABLE", 16) {

                protected final States performInternal(Context context1, MnvManager mnvmanager, ProfileServicesClient profileservicesclient)
                {
                    return States.ERRORS_UNABLE;
                }

            };
            ERRORS_PHONE = new States("ERRORS_PHONE", 17) {

                protected final States performInternal(Context context1, MnvManager mnvmanager, ProfileServicesClient profileservicesclient)
                {
                    return null;
                }

            };
            ERRORS_PIN = new States("ERRORS_PIN", 18) {

                protected final States performInternal(Context context1, MnvManager mnvmanager, ProfileServicesClient profileservicesclient)
                {
                    profileservicesclient.register(mnvmanager);
                    if (profileservicesclient.call(c.ADD_VERIFIED_SOURCE_MSA, mnvmanager.getPinEntry()))
                    {
                        return States.VERIFIED;
                    } else
                    {
                        return States.COMPLETED;
                    }
                }

            };
            ERRORS_UNSUPPORTED = new States("ERRORS_UNSUPPORTED", 19) {

                protected final States performInternal(Context context1, MnvManager mnvmanager, ProfileServicesClient profileservicesclient)
                {
                    return null;
                }

            };
            QOS_ALERT = new States("QOS_ALERT", 20) {

                protected final States performInternal(Context context1, MnvManager mnvmanager, ProfileServicesClient profileservicesclient)
                {
                    return States.QOS_ALERT;
                }

            };
            ERRORS_UNKNOWN = new States("ERRORS_UNKNOWN", 21) {

                protected final States performInternal(Context context1, MnvManager mnvmanager, ProfileServicesClient profileservicesclient)
                {
                    return States.ERRORS_UNKNOWN;
                }

            };
            UNKNOWN_STATE = new States("UNKNOWN_STATE", 22) {

                protected final States performInternal(Context context1, MnvManager mnvmanager, ProfileServicesClient profileservicesclient)
                {
                    return States.UNKNOWN_STATE;
                }

            };
            PRE_CHECK = new States("PRE_CHECK", 23) {

                protected final States performInternal(Context context1, MnvManager mnvmanager, ProfileServicesClient profileservicesclient)
                {
                    profileservicesclient.register(mnvmanager);
                    profileservicesclient.call(c.PRE_CHECK, null);
                    return States.PRE_CHECK;
                }

            };
            SKIPPED = new States("SKIPPED", 24) {

                protected final States performInternal(Context context1, MnvManager mnvmanager, ProfileServicesClient profileservicesclient)
                {
                    return States.SKIPPED;
                }

            };
            COMPLETED = new States("COMPLETED", 25) {

                protected final States performInternal(Context context1, MnvManager mnvmanager, ProfileServicesClient profileservicesclient)
                {
                    return States.COMPLETED;
                }

            };
            PREVIOUS = new States("PREVIOUS", 26) {

                protected final States performInternal(Context context1, MnvManager mnvmanager, ProfileServicesClient profileservicesclient)
                {
                    context1 = mnvmanager.getStateDataChange().getStateData().getNextState();
                    mnvmanager.getStateDataChange().getStateData().setNextState(mnvmanager.getStateDataChange().getStateData().getCurrentState());
                    mnvmanager.getStateDataChange().getStateData().setCurrentState(context1);
                    return PREVIOUS;
                }

            };
            $VALUES = (new States[] {
                NOT_INITIALIZED, INITIALIZED, CHECKING_ACCOUNT, ADD_FRIENDS, LEARN_MORE, ADD_PHONE_VERIFY_BY_SMS, EDIT_PHONE_VERIFY_BY_SMS, ADD_PHONE_VERIFY_BY_VOICE, EDIT_PHONE_VERIFY_BY_VOICE, ADD_VERIFIED_SOURCE_MSA, 
                EDIT_VERIFY_PIN, EDIT_RESEND_PIN_BY_SMS, EDIT_RESEND_PIN_BY_VOICE, VERIFIED, HTTP_DISCONNECT, ERRORS_RETRY, ERRORS_UNABLE, ERRORS_PHONE, ERRORS_PIN, ERRORS_UNSUPPORTED, 
                QOS_ALERT, ERRORS_UNKNOWN, UNKNOWN_STATE, PRE_CHECK, SKIPPED, COMPLETED, PREVIOUS
            });
        }

        private States(String s, int i)
        {
            super(s, i);
        }

    }

    static class a
    {

        private MnvStateData stateData;
        private a type;

        public MnvStateData getStateData()
        {
            return stateData;
        }

        public a getType()
        {
            return type;
        }

        public void setStateData(MnvStateData mnvstatedata)
        {
            stateData = mnvstatedata;
        }

        public a(MnvStateData mnvstatedata, a a1)
        {
            stateData = mnvstatedata;
            type = a1;
        }
    }

    static final class a.a extends Enum
    {

        private static final a.a $VALUES[];
        public static final a.a ASYNC;
        public static final a.a FAILURE;
        public static final a.a NONE;
        public static final a.a SUCCESS;

        public static a.a valueOf(String s)
        {
            return (a.a)Enum.valueOf(com/skype/android/app/mnv/MnvManager$a$a, s);
        }

        public static a.a[] values()
        {
            return (a.a[])$VALUES.clone();
        }

        static 
        {
            NONE = new a.a("NONE", 0);
            SUCCESS = new a.a("SUCCESS", 1);
            FAILURE = new a.a("FAILURE", 2);
            ASYNC = new a.a("ASYNC", 3);
            $VALUES = (new a.a[] {
                NONE, SUCCESS, FAILURE, ASYNC
            });
        }

        private a.a(String s, int i)
        {
            super(s, i);
        }
    }


    private static final Logger log = Logger.getLogger("MnvManager");
    private final Context context;
    private String country;
    private final EventBus eventBus;
    private final MnvAnalytics mnvAnalytics;
    private final MnvCases mnvCases;
    private final MnvManagerEvents mnvManagerEvents;
    private MnvPostRequest mnvPostRequest;
    private MnvSmsReceiver mnvSmsReceiver;
    private a mnvStateDataChangeEvent;
    private String phoneNumber;
    private String pin;
    private ProfileServicesResponse.ProfileData profileData;
    private ProfileServicesClient profileServices;
    private States state;
    private ProfileServiceToken token;
    private final UserPreferences userPreferences;

    public MnvManager(Application application, ProfileServicesClient profileservicesclient, MnvManagerEvents mnvmanagerevents, MnvCases mnvcases, MnvAnalytics mnvanalytics, MnvPostRequest mnvpostrequest, EventBus eventbus, 
            UserPreferences userpreferences)
    {
        state = States.NOT_INITIALIZED;
        context = application;
        profileServices = profileservicesclient;
        mnvManagerEvents = mnvmanagerevents;
        mnvCases = mnvcases;
        mnvAnalytics = mnvanalytics;
        mnvPostRequest = mnvpostrequest;
        eventBus = eventbus;
        userPreferences = userpreferences;
        initializeChangeEvent();
    }

    private void handleVerifiedNumber(States states, States states1)
    {
        MnvStateData mnvstatedata = getStateDataChange().getStateData();
        mnvstatedata.setCurrentState(states);
        mnvstatedata.setNextState(states1);
        mnvStateDataChangeEvent = new a(mnvstatedata, a.a.SUCCESS);
        triggerAppEvent();
    }

    private void initializeChangeEvent()
    {
        MnvStateData mnvstatedata = new MnvStateData();
        mnvstatedata.setCurrentState(state);
        mnvStateDataChangeEvent = new a(mnvstatedata, a.a.NONE);
    }

    private States performRequest()
    {
        return state.performRequest(context, profileServices, token, this);
    }

    private void triggerAppEvent()
    {
        eventBus.a(mnvStateDataChangeEvent);
    }

    private States triggerUnexpectedProblemEvent(String s)
    {
        log.severe((new StringBuilder("MNV unexpected problem: ")).append(s).toString());
        s = States.ERRORS_UNABLE;
        MnvStateData mnvstatedata = getStateDataChange().getStateData();
        mnvstatedata.setNextState(s);
        mnvstatedata.setErrorState(ProfileServicesErrors.ErrorState.ENCOUNTERED_A_PROBLEM);
        mnvStateDataChangeEvent = new a(mnvstatedata, a.a.ASYNC);
        triggerAppEvent();
        return s;
    }

    public ContentValues getPhoneEntry()
    {
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("userInputPhoneNumber", phoneNumber);
        contentvalues.put("userInputCountry", country);
        return contentvalues;
    }

    public ContentValues getPinEntry()
    {
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("userInputPhoneNumber", phoneNumber);
        contentvalues.put("userInputCountry", country);
        contentvalues.put("userInputPinCode", pin);
        return contentvalues;
    }

    public a getStateDataChange()
    {
        return mnvStateDataChangeEvent;
    }

    public void onComplete()
    {
        mnvCases.setCompleted();
    }

    public void onSkip(int i)
    {
        if (i == 2)
        {
            mnvCases.setSkip(14);
            mnvCases.incrementSkipCount();
            return;
        } else
        {
            mnvCases.setSkip(1);
            return;
        }
    }

    public void onTimeout()
    {
        log.info("MNV disconnecting HTTP on timeout");
        (new Thread(new Runnable() {

            final MnvManager this$0;

            public final void run()
            {
                try
                {
                    MnvStateData mnvstatedata = getStateDataChange().getStateData();
                    States states = request(States.HTTP_DISCONNECT);
                    if (mnvstatedata.getCurrentState() == States.NOT_INITIALIZED)
                    {
                        states = States.ADD_FRIENDS;
                    }
                    mnvstatedata.setNextState(states);
                    mnvstatedata.setErrorState(ProfileServicesErrors.ErrorState.TIMEOUT_EXCEPTION);
                    mnvStateDataChangeEvent = new a(mnvstatedata, a.a.ASYNC);
                    triggerAppEvent();
                    return;
                }
                catch (Exception exception)
                {
                    exception.printStackTrace();
                }
            }

            
            {
                this$0 = MnvManager.this;
                super();
            }
        })).start();
    }

    public void processAsyncError(Throwable throwable)
    {
        MnvStateData mnvstatedata = getStateDataChange().getStateData();
        mnvAnalytics.reportServerError("MnvHttpAsyncError", throwable.getMessage(), AnalyticsEvent.cB);
        log.info((new StringBuilder("MNV async error: ")).append(throwable.getMessage()).toString());
        mnvStateDataChangeEvent = new a(mnvstatedata, a.a.ASYNC);
        triggerAppEvent();
    }

    public void processServiceError(ProfileServicesResponse.ProfileError profileerror)
    {
        MnvStateData mnvstatedata = getStateDataChange().getStateData();
        mnvstatedata.setCurrentState(state);
        while (mnvstatedata.getCurrentState() == States.HTTP_DISCONNECT || mnvstatedata.getNextState() == States.QOS_ALERT) 
        {
            return;
        }
        mnvAnalytics.reportServerError("MnvProfileServicesError", AnalyticsEvent.cB);
        log.info((new StringBuilder("MNV profile services error code: ")).append(profileerror.getCode()).toString());
        if (ProfileServicesErrors.ErrorState.fromErrorString(profileerror.getCode()) == null)
        {
            mnvAnalytics.reportServerError("MnvUnknownProfileServicesError", profileerror.getCode(), AnalyticsEvent.cB);
        } else
        {
            mnvManagerEvents.processServiceError(mnvstatedata, profileerror);
        }
        mnvStateDataChangeEvent = new a(mnvstatedata, a.a.FAILURE);
        triggerAppEvent();
    }

    public void processSuccess(ProfileServicesResponse.ProfileData profiledata)
    {
        if (state != States.PRE_CHECK) goto _L2; else goto _L1
_L1:
        profileData = profiledata;
        request(States.ADD_PHONE_VERIFY_BY_SMS, phoneNumber, country);
_L11:
        return;
_L2:
        MnvStateData mnvstatedata;
        boolean flag;
        mnvstatedata = getStateDataChange().getStateData();
        mnvstatedata.setCurrentState(state);
        flag = true;
        static final class _cls3
        {

            static final int $SwitchMap$com$skype$android$app$mnv$MnvManager$States[];

            static 
            {
                $SwitchMap$com$skype$android$app$mnv$MnvManager$States = new int[States.values().length];
                try
                {
                    $SwitchMap$com$skype$android$app$mnv$MnvManager$States[States.CHECKING_ACCOUNT.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror8) { }
                try
                {
                    $SwitchMap$com$skype$android$app$mnv$MnvManager$States[States.ADD_VERIFIED_SOURCE_MSA.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    $SwitchMap$com$skype$android$app$mnv$MnvManager$States[States.ADD_PHONE_VERIFY_BY_SMS.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    $SwitchMap$com$skype$android$app$mnv$MnvManager$States[States.EDIT_PHONE_VERIFY_BY_SMS.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    $SwitchMap$com$skype$android$app$mnv$MnvManager$States[States.ADD_PHONE_VERIFY_BY_VOICE.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    $SwitchMap$com$skype$android$app$mnv$MnvManager$States[States.EDIT_PHONE_VERIFY_BY_VOICE.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$com$skype$android$app$mnv$MnvManager$States[States.EDIT_VERIFY_PIN.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$skype$android$app$mnv$MnvManager$States[States.EDIT_RESEND_PIN_BY_SMS.ordinal()] = 8;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$skype$android$app$mnv$MnvManager$States[States.EDIT_RESEND_PIN_BY_VOICE.ordinal()] = 9;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls3..SwitchMap.com.skype.android.app.mnv.MnvManager.States[state.ordinal()];
        JVM INSTR tableswitch 1 9: default 112
    //                   1 136
    //                   2 153
    //                   3 203
    //                   4 203
    //                   5 203
    //                   6 203
    //                   7 215
    //                   8 227
    //                   9 239;
           goto _L3 _L4 _L5 _L6 _L6 _L6 _L6 _L7 _L8 _L9
_L9:
        break MISSING_BLOCK_LABEL_239;
_L3:
        break; /* Loop/switch isn't completed */
_L4:
        break; /* Loop/switch isn't completed */
_L12:
        if (flag)
        {
            mnvStateDataChangeEvent = new a(mnvstatedata, a.a.SUCCESS);
            triggerAppEvent();
            return;
        }
        if (true) goto _L11; else goto _L10
_L10:
        mnvManagerEvents.processPreCheck(mnvstatedata, profiledata);
        profileData = profiledata;
          goto _L12
_L5:
        if (mnvstatedata.getSkipAddNumberFlow())
        {
            mnvCases.setCompleted();
            mnvAnalytics.report(mnvAnalytics.getUserType(userPreferences), AnalyticsEvent.cO);
            flag = false;
        } else
        {
            mnvstatedata.setNextState(States.VERIFIED);
        }
          goto _L12
_L6:
        mnvManagerEvents.processPhoneEntry(mnvstatedata, profiledata);
          goto _L12
_L7:
        mnvManagerEvents.processPinEntry(mnvstatedata, profiledata);
          goto _L12
_L8:
        mnvManagerEvents.processResendPinBySms(mnvstatedata, profiledata);
          goto _L12
        mnvManagerEvents.processResendPinByVoice(mnvstatedata, profiledata);
          goto _L12
    }

    protected void registerSmsReceiver()
    {
        if (mnvSmsReceiver == null)
        {
            IntentFilter intentfilter = new IntentFilter("android.provider.Telephony.SMS_RECEIVED");
            intentfilter.setPriority(999);
            mnvSmsReceiver = new MnvSmsReceiver(new com.skype.android.app.mnv.a() {

                final MnvManager this$0;

                public final void handle(String s)
                {
                    eventBus.a(new OnPinReceived(s));
                }

            
            {
                this$0 = MnvManager.this;
                super();
            }
            });
            context.registerReceiver(mnvSmsReceiver, intentfilter);
        }
    }

    public States request(States states)
    {
        log.info((new StringBuilder("MNV current state before requesting: ")).append(state.name()).toString());
        if (state == States.NOT_INITIALIZED)
        {
            return triggerUnexpectedProblemEvent("MNV is not initialized");
        }
        log.info((new StringBuilder("MNV MnvManagerImpl requested state: ")).append(states.name()).toString());
        if (states == States.EDIT_RESEND_PIN_BY_SMS)
        {
            registerSmsReceiver();
        }
        state = states;
        return performRequest();
    }

    public States request(States states, MnvStateData mnvstatedata)
    {
        log.info((new StringBuilder("MNV current state before requesting: ")).append(state.name()).toString());
        if (state == States.NOT_INITIALIZED)
        {
            return triggerUnexpectedProblemEvent("MNV is not initialized");
        } else
        {
            log.info((new StringBuilder("MNV MnvManagerImpl requested state: ")).append(states.name()).toString());
            States states1 = mnvstatedata.getNextState();
            mnvstatedata.setNextState(states);
            triggerAppEvent();
            mnvstatedata.setNextState(states1);
            log.info((new StringBuilder("MNV MnvManagerImpl returning to originalState: ")).append(states1.name()).toString());
            state = states;
            return state;
        }
    }

    public States request(States states, String s)
    {
        log.info((new StringBuilder("MNV current state before requesting: ")).append(state.name()).toString());
        if (state == States.NOT_INITIALIZED)
        {
            return triggerUnexpectedProblemEvent("MNV is not initialized");
        }
        if (TextUtils.isEmpty(phoneNumber) && TextUtils.isEmpty(country))
        {
            return triggerUnexpectedProblemEvent("MNV no phoneNumber and country code provided!");
        }
        if (TextUtils.isEmpty(s))
        {
            return triggerUnexpectedProblemEvent("MNV no pin code provided!");
        } else
        {
            log.info((new StringBuilder("MNV MnvManagerImpl requested state: ")).append(states.name()).toString());
            state = states;
            pin = s;
            unRegisterSmsReceiver();
            return performRequest();
        }
    }

    public States request(States states, String s, String s1)
    {
        log.info((new StringBuilder("MNV current state before requesting: ")).append(state.name()).toString());
        if (state == States.NOT_INITIALIZED)
        {
            return triggerUnexpectedProblemEvent("MNV is not initialized");
        }
        if (TextUtils.isEmpty(s) && TextUtils.isEmpty(s1))
        {
            return triggerUnexpectedProblemEvent("MNV no phoneNumber and country code provided!");
        }
        log.info((new StringBuilder("MNV MnvManagerImpl requested state: ")).append(states.name()).toString());
        if (states != States.PRE_CHECK) goto _L2; else goto _L1
_L1:
        state = States.PRE_CHECK;
_L4:
        phoneNumber = s;
        country = s1;
        return performRequest();
_L2:
        state = mnvPostRequest.getStateFromProfileData(states, profileData, s, s1);
        if (state == States.VERIFIED)
        {
            handleVerifiedNumber(states, States.VERIFIED);
            return null;
        }
        if (state == States.ADD_PHONE_VERIFY_BY_SMS || state == States.EDIT_PHONE_VERIFY_BY_SMS)
        {
            registerSmsReceiver();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void reset()
    {
        unRegisterSmsReceiver();
    }

    public void resetLastCheckedTime()
    {
        mnvCases.resetLastCheckedTime();
    }

    public void setToken(ProfileServiceToken profileservicetoken)
    {
        if (state == States.NOT_INITIALIZED && profileservicetoken == null)
        {
            mnvAnalytics.report(AnalyticsEvent.cA);
            triggerUnexpectedProblemEvent("MNV no Token provided!");
            return;
        }
        if (token == null)
        {
            log.info("MNV MnvManager is initialized");
            state = States.INITIALIZED;
        }
        token = profileservicetoken;
    }

    public boolean shouldRetry(MnvCases.REFERRER referrer, boolean flag)
    {
        log.info((new StringBuilder("MNV MnvManagerImpl.shouldRetry, referrer: ")).append(referrer.name()).toString());
        return mnvCases.shouldRetry(referrer, flag);
    }

    protected void unRegisterSmsReceiver()
    {
        if (mnvSmsReceiver != null)
        {
            context.unregisterReceiver(mnvSmsReceiver);
            mnvSmsReceiver = null;
        }
    }



/*
    static a access$102(MnvManager mnvmanager, a a)
    {
        mnvmanager.mnvStateDataChangeEvent = a;
        return a;
    }

*/


}
