// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.analytics.definitions;


public final class UiElement extends Enum
{

    private static final UiElement $VALUES[];
    public static final UiElement ADD_DEBIT_CARD_BUTTON;
    public static final UiElement APPBOY_INAPP_NOTE;
    public static final UiElement APPBOY_INAPP_PRIMARY;
    public static final UiElement APPBOY_INAPP_SECONDARY;
    public static final UiElement APPBOY_PUSH_NOTIFICATION;
    public static final UiElement CANCEL_RIDE;
    public static final UiElement CHANGE_CARD_COUNTRY;
    public static final UiElement CHECK_IT_OUT_BUTTON;
    public static final UiElement CHOOSE_PHOTO;
    public static final UiElement CLOSE_TOS;
    public static final UiElement CONFIRM_DEPOSIT_BUTTON;
    public static final UiElement DIALOG_DISMISSED;
    public static final UiElement DONT_END_OR_CANCEL;
    public static final UiElement DRIVER_DEFENSE_BUTTON;
    public static final UiElement DRIVER_INSURANCE_PROMPT_NOT_NOW;
    public static final UiElement DRIVER_INSURANCE_PROMPT_UPDATE;
    public static final UiElement DRIVER_INSURANCE_UPDATE;
    public static final UiElement DRIVER_PRIME_TIME_BANNER;
    public static final UiElement DRIVER_REROUTE;
    public static final UiElement DRIVER_SIGN_OUT_CONFIRMATION_DIALOG;
    public static final UiElement DRIVER_STATS;
    public static final UiElement EDIT_DEBIT_CARD_BUTTON;
    public static final UiElement END_RIDE;
    public static final UiElement ENTER_CC;
    public static final UiElement GET_PAID_BUTTON;
    public static final UiElement KEEP_DRIVING;
    public static final UiElement LOGIN;
    public static final UiElement MODE_TOGGLE;
    public static final UiElement NUO_BANNER;
    public static final UiElement OPEN_ADD_CARD_ITEM;
    public static final UiElement OPEN_CREDIT_LINE_ITEM;
    public static final UiElement OPEN_EDIT_CARD_ITEM;
    public static final UiElement OPEN_EDIT_PAYPAL_ITEM;
    public static final UiElement OPEN_EDIT_WALLET_ITEM;
    public static final UiElement PASSENGER_CANCELLATION_DIALOG;
    public static final UiElement PASSENGER_MAP_MOVE;
    public static final UiElement PASSENGER_MAP_ZOOM_BUTTON;
    public static final UiElement PASSENGER_SET_DESTINATION;
    public static final UiElement PASSENGER_SET_PICKUP;
    public static final UiElement PAYMENT_DIALOG_CLOSE;
    public static final UiElement PAYMENT_FRAUD_CLOSE;
    public static final UiElement PAYMENT_SELECT;
    public static final UiElement PAYMENT_WIDGET;
    public static final UiElement PROMO_BANNER;
    public static final UiElement REQUEST_RIDE;
    public static final UiElement RIDE_DETAILS_ADD_TIP;
    public static final UiElement RIDE_DETAILS_LOST_AND_FOUND;
    public static final UiElement RIDE_DETAILS_PRICE_REVIEW;
    public static final UiElement RIDE_HISTORY;
    public static final UiElement RIDE_HISTORY_SIDEBAR;
    public static final UiElement RIDE_REQUEST;
    public static final UiElement RIDE_REQUEST_MISSED;
    public static final UiElement RIDE_TYPE_INFO;
    public static final UiElement SAVE_DEBIT_CARD_BUTTON;
    public static final UiElement SET_DESTINATION_CLASSIC;
    public static final UiElement SHARE_ROUTE_CUE;
    public static final UiElement SIGNUP;
    public static final UiElement SIGN_OUT;
    public static final UiElement SPLIT_FARE_INVITE_DISMISS;
    public static final UiElement SUBMIT_USER_INFO;
    public static final UiElement TAKE_PHOTO;
    public static final UiElement TEXT_DRIVER;
    public static final UiElement T_AND_E_SEND_RECEIPTS_DISABLED;
    public static final UiElement T_AND_E_SEND_RECEIPTS_DISABLED_DURING_RIDE;
    public static final UiElement T_AND_E_SEND_RECEIPTS_ENABLED;
    public static final UiElement T_AND_E_SEND_RECEIPTS_ENABLED_DURING_RIDE;
    public static final UiElement UPDATE_PROFILE_PHOTO;
    private final String value = name().toLowerCase();

    private UiElement(String s, int i)
    {
        super(s, i);
    }

    public static UiElement valueOf(String s)
    {
        return (UiElement)Enum.valueOf(me/lyft/android/analytics/definitions/UiElement, s);
    }

    public static UiElement[] values()
    {
        return (UiElement[])$VALUES.clone();
    }

    public String toString()
    {
        return value;
    }

