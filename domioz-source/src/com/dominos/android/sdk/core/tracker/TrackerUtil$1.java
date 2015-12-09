// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.core.tracker;

import com.dominos.android.sdk.common.dom.order.ServiceMethod;
import com.dominos.android.sdk.common.dom.tracker.OrderSource;

class rce
{

    static final int $SwitchMap$com$dominos$android$sdk$common$dom$order$ServiceMethod[];
    static final int $SwitchMap$com$dominos$android$sdk$common$dom$tracker$OrderSource[];

    static 
    {
        $SwitchMap$com$dominos$android$sdk$common$dom$order$ServiceMethod = new int[ServiceMethod.values().length];
        try
        {
            $SwitchMap$com$dominos$android$sdk$common$dom$order$ServiceMethod[ServiceMethod.DELIVERY.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror6) { }
        try
        {
            $SwitchMap$com$dominos$android$sdk$common$dom$order$ServiceMethod[ServiceMethod.CARRYOUT.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror5) { }
        try
        {
            $SwitchMap$com$dominos$android$sdk$common$dom$order$ServiceMethod[ServiceMethod.UNKNOWN.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        $SwitchMap$com$dominos$android$sdk$common$dom$tracker$OrderSource = new int[OrderSource.values().length];
        try
        {
            $SwitchMap$com$dominos$android$sdk$common$dom$tracker$OrderSource[OrderSource.PHONE.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            $SwitchMap$com$dominos$android$sdk$common$dom$tracker$OrderSource[OrderSource.WALKIN.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            $SwitchMap$com$dominos$android$sdk$common$dom$tracker$OrderSource[OrderSource.WEB.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$dominos$android$sdk$common$dom$tracker$OrderSource[OrderSource.UNKNOWN.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
