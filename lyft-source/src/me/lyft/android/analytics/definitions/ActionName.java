// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.analytics.definitions;


public final class ActionName extends Enum
{

    private static final ActionName $VALUES[];
    public static final ActionName ADD_CARD;
    public static final ActionName ADD_COUPON;
    public static final ActionName ADD_FACEBOOK;
    public static final ActionName ADD_PAYPAL;
    public static final ActionName ADD_PHONE;
    public static final ActionName ADD_PHONE_FOR_FB;
    public static final ActionName ADD_WALLET;
    public static final ActionName CLAIM_DRIVER_APPLICATION;
    public static final ActionName DRIVER_DOCS_INSPECTION_SUBMIT;
    public static final ActionName DRIVER_DOCS_INSURANCE_SUBMIT;
    public static final ActionName DRIVER_DOCS_REGISTRATION_SUBMIT;
    public static final ActionName DRIVER_ENTER_LAST_RIDE;
    public static final ActionName DRIVER_EXIT_LAST_RIDE;
    public static final ActionName DRIVER_LAPSE_ROUTE;
    public static final ActionName DRIVER_RIDE_ACCEPT;
    public static final ActionName DRIVER_RIDE_CANCEL;
    public static final ActionName DRIVER_RIDE_LAPSE;
    public static final ActionName DRIVER_STATS;
    public static final ActionName EDIT_CARD;
    public static final ActionName INVITE_TOP_CONTACTS;
    public static final ActionName LOAD_ADVERTISING_ID;
    public static final ActionName LOAD_EXPERIMENTS;
    public static final ActionName LOCATION_SERVICE_LAST_KNOWN_LOCATION;
    public static final ActionName LOCATION_SERVICE_REQUEST_UPDATES;
    public static final ActionName LOGIN_FACEBOOK;
    public static final ActionName LOGIN_SUBMIT_PROFILE_INFO;
    public static final ActionName PASSENGER_RATE_AND_DONATE;
    public static final ActionName REFRESH_FACEBOOK_SESSION;
    public static final ActionName RESEND_CODE;
    public static final ActionName RIDE_HISTORY_LOAD_DETAILS;
    public static final ActionName RIDE_HISTORY_LOAD_MORE_RIDES;
    public static final ActionName RIDE_HISTORY_LOAD_RIDES;
    public static final ActionName SAVE_PROFILE_DATA;
    public static final ActionName SAVE_PROFILE_PHOTO;
    public static final ActionName SAVE_PROFILE_PHOTO_AND_DATA;
    public static final ActionName SCAN_CARD;
    public static final ActionName SHARE_ROUTE_URL_VALIDATE;
    public static final ActionName SHOW_IN_APP_NOTIFICATION;
    public static final ActionName SIGNUP_ENTER_INFO;
    public static final ActionName SIGN_OUT_REQUEST;
    public static final ActionName SPLIT_FARE_LOAD_CONTACTS;
    public static final ActionName SPLIT_FARE_REQUEST;
    public static final ActionName SPLIT_FARE_RESPONSE;
    public static final ActionName START_APP;
    public static final ActionName T_AND_E_LINK_ACCOUNT;
    public static final ActionName T_AND_E_RECEIPTS;
    public static final ActionName T_AND_E_UNLINK_ACCOUNT;
    public static final ActionName VERIFY_PHONE;
    public static final ActionName WORK_PERKS_EDIT_EMAIL;
    public static final ActionName WORK_PERKS_ENTER_EMAIL;
    public static final ActionName WORK_PERKS_GET_USER_ORGANIZATION;
    public static final ActionName WORK_PERKS_SEND_INVITES;
    public static final ActionName WORK_PERKS_SEND_SMS;
    private final String value = name().toLowerCase();

    private ActionName(String s, int i)
    {
        super(s, i);
    }

    public static ActionName valueOf(String s)
    {
        return (ActionName)Enum.valueOf(me/lyft/android/analytics/definitions/ActionName, s);
    }

    public static ActionName[] values()
    {
        return (ActionName[])$VALUES.clone();
    }

    public String toString()
    {
        return value;
    }