    static 
    {
        MODE_TOGGLE = new UiElement("MODE_TOGGLE", 0);
        DRIVER_INSURANCE_UPDATE = new UiElement("DRIVER_INSURANCE_UPDATE", 1);
        DRIVER_INSURANCE_PROMPT_UPDATE = new UiElement("DRIVER_INSURANCE_PROMPT_UPDATE", 2);
        DRIVER_INSURANCE_PROMPT_NOT_NOW = new UiElement("DRIVER_INSURANCE_PROMPT_NOT_NOW", 3);
        DRIVER_PRIME_TIME_BANNER = new UiElement("DRIVER_PRIME_TIME_BANNER", 4);
        DRIVER_DEFENSE_BUTTON = new UiElement("DRIVER_DEFENSE_BUTTON", 5);
        KEEP_DRIVING = new UiElement("KEEP_DRIVING", 6);
        SIGN_OUT = new UiElement("SIGN_OUT", 7);
        DRIVER_SIGN_OUT_CONFIRMATION_DIALOG = new UiElement("DRIVER_SIGN_OUT_CONFIRMATION_DIALOG", 8);
        DIALOG_DISMISSED = new UiElement("DIALOG_DISMISSED", 9);
        DRIVER_STATS = new UiElement("DRIVER_STATS", 10);
        DRIVER_REROUTE = new UiElement("DRIVER_REROUTE", 11);
        RIDE_REQUEST = new UiElement("RIDE_REQUEST", 12);
        RIDE_REQUEST_MISSED = new UiElement("RIDE_REQUEST_MISSED", 13);
        CHANGE_CARD_COUNTRY = new UiElement("CHANGE_CARD_COUNTRY", 14);
        OPEN_ADD_CARD_ITEM = new UiElement("OPEN_ADD_CARD_ITEM", 15);
        OPEN_EDIT_CARD_ITEM = new UiElement("OPEN_EDIT_CARD_ITEM", 16);
        OPEN_CREDIT_LINE_ITEM = new UiElement("OPEN_CREDIT_LINE_ITEM", 17);
        OPEN_EDIT_WALLET_ITEM = new UiElement("OPEN_EDIT_WALLET_ITEM", 18);
        OPEN_EDIT_PAYPAL_ITEM = new UiElement("OPEN_EDIT_PAYPAL_ITEM", 19);
        PAYMENT_DIALOG_CLOSE = new UiElement("PAYMENT_DIALOG_CLOSE", 20);
        PAYMENT_FRAUD_CLOSE = new UiElement("PAYMENT_FRAUD_CLOSE", 21);
        ENTER_CC = new UiElement("ENTER_CC", 22);
        PAYMENT_SELECT = new UiElement("PAYMENT_SELECT", 23);
        UPDATE_PROFILE_PHOTO = new UiElement("UPDATE_PROFILE_PHOTO", 24);
        LOGIN = new UiElement("LOGIN", 25);
        SIGNUP = new UiElement("SIGNUP", 26);
        CLOSE_TOS = new UiElement("CLOSE_TOS", 27);
        SUBMIT_USER_INFO = new UiElement("SUBMIT_USER_INFO", 28);
        NUO_BANNER = new UiElement("NUO_BANNER", 29);
        PAYMENT_WIDGET = new UiElement("PAYMENT_WIDGET", 30);
        REQUEST_RIDE = new UiElement("REQUEST_RIDE", 31);
        PROMO_BANNER = new UiElement("PROMO_BANNER", 32);
        SHARE_ROUTE_CUE = new UiElement("SHARE_ROUTE_CUE", 33);
        RIDE_TYPE_INFO = new UiElement("RIDE_TYPE_INFO", 34);
        TEXT_DRIVER = new UiElement("TEXT_DRIVER", 35);
        SET_DESTINATION_CLASSIC = new UiElement("SET_DESTINATION_CLASSIC", 36);
        PASSENGER_SET_PICKUP = new UiElement("PASSENGER_SET_PICKUP", 37);
        PASSENGER_SET_DESTINATION = new UiElement("PASSENGER_SET_DESTINATION", 38);
        PASSENGER_CANCELLATION_DIALOG = new UiElement("PASSENGER_CANCELLATION_DIALOG", 39);
        PASSENGER_MAP_MOVE = new UiElement("PASSENGER_MAP_MOVE", 40);
        PASSENGER_MAP_ZOOM_BUTTON = new UiElement("PASSENGER_MAP_ZOOM_BUTTON", 41);
        TAKE_PHOTO = new UiElement("TAKE_PHOTO", 42);
        CHOOSE_PHOTO = new UiElement("CHOOSE_PHOTO", 43);
        SPLIT_FARE_INVITE_DISMISS = new UiElement("SPLIT_FARE_INVITE_DISMISS", 44);
        APPBOY_PUSH_NOTIFICATION = new UiElement("APPBOY_PUSH_NOTIFICATION", 45);
        APPBOY_INAPP_NOTE = new UiElement("APPBOY_INAPP_NOTE", 46);
        APPBOY_INAPP_PRIMARY = new UiElement("APPBOY_INAPP_PRIMARY", 47);
        APPBOY_INAPP_SECONDARY = new UiElement("APPBOY_INAPP_SECONDARY", 48);
        RIDE_HISTORY_SIDEBAR = new UiElement("RIDE_HISTORY_SIDEBAR", 49);
        RIDE_HISTORY = new UiElement("RIDE_HISTORY", 50);
        RIDE_DETAILS_ADD_TIP = new UiElement("RIDE_DETAILS_ADD_TIP", 51);
        RIDE_DETAILS_LOST_AND_FOUND = new UiElement("RIDE_DETAILS_LOST_AND_FOUND", 52);
        RIDE_DETAILS_PRICE_REVIEW = new UiElement("RIDE_DETAILS_PRICE_REVIEW", 53);
        T_AND_E_SEND_RECEIPTS_ENABLED = new UiElement("T_AND_E_SEND_RECEIPTS_ENABLED", 54);
        T_AND_E_SEND_RECEIPTS_DISABLED = new UiElement("T_AND_E_SEND_RECEIPTS_DISABLED", 55);
        T_AND_E_SEND_RECEIPTS_ENABLED_DURING_RIDE = new UiElement("T_AND_E_SEND_RECEIPTS_ENABLED_DURING_RIDE", 56);
        T_AND_E_SEND_RECEIPTS_DISABLED_DURING_RIDE = new UiElement("T_AND_E_SEND_RECEIPTS_DISABLED_DURING_RIDE", 57);
        END_RIDE = new UiElement("END_RIDE", 58);
        CANCEL_RIDE = new UiElement("CANCEL_RIDE", 59);
        DONT_END_OR_CANCEL = new UiElement("DONT_END_OR_CANCEL", 60);
        GET_PAID_BUTTON = new UiElement("GET_PAID_BUTTON", 61);
        CONFIRM_DEPOSIT_BUTTON = new UiElement("CONFIRM_DEPOSIT_BUTTON", 62);
        ADD_DEBIT_CARD_BUTTON = new UiElement("ADD_DEBIT_CARD_BUTTON", 63);
        EDIT_DEBIT_CARD_BUTTON = new UiElement("EDIT_DEBIT_CARD_BUTTON", 64);
        SAVE_DEBIT_CARD_BUTTON = new UiElement("SAVE_DEBIT_CARD_BUTTON", 65);
        CHECK_IT_OUT_BUTTON = new UiElement("CHECK_IT_OUT_BUTTON", 66);
        $VALUES = (new UiElement[] {
            MODE_TOGGLE, DRIVER_INSURANCE_UPDATE, DRIVER_INSURANCE_PROMPT_UPDATE, DRIVER_INSURANCE_PROMPT_NOT_NOW, DRIVER_PRIME_TIME_BANNER, DRIVER_DEFENSE_BUTTON, KEEP_DRIVING, SIGN_OUT, DRIVER_SIGN_OUT_CONFIRMATION_DIALOG, DIALOG_DISMISSED, 
            DRIVER_STATS, DRIVER_REROUTE, RIDE_REQUEST, RIDE_REQUEST_MISSED, CHANGE_CARD_COUNTRY, OPEN_ADD_CARD_ITEM, OPEN_EDIT_CARD_ITEM, OPEN_CREDIT_LINE_ITEM, OPEN_EDIT_WALLET_ITEM, OPEN_EDIT_PAYPAL_ITEM, 
            PAYMENT_DIALOG_CLOSE, PAYMENT_FRAUD_CLOSE, ENTER_CC, PAYMENT_SELECT, UPDATE_PROFILE_PHOTO, LOGIN, SIGNUP, CLOSE_TOS, SUBMIT_USER_INFO, NUO_BANNER, 
            PAYMENT_WIDGET, REQUEST_RIDE, PROMO_BANNER, SHARE_ROUTE_CUE, RIDE_TYPE_INFO, TEXT_DRIVER, SET_DESTINATION_CLASSIC, PASSENGER_SET_PICKUP, PASSENGER_SET_DESTINATION, PASSENGER_CANCELLATION_DIALOG, 
            PASSENGER_MAP_MOVE, PASSENGER_MAP_ZOOM_BUTTON, TAKE_PHOTO, CHOOSE_PHOTO, SPLIT_FARE_INVITE_DISMISS, APPBOY_PUSH_NOTIFICATION, APPBOY_INAPP_NOTE, APPBOY_INAPP_PRIMARY, APPBOY_INAPP_SECONDARY, RIDE_HISTORY_SIDEBAR, 
            RIDE_HISTORY, RIDE_DETAILS_ADD_TIP, RIDE_DETAILS_LOST_AND_FOUND, RIDE_DETAILS_PRICE_REVIEW, T_AND_E_SEND_RECEIPTS_ENABLED, T_AND_E_SEND_RECEIPTS_DISABLED, T_AND_E_SEND_RECEIPTS_ENABLED_DURING_RIDE, T_AND_E_SEND_RECEIPTS_DISABLED_DURING_RIDE, END_RIDE, CANCEL_RIDE, 
            DONT_END_OR_CANCEL, GET_PAID_BUTTON, CONFIRM_DEPOSIT_BUTTON, ADD_DEBIT_CARD_BUTTON, EDIT_DEBIT_CARD_BUTTON, SAVE_DEBIT_CARD_BUTTON, CHECK_IT_OUT_BUTTON
        });
    }
}
