// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.location.api.wifi.triggers;

import com.worklight.location.api.wifi.WLWifiAcquisitionPolicy;
import com.worklight.location.internal.AbstractTrigger;

public abstract class WLWifiTrigger extends AbstractTrigger
{

    public WLWifiTrigger()
    {
    }

    public abstract boolean validate(WLWifiAcquisitionPolicy wlwifiacquisitionpolicy);
}
