// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.location.internal.wifi;

import com.worklight.location.internal.AcquisitionCallback;
import com.worklight.location.internal.wifi.triggerEvaluators.WifiInternalLocation;

public interface WifiInternalCallback
    extends AcquisitionCallback
{

    public abstract void execute(WifiInternalLocation wifiinternallocation);
}
