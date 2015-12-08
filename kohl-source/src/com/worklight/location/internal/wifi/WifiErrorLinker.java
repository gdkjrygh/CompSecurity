// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.location.internal.wifi;

import com.worklight.location.api.wifi.WLWifiFailureCallback;
import com.worklight.location.internal.GenericErrorLinker;
import com.worklight.location.internal.ICallbackExecutor;
import java.util.List;

public final class WifiErrorLinker extends GenericErrorLinker
    implements WLWifiFailureCallback
{

    public WifiErrorLinker(List list, ICallbackExecutor icallbackexecutor)
    {
        super(list, icallbackexecutor);
    }
}
