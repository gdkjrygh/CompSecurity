// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.notification;

import com.dominos.android.sdk.common.dom.tracker.OrderStatus;

class .OrderStatus
{

    static final int $SwitchMap$com$dominos$android$sdk$common$dom$tracker$OrderStatus[];

    static 
    {
        $SwitchMap$com$dominos$android$sdk$common$dom$tracker$OrderStatus = new int[OrderStatus.values().length];
        try
        {
            $SwitchMap$com$dominos$android$sdk$common$dom$tracker$OrderStatus[OrderStatus.COMPLETE.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror8) { }
        try
        {
            $SwitchMap$com$dominos$android$sdk$common$dom$tracker$OrderStatus[OrderStatus.BEING_MADE.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror7) { }
        try
        {
            $SwitchMap$com$dominos$android$sdk$common$dom$tracker$OrderStatus[OrderStatus.IN_THE_OVEN.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror6) { }
        try
        {
            $SwitchMap$com$dominos$android$sdk$common$dom$tracker$OrderStatus[OrderStatus.ON_THE_RACK.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror5) { }
        try
        {
            $SwitchMap$com$dominos$android$sdk$common$dom$tracker$OrderStatus[OrderStatus.OUT_THE_DOOR.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            $SwitchMap$com$dominos$android$sdk$common$dom$tracker$OrderStatus[OrderStatus.CANCELLED.ordinal()] = 6;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            $SwitchMap$com$dominos$android$sdk$common$dom$tracker$OrderStatus[OrderStatus.FUTURE.ordinal()] = 7;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            $SwitchMap$com$dominos$android$sdk$common$dom$tracker$OrderStatus[OrderStatus.UNKNOWN.ordinal()] = 8;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$dominos$android$sdk$common$dom$tracker$OrderStatus[OrderStatus.WAITING.ordinal()] = 9;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
