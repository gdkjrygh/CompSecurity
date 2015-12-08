// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.common;


public final class RequestErrorCode extends Enum
{

    private static final RequestErrorCode $VALUES[];
    public static final RequestErrorCode ADD_CARD_REQUEST_FAILURE;
    public static final RequestErrorCode BUILDINGS_REQUEST_FAILURE;
    public static final RequestErrorCode CHANGE_PASSWORD_REQUEST_FAILURE;
    public static final RequestErrorCode DELETE_CARD_REQUEST_FAILURE;
    public static final RequestErrorCode EMAIL_OPT_IN_REQUEST_FAILURE;
    public static final RequestErrorCode FEEDBACK_QUESTION_REQUEST_FAILURE;
    public static final RequestErrorCode GET_CARDS_REQUEST_FAILURE;
    public static final RequestErrorCode GIFT_CARD_BALANCE_REQUEST_FAILURE;
    public static final RequestErrorCode HISTORY_REQUEST_FAILURE;
    public static final RequestErrorCode LOCATE_STORE_REQUEST_FAILURE;
    public static final RequestErrorCode LOGIN_REQUEST_FAILURE;
    public static final RequestErrorCode MENU_REQUEST_FAILURE;
    public static final RequestErrorCode PLACE_REQUEST_FAILURE;
    public static final RequestErrorCode PRICE_REQUEST_FAILURE;
    public static final RequestErrorCode REMEMBER_LOGIN_REQUEST_FAILURE;
    public static final RequestErrorCode RESET_PASSWORD_REQUEST_FAILURE;
    public static final RequestErrorCode SAVE_CUSTOMER_REQUEST_FAILURE;
    public static final RequestErrorCode SITES_REQUEST_FAILURE;
    public static final RequestErrorCode STORES_REQUEST_FAILURE;
    public static final RequestErrorCode STORE_COUPON_REQUEST_FAILURE;
    public static final RequestErrorCode STORE_PROFILE_REQUEST_FAILURE;
    public static final RequestErrorCode TRACK_ORDER_BY_PHONE_REQUEST_FAILURE;
    public static final RequestErrorCode TRACK_ORDER_BY_STORE_REQUEST_FAILURE;
    public static final RequestErrorCode UPDATE_CARD_REQUEST_FAILURE;

    private RequestErrorCode(String s, int i)
    {
        super(s, i);
    }

    public static RequestErrorCode valueOf(String s)
    {
        return (RequestErrorCode)Enum.valueOf(com/dominos/android/sdk/common/RequestErrorCode, s);
    }

    public static RequestErrorCode[] values()
    {
        return (RequestErrorCode[])$VALUES.clone();
    }

    static 
    {
        SITES_REQUEST_FAILURE = new RequestErrorCode("SITES_REQUEST_FAILURE", 0);
        BUILDINGS_REQUEST_FAILURE = new RequestErrorCode("BUILDINGS_REQUEST_FAILURE", 1);
        STORES_REQUEST_FAILURE = new RequestErrorCode("STORES_REQUEST_FAILURE", 2);
        LOCATE_STORE_REQUEST_FAILURE = new RequestErrorCode("LOCATE_STORE_REQUEST_FAILURE", 3);
        MENU_REQUEST_FAILURE = new RequestErrorCode("MENU_REQUEST_FAILURE", 4);
        STORE_COUPON_REQUEST_FAILURE = new RequestErrorCode("STORE_COUPON_REQUEST_FAILURE", 5);
        STORE_PROFILE_REQUEST_FAILURE = new RequestErrorCode("STORE_PROFILE_REQUEST_FAILURE", 6);
        PRICE_REQUEST_FAILURE = new RequestErrorCode("PRICE_REQUEST_FAILURE", 7);
        PLACE_REQUEST_FAILURE = new RequestErrorCode("PLACE_REQUEST_FAILURE", 8);
        GIFT_CARD_BALANCE_REQUEST_FAILURE = new RequestErrorCode("GIFT_CARD_BALANCE_REQUEST_FAILURE", 9);
        TRACK_ORDER_BY_STORE_REQUEST_FAILURE = new RequestErrorCode("TRACK_ORDER_BY_STORE_REQUEST_FAILURE", 10);
        TRACK_ORDER_BY_PHONE_REQUEST_FAILURE = new RequestErrorCode("TRACK_ORDER_BY_PHONE_REQUEST_FAILURE", 11);
        FEEDBACK_QUESTION_REQUEST_FAILURE = new RequestErrorCode("FEEDBACK_QUESTION_REQUEST_FAILURE", 12);
        LOGIN_REQUEST_FAILURE = new RequestErrorCode("LOGIN_REQUEST_FAILURE", 13);
        REMEMBER_LOGIN_REQUEST_FAILURE = new RequestErrorCode("REMEMBER_LOGIN_REQUEST_FAILURE", 14);
        HISTORY_REQUEST_FAILURE = new RequestErrorCode("HISTORY_REQUEST_FAILURE", 15);
        EMAIL_OPT_IN_REQUEST_FAILURE = new RequestErrorCode("EMAIL_OPT_IN_REQUEST_FAILURE", 16);
        SAVE_CUSTOMER_REQUEST_FAILURE = new RequestErrorCode("SAVE_CUSTOMER_REQUEST_FAILURE", 17);
        RESET_PASSWORD_REQUEST_FAILURE = new RequestErrorCode("RESET_PASSWORD_REQUEST_FAILURE", 18);
        CHANGE_PASSWORD_REQUEST_FAILURE = new RequestErrorCode("CHANGE_PASSWORD_REQUEST_FAILURE", 19);
        ADD_CARD_REQUEST_FAILURE = new RequestErrorCode("ADD_CARD_REQUEST_FAILURE", 20);
        GET_CARDS_REQUEST_FAILURE = new RequestErrorCode("GET_CARDS_REQUEST_FAILURE", 21);
        UPDATE_CARD_REQUEST_FAILURE = new RequestErrorCode("UPDATE_CARD_REQUEST_FAILURE", 22);
        DELETE_CARD_REQUEST_FAILURE = new RequestErrorCode("DELETE_CARD_REQUEST_FAILURE", 23);
        $VALUES = (new RequestErrorCode[] {
            SITES_REQUEST_FAILURE, BUILDINGS_REQUEST_FAILURE, STORES_REQUEST_FAILURE, LOCATE_STORE_REQUEST_FAILURE, MENU_REQUEST_FAILURE, STORE_COUPON_REQUEST_FAILURE, STORE_PROFILE_REQUEST_FAILURE, PRICE_REQUEST_FAILURE, PLACE_REQUEST_FAILURE, GIFT_CARD_BALANCE_REQUEST_FAILURE, 
            TRACK_ORDER_BY_STORE_REQUEST_FAILURE, TRACK_ORDER_BY_PHONE_REQUEST_FAILURE, FEEDBACK_QUESTION_REQUEST_FAILURE, LOGIN_REQUEST_FAILURE, REMEMBER_LOGIN_REQUEST_FAILURE, HISTORY_REQUEST_FAILURE, EMAIL_OPT_IN_REQUEST_FAILURE, SAVE_CUSTOMER_REQUEST_FAILURE, RESET_PASSWORD_REQUEST_FAILURE, CHANGE_PASSWORD_REQUEST_FAILURE, 
            ADD_CARD_REQUEST_FAILURE, GET_CARDS_REQUEST_FAILURE, UPDATE_CARD_REQUEST_FAILURE, DELETE_CARD_REQUEST_FAILURE
        });
    }
}
