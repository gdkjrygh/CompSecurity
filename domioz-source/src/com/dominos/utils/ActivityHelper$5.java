// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.utils;


// Referenced classes of package com.dominos.utils:
//            AlertType

class 
{

    static final int $SwitchMap$com$dominos$utils$AlertType[];

    static 
    {
        $SwitchMap$com$dominos$utils$AlertType = new int[AlertType.values().length];
        try
        {
            $SwitchMap$com$dominos$utils$AlertType[AlertType.STORE_DELIVERY_OFFLINE.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror117) { }
        try
        {
            $SwitchMap$com$dominos$utils$AlertType[AlertType.STORE_CARRYOUT_OFFLINE.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror116) { }
        try
        {
            $SwitchMap$com$dominos$utils$AlertType[AlertType.STORE_DELIVERY_UNAVAILABLE.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror115) { }
        try
        {
            $SwitchMap$com$dominos$utils$AlertType[AlertType.STORE_CARRYOUT_UNAVAILABLE.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror114) { }
        try
        {
            $SwitchMap$com$dominos$utils$AlertType[AlertType.NO_LONGER_DELIVERY_AREA.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror113) { }
        try
        {
            $SwitchMap$com$dominos$utils$AlertType[AlertType.DELIVERY_NOT_AVAILABLE_IN_AREA.ordinal()] = 6;
        }
        catch (NoSuchFieldError nosuchfielderror112) { }
        try
        {
            $SwitchMap$com$dominos$utils$AlertType[AlertType.STORE_CARRYOUT_CLOSED.ordinal()] = 7;
        }
        catch (NoSuchFieldError nosuchfielderror111) { }
        try
        {
            $SwitchMap$com$dominos$utils$AlertType[AlertType.STORE_DELIVERY_CLOSED.ordinal()] = 8;
        }
        catch (NoSuchFieldError nosuchfielderror110) { }
        try
        {
            $SwitchMap$com$dominos$utils$AlertType[AlertType.NO_NETWORK.ordinal()] = 9;
        }
        catch (NoSuchFieldError nosuchfielderror109) { }
        try
        {
            $SwitchMap$com$dominos$utils$AlertType[AlertType.NETWORK_ERROR.ordinal()] = 10;
        }
        catch (NoSuchFieldError nosuchfielderror108) { }
        try
        {
            $SwitchMap$com$dominos$utils$AlertType[AlertType.STORE_CONNECTION_ERROR.ordinal()] = 11;
        }
        catch (NoSuchFieldError nosuchfielderror107) { }
        try
        {
            $SwitchMap$com$dominos$utils$AlertType[AlertType.CART_EMPTY.ordinal()] = 12;
        }
        catch (NoSuchFieldError nosuchfielderror106) { }
        try
        {
            $SwitchMap$com$dominos$utils$AlertType[AlertType.GOOGLE_WALLET_UNAVAILABLE.ordinal()] = 13;
        }
        catch (NoSuchFieldError nosuchfielderror105) { }
        try
        {
            $SwitchMap$com$dominos$utils$AlertType[AlertType.COUPON_CANNOT_COMBINE.ordinal()] = 14;
        }
        catch (NoSuchFieldError nosuchfielderror104) { }
        try
        {
            $SwitchMap$com$dominos$utils$AlertType[AlertType.COUPON_NOT_AVAILABLE.ordinal()] = 15;
        }
        catch (NoSuchFieldError nosuchfielderror103) { }
        try
        {
            $SwitchMap$com$dominos$utils$AlertType[AlertType.COUPON_LIMIT_REACHED.ordinal()] = 16;
        }
        catch (NoSuchFieldError nosuchfielderror102) { }
        try
        {
            $SwitchMap$com$dominos$utils$AlertType[AlertType.COUPON_CARRYOUT_ONLY.ordinal()] = 17;
        }
        catch (NoSuchFieldError nosuchfielderror101) { }
        try
        {
            $SwitchMap$com$dominos$utils$AlertType[AlertType.BELOW_MINIMUM_ORDER_AMOUNT.ordinal()] = 18;
        }
        catch (NoSuchFieldError nosuchfielderror100) { }
        try
        {
            $SwitchMap$com$dominos$utils$AlertType[AlertType.COUPON_INVALID.ordinal()] = 19;
        }
        catch (NoSuchFieldError nosuchfielderror99) { }
        try
        {
            $SwitchMap$com$dominos$utils$AlertType[AlertType.COUPON_ERROR_UNKNOWN.ordinal()] = 20;
        }
        catch (NoSuchFieldError nosuchfielderror98) { }
        try
        {
            $SwitchMap$com$dominos$utils$AlertType[AlertType.STORE_NO_COUPONS.ordinal()] = 21;
        }
        catch (NoSuchFieldError nosuchfielderror97) { }
        try
        {
            $SwitchMap$com$dominos$utils$AlertType[AlertType.REORDER_PRODUCT_OR_COUPON_CHANGED.ordinal()] = 22;
        }
        catch (NoSuchFieldError nosuchfielderror96) { }
        try
        {
            $SwitchMap$com$dominos$utils$AlertType[AlertType.TOO_MANY_DIPPING_CUPS.ordinal()] = 23;
        }
        catch (NoSuchFieldError nosuchfielderror95) { }
        try
        {
            $SwitchMap$com$dominos$utils$AlertType[AlertType.SIGN_IN_FAILURE.ordinal()] = 24;
        }
        catch (NoSuchFieldError nosuchfielderror94) { }
        try
        {
            $SwitchMap$com$dominos$utils$AlertType[AlertType.DISPLAY_ESPANOL.ordinal()] = 25;
        }
        catch (NoSuchFieldError nosuchfielderror93) { }
        try
        {
            $SwitchMap$com$dominos$utils$AlertType[AlertType.SESSION_TIMED_OUT.ordinal()] = 26;
        }
        catch (NoSuchFieldError nosuchfielderror92) { }
        try
        {
            $SwitchMap$com$dominos$utils$AlertType[AlertType.ADDRESS_SAVE_ERROR.ordinal()] = 27;
        }
        catch (NoSuchFieldError nosuchfielderror91) { }
        try
        {
            $SwitchMap$com$dominos$utils$AlertType[AlertType.DUPLICATE_ADDRESS_SAVE_ERROR.ordinal()] = 28;
        }
        catch (NoSuchFieldError nosuchfielderror90) { }
        try
        {
            $SwitchMap$com$dominos$utils$AlertType[AlertType.GLUTEN_FREE_CRUST.ordinal()] = 29;
        }
        catch (NoSuchFieldError nosuchfielderror89) { }
        try
        {
            $SwitchMap$com$dominos$utils$AlertType[AlertType.HEARTY_MARINARA_UNAVAILABLE_ON_PAN.ordinal()] = 30;
        }
        catch (NoSuchFieldError nosuchfielderror88) { }
        try
        {
            $SwitchMap$com$dominos$utils$AlertType[AlertType.TRACKER_UNAVAILABLE.ordinal()] = 31;
        }
        catch (NoSuchFieldError nosuchfielderror87) { }
        try
        {
            $SwitchMap$com$dominos$utils$AlertType[AlertType.TRACKER_PROVIDE_FEEDBACK.ordinal()] = 32;
        }
        catch (NoSuchFieldError nosuchfielderror86) { }
        try
        {
            $SwitchMap$com$dominos$utils$AlertType[AlertType.ORDER_NOT_FOUND.ordinal()] = 33;
        }
        catch (NoSuchFieldError nosuchfielderror85) { }
        try
        {
            $SwitchMap$com$dominos$utils$AlertType[AlertType.REMEMBER_ME_HELP.ordinal()] = 34;
        }
        catch (NoSuchFieldError nosuchfielderror84) { }
        try
        {
            $SwitchMap$com$dominos$utils$AlertType[AlertType.FORGOT_PASSWORD.ordinal()] = 35;
        }
        catch (NoSuchFieldError nosuchfielderror83) { }
        try
        {
            $SwitchMap$com$dominos$utils$AlertType[AlertType.INVALID_PASSWORD.ordinal()] = 36;
        }
        catch (NoSuchFieldError nosuchfielderror82) { }
        try
        {
            $SwitchMap$com$dominos$utils$AlertType[AlertType.INVALID_EMAIL.ordinal()] = 37;
        }
        catch (NoSuchFieldError nosuchfielderror81) { }
        try
        {
            $SwitchMap$com$dominos$utils$AlertType[AlertType.SHOP_RUNNER_UNAVAILABLE.ordinal()] = 38;
        }
        catch (NoSuchFieldError nosuchfielderror80) { }
        try
        {
            $SwitchMap$com$dominos$utils$AlertType[AlertType.CREATE_PIZZA_PROFILE_HELP.ordinal()] = 39;
        }
        catch (NoSuchFieldError nosuchfielderror79) { }
        try
        {
            $SwitchMap$com$dominos$utils$AlertType[AlertType.EASY_ORDER_HELP.ordinal()] = 40;
        }
        catch (NoSuchFieldError nosuchfielderror78) { }
        try
        {
            $SwitchMap$com$dominos$utils$AlertType[AlertType.SELECT_CREDIT_CARD_TYPE.ordinal()] = 41;
        }
        catch (NoSuchFieldError nosuchfielderror77) { }
        try
        {
            $SwitchMap$com$dominos$utils$AlertType[AlertType.WALLET_BACKING_NOT_ACCEPTED.ordinal()] = 42;
        }
        catch (NoSuchFieldError nosuchfielderror76) { }
        try
        {
            $SwitchMap$com$dominos$utils$AlertType[AlertType.GIFT_CARD_AMOUNT_HIGH.ordinal()] = 43;
        }
        catch (NoSuchFieldError nosuchfielderror75) { }
        try
        {
            $SwitchMap$com$dominos$utils$AlertType[AlertType.GIFT_CARD_DISABLED.ordinal()] = 44;
        }
        catch (NoSuchFieldError nosuchfielderror74) { }
        try
        {
            $SwitchMap$com$dominos$utils$AlertType[AlertType.CASH_LIMIT_EXCEEDED.ordinal()] = 45;
        }
        catch (NoSuchFieldError nosuchfielderror73) { }
        try
        {
            $SwitchMap$com$dominos$utils$AlertType[AlertType.EXPIRATION_DATE_INVALID.ordinal()] = 46;
        }
        catch (NoSuchFieldError nosuchfielderror72) { }
        try
        {
            $SwitchMap$com$dominos$utils$AlertType[AlertType.REGISTRATION_ERROR_EMAIL_ALREADY_USED.ordinal()] = 47;
        }
        catch (NoSuchFieldError nosuchfielderror71) { }
        try
        {
            $SwitchMap$com$dominos$utils$AlertType[AlertType.CART_PRICING_FAILED.ordinal()] = 48;
        }
        catch (NoSuchFieldError nosuchfielderror70) { }
        try
        {
            $SwitchMap$com$dominos$utils$AlertType[AlertType.COUPON_IS_REMOVED.ordinal()] = 49;
        }
        catch (NoSuchFieldError nosuchfielderror69) { }
        try
        {
            $SwitchMap$com$dominos$utils$AlertType[AlertType.PRODUCT_IS_REMOVED.ordinal()] = 50;
        }
        catch (NoSuchFieldError nosuchfielderror68) { }
        try
        {
            $SwitchMap$com$dominos$utils$AlertType[AlertType.BOTH_PRODUCT_COUPON_REMOVED.ordinal()] = 51;
        }
        catch (NoSuchFieldError nosuchfielderror67) { }
        try
        {
            $SwitchMap$com$dominos$utils$AlertType[AlertType.TOO_MANY_ITEMS.ordinal()] = 52;
        }
        catch (NoSuchFieldError nosuchfielderror66) { }
        try
        {
            $SwitchMap$com$dominos$utils$AlertType[AlertType.ADDRESS_FORM_ERROR_MESSAGE.ordinal()] = 53;
        }
        catch (NoSuchFieldError nosuchfielderror65) { }
        try
        {
            $SwitchMap$com$dominos$utils$AlertType[AlertType.SAMSUNG_TV_APP_NOT_FOUND.ordinal()] = 54;
        }
        catch (NoSuchFieldError nosuchfielderror64) { }
        try
        {
            $SwitchMap$com$dominos$utils$AlertType[AlertType.SAMSUNG_TV_APP_CONNECTION_ERROR.ordinal()] = 55;
        }
        catch (NoSuchFieldError nosuchfielderror63) { }
        try
        {
            $SwitchMap$com$dominos$utils$AlertType[AlertType.TOO_MANY_TOPPINGS_PAN_PIZZA.ordinal()] = 56;
        }
        catch (NoSuchFieldError nosuchfielderror62) { }
        try
        {
            $SwitchMap$com$dominos$utils$AlertType[AlertType.TOO_MANY_TOPPINGS_LEFT.ordinal()] = 57;
        }
        catch (NoSuchFieldError nosuchfielderror61) { }
        try
        {
            $SwitchMap$com$dominos$utils$AlertType[AlertType.TOO_MANY_TOPPINGS_WHOLE.ordinal()] = 58;
        }
        catch (NoSuchFieldError nosuchfielderror60) { }
        try
        {
            $SwitchMap$com$dominos$utils$AlertType[AlertType.TOO_MANY_TOPPINGS_RIGHT.ordinal()] = 59;
        }
        catch (NoSuchFieldError nosuchfielderror59) { }
        try
        {
            $SwitchMap$com$dominos$utils$AlertType[AlertType.TOO_MANY_TOPPINGS_PASTA.ordinal()] = 60;
        }
        catch (NoSuchFieldError nosuchfielderror58) { }
        try
        {
            $SwitchMap$com$dominos$utils$AlertType[AlertType.TOO_MANY_TOPPINGS_SAUCE.ordinal()] = 61;
        }
        catch (NoSuchFieldError nosuchfielderror57) { }
        try
        {
            $SwitchMap$com$dominos$utils$AlertType[AlertType.TOO_MANY_TOPPINGS_SAND.ordinal()] = 62;
        }
        catch (NoSuchFieldError nosuchfielderror56) { }
        try
        {
            $SwitchMap$com$dominos$utils$AlertType[AlertType.TOO_MANY_TOPPINGS_SAND_SLICE.ordinal()] = 63;
        }
        catch (NoSuchFieldError nosuchfielderror55) { }
        try
        {
            $SwitchMap$com$dominos$utils$AlertType[AlertType.TOO_MANY_SAUCES_SAND_SLICE.ordinal()] = 64;
        }
        catch (NoSuchFieldError nosuchfielderror54) { }
        try
        {
            $SwitchMap$com$dominos$utils$AlertType[AlertType.RIGHT_SIDE_LEFT_SIDE_NOT_VOICE_SUPPORTED.ordinal()] = 65;
        }
        catch (NoSuchFieldError nosuchfielderror53) { }
        try
        {
            $SwitchMap$com$dominos$utils$AlertType[AlertType.DISCONTINUED_PRODUCTS_ARTISAN_MESSAGE.ordinal()] = 66;
        }
        catch (NoSuchFieldError nosuchfielderror52) { }
        try
        {
            $SwitchMap$com$dominos$utils$AlertType[AlertType.ADDRESS_MISSING_STREET_NUMBER.ordinal()] = 67;
        }
        catch (NoSuchFieldError nosuchfielderror51) { }
        try
        {
            $SwitchMap$com$dominos$utils$AlertType[AlertType.ADDRESS_SAVE_TO_PROFILE_ERROR.ordinal()] = 68;
        }
        catch (NoSuchFieldError nosuchfielderror50) { }
        try
        {
            $SwitchMap$com$dominos$utils$AlertType[AlertType.ADDRESS_SAVE_TO_PROFILE_DUPLICATE.ordinal()] = 69;
        }
        catch (NoSuchFieldError nosuchfielderror49) { }
        try
        {
            $SwitchMap$com$dominos$utils$AlertType[AlertType.STORE_ONLINE_ISSUE.ordinal()] = 70;
        }
        catch (NoSuchFieldError nosuchfielderror48) { }
        try
        {
            $SwitchMap$com$dominos$utils$AlertType[AlertType.LOYALTY_PROFILED_USER_ACTIVATE_ERROR.ordinal()] = 71;
        }
        catch (NoSuchFieldError nosuchfielderror47) { }
        try
        {
            $SwitchMap$com$dominos$utils$AlertType[AlertType.LOYALTY_HISTORY_CALL_FAIL.ordinal()] = 72;
        }
        catch (NoSuchFieldError nosuchfielderror46) { }
        try
        {
            $SwitchMap$com$dominos$utils$AlertType[AlertType.NEW_CUSTOMER_LOYALTY_ENROLL_FAIL.ordinal()] = 73;
        }
        catch (NoSuchFieldError nosuchfielderror45) { }
        try
        {
            $SwitchMap$com$dominos$utils$AlertType[AlertType.LOYALTY_PRICE_OR_PLACE_ORDER_FAIL.ordinal()] = 74;
        }
        catch (NoSuchFieldError nosuchfielderror44) { }
        try
        {
            $SwitchMap$com$dominos$utils$AlertType[AlertType.CVV_HELP_DIALOG.ordinal()] = 75;
        }
        catch (NoSuchFieldError nosuchfielderror43) { }
        try
        {
            $SwitchMap$com$dominos$utils$AlertType[AlertType.DUPLICATE_NICKNAME_DIALOG.ordinal()] = 76;
        }
        catch (NoSuchFieldError nosuchfielderror42) { }
        try
        {
            $SwitchMap$com$dominos$utils$AlertType[AlertType.GENERAL_CREDIT_CARD_ERROR_DIALOG.ordinal()] = 77;
        }
        catch (NoSuchFieldError nosuchfielderror41) { }
        try
        {
            $SwitchMap$com$dominos$utils$AlertType[AlertType.GET_CARD_LIST_ERROR_DIALOG.ordinal()] = 78;
        }
        catch (NoSuchFieldError nosuchfielderror40) { }
        try
        {
            $SwitchMap$com$dominos$utils$AlertType[AlertType.CARD_ON_FILE_LIMIT_EXCEEDED_DIALOG.ordinal()] = 79;
        }
        catch (NoSuchFieldError nosuchfielderror39) { }
        try
        {
            $SwitchMap$com$dominos$utils$AlertType[AlertType.SAVE_TO_PROFILE_HELP_DIALOG.ordinal()] = 80;
        }
        catch (NoSuchFieldError nosuchfielderror38) { }
        try
        {
            $SwitchMap$com$dominos$utils$AlertType[AlertType.PRIMARY_CARD_HELP_DIALOG.ordinal()] = 81;
        }
        catch (NoSuchFieldError nosuchfielderror37) { }
        try
        {
            $SwitchMap$com$dominos$utils$AlertType[AlertType.MISSING_CREDIT_CARD_FIELD.ordinal()] = 82;
        }
        catch (NoSuchFieldError nosuchfielderror36) { }
        try
        {
            $SwitchMap$com$dominos$utils$AlertType[AlertType.MISSING_PASSWORD_FIELDS.ordinal()] = 83;
        }
        catch (NoSuchFieldError nosuchfielderror35) { }
        try
        {
            $SwitchMap$com$dominos$utils$AlertType[AlertType.MISSING_REGISTRATION_FIELDS.ordinal()] = 84;
        }
        catch (NoSuchFieldError nosuchfielderror34) { }
        try
        {
            $SwitchMap$com$dominos$utils$AlertType[AlertType.KEEP_ME_SIGNED_IN_INFO.ordinal()] = 85;
        }
        catch (NoSuchFieldError nosuchfielderror33) { }
        try
        {
            $SwitchMap$com$dominos$utils$AlertType[AlertType.MISSING_CHECKOUT_FIELDS.ordinal()] = 86;
        }
        catch (NoSuchFieldError nosuchfielderror32) { }
        try
        {
            $SwitchMap$com$dominos$utils$AlertType[AlertType.STORE_PHONE_INFO.ordinal()] = 87;
        }
        catch (NoSuchFieldError nosuchfielderror31) { }
        try
        {
            $SwitchMap$com$dominos$utils$AlertType[AlertType.ORDER_GENERIC_CREDIT_CARD_ERROR.ordinal()] = 88;
        }
        catch (NoSuchFieldError nosuchfielderror30) { }
        try
        {
            $SwitchMap$com$dominos$utils$AlertType[AlertType.ORDER_GENERIC_PULSE_ERROR.ordinal()] = 89;
        }
        catch (NoSuchFieldError nosuchfielderror29) { }
        try
        {
            $SwitchMap$com$dominos$utils$AlertType[AlertType.ORDER_STORE_NOT_ALLOWED_FOR_CARRYOUT.ordinal()] = 90;
        }
        catch (NoSuchFieldError nosuchfielderror28) { }
        try
        {
            $SwitchMap$com$dominos$utils$AlertType[AlertType.STORE_NOT_ALLOWED_FOR_DELIVERY.ordinal()] = 91;
        }
        catch (NoSuchFieldError nosuchfielderror27) { }
        try
        {
            $SwitchMap$com$dominos$utils$AlertType[AlertType.STORE_CLOSED.ordinal()] = 92;
        }
        catch (NoSuchFieldError nosuchfielderror26) { }
        try
        {
            $SwitchMap$com$dominos$utils$AlertType[AlertType.ORDER_MINIMUM_DELIVERY_AMOUNT.ordinal()] = 93;
        }
        catch (NoSuchFieldError nosuchfielderror25) { }
        try
        {
            $SwitchMap$com$dominos$utils$AlertType[AlertType.MISSING_FIELDS_USER_INFO.ordinal()] = 94;
        }
        catch (NoSuchFieldError nosuchfielderror24) { }
        try
        {
            $SwitchMap$com$dominos$utils$AlertType[AlertType.GIFT_CARD_DUPLICATE.ordinal()] = 95;
        }
        catch (NoSuchFieldError nosuchfielderror23) { }
        try
        {
            $SwitchMap$com$dominos$utils$AlertType[AlertType.GIFT_CARD_MORE_BALANCE.ordinal()] = 96;
        }
        catch (NoSuchFieldError nosuchfielderror22) { }
        try
        {
            $SwitchMap$com$dominos$utils$AlertType[AlertType.GIFT_CARD_MORE_THAN_ORDER.ordinal()] = 97;
        }
        catch (NoSuchFieldError nosuchfielderror21) { }
        try
        {
            $SwitchMap$com$dominos$utils$AlertType[AlertType.GIFT_CARD_ERROR.ordinal()] = 98;
        }
        catch (NoSuchFieldError nosuchfielderror20) { }
        try
        {
            $SwitchMap$com$dominos$utils$AlertType[AlertType.GIFT_CARD_NUMBER_ERROR.ordinal()] = 99;
        }
        catch (NoSuchFieldError nosuchfielderror19) { }
        try
        {
            $SwitchMap$com$dominos$utils$AlertType[AlertType.GIFT_CARD_AMOUNT_LOW.ordinal()] = 100;
        }
        catch (NoSuchFieldError nosuchfielderror18) { }
        try
        {
            $SwitchMap$com$dominos$utils$AlertType[AlertType.LOYALTY_OPT_OUT_ERROR.ordinal()] = 101;
        }
        catch (NoSuchFieldError nosuchfielderror17) { }
        try
        {
            $SwitchMap$com$dominos$utils$AlertType[AlertType.LOYALTY_CANNOT_REDEEM.ordinal()] = 102;
        }
        catch (NoSuchFieldError nosuchfielderror16) { }
        try
        {
            $SwitchMap$com$dominos$utils$AlertType[AlertType.LOYALTY_NOT_ENOUGH_POINTS.ordinal()] = 103;
        }
        catch (NoSuchFieldError nosuchfielderror15) { }
        try
        {
            $SwitchMap$com$dominos$utils$AlertType[AlertType.NON_LOYALTY_STORE.ordinal()] = 104;
        }
        catch (NoSuchFieldError nosuchfielderror14) { }
        try
        {
            $SwitchMap$com$dominos$utils$AlertType[AlertType.LOYALTY_REDEMPTION_LIMIT.ordinal()] = 105;
        }
        catch (NoSuchFieldError nosuchfielderror13) { }
        try
        {
            $SwitchMap$com$dominos$utils$AlertType[AlertType.LOYALTY_NO_BASE_COUPON.ordinal()] = 106;
        }
        catch (NoSuchFieldError nosuchfielderror12) { }
        try
        {
            $SwitchMap$com$dominos$utils$AlertType[AlertType.APP_FEEDBACK_REQUEST.ordinal()] = 107;
        }
        catch (NoSuchFieldError nosuchfielderror11) { }
        try
        {
            $SwitchMap$com$dominos$utils$AlertType[AlertType.DELETE_CONFIRMATION_ITEM_FROM_ORDER.ordinal()] = 108;
        }
        catch (NoSuchFieldError nosuchfielderror10) { }
        try
        {
            $SwitchMap$com$dominos$utils$AlertType[AlertType.LOCATION_ERROR.ordinal()] = 109;
        }
        catch (NoSuchFieldError nosuchfielderror9) { }
        try
        {
            $SwitchMap$com$dominos$utils$AlertType[AlertType.DELETE_CONFIRMATION_PRODUCT_COUPON_WIZARD.ordinal()] = 110;
        }
        catch (NoSuchFieldError nosuchfielderror8) { }
        try
        {
            $SwitchMap$com$dominos$utils$AlertType[AlertType.DELETE_CONFIRMATION_COUPON.ordinal()] = 111;
        }
        catch (NoSuchFieldError nosuchfielderror7) { }
        try
        {
            $SwitchMap$com$dominos$utils$AlertType[AlertType.CHECKOUT_FAIL_ALERT.ordinal()] = 112;
        }
        catch (NoSuchFieldError nosuchfielderror6) { }
        try
        {
            $SwitchMap$com$dominos$utils$AlertType[AlertType.LOYALTY_OPT_OUT_CONFIRMATION.ordinal()] = 113;
        }
        catch (NoSuchFieldError nosuchfielderror5) { }
        try
        {
            $SwitchMap$com$dominos$utils$AlertType[AlertType.SIGN_OUT_ALERT.ordinal()] = 114;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            $SwitchMap$com$dominos$utils$AlertType[AlertType.ENABLE_LOCATION.ordinal()] = 115;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            $SwitchMap$com$dominos$utils$AlertType[AlertType.REMOVE_SAVED_ADDRESS.ordinal()] = 116;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            $SwitchMap$com$dominos$utils$AlertType[AlertType.PEBBLE_DETECTED_MESSAGE.ordinal()] = 117;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$dominos$utils$AlertType[AlertType.GIFT_CARD_REMOVE.ordinal()] = 118;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
