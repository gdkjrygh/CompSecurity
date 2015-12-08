// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.pebble.order.client;

import com.dominos.android.sdk.constant.ResponseErrorCode;
import com.dominos.android.sdk.constant.ResponseStatus;

class 
{

    static final int $SwitchMap$com$dominos$android$sdk$constant$ResponseErrorCode[];
    static final int $SwitchMap$com$dominos$android$sdk$constant$ResponseStatus[];

    static 
    {
        $SwitchMap$com$dominos$android$sdk$constant$ResponseStatus = new int[ResponseStatus.values().length];
        try
        {
            $SwitchMap$com$dominos$android$sdk$constant$ResponseStatus[ResponseStatus.SUCCESS.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror8) { }
        try
        {
            $SwitchMap$com$dominos$android$sdk$constant$ResponseStatus[ResponseStatus.WARNING.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror7) { }
        $SwitchMap$com$dominos$android$sdk$constant$ResponseErrorCode = new int[ResponseErrorCode.values().length];
        try
        {
            $SwitchMap$com$dominos$android$sdk$constant$ResponseErrorCode[ResponseErrorCode.ALL_ITEMS_UNAVAILABLE.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror6) { }
        try
        {
            $SwitchMap$com$dominos$android$sdk$constant$ResponseErrorCode[ResponseErrorCode.SOME_ITEMS_UNAVAILABLE.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror5) { }
        try
        {
            $SwitchMap$com$dominos$android$sdk$constant$ResponseErrorCode[ResponseErrorCode.STORE_CLOSED.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            $SwitchMap$com$dominos$android$sdk$constant$ResponseErrorCode[ResponseErrorCode.DELIVERY_NOT_AVAILABLE.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            $SwitchMap$com$dominos$android$sdk$constant$ResponseErrorCode[ResponseErrorCode.COUPON_REMOVED.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            $SwitchMap$com$dominos$android$sdk$constant$ResponseErrorCode[ResponseErrorCode.NO_STORE_DELIVERY_ADDRESS.ordinal()] = 6;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$dominos$android$sdk$constant$ResponseErrorCode[ResponseErrorCode.CARRYOUT_NOT_AVAILABLE.ordinal()] = 7;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
