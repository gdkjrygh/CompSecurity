// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.analytics.definitions;


public final class  extends Enum
{

    private static final SET_DEFAULT_PAYMENT $VALUES[];
    public static final SET_DEFAULT_PAYMENT ADD_DEBIT_CARD;
    public static final SET_DEFAULT_PAYMENT ADD_FACEBOOK;
    public static final SET_DEFAULT_PAYMENT ADD_PHONE;
    public static final SET_DEFAULT_PAYMENT ADD_PROFILE_INFO;
    public static final SET_DEFAULT_PAYMENT APP_LAUNCH;
    public static final SET_DEFAULT_PAYMENT CANCEL_RIDE;
    public static final SET_DEFAULT_PAYMENT CLEAR_REQUEST;
    public static final SET_DEFAULT_PAYMENT DIRECTIONS_ROUTE_LINES;
    public static final SET_DEFAULT_PAYMENT EDIT_DEBIT_CARD;
    public static final SET_DEFAULT_PAYMENT EDIT_FACEBOOK_CARD;
    public static final SET_DEFAULT_PAYMENT INITIATE_LOGIN;
    public static final SET_DEFAULT_PAYMENT INITIATE_SIGNUP;
    public static final SET_DEFAULT_PAYMENT LOGOUT_USER;
    public static final SET_DEFAULT_PAYMENT OPEN_FACEBOOK_MESSENGER;
    public static final SET_DEFAULT_PAYMENT REQUEST_PRICE_ESTIMATE;
    public static final SET_DEFAULT_PAYMENT REQUEST_RIDE;
    public static final SET_DEFAULT_PAYMENT RESEND_PHONE_CODE;
    public static final SET_DEFAULT_PAYMENT SEND_INVITES;
    public static final SET_DEFAULT_PAYMENT SET_DEFAULT_PAYMENT;
    public static final SET_DEFAULT_PAYMENT SET_DESTINATION;
    public static final SET_DEFAULT_PAYMENT SET_PICKUP;
    public static final SET_DEFAULT_PAYMENT SET_RIDE_TYPE;
    public static final SET_DEFAULT_PAYMENT SHARE_INVITES;
    public static final SET_DEFAULT_PAYMENT SHOW_INVITE_BUTTON;
    public static final SET_DEFAULT_PAYMENT SHOW_INVITE_FRIENDS;
    public static final SET_DEFAULT_PAYMENT VERIFY_PHONE;

    public static  fromString(String s)
    {
        return valueOf(s.toUpperCase());
    }

    public static valueOf valueOf(String s)
    {
        return (valueOf)Enum.valueOf(me/lyft/android/analytics/definitions/ActionEvent$Action, s);
    }

    public static valueOf[] values()
    {
        return (valueOf[])$VALUES.clone();
    }

    public String toString()
    {
        return name().toLowerCase();
    }

    static 
    {
        APP_LAUNCH = new <init>("APP_LAUNCH", 0);
        INITIATE_LOGIN = new <init>("INITIATE_LOGIN", 1);
        INITIATE_SIGNUP = new <init>("INITIATE_SIGNUP", 2);
        ADD_PROFILE_INFO = new <init>("ADD_PROFILE_INFO", 3);
        ADD_PHONE = new <init>("ADD_PHONE", 4);
        ADD_FACEBOOK = new <init>("ADD_FACEBOOK", 5);
        VERIFY_PHONE = new <init>("VERIFY_PHONE", 6);
        RESEND_PHONE_CODE = new <init>("RESEND_PHONE_CODE", 7);
        LOGOUT_USER = new <init>("LOGOUT_USER", 8);
        SHOW_INVITE_FRIENDS = new <init>("SHOW_INVITE_FRIENDS", 9);
        SHOW_INVITE_BUTTON = new <init>("SHOW_INVITE_BUTTON", 10);
        SEND_INVITES = new <init>("SEND_INVITES", 11);
        SHARE_INVITES = new <init>("SHARE_INVITES", 12);
        DIRECTIONS_ROUTE_LINES = new <init>("DIRECTIONS_ROUTE_LINES", 13);
        SET_RIDE_TYPE = new <init>("SET_RIDE_TYPE", 14);
        SET_PICKUP = new <init>("SET_PICKUP", 15);
        SET_DESTINATION = new <init>("SET_DESTINATION", 16);
        REQUEST_PRICE_ESTIMATE = new <init>("REQUEST_PRICE_ESTIMATE", 17);
        CLEAR_REQUEST = new <init>("CLEAR_REQUEST", 18);
        REQUEST_RIDE = new <init>("REQUEST_RIDE", 19);
        CANCEL_RIDE = new <init>("CANCEL_RIDE", 20);
        ADD_DEBIT_CARD = new <init>("ADD_DEBIT_CARD", 21);
        EDIT_DEBIT_CARD = new <init>("EDIT_DEBIT_CARD", 22);
        EDIT_FACEBOOK_CARD = new <init>("EDIT_FACEBOOK_CARD", 23);
        OPEN_FACEBOOK_MESSENGER = new <init>("OPEN_FACEBOOK_MESSENGER", 24);
        SET_DEFAULT_PAYMENT = new <init>("SET_DEFAULT_PAYMENT", 25);
        $VALUES = (new .VALUES[] {
            APP_LAUNCH, INITIATE_LOGIN, INITIATE_SIGNUP, ADD_PROFILE_INFO, ADD_PHONE, ADD_FACEBOOK, VERIFY_PHONE, RESEND_PHONE_CODE, LOGOUT_USER, SHOW_INVITE_FRIENDS, 
            SHOW_INVITE_BUTTON, SEND_INVITES, SHARE_INVITES, DIRECTIONS_ROUTE_LINES, SET_RIDE_TYPE, SET_PICKUP, SET_DESTINATION, REQUEST_PRICE_ESTIMATE, CLEAR_REQUEST, REQUEST_RIDE, 
            CANCEL_RIDE, ADD_DEBIT_CARD, EDIT_DEBIT_CARD, EDIT_FACEBOOK_CARD, OPEN_FACEBOOK_MESSENGER, SET_DEFAULT_PAYMENT
        });
    }

    private (String s, int i)
    {
        super(s, i);
    }
}
