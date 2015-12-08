// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.mnv;

import android.content.Context;
import com.skype.android.app.shortcircuit.ProfileServiceToken;

// Referenced classes of package com.skype.android.app.mnv:
//            MnvManager, ProfileServicesClient, c, MnvStateData

public static abstract class <init> extends Enum
{

    private static final PREVIOUS $VALUES[];
    public static final PREVIOUS ADD_FRIENDS;
    public static final PREVIOUS ADD_PHONE_VERIFY_BY_SMS;
    public static final PREVIOUS ADD_PHONE_VERIFY_BY_VOICE;
    public static final PREVIOUS ADD_VERIFIED_SOURCE_MSA;
    public static final PREVIOUS CHECKING_ACCOUNT;
    public static final PREVIOUS COMPLETED;
    public static final PREVIOUS EDIT_PHONE_VERIFY_BY_SMS;
    public static final PREVIOUS EDIT_PHONE_VERIFY_BY_VOICE;
    public static final PREVIOUS EDIT_RESEND_PIN_BY_SMS;
    public static final PREVIOUS EDIT_RESEND_PIN_BY_VOICE;
    public static final PREVIOUS EDIT_VERIFY_PIN;
    public static final PREVIOUS ERRORS_PHONE;
    public static final PREVIOUS ERRORS_PIN;
    public static final PREVIOUS ERRORS_RETRY;
    public static final PREVIOUS ERRORS_UNABLE;
    public static final PREVIOUS ERRORS_UNKNOWN;
    public static final PREVIOUS ERRORS_UNSUPPORTED;
    public static final PREVIOUS HTTP_DISCONNECT;
    public static final PREVIOUS INITIALIZED;
    public static final PREVIOUS LEARN_MORE;
    public static final PREVIOUS NOT_INITIALIZED;
    public static final PREVIOUS PREVIOUS;
    public static final PREVIOUS PRE_CHECK;
    public static final PREVIOUS QOS_ALERT;
    public static final PREVIOUS SKIPPED;
    public static final PREVIOUS UNKNOWN_STATE;
    public static final PREVIOUS VERIFIED;

    public static <init> valueOf(String s)
    {
        return (<init>)Enum.valueOf(com/skype/android/app/mnv/MnvManager$States, s);
    }

    public static <init>[] values()
    {
        return (<init>[])$VALUES.clone();
    }

    protected abstract ent performInternal(Context context, MnvManager mnvmanager, ProfileServicesClient profileservicesclient);

    public rviceToken performRequest(Context context, ProfileServicesClient profileservicesclient, ProfileServiceToken profileservicetoken, MnvManager mnvmanager)
    {
        profileservicesclient.setToken(profileservicetoken);
        return performInternal(context, mnvmanager, profileservicesclient);
    }

