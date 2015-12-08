// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.activities;

import com.dominos.android.sdk.core.order.PlaceOrderErrorCode;

class rderErrorCode
{

    static final int $SwitchMap$com$dominos$android$sdk$core$order$PlaceOrderErrorCode[];

    static 
    {
        $SwitchMap$com$dominos$android$sdk$core$order$PlaceOrderErrorCode = new int[PlaceOrderErrorCode.values().length];
        try
        {
            $SwitchMap$com$dominos$android$sdk$core$order$PlaceOrderErrorCode[PlaceOrderErrorCode.UNABLE_TO_PROCESS_LOYALTY_AT_THIS_TIME.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror) { }
    }
}