    static 
    {
        DRIVER_DOCS_INSPECTION_SUBMIT = new ActionName("DRIVER_DOCS_INSPECTION_SUBMIT", 0);
        DRIVER_DOCS_REGISTRATION_SUBMIT = new ActionName("DRIVER_DOCS_REGISTRATION_SUBMIT", 1);
        DRIVER_DOCS_INSURANCE_SUBMIT = new ActionName("DRIVER_DOCS_INSURANCE_SUBMIT", 2);
        DRIVER_RIDE_ACCEPT = new ActionName("DRIVER_RIDE_ACCEPT", 3);
        DRIVER_RIDE_LAPSE = new ActionName("DRIVER_RIDE_LAPSE", 4);
        DRIVER_LAPSE_ROUTE = new ActionName("DRIVER_LAPSE_ROUTE", 5);
        DRIVER_ENTER_LAST_RIDE = new ActionName("DRIVER_ENTER_LAST_RIDE", 6);
        DRIVER_EXIT_LAST_RIDE = new ActionName("DRIVER_EXIT_LAST_RIDE", 7);
        DRIVER_STATS = new ActionName("DRIVER_STATS", 8);
        SIGN_OUT_REQUEST = new ActionName("SIGN_OUT_REQUEST", 9);
        ADD_PAYPAL = new ActionName("ADD_PAYPAL", 10);
        ADD_WALLET = new ActionName("ADD_WALLET", 11);
        ADD_CARD = new ActionName("ADD_CARD", 12);
        EDIT_CARD = new ActionName("EDIT_CARD", 13);
        ADD_COUPON = new ActionName("ADD_COUPON", 14);
        SCAN_CARD = new ActionName("SCAN_CARD", 15);
        SAVE_PROFILE_PHOTO = new ActionName("SAVE_PROFILE_PHOTO", 16);
        SAVE_PROFILE_PHOTO_AND_DATA = new ActionName("SAVE_PROFILE_PHOTO_AND_DATA", 17);
        SAVE_PROFILE_DATA = new ActionName("SAVE_PROFILE_DATA", 18);
        LOAD_EXPERIMENTS = new ActionName("LOAD_EXPERIMENTS", 19);
        START_APP = new ActionName("START_APP", 20);
        ADD_FACEBOOK = new ActionName("ADD_FACEBOOK", 21);
        ADD_PHONE = new ActionName("ADD_PHONE", 22);
        ADD_PHONE_FOR_FB = new ActionName("ADD_PHONE_FOR_FB", 23);
        LOGIN_FACEBOOK = new ActionName("LOGIN_FACEBOOK", 24);
        SIGNUP_ENTER_INFO = new ActionName("SIGNUP_ENTER_INFO", 25);
        CLAIM_DRIVER_APPLICATION = new ActionName("CLAIM_DRIVER_APPLICATION", 26);
        LOGIN_SUBMIT_PROFILE_INFO = new ActionName("LOGIN_SUBMIT_PROFILE_INFO", 27);
        VERIFY_PHONE = new ActionName("VERIFY_PHONE", 28);
        RESEND_CODE = new ActionName("RESEND_CODE", 29);
        SHARE_ROUTE_URL_VALIDATE = new ActionName("SHARE_ROUTE_URL_VALIDATE", 30);
        DRIVER_RIDE_CANCEL = new ActionName("DRIVER_RIDE_CANCEL", 31);
        SPLIT_FARE_LOAD_CONTACTS = new ActionName("SPLIT_FARE_LOAD_CONTACTS", 32);
        SPLIT_FARE_REQUEST = new ActionName("SPLIT_FARE_REQUEST", 33);
        SPLIT_FARE_RESPONSE = new ActionName("SPLIT_FARE_RESPONSE", 34);
        WORK_PERKS_ENTER_EMAIL = new ActionName("WORK_PERKS_ENTER_EMAIL", 35);
        WORK_PERKS_EDIT_EMAIL = new ActionName("WORK_PERKS_EDIT_EMAIL", 36);
        WORK_PERKS_SEND_INVITES = new ActionName("WORK_PERKS_SEND_INVITES", 37);
        WORK_PERKS_SEND_SMS = new ActionName("WORK_PERKS_SEND_SMS", 38);
        WORK_PERKS_GET_USER_ORGANIZATION = new ActionName("WORK_PERKS_GET_USER_ORGANIZATION", 39);
        LOCATION_SERVICE_LAST_KNOWN_LOCATION = new ActionName("LOCATION_SERVICE_LAST_KNOWN_LOCATION", 40);
        LOCATION_SERVICE_REQUEST_UPDATES = new ActionName("LOCATION_SERVICE_REQUEST_UPDATES", 41);
        SHOW_IN_APP_NOTIFICATION = new ActionName("SHOW_IN_APP_NOTIFICATION", 42);
        INVITE_TOP_CONTACTS = new ActionName("INVITE_TOP_CONTACTS", 43);
        PASSENGER_RATE_AND_DONATE = new ActionName("PASSENGER_RATE_AND_DONATE", 44);
        REFRESH_FACEBOOK_SESSION = new ActionName("REFRESH_FACEBOOK_SESSION", 45);
        RIDE_HISTORY_LOAD_RIDES = new ActionName("RIDE_HISTORY_LOAD_RIDES", 46);
        RIDE_HISTORY_LOAD_MORE_RIDES = new ActionName("RIDE_HISTORY_LOAD_MORE_RIDES", 47);
        RIDE_HISTORY_LOAD_DETAILS = new ActionName("RIDE_HISTORY_LOAD_DETAILS", 48);
        LOAD_ADVERTISING_ID = new ActionName("LOAD_ADVERTISING_ID", 49);
        T_AND_E_RECEIPTS = new ActionName("T_AND_E_RECEIPTS", 50);
        T_AND_E_LINK_ACCOUNT = new ActionName("T_AND_E_LINK_ACCOUNT", 51);
        T_AND_E_UNLINK_ACCOUNT = new ActionName("T_AND_E_UNLINK_ACCOUNT", 52);
        $VALUES = (new ActionName[] {
            DRIVER_DOCS_INSPECTION_SUBMIT, DRIVER_DOCS_REGISTRATION_SUBMIT, DRIVER_DOCS_INSURANCE_SUBMIT, DRIVER_RIDE_ACCEPT, DRIVER_RIDE_LAPSE, DRIVER_LAPSE_ROUTE, DRIVER_ENTER_LAST_RIDE, DRIVER_EXIT_LAST_RIDE, DRIVER_STATS, SIGN_OUT_REQUEST, 
            ADD_PAYPAL, ADD_WALLET, ADD_CARD, EDIT_CARD, ADD_COUPON, SCAN_CARD, SAVE_PROFILE_PHOTO, SAVE_PROFILE_PHOTO_AND_DATA, SAVE_PROFILE_DATA, LOAD_EXPERIMENTS, 
            START_APP, ADD_FACEBOOK, ADD_PHONE, ADD_PHONE_FOR_FB, LOGIN_FACEBOOK, SIGNUP_ENTER_INFO, CLAIM_DRIVER_APPLICATION, LOGIN_SUBMIT_PROFILE_INFO, VERIFY_PHONE, RESEND_CODE, 
            SHARE_ROUTE_URL_VALIDATE, DRIVER_RIDE_CANCEL, SPLIT_FARE_LOAD_CONTACTS, SPLIT_FARE_REQUEST, SPLIT_FARE_RESPONSE, WORK_PERKS_ENTER_EMAIL, WORK_PERKS_EDIT_EMAIL, WORK_PERKS_SEND_INVITES, WORK_PERKS_SEND_SMS, WORK_PERKS_GET_USER_ORGANIZATION, 
            LOCATION_SERVICE_LAST_KNOWN_LOCATION, LOCATION_SERVICE_REQUEST_UPDATES, SHOW_IN_APP_NOTIFICATION, INVITE_TOP_CONTACTS, PASSENGER_RATE_AND_DONATE, REFRESH_FACEBOOK_SESSION, RIDE_HISTORY_LOAD_RIDES, RIDE_HISTORY_LOAD_MORE_RIDES, RIDE_HISTORY_LOAD_DETAILS, LOAD_ADVERTISING_ID, 
            T_AND_E_RECEIPTS, T_AND_E_LINK_ACCOUNT, T_AND_E_UNLINK_ACCOUNT
        });
    }
}