    static 
    {
        NOT_INITIALIZED = new MnvManager.States("NOT_INITIALIZED", 0) {

            protected final MnvManager.States performInternal(Context context, MnvManager mnvmanager, ProfileServicesClient profileservicesclient)
            {
                return MnvManager.States.INITIALIZED;
            }

        };
        INITIALIZED = new MnvManager.States("INITIALIZED", 1) {

            protected final MnvManager.States performInternal(Context context, MnvManager mnvmanager, ProfileServicesClient profileservicesclient)
            {
                return MnvManager.States.CHECKING_ACCOUNT;
            }

        };
        CHECKING_ACCOUNT = new MnvManager.States("CHECKING_ACCOUNT", 2) {

            protected final MnvManager.States performInternal(Context context, MnvManager mnvmanager, ProfileServicesClient profileservicesclient)
            {
                profileservicesclient.register(mnvmanager);
                if (profileservicesclient.call(c.PRE_CHECK, null))
                {
                    return MnvManager.States.ADD_FRIENDS;
                } else
                {
                    return MnvManager.States.COMPLETED;
                }
            }

        };
        ADD_FRIENDS = new MnvManager.States("ADD_FRIENDS", 3) {

            protected final MnvManager.States performInternal(Context context, MnvManager mnvmanager, ProfileServicesClient profileservicesclient)
            {
                return ADD_PHONE_VERIFY_BY_SMS;
            }

        };
        LEARN_MORE = new MnvManager.States("LEARN_MORE", 4) {

            protected final MnvManager.States performInternal(Context context, MnvManager mnvmanager, ProfileServicesClient profileservicesclient)
            {
                return null;
            }

        };
        ADD_PHONE_VERIFY_BY_SMS = new MnvManager.States("ADD_PHONE_VERIFY_BY_SMS", 5) {

            protected final MnvManager.States performInternal(Context context, MnvManager mnvmanager, ProfileServicesClient profileservicesclient)
            {
                profileservicesclient.register(mnvmanager);
                if (profileservicesclient.call(c.ADD_PHONE_VERIFY_BY_SMS, mnvmanager.getPhoneEntry()))
                {
                    return MnvManager.States.EDIT_VERIFY_PIN;
                } else
                {
                    return MnvManager.States.COMPLETED;
                }
            }

        };
        EDIT_PHONE_VERIFY_BY_SMS = new MnvManager.States("EDIT_PHONE_VERIFY_BY_SMS", 6) {

            protected final MnvManager.States performInternal(Context context, MnvManager mnvmanager, ProfileServicesClient profileservicesclient)
            {
                profileservicesclient.register(mnvmanager);
                if (profileservicesclient.call(c.EDIT_PHONE_VERIFY_BY_SMS, mnvmanager.getPhoneEntry()))
                {
                    return MnvManager.States.EDIT_VERIFY_PIN;
                } else
                {
                    return MnvManager.States.COMPLETED;
                }
            }

        };
        ADD_PHONE_VERIFY_BY_VOICE = new MnvManager.States("ADD_PHONE_VERIFY_BY_VOICE", 7) {

            protected final MnvManager.States performInternal(Context context, MnvManager mnvmanager, ProfileServicesClient profileservicesclient)
            {
                profileservicesclient.register(mnvmanager);
                if (profileservicesclient.call(c.ADD_PHONE_VERIFY_BY_VOICE, mnvmanager.getPhoneEntry()))
                {
                    return MnvManager.States.EDIT_VERIFY_PIN;
                } else
                {
                    return MnvManager.States.COMPLETED;
                }
            }

        };
        EDIT_PHONE_VERIFY_BY_VOICE = new MnvManager.States("EDIT_PHONE_VERIFY_BY_VOICE", 8) {

            protected final MnvManager.States performInternal(Context context, MnvManager mnvmanager, ProfileServicesClient profileservicesclient)
            {
                profileservicesclient.register(mnvmanager);
                if (profileservicesclient.call(c.EDIT_PHONE_VERIFY_BY_VOICE, mnvmanager.getPhoneEntry()))
                {
                    return MnvManager.States.EDIT_VERIFY_PIN;
                } else
                {
                    return MnvManager.States.COMPLETED;
                }
            }

        };
        ADD_VERIFIED_SOURCE_MSA = new MnvManager.States("ADD_VERIFIED_SOURCE_MSA", 9) {

            protected final MnvManager.States performInternal(Context context, MnvManager mnvmanager, ProfileServicesClient profileservicesclient)
            {
                profileservicesclient.register(mnvmanager);
                if (profileservicesclient.call(c.ADD_VERIFIED_SOURCE_MSA, mnvmanager.getPhoneEntry()))
                {
                    return MnvManager.States.EDIT_VERIFY_PIN;
                } else
                {
                    return MnvManager.States.COMPLETED;
                }
            }

        };
        EDIT_VERIFY_PIN = new MnvManager.States("EDIT_VERIFY_PIN", 10) {

            protected final MnvManager.States performInternal(Context context, MnvManager mnvmanager, ProfileServicesClient profileservicesclient)
            {
                profileservicesclient.register(mnvmanager);
                if (profileservicesclient.call(c.EDIT_VERIFY_PIN, mnvmanager.getPinEntry()))
                {
                    return MnvManager.States.VERIFIED;
                } else
                {
                    return MnvManager.States.EDIT_VERIFY_PIN;
                }
            }

        };
        EDIT_RESEND_PIN_BY_SMS = new MnvManager.States("EDIT_RESEND_PIN_BY_SMS", 11) {

            protected final MnvManager.States performInternal(Context context, MnvManager mnvmanager, ProfileServicesClient profileservicesclient)
            {
                profileservicesclient.register(mnvmanager);
                if (profileservicesclient.call(c.EDIT_RESEND_PIN_BY_SMS, mnvmanager.getPhoneEntry()))
                {
                    return MnvManager.States.EDIT_VERIFY_PIN;
                } else
                {
                    return MnvManager.States.COMPLETED;
                }
            }

        };
        EDIT_RESEND_PIN_BY_VOICE = new MnvManager.States("EDIT_RESEND_PIN_BY_VOICE", 12) {

            protected final MnvManager.States performInternal(Context context, MnvManager mnvmanager, ProfileServicesClient profileservicesclient)
            {
                profileservicesclient.register(mnvmanager);
                if (profileservicesclient.call(c.EDIT_RESEND_PIN_BY_VOICE, mnvmanager.getPhoneEntry()))
                {
                    return MnvManager.States.EDIT_VERIFY_PIN;
                } else
                {
                    return MnvManager.States.COMPLETED;
                }
            }

        };
        VERIFIED = new MnvManager.States("VERIFIED", 13) {

            protected final MnvManager.States performInternal(Context context, MnvManager mnvmanager, ProfileServicesClient profileservicesclient)
            {
                return MnvManager.States.COMPLETED;
            }

        };
        HTTP_DISCONNECT = new MnvManager.States("HTTP_DISCONNECT", 14) {

            protected final MnvManager.States performInternal(Context context, MnvManager mnvmanager, ProfileServicesClient profileservicesclient)
            {
                profileservicesclient.disconnect();
                return MnvManager.States.ERRORS_UNABLE;
            }

        };
        ERRORS_RETRY = new MnvManager.States("ERRORS_RETRY", 15) {

            protected final MnvManager.States performInternal(Context context, MnvManager mnvmanager, ProfileServicesClient profileservicesclient)
            {
                return MnvManager.States.ERRORS_RETRY;
            }

        };
        ERRORS_UNABLE = new MnvManager.States("ERRORS_UNABLE", 16) {

            protected final MnvManager.States performInternal(Context context, MnvManager mnvmanager, ProfileServicesClient profileservicesclient)
            {
                return MnvManager.States.ERRORS_UNABLE;
            }

        };
        ERRORS_PHONE = new MnvManager.States("ERRORS_PHONE", 17) {

            protected final MnvManager.States performInternal(Context context, MnvManager mnvmanager, ProfileServicesClient profileservicesclient)
            {
                return null;
            }

        };
        ERRORS_PIN = new MnvManager.States("ERRORS_PIN", 18) {

            protected final MnvManager.States performInternal(Context context, MnvManager mnvmanager, ProfileServicesClient profileservicesclient)
            {
                profileservicesclient.register(mnvmanager);
                if (profileservicesclient.call(c.ADD_VERIFIED_SOURCE_MSA, mnvmanager.getPinEntry()))
                {
                    return MnvManager.States.VERIFIED;
                } else
                {
                    return MnvManager.States.COMPLETED;
                }
            }

        };
        ERRORS_UNSUPPORTED = new MnvManager.States("ERRORS_UNSUPPORTED", 19) {

            protected final MnvManager.States performInternal(Context context, MnvManager mnvmanager, ProfileServicesClient profileservicesclient)
            {
                return null;
            }

        };
        QOS_ALERT = new MnvManager.States("QOS_ALERT", 20) {

            protected final MnvManager.States performInternal(Context context, MnvManager mnvmanager, ProfileServicesClient profileservicesclient)
            {
                return MnvManager.States.QOS_ALERT;
            }

        };
        ERRORS_UNKNOWN = new MnvManager.States("ERRORS_UNKNOWN", 21) {

            protected final MnvManager.States performInternal(Context context, MnvManager mnvmanager, ProfileServicesClient profileservicesclient)
            {
                return MnvManager.States.ERRORS_UNKNOWN;
            }

        };
        UNKNOWN_STATE = new MnvManager.States("UNKNOWN_STATE", 22) {

            protected final MnvManager.States performInternal(Context context, MnvManager mnvmanager, ProfileServicesClient profileservicesclient)
            {
                return MnvManager.States.UNKNOWN_STATE;
            }

        };
        PRE_CHECK = new MnvManager.States("PRE_CHECK", 23) {

            protected final MnvManager.States performInternal(Context context, MnvManager mnvmanager, ProfileServicesClient profileservicesclient)
            {
                profileservicesclient.register(mnvmanager);
                profileservicesclient.call(c.PRE_CHECK, null);
                return MnvManager.States.PRE_CHECK;
            }

        };
        SKIPPED = new MnvManager.States("SKIPPED", 24) {

            protected final MnvManager.States performInternal(Context context, MnvManager mnvmanager, ProfileServicesClient profileservicesclient)
            {
                return MnvManager.States.SKIPPED;
            }

        };
        COMPLETED = new MnvManager.States("COMPLETED", 25) {

            protected final MnvManager.States performInternal(Context context, MnvManager mnvmanager, ProfileServicesClient profileservicesclient)
            {
                return MnvManager.States.COMPLETED;
            }

        };
        PREVIOUS = new MnvManager.States("PREVIOUS", 26) {

            protected final MnvManager.States performInternal(Context context, MnvManager mnvmanager, ProfileServicesClient profileservicesclient)
            {
                context = mnvmanager.getStateDataChange().getStateData().getNextState();
                mnvmanager.getStateDataChange().getStateData().setNextState(mnvmanager.getStateDataChange().getStateData().getCurrentState());
                mnvmanager.getStateDataChange().getStateData().setCurrentState(context);
                return PREVIOUS;
            }

        };
        $VALUES = (new .VALUES[] {
            NOT_INITIALIZED, INITIALIZED, CHECKING_ACCOUNT, ADD_FRIENDS, LEARN_MORE, ADD_PHONE_VERIFY_BY_SMS, EDIT_PHONE_VERIFY_BY_SMS, ADD_PHONE_VERIFY_BY_VOICE, EDIT_PHONE_VERIFY_BY_VOICE, ADD_VERIFIED_SOURCE_MSA, 
            EDIT_VERIFY_PIN, EDIT_RESEND_PIN_BY_SMS, EDIT_RESEND_PIN_BY_VOICE, VERIFIED, HTTP_DISCONNECT, ERRORS_RETRY, ERRORS_UNABLE, ERRORS_PHONE, ERRORS_PIN, ERRORS_UNSUPPORTED, 
            QOS_ALERT, ERRORS_UNKNOWN, UNKNOWN_STATE, PRE_CHECK, SKIPPED, COMPLETED, PREVIOUS
        });
    }

    private _cls9(String s, int i)
    {
        super(s, i);
    }

    _cls9(String s, int i, _cls9 _pcls9)
    {
        this(s, i);
    }
}
